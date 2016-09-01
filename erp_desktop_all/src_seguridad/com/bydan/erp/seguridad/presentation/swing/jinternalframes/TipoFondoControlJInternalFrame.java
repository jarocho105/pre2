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
import com.bydan.erp.seguridad.util.TipoFondoControlConstantesFunciones;

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
public class TipoFondoControlJInternalFrame extends TipoFondoControlBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFondoControl;
	
	protected JMenuBar jmenuBarTipoFondoControl;
	
	protected JMenu jmenuTipoFondoControl;
	protected JMenu jmenuDatosTipoFondoControl;
	protected JMenu jmenuArchivoTipoFondoControl;
	protected JMenu jmenuAccionesTipoFondoControl;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFondoControl;	
	protected GridBagConstraints gridBagConstraintsTipoFondoControl;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFondoControlDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFondoControl;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFondoControl;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFondoControl;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFondoControlSessionBean tipofondocontrolSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFondoControl> tipofondocontrols;		
	public List<TipoFondoControl> tipofondocontrolsEliminados;	
	public List<TipoFondoControl> tipofondocontrolsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFondoControl;		
	protected JButton jButtonAbrirOrderByTipoFondoControl;
	
	
	//protected JPanel jPanelOrderByTipoFondoControl;
	//public JScrollPane jScrollPanelOrderByTipoFondoControl;	
	//protected JButton jButtonCerrarOrderByTipoFondoControl;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFondoControlLogic tipofondocontrolLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFondoControl;
	public JScrollPane jScrollPanelDatosEdicionTipoFondoControl;
	public JScrollPane jScrollPanelDatosGeneralTipoFondoControl;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFondoControlOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFondoControl;
	//public JScrollPane jScrollPanelImportacionTipoFondoControl;
	
	
	
	protected JPanel jPanelAccionesTipoFondoControl;
	
    protected JPanel jPanelPaginacionTipoFondoControl;
    protected JPanel jPanelParametrosReportesTipoFondoControl;
	protected JPanel jPanelParametrosReportesAccionesTipoFondoControl;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFondoControl;
	protected JPanel jPanelParametrosAuxiliar2TipoFondoControl;
	protected JPanel jPanelParametrosAuxiliar3TipoFondoControl;
	protected JPanel jPanelParametrosAuxiliar4TipoFondoControl;
	//protected JPanel jPanelParametrosAuxiliar5TipoFondoControl;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFondoControl;
	//protected JPanel jPanelImportacionTipoFondoControl;
	
	
	public JTable jTableDatosTipoFondoControl;
	
	
	
	//public JTable jTableDatosTipoFondoControlOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFondoControl;
	protected JButton jButtonDuplicarTipoFondoControl;
	protected JButton jButtonCopiarTipoFondoControl;
	protected JButton jButtonVerFormTipoFondoControl;
	protected JButton jButtonNuevoRelacionesTipoFondoControl;
	protected JButton jButtonModificarTipoFondoControl;
	
    protected JButton jButtonGuardarCambiosTablaTipoFondoControl;
	protected JButton jButtonCerrarTipoFondoControl;
	
	
	protected JButton jButtonRecargarInformacionTipoFondoControl;
	protected JButton jButtonProcesarInformacionTipoFondoControl;
	
	
	protected JButton jButtonAnterioresTipoFondoControl;
	protected JButton jButtonSiguientesTipoFondoControl;
	protected JButton jButtonNuevoGuardarCambiosTipoFondoControl;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFondoControl;
	//protected JButton jButtonCerrarReporteDinamicoTipoFondoControl;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFondoControl;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFondoControl;
	//protected JButton jButtonGenerarImportacionTipoFondoControl;
	//protected JButton jButtonCerrarImportacionTipoFondoControl;
	//protected JFileChooser jFileChooserImportacionTipoFondoControl;
	//protected File fileImportacionTipoFondoControl;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFondoControl;
	protected JButton jButtonDuplicarToolBarTipoFondoControl;
	protected JButton jButtonNuevoRelacionesToolBarTipoFondoControl;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFondoControl;
	protected JButton jButtonCopiarToolBarTipoFondoControl;
	protected JButton jButtonVerFormToolBarTipoFondoControl;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFondoControl;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFondoControl;
	protected JButton jButtonCerrarToolBarTipoFondoControl;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFondoControl;
	protected JButton jButtonProcesarInformacionToolBarTipoFondoControl;
	protected JButton jButtonAnterioresToolBarTipoFondoControl;
	protected JButton jButtonSiguientesToolBarTipoFondoControl;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFondoControl;
	protected JButton jButtonAbrirOrderByToolBarTipoFondoControl;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFondoControl;
	protected JMenuItem jMenuItemDuplicarTipoFondoControl;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFondoControl;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFondoControl;
	protected JMenuItem jMenuItemCopiarTipoFondoControl;
	protected JMenuItem jMenuItemVerFormTipoFondoControl;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFondoControl;
	protected JMenuItem jMenuItemCerrarTipoFondoControl;
	protected JMenuItem jMenuItemDetalleCerrarTipoFondoControl;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFondoControl;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFondoControl;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFondoControl;
	protected JMenuItem jMenuItemProcesarInformacionTipoFondoControl;
	protected JMenuItem jMenuItemAnterioresTipoFondoControl;
	protected JMenuItem jMenuItemSiguientesTipoFondoControl;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFondoControl;
	protected JMenuItem jMenuItemAbrirOrderByTipoFondoControl;
	protected JMenuItem jMenuItemMostrarOcultarTipoFondoControl;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFondoControl;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFondoControl;
	protected JCheckBox jCheckBoxSeleccionadosTipoFondoControl;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFondoControl;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFondoControl;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFondoControl;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFondoControl;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFondoControl;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFondoControl;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFondoControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFondoControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFondoControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFondoControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFondoControl;
	protected JTextField jTextFieldValorCampoGeneralTipoFondoControl;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFondoControl;
	//public JList<Reporte> jListColumnasSelectReporteTipoFondoControl;
	//public JScrollPane jScrollColumnasSelectReporteTipoFondoControl;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFondoControl;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFondoControl;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFondoControl;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFondoControl;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFondoControl;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFondoControl;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFondoControl;
	
		
	//public JLabel jLabelArchivoImportacionTipoFondoControl;	
	//public JLabel jLabelPathArchivoImportacionTipoFondoControl;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFondoControl;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFondoControl;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFondoControl;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFondoControl;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFondoControl;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFondoControl;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFondoControl;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFondoControl;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFondoControl;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFondoControl;	
	
	
	
	
	
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
	public TipoFondoControlJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoControlJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoControlJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoControlJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFondoControl)	{
		this.jButtonRecargarInformacionTipoFondoControl = jButtonRecargarInformacionTipoFondoControl;
	}
	
	public JButton getjButtonProcesarInformacionTipoFondoControl() {
		return this.jButtonProcesarInformacionTipoFondoControl;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFondoControl)	{
		this.jButtonProcesarInformacionTipoFondoControl = jButtonProcesarInformacionTipoFondoControl;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFondoControl() {
		return this.jButtonRecargarInformacionTipoFondoControl;
	}
	
	
	public List<TipoFondoControl> gettipofondocontrols() {
		return this.tipofondocontrols;
	}

	public void settipofondocontrols(List<TipoFondoControl> tipofondocontrols) {
		this.tipofondocontrols = tipofondocontrols;
	}
	
	public List<TipoFondoControl> gettipofondocontrolsAux() {
		return this.tipofondocontrolsAux;
	}

	public void settipofondocontrolsAux(List<TipoFondoControl> tipofondocontrolsAux) {
		this.tipofondocontrolsAux = tipofondocontrolsAux;
	}
	
	public List<TipoFondoControl> gettipofondocontrolsEliminados() {
		return this.tipofondocontrolsEliminados;
	}

	public void setTipoFondoControlsEliminados(List<TipoFondoControl> tipofondocontrolsEliminados) {
		this.tipofondocontrolsEliminados = tipofondocontrolsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFondoControl() {
		return jComboBoxTiposSeleccionarTipoFondoControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFondoControl(
			JComboBox jComboBoxTiposSeleccionarTipoFondoControl) {
		this.jComboBoxTiposSeleccionarTipoFondoControl = jComboBoxTiposSeleccionarTipoFondoControl;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFondoControl .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFondoControl() {
		return jTextFieldValorCampoGeneralTipoFondoControl;
	}

	public void setjTextFieldValorCampoGeneralTipoFondoControl(
			JTextField jTextFieldValorCampoGeneralTipoFondoControl) {
		this.jTextFieldValorCampoGeneralTipoFondoControl = jTextFieldValorCampoGeneralTipoFondoControl;
	}

	public void setBorderResaltarValorCampoGeneralTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFondoControl .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFondoControl() {
		return this.jCheckBoxSeleccionarTodosTipoFondoControl;
	}

	public void setjCheckBoxSeleccionarTodosTipoFondoControl(
			JCheckBox jCheckBoxSeleccionarTodosTipoFondoControl) {
		this.jCheckBoxSeleccionarTodosTipoFondoControl = jCheckBoxSeleccionarTodosTipoFondoControl;
	}

	public void setBorderResaltarSeleccionarTodosTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFondoControl .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFondoControl() {
		return this.jCheckBoxSeleccionadosTipoFondoControl;
	}

	public void setjCheckBoxSeleccionadosTipoFondoControl(
			JCheckBox jCheckBoxSeleccionadosTipoFondoControl) {
		this.jCheckBoxSeleccionadosTipoFondoControl = jCheckBoxSeleccionadosTipoFondoControl;
	}
	
	public void setBorderResaltarSeleccionadosTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFondoControl .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFondoControl() {
		return this.jComboBoxTiposArchivosReportesTipoFondoControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFondoControl(
			JComboBox jComboBoxTiposArchivosReportesTipoFondoControl) {
		this.jComboBoxTiposArchivosReportesTipoFondoControl = jComboBoxTiposArchivosReportesTipoFondoControl;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFondoControl .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFondoControl() {
		return this.jComboBoxTiposReportesTipoFondoControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFondoControl(
			JComboBox jComboBoxTiposReportesTipoFondoControl) {
		this.jComboBoxTiposReportesTipoFondoControl = jComboBoxTiposReportesTipoFondoControl;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFondoControl() {
	//	return jComboBoxTiposReportesDinamicoTipoFondoControl;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFondoControl(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFondoControl) {
	//	this.jComboBoxTiposReportesDinamicoTipoFondoControl = jComboBoxTiposReportesDinamicoTipoFondoControl;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFondoControl() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFondoControl;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFondoControl(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFondoControl) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFondoControl = jComboBoxTiposArchivosReportesDinamicoTipoFondoControl;
	//}
	
	public void setBorderResaltarTiposReportesTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFondoControl .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFondoControl() {
		return this.jComboBoxTiposGraficosReportesTipoFondoControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFondoControl(
			JComboBox jComboBoxTiposGraficosReportesTipoFondoControl) {
		this.jComboBoxTiposGraficosReportesTipoFondoControl = jComboBoxTiposGraficosReportesTipoFondoControl;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFondoControl .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFondoControl() {
		return this.jComboBoxTiposPaginacionTipoFondoControl;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFondoControl(
			JComboBox jComboBoxTiposPaginacionTipoFondoControl) {
		this.jComboBoxTiposPaginacionTipoFondoControl = jComboBoxTiposPaginacionTipoFondoControl;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFondoControl .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFondoControl() {
		return this.jComboBoxTiposRelacionesTipoFondoControl;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFondoControl() {
		return this.jComboBoxTiposAccionesTipoFondoControl;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFondoControl(
			JComboBox jComboBoxTiposRelacionesTipoFondoControl) {
		this.jComboBoxTiposRelacionesTipoFondoControl = jComboBoxTiposRelacionesTipoFondoControl;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFondoControl(
			JComboBox jComboBoxTiposAccionesTipoFondoControl) {
		this.jComboBoxTiposAccionesTipoFondoControl = jComboBoxTiposAccionesTipoFondoControl;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFondoControl .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFondoControl() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFondoControl .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFondoControl() {
	//	return jCheckBoxConGraficoDinamicoTipoFondoControl;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFondoControl(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFondoControl) {
	//	this.jCheckBoxConGraficoDinamicoTipoFondoControl = jCheckBoxConGraficoDinamicoTipoFondoControl;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFondoControl() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFondoControl.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFondoControl .setBorder(borderResaltar);		
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
		this.tipofondocontrolSessionBean=new TipoFondoControlSessionBean();
		
		this.tipofondocontrolSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofondocontrolSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofondocontrolSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFondoControlJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFondoControlJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFondoControlJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFondoControlJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFondoControlJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Fondo Control MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFondoControlJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFondoControl= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"nuevo","nuevo","Nuevo"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"duplicar","duplicar","Duplicar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"copiar","copiar","Copiar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"ver_form","ver_form","Ver"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"recargar","recargar","Recargar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFondoControl,this.jTtoolBarTipoFondoControl,
							"cerrar","cerrar","Salir"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFondoControl=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFondoControl;
			
				this.jButtonProcesarInformacionToolBarTipoFondoControl=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFondoControl;
				
		//protected JButton jButtonModificarToolBarTipoFondoControl;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFondoControl=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFondoControl=new JMenuMe("General");
		this.jmenuArchivoTipoFondoControl=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFondoControl=new JMenuMe("Acciones");
		this.jmenuDatosTipoFondoControl=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFondoControl= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFondoControl.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFondoControl,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFondoControl= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFondoControl.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFondoControl,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFondoControl= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFondoControl.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFondoControl,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFondoControl= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFondoControl.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFondoControl,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFondoControl= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFondoControl.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFondoControl,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFondoControl= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFondoControl.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFondoControl,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFondoControl= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFondoControl.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFondoControl,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFondoControl= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFondoControl.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFondoControl,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFondoControl= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFondoControl.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFondoControl,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFondoControl= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFondoControl.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFondoControl,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFondoControl= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFondoControl.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFondoControl,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFondoControl= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFondoControl.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFondoControl,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFondoControl= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFondoControl.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFondoControl,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFondoControl= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFondoControl.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFondoControl,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFondoControl= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFondoControl.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFondoControl,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFondoControl= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFondoControl.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFondoControl,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFondoControl= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFondoControl.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFondoControl,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFondoControl.add(this.jMenuItemCerrarTipoFondoControl);
			
			this.jmenuAccionesTipoFondoControl.add(this.jMenuItemNuevoTipoFondoControl);
			this.jmenuAccionesTipoFondoControl.add(this.jMenuItemNuevoGuardarCambiosTipoFondoControl);
			this.jmenuAccionesTipoFondoControl.add(this.jMenuItemNuevoRelacionesTipoFondoControl);
			this.jmenuAccionesTipoFondoControl.add(this.jMenuItemGuardarCambiosTablaTipoFondoControl);		
			this.jmenuAccionesTipoFondoControl.add(this.jMenuItemDuplicarTipoFondoControl);		
			this.jmenuAccionesTipoFondoControl.add(this.jMenuItemCopiarTipoFondoControl);		
			this.jmenuAccionesTipoFondoControl.add(this.jMenuItemVerFormTipoFondoControl);		
			
			this.jmenuDatosTipoFondoControl.add(this.jMenuItemRecargarInformacionTipoFondoControl);				
			this.jmenuDatosTipoFondoControl.add(this.jMenuItemAnterioresTipoFondoControl);				
			this.jmenuDatosTipoFondoControl.add(this.jMenuItemSiguientesTipoFondoControl);				
			this.jmenuDatosTipoFondoControl.add(this.jMenuItemAbrirOrderByTipoFondoControl);				
			this.jmenuDatosTipoFondoControl.add(this.jMenuItemMostrarOcultarTipoFondoControl);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFondoControl.add(this.jMenuItemGuardarCambiosTipoFondoControl);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFondoControl.add(this.jmenuArchivoTipoFondoControl);		
			this.jmenuBarTipoFondoControl.add(this.jmenuAccionesTipoFondoControl);		
			this.jmenuBarTipoFondoControl.add(this.jmenuDatosTipoFondoControl);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFondoControl);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFondoControl() {
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
			//this.jInternalFrameDetalleTipoFondoControl = new TipoFondoControlDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Fondo Control DATOS");
			this.jInternalFrameDetalleFormTipoFondoControl = new TipoFondoControlDetalleFormJInternalFrame(jDesktopPane,this.tipofondocontrolSessionBean.getConGuardarRelaciones(),this.tipofondocontrolSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFondoControl = null;//new TipoFondoControlDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFondoControl= new GridBagLayout();
		
		
		this.jTableDatosTipoFondoControl = new JTableMe();      
		
		String sToolTipTipoFondoControl="";
		sToolTipTipoFondoControl=TipoFondoControlConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFondoControl+="(Seguridad.TipoFondoControl)";
		}
		
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFondoControl+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFondoControl.setToolTipText(sToolTipTipoFondoControl);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFondoControl);
		this.jTableDatosTipoFondoControl.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFondoControl.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFondoControl.setRowSelectionAllowed(true);
		this.jTableDatosTipoFondoControl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFondoControl,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFondoControl = new JButtonMe();
		this.jButtonDuplicarTipoFondoControl = new JButtonMe();
		this.jButtonCopiarTipoFondoControl = new JButtonMe();
		this.jButtonVerFormTipoFondoControl = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFondoControl = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFondoControl = new JButtonMe();
		this.jButtonCerrarTipoFondoControl = new JButtonMe();
		
		this.jScrollPanelDatosTipoFondoControl = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFondoControl = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Fondo Control";
		
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondo Controls" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFondoControl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFondoControl.setToolTipText("Acciones");
        this.jPanelAccionesTipoFondoControl.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFondoControl=new ReporteDinamicoJInternalFrame(TipoFondoControlConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFondoControl();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFondoControl=new ImportacionJInternalFrame(TipoFondoControlConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFondoControl();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFondoControl = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFondoControl.setText("Orden");
		this.jButtonAbrirOrderByTipoFondoControl.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFondoControl,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFondoControl=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFondoControl,false,this);
			
			//this.cargarOrderByTipoFondoControl(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFondoControl=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFondoControl,true,this);
			
			//this.cargarOrderByTipoFondoControl(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFondoControl.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFondoControl.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFondoControl.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoFondoControl.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFondoControl.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFondoControl.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFondoControl.setText("Nuevo");
		this.jButtonDuplicarTipoFondoControl.setText("Duplicar");
		this.jButtonCopiarTipoFondoControl.setText("Copiar");
		this.jButtonVerFormTipoFondoControl.setText("Ver");
		this.jButtonNuevoRelacionesTipoFondoControl.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFondoControl.setText("Guardar");
		this.jButtonCerrarTipoFondoControl.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFondoControl,"nuevo_button","Nuevo",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFondoControl,"duplicar_button","Duplicar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFondoControl,"copiar_button","Copiar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFondoControl,"ver_form","Ver",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFondoControl,"nuevorelaciones_button","Nuevo Rel",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFondoControl,"guardarcambiostabla_button","Guardar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFondoControl,"cerrar_button","Salir",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFondoControl.setToolTipText("Nuevo"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFondoControl.setToolTipText("Duplicar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFondoControl.setToolTipText("Copiar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFondoControl.setToolTipText("Ver"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFondoControl.setToolTipText("Nuevo Rel"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFondoControl.setToolTipText("Guardar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFondoControl.setToolTipText("Salir"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFondoControl";
		inputMap = this.jButtonNuevoTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFondoControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFondoControl"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFondoControl";
		inputMap = this.jButtonDuplicarTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFondoControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFondoControl"));
		
		//COPIAR
		sMapKey = "CopiarTipoFondoControl";
		inputMap = this.jButtonCopiarTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFondoControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFondoControl"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFondoControl";
		inputMap = this.jButtonVerFormTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFondoControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFondoControl"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFondoControl";
		inputMap = this.jButtonNuevoRelacionesTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFondoControl"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFondoControl";
		inputMap = this.jButtonModificarTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFondoControl"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFondoControl";
		inputMap = this.jButtonCerrarTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFondoControl"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFondoControl";
		inputMap = this.jButtonGuardarCambiosTablaTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFondoControl"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFondoControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFondoControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFondoControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFondoControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFondoControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFondoControl.setName("jPanelParametrosReportesTipoFondoControl"); 
		
		this.jPanelParametrosReportesAccionesTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFondoControl.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFondoControl.setName("jPanelParametrosReportesAccionesTipoFondoControl"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFondoControl = new JButtonMe();
		this.jButtonRecargarInformacionTipoFondoControl.setText("Recargar");
		this.jButtonRecargarInformacionTipoFondoControl.setToolTipText("Recargar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFondoControl,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFondoControl = new JButtonMe();
		this.jButtonProcesarInformacionTipoFondoControl.setText("Procesar");
		this.jButtonProcesarInformacionTipoFondoControl.setToolTipText("Procesar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFondoControl.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFondoControl.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFondoControl.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFondoControl.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFondoControl.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFondoControl.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFondoControl.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFondoControl.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFondoControl.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFondoControl.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFondoControl.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFondoControl.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFondoControl.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFondoControl.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFondoControl.setText("Accion");
		this.jComboBoxTiposAccionesTipoFondoControl.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFondoControl.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFondoControl.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFondoControl=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFondoControl.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFondoControl.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFondoControl.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFondoControl = new JLabelMe();
		
		this.jLabelAccionesTipoFondoControl.setText("Acciones");		
		this.jLabelAccionesTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFondoControl = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFondoControl.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFondoControl.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFondoControl = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFondoControl.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFondoControl.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFondoControl = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFondoControl.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFondoControl.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFondoControl = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFondoControl.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFondoControl.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFondoControl = new JButtonMe();
		//this.jButtonAnterioresTipoFondoControl.setText("<<");
        this.jButtonAnterioresTipoFondoControl.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFondoControl,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFondoControl = new JButtonMe();
		//this.jButtonSiguientesTipoFondoControl.setText(">>");
        this.jButtonSiguientesTipoFondoControl.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFondoControl,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFondoControl = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFondoControl.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFondoControl.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFondoControl,"nuevoguardarcambios_button","Nue",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFondoControl";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFondoControl"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFondoControl";
		inputMap = this.jButtonRecargarInformacionTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFondoControl"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFondoControl";
		inputMap = this.jButtonSiguientesTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFondoControl"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFondoControl";
		inputMap = this.jButtonAnterioresTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFondoControl"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFondoControl();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFondoControl.setMinimumSize(new Dimension(this.getWidth(),TipoFondoControlBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFondoControlBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFondoControl.setMaximumSize(new Dimension(this.getWidth(),TipoFondoControlBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFondoControlBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFondoControl.setPreferredSize(new Dimension(this.getWidth(),TipoFondoControlBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFondoControlBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFondoControl = new GridBagLayout();

			this.jPanelPaginacionTipoFondoControl.setLayout(gridaBagLayoutPaginacionTipoFondoControl);						
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = 0;
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFondoControl.add(this.jButtonAnterioresTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
					
						
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFondoControl.gridy = 0;
			
			this.jPanelPaginacionTipoFondoControl.add(this.jButtonNuevoGuardarCambiosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
						
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFondoControl.gridy = 0;
			this.jPanelPaginacionTipoFondoControl.add(this.jButtonSiguientesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = 1;
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFondoControl.add(this.jButtonNuevoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
						
			
			
			if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
				this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFondoControl.gridy = 1;
				this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFondoControl.add(this.jButtonGuardarCambiosTablaTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			}
			
			
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = 1;
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFondoControl.add(this.jButtonDuplicarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = 1;
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFondoControl.add(this.jButtonCopiarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = 1;
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFondoControl.add(this.jButtonVerFormTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = 1;
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFondoControl.add(this.jButtonCerrarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
		
		
		this.jButtonRecargarInformacionTipoFondoControl.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFondoControl.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFondoControl.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFondoControl.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFondoControl.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFondoControl.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFondoControl.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFondoControl.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFondoControl.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFondoControl.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFondoControl.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFondoControl.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFondoControl.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFondoControl.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFondoControl.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFondoControl.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFondoControl.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFondoControl.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFondoControl.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFondoControl.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFondoControl.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFondoControl.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFondoControl.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFondoControl.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFondoControl.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFondoControl.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFondoControl.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFondoControl.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFondoControl.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFondoControl.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFondoControl.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFondoControl.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFondoControl.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFondoControl.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFondoControl.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFondoControl.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFondoControl = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFondoControl = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFondoControl = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFondoControl = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFondoControl = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFondoControl = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFondoControl.setLayout(gridaBagParametrosReportesTipoFondoControl);
			this.jPanelParametrosReportesAccionesTipoFondoControl.setLayout(gridaBagParametrosReportesAccionesTipoFondoControl);
			
			
			this.jPanelParametrosAuxiliar1TipoFondoControl.setLayout(gridaBagParametrosAuxiliar1TipoFondoControl);
			this.jPanelParametrosAuxiliar2TipoFondoControl.setLayout(gridaBagParametrosAuxiliar2TipoFondoControl);
			this.jPanelParametrosAuxiliar3TipoFondoControl.setLayout(gridaBagParametrosAuxiliar3TipoFondoControl);
			this.jPanelParametrosAuxiliar4TipoFondoControl.setLayout(gridaBagParametrosAuxiliar4TipoFondoControl);
			//this.jPanelParametrosAuxiliar5TipoFondoControl.setLayout(gridaBagParametrosAuxiliar2TipoFondoControl);			
			
			
			
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFondoControl.add(this.jButtonRecargarInformacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFondoControl.add(this.jComboBoxTiposPaginacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFondoControl.add(this.jCheckBoxConAltoMaximoTablaTipoFondoControl, this.gridBagConstraintsTipoFondoControl);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFondoControl.add(this.jComboBoxTiposArchivosReportesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondoControl.add(this.jPanelParametrosAuxiliar1TipoFondoControl, this.gridBagConstraintsTipoFondoControl);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondoControl.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFondoControl.add(this.jComboBoxTiposReportesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondoControl.add(this.jPanelParametrosAuxiliar4TipoFondoControl, this.gridBagConstraintsTipoFondoControl);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondoControl.add(this.jComboBoxTiposReportesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFondoControl.add(this.jCheckBoxGenerarReporteTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondoControl.add(this.jPanelParametrosAuxiliar2TipoFondoControl, this.gridBagConstraintsTipoFondoControl);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondoControl.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFondoControl.add(this.jLabelAccionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
				this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFondoControl.add(this.jButtonAbrirOrderByTipoFondoControl, this.gridBagConstraintsTipoFondoControl);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFondoControl.add(this.jComboBoxTiposSeleccionarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);			
			
			
			/*
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondoControl.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFondoControl.add(this.jCheckBoxSeleccionarTodosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondoControl.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFondoControl.add(this.jCheckBoxSeleccionarTodosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);															
				
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFondoControl.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFondoControl.add(this.jCheckBoxSeleccionadosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFondoControl.add(this.jPanelParametrosAuxiliar3TipoFondoControl, this.gridBagConstraintsTipoFondoControl);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFondoControl.add(this.jComboBoxTiposRelacionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
				
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFondoControl.add(this.jComboBoxTiposAccionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFondoControl = new GridBagLayout();

			this.jScrollPanelDatosTipoFondoControl.setLayout(gridaBagLayoutDatosTipoFondoControl);
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = 0;
			this.gridBagConstraintsTipoFondoControl.gridx = 0;
			
			this.jScrollPanelDatosTipoFondoControl.add(this.jTableDatosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFondoControl.setViewportView(this.jTableDatosTipoFondoControl);
		this.jTableDatosTipoFondoControl.setFillsViewportHeight(true);
		this.jTableDatosTipoFondoControl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFondoControl= new GridBagLayout();
		this.jPanelAccionesTipoFondoControl.setLayout(gridaBagLayoutAccionesTipoFondoControl);
		
		
		/*	
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = 0;
		this.gridBagConstraintsTipoFondoControl.gridx = 0;
			
		this.jPanelAccionesTipoFondoControl.add(this.jButtonNuevoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFondoControl = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFondoControl);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();						
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFondoControl.gridx = 0;		
			//this.gridBagConstraintsTipoFondoControl.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFondoControl.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFondoControl.gridx = 0;		
		//this.gridBagConstraintsTipoFondoControl.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFondoControl.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFondoControl);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);								
		
		
		/*
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		*/		
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFondoControl.gridx =0;
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFondoControl.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
				
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFondoControl= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFondoControl = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFondoControl.setLayout(gridaBagLayoutBusquedasParametrosTipoFondoControl);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFondoControl=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFondoControl.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFondoControl.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFondoControl.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			
			
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
			
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFondoControl;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFondoControl() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFondoControl = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFondoControl.setName("jPanelReporteDinamicoTipoFondoControl"); 
		
		this.jPanelReporteDinamicoTipoFondoControl.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFondoControl.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFondoControl.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFondoControl.setLayout(gridaBagLayoutReporteDinamicoTipoFondoControl);
		
		
		this.jInternalFrameReporteDinamicoTipoFondoControl= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFondoControl = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFondoControl= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFondoControl.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFondoControl.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFondoControl.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFondoControl.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFondoControl.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFondoControl.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFondoControl.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFondoControl.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFondoControl.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFondoControl.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFondoControl.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondo Controls"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFondoControl = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFondoControl.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFondoControl.add(this.jLabelColumnasSelectReporteTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFondoControl = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFondoControl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFondoControl.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFondoControl.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFondoControl.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFondoControl.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFondoControl=new JScrollPane(this.jListColumnasSelectReporteTipoFondoControl);
			
			this.jScrollColumnasSelectReporteTipoFondoControl.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFondoControl.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFondoControl.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFondoControl.add(this.jListColumnasSelectReporteTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		this.jPanelReporteDinamicoTipoFondoControl.add(this.jScrollColumnasSelectReporteTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFondoControl = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFondoControl.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFondoControl = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFondoControl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFondoControl.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFondoControl.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFondoControl.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFondoControl.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFondoControl=new JScrollPane(this.jListRelacionesSelectReporteTipoFondoControl);
			
			this.jScrollRelacionesSelectReporteTipoFondoControl.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFondoControl.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFondoControl.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoFondoControl = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFondoControl = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFondoControl = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFondoControl = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFondoControl.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFondoControl.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFondoControl.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFondoControl.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondoControl = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondoControl.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondoControl.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondoControl.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFondoControl.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFondoControl = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFondoControl.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFondoControl.add(this.jLabelGenerarExcelReporteDinamicoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFondoControl = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFondoControl.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFondoControl,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFondoControl.setToolTipText("Generar EXCEL"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		//this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFondoControl.add(this.jButtonGenerarExcelReporteDinamicoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFondoControl.add(this.jComboBoxTiposReportesDinamicoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFondoControl = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFondoControl.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFondoControl.add(this.jLabelTiposArchivoReporteDinamicoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFondoControl.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFondoControl = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFondoControl.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFondoControl,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFondoControl.setToolTipText("Generar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFondoControl.add(this.jButtonGenerarReporteDinamicoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFondoControl = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFondoControl.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFondoControl,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFondoControl.setToolTipText("Cancelar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFondoControl.add(this.jButtonCerrarReporteDinamicoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFondoControl = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFondoControl= new JScrollPane(jPanelReporteDinamicoTipoFondoControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFondoControl.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFondoControl.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFondoControl.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondo Controls"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFondoControl.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFondoControl.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFondoControl.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFondoControl);
		this.jInternalFrameReporteDinamicoTipoFondoControl.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFondoControl() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFondoControl = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFondoControl.setName("jPanelImportacionTipoFondoControl"); 
		
		this.jPanelImportacionTipoFondoControl.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFondoControl.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFondoControl.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFondoControl.setLayout(gridaBagLayoutImportacionTipoFondoControl);
		
		
		this.jInternalFrameImportacionTipoFondoControl= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFondoControl= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFondoControl = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFondoControl= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFondoControl.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFondoControl.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFondoControl.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFondoControl.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFondoControl.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFondoControl.setResizable(true);
	    this.jInternalFrameImportacionTipoFondoControl.setClosable(true);
	    this.jInternalFrameImportacionTipoFondoControl.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFondoControl.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFondoControl.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFondoControl.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFondoControl.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFondoControl.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFondoControl.setResizable(true);
	    this.jInternalFrameImportacionTipoFondoControl.setClosable(true);
	    this.jInternalFrameImportacionTipoFondoControl.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFondoControl.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFondoControl.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFondoControl.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondo Controls"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFondoControl = new JLabelMe();

		this.jLabelArchivoImportacionTipoFondoControl.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFondoControl.add(this.jLabelArchivoImportacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFondoControl = new JFileChooser();		
		this.jFileChooserImportacionTipoFondoControl.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFondoControl = new JButtonMe();
		this.jButtonAbrirImportacionTipoFondoControl.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFondoControl,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFondoControl.setToolTipText("Generar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFondoControl.add(this.jButtonAbrirImportacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFondoControl = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFondoControl.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFondoControl.add(this.jLabelPathArchivoImportacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFondoControl=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFondoControl.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFondoControl.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFondoControl.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFondoControl.add(this.jTextFieldPathArchivoImportacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFondoControl = new JButtonMe();
		this.jButtonGenerarImportacionTipoFondoControl.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFondoControl,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFondoControl.setToolTipText("Generar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFondoControl.add(this.jButtonGenerarImportacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFondoControl = new JButtonMe();
		this.jButtonCerrarImportacionTipoFondoControl.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFondoControl,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFondoControl.setToolTipText("Cancelar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFondoControl.add(this.jButtonCerrarImportacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFondoControl = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFondoControl= new JScrollPane(jPanelImportacionTipoFondoControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFondoControl.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFondoControl.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFondoControl.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFondoControl);
		this.jInternalFrameImportacionTipoFondoControl.getContentPane().add(this.jScrollPanelImportacionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFondoControl(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFondoControl = new JButtonMe();
			this.jButtonAbrirOrderByTipoFondoControl.setText("Orden");
			this.jButtonAbrirOrderByTipoFondoControl.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFondoControl,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFondoControl";
			inputMap = this.jButtonAbrirOrderByTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFondoControl"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFondoControl = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFondoControl.setName("jPanelOrderByTipoFondoControl"); 
			
			this.jPanelOrderByTipoFondoControl.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFondoControl.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFondoControl.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFondoControl.setLayout(gridaBagLayoutOrderByTipoFondoControl);
			
			
			this.jTableDatosTipoFondoControlOrderBy = new JTableMe();        
			this.jTableDatosTipoFondoControlOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFondoControlOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFondoControlOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFondoControlOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFondoControlOrderBy.setViewportView(this.jTableDatosTipoFondoControlOrderBy);
			this.jTableDatosTipoFondoControlOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFondoControlOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFondoControl= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFondoControl= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFondoControl = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFondoControl= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFondoControl.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFondoControl.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFondoControl.setTitle("Orden");
			this.jInternalFrameOrderByTipoFondoControl.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFondoControl.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFondoControl.setResizable(true);
			this.jInternalFrameOrderByTipoFondoControl.setClosable(true);
			this.jInternalFrameOrderByTipoFondoControl.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFondoControl.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFondoControl.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFondoControl.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondo Controls"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFondoControl.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFondoControl.ipady =150;
				
			this.jPanelOrderByTipoFondoControl.add(jScrollPanelDatosTipoFondoControlOrderBy, this.gridBagConstraintsTipoFondoControl);//this.jTableDatosTipoFondoControlTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFondoControl = new JButtonMe();
			this.jButtonCerrarOrderByTipoFondoControl.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFondoControl,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFondoControl.setToolTipText("Cancelar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFondoControl.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFondoControl.add(this.jButtonCerrarOrderByTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFondoControl = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFondoControl= new JScrollPane(jPanelOrderByTipoFondoControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFondoControl.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFondoControl.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFondoControl.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFondoControl);
			
			this.jInternalFrameOrderByTipoFondoControl.getContentPane().add(this.jScrollPanelOrderByTipoFondoControl, this.gridBagConstraintsTipoFondoControl);			
		
		} else {
			this.jButtonAbrirOrderByTipoFondoControl = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipofondocontrolSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFondoControl.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFondoControl.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFondoControl.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFondoControl.getRowHeight();//TipoFondoControlConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFondoControlConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFondoControl.isSelected()) {
					iHeightTable=TipoFondoControlConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFondoControlConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFondoControlConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFondoControlConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFondoControl.isSelected()) {
					iHeightTable=TipoFondoControlConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFondoControlConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFondoControlConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFondoControl.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFondoControl.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFondoControl.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFondoControl.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFondoControl.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFondoControl.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFondoControl!=null && this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy()!=null) {
			//if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFondoControl.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFondoControl.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFondoControl.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFondoControl.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFondoControl.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFondoControl.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFondoControl.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipofondocontrolLogic.getTipoFondoControls().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofondocontrols.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFondoControl> TraerTipoFondoControlBeans(List<TipoFondoControl> tipofondocontrols,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFondoControl tipofondocontrol:tipofondocontrols) {
					
				if(!(TipoFondoControlConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFondoControlConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipofondocontrol.setsDetalleGeneralEntityReporte(TipoFondoControlConstantesFunciones.getTipoFondoControlDescripcion(tipofondocontrol));
										
						
					
						
					
				} else  {
							
					//tipofondocontrol.setsDetalleGeneralEntityReporte(tipofondocontrol.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipofondocontrolbeans.add(tipofondocontrolbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipofondocontrols;
    }
	//PARA REPORTES FIN
}
