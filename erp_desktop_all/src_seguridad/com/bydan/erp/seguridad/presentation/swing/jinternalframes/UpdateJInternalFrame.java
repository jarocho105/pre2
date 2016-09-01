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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.UpdateConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class UpdateJInternalFrame extends UpdateBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUpdate;
	
	protected JMenuBar jmenuBarUpdate;
	
	protected JMenu jmenuUpdate;
	protected JMenu jmenuDatosUpdate;
	protected JMenu jmenuArchivoUpdate;
	protected JMenu jmenuAccionesUpdate;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUpdate;	
	protected GridBagConstraints gridBagConstraintsUpdate;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UpdateDetalleFormJInternalFrame jInternalFrameDetalleFormUpdate;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUpdate;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUpdate;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public UpdateSessionBean updateSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Update> updates;		
	public List<Update> updatesEliminados;	
	public List<Update> updatesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUpdate;		
	protected JButton jButtonAbrirOrderByUpdate;
	
	
	//protected JPanel jPanelOrderByUpdate;
	//public JScrollPane jScrollPanelOrderByUpdate;	
	//protected JButton jButtonCerrarOrderByUpdate;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UpdateLogic updateLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUpdate;
	public JScrollPane jScrollPanelDatosEdicionUpdate;
	public JScrollPane jScrollPanelDatosGeneralUpdate;
    
	
	
	//public JScrollPane jScrollPanelDatosUpdateOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUpdate;
	//public JScrollPane jScrollPanelImportacionUpdate;
	
	
	
	protected JPanel jPanelAccionesUpdate;
	
    protected JPanel jPanelPaginacionUpdate;
    protected JPanel jPanelParametrosReportesUpdate;
	protected JPanel jPanelParametrosReportesAccionesUpdate;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Update;
	protected JPanel jPanelParametrosAuxiliar2Update;
	protected JPanel jPanelParametrosAuxiliar3Update;
	protected JPanel jPanelParametrosAuxiliar4Update;
	//protected JPanel jPanelParametrosAuxiliar5Update;
	
	
	
	//protected JPanel jPanelReporteDinamicoUpdate;
	//protected JPanel jPanelImportacionUpdate;
	
	
	public JTable jTableDatosUpdate;
	
	
	
	//public JTable jTableDatosUpdateOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUpdate;
	protected JButton jButtonDuplicarUpdate;
	protected JButton jButtonCopiarUpdate;
	protected JButton jButtonVerFormUpdate;
	protected JButton jButtonNuevoRelacionesUpdate;
	protected JButton jButtonModificarUpdate;
	
    protected JButton jButtonGuardarCambiosTablaUpdate;
	protected JButton jButtonCerrarUpdate;
	
	
	protected JButton jButtonRecargarInformacionUpdate;
	protected JButton jButtonProcesarInformacionUpdate;
	
	
	protected JButton jButtonAnterioresUpdate;
	protected JButton jButtonSiguientesUpdate;
	protected JButton jButtonNuevoGuardarCambiosUpdate;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUpdate;
	//protected JButton jButtonCerrarReporteDinamicoUpdate;
	//protected JButton jButtonGenerarExcelReporteDinamicoUpdate;	
	
	
	
	//protected JButton jButtonAbrirImportacionUpdate;
	//protected JButton jButtonGenerarImportacionUpdate;
	//protected JButton jButtonCerrarImportacionUpdate;
	//protected JFileChooser jFileChooserImportacionUpdate;
	//protected File fileImportacionUpdate;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUpdate;
	protected JButton jButtonDuplicarToolBarUpdate;
	protected JButton jButtonNuevoRelacionesToolBarUpdate;
	
	
	public JButton jButtonGuardarCambiosToolBarUpdate;
	protected JButton jButtonCopiarToolBarUpdate;
	protected JButton jButtonVerFormToolBarUpdate;
	public JButton jButtonGuardarCambiosTablaToolBarUpdate;
	protected JButton jButtonMostrarOcultarTablaToolBarUpdate;
	protected JButton jButtonCerrarToolBarUpdate;
	
	protected JButton jButtonRecargarInformacionToolBarUpdate;
	protected JButton jButtonProcesarInformacionToolBarUpdate;
	protected JButton jButtonAnterioresToolBarUpdate;
	protected JButton jButtonSiguientesToolBarUpdate;
	protected JButton jButtonNuevoGuardarCambiosToolBarUpdate;
	protected JButton jButtonAbrirOrderByToolBarUpdate;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUpdate;
	protected JMenuItem jMenuItemDuplicarUpdate;
	protected JMenuItem jMenuItemNuevoRelacionesUpdate;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUpdate;
	protected JMenuItem jMenuItemCopiarUpdate;
	protected JMenuItem jMenuItemVerFormUpdate;
	protected JMenuItem jMenuItemGuardarCambiosTablaUpdate;
	protected JMenuItem jMenuItemCerrarUpdate;
	protected JMenuItem jMenuItemDetalleCerrarUpdate;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUpdate;
	protected JMenuItem jMenuItemDetalleMostarOcultarUpdate;
	
	protected JMenuItem jMenuItemRecargarInformacionUpdate;
	protected JMenuItem jMenuItemProcesarInformacionUpdate;
	protected JMenuItem jMenuItemAnterioresUpdate;
	protected JMenuItem jMenuItemSiguientesUpdate;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUpdate;
	protected JMenuItem jMenuItemAbrirOrderByUpdate;
	protected JMenuItem jMenuItemMostrarOcultarUpdate;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUpdate;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUpdate;
	protected JCheckBox jCheckBoxSeleccionadosUpdate;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUpdate;
	protected JCheckBox jCheckBoxConGraficoReporteUpdate;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUpdate;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUpdate;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUpdate;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUpdate;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUpdate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUpdate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUpdate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUpdate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUpdate;
	protected JTextField jTextFieldValorCampoGeneralUpdate;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUpdate;
	//public JList<Reporte> jListColumnasSelectReporteUpdate;
	//public JScrollPane jScrollColumnasSelectReporteUpdate;
	
	//public JLabel jLabelRelacionesSelectReporteUpdate;
	//public JList<Reporte> jListRelacionesSelectReporteUpdate;
	//public JScrollPane jScrollRelacionesSelectReporteUpdate;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUpdate;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUpdate;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUpdate;
	//public JLabel jLabelTiposArchivoReporteDinamicoUpdate;
	
		
	//public JLabel jLabelArchivoImportacionUpdate;	
	//public JLabel jLabelPathArchivoImportacionUpdate;
	//protected JTextField jTextFieldPathArchivoImportacionUpdate;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUpdate;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUpdate;
	
	//public JLabel jLabelColumnaCategoriaValorUpdate;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUpdate;
	
	//public JLabel jLabelColumnasValoresGraficoUpdate;
	//public JList<Reporte> jListColumnasValoresGraficoUpdate;
	//public JScrollPane jScrollColumnasValoresGraficoUpdate;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUpdate;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUpdate;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUpdate;
	public JPanel jPanelFK_IdAnioUpdate;
	public JButton jButtonFK_IdAnioUpdate;
	public JPanel jPanelFK_IdMesUpdate;
	public JButton jButtonFK_IdMesUpdate;
	
	public JPanel jPanelid_anioFK_IdAnioUpdate;
	public JLabel jLabelid_anioFK_IdAnioUpdate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioUpdate;
	public JButton jButtonid_anioFK_IdAnioUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioUpdateUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioUpdateBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesUpdate;
	public JLabel jLabelid_mesFK_IdMesUpdate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesUpdate;
	public JButton jButtonid_mesFK_IdMesUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesUpdateUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesUpdateBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public UpdateJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUpdate)	{
		this.jButtonRecargarInformacionUpdate = jButtonRecargarInformacionUpdate;
	}
	
	public JButton getjButtonProcesarInformacionUpdate() {
		return this.jButtonProcesarInformacionUpdate;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUpdate)	{
		this.jButtonProcesarInformacionUpdate = jButtonProcesarInformacionUpdate;
	}
	
	
	public JButton getjButtonRecargarInformacionUpdate() {
		return this.jButtonRecargarInformacionUpdate;
	}
	
	
	public List<Update> getupdates() {
		return this.updates;
	}

	public void setupdates(List<Update> updates) {
		this.updates = updates;
	}
	
	public List<Update> getupdatesAux() {
		return this.updatesAux;
	}

	public void setupdatesAux(List<Update> updatesAux) {
		this.updatesAux = updatesAux;
	}
	
	public List<Update> getupdatesEliminados() {
		return this.updatesEliminados;
	}

	public void setUpdatesEliminados(List<Update> updatesEliminados) {
		this.updatesEliminados = updatesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUpdate() {
		return jComboBoxTiposSeleccionarUpdate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUpdate(
			JComboBox jComboBoxTiposSeleccionarUpdate) {
		this.jComboBoxTiposSeleccionarUpdate = jComboBoxTiposSeleccionarUpdate;
	}
	
	public void setBorderResaltarTiposSeleccionarUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUpdate .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUpdate() {
		return jTextFieldValorCampoGeneralUpdate;
	}

	public void setjTextFieldValorCampoGeneralUpdate(
			JTextField jTextFieldValorCampoGeneralUpdate) {
		this.jTextFieldValorCampoGeneralUpdate = jTextFieldValorCampoGeneralUpdate;
	}

	public void setBorderResaltarValorCampoGeneralUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUpdate .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUpdate() {
		return this.jCheckBoxSeleccionarTodosUpdate;
	}

	public void setjCheckBoxSeleccionarTodosUpdate(
			JCheckBox jCheckBoxSeleccionarTodosUpdate) {
		this.jCheckBoxSeleccionarTodosUpdate = jCheckBoxSeleccionarTodosUpdate;
	}

	public void setBorderResaltarSeleccionarTodosUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUpdate .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUpdate() {
		return this.jCheckBoxSeleccionadosUpdate;
	}

	public void setjCheckBoxSeleccionadosUpdate(
			JCheckBox jCheckBoxSeleccionadosUpdate) {
		this.jCheckBoxSeleccionadosUpdate = jCheckBoxSeleccionadosUpdate;
	}
	
	public void setBorderResaltarSeleccionadosUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUpdate .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUpdate() {
		return this.jComboBoxTiposArchivosReportesUpdate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUpdate(
			JComboBox jComboBoxTiposArchivosReportesUpdate) {
		this.jComboBoxTiposArchivosReportesUpdate = jComboBoxTiposArchivosReportesUpdate;
	}

	public void setBorderResaltarTiposArchivosReportesUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUpdate .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUpdate() {
		return this.jComboBoxTiposReportesUpdate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUpdate(
			JComboBox jComboBoxTiposReportesUpdate) {
		this.jComboBoxTiposReportesUpdate = jComboBoxTiposReportesUpdate;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUpdate() {
	//	return jComboBoxTiposReportesDinamicoUpdate;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUpdate(
	//		JComboBox jComboBoxTiposReportesDinamicoUpdate) {
	//	this.jComboBoxTiposReportesDinamicoUpdate = jComboBoxTiposReportesDinamicoUpdate;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUpdate() {
	//	return jComboBoxTiposArchivosReportesDinamicoUpdate;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUpdate(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUpdate) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUpdate = jComboBoxTiposArchivosReportesDinamicoUpdate;
	//}
	
	public void setBorderResaltarTiposReportesUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUpdate .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUpdate() {
		return this.jComboBoxTiposGraficosReportesUpdate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUpdate(
			JComboBox jComboBoxTiposGraficosReportesUpdate) {
		this.jComboBoxTiposGraficosReportesUpdate = jComboBoxTiposGraficosReportesUpdate;
	}
	
	public void setBorderResaltarTiposGraficosReportesUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUpdate .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUpdate() {
		return this.jComboBoxTiposPaginacionUpdate;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUpdate(
			JComboBox jComboBoxTiposPaginacionUpdate) {
		this.jComboBoxTiposPaginacionUpdate = jComboBoxTiposPaginacionUpdate;
	}
	
	public void setBorderResaltarTiposPaginacionUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUpdate .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUpdate() {
		return this.jComboBoxTiposRelacionesUpdate;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUpdate() {
		return this.jComboBoxTiposAccionesUpdate;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUpdate(
			JComboBox jComboBoxTiposRelacionesUpdate) {
		this.jComboBoxTiposRelacionesUpdate = jComboBoxTiposRelacionesUpdate;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUpdate(
			JComboBox jComboBoxTiposAccionesUpdate) {
		this.jComboBoxTiposAccionesUpdate = jComboBoxTiposAccionesUpdate;
	}
	
	public void setBorderResaltarTiposRelacionesUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUpdate .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUpdate() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdate.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUpdate .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUpdate() {
	//	return jCheckBoxConGraficoDinamicoUpdate;
	//}

	//public void setjCheckBoxConGraficoDinamicoUpdate(
	//		JCheckBox jCheckBoxConGraficoDinamicoUpdate) {
	//	this.jCheckBoxConGraficoDinamicoUpdate = jCheckBoxConGraficoDinamicoUpdate;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUpdate() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUpdate.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUpdate .setBorder(borderResaltar);		
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
		this.updateSessionBean=new UpdateSessionBean();
		
		this.updateSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.updateSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.updateSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UpdateJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UpdateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UpdateJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UpdateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UpdateJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Update MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
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
		
		UpdateJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUpdate= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUpdate,this.jTtoolBarUpdate,
							"nuevo","nuevo","Nuevo"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUpdate,this.jTtoolBarUpdate,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUpdate,this.jTtoolBarUpdate,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUpdate,this.jTtoolBarUpdate,
							"duplicar","duplicar","Duplicar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUpdate,this.jTtoolBarUpdate,
							"copiar","copiar","Copiar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUpdate,this.jTtoolBarUpdate,
							"ver_form","ver_form","Ver"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUpdate,this.jTtoolBarUpdate,
							"recargar","recargar","Recargar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUpdate,this.jTtoolBarUpdate,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUpdate,this.jTtoolBarUpdate,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUpdate,this.jTtoolBarUpdate,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUpdate,this.jTtoolBarUpdate,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUpdate,this.jTtoolBarUpdate,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUpdate,this.jTtoolBarUpdate,
							"cerrar","cerrar","Salir"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUpdate=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUpdate;
			
				this.jButtonProcesarInformacionToolBarUpdate=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUpdate;
				
		//protected JButton jButtonModificarToolBarUpdate;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUpdate=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUpdate=new JMenuMe("General");
		this.jmenuArchivoUpdate=new JMenuMe("Archivo");
		this.jmenuAccionesUpdate=new JMenuMe("Acciones");
		this.jmenuDatosUpdate=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUpdate= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUpdate.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUpdate,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUpdate= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUpdate.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUpdate,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUpdate= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUpdate.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUpdate,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUpdate= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUpdate.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUpdate,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUpdate= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUpdate.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUpdate,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUpdate= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUpdate.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUpdate,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUpdate= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUpdate.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUpdate,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUpdate= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUpdate.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUpdate,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUpdate= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUpdate.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUpdate,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUpdate= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUpdate.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUpdate,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUpdate= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUpdate.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUpdate,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUpdate= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUpdate.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUpdate,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUpdate= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUpdate.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUpdate,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUpdate= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUpdate.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUpdate,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUpdate= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUpdate.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUpdate,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUpdate= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUpdate.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUpdate,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUpdate= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUpdate.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUpdate,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUpdate.add(this.jMenuItemCerrarUpdate);
			
			this.jmenuAccionesUpdate.add(this.jMenuItemNuevoUpdate);
			this.jmenuAccionesUpdate.add(this.jMenuItemNuevoGuardarCambiosUpdate);
			this.jmenuAccionesUpdate.add(this.jMenuItemNuevoRelacionesUpdate);
			this.jmenuAccionesUpdate.add(this.jMenuItemGuardarCambiosTablaUpdate);		
			this.jmenuAccionesUpdate.add(this.jMenuItemDuplicarUpdate);		
			this.jmenuAccionesUpdate.add(this.jMenuItemCopiarUpdate);		
			this.jmenuAccionesUpdate.add(this.jMenuItemVerFormUpdate);		
			
			this.jmenuDatosUpdate.add(this.jMenuItemRecargarInformacionUpdate);				
			this.jmenuDatosUpdate.add(this.jMenuItemAnterioresUpdate);				
			this.jmenuDatosUpdate.add(this.jMenuItemSiguientesUpdate);				
			this.jmenuDatosUpdate.add(this.jMenuItemAbrirOrderByUpdate);				
			this.jmenuDatosUpdate.add(this.jMenuItemMostrarOcultarUpdate);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUpdate.add(this.jMenuItemGuardarCambiosUpdate);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUpdate.add(this.jmenuArchivoUpdate);		
			this.jmenuBarUpdate.add(this.jmenuAccionesUpdate);		
			this.jmenuBarUpdate.add(this.jmenuDatosUpdate);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUpdate);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUpdate() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioUpdate.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioUpdate= new JButtonMe();
		this.jButtonFK_IdAnioUpdate.setText("Buscar");
		this.jButtonFK_IdAnioUpdate.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioUpdate,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioUpdate = new JLabelMe();
		jLabelid_anioFK_IdAnioUpdate.setText("Anio :");
		jLabelid_anioFK_IdAnioUpdate.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioUpdate,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioUpdate= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioUpdate,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesUpdate.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesUpdate= new JButtonMe();
		this.jButtonFK_IdMesUpdate.setText("Buscar");
		this.jButtonFK_IdMesUpdate.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesUpdate,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesUpdate = new JLabelMe();
		jLabelid_mesFK_IdMesUpdate.setText("Mes :");
		jLabelid_mesFK_IdMesUpdate.setToolTipText("Mes");
		jLabelid_mesFK_IdMesUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesUpdate,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesUpdate= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesUpdate,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUpdate=new JTabbedPane();


		this.jTabbedPaneBusquedasUpdate.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUpdate.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUpdate.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUpdate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUpdate,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUpdate = new UpdateDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Update DATOS");
			this.jInternalFrameDetalleFormUpdate = new UpdateDetalleFormJInternalFrame(jDesktopPane,this.updateSessionBean.getConGuardarRelaciones(),this.updateSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUpdate = null;//new UpdateDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUpdate= new GridBagLayout();
		
		
		this.jTableDatosUpdate = new JTableMe();      
		
		String sToolTipUpdate="";
		sToolTipUpdate=UpdateConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUpdate+="(Seguridad.Update)";
		}
		
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
			sToolTipUpdate+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUpdate.setToolTipText(sToolTipUpdate);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUpdate);
		this.jTableDatosUpdate.setAutoCreateRowSorter(true);
		this.jTableDatosUpdate.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUpdate.setRowSelectionAllowed(true);
		this.jTableDatosUpdate.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUpdate,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUpdate = new JButtonMe();
		this.jButtonDuplicarUpdate = new JButtonMe();
		this.jButtonCopiarUpdate = new JButtonMe();
		this.jButtonVerFormUpdate = new JButtonMe();
		this.jButtonNuevoRelacionesUpdate = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUpdate = new JButtonMe();
		this.jButtonCerrarUpdate = new JButtonMe();
		
		this.jScrollPanelDatosUpdate = new JScrollPane();   
        this.jScrollPanelDatosGeneralUpdate = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Update";
		
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Updates" + this.sPath));
		} else {
			this.jScrollPanelDatosUpdate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUpdate.setToolTipText("Acciones");
        this.jPanelAccionesUpdate.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUpdate, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUpdate=new ReporteDinamicoJInternalFrame(UpdateConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUpdate();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUpdate=new ImportacionJInternalFrame(UpdateConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUpdate();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUpdate = new JButtonMe();
		
		this.jButtonAbrirOrderByUpdate.setText("Orden");
		this.jButtonAbrirOrderByUpdate.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUpdate,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUpdate=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUpdate,false,this);
			
			//this.cargarOrderByUpdate(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUpdate=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUpdate,true,this);
			
			//this.cargarOrderByUpdate(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUpdate.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosUpdate.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosUpdate.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosUpdate.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUpdate.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUpdate.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUpdate.setText("Nuevo");
		this.jButtonDuplicarUpdate.setText("Duplicar");
		this.jButtonCopiarUpdate.setText("Copiar");
		this.jButtonVerFormUpdate.setText("Ver");
		this.jButtonNuevoRelacionesUpdate.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUpdate.setText("Guardar");
		this.jButtonCerrarUpdate.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUpdate,"nuevo_button","Nuevo",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUpdate,"duplicar_button","Duplicar",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUpdate,"copiar_button","Copiar",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUpdate,"ver_form","Ver",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUpdate,"nuevorelaciones_button","Nuevo Rel",this.updateSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUpdate,"guardarcambiostabla_button","Guardar",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUpdate,"cerrar_button","Salir",this.updateSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUpdate.setToolTipText("Nuevo"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUpdate.setToolTipText("Duplicar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUpdate.setToolTipText("Copiar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUpdate.setToolTipText("Ver"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUpdate.setToolTipText("Nuevo Rel"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUpdate.setToolTipText("Guardar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUpdate.setToolTipText("Salir"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUpdate";
		inputMap = this.jButtonNuevoUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUpdate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUpdate"));
		
		//DUPLICAR
		sMapKey = "DuplicarUpdate";
		inputMap = this.jButtonDuplicarUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUpdate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUpdate"));
		
		//COPIAR
		sMapKey = "CopiarUpdate";
		inputMap = this.jButtonCopiarUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUpdate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUpdate"));
		
		//VEr FORM
		sMapKey = "VerFormUpdate";
		inputMap = this.jButtonVerFormUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUpdate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUpdate"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUpdate";
		inputMap = this.jButtonNuevoRelacionesUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUpdate"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUpdate";
		inputMap = this.jButtonModificarUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUpdate"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUpdate";
		inputMap = this.jButtonCerrarUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUpdate"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUpdate";
		inputMap = this.jButtonGuardarCambiosTablaUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUpdate"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Update= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Update= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Update= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Update= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Update= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUpdate.setName("jPanelParametrosReportesUpdate"); 
		
		this.jPanelParametrosReportesAccionesUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUpdate.setName("jPanelParametrosReportesAccionesUpdate"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUpdate = new JButtonMe();
		this.jButtonRecargarInformacionUpdate.setText("Recargar");
		this.jButtonRecargarInformacionUpdate.setToolTipText("Recargar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUpdate,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUpdate = new JButtonMe();
		this.jButtonProcesarInformacionUpdate.setText("Procesar");
		this.jButtonProcesarInformacionUpdate.setToolTipText("Procesar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUpdate.setVisible(false);
			
		this.jButtonProcesarInformacionUpdate.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUpdate.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUpdate.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUpdate = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUpdate.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUpdate.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUpdate = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUpdate.setText("TIPO");       
		this.jComboBoxTiposReportesUpdate.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUpdate = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUpdate.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUpdate.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUpdate = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUpdate.setText("Paginacion");
		this.jComboBoxTiposPaginacionUpdate.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUpdate = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUpdate.setText("Accion");
		this.jComboBoxTiposRelacionesUpdate.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUpdate = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUpdate.setText("Accion");
		this.jComboBoxTiposAccionesUpdate.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUpdate = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUpdate.setText("Accion");
		this.jComboBoxTiposSeleccionarUpdate.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUpdate=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUpdate.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUpdate.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUpdate.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUpdate = new JLabelMe();
		
		this.jLabelAccionesUpdate.setText("Acciones");		
		this.jLabelAccionesUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUpdate = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUpdate.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUpdate.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUpdate = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUpdate.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUpdate.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUpdate = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUpdate.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUpdate.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUpdate = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUpdate.setText("Graf.");
		this.jCheckBoxConGraficoReporteUpdate.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUpdate = new JButtonMe();
		//this.jButtonAnterioresUpdate.setText("<<");
        this.jButtonAnterioresUpdate.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUpdate,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUpdate = new JButtonMe();
		//this.jButtonSiguientesUpdate.setText(">>");
        this.jButtonSiguientesUpdate.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUpdate,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUpdate = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUpdate.setText("Nue");
        this.jButtonNuevoGuardarCambiosUpdate.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUpdate,"nuevoguardarcambios_button","Nue",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUpdate";
		inputMap = this.jButtonNuevoGuardarCambiosUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUpdate"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUpdate";
		inputMap = this.jButtonRecargarInformacionUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUpdate"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUpdate";
		inputMap = this.jButtonSiguientesUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUpdate"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUpdate";
		inputMap = this.jButtonAnterioresUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUpdate"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUpdate();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUpdate.setMinimumSize(new Dimension(this.getWidth(),UpdateBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UpdateBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUpdate.setMaximumSize(new Dimension(this.getWidth(),UpdateBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UpdateBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUpdate.setPreferredSize(new Dimension(this.getWidth(),UpdateBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UpdateBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUpdate = new GridBagLayout();

			this.jPanelPaginacionUpdate.setLayout(gridaBagLayoutPaginacionUpdate);						
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = 0;
			this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUpdate.add(this.jButtonAnterioresUpdate, this.gridBagConstraintsUpdate);
					
						
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUpdate.gridy = 0;
			
			this.jPanelPaginacionUpdate.add(this.jButtonNuevoGuardarCambiosUpdate, this.gridBagConstraintsUpdate);
						
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUpdate.gridy = 0;
			this.jPanelPaginacionUpdate.add(this.jButtonSiguientesUpdate, this.gridBagConstraintsUpdate);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = 1;
			this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUpdate.add(this.jButtonNuevoUpdate, this.gridBagConstraintsUpdate);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsUpdate = new GridBagConstraints();
				this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUpdate.gridy = 1;
				this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionUpdate.add(this.jButtonNuevoRelacionesUpdate, this.gridBagConstraintsUpdate);
			}
			
			
			if(!this.updateSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUpdate = new GridBagConstraints();
				this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUpdate.gridy = 1;
				this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUpdate.add(this.jButtonGuardarCambiosTablaUpdate, this.gridBagConstraintsUpdate);
			}
			
			
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = 1;
			this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUpdate.add(this.jButtonDuplicarUpdate, this.gridBagConstraintsUpdate);
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = 1;
			this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUpdate.add(this.jButtonCopiarUpdate, this.gridBagConstraintsUpdate);
		
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = 1;
			this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUpdate.add(this.jButtonVerFormUpdate, this.gridBagConstraintsUpdate);
		
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = 1;
			this.gridBagConstraintsUpdate.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUpdate.add(this.jButtonCerrarUpdate, this.gridBagConstraintsUpdate);
		
		
		
		this.jButtonRecargarInformacionUpdate.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUpdate.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUpdate.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUpdate, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUpdate.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUpdate.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUpdate.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUpdate.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUpdate.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUpdate.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUpdate.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUpdate.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUpdate.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUpdate.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUpdate.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUpdate.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUpdate.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUpdate.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUpdate.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUpdate.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUpdate.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUpdate.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUpdate.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUpdate.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUpdate.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUpdate.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUpdate.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUpdate.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUpdate.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUpdate.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUpdate.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUpdate, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUpdate.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUpdate.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUpdate.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUpdate.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUpdate.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUpdate.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUpdate = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUpdate = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Update = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Update = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Update = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Update = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUpdate.setLayout(gridaBagParametrosReportesUpdate);
			this.jPanelParametrosReportesAccionesUpdate.setLayout(gridaBagParametrosReportesAccionesUpdate);
			
			
			this.jPanelParametrosAuxiliar1Update.setLayout(gridaBagParametrosAuxiliar1Update);
			this.jPanelParametrosAuxiliar2Update.setLayout(gridaBagParametrosAuxiliar2Update);
			this.jPanelParametrosAuxiliar3Update.setLayout(gridaBagParametrosAuxiliar3Update);
			this.jPanelParametrosAuxiliar4Update.setLayout(gridaBagParametrosAuxiliar4Update);
			//this.jPanelParametrosAuxiliar5Update.setLayout(gridaBagParametrosAuxiliar2Update);			
			
			
			
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUpdate.add(this.jButtonRecargarInformacionUpdate, this.gridBagConstraintsUpdate);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Update.add(this.jComboBoxTiposPaginacionUpdate, this.gridBagConstraintsUpdate);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Update.add(this.jCheckBoxConAltoMaximoTablaUpdate, this.gridBagConstraintsUpdate);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Update.add(this.jComboBoxTiposArchivosReportesUpdate, this.gridBagConstraintsUpdate);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdate.add(this.jPanelParametrosAuxiliar1Update, this.gridBagConstraintsUpdate);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUpdate.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Update.add(this.jComboBoxTiposReportesUpdate, this.gridBagConstraintsUpdate);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdate.add(this.jPanelParametrosAuxiliar4Update, this.gridBagConstraintsUpdate);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdate.add(this.jComboBoxTiposReportesUpdate, this.gridBagConstraintsUpdate);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUpdate.add(this.jCheckBoxGenerarReporteUpdate, this.gridBagConstraintsUpdate);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdate.add(this.jPanelParametrosAuxiliar2Update, this.gridBagConstraintsUpdate);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUpdate.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUpdate.add(this.jLabelAccionesUpdate, this.gridBagConstraintsUpdate);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUpdate = new GridBagConstraints();
				this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUpdate.add(this.jButtonAbrirOrderByUpdate, this.gridBagConstraintsUpdate);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUpdate.add(this.jComboBoxTiposSeleccionarUpdate, this.gridBagConstraintsUpdate);			
			
			
			/*
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUpdate.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUpdate.add(this.jCheckBoxSeleccionarTodosUpdate, this.gridBagConstraintsUpdate);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUpdate.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Update.add(this.jCheckBoxSeleccionarTodosUpdate, this.gridBagConstraintsUpdate);															
				
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUpdate.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Update.add(this.jCheckBoxSeleccionadosUpdate, this.gridBagConstraintsUpdate);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdate.add(this.jPanelParametrosAuxiliar3Update, this.gridBagConstraintsUpdate);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUpdate.add(this.jComboBoxTiposRelacionesUpdate, this.gridBagConstraintsUpdate);
				
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdate.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUpdate.add(this.jComboBoxTiposAccionesUpdate, this.gridBagConstraintsUpdate);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUpdate = new GridBagLayout();

			this.jScrollPanelDatosUpdate.setLayout(gridaBagLayoutDatosUpdate);
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = 0;
			this.gridBagConstraintsUpdate.gridx = 0;
			
			this.jScrollPanelDatosUpdate.add(this.jTableDatosUpdate, this.gridBagConstraintsUpdate);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUpdate.setViewportView(this.jTableDatosUpdate);
		this.jTableDatosUpdate.setFillsViewportHeight(true);
		this.jTableDatosUpdate.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUpdate= new GridBagLayout();
		this.jPanelAccionesUpdate.setLayout(gridaBagLayoutAccionesUpdate);
		
		
		/*	
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 0;
			
		this.jPanelAccionesUpdate.add(this.jButtonNuevoUpdate, this.gridBagConstraintsUpdate);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioUpdate= new GridBagLayout();
		gridaBagLayoutFK_IdAnioUpdate.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioUpdate.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioUpdate.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioUpdate.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioUpdate.setLayout(gridaBagLayoutFK_IdAnioUpdate);

		gridBagConstraintsUpdate = new GridBagConstraints();
		gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdate.gridy = 0;
		gridBagConstraintsUpdate.gridx = 0;
		jPanelFK_IdAnioUpdate.add(jLabelid_anioFK_IdAnioUpdate, gridBagConstraintsUpdate);

		gridBagConstraintsUpdate = new GridBagConstraints();
		gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdate.gridy = 0;
		gridBagConstraintsUpdate.gridx = 1;
		jPanelFK_IdAnioUpdate.add(jComboBoxid_anioFK_IdAnioUpdate, gridBagConstraintsUpdate);

		gridBagConstraintsUpdate = new GridBagConstraints();
		gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdate.gridy = 1;
		gridBagConstraintsUpdate.gridx =1;
		jPanelFK_IdAnioUpdate.add(jButtonFK_IdAnioUpdate, gridBagConstraintsUpdate);

		jTabbedPaneBusquedasUpdate.addTab("1.-Por Anio ", jPanelFK_IdAnioUpdate);
		jTabbedPaneBusquedasUpdate.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMesUpdate= new GridBagLayout();
		gridaBagLayoutFK_IdMesUpdate.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesUpdate.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesUpdate.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesUpdate.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesUpdate.setLayout(gridaBagLayoutFK_IdMesUpdate);

		gridBagConstraintsUpdate = new GridBagConstraints();
		gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdate.gridy = 0;
		gridBagConstraintsUpdate.gridx = 0;
		jPanelFK_IdMesUpdate.add(jLabelid_mesFK_IdMesUpdate, gridBagConstraintsUpdate);

		gridBagConstraintsUpdate = new GridBagConstraints();
		gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdate.gridy = 0;
		gridBagConstraintsUpdate.gridx = 1;
		jPanelFK_IdMesUpdate.add(jComboBoxid_mesFK_IdMesUpdate, gridBagConstraintsUpdate);

		gridBagConstraintsUpdate = new GridBagConstraints();
		gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdate.gridy = 1;
		gridBagConstraintsUpdate.gridx =1;
		jPanelFK_IdMesUpdate.add(jButtonFK_IdMesUpdate, gridBagConstraintsUpdate);

		jTabbedPaneBusquedasUpdate.addTab("2.-Por Mes ", jPanelFK_IdMesUpdate);
		jTabbedPaneBusquedasUpdate.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUpdate = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUpdate);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.updateSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUpdate = new GridBagConstraints();						
			this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUpdate.gridx = 0;		
			//this.gridBagConstraintsUpdate.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUpdate.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUpdate, this.gridBagConstraintsUpdate);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUpdate.gridx = 0;		
		//this.gridBagConstraintsUpdate.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUpdate.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUpdate);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUpdate.gridx = 0;		
			this.gridBagConstraintsUpdate.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUpdate.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUpdate, this.gridBagConstraintsUpdate);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUpdate, this.gridBagConstraintsUpdate);								
		
		
		/*
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUpdate, this.gridBagConstraintsUpdate);
		*/		
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUpdate.gridx =0;
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUpdate.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUpdate, this.gridBagConstraintsUpdate);
				
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUpdate, this.gridBagConstraintsUpdate);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(UpdateJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUpdate= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUpdate = new GridBagLayout();
			this.jPanelBusquedasParametrosUpdate.setLayout(gridaBagLayoutBusquedasParametrosUpdate);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUpdate=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUpdate.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUpdate.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUpdate.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUpdate, this.gridBagConstraintsUpdate);
			
			
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUpdate, this.gridBagConstraintsUpdate);
		
			
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUpdate, this.gridBagConstraintsUpdate);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUpdate;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUpdate() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUpdate = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUpdate.setName("jPanelReporteDinamicoUpdate"); 
		
		this.jPanelReporteDinamicoUpdate.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUpdate.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUpdate.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUpdate.setLayout(gridaBagLayoutReporteDinamicoUpdate);
		
		
		this.jInternalFrameReporteDinamicoUpdate= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUpdate = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUpdate= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUpdate.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUpdate.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUpdate.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUpdate.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUpdate.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUpdate.setResizable(true);
	    this.jInternalFrameReporteDinamicoUpdate.setClosable(true);
	    this.jInternalFrameReporteDinamicoUpdate.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUpdate.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUpdate.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUpdate.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Updates"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUpdate = new JLabelMe();

		this.jLabelColumnasSelectReporteUpdate.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUpdate.add(this.jLabelColumnasSelectReporteUpdate, this.gridBagConstraintsUpdate);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUpdate = new JList<Reporte>();
		this.jListColumnasSelectReporteUpdate.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUpdate.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUpdate.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUpdate.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUpdate.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUpdate=new JScrollPane(this.jListColumnasSelectReporteUpdate);
			
			this.jScrollColumnasSelectReporteUpdate.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUpdate.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUpdate.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUpdate.add(this.jListColumnasSelectReporteUpdate, this.gridBagConstraintsUpdate);
		this.jPanelReporteDinamicoUpdate.add(this.jScrollColumnasSelectReporteUpdate, this.gridBagConstraintsUpdate);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUpdate = new JLabelMe();

		this.jLabelRelacionesSelectReporteUpdate.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUpdate.add(this.jLabelRelacionesSelectReporteUpdate, this.gridBagConstraintsUpdate);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUpdate = new JList<Reporte>();
		this.jListRelacionesSelectReporteUpdate.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUpdate.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUpdate.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUpdate.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUpdate.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUpdate=new JScrollPane(this.jListRelacionesSelectReporteUpdate);
			
			this.jScrollRelacionesSelectReporteUpdate.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUpdate.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUpdate.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUpdate.add(this.jListRelacionesSelectReporteUpdate, this.gridBagConstraintsUpdate);
		this.jPanelReporteDinamicoUpdate.add(this.jScrollRelacionesSelectReporteUpdate, this.gridBagConstraintsUpdate);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoUpdate = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUpdate = new JComboBoxMe();
		this.jListColumnasValoresGraficoUpdate = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUpdate = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUpdate.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUpdate.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUpdate.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUpdate.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUpdate = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUpdate.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUpdate.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUpdate.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUpdate.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUpdate = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUpdate.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUpdate.add(this.jLabelGenerarExcelReporteDinamicoUpdate, this.gridBagConstraintsUpdate);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUpdate = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUpdate.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUpdate,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUpdate.setToolTipText("Generar EXCEL"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUpdate.add(this.jButtonGenerarExcelReporteDinamicoUpdate, this.gridBagConstraintsUpdate);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUpdate.add(this.jComboBoxTiposReportesDinamicoUpdate, this.gridBagConstraintsUpdate);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUpdate = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUpdate.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUpdate.add(this.jLabelTiposArchivoReporteDinamicoUpdate, this.gridBagConstraintsUpdate);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUpdate.add(this.jComboBoxTiposArchivosReportesDinamicoUpdate, this.gridBagConstraintsUpdate);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUpdate = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUpdate.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUpdate,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUpdate.setToolTipText("Generar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUpdate.add(this.jButtonGenerarReporteDinamicoUpdate, this.gridBagConstraintsUpdate);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUpdate = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUpdate.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUpdate,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUpdate.setToolTipText("Cancelar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUpdate.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUpdate.add(this.jButtonCerrarReporteDinamicoUpdate, this.gridBagConstraintsUpdate);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUpdate = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUpdate= new JScrollPane(jPanelReporteDinamicoUpdate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUpdate.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUpdate.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUpdate.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Updates"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUpdate.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUpdate.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUpdate.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUpdate);
		this.jInternalFrameReporteDinamicoUpdate.getContentPane().add(this.jScrollPanelReporteDinamicoUpdate, this.gridBagConstraintsUpdate);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUpdate() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUpdate = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUpdate.setName("jPanelImportacionUpdate"); 
		
		this.jPanelImportacionUpdate.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUpdate.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUpdate.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUpdate.setLayout(gridaBagLayoutImportacionUpdate);
		
		
		this.jInternalFrameImportacionUpdate= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUpdate= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUpdate = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUpdate= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUpdate.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUpdate.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUpdate.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUpdate.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUpdate.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUpdate.setResizable(true);
	    this.jInternalFrameImportacionUpdate.setClosable(true);
	    this.jInternalFrameImportacionUpdate.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUpdate.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUpdate.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUpdate.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUpdate.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUpdate.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUpdate.setResizable(true);
	    this.jInternalFrameImportacionUpdate.setClosable(true);
	    this.jInternalFrameImportacionUpdate.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUpdate.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUpdate.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUpdate.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Updates"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUpdate = new JLabelMe();

		this.jLabelArchivoImportacionUpdate.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = iPosYImportacion;		
		this.gridBagConstraintsUpdate.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUpdate.add(this.jLabelArchivoImportacionUpdate, this.gridBagConstraintsUpdate);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUpdate = new JFileChooser();		
		this.jFileChooserImportacionUpdate.setToolTipText("ESCOGER ARCHIVO"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUpdate = new JButtonMe();
		this.jButtonAbrirImportacionUpdate.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUpdate,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUpdate.setToolTipText("Generar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = iPosYImportacion;
		this.gridBagConstraintsUpdate.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUpdate.add(this.jButtonAbrirImportacionUpdate, this.gridBagConstraintsUpdate);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUpdate = new JLabelMe();

		this.jLabelPathArchivoImportacionUpdate.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = iPosYImportacion;		
		this.gridBagConstraintsUpdate.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUpdate.add(this.jLabelPathArchivoImportacionUpdate, this.gridBagConstraintsUpdate);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUpdate=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUpdate.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUpdate.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUpdate.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = iPosYImportacion;
		this.gridBagConstraintsUpdate.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUpdate.add(this.jTextFieldPathArchivoImportacionUpdate, this.gridBagConstraintsUpdate);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUpdate = new JButtonMe();
		this.jButtonGenerarImportacionUpdate.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUpdate,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUpdate.setToolTipText("Generar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = iPosYImportacion;
		this.gridBagConstraintsUpdate.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUpdate.add(this.jButtonGenerarImportacionUpdate, this.gridBagConstraintsUpdate);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUpdate = new JButtonMe();
		this.jButtonCerrarImportacionUpdate.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUpdate,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUpdate.setToolTipText("Cancelar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = iPosYImportacion;
		this.gridBagConstraintsUpdate.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUpdate.add(this.jButtonCerrarImportacionUpdate, this.gridBagConstraintsUpdate);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUpdate = new GridBagLayout();
		
		this.jScrollPanelImportacionUpdate= new JScrollPane(jPanelImportacionUpdate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy =iPosYImportacion;
		this.gridBagConstraintsUpdate.gridx =iPosXImportacion;
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUpdate.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUpdate.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUpdate);
		this.jInternalFrameImportacionUpdate.getContentPane().add(this.jScrollPanelImportacionUpdate, this.gridBagConstraintsUpdate);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUpdate(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUpdate = new JButtonMe();
			this.jButtonAbrirOrderByUpdate.setText("Orden");
			this.jButtonAbrirOrderByUpdate.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUpdate,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUpdate";
			inputMap = this.jButtonAbrirOrderByUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUpdate"));
		
		
			GridBagLayout gridaBagLayoutOrderByUpdate = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUpdate.setName("jPanelOrderByUpdate"); 
			
			this.jPanelOrderByUpdate.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUpdate.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUpdate.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUpdate.setLayout(gridaBagLayoutOrderByUpdate);
			
			
			this.jTableDatosUpdateOrderBy = new JTableMe();        
			this.jTableDatosUpdateOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUpdateOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUpdateOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUpdateOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUpdateOrderBy.setViewportView(this.jTableDatosUpdateOrderBy);
			this.jTableDatosUpdateOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUpdateOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUpdate= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUpdate= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUpdate = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUpdate= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUpdate.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUpdate.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUpdate.setTitle("Orden");
			this.jInternalFrameOrderByUpdate.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUpdate.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUpdate.setResizable(true);
			this.jInternalFrameOrderByUpdate.setClosable(true);
			this.jInternalFrameOrderByUpdate.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUpdate.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUpdate.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUpdate.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Updates"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUpdate.gridx =iPosXOrderBy;
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUpdate.ipady =150;
				
			this.jPanelOrderByUpdate.add(jScrollPanelDatosUpdateOrderBy, this.gridBagConstraintsUpdate);//this.jTableDatosUpdateTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUpdate = new JButtonMe();
			this.jButtonCerrarOrderByUpdate.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUpdate,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUpdate.setToolTipText("Cancelar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUpdate.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUpdate.add(this.jButtonCerrarOrderByUpdate, this.gridBagConstraintsUpdate);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUpdate = new GridBagLayout();
			
			this.jScrollPanelOrderByUpdate= new JScrollPane(jPanelOrderByUpdate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy =iPosYOrderBy;
			this.gridBagConstraintsUpdate.gridx =iPosXOrderBy;
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUpdate.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUpdate.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUpdate);
			
			this.jInternalFrameOrderByUpdate.getContentPane().add(this.jScrollPanelOrderByUpdate, this.gridBagConstraintsUpdate);			
		
		} else {
			this.jButtonAbrirOrderByUpdate = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.updateSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUpdate.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUpdate.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUpdate.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUpdate.getRowHeight();//UpdateConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UpdateConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUpdate.isSelected()) {
					iHeightTable=UpdateConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UpdateConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UpdateConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UpdateConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUpdate.isSelected()) {
					iHeightTable=UpdateConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UpdateConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UpdateConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUpdate.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUpdate.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUpdate.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUpdate.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUpdate.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUpdate.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUpdate!=null && this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy()!=null) {
			//if(!this.updateSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUpdate.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUpdate.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUpdate.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUpdate.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUpdate.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUpdate.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=updateLogic.getUpdates().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=updates.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Update> TraerUpdateBeans(List<Update> updates,ArrayList<Classe> classes)throws Exception {
		try {
			for(Update update:updates) {
					
				if(!(UpdateConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UpdateConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					update.setsDetalleGeneralEntityReporte(UpdateConstantesFunciones.getUpdateDescripcion(update));
										
					update.setejecutado_descripcion(UpdateConstantesFunciones.getejecutadoDescripcion(update));update.setesta_activo_descripcion(UpdateConstantesFunciones.getesta_activoDescripcion(update));	
					
					

					if(update.getUpdateDetalles()!=null && Funciones.existeClass(classes,UpdateDetalle.class)) {
						try{update.setupdatedetallesDescripcionReporte(new JRBeanCollectionDataSource(UpdateDetalleJInternalFrame.TraerUpdateDetalleBeans(update.getUpdateDetalles(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//update.setsDetalleGeneralEntityReporte(update.getsDetalleGeneralEntityReporte());
										
				}
				
				//updatebeans.add(updatebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return updates;
    }
	//PARA REPORTES FIN
}
