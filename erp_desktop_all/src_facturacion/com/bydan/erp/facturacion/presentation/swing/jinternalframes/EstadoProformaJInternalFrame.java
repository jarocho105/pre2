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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.facturacion.util.EstadoProformaConstantesFunciones;

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
public class EstadoProformaJInternalFrame extends EstadoProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoProforma;
	
	protected JMenuBar jmenuBarEstadoProforma;
	
	protected JMenu jmenuEstadoProforma;
	protected JMenu jmenuDatosEstadoProforma;
	protected JMenu jmenuArchivoEstadoProforma;
	protected JMenu jmenuAccionesEstadoProforma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoProforma;	
	protected GridBagConstraints gridBagConstraintsEstadoProforma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoProformaDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoProforma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoProforma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoProforma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_colorgeneral="";
	
	public EstadoProformaSessionBean estadoproformaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ColorGeneralSessionBean colorgeneralSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoProforma> estadoproformas;		
	public List<EstadoProforma> estadoproformasEliminados;	
	public List<EstadoProforma> estadoproformasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoProforma;		
	protected JButton jButtonAbrirOrderByEstadoProforma;
	
	
	//protected JPanel jPanelOrderByEstadoProforma;
	//public JScrollPane jScrollPanelOrderByEstadoProforma;	
	//protected JButton jButtonCerrarOrderByEstadoProforma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoProformaLogic estadoproformaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoProforma;
	public JScrollPane jScrollPanelDatosEdicionEstadoProforma;
	public JScrollPane jScrollPanelDatosGeneralEstadoProforma;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoProformaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoProforma;
	//public JScrollPane jScrollPanelImportacionEstadoProforma;
	
	
	
	protected JPanel jPanelAccionesEstadoProforma;
	
    protected JPanel jPanelPaginacionEstadoProforma;
    protected JPanel jPanelParametrosReportesEstadoProforma;
	protected JPanel jPanelParametrosReportesAccionesEstadoProforma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoProforma;
	protected JPanel jPanelParametrosAuxiliar2EstadoProforma;
	protected JPanel jPanelParametrosAuxiliar3EstadoProforma;
	protected JPanel jPanelParametrosAuxiliar4EstadoProforma;
	//protected JPanel jPanelParametrosAuxiliar5EstadoProforma;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoProforma;
	//protected JPanel jPanelImportacionEstadoProforma;
	
	
	public JTable jTableDatosEstadoProforma;
	
	
	
	//public JTable jTableDatosEstadoProformaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoProforma;
	protected JButton jButtonDuplicarEstadoProforma;
	protected JButton jButtonCopiarEstadoProforma;
	protected JButton jButtonVerFormEstadoProforma;
	protected JButton jButtonNuevoRelacionesEstadoProforma;
	protected JButton jButtonModificarEstadoProforma;
	
    protected JButton jButtonGuardarCambiosTablaEstadoProforma;
	protected JButton jButtonCerrarEstadoProforma;
	
	
	protected JButton jButtonRecargarInformacionEstadoProforma;
	protected JButton jButtonProcesarInformacionEstadoProforma;
	
	
	protected JButton jButtonAnterioresEstadoProforma;
	protected JButton jButtonSiguientesEstadoProforma;
	protected JButton jButtonNuevoGuardarCambiosEstadoProforma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoProforma;
	//protected JButton jButtonCerrarReporteDinamicoEstadoProforma;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoProforma;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoProforma;
	//protected JButton jButtonGenerarImportacionEstadoProforma;
	//protected JButton jButtonCerrarImportacionEstadoProforma;
	//protected JFileChooser jFileChooserImportacionEstadoProforma;
	//protected File fileImportacionEstadoProforma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoProforma;
	protected JButton jButtonDuplicarToolBarEstadoProforma;
	protected JButton jButtonNuevoRelacionesToolBarEstadoProforma;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoProforma;
	protected JButton jButtonCopiarToolBarEstadoProforma;
	protected JButton jButtonVerFormToolBarEstadoProforma;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoProforma;
	protected JButton jButtonCerrarToolBarEstadoProforma;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoProforma;
	protected JButton jButtonProcesarInformacionToolBarEstadoProforma;
	protected JButton jButtonAnterioresToolBarEstadoProforma;
	protected JButton jButtonSiguientesToolBarEstadoProforma;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoProforma;
	protected JButton jButtonAbrirOrderByToolBarEstadoProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoProforma;
	protected JMenuItem jMenuItemDuplicarEstadoProforma;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoProforma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoProforma;
	protected JMenuItem jMenuItemCopiarEstadoProforma;
	protected JMenuItem jMenuItemVerFormEstadoProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoProforma;
	protected JMenuItem jMenuItemCerrarEstadoProforma;
	protected JMenuItem jMenuItemDetalleCerrarEstadoProforma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoProforma;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoProforma;
	protected JMenuItem jMenuItemProcesarInformacionEstadoProforma;
	protected JMenuItem jMenuItemAnterioresEstadoProforma;
	protected JMenuItem jMenuItemSiguientesEstadoProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoProforma;
	protected JMenuItem jMenuItemAbrirOrderByEstadoProforma;
	protected JMenuItem jMenuItemMostrarOcultarEstadoProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoProforma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoProforma;
	protected JCheckBox jCheckBoxSeleccionadosEstadoProforma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoProforma;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoProforma;
	protected JTextField jTextFieldValorCampoGeneralEstadoProforma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoProforma;
	//public JList<Reporte> jListColumnasSelectReporteEstadoProforma;
	//public JScrollPane jScrollColumnasSelectReporteEstadoProforma;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoProforma;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoProforma;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoProforma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoProforma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoProforma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoProforma;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoProforma;
	
		
	//public JLabel jLabelArchivoImportacionEstadoProforma;	
	//public JLabel jLabelPathArchivoImportacionEstadoProforma;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoProforma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoProforma;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoProforma;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoProforma;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoProforma;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoProforma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoProforma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoProforma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadoProforma;
	public JPanel jPanelFK_IdColorGeneralEstadoProforma;
	public JButton jButtonFK_IdColorGeneralEstadoProforma;
	
	public JPanel jPanelid_color_generalFK_IdColorGeneralEstadoProforma;
	public JLabel jLabelid_color_generalFK_IdColorGeneralEstadoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma;
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoProforma= new JButtonMe();
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoProformaUpdate= new JButtonMe();
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoProformaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadoProformaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoProformaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoProformaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoProformaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoProforma)	{
		this.jButtonRecargarInformacionEstadoProforma = jButtonRecargarInformacionEstadoProforma;
	}
	
	public JButton getjButtonProcesarInformacionEstadoProforma() {
		return this.jButtonProcesarInformacionEstadoProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoProforma)	{
		this.jButtonProcesarInformacionEstadoProforma = jButtonProcesarInformacionEstadoProforma;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoProforma() {
		return this.jButtonRecargarInformacionEstadoProforma;
	}
	
	
	public List<EstadoProforma> getestadoproformas() {
		return this.estadoproformas;
	}

	public void setestadoproformas(List<EstadoProforma> estadoproformas) {
		this.estadoproformas = estadoproformas;
	}
	
	public List<EstadoProforma> getestadoproformasAux() {
		return this.estadoproformasAux;
	}

	public void setestadoproformasAux(List<EstadoProforma> estadoproformasAux) {
		this.estadoproformasAux = estadoproformasAux;
	}
	
	public List<EstadoProforma> getestadoproformasEliminados() {
		return this.estadoproformasEliminados;
	}

	public void setEstadoProformasEliminados(List<EstadoProforma> estadoproformasEliminados) {
		this.estadoproformasEliminados = estadoproformasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoProforma() {
		return jComboBoxTiposSeleccionarEstadoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoProforma(
			JComboBox jComboBoxTiposSeleccionarEstadoProforma) {
		this.jComboBoxTiposSeleccionarEstadoProforma = jComboBoxTiposSeleccionarEstadoProforma;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoProforma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoProforma() {
		return jTextFieldValorCampoGeneralEstadoProforma;
	}

	public void setjTextFieldValorCampoGeneralEstadoProforma(
			JTextField jTextFieldValorCampoGeneralEstadoProforma) {
		this.jTextFieldValorCampoGeneralEstadoProforma = jTextFieldValorCampoGeneralEstadoProforma;
	}

	public void setBorderResaltarValorCampoGeneralEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoProforma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoProforma() {
		return this.jCheckBoxSeleccionarTodosEstadoProforma;
	}

	public void setjCheckBoxSeleccionarTodosEstadoProforma(
			JCheckBox jCheckBoxSeleccionarTodosEstadoProforma) {
		this.jCheckBoxSeleccionarTodosEstadoProforma = jCheckBoxSeleccionarTodosEstadoProforma;
	}

	public void setBorderResaltarSeleccionarTodosEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoProforma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoProforma() {
		return this.jCheckBoxSeleccionadosEstadoProforma;
	}

	public void setjCheckBoxSeleccionadosEstadoProforma(
			JCheckBox jCheckBoxSeleccionadosEstadoProforma) {
		this.jCheckBoxSeleccionadosEstadoProforma = jCheckBoxSeleccionadosEstadoProforma;
	}
	
	public void setBorderResaltarSeleccionadosEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoProforma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoProforma() {
		return this.jComboBoxTiposArchivosReportesEstadoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoProforma(
			JComboBox jComboBoxTiposArchivosReportesEstadoProforma) {
		this.jComboBoxTiposArchivosReportesEstadoProforma = jComboBoxTiposArchivosReportesEstadoProforma;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoProforma() {
		return this.jComboBoxTiposReportesEstadoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoProforma(
			JComboBox jComboBoxTiposReportesEstadoProforma) {
		this.jComboBoxTiposReportesEstadoProforma = jComboBoxTiposReportesEstadoProforma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoProforma() {
	//	return jComboBoxTiposReportesDinamicoEstadoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoProforma(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoProforma) {
	//	this.jComboBoxTiposReportesDinamicoEstadoProforma = jComboBoxTiposReportesDinamicoEstadoProforma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoProforma() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoProforma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoProforma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoProforma = jComboBoxTiposArchivosReportesDinamicoEstadoProforma;
	//}
	
	public void setBorderResaltarTiposReportesEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoProforma() {
		return this.jComboBoxTiposGraficosReportesEstadoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoProforma(
			JComboBox jComboBoxTiposGraficosReportesEstadoProforma) {
		this.jComboBoxTiposGraficosReportesEstadoProforma = jComboBoxTiposGraficosReportesEstadoProforma;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoProforma() {
		return this.jComboBoxTiposPaginacionEstadoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoProforma(
			JComboBox jComboBoxTiposPaginacionEstadoProforma) {
		this.jComboBoxTiposPaginacionEstadoProforma = jComboBoxTiposPaginacionEstadoProforma;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoProforma() {
		return this.jComboBoxTiposRelacionesEstadoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoProforma() {
		return this.jComboBoxTiposAccionesEstadoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoProforma(
			JComboBox jComboBoxTiposRelacionesEstadoProforma) {
		this.jComboBoxTiposRelacionesEstadoProforma = jComboBoxTiposRelacionesEstadoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoProforma(
			JComboBox jComboBoxTiposAccionesEstadoProforma) {
		this.jComboBoxTiposAccionesEstadoProforma = jComboBoxTiposAccionesEstadoProforma;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoProforma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoProforma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoProforma() {
	//	return jCheckBoxConGraficoDinamicoEstadoProforma;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoProforma(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoProforma) {
	//	this.jCheckBoxConGraficoDinamicoEstadoProforma = jCheckBoxConGraficoDinamicoEstadoProforma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoProforma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoProforma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoProforma .setBorder(borderResaltar);		
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
		this.estadoproformaSessionBean=new EstadoProformaSessionBean();
		
		this.estadoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoproformaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoProforma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"nuevo","nuevo","Nuevo"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"duplicar","duplicar","Duplicar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"copiar","copiar","Copiar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"ver_form","ver_form","Ver"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"recargar","recargar","Recargar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoProforma,this.jTtoolBarEstadoProforma,
							"cerrar","cerrar","Salir"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoProforma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoProforma;
			
				this.jButtonProcesarInformacionToolBarEstadoProforma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoProforma;
				
		//protected JButton jButtonModificarToolBarEstadoProforma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoProforma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoProforma=new JMenuMe("General");
		this.jmenuArchivoEstadoProforma=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoProforma=new JMenuMe("Acciones");
		this.jmenuDatosEstadoProforma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoProforma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoProforma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoProforma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoProforma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoProforma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoProforma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoProforma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoProforma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoProforma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoProforma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoProforma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoProforma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoProforma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoProforma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoProforma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoProforma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoProforma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoProforma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoProforma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoProforma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoProforma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoProforma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoProforma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoProforma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoProforma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoProforma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoProforma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoProforma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoProforma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoProforma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoProforma.add(this.jMenuItemCerrarEstadoProforma);
			
			this.jmenuAccionesEstadoProforma.add(this.jMenuItemNuevoEstadoProforma);
			this.jmenuAccionesEstadoProforma.add(this.jMenuItemNuevoGuardarCambiosEstadoProforma);
			this.jmenuAccionesEstadoProforma.add(this.jMenuItemNuevoRelacionesEstadoProforma);
			this.jmenuAccionesEstadoProforma.add(this.jMenuItemGuardarCambiosTablaEstadoProforma);		
			this.jmenuAccionesEstadoProforma.add(this.jMenuItemDuplicarEstadoProforma);		
			this.jmenuAccionesEstadoProforma.add(this.jMenuItemCopiarEstadoProforma);		
			this.jmenuAccionesEstadoProforma.add(this.jMenuItemVerFormEstadoProforma);		
			
			this.jmenuDatosEstadoProforma.add(this.jMenuItemRecargarInformacionEstadoProforma);				
			this.jmenuDatosEstadoProforma.add(this.jMenuItemAnterioresEstadoProforma);				
			this.jmenuDatosEstadoProforma.add(this.jMenuItemSiguientesEstadoProforma);				
			this.jmenuDatosEstadoProforma.add(this.jMenuItemAbrirOrderByEstadoProforma);				
			this.jmenuDatosEstadoProforma.add(this.jMenuItemMostrarOcultarEstadoProforma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoProforma.add(this.jMenuItemGuardarCambiosEstadoProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoProforma.add(this.jmenuArchivoEstadoProforma);		
			this.jmenuBarEstadoProforma.add(this.jmenuAccionesEstadoProforma);		
			this.jmenuBarEstadoProforma.add(this.jmenuDatosEstadoProforma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoProforma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoProforma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdColorGeneralEstadoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdColorGeneralEstadoProforma.setToolTipText("Buscar Por Idcolor General ");
		this.jButtonFK_IdColorGeneralEstadoProforma= new JButtonMe();
		this.jButtonFK_IdColorGeneralEstadoProforma.setText("Buscar");
		this.jButtonFK_IdColorGeneralEstadoProforma.setToolTipText("Buscar Por Idcolor General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdColorGeneralEstadoProforma,"buscar_button","Buscar Por Idcolor General ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdColorGeneralEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_color_generalFK_IdColorGeneralEstadoProforma = new JLabelMe();
		jLabelid_color_generalFK_IdColorGeneralEstadoProforma.setText("Idcolor General :");
		jLabelid_color_generalFK_IdColorGeneralEstadoProforma.setToolTipText("Idcolor General");
		jLabelid_color_generalFK_IdColorGeneralEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_color_generalFK_IdColorGeneralEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_color_generalFK_IdColorGeneralEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_color_generalFK_IdColorGeneralEstadoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma= new JComboBoxMe();
		jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEstadoProforma=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadoProforma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoProforma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoProforma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadoProforma = new EstadoProformaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Proforma DATOS");
			this.jInternalFrameDetalleFormEstadoProforma = new EstadoProformaDetalleFormJInternalFrame(jDesktopPane,this.estadoproformaSessionBean.getConGuardarRelaciones(),this.estadoproformaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoProforma = null;//new EstadoProformaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoProforma= new GridBagLayout();
		
		
		this.jTableDatosEstadoProforma = new JTableMe();      
		
		String sToolTipEstadoProforma="";
		sToolTipEstadoProforma=EstadoProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoProforma+="(Facturacion.EstadoProforma)";
		}
		
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoProforma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoProforma.setToolTipText(sToolTipEstadoProforma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoProforma);
		this.jTableDatosEstadoProforma.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoProforma.setRowSelectionAllowed(true);
		this.jTableDatosEstadoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoProforma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoProforma = new JButtonMe();
		this.jButtonDuplicarEstadoProforma = new JButtonMe();
		this.jButtonCopiarEstadoProforma = new JButtonMe();
		this.jButtonVerFormEstadoProforma = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoProforma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoProforma = new JButtonMe();
		this.jButtonCerrarEstadoProforma = new JButtonMe();
		
		this.jScrollPanelDatosEstadoProforma = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoProforma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Proforma";
		
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoProforma.setToolTipText("Acciones");
        this.jPanelAccionesEstadoProforma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoProforma=new ReporteDinamicoJInternalFrame(EstadoProformaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoProforma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoProforma=new ImportacionJInternalFrame(EstadoProformaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoProforma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoProforma = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoProforma.setText("Orden");
		this.jButtonAbrirOrderByEstadoProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoProforma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoProforma,false,this);
			
			//this.cargarOrderByEstadoProforma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoProforma,true,this);
			
			//this.cargarOrderByEstadoProforma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoProforma.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoProforma.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoProforma.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoProforma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoProforma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoProforma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoProforma.setText("Nuevo");
		this.jButtonDuplicarEstadoProforma.setText("Duplicar");
		this.jButtonCopiarEstadoProforma.setText("Copiar");
		this.jButtonVerFormEstadoProforma.setText("Ver");
		this.jButtonNuevoRelacionesEstadoProforma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoProforma.setText("Guardar");
		this.jButtonCerrarEstadoProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoProforma,"nuevo_button","Nuevo",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoProforma,"duplicar_button","Duplicar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoProforma,"copiar_button","Copiar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoProforma,"ver_form","Ver",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoProforma,"nuevorelaciones_button","Nuevo Rel",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoProforma,"guardarcambiostabla_button","Guardar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoProforma,"cerrar_button","Salir",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoProforma.setToolTipText("Nuevo"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoProforma.setToolTipText("Duplicar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoProforma.setToolTipText("Copiar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoProforma.setToolTipText("Ver"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoProforma.setToolTipText("Nuevo Rel"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoProforma.setToolTipText("Guardar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoProforma.setToolTipText("Salir"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoProforma";
		inputMap = this.jButtonNuevoEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoProforma"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoProforma";
		inputMap = this.jButtonDuplicarEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoProforma"));
		
		//COPIAR
		sMapKey = "CopiarEstadoProforma";
		inputMap = this.jButtonCopiarEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoProforma"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoProforma";
		inputMap = this.jButtonVerFormEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoProforma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoProforma";
		inputMap = this.jButtonNuevoRelacionesEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoProforma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoProforma";
		inputMap = this.jButtonModificarEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoProforma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoProforma";
		inputMap = this.jButtonCerrarEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoProforma";
		inputMap = this.jButtonGuardarCambiosTablaEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoProforma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoProforma.setName("jPanelParametrosReportesEstadoProforma"); 
		
		this.jPanelParametrosReportesAccionesEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoProforma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoProforma.setName("jPanelParametrosReportesAccionesEstadoProforma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoProforma = new JButtonMe();
		this.jButtonRecargarInformacionEstadoProforma.setText("Recargar");
		this.jButtonRecargarInformacionEstadoProforma.setToolTipText("Recargar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoProforma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoProforma = new JButtonMe();
		this.jButtonProcesarInformacionEstadoProforma.setText("Procesar");
		this.jButtonProcesarInformacionEstadoProforma.setToolTipText("Procesar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoProforma.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoProforma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoProforma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoProforma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoProforma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoProforma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoProforma.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoProforma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoProforma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoProforma.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoProforma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoProforma.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoProforma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoProforma.setText("Accion");
		this.jComboBoxTiposAccionesEstadoProforma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoProforma.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoProforma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoProforma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoProforma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoProforma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoProforma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoProforma = new JLabelMe();
		
		this.jLabelAccionesEstadoProforma.setText("Acciones");		
		this.jLabelAccionesEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoProforma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoProforma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoProforma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoProforma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoProforma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoProforma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoProforma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoProforma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoProforma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoProforma.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoProforma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoProforma = new JButtonMe();
		//this.jButtonAnterioresEstadoProforma.setText("<<");
        this.jButtonAnterioresEstadoProforma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoProforma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoProforma = new JButtonMe();
		//this.jButtonSiguientesEstadoProforma.setText(">>");
        this.jButtonSiguientesEstadoProforma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoProforma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoProforma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoProforma.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoProforma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoProforma,"nuevoguardarcambios_button","Nue",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoProforma";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoProforma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoProforma";
		inputMap = this.jButtonRecargarInformacionEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoProforma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoProforma";
		inputMap = this.jButtonSiguientesEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoProforma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoProforma";
		inputMap = this.jButtonAnterioresEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoProforma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoProforma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoProforma.setMinimumSize(new Dimension(this.getWidth(),EstadoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoProforma.setMaximumSize(new Dimension(this.getWidth(),EstadoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoProforma.setPreferredSize(new Dimension(this.getWidth(),EstadoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoProforma = new GridBagLayout();

			this.jPanelPaginacionEstadoProforma.setLayout(gridaBagLayoutPaginacionEstadoProforma);						
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = 0;
			this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoProforma.add(this.jButtonAnterioresEstadoProforma, this.gridBagConstraintsEstadoProforma);
					
						
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoProforma.gridy = 0;
			
			this.jPanelPaginacionEstadoProforma.add(this.jButtonNuevoGuardarCambiosEstadoProforma, this.gridBagConstraintsEstadoProforma);
						
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoProforma.gridy = 0;
			this.jPanelPaginacionEstadoProforma.add(this.jButtonSiguientesEstadoProforma, this.gridBagConstraintsEstadoProforma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = 1;
			this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoProforma.add(this.jButtonNuevoEstadoProforma, this.gridBagConstraintsEstadoProforma);
						
			
			
			if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
				this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoProforma.gridy = 1;
				this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoProforma.add(this.jButtonGuardarCambiosTablaEstadoProforma, this.gridBagConstraintsEstadoProforma);
			}
			
			
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = 1;
			this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoProforma.add(this.jButtonDuplicarEstadoProforma, this.gridBagConstraintsEstadoProforma);
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = 1;
			this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoProforma.add(this.jButtonCopiarEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = 1;
			this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoProforma.add(this.jButtonVerFormEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = 1;
			this.gridBagConstraintsEstadoProforma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoProforma.add(this.jButtonCerrarEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
		
		
		this.jButtonRecargarInformacionEstadoProforma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoProforma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoProforma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoProforma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoProforma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoProforma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoProforma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoProforma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoProforma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoProforma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoProforma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoProforma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoProforma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoProforma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoProforma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoProforma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoProforma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoProforma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoProforma.setLayout(gridaBagParametrosReportesEstadoProforma);
			this.jPanelParametrosReportesAccionesEstadoProforma.setLayout(gridaBagParametrosReportesAccionesEstadoProforma);
			
			
			this.jPanelParametrosAuxiliar1EstadoProforma.setLayout(gridaBagParametrosAuxiliar1EstadoProforma);
			this.jPanelParametrosAuxiliar2EstadoProforma.setLayout(gridaBagParametrosAuxiliar2EstadoProforma);
			this.jPanelParametrosAuxiliar3EstadoProforma.setLayout(gridaBagParametrosAuxiliar3EstadoProforma);
			this.jPanelParametrosAuxiliar4EstadoProforma.setLayout(gridaBagParametrosAuxiliar4EstadoProforma);
			//this.jPanelParametrosAuxiliar5EstadoProforma.setLayout(gridaBagParametrosAuxiliar2EstadoProforma);			
			
			
			
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoProforma.add(this.jButtonRecargarInformacionEstadoProforma, this.gridBagConstraintsEstadoProforma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoProforma.add(this.jComboBoxTiposPaginacionEstadoProforma, this.gridBagConstraintsEstadoProforma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoProforma.add(this.jCheckBoxConAltoMaximoTablaEstadoProforma, this.gridBagConstraintsEstadoProforma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoProforma.add(this.jComboBoxTiposArchivosReportesEstadoProforma, this.gridBagConstraintsEstadoProforma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoProforma.add(this.jPanelParametrosAuxiliar1EstadoProforma, this.gridBagConstraintsEstadoProforma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoProforma.add(this.jComboBoxTiposReportesEstadoProforma, this.gridBagConstraintsEstadoProforma);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoProforma.add(this.jPanelParametrosAuxiliar4EstadoProforma, this.gridBagConstraintsEstadoProforma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoProforma.add(this.jComboBoxTiposReportesEstadoProforma, this.gridBagConstraintsEstadoProforma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoProforma.add(this.jCheckBoxGenerarReporteEstadoProforma, this.gridBagConstraintsEstadoProforma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoProforma.add(this.jPanelParametrosAuxiliar2EstadoProforma, this.gridBagConstraintsEstadoProforma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoProforma.add(this.jLabelAccionesEstadoProforma, this.gridBagConstraintsEstadoProforma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
				this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoProforma.add(this.jButtonAbrirOrderByEstadoProforma, this.gridBagConstraintsEstadoProforma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoProforma.add(this.jComboBoxTiposSeleccionarEstadoProforma, this.gridBagConstraintsEstadoProforma);			
			
			
			/*
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoProforma.add(this.jCheckBoxSeleccionarTodosEstadoProforma, this.gridBagConstraintsEstadoProforma);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoProforma.add(this.jCheckBoxSeleccionarTodosEstadoProforma, this.gridBagConstraintsEstadoProforma);															
				
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoProforma.add(this.jCheckBoxSeleccionadosEstadoProforma, this.gridBagConstraintsEstadoProforma);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoProforma.add(this.jPanelParametrosAuxiliar3EstadoProforma, this.gridBagConstraintsEstadoProforma);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoProforma.add(this.jComboBoxTiposRelacionesEstadoProforma, this.gridBagConstraintsEstadoProforma);
				
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoProforma.add(this.jComboBoxTiposAccionesEstadoProforma, this.gridBagConstraintsEstadoProforma);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoProforma = new GridBagLayout();

			this.jScrollPanelDatosEstadoProforma.setLayout(gridaBagLayoutDatosEstadoProforma);
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = 0;
			this.gridBagConstraintsEstadoProforma.gridx = 0;
			
			this.jScrollPanelDatosEstadoProforma.add(this.jTableDatosEstadoProforma, this.gridBagConstraintsEstadoProforma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoProforma.setViewportView(this.jTableDatosEstadoProforma);
		this.jTableDatosEstadoProforma.setFillsViewportHeight(true);
		this.jTableDatosEstadoProforma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoProforma= new GridBagLayout();
		this.jPanelAccionesEstadoProforma.setLayout(gridaBagLayoutAccionesEstadoProforma);
		
		
		/*	
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx = 0;
			
		this.jPanelAccionesEstadoProforma.add(this.jButtonNuevoEstadoProforma, this.gridBagConstraintsEstadoProforma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdColorGeneralEstadoProforma= new GridBagLayout();
		gridaBagLayoutFK_IdColorGeneralEstadoProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdColorGeneralEstadoProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdColorGeneralEstadoProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdColorGeneralEstadoProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdColorGeneralEstadoProforma.setLayout(gridaBagLayoutFK_IdColorGeneralEstadoProforma);

		gridBagConstraintsEstadoProforma = new GridBagConstraints();
		gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoProforma.gridy = 0;
		gridBagConstraintsEstadoProforma.gridx = 0;
		jPanelFK_IdColorGeneralEstadoProforma.add(jLabelid_color_generalFK_IdColorGeneralEstadoProforma, gridBagConstraintsEstadoProforma);

		gridBagConstraintsEstadoProforma = new GridBagConstraints();
		gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoProforma.gridy = 0;
		gridBagConstraintsEstadoProforma.gridx = 1;
		jPanelFK_IdColorGeneralEstadoProforma.add(jComboBoxid_color_generalFK_IdColorGeneralEstadoProforma, gridBagConstraintsEstadoProforma);

		gridBagConstraintsEstadoProforma = new GridBagConstraints();
		gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoProforma.gridy = 1;
		gridBagConstraintsEstadoProforma.gridx =1;
		jPanelFK_IdColorGeneralEstadoProforma.add(jButtonFK_IdColorGeneralEstadoProforma, gridBagConstraintsEstadoProforma);

		jTabbedPaneBusquedasEstadoProforma.addTab("1.-Por Idcolor General ", jPanelFK_IdColorGeneralEstadoProforma);
		jTabbedPaneBusquedasEstadoProforma.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoProforma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();						
			this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoProforma.gridx = 0;		
			//this.gridBagConstraintsEstadoProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoProforma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoProforma, this.gridBagConstraintsEstadoProforma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoProforma.gridx = 0;		
		//this.gridBagConstraintsEstadoProforma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoProforma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoProforma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoProforma.gridx = 0;		
			this.gridBagConstraintsEstadoProforma.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEstadoProforma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEstadoProforma, this.gridBagConstraintsEstadoProforma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoProforma, this.gridBagConstraintsEstadoProforma);								
		
		
		/*
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoProforma, this.gridBagConstraintsEstadoProforma);
		*/		
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoProforma.gridx =0;
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoProforma, this.gridBagConstraintsEstadoProforma);
				
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoProforma, this.gridBagConstraintsEstadoProforma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoProformaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoProforma = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoProforma.setLayout(gridaBagLayoutBusquedasParametrosEstadoProforma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoProforma, this.gridBagConstraintsEstadoProforma);
			
			
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
			
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoProforma, this.gridBagConstraintsEstadoProforma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoProforma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoProforma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoProforma.setName("jPanelReporteDinamicoEstadoProforma"); 
		
		this.jPanelReporteDinamicoEstadoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoProforma.setLayout(gridaBagLayoutReporteDinamicoEstadoProforma);
		
		
		this.jInternalFrameReporteDinamicoEstadoProforma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoProforma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoProforma.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoProforma.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoProforma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Proformas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoProforma = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoProforma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoProforma.add(this.jLabelColumnasSelectReporteEstadoProforma, this.gridBagConstraintsEstadoProforma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoProforma = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoProforma=new JScrollPane(this.jListColumnasSelectReporteEstadoProforma);
			
			this.jScrollColumnasSelectReporteEstadoProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoProforma.add(this.jListColumnasSelectReporteEstadoProforma, this.gridBagConstraintsEstadoProforma);
		this.jPanelReporteDinamicoEstadoProforma.add(this.jScrollColumnasSelectReporteEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoProforma = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoProforma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoProforma = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoProforma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoProforma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoProforma=new JScrollPane(this.jListRelacionesSelectReporteEstadoProforma);
			
			this.jScrollRelacionesSelectReporteEstadoProforma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoProforma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoProforma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoProforma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoProforma = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoProforma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoProforma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoProforma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoProforma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoProforma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoProforma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoProforma.add(this.jLabelGenerarExcelReporteDinamicoEstadoProforma, this.gridBagConstraintsEstadoProforma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoProforma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoProforma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoProforma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoProforma.setToolTipText("Generar EXCEL"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoProforma.add(this.jButtonGenerarExcelReporteDinamicoEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoProforma.add(this.jComboBoxTiposReportesDinamicoEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoProforma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoProforma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoProforma.add(this.jLabelTiposArchivoReporteDinamicoEstadoProforma, this.gridBagConstraintsEstadoProforma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoProforma.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoProforma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoProforma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoProforma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoProforma.setToolTipText("Generar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoProforma.add(this.jButtonGenerarReporteDinamicoEstadoProforma, this.gridBagConstraintsEstadoProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoProforma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoProforma.setToolTipText("Cancelar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoProforma.add(this.jButtonCerrarReporteDinamicoEstadoProforma, this.gridBagConstraintsEstadoProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoProforma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoProforma= new JScrollPane(jPanelReporteDinamicoEstadoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Proformas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoProforma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoProforma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoProforma);
		this.jInternalFrameReporteDinamicoEstadoProforma.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoProforma, this.gridBagConstraintsEstadoProforma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoProforma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoProforma.setName("jPanelImportacionEstadoProforma"); 
		
		this.jPanelImportacionEstadoProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoProforma.setLayout(gridaBagLayoutImportacionEstadoProforma);
		
		
		this.jInternalFrameImportacionEstadoProforma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoProforma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoProforma.setResizable(true);
	    this.jInternalFrameImportacionEstadoProforma.setClosable(true);
	    this.jInternalFrameImportacionEstadoProforma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoProforma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoProforma.setResizable(true);
	    this.jInternalFrameImportacionEstadoProforma.setClosable(true);
	    this.jInternalFrameImportacionEstadoProforma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Proformas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoProforma = new JLabelMe();

		this.jLabelArchivoImportacionEstadoProforma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoProforma.add(this.jLabelArchivoImportacionEstadoProforma, this.gridBagConstraintsEstadoProforma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoProforma = new JFileChooser();		
		this.jFileChooserImportacionEstadoProforma.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoProforma = new JButtonMe();
		this.jButtonAbrirImportacionEstadoProforma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoProforma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoProforma.setToolTipText("Generar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoProforma.add(this.jButtonAbrirImportacionEstadoProforma, this.gridBagConstraintsEstadoProforma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoProforma = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoProforma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoProforma.add(this.jLabelPathArchivoImportacionEstadoProforma, this.gridBagConstraintsEstadoProforma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoProforma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoProforma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoProforma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoProforma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoProforma.add(this.jTextFieldPathArchivoImportacionEstadoProforma, this.gridBagConstraintsEstadoProforma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoProforma = new JButtonMe();
		this.jButtonGenerarImportacionEstadoProforma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoProforma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoProforma.setToolTipText("Generar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoProforma.add(this.jButtonGenerarImportacionEstadoProforma, this.gridBagConstraintsEstadoProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoProforma = new JButtonMe();
		this.jButtonCerrarImportacionEstadoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoProforma.setToolTipText("Cancelar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoProforma.add(this.jButtonCerrarImportacionEstadoProforma, this.gridBagConstraintsEstadoProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoProforma = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoProforma= new JScrollPane(jPanelImportacionEstadoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoProforma.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoProforma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoProforma);
		this.jInternalFrameImportacionEstadoProforma.getContentPane().add(this.jScrollPanelImportacionEstadoProforma, this.gridBagConstraintsEstadoProforma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoProforma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoProforma = new JButtonMe();
			this.jButtonAbrirOrderByEstadoProforma.setText("Orden");
			this.jButtonAbrirOrderByEstadoProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoProforma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoProforma";
			inputMap = this.jButtonAbrirOrderByEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoProforma"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoProforma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoProforma.setName("jPanelOrderByEstadoProforma"); 
			
			this.jPanelOrderByEstadoProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoProforma.setLayout(gridaBagLayoutOrderByEstadoProforma);
			
			
			this.jTableDatosEstadoProformaOrderBy = new JTableMe();        
			this.jTableDatosEstadoProformaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoProformaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoProformaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoProformaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoProformaOrderBy.setViewportView(this.jTableDatosEstadoProformaOrderBy);
			this.jTableDatosEstadoProformaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoProformaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoProforma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoProforma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoProforma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoProforma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoProforma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoProforma.setTitle("Orden");
			this.jInternalFrameOrderByEstadoProforma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoProforma.setResizable(true);
			this.jInternalFrameOrderByEstadoProforma.setClosable(true);
			this.jInternalFrameOrderByEstadoProforma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Proformas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoProforma.ipady =150;
				
			this.jPanelOrderByEstadoProforma.add(jScrollPanelDatosEstadoProformaOrderBy, this.gridBagConstraintsEstadoProforma);//this.jTableDatosEstadoProformaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoProforma = new JButtonMe();
			this.jButtonCerrarOrderByEstadoProforma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoProforma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoProforma.setToolTipText("Cancelar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoProforma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoProforma.add(this.jButtonCerrarOrderByEstadoProforma, this.gridBagConstraintsEstadoProforma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoProforma = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoProforma= new JScrollPane(jPanelOrderByEstadoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoProforma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoProforma);
			
			this.jInternalFrameOrderByEstadoProforma.getContentPane().add(this.jScrollPanelOrderByEstadoProforma, this.gridBagConstraintsEstadoProforma);			
		
		} else {
			this.jButtonAbrirOrderByEstadoProforma = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadoproformaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoProforma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoProforma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoProforma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoProforma.getRowHeight();//EstadoProformaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoProforma.isSelected()) {
					iHeightTable=EstadoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoProforma.isSelected()) {
					iHeightTable=EstadoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoProforma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoProforma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoProforma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoProforma!=null && this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoProforma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoProforma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoProforma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoProforma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoproformaLogic.getEstadoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoproformas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoProforma> TraerEstadoProformaBeans(List<EstadoProforma> estadoproformas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoProforma estadoproforma:estadoproformas) {
					
				if(!(EstadoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoproforma.setsDetalleGeneralEntityReporte(EstadoProformaConstantesFunciones.getEstadoProformaDescripcion(estadoproforma));
										
						
					
						
					
				} else  {
							
					//estadoproforma.setsDetalleGeneralEntityReporte(estadoproforma.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoproformabeans.add(estadoproformabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoproformas;
    }
	//PARA REPORTES FIN
}
