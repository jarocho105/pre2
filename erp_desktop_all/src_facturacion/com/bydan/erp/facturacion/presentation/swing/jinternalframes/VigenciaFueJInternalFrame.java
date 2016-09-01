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
import com.bydan.erp.facturacion.util.VigenciaFueConstantesFunciones;

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
public class VigenciaFueJInternalFrame extends VigenciaFueBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVigenciaFue;
	
	protected JMenuBar jmenuBarVigenciaFue;
	
	protected JMenu jmenuVigenciaFue;
	protected JMenu jmenuDatosVigenciaFue;
	protected JMenu jmenuArchivoVigenciaFue;
	protected JMenu jmenuAccionesVigenciaFue;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVigenciaFue;	
	protected GridBagConstraints gridBagConstraintsVigenciaFue;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VigenciaFueDetalleFormJInternalFrame jInternalFrameDetalleFormVigenciaFue;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVigenciaFue;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVigenciaFue;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public VigenciaFueSessionBean vigenciafueSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VigenciaFue> vigenciafues;		
	public List<VigenciaFue> vigenciafuesEliminados;	
	public List<VigenciaFue> vigenciafuesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVigenciaFue;		
	protected JButton jButtonAbrirOrderByVigenciaFue;
	
	
	//protected JPanel jPanelOrderByVigenciaFue;
	//public JScrollPane jScrollPanelOrderByVigenciaFue;	
	//protected JButton jButtonCerrarOrderByVigenciaFue;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VigenciaFueLogic vigenciafueLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVigenciaFue;
	public JScrollPane jScrollPanelDatosEdicionVigenciaFue;
	public JScrollPane jScrollPanelDatosGeneralVigenciaFue;
    
	
	
	//public JScrollPane jScrollPanelDatosVigenciaFueOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVigenciaFue;
	//public JScrollPane jScrollPanelImportacionVigenciaFue;
	
	
	
	protected JPanel jPanelAccionesVigenciaFue;
	
    protected JPanel jPanelPaginacionVigenciaFue;
    protected JPanel jPanelParametrosReportesVigenciaFue;
	protected JPanel jPanelParametrosReportesAccionesVigenciaFue;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VigenciaFue;
	protected JPanel jPanelParametrosAuxiliar2VigenciaFue;
	protected JPanel jPanelParametrosAuxiliar3VigenciaFue;
	protected JPanel jPanelParametrosAuxiliar4VigenciaFue;
	//protected JPanel jPanelParametrosAuxiliar5VigenciaFue;
	
	
	
	//protected JPanel jPanelReporteDinamicoVigenciaFue;
	//protected JPanel jPanelImportacionVigenciaFue;
	
	
	public JTable jTableDatosVigenciaFue;
	
	
	
	//public JTable jTableDatosVigenciaFueOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVigenciaFue;
	protected JButton jButtonDuplicarVigenciaFue;
	protected JButton jButtonCopiarVigenciaFue;
	protected JButton jButtonVerFormVigenciaFue;
	protected JButton jButtonNuevoRelacionesVigenciaFue;
	protected JButton jButtonModificarVigenciaFue;
	
    protected JButton jButtonGuardarCambiosTablaVigenciaFue;
	protected JButton jButtonCerrarVigenciaFue;
	
	
	protected JButton jButtonRecargarInformacionVigenciaFue;
	protected JButton jButtonProcesarInformacionVigenciaFue;
	
	
	protected JButton jButtonAnterioresVigenciaFue;
	protected JButton jButtonSiguientesVigenciaFue;
	protected JButton jButtonNuevoGuardarCambiosVigenciaFue;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVigenciaFue;
	//protected JButton jButtonCerrarReporteDinamicoVigenciaFue;
	//protected JButton jButtonGenerarExcelReporteDinamicoVigenciaFue;	
	
	
	
	//protected JButton jButtonAbrirImportacionVigenciaFue;
	//protected JButton jButtonGenerarImportacionVigenciaFue;
	//protected JButton jButtonCerrarImportacionVigenciaFue;
	//protected JFileChooser jFileChooserImportacionVigenciaFue;
	//protected File fileImportacionVigenciaFue;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVigenciaFue;
	protected JButton jButtonDuplicarToolBarVigenciaFue;
	protected JButton jButtonNuevoRelacionesToolBarVigenciaFue;
	
	
	public JButton jButtonGuardarCambiosToolBarVigenciaFue;
	protected JButton jButtonCopiarToolBarVigenciaFue;
	protected JButton jButtonVerFormToolBarVigenciaFue;
	public JButton jButtonGuardarCambiosTablaToolBarVigenciaFue;
	protected JButton jButtonMostrarOcultarTablaToolBarVigenciaFue;
	protected JButton jButtonCerrarToolBarVigenciaFue;
	
	protected JButton jButtonRecargarInformacionToolBarVigenciaFue;
	protected JButton jButtonProcesarInformacionToolBarVigenciaFue;
	protected JButton jButtonAnterioresToolBarVigenciaFue;
	protected JButton jButtonSiguientesToolBarVigenciaFue;
	protected JButton jButtonNuevoGuardarCambiosToolBarVigenciaFue;
	protected JButton jButtonAbrirOrderByToolBarVigenciaFue;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVigenciaFue;
	protected JMenuItem jMenuItemDuplicarVigenciaFue;
	protected JMenuItem jMenuItemNuevoRelacionesVigenciaFue;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVigenciaFue;
	protected JMenuItem jMenuItemCopiarVigenciaFue;
	protected JMenuItem jMenuItemVerFormVigenciaFue;
	protected JMenuItem jMenuItemGuardarCambiosTablaVigenciaFue;
	protected JMenuItem jMenuItemCerrarVigenciaFue;
	protected JMenuItem jMenuItemDetalleCerrarVigenciaFue;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVigenciaFue;
	protected JMenuItem jMenuItemDetalleMostarOcultarVigenciaFue;
	
	protected JMenuItem jMenuItemRecargarInformacionVigenciaFue;
	protected JMenuItem jMenuItemProcesarInformacionVigenciaFue;
	protected JMenuItem jMenuItemAnterioresVigenciaFue;
	protected JMenuItem jMenuItemSiguientesVigenciaFue;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVigenciaFue;
	protected JMenuItem jMenuItemAbrirOrderByVigenciaFue;
	protected JMenuItem jMenuItemMostrarOcultarVigenciaFue;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVigenciaFue;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVigenciaFue;
	protected JCheckBox jCheckBoxSeleccionadosVigenciaFue;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVigenciaFue;
	protected JCheckBox jCheckBoxConGraficoReporteVigenciaFue;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVigenciaFue;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVigenciaFue;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVigenciaFue;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVigenciaFue;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVigenciaFue;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVigenciaFue;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVigenciaFue;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVigenciaFue;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVigenciaFue;
	protected JTextField jTextFieldValorCampoGeneralVigenciaFue;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVigenciaFue;
	//public JList<Reporte> jListColumnasSelectReporteVigenciaFue;
	//public JScrollPane jScrollColumnasSelectReporteVigenciaFue;
	
	//public JLabel jLabelRelacionesSelectReporteVigenciaFue;
	//public JList<Reporte> jListRelacionesSelectReporteVigenciaFue;
	//public JScrollPane jScrollRelacionesSelectReporteVigenciaFue;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVigenciaFue;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVigenciaFue;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVigenciaFue;
	//public JLabel jLabelTiposArchivoReporteDinamicoVigenciaFue;
	
		
	//public JLabel jLabelArchivoImportacionVigenciaFue;	
	//public JLabel jLabelPathArchivoImportacionVigenciaFue;
	//protected JTextField jTextFieldPathArchivoImportacionVigenciaFue;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVigenciaFue;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVigenciaFue;
	
	//public JLabel jLabelColumnaCategoriaValorVigenciaFue;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVigenciaFue;
	
	//public JLabel jLabelColumnasValoresGraficoVigenciaFue;
	//public JList<Reporte> jListColumnasValoresGraficoVigenciaFue;
	//public JScrollPane jScrollColumnasValoresGraficoVigenciaFue;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVigenciaFue;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVigenciaFue;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVigenciaFue;
	public JPanel jPanelFK_IdCiudadVigenciaFue;
	public JButton jButtonFK_IdCiudadVigenciaFue;
	public JPanel jPanelFK_IdPaisVigenciaFue;
	public JButton jButtonFK_IdPaisVigenciaFue;
	
	public JPanel jPanelid_ciudadFK_IdCiudadVigenciaFue;
	public JLabel jLabelid_ciudadFK_IdCiudadVigenciaFue;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadVigenciaFue;
	public JButton jButtonid_ciudadFK_IdCiudadVigenciaFue= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadVigenciaFueUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadVigenciaFueBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisVigenciaFue;
	public JLabel jLabelid_paisFK_IdPaisVigenciaFue;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisVigenciaFue;
	public JButton jButtonid_paisFK_IdPaisVigenciaFue= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisVigenciaFueUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisVigenciaFueBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VigenciaFueJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VigenciaFueJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VigenciaFueJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VigenciaFueJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVigenciaFue)	{
		this.jButtonRecargarInformacionVigenciaFue = jButtonRecargarInformacionVigenciaFue;
	}
	
	public JButton getjButtonProcesarInformacionVigenciaFue() {
		return this.jButtonProcesarInformacionVigenciaFue;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVigenciaFue)	{
		this.jButtonProcesarInformacionVigenciaFue = jButtonProcesarInformacionVigenciaFue;
	}
	
	
	public JButton getjButtonRecargarInformacionVigenciaFue() {
		return this.jButtonRecargarInformacionVigenciaFue;
	}
	
	
	public List<VigenciaFue> getvigenciafues() {
		return this.vigenciafues;
	}

	public void setvigenciafues(List<VigenciaFue> vigenciafues) {
		this.vigenciafues = vigenciafues;
	}
	
	public List<VigenciaFue> getvigenciafuesAux() {
		return this.vigenciafuesAux;
	}

	public void setvigenciafuesAux(List<VigenciaFue> vigenciafuesAux) {
		this.vigenciafuesAux = vigenciafuesAux;
	}
	
	public List<VigenciaFue> getvigenciafuesEliminados() {
		return this.vigenciafuesEliminados;
	}

	public void setVigenciaFuesEliminados(List<VigenciaFue> vigenciafuesEliminados) {
		this.vigenciafuesEliminados = vigenciafuesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVigenciaFue() {
		return jComboBoxTiposSeleccionarVigenciaFue;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVigenciaFue(
			JComboBox jComboBoxTiposSeleccionarVigenciaFue) {
		this.jComboBoxTiposSeleccionarVigenciaFue = jComboBoxTiposSeleccionarVigenciaFue;
	}
	
	public void setBorderResaltarTiposSeleccionarVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVigenciaFue .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVigenciaFue() {
		return jTextFieldValorCampoGeneralVigenciaFue;
	}

	public void setjTextFieldValorCampoGeneralVigenciaFue(
			JTextField jTextFieldValorCampoGeneralVigenciaFue) {
		this.jTextFieldValorCampoGeneralVigenciaFue = jTextFieldValorCampoGeneralVigenciaFue;
	}

	public void setBorderResaltarValorCampoGeneralVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVigenciaFue .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVigenciaFue() {
		return this.jCheckBoxSeleccionarTodosVigenciaFue;
	}

	public void setjCheckBoxSeleccionarTodosVigenciaFue(
			JCheckBox jCheckBoxSeleccionarTodosVigenciaFue) {
		this.jCheckBoxSeleccionarTodosVigenciaFue = jCheckBoxSeleccionarTodosVigenciaFue;
	}

	public void setBorderResaltarSeleccionarTodosVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVigenciaFue .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVigenciaFue() {
		return this.jCheckBoxSeleccionadosVigenciaFue;
	}

	public void setjCheckBoxSeleccionadosVigenciaFue(
			JCheckBox jCheckBoxSeleccionadosVigenciaFue) {
		this.jCheckBoxSeleccionadosVigenciaFue = jCheckBoxSeleccionadosVigenciaFue;
	}
	
	public void setBorderResaltarSeleccionadosVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVigenciaFue .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVigenciaFue() {
		return this.jComboBoxTiposArchivosReportesVigenciaFue;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVigenciaFue(
			JComboBox jComboBoxTiposArchivosReportesVigenciaFue) {
		this.jComboBoxTiposArchivosReportesVigenciaFue = jComboBoxTiposArchivosReportesVigenciaFue;
	}

	public void setBorderResaltarTiposArchivosReportesVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVigenciaFue .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVigenciaFue() {
		return this.jComboBoxTiposReportesVigenciaFue;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVigenciaFue(
			JComboBox jComboBoxTiposReportesVigenciaFue) {
		this.jComboBoxTiposReportesVigenciaFue = jComboBoxTiposReportesVigenciaFue;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVigenciaFue() {
	//	return jComboBoxTiposReportesDinamicoVigenciaFue;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVigenciaFue(
	//		JComboBox jComboBoxTiposReportesDinamicoVigenciaFue) {
	//	this.jComboBoxTiposReportesDinamicoVigenciaFue = jComboBoxTiposReportesDinamicoVigenciaFue;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVigenciaFue() {
	//	return jComboBoxTiposArchivosReportesDinamicoVigenciaFue;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVigenciaFue(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVigenciaFue) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVigenciaFue = jComboBoxTiposArchivosReportesDinamicoVigenciaFue;
	//}
	
	public void setBorderResaltarTiposReportesVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVigenciaFue .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVigenciaFue() {
		return this.jComboBoxTiposGraficosReportesVigenciaFue;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVigenciaFue(
			JComboBox jComboBoxTiposGraficosReportesVigenciaFue) {
		this.jComboBoxTiposGraficosReportesVigenciaFue = jComboBoxTiposGraficosReportesVigenciaFue;
	}
	
	public void setBorderResaltarTiposGraficosReportesVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVigenciaFue .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVigenciaFue() {
		return this.jComboBoxTiposPaginacionVigenciaFue;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVigenciaFue(
			JComboBox jComboBoxTiposPaginacionVigenciaFue) {
		this.jComboBoxTiposPaginacionVigenciaFue = jComboBoxTiposPaginacionVigenciaFue;
	}
	
	public void setBorderResaltarTiposPaginacionVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVigenciaFue .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVigenciaFue() {
		return this.jComboBoxTiposRelacionesVigenciaFue;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVigenciaFue() {
		return this.jComboBoxTiposAccionesVigenciaFue;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVigenciaFue(
			JComboBox jComboBoxTiposRelacionesVigenciaFue) {
		this.jComboBoxTiposRelacionesVigenciaFue = jComboBoxTiposRelacionesVigenciaFue;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVigenciaFue(
			JComboBox jComboBoxTiposAccionesVigenciaFue) {
		this.jComboBoxTiposAccionesVigenciaFue = jComboBoxTiposAccionesVigenciaFue;
	}
	
	public void setBorderResaltarTiposRelacionesVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVigenciaFue .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVigenciaFue() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVigenciaFue .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVigenciaFue() {
	//	return jCheckBoxConGraficoDinamicoVigenciaFue;
	//}

	//public void setjCheckBoxConGraficoDinamicoVigenciaFue(
	//		JCheckBox jCheckBoxConGraficoDinamicoVigenciaFue) {
	//	this.jCheckBoxConGraficoDinamicoVigenciaFue = jCheckBoxConGraficoDinamicoVigenciaFue;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVigenciaFue() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVigenciaFue.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVigenciaFue .setBorder(borderResaltar);		
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
		this.vigenciafueSessionBean=new VigenciaFueSessionBean();
		
		this.vigenciafueSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vigenciafueSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vigenciafueSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VigenciaFueJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VigenciaFueJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VigenciaFueJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VigenciaFueJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VigenciaFueJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vigencia Fue MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
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
		
		VigenciaFueJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VigenciaFue No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVigenciaFue= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"nuevo","nuevo","Nuevo"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"duplicar","duplicar","Duplicar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"copiar","copiar","Copiar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"ver_form","ver_form","Ver"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"recargar","recargar","Recargar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVigenciaFue=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVigenciaFue,this.jTtoolBarVigenciaFue,
							"cerrar","cerrar","Salir"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVigenciaFue=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVigenciaFue;
			
				this.jButtonProcesarInformacionToolBarVigenciaFue=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVigenciaFue;
				
		//protected JButton jButtonModificarToolBarVigenciaFue;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVigenciaFue=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVigenciaFue=new JMenuMe("General");
		this.jmenuArchivoVigenciaFue=new JMenuMe("Archivo");
		this.jmenuAccionesVigenciaFue=new JMenuMe("Acciones");
		this.jmenuDatosVigenciaFue=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVigenciaFue= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVigenciaFue.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVigenciaFue,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVigenciaFue= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVigenciaFue.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVigenciaFue,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVigenciaFue= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVigenciaFue.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVigenciaFue,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVigenciaFue= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVigenciaFue.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVigenciaFue,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVigenciaFue= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVigenciaFue.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVigenciaFue,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVigenciaFue= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVigenciaFue.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVigenciaFue,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVigenciaFue= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVigenciaFue.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVigenciaFue,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVigenciaFue= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVigenciaFue.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVigenciaFue,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVigenciaFue= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVigenciaFue.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVigenciaFue,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVigenciaFue= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVigenciaFue.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVigenciaFue,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVigenciaFue= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVigenciaFue.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVigenciaFue,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVigenciaFue= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVigenciaFue.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVigenciaFue,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVigenciaFue= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVigenciaFue.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVigenciaFue,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVigenciaFue= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVigenciaFue.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVigenciaFue,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVigenciaFue= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVigenciaFue.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVigenciaFue,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVigenciaFue= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVigenciaFue.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVigenciaFue,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVigenciaFue= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVigenciaFue.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVigenciaFue,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVigenciaFue.add(this.jMenuItemCerrarVigenciaFue);
			
			this.jmenuAccionesVigenciaFue.add(this.jMenuItemNuevoVigenciaFue);
			this.jmenuAccionesVigenciaFue.add(this.jMenuItemNuevoGuardarCambiosVigenciaFue);
			this.jmenuAccionesVigenciaFue.add(this.jMenuItemNuevoRelacionesVigenciaFue);
			this.jmenuAccionesVigenciaFue.add(this.jMenuItemGuardarCambiosTablaVigenciaFue);		
			this.jmenuAccionesVigenciaFue.add(this.jMenuItemDuplicarVigenciaFue);		
			this.jmenuAccionesVigenciaFue.add(this.jMenuItemCopiarVigenciaFue);		
			this.jmenuAccionesVigenciaFue.add(this.jMenuItemVerFormVigenciaFue);		
			
			this.jmenuDatosVigenciaFue.add(this.jMenuItemRecargarInformacionVigenciaFue);				
			this.jmenuDatosVigenciaFue.add(this.jMenuItemAnterioresVigenciaFue);				
			this.jmenuDatosVigenciaFue.add(this.jMenuItemSiguientesVigenciaFue);				
			this.jmenuDatosVigenciaFue.add(this.jMenuItemAbrirOrderByVigenciaFue);				
			this.jmenuDatosVigenciaFue.add(this.jMenuItemMostrarOcultarVigenciaFue);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVigenciaFue.add(this.jMenuItemGuardarCambiosVigenciaFue);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVigenciaFue.add(this.jmenuArchivoVigenciaFue);		
			this.jmenuBarVigenciaFue.add(this.jmenuAccionesVigenciaFue);		
			this.jmenuBarVigenciaFue.add(this.jmenuDatosVigenciaFue);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVigenciaFue);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVigenciaFue() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadVigenciaFue.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadVigenciaFue= new JButtonMe();
		this.jButtonFK_IdCiudadVigenciaFue.setText("Buscar");
		this.jButtonFK_IdCiudadVigenciaFue.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadVigenciaFue,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadVigenciaFue = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadVigenciaFue.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadVigenciaFue.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadVigenciaFue,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadVigenciaFue= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadVigenciaFue,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisVigenciaFue=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisVigenciaFue.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisVigenciaFue= new JButtonMe();
		this.jButtonFK_IdPaisVigenciaFue.setText("Buscar");
		this.jButtonFK_IdPaisVigenciaFue.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisVigenciaFue,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisVigenciaFue = new JLabelMe();
		jLabelid_paisFK_IdPaisVigenciaFue.setText("Pais :");
		jLabelid_paisFK_IdPaisVigenciaFue.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisVigenciaFue,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisVigenciaFue= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisVigenciaFue,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasVigenciaFue=new JTabbedPane();


		this.jTabbedPaneBusquedasVigenciaFue.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVigenciaFue.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVigenciaFue.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVigenciaFue.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVigenciaFue,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVigenciaFue = new VigenciaFueDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Vigencia Fue DATOS");
			this.jInternalFrameDetalleFormVigenciaFue = new VigenciaFueDetalleFormJInternalFrame(jDesktopPane,this.vigenciafueSessionBean.getConGuardarRelaciones(),this.vigenciafueSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVigenciaFue = null;//new VigenciaFueDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVigenciaFue= new GridBagLayout();
		
		
		this.jTableDatosVigenciaFue = new JTableMe();      
		
		String sToolTipVigenciaFue="";
		sToolTipVigenciaFue=VigenciaFueConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVigenciaFue+="(Facturacion.VigenciaFue)";
		}
		
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			sToolTipVigenciaFue+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVigenciaFue.setToolTipText(sToolTipVigenciaFue);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVigenciaFue);
		this.jTableDatosVigenciaFue.setAutoCreateRowSorter(true);
		this.jTableDatosVigenciaFue.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVigenciaFue.setRowSelectionAllowed(true);
		this.jTableDatosVigenciaFue.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVigenciaFue,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVigenciaFue = new JButtonMe();
		this.jButtonDuplicarVigenciaFue = new JButtonMe();
		this.jButtonCopiarVigenciaFue = new JButtonMe();
		this.jButtonVerFormVigenciaFue = new JButtonMe();
		this.jButtonNuevoRelacionesVigenciaFue = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVigenciaFue = new JButtonMe();
		this.jButtonCerrarVigenciaFue = new JButtonMe();
		
		this.jScrollPanelDatosVigenciaFue = new JScrollPane();   
        this.jScrollPanelDatosGeneralVigenciaFue = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Vigencia Fue";
		
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vigencia Fues" + this.sPath));
		} else {
			this.jScrollPanelDatosVigenciaFue.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVigenciaFue.setToolTipText("Acciones");
        this.jPanelAccionesVigenciaFue.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVigenciaFue=new ReporteDinamicoJInternalFrame(VigenciaFueConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVigenciaFue();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVigenciaFue=new ImportacionJInternalFrame(VigenciaFueConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVigenciaFue();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVigenciaFue = new JButtonMe();
		
		this.jButtonAbrirOrderByVigenciaFue.setText("Orden");
		this.jButtonAbrirOrderByVigenciaFue.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVigenciaFue,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVigenciaFue=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVigenciaFue,false,this);
			
			//this.cargarOrderByVigenciaFue(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVigenciaFue=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVigenciaFue,true,this);
			
			//this.cargarOrderByVigenciaFue(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVigenciaFue.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosVigenciaFue.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosVigenciaFue.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosVigenciaFue.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVigenciaFue.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVigenciaFue.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVigenciaFue.setText("Nuevo");
		this.jButtonDuplicarVigenciaFue.setText("Duplicar");
		this.jButtonCopiarVigenciaFue.setText("Copiar");
		this.jButtonVerFormVigenciaFue.setText("Ver");
		this.jButtonNuevoRelacionesVigenciaFue.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVigenciaFue.setText("Guardar");
		this.jButtonCerrarVigenciaFue.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVigenciaFue,"nuevo_button","Nuevo",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVigenciaFue,"duplicar_button","Duplicar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVigenciaFue,"copiar_button","Copiar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVigenciaFue,"ver_form","Ver",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVigenciaFue,"nuevorelaciones_button","Nuevo Rel",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVigenciaFue,"guardarcambiostabla_button","Guardar",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVigenciaFue,"cerrar_button","Salir",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVigenciaFue.setToolTipText("Nuevo"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVigenciaFue.setToolTipText("Duplicar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVigenciaFue.setToolTipText("Copiar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVigenciaFue.setToolTipText("Ver"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVigenciaFue.setToolTipText("Nuevo Rel"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVigenciaFue.setToolTipText("Guardar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVigenciaFue.setToolTipText("Salir"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVigenciaFue";
		inputMap = this.jButtonNuevoVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVigenciaFue.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVigenciaFue"));
		
		//DUPLICAR
		sMapKey = "DuplicarVigenciaFue";
		inputMap = this.jButtonDuplicarVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVigenciaFue.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVigenciaFue"));
		
		//COPIAR
		sMapKey = "CopiarVigenciaFue";
		inputMap = this.jButtonCopiarVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVigenciaFue.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVigenciaFue"));
		
		//VEr FORM
		sMapKey = "VerFormVigenciaFue";
		inputMap = this.jButtonVerFormVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVigenciaFue.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVigenciaFue"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVigenciaFue";
		inputMap = this.jButtonNuevoRelacionesVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVigenciaFue"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVigenciaFue";
		inputMap = this.jButtonModificarVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVigenciaFue"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVigenciaFue";
		inputMap = this.jButtonCerrarVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVigenciaFue"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVigenciaFue";
		inputMap = this.jButtonGuardarCambiosTablaVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVigenciaFue"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VigenciaFue= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VigenciaFue= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VigenciaFue= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VigenciaFue= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VigenciaFue= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVigenciaFue.setName("jPanelParametrosReportesVigenciaFue"); 
		
		this.jPanelParametrosReportesAccionesVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVigenciaFue.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVigenciaFue.setName("jPanelParametrosReportesAccionesVigenciaFue"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVigenciaFue, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVigenciaFue = new JButtonMe();
		this.jButtonRecargarInformacionVigenciaFue.setText("Recargar");
		this.jButtonRecargarInformacionVigenciaFue.setToolTipText("Recargar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVigenciaFue,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVigenciaFue = new JButtonMe();
		this.jButtonProcesarInformacionVigenciaFue.setText("Procesar");
		this.jButtonProcesarInformacionVigenciaFue.setToolTipText("Procesar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVigenciaFue.setVisible(false);
			
		this.jButtonProcesarInformacionVigenciaFue.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVigenciaFue.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVigenciaFue.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVigenciaFue.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVigenciaFue.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVigenciaFue.setText("TIPO");       
		this.jComboBoxTiposReportesVigenciaFue.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVigenciaFue.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVigenciaFue.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVigenciaFue.setText("Paginacion");
		this.jComboBoxTiposPaginacionVigenciaFue.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVigenciaFue.setText("Accion");
		this.jComboBoxTiposRelacionesVigenciaFue.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVigenciaFue.setText("Accion");
		this.jComboBoxTiposAccionesVigenciaFue.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVigenciaFue = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVigenciaFue.setText("Accion");
		this.jComboBoxTiposSeleccionarVigenciaFue.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVigenciaFue=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVigenciaFue.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVigenciaFue.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVigenciaFue.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVigenciaFue = new JLabelMe();
		
		this.jLabelAccionesVigenciaFue.setText("Acciones");		
		this.jLabelAccionesVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVigenciaFue = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVigenciaFue.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVigenciaFue.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVigenciaFue = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVigenciaFue.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVigenciaFue.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVigenciaFue = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVigenciaFue.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVigenciaFue.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVigenciaFue = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVigenciaFue.setText("Graf.");
		this.jCheckBoxConGraficoReporteVigenciaFue.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVigenciaFue = new JButtonMe();
		//this.jButtonAnterioresVigenciaFue.setText("<<");
        this.jButtonAnterioresVigenciaFue.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVigenciaFue,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVigenciaFue = new JButtonMe();
		//this.jButtonSiguientesVigenciaFue.setText(">>");
        this.jButtonSiguientesVigenciaFue.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVigenciaFue,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVigenciaFue = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVigenciaFue.setText("Nue");
        this.jButtonNuevoGuardarCambiosVigenciaFue.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVigenciaFue,"nuevoguardarcambios_button","Nue",this.vigenciafueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVigenciaFue";
		inputMap = this.jButtonNuevoGuardarCambiosVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVigenciaFue"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVigenciaFue";
		inputMap = this.jButtonRecargarInformacionVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVigenciaFue"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVigenciaFue";
		inputMap = this.jButtonSiguientesVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVigenciaFue"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVigenciaFue";
		inputMap = this.jButtonAnterioresVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVigenciaFue"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVigenciaFue();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVigenciaFue.setMinimumSize(new Dimension(this.getWidth(),VigenciaFueBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VigenciaFueBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVigenciaFue.setMaximumSize(new Dimension(this.getWidth(),VigenciaFueBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VigenciaFueBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVigenciaFue.setPreferredSize(new Dimension(this.getWidth(),VigenciaFueBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VigenciaFueBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVigenciaFue = new GridBagLayout();

			this.jPanelPaginacionVigenciaFue.setLayout(gridaBagLayoutPaginacionVigenciaFue);						
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = 0;
			this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVigenciaFue.add(this.jButtonAnterioresVigenciaFue, this.gridBagConstraintsVigenciaFue);
					
						
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVigenciaFue.gridy = 0;
			
			this.jPanelPaginacionVigenciaFue.add(this.jButtonNuevoGuardarCambiosVigenciaFue, this.gridBagConstraintsVigenciaFue);
						
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVigenciaFue.gridy = 0;
			this.jPanelPaginacionVigenciaFue.add(this.jButtonSiguientesVigenciaFue, this.gridBagConstraintsVigenciaFue);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = 1;
			this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVigenciaFue.add(this.jButtonNuevoVigenciaFue, this.gridBagConstraintsVigenciaFue);
						
			
			
			if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
				this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVigenciaFue.gridy = 1;
				this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVigenciaFue.add(this.jButtonGuardarCambiosTablaVigenciaFue, this.gridBagConstraintsVigenciaFue);
			}
			
			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = 1;
			this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVigenciaFue.add(this.jButtonDuplicarVigenciaFue, this.gridBagConstraintsVigenciaFue);
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = 1;
			this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVigenciaFue.add(this.jButtonCopiarVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = 1;
			this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVigenciaFue.add(this.jButtonVerFormVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = 1;
			this.gridBagConstraintsVigenciaFue.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVigenciaFue.add(this.jButtonCerrarVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		
		
		this.jButtonRecargarInformacionVigenciaFue.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVigenciaFue.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVigenciaFue.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVigenciaFue.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVigenciaFue.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVigenciaFue.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVigenciaFue.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVigenciaFue.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVigenciaFue.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVigenciaFue.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVigenciaFue.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVigenciaFue.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVigenciaFue.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVigenciaFue.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVigenciaFue.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVigenciaFue.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVigenciaFue.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVigenciaFue.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVigenciaFue.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVigenciaFue.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVigenciaFue.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVigenciaFue.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVigenciaFue.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVigenciaFue.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVigenciaFue.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVigenciaFue.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVigenciaFue.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVigenciaFue.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVigenciaFue.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVigenciaFue.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVigenciaFue.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVigenciaFue.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVigenciaFue.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVigenciaFue.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVigenciaFue.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVigenciaFue.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVigenciaFue = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVigenciaFue = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VigenciaFue = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VigenciaFue = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VigenciaFue = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VigenciaFue = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVigenciaFue.setLayout(gridaBagParametrosReportesVigenciaFue);
			this.jPanelParametrosReportesAccionesVigenciaFue.setLayout(gridaBagParametrosReportesAccionesVigenciaFue);
			
			
			this.jPanelParametrosAuxiliar1VigenciaFue.setLayout(gridaBagParametrosAuxiliar1VigenciaFue);
			this.jPanelParametrosAuxiliar2VigenciaFue.setLayout(gridaBagParametrosAuxiliar2VigenciaFue);
			this.jPanelParametrosAuxiliar3VigenciaFue.setLayout(gridaBagParametrosAuxiliar3VigenciaFue);
			this.jPanelParametrosAuxiliar4VigenciaFue.setLayout(gridaBagParametrosAuxiliar4VigenciaFue);
			//this.jPanelParametrosAuxiliar5VigenciaFue.setLayout(gridaBagParametrosAuxiliar2VigenciaFue);			
			
			
			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVigenciaFue.add(this.jButtonRecargarInformacionVigenciaFue, this.gridBagConstraintsVigenciaFue);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VigenciaFue.add(this.jComboBoxTiposPaginacionVigenciaFue, this.gridBagConstraintsVigenciaFue);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VigenciaFue.add(this.jCheckBoxConAltoMaximoTablaVigenciaFue, this.gridBagConstraintsVigenciaFue);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VigenciaFue.add(this.jComboBoxTiposArchivosReportesVigenciaFue, this.gridBagConstraintsVigenciaFue);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVigenciaFue.add(this.jPanelParametrosAuxiliar1VigenciaFue, this.gridBagConstraintsVigenciaFue);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VigenciaFue.add(this.jComboBoxTiposReportesVigenciaFue, this.gridBagConstraintsVigenciaFue);																		
			
			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VigenciaFue.add(this.jComboBoxTiposGraficosReportesVigenciaFue, this.gridBagConstraintsVigenciaFue);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVigenciaFue.add(this.jPanelParametrosAuxiliar4VigenciaFue, this.gridBagConstraintsVigenciaFue);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVigenciaFue.add(this.jComboBoxTiposReportesVigenciaFue, this.gridBagConstraintsVigenciaFue);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVigenciaFue.add(this.jCheckBoxGenerarReporteVigenciaFue, this.gridBagConstraintsVigenciaFue);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVigenciaFue.add(this.jPanelParametrosAuxiliar2VigenciaFue, this.gridBagConstraintsVigenciaFue);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVigenciaFue.add(this.jLabelAccionesVigenciaFue, this.gridBagConstraintsVigenciaFue);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
				this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVigenciaFue.add(this.jButtonAbrirOrderByVigenciaFue, this.gridBagConstraintsVigenciaFue);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVigenciaFue.add(this.jComboBoxTiposSeleccionarVigenciaFue, this.gridBagConstraintsVigenciaFue);			
			
			
			/*
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVigenciaFue.add(this.jCheckBoxSeleccionarTodosVigenciaFue, this.gridBagConstraintsVigenciaFue);
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVigenciaFue.add(this.jCheckBoxConGraficoReporteVigenciaFue, this.gridBagConstraintsVigenciaFue);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VigenciaFue.add(this.jCheckBoxSeleccionarTodosVigenciaFue, this.gridBagConstraintsVigenciaFue);															
				
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VigenciaFue.add(this.jCheckBoxSeleccionadosVigenciaFue, this.gridBagConstraintsVigenciaFue);															
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVigenciaFue.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VigenciaFue.add(this.jCheckBoxConGraficoReporteVigenciaFue, this.gridBagConstraintsVigenciaFue);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVigenciaFue.add(this.jPanelParametrosAuxiliar3VigenciaFue, this.gridBagConstraintsVigenciaFue);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVigenciaFue.add(this.jComboBoxTiposAccionesVigenciaFue, this.gridBagConstraintsVigenciaFue);
	
				
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVigenciaFue.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVigenciaFue.add(this.jTextFieldValorCampoGeneralVigenciaFue, this.gridBagConstraintsVigenciaFue);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVigenciaFue = new GridBagLayout();

			this.jScrollPanelDatosVigenciaFue.setLayout(gridaBagLayoutDatosVigenciaFue);
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = 0;
			this.gridBagConstraintsVigenciaFue.gridx = 0;
			
			this.jScrollPanelDatosVigenciaFue.add(this.jTableDatosVigenciaFue, this.gridBagConstraintsVigenciaFue);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVigenciaFue.setViewportView(this.jTableDatosVigenciaFue);
		this.jTableDatosVigenciaFue.setFillsViewportHeight(true);
		this.jTableDatosVigenciaFue.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVigenciaFue= new GridBagLayout();
		this.jPanelAccionesVigenciaFue.setLayout(gridaBagLayoutAccionesVigenciaFue);
		
		
		/*	
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = 0;
		this.gridBagConstraintsVigenciaFue.gridx = 0;
			
		this.jPanelAccionesVigenciaFue.add(this.jButtonNuevoVigenciaFue, this.gridBagConstraintsVigenciaFue);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadVigenciaFue= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadVigenciaFue.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadVigenciaFue.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadVigenciaFue.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadVigenciaFue.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadVigenciaFue.setLayout(gridaBagLayoutFK_IdCiudadVigenciaFue);

		gridBagConstraintsVigenciaFue = new GridBagConstraints();
		gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVigenciaFue.gridy = 0;
		gridBagConstraintsVigenciaFue.gridx = 0;
		jPanelFK_IdCiudadVigenciaFue.add(jLabelid_ciudadFK_IdCiudadVigenciaFue, gridBagConstraintsVigenciaFue);

		gridBagConstraintsVigenciaFue = new GridBagConstraints();
		gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVigenciaFue.gridy = 0;
		gridBagConstraintsVigenciaFue.gridx = 1;
		jPanelFK_IdCiudadVigenciaFue.add(jComboBoxid_ciudadFK_IdCiudadVigenciaFue, gridBagConstraintsVigenciaFue);

		gridBagConstraintsVigenciaFue = new GridBagConstraints();
		gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVigenciaFue.gridy = 1;
		gridBagConstraintsVigenciaFue.gridx =1;
		jPanelFK_IdCiudadVigenciaFue.add(jButtonFK_IdCiudadVigenciaFue, gridBagConstraintsVigenciaFue);

		jTabbedPaneBusquedasVigenciaFue.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadVigenciaFue);
		jTabbedPaneBusquedasVigenciaFue.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisVigenciaFue= new GridBagLayout();
		gridaBagLayoutFK_IdPaisVigenciaFue.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisVigenciaFue.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisVigenciaFue.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisVigenciaFue.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisVigenciaFue.setLayout(gridaBagLayoutFK_IdPaisVigenciaFue);

		gridBagConstraintsVigenciaFue = new GridBagConstraints();
		gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVigenciaFue.gridy = 0;
		gridBagConstraintsVigenciaFue.gridx = 0;
		jPanelFK_IdPaisVigenciaFue.add(jLabelid_paisFK_IdPaisVigenciaFue, gridBagConstraintsVigenciaFue);

		gridBagConstraintsVigenciaFue = new GridBagConstraints();
		gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVigenciaFue.gridy = 0;
		gridBagConstraintsVigenciaFue.gridx = 1;
		jPanelFK_IdPaisVigenciaFue.add(jComboBoxid_paisFK_IdPaisVigenciaFue, gridBagConstraintsVigenciaFue);

		gridBagConstraintsVigenciaFue = new GridBagConstraints();
		gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVigenciaFue.gridy = 1;
		gridBagConstraintsVigenciaFue.gridx =1;
		jPanelFK_IdPaisVigenciaFue.add(jButtonFK_IdPaisVigenciaFue, gridBagConstraintsVigenciaFue);

		jTabbedPaneBusquedasVigenciaFue.addTab("2.-Por Pais ", jPanelFK_IdPaisVigenciaFue);
		jTabbedPaneBusquedasVigenciaFue.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVigenciaFue = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVigenciaFue);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();						
			this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVigenciaFue.gridx = 0;		
			//this.gridBagConstraintsVigenciaFue.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVigenciaFue.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVigenciaFue, this.gridBagConstraintsVigenciaFue);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVigenciaFue.gridx = 0;		
		//this.gridBagConstraintsVigenciaFue.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVigenciaFue.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVigenciaFue);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVigenciaFue.gridx = 0;		
			this.gridBagConstraintsVigenciaFue.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVigenciaFue.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVigenciaFue, this.gridBagConstraintsVigenciaFue);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVigenciaFue, this.gridBagConstraintsVigenciaFue);								
		
		
		/*
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVigenciaFue, this.gridBagConstraintsVigenciaFue);
		*/		
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVigenciaFue.gridx =0;
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVigenciaFue.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVigenciaFue, this.gridBagConstraintsVigenciaFue);
				
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVigenciaFue, this.gridBagConstraintsVigenciaFue);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VigenciaFueJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVigenciaFue= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVigenciaFue = new GridBagLayout();
			this.jPanelBusquedasParametrosVigenciaFue.setLayout(gridaBagLayoutBusquedasParametrosVigenciaFue);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVigenciaFue=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVigenciaFue.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVigenciaFue.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVigenciaFue.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVigenciaFue, this.gridBagConstraintsVigenciaFue);
			
			
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
			
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVigenciaFue.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVigenciaFue, this.gridBagConstraintsVigenciaFue);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVigenciaFue;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVigenciaFue() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVigenciaFue = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVigenciaFue.setName("jPanelReporteDinamicoVigenciaFue"); 
		
		this.jPanelReporteDinamicoVigenciaFue.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVigenciaFue.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVigenciaFue.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVigenciaFue.setLayout(gridaBagLayoutReporteDinamicoVigenciaFue);
		
		
		this.jInternalFrameReporteDinamicoVigenciaFue= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVigenciaFue = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVigenciaFue= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVigenciaFue.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVigenciaFue.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVigenciaFue.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVigenciaFue.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVigenciaFue.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVigenciaFue.setResizable(true);
	    this.jInternalFrameReporteDinamicoVigenciaFue.setClosable(true);
	    this.jInternalFrameReporteDinamicoVigenciaFue.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVigenciaFue.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVigenciaFue.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVigenciaFue.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vigencia Fues"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVigenciaFue = new JLabelMe();

		this.jLabelColumnasSelectReporteVigenciaFue.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVigenciaFue.add(this.jLabelColumnasSelectReporteVigenciaFue, this.gridBagConstraintsVigenciaFue);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVigenciaFue = new JList<Reporte>();
		this.jListColumnasSelectReporteVigenciaFue.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVigenciaFue.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVigenciaFue.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVigenciaFue.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVigenciaFue.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVigenciaFue=new JScrollPane(this.jListColumnasSelectReporteVigenciaFue);
			
			this.jScrollColumnasSelectReporteVigenciaFue.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVigenciaFue.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVigenciaFue.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVigenciaFue.add(this.jListColumnasSelectReporteVigenciaFue, this.gridBagConstraintsVigenciaFue);
		this.jPanelReporteDinamicoVigenciaFue.add(this.jScrollColumnasSelectReporteVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVigenciaFue = new JLabelMe();

		this.jLabelRelacionesSelectReporteVigenciaFue.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVigenciaFue = new JList<Reporte>();
		this.jListRelacionesSelectReporteVigenciaFue.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVigenciaFue.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVigenciaFue.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVigenciaFue.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVigenciaFue.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVigenciaFue=new JScrollPane(this.jListRelacionesSelectReporteVigenciaFue);
			
			this.jScrollRelacionesSelectReporteVigenciaFue.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVigenciaFue.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVigenciaFue.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVigenciaFue = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVigenciaFue = new JComboBoxMe();
		this.jListColumnasValoresGraficoVigenciaFue = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVigenciaFue = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVigenciaFue.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVigenciaFue.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVigenciaFue.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVigenciaFue.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVigenciaFue = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVigenciaFue.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVigenciaFue.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVigenciaFue.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVigenciaFue.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVigenciaFue = new JLabelMe();

		this.jLabelConGraficoDinamicoVigenciaFue.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVigenciaFue.add(this.jLabelConGraficoDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVigenciaFue = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVigenciaFue.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVigenciaFue.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVigenciaFue.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVigenciaFue.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVigenciaFue.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVigenciaFue.add(this.jCheckBoxConGraficoDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVigenciaFue = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVigenciaFue.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVigenciaFue.add(this.jLabelColumnaCategoriaGraficoVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVigenciaFue = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVigenciaFue.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVigenciaFue.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVigenciaFue.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVigenciaFue.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVigenciaFue.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVigenciaFue.add(this.jComboBoxColumnaCategoriaGraficoVigenciaFue, this.gridBagConstraintsVigenciaFue);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVigenciaFue = new JLabelMe();

		this.jLabelColumnaCategoriaValorVigenciaFue.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVigenciaFue.add(this.jLabelColumnaCategoriaValorVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVigenciaFue = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVigenciaFue.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVigenciaFue.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVigenciaFue.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVigenciaFue.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVigenciaFue.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVigenciaFue.add(this.jComboBoxColumnaCategoriaValorVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVigenciaFue = new JLabelMe();

		this.jLabelColumnasValoresGraficoVigenciaFue.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVigenciaFue.add(this.jLabelColumnasValoresGraficoVigenciaFue, this.gridBagConstraintsVigenciaFue);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVigenciaFue = new JList<Reporte>();
		this.jListColumnasValoresGraficoVigenciaFue.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVigenciaFue.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVigenciaFue.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVigenciaFue.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVigenciaFue.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVigenciaFue=new JScrollPane(this.jListColumnasValoresGraficoVigenciaFue);
			
			this.jScrollColumnasValoresGraficoVigenciaFue.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVigenciaFue.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVigenciaFue.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVigenciaFue.add(this.jListColumnasSelectReporteVigenciaFue, this.gridBagConstraintsVigenciaFue);
		this.jPanelReporteDinamicoVigenciaFue.add(this.jScrollColumnasValoresGraficoVigenciaFue, this.gridBagConstraintsVigenciaFue);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVigenciaFue = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVigenciaFue.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVigenciaFue.add(this.jLabelTiposGraficosReportesDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVigenciaFue = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVigenciaFue.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVigenciaFue.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVigenciaFue.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVigenciaFue.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVigenciaFue.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVigenciaFue.add(this.jComboBoxTiposGraficosReportesDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVigenciaFue = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVigenciaFue.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVigenciaFue.add(this.jLabelGenerarExcelReporteDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVigenciaFue = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVigenciaFue.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVigenciaFue,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVigenciaFue.setToolTipText("Generar EXCEL"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		//this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVigenciaFue.add(this.jButtonGenerarExcelReporteDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVigenciaFue.add(this.jComboBoxTiposReportesDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVigenciaFue = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVigenciaFue.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVigenciaFue.add(this.jLabelTiposArchivoReporteDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVigenciaFue.add(this.jComboBoxTiposArchivosReportesDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVigenciaFue = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVigenciaFue.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVigenciaFue,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVigenciaFue.setToolTipText("Generar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVigenciaFue.add(this.jButtonGenerarReporteDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVigenciaFue = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVigenciaFue.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVigenciaFue,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVigenciaFue.setToolTipText("Cancelar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVigenciaFue.add(this.jButtonCerrarReporteDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVigenciaFue = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVigenciaFue= new JScrollPane(jPanelReporteDinamicoVigenciaFue,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVigenciaFue.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVigenciaFue.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVigenciaFue.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vigencia Fues"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVigenciaFue.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVigenciaFue.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVigenciaFue.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVigenciaFue);
		this.jInternalFrameReporteDinamicoVigenciaFue.getContentPane().add(this.jScrollPanelReporteDinamicoVigenciaFue, this.gridBagConstraintsVigenciaFue);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVigenciaFue() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVigenciaFue = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVigenciaFue.setName("jPanelImportacionVigenciaFue"); 
		
		this.jPanelImportacionVigenciaFue.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVigenciaFue.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVigenciaFue.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVigenciaFue.setLayout(gridaBagLayoutImportacionVigenciaFue);
		
		
		this.jInternalFrameImportacionVigenciaFue= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVigenciaFue= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVigenciaFue = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVigenciaFue= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVigenciaFue.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVigenciaFue.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVigenciaFue.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVigenciaFue.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVigenciaFue.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVigenciaFue.setResizable(true);
	    this.jInternalFrameImportacionVigenciaFue.setClosable(true);
	    this.jInternalFrameImportacionVigenciaFue.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVigenciaFue.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVigenciaFue.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVigenciaFue.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVigenciaFue.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVigenciaFue.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVigenciaFue.setResizable(true);
	    this.jInternalFrameImportacionVigenciaFue.setClosable(true);
	    this.jInternalFrameImportacionVigenciaFue.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVigenciaFue.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVigenciaFue.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVigenciaFue.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vigencia Fues"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVigenciaFue = new JLabelMe();

		this.jLabelArchivoImportacionVigenciaFue.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYImportacion;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVigenciaFue.add(this.jLabelArchivoImportacionVigenciaFue, this.gridBagConstraintsVigenciaFue);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVigenciaFue = new JFileChooser();		
		this.jFileChooserImportacionVigenciaFue.setToolTipText("ESCOGER ARCHIVO"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVigenciaFue = new JButtonMe();
		this.jButtonAbrirImportacionVigenciaFue.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVigenciaFue,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVigenciaFue.setToolTipText("Generar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYImportacion;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVigenciaFue.add(this.jButtonAbrirImportacionVigenciaFue, this.gridBagConstraintsVigenciaFue);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVigenciaFue = new JLabelMe();

		this.jLabelPathArchivoImportacionVigenciaFue.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVigenciaFue.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVigenciaFue.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVigenciaFue.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYImportacion;		
		this.gridBagConstraintsVigenciaFue.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVigenciaFue.add(this.jLabelPathArchivoImportacionVigenciaFue, this.gridBagConstraintsVigenciaFue);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVigenciaFue=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVigenciaFue.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVigenciaFue.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVigenciaFue.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYImportacion;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVigenciaFue.add(this.jTextFieldPathArchivoImportacionVigenciaFue, this.gridBagConstraintsVigenciaFue);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVigenciaFue = new JButtonMe();
		this.jButtonGenerarImportacionVigenciaFue.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVigenciaFue,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVigenciaFue.setToolTipText("Generar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYImportacion;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVigenciaFue.add(this.jButtonGenerarImportacionVigenciaFue, this.gridBagConstraintsVigenciaFue);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVigenciaFue = new JButtonMe();
		this.jButtonCerrarImportacionVigenciaFue.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVigenciaFue,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVigenciaFue.setToolTipText("Cancelar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVigenciaFue.gridy = iPosYImportacion;
		this.gridBagConstraintsVigenciaFue.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVigenciaFue.add(this.jButtonCerrarImportacionVigenciaFue, this.gridBagConstraintsVigenciaFue);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVigenciaFue = new GridBagLayout();
		
		this.jScrollPanelImportacionVigenciaFue= new JScrollPane(jPanelImportacionVigenciaFue,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
		this.gridBagConstraintsVigenciaFue.gridy =iPosYImportacion;
		this.gridBagConstraintsVigenciaFue.gridx =iPosXImportacion;
		this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVigenciaFue.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVigenciaFue.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVigenciaFue);
		this.jInternalFrameImportacionVigenciaFue.getContentPane().add(this.jScrollPanelImportacionVigenciaFue, this.gridBagConstraintsVigenciaFue);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVigenciaFue(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVigenciaFue = new JButtonMe();
			this.jButtonAbrirOrderByVigenciaFue.setText("Orden");
			this.jButtonAbrirOrderByVigenciaFue.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVigenciaFue,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVigenciaFue";
			inputMap = this.jButtonAbrirOrderByVigenciaFue.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVigenciaFue.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVigenciaFue"));
		
		
			GridBagLayout gridaBagLayoutOrderByVigenciaFue = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVigenciaFue = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVigenciaFue.setName("jPanelOrderByVigenciaFue"); 
			
			this.jPanelOrderByVigenciaFue.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVigenciaFue.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVigenciaFue.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVigenciaFue.setLayout(gridaBagLayoutOrderByVigenciaFue);
			
			
			this.jTableDatosVigenciaFueOrderBy = new JTableMe();        
			this.jTableDatosVigenciaFueOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVigenciaFueOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVigenciaFueOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVigenciaFueOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVigenciaFueOrderBy.setViewportView(this.jTableDatosVigenciaFueOrderBy);
			this.jTableDatosVigenciaFueOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVigenciaFueOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVigenciaFue= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVigenciaFue= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVigenciaFue = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVigenciaFue= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVigenciaFue.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVigenciaFue.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVigenciaFue.setTitle("Orden");
			this.jInternalFrameOrderByVigenciaFue.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVigenciaFue.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVigenciaFue.setResizable(true);
			this.jInternalFrameOrderByVigenciaFue.setClosable(true);
			this.jInternalFrameOrderByVigenciaFue.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVigenciaFue.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVigenciaFue.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVigenciaFue.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVigenciaFue.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vigencia Fues"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVigenciaFue.gridx =iPosXOrderBy;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVigenciaFue.ipady =150;
				
			this.jPanelOrderByVigenciaFue.add(jScrollPanelDatosVigenciaFueOrderBy, this.gridBagConstraintsVigenciaFue);//this.jTableDatosVigenciaFueTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVigenciaFue = new JButtonMe();
			this.jButtonCerrarOrderByVigenciaFue.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVigenciaFue,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVigenciaFue.setToolTipText("Cancelar"+" "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVigenciaFue, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVigenciaFue.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVigenciaFue.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVigenciaFue.add(this.jButtonCerrarOrderByVigenciaFue, this.gridBagConstraintsVigenciaFue);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVigenciaFue = new GridBagLayout();
			
			this.jScrollPanelOrderByVigenciaFue= new JScrollPane(jPanelOrderByVigenciaFue,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVigenciaFue = new GridBagConstraints();
			this.gridBagConstraintsVigenciaFue.gridy =iPosYOrderBy;
			this.gridBagConstraintsVigenciaFue.gridx =iPosXOrderBy;
			this.gridBagConstraintsVigenciaFue.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVigenciaFue.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVigenciaFue.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVigenciaFue);
			
			this.jInternalFrameOrderByVigenciaFue.getContentPane().add(this.jScrollPanelOrderByVigenciaFue, this.gridBagConstraintsVigenciaFue);			
		
		} else {
			this.jButtonAbrirOrderByVigenciaFue = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.vigenciafueSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVigenciaFue.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVigenciaFue.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVigenciaFue.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVigenciaFue.getRowHeight();//VigenciaFueConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VigenciaFueConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVigenciaFue.isSelected()) {
					iHeightTable=VigenciaFueConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VigenciaFueConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VigenciaFueConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VigenciaFueConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVigenciaFue.isSelected()) {
					iHeightTable=VigenciaFueConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VigenciaFueConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VigenciaFueConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVigenciaFue.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVigenciaFue.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVigenciaFue.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVigenciaFue.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVigenciaFue.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVigenciaFue.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVigenciaFue!=null && this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy()!=null) {
			//if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVigenciaFue.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVigenciaFue.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVigenciaFue.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVigenciaFue.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVigenciaFue.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVigenciaFue.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=vigenciafueLogic.getVigenciaFues().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vigenciafues.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VigenciaFue> TraerVigenciaFueBeans(List<VigenciaFue> vigenciafues,ArrayList<Classe> classes)throws Exception {
		try {
			for(VigenciaFue vigenciafue:vigenciafues) {
					
				if(!(VigenciaFueConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VigenciaFueConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					vigenciafue.setsDetalleGeneralEntityReporte(VigenciaFueConstantesFunciones.getVigenciaFueDescripcion(vigenciafue));
										
					vigenciafue.setesta_activo_descripcion(VigenciaFueConstantesFunciones.getesta_activoDescripcion(vigenciafue));	
					
						
					
				} else  {
							
					//vigenciafue.setsDetalleGeneralEntityReporte(vigenciafue.getsDetalleGeneralEntityReporte());
										
				}
				
				//vigenciafuebeans.add(vigenciafuebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return vigenciafues;
    }
	//PARA REPORTES FIN
}
