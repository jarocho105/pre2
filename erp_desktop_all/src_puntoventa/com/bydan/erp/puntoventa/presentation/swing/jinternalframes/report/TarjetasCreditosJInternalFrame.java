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

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

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
import com.bydan.erp.puntoventa.util.report.TarjetasCreditosConstantesFunciones;

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
public class TarjetasCreditosJInternalFrame extends TarjetasCreditosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTarjetasCreditos;
	
	protected JMenuBar jmenuBarTarjetasCreditos;
	
	protected JMenu jmenuTarjetasCreditos;
	protected JMenu jmenuDatosTarjetasCreditos;
	protected JMenu jmenuArchivoTarjetasCreditos;
	protected JMenu jmenuAccionesTarjetasCreditos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTarjetasCreditos;	
	protected GridBagConstraints gridBagConstraintsTarjetasCreditos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TarjetasCreditosDetalleFormJInternalFrame jInternalFrameDetalleFormTarjetasCreditos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTarjetasCreditos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTarjetasCreditos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tarjetacredito="";
	
	public TarjetasCreditosSessionBean tarjetascreditosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TarjetasCreditos> tarjetascreditoss;		
	public List<TarjetasCreditos> tarjetascreditossEliminados;	
	public List<TarjetasCreditos> tarjetascreditossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTarjetasCreditos;		
	protected JButton jButtonAbrirOrderByTarjetasCreditos;
	
	
	//protected JPanel jPanelOrderByTarjetasCreditos;
	//public JScrollPane jScrollPanelOrderByTarjetasCreditos;	
	//protected JButton jButtonCerrarOrderByTarjetasCreditos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TarjetasCreditosLogic tarjetascreditosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTarjetasCreditos;
	public JScrollPane jScrollPanelDatosEdicionTarjetasCreditos;
	public JScrollPane jScrollPanelDatosGeneralTarjetasCreditos;
    
	
	
	//public JScrollPane jScrollPanelDatosTarjetasCreditosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTarjetasCreditos;
	//public JScrollPane jScrollPanelImportacionTarjetasCreditos;
	
	
	
	protected JPanel jPanelAccionesTarjetasCreditos;
	
    protected JPanel jPanelPaginacionTarjetasCreditos;
    protected JPanel jPanelParametrosReportesTarjetasCreditos;
	protected JPanel jPanelParametrosReportesAccionesTarjetasCreditos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TarjetasCreditos;
	protected JPanel jPanelParametrosAuxiliar2TarjetasCreditos;
	protected JPanel jPanelParametrosAuxiliar3TarjetasCreditos;
	protected JPanel jPanelParametrosAuxiliar4TarjetasCreditos;
	//protected JPanel jPanelParametrosAuxiliar5TarjetasCreditos;
	
	
	
	//protected JPanel jPanelReporteDinamicoTarjetasCreditos;
	//protected JPanel jPanelImportacionTarjetasCreditos;
	
	
	public JTable jTableDatosTarjetasCreditos;
	
	
	
	//public JTable jTableDatosTarjetasCreditosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTarjetasCreditos;
	protected JButton jButtonDuplicarTarjetasCreditos;
	protected JButton jButtonCopiarTarjetasCreditos;
	protected JButton jButtonVerFormTarjetasCreditos;
	protected JButton jButtonNuevoRelacionesTarjetasCreditos;
	protected JButton jButtonModificarTarjetasCreditos;
	
    protected JButton jButtonGuardarCambiosTablaTarjetasCreditos;
	protected JButton jButtonCerrarTarjetasCreditos;
	
	
	protected JButton jButtonRecargarInformacionTarjetasCreditos;
	protected JButton jButtonProcesarInformacionTarjetasCreditos;
	
	
	protected JButton jButtonAnterioresTarjetasCreditos;
	protected JButton jButtonSiguientesTarjetasCreditos;
	protected JButton jButtonNuevoGuardarCambiosTarjetasCreditos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTarjetasCreditos;
	//protected JButton jButtonCerrarReporteDinamicoTarjetasCreditos;
	//protected JButton jButtonGenerarExcelReporteDinamicoTarjetasCreditos;	
	
	
	
	//protected JButton jButtonAbrirImportacionTarjetasCreditos;
	//protected JButton jButtonGenerarImportacionTarjetasCreditos;
	//protected JButton jButtonCerrarImportacionTarjetasCreditos;
	//protected JFileChooser jFileChooserImportacionTarjetasCreditos;
	//protected File fileImportacionTarjetasCreditos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTarjetasCreditos;
	protected JButton jButtonDuplicarToolBarTarjetasCreditos;
	protected JButton jButtonNuevoRelacionesToolBarTarjetasCreditos;
	
	
	public JButton jButtonGuardarCambiosToolBarTarjetasCreditos;
	protected JButton jButtonCopiarToolBarTarjetasCreditos;
	protected JButton jButtonVerFormToolBarTarjetasCreditos;
	public JButton jButtonGuardarCambiosTablaToolBarTarjetasCreditos;
	protected JButton jButtonMostrarOcultarTablaToolBarTarjetasCreditos;
	protected JButton jButtonCerrarToolBarTarjetasCreditos;
	
	protected JButton jButtonRecargarInformacionToolBarTarjetasCreditos;
	protected JButton jButtonProcesarInformacionToolBarTarjetasCreditos;
	protected JButton jButtonAnterioresToolBarTarjetasCreditos;
	protected JButton jButtonSiguientesToolBarTarjetasCreditos;
	protected JButton jButtonNuevoGuardarCambiosToolBarTarjetasCreditos;
	protected JButton jButtonAbrirOrderByToolBarTarjetasCreditos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTarjetasCreditos;
	protected JMenuItem jMenuItemDuplicarTarjetasCreditos;
	protected JMenuItem jMenuItemNuevoRelacionesTarjetasCreditos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTarjetasCreditos;
	protected JMenuItem jMenuItemCopiarTarjetasCreditos;
	protected JMenuItem jMenuItemVerFormTarjetasCreditos;
	protected JMenuItem jMenuItemGuardarCambiosTablaTarjetasCreditos;
	protected JMenuItem jMenuItemCerrarTarjetasCreditos;
	protected JMenuItem jMenuItemDetalleCerrarTarjetasCreditos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTarjetasCreditos;
	protected JMenuItem jMenuItemDetalleMostarOcultarTarjetasCreditos;
	
	protected JMenuItem jMenuItemRecargarInformacionTarjetasCreditos;
	protected JMenuItem jMenuItemProcesarInformacionTarjetasCreditos;
	protected JMenuItem jMenuItemAnterioresTarjetasCreditos;
	protected JMenuItem jMenuItemSiguientesTarjetasCreditos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTarjetasCreditos;
	protected JMenuItem jMenuItemAbrirOrderByTarjetasCreditos;
	protected JMenuItem jMenuItemMostrarOcultarTarjetasCreditos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTarjetasCreditos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTarjetasCreditos;
	protected JCheckBox jCheckBoxSeleccionadosTarjetasCreditos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTarjetasCreditos;
	protected JCheckBox jCheckBoxConGraficoReporteTarjetasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTarjetasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTarjetasCreditos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTarjetasCreditos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTarjetasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTarjetasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTarjetasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTarjetasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTarjetasCreditos;
	protected JTextField jTextFieldValorCampoGeneralTarjetasCreditos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTarjetasCreditos;
	//public JList<Reporte> jListColumnasSelectReporteTarjetasCreditos;
	//public JScrollPane jScrollColumnasSelectReporteTarjetasCreditos;
	
	//public JLabel jLabelRelacionesSelectReporteTarjetasCreditos;
	//public JList<Reporte> jListRelacionesSelectReporteTarjetasCreditos;
	//public JScrollPane jScrollRelacionesSelectReporteTarjetasCreditos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTarjetasCreditos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTarjetasCreditos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTarjetasCreditos;
	//public JLabel jLabelTiposArchivoReporteDinamicoTarjetasCreditos;
	
		
	//public JLabel jLabelArchivoImportacionTarjetasCreditos;	
	//public JLabel jLabelPathArchivoImportacionTarjetasCreditos;
	//protected JTextField jTextFieldPathArchivoImportacionTarjetasCreditos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTarjetasCreditos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTarjetasCreditos;
	
	//public JLabel jLabelColumnaCategoriaValorTarjetasCreditos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTarjetasCreditos;
	
	//public JLabel jLabelColumnasValoresGraficoTarjetasCreditos;
	//public JList<Reporte> jListColumnasValoresGraficoTarjetasCreditos;
	//public JScrollPane jScrollColumnasValoresGraficoTarjetasCreditos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTarjetasCreditos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTarjetasCreditos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTarjetasCreditos;
	public JPanel jPanelBusquedaTarjetaCreditoTarjetasCreditos;
	public JButton jButtonBusquedaTarjetaCreditoTarjetasCreditos;
	
	public JPanel jPanelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos;
	public JLabel jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos;

	public JDateChooser jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos;
	public JButton jButtonfecha_inicioBusquedaTarjetaCreditoTarjetasCreditosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaTarjetaCreditoTarjetasCreditos;
	public JLabel jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos;
	//public JFormattedTextField jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos;

	public JDateChooser jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos;
	public JButton jButtonfecha_finBusquedaTarjetaCreditoTarjetasCreditosBusqueda= new JButtonMe();

	
	
	
	
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
	public TarjetasCreditosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetasCreditosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetasCreditosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetasCreditosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTarjetasCreditos)	{
		this.jButtonRecargarInformacionTarjetasCreditos = jButtonRecargarInformacionTarjetasCreditos;
	}
	
	public JButton getjButtonProcesarInformacionTarjetasCreditos() {
		return this.jButtonProcesarInformacionTarjetasCreditos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTarjetasCreditos)	{
		this.jButtonProcesarInformacionTarjetasCreditos = jButtonProcesarInformacionTarjetasCreditos;
	}
	
	
	public JButton getjButtonRecargarInformacionTarjetasCreditos() {
		return this.jButtonRecargarInformacionTarjetasCreditos;
	}
	
	
	public List<TarjetasCreditos> gettarjetascreditoss() {
		return this.tarjetascreditoss;
	}

	public void settarjetascreditoss(List<TarjetasCreditos> tarjetascreditoss) {
		this.tarjetascreditoss = tarjetascreditoss;
	}
	
	public List<TarjetasCreditos> gettarjetascreditossAux() {
		return this.tarjetascreditossAux;
	}

	public void settarjetascreditossAux(List<TarjetasCreditos> tarjetascreditossAux) {
		this.tarjetascreditossAux = tarjetascreditossAux;
	}
	
	public List<TarjetasCreditos> gettarjetascreditossEliminados() {
		return this.tarjetascreditossEliminados;
	}

	public void setTarjetasCreditossEliminados(List<TarjetasCreditos> tarjetascreditossEliminados) {
		this.tarjetascreditossEliminados = tarjetascreditossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTarjetasCreditos() {
		return jComboBoxTiposSeleccionarTarjetasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTarjetasCreditos(
			JComboBox jComboBoxTiposSeleccionarTarjetasCreditos) {
		this.jComboBoxTiposSeleccionarTarjetasCreditos = jComboBoxTiposSeleccionarTarjetasCreditos;
	}
	
	public void setBorderResaltarTiposSeleccionarTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTarjetasCreditos() {
		return jTextFieldValorCampoGeneralTarjetasCreditos;
	}

	public void setjTextFieldValorCampoGeneralTarjetasCreditos(
			JTextField jTextFieldValorCampoGeneralTarjetasCreditos) {
		this.jTextFieldValorCampoGeneralTarjetasCreditos = jTextFieldValorCampoGeneralTarjetasCreditos;
	}

	public void setBorderResaltarValorCampoGeneralTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTarjetasCreditos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTarjetasCreditos() {
		return this.jCheckBoxSeleccionarTodosTarjetasCreditos;
	}

	public void setjCheckBoxSeleccionarTodosTarjetasCreditos(
			JCheckBox jCheckBoxSeleccionarTodosTarjetasCreditos) {
		this.jCheckBoxSeleccionarTodosTarjetasCreditos = jCheckBoxSeleccionarTodosTarjetasCreditos;
	}

	public void setBorderResaltarSeleccionarTodosTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTarjetasCreditos() {
		return this.jCheckBoxSeleccionadosTarjetasCreditos;
	}

	public void setjCheckBoxSeleccionadosTarjetasCreditos(
			JCheckBox jCheckBoxSeleccionadosTarjetasCreditos) {
		this.jCheckBoxSeleccionadosTarjetasCreditos = jCheckBoxSeleccionadosTarjetasCreditos;
	}
	
	public void setBorderResaltarSeleccionadosTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTarjetasCreditos() {
		return this.jComboBoxTiposArchivosReportesTarjetasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTarjetasCreditos(
			JComboBox jComboBoxTiposArchivosReportesTarjetasCreditos) {
		this.jComboBoxTiposArchivosReportesTarjetasCreditos = jComboBoxTiposArchivosReportesTarjetasCreditos;
	}

	public void setBorderResaltarTiposArchivosReportesTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTarjetasCreditos() {
		return this.jComboBoxTiposReportesTarjetasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTarjetasCreditos(
			JComboBox jComboBoxTiposReportesTarjetasCreditos) {
		this.jComboBoxTiposReportesTarjetasCreditos = jComboBoxTiposReportesTarjetasCreditos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTarjetasCreditos() {
	//	return jComboBoxTiposReportesDinamicoTarjetasCreditos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTarjetasCreditos(
	//		JComboBox jComboBoxTiposReportesDinamicoTarjetasCreditos) {
	//	this.jComboBoxTiposReportesDinamicoTarjetasCreditos = jComboBoxTiposReportesDinamicoTarjetasCreditos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTarjetasCreditos() {
	//	return jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTarjetasCreditos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos = jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos;
	//}
	
	public void setBorderResaltarTiposReportesTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTarjetasCreditos() {
		return this.jComboBoxTiposGraficosReportesTarjetasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTarjetasCreditos(
			JComboBox jComboBoxTiposGraficosReportesTarjetasCreditos) {
		this.jComboBoxTiposGraficosReportesTarjetasCreditos = jComboBoxTiposGraficosReportesTarjetasCreditos;
	}
	
	public void setBorderResaltarTiposGraficosReportesTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTarjetasCreditos() {
		return this.jComboBoxTiposPaginacionTarjetasCreditos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTarjetasCreditos(
			JComboBox jComboBoxTiposPaginacionTarjetasCreditos) {
		this.jComboBoxTiposPaginacionTarjetasCreditos = jComboBoxTiposPaginacionTarjetasCreditos;
	}
	
	public void setBorderResaltarTiposPaginacionTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTarjetasCreditos() {
		return this.jComboBoxTiposRelacionesTarjetasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTarjetasCreditos() {
		return this.jComboBoxTiposAccionesTarjetasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTarjetasCreditos(
			JComboBox jComboBoxTiposRelacionesTarjetasCreditos) {
		this.jComboBoxTiposRelacionesTarjetasCreditos = jComboBoxTiposRelacionesTarjetasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTarjetasCreditos(
			JComboBox jComboBoxTiposAccionesTarjetasCreditos) {
		this.jComboBoxTiposAccionesTarjetasCreditos = jComboBoxTiposAccionesTarjetasCreditos;
	}
	
	public void setBorderResaltarTiposRelacionesTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTarjetasCreditos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTarjetasCreditos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTarjetasCreditos() {
	//	return jCheckBoxConGraficoDinamicoTarjetasCreditos;
	//}

	//public void setjCheckBoxConGraficoDinamicoTarjetasCreditos(
	//		JCheckBox jCheckBoxConGraficoDinamicoTarjetasCreditos) {
	//	this.jCheckBoxConGraficoDinamicoTarjetasCreditos = jCheckBoxConGraficoDinamicoTarjetasCreditos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTarjetasCreditos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTarjetasCreditos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTarjetasCreditos .setBorder(borderResaltar);		
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
		this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean();
		
		this.tarjetascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tarjetascreditosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TarjetasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TarjetasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TarjetasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TarjetasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TarjetasCreditosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarjeta Credito MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
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
		
		TarjetasCreditosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTarjetasCreditos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"nuevo","nuevo","Nuevo"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"duplicar","duplicar","Duplicar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"copiar","copiar","Copiar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"ver_form","ver_form","Ver"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"recargar","recargar","Buscar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTarjetasCreditos,this.jTtoolBarTarjetasCreditos,
							"cerrar","cerrar","Salir"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTarjetasCreditos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTarjetasCreditos;
			
				this.jButtonProcesarInformacionToolBarTarjetasCreditos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTarjetasCreditos;
				
		//protected JButton jButtonModificarToolBarTarjetasCreditos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTarjetasCreditos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTarjetasCreditos=new JMenuMe("General");
		this.jmenuArchivoTarjetasCreditos=new JMenuMe("Archivo");
		this.jmenuAccionesTarjetasCreditos=new JMenuMe("Acciones");
		this.jmenuDatosTarjetasCreditos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTarjetasCreditos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTarjetasCreditos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTarjetasCreditos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTarjetasCreditos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTarjetasCreditos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTarjetasCreditos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTarjetasCreditos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTarjetasCreditos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTarjetasCreditos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTarjetasCreditos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTarjetasCreditos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTarjetasCreditos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTarjetasCreditos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTarjetasCreditos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTarjetasCreditos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTarjetasCreditos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTarjetasCreditos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTarjetasCreditos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTarjetasCreditos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTarjetasCreditos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTarjetasCreditos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTarjetasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTarjetasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTarjetasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTarjetasCreditos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTarjetasCreditos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTarjetasCreditos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTarjetasCreditos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTarjetasCreditos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTarjetasCreditos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTarjetasCreditos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTarjetasCreditos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTarjetasCreditos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTarjetasCreditos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTarjetasCreditos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTarjetasCreditos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTarjetasCreditos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTarjetasCreditos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTarjetasCreditos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTarjetasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTarjetasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTarjetasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTarjetasCreditos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTarjetasCreditos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTarjetasCreditos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTarjetasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTarjetasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTarjetasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTarjetasCreditos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTarjetasCreditos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTarjetasCreditos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTarjetasCreditos.add(this.jMenuItemCerrarTarjetasCreditos);
			
			this.jmenuAccionesTarjetasCreditos.add(this.jMenuItemNuevoTarjetasCreditos);
			this.jmenuAccionesTarjetasCreditos.add(this.jMenuItemNuevoGuardarCambiosTarjetasCreditos);
			this.jmenuAccionesTarjetasCreditos.add(this.jMenuItemNuevoRelacionesTarjetasCreditos);
			this.jmenuAccionesTarjetasCreditos.add(this.jMenuItemGuardarCambiosTablaTarjetasCreditos);		
			this.jmenuAccionesTarjetasCreditos.add(this.jMenuItemDuplicarTarjetasCreditos);		
			this.jmenuAccionesTarjetasCreditos.add(this.jMenuItemCopiarTarjetasCreditos);		
			this.jmenuAccionesTarjetasCreditos.add(this.jMenuItemVerFormTarjetasCreditos);		
			
			this.jmenuDatosTarjetasCreditos.add(this.jMenuItemRecargarInformacionTarjetasCreditos);				
			this.jmenuDatosTarjetasCreditos.add(this.jMenuItemAnterioresTarjetasCreditos);				
			this.jmenuDatosTarjetasCreditos.add(this.jMenuItemSiguientesTarjetasCreditos);				
			this.jmenuDatosTarjetasCreditos.add(this.jMenuItemAbrirOrderByTarjetasCreditos);				
			this.jmenuDatosTarjetasCreditos.add(this.jMenuItemMostrarOcultarTarjetasCreditos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTarjetasCreditos.add(this.jMenuItemGuardarCambiosTarjetasCreditos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTarjetasCreditos.add(this.jmenuArchivoTarjetasCreditos);		
			this.jmenuBarTarjetasCreditos.add(this.jmenuAccionesTarjetasCreditos);		
			this.jmenuBarTarjetasCreditos.add(this.jmenuDatosTarjetasCreditos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTarjetasCreditos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTarjetasCreditos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaTarjetaCreditoTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaTarjetaCreditoTarjetasCreditos.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaTarjetaCreditoTarjetasCreditos= new JButtonMe();
		this.jButtonBusquedaTarjetaCreditoTarjetasCreditos.setText("Buscar");
		this.jButtonBusquedaTarjetaCreditoTarjetasCreditos.setToolTipText("Buscar Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaTarjetaCreditoTarjetasCreditos,"buscar_button","Buscar Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaTarjetaCreditoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos = new JLabelMe();
		jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos= new JDateChooser();
		jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setDate(new Date());
		jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos = new JLabelMe();
		jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setText("Fecha Fin :");
		jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos= new JDateChooser();
		jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setDate(new Date());
		jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasTarjetasCreditos=new JTabbedPane();


		this.jTabbedPaneBusquedasTarjetasCreditos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTarjetasCreditos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTarjetasCreditos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTarjetasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTarjetasCreditos = new TarjetasCreditosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tarjeta Credito DATOS");
			this.jInternalFrameDetalleFormTarjetasCreditos = new TarjetasCreditosDetalleFormJInternalFrame(jDesktopPane,this.tarjetascreditosSessionBean.getConGuardarRelaciones(),this.tarjetascreditosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTarjetasCreditos = null;//new TarjetasCreditosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTarjetasCreditos= new GridBagLayout();
		
		
		this.jTableDatosTarjetasCreditos = new JTableMe();      
		
		String sToolTipTarjetasCreditos="";
		sToolTipTarjetasCreditos=TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTarjetasCreditos+="(PuntoVenta.TarjetasCreditos)";
		}
		
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			sToolTipTarjetasCreditos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTarjetasCreditos.setToolTipText(sToolTipTarjetasCreditos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTarjetasCreditos);
		this.jTableDatosTarjetasCreditos.setAutoCreateRowSorter(true);
		this.jTableDatosTarjetasCreditos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTarjetasCreditos.setRowSelectionAllowed(true);
		this.jTableDatosTarjetasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTarjetasCreditos = new JButtonMe();
		this.jButtonDuplicarTarjetasCreditos = new JButtonMe();
		this.jButtonCopiarTarjetasCreditos = new JButtonMe();
		this.jButtonVerFormTarjetasCreditos = new JButtonMe();
		this.jButtonNuevoRelacionesTarjetasCreditos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTarjetasCreditos = new JButtonMe();
		this.jButtonCerrarTarjetasCreditos = new JButtonMe();
		
		this.jScrollPanelDatosTarjetasCreditos = new JScrollPane();   
        this.jScrollPanelDatosGeneralTarjetasCreditos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tarjeta Credito";
		
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosTarjetasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTarjetasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesTarjetasCreditos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTarjetasCreditos=new ReporteDinamicoJInternalFrame(TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTarjetasCreditos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTarjetasCreditos=new ImportacionJInternalFrame(TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTarjetasCreditos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTarjetasCreditos = new JButtonMe();
		
		this.jButtonAbrirOrderByTarjetasCreditos.setText("Orden");
		this.jButtonAbrirOrderByTarjetasCreditos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTarjetasCreditos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTarjetasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetasCreditos,false,this);
			
			//this.cargarOrderByTarjetasCreditos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTarjetasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetasCreditos,true,this);
			
			//this.cargarOrderByTarjetasCreditos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTarjetasCreditos.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosTarjetasCreditos.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosTarjetasCreditos.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosTarjetasCreditos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTarjetasCreditos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTarjetasCreditos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTarjetasCreditos.setText("Nuevo");
		this.jButtonDuplicarTarjetasCreditos.setText("Duplicar");
		this.jButtonCopiarTarjetasCreditos.setText("Copiar");
		this.jButtonVerFormTarjetasCreditos.setText("Ver");
		this.jButtonNuevoRelacionesTarjetasCreditos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTarjetasCreditos.setText("Guardar");
		this.jButtonCerrarTarjetasCreditos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTarjetasCreditos,"nuevo_button","Nuevo",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTarjetasCreditos,"duplicar_button","Duplicar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTarjetasCreditos,"copiar_button","Copiar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTarjetasCreditos,"ver_form","Ver",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTarjetasCreditos,"nuevorelaciones_button","Nuevo Rel",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTarjetasCreditos,"guardarcambiostabla_button","Guardar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTarjetasCreditos,"cerrar_button","Salir",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTarjetasCreditos.setToolTipText("Nuevo"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTarjetasCreditos.setToolTipText("Duplicar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTarjetasCreditos.setToolTipText("Copiar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTarjetasCreditos.setToolTipText("Ver"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTarjetasCreditos.setToolTipText("Nuevo Rel"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTarjetasCreditos.setToolTipText("Guardar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTarjetasCreditos.setToolTipText("Salir"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTarjetasCreditos";
		inputMap = this.jButtonNuevoTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTarjetasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTarjetasCreditos"));
		
		//DUPLICAR
		sMapKey = "DuplicarTarjetasCreditos";
		inputMap = this.jButtonDuplicarTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTarjetasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTarjetasCreditos"));
		
		//COPIAR
		sMapKey = "CopiarTarjetasCreditos";
		inputMap = this.jButtonCopiarTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTarjetasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTarjetasCreditos"));
		
		//VEr FORM
		sMapKey = "VerFormTarjetasCreditos";
		inputMap = this.jButtonVerFormTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTarjetasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTarjetasCreditos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTarjetasCreditos";
		inputMap = this.jButtonNuevoRelacionesTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTarjetasCreditos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTarjetasCreditos";
		inputMap = this.jButtonModificarTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTarjetasCreditos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTarjetasCreditos";
		inputMap = this.jButtonCerrarTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTarjetasCreditos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTarjetasCreditos";
		inputMap = this.jButtonGuardarCambiosTablaTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTarjetasCreditos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TarjetasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TarjetasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TarjetasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TarjetasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TarjetasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTarjetasCreditos.setName("jPanelParametrosReportesTarjetasCreditos"); 
		
		this.jPanelParametrosReportesAccionesTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTarjetasCreditos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTarjetasCreditos.setName("jPanelParametrosReportesAccionesTarjetasCreditos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTarjetasCreditos = new JButtonMe();
		this.jButtonRecargarInformacionTarjetasCreditos.setText("Buscar");
		this.jButtonRecargarInformacionTarjetasCreditos.setToolTipText("Buscar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTarjetasCreditos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionTarjetasCreditos.setVisible(false);
		
		
		this.jButtonProcesarInformacionTarjetasCreditos = new JButtonMe();
		this.jButtonProcesarInformacionTarjetasCreditos.setText("Procesar");
		this.jButtonProcesarInformacionTarjetasCreditos.setToolTipText("Procesar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTarjetasCreditos.setVisible(false);
			
		this.jButtonProcesarInformacionTarjetasCreditos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTarjetasCreditos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTarjetasCreditos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetasCreditos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTarjetasCreditos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetasCreditos.setText("TIPO");       
		this.jComboBoxTiposReportesTarjetasCreditos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetasCreditos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTarjetasCreditos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTarjetasCreditos.setText("Paginacion");
		this.jComboBoxTiposPaginacionTarjetasCreditos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTarjetasCreditos.setText("Accion");
		this.jComboBoxTiposRelacionesTarjetasCreditos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTarjetasCreditos.setText("Accion");
		this.jComboBoxTiposAccionesTarjetasCreditos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTarjetasCreditos.setText("Accion");
		this.jComboBoxTiposSeleccionarTarjetasCreditos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTarjetasCreditos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTarjetasCreditos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTarjetasCreditos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTarjetasCreditos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTarjetasCreditos = new JLabelMe();
		
		this.jLabelAccionesTarjetasCreditos.setText("Acciones");		
		this.jLabelAccionesTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTarjetasCreditos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTarjetasCreditos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTarjetasCreditos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTarjetasCreditos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTarjetasCreditos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTarjetasCreditos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTarjetasCreditos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTarjetasCreditos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTarjetasCreditos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTarjetasCreditos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTarjetasCreditos.setText("Graf.");
		this.jCheckBoxConGraficoReporteTarjetasCreditos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTarjetasCreditos = new JButtonMe();
		//this.jButtonAnterioresTarjetasCreditos.setText("<<");
        this.jButtonAnterioresTarjetasCreditos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTarjetasCreditos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTarjetasCreditos = new JButtonMe();
		//this.jButtonSiguientesTarjetasCreditos.setText(">>");
        this.jButtonSiguientesTarjetasCreditos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTarjetasCreditos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTarjetasCreditos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTarjetasCreditos.setText("Nue");
        this.jButtonNuevoGuardarCambiosTarjetasCreditos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTarjetasCreditos,"nuevoguardarcambios_button","Nue",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTarjetasCreditos";
		inputMap = this.jButtonNuevoGuardarCambiosTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTarjetasCreditos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTarjetasCreditos";
		inputMap = this.jButtonRecargarInformacionTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTarjetasCreditos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTarjetasCreditos";
		inputMap = this.jButtonSiguientesTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTarjetasCreditos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTarjetasCreditos";
		inputMap = this.jButtonAnterioresTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTarjetasCreditos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTarjetasCreditos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTarjetasCreditos.setMinimumSize(new Dimension(this.getWidth(),TarjetasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTarjetasCreditos.setMaximumSize(new Dimension(this.getWidth(),TarjetasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTarjetasCreditos.setPreferredSize(new Dimension(this.getWidth(),TarjetasCreditosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetasCreditosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTarjetasCreditos = new GridBagLayout();

			this.jPanelPaginacionTarjetasCreditos.setLayout(gridaBagLayoutPaginacionTarjetasCreditos);						
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = 0;
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTarjetasCreditos.add(this.jButtonAnterioresTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
					
						
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTarjetasCreditos.gridy = 0;
			
			this.jPanelPaginacionTarjetasCreditos.add(this.jButtonNuevoGuardarCambiosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
						
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTarjetasCreditos.gridy = 0;
			this.jPanelPaginacionTarjetasCreditos.add(this.jButtonSiguientesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = 1;
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetasCreditos.add(this.jButtonNuevoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
						
			
			
			if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
				this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTarjetasCreditos.gridy = 1;
				this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTarjetasCreditos.add(this.jButtonGuardarCambiosTablaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			}
			
			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = 1;
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetasCreditos.add(this.jButtonDuplicarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = 1;
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetasCreditos.add(this.jButtonCopiarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = 1;
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetasCreditos.add(this.jButtonVerFormTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = 1;
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTarjetasCreditos.add(this.jButtonCerrarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		
		
		this.jButtonRecargarInformacionTarjetasCreditos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTarjetasCreditos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTarjetasCreditos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTarjetasCreditos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTarjetasCreditos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTarjetasCreditos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTarjetasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTarjetasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTarjetasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTarjetasCreditos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTarjetasCreditos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTarjetasCreditos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTarjetasCreditos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTarjetasCreditos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTarjetasCreditos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTarjetasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTarjetasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTarjetasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTarjetasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTarjetasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTarjetasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTarjetasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTarjetasCreditos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTarjetasCreditos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTarjetasCreditos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTarjetasCreditos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTarjetasCreditos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTarjetasCreditos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTarjetasCreditos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTarjetasCreditos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTarjetasCreditos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTarjetasCreditos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTarjetasCreditos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTarjetasCreditos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTarjetasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTarjetasCreditos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TarjetasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TarjetasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TarjetasCreditos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TarjetasCreditos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTarjetasCreditos.setLayout(gridaBagParametrosReportesTarjetasCreditos);
			this.jPanelParametrosReportesAccionesTarjetasCreditos.setLayout(gridaBagParametrosReportesAccionesTarjetasCreditos);
			
			
			this.jPanelParametrosAuxiliar1TarjetasCreditos.setLayout(gridaBagParametrosAuxiliar1TarjetasCreditos);
			this.jPanelParametrosAuxiliar2TarjetasCreditos.setLayout(gridaBagParametrosAuxiliar2TarjetasCreditos);
			this.jPanelParametrosAuxiliar3TarjetasCreditos.setLayout(gridaBagParametrosAuxiliar3TarjetasCreditos);
			this.jPanelParametrosAuxiliar4TarjetasCreditos.setLayout(gridaBagParametrosAuxiliar4TarjetasCreditos);
			//this.jPanelParametrosAuxiliar5TarjetasCreditos.setLayout(gridaBagParametrosAuxiliar2TarjetasCreditos);			
			
			
			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jButtonRecargarInformacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetasCreditos.add(this.jComboBoxTiposPaginacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetasCreditos.add(this.jCheckBoxConAltoMaximoTablaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetasCreditos.add(this.jComboBoxTiposArchivosReportesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jPanelParametrosAuxiliar1TarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TarjetasCreditos.add(this.jComboBoxTiposReportesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);																		
			
			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TarjetasCreditos.add(this.jComboBoxTiposGraficosReportesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jPanelParametrosAuxiliar4TarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jComboBoxTiposReportesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jCheckBoxGenerarReporteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jPanelParametrosAuxiliar2TarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jLabelAccionesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
				this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTarjetasCreditos.add(this.jButtonAbrirOrderByTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jComboBoxTiposSeleccionarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);			
			
			
			/*
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jCheckBoxSeleccionarTodosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jCheckBoxConGraficoReporteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetasCreditos.add(this.jCheckBoxSeleccionarTodosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);															
				
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetasCreditos.add(this.jCheckBoxSeleccionadosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);															
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetasCreditos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetasCreditos.add(this.jCheckBoxConGraficoReporteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jPanelParametrosAuxiliar3TarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetasCreditos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetasCreditos.add(this.jComboBoxTiposAccionesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTarjetasCreditos = new GridBagLayout();

			this.jScrollPanelDatosTarjetasCreditos.setLayout(gridaBagLayoutDatosTarjetasCreditos);
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = 0;
			this.gridBagConstraintsTarjetasCreditos.gridx = 0;
			
			this.jScrollPanelDatosTarjetasCreditos.add(this.jTableDatosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTarjetasCreditos.setViewportView(this.jTableDatosTarjetasCreditos);
		this.jTableDatosTarjetasCreditos.setFillsViewportHeight(true);
		this.jTableDatosTarjetasCreditos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTarjetasCreditos= new GridBagLayout();
		this.jPanelAccionesTarjetasCreditos.setLayout(gridaBagLayoutAccionesTarjetasCreditos);
		
		
		/*	
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;
			
		this.jPanelAccionesTarjetasCreditos.add(this.jButtonNuevoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaTarjetaCreditoTarjetasCreditos= new GridBagLayout();
		gridaBagLayoutBusquedaTarjetaCreditoTarjetasCreditos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaTarjetaCreditoTarjetasCreditos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaTarjetaCreditoTarjetasCreditos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaTarjetaCreditoTarjetasCreditos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaTarjetaCreditoTarjetasCreditos.setLayout(gridaBagLayoutBusquedaTarjetaCreditoTarjetasCreditos);

		gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetasCreditos.gridy = 0;
		gridBagConstraintsTarjetasCreditos.gridx = 0;
		jPanelBusquedaTarjetaCreditoTarjetasCreditos.add(jLabelfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos, gridBagConstraintsTarjetasCreditos);

		gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetasCreditos.gridy = 0;
		gridBagConstraintsTarjetasCreditos.gridx = 1;
		jPanelBusquedaTarjetaCreditoTarjetasCreditos.add(jDateChooserfecha_inicioBusquedaTarjetaCreditoTarjetasCreditos, gridBagConstraintsTarjetasCreditos);


		gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetasCreditos.gridy = 1;
		gridBagConstraintsTarjetasCreditos.gridx = 0;
		jPanelBusquedaTarjetaCreditoTarjetasCreditos.add(jLabelfecha_finBusquedaTarjetaCreditoTarjetasCreditos, gridBagConstraintsTarjetasCreditos);

		gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetasCreditos.gridy = 1;
		gridBagConstraintsTarjetasCreditos.gridx = 1;
		jPanelBusquedaTarjetaCreditoTarjetasCreditos.add(jDateChooserfecha_finBusquedaTarjetaCreditoTarjetasCreditos, gridBagConstraintsTarjetasCreditos);

		gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetasCreditos.gridy = 2;
		gridBagConstraintsTarjetasCreditos.gridx =1;
		jPanelBusquedaTarjetaCreditoTarjetasCreditos.add(jButtonBusquedaTarjetaCreditoTarjetasCreditos, gridBagConstraintsTarjetasCreditos);

		jTabbedPaneBusquedasTarjetasCreditos.addTab("1.-Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaTarjetaCreditoTarjetasCreditos);
		jTabbedPaneBusquedasTarjetasCreditos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTarjetasCreditos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();						
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetasCreditos.gridx = 0;		
			//this.gridBagConstraintsTarjetasCreditos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTarjetasCreditos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;		
		//this.gridBagConstraintsTarjetasCreditos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTarjetasCreditos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetasCreditos.gridx = 0;		
			this.gridBagConstraintsTarjetasCreditos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTarjetasCreditos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);								
		
		
		/*
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		*/		
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTarjetasCreditos.gridx =0;
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTarjetasCreditos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
				
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTarjetasCreditos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTarjetasCreditos = new GridBagLayout();
			this.jPanelBusquedasParametrosTarjetasCreditos.setLayout(gridaBagLayoutBusquedasParametrosTarjetasCreditos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTarjetasCreditos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTarjetasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			
			
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
			
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTarjetasCreditos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTarjetasCreditos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTarjetasCreditos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTarjetasCreditos.setName("jPanelReporteDinamicoTarjetasCreditos"); 
		
		this.jPanelReporteDinamicoTarjetasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTarjetasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTarjetasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTarjetasCreditos.setLayout(gridaBagLayoutReporteDinamicoTarjetasCreditos);
		
		
		this.jInternalFrameReporteDinamicoTarjetasCreditos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTarjetasCreditos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTarjetasCreditos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTarjetasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTarjetasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTarjetasCreditos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTarjetasCreditos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTarjetasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTarjetasCreditos.setResizable(true);
	    this.jInternalFrameReporteDinamicoTarjetasCreditos.setClosable(true);
	    this.jInternalFrameReporteDinamicoTarjetasCreditos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTarjetasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTarjetasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTarjetasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTarjetasCreditos = new JLabelMe();

		this.jLabelColumnasSelectReporteTarjetasCreditos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jLabelColumnasSelectReporteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTarjetasCreditos = new JList<Reporte>();
		this.jListColumnasSelectReporteTarjetasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTarjetasCreditos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTarjetasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTarjetasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTarjetasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTarjetasCreditos=new JScrollPane(this.jListColumnasSelectReporteTarjetasCreditos);
			
			this.jScrollColumnasSelectReporteTarjetasCreditos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTarjetasCreditos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTarjetasCreditos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTarjetasCreditos.add(this.jListColumnasSelectReporteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jScrollColumnasSelectReporteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTarjetasCreditos = new JLabelMe();

		this.jLabelRelacionesSelectReporteTarjetasCreditos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTarjetasCreditos = new JList<Reporte>();
		this.jListRelacionesSelectReporteTarjetasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTarjetasCreditos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTarjetasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTarjetasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTarjetasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTarjetasCreditos=new JScrollPane(this.jListRelacionesSelectReporteTarjetasCreditos);
			
			this.jScrollRelacionesSelectReporteTarjetasCreditos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTarjetasCreditos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTarjetasCreditos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTarjetasCreditos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos = new JComboBoxMe();
		this.jListColumnasValoresGraficoTarjetasCreditos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTarjetasCreditos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTarjetasCreditos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTarjetasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTarjetasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTarjetasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTarjetasCreditos = new JLabelMe();

		this.jLabelConGraficoDinamicoTarjetasCreditos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jLabelConGraficoDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTarjetasCreditos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTarjetasCreditos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTarjetasCreditos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTarjetasCreditos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTarjetasCreditos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTarjetasCreditos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jCheckBoxConGraficoDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTarjetasCreditos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTarjetasCreditos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jLabelColumnaCategoriaGraficoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTarjetasCreditos = new JLabelMe();

		this.jLabelColumnaCategoriaValorTarjetasCreditos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jLabelColumnaCategoriaValorTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTarjetasCreditos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTarjetasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTarjetasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTarjetasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTarjetasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jComboBoxColumnaCategoriaValorTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTarjetasCreditos = new JLabelMe();

		this.jLabelColumnasValoresGraficoTarjetasCreditos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jLabelColumnasValoresGraficoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTarjetasCreditos = new JList<Reporte>();
		this.jListColumnasValoresGraficoTarjetasCreditos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTarjetasCreditos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTarjetasCreditos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTarjetasCreditos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTarjetasCreditos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTarjetasCreditos=new JScrollPane(this.jListColumnasValoresGraficoTarjetasCreditos);
			
			this.jScrollColumnasValoresGraficoTarjetasCreditos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTarjetasCreditos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTarjetasCreditos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTarjetasCreditos.add(this.jListColumnasSelectReporteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jScrollColumnasValoresGraficoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTarjetasCreditos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTarjetasCreditos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jLabelTiposGraficosReportesDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTarjetasCreditos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTarjetasCreditos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTarjetasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTarjetasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTarjetasCreditos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jComboBoxTiposGraficosReportesDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTarjetasCreditos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTarjetasCreditos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jLabelGenerarExcelReporteDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTarjetasCreditos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTarjetasCreditos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTarjetasCreditos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTarjetasCreditos.setToolTipText("Generar EXCEL"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTarjetasCreditos.add(this.jButtonGenerarExcelReporteDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jComboBoxTiposReportesDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTarjetasCreditos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTarjetasCreditos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jLabelTiposArchivoReporteDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jComboBoxTiposArchivosReportesDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTarjetasCreditos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTarjetasCreditos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTarjetasCreditos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTarjetasCreditos.setToolTipText("Generar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jButtonGenerarReporteDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTarjetasCreditos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTarjetasCreditos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTarjetasCreditos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTarjetasCreditos.setToolTipText("Cancelar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetasCreditos.add(this.jButtonCerrarReporteDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTarjetasCreditos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTarjetasCreditos= new JScrollPane(jPanelReporteDinamicoTarjetasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTarjetasCreditos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTarjetasCreditos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTarjetasCreditos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTarjetasCreditos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTarjetasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTarjetasCreditos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTarjetasCreditos);
		this.jInternalFrameReporteDinamicoTarjetasCreditos.getContentPane().add(this.jScrollPanelReporteDinamicoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTarjetasCreditos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTarjetasCreditos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTarjetasCreditos.setName("jPanelImportacionTarjetasCreditos"); 
		
		this.jPanelImportacionTarjetasCreditos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTarjetasCreditos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTarjetasCreditos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTarjetasCreditos.setLayout(gridaBagLayoutImportacionTarjetasCreditos);
		
		
		this.jInternalFrameImportacionTarjetasCreditos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTarjetasCreditos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTarjetasCreditos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTarjetasCreditos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTarjetasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTarjetasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTarjetasCreditos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTarjetasCreditos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTarjetasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTarjetasCreditos.setResizable(true);
	    this.jInternalFrameImportacionTarjetasCreditos.setClosable(true);
	    this.jInternalFrameImportacionTarjetasCreditos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTarjetasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTarjetasCreditos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTarjetasCreditos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTarjetasCreditos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTarjetasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTarjetasCreditos.setResizable(true);
	    this.jInternalFrameImportacionTarjetasCreditos.setClosable(true);
	    this.jInternalFrameImportacionTarjetasCreditos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTarjetasCreditos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTarjetasCreditos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTarjetasCreditos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTarjetasCreditos = new JLabelMe();

		this.jLabelArchivoImportacionTarjetasCreditos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYImportacion;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTarjetasCreditos.add(this.jLabelArchivoImportacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTarjetasCreditos = new JFileChooser();		
		this.jFileChooserImportacionTarjetasCreditos.setToolTipText("ESCOGER ARCHIVO"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTarjetasCreditos = new JButtonMe();
		this.jButtonAbrirImportacionTarjetasCreditos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTarjetasCreditos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTarjetasCreditos.setToolTipText("Generar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetasCreditos.add(this.jButtonAbrirImportacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTarjetasCreditos = new JLabelMe();

		this.jLabelPathArchivoImportacionTarjetasCreditos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYImportacion;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTarjetasCreditos.add(this.jLabelPathArchivoImportacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTarjetasCreditos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTarjetasCreditos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTarjetasCreditos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTarjetasCreditos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetasCreditos.add(this.jTextFieldPathArchivoImportacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTarjetasCreditos = new JButtonMe();
		this.jButtonGenerarImportacionTarjetasCreditos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTarjetasCreditos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTarjetasCreditos.setToolTipText("Generar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetasCreditos.add(this.jButtonGenerarImportacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTarjetasCreditos = new JButtonMe();
		this.jButtonCerrarImportacionTarjetasCreditos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTarjetasCreditos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTarjetasCreditos.setToolTipText("Cancelar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetasCreditos.add(this.jButtonCerrarImportacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTarjetasCreditos = new GridBagLayout();
		
		this.jScrollPanelImportacionTarjetasCreditos= new JScrollPane(jPanelImportacionTarjetasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy =iPosYImportacion;
		this.gridBagConstraintsTarjetasCreditos.gridx =iPosXImportacion;
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTarjetasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTarjetasCreditos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTarjetasCreditos);
		this.jInternalFrameImportacionTarjetasCreditos.getContentPane().add(this.jScrollPanelImportacionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTarjetasCreditos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTarjetasCreditos = new JButtonMe();
			this.jButtonAbrirOrderByTarjetasCreditos.setText("Orden");
			this.jButtonAbrirOrderByTarjetasCreditos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTarjetasCreditos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTarjetasCreditos";
			inputMap = this.jButtonAbrirOrderByTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTarjetasCreditos"));
		
		
			GridBagLayout gridaBagLayoutOrderByTarjetasCreditos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTarjetasCreditos.setName("jPanelOrderByTarjetasCreditos"); 
			
			this.jPanelOrderByTarjetasCreditos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTarjetasCreditos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTarjetasCreditos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTarjetasCreditos.setLayout(gridaBagLayoutOrderByTarjetasCreditos);
			
			
			this.jTableDatosTarjetasCreditosOrderBy = new JTableMe();        
			this.jTableDatosTarjetasCreditosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTarjetasCreditosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTarjetasCreditosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTarjetasCreditosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTarjetasCreditosOrderBy.setViewportView(this.jTableDatosTarjetasCreditosOrderBy);
			this.jTableDatosTarjetasCreditosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTarjetasCreditosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTarjetasCreditos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTarjetasCreditos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTarjetasCreditos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTarjetasCreditos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTarjetasCreditos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTarjetasCreditos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTarjetasCreditos.setTitle("Orden");
			this.jInternalFrameOrderByTarjetasCreditos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTarjetasCreditos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTarjetasCreditos.setResizable(true);
			this.jInternalFrameOrderByTarjetasCreditos.setClosable(true);
			this.jInternalFrameOrderByTarjetasCreditos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTarjetasCreditos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTarjetasCreditos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTarjetasCreditos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTarjetasCreditos.gridx =iPosXOrderBy;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTarjetasCreditos.ipady =150;
				
			this.jPanelOrderByTarjetasCreditos.add(jScrollPanelDatosTarjetasCreditosOrderBy, this.gridBagConstraintsTarjetasCreditos);//this.jTableDatosTarjetasCreditosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTarjetasCreditos = new JButtonMe();
			this.jButtonCerrarOrderByTarjetasCreditos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTarjetasCreditos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTarjetasCreditos.setToolTipText("Cancelar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTarjetasCreditos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTarjetasCreditos.add(this.jButtonCerrarOrderByTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTarjetasCreditos = new GridBagLayout();
			
			this.jScrollPanelOrderByTarjetasCreditos= new JScrollPane(jPanelOrderByTarjetasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.gridy =iPosYOrderBy;
			this.gridBagConstraintsTarjetasCreditos.gridx =iPosXOrderBy;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTarjetasCreditos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTarjetasCreditos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTarjetasCreditos);
			
			this.jInternalFrameOrderByTarjetasCreditos.getContentPane().add(this.jScrollPanelOrderByTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);			
		
		} else {
			this.jButtonAbrirOrderByTarjetasCreditos = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.tarjetascreditosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTarjetasCreditos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTarjetasCreditos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTarjetasCreditos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosTarjetasCreditos.getRowHeight();//TarjetasCreditosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TarjetasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTarjetasCreditos.isSelected()) {
					iHeightTable=TarjetasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TarjetasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TarjetasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TarjetasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTarjetasCreditos.isSelected()) {
					iHeightTable=TarjetasCreditosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TarjetasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TarjetasCreditosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTarjetasCreditos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTarjetasCreditos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTarjetasCreditos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTarjetasCreditos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTarjetasCreditos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTarjetasCreditos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTarjetasCreditos!=null && this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy()!=null) {
			//if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTarjetasCreditos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTarjetasCreditos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTarjetasCreditos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTarjetasCreditos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTarjetasCreditos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTarjetasCreditos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTarjetasCreditos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=tarjetascreditosLogic.getTarjetasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetascreditoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TarjetasCreditos> TraerTarjetasCreditosBeans(List<TarjetasCreditos> tarjetascreditoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(TarjetasCreditos tarjetascreditos:tarjetascreditoss) {
					
				if(!(TarjetasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TarjetasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tarjetascreditos.setsDetalleGeneralEntityReporte(TarjetasCreditosConstantesFunciones.getTarjetasCreditosDescripcion(tarjetascreditos));
										
						
					
						
					
				} else  {
							
					//tarjetascreditos.setsDetalleGeneralEntityReporte(tarjetascreditos.getsDetalleGeneralEntityReporte());
										
				}
				
				//tarjetascreditosbeans.add(tarjetascreditosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tarjetascreditoss;
    }
	//PARA REPORTES FIN
}
