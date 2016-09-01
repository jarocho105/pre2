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
import com.bydan.erp.nomina.util.TipoCalificacionEmpleadoConstantesFunciones;

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
public class TipoCalificacionEmpleadoJInternalFrame extends TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCalificacionEmpleado;
	
	protected JMenuBar jmenuBarTipoCalificacionEmpleado;
	
	protected JMenu jmenuTipoCalificacionEmpleado;
	protected JMenu jmenuDatosTipoCalificacionEmpleado;
	protected JMenu jmenuArchivoTipoCalificacionEmpleado;
	protected JMenu jmenuAccionesTipoCalificacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCalificacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsTipoCalificacionEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCalificacionEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCalificacionEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCalificacionEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCalificacionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCalificacionEmpleado> tipocalificacionempleados;		
	public List<TipoCalificacionEmpleado> tipocalificacionempleadosEliminados;	
	public List<TipoCalificacionEmpleado> tipocalificacionempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCalificacionEmpleado;		
	protected JButton jButtonAbrirOrderByTipoCalificacionEmpleado;
	
	
	//protected JPanel jPanelOrderByTipoCalificacionEmpleado;
	//public JScrollPane jScrollPanelOrderByTipoCalificacionEmpleado;	
	//protected JButton jButtonCerrarOrderByTipoCalificacionEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCalificacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionTipoCalificacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralTipoCalificacionEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCalificacionEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCalificacionEmpleado;
	//public JScrollPane jScrollPanelImportacionTipoCalificacionEmpleado;
	
	
	
	protected JPanel jPanelAccionesTipoCalificacionEmpleado;
	
    protected JPanel jPanelPaginacionTipoCalificacionEmpleado;
    protected JPanel jPanelParametrosReportesTipoCalificacionEmpleado;
	protected JPanel jPanelParametrosReportesAccionesTipoCalificacionEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCalificacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar2TipoCalificacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar3TipoCalificacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar4TipoCalificacionEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5TipoCalificacionEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCalificacionEmpleado;
	//protected JPanel jPanelImportacionTipoCalificacionEmpleado;
	
	
	public JTable jTableDatosTipoCalificacionEmpleado;
	
	
	
	//public JTable jTableDatosTipoCalificacionEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCalificacionEmpleado;
	protected JButton jButtonDuplicarTipoCalificacionEmpleado;
	protected JButton jButtonCopiarTipoCalificacionEmpleado;
	protected JButton jButtonVerFormTipoCalificacionEmpleado;
	protected JButton jButtonNuevoRelacionesTipoCalificacionEmpleado;
	protected JButton jButtonModificarTipoCalificacionEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaTipoCalificacionEmpleado;
	protected JButton jButtonCerrarTipoCalificacionEmpleado;
	
	
	protected JButton jButtonRecargarInformacionTipoCalificacionEmpleado;
	protected JButton jButtonProcesarInformacionTipoCalificacionEmpleado;
	
	
	protected JButton jButtonAnterioresTipoCalificacionEmpleado;
	protected JButton jButtonSiguientesTipoCalificacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosTipoCalificacionEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCalificacionEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoTipoCalificacionEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCalificacionEmpleado;
	//protected JButton jButtonGenerarImportacionTipoCalificacionEmpleado;
	//protected JButton jButtonCerrarImportacionTipoCalificacionEmpleado;
	//protected JFileChooser jFileChooserImportacionTipoCalificacionEmpleado;
	//protected File fileImportacionTipoCalificacionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCalificacionEmpleado;
	protected JButton jButtonDuplicarToolBarTipoCalificacionEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCalificacionEmpleado;
	protected JButton jButtonCopiarToolBarTipoCalificacionEmpleado;
	protected JButton jButtonVerFormToolBarTipoCalificacionEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCalificacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCalificacionEmpleado;
	protected JButton jButtonCerrarToolBarTipoCalificacionEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCalificacionEmpleado;
	protected JButton jButtonProcesarInformacionToolBarTipoCalificacionEmpleado;
	protected JButton jButtonAnterioresToolBarTipoCalificacionEmpleado;
	protected JButton jButtonSiguientesToolBarTipoCalificacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCalificacionEmpleado;
	protected JButton jButtonAbrirOrderByToolBarTipoCalificacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemDuplicarTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCalificacionEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemCopiarTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemVerFormTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemCerrarTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemAnterioresTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemSiguientesTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarTipoCalificacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCalificacionEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCalificacionEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosTipoCalificacionEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCalificacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCalificacionEmpleado;
	protected JTextField jTextFieldValorCampoGeneralTipoCalificacionEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCalificacionEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteTipoCalificacionEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteTipoCalificacionEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCalificacionEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCalificacionEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCalificacionEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCalificacionEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCalificacionEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCalificacionEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCalificacionEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionTipoCalificacionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionTipoCalificacionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCalificacionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCalificacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCalificacionEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCalificacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCalificacionEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCalificacionEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCalificacionEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCalificacionEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCalificacionEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCalificacionEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCalificacionEmpleado;
	
	
	
	
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
	public TipoCalificacionEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalificacionEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalificacionEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalificacionEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCalificacionEmpleado)	{
		this.jButtonRecargarInformacionTipoCalificacionEmpleado = jButtonRecargarInformacionTipoCalificacionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionTipoCalificacionEmpleado() {
		return this.jButtonProcesarInformacionTipoCalificacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCalificacionEmpleado)	{
		this.jButtonProcesarInformacionTipoCalificacionEmpleado = jButtonProcesarInformacionTipoCalificacionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCalificacionEmpleado() {
		return this.jButtonRecargarInformacionTipoCalificacionEmpleado;
	}
	
	
	public List<TipoCalificacionEmpleado> gettipocalificacionempleados() {
		return this.tipocalificacionempleados;
	}

	public void settipocalificacionempleados(List<TipoCalificacionEmpleado> tipocalificacionempleados) {
		this.tipocalificacionempleados = tipocalificacionempleados;
	}
	
	public List<TipoCalificacionEmpleado> gettipocalificacionempleadosAux() {
		return this.tipocalificacionempleadosAux;
	}

	public void settipocalificacionempleadosAux(List<TipoCalificacionEmpleado> tipocalificacionempleadosAux) {
		this.tipocalificacionempleadosAux = tipocalificacionempleadosAux;
	}
	
	public List<TipoCalificacionEmpleado> gettipocalificacionempleadosEliminados() {
		return this.tipocalificacionempleadosEliminados;
	}

	public void setTipoCalificacionEmpleadosEliminados(List<TipoCalificacionEmpleado> tipocalificacionempleadosEliminados) {
		this.tipocalificacionempleadosEliminados = tipocalificacionempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCalificacionEmpleado() {
		return jComboBoxTiposSeleccionarTipoCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposSeleccionarTipoCalificacionEmpleado) {
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado = jComboBoxTiposSeleccionarTipoCalificacionEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCalificacionEmpleado() {
		return jTextFieldValorCampoGeneralTipoCalificacionEmpleado;
	}

	public void setjTextFieldValorCampoGeneralTipoCalificacionEmpleado(
			JTextField jTextFieldValorCampoGeneralTipoCalificacionEmpleado) {
		this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado = jTextFieldValorCampoGeneralTipoCalificacionEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCalificacionEmpleado() {
		return this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosTipoCalificacionEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosTipoCalificacionEmpleado) {
		this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado = jCheckBoxSeleccionarTodosTipoCalificacionEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCalificacionEmpleado() {
		return this.jCheckBoxSeleccionadosTipoCalificacionEmpleado;
	}

	public void setjCheckBoxSeleccionadosTipoCalificacionEmpleado(
			JCheckBox jCheckBoxSeleccionadosTipoCalificacionEmpleado) {
		this.jCheckBoxSeleccionadosTipoCalificacionEmpleado = jCheckBoxSeleccionadosTipoCalificacionEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCalificacionEmpleado() {
		return this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposArchivosReportesTipoCalificacionEmpleado) {
		this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado = jComboBoxTiposArchivosReportesTipoCalificacionEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCalificacionEmpleado() {
		return this.jComboBoxTiposReportesTipoCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposReportesTipoCalificacionEmpleado) {
		this.jComboBoxTiposReportesTipoCalificacionEmpleado = jComboBoxTiposReportesTipoCalificacionEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCalificacionEmpleado() {
	//	return jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCalificacionEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado = jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado = jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCalificacionEmpleado() {
		return this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposGraficosReportesTipoCalificacionEmpleado) {
		this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado = jComboBoxTiposGraficosReportesTipoCalificacionEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCalificacionEmpleado() {
		return this.jComboBoxTiposPaginacionTipoCalificacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposPaginacionTipoCalificacionEmpleado) {
		this.jComboBoxTiposPaginacionTipoCalificacionEmpleado = jComboBoxTiposPaginacionTipoCalificacionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCalificacionEmpleado() {
		return this.jComboBoxTiposRelacionesTipoCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCalificacionEmpleado() {
		return this.jComboBoxTiposAccionesTipoCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposRelacionesTipoCalificacionEmpleado) {
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado = jComboBoxTiposRelacionesTipoCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposAccionesTipoCalificacionEmpleado) {
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado = jComboBoxTiposAccionesTipoCalificacionEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCalificacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCalificacionEmpleado() {
	//	return jCheckBoxConGraficoDinamicoTipoCalificacionEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCalificacionEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCalificacionEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoTipoCalificacionEmpleado = jCheckBoxConGraficoDinamicoTipoCalificacionEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCalificacionEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCalificacionEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCalificacionEmpleado .setBorder(borderResaltar);		
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
		this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
		
		this.tipocalificacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalificacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCalificacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Calificacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCalificacionEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"nuevo","nuevo","Nuevo"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"duplicar","duplicar","Duplicar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"copiar","copiar","Copiar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"ver_form","ver_form","Ver"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"recargar","recargar","Recargar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,
							"cerrar","cerrar","Salir"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado;
			
				this.jButtonProcesarInformacionToolBarTipoCalificacionEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCalificacionEmpleado;
				
		//protected JButton jButtonModificarToolBarTipoCalificacionEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCalificacionEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCalificacionEmpleado=new JMenuMe("General");
		this.jmenuArchivoTipoCalificacionEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCalificacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosTipoCalificacionEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCalificacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCalificacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCalificacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCalificacionEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCalificacionEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCalificacionEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCalificacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCalificacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCalificacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCalificacionEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCalificacionEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCalificacionEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCalificacionEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCalificacionEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCalificacionEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCalificacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCalificacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCalificacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCalificacionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCalificacionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCalificacionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCalificacionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCalificacionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCalificacionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCalificacionEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCalificacionEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCalificacionEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCalificacionEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCalificacionEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCalificacionEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCalificacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCalificacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCalificacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCalificacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCalificacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCalificacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCalificacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCalificacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCalificacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCalificacionEmpleado.add(this.jMenuItemCerrarTipoCalificacionEmpleado);
			
			this.jmenuAccionesTipoCalificacionEmpleado.add(this.jMenuItemNuevoTipoCalificacionEmpleado);
			this.jmenuAccionesTipoCalificacionEmpleado.add(this.jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado);
			this.jmenuAccionesTipoCalificacionEmpleado.add(this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado);
			this.jmenuAccionesTipoCalificacionEmpleado.add(this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado);		
			this.jmenuAccionesTipoCalificacionEmpleado.add(this.jMenuItemDuplicarTipoCalificacionEmpleado);		
			this.jmenuAccionesTipoCalificacionEmpleado.add(this.jMenuItemCopiarTipoCalificacionEmpleado);		
			this.jmenuAccionesTipoCalificacionEmpleado.add(this.jMenuItemVerFormTipoCalificacionEmpleado);		
			
			this.jmenuDatosTipoCalificacionEmpleado.add(this.jMenuItemRecargarInformacionTipoCalificacionEmpleado);				
			this.jmenuDatosTipoCalificacionEmpleado.add(this.jMenuItemAnterioresTipoCalificacionEmpleado);				
			this.jmenuDatosTipoCalificacionEmpleado.add(this.jMenuItemSiguientesTipoCalificacionEmpleado);				
			this.jmenuDatosTipoCalificacionEmpleado.add(this.jMenuItemAbrirOrderByTipoCalificacionEmpleado);				
			this.jmenuDatosTipoCalificacionEmpleado.add(this.jMenuItemMostrarOcultarTipoCalificacionEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCalificacionEmpleado.add(this.jMenuItemGuardarCambiosTipoCalificacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCalificacionEmpleado.add(this.jmenuArchivoTipoCalificacionEmpleado);		
			this.jmenuBarTipoCalificacionEmpleado.add(this.jmenuAccionesTipoCalificacionEmpleado);		
			this.jmenuBarTipoCalificacionEmpleado.add(this.jmenuDatosTipoCalificacionEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCalificacionEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCalificacionEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoCalificacionEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCalificacionEmpleado = new TipoCalificacionEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Calificacion Empleado DATOS");
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado = new TipoCalificacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones(),this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado = null;//new TipoCalificacionEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCalificacionEmpleado= new GridBagLayout();
		
		
		this.jTableDatosTipoCalificacionEmpleado = new JTableMe();      
		
		String sToolTipTipoCalificacionEmpleado="";
		sToolTipTipoCalificacionEmpleado=TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCalificacionEmpleado+="(Nomina.TipoCalificacionEmpleado)";
		}
		
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCalificacionEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCalificacionEmpleado.setToolTipText(sToolTipTipoCalificacionEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCalificacionEmpleado);
		this.jTableDatosTipoCalificacionEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCalificacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCalificacionEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosTipoCalificacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonDuplicarTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonCopiarTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonVerFormTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCalificacionEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonCerrarTipoCalificacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosTipoCalificacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCalificacionEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Calificacion Empleado";
		
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calificacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCalificacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCalificacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesTipoCalificacionEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado=new ReporteDinamicoJInternalFrame(TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCalificacionEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCalificacionEmpleado=new ImportacionJInternalFrame(TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCalificacionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCalificacionEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCalificacionEmpleado.setText("Orden");
		this.jButtonAbrirOrderByTipoCalificacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCalificacionEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCalificacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalificacionEmpleado,false,this);
			
			//this.cargarOrderByTipoCalificacionEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCalificacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalificacionEmpleado,true,this);
			
			//this.cargarOrderByTipoCalificacionEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCalificacionEmpleado.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCalificacionEmpleado.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCalificacionEmpleado.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCalificacionEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCalificacionEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCalificacionEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCalificacionEmpleado.setText("Nuevo");
		this.jButtonDuplicarTipoCalificacionEmpleado.setText("Duplicar");
		this.jButtonCopiarTipoCalificacionEmpleado.setText("Copiar");
		this.jButtonVerFormTipoCalificacionEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesTipoCalificacionEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.setText("Guardar");
		this.jButtonCerrarTipoCalificacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCalificacionEmpleado,"nuevo_button","Nuevo",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCalificacionEmpleado,"duplicar_button","Duplicar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCalificacionEmpleado,"copiar_button","Copiar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCalificacionEmpleado,"ver_form","Ver",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCalificacionEmpleado,"nuevorelaciones_button","Nuevo Rel",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado,"guardarcambiostabla_button","Guardar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCalificacionEmpleado,"cerrar_button","Salir",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCalificacionEmpleado.setToolTipText("Nuevo"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCalificacionEmpleado.setToolTipText("Duplicar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCalificacionEmpleado.setToolTipText("Copiar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCalificacionEmpleado.setToolTipText("Ver"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCalificacionEmpleado.setToolTipText("Nuevo Rel"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.setToolTipText("Guardar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCalificacionEmpleado.setToolTipText("Salir"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCalificacionEmpleado";
		inputMap = this.jButtonNuevoTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCalificacionEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCalificacionEmpleado";
		inputMap = this.jButtonDuplicarTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCalificacionEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarTipoCalificacionEmpleado";
		inputMap = this.jButtonCopiarTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCalificacionEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCalificacionEmpleado";
		inputMap = this.jButtonVerFormTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCalificacionEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCalificacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCalificacionEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCalificacionEmpleado";
		inputMap = this.jButtonModificarTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCalificacionEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCalificacionEmpleado";
		inputMap = this.jButtonCerrarTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCalificacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCalificacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCalificacionEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCalificacionEmpleado.setName("jPanelParametrosReportesTipoCalificacionEmpleado"); 
		
		this.jPanelParametrosReportesAccionesTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCalificacionEmpleado.setName("jPanelParametrosReportesAccionesTipoCalificacionEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionTipoCalificacionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionTipoCalificacionEmpleado.setToolTipText("Recargar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCalificacionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionTipoCalificacionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionTipoCalificacionEmpleado.setToolTipText("Procesar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCalificacionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCalificacionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCalificacionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCalificacionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCalificacionEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCalificacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesTipoCalificacionEmpleado.setText("Acciones");		
		this.jLabelAccionesTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCalificacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCalificacionEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCalificacionEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCalificacionEmpleado = new JButtonMe();
		//this.jButtonAnterioresTipoCalificacionEmpleado.setText("<<");
        this.jButtonAnterioresTipoCalificacionEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCalificacionEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCalificacionEmpleado = new JButtonMe();
		//this.jButtonSiguientesTipoCalificacionEmpleado.setText(">>");
        this.jButtonSiguientesTipoCalificacionEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCalificacionEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado,"nuevoguardarcambios_button","Nue",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCalificacionEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCalificacionEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCalificacionEmpleado";
		inputMap = this.jButtonRecargarInformacionTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCalificacionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCalificacionEmpleado";
		inputMap = this.jButtonSiguientesTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCalificacionEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCalificacionEmpleado";
		inputMap = this.jButtonAnterioresTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCalificacionEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCalificacionEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCalificacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),TipoCalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCalificacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),TipoCalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCalificacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),TipoCalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalificacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCalificacionEmpleado = new GridBagLayout();

			this.jPanelPaginacionTipoCalificacionEmpleado.setLayout(gridaBagLayoutPaginacionTipoCalificacionEmpleado);						
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonAnterioresTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
					
						
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
			
			this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
						
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
			this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonSiguientesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonNuevoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 1;
				this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonNuevoRelacionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			}
			
			
			if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 1;
				this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			}
			
			
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonDuplicarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonCopiarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonVerFormTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCalificacionEmpleado.add(this.jButtonCerrarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
		
		
		this.jButtonRecargarInformacionTipoCalificacionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCalificacionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCalificacionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCalificacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCalificacionEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCalificacionEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCalificacionEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCalificacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCalificacionEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCalificacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCalificacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCalificacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCalificacionEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCalificacionEmpleado.setLayout(gridaBagParametrosReportesTipoCalificacionEmpleado);
			this.jPanelParametrosReportesAccionesTipoCalificacionEmpleado.setLayout(gridaBagParametrosReportesAccionesTipoCalificacionEmpleado);
			
			
			this.jPanelParametrosAuxiliar1TipoCalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar1TipoCalificacionEmpleado);
			this.jPanelParametrosAuxiliar2TipoCalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar2TipoCalificacionEmpleado);
			this.jPanelParametrosAuxiliar3TipoCalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar3TipoCalificacionEmpleado);
			this.jPanelParametrosAuxiliar4TipoCalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar4TipoCalificacionEmpleado);
			//this.jPanelParametrosAuxiliar5TipoCalificacionEmpleado.setLayout(gridaBagParametrosAuxiliar2TipoCalificacionEmpleado);			
			
			
			
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jButtonRecargarInformacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalificacionEmpleado.add(this.jComboBoxTiposPaginacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalificacionEmpleado.add(this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalificacionEmpleado.add(this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jPanelParametrosAuxiliar1TipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCalificacionEmpleado.add(this.jComboBoxTiposReportesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jPanelParametrosAuxiliar4TipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jComboBoxTiposReportesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jCheckBoxGenerarReporteTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jPanelParametrosAuxiliar2TipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jLabelAccionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jButtonAbrirOrderByTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
			
			
			/*
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCalificacionEmpleado.add(this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);															
				
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCalificacionEmpleado.add(this.jCheckBoxSeleccionadosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jPanelParametrosAuxiliar3TipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jComboBoxTiposRelacionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
				
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jComboBoxTiposAccionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
	
				
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalificacionEmpleado.add(this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCalificacionEmpleado = new GridBagLayout();

			this.jScrollPanelDatosTipoCalificacionEmpleado.setLayout(gridaBagLayoutDatosTipoCalificacionEmpleado);
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
			
			this.jScrollPanelDatosTipoCalificacionEmpleado.add(this.jTableDatosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCalificacionEmpleado.setViewportView(this.jTableDatosTipoCalificacionEmpleado);
		this.jTableDatosTipoCalificacionEmpleado.setFillsViewportHeight(true);
		this.jTableDatosTipoCalificacionEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCalificacionEmpleado= new GridBagLayout();
		this.jPanelAccionesTipoCalificacionEmpleado.setLayout(gridaBagLayoutAccionesTipoCalificacionEmpleado);
		
		
		/*	
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
			
		this.jPanelAccionesTipoCalificacionEmpleado.add(this.jButtonNuevoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCalificacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCalificacionEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsTipoCalificacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;		
		//this.gridBagConstraintsTipoCalificacionEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCalificacionEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);								
		
		
		/*
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		*/		
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx =0;
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCalificacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
				
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCalificacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCalificacionEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCalificacionEmpleado.setLayout(gridaBagLayoutBusquedasParametrosTipoCalificacionEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCalificacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			
			
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
			
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCalificacionEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCalificacionEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCalificacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.setName("jPanelReporteDinamicoTipoCalificacionEmpleado"); 
		
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.setLayout(gridaBagLayoutReporteDinamicoTipoCalificacionEmpleado);
		
		
		this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCalificacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calificacion Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCalificacionEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCalificacionEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jLabelColumnasSelectReporteTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCalificacionEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCalificacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCalificacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCalificacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCalificacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCalificacionEmpleado=new JScrollPane(this.jListColumnasSelectReporteTipoCalificacionEmpleado);
			
			this.jScrollColumnasSelectReporteTipoCalificacionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCalificacionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCalificacionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jListColumnasSelectReporteTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jScrollColumnasSelectReporteTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCalificacionEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCalificacionEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jLabelRelacionesSelectReporteTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCalificacionEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCalificacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCalificacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCalificacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCalificacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCalificacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCalificacionEmpleado=new JScrollPane(this.jListRelacionesSelectReporteTipoCalificacionEmpleado);
			
			this.jScrollRelacionesSelectReporteTipoCalificacionEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCalificacionEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCalificacionEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jListRelacionesSelectReporteTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jScrollRelacionesSelectReporteTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCalificacionEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCalificacionEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCalificacionEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCalificacionEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCalificacionEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jLabelGenerarExcelReporteDinamicoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleado.setToolTipText("Generar EXCEL"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jComboBoxTiposReportesDinamicoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCalificacionEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCalificacionEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jLabelTiposArchivoReporteDinamicoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCalificacionEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCalificacionEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCalificacionEmpleado.setToolTipText("Generar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jButtonGenerarReporteDinamicoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCalificacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCalificacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCalificacionEmpleado.setToolTipText("Cancelar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalificacionEmpleado.add(this.jButtonCerrarReporteDinamicoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCalificacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado= new JScrollPane(jPanelReporteDinamicoTipoCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calificacion Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCalificacionEmpleado);
		this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCalificacionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCalificacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCalificacionEmpleado.setName("jPanelImportacionTipoCalificacionEmpleado"); 
		
		this.jPanelImportacionTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCalificacionEmpleado.setLayout(gridaBagLayoutImportacionTipoCalificacionEmpleado);
		
		
		this.jInternalFrameImportacionTipoCalificacionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCalificacionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCalificacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCalificacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCalificacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCalificacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCalificacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCalificacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCalificacionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCalificacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionTipoCalificacionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calificacion Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCalificacionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionTipoCalificacionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCalificacionEmpleado.add(this.jLabelArchivoImportacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCalificacionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionTipoCalificacionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionTipoCalificacionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCalificacionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCalificacionEmpleado.setToolTipText("Generar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalificacionEmpleado.add(this.jButtonAbrirImportacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCalificacionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCalificacionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCalificacionEmpleado.add(this.jLabelPathArchivoImportacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCalificacionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCalificacionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCalificacionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCalificacionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalificacionEmpleado.add(this.jTextFieldPathArchivoImportacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionTipoCalificacionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCalificacionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCalificacionEmpleado.setToolTipText("Generar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalificacionEmpleado.add(this.jButtonGenerarImportacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionTipoCalificacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCalificacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCalificacionEmpleado.setToolTipText("Cancelar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalificacionEmpleado.add(this.jButtonCerrarImportacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCalificacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCalificacionEmpleado= new JScrollPane(jPanelImportacionTipoCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCalificacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCalificacionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCalificacionEmpleado);
		this.jInternalFrameImportacionTipoCalificacionEmpleado.getContentPane().add(this.jScrollPanelImportacionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCalificacionEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCalificacionEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByTipoCalificacionEmpleado.setText("Orden");
			this.jButtonAbrirOrderByTipoCalificacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCalificacionEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCalificacionEmpleado";
			inputMap = this.jButtonAbrirOrderByTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCalificacionEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCalificacionEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCalificacionEmpleado.setName("jPanelOrderByTipoCalificacionEmpleado"); 
			
			this.jPanelOrderByTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCalificacionEmpleado.setLayout(gridaBagLayoutOrderByTipoCalificacionEmpleado);
			
			
			this.jTableDatosTipoCalificacionEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosTipoCalificacionEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCalificacionEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCalificacionEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCalificacionEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCalificacionEmpleadoOrderBy.setViewportView(this.jTableDatosTipoCalificacionEmpleadoOrderBy);
			this.jTableDatosTipoCalificacionEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCalificacionEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCalificacionEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCalificacionEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCalificacionEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCalificacionEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setResizable(true);
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setClosable(true);
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calificacion Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCalificacionEmpleado.ipady =150;
				
			this.jPanelOrderByTipoCalificacionEmpleado.add(jScrollPanelDatosTipoCalificacionEmpleadoOrderBy, this.gridBagConstraintsTipoCalificacionEmpleado);//this.jTableDatosTipoCalificacionEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCalificacionEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByTipoCalificacionEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCalificacionEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCalificacionEmpleado.setToolTipText("Cancelar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCalificacionEmpleado.add(this.jButtonCerrarOrderByTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCalificacionEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCalificacionEmpleado= new JScrollPane(jPanelOrderByTipoCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCalificacionEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCalificacionEmpleado);
			
			this.jInternalFrameOrderByTipoCalificacionEmpleado.getContentPane().add(this.jScrollPanelOrderByTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByTipoCalificacionEmpleado = new JButtonMe();
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
			&& this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCalificacionEmpleado.getRowHeight();//TipoCalificacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado.isSelected()) {
					iHeightTable=TipoCalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCalificacionEmpleado.isSelected()) {
					iHeightTable=TipoCalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCalificacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCalificacionEmpleado!=null && this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCalificacionEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCalificacionEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCalificacionEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalificacionempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCalificacionEmpleado> TraerTipoCalificacionEmpleadoBeans(List<TipoCalificacionEmpleado> tipocalificacionempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCalificacionEmpleado tipocalificacionempleado:tipocalificacionempleados) {
					
				if(!(TipoCalificacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCalificacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocalificacionempleado.setsDetalleGeneralEntityReporte(TipoCalificacionEmpleadoConstantesFunciones.getTipoCalificacionEmpleadoDescripcion(tipocalificacionempleado));
										
						
					
					

					if(tipocalificacionempleado.getCalificacionEmpleados()!=null && Funciones.existeClass(classes,CalificacionEmpleado.class)) {
						try{tipocalificacionempleado.setcalificacionempleadosDescripcionReporte(new JRBeanCollectionDataSource(CalificacionEmpleadoJInternalFrame.TraerCalificacionEmpleadoBeans(tipocalificacionempleado.getCalificacionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocalificacionempleado.setsDetalleGeneralEntityReporte(tipocalificacionempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocalificacionempleadobeans.add(tipocalificacionempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocalificacionempleados;
    }
	//PARA REPORTES FIN
}
