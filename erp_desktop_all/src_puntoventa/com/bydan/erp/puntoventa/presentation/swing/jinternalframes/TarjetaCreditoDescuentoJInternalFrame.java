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

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.puntoventa.util.TarjetaCreditoDescuentoConstantesFunciones;

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
public class TarjetaCreditoDescuentoJInternalFrame extends TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTarjetaCreditoDescuento;
	
	protected JMenuBar jmenuBarTarjetaCreditoDescuento;
	
	protected JMenu jmenuTarjetaCreditoDescuento;
	protected JMenu jmenuDatosTarjetaCreditoDescuento;
	protected JMenu jmenuArchivoTarjetaCreditoDescuento;
	protected JMenu jmenuAccionesTarjetaCreditoDescuento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTarjetaCreditoDescuento;	
	protected GridBagConstraints gridBagConstraintsTarjetaCreditoDescuento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TarjetaCreditoDescuentoDetalleFormJInternalFrame jInternalFrameDetalleFormTarjetaCreditoDescuento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTarjetaCreditoDescuento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTarjetaCreditoDescuento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tarjetacredito="";
	
	public TarjetaCreditoDescuentoSessionBean tarjetacreditodescuentoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TarjetaCreditoDescuento> tarjetacreditodescuentos;		
	public List<TarjetaCreditoDescuento> tarjetacreditodescuentosEliminados;	
	public List<TarjetaCreditoDescuento> tarjetacreditodescuentosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTarjetaCreditoDescuento;		
	protected JButton jButtonAbrirOrderByTarjetaCreditoDescuento;
	
	
	//protected JPanel jPanelOrderByTarjetaCreditoDescuento;
	//public JScrollPane jScrollPanelOrderByTarjetaCreditoDescuento;	
	//protected JButton jButtonCerrarOrderByTarjetaCreditoDescuento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TarjetaCreditoDescuentoLogic tarjetacreditodescuentoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTarjetaCreditoDescuento;
	public JScrollPane jScrollPanelDatosEdicionTarjetaCreditoDescuento;
	public JScrollPane jScrollPanelDatosGeneralTarjetaCreditoDescuento;
    
	
	
	//public JScrollPane jScrollPanelDatosTarjetaCreditoDescuentoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTarjetaCreditoDescuento;
	//public JScrollPane jScrollPanelImportacionTarjetaCreditoDescuento;
	
	
	
	protected JPanel jPanelAccionesTarjetaCreditoDescuento;
	
    protected JPanel jPanelPaginacionTarjetaCreditoDescuento;
    protected JPanel jPanelParametrosReportesTarjetaCreditoDescuento;
	protected JPanel jPanelParametrosReportesAccionesTarjetaCreditoDescuento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TarjetaCreditoDescuento;
	protected JPanel jPanelParametrosAuxiliar2TarjetaCreditoDescuento;
	protected JPanel jPanelParametrosAuxiliar3TarjetaCreditoDescuento;
	protected JPanel jPanelParametrosAuxiliar4TarjetaCreditoDescuento;
	//protected JPanel jPanelParametrosAuxiliar5TarjetaCreditoDescuento;
	
	
	
	//protected JPanel jPanelReporteDinamicoTarjetaCreditoDescuento;
	//protected JPanel jPanelImportacionTarjetaCreditoDescuento;
	
	
	public JTable jTableDatosTarjetaCreditoDescuento;
	
	
	
	//public JTable jTableDatosTarjetaCreditoDescuentoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTarjetaCreditoDescuento;
	protected JButton jButtonDuplicarTarjetaCreditoDescuento;
	protected JButton jButtonCopiarTarjetaCreditoDescuento;
	protected JButton jButtonVerFormTarjetaCreditoDescuento;
	protected JButton jButtonNuevoRelacionesTarjetaCreditoDescuento;
	protected JButton jButtonModificarTarjetaCreditoDescuento;
	
    protected JButton jButtonGuardarCambiosTablaTarjetaCreditoDescuento;
	protected JButton jButtonCerrarTarjetaCreditoDescuento;
	
	
	protected JButton jButtonRecargarInformacionTarjetaCreditoDescuento;
	protected JButton jButtonProcesarInformacionTarjetaCreditoDescuento;
	
	
	protected JButton jButtonAnterioresTarjetaCreditoDescuento;
	protected JButton jButtonSiguientesTarjetaCreditoDescuento;
	protected JButton jButtonNuevoGuardarCambiosTarjetaCreditoDescuento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTarjetaCreditoDescuento;
	//protected JButton jButtonCerrarReporteDinamicoTarjetaCreditoDescuento;
	//protected JButton jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuento;	
	
	
	
	//protected JButton jButtonAbrirImportacionTarjetaCreditoDescuento;
	//protected JButton jButtonGenerarImportacionTarjetaCreditoDescuento;
	//protected JButton jButtonCerrarImportacionTarjetaCreditoDescuento;
	//protected JFileChooser jFileChooserImportacionTarjetaCreditoDescuento;
	//protected File fileImportacionTarjetaCreditoDescuento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTarjetaCreditoDescuento;
	protected JButton jButtonDuplicarToolBarTarjetaCreditoDescuento;
	protected JButton jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento;
	
	
	public JButton jButtonGuardarCambiosToolBarTarjetaCreditoDescuento;
	protected JButton jButtonCopiarToolBarTarjetaCreditoDescuento;
	protected JButton jButtonVerFormToolBarTarjetaCreditoDescuento;
	public JButton jButtonGuardarCambiosTablaToolBarTarjetaCreditoDescuento;
	protected JButton jButtonMostrarOcultarTablaToolBarTarjetaCreditoDescuento;
	protected JButton jButtonCerrarToolBarTarjetaCreditoDescuento;
	
	protected JButton jButtonRecargarInformacionToolBarTarjetaCreditoDescuento;
	protected JButton jButtonProcesarInformacionToolBarTarjetaCreditoDescuento;
	protected JButton jButtonAnterioresToolBarTarjetaCreditoDescuento;
	protected JButton jButtonSiguientesToolBarTarjetaCreditoDescuento;
	protected JButton jButtonNuevoGuardarCambiosToolBarTarjetaCreditoDescuento;
	protected JButton jButtonAbrirOrderByToolBarTarjetaCreditoDescuento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemDuplicarTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemNuevoRelacionesTarjetaCreditoDescuento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemCopiarTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemVerFormTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemCerrarTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemDetalleCerrarTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento;
	
	protected JMenuItem jMenuItemRecargarInformacionTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemProcesarInformacionTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemAnterioresTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemSiguientesTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemAbrirOrderByTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemMostrarOcultarTarjetaCreditoDescuento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTarjetaCreditoDescuento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTarjetaCreditoDescuento;
	protected JCheckBox jCheckBoxSeleccionadosTarjetaCreditoDescuento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento;
	protected JCheckBox jCheckBoxConGraficoReporteTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTarjetaCreditoDescuento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTarjetaCreditoDescuento;
	protected JTextField jTextFieldValorCampoGeneralTarjetaCreditoDescuento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTarjetaCreditoDescuento;
	//public JList<Reporte> jListColumnasSelectReporteTarjetaCreditoDescuento;
	//public JScrollPane jScrollColumnasSelectReporteTarjetaCreditoDescuento;
	
	//public JLabel jLabelRelacionesSelectReporteTarjetaCreditoDescuento;
	//public JList<Reporte> jListRelacionesSelectReporteTarjetaCreditoDescuento;
	//public JScrollPane jScrollRelacionesSelectReporteTarjetaCreditoDescuento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTarjetaCreditoDescuento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTarjetaCreditoDescuento;
	//public JLabel jLabelTiposArchivoReporteDinamicoTarjetaCreditoDescuento;
	
		
	//public JLabel jLabelArchivoImportacionTarjetaCreditoDescuento;	
	//public JLabel jLabelPathArchivoImportacionTarjetaCreditoDescuento;
	//protected JTextField jTextFieldPathArchivoImportacionTarjetaCreditoDescuento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTarjetaCreditoDescuento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento;
	
	//public JLabel jLabelColumnaCategoriaValorTarjetaCreditoDescuento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTarjetaCreditoDescuento;
	
	//public JLabel jLabelColumnasValoresGraficoTarjetaCreditoDescuento;
	//public JList<Reporte> jListColumnasValoresGraficoTarjetaCreditoDescuento;
	//public JScrollPane jScrollColumnasValoresGraficoTarjetaCreditoDescuento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTarjetaCreditoDescuento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTarjetaCreditoDescuento;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTarjetaCreditoDescuento;
	public JPanel jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento;
	public JButton jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento;
	
	public JPanel jPanelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento;
	public JLabel jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento;
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuentoUpdate= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TarjetaCreditoDescuentoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDescuentoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDescuentoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDescuentoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTarjetaCreditoDescuento)	{
		this.jButtonRecargarInformacionTarjetaCreditoDescuento = jButtonRecargarInformacionTarjetaCreditoDescuento;
	}
	
	public JButton getjButtonProcesarInformacionTarjetaCreditoDescuento() {
		return this.jButtonProcesarInformacionTarjetaCreditoDescuento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTarjetaCreditoDescuento)	{
		this.jButtonProcesarInformacionTarjetaCreditoDescuento = jButtonProcesarInformacionTarjetaCreditoDescuento;
	}
	
	
	public JButton getjButtonRecargarInformacionTarjetaCreditoDescuento() {
		return this.jButtonRecargarInformacionTarjetaCreditoDescuento;
	}
	
	
	public List<TarjetaCreditoDescuento> gettarjetacreditodescuentos() {
		return this.tarjetacreditodescuentos;
	}

	public void settarjetacreditodescuentos(List<TarjetaCreditoDescuento> tarjetacreditodescuentos) {
		this.tarjetacreditodescuentos = tarjetacreditodescuentos;
	}
	
	public List<TarjetaCreditoDescuento> gettarjetacreditodescuentosAux() {
		return this.tarjetacreditodescuentosAux;
	}

	public void settarjetacreditodescuentosAux(List<TarjetaCreditoDescuento> tarjetacreditodescuentosAux) {
		this.tarjetacreditodescuentosAux = tarjetacreditodescuentosAux;
	}
	
	public List<TarjetaCreditoDescuento> gettarjetacreditodescuentosEliminados() {
		return this.tarjetacreditodescuentosEliminados;
	}

	public void setTarjetaCreditoDescuentosEliminados(List<TarjetaCreditoDescuento> tarjetacreditodescuentosEliminados) {
		this.tarjetacreditodescuentosEliminados = tarjetacreditodescuentosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTarjetaCreditoDescuento() {
		return jComboBoxTiposSeleccionarTarjetaCreditoDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposSeleccionarTarjetaCreditoDescuento) {
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento = jComboBoxTiposSeleccionarTarjetaCreditoDescuento;
	}
	
	public void setBorderResaltarTiposSeleccionarTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTarjetaCreditoDescuento() {
		return jTextFieldValorCampoGeneralTarjetaCreditoDescuento;
	}

	public void setjTextFieldValorCampoGeneralTarjetaCreditoDescuento(
			JTextField jTextFieldValorCampoGeneralTarjetaCreditoDescuento) {
		this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento = jTextFieldValorCampoGeneralTarjetaCreditoDescuento;
	}

	public void setBorderResaltarValorCampoGeneralTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTarjetaCreditoDescuento() {
		return this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento;
	}

	public void setjCheckBoxSeleccionarTodosTarjetaCreditoDescuento(
			JCheckBox jCheckBoxSeleccionarTodosTarjetaCreditoDescuento) {
		this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento = jCheckBoxSeleccionarTodosTarjetaCreditoDescuento;
	}

	public void setBorderResaltarSeleccionarTodosTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTarjetaCreditoDescuento() {
		return this.jCheckBoxSeleccionadosTarjetaCreditoDescuento;
	}

	public void setjCheckBoxSeleccionadosTarjetaCreditoDescuento(
			JCheckBox jCheckBoxSeleccionadosTarjetaCreditoDescuento) {
		this.jCheckBoxSeleccionadosTarjetaCreditoDescuento = jCheckBoxSeleccionadosTarjetaCreditoDescuento;
	}
	
	public void setBorderResaltarSeleccionadosTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTarjetaCreditoDescuento() {
		return this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposArchivosReportesTarjetaCreditoDescuento) {
		this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento = jComboBoxTiposArchivosReportesTarjetaCreditoDescuento;
	}

	public void setBorderResaltarTiposArchivosReportesTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTarjetaCreditoDescuento() {
		return this.jComboBoxTiposReportesTarjetaCreditoDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposReportesTarjetaCreditoDescuento) {
		this.jComboBoxTiposReportesTarjetaCreditoDescuento = jComboBoxTiposReportesTarjetaCreditoDescuento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTarjetaCreditoDescuento() {
	//	return jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTarjetaCreditoDescuento(
	//		JComboBox jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento) {
	//	this.jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento = jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento() {
	//	return jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento = jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento;
	//}
	
	public void setBorderResaltarTiposReportesTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTarjetaCreditoDescuento() {
		return this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposGraficosReportesTarjetaCreditoDescuento) {
		this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento = jComboBoxTiposGraficosReportesTarjetaCreditoDescuento;
	}
	
	public void setBorderResaltarTiposGraficosReportesTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTarjetaCreditoDescuento() {
		return this.jComboBoxTiposPaginacionTarjetaCreditoDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposPaginacionTarjetaCreditoDescuento) {
		this.jComboBoxTiposPaginacionTarjetaCreditoDescuento = jComboBoxTiposPaginacionTarjetaCreditoDescuento;
	}
	
	public void setBorderResaltarTiposPaginacionTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTarjetaCreditoDescuento() {
		return this.jComboBoxTiposRelacionesTarjetaCreditoDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTarjetaCreditoDescuento() {
		return this.jComboBoxTiposAccionesTarjetaCreditoDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposRelacionesTarjetaCreditoDescuento) {
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento = jComboBoxTiposRelacionesTarjetaCreditoDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposAccionesTarjetaCreditoDescuento) {
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento = jComboBoxTiposAccionesTarjetaCreditoDescuento;
	}
	
	public void setBorderResaltarTiposRelacionesTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTarjetaCreditoDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTarjetaCreditoDescuento() {
	//	return jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento;
	//}

	//public void setjCheckBoxConGraficoDinamicoTarjetaCreditoDescuento(
	//		JCheckBox jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento) {
	//	this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento = jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTarjetaCreditoDescuento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTarjetaCreditoDescuento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento .setBorder(borderResaltar);		
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
		this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
		
		this.tarjetacreditodescuentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetacreditodescuentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TarjetaCreditoDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TarjetaCreditoDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TarjetaCreditoDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TarjetaCreditoDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TarjetaCreditoDescuentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarjeta Credito Descuento MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
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
		
		TarjetaCreditoDescuentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTarjetaCreditoDescuento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"nuevo","nuevo","Nuevo"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"duplicar","duplicar","Duplicar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"copiar","copiar","Copiar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"ver_form","ver_form","Ver"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"recargar","recargar","Recargar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,
							"cerrar","cerrar","Salir"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento;
			
				this.jButtonProcesarInformacionToolBarTarjetaCreditoDescuento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTarjetaCreditoDescuento;
				
		//protected JButton jButtonModificarToolBarTarjetaCreditoDescuento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTarjetaCreditoDescuento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTarjetaCreditoDescuento=new JMenuMe("General");
		this.jmenuArchivoTarjetaCreditoDescuento=new JMenuMe("Archivo");
		this.jmenuAccionesTarjetaCreditoDescuento=new JMenuMe("Acciones");
		this.jmenuDatosTarjetaCreditoDescuento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTarjetaCreditoDescuento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTarjetaCreditoDescuento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTarjetaCreditoDescuento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTarjetaCreditoDescuento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTarjetaCreditoDescuento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTarjetaCreditoDescuento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTarjetaCreditoDescuento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTarjetaCreditoDescuento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTarjetaCreditoDescuento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTarjetaCreditoDescuento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTarjetaCreditoDescuento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTarjetaCreditoDescuento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTarjetaCreditoDescuento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTarjetaCreditoDescuento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTarjetaCreditoDescuento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTarjetaCreditoDescuento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTarjetaCreditoDescuento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTarjetaCreditoDescuento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTarjetaCreditoDescuento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTarjetaCreditoDescuento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTarjetaCreditoDescuento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTarjetaCreditoDescuento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTarjetaCreditoDescuento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTarjetaCreditoDescuento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTarjetaCreditoDescuento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTarjetaCreditoDescuento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTarjetaCreditoDescuento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTarjetaCreditoDescuento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTarjetaCreditoDescuento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTarjetaCreditoDescuento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTarjetaCreditoDescuento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTarjetaCreditoDescuento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTarjetaCreditoDescuento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTarjetaCreditoDescuento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTarjetaCreditoDescuento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTarjetaCreditoDescuento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTarjetaCreditoDescuento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTarjetaCreditoDescuento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTarjetaCreditoDescuento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTarjetaCreditoDescuento.add(this.jMenuItemCerrarTarjetaCreditoDescuento);
			
			this.jmenuAccionesTarjetaCreditoDescuento.add(this.jMenuItemNuevoTarjetaCreditoDescuento);
			this.jmenuAccionesTarjetaCreditoDescuento.add(this.jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento);
			this.jmenuAccionesTarjetaCreditoDescuento.add(this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento);
			this.jmenuAccionesTarjetaCreditoDescuento.add(this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento);		
			this.jmenuAccionesTarjetaCreditoDescuento.add(this.jMenuItemDuplicarTarjetaCreditoDescuento);		
			this.jmenuAccionesTarjetaCreditoDescuento.add(this.jMenuItemCopiarTarjetaCreditoDescuento);		
			this.jmenuAccionesTarjetaCreditoDescuento.add(this.jMenuItemVerFormTarjetaCreditoDescuento);		
			
			this.jmenuDatosTarjetaCreditoDescuento.add(this.jMenuItemRecargarInformacionTarjetaCreditoDescuento);				
			this.jmenuDatosTarjetaCreditoDescuento.add(this.jMenuItemAnterioresTarjetaCreditoDescuento);				
			this.jmenuDatosTarjetaCreditoDescuento.add(this.jMenuItemSiguientesTarjetaCreditoDescuento);				
			this.jmenuDatosTarjetaCreditoDescuento.add(this.jMenuItemAbrirOrderByTarjetaCreditoDescuento);				
			this.jmenuDatosTarjetaCreditoDescuento.add(this.jMenuItemMostrarOcultarTarjetaCreditoDescuento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTarjetaCreditoDescuento.add(this.jMenuItemGuardarCambiosTarjetaCreditoDescuento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTarjetaCreditoDescuento.add(this.jmenuArchivoTarjetaCreditoDescuento);		
			this.jmenuBarTarjetaCreditoDescuento.add(this.jmenuAccionesTarjetaCreditoDescuento);		
			this.jmenuBarTarjetaCreditoDescuento.add(this.jmenuDatosTarjetaCreditoDescuento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTarjetaCreditoDescuento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTarjetaCreditoDescuento() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento.setToolTipText("Buscar Por Tarjeta Credito ");
		this.jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento= new JButtonMe();
		this.jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento.setText("Buscar");
		this.jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento.setToolTipText("Buscar Por Tarjeta Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento,"buscar_button","Buscar Por Tarjeta Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento = new JLabelMe();
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setText("Tarjeta Credito :");
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setToolTipText("Tarjeta Credito");
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento= new JComboBoxMe();
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTarjetaCreditoDescuento=new JTabbedPane();


		this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTarjetaCreditoDescuento = new TarjetaCreditoDescuentoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tarjeta Credito Descuento DATOS");
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento = new TarjetaCreditoDescuentoDetalleFormJInternalFrame(jDesktopPane,this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones(),this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento = null;//new TarjetaCreditoDescuentoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTarjetaCreditoDescuento= new GridBagLayout();
		
		
		this.jTableDatosTarjetaCreditoDescuento = new JTableMe();      
		
		String sToolTipTarjetaCreditoDescuento="";
		sToolTipTarjetaCreditoDescuento=TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTarjetaCreditoDescuento+="(PuntoVenta.TarjetaCreditoDescuento)";
		}
		
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTarjetaCreditoDescuento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTarjetaCreditoDescuento.setToolTipText(sToolTipTarjetaCreditoDescuento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTarjetaCreditoDescuento);
		this.jTableDatosTarjetaCreditoDescuento.setAutoCreateRowSorter(true);
		this.jTableDatosTarjetaCreditoDescuento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTarjetaCreditoDescuento.setRowSelectionAllowed(true);
		this.jTableDatosTarjetaCreditoDescuento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonDuplicarTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonCopiarTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonVerFormTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonNuevoRelacionesTarjetaCreditoDescuento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonCerrarTarjetaCreditoDescuento = new JButtonMe();
		
		this.jScrollPanelDatosTarjetaCreditoDescuento = new JScrollPane();   
        this.jScrollPanelDatosGeneralTarjetaCreditoDescuento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tarjeta Credito Descuento";
		
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Descuentos" + this.sPath));
		} else {
			this.jScrollPanelDatosTarjetaCreditoDescuento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTarjetaCreditoDescuento.setToolTipText("Acciones");
        this.jPanelAccionesTarjetaCreditoDescuento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento=new ReporteDinamicoJInternalFrame(TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTarjetaCreditoDescuento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTarjetaCreditoDescuento=new ImportacionJInternalFrame(TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTarjetaCreditoDescuento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTarjetaCreditoDescuento = new JButtonMe();
		
		this.jButtonAbrirOrderByTarjetaCreditoDescuento.setText("Orden");
		this.jButtonAbrirOrderByTarjetaCreditoDescuento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTarjetaCreditoDescuento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTarjetaCreditoDescuento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCreditoDescuento,false,this);
			
			//this.cargarOrderByTarjetaCreditoDescuento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTarjetaCreditoDescuento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCreditoDescuento,true,this);
			
			//this.cargarOrderByTarjetaCreditoDescuento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTarjetaCreditoDescuento.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosTarjetaCreditoDescuento.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosTarjetaCreditoDescuento.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosTarjetaCreditoDescuento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTarjetaCreditoDescuento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTarjetaCreditoDescuento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTarjetaCreditoDescuento.setText("Nuevo");
		this.jButtonDuplicarTarjetaCreditoDescuento.setText("Duplicar");
		this.jButtonCopiarTarjetaCreditoDescuento.setText("Copiar");
		this.jButtonVerFormTarjetaCreditoDescuento.setText("Ver");
		this.jButtonNuevoRelacionesTarjetaCreditoDescuento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.setText("Guardar");
		this.jButtonCerrarTarjetaCreditoDescuento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTarjetaCreditoDescuento,"nuevo_button","Nuevo",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTarjetaCreditoDescuento,"duplicar_button","Duplicar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTarjetaCreditoDescuento,"copiar_button","Copiar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTarjetaCreditoDescuento,"ver_form","Ver",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTarjetaCreditoDescuento,"nuevorelaciones_button","Nuevo Rel",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento,"guardarcambiostabla_button","Guardar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTarjetaCreditoDescuento,"cerrar_button","Salir",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTarjetaCreditoDescuento.setToolTipText("Nuevo"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTarjetaCreditoDescuento.setToolTipText("Duplicar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTarjetaCreditoDescuento.setToolTipText("Copiar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTarjetaCreditoDescuento.setToolTipText("Ver"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTarjetaCreditoDescuento.setToolTipText("Nuevo Rel"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.setToolTipText("Guardar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTarjetaCreditoDescuento.setToolTipText("Salir"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTarjetaCreditoDescuento";
		inputMap = this.jButtonNuevoTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTarjetaCreditoDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTarjetaCreditoDescuento"));
		
		//DUPLICAR
		sMapKey = "DuplicarTarjetaCreditoDescuento";
		inputMap = this.jButtonDuplicarTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTarjetaCreditoDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTarjetaCreditoDescuento"));
		
		//COPIAR
		sMapKey = "CopiarTarjetaCreditoDescuento";
		inputMap = this.jButtonCopiarTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTarjetaCreditoDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTarjetaCreditoDescuento"));
		
		//VEr FORM
		sMapKey = "VerFormTarjetaCreditoDescuento";
		inputMap = this.jButtonVerFormTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTarjetaCreditoDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTarjetaCreditoDescuento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTarjetaCreditoDescuento";
		inputMap = this.jButtonNuevoRelacionesTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTarjetaCreditoDescuento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTarjetaCreditoDescuento";
		inputMap = this.jButtonModificarTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTarjetaCreditoDescuento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTarjetaCreditoDescuento";
		inputMap = this.jButtonCerrarTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTarjetaCreditoDescuento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTarjetaCreditoDescuento";
		inputMap = this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTarjetaCreditoDescuento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TarjetaCreditoDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TarjetaCreditoDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TarjetaCreditoDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TarjetaCreditoDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TarjetaCreditoDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTarjetaCreditoDescuento.setName("jPanelParametrosReportesTarjetaCreditoDescuento"); 
		
		this.jPanelParametrosReportesAccionesTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTarjetaCreditoDescuento.setName("jPanelParametrosReportesAccionesTarjetaCreditoDescuento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonRecargarInformacionTarjetaCreditoDescuento.setText("Recargar");
		this.jButtonRecargarInformacionTarjetaCreditoDescuento.setToolTipText("Recargar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTarjetaCreditoDescuento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonProcesarInformacionTarjetaCreditoDescuento.setText("Procesar");
		this.jButtonProcesarInformacionTarjetaCreditoDescuento.setToolTipText("Procesar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTarjetaCreditoDescuento.setVisible(false);
			
		this.jButtonProcesarInformacionTarjetaCreditoDescuento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTarjetaCreditoDescuento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTarjetaCreditoDescuento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.setText("TIPO");       
		this.jComboBoxTiposReportesTarjetaCreditoDescuento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.setText("Paginacion");
		this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.setText("Accion");
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setText("Accion");
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.setText("Accion");
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTarjetaCreditoDescuento = new JLabelMe();
		
		this.jLabelAccionesTarjetaCreditoDescuento.setText("Acciones");		
		this.jLabelAccionesTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTarjetaCreditoDescuento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTarjetaCreditoDescuento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTarjetaCreditoDescuento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento.setText("Graf.");
		this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTarjetaCreditoDescuento = new JButtonMe();
		//this.jButtonAnterioresTarjetaCreditoDescuento.setText("<<");
        this.jButtonAnterioresTarjetaCreditoDescuento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTarjetaCreditoDescuento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTarjetaCreditoDescuento = new JButtonMe();
		//this.jButtonSiguientesTarjetaCreditoDescuento.setText(">>");
        this.jButtonSiguientesTarjetaCreditoDescuento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTarjetaCreditoDescuento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento.setText("Nue");
        this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento,"nuevoguardarcambios_button","Nue",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTarjetaCreditoDescuento";
		inputMap = this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTarjetaCreditoDescuento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTarjetaCreditoDescuento";
		inputMap = this.jButtonRecargarInformacionTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTarjetaCreditoDescuento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTarjetaCreditoDescuento";
		inputMap = this.jButtonSiguientesTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTarjetaCreditoDescuento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTarjetaCreditoDescuento";
		inputMap = this.jButtonAnterioresTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTarjetaCreditoDescuento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTarjetaCreditoDescuento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTarjetaCreditoDescuento.setMinimumSize(new Dimension(this.getWidth(),TarjetaCreditoDescuentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoDescuentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTarjetaCreditoDescuento.setMaximumSize(new Dimension(this.getWidth(),TarjetaCreditoDescuentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoDescuentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTarjetaCreditoDescuento.setPreferredSize(new Dimension(this.getWidth(),TarjetaCreditoDescuentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoDescuentoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTarjetaCreditoDescuento = new GridBagLayout();

			this.jPanelPaginacionTarjetaCreditoDescuento.setLayout(gridaBagLayoutPaginacionTarjetaCreditoDescuento);						
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonAnterioresTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
					
						
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
			
			this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
						
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
			this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonSiguientesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonNuevoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
						
			
			
			if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 1;
				this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			}
			
			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonDuplicarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonCopiarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonVerFormTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTarjetaCreditoDescuento.add(this.jButtonCerrarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		
		
		this.jButtonRecargarInformacionTarjetaCreditoDescuento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTarjetaCreditoDescuento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTarjetaCreditoDescuento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTarjetaCreditoDescuento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTarjetaCreditoDescuento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTarjetaCreditoDescuento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTarjetaCreditoDescuento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTarjetaCreditoDescuento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTarjetaCreditoDescuento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTarjetaCreditoDescuento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTarjetaCreditoDescuento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TarjetaCreditoDescuento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TarjetaCreditoDescuento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TarjetaCreditoDescuento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TarjetaCreditoDescuento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTarjetaCreditoDescuento.setLayout(gridaBagParametrosReportesTarjetaCreditoDescuento);
			this.jPanelParametrosReportesAccionesTarjetaCreditoDescuento.setLayout(gridaBagParametrosReportesAccionesTarjetaCreditoDescuento);
			
			
			this.jPanelParametrosAuxiliar1TarjetaCreditoDescuento.setLayout(gridaBagParametrosAuxiliar1TarjetaCreditoDescuento);
			this.jPanelParametrosAuxiliar2TarjetaCreditoDescuento.setLayout(gridaBagParametrosAuxiliar2TarjetaCreditoDescuento);
			this.jPanelParametrosAuxiliar3TarjetaCreditoDescuento.setLayout(gridaBagParametrosAuxiliar3TarjetaCreditoDescuento);
			this.jPanelParametrosAuxiliar4TarjetaCreditoDescuento.setLayout(gridaBagParametrosAuxiliar4TarjetaCreditoDescuento);
			//this.jPanelParametrosAuxiliar5TarjetaCreditoDescuento.setLayout(gridaBagParametrosAuxiliar2TarjetaCreditoDescuento);			
			
			
			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jButtonRecargarInformacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCreditoDescuento.add(this.jComboBoxTiposPaginacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCreditoDescuento.add(this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCreditoDescuento.add(this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jPanelParametrosAuxiliar1TarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TarjetaCreditoDescuento.add(this.jComboBoxTiposReportesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);																		
			
			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TarjetaCreditoDescuento.add(this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jPanelParametrosAuxiliar4TarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jComboBoxTiposReportesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jCheckBoxGenerarReporteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jPanelParametrosAuxiliar2TarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jLabelAccionesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jButtonAbrirOrderByTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
			
			
			/*
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetaCreditoDescuento.add(this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);															
				
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetaCreditoDescuento.add(this.jCheckBoxSeleccionadosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);															
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetaCreditoDescuento.add(this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jPanelParametrosAuxiliar3TarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jComboBoxTiposAccionesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
	
				
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCreditoDescuento.add(this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTarjetaCreditoDescuento = new GridBagLayout();

			this.jScrollPanelDatosTarjetaCreditoDescuento.setLayout(gridaBagLayoutDatosTarjetaCreditoDescuento);
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
			
			this.jScrollPanelDatosTarjetaCreditoDescuento.add(this.jTableDatosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTarjetaCreditoDescuento.setViewportView(this.jTableDatosTarjetaCreditoDescuento);
		this.jTableDatosTarjetaCreditoDescuento.setFillsViewportHeight(true);
		this.jTableDatosTarjetaCreditoDescuento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTarjetaCreditoDescuento= new GridBagLayout();
		this.jPanelAccionesTarjetaCreditoDescuento.setLayout(gridaBagLayoutAccionesTarjetaCreditoDescuento);
		
		
		/*	
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
			
		this.jPanelAccionesTarjetaCreditoDescuento.add(this.jButtonNuevoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoDescuento= new GridBagLayout();
		gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoDescuento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoDescuento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoDescuento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoDescuento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento.setLayout(gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoDescuento);

		gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
		jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento.add(jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento, gridBagConstraintsTarjetaCreditoDescuento);

		gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
		jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento.add(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento, gridBagConstraintsTarjetaCreditoDescuento);

		gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoDescuento.gridy = 1;
		gridBagConstraintsTarjetaCreditoDescuento.gridx =1;
		jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento.add(jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento, gridBagConstraintsTarjetaCreditoDescuento);

		jTabbedPaneBusquedasTarjetaCreditoDescuento.addTab("1.-Por Tarjeta Credito ", jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento);
		jTabbedPaneBusquedasTarjetaCreditoDescuento.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTarjetaCreditoDescuento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();						
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;		
			//this.gridBagConstraintsTarjetaCreditoDescuento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;		
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTarjetaCreditoDescuento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;		
			this.gridBagConstraintsTarjetaCreditoDescuento.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);								
		
		
		/*
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		*/		
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx =0;
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTarjetaCreditoDescuento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
				
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTarjetaCreditoDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTarjetaCreditoDescuento = new GridBagLayout();
			this.jPanelBusquedasParametrosTarjetaCreditoDescuento.setLayout(gridaBagLayoutBusquedasParametrosTarjetaCreditoDescuento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTarjetaCreditoDescuento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			
			
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
			
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTarjetaCreditoDescuento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTarjetaCreditoDescuento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTarjetaCreditoDescuento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.setName("jPanelReporteDinamicoTarjetaCreditoDescuento"); 
		
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.setLayout(gridaBagLayoutReporteDinamicoTarjetaCreditoDescuento);
		
		
		this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTarjetaCreditoDescuento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setResizable(true);
	    this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setClosable(true);
	    this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Descuentos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelColumnasSelectReporteTarjetaCreditoDescuento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jLabelColumnasSelectReporteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTarjetaCreditoDescuento = new JList<Reporte>();
		this.jListColumnasSelectReporteTarjetaCreditoDescuento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTarjetaCreditoDescuento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTarjetaCreditoDescuento=new JScrollPane(this.jListColumnasSelectReporteTarjetaCreditoDescuento);
			
			this.jScrollColumnasSelectReporteTarjetaCreditoDescuento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTarjetaCreditoDescuento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTarjetaCreditoDescuento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jListColumnasSelectReporteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jScrollColumnasSelectReporteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelRelacionesSelectReporteTarjetaCreditoDescuento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTarjetaCreditoDescuento = new JList<Reporte>();
		this.jListRelacionesSelectReporteTarjetaCreditoDescuento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTarjetaCreditoDescuento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTarjetaCreditoDescuento=new JScrollPane(this.jListRelacionesSelectReporteTarjetaCreditoDescuento);
			
			this.jScrollRelacionesSelectReporteTarjetaCreditoDescuento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTarjetaCreditoDescuento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTarjetaCreditoDescuento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento = new JComboBoxMe();
		this.jListColumnasValoresGraficoTarjetaCreditoDescuento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelConGraficoDinamicoTarjetaCreditoDescuento.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jLabelConGraficoDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jCheckBoxConGraficoDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTarjetaCreditoDescuento.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jLabelColumnaCategoriaGraficoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelColumnaCategoriaValorTarjetaCreditoDescuento.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jLabelColumnaCategoriaValorTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTarjetaCreditoDescuento.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTarjetaCreditoDescuento.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jComboBoxColumnaCategoriaValorTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelColumnasValoresGraficoTarjetaCreditoDescuento.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jLabelColumnasValoresGraficoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTarjetaCreditoDescuento = new JList<Reporte>();
		this.jListColumnasValoresGraficoTarjetaCreditoDescuento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTarjetaCreditoDescuento.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTarjetaCreditoDescuento=new JScrollPane(this.jListColumnasValoresGraficoTarjetaCreditoDescuento);
			
			this.jScrollColumnasValoresGraficoTarjetaCreditoDescuento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTarjetaCreditoDescuento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTarjetaCreditoDescuento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jListColumnasSelectReporteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jScrollColumnasValoresGraficoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTarjetaCreditoDescuento.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jLabelTiposGraficosReportesDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoDescuento.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTarjetaCreditoDescuento.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jComboBoxTiposGraficosReportesDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoDescuento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuento.setToolTipText("Generar EXCEL"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jComboBoxTiposReportesDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoDescuento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTarjetaCreditoDescuento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTarjetaCreditoDescuento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTarjetaCreditoDescuento.setToolTipText("Generar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jButtonGenerarReporteDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTarjetaCreditoDescuento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTarjetaCreditoDescuento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTarjetaCreditoDescuento.setToolTipText("Cancelar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCreditoDescuento.add(this.jButtonCerrarReporteDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTarjetaCreditoDescuento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento= new JScrollPane(jPanelReporteDinamicoTarjetaCreditoDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Descuentos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTarjetaCreditoDescuento);
		this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getContentPane().add(this.jScrollPanelReporteDinamicoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTarjetaCreditoDescuento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTarjetaCreditoDescuento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTarjetaCreditoDescuento.setName("jPanelImportacionTarjetaCreditoDescuento"); 
		
		this.jPanelImportacionTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTarjetaCreditoDescuento.setLayout(gridaBagLayoutImportacionTarjetaCreditoDescuento);
		
		
		this.jInternalFrameImportacionTarjetaCreditoDescuento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTarjetaCreditoDescuento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTarjetaCreditoDescuento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTarjetaCreditoDescuento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTarjetaCreditoDescuento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTarjetaCreditoDescuento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTarjetaCreditoDescuento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setResizable(true);
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setClosable(true);
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTarjetaCreditoDescuento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTarjetaCreditoDescuento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTarjetaCreditoDescuento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setResizable(true);
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setClosable(true);
	    this.jInternalFrameImportacionTarjetaCreditoDescuento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Descuentos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelArchivoImportacionTarjetaCreditoDescuento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTarjetaCreditoDescuento.add(this.jLabelArchivoImportacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTarjetaCreditoDescuento = new JFileChooser();		
		this.jFileChooserImportacionTarjetaCreditoDescuento.setToolTipText("ESCOGER ARCHIVO"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonAbrirImportacionTarjetaCreditoDescuento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTarjetaCreditoDescuento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTarjetaCreditoDescuento.setToolTipText("Generar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCreditoDescuento.add(this.jButtonAbrirImportacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTarjetaCreditoDescuento = new JLabelMe();

		this.jLabelPathArchivoImportacionTarjetaCreditoDescuento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTarjetaCreditoDescuento.add(this.jLabelPathArchivoImportacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTarjetaCreditoDescuento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTarjetaCreditoDescuento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTarjetaCreditoDescuento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTarjetaCreditoDescuento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCreditoDescuento.add(this.jTextFieldPathArchivoImportacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonGenerarImportacionTarjetaCreditoDescuento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTarjetaCreditoDescuento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTarjetaCreditoDescuento.setToolTipText("Generar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCreditoDescuento.add(this.jButtonGenerarImportacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonCerrarImportacionTarjetaCreditoDescuento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTarjetaCreditoDescuento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTarjetaCreditoDescuento.setToolTipText("Cancelar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCreditoDescuento.add(this.jButtonCerrarImportacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTarjetaCreditoDescuento = new GridBagLayout();
		
		this.jScrollPanelImportacionTarjetaCreditoDescuento= new JScrollPane(jPanelImportacionTarjetaCreditoDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iPosXImportacion;
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTarjetaCreditoDescuento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTarjetaCreditoDescuento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTarjetaCreditoDescuento);
		this.jInternalFrameImportacionTarjetaCreditoDescuento.getContentPane().add(this.jScrollPanelImportacionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTarjetaCreditoDescuento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTarjetaCreditoDescuento = new JButtonMe();
			this.jButtonAbrirOrderByTarjetaCreditoDescuento.setText("Orden");
			this.jButtonAbrirOrderByTarjetaCreditoDescuento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTarjetaCreditoDescuento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTarjetaCreditoDescuento";
			inputMap = this.jButtonAbrirOrderByTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTarjetaCreditoDescuento"));
		
		
			GridBagLayout gridaBagLayoutOrderByTarjetaCreditoDescuento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTarjetaCreditoDescuento.setName("jPanelOrderByTarjetaCreditoDescuento"); 
			
			this.jPanelOrderByTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTarjetaCreditoDescuento.setLayout(gridaBagLayoutOrderByTarjetaCreditoDescuento);
			
			
			this.jTableDatosTarjetaCreditoDescuentoOrderBy = new JTableMe();        
			this.jTableDatosTarjetaCreditoDescuentoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTarjetaCreditoDescuentoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTarjetaCreditoDescuentoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTarjetaCreditoDescuentoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTarjetaCreditoDescuentoOrderBy.setViewportView(this.jTableDatosTarjetaCreditoDescuentoOrderBy);
			this.jTableDatosTarjetaCreditoDescuentoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTarjetaCreditoDescuentoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTarjetaCreditoDescuento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTarjetaCreditoDescuento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTarjetaCreditoDescuento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTarjetaCreditoDescuento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setTitle("Orden");
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setResizable(true);
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setClosable(true);
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Descuentos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTarjetaCreditoDescuento.ipady =150;
				
			this.jPanelOrderByTarjetaCreditoDescuento.add(jScrollPanelDatosTarjetaCreditoDescuentoOrderBy, this.gridBagConstraintsTarjetaCreditoDescuento);//this.jTableDatosTarjetaCreditoDescuentoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTarjetaCreditoDescuento = new JButtonMe();
			this.jButtonCerrarOrderByTarjetaCreditoDescuento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTarjetaCreditoDescuento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTarjetaCreditoDescuento.setToolTipText("Cancelar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTarjetaCreditoDescuento.add(this.jButtonCerrarOrderByTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTarjetaCreditoDescuento = new GridBagLayout();
			
			this.jScrollPanelOrderByTarjetaCreditoDescuento= new JScrollPane(jPanelOrderByTarjetaCreditoDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iPosYOrderBy;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTarjetaCreditoDescuento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTarjetaCreditoDescuento);
			
			this.jInternalFrameOrderByTarjetaCreditoDescuento.getContentPane().add(this.jScrollPanelOrderByTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
		
		} else {
			this.jButtonAbrirOrderByTarjetaCreditoDescuento = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTarjetaCreditoDescuento.getRowHeight();//TarjetaCreditoDescuentoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TarjetaCreditoDescuentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento.isSelected()) {
					iHeightTable=TarjetaCreditoDescuentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TarjetaCreditoDescuentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TarjetaCreditoDescuentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TarjetaCreditoDescuentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTarjetaCreditoDescuento.isSelected()) {
					iHeightTable=TarjetaCreditoDescuentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TarjetaCreditoDescuentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TarjetaCreditoDescuentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTarjetaCreditoDescuento!=null && this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy()!=null) {
			//if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTarjetaCreditoDescuento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTarjetaCreditoDescuento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTarjetaCreditoDescuento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetacreditodescuentos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TarjetaCreditoDescuento> TraerTarjetaCreditoDescuentoBeans(List<TarjetaCreditoDescuento> tarjetacreditodescuentos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentos) {
					
				if(!(TarjetaCreditoDescuentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TarjetaCreditoDescuentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tarjetacreditodescuento.setsDetalleGeneralEntityReporte(TarjetaCreditoDescuentoConstantesFunciones.getTarjetaCreditoDescuentoDescripcion(tarjetacreditodescuento));
										
					tarjetacreditodescuento.setes_corriente_descripcion(TarjetaCreditoDescuentoConstantesFunciones.getes_corrienteDescripcion(tarjetacreditodescuento));tarjetacreditodescuento.setcon_interes_descripcion(TarjetaCreditoDescuentoConstantesFunciones.getcon_interesDescripcion(tarjetacreditodescuento));	
					
						
					
				} else  {
							
					//tarjetacreditodescuento.setsDetalleGeneralEntityReporte(tarjetacreditodescuento.getsDetalleGeneralEntityReporte());
										
				}
				
				//tarjetacreditodescuentobeans.add(tarjetacreditodescuentobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tarjetacreditodescuentos;
    }
	//PARA REPORTES FIN
}
