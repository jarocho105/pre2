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
import com.bydan.erp.seguridad.util.TipoTamanioControlConstantesFunciones;

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
public class TipoTamanioControlJInternalFrame extends TipoTamanioControlBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoTamanioControl;
	
	protected JMenuBar jmenuBarTipoTamanioControl;
	
	protected JMenu jmenuTipoTamanioControl;
	protected JMenu jmenuDatosTipoTamanioControl;
	protected JMenu jmenuArchivoTipoTamanioControl;
	protected JMenu jmenuAccionesTipoTamanioControl;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTamanioControl;	
	protected GridBagConstraints gridBagConstraintsTipoTamanioControl;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoTamanioControlDetalleFormJInternalFrame jInternalFrameDetalleFormTipoTamanioControl;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoTamanioControl;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoTamanioControl;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoTamanioControlSessionBean tipotamaniocontrolSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoTamanioControl> tipotamaniocontrols;		
	public List<TipoTamanioControl> tipotamaniocontrolsEliminados;	
	public List<TipoTamanioControl> tipotamaniocontrolsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoTamanioControl;		
	protected JButton jButtonAbrirOrderByTipoTamanioControl;
	
	
	//protected JPanel jPanelOrderByTipoTamanioControl;
	//public JScrollPane jScrollPanelOrderByTipoTamanioControl;	
	//protected JButton jButtonCerrarOrderByTipoTamanioControl;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoTamanioControlLogic tipotamaniocontrolLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoTamanioControl;
	public JScrollPane jScrollPanelDatosEdicionTipoTamanioControl;
	public JScrollPane jScrollPanelDatosGeneralTipoTamanioControl;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoTamanioControlOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoTamanioControl;
	//public JScrollPane jScrollPanelImportacionTipoTamanioControl;
	
	
	
	protected JPanel jPanelAccionesTipoTamanioControl;
	
    protected JPanel jPanelPaginacionTipoTamanioControl;
    protected JPanel jPanelParametrosReportesTipoTamanioControl;
	protected JPanel jPanelParametrosReportesAccionesTipoTamanioControl;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoTamanioControl;
	protected JPanel jPanelParametrosAuxiliar2TipoTamanioControl;
	protected JPanel jPanelParametrosAuxiliar3TipoTamanioControl;
	protected JPanel jPanelParametrosAuxiliar4TipoTamanioControl;
	//protected JPanel jPanelParametrosAuxiliar5TipoTamanioControl;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoTamanioControl;
	//protected JPanel jPanelImportacionTipoTamanioControl;
	
	
	public JTable jTableDatosTipoTamanioControl;
	
	
	
	//public JTable jTableDatosTipoTamanioControlOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoTamanioControl;
	protected JButton jButtonDuplicarTipoTamanioControl;
	protected JButton jButtonCopiarTipoTamanioControl;
	protected JButton jButtonVerFormTipoTamanioControl;
	protected JButton jButtonNuevoRelacionesTipoTamanioControl;
	protected JButton jButtonModificarTipoTamanioControl;
	
    protected JButton jButtonGuardarCambiosTablaTipoTamanioControl;
	protected JButton jButtonCerrarTipoTamanioControl;
	
	
	protected JButton jButtonRecargarInformacionTipoTamanioControl;
	protected JButton jButtonProcesarInformacionTipoTamanioControl;
	
	
	protected JButton jButtonAnterioresTipoTamanioControl;
	protected JButton jButtonSiguientesTipoTamanioControl;
	protected JButton jButtonNuevoGuardarCambiosTipoTamanioControl;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoTamanioControl;
	//protected JButton jButtonCerrarReporteDinamicoTipoTamanioControl;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoTamanioControl;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoTamanioControl;
	//protected JButton jButtonGenerarImportacionTipoTamanioControl;
	//protected JButton jButtonCerrarImportacionTipoTamanioControl;
	//protected JFileChooser jFileChooserImportacionTipoTamanioControl;
	//protected File fileImportacionTipoTamanioControl;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTamanioControl;
	protected JButton jButtonDuplicarToolBarTipoTamanioControl;
	protected JButton jButtonNuevoRelacionesToolBarTipoTamanioControl;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoTamanioControl;
	protected JButton jButtonCopiarToolBarTipoTamanioControl;
	protected JButton jButtonVerFormToolBarTipoTamanioControl;
	public JButton jButtonGuardarCambiosTablaToolBarTipoTamanioControl;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTamanioControl;
	protected JButton jButtonCerrarToolBarTipoTamanioControl;
	
	protected JButton jButtonRecargarInformacionToolBarTipoTamanioControl;
	protected JButton jButtonProcesarInformacionToolBarTipoTamanioControl;
	protected JButton jButtonAnterioresToolBarTipoTamanioControl;
	protected JButton jButtonSiguientesToolBarTipoTamanioControl;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoTamanioControl;
	protected JButton jButtonAbrirOrderByToolBarTipoTamanioControl;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTamanioControl;
	protected JMenuItem jMenuItemDuplicarTipoTamanioControl;
	protected JMenuItem jMenuItemNuevoRelacionesTipoTamanioControl;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoTamanioControl;
	protected JMenuItem jMenuItemCopiarTipoTamanioControl;
	protected JMenuItem jMenuItemVerFormTipoTamanioControl;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTamanioControl;
	protected JMenuItem jMenuItemCerrarTipoTamanioControl;
	protected JMenuItem jMenuItemDetalleCerrarTipoTamanioControl;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoTamanioControl;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTamanioControl;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoTamanioControl;
	protected JMenuItem jMenuItemProcesarInformacionTipoTamanioControl;
	protected JMenuItem jMenuItemAnterioresTipoTamanioControl;
	protected JMenuItem jMenuItemSiguientesTipoTamanioControl;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTamanioControl;
	protected JMenuItem jMenuItemAbrirOrderByTipoTamanioControl;
	protected JMenuItem jMenuItemMostrarOcultarTipoTamanioControl;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTamanioControl;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoTamanioControl;
	protected JCheckBox jCheckBoxSeleccionadosTipoTamanioControl;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoTamanioControl;
	protected JCheckBox jCheckBoxConGraficoReporteTipoTamanioControl;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoTamanioControl;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoTamanioControl;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoTamanioControl;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoTamanioControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoTamanioControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTamanioControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTamanioControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoTamanioControl;
	protected JTextField jTextFieldValorCampoGeneralTipoTamanioControl;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoTamanioControl;
	//public JList<Reporte> jListColumnasSelectReporteTipoTamanioControl;
	//public JScrollPane jScrollColumnasSelectReporteTipoTamanioControl;
	
	//public JLabel jLabelRelacionesSelectReporteTipoTamanioControl;
	//public JList<Reporte> jListRelacionesSelectReporteTipoTamanioControl;
	//public JScrollPane jScrollRelacionesSelectReporteTipoTamanioControl;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoTamanioControl;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoTamanioControl;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoTamanioControl;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoTamanioControl;
	
		
	//public JLabel jLabelArchivoImportacionTipoTamanioControl;	
	//public JLabel jLabelPathArchivoImportacionTipoTamanioControl;
	//protected JTextField jTextFieldPathArchivoImportacionTipoTamanioControl;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoTamanioControl;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoTamanioControl;
	
	//public JLabel jLabelColumnaCategoriaValorTipoTamanioControl;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoTamanioControl;
	
	//public JLabel jLabelColumnasValoresGraficoTipoTamanioControl;
	//public JList<Reporte> jListColumnasValoresGraficoTipoTamanioControl;
	//public JScrollPane jScrollColumnasValoresGraficoTipoTamanioControl;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoTamanioControl;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoTamanioControl;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoTamanioControlJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTamanioControlJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTamanioControlJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTamanioControlJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoTamanioControl)	{
		this.jButtonRecargarInformacionTipoTamanioControl = jButtonRecargarInformacionTipoTamanioControl;
	}
	
	public JButton getjButtonProcesarInformacionTipoTamanioControl() {
		return this.jButtonProcesarInformacionTipoTamanioControl;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTamanioControl)	{
		this.jButtonProcesarInformacionTipoTamanioControl = jButtonProcesarInformacionTipoTamanioControl;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoTamanioControl() {
		return this.jButtonRecargarInformacionTipoTamanioControl;
	}
	
	
	public List<TipoTamanioControl> gettipotamaniocontrols() {
		return this.tipotamaniocontrols;
	}

	public void settipotamaniocontrols(List<TipoTamanioControl> tipotamaniocontrols) {
		this.tipotamaniocontrols = tipotamaniocontrols;
	}
	
	public List<TipoTamanioControl> gettipotamaniocontrolsAux() {
		return this.tipotamaniocontrolsAux;
	}

	public void settipotamaniocontrolsAux(List<TipoTamanioControl> tipotamaniocontrolsAux) {
		this.tipotamaniocontrolsAux = tipotamaniocontrolsAux;
	}
	
	public List<TipoTamanioControl> gettipotamaniocontrolsEliminados() {
		return this.tipotamaniocontrolsEliminados;
	}

	public void setTipoTamanioControlsEliminados(List<TipoTamanioControl> tipotamaniocontrolsEliminados) {
		this.tipotamaniocontrolsEliminados = tipotamaniocontrolsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoTamanioControl() {
		return jComboBoxTiposSeleccionarTipoTamanioControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoTamanioControl(
			JComboBox jComboBoxTiposSeleccionarTipoTamanioControl) {
		this.jComboBoxTiposSeleccionarTipoTamanioControl = jComboBoxTiposSeleccionarTipoTamanioControl;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoTamanioControl() {
		return jTextFieldValorCampoGeneralTipoTamanioControl;
	}

	public void setjTextFieldValorCampoGeneralTipoTamanioControl(
			JTextField jTextFieldValorCampoGeneralTipoTamanioControl) {
		this.jTextFieldValorCampoGeneralTipoTamanioControl = jTextFieldValorCampoGeneralTipoTamanioControl;
	}

	public void setBorderResaltarValorCampoGeneralTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoTamanioControl .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoTamanioControl() {
		return this.jCheckBoxSeleccionarTodosTipoTamanioControl;
	}

	public void setjCheckBoxSeleccionarTodosTipoTamanioControl(
			JCheckBox jCheckBoxSeleccionarTodosTipoTamanioControl) {
		this.jCheckBoxSeleccionarTodosTipoTamanioControl = jCheckBoxSeleccionarTodosTipoTamanioControl;
	}

	public void setBorderResaltarSeleccionarTodosTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoTamanioControl() {
		return this.jCheckBoxSeleccionadosTipoTamanioControl;
	}

	public void setjCheckBoxSeleccionadosTipoTamanioControl(
			JCheckBox jCheckBoxSeleccionadosTipoTamanioControl) {
		this.jCheckBoxSeleccionadosTipoTamanioControl = jCheckBoxSeleccionadosTipoTamanioControl;
	}
	
	public void setBorderResaltarSeleccionadosTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoTamanioControl() {
		return this.jComboBoxTiposArchivosReportesTipoTamanioControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoTamanioControl(
			JComboBox jComboBoxTiposArchivosReportesTipoTamanioControl) {
		this.jComboBoxTiposArchivosReportesTipoTamanioControl = jComboBoxTiposArchivosReportesTipoTamanioControl;
	}

	public void setBorderResaltarTiposArchivosReportesTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoTamanioControl() {
		return this.jComboBoxTiposReportesTipoTamanioControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoTamanioControl(
			JComboBox jComboBoxTiposReportesTipoTamanioControl) {
		this.jComboBoxTiposReportesTipoTamanioControl = jComboBoxTiposReportesTipoTamanioControl;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoTamanioControl() {
	//	return jComboBoxTiposReportesDinamicoTipoTamanioControl;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoTamanioControl(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoTamanioControl) {
	//	this.jComboBoxTiposReportesDinamicoTipoTamanioControl = jComboBoxTiposReportesDinamicoTipoTamanioControl;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoTamanioControl() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoTamanioControl(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl = jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl;
	//}
	
	public void setBorderResaltarTiposReportesTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoTamanioControl() {
		return this.jComboBoxTiposGraficosReportesTipoTamanioControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoTamanioControl(
			JComboBox jComboBoxTiposGraficosReportesTipoTamanioControl) {
		this.jComboBoxTiposGraficosReportesTipoTamanioControl = jComboBoxTiposGraficosReportesTipoTamanioControl;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoTamanioControl() {
		return this.jComboBoxTiposPaginacionTipoTamanioControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoTamanioControl(
			JComboBox jComboBoxTiposPaginacionTipoTamanioControl) {
		this.jComboBoxTiposPaginacionTipoTamanioControl = jComboBoxTiposPaginacionTipoTamanioControl;
	}
	
	public void setBorderResaltarTiposPaginacionTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoTamanioControl() {
		return this.jComboBoxTiposRelacionesTipoTamanioControl;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTamanioControl() {
		return this.jComboBoxTiposAccionesTipoTamanioControl;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTamanioControl(
			JComboBox jComboBoxTiposRelacionesTipoTamanioControl) {
		this.jComboBoxTiposRelacionesTipoTamanioControl = jComboBoxTiposRelacionesTipoTamanioControl;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTamanioControl(
			JComboBox jComboBoxTiposAccionesTipoTamanioControl) {
		this.jComboBoxTiposAccionesTipoTamanioControl = jComboBoxTiposAccionesTipoTamanioControl;
	}
	
	public void setBorderResaltarTiposRelacionesTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoTamanioControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoTamanioControl .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoTamanioControl() {
	//	return jCheckBoxConGraficoDinamicoTipoTamanioControl;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoTamanioControl(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoTamanioControl) {
	//	this.jCheckBoxConGraficoDinamicoTipoTamanioControl = jCheckBoxConGraficoDinamicoTipoTamanioControl;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoTamanioControl() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoTamanioControl.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoTamanioControl .setBorder(borderResaltar);		
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
		this.tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean();
		
		this.tipotamaniocontrolSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotamaniocontrolSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoTamanioControlJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoTamanioControlJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTamanioControlJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTamanioControlJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTamanioControlJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Tamanio Control MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoTamanioControlJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoTamanioControl= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"nuevo","nuevo","Nuevo"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"duplicar","duplicar","Duplicar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"copiar","copiar","Copiar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"ver_form","ver_form","Ver"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"recargar","recargar","Recargar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoTamanioControl,this.jTtoolBarTipoTamanioControl,
							"cerrar","cerrar","Salir"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoTamanioControl=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoTamanioControl;
			
				this.jButtonProcesarInformacionToolBarTipoTamanioControl=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoTamanioControl;
				
		//protected JButton jButtonModificarToolBarTipoTamanioControl;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoTamanioControl=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoTamanioControl=new JMenuMe("General");
		this.jmenuArchivoTipoTamanioControl=new JMenuMe("Archivo");
		this.jmenuAccionesTipoTamanioControl=new JMenuMe("Acciones");
		this.jmenuDatosTipoTamanioControl=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTamanioControl= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTamanioControl.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTamanioControl,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoTamanioControl= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoTamanioControl.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoTamanioControl,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoTamanioControl= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoTamanioControl.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoTamanioControl,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoTamanioControl= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTamanioControl.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTamanioControl,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoTamanioControl= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoTamanioControl.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoTamanioControl,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoTamanioControl= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoTamanioControl.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoTamanioControl,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoTamanioControl= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoTamanioControl.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoTamanioControl,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTamanioControl= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTamanioControl.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTamanioControl,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoTamanioControl= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoTamanioControl.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoTamanioControl,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoTamanioControl= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoTamanioControl.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoTamanioControl,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoTamanioControl= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoTamanioControl.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoTamanioControl,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoTamanioControl= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoTamanioControl.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoTamanioControl,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoTamanioControl= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoTamanioControl.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoTamanioControl,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTamanioControl= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTamanioControl.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTamanioControl,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoTamanioControl= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoTamanioControl.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoTamanioControl,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTamanioControl= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTamanioControl.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTamanioControl,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoTamanioControl= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoTamanioControl.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoTamanioControl,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoTamanioControl.add(this.jMenuItemCerrarTipoTamanioControl);
			
			this.jmenuAccionesTipoTamanioControl.add(this.jMenuItemNuevoTipoTamanioControl);
			this.jmenuAccionesTipoTamanioControl.add(this.jMenuItemNuevoGuardarCambiosTipoTamanioControl);
			this.jmenuAccionesTipoTamanioControl.add(this.jMenuItemNuevoRelacionesTipoTamanioControl);
			this.jmenuAccionesTipoTamanioControl.add(this.jMenuItemGuardarCambiosTablaTipoTamanioControl);		
			this.jmenuAccionesTipoTamanioControl.add(this.jMenuItemDuplicarTipoTamanioControl);		
			this.jmenuAccionesTipoTamanioControl.add(this.jMenuItemCopiarTipoTamanioControl);		
			this.jmenuAccionesTipoTamanioControl.add(this.jMenuItemVerFormTipoTamanioControl);		
			
			this.jmenuDatosTipoTamanioControl.add(this.jMenuItemRecargarInformacionTipoTamanioControl);				
			this.jmenuDatosTipoTamanioControl.add(this.jMenuItemAnterioresTipoTamanioControl);				
			this.jmenuDatosTipoTamanioControl.add(this.jMenuItemSiguientesTipoTamanioControl);				
			this.jmenuDatosTipoTamanioControl.add(this.jMenuItemAbrirOrderByTipoTamanioControl);				
			this.jmenuDatosTipoTamanioControl.add(this.jMenuItemMostrarOcultarTipoTamanioControl);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoTamanioControl.add(this.jMenuItemGuardarCambiosTipoTamanioControl);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoTamanioControl.add(this.jmenuArchivoTipoTamanioControl);		
			this.jmenuBarTipoTamanioControl.add(this.jmenuAccionesTipoTamanioControl);		
			this.jmenuBarTipoTamanioControl.add(this.jmenuDatosTipoTamanioControl);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoTamanioControl);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoTamanioControl() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoTamanioControl = new TipoTamanioControlDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Tamanio Control DATOS");
			this.jInternalFrameDetalleFormTipoTamanioControl = new TipoTamanioControlDetalleFormJInternalFrame(jDesktopPane,this.tipotamaniocontrolSessionBean.getConGuardarRelaciones(),this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoTamanioControl = null;//new TipoTamanioControlDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTamanioControl= new GridBagLayout();
		
		
		this.jTableDatosTipoTamanioControl = new JTableMe();      
		
		String sToolTipTipoTamanioControl="";
		sToolTipTipoTamanioControl=TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTamanioControl+="(Seguridad.TipoTamanioControl)";
		}
		
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTamanioControl+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoTamanioControl.setToolTipText(sToolTipTipoTamanioControl);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoTamanioControl);
		this.jTableDatosTipoTamanioControl.setAutoCreateRowSorter(true);
		this.jTableDatosTipoTamanioControl.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoTamanioControl.setRowSelectionAllowed(true);
		this.jTableDatosTipoTamanioControl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoTamanioControl = new JButtonMe();
		this.jButtonDuplicarTipoTamanioControl = new JButtonMe();
		this.jButtonCopiarTipoTamanioControl = new JButtonMe();
		this.jButtonVerFormTipoTamanioControl = new JButtonMe();
		this.jButtonNuevoRelacionesTipoTamanioControl = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoTamanioControl = new JButtonMe();
		this.jButtonCerrarTipoTamanioControl = new JButtonMe();
		
		this.jScrollPanelDatosTipoTamanioControl = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoTamanioControl = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Tamanio Control";
		
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tamanio Controls" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTamanioControl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTamanioControl.setToolTipText("Acciones");
        this.jPanelAccionesTipoTamanioControl.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoTamanioControl=new ReporteDinamicoJInternalFrame(TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoTamanioControl();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoTamanioControl=new ImportacionJInternalFrame(TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoTamanioControl();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoTamanioControl = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoTamanioControl.setText("Orden");
		this.jButtonAbrirOrderByTipoTamanioControl.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTamanioControl,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTamanioControl=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTamanioControl,false,this);
			
			//this.cargarOrderByTipoTamanioControl(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTamanioControl=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTamanioControl,true,this);
			
			//this.cargarOrderByTipoTamanioControl(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoTamanioControl.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoTamanioControl.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoTamanioControl.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoTamanioControl.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTamanioControl.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTamanioControl.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoTamanioControl.setText("Nuevo");
		this.jButtonDuplicarTipoTamanioControl.setText("Duplicar");
		this.jButtonCopiarTipoTamanioControl.setText("Copiar");
		this.jButtonVerFormTipoTamanioControl.setText("Ver");
		this.jButtonNuevoRelacionesTipoTamanioControl.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoTamanioControl.setText("Guardar");
		this.jButtonCerrarTipoTamanioControl.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTamanioControl,"nuevo_button","Nuevo",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoTamanioControl,"duplicar_button","Duplicar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoTamanioControl,"copiar_button","Copiar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoTamanioControl,"ver_form","Ver",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoTamanioControl,"nuevorelaciones_button","Nuevo Rel",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTamanioControl,"guardarcambiostabla_button","Guardar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTamanioControl,"cerrar_button","Salir",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoTamanioControl.setToolTipText("Nuevo"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoTamanioControl.setToolTipText("Duplicar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoTamanioControl.setToolTipText("Copiar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoTamanioControl.setToolTipText("Ver"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoTamanioControl.setToolTipText("Nuevo Rel"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoTamanioControl.setToolTipText("Guardar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTamanioControl.setToolTipText("Salir"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTamanioControl";
		inputMap = this.jButtonNuevoTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTamanioControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTamanioControl"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoTamanioControl";
		inputMap = this.jButtonDuplicarTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoTamanioControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoTamanioControl"));
		
		//COPIAR
		sMapKey = "CopiarTipoTamanioControl";
		inputMap = this.jButtonCopiarTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoTamanioControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoTamanioControl"));
		
		//VEr FORM
		sMapKey = "VerFormTipoTamanioControl";
		inputMap = this.jButtonVerFormTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoTamanioControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoTamanioControl"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoTamanioControl";
		inputMap = this.jButtonNuevoRelacionesTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoTamanioControl"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoTamanioControl";
		inputMap = this.jButtonModificarTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoTamanioControl"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoTamanioControl";
		inputMap = this.jButtonCerrarTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTamanioControl"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTamanioControl";
		inputMap = this.jButtonGuardarCambiosTablaTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTamanioControl"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoTamanioControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoTamanioControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoTamanioControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoTamanioControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoTamanioControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoTamanioControl.setName("jPanelParametrosReportesTipoTamanioControl"); 
		
		this.jPanelParametrosReportesAccionesTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoTamanioControl.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoTamanioControl.setName("jPanelParametrosReportesAccionesTipoTamanioControl"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoTamanioControl = new JButtonMe();
		this.jButtonRecargarInformacionTipoTamanioControl.setText("Recargar");
		this.jButtonRecargarInformacionTipoTamanioControl.setToolTipText("Recargar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoTamanioControl,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoTamanioControl = new JButtonMe();
		this.jButtonProcesarInformacionTipoTamanioControl.setText("Procesar");
		this.jButtonProcesarInformacionTipoTamanioControl.setToolTipText("Procesar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoTamanioControl.setVisible(false);
			
		this.jButtonProcesarInformacionTipoTamanioControl.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTamanioControl.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTamanioControl.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTamanioControl.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoTamanioControl.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTamanioControl.setText("TIPO");       
		this.jComboBoxTiposReportesTipoTamanioControl.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTamanioControl.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoTamanioControl.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoTamanioControl.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoTamanioControl.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoTamanioControl.setText("Accion");
		this.jComboBoxTiposRelacionesTipoTamanioControl.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTamanioControl.setText("Accion");
		this.jComboBoxTiposAccionesTipoTamanioControl.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoTamanioControl.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoTamanioControl.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoTamanioControl=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoTamanioControl.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTamanioControl.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTamanioControl.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoTamanioControl = new JLabelMe();
		
		this.jLabelAccionesTipoTamanioControl.setText("Acciones");		
		this.jLabelAccionesTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoTamanioControl = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoTamanioControl.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoTamanioControl.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoTamanioControl = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoTamanioControl.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoTamanioControl.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoTamanioControl = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoTamanioControl.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoTamanioControl.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoTamanioControl = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoTamanioControl.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoTamanioControl.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoTamanioControl = new JButtonMe();
		//this.jButtonAnterioresTipoTamanioControl.setText("<<");
        this.jButtonAnterioresTipoTamanioControl.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoTamanioControl,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoTamanioControl = new JButtonMe();
		//this.jButtonSiguientesTipoTamanioControl.setText(">>");
        this.jButtonSiguientesTipoTamanioControl.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoTamanioControl,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoTamanioControl = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoTamanioControl.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoTamanioControl.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoTamanioControl,"nuevoguardarcambios_button","Nue",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoTamanioControl";
		inputMap = this.jButtonNuevoGuardarCambiosTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoTamanioControl"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoTamanioControl";
		inputMap = this.jButtonRecargarInformacionTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoTamanioControl"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoTamanioControl";
		inputMap = this.jButtonSiguientesTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoTamanioControl"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoTamanioControl";
		inputMap = this.jButtonAnterioresTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoTamanioControl"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoTamanioControl();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoTamanioControl.setMinimumSize(new Dimension(this.getWidth(),TipoTamanioControlBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTamanioControlBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTamanioControl.setMaximumSize(new Dimension(this.getWidth(),TipoTamanioControlBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTamanioControlBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTamanioControl.setPreferredSize(new Dimension(this.getWidth(),TipoTamanioControlBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTamanioControlBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoTamanioControl = new GridBagLayout();

			this.jPanelPaginacionTipoTamanioControl.setLayout(gridaBagLayoutPaginacionTipoTamanioControl);						
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = 0;
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoTamanioControl.add(this.jButtonAnterioresTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
					
						
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTamanioControl.gridy = 0;
			
			this.jPanelPaginacionTipoTamanioControl.add(this.jButtonNuevoGuardarCambiosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
						
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTamanioControl.gridy = 0;
			this.jPanelPaginacionTipoTamanioControl.add(this.jButtonSiguientesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = 1;
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTamanioControl.add(this.jButtonNuevoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
						
			
			
			if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
				this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTamanioControl.gridy = 1;
				this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoTamanioControl.add(this.jButtonGuardarCambiosTablaTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			}
			
			
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = 1;
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTamanioControl.add(this.jButtonDuplicarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = 1;
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTamanioControl.add(this.jButtonCopiarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = 1;
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTamanioControl.add(this.jButtonVerFormTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = 1;
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoTamanioControl.add(this.jButtonCerrarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
		
		
		this.jButtonRecargarInformacionTipoTamanioControl.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTamanioControl.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTamanioControl.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoTamanioControl.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTamanioControl.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTamanioControl.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoTamanioControl.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTamanioControl.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTamanioControl.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoTamanioControl.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTamanioControl.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTamanioControl.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoTamanioControl.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTamanioControl.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTamanioControl.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoTamanioControl.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTamanioControl.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTamanioControl.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoTamanioControl.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTamanioControl.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTamanioControl.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoTamanioControl.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTamanioControl.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTamanioControl.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoTamanioControl.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTamanioControl.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTamanioControl.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoTamanioControl.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTamanioControl.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTamanioControl.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoTamanioControl.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTamanioControl.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTamanioControl.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoTamanioControl.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTamanioControl.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTamanioControl.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoTamanioControl = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoTamanioControl = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoTamanioControl = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoTamanioControl = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoTamanioControl = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoTamanioControl = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoTamanioControl.setLayout(gridaBagParametrosReportesTipoTamanioControl);
			this.jPanelParametrosReportesAccionesTipoTamanioControl.setLayout(gridaBagParametrosReportesAccionesTipoTamanioControl);
			
			
			this.jPanelParametrosAuxiliar1TipoTamanioControl.setLayout(gridaBagParametrosAuxiliar1TipoTamanioControl);
			this.jPanelParametrosAuxiliar2TipoTamanioControl.setLayout(gridaBagParametrosAuxiliar2TipoTamanioControl);
			this.jPanelParametrosAuxiliar3TipoTamanioControl.setLayout(gridaBagParametrosAuxiliar3TipoTamanioControl);
			this.jPanelParametrosAuxiliar4TipoTamanioControl.setLayout(gridaBagParametrosAuxiliar4TipoTamanioControl);
			//this.jPanelParametrosAuxiliar5TipoTamanioControl.setLayout(gridaBagParametrosAuxiliar2TipoTamanioControl);			
			
			
			
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jButtonRecargarInformacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTamanioControl.add(this.jComboBoxTiposPaginacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTamanioControl.add(this.jCheckBoxConAltoMaximoTablaTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTamanioControl.add(this.jComboBoxTiposArchivosReportesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jPanelParametrosAuxiliar1TipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTamanioControl.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoTamanioControl.add(this.jComboBoxTiposReportesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jPanelParametrosAuxiliar4TipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jComboBoxTiposReportesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jCheckBoxGenerarReporteTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jPanelParametrosAuxiliar2TipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTamanioControl.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jLabelAccionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
				this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoTamanioControl.add(this.jButtonAbrirOrderByTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jComboBoxTiposSeleccionarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);			
			
			
			/*
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTamanioControl.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jCheckBoxSeleccionarTodosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTamanioControl.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTamanioControl.add(this.jCheckBoxSeleccionarTodosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);															
				
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTamanioControl.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTamanioControl.add(this.jCheckBoxSeleccionadosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jPanelParametrosAuxiliar3TipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jComboBoxTiposRelacionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
				
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTamanioControl.add(this.jComboBoxTiposAccionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoTamanioControl = new GridBagLayout();

			this.jScrollPanelDatosTipoTamanioControl.setLayout(gridaBagLayoutDatosTipoTamanioControl);
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = 0;
			this.gridBagConstraintsTipoTamanioControl.gridx = 0;
			
			this.jScrollPanelDatosTipoTamanioControl.add(this.jTableDatosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoTamanioControl.setViewportView(this.jTableDatosTipoTamanioControl);
		this.jTableDatosTipoTamanioControl.setFillsViewportHeight(true);
		this.jTableDatosTipoTamanioControl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoTamanioControl= new GridBagLayout();
		this.jPanelAccionesTipoTamanioControl.setLayout(gridaBagLayoutAccionesTipoTamanioControl);
		
		
		/*	
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;
			
		this.jPanelAccionesTipoTamanioControl.add(this.jButtonNuevoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTamanioControl = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTamanioControl);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();						
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTamanioControl.gridx = 0;		
			//this.gridBagConstraintsTipoTamanioControl.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTamanioControl.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;		
		//this.gridBagConstraintsTipoTamanioControl.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoTamanioControl.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoTamanioControl);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);								
		
		
		/*
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		*/		
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTamanioControl.gridx =0;
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTamanioControl.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
				
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoTamanioControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTamanioControl = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoTamanioControl.setLayout(gridaBagLayoutBusquedasParametrosTipoTamanioControl);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoTamanioControl=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTamanioControl.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTamanioControl.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTamanioControl.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			
			
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
			
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoTamanioControl;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoTamanioControl() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoTamanioControl = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoTamanioControl.setName("jPanelReporteDinamicoTipoTamanioControl"); 
		
		this.jPanelReporteDinamicoTipoTamanioControl.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTamanioControl.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTamanioControl.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoTamanioControl.setLayout(gridaBagLayoutReporteDinamicoTipoTamanioControl);
		
		
		this.jInternalFrameReporteDinamicoTipoTamanioControl= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoTamanioControl = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTamanioControl= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoTamanioControl.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoTamanioControl.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoTamanioControl.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoTamanioControl.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoTamanioControl.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoTamanioControl.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoTamanioControl.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoTamanioControl.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoTamanioControl.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTamanioControl.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTamanioControl.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tamanio Controls"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoTamanioControl = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoTamanioControl.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTamanioControl.add(this.jLabelColumnasSelectReporteTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoTamanioControl = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoTamanioControl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoTamanioControl.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoTamanioControl.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTamanioControl.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTamanioControl.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoTamanioControl=new JScrollPane(this.jListColumnasSelectReporteTipoTamanioControl);
			
			this.jScrollColumnasSelectReporteTipoTamanioControl.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTamanioControl.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTamanioControl.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTamanioControl.add(this.jListColumnasSelectReporteTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		this.jPanelReporteDinamicoTipoTamanioControl.add(this.jScrollColumnasSelectReporteTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoTamanioControl = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoTamanioControl.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoTamanioControl = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoTamanioControl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoTamanioControl.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoTamanioControl.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTamanioControl.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTamanioControl.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoTamanioControl=new JScrollPane(this.jListRelacionesSelectReporteTipoTamanioControl);
			
			this.jScrollRelacionesSelectReporteTipoTamanioControl.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTamanioControl.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTamanioControl.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoTamanioControl = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoTamanioControl = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoTamanioControl = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoTamanioControl = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoTamanioControl.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoTamanioControl.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTamanioControl.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTamanioControl.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoTamanioControl = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoTamanioControl.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTamanioControl.add(this.jLabelGenerarExcelReporteDinamicoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoTamanioControl = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoTamanioControl.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoTamanioControl,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoTamanioControl.setToolTipText("Generar EXCEL"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		//this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoTamanioControl.add(this.jButtonGenerarExcelReporteDinamicoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTamanioControl.add(this.jComboBoxTiposReportesDinamicoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoTamanioControl = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoTamanioControl.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTamanioControl.add(this.jLabelTiposArchivoReporteDinamicoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTamanioControl.add(this.jComboBoxTiposArchivosReportesDinamicoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoTamanioControl = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoTamanioControl.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoTamanioControl,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoTamanioControl.setToolTipText("Generar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTamanioControl.add(this.jButtonGenerarReporteDinamicoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoTamanioControl = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoTamanioControl.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoTamanioControl,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoTamanioControl.setToolTipText("Cancelar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTamanioControl.add(this.jButtonCerrarReporteDinamicoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoTamanioControl = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoTamanioControl= new JScrollPane(jPanelReporteDinamicoTipoTamanioControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoTamanioControl.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTamanioControl.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTamanioControl.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tamanio Controls"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoTamanioControl.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoTamanioControl.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoTamanioControl.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoTamanioControl);
		this.jInternalFrameReporteDinamicoTipoTamanioControl.getContentPane().add(this.jScrollPanelReporteDinamicoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoTamanioControl() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoTamanioControl = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoTamanioControl.setName("jPanelImportacionTipoTamanioControl"); 
		
		this.jPanelImportacionTipoTamanioControl.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTamanioControl.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTamanioControl.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoTamanioControl.setLayout(gridaBagLayoutImportacionTipoTamanioControl);
		
		
		this.jInternalFrameImportacionTipoTamanioControl= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoTamanioControl= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoTamanioControl = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTamanioControl= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoTamanioControl.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTamanioControl.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTamanioControl.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoTamanioControl.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTamanioControl.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTamanioControl.setResizable(true);
	    this.jInternalFrameImportacionTipoTamanioControl.setClosable(true);
	    this.jInternalFrameImportacionTipoTamanioControl.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoTamanioControl.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTamanioControl.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTamanioControl.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoTamanioControl.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTamanioControl.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTamanioControl.setResizable(true);
	    this.jInternalFrameImportacionTipoTamanioControl.setClosable(true);
	    this.jInternalFrameImportacionTipoTamanioControl.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoTamanioControl.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTamanioControl.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTamanioControl.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tamanio Controls"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoTamanioControl = new JLabelMe();

		this.jLabelArchivoImportacionTipoTamanioControl.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTamanioControl.add(this.jLabelArchivoImportacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoTamanioControl = new JFileChooser();		
		this.jFileChooserImportacionTipoTamanioControl.setToolTipText("ESCOGER ARCHIVO"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoTamanioControl = new JButtonMe();
		this.jButtonAbrirImportacionTipoTamanioControl.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoTamanioControl,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoTamanioControl.setToolTipText("Generar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTamanioControl.add(this.jButtonAbrirImportacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoTamanioControl = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoTamanioControl.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTamanioControl.add(this.jLabelPathArchivoImportacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoTamanioControl=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoTamanioControl.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTamanioControl.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTamanioControl.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTamanioControl.add(this.jTextFieldPathArchivoImportacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoTamanioControl = new JButtonMe();
		this.jButtonGenerarImportacionTipoTamanioControl.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoTamanioControl,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoTamanioControl.setToolTipText("Generar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTamanioControl.add(this.jButtonGenerarImportacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoTamanioControl = new JButtonMe();
		this.jButtonCerrarImportacionTipoTamanioControl.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoTamanioControl,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoTamanioControl.setToolTipText("Cancelar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTamanioControl.add(this.jButtonCerrarImportacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoTamanioControl = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoTamanioControl= new JScrollPane(jPanelImportacionTipoTamanioControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoTamanioControl.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoTamanioControl.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoTamanioControl.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoTamanioControl);
		this.jInternalFrameImportacionTipoTamanioControl.getContentPane().add(this.jScrollPanelImportacionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoTamanioControl(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoTamanioControl = new JButtonMe();
			this.jButtonAbrirOrderByTipoTamanioControl.setText("Orden");
			this.jButtonAbrirOrderByTipoTamanioControl.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTamanioControl,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoTamanioControl";
			inputMap = this.jButtonAbrirOrderByTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoTamanioControl"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoTamanioControl = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoTamanioControl.setName("jPanelOrderByTipoTamanioControl"); 
			
			this.jPanelOrderByTipoTamanioControl.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTamanioControl.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTamanioControl.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoTamanioControl.setLayout(gridaBagLayoutOrderByTipoTamanioControl);
			
			
			this.jTableDatosTipoTamanioControlOrderBy = new JTableMe();        
			this.jTableDatosTipoTamanioControlOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoTamanioControlOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoTamanioControlOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoTamanioControlOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoTamanioControlOrderBy.setViewportView(this.jTableDatosTipoTamanioControlOrderBy);
			this.jTableDatosTipoTamanioControlOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoTamanioControlOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoTamanioControl= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoTamanioControl= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoTamanioControl = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoTamanioControl= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoTamanioControl.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoTamanioControl.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoTamanioControl.setTitle("Orden");
			this.jInternalFrameOrderByTipoTamanioControl.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoTamanioControl.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoTamanioControl.setResizable(true);
			this.jInternalFrameOrderByTipoTamanioControl.setClosable(true);
			this.jInternalFrameOrderByTipoTamanioControl.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoTamanioControl.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTamanioControl.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTamanioControl.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tamanio Controls"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoTamanioControl.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoTamanioControl.ipady =150;
				
			this.jPanelOrderByTipoTamanioControl.add(jScrollPanelDatosTipoTamanioControlOrderBy, this.gridBagConstraintsTipoTamanioControl);//this.jTableDatosTipoTamanioControlTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoTamanioControl = new JButtonMe();
			this.jButtonCerrarOrderByTipoTamanioControl.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoTamanioControl,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoTamanioControl.setToolTipText("Cancelar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoTamanioControl.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoTamanioControl.add(this.jButtonCerrarOrderByTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoTamanioControl = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoTamanioControl= new JScrollPane(jPanelOrderByTipoTamanioControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoTamanioControl.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoTamanioControl.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoTamanioControl.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoTamanioControl);
			
			this.jInternalFrameOrderByTipoTamanioControl.getContentPane().add(this.jScrollPanelOrderByTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);			
		
		} else {
			this.jButtonAbrirOrderByTipoTamanioControl = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoTamanioControl.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoTamanioControl.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoTamanioControl.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoTamanioControl.getRowHeight();//TipoTamanioControlConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoTamanioControlConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTamanioControl.isSelected()) {
					iHeightTable=TipoTamanioControlConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTamanioControlConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTamanioControlConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoTamanioControlConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTamanioControl.isSelected()) {
					iHeightTable=TipoTamanioControlConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTamanioControlConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTamanioControlConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoTamanioControl.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTamanioControl.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTamanioControl.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoTamanioControl.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTamanioControl.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTamanioControl.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoTamanioControl!=null && this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy()!=null) {
			//if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoTamanioControl.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoTamanioControl.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoTamanioControl.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoTamanioControl.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoTamanioControl.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTamanioControl.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTamanioControl.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipotamaniocontrolLogic.getTipoTamanioControls().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotamaniocontrols.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoTamanioControl> TraerTipoTamanioControlBeans(List<TipoTamanioControl> tipotamaniocontrols,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoTamanioControl tipotamaniocontrol:tipotamaniocontrols) {
					
				if(!(TipoTamanioControlConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoTamanioControlConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipotamaniocontrol.setsDetalleGeneralEntityReporte(TipoTamanioControlConstantesFunciones.getTipoTamanioControlDescripcion(tipotamaniocontrol));
										
						
					
						
					
				} else  {
							
					//tipotamaniocontrol.setsDetalleGeneralEntityReporte(tipotamaniocontrol.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipotamaniocontrolbeans.add(tipotamaniocontrolbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipotamaniocontrols;
    }
	//PARA REPORTES FIN
}
