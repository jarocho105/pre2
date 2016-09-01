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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.TipoInstitucionConstantesFunciones;

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
public class TipoInstitucionJInternalFrame extends TipoInstitucionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoInstitucion;
	
	protected JMenuBar jmenuBarTipoInstitucion;
	
	protected JMenu jmenuTipoInstitucion;
	protected JMenu jmenuDatosTipoInstitucion;
	protected JMenu jmenuArchivoTipoInstitucion;
	protected JMenu jmenuAccionesTipoInstitucion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInstitucion;	
	protected GridBagConstraints gridBagConstraintsTipoInstitucion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoInstitucionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoInstitucion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoInstitucion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoInstitucion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoInstitucionSessionBean tipoinstitucionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoInstitucion> tipoinstitucions;		
	public List<TipoInstitucion> tipoinstitucionsEliminados;	
	public List<TipoInstitucion> tipoinstitucionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoInstitucion;		
	protected JButton jButtonAbrirOrderByTipoInstitucion;
	
	
	//protected JPanel jPanelOrderByTipoInstitucion;
	//public JScrollPane jScrollPanelOrderByTipoInstitucion;	
	//protected JButton jButtonCerrarOrderByTipoInstitucion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoInstitucionLogic tipoinstitucionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoInstitucion;
	public JScrollPane jScrollPanelDatosEdicionTipoInstitucion;
	public JScrollPane jScrollPanelDatosGeneralTipoInstitucion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoInstitucionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoInstitucion;
	//public JScrollPane jScrollPanelImportacionTipoInstitucion;
	
	
	
	protected JPanel jPanelAccionesTipoInstitucion;
	
    protected JPanel jPanelPaginacionTipoInstitucion;
    protected JPanel jPanelParametrosReportesTipoInstitucion;
	protected JPanel jPanelParametrosReportesAccionesTipoInstitucion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoInstitucion;
	protected JPanel jPanelParametrosAuxiliar2TipoInstitucion;
	protected JPanel jPanelParametrosAuxiliar3TipoInstitucion;
	protected JPanel jPanelParametrosAuxiliar4TipoInstitucion;
	//protected JPanel jPanelParametrosAuxiliar5TipoInstitucion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoInstitucion;
	//protected JPanel jPanelImportacionTipoInstitucion;
	
	
	public JTable jTableDatosTipoInstitucion;
	
	
	
	//public JTable jTableDatosTipoInstitucionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoInstitucion;
	protected JButton jButtonDuplicarTipoInstitucion;
	protected JButton jButtonCopiarTipoInstitucion;
	protected JButton jButtonVerFormTipoInstitucion;
	protected JButton jButtonNuevoRelacionesTipoInstitucion;
	protected JButton jButtonModificarTipoInstitucion;
	
    protected JButton jButtonGuardarCambiosTablaTipoInstitucion;
	protected JButton jButtonCerrarTipoInstitucion;
	
	
	protected JButton jButtonRecargarInformacionTipoInstitucion;
	protected JButton jButtonProcesarInformacionTipoInstitucion;
	
	
	protected JButton jButtonAnterioresTipoInstitucion;
	protected JButton jButtonSiguientesTipoInstitucion;
	protected JButton jButtonNuevoGuardarCambiosTipoInstitucion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoInstitucion;
	//protected JButton jButtonCerrarReporteDinamicoTipoInstitucion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoInstitucion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoInstitucion;
	//protected JButton jButtonGenerarImportacionTipoInstitucion;
	//protected JButton jButtonCerrarImportacionTipoInstitucion;
	//protected JFileChooser jFileChooserImportacionTipoInstitucion;
	//protected File fileImportacionTipoInstitucion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInstitucion;
	protected JButton jButtonDuplicarToolBarTipoInstitucion;
	protected JButton jButtonNuevoRelacionesToolBarTipoInstitucion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoInstitucion;
	protected JButton jButtonCopiarToolBarTipoInstitucion;
	protected JButton jButtonVerFormToolBarTipoInstitucion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoInstitucion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInstitucion;
	protected JButton jButtonCerrarToolBarTipoInstitucion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoInstitucion;
	protected JButton jButtonProcesarInformacionToolBarTipoInstitucion;
	protected JButton jButtonAnterioresToolBarTipoInstitucion;
	protected JButton jButtonSiguientesToolBarTipoInstitucion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoInstitucion;
	protected JButton jButtonAbrirOrderByToolBarTipoInstitucion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInstitucion;
	protected JMenuItem jMenuItemDuplicarTipoInstitucion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoInstitucion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoInstitucion;
	protected JMenuItem jMenuItemCopiarTipoInstitucion;
	protected JMenuItem jMenuItemVerFormTipoInstitucion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInstitucion;
	protected JMenuItem jMenuItemCerrarTipoInstitucion;
	protected JMenuItem jMenuItemDetalleCerrarTipoInstitucion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoInstitucion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInstitucion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoInstitucion;
	protected JMenuItem jMenuItemProcesarInformacionTipoInstitucion;
	protected JMenuItem jMenuItemAnterioresTipoInstitucion;
	protected JMenuItem jMenuItemSiguientesTipoInstitucion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInstitucion;
	protected JMenuItem jMenuItemAbrirOrderByTipoInstitucion;
	protected JMenuItem jMenuItemMostrarOcultarTipoInstitucion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInstitucion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoInstitucion;
	protected JCheckBox jCheckBoxSeleccionadosTipoInstitucion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoInstitucion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoInstitucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoInstitucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoInstitucion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInstitucion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoInstitucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoInstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoInstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoInstitucion;
	protected JTextField jTextFieldValorCampoGeneralTipoInstitucion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoInstitucion;
	//public JList<Reporte> jListColumnasSelectReporteTipoInstitucion;
	//public JScrollPane jScrollColumnasSelectReporteTipoInstitucion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoInstitucion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoInstitucion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoInstitucion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoInstitucion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoInstitucion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoInstitucion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoInstitucion;
	
		
	//public JLabel jLabelArchivoImportacionTipoInstitucion;	
	//public JLabel jLabelPathArchivoImportacionTipoInstitucion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoInstitucion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoInstitucion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoInstitucion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoInstitucion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoInstitucion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoInstitucion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoInstitucion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoInstitucion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoInstitucion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoInstitucion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoInstitucion;
	
	
	
	
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
	public TipoInstitucionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstitucionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstitucionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstitucionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoInstitucion)	{
		this.jButtonRecargarInformacionTipoInstitucion = jButtonRecargarInformacionTipoInstitucion;
	}
	
	public JButton getjButtonProcesarInformacionTipoInstitucion() {
		return this.jButtonProcesarInformacionTipoInstitucion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInstitucion)	{
		this.jButtonProcesarInformacionTipoInstitucion = jButtonProcesarInformacionTipoInstitucion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoInstitucion() {
		return this.jButtonRecargarInformacionTipoInstitucion;
	}
	
	
	public List<TipoInstitucion> gettipoinstitucions() {
		return this.tipoinstitucions;
	}

	public void settipoinstitucions(List<TipoInstitucion> tipoinstitucions) {
		this.tipoinstitucions = tipoinstitucions;
	}
	
	public List<TipoInstitucion> gettipoinstitucionsAux() {
		return this.tipoinstitucionsAux;
	}

	public void settipoinstitucionsAux(List<TipoInstitucion> tipoinstitucionsAux) {
		this.tipoinstitucionsAux = tipoinstitucionsAux;
	}
	
	public List<TipoInstitucion> gettipoinstitucionsEliminados() {
		return this.tipoinstitucionsEliminados;
	}

	public void setTipoInstitucionsEliminados(List<TipoInstitucion> tipoinstitucionsEliminados) {
		this.tipoinstitucionsEliminados = tipoinstitucionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoInstitucion() {
		return jComboBoxTiposSeleccionarTipoInstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoInstitucion(
			JComboBox jComboBoxTiposSeleccionarTipoInstitucion) {
		this.jComboBoxTiposSeleccionarTipoInstitucion = jComboBoxTiposSeleccionarTipoInstitucion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoInstitucion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoInstitucion() {
		return jTextFieldValorCampoGeneralTipoInstitucion;
	}

	public void setjTextFieldValorCampoGeneralTipoInstitucion(
			JTextField jTextFieldValorCampoGeneralTipoInstitucion) {
		this.jTextFieldValorCampoGeneralTipoInstitucion = jTextFieldValorCampoGeneralTipoInstitucion;
	}

	public void setBorderResaltarValorCampoGeneralTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoInstitucion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoInstitucion() {
		return this.jCheckBoxSeleccionarTodosTipoInstitucion;
	}

	public void setjCheckBoxSeleccionarTodosTipoInstitucion(
			JCheckBox jCheckBoxSeleccionarTodosTipoInstitucion) {
		this.jCheckBoxSeleccionarTodosTipoInstitucion = jCheckBoxSeleccionarTodosTipoInstitucion;
	}

	public void setBorderResaltarSeleccionarTodosTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoInstitucion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoInstitucion() {
		return this.jCheckBoxSeleccionadosTipoInstitucion;
	}

	public void setjCheckBoxSeleccionadosTipoInstitucion(
			JCheckBox jCheckBoxSeleccionadosTipoInstitucion) {
		this.jCheckBoxSeleccionadosTipoInstitucion = jCheckBoxSeleccionadosTipoInstitucion;
	}
	
	public void setBorderResaltarSeleccionadosTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoInstitucion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoInstitucion() {
		return this.jComboBoxTiposArchivosReportesTipoInstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoInstitucion(
			JComboBox jComboBoxTiposArchivosReportesTipoInstitucion) {
		this.jComboBoxTiposArchivosReportesTipoInstitucion = jComboBoxTiposArchivosReportesTipoInstitucion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoInstitucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoInstitucion() {
		return this.jComboBoxTiposReportesTipoInstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoInstitucion(
			JComboBox jComboBoxTiposReportesTipoInstitucion) {
		this.jComboBoxTiposReportesTipoInstitucion = jComboBoxTiposReportesTipoInstitucion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoInstitucion() {
	//	return jComboBoxTiposReportesDinamicoTipoInstitucion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoInstitucion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoInstitucion) {
	//	this.jComboBoxTiposReportesDinamicoTipoInstitucion = jComboBoxTiposReportesDinamicoTipoInstitucion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoInstitucion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoInstitucion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoInstitucion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInstitucion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoInstitucion = jComboBoxTiposArchivosReportesDinamicoTipoInstitucion;
	//}
	
	public void setBorderResaltarTiposReportesTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoInstitucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoInstitucion() {
		return this.jComboBoxTiposGraficosReportesTipoInstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoInstitucion(
			JComboBox jComboBoxTiposGraficosReportesTipoInstitucion) {
		this.jComboBoxTiposGraficosReportesTipoInstitucion = jComboBoxTiposGraficosReportesTipoInstitucion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoInstitucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoInstitucion() {
		return this.jComboBoxTiposPaginacionTipoInstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoInstitucion(
			JComboBox jComboBoxTiposPaginacionTipoInstitucion) {
		this.jComboBoxTiposPaginacionTipoInstitucion = jComboBoxTiposPaginacionTipoInstitucion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoInstitucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoInstitucion() {
		return this.jComboBoxTiposRelacionesTipoInstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInstitucion() {
		return this.jComboBoxTiposAccionesTipoInstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInstitucion(
			JComboBox jComboBoxTiposRelacionesTipoInstitucion) {
		this.jComboBoxTiposRelacionesTipoInstitucion = jComboBoxTiposRelacionesTipoInstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInstitucion(
			JComboBox jComboBoxTiposAccionesTipoInstitucion) {
		this.jComboBoxTiposAccionesTipoInstitucion = jComboBoxTiposAccionesTipoInstitucion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoInstitucion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoInstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoInstitucion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoInstitucion() {
	//	return jCheckBoxConGraficoDinamicoTipoInstitucion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoInstitucion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoInstitucion) {
	//	this.jCheckBoxConGraficoDinamicoTipoInstitucion = jCheckBoxConGraficoDinamicoTipoInstitucion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoInstitucion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoInstitucion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoInstitucion .setBorder(borderResaltar);		
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
		this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
		
		this.tipoinstitucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinstitucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoinstitucionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoInstitucionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoInstitucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInstitucionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInstitucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInstitucionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Institucion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoInstitucionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoInstitucion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"nuevo","nuevo","Nuevo"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"duplicar","duplicar","Duplicar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"copiar","copiar","Copiar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"ver_form","ver_form","Ver"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"recargar","recargar","Recargar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoInstitucion,this.jTtoolBarTipoInstitucion,
							"cerrar","cerrar","Salir"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoInstitucion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoInstitucion;
			
				this.jButtonProcesarInformacionToolBarTipoInstitucion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoInstitucion;
				
		//protected JButton jButtonModificarToolBarTipoInstitucion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoInstitucion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoInstitucion=new JMenuMe("General");
		this.jmenuArchivoTipoInstitucion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoInstitucion=new JMenuMe("Acciones");
		this.jmenuDatosTipoInstitucion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInstitucion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInstitucion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInstitucion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoInstitucion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoInstitucion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoInstitucion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoInstitucion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoInstitucion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoInstitucion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoInstitucion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInstitucion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInstitucion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoInstitucion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoInstitucion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoInstitucion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoInstitucion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoInstitucion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoInstitucion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoInstitucion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoInstitucion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoInstitucion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInstitucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInstitucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInstitucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoInstitucion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoInstitucion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoInstitucion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoInstitucion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoInstitucion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoInstitucion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoInstitucion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoInstitucion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoInstitucion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoInstitucion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoInstitucion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoInstitucion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoInstitucion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoInstitucion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoInstitucion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInstitucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInstitucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInstitucion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoInstitucion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoInstitucion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoInstitucion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInstitucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInstitucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInstitucion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoInstitucion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoInstitucion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoInstitucion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoInstitucion.add(this.jMenuItemCerrarTipoInstitucion);
			
			this.jmenuAccionesTipoInstitucion.add(this.jMenuItemNuevoTipoInstitucion);
			this.jmenuAccionesTipoInstitucion.add(this.jMenuItemNuevoGuardarCambiosTipoInstitucion);
			this.jmenuAccionesTipoInstitucion.add(this.jMenuItemNuevoRelacionesTipoInstitucion);
			this.jmenuAccionesTipoInstitucion.add(this.jMenuItemGuardarCambiosTablaTipoInstitucion);		
			this.jmenuAccionesTipoInstitucion.add(this.jMenuItemDuplicarTipoInstitucion);		
			this.jmenuAccionesTipoInstitucion.add(this.jMenuItemCopiarTipoInstitucion);		
			this.jmenuAccionesTipoInstitucion.add(this.jMenuItemVerFormTipoInstitucion);		
			
			this.jmenuDatosTipoInstitucion.add(this.jMenuItemRecargarInformacionTipoInstitucion);				
			this.jmenuDatosTipoInstitucion.add(this.jMenuItemAnterioresTipoInstitucion);				
			this.jmenuDatosTipoInstitucion.add(this.jMenuItemSiguientesTipoInstitucion);				
			this.jmenuDatosTipoInstitucion.add(this.jMenuItemAbrirOrderByTipoInstitucion);				
			this.jmenuDatosTipoInstitucion.add(this.jMenuItemMostrarOcultarTipoInstitucion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoInstitucion.add(this.jMenuItemGuardarCambiosTipoInstitucion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoInstitucion.add(this.jmenuArchivoTipoInstitucion);		
			this.jmenuBarTipoInstitucion.add(this.jmenuAccionesTipoInstitucion);		
			this.jmenuBarTipoInstitucion.add(this.jmenuDatosTipoInstitucion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoInstitucion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoInstitucion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoInstitucion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoInstitucion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoInstitucion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoInstitucion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoInstitucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoInstitucion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoInstitucion = new TipoInstitucionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Institucion DATOS");
			this.jInternalFrameDetalleFormTipoInstitucion = new TipoInstitucionDetalleFormJInternalFrame(jDesktopPane,this.tipoinstitucionSessionBean.getConGuardarRelaciones(),this.tipoinstitucionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoInstitucion = null;//new TipoInstitucionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInstitucion= new GridBagLayout();
		
		
		this.jTableDatosTipoInstitucion = new JTableMe();      
		
		String sToolTipTipoInstitucion="";
		sToolTipTipoInstitucion=TipoInstitucionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInstitucion+="(Nomina.TipoInstitucion)";
		}
		
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInstitucion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoInstitucion.setToolTipText(sToolTipTipoInstitucion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoInstitucion);
		this.jTableDatosTipoInstitucion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoInstitucion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoInstitucion.setRowSelectionAllowed(true);
		this.jTableDatosTipoInstitucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoInstitucion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoInstitucion = new JButtonMe();
		this.jButtonDuplicarTipoInstitucion = new JButtonMe();
		this.jButtonCopiarTipoInstitucion = new JButtonMe();
		this.jButtonVerFormTipoInstitucion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoInstitucion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoInstitucion = new JButtonMe();
		this.jButtonCerrarTipoInstitucion = new JButtonMe();
		
		this.jScrollPanelDatosTipoInstitucion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoInstitucion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Institucion";
		
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instituciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInstitucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInstitucion.setToolTipText("Acciones");
        this.jPanelAccionesTipoInstitucion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoInstitucion=new ReporteDinamicoJInternalFrame(TipoInstitucionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoInstitucion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoInstitucion=new ImportacionJInternalFrame(TipoInstitucionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoInstitucion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoInstitucion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoInstitucion.setText("Orden");
		this.jButtonAbrirOrderByTipoInstitucion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInstitucion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInstitucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInstitucion,false,this);
			
			//this.cargarOrderByTipoInstitucion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInstitucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInstitucion,true,this);
			
			//this.cargarOrderByTipoInstitucion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoInstitucion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInstitucion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInstitucion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoInstitucion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInstitucion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInstitucion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoInstitucion.setText("Nuevo");
		this.jButtonDuplicarTipoInstitucion.setText("Duplicar");
		this.jButtonCopiarTipoInstitucion.setText("Copiar");
		this.jButtonVerFormTipoInstitucion.setText("Ver");
		this.jButtonNuevoRelacionesTipoInstitucion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoInstitucion.setText("Guardar");
		this.jButtonCerrarTipoInstitucion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInstitucion,"nuevo_button","Nuevo",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoInstitucion,"duplicar_button","Duplicar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoInstitucion,"copiar_button","Copiar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoInstitucion,"ver_form","Ver",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoInstitucion,"nuevorelaciones_button","Nuevo Rel",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInstitucion,"guardarcambiostabla_button","Guardar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInstitucion,"cerrar_button","Salir",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoInstitucion.setToolTipText("Nuevo"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoInstitucion.setToolTipText("Duplicar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoInstitucion.setToolTipText("Copiar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoInstitucion.setToolTipText("Ver"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoInstitucion.setToolTipText("Nuevo Rel"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoInstitucion.setToolTipText("Guardar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInstitucion.setToolTipText("Salir"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInstitucion";
		inputMap = this.jButtonNuevoTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInstitucion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoInstitucion";
		inputMap = this.jButtonDuplicarTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoInstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoInstitucion"));
		
		//COPIAR
		sMapKey = "CopiarTipoInstitucion";
		inputMap = this.jButtonCopiarTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoInstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoInstitucion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoInstitucion";
		inputMap = this.jButtonVerFormTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoInstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoInstitucion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoInstitucion";
		inputMap = this.jButtonNuevoRelacionesTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoInstitucion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoInstitucion";
		inputMap = this.jButtonModificarTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoInstitucion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoInstitucion";
		inputMap = this.jButtonCerrarTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInstitucion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInstitucion";
		inputMap = this.jButtonGuardarCambiosTablaTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInstitucion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoInstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoInstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoInstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoInstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoInstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoInstitucion.setName("jPanelParametrosReportesTipoInstitucion"); 
		
		this.jPanelParametrosReportesAccionesTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoInstitucion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoInstitucion.setName("jPanelParametrosReportesAccionesTipoInstitucion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoInstitucion = new JButtonMe();
		this.jButtonRecargarInformacionTipoInstitucion.setText("Recargar");
		this.jButtonRecargarInformacionTipoInstitucion.setToolTipText("Recargar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoInstitucion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoInstitucion = new JButtonMe();
		this.jButtonProcesarInformacionTipoInstitucion.setText("Procesar");
		this.jButtonProcesarInformacionTipoInstitucion.setToolTipText("Procesar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoInstitucion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoInstitucion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInstitucion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInstitucion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInstitucion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoInstitucion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInstitucion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoInstitucion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInstitucion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoInstitucion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoInstitucion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoInstitucion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoInstitucion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoInstitucion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInstitucion.setText("Accion");
		this.jComboBoxTiposAccionesTipoInstitucion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoInstitucion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoInstitucion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoInstitucion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoInstitucion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInstitucion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInstitucion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoInstitucion = new JLabelMe();
		
		this.jLabelAccionesTipoInstitucion.setText("Acciones");		
		this.jLabelAccionesTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoInstitucion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoInstitucion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoInstitucion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoInstitucion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoInstitucion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoInstitucion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoInstitucion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoInstitucion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoInstitucion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoInstitucion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoInstitucion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoInstitucion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoInstitucion = new JButtonMe();
		//this.jButtonAnterioresTipoInstitucion.setText("<<");
        this.jButtonAnterioresTipoInstitucion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoInstitucion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoInstitucion = new JButtonMe();
		//this.jButtonSiguientesTipoInstitucion.setText(">>");
        this.jButtonSiguientesTipoInstitucion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoInstitucion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoInstitucion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoInstitucion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoInstitucion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoInstitucion,"nuevoguardarcambios_button","Nue",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoInstitucion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoInstitucion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoInstitucion";
		inputMap = this.jButtonRecargarInformacionTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoInstitucion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoInstitucion";
		inputMap = this.jButtonSiguientesTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoInstitucion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoInstitucion";
		inputMap = this.jButtonAnterioresTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoInstitucion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoInstitucion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoInstitucion.setMinimumSize(new Dimension(this.getWidth(),TipoInstitucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInstitucionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInstitucion.setMaximumSize(new Dimension(this.getWidth(),TipoInstitucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInstitucionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInstitucion.setPreferredSize(new Dimension(this.getWidth(),TipoInstitucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInstitucionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoInstitucion = new GridBagLayout();

			this.jPanelPaginacionTipoInstitucion.setLayout(gridaBagLayoutPaginacionTipoInstitucion);						
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = 0;
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoInstitucion.add(this.jButtonAnterioresTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
					
						
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInstitucion.gridy = 0;
			
			this.jPanelPaginacionTipoInstitucion.add(this.jButtonNuevoGuardarCambiosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
						
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInstitucion.gridy = 0;
			this.jPanelPaginacionTipoInstitucion.add(this.jButtonSiguientesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = 1;
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInstitucion.add(this.jButtonNuevoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
				this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInstitucion.gridy = 1;
				this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoInstitucion.add(this.jButtonNuevoRelacionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			}
			
			
			if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
				this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInstitucion.gridy = 1;
				this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoInstitucion.add(this.jButtonGuardarCambiosTablaTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			}
			
			
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = 1;
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInstitucion.add(this.jButtonDuplicarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = 1;
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInstitucion.add(this.jButtonCopiarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = 1;
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInstitucion.add(this.jButtonVerFormTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = 1;
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoInstitucion.add(this.jButtonCerrarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
		
		
		this.jButtonRecargarInformacionTipoInstitucion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInstitucion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInstitucion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoInstitucion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInstitucion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInstitucion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoInstitucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInstitucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInstitucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoInstitucion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInstitucion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInstitucion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoInstitucion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInstitucion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInstitucion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoInstitucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInstitucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInstitucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoInstitucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInstitucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInstitucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoInstitucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInstitucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInstitucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoInstitucion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInstitucion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInstitucion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoInstitucion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInstitucion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInstitucion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoInstitucion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInstitucion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInstitucion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoInstitucion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInstitucion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInstitucion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoInstitucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoInstitucion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoInstitucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoInstitucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoInstitucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoInstitucion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoInstitucion.setLayout(gridaBagParametrosReportesTipoInstitucion);
			this.jPanelParametrosReportesAccionesTipoInstitucion.setLayout(gridaBagParametrosReportesAccionesTipoInstitucion);
			
			
			this.jPanelParametrosAuxiliar1TipoInstitucion.setLayout(gridaBagParametrosAuxiliar1TipoInstitucion);
			this.jPanelParametrosAuxiliar2TipoInstitucion.setLayout(gridaBagParametrosAuxiliar2TipoInstitucion);
			this.jPanelParametrosAuxiliar3TipoInstitucion.setLayout(gridaBagParametrosAuxiliar3TipoInstitucion);
			this.jPanelParametrosAuxiliar4TipoInstitucion.setLayout(gridaBagParametrosAuxiliar4TipoInstitucion);
			//this.jPanelParametrosAuxiliar5TipoInstitucion.setLayout(gridaBagParametrosAuxiliar2TipoInstitucion);			
			
			
			
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInstitucion.add(this.jButtonRecargarInformacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInstitucion.add(this.jComboBoxTiposPaginacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInstitucion.add(this.jCheckBoxConAltoMaximoTablaTipoInstitucion, this.gridBagConstraintsTipoInstitucion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInstitucion.add(this.jComboBoxTiposArchivosReportesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstitucion.add(this.jPanelParametrosAuxiliar1TipoInstitucion, this.gridBagConstraintsTipoInstitucion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstitucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoInstitucion.add(this.jComboBoxTiposReportesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstitucion.add(this.jPanelParametrosAuxiliar4TipoInstitucion, this.gridBagConstraintsTipoInstitucion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstitucion.add(this.jComboBoxTiposReportesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInstitucion.add(this.jCheckBoxGenerarReporteTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstitucion.add(this.jPanelParametrosAuxiliar2TipoInstitucion, this.gridBagConstraintsTipoInstitucion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstitucion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInstitucion.add(this.jLabelAccionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
				this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoInstitucion.add(this.jButtonAbrirOrderByTipoInstitucion, this.gridBagConstraintsTipoInstitucion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInstitucion.add(this.jComboBoxTiposSeleccionarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);			
			
			
			/*
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstitucion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInstitucion.add(this.jCheckBoxSeleccionarTodosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstitucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInstitucion.add(this.jCheckBoxSeleccionarTodosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);															
				
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInstitucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInstitucion.add(this.jCheckBoxSeleccionadosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInstitucion.add(this.jPanelParametrosAuxiliar3TipoInstitucion, this.gridBagConstraintsTipoInstitucion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInstitucion.add(this.jComboBoxTiposRelacionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
				
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInstitucion.add(this.jComboBoxTiposAccionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoInstitucion = new GridBagLayout();

			this.jScrollPanelDatosTipoInstitucion.setLayout(gridaBagLayoutDatosTipoInstitucion);
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = 0;
			this.gridBagConstraintsTipoInstitucion.gridx = 0;
			
			this.jScrollPanelDatosTipoInstitucion.add(this.jTableDatosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoInstitucion.setViewportView(this.jTableDatosTipoInstitucion);
		this.jTableDatosTipoInstitucion.setFillsViewportHeight(true);
		this.jTableDatosTipoInstitucion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoInstitucion= new GridBagLayout();
		this.jPanelAccionesTipoInstitucion.setLayout(gridaBagLayoutAccionesTipoInstitucion);
		
		
		/*	
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = 0;
		this.gridBagConstraintsTipoInstitucion.gridx = 0;
			
		this.jPanelAccionesTipoInstitucion.add(this.jButtonNuevoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInstitucion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInstitucion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();						
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInstitucion.gridx = 0;		
			//this.gridBagConstraintsTipoInstitucion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInstitucion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoInstitucion.gridx = 0;		
		//this.gridBagConstraintsTipoInstitucion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoInstitucion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoInstitucion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);								
		
		
		/*
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		*/		
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInstitucion.gridx =0;
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInstitucion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
				
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoInstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInstitucion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoInstitucion.setLayout(gridaBagLayoutBusquedasParametrosTipoInstitucion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoInstitucion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInstitucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInstitucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInstitucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			
			
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
			
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoInstitucion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoInstitucion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoInstitucion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoInstitucion.setName("jPanelReporteDinamicoTipoInstitucion"); 
		
		this.jPanelReporteDinamicoTipoInstitucion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInstitucion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInstitucion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoInstitucion.setLayout(gridaBagLayoutReporteDinamicoTipoInstitucion);
		
		
		this.jInternalFrameReporteDinamicoTipoInstitucion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoInstitucion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInstitucion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoInstitucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoInstitucion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoInstitucion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoInstitucion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoInstitucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoInstitucion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoInstitucion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoInstitucion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoInstitucion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInstitucion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInstitucion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instituciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoInstitucion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoInstitucion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jLabelColumnasSelectReporteTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoInstitucion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoInstitucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoInstitucion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoInstitucion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInstitucion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInstitucion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoInstitucion=new JScrollPane(this.jListColumnasSelectReporteTipoInstitucion);
			
			this.jScrollColumnasSelectReporteTipoInstitucion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInstitucion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInstitucion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInstitucion.add(this.jListColumnasSelectReporteTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jScrollColumnasSelectReporteTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoInstitucion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoInstitucion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jLabelRelacionesSelectReporteTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoInstitucion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoInstitucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoInstitucion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoInstitucion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInstitucion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInstitucion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoInstitucion=new JScrollPane(this.jListRelacionesSelectReporteTipoInstitucion);
			
			this.jScrollRelacionesSelectReporteTipoInstitucion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInstitucion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInstitucion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInstitucion.add(this.jListRelacionesSelectReporteTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jScrollRelacionesSelectReporteTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoInstitucion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoInstitucion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoInstitucion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoInstitucion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoInstitucion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoInstitucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInstitucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInstitucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstitucion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstitucion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstitucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstitucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInstitucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoInstitucion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoInstitucion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jLabelGenerarExcelReporteDinamicoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoInstitucion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoInstitucion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoInstitucion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoInstitucion.setToolTipText("Generar EXCEL"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoInstitucion.add(this.jButtonGenerarExcelReporteDinamicoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jComboBoxTiposReportesDinamicoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoInstitucion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoInstitucion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jLabelTiposArchivoReporteDinamicoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoInstitucion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoInstitucion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoInstitucion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoInstitucion.setToolTipText("Generar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jButtonGenerarReporteDinamicoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoInstitucion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoInstitucion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoInstitucion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoInstitucion.setToolTipText("Cancelar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInstitucion.add(this.jButtonCerrarReporteDinamicoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoInstitucion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoInstitucion= new JScrollPane(jPanelReporteDinamicoTipoInstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoInstitucion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInstitucion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInstitucion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instituciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoInstitucion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoInstitucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoInstitucion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoInstitucion);
		this.jInternalFrameReporteDinamicoTipoInstitucion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoInstitucion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoInstitucion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoInstitucion.setName("jPanelImportacionTipoInstitucion"); 
		
		this.jPanelImportacionTipoInstitucion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInstitucion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInstitucion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoInstitucion.setLayout(gridaBagLayoutImportacionTipoInstitucion);
		
		
		this.jInternalFrameImportacionTipoInstitucion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoInstitucion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoInstitucion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInstitucion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoInstitucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInstitucion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInstitucion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoInstitucion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInstitucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInstitucion.setResizable(true);
	    this.jInternalFrameImportacionTipoInstitucion.setClosable(true);
	    this.jInternalFrameImportacionTipoInstitucion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoInstitucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInstitucion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInstitucion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoInstitucion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInstitucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInstitucion.setResizable(true);
	    this.jInternalFrameImportacionTipoInstitucion.setClosable(true);
	    this.jInternalFrameImportacionTipoInstitucion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoInstitucion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInstitucion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInstitucion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instituciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoInstitucion = new JLabelMe();

		this.jLabelArchivoImportacionTipoInstitucion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInstitucion.add(this.jLabelArchivoImportacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoInstitucion = new JFileChooser();		
		this.jFileChooserImportacionTipoInstitucion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoInstitucion = new JButtonMe();
		this.jButtonAbrirImportacionTipoInstitucion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoInstitucion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoInstitucion.setToolTipText("Generar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInstitucion.add(this.jButtonAbrirImportacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoInstitucion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoInstitucion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInstitucion.add(this.jLabelPathArchivoImportacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoInstitucion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoInstitucion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInstitucion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInstitucion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInstitucion.add(this.jTextFieldPathArchivoImportacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoInstitucion = new JButtonMe();
		this.jButtonGenerarImportacionTipoInstitucion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoInstitucion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoInstitucion.setToolTipText("Generar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInstitucion.add(this.jButtonGenerarImportacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoInstitucion = new JButtonMe();
		this.jButtonCerrarImportacionTipoInstitucion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoInstitucion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoInstitucion.setToolTipText("Cancelar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInstitucion.add(this.jButtonCerrarImportacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoInstitucion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoInstitucion= new JScrollPane(jPanelImportacionTipoInstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoInstitucion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoInstitucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoInstitucion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoInstitucion);
		this.jInternalFrameImportacionTipoInstitucion.getContentPane().add(this.jScrollPanelImportacionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoInstitucion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoInstitucion = new JButtonMe();
			this.jButtonAbrirOrderByTipoInstitucion.setText("Orden");
			this.jButtonAbrirOrderByTipoInstitucion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInstitucion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoInstitucion";
			inputMap = this.jButtonAbrirOrderByTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoInstitucion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoInstitucion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoInstitucion.setName("jPanelOrderByTipoInstitucion"); 
			
			this.jPanelOrderByTipoInstitucion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInstitucion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInstitucion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoInstitucion.setLayout(gridaBagLayoutOrderByTipoInstitucion);
			
			
			this.jTableDatosTipoInstitucionOrderBy = new JTableMe();        
			this.jTableDatosTipoInstitucionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoInstitucionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoInstitucionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoInstitucionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoInstitucionOrderBy.setViewportView(this.jTableDatosTipoInstitucionOrderBy);
			this.jTableDatosTipoInstitucionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoInstitucionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoInstitucion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoInstitucion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoInstitucion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoInstitucion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoInstitucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoInstitucion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoInstitucion.setTitle("Orden");
			this.jInternalFrameOrderByTipoInstitucion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoInstitucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoInstitucion.setResizable(true);
			this.jInternalFrameOrderByTipoInstitucion.setClosable(true);
			this.jInternalFrameOrderByTipoInstitucion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoInstitucion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInstitucion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInstitucion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instituciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoInstitucion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoInstitucion.ipady =150;
				
			this.jPanelOrderByTipoInstitucion.add(jScrollPanelDatosTipoInstitucionOrderBy, this.gridBagConstraintsTipoInstitucion);//this.jTableDatosTipoInstitucionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoInstitucion = new JButtonMe();
			this.jButtonCerrarOrderByTipoInstitucion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoInstitucion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoInstitucion.setToolTipText("Cancelar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoInstitucion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoInstitucion.add(this.jButtonCerrarOrderByTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoInstitucion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoInstitucion= new JScrollPane(jPanelOrderByTipoInstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoInstitucion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoInstitucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoInstitucion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoInstitucion);
			
			this.jInternalFrameOrderByTipoInstitucion.getContentPane().add(this.jScrollPanelOrderByTipoInstitucion, this.gridBagConstraintsTipoInstitucion);			
		
		} else {
			this.jButtonAbrirOrderByTipoInstitucion = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoinstitucionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoInstitucion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoInstitucion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoInstitucion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoInstitucion.getRowHeight();//TipoInstitucionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoInstitucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInstitucion.isSelected()) {
					iHeightTable=TipoInstitucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInstitucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInstitucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoInstitucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInstitucion.isSelected()) {
					iHeightTable=TipoInstitucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInstitucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInstitucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoInstitucion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInstitucion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInstitucion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoInstitucion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInstitucion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInstitucion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoInstitucion!=null && this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoInstitucion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoInstitucion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoInstitucion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoInstitucion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInstitucion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInstitucion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoinstitucionLogic.getTipoInstitucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinstitucions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoInstitucion> TraerTipoInstitucionBeans(List<TipoInstitucion> tipoinstitucions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoInstitucion tipoinstitucion:tipoinstitucions) {
					
				if(!(TipoInstitucionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoInstitucionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoinstitucion.setsDetalleGeneralEntityReporte(TipoInstitucionConstantesFunciones.getTipoInstitucionDescripcion(tipoinstitucion));
										
						
					
					

					if(tipoinstitucion.getCursos()!=null && Funciones.existeClass(classes,Curso.class)) {
						try{tipoinstitucion.setcursosDescripcionReporte(new JRBeanCollectionDataSource(CursoJInternalFrame.TraerCursoBeans(tipoinstitucion.getCursos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoinstitucion.setsDetalleGeneralEntityReporte(tipoinstitucion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoinstitucionbeans.add(tipoinstitucionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoinstitucions;
    }
	//PARA REPORTES FIN
}
