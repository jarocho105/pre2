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
import com.bydan.erp.nomina.util.NumeroPatronalConstantesFunciones;

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
public class NumeroPatronalJInternalFrame extends NumeroPatronalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNumeroPatronal;
	
	protected JMenuBar jmenuBarNumeroPatronal;
	
	protected JMenu jmenuNumeroPatronal;
	protected JMenu jmenuDatosNumeroPatronal;
	protected JMenu jmenuArchivoNumeroPatronal;
	protected JMenu jmenuAccionesNumeroPatronal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNumeroPatronal;	
	protected GridBagConstraints gridBagConstraintsNumeroPatronal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NumeroPatronalDetalleFormJInternalFrame jInternalFrameDetalleFormNumeroPatronal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNumeroPatronal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNumeroPatronal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_canton="";

	protected ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parroquia="";
	
	public NumeroPatronalSessionBean numeropatronalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CantonSessionBean cantonSessionBean;
	public ParroquiaSessionBean parroquiaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NumeroPatronal> numeropatronals;		
	public List<NumeroPatronal> numeropatronalsEliminados;	
	public List<NumeroPatronal> numeropatronalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNumeroPatronal;		
	protected JButton jButtonAbrirOrderByNumeroPatronal;
	
	
	//protected JPanel jPanelOrderByNumeroPatronal;
	//public JScrollPane jScrollPanelOrderByNumeroPatronal;	
	//protected JButton jButtonCerrarOrderByNumeroPatronal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NumeroPatronalLogic numeropatronalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNumeroPatronal;
	public JScrollPane jScrollPanelDatosEdicionNumeroPatronal;
	public JScrollPane jScrollPanelDatosGeneralNumeroPatronal;
    
	
	
	//public JScrollPane jScrollPanelDatosNumeroPatronalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNumeroPatronal;
	//public JScrollPane jScrollPanelImportacionNumeroPatronal;
	
	
	
	protected JPanel jPanelAccionesNumeroPatronal;
	
    protected JPanel jPanelPaginacionNumeroPatronal;
    protected JPanel jPanelParametrosReportesNumeroPatronal;
	protected JPanel jPanelParametrosReportesAccionesNumeroPatronal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NumeroPatronal;
	protected JPanel jPanelParametrosAuxiliar2NumeroPatronal;
	protected JPanel jPanelParametrosAuxiliar3NumeroPatronal;
	protected JPanel jPanelParametrosAuxiliar4NumeroPatronal;
	//protected JPanel jPanelParametrosAuxiliar5NumeroPatronal;
	
	
	
	//protected JPanel jPanelReporteDinamicoNumeroPatronal;
	//protected JPanel jPanelImportacionNumeroPatronal;
	
	
	public JTable jTableDatosNumeroPatronal;
	
	
	
	//public JTable jTableDatosNumeroPatronalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNumeroPatronal;
	protected JButton jButtonDuplicarNumeroPatronal;
	protected JButton jButtonCopiarNumeroPatronal;
	protected JButton jButtonVerFormNumeroPatronal;
	protected JButton jButtonNuevoRelacionesNumeroPatronal;
	protected JButton jButtonModificarNumeroPatronal;
	
    protected JButton jButtonGuardarCambiosTablaNumeroPatronal;
	protected JButton jButtonCerrarNumeroPatronal;
	
	
	protected JButton jButtonRecargarInformacionNumeroPatronal;
	protected JButton jButtonProcesarInformacionNumeroPatronal;
	
	
	protected JButton jButtonAnterioresNumeroPatronal;
	protected JButton jButtonSiguientesNumeroPatronal;
	protected JButton jButtonNuevoGuardarCambiosNumeroPatronal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNumeroPatronal;
	//protected JButton jButtonCerrarReporteDinamicoNumeroPatronal;
	//protected JButton jButtonGenerarExcelReporteDinamicoNumeroPatronal;	
	
	
	
	//protected JButton jButtonAbrirImportacionNumeroPatronal;
	//protected JButton jButtonGenerarImportacionNumeroPatronal;
	//protected JButton jButtonCerrarImportacionNumeroPatronal;
	//protected JFileChooser jFileChooserImportacionNumeroPatronal;
	//protected File fileImportacionNumeroPatronal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNumeroPatronal;
	protected JButton jButtonDuplicarToolBarNumeroPatronal;
	protected JButton jButtonNuevoRelacionesToolBarNumeroPatronal;
	
	
	public JButton jButtonGuardarCambiosToolBarNumeroPatronal;
	protected JButton jButtonCopiarToolBarNumeroPatronal;
	protected JButton jButtonVerFormToolBarNumeroPatronal;
	public JButton jButtonGuardarCambiosTablaToolBarNumeroPatronal;
	protected JButton jButtonMostrarOcultarTablaToolBarNumeroPatronal;
	protected JButton jButtonCerrarToolBarNumeroPatronal;
	
	protected JButton jButtonRecargarInformacionToolBarNumeroPatronal;
	protected JButton jButtonProcesarInformacionToolBarNumeroPatronal;
	protected JButton jButtonAnterioresToolBarNumeroPatronal;
	protected JButton jButtonSiguientesToolBarNumeroPatronal;
	protected JButton jButtonNuevoGuardarCambiosToolBarNumeroPatronal;
	protected JButton jButtonAbrirOrderByToolBarNumeroPatronal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNumeroPatronal;
	protected JMenuItem jMenuItemDuplicarNumeroPatronal;
	protected JMenuItem jMenuItemNuevoRelacionesNumeroPatronal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNumeroPatronal;
	protected JMenuItem jMenuItemCopiarNumeroPatronal;
	protected JMenuItem jMenuItemVerFormNumeroPatronal;
	protected JMenuItem jMenuItemGuardarCambiosTablaNumeroPatronal;
	protected JMenuItem jMenuItemCerrarNumeroPatronal;
	protected JMenuItem jMenuItemDetalleCerrarNumeroPatronal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNumeroPatronal;
	protected JMenuItem jMenuItemDetalleMostarOcultarNumeroPatronal;
	
	protected JMenuItem jMenuItemRecargarInformacionNumeroPatronal;
	protected JMenuItem jMenuItemProcesarInformacionNumeroPatronal;
	protected JMenuItem jMenuItemAnterioresNumeroPatronal;
	protected JMenuItem jMenuItemSiguientesNumeroPatronal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNumeroPatronal;
	protected JMenuItem jMenuItemAbrirOrderByNumeroPatronal;
	protected JMenuItem jMenuItemMostrarOcultarNumeroPatronal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNumeroPatronal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNumeroPatronal;
	protected JCheckBox jCheckBoxSeleccionadosNumeroPatronal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNumeroPatronal;
	protected JCheckBox jCheckBoxConGraficoReporteNumeroPatronal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNumeroPatronal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNumeroPatronal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNumeroPatronal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNumeroPatronal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNumeroPatronal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNumeroPatronal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNumeroPatronal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNumeroPatronal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNumeroPatronal;
	protected JTextField jTextFieldValorCampoGeneralNumeroPatronal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNumeroPatronal;
	//public JList<Reporte> jListColumnasSelectReporteNumeroPatronal;
	//public JScrollPane jScrollColumnasSelectReporteNumeroPatronal;
	
	//public JLabel jLabelRelacionesSelectReporteNumeroPatronal;
	//public JList<Reporte> jListRelacionesSelectReporteNumeroPatronal;
	//public JScrollPane jScrollRelacionesSelectReporteNumeroPatronal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNumeroPatronal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNumeroPatronal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNumeroPatronal;
	//public JLabel jLabelTiposArchivoReporteDinamicoNumeroPatronal;
	
		
	//public JLabel jLabelArchivoImportacionNumeroPatronal;	
	//public JLabel jLabelPathArchivoImportacionNumeroPatronal;
	//protected JTextField jTextFieldPathArchivoImportacionNumeroPatronal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNumeroPatronal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNumeroPatronal;
	
	//public JLabel jLabelColumnaCategoriaValorNumeroPatronal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNumeroPatronal;
	
	//public JLabel jLabelColumnasValoresGraficoNumeroPatronal;
	//public JList<Reporte> jListColumnasValoresGraficoNumeroPatronal;
	//public JScrollPane jScrollColumnasValoresGraficoNumeroPatronal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNumeroPatronal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNumeroPatronal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNumeroPatronal;
	public JPanel jPanelFK_IdCantonNumeroPatronal;
	public JButton jButtonFK_IdCantonNumeroPatronal;
	public JPanel jPanelFK_IdParroquiaNumeroPatronal;
	public JButton jButtonFK_IdParroquiaNumeroPatronal;
	public JPanel jPanelFK_IdProvinciaNumeroPatronal;
	public JButton jButtonFK_IdProvinciaNumeroPatronal;
	
	public JPanel jPanelid_cantonFK_IdCantonNumeroPatronal;
	public JLabel jLabelid_cantonFK_IdCantonNumeroPatronal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cantonFK_IdCantonNumeroPatronal;
	public JButton jButtonid_cantonFK_IdCantonNumeroPatronal= new JButtonMe();
	public JButton jButtonid_cantonFK_IdCantonNumeroPatronalUpdate= new JButtonMe();
	public JButton jButtonid_cantonFK_IdCantonNumeroPatronalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_parroquiaFK_IdParroquiaNumeroPatronal;
	public JLabel jLabelid_parroquiaFK_IdParroquiaNumeroPatronal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal;
	public JButton jButtonid_parroquiaFK_IdParroquiaNumeroPatronal= new JButtonMe();
	public JButton jButtonid_parroquiaFK_IdParroquiaNumeroPatronalUpdate= new JButtonMe();
	public JButton jButtonid_parroquiaFK_IdParroquiaNumeroPatronalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaFK_IdProvinciaNumeroPatronal;
	public JLabel jLabelid_provinciaFK_IdProvinciaNumeroPatronal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal;
	public JButton jButtonid_provinciaFK_IdProvinciaNumeroPatronal= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaNumeroPatronalUpdate= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaNumeroPatronalBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1210;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NumeroPatronalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroPatronalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroPatronalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroPatronalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNumeroPatronal)	{
		this.jButtonRecargarInformacionNumeroPatronal = jButtonRecargarInformacionNumeroPatronal;
	}
	
	public JButton getjButtonProcesarInformacionNumeroPatronal() {
		return this.jButtonProcesarInformacionNumeroPatronal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNumeroPatronal)	{
		this.jButtonProcesarInformacionNumeroPatronal = jButtonProcesarInformacionNumeroPatronal;
	}
	
	
	public JButton getjButtonRecargarInformacionNumeroPatronal() {
		return this.jButtonRecargarInformacionNumeroPatronal;
	}
	
	
	public List<NumeroPatronal> getnumeropatronals() {
		return this.numeropatronals;
	}

	public void setnumeropatronals(List<NumeroPatronal> numeropatronals) {
		this.numeropatronals = numeropatronals;
	}
	
	public List<NumeroPatronal> getnumeropatronalsAux() {
		return this.numeropatronalsAux;
	}

	public void setnumeropatronalsAux(List<NumeroPatronal> numeropatronalsAux) {
		this.numeropatronalsAux = numeropatronalsAux;
	}
	
	public List<NumeroPatronal> getnumeropatronalsEliminados() {
		return this.numeropatronalsEliminados;
	}

	public void setNumeroPatronalsEliminados(List<NumeroPatronal> numeropatronalsEliminados) {
		this.numeropatronalsEliminados = numeropatronalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNumeroPatronal() {
		return jComboBoxTiposSeleccionarNumeroPatronal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNumeroPatronal(
			JComboBox jComboBoxTiposSeleccionarNumeroPatronal) {
		this.jComboBoxTiposSeleccionarNumeroPatronal = jComboBoxTiposSeleccionarNumeroPatronal;
	}
	
	public void setBorderResaltarTiposSeleccionarNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNumeroPatronal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNumeroPatronal() {
		return jTextFieldValorCampoGeneralNumeroPatronal;
	}

	public void setjTextFieldValorCampoGeneralNumeroPatronal(
			JTextField jTextFieldValorCampoGeneralNumeroPatronal) {
		this.jTextFieldValorCampoGeneralNumeroPatronal = jTextFieldValorCampoGeneralNumeroPatronal;
	}

	public void setBorderResaltarValorCampoGeneralNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNumeroPatronal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNumeroPatronal() {
		return this.jCheckBoxSeleccionarTodosNumeroPatronal;
	}

	public void setjCheckBoxSeleccionarTodosNumeroPatronal(
			JCheckBox jCheckBoxSeleccionarTodosNumeroPatronal) {
		this.jCheckBoxSeleccionarTodosNumeroPatronal = jCheckBoxSeleccionarTodosNumeroPatronal;
	}

	public void setBorderResaltarSeleccionarTodosNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNumeroPatronal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNumeroPatronal() {
		return this.jCheckBoxSeleccionadosNumeroPatronal;
	}

	public void setjCheckBoxSeleccionadosNumeroPatronal(
			JCheckBox jCheckBoxSeleccionadosNumeroPatronal) {
		this.jCheckBoxSeleccionadosNumeroPatronal = jCheckBoxSeleccionadosNumeroPatronal;
	}
	
	public void setBorderResaltarSeleccionadosNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNumeroPatronal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNumeroPatronal() {
		return this.jComboBoxTiposArchivosReportesNumeroPatronal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNumeroPatronal(
			JComboBox jComboBoxTiposArchivosReportesNumeroPatronal) {
		this.jComboBoxTiposArchivosReportesNumeroPatronal = jComboBoxTiposArchivosReportesNumeroPatronal;
	}

	public void setBorderResaltarTiposArchivosReportesNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNumeroPatronal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNumeroPatronal() {
		return this.jComboBoxTiposReportesNumeroPatronal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNumeroPatronal(
			JComboBox jComboBoxTiposReportesNumeroPatronal) {
		this.jComboBoxTiposReportesNumeroPatronal = jComboBoxTiposReportesNumeroPatronal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNumeroPatronal() {
	//	return jComboBoxTiposReportesDinamicoNumeroPatronal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNumeroPatronal(
	//		JComboBox jComboBoxTiposReportesDinamicoNumeroPatronal) {
	//	this.jComboBoxTiposReportesDinamicoNumeroPatronal = jComboBoxTiposReportesDinamicoNumeroPatronal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNumeroPatronal() {
	//	return jComboBoxTiposArchivosReportesDinamicoNumeroPatronal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNumeroPatronal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNumeroPatronal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNumeroPatronal = jComboBoxTiposArchivosReportesDinamicoNumeroPatronal;
	//}
	
	public void setBorderResaltarTiposReportesNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNumeroPatronal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNumeroPatronal() {
		return this.jComboBoxTiposGraficosReportesNumeroPatronal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNumeroPatronal(
			JComboBox jComboBoxTiposGraficosReportesNumeroPatronal) {
		this.jComboBoxTiposGraficosReportesNumeroPatronal = jComboBoxTiposGraficosReportesNumeroPatronal;
	}
	
	public void setBorderResaltarTiposGraficosReportesNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNumeroPatronal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNumeroPatronal() {
		return this.jComboBoxTiposPaginacionNumeroPatronal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNumeroPatronal(
			JComboBox jComboBoxTiposPaginacionNumeroPatronal) {
		this.jComboBoxTiposPaginacionNumeroPatronal = jComboBoxTiposPaginacionNumeroPatronal;
	}
	
	public void setBorderResaltarTiposPaginacionNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNumeroPatronal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNumeroPatronal() {
		return this.jComboBoxTiposRelacionesNumeroPatronal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNumeroPatronal() {
		return this.jComboBoxTiposAccionesNumeroPatronal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNumeroPatronal(
			JComboBox jComboBoxTiposRelacionesNumeroPatronal) {
		this.jComboBoxTiposRelacionesNumeroPatronal = jComboBoxTiposRelacionesNumeroPatronal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNumeroPatronal(
			JComboBox jComboBoxTiposAccionesNumeroPatronal) {
		this.jComboBoxTiposAccionesNumeroPatronal = jComboBoxTiposAccionesNumeroPatronal;
	}
	
	public void setBorderResaltarTiposRelacionesNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNumeroPatronal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNumeroPatronal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNumeroPatronal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNumeroPatronal() {
	//	return jCheckBoxConGraficoDinamicoNumeroPatronal;
	//}

	//public void setjCheckBoxConGraficoDinamicoNumeroPatronal(
	//		JCheckBox jCheckBoxConGraficoDinamicoNumeroPatronal) {
	//	this.jCheckBoxConGraficoDinamicoNumeroPatronal = jCheckBoxConGraficoDinamicoNumeroPatronal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNumeroPatronal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNumeroPatronal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNumeroPatronal .setBorder(borderResaltar);		
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
		this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
		
		this.numeropatronalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.numeropatronalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.numeropatronalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NumeroPatronalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Numero Patronal MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
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
		
		NumeroPatronalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNumeroPatronal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"nuevo","nuevo","Nuevo"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"duplicar","duplicar","Duplicar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"copiar","copiar","Copiar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"ver_form","ver_form","Ver"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"recargar","recargar","Recargar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNumeroPatronal,this.jTtoolBarNumeroPatronal,
							"cerrar","cerrar","Salir"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNumeroPatronal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNumeroPatronal;
			
				this.jButtonProcesarInformacionToolBarNumeroPatronal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNumeroPatronal;
				
		//protected JButton jButtonModificarToolBarNumeroPatronal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNumeroPatronal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNumeroPatronal=new JMenuMe("General");
		this.jmenuArchivoNumeroPatronal=new JMenuMe("Archivo");
		this.jmenuAccionesNumeroPatronal=new JMenuMe("Acciones");
		this.jmenuDatosNumeroPatronal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNumeroPatronal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNumeroPatronal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNumeroPatronal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNumeroPatronal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNumeroPatronal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNumeroPatronal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNumeroPatronal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNumeroPatronal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNumeroPatronal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNumeroPatronal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNumeroPatronal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNumeroPatronal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNumeroPatronal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNumeroPatronal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNumeroPatronal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNumeroPatronal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNumeroPatronal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNumeroPatronal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNumeroPatronal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNumeroPatronal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNumeroPatronal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNumeroPatronal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNumeroPatronal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNumeroPatronal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNumeroPatronal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNumeroPatronal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNumeroPatronal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNumeroPatronal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNumeroPatronal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNumeroPatronal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNumeroPatronal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNumeroPatronal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNumeroPatronal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNumeroPatronal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNumeroPatronal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNumeroPatronal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNumeroPatronal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNumeroPatronal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNumeroPatronal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNumeroPatronal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNumeroPatronal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNumeroPatronal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNumeroPatronal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNumeroPatronal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNumeroPatronal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNumeroPatronal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNumeroPatronal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNumeroPatronal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNumeroPatronal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNumeroPatronal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNumeroPatronal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNumeroPatronal.add(this.jMenuItemCerrarNumeroPatronal);
			
			this.jmenuAccionesNumeroPatronal.add(this.jMenuItemNuevoNumeroPatronal);
			this.jmenuAccionesNumeroPatronal.add(this.jMenuItemNuevoGuardarCambiosNumeroPatronal);
			this.jmenuAccionesNumeroPatronal.add(this.jMenuItemNuevoRelacionesNumeroPatronal);
			this.jmenuAccionesNumeroPatronal.add(this.jMenuItemGuardarCambiosTablaNumeroPatronal);		
			this.jmenuAccionesNumeroPatronal.add(this.jMenuItemDuplicarNumeroPatronal);		
			this.jmenuAccionesNumeroPatronal.add(this.jMenuItemCopiarNumeroPatronal);		
			this.jmenuAccionesNumeroPatronal.add(this.jMenuItemVerFormNumeroPatronal);		
			
			this.jmenuDatosNumeroPatronal.add(this.jMenuItemRecargarInformacionNumeroPatronal);				
			this.jmenuDatosNumeroPatronal.add(this.jMenuItemAnterioresNumeroPatronal);				
			this.jmenuDatosNumeroPatronal.add(this.jMenuItemSiguientesNumeroPatronal);				
			this.jmenuDatosNumeroPatronal.add(this.jMenuItemAbrirOrderByNumeroPatronal);				
			this.jmenuDatosNumeroPatronal.add(this.jMenuItemMostrarOcultarNumeroPatronal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNumeroPatronal.add(this.jMenuItemGuardarCambiosNumeroPatronal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNumeroPatronal.add(this.jmenuArchivoNumeroPatronal);		
			this.jmenuBarNumeroPatronal.add(this.jmenuAccionesNumeroPatronal);		
			this.jmenuBarNumeroPatronal.add(this.jmenuDatosNumeroPatronal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNumeroPatronal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNumeroPatronal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCantonNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCantonNumeroPatronal.setToolTipText("Buscar Por Canton ");
		this.jButtonFK_IdCantonNumeroPatronal= new JButtonMe();
		this.jButtonFK_IdCantonNumeroPatronal.setText("Buscar");
		this.jButtonFK_IdCantonNumeroPatronal.setToolTipText("Buscar Por Canton ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCantonNumeroPatronal,"buscar_button","Buscar Por Canton ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCantonNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cantonFK_IdCantonNumeroPatronal = new JLabelMe();
		jLabelid_cantonFK_IdCantonNumeroPatronal.setText("Canton :");
		jLabelid_cantonFK_IdCantonNumeroPatronal.setToolTipText("Canton");
		jLabelid_cantonFK_IdCantonNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cantonFK_IdCantonNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cantonFK_IdCantonNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cantonFK_IdCantonNumeroPatronal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cantonFK_IdCantonNumeroPatronal= new JComboBoxMe();
		jComboBoxid_cantonFK_IdCantonNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonFK_IdCantonNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonFK_IdCantonNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cantonFK_IdCantonNumeroPatronal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdParroquiaNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdParroquiaNumeroPatronal.setToolTipText("Buscar Por Parroquia ");
		this.jButtonFK_IdParroquiaNumeroPatronal= new JButtonMe();
		this.jButtonFK_IdParroquiaNumeroPatronal.setText("Buscar");
		this.jButtonFK_IdParroquiaNumeroPatronal.setToolTipText("Buscar Por Parroquia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdParroquiaNumeroPatronal,"buscar_button","Buscar Por Parroquia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdParroquiaNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_parroquiaFK_IdParroquiaNumeroPatronal = new JLabelMe();
		jLabelid_parroquiaFK_IdParroquiaNumeroPatronal.setText("Parroquia :");
		jLabelid_parroquiaFK_IdParroquiaNumeroPatronal.setToolTipText("Parroquia");
		jLabelid_parroquiaFK_IdParroquiaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_parroquiaFK_IdParroquiaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_parroquiaFK_IdParroquiaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_parroquiaFK_IdParroquiaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal= new JComboBoxMe();
		jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProvinciaNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProvinciaNumeroPatronal.setToolTipText("Buscar Por Provincia ");
		this.jButtonFK_IdProvinciaNumeroPatronal= new JButtonMe();
		this.jButtonFK_IdProvinciaNumeroPatronal.setText("Buscar");
		this.jButtonFK_IdProvinciaNumeroPatronal.setToolTipText("Buscar Por Provincia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProvinciaNumeroPatronal,"buscar_button","Buscar Por Provincia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProvinciaNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_provinciaFK_IdProvinciaNumeroPatronal = new JLabelMe();
		jLabelid_provinciaFK_IdProvinciaNumeroPatronal.setText("Provincia :");
		jLabelid_provinciaFK_IdProvinciaNumeroPatronal.setToolTipText("Provincia");
		jLabelid_provinciaFK_IdProvinciaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaFK_IdProvinciaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal= new JComboBoxMe();
		jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasNumeroPatronal=new JTabbedPane();


		this.jTabbedPaneBusquedasNumeroPatronal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNumeroPatronal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNumeroPatronal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNumeroPatronal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNumeroPatronal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNumeroPatronal = new NumeroPatronalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Numero Patronal DATOS");
			this.jInternalFrameDetalleFormNumeroPatronal = new NumeroPatronalDetalleFormJInternalFrame(jDesktopPane,this.numeropatronalSessionBean.getConGuardarRelaciones(),this.numeropatronalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNumeroPatronal = null;//new NumeroPatronalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNumeroPatronal= new GridBagLayout();
		
		
		this.jTableDatosNumeroPatronal = new JTableMe();      
		
		String sToolTipNumeroPatronal="";
		sToolTipNumeroPatronal=NumeroPatronalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNumeroPatronal+="(Nomina.NumeroPatronal)";
		}
		
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			sToolTipNumeroPatronal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNumeroPatronal.setToolTipText(sToolTipNumeroPatronal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNumeroPatronal);
		this.jTableDatosNumeroPatronal.setAutoCreateRowSorter(true);
		this.jTableDatosNumeroPatronal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNumeroPatronal.setRowSelectionAllowed(true);
		this.jTableDatosNumeroPatronal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNumeroPatronal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNumeroPatronal = new JButtonMe();
		this.jButtonDuplicarNumeroPatronal = new JButtonMe();
		this.jButtonCopiarNumeroPatronal = new JButtonMe();
		this.jButtonVerFormNumeroPatronal = new JButtonMe();
		this.jButtonNuevoRelacionesNumeroPatronal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNumeroPatronal = new JButtonMe();
		this.jButtonCerrarNumeroPatronal = new JButtonMe();
		
		this.jScrollPanelDatosNumeroPatronal = new JScrollPane();   
        this.jScrollPanelDatosGeneralNumeroPatronal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Numero Patronal";
		
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Patronales" + this.sPath));
		} else {
			this.jScrollPanelDatosNumeroPatronal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNumeroPatronal.setToolTipText("Acciones");
        this.jPanelAccionesNumeroPatronal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNumeroPatronal=new ReporteDinamicoJInternalFrame(NumeroPatronalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNumeroPatronal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNumeroPatronal=new ImportacionJInternalFrame(NumeroPatronalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNumeroPatronal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNumeroPatronal = new JButtonMe();
		
		this.jButtonAbrirOrderByNumeroPatronal.setText("Orden");
		this.jButtonAbrirOrderByNumeroPatronal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNumeroPatronal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNumeroPatronal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNumeroPatronal,false,this);
			
			//this.cargarOrderByNumeroPatronal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNumeroPatronal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNumeroPatronal,true,this);
			
			//this.cargarOrderByNumeroPatronal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNumeroPatronal.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosNumeroPatronal.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosNumeroPatronal.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosNumeroPatronal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNumeroPatronal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNumeroPatronal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNumeroPatronal.setText("Nuevo");
		this.jButtonDuplicarNumeroPatronal.setText("Duplicar");
		this.jButtonCopiarNumeroPatronal.setText("Copiar");
		this.jButtonVerFormNumeroPatronal.setText("Ver");
		this.jButtonNuevoRelacionesNumeroPatronal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNumeroPatronal.setText("Guardar");
		this.jButtonCerrarNumeroPatronal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNumeroPatronal,"nuevo_button","Nuevo",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNumeroPatronal,"duplicar_button","Duplicar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNumeroPatronal,"copiar_button","Copiar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNumeroPatronal,"ver_form","Ver",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNumeroPatronal,"nuevorelaciones_button","Nuevo Rel",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNumeroPatronal,"guardarcambiostabla_button","Guardar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNumeroPatronal,"cerrar_button","Salir",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNumeroPatronal.setToolTipText("Nuevo"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNumeroPatronal.setToolTipText("Duplicar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNumeroPatronal.setToolTipText("Copiar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNumeroPatronal.setToolTipText("Ver"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNumeroPatronal.setToolTipText("Nuevo Rel"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNumeroPatronal.setToolTipText("Guardar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNumeroPatronal.setToolTipText("Salir"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNumeroPatronal";
		inputMap = this.jButtonNuevoNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNumeroPatronal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNumeroPatronal"));
		
		//DUPLICAR
		sMapKey = "DuplicarNumeroPatronal";
		inputMap = this.jButtonDuplicarNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNumeroPatronal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNumeroPatronal"));
		
		//COPIAR
		sMapKey = "CopiarNumeroPatronal";
		inputMap = this.jButtonCopiarNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNumeroPatronal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNumeroPatronal"));
		
		//VEr FORM
		sMapKey = "VerFormNumeroPatronal";
		inputMap = this.jButtonVerFormNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNumeroPatronal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNumeroPatronal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNumeroPatronal";
		inputMap = this.jButtonNuevoRelacionesNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNumeroPatronal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNumeroPatronal";
		inputMap = this.jButtonModificarNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNumeroPatronal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNumeroPatronal";
		inputMap = this.jButtonCerrarNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNumeroPatronal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNumeroPatronal";
		inputMap = this.jButtonGuardarCambiosTablaNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNumeroPatronal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NumeroPatronal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NumeroPatronal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NumeroPatronal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NumeroPatronal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NumeroPatronal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNumeroPatronal.setName("jPanelParametrosReportesNumeroPatronal"); 
		
		this.jPanelParametrosReportesAccionesNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNumeroPatronal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNumeroPatronal.setName("jPanelParametrosReportesAccionesNumeroPatronal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNumeroPatronal = new JButtonMe();
		this.jButtonRecargarInformacionNumeroPatronal.setText("Recargar");
		this.jButtonRecargarInformacionNumeroPatronal.setToolTipText("Recargar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNumeroPatronal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNumeroPatronal = new JButtonMe();
		this.jButtonProcesarInformacionNumeroPatronal.setText("Procesar");
		this.jButtonProcesarInformacionNumeroPatronal.setToolTipText("Procesar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNumeroPatronal.setVisible(false);
			
		this.jButtonProcesarInformacionNumeroPatronal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNumeroPatronal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNumeroPatronal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNumeroPatronal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNumeroPatronal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNumeroPatronal.setText("TIPO");       
		this.jComboBoxTiposReportesNumeroPatronal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNumeroPatronal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNumeroPatronal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNumeroPatronal.setText("Paginacion");
		this.jComboBoxTiposPaginacionNumeroPatronal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNumeroPatronal.setText("Accion");
		this.jComboBoxTiposRelacionesNumeroPatronal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNumeroPatronal.setText("Accion");
		this.jComboBoxTiposAccionesNumeroPatronal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNumeroPatronal.setText("Accion");
		this.jComboBoxTiposSeleccionarNumeroPatronal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNumeroPatronal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNumeroPatronal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNumeroPatronal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNumeroPatronal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNumeroPatronal = new JLabelMe();
		
		this.jLabelAccionesNumeroPatronal.setText("Acciones");		
		this.jLabelAccionesNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNumeroPatronal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNumeroPatronal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNumeroPatronal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNumeroPatronal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNumeroPatronal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNumeroPatronal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNumeroPatronal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNumeroPatronal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNumeroPatronal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNumeroPatronal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNumeroPatronal.setText("Graf.");
		this.jCheckBoxConGraficoReporteNumeroPatronal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNumeroPatronal = new JButtonMe();
		//this.jButtonAnterioresNumeroPatronal.setText("<<");
        this.jButtonAnterioresNumeroPatronal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNumeroPatronal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNumeroPatronal = new JButtonMe();
		//this.jButtonSiguientesNumeroPatronal.setText(">>");
        this.jButtonSiguientesNumeroPatronal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNumeroPatronal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNumeroPatronal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNumeroPatronal.setText("Nue");
        this.jButtonNuevoGuardarCambiosNumeroPatronal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNumeroPatronal,"nuevoguardarcambios_button","Nue",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNumeroPatronal";
		inputMap = this.jButtonNuevoGuardarCambiosNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNumeroPatronal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNumeroPatronal";
		inputMap = this.jButtonRecargarInformacionNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNumeroPatronal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNumeroPatronal";
		inputMap = this.jButtonSiguientesNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNumeroPatronal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNumeroPatronal";
		inputMap = this.jButtonAnterioresNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNumeroPatronal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNumeroPatronal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNumeroPatronal.setMinimumSize(new Dimension(this.getWidth(),NumeroPatronalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NumeroPatronalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNumeroPatronal.setMaximumSize(new Dimension(this.getWidth(),NumeroPatronalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NumeroPatronalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNumeroPatronal.setPreferredSize(new Dimension(this.getWidth(),NumeroPatronalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NumeroPatronalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNumeroPatronal = new GridBagLayout();

			this.jPanelPaginacionNumeroPatronal.setLayout(gridaBagLayoutPaginacionNumeroPatronal);						
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = 0;
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNumeroPatronal.add(this.jButtonAnterioresNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
					
						
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNumeroPatronal.gridy = 0;
			
			this.jPanelPaginacionNumeroPatronal.add(this.jButtonNuevoGuardarCambiosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
						
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNumeroPatronal.gridy = 0;
			this.jPanelPaginacionNumeroPatronal.add(this.jButtonSiguientesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = 1;
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNumeroPatronal.add(this.jButtonNuevoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
				this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNumeroPatronal.gridy = 1;
				this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionNumeroPatronal.add(this.jButtonNuevoRelacionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			}
			
			
			if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
				this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNumeroPatronal.gridy = 1;
				this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNumeroPatronal.add(this.jButtonGuardarCambiosTablaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			}
			
			
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = 1;
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNumeroPatronal.add(this.jButtonDuplicarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = 1;
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNumeroPatronal.add(this.jButtonCopiarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = 1;
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNumeroPatronal.add(this.jButtonVerFormNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = 1;
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNumeroPatronal.add(this.jButtonCerrarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
		
		
		this.jButtonRecargarInformacionNumeroPatronal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNumeroPatronal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNumeroPatronal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNumeroPatronal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNumeroPatronal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNumeroPatronal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNumeroPatronal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNumeroPatronal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNumeroPatronal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNumeroPatronal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNumeroPatronal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNumeroPatronal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNumeroPatronal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNumeroPatronal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNumeroPatronal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNumeroPatronal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNumeroPatronal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNumeroPatronal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNumeroPatronal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNumeroPatronal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNumeroPatronal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNumeroPatronal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNumeroPatronal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNumeroPatronal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNumeroPatronal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNumeroPatronal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNumeroPatronal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNumeroPatronal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNumeroPatronal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNumeroPatronal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNumeroPatronal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNumeroPatronal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNumeroPatronal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNumeroPatronal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNumeroPatronal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNumeroPatronal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNumeroPatronal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNumeroPatronal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NumeroPatronal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NumeroPatronal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NumeroPatronal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NumeroPatronal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNumeroPatronal.setLayout(gridaBagParametrosReportesNumeroPatronal);
			this.jPanelParametrosReportesAccionesNumeroPatronal.setLayout(gridaBagParametrosReportesAccionesNumeroPatronal);
			
			
			this.jPanelParametrosAuxiliar1NumeroPatronal.setLayout(gridaBagParametrosAuxiliar1NumeroPatronal);
			this.jPanelParametrosAuxiliar2NumeroPatronal.setLayout(gridaBagParametrosAuxiliar2NumeroPatronal);
			this.jPanelParametrosAuxiliar3NumeroPatronal.setLayout(gridaBagParametrosAuxiliar3NumeroPatronal);
			this.jPanelParametrosAuxiliar4NumeroPatronal.setLayout(gridaBagParametrosAuxiliar4NumeroPatronal);
			//this.jPanelParametrosAuxiliar5NumeroPatronal.setLayout(gridaBagParametrosAuxiliar2NumeroPatronal);			
			
			
			
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroPatronal.add(this.jButtonRecargarInformacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NumeroPatronal.add(this.jComboBoxTiposPaginacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NumeroPatronal.add(this.jCheckBoxConAltoMaximoTablaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NumeroPatronal.add(this.jComboBoxTiposArchivosReportesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroPatronal.add(this.jPanelParametrosAuxiliar1NumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNumeroPatronal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NumeroPatronal.add(this.jComboBoxTiposReportesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroPatronal.add(this.jPanelParametrosAuxiliar4NumeroPatronal, this.gridBagConstraintsNumeroPatronal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroPatronal.add(this.jComboBoxTiposReportesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNumeroPatronal.add(this.jCheckBoxGenerarReporteNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroPatronal.add(this.jPanelParametrosAuxiliar2NumeroPatronal, this.gridBagConstraintsNumeroPatronal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNumeroPatronal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNumeroPatronal.add(this.jLabelAccionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
				this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNumeroPatronal.add(this.jButtonAbrirOrderByNumeroPatronal, this.gridBagConstraintsNumeroPatronal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroPatronal.add(this.jComboBoxTiposSeleccionarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
			
			
			/*
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNumeroPatronal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNumeroPatronal.add(this.jCheckBoxSeleccionarTodosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNumeroPatronal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NumeroPatronal.add(this.jCheckBoxSeleccionarTodosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);															
				
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNumeroPatronal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NumeroPatronal.add(this.jCheckBoxSeleccionadosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNumeroPatronal.add(this.jPanelParametrosAuxiliar3NumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroPatronal.add(this.jComboBoxTiposRelacionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
				
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroPatronal.add(this.jComboBoxTiposAccionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
	
				
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNumeroPatronal.add(this.jTextFieldValorCampoGeneralNumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNumeroPatronal = new GridBagLayout();

			this.jScrollPanelDatosNumeroPatronal.setLayout(gridaBagLayoutDatosNumeroPatronal);
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = 0;
			this.gridBagConstraintsNumeroPatronal.gridx = 0;
			
			this.jScrollPanelDatosNumeroPatronal.add(this.jTableDatosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNumeroPatronal.setViewportView(this.jTableDatosNumeroPatronal);
		this.jTableDatosNumeroPatronal.setFillsViewportHeight(true);
		this.jTableDatosNumeroPatronal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNumeroPatronal= new GridBagLayout();
		this.jPanelAccionesNumeroPatronal.setLayout(gridaBagLayoutAccionesNumeroPatronal);
		
		
		/*	
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 0;
			
		this.jPanelAccionesNumeroPatronal.add(this.jButtonNuevoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCantonNumeroPatronal= new GridBagLayout();
		gridaBagLayoutFK_IdCantonNumeroPatronal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCantonNumeroPatronal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCantonNumeroPatronal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCantonNumeroPatronal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCantonNumeroPatronal.setLayout(gridaBagLayoutFK_IdCantonNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 0;
		gridBagConstraintsNumeroPatronal.gridx = 0;
		jPanelFK_IdCantonNumeroPatronal.add(jLabelid_cantonFK_IdCantonNumeroPatronal, gridBagConstraintsNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 0;
		gridBagConstraintsNumeroPatronal.gridx = 1;
		jPanelFK_IdCantonNumeroPatronal.add(jComboBoxid_cantonFK_IdCantonNumeroPatronal, gridBagConstraintsNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 1;
		gridBagConstraintsNumeroPatronal.gridx =1;
		jPanelFK_IdCantonNumeroPatronal.add(jButtonFK_IdCantonNumeroPatronal, gridBagConstraintsNumeroPatronal);

		jTabbedPaneBusquedasNumeroPatronal.addTab("1.-Por Canton ", jPanelFK_IdCantonNumeroPatronal);
		jTabbedPaneBusquedasNumeroPatronal.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdParroquiaNumeroPatronal= new GridBagLayout();
		gridaBagLayoutFK_IdParroquiaNumeroPatronal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdParroquiaNumeroPatronal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdParroquiaNumeroPatronal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdParroquiaNumeroPatronal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdParroquiaNumeroPatronal.setLayout(gridaBagLayoutFK_IdParroquiaNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 0;
		gridBagConstraintsNumeroPatronal.gridx = 0;
		jPanelFK_IdParroquiaNumeroPatronal.add(jLabelid_parroquiaFK_IdParroquiaNumeroPatronal, gridBagConstraintsNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 0;
		gridBagConstraintsNumeroPatronal.gridx = 1;
		jPanelFK_IdParroquiaNumeroPatronal.add(jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal, gridBagConstraintsNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 1;
		gridBagConstraintsNumeroPatronal.gridx =1;
		jPanelFK_IdParroquiaNumeroPatronal.add(jButtonFK_IdParroquiaNumeroPatronal, gridBagConstraintsNumeroPatronal);

		jTabbedPaneBusquedasNumeroPatronal.addTab("2.-Por Parroquia ", jPanelFK_IdParroquiaNumeroPatronal);
		jTabbedPaneBusquedasNumeroPatronal.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProvinciaNumeroPatronal= new GridBagLayout();
		gridaBagLayoutFK_IdProvinciaNumeroPatronal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProvinciaNumeroPatronal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProvinciaNumeroPatronal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProvinciaNumeroPatronal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProvinciaNumeroPatronal.setLayout(gridaBagLayoutFK_IdProvinciaNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 0;
		gridBagConstraintsNumeroPatronal.gridx = 0;
		jPanelFK_IdProvinciaNumeroPatronal.add(jLabelid_provinciaFK_IdProvinciaNumeroPatronal, gridBagConstraintsNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 0;
		gridBagConstraintsNumeroPatronal.gridx = 1;
		jPanelFK_IdProvinciaNumeroPatronal.add(jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal, gridBagConstraintsNumeroPatronal);

		gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNumeroPatronal.gridy = 1;
		gridBagConstraintsNumeroPatronal.gridx =1;
		jPanelFK_IdProvinciaNumeroPatronal.add(jButtonFK_IdProvinciaNumeroPatronal, gridBagConstraintsNumeroPatronal);

		jTabbedPaneBusquedasNumeroPatronal.addTab("3.-Por Provincia ", jPanelFK_IdProvinciaNumeroPatronal);
		jTabbedPaneBusquedasNumeroPatronal.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNumeroPatronal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNumeroPatronal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();						
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNumeroPatronal.gridx = 0;		
			//this.gridBagConstraintsNumeroPatronal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNumeroPatronal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNumeroPatronal.gridx = 0;		
		//this.gridBagConstraintsNumeroPatronal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNumeroPatronal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNumeroPatronal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNumeroPatronal.gridx = 0;		
			this.gridBagConstraintsNumeroPatronal.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNumeroPatronal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNumeroPatronal, this.gridBagConstraintsNumeroPatronal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);								
		
		
		/*
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		*/		
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNumeroPatronal.gridx =0;
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNumeroPatronal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
				
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNumeroPatronal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNumeroPatronal = new GridBagLayout();
			this.jPanelBusquedasParametrosNumeroPatronal.setLayout(gridaBagLayoutBusquedasParametrosNumeroPatronal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNumeroPatronal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNumeroPatronal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNumeroPatronal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNumeroPatronal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			
			
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
			
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNumeroPatronal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNumeroPatronal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNumeroPatronal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNumeroPatronal.setName("jPanelReporteDinamicoNumeroPatronal"); 
		
		this.jPanelReporteDinamicoNumeroPatronal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNumeroPatronal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNumeroPatronal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNumeroPatronal.setLayout(gridaBagLayoutReporteDinamicoNumeroPatronal);
		
		
		this.jInternalFrameReporteDinamicoNumeroPatronal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNumeroPatronal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNumeroPatronal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNumeroPatronal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNumeroPatronal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNumeroPatronal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNumeroPatronal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNumeroPatronal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNumeroPatronal.setResizable(true);
	    this.jInternalFrameReporteDinamicoNumeroPatronal.setClosable(true);
	    this.jInternalFrameReporteDinamicoNumeroPatronal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNumeroPatronal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNumeroPatronal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNumeroPatronal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Patronales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNumeroPatronal = new JLabelMe();

		this.jLabelColumnasSelectReporteNumeroPatronal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jLabelColumnasSelectReporteNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNumeroPatronal = new JList<Reporte>();
		this.jListColumnasSelectReporteNumeroPatronal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNumeroPatronal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNumeroPatronal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNumeroPatronal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNumeroPatronal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNumeroPatronal=new JScrollPane(this.jListColumnasSelectReporteNumeroPatronal);
			
			this.jScrollColumnasSelectReporteNumeroPatronal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNumeroPatronal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNumeroPatronal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNumeroPatronal.add(this.jListColumnasSelectReporteNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jScrollColumnasSelectReporteNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNumeroPatronal = new JLabelMe();

		this.jLabelRelacionesSelectReporteNumeroPatronal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jLabelRelacionesSelectReporteNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNumeroPatronal = new JList<Reporte>();
		this.jListRelacionesSelectReporteNumeroPatronal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNumeroPatronal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNumeroPatronal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNumeroPatronal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNumeroPatronal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNumeroPatronal=new JScrollPane(this.jListRelacionesSelectReporteNumeroPatronal);
			
			this.jScrollRelacionesSelectReporteNumeroPatronal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNumeroPatronal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNumeroPatronal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNumeroPatronal.add(this.jListRelacionesSelectReporteNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jScrollRelacionesSelectReporteNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoNumeroPatronal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNumeroPatronal = new JComboBoxMe();
		this.jListColumnasValoresGraficoNumeroPatronal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNumeroPatronal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNumeroPatronal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNumeroPatronal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNumeroPatronal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNumeroPatronal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNumeroPatronal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNumeroPatronal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNumeroPatronal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNumeroPatronal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNumeroPatronal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNumeroPatronal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNumeroPatronal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jLabelGenerarExcelReporteDinamicoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNumeroPatronal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNumeroPatronal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNumeroPatronal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNumeroPatronal.setToolTipText("Generar EXCEL"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNumeroPatronal.add(this.jButtonGenerarExcelReporteDinamicoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jComboBoxTiposReportesDinamicoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNumeroPatronal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNumeroPatronal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jLabelTiposArchivoReporteDinamicoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jComboBoxTiposArchivosReportesDinamicoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNumeroPatronal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNumeroPatronal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNumeroPatronal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNumeroPatronal.setToolTipText("Generar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jButtonGenerarReporteDinamicoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNumeroPatronal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNumeroPatronal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNumeroPatronal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNumeroPatronal.setToolTipText("Cancelar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNumeroPatronal.add(this.jButtonCerrarReporteDinamicoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNumeroPatronal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNumeroPatronal= new JScrollPane(jPanelReporteDinamicoNumeroPatronal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNumeroPatronal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNumeroPatronal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNumeroPatronal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Patronales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNumeroPatronal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNumeroPatronal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNumeroPatronal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNumeroPatronal);
		this.jInternalFrameReporteDinamicoNumeroPatronal.getContentPane().add(this.jScrollPanelReporteDinamicoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNumeroPatronal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNumeroPatronal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNumeroPatronal.setName("jPanelImportacionNumeroPatronal"); 
		
		this.jPanelImportacionNumeroPatronal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNumeroPatronal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNumeroPatronal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNumeroPatronal.setLayout(gridaBagLayoutImportacionNumeroPatronal);
		
		
		this.jInternalFrameImportacionNumeroPatronal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNumeroPatronal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNumeroPatronal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNumeroPatronal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNumeroPatronal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNumeroPatronal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNumeroPatronal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNumeroPatronal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNumeroPatronal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNumeroPatronal.setResizable(true);
	    this.jInternalFrameImportacionNumeroPatronal.setClosable(true);
	    this.jInternalFrameImportacionNumeroPatronal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNumeroPatronal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNumeroPatronal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNumeroPatronal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNumeroPatronal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNumeroPatronal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNumeroPatronal.setResizable(true);
	    this.jInternalFrameImportacionNumeroPatronal.setClosable(true);
	    this.jInternalFrameImportacionNumeroPatronal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNumeroPatronal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNumeroPatronal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNumeroPatronal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Patronales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNumeroPatronal = new JLabelMe();

		this.jLabelArchivoImportacionNumeroPatronal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYImportacion;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNumeroPatronal.add(this.jLabelArchivoImportacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNumeroPatronal = new JFileChooser();		
		this.jFileChooserImportacionNumeroPatronal.setToolTipText("ESCOGER ARCHIVO"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNumeroPatronal = new JButtonMe();
		this.jButtonAbrirImportacionNumeroPatronal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNumeroPatronal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNumeroPatronal.setToolTipText("Generar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYImportacion;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNumeroPatronal.add(this.jButtonAbrirImportacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNumeroPatronal = new JLabelMe();

		this.jLabelPathArchivoImportacionNumeroPatronal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYImportacion;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNumeroPatronal.add(this.jLabelPathArchivoImportacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNumeroPatronal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNumeroPatronal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNumeroPatronal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNumeroPatronal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYImportacion;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNumeroPatronal.add(this.jTextFieldPathArchivoImportacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNumeroPatronal = new JButtonMe();
		this.jButtonGenerarImportacionNumeroPatronal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNumeroPatronal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNumeroPatronal.setToolTipText("Generar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYImportacion;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNumeroPatronal.add(this.jButtonGenerarImportacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNumeroPatronal = new JButtonMe();
		this.jButtonCerrarImportacionNumeroPatronal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNumeroPatronal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNumeroPatronal.setToolTipText("Cancelar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = iPosYImportacion;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNumeroPatronal.add(this.jButtonCerrarImportacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNumeroPatronal = new GridBagLayout();
		
		this.jScrollPanelImportacionNumeroPatronal= new JScrollPane(jPanelImportacionNumeroPatronal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy =iPosYImportacion;
		this.gridBagConstraintsNumeroPatronal.gridx =iPosXImportacion;
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNumeroPatronal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNumeroPatronal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNumeroPatronal);
		this.jInternalFrameImportacionNumeroPatronal.getContentPane().add(this.jScrollPanelImportacionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNumeroPatronal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNumeroPatronal = new JButtonMe();
			this.jButtonAbrirOrderByNumeroPatronal.setText("Orden");
			this.jButtonAbrirOrderByNumeroPatronal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNumeroPatronal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNumeroPatronal";
			inputMap = this.jButtonAbrirOrderByNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNumeroPatronal"));
		
		
			GridBagLayout gridaBagLayoutOrderByNumeroPatronal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNumeroPatronal.setName("jPanelOrderByNumeroPatronal"); 
			
			this.jPanelOrderByNumeroPatronal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNumeroPatronal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNumeroPatronal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNumeroPatronal.setLayout(gridaBagLayoutOrderByNumeroPatronal);
			
			
			this.jTableDatosNumeroPatronalOrderBy = new JTableMe();        
			this.jTableDatosNumeroPatronalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNumeroPatronalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNumeroPatronalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNumeroPatronalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNumeroPatronalOrderBy.setViewportView(this.jTableDatosNumeroPatronalOrderBy);
			this.jTableDatosNumeroPatronalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNumeroPatronalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNumeroPatronal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNumeroPatronal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNumeroPatronal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNumeroPatronal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNumeroPatronal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNumeroPatronal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNumeroPatronal.setTitle("Orden");
			this.jInternalFrameOrderByNumeroPatronal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNumeroPatronal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNumeroPatronal.setResizable(true);
			this.jInternalFrameOrderByNumeroPatronal.setClosable(true);
			this.jInternalFrameOrderByNumeroPatronal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNumeroPatronal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNumeroPatronal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNumeroPatronal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Patronales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNumeroPatronal.gridx =iPosXOrderBy;
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNumeroPatronal.ipady =150;
				
			this.jPanelOrderByNumeroPatronal.add(jScrollPanelDatosNumeroPatronalOrderBy, this.gridBagConstraintsNumeroPatronal);//this.jTableDatosNumeroPatronalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNumeroPatronal = new JButtonMe();
			this.jButtonCerrarOrderByNumeroPatronal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNumeroPatronal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNumeroPatronal.setToolTipText("Cancelar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNumeroPatronal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNumeroPatronal.add(this.jButtonCerrarOrderByNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNumeroPatronal = new GridBagLayout();
			
			this.jScrollPanelOrderByNumeroPatronal= new JScrollPane(jPanelOrderByNumeroPatronal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy =iPosYOrderBy;
			this.gridBagConstraintsNumeroPatronal.gridx =iPosXOrderBy;
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNumeroPatronal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNumeroPatronal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNumeroPatronal);
			
			this.jInternalFrameOrderByNumeroPatronal.getContentPane().add(this.jScrollPanelOrderByNumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
		
		} else {
			this.jButtonAbrirOrderByNumeroPatronal = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.numeropatronalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNumeroPatronal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNumeroPatronal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNumeroPatronal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNumeroPatronal.getRowHeight();//NumeroPatronalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NumeroPatronalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNumeroPatronal.isSelected()) {
					iHeightTable=NumeroPatronalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NumeroPatronalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NumeroPatronalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NumeroPatronalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNumeroPatronal.isSelected()) {
					iHeightTable=NumeroPatronalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NumeroPatronalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NumeroPatronalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNumeroPatronal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNumeroPatronal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNumeroPatronal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNumeroPatronal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNumeroPatronal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNumeroPatronal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNumeroPatronal!=null && this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy()!=null) {
			//if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNumeroPatronal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNumeroPatronal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNumeroPatronal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNumeroPatronal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNumeroPatronal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNumeroPatronal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=numeropatronalLogic.getNumeroPatronals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=numeropatronals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NumeroPatronal> TraerNumeroPatronalBeans(List<NumeroPatronal> numeropatronals,ArrayList<Classe> classes)throws Exception {
		try {
			for(NumeroPatronal numeropatronal:numeropatronals) {
					
				if(!(NumeroPatronalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NumeroPatronalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					numeropatronal.setsDetalleGeneralEntityReporte(NumeroPatronalConstantesFunciones.getNumeroPatronalDescripcion(numeropatronal));
										
						
					
					

					if(numeropatronal.getDatoGeneralEmpleados()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {
						try{numeropatronal.setdatogeneralempleadosDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(numeropatronal.getDatoGeneralEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(numeropatronal.getEstructuras()!=null && Funciones.existeClass(classes,Estructura.class)) {
						try{numeropatronal.setestructurasDescripcionReporte(new JRBeanCollectionDataSource(EstructuraJInternalFrame.TraerEstructuraBeans(numeropatronal.getEstructuras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(numeropatronal.getCargos()!=null && Funciones.existeClass(classes,Cargo.class)) {
						try{numeropatronal.setcargosDescripcionReporte(new JRBeanCollectionDataSource(CargoJInternalFrame.TraerCargoBeans(numeropatronal.getCargos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//numeropatronal.setsDetalleGeneralEntityReporte(numeropatronal.getsDetalleGeneralEntityReporte());
										
				}
				
				//numeropatronalbeans.add(numeropatronalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return numeropatronals;
    }
	//PARA REPORTES FIN
}
