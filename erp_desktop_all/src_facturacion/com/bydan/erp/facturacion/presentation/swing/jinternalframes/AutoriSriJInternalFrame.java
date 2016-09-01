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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.AutoriSriConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class AutoriSriJInternalFrame extends AutoriSriBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAutoriSri;
	
	protected JMenuBar jmenuBarAutoriSri;
	
	protected JMenu jmenuAutoriSri;
	protected JMenu jmenuDatosAutoriSri;
	protected JMenu jmenuArchivoAutoriSri;
	protected JMenu jmenuAccionesAutoriSri;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriSri;	
	protected GridBagConstraints gridBagConstraintsAutoriSri;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AutoriSriDetalleFormJInternalFrame jInternalFrameDetalleFormAutoriSri;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAutoriSri;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAutoriSri;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentogeneral="";
	
	public AutoriSriSessionBean autorisriSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AutoriSri> autorisris;		
	public List<AutoriSri> autorisrisEliminados;	
	public List<AutoriSri> autorisrisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAutoriSri;		
	protected JButton jButtonAbrirOrderByAutoriSri;
	
	
	//protected JPanel jPanelOrderByAutoriSri;
	//public JScrollPane jScrollPanelOrderByAutoriSri;	
	//protected JButton jButtonCerrarOrderByAutoriSri;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AutoriSriLogic autorisriLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAutoriSri;
	public JScrollPane jScrollPanelDatosEdicionAutoriSri;
	public JScrollPane jScrollPanelDatosGeneralAutoriSri;
    
	
	
	//public JScrollPane jScrollPanelDatosAutoriSriOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAutoriSri;
	//public JScrollPane jScrollPanelImportacionAutoriSri;
	
	
	
	protected JPanel jPanelAccionesAutoriSri;
	
    protected JPanel jPanelPaginacionAutoriSri;
    protected JPanel jPanelParametrosReportesAutoriSri;
	protected JPanel jPanelParametrosReportesAccionesAutoriSri;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AutoriSri;
	protected JPanel jPanelParametrosAuxiliar2AutoriSri;
	protected JPanel jPanelParametrosAuxiliar3AutoriSri;
	protected JPanel jPanelParametrosAuxiliar4AutoriSri;
	//protected JPanel jPanelParametrosAuxiliar5AutoriSri;
	
	
	
	//protected JPanel jPanelReporteDinamicoAutoriSri;
	//protected JPanel jPanelImportacionAutoriSri;
	
	
	public JTable jTableDatosAutoriSri;
	
	
	
	//public JTable jTableDatosAutoriSriOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAutoriSri;
	protected JButton jButtonDuplicarAutoriSri;
	protected JButton jButtonCopiarAutoriSri;
	protected JButton jButtonVerFormAutoriSri;
	protected JButton jButtonNuevoRelacionesAutoriSri;
	protected JButton jButtonModificarAutoriSri;
	
    protected JButton jButtonGuardarCambiosTablaAutoriSri;
	protected JButton jButtonCerrarAutoriSri;
	
	
	protected JButton jButtonRecargarInformacionAutoriSri;
	protected JButton jButtonProcesarInformacionAutoriSri;
	
	
	protected JButton jButtonAnterioresAutoriSri;
	protected JButton jButtonSiguientesAutoriSri;
	protected JButton jButtonNuevoGuardarCambiosAutoriSri;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAutoriSri;
	//protected JButton jButtonCerrarReporteDinamicoAutoriSri;
	//protected JButton jButtonGenerarExcelReporteDinamicoAutoriSri;	
	
	
	
	//protected JButton jButtonAbrirImportacionAutoriSri;
	//protected JButton jButtonGenerarImportacionAutoriSri;
	//protected JButton jButtonCerrarImportacionAutoriSri;
	//protected JFileChooser jFileChooserImportacionAutoriSri;
	//protected File fileImportacionAutoriSri;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriSri;
	protected JButton jButtonDuplicarToolBarAutoriSri;
	protected JButton jButtonNuevoRelacionesToolBarAutoriSri;
	
	
	public JButton jButtonGuardarCambiosToolBarAutoriSri;
	protected JButton jButtonCopiarToolBarAutoriSri;
	protected JButton jButtonVerFormToolBarAutoriSri;
	public JButton jButtonGuardarCambiosTablaToolBarAutoriSri;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriSri;
	protected JButton jButtonCerrarToolBarAutoriSri;
	
	protected JButton jButtonRecargarInformacionToolBarAutoriSri;
	protected JButton jButtonProcesarInformacionToolBarAutoriSri;
	protected JButton jButtonAnterioresToolBarAutoriSri;
	protected JButton jButtonSiguientesToolBarAutoriSri;
	protected JButton jButtonNuevoGuardarCambiosToolBarAutoriSri;
	protected JButton jButtonAbrirOrderByToolBarAutoriSri;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriSri;
	protected JMenuItem jMenuItemDuplicarAutoriSri;
	protected JMenuItem jMenuItemNuevoRelacionesAutoriSri;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAutoriSri;
	protected JMenuItem jMenuItemCopiarAutoriSri;
	protected JMenuItem jMenuItemVerFormAutoriSri;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriSri;
	protected JMenuItem jMenuItemCerrarAutoriSri;
	protected JMenuItem jMenuItemDetalleCerrarAutoriSri;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAutoriSri;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriSri;
	
	protected JMenuItem jMenuItemRecargarInformacionAutoriSri;
	protected JMenuItem jMenuItemProcesarInformacionAutoriSri;
	protected JMenuItem jMenuItemAnterioresAutoriSri;
	protected JMenuItem jMenuItemSiguientesAutoriSri;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriSri;
	protected JMenuItem jMenuItemAbrirOrderByAutoriSri;
	protected JMenuItem jMenuItemMostrarOcultarAutoriSri;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriSri;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAutoriSri;
	protected JCheckBox jCheckBoxSeleccionadosAutoriSri;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAutoriSri;
	protected JCheckBox jCheckBoxConGraficoReporteAutoriSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAutoriSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAutoriSri;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriSri;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAutoriSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAutoriSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAutoriSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAutoriSri;
	protected JTextField jTextFieldValorCampoGeneralAutoriSri;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAutoriSri;
	//public JList<Reporte> jListColumnasSelectReporteAutoriSri;
	//public JScrollPane jScrollColumnasSelectReporteAutoriSri;
	
	//public JLabel jLabelRelacionesSelectReporteAutoriSri;
	//public JList<Reporte> jListRelacionesSelectReporteAutoriSri;
	//public JScrollPane jScrollRelacionesSelectReporteAutoriSri;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAutoriSri;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAutoriSri;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAutoriSri;
	//public JLabel jLabelTiposArchivoReporteDinamicoAutoriSri;
	
		
	//public JLabel jLabelArchivoImportacionAutoriSri;	
	//public JLabel jLabelPathArchivoImportacionAutoriSri;
	//protected JTextField jTextFieldPathArchivoImportacionAutoriSri;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAutoriSri;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAutoriSri;
	
	//public JLabel jLabelColumnaCategoriaValorAutoriSri;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAutoriSri;
	
	//public JLabel jLabelColumnasValoresGraficoAutoriSri;
	//public JList<Reporte> jListColumnasValoresGraficoAutoriSri;
	//public JScrollPane jScrollColumnasValoresGraficoAutoriSri;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAutoriSri;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAutoriSri;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAutoriSri;
	public JPanel jPanelBusquedaPorFechaFinAutoriSri;
	public JButton jButtonBusquedaPorFechaFinAutoriSri;
	public JPanel jPanelBusquedaPorFechaInicioAutoriSri;
	public JButton jButtonBusquedaPorFechaInicioAutoriSri;
	public JPanel jPanelBusquedaPorNumeroAutorAutoriSri;
	public JButton jButtonBusquedaPorNumeroAutorAutoriSri;
	public JPanel jPanelBusquedaPorNumeroSecuencialAutoriSri;
	public JButton jButtonBusquedaPorNumeroSecuencialAutoriSri;
	public JPanel jPanelFK_IdTipoDocumentoGeneralAutoriSri;
	public JButton jButtonFK_IdTipoDocumentoGeneralAutoriSri;
	
	public JPanel jPanelfecha_finBusquedaPorFechaFinAutoriSri;
	public JLabel jLabelfecha_finBusquedaPorFechaFinAutoriSri;
	//public JFormattedTextField jDateChooserfecha_finBusquedaPorFechaFinAutoriSri;

	public JDateChooser jDateChooserfecha_finBusquedaPorFechaFinAutoriSri;
	public JButton jButtonfecha_finBusquedaPorFechaFinAutoriSriBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaPorFechaInicioAutoriSri;
	public JLabel jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri;

	public JDateChooser jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri;
	public JButton jButtonfecha_inicioBusquedaPorFechaInicioAutoriSriBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_autorBusquedaPorNumeroAutorAutoriSri;
	public JLabel jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri;
	public JTextField jTextFieldnumero_autorBusquedaPorNumeroAutorAutoriSri;
	public JButton jButtonnumero_autorBusquedaPorNumeroAutorAutoriSriBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri;
	public JLabel jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri;
	public JTextField jTextFieldnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri;
	public JButton jButtonnumero_secuencialBusquedaPorNumeroSecuencialAutoriSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri;
	public JLabel jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri;
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSriBusqueda= new JButtonMe();

	
	
	
	
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
	public AutoriSriJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriSriJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriSriJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriSriJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAutoriSri)	{
		this.jButtonRecargarInformacionAutoriSri = jButtonRecargarInformacionAutoriSri;
	}
	
	public JButton getjButtonProcesarInformacionAutoriSri() {
		return this.jButtonProcesarInformacionAutoriSri;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriSri)	{
		this.jButtonProcesarInformacionAutoriSri = jButtonProcesarInformacionAutoriSri;
	}
	
	
	public JButton getjButtonRecargarInformacionAutoriSri() {
		return this.jButtonRecargarInformacionAutoriSri;
	}
	
	
	public List<AutoriSri> getautorisris() {
		return this.autorisris;
	}

	public void setautorisris(List<AutoriSri> autorisris) {
		this.autorisris = autorisris;
	}
	
	public List<AutoriSri> getautorisrisAux() {
		return this.autorisrisAux;
	}

	public void setautorisrisAux(List<AutoriSri> autorisrisAux) {
		this.autorisrisAux = autorisrisAux;
	}
	
	public List<AutoriSri> getautorisrisEliminados() {
		return this.autorisrisEliminados;
	}

	public void setAutoriSrisEliminados(List<AutoriSri> autorisrisEliminados) {
		this.autorisrisEliminados = autorisrisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAutoriSri() {
		return jComboBoxTiposSeleccionarAutoriSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAutoriSri(
			JComboBox jComboBoxTiposSeleccionarAutoriSri) {
		this.jComboBoxTiposSeleccionarAutoriSri = jComboBoxTiposSeleccionarAutoriSri;
	}
	
	public void setBorderResaltarTiposSeleccionarAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAutoriSri .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAutoriSri() {
		return jTextFieldValorCampoGeneralAutoriSri;
	}

	public void setjTextFieldValorCampoGeneralAutoriSri(
			JTextField jTextFieldValorCampoGeneralAutoriSri) {
		this.jTextFieldValorCampoGeneralAutoriSri = jTextFieldValorCampoGeneralAutoriSri;
	}

	public void setBorderResaltarValorCampoGeneralAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAutoriSri .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAutoriSri() {
		return this.jCheckBoxSeleccionarTodosAutoriSri;
	}

	public void setjCheckBoxSeleccionarTodosAutoriSri(
			JCheckBox jCheckBoxSeleccionarTodosAutoriSri) {
		this.jCheckBoxSeleccionarTodosAutoriSri = jCheckBoxSeleccionarTodosAutoriSri;
	}

	public void setBorderResaltarSeleccionarTodosAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAutoriSri .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAutoriSri() {
		return this.jCheckBoxSeleccionadosAutoriSri;
	}

	public void setjCheckBoxSeleccionadosAutoriSri(
			JCheckBox jCheckBoxSeleccionadosAutoriSri) {
		this.jCheckBoxSeleccionadosAutoriSri = jCheckBoxSeleccionadosAutoriSri;
	}
	
	public void setBorderResaltarSeleccionadosAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAutoriSri .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAutoriSri() {
		return this.jComboBoxTiposArchivosReportesAutoriSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAutoriSri(
			JComboBox jComboBoxTiposArchivosReportesAutoriSri) {
		this.jComboBoxTiposArchivosReportesAutoriSri = jComboBoxTiposArchivosReportesAutoriSri;
	}

	public void setBorderResaltarTiposArchivosReportesAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAutoriSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAutoriSri() {
		return this.jComboBoxTiposReportesAutoriSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAutoriSri(
			JComboBox jComboBoxTiposReportesAutoriSri) {
		this.jComboBoxTiposReportesAutoriSri = jComboBoxTiposReportesAutoriSri;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAutoriSri() {
	//	return jComboBoxTiposReportesDinamicoAutoriSri;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAutoriSri(
	//		JComboBox jComboBoxTiposReportesDinamicoAutoriSri) {
	//	this.jComboBoxTiposReportesDinamicoAutoriSri = jComboBoxTiposReportesDinamicoAutoriSri;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAutoriSri() {
	//	return jComboBoxTiposArchivosReportesDinamicoAutoriSri;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAutoriSri(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriSri) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAutoriSri = jComboBoxTiposArchivosReportesDinamicoAutoriSri;
	//}
	
	public void setBorderResaltarTiposReportesAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAutoriSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAutoriSri() {
		return this.jComboBoxTiposGraficosReportesAutoriSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAutoriSri(
			JComboBox jComboBoxTiposGraficosReportesAutoriSri) {
		this.jComboBoxTiposGraficosReportesAutoriSri = jComboBoxTiposGraficosReportesAutoriSri;
	}
	
	public void setBorderResaltarTiposGraficosReportesAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAutoriSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAutoriSri() {
		return this.jComboBoxTiposPaginacionAutoriSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAutoriSri(
			JComboBox jComboBoxTiposPaginacionAutoriSri) {
		this.jComboBoxTiposPaginacionAutoriSri = jComboBoxTiposPaginacionAutoriSri;
	}
	
	public void setBorderResaltarTiposPaginacionAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAutoriSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAutoriSri() {
		return this.jComboBoxTiposRelacionesAutoriSri;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriSri() {
		return this.jComboBoxTiposAccionesAutoriSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriSri(
			JComboBox jComboBoxTiposRelacionesAutoriSri) {
		this.jComboBoxTiposRelacionesAutoriSri = jComboBoxTiposRelacionesAutoriSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriSri(
			JComboBox jComboBoxTiposAccionesAutoriSri) {
		this.jComboBoxTiposAccionesAutoriSri = jComboBoxTiposAccionesAutoriSri;
	}
	
	public void setBorderResaltarTiposRelacionesAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAutoriSri .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAutoriSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAutoriSri .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAutoriSri() {
	//	return jCheckBoxConGraficoDinamicoAutoriSri;
	//}

	//public void setjCheckBoxConGraficoDinamicoAutoriSri(
	//		JCheckBox jCheckBoxConGraficoDinamicoAutoriSri) {
	//	this.jCheckBoxConGraficoDinamicoAutoriSri = jCheckBoxConGraficoDinamicoAutoriSri;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAutoriSri() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAutoriSri.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAutoriSri .setBorder(borderResaltar);		
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
		this.autorisriSessionBean=new AutoriSriSessionBean();
		
		this.autorisriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autorisriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autorisriSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AutoriSriJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AutoriSriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriSriJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriSriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriSriJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autorizaciones Sri MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
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
		
		AutoriSriJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAutoriSri= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"nuevo","nuevo","Nuevo"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"duplicar","duplicar","Duplicar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"copiar","copiar","Copiar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"ver_form","ver_form","Ver"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"recargar","recargar","Recargar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAutoriSri,this.jTtoolBarAutoriSri,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAutoriSri,this.jTtoolBarAutoriSri,
							"cerrar","cerrar","Salir"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAutoriSri=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAutoriSri;
			
				this.jButtonProcesarInformacionToolBarAutoriSri=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAutoriSri;
				
		//protected JButton jButtonModificarToolBarAutoriSri;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAutoriSri=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAutoriSri=new JMenuMe("General");
		this.jmenuArchivoAutoriSri=new JMenuMe("Archivo");
		this.jmenuAccionesAutoriSri=new JMenuMe("Acciones");
		this.jmenuDatosAutoriSri=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriSri= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriSri.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriSri,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAutoriSri= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAutoriSri.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAutoriSri,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAutoriSri= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAutoriSri.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAutoriSri,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAutoriSri= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriSri.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriSri,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAutoriSri= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAutoriSri.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAutoriSri,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAutoriSri= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAutoriSri.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAutoriSri,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAutoriSri= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAutoriSri.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAutoriSri,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAutoriSri= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAutoriSri.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAutoriSri,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAutoriSri= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAutoriSri.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAutoriSri,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAutoriSri= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAutoriSri.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAutoriSri,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAutoriSri= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAutoriSri.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAutoriSri,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAutoriSri= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAutoriSri.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAutoriSri,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriSri,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAutoriSri= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAutoriSri.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAutoriSri,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriSri,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAutoriSri= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAutoriSri.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAutoriSri,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAutoriSri.add(this.jMenuItemCerrarAutoriSri);
			
			this.jmenuAccionesAutoriSri.add(this.jMenuItemNuevoAutoriSri);
			this.jmenuAccionesAutoriSri.add(this.jMenuItemNuevoGuardarCambiosAutoriSri);
			this.jmenuAccionesAutoriSri.add(this.jMenuItemNuevoRelacionesAutoriSri);
			this.jmenuAccionesAutoriSri.add(this.jMenuItemGuardarCambiosTablaAutoriSri);		
			this.jmenuAccionesAutoriSri.add(this.jMenuItemDuplicarAutoriSri);		
			this.jmenuAccionesAutoriSri.add(this.jMenuItemCopiarAutoriSri);		
			this.jmenuAccionesAutoriSri.add(this.jMenuItemVerFormAutoriSri);		
			
			this.jmenuDatosAutoriSri.add(this.jMenuItemRecargarInformacionAutoriSri);				
			this.jmenuDatosAutoriSri.add(this.jMenuItemAnterioresAutoriSri);				
			this.jmenuDatosAutoriSri.add(this.jMenuItemSiguientesAutoriSri);				
			this.jmenuDatosAutoriSri.add(this.jMenuItemAbrirOrderByAutoriSri);				
			this.jmenuDatosAutoriSri.add(this.jMenuItemMostrarOcultarAutoriSri);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAutoriSri.add(this.jMenuItemGuardarCambiosAutoriSri);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAutoriSri.add(this.jmenuArchivoAutoriSri);		
			this.jmenuBarAutoriSri.add(this.jmenuAccionesAutoriSri);		
			this.jmenuBarAutoriSri.add(this.jmenuDatosAutoriSri);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAutoriSri);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAutoriSri() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorFechaFinAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaFinAutoriSri.setToolTipText("Buscar Por Fecha Fin ");
		this.jButtonBusquedaPorFechaFinAutoriSri= new JButtonMe();
		this.jButtonBusquedaPorFechaFinAutoriSri.setText("Buscar");
		this.jButtonBusquedaPorFechaFinAutoriSri.setToolTipText("Buscar Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaFinAutoriSri,"buscar_button","Buscar Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaFinAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_finBusquedaPorFechaFinAutoriSri = new JLabelMe();
		jLabelfecha_finBusquedaPorFechaFinAutoriSri.setText("Fecha Fin :");
		jLabelfecha_finBusquedaPorFechaFinAutoriSri.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaPorFechaFinAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaPorFechaFinAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaPorFechaFinAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaPorFechaFinAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaPorFechaFinAutoriSri= new JDateChooser();
		jDateChooserfecha_finBusquedaPorFechaFinAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaPorFechaFinAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaPorFechaFinAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaPorFechaFinAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaPorFechaFinAutoriSri.setDate(new Date());
		jDateChooserfecha_finBusquedaPorFechaFinAutoriSri.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaPorFechaFinAutoriSri.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorFechaInicioAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaInicioAutoriSri.setToolTipText("Buscar Por Fecha Inicio ");
		this.jButtonBusquedaPorFechaInicioAutoriSri= new JButtonMe();
		this.jButtonBusquedaPorFechaInicioAutoriSri.setText("Buscar");
		this.jButtonBusquedaPorFechaInicioAutoriSri.setToolTipText("Buscar Por Fecha Inicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaInicioAutoriSri,"buscar_button","Buscar Por Fecha Inicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaInicioAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri = new JLabelMe();
		jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri= new JDateChooser();
		jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri.setDate(new Date());
		jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorNumeroAutorAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroAutorAutoriSri.setToolTipText("Buscar Por No Autorizacion ");
		this.jButtonBusquedaPorNumeroAutorAutoriSri= new JButtonMe();
		this.jButtonBusquedaPorNumeroAutorAutoriSri.setText("Buscar");
		this.jButtonBusquedaPorNumeroAutorAutoriSri.setToolTipText("Buscar Por No Autorizacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroAutorAutoriSri,"buscar_button","Buscar Por No Autorizacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroAutorAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri = new JLabelMe();
		jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri.setText("No Autorizacion :");
		jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri.setToolTipText("No Autorizacion");
		jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_autorBusquedaPorNumeroAutorAutoriSri= new JTextFieldMe();
		jTextFieldnumero_autorBusquedaPorNumeroAutorAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorBusquedaPorNumeroAutorAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorBusquedaPorNumeroAutorAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorBusquedaPorNumeroAutorAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNumeroSecuencialAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroSecuencialAutoriSri.setToolTipText("Buscar Por No Secuencial ");
		this.jButtonBusquedaPorNumeroSecuencialAutoriSri= new JButtonMe();
		this.jButtonBusquedaPorNumeroSecuencialAutoriSri.setText("Buscar");
		this.jButtonBusquedaPorNumeroSecuencialAutoriSri.setToolTipText("Buscar Por No Secuencial ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroSecuencialAutoriSri,"buscar_button","Buscar Por No Secuencial ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroSecuencialAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri = new JLabelMe();
		jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.setText("No Secuencial :");
		jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.setToolTipText("No Secuencial");
		jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri= new JTextFieldMe();
		jTextFieldnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoGeneralAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoGeneralAutoriSri.setToolTipText("Buscar Por T. Documento General ");
		this.jButtonFK_IdTipoDocumentoGeneralAutoriSri= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoGeneralAutoriSri.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoGeneralAutoriSri.setToolTipText("Buscar Por T. Documento General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoGeneralAutoriSri,"buscar_button","Buscar Por T. Documento General ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoGeneralAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri = new JLabelMe();
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setText("T. Documento General :");
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setToolTipText("T. Documento General");
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAutoriSri=new JTabbedPane();


		this.jTabbedPaneBusquedasAutoriSri.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriSri.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriSri.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAutoriSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAutoriSri = new AutoriSriDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Autorizaciones Sri DATOS");
			this.jInternalFrameDetalleFormAutoriSri = new AutoriSriDetalleFormJInternalFrame(jDesktopPane,this.autorisriSessionBean.getConGuardarRelaciones(),this.autorisriSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAutoriSri = null;//new AutoriSriDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriSri= new GridBagLayout();
		
		
		this.jTableDatosAutoriSri = new JTableMe();      
		
		String sToolTipAutoriSri="";
		sToolTipAutoriSri=AutoriSriConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriSri+="(Facturacion.AutoriSri)";
		}
		
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriSri+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAutoriSri.setToolTipText(sToolTipAutoriSri);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAutoriSri);
		this.jTableDatosAutoriSri.setAutoCreateRowSorter(true);
		this.jTableDatosAutoriSri.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAutoriSri.setRowSelectionAllowed(true);
		this.jTableDatosAutoriSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAutoriSri,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAutoriSri = new JButtonMe();
		this.jButtonDuplicarAutoriSri = new JButtonMe();
		this.jButtonCopiarAutoriSri = new JButtonMe();
		this.jButtonVerFormAutoriSri = new JButtonMe();
		this.jButtonNuevoRelacionesAutoriSri = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAutoriSri = new JButtonMe();
		this.jButtonCerrarAutoriSri = new JButtonMe();
		
		this.jScrollPanelDatosAutoriSri = new JScrollPane();   
        this.jScrollPanelDatosGeneralAutoriSri = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Autorizaciones Sri";
		
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Sris" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriSri.setToolTipText("Acciones");
        this.jPanelAccionesAutoriSri.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAutoriSri=new ReporteDinamicoJInternalFrame(AutoriSriConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAutoriSri();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAutoriSri=new ImportacionJInternalFrame(AutoriSriConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAutoriSri();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAutoriSri = new JButtonMe();
		
		this.jButtonAbrirOrderByAutoriSri.setText("Orden");
		this.jButtonAbrirOrderByAutoriSri.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriSri,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriSri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriSri,false,this);
			
			//this.cargarOrderByAutoriSri(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriSri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriSri,true,this);
			
			//this.cargarOrderByAutoriSri(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAutoriSri.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosAutoriSri.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosAutoriSri.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosAutoriSri.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriSri.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriSri.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAutoriSri.setText("Nuevo");
		this.jButtonDuplicarAutoriSri.setText("Duplicar");
		this.jButtonCopiarAutoriSri.setText("Copiar");
		this.jButtonVerFormAutoriSri.setText("Ver");
		this.jButtonNuevoRelacionesAutoriSri.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAutoriSri.setText("Guardar");
		this.jButtonCerrarAutoriSri.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriSri,"nuevo_button","Nuevo",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAutoriSri,"duplicar_button","Duplicar",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAutoriSri,"copiar_button","Copiar",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAutoriSri,"ver_form","Ver",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAutoriSri,"nuevorelaciones_button","Nuevo Rel",this.autorisriSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriSri,"guardarcambiostabla_button","Guardar",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriSri,"cerrar_button","Salir",this.autorisriSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAutoriSri.setToolTipText("Nuevo"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAutoriSri.setToolTipText("Duplicar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAutoriSri.setToolTipText("Copiar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAutoriSri.setToolTipText("Ver"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAutoriSri.setToolTipText("Nuevo Rel"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAutoriSri.setToolTipText("Guardar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriSri.setToolTipText("Salir"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriSri";
		inputMap = this.jButtonNuevoAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriSri"));
		
		//DUPLICAR
		sMapKey = "DuplicarAutoriSri";
		inputMap = this.jButtonDuplicarAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAutoriSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAutoriSri"));
		
		//COPIAR
		sMapKey = "CopiarAutoriSri";
		inputMap = this.jButtonCopiarAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAutoriSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAutoriSri"));
		
		//VEr FORM
		sMapKey = "VerFormAutoriSri";
		inputMap = this.jButtonVerFormAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAutoriSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAutoriSri"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAutoriSri";
		inputMap = this.jButtonNuevoRelacionesAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAutoriSri"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAutoriSri";
		inputMap = this.jButtonModificarAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAutoriSri"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAutoriSri";
		inputMap = this.jButtonCerrarAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriSri"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriSri";
		inputMap = this.jButtonGuardarCambiosTablaAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriSri"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AutoriSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AutoriSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AutoriSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AutoriSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AutoriSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAutoriSri.setName("jPanelParametrosReportesAutoriSri"); 
		
		this.jPanelParametrosReportesAccionesAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAutoriSri.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAutoriSri.setName("jPanelParametrosReportesAccionesAutoriSri"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAutoriSri = new JButtonMe();
		this.jButtonRecargarInformacionAutoriSri.setText("Recargar");
		this.jButtonRecargarInformacionAutoriSri.setToolTipText("Recargar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAutoriSri,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAutoriSri = new JButtonMe();
		this.jButtonProcesarInformacionAutoriSri.setText("Procesar");
		this.jButtonProcesarInformacionAutoriSri.setToolTipText("Procesar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAutoriSri.setVisible(false);
			
		this.jButtonProcesarInformacionAutoriSri.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriSri.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriSri.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriSri.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAutoriSri.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriSri.setText("TIPO");       
		this.jComboBoxTiposReportesAutoriSri.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriSri.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAutoriSri.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAutoriSri.setText("Paginacion");
		this.jComboBoxTiposPaginacionAutoriSri.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAutoriSri.setText("Accion");
		this.jComboBoxTiposRelacionesAutoriSri.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriSri.setText("Accion");
		this.jComboBoxTiposAccionesAutoriSri.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAutoriSri.setText("Accion");
		this.jComboBoxTiposSeleccionarAutoriSri.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAutoriSri=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAutoriSri.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriSri.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriSri.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAutoriSri = new JLabelMe();
		
		this.jLabelAccionesAutoriSri.setText("Acciones");		
		this.jLabelAccionesAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAutoriSri = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAutoriSri.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAutoriSri.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAutoriSri = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAutoriSri.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAutoriSri.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAutoriSri = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAutoriSri.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAutoriSri.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAutoriSri = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAutoriSri.setText("Graf.");
		this.jCheckBoxConGraficoReporteAutoriSri.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAutoriSri = new JButtonMe();
		//this.jButtonAnterioresAutoriSri.setText("<<");
        this.jButtonAnterioresAutoriSri.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAutoriSri,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAutoriSri = new JButtonMe();
		//this.jButtonSiguientesAutoriSri.setText(">>");
        this.jButtonSiguientesAutoriSri.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAutoriSri,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAutoriSri = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAutoriSri.setText("Nue");
        this.jButtonNuevoGuardarCambiosAutoriSri.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAutoriSri,"nuevoguardarcambios_button","Nue",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAutoriSri";
		inputMap = this.jButtonNuevoGuardarCambiosAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAutoriSri"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAutoriSri";
		inputMap = this.jButtonRecargarInformacionAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAutoriSri"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAutoriSri";
		inputMap = this.jButtonSiguientesAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAutoriSri"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAutoriSri";
		inputMap = this.jButtonAnterioresAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAutoriSri"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAutoriSri();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAutoriSri.setMinimumSize(new Dimension(this.getWidth(),AutoriSriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriSriBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriSri.setMaximumSize(new Dimension(this.getWidth(),AutoriSriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriSriBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriSri.setPreferredSize(new Dimension(this.getWidth(),AutoriSriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriSriBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAutoriSri = new GridBagLayout();

			this.jPanelPaginacionAutoriSri.setLayout(gridaBagLayoutPaginacionAutoriSri);						
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = 0;
			this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAutoriSri.add(this.jButtonAnterioresAutoriSri, this.gridBagConstraintsAutoriSri);
					
						
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriSri.gridy = 0;
			
			this.jPanelPaginacionAutoriSri.add(this.jButtonNuevoGuardarCambiosAutoriSri, this.gridBagConstraintsAutoriSri);
						
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriSri.gridy = 0;
			this.jPanelPaginacionAutoriSri.add(this.jButtonSiguientesAutoriSri, this.gridBagConstraintsAutoriSri);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = 1;
			this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriSri.add(this.jButtonNuevoAutoriSri, this.gridBagConstraintsAutoriSri);
						
			
			
			if(!this.autorisriSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAutoriSri = new GridBagConstraints();
				this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAutoriSri.gridy = 1;
				this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAutoriSri.add(this.jButtonGuardarCambiosTablaAutoriSri, this.gridBagConstraintsAutoriSri);
			}
			
			
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = 1;
			this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriSri.add(this.jButtonDuplicarAutoriSri, this.gridBagConstraintsAutoriSri);
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = 1;
			this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriSri.add(this.jButtonCopiarAutoriSri, this.gridBagConstraintsAutoriSri);
		
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = 1;
			this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriSri.add(this.jButtonVerFormAutoriSri, this.gridBagConstraintsAutoriSri);
		
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = 1;
			this.gridBagConstraintsAutoriSri.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAutoriSri.add(this.jButtonCerrarAutoriSri, this.gridBagConstraintsAutoriSri);
		
		
		
		this.jButtonRecargarInformacionAutoriSri.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriSri.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriSri.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAutoriSri.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriSri.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriSri.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAutoriSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAutoriSri.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriSri.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriSri.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAutoriSri.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriSri.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriSri.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAutoriSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAutoriSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAutoriSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAutoriSri.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriSri.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriSri.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAutoriSri.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriSri.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriSri.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAutoriSri.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriSri.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriSri.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAutoriSri.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriSri.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriSri.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAutoriSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAutoriSri = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AutoriSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AutoriSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AutoriSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AutoriSri = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAutoriSri.setLayout(gridaBagParametrosReportesAutoriSri);
			this.jPanelParametrosReportesAccionesAutoriSri.setLayout(gridaBagParametrosReportesAccionesAutoriSri);
			
			
			this.jPanelParametrosAuxiliar1AutoriSri.setLayout(gridaBagParametrosAuxiliar1AutoriSri);
			this.jPanelParametrosAuxiliar2AutoriSri.setLayout(gridaBagParametrosAuxiliar2AutoriSri);
			this.jPanelParametrosAuxiliar3AutoriSri.setLayout(gridaBagParametrosAuxiliar3AutoriSri);
			this.jPanelParametrosAuxiliar4AutoriSri.setLayout(gridaBagParametrosAuxiliar4AutoriSri);
			//this.jPanelParametrosAuxiliar5AutoriSri.setLayout(gridaBagParametrosAuxiliar2AutoriSri);			
			
			
			
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriSri.add(this.jButtonRecargarInformacionAutoriSri, this.gridBagConstraintsAutoriSri);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriSri.add(this.jComboBoxTiposPaginacionAutoriSri, this.gridBagConstraintsAutoriSri);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriSri.add(this.jCheckBoxConAltoMaximoTablaAutoriSri, this.gridBagConstraintsAutoriSri);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriSri.add(this.jComboBoxTiposArchivosReportesAutoriSri, this.gridBagConstraintsAutoriSri);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriSri.add(this.jPanelParametrosAuxiliar1AutoriSri, this.gridBagConstraintsAutoriSri);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AutoriSri.add(this.jComboBoxTiposReportesAutoriSri, this.gridBagConstraintsAutoriSri);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriSri.add(this.jPanelParametrosAuxiliar4AutoriSri, this.gridBagConstraintsAutoriSri);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriSri.add(this.jComboBoxTiposReportesAutoriSri, this.gridBagConstraintsAutoriSri);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriSri.add(this.jCheckBoxGenerarReporteAutoriSri, this.gridBagConstraintsAutoriSri);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriSri.add(this.jPanelParametrosAuxiliar2AutoriSri, this.gridBagConstraintsAutoriSri);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriSri.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriSri.add(this.jLabelAccionesAutoriSri, this.gridBagConstraintsAutoriSri);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAutoriSri = new GridBagConstraints();
				this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAutoriSri.add(this.jButtonAbrirOrderByAutoriSri, this.gridBagConstraintsAutoriSri);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriSri.add(this.jComboBoxTiposSeleccionarAutoriSri, this.gridBagConstraintsAutoriSri);			
			
			
			/*
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriSri.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriSri.add(this.jCheckBoxSeleccionarTodosAutoriSri, this.gridBagConstraintsAutoriSri);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriSri.add(this.jCheckBoxSeleccionarTodosAutoriSri, this.gridBagConstraintsAutoriSri);															
				
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriSri.add(this.jCheckBoxSeleccionadosAutoriSri, this.gridBagConstraintsAutoriSri);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriSri.add(this.jPanelParametrosAuxiliar3AutoriSri, this.gridBagConstraintsAutoriSri);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriSri.add(this.jComboBoxTiposAccionesAutoriSri, this.gridBagConstraintsAutoriSri);
	
				
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriSri.add(this.jTextFieldValorCampoGeneralAutoriSri, this.gridBagConstraintsAutoriSri);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAutoriSri = new GridBagLayout();

			this.jScrollPanelDatosAutoriSri.setLayout(gridaBagLayoutDatosAutoriSri);
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = 0;
			this.gridBagConstraintsAutoriSri.gridx = 0;
			
			this.jScrollPanelDatosAutoriSri.add(this.jTableDatosAutoriSri, this.gridBagConstraintsAutoriSri);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAutoriSri.setViewportView(this.jTableDatosAutoriSri);
		this.jTableDatosAutoriSri.setFillsViewportHeight(true);
		this.jTableDatosAutoriSri.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAutoriSri= new GridBagLayout();
		this.jPanelAccionesAutoriSri.setLayout(gridaBagLayoutAccionesAutoriSri);
		
		
		/*	
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 0;
			
		this.jPanelAccionesAutoriSri.add(this.jButtonNuevoAutoriSri, this.gridBagConstraintsAutoriSri);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorFechaFinAutoriSri= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaFinAutoriSri.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaFinAutoriSri.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaFinAutoriSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaFinAutoriSri.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaFinAutoriSri.setLayout(gridaBagLayoutBusquedaPorFechaFinAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 0;
		jPanelBusquedaPorFechaFinAutoriSri.add(jLabelfecha_finBusquedaPorFechaFinAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 1;
		jPanelBusquedaPorFechaFinAutoriSri.add(jDateChooserfecha_finBusquedaPorFechaFinAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 1;
		gridBagConstraintsAutoriSri.gridx =1;
		jPanelBusquedaPorFechaFinAutoriSri.add(jButtonBusquedaPorFechaFinAutoriSri, gridBagConstraintsAutoriSri);

		jTabbedPaneBusquedasAutoriSri.addTab("1.-Por Fecha Fin ", jPanelBusquedaPorFechaFinAutoriSri);
		jTabbedPaneBusquedasAutoriSri.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorFechaInicioAutoriSri= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaInicioAutoriSri.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaInicioAutoriSri.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaInicioAutoriSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaInicioAutoriSri.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaInicioAutoriSri.setLayout(gridaBagLayoutBusquedaPorFechaInicioAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 0;
		jPanelBusquedaPorFechaInicioAutoriSri.add(jLabelfecha_inicioBusquedaPorFechaInicioAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 1;
		jPanelBusquedaPorFechaInicioAutoriSri.add(jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 1;
		gridBagConstraintsAutoriSri.gridx =1;
		jPanelBusquedaPorFechaInicioAutoriSri.add(jButtonBusquedaPorFechaInicioAutoriSri, gridBagConstraintsAutoriSri);

		jTabbedPaneBusquedasAutoriSri.addTab("2.-Por Fecha Inicio ", jPanelBusquedaPorFechaInicioAutoriSri);
		jTabbedPaneBusquedasAutoriSri.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNumeroAutorAutoriSri= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroAutorAutoriSri.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroAutorAutoriSri.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroAutorAutoriSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroAutorAutoriSri.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroAutorAutoriSri.setLayout(gridaBagLayoutBusquedaPorNumeroAutorAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 0;
		jPanelBusquedaPorNumeroAutorAutoriSri.add(jLabelnumero_autorBusquedaPorNumeroAutorAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 1;
		jPanelBusquedaPorNumeroAutorAutoriSri.add(jTextFieldnumero_autorBusquedaPorNumeroAutorAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 1;
		gridBagConstraintsAutoriSri.gridx =1;
		jPanelBusquedaPorNumeroAutorAutoriSri.add(jButtonBusquedaPorNumeroAutorAutoriSri, gridBagConstraintsAutoriSri);

		jTabbedPaneBusquedasAutoriSri.addTab("3.-Por No Autorizacion ", jPanelBusquedaPorNumeroAutorAutoriSri);
		jTabbedPaneBusquedasAutoriSri.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorNumeroSecuencialAutoriSri= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroSecuencialAutoriSri.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroSecuencialAutoriSri.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroSecuencialAutoriSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroSecuencialAutoriSri.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroSecuencialAutoriSri.setLayout(gridaBagLayoutBusquedaPorNumeroSecuencialAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 0;
		jPanelBusquedaPorNumeroSecuencialAutoriSri.add(jLabelnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 1;
		jPanelBusquedaPorNumeroSecuencialAutoriSri.add(jTextFieldnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 1;
		gridBagConstraintsAutoriSri.gridx =1;
		jPanelBusquedaPorNumeroSecuencialAutoriSri.add(jButtonBusquedaPorNumeroSecuencialAutoriSri, gridBagConstraintsAutoriSri);

		jTabbedPaneBusquedasAutoriSri.addTab("4.-Por No Secuencial ", jPanelBusquedaPorNumeroSecuencialAutoriSri);
		jTabbedPaneBusquedasAutoriSri.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoGeneralAutoriSri= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoGeneralAutoriSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoGeneralAutoriSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoGeneralAutoriSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoGeneralAutoriSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoGeneralAutoriSri.setLayout(gridaBagLayoutFK_IdTipoDocumentoGeneralAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 0;
		jPanelFK_IdTipoDocumentoGeneralAutoriSri.add(jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 0;
		gridBagConstraintsAutoriSri.gridx = 1;
		jPanelFK_IdTipoDocumentoGeneralAutoriSri.add(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri, gridBagConstraintsAutoriSri);

		gridBagConstraintsAutoriSri = new GridBagConstraints();
		gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriSri.gridy = 1;
		gridBagConstraintsAutoriSri.gridx =1;
		jPanelFK_IdTipoDocumentoGeneralAutoriSri.add(jButtonFK_IdTipoDocumentoGeneralAutoriSri, gridBagConstraintsAutoriSri);

		jTabbedPaneBusquedasAutoriSri.addTab("5.-Por T. Documento General ", jPanelFK_IdTipoDocumentoGeneralAutoriSri);
		jTabbedPaneBusquedasAutoriSri.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriSri = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriSri);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();						
			this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriSri.gridx = 0;		
			//this.gridBagConstraintsAutoriSri.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriSri.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAutoriSri, this.gridBagConstraintsAutoriSri);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAutoriSri.gridx = 0;		
		//this.gridBagConstraintsAutoriSri.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAutoriSri.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAutoriSri);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriSri.gridx = 0;		
			this.gridBagConstraintsAutoriSri.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAutoriSri.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAutoriSri, this.gridBagConstraintsAutoriSri);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAutoriSri, this.gridBagConstraintsAutoriSri);								
		
		
		/*
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAutoriSri, this.gridBagConstraintsAutoriSri);
		*/		
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriSri.gridx =0;
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriSri.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriSri, this.gridBagConstraintsAutoriSri);
				
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAutoriSri, this.gridBagConstraintsAutoriSri);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AutoriSriJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAutoriSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriSri = new GridBagLayout();
			this.jPanelBusquedasParametrosAutoriSri.setLayout(gridaBagLayoutBusquedasParametrosAutoriSri);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAutoriSri=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriSri, this.gridBagConstraintsAutoriSri);
			
			
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriSri, this.gridBagConstraintsAutoriSri);
		
			
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriSri, this.gridBagConstraintsAutoriSri);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAutoriSri;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAutoriSri() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAutoriSri = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAutoriSri.setName("jPanelReporteDinamicoAutoriSri"); 
		
		this.jPanelReporteDinamicoAutoriSri.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriSri.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriSri.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAutoriSri.setLayout(gridaBagLayoutReporteDinamicoAutoriSri);
		
		
		this.jInternalFrameReporteDinamicoAutoriSri= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAutoriSri = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriSri= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAutoriSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAutoriSri.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAutoriSri.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAutoriSri.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAutoriSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAutoriSri.setResizable(true);
	    this.jInternalFrameReporteDinamicoAutoriSri.setClosable(true);
	    this.jInternalFrameReporteDinamicoAutoriSri.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAutoriSri.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriSri.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriSri.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Sris"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAutoriSri = new JLabelMe();

		this.jLabelColumnasSelectReporteAutoriSri.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriSri.add(this.jLabelColumnasSelectReporteAutoriSri, this.gridBagConstraintsAutoriSri);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAutoriSri = new JList<Reporte>();
		this.jListColumnasSelectReporteAutoriSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAutoriSri.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAutoriSri.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriSri.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriSri.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAutoriSri=new JScrollPane(this.jListColumnasSelectReporteAutoriSri);
			
			this.jScrollColumnasSelectReporteAutoriSri.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriSri.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriSri.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAutoriSri.add(this.jListColumnasSelectReporteAutoriSri, this.gridBagConstraintsAutoriSri);
		this.jPanelReporteDinamicoAutoriSri.add(this.jScrollColumnasSelectReporteAutoriSri, this.gridBagConstraintsAutoriSri);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAutoriSri = new JLabelMe();

		this.jLabelRelacionesSelectReporteAutoriSri.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAutoriSri = new JList<Reporte>();
		this.jListRelacionesSelectReporteAutoriSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAutoriSri.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAutoriSri.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriSri.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriSri.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAutoriSri=new JScrollPane(this.jListRelacionesSelectReporteAutoriSri);
			
			this.jScrollRelacionesSelectReporteAutoriSri.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriSri.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriSri.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAutoriSri = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAutoriSri = new JComboBoxMe();
		this.jListColumnasValoresGraficoAutoriSri = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAutoriSri = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAutoriSri.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAutoriSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAutoriSri = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriSri.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAutoriSri = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAutoriSri.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriSri.add(this.jLabelGenerarExcelReporteDinamicoAutoriSri, this.gridBagConstraintsAutoriSri);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAutoriSri = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAutoriSri.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAutoriSri,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAutoriSri.setToolTipText("Generar EXCEL"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAutoriSri.add(this.jButtonGenerarExcelReporteDinamicoAutoriSri, this.gridBagConstraintsAutoriSri);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriSri.add(this.jComboBoxTiposReportesDinamicoAutoriSri, this.gridBagConstraintsAutoriSri);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAutoriSri = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAutoriSri.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriSri.add(this.jLabelTiposArchivoReporteDinamicoAutoriSri, this.gridBagConstraintsAutoriSri);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriSri.add(this.jComboBoxTiposArchivosReportesDinamicoAutoriSri, this.gridBagConstraintsAutoriSri);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAutoriSri = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAutoriSri.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAutoriSri,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAutoriSri.setToolTipText("Generar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriSri.add(this.jButtonGenerarReporteDinamicoAutoriSri, this.gridBagConstraintsAutoriSri);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAutoriSri = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAutoriSri.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAutoriSri,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAutoriSri.setToolTipText("Cancelar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriSri.add(this.jButtonCerrarReporteDinamicoAutoriSri, this.gridBagConstraintsAutoriSri);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAutoriSri = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAutoriSri= new JScrollPane(jPanelReporteDinamicoAutoriSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAutoriSri.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriSri.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriSri.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Sris"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAutoriSri.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAutoriSri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAutoriSri.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAutoriSri);
		this.jInternalFrameReporteDinamicoAutoriSri.getContentPane().add(this.jScrollPanelReporteDinamicoAutoriSri, this.gridBagConstraintsAutoriSri);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAutoriSri() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAutoriSri = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAutoriSri.setName("jPanelImportacionAutoriSri"); 
		
		this.jPanelImportacionAutoriSri.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriSri.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriSri.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAutoriSri.setLayout(gridaBagLayoutImportacionAutoriSri);
		
		
		this.jInternalFrameImportacionAutoriSri= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAutoriSri= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAutoriSri = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriSri= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAutoriSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriSri.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriSri.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAutoriSri.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriSri.setResizable(true);
	    this.jInternalFrameImportacionAutoriSri.setClosable(true);
	    this.jInternalFrameImportacionAutoriSri.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAutoriSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriSri.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriSri.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAutoriSri.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriSri.setResizable(true);
	    this.jInternalFrameImportacionAutoriSri.setClosable(true);
	    this.jInternalFrameImportacionAutoriSri.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAutoriSri.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriSri.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriSri.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Sris"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAutoriSri = new JLabelMe();

		this.jLabelArchivoImportacionAutoriSri.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriSri.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriSri.add(this.jLabelArchivoImportacionAutoriSri, this.gridBagConstraintsAutoriSri);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAutoriSri = new JFileChooser();		
		this.jFileChooserImportacionAutoriSri.setToolTipText("ESCOGER ARCHIVO"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAutoriSri = new JButtonMe();
		this.jButtonAbrirImportacionAutoriSri.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAutoriSri,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAutoriSri.setToolTipText("Generar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriSri.add(this.jButtonAbrirImportacionAutoriSri, this.gridBagConstraintsAutoriSri);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAutoriSri = new JLabelMe();

		this.jLabelPathArchivoImportacionAutoriSri.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriSri.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriSri.add(this.jLabelPathArchivoImportacionAutoriSri, this.gridBagConstraintsAutoriSri);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAutoriSri=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAutoriSri.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriSri.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriSri.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriSri.add(this.jTextFieldPathArchivoImportacionAutoriSri, this.gridBagConstraintsAutoriSri);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAutoriSri = new JButtonMe();
		this.jButtonGenerarImportacionAutoriSri.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAutoriSri,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAutoriSri.setToolTipText("Generar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriSri.add(this.jButtonGenerarImportacionAutoriSri, this.gridBagConstraintsAutoriSri);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAutoriSri = new JButtonMe();
		this.jButtonCerrarImportacionAutoriSri.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAutoriSri,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAutoriSri.setToolTipText("Cancelar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriSri.add(this.jButtonCerrarImportacionAutoriSri, this.gridBagConstraintsAutoriSri);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAutoriSri = new GridBagLayout();
		
		this.jScrollPanelImportacionAutoriSri= new JScrollPane(jPanelImportacionAutoriSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy =iPosYImportacion;
		this.gridBagConstraintsAutoriSri.gridx =iPosXImportacion;
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAutoriSri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAutoriSri.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAutoriSri);
		this.jInternalFrameImportacionAutoriSri.getContentPane().add(this.jScrollPanelImportacionAutoriSri, this.gridBagConstraintsAutoriSri);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAutoriSri(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAutoriSri = new JButtonMe();
			this.jButtonAbrirOrderByAutoriSri.setText("Orden");
			this.jButtonAbrirOrderByAutoriSri.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriSri,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAutoriSri";
			inputMap = this.jButtonAbrirOrderByAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAutoriSri"));
		
		
			GridBagLayout gridaBagLayoutOrderByAutoriSri = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAutoriSri.setName("jPanelOrderByAutoriSri"); 
			
			this.jPanelOrderByAutoriSri.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriSri.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriSri.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAutoriSri.setLayout(gridaBagLayoutOrderByAutoriSri);
			
			
			this.jTableDatosAutoriSriOrderBy = new JTableMe();        
			this.jTableDatosAutoriSriOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAutoriSriOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAutoriSriOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAutoriSriOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAutoriSriOrderBy.setViewportView(this.jTableDatosAutoriSriOrderBy);
			this.jTableDatosAutoriSriOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAutoriSriOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAutoriSri= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAutoriSri= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAutoriSri = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAutoriSri= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAutoriSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAutoriSri.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAutoriSri.setTitle("Orden");
			this.jInternalFrameOrderByAutoriSri.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAutoriSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAutoriSri.setResizable(true);
			this.jInternalFrameOrderByAutoriSri.setClosable(true);
			this.jInternalFrameOrderByAutoriSri.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAutoriSri.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriSri.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriSri.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Sris"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAutoriSri.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAutoriSri.ipady =150;
				
			this.jPanelOrderByAutoriSri.add(jScrollPanelDatosAutoriSriOrderBy, this.gridBagConstraintsAutoriSri);//this.jTableDatosAutoriSriTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAutoriSri = new JButtonMe();
			this.jButtonCerrarOrderByAutoriSri.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAutoriSri,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAutoriSri.setToolTipText("Cancelar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAutoriSri.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAutoriSri.add(this.jButtonCerrarOrderByAutoriSri, this.gridBagConstraintsAutoriSri);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAutoriSri = new GridBagLayout();
			
			this.jScrollPanelOrderByAutoriSri= new JScrollPane(jPanelOrderByAutoriSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy =iPosYOrderBy;
			this.gridBagConstraintsAutoriSri.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAutoriSri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAutoriSri.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAutoriSri);
			
			this.jInternalFrameOrderByAutoriSri.getContentPane().add(this.jScrollPanelOrderByAutoriSri, this.gridBagConstraintsAutoriSri);			
		
		} else {
			this.jButtonAbrirOrderByAutoriSri = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.autorisriSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAutoriSri.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAutoriSri.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAutoriSri.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAutoriSri.getRowHeight();//AutoriSriConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AutoriSriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriSri.isSelected()) {
					iHeightTable=AutoriSriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriSriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriSriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AutoriSriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriSri.isSelected()) {
					iHeightTable=AutoriSriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriSriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriSriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAutoriSri.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriSri.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriSri.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAutoriSri.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriSri.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriSri.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAutoriSri!=null && this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy()!=null) {
			//if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAutoriSri.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAutoriSri.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAutoriSri.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAutoriSri.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriSri.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriSri.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=autorisriLogic.getAutoriSris().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autorisris.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AutoriSri> TraerAutoriSriBeans(List<AutoriSri> autorisris,ArrayList<Classe> classes)throws Exception {
		try {
			for(AutoriSri autorisri:autorisris) {
					
				if(!(AutoriSriConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AutoriSriConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					autorisri.setsDetalleGeneralEntityReporte(AutoriSriConstantesFunciones.getAutoriSriDescripcion(autorisri));
										
					autorisri.setesta_activo_descripcion(AutoriSriConstantesFunciones.getesta_activoDescripcion(autorisri));	
					
						
					
				} else  {
							
					//autorisri.setsDetalleGeneralEntityReporte(autorisri.getsDetalleGeneralEntityReporte());
										
				}
				
				//autorisribeans.add(autorisribean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return autorisris;
    }
	//PARA REPORTES FIN
}
