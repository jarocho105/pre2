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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.PresupuestoVentasPunVenConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class PresupuestoVentasPunVenJInternalFrame extends PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresupuestoVentasPunVen;
	
	protected JMenuBar jmenuBarPresupuestoVentasPunVen;
	
	protected JMenu jmenuPresupuestoVentasPunVen;
	protected JMenu jmenuDatosPresupuestoVentasPunVen;
	protected JMenu jmenuArchivoPresupuestoVentasPunVen;
	protected JMenu jmenuAccionesPresupuestoVentasPunVen;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoVentasPunVen;	
	protected GridBagConstraints gridBagConstraintsPresupuestoVentasPunVen;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresupuestoVentasPunVenDetalleFormJInternalFrame jInternalFrameDetalleFormPresupuestoVentasPunVen;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresupuestoVentasPunVen;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresupuestoVentasPunVen;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public PresupuestoVentasPunVenSessionBean presupuestoventaspunvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CajaSessionBean cajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresupuestoVentasPunVen> presupuestoventaspunvens;		
	public List<PresupuestoVentasPunVen> presupuestoventaspunvensEliminados;	
	public List<PresupuestoVentasPunVen> presupuestoventaspunvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresupuestoVentasPunVen;		
	protected JButton jButtonAbrirOrderByPresupuestoVentasPunVen;
	
	
	//protected JPanel jPanelOrderByPresupuestoVentasPunVen;
	//public JScrollPane jScrollPanelOrderByPresupuestoVentasPunVen;	
	//protected JButton jButtonCerrarOrderByPresupuestoVentasPunVen;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresupuestoVentasPunVenLogic presupuestoventaspunvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresupuestoVentasPunVen;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoVentasPunVen;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoVentasPunVen;
    
	
	
	//public JScrollPane jScrollPanelDatosPresupuestoVentasPunVenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresupuestoVentasPunVen;
	//public JScrollPane jScrollPanelImportacionPresupuestoVentasPunVen;
	
	
	
	protected JPanel jPanelAccionesPresupuestoVentasPunVen;
	
    protected JPanel jPanelPaginacionPresupuestoVentasPunVen;
    protected JPanel jPanelParametrosReportesPresupuestoVentasPunVen;
	protected JPanel jPanelParametrosReportesAccionesPresupuestoVentasPunVen;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresupuestoVentasPunVen;
	protected JPanel jPanelParametrosAuxiliar2PresupuestoVentasPunVen;
	protected JPanel jPanelParametrosAuxiliar3PresupuestoVentasPunVen;
	protected JPanel jPanelParametrosAuxiliar4PresupuestoVentasPunVen;
	//protected JPanel jPanelParametrosAuxiliar5PresupuestoVentasPunVen;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresupuestoVentasPunVen;
	//protected JPanel jPanelImportacionPresupuestoVentasPunVen;
	
	
	public JTable jTableDatosPresupuestoVentasPunVen;
	
	
	
	//public JTable jTableDatosPresupuestoVentasPunVenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresupuestoVentasPunVen;
	protected JButton jButtonDuplicarPresupuestoVentasPunVen;
	protected JButton jButtonCopiarPresupuestoVentasPunVen;
	protected JButton jButtonVerFormPresupuestoVentasPunVen;
	protected JButton jButtonNuevoRelacionesPresupuestoVentasPunVen;
	protected JButton jButtonModificarPresupuestoVentasPunVen;
	
    protected JButton jButtonGuardarCambiosTablaPresupuestoVentasPunVen;
	protected JButton jButtonCerrarPresupuestoVentasPunVen;
	
	
	protected JButton jButtonRecargarInformacionPresupuestoVentasPunVen;
	protected JButton jButtonProcesarInformacionPresupuestoVentasPunVen;
	
	
	protected JButton jButtonAnterioresPresupuestoVentasPunVen;
	protected JButton jButtonSiguientesPresupuestoVentasPunVen;
	protected JButton jButtonNuevoGuardarCambiosPresupuestoVentasPunVen;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresupuestoVentasPunVen;
	//protected JButton jButtonCerrarReporteDinamicoPresupuestoVentasPunVen;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVen;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresupuestoVentasPunVen;
	//protected JButton jButtonGenerarImportacionPresupuestoVentasPunVen;
	//protected JButton jButtonCerrarImportacionPresupuestoVentasPunVen;
	//protected JFileChooser jFileChooserImportacionPresupuestoVentasPunVen;
	//protected File fileImportacionPresupuestoVentasPunVen;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoVentasPunVen;
	protected JButton jButtonDuplicarToolBarPresupuestoVentasPunVen;
	protected JButton jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen;
	
	
	public JButton jButtonGuardarCambiosToolBarPresupuestoVentasPunVen;
	protected JButton jButtonCopiarToolBarPresupuestoVentasPunVen;
	protected JButton jButtonVerFormToolBarPresupuestoVentasPunVen;
	public JButton jButtonGuardarCambiosTablaToolBarPresupuestoVentasPunVen;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoVentasPunVen;
	protected JButton jButtonCerrarToolBarPresupuestoVentasPunVen;
	
	protected JButton jButtonRecargarInformacionToolBarPresupuestoVentasPunVen;
	protected JButton jButtonProcesarInformacionToolBarPresupuestoVentasPunVen;
	protected JButton jButtonAnterioresToolBarPresupuestoVentasPunVen;
	protected JButton jButtonSiguientesToolBarPresupuestoVentasPunVen;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresupuestoVentasPunVen;
	protected JButton jButtonAbrirOrderByToolBarPresupuestoVentasPunVen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemDuplicarPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemNuevoRelacionesPresupuestoVentasPunVen;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemCopiarPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemVerFormPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemCerrarPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen;
	
	protected JMenuItem jMenuItemRecargarInformacionPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemAnterioresPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemSiguientesPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemAbrirOrderByPresupuestoVentasPunVen;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoVentasPunVen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoVentasPunVen;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresupuestoVentasPunVen;
	protected JCheckBox jCheckBoxSeleccionadosPresupuestoVentasPunVen;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen;
	protected JCheckBox jCheckBoxConGraficoReportePresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresupuestoVentasPunVen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresupuestoVentasPunVen;
	protected JTextField jTextFieldValorCampoGeneralPresupuestoVentasPunVen;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresupuestoVentasPunVen;
	//public JList<Reporte> jListColumnasSelectReportePresupuestoVentasPunVen;
	//public JScrollPane jScrollColumnasSelectReportePresupuestoVentasPunVen;
	
	//public JLabel jLabelRelacionesSelectReportePresupuestoVentasPunVen;
	//public JList<Reporte> jListRelacionesSelectReportePresupuestoVentasPunVen;
	//public JScrollPane jScrollRelacionesSelectReportePresupuestoVentasPunVen;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresupuestoVentasPunVen;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresupuestoVentasPunVen;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresupuestoVentasPunVen;
	
		
	//public JLabel jLabelArchivoImportacionPresupuestoVentasPunVen;	
	//public JLabel jLabelPathArchivoImportacionPresupuestoVentasPunVen;
	//protected JTextField jTextFieldPathArchivoImportacionPresupuestoVentasPunVen;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresupuestoVentasPunVen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen;
	
	//public JLabel jLabelColumnaCategoriaValorPresupuestoVentasPunVen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresupuestoVentasPunVen;
	
	//public JLabel jLabelColumnasValoresGraficoPresupuestoVentasPunVen;
	//public JList<Reporte> jListColumnasValoresGraficoPresupuestoVentasPunVen;
	//public JScrollPane jScrollColumnasValoresGraficoPresupuestoVentasPunVen;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresupuestoVentasPunVen;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasPunVen;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresupuestoVentasPunVen;
	public JPanel jPanelFK_IdCajaPresupuestoVentasPunVen;
	public JButton jButtonFK_IdCajaPresupuestoVentasPunVen;
	
	public JPanel jPanelid_cajaFK_IdCajaPresupuestoVentasPunVen;
	public JLabel jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen;
	public JButton jButtonid_cajaFK_IdCajaPresupuestoVentasPunVen= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaPresupuestoVentasPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaPresupuestoVentasPunVenBusqueda= new JButtonMe();

	
	
	
	
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
	public PresupuestoVentasPunVenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasPunVenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasPunVenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasPunVenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresupuestoVentasPunVen)	{
		this.jButtonRecargarInformacionPresupuestoVentasPunVen = jButtonRecargarInformacionPresupuestoVentasPunVen;
	}
	
	public JButton getjButtonProcesarInformacionPresupuestoVentasPunVen() {
		return this.jButtonProcesarInformacionPresupuestoVentasPunVen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoVentasPunVen)	{
		this.jButtonProcesarInformacionPresupuestoVentasPunVen = jButtonProcesarInformacionPresupuestoVentasPunVen;
	}
	
	
	public JButton getjButtonRecargarInformacionPresupuestoVentasPunVen() {
		return this.jButtonRecargarInformacionPresupuestoVentasPunVen;
	}
	
	
	public List<PresupuestoVentasPunVen> getpresupuestoventaspunvens() {
		return this.presupuestoventaspunvens;
	}

	public void setpresupuestoventaspunvens(List<PresupuestoVentasPunVen> presupuestoventaspunvens) {
		this.presupuestoventaspunvens = presupuestoventaspunvens;
	}
	
	public List<PresupuestoVentasPunVen> getpresupuestoventaspunvensAux() {
		return this.presupuestoventaspunvensAux;
	}

	public void setpresupuestoventaspunvensAux(List<PresupuestoVentasPunVen> presupuestoventaspunvensAux) {
		this.presupuestoventaspunvensAux = presupuestoventaspunvensAux;
	}
	
	public List<PresupuestoVentasPunVen> getpresupuestoventaspunvensEliminados() {
		return this.presupuestoventaspunvensEliminados;
	}

	public void setPresupuestoVentasPunVensEliminados(List<PresupuestoVentasPunVen> presupuestoventaspunvensEliminados) {
		this.presupuestoventaspunvensEliminados = presupuestoventaspunvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresupuestoVentasPunVen() {
		return jComboBoxTiposSeleccionarPresupuestoVentasPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposSeleccionarPresupuestoVentasPunVen) {
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen = jComboBoxTiposSeleccionarPresupuestoVentasPunVen;
	}
	
	public void setBorderResaltarTiposSeleccionarPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresupuestoVentasPunVen() {
		return jTextFieldValorCampoGeneralPresupuestoVentasPunVen;
	}

	public void setjTextFieldValorCampoGeneralPresupuestoVentasPunVen(
			JTextField jTextFieldValorCampoGeneralPresupuestoVentasPunVen) {
		this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen = jTextFieldValorCampoGeneralPresupuestoVentasPunVen;
	}

	public void setBorderResaltarValorCampoGeneralPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresupuestoVentasPunVen() {
		return this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen;
	}

	public void setjCheckBoxSeleccionarTodosPresupuestoVentasPunVen(
			JCheckBox jCheckBoxSeleccionarTodosPresupuestoVentasPunVen) {
		this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen = jCheckBoxSeleccionarTodosPresupuestoVentasPunVen;
	}

	public void setBorderResaltarSeleccionarTodosPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresupuestoVentasPunVen() {
		return this.jCheckBoxSeleccionadosPresupuestoVentasPunVen;
	}

	public void setjCheckBoxSeleccionadosPresupuestoVentasPunVen(
			JCheckBox jCheckBoxSeleccionadosPresupuestoVentasPunVen) {
		this.jCheckBoxSeleccionadosPresupuestoVentasPunVen = jCheckBoxSeleccionadosPresupuestoVentasPunVen;
	}
	
	public void setBorderResaltarSeleccionadosPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresupuestoVentasPunVen() {
		return this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposArchivosReportesPresupuestoVentasPunVen) {
		this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen = jComboBoxTiposArchivosReportesPresupuestoVentasPunVen;
	}

	public void setBorderResaltarTiposArchivosReportesPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresupuestoVentasPunVen() {
		return this.jComboBoxTiposReportesPresupuestoVentasPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposReportesPresupuestoVentasPunVen) {
		this.jComboBoxTiposReportesPresupuestoVentasPunVen = jComboBoxTiposReportesPresupuestoVentasPunVen;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresupuestoVentasPunVen() {
	//	return jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresupuestoVentasPunVen(
	//		JComboBox jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen) {
	//	this.jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen = jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen = jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen;
	//}
	
	public void setBorderResaltarTiposReportesPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresupuestoVentasPunVen() {
		return this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposGraficosReportesPresupuestoVentasPunVen) {
		this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen = jComboBoxTiposGraficosReportesPresupuestoVentasPunVen;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresupuestoVentasPunVen() {
		return this.jComboBoxTiposPaginacionPresupuestoVentasPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposPaginacionPresupuestoVentasPunVen) {
		this.jComboBoxTiposPaginacionPresupuestoVentasPunVen = jComboBoxTiposPaginacionPresupuestoVentasPunVen;
	}
	
	public void setBorderResaltarTiposPaginacionPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresupuestoVentasPunVen() {
		return this.jComboBoxTiposRelacionesPresupuestoVentasPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoVentasPunVen() {
		return this.jComboBoxTiposAccionesPresupuestoVentasPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposRelacionesPresupuestoVentasPunVen) {
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen = jComboBoxTiposRelacionesPresupuestoVentasPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoVentasPunVen(
			JComboBox jComboBoxTiposAccionesPresupuestoVentasPunVen) {
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen = jComboBoxTiposAccionesPresupuestoVentasPunVen;
	}
	
	public void setBorderResaltarTiposRelacionesPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresupuestoVentasPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresupuestoVentasPunVen() {
	//	return jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresupuestoVentasPunVen(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen) {
	//	this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen = jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresupuestoVentasPunVen() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresupuestoVentasPunVen.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen .setBorder(borderResaltar);		
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
		this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
		
		this.presupuestoventaspunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoventaspunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresupuestoVentasPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresupuestoVentasPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoVentasPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoVentasPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoVentasPunVenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
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
		
		PresupuestoVentasPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresupuestoVentasPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresupuestoVentasPunVen= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"nuevo","nuevo","Nuevo"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"duplicar","duplicar","Duplicar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"copiar","copiar","Copiar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"ver_form","ver_form","Ver"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"recargar","recargar","Recargar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresupuestoVentasPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,
							"cerrar","cerrar","Salir"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen;
			
				this.jButtonProcesarInformacionToolBarPresupuestoVentasPunVen=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresupuestoVentasPunVen;
				
		//protected JButton jButtonModificarToolBarPresupuestoVentasPunVen;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresupuestoVentasPunVen=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresupuestoVentasPunVen=new JMenuMe("General");
		this.jmenuArchivoPresupuestoVentasPunVen=new JMenuMe("Archivo");
		this.jmenuAccionesPresupuestoVentasPunVen=new JMenuMe("Acciones");
		this.jmenuDatosPresupuestoVentasPunVen=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoVentasPunVen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoVentasPunVen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoVentasPunVen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresupuestoVentasPunVen= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresupuestoVentasPunVen.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresupuestoVentasPunVen,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresupuestoVentasPunVen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoVentasPunVen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoVentasPunVen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresupuestoVentasPunVen= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresupuestoVentasPunVen.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresupuestoVentasPunVen,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresupuestoVentasPunVen= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresupuestoVentasPunVen.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresupuestoVentasPunVen,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoVentasPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoVentasPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoVentasPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresupuestoVentasPunVen= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresupuestoVentasPunVen.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresupuestoVentasPunVen,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresupuestoVentasPunVen= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresupuestoVentasPunVen.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresupuestoVentasPunVen,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresupuestoVentasPunVen= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresupuestoVentasPunVen.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresupuestoVentasPunVen,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresupuestoVentasPunVen= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresupuestoVentasPunVen.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresupuestoVentasPunVen,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresupuestoVentasPunVen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresupuestoVentasPunVen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresupuestoVentasPunVen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoVentasPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoVentasPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoVentasPunVen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresupuestoVentasPunVen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresupuestoVentasPunVen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresupuestoVentasPunVen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresupuestoVentasPunVen.add(this.jMenuItemCerrarPresupuestoVentasPunVen);
			
			this.jmenuAccionesPresupuestoVentasPunVen.add(this.jMenuItemNuevoPresupuestoVentasPunVen);
			this.jmenuAccionesPresupuestoVentasPunVen.add(this.jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen);
			this.jmenuAccionesPresupuestoVentasPunVen.add(this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen);
			this.jmenuAccionesPresupuestoVentasPunVen.add(this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen);		
			this.jmenuAccionesPresupuestoVentasPunVen.add(this.jMenuItemDuplicarPresupuestoVentasPunVen);		
			this.jmenuAccionesPresupuestoVentasPunVen.add(this.jMenuItemCopiarPresupuestoVentasPunVen);		
			this.jmenuAccionesPresupuestoVentasPunVen.add(this.jMenuItemVerFormPresupuestoVentasPunVen);		
			
			this.jmenuDatosPresupuestoVentasPunVen.add(this.jMenuItemRecargarInformacionPresupuestoVentasPunVen);				
			this.jmenuDatosPresupuestoVentasPunVen.add(this.jMenuItemAnterioresPresupuestoVentasPunVen);				
			this.jmenuDatosPresupuestoVentasPunVen.add(this.jMenuItemSiguientesPresupuestoVentasPunVen);				
			this.jmenuDatosPresupuestoVentasPunVen.add(this.jMenuItemAbrirOrderByPresupuestoVentasPunVen);				
			this.jmenuDatosPresupuestoVentasPunVen.add(this.jMenuItemMostrarOcultarPresupuestoVentasPunVen);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresupuestoVentasPunVen.add(this.jMenuItemGuardarCambiosPresupuestoVentasPunVen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresupuestoVentasPunVen.add(this.jmenuArchivoPresupuestoVentasPunVen);		
			this.jmenuBarPresupuestoVentasPunVen.add(this.jmenuAccionesPresupuestoVentasPunVen);		
			this.jmenuBarPresupuestoVentasPunVen.add(this.jmenuDatosPresupuestoVentasPunVen);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresupuestoVentasPunVen);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresupuestoVentasPunVen() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCajaPresupuestoVentasPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaPresupuestoVentasPunVen.setToolTipText("Buscar Por Caja ");
		this.jButtonFK_IdCajaPresupuestoVentasPunVen= new JButtonMe();
		this.jButtonFK_IdCajaPresupuestoVentasPunVen.setText("Buscar");
		this.jButtonFK_IdCajaPresupuestoVentasPunVen.setToolTipText("Buscar Por Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaPresupuestoVentasPunVen,"buscar_button","Buscar Por Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen = new JLabelMe();
		jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen.setText("Caja :");
		jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen.setToolTipText("Caja");
		jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen= new JComboBoxMe();
		jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresupuestoVentasPunVen=new JTabbedPane();


		this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresupuestoVentasPunVen = new PresupuestoVentasPunVenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Presupuesto Ventas DATOS");
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen = new PresupuestoVentasPunVenDetalleFormJInternalFrame(jDesktopPane,this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones(),this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen = null;//new PresupuestoVentasPunVenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoVentasPunVen= new GridBagLayout();
		
		
		this.jTableDatosPresupuestoVentasPunVen = new JTableMe();      
		
		String sToolTipPresupuestoVentasPunVen="";
		sToolTipPresupuestoVentasPunVen=PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoVentasPunVen+="(PuntoVenta.PresupuestoVentasPunVen)";
		}
		
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoVentasPunVen+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresupuestoVentasPunVen.setToolTipText(sToolTipPresupuestoVentasPunVen);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresupuestoVentasPunVen);
		this.jTableDatosPresupuestoVentasPunVen.setAutoCreateRowSorter(true);
		this.jTableDatosPresupuestoVentasPunVen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresupuestoVentasPunVen.setRowSelectionAllowed(true);
		this.jTableDatosPresupuestoVentasPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresupuestoVentasPunVen,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonDuplicarPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonCopiarPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonVerFormPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonNuevoRelacionesPresupuestoVentasPunVen = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonCerrarPresupuestoVentasPunVen = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoVentasPunVen = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresupuestoVentasPunVen = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Ventas";
		
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoVentasPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoVentasPunVen.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoVentasPunVen.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen=new ReporteDinamicoJInternalFrame(PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresupuestoVentasPunVen();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresupuestoVentasPunVen=new ImportacionJInternalFrame(PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresupuestoVentasPunVen();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresupuestoVentasPunVen = new JButtonMe();
		
		this.jButtonAbrirOrderByPresupuestoVentasPunVen.setText("Orden");
		this.jButtonAbrirOrderByPresupuestoVentasPunVen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoVentasPunVen,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoVentasPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentasPunVen,false,this);
			
			//this.cargarOrderByPresupuestoVentasPunVen(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoVentasPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentasPunVen,true,this);
			
			//this.cargarOrderByPresupuestoVentasPunVen(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresupuestoVentasPunVen.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosPresupuestoVentasPunVen.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosPresupuestoVentasPunVen.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosPresupuestoVentasPunVen.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoVentasPunVen.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoVentasPunVen.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresupuestoVentasPunVen.setText("Nuevo");
		this.jButtonDuplicarPresupuestoVentasPunVen.setText("Duplicar");
		this.jButtonCopiarPresupuestoVentasPunVen.setText("Copiar");
		this.jButtonVerFormPresupuestoVentasPunVen.setText("Ver");
		this.jButtonNuevoRelacionesPresupuestoVentasPunVen.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.setText("Guardar");
		this.jButtonCerrarPresupuestoVentasPunVen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoVentasPunVen,"nuevo_button","Nuevo",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresupuestoVentasPunVen,"duplicar_button","Duplicar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresupuestoVentasPunVen,"copiar_button","Copiar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresupuestoVentasPunVen,"ver_form","Ver",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresupuestoVentasPunVen,"nuevorelaciones_button","Nuevo Rel",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen,"guardarcambiostabla_button","Guardar",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoVentasPunVen,"cerrar_button","Salir",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresupuestoVentasPunVen.setToolTipText("Nuevo"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresupuestoVentasPunVen.setToolTipText("Duplicar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresupuestoVentasPunVen.setToolTipText("Copiar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresupuestoVentasPunVen.setToolTipText("Ver"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresupuestoVentasPunVen.setToolTipText("Nuevo Rel"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.setToolTipText("Guardar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoVentasPunVen.setToolTipText("Salir"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoVentasPunVen";
		inputMap = this.jButtonNuevoPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoVentasPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoVentasPunVen"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresupuestoVentasPunVen";
		inputMap = this.jButtonDuplicarPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresupuestoVentasPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresupuestoVentasPunVen"));
		
		//COPIAR
		sMapKey = "CopiarPresupuestoVentasPunVen";
		inputMap = this.jButtonCopiarPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresupuestoVentasPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresupuestoVentasPunVen"));
		
		//VEr FORM
		sMapKey = "VerFormPresupuestoVentasPunVen";
		inputMap = this.jButtonVerFormPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresupuestoVentasPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresupuestoVentasPunVen"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresupuestoVentasPunVen";
		inputMap = this.jButtonNuevoRelacionesPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresupuestoVentasPunVen"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresupuestoVentasPunVen";
		inputMap = this.jButtonModificarPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresupuestoVentasPunVen"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoVentasPunVen";
		inputMap = this.jButtonCerrarPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoVentasPunVen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoVentasPunVen";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoVentasPunVen"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresupuestoVentasPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresupuestoVentasPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresupuestoVentasPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresupuestoVentasPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresupuestoVentasPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresupuestoVentasPunVen.setName("jPanelParametrosReportesPresupuestoVentasPunVen"); 
		
		this.jPanelParametrosReportesAccionesPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresupuestoVentasPunVen.setName("jPanelParametrosReportesAccionesPresupuestoVentasPunVen"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonRecargarInformacionPresupuestoVentasPunVen.setText("Recargar");
		this.jButtonRecargarInformacionPresupuestoVentasPunVen.setToolTipText("Recargar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresupuestoVentasPunVen,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonProcesarInformacionPresupuestoVentasPunVen.setText("Procesar");
		this.jButtonProcesarInformacionPresupuestoVentasPunVen.setToolTipText("Procesar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresupuestoVentasPunVen.setVisible(false);
			
		this.jButtonProcesarInformacionPresupuestoVentasPunVen.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoVentasPunVen.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoVentasPunVen.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.setText("TIPO");       
		this.jComboBoxTiposReportesPresupuestoVentasPunVen.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.setText("Accion");
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.setText("Accion");
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresupuestoVentasPunVen = new JLabelMe();
		
		this.jLabelAccionesPresupuestoVentasPunVen.setText("Acciones");		
		this.jLabelAccionesPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresupuestoVentasPunVen = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresupuestoVentasPunVen.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresupuestoVentasPunVen.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresupuestoVentasPunVen = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresupuestoVentasPunVen.setText("Graf.");
		this.jCheckBoxConGraficoReportePresupuestoVentasPunVen.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresupuestoVentasPunVen = new JButtonMe();
		//this.jButtonAnterioresPresupuestoVentasPunVen.setText("<<");
        this.jButtonAnterioresPresupuestoVentasPunVen.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresupuestoVentasPunVen,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresupuestoVentasPunVen = new JButtonMe();
		//this.jButtonSiguientesPresupuestoVentasPunVen.setText(">>");
        this.jButtonSiguientesPresupuestoVentasPunVen.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresupuestoVentasPunVen,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen,"nuevoguardarcambios_button","Nue",this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresupuestoVentasPunVen";
		inputMap = this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresupuestoVentasPunVen"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresupuestoVentasPunVen";
		inputMap = this.jButtonRecargarInformacionPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresupuestoVentasPunVen"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresupuestoVentasPunVen";
		inputMap = this.jButtonSiguientesPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresupuestoVentasPunVen"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresupuestoVentasPunVen";
		inputMap = this.jButtonAnterioresPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresupuestoVentasPunVen"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresupuestoVentasPunVen();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresupuestoVentasPunVen.setMinimumSize(new Dimension(this.getWidth(),PresupuestoVentasPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoVentasPunVen.setMaximumSize(new Dimension(this.getWidth(),PresupuestoVentasPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoVentasPunVen.setPreferredSize(new Dimension(this.getWidth(),PresupuestoVentasPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoVentasPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresupuestoVentasPunVen = new GridBagLayout();

			this.jPanelPaginacionPresupuestoVentasPunVen.setLayout(gridaBagLayoutPaginacionPresupuestoVentasPunVen);						
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonAnterioresPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
					
						
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
			
			this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
						
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
			this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonSiguientesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonNuevoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
						
			
			
			if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 1;
				this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			}
			
			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonDuplicarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonCopiarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonVerFormPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 1;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresupuestoVentasPunVen.add(this.jButtonCerrarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		
		
		this.jButtonRecargarInformacionPresupuestoVentasPunVen.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoVentasPunVen.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoVentasPunVen.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresupuestoVentasPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoVentasPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoVentasPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresupuestoVentasPunVen.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoVentasPunVen.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoVentasPunVen.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresupuestoVentasPunVen.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoVentasPunVen.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoVentasPunVen.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresupuestoVentasPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresupuestoVentasPunVen = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresupuestoVentasPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresupuestoVentasPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresupuestoVentasPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresupuestoVentasPunVen = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresupuestoVentasPunVen.setLayout(gridaBagParametrosReportesPresupuestoVentasPunVen);
			this.jPanelParametrosReportesAccionesPresupuestoVentasPunVen.setLayout(gridaBagParametrosReportesAccionesPresupuestoVentasPunVen);
			
			
			this.jPanelParametrosAuxiliar1PresupuestoVentasPunVen.setLayout(gridaBagParametrosAuxiliar1PresupuestoVentasPunVen);
			this.jPanelParametrosAuxiliar2PresupuestoVentasPunVen.setLayout(gridaBagParametrosAuxiliar2PresupuestoVentasPunVen);
			this.jPanelParametrosAuxiliar3PresupuestoVentasPunVen.setLayout(gridaBagParametrosAuxiliar3PresupuestoVentasPunVen);
			this.jPanelParametrosAuxiliar4PresupuestoVentasPunVen.setLayout(gridaBagParametrosAuxiliar4PresupuestoVentasPunVen);
			//this.jPanelParametrosAuxiliar5PresupuestoVentasPunVen.setLayout(gridaBagParametrosAuxiliar2PresupuestoVentasPunVen);			
			
			
			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jButtonRecargarInformacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentasPunVen.add(this.jComboBoxTiposPaginacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentasPunVen.add(this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoVentasPunVen.add(this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jPanelParametrosAuxiliar1PresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresupuestoVentasPunVen.add(this.jComboBoxTiposReportesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);																		
			
			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresupuestoVentasPunVen.add(this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jPanelParametrosAuxiliar4PresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jComboBoxTiposReportesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jCheckBoxGenerarReportePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jPanelParametrosAuxiliar2PresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jLabelAccionesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jButtonAbrirOrderByPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
			
			
			/*
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jCheckBoxConGraficoReportePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentasPunVen.add(this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);															
				
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentasPunVen.add(this.jCheckBoxSeleccionadosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);															
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoVentasPunVen.add(this.jCheckBoxConGraficoReportePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jPanelParametrosAuxiliar3PresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jComboBoxTiposAccionesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
	
				
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoVentasPunVen.add(this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresupuestoVentasPunVen = new GridBagLayout();

			this.jScrollPanelDatosPresupuestoVentasPunVen.setLayout(gridaBagLayoutDatosPresupuestoVentasPunVen);
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
			
			this.jScrollPanelDatosPresupuestoVentasPunVen.add(this.jTableDatosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresupuestoVentasPunVen.setViewportView(this.jTableDatosPresupuestoVentasPunVen);
		this.jTableDatosPresupuestoVentasPunVen.setFillsViewportHeight(true);
		this.jTableDatosPresupuestoVentasPunVen.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoVentasPunVen= new GridBagLayout();
		this.jPanelAccionesPresupuestoVentasPunVen.setLayout(gridaBagLayoutAccionesPresupuestoVentasPunVen);
		
		
		/*	
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
			
		this.jPanelAccionesPresupuestoVentasPunVen.add(this.jButtonNuevoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCajaPresupuestoVentasPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdCajaPresupuestoVentasPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaPresupuestoVentasPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaPresupuestoVentasPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaPresupuestoVentasPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaPresupuestoVentasPunVen.setLayout(gridaBagLayoutFK_IdCajaPresupuestoVentasPunVen);

		gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
		jPanelFK_IdCajaPresupuestoVentasPunVen.add(jLabelid_cajaFK_IdCajaPresupuestoVentasPunVen, gridBagConstraintsPresupuestoVentasPunVen);

		gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasPunVen.gridy = 0;
		gridBagConstraintsPresupuestoVentasPunVen.gridx = 1;
		jPanelFK_IdCajaPresupuestoVentasPunVen.add(jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen, gridBagConstraintsPresupuestoVentasPunVen);

		gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoVentasPunVen.gridy = 1;
		gridBagConstraintsPresupuestoVentasPunVen.gridx =1;
		jPanelFK_IdCajaPresupuestoVentasPunVen.add(jButtonFK_IdCajaPresupuestoVentasPunVen, gridBagConstraintsPresupuestoVentasPunVen);

		jTabbedPaneBusquedasPresupuestoVentasPunVen.addTab("1.-Por Caja ", jPanelFK_IdCajaPresupuestoVentasPunVen);
		jTabbedPaneBusquedasPresupuestoVentasPunVen.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoVentasPunVen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoVentasPunVen);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;		
			//this.gridBagConstraintsPresupuestoVentasPunVen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;		
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresupuestoVentasPunVen);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;		
			this.gridBagConstraintsPresupuestoVentasPunVen.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresupuestoVentasPunVen.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);								
		
		
		/*
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		*/		
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx =0;
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoVentasPunVen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
				
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresupuestoVentasPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoVentasPunVen = new GridBagLayout();
			this.jPanelBusquedasParametrosPresupuestoVentasPunVen.setLayout(gridaBagLayoutBusquedasParametrosPresupuestoVentasPunVen);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresupuestoVentasPunVen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
			
			
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
			
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresupuestoVentasPunVen;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresupuestoVentasPunVen() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresupuestoVentasPunVen = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.setName("jPanelReporteDinamicoPresupuestoVentasPunVen"); 
		
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.setLayout(gridaBagLayoutReporteDinamicoPresupuestoVentasPunVen);
		
		
		this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoVentasPunVen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresupuestoVentasPunVen = new JLabelMe();

		this.jLabelColumnasSelectReportePresupuestoVentasPunVen.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jLabelColumnasSelectReportePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresupuestoVentasPunVen = new JList<Reporte>();
		this.jListColumnasSelectReportePresupuestoVentasPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresupuestoVentasPunVen.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresupuestoVentasPunVen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoVentasPunVen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoVentasPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresupuestoVentasPunVen=new JScrollPane(this.jListColumnasSelectReportePresupuestoVentasPunVen);
			
			this.jScrollColumnasSelectReportePresupuestoVentasPunVen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoVentasPunVen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoVentasPunVen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jListColumnasSelectReportePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jScrollColumnasSelectReportePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresupuestoVentasPunVen = new JLabelMe();

		this.jLabelRelacionesSelectReportePresupuestoVentasPunVen.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresupuestoVentasPunVen = new JList<Reporte>();
		this.jListRelacionesSelectReportePresupuestoVentasPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresupuestoVentasPunVen.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresupuestoVentasPunVen.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoVentasPunVen.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoVentasPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresupuestoVentasPunVen=new JScrollPane(this.jListRelacionesSelectReportePresupuestoVentasPunVen);
			
			this.jScrollRelacionesSelectReportePresupuestoVentasPunVen.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoVentasPunVen.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoVentasPunVen.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresupuestoVentasPunVen = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelConGraficoDinamicoPresupuestoVentasPunVen.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jLabelConGraficoDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jCheckBoxConGraficoDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresupuestoVentasPunVen.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jLabelColumnaCategoriaGraficoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresupuestoVentasPunVen.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jLabelColumnaCategoriaValorPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresupuestoVentasPunVen.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresupuestoVentasPunVen.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jComboBoxColumnaCategoriaValorPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresupuestoVentasPunVen.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jLabelColumnasValoresGraficoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresupuestoVentasPunVen = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresupuestoVentasPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresupuestoVentasPunVen.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresupuestoVentasPunVen=new JScrollPane(this.jListColumnasValoresGraficoPresupuestoVentasPunVen);
			
			this.jScrollColumnasValoresGraficoPresupuestoVentasPunVen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoVentasPunVen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoVentasPunVen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jListColumnasSelectReportePresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jScrollColumnasValoresGraficoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasPunVen.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jLabelTiposGraficosReportesDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasPunVen = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoVentasPunVen.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasPunVen.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jComboBoxTiposGraficosReportesDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasPunVen.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jLabelGenerarExcelReporteDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVen.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVen,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVen.setToolTipText("Generar EXCEL"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jComboBoxTiposReportesDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasPunVen.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jLabelTiposArchivoReporteDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresupuestoVentasPunVen.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresupuestoVentasPunVen,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresupuestoVentasPunVen.setToolTipText("Generar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jButtonGenerarReporteDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresupuestoVentasPunVen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresupuestoVentasPunVen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresupuestoVentasPunVen.setToolTipText("Cancelar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoVentasPunVen.add(this.jButtonCerrarReporteDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresupuestoVentasPunVen = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen= new JScrollPane(jPanelReporteDinamicoPresupuestoVentasPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresupuestoVentasPunVen);
		this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getContentPane().add(this.jScrollPanelReporteDinamicoPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresupuestoVentasPunVen() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresupuestoVentasPunVen = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresupuestoVentasPunVen.setName("jPanelImportacionPresupuestoVentasPunVen"); 
		
		this.jPanelImportacionPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresupuestoVentasPunVen.setLayout(gridaBagLayoutImportacionPresupuestoVentasPunVen);
		
		
		this.jInternalFrameImportacionPresupuestoVentasPunVen= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresupuestoVentasPunVen= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresupuestoVentasPunVen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoVentasPunVen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresupuestoVentasPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoVentasPunVen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoVentasPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresupuestoVentasPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoVentasPunVen.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoVentasPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoVentasPunVen.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelArchivoImportacionPresupuestoVentasPunVen.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoVentasPunVen.add(this.jLabelArchivoImportacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresupuestoVentasPunVen = new JFileChooser();		
		this.jFileChooserImportacionPresupuestoVentasPunVen.setToolTipText("ESCOGER ARCHIVO"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonAbrirImportacionPresupuestoVentasPunVen.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresupuestoVentasPunVen,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresupuestoVentasPunVen.setToolTipText("Generar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentasPunVen.add(this.jButtonAbrirImportacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresupuestoVentasPunVen = new JLabelMe();

		this.jLabelPathArchivoImportacionPresupuestoVentasPunVen.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresupuestoVentasPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoVentasPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoVentasPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoVentasPunVen.add(this.jLabelPathArchivoImportacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresupuestoVentasPunVen=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresupuestoVentasPunVen.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoVentasPunVen.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoVentasPunVen.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentasPunVen.add(this.jTextFieldPathArchivoImportacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonGenerarImportacionPresupuestoVentasPunVen.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresupuestoVentasPunVen,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresupuestoVentasPunVen.setToolTipText("Generar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentasPunVen.add(this.jButtonGenerarImportacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresupuestoVentasPunVen = new JButtonMe();
		this.jButtonCerrarImportacionPresupuestoVentasPunVen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresupuestoVentasPunVen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresupuestoVentasPunVen.setToolTipText("Cancelar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoVentasPunVen.add(this.jButtonCerrarImportacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresupuestoVentasPunVen = new GridBagLayout();
		
		this.jScrollPanelImportacionPresupuestoVentasPunVen= new JScrollPane(jPanelImportacionPresupuestoVentasPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iPosYImportacion;
		this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iPosXImportacion;
		this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresupuestoVentasPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresupuestoVentasPunVen.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresupuestoVentasPunVen);
		this.jInternalFrameImportacionPresupuestoVentasPunVen.getContentPane().add(this.jScrollPanelImportacionPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresupuestoVentasPunVen(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresupuestoVentasPunVen = new JButtonMe();
			this.jButtonAbrirOrderByPresupuestoVentasPunVen.setText("Orden");
			this.jButtonAbrirOrderByPresupuestoVentasPunVen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoVentasPunVen,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresupuestoVentasPunVen";
			inputMap = this.jButtonAbrirOrderByPresupuestoVentasPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresupuestoVentasPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresupuestoVentasPunVen"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresupuestoVentasPunVen = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresupuestoVentasPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresupuestoVentasPunVen.setName("jPanelOrderByPresupuestoVentasPunVen"); 
			
			this.jPanelOrderByPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresupuestoVentasPunVen.setLayout(gridaBagLayoutOrderByPresupuestoVentasPunVen);
			
			
			this.jTableDatosPresupuestoVentasPunVenOrderBy = new JTableMe();        
			this.jTableDatosPresupuestoVentasPunVenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresupuestoVentasPunVenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresupuestoVentasPunVenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresupuestoVentasPunVenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresupuestoVentasPunVenOrderBy.setViewportView(this.jTableDatosPresupuestoVentasPunVenOrderBy);
			this.jTableDatosPresupuestoVentasPunVenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresupuestoVentasPunVenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresupuestoVentasPunVen= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresupuestoVentasPunVen= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresupuestoVentasPunVen = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresupuestoVentasPunVen= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setTitle("Orden");
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setResizable(true);
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setClosable(true);
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresupuestoVentasPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresupuestoVentasPunVen.ipady =150;
				
			this.jPanelOrderByPresupuestoVentasPunVen.add(jScrollPanelDatosPresupuestoVentasPunVenOrderBy, this.gridBagConstraintsPresupuestoVentasPunVen);//this.jTableDatosPresupuestoVentasPunVenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresupuestoVentasPunVen = new JButtonMe();
			this.jButtonCerrarOrderByPresupuestoVentasPunVen.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresupuestoVentasPunVen,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresupuestoVentasPunVen.setToolTipText("Cancelar"+" "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresupuestoVentasPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresupuestoVentasPunVen.add(this.jButtonCerrarOrderByPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresupuestoVentasPunVen = new GridBagLayout();
			
			this.jScrollPanelOrderByPresupuestoVentasPunVen= new JScrollPane(jPanelOrderByPresupuestoVentasPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresupuestoVentasPunVen = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasPunVen.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresupuestoVentasPunVen.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoVentasPunVen.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresupuestoVentasPunVen.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresupuestoVentasPunVen);
			
			this.jInternalFrameOrderByPresupuestoVentasPunVen.getContentPane().add(this.jScrollPanelOrderByPresupuestoVentasPunVen, this.gridBagConstraintsPresupuestoVentasPunVen);			
		
		} else {
			this.jButtonAbrirOrderByPresupuestoVentasPunVen = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresupuestoVentasPunVen.getRowHeight();//PresupuestoVentasPunVenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresupuestoVentasPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen.isSelected()) {
					iHeightTable=PresupuestoVentasPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoVentasPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoVentasPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresupuestoVentasPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoVentasPunVen.isSelected()) {
					iHeightTable=PresupuestoVentasPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoVentasPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoVentasPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresupuestoVentasPunVen!=null && this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy()!=null) {
			//if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresupuestoVentasPunVen.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresupuestoVentasPunVen.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresupuestoVentasPunVen.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresupuestoVentasPunVen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoVentasPunVen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoVentasPunVen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoventaspunvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresupuestoVentasPunVen> TraerPresupuestoVentasPunVenBeans(List<PresupuestoVentasPunVen> presupuestoventaspunvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvens) {
					
				if(!(PresupuestoVentasPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresupuestoVentasPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presupuestoventaspunven.setsDetalleGeneralEntityReporte(PresupuestoVentasPunVenConstantesFunciones.getPresupuestoVentasPunVenDescripcion(presupuestoventaspunven));
										
						
					
						
					
				} else  {
							
					//presupuestoventaspunven.setsDetalleGeneralEntityReporte(presupuestoventaspunven.getsDetalleGeneralEntityReporte());
										
				}
				
				//presupuestoventaspunvenbeans.add(presupuestoventaspunvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presupuestoventaspunvens;
    }
	//PARA REPORTES FIN
}
