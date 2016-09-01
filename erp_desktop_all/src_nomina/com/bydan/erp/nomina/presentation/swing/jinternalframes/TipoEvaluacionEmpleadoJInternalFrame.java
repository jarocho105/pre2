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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.TipoEvaluacionEmpleadoConstantesFunciones;

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
public class TipoEvaluacionEmpleadoJInternalFrame extends TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoEvaluacionEmpleado;
	
	protected JMenuBar jmenuBarTipoEvaluacionEmpleado;
	
	protected JMenu jmenuTipoEvaluacionEmpleado;
	protected JMenu jmenuDatosTipoEvaluacionEmpleado;
	protected JMenu jmenuArchivoTipoEvaluacionEmpleado;
	protected JMenu jmenuAccionesTipoEvaluacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEvaluacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsTipoEvaluacionEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoEvaluacionEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoEvaluacionEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoEvaluacionEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoEvaluacionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoEvaluacionEmpleado> tipoevaluacionempleados;		
	public List<TipoEvaluacionEmpleado> tipoevaluacionempleadosEliminados;	
	public List<TipoEvaluacionEmpleado> tipoevaluacionempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoEvaluacionEmpleado;		
	protected JButton jButtonAbrirOrderByTipoEvaluacionEmpleado;
	
	
	//protected JPanel jPanelOrderByTipoEvaluacionEmpleado;
	//public JScrollPane jScrollPanelOrderByTipoEvaluacionEmpleado;	
	//protected JButton jButtonCerrarOrderByTipoEvaluacionEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoEvaluacionEmpleadoLogic tipoevaluacionempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoEvaluacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionTipoEvaluacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralTipoEvaluacionEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoEvaluacionEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoEvaluacionEmpleado;
	//public JScrollPane jScrollPanelImportacionTipoEvaluacionEmpleado;
	
	
	
	protected JPanel jPanelAccionesTipoEvaluacionEmpleado;
	
    protected JPanel jPanelPaginacionTipoEvaluacionEmpleado;
    protected JPanel jPanelParametrosReportesTipoEvaluacionEmpleado;
	protected JPanel jPanelParametrosReportesAccionesTipoEvaluacionEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoEvaluacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar2TipoEvaluacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar3TipoEvaluacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar4TipoEvaluacionEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5TipoEvaluacionEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoEvaluacionEmpleado;
	//protected JPanel jPanelImportacionTipoEvaluacionEmpleado;
	
	
	public JTable jTableDatosTipoEvaluacionEmpleado;
	
	
	
	//public JTable jTableDatosTipoEvaluacionEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoEvaluacionEmpleado;
	protected JButton jButtonDuplicarTipoEvaluacionEmpleado;
	protected JButton jButtonCopiarTipoEvaluacionEmpleado;
	protected JButton jButtonVerFormTipoEvaluacionEmpleado;
	protected JButton jButtonNuevoRelacionesTipoEvaluacionEmpleado;
	protected JButton jButtonModificarTipoEvaluacionEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaTipoEvaluacionEmpleado;
	protected JButton jButtonCerrarTipoEvaluacionEmpleado;
	
	
	protected JButton jButtonRecargarInformacionTipoEvaluacionEmpleado;
	protected JButton jButtonProcesarInformacionTipoEvaluacionEmpleado;
	
	
	protected JButton jButtonAnterioresTipoEvaluacionEmpleado;
	protected JButton jButtonSiguientesTipoEvaluacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoEvaluacionEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoTipoEvaluacionEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoEvaluacionEmpleado;
	//protected JButton jButtonGenerarImportacionTipoEvaluacionEmpleado;
	//protected JButton jButtonCerrarImportacionTipoEvaluacionEmpleado;
	//protected JFileChooser jFileChooserImportacionTipoEvaluacionEmpleado;
	//protected File fileImportacionTipoEvaluacionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonDuplicarToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonCopiarToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonVerFormToolBarTipoEvaluacionEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonCerrarToolBarTipoEvaluacionEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonProcesarInformacionToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonAnterioresToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonSiguientesToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoEvaluacionEmpleado;
	protected JButton jButtonAbrirOrderByToolBarTipoEvaluacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemDuplicarTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesTipoEvaluacionEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemCopiarTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemVerFormTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemCerrarTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemAnterioresTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemSiguientesTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByTipoEvaluacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarTipoEvaluacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEvaluacionEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosTipoEvaluacionEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoEvaluacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoEvaluacionEmpleado;
	protected JTextField jTextFieldValorCampoGeneralTipoEvaluacionEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoEvaluacionEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteTipoEvaluacionEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteTipoEvaluacionEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteTipoEvaluacionEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteTipoEvaluacionEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteTipoEvaluacionEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoEvaluacionEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoEvaluacionEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoEvaluacionEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionTipoEvaluacionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionTipoEvaluacionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionTipoEvaluacionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoEvaluacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoEvaluacionEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorTipoEvaluacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoEvaluacionEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoTipoEvaluacionEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoTipoEvaluacionEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoTipoEvaluacionEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoEvaluacionEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoEvaluacionEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoEvaluacionEmpleado;
	
	
	
	
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
	public TipoEvaluacionEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEvaluacionEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEvaluacionEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEvaluacionEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoEvaluacionEmpleado)	{
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado = jButtonRecargarInformacionTipoEvaluacionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionTipoEvaluacionEmpleado() {
		return this.jButtonProcesarInformacionTipoEvaluacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEvaluacionEmpleado)	{
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado = jButtonProcesarInformacionTipoEvaluacionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoEvaluacionEmpleado() {
		return this.jButtonRecargarInformacionTipoEvaluacionEmpleado;
	}
	
	
	public List<TipoEvaluacionEmpleado> gettipoevaluacionempleados() {
		return this.tipoevaluacionempleados;
	}

	public void settipoevaluacionempleados(List<TipoEvaluacionEmpleado> tipoevaluacionempleados) {
		this.tipoevaluacionempleados = tipoevaluacionempleados;
	}
	
	public List<TipoEvaluacionEmpleado> gettipoevaluacionempleadosAux() {
		return this.tipoevaluacionempleadosAux;
	}

	public void settipoevaluacionempleadosAux(List<TipoEvaluacionEmpleado> tipoevaluacionempleadosAux) {
		this.tipoevaluacionempleadosAux = tipoevaluacionempleadosAux;
	}
	
	public List<TipoEvaluacionEmpleado> gettipoevaluacionempleadosEliminados() {
		return this.tipoevaluacionempleadosEliminados;
	}

	public void setTipoEvaluacionEmpleadosEliminados(List<TipoEvaluacionEmpleado> tipoevaluacionempleadosEliminados) {
		this.tipoevaluacionempleadosEliminados = tipoevaluacionempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoEvaluacionEmpleado() {
		return jComboBoxTiposSeleccionarTipoEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposSeleccionarTipoEvaluacionEmpleado) {
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado = jComboBoxTiposSeleccionarTipoEvaluacionEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoEvaluacionEmpleado() {
		return jTextFieldValorCampoGeneralTipoEvaluacionEmpleado;
	}

	public void setjTextFieldValorCampoGeneralTipoEvaluacionEmpleado(
			JTextField jTextFieldValorCampoGeneralTipoEvaluacionEmpleado) {
		this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado = jTextFieldValorCampoGeneralTipoEvaluacionEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoEvaluacionEmpleado() {
		return this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosTipoEvaluacionEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado) {
		this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado = jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoEvaluacionEmpleado() {
		return this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado;
	}

	public void setjCheckBoxSeleccionadosTipoEvaluacionEmpleado(
			JCheckBox jCheckBoxSeleccionadosTipoEvaluacionEmpleado) {
		this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado = jCheckBoxSeleccionadosTipoEvaluacionEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoEvaluacionEmpleado() {
		return this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado) {
		this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado = jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoEvaluacionEmpleado() {
		return this.jComboBoxTiposReportesTipoEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposReportesTipoEvaluacionEmpleado) {
		this.jComboBoxTiposReportesTipoEvaluacionEmpleado = jComboBoxTiposReportesTipoEvaluacionEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado() {
	//	return jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado = jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado = jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoEvaluacionEmpleado() {
		return this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado) {
		this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado = jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoEvaluacionEmpleado() {
		return this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposPaginacionTipoEvaluacionEmpleado) {
		this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado = jComboBoxTiposPaginacionTipoEvaluacionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoEvaluacionEmpleado() {
		return this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEvaluacionEmpleado() {
		return this.jComboBoxTiposAccionesTipoEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposRelacionesTipoEvaluacionEmpleado) {
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado = jComboBoxTiposRelacionesTipoEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEvaluacionEmpleado(
			JComboBox jComboBoxTiposAccionesTipoEvaluacionEmpleado) {
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado = jComboBoxTiposAccionesTipoEvaluacionEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado() {
	//	return jCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado = jCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoEvaluacionEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoEvaluacionEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado .setBorder(borderResaltar);		
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
		this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
		
		this.tipoevaluacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoevaluacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoEvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoEvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEvaluacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Evaluacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoEvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoEvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoEvaluacionEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"nuevo","nuevo","Nuevo"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"duplicar","duplicar","Duplicar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"copiar","copiar","Copiar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"ver_form","ver_form","Ver"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"recargar","recargar","Recargar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,
							"cerrar","cerrar","Salir"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado;
			
				this.jButtonProcesarInformacionToolBarTipoEvaluacionEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoEvaluacionEmpleado;
				
		//protected JButton jButtonModificarToolBarTipoEvaluacionEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoEvaluacionEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoEvaluacionEmpleado=new JMenuMe("General");
		this.jmenuArchivoTipoEvaluacionEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesTipoEvaluacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosTipoEvaluacionEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEvaluacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEvaluacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEvaluacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoEvaluacionEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoEvaluacionEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoEvaluacionEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoEvaluacionEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoEvaluacionEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoEvaluacionEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoEvaluacionEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoEvaluacionEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoEvaluacionEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEvaluacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEvaluacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEvaluacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoEvaluacionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoEvaluacionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoEvaluacionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoEvaluacionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoEvaluacionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoEvaluacionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoEvaluacionEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoEvaluacionEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoEvaluacionEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoEvaluacionEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoEvaluacionEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoEvaluacionEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoEvaluacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoEvaluacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoEvaluacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoEvaluacionEmpleado.add(this.jMenuItemCerrarTipoEvaluacionEmpleado);
			
			this.jmenuAccionesTipoEvaluacionEmpleado.add(this.jMenuItemNuevoTipoEvaluacionEmpleado);
			this.jmenuAccionesTipoEvaluacionEmpleado.add(this.jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado);
			this.jmenuAccionesTipoEvaluacionEmpleado.add(this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado);
			this.jmenuAccionesTipoEvaluacionEmpleado.add(this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado);		
			this.jmenuAccionesTipoEvaluacionEmpleado.add(this.jMenuItemDuplicarTipoEvaluacionEmpleado);		
			this.jmenuAccionesTipoEvaluacionEmpleado.add(this.jMenuItemCopiarTipoEvaluacionEmpleado);		
			this.jmenuAccionesTipoEvaluacionEmpleado.add(this.jMenuItemVerFormTipoEvaluacionEmpleado);		
			
			this.jmenuDatosTipoEvaluacionEmpleado.add(this.jMenuItemRecargarInformacionTipoEvaluacionEmpleado);				
			this.jmenuDatosTipoEvaluacionEmpleado.add(this.jMenuItemAnterioresTipoEvaluacionEmpleado);				
			this.jmenuDatosTipoEvaluacionEmpleado.add(this.jMenuItemSiguientesTipoEvaluacionEmpleado);				
			this.jmenuDatosTipoEvaluacionEmpleado.add(this.jMenuItemAbrirOrderByTipoEvaluacionEmpleado);				
			this.jmenuDatosTipoEvaluacionEmpleado.add(this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoEvaluacionEmpleado.add(this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoEvaluacionEmpleado.add(this.jmenuArchivoTipoEvaluacionEmpleado);		
			this.jmenuBarTipoEvaluacionEmpleado.add(this.jmenuAccionesTipoEvaluacionEmpleado);		
			this.jmenuBarTipoEvaluacionEmpleado.add(this.jmenuDatosTipoEvaluacionEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoEvaluacionEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoEvaluacionEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoEvaluacionEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoEvaluacionEmpleado = new TipoEvaluacionEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Evaluacion Empleado DATOS");
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado = new TipoEvaluacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones(),this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado = null;//new TipoEvaluacionEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEvaluacionEmpleado= new GridBagLayout();
		
		
		this.jTableDatosTipoEvaluacionEmpleado = new JTableMe();      
		
		String sToolTipTipoEvaluacionEmpleado="";
		sToolTipTipoEvaluacionEmpleado=TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEvaluacionEmpleado+="(Nomina.TipoEvaluacionEmpleado)";
		}
		
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEvaluacionEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoEvaluacionEmpleado.setToolTipText(sToolTipTipoEvaluacionEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoEvaluacionEmpleado);
		this.jTableDatosTipoEvaluacionEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosTipoEvaluacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoEvaluacionEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosTipoEvaluacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonDuplicarTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonCopiarTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonVerFormTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesTipoEvaluacionEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonCerrarTipoEvaluacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosTipoEvaluacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Evaluacion Empleado";
		
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Evaluacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEvaluacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesTipoEvaluacionEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado=new ReporteDinamicoJInternalFrame(TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoEvaluacionEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoEvaluacionEmpleado=new ImportacionJInternalFrame(TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoEvaluacionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoEvaluacionEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoEvaluacionEmpleado.setText("Orden");
		this.jButtonAbrirOrderByTipoEvaluacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEvaluacionEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEvaluacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEvaluacionEmpleado,false,this);
			
			//this.cargarOrderByTipoEvaluacionEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEvaluacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEvaluacionEmpleado,true,this);
			
			//this.cargarOrderByTipoEvaluacionEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoEvaluacionEmpleado.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEvaluacionEmpleado.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEvaluacionEmpleado.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoEvaluacionEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEvaluacionEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEvaluacionEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoEvaluacionEmpleado.setText("Nuevo");
		this.jButtonDuplicarTipoEvaluacionEmpleado.setText("Duplicar");
		this.jButtonCopiarTipoEvaluacionEmpleado.setText("Copiar");
		this.jButtonVerFormTipoEvaluacionEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.setText("Guardar");
		this.jButtonCerrarTipoEvaluacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEvaluacionEmpleado,"nuevo_button","Nuevo",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoEvaluacionEmpleado,"duplicar_button","Duplicar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoEvaluacionEmpleado,"copiar_button","Copiar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoEvaluacionEmpleado,"ver_form","Ver",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoEvaluacionEmpleado,"nuevorelaciones_button","Nuevo Rel",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado,"guardarcambiostabla_button","Guardar",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEvaluacionEmpleado,"cerrar_button","Salir",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoEvaluacionEmpleado.setToolTipText("Nuevo"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoEvaluacionEmpleado.setToolTipText("Duplicar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoEvaluacionEmpleado.setToolTipText("Copiar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoEvaluacionEmpleado.setToolTipText("Ver"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.setToolTipText("Nuevo Rel"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.setToolTipText("Guardar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEvaluacionEmpleado.setToolTipText("Salir"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEvaluacionEmpleado";
		inputMap = this.jButtonNuevoTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEvaluacionEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoEvaluacionEmpleado";
		inputMap = this.jButtonDuplicarTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoEvaluacionEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarTipoEvaluacionEmpleado";
		inputMap = this.jButtonCopiarTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoEvaluacionEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormTipoEvaluacionEmpleado";
		inputMap = this.jButtonVerFormTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoEvaluacionEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoEvaluacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoEvaluacionEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoEvaluacionEmpleado";
		inputMap = this.jButtonModificarTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoEvaluacionEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoEvaluacionEmpleado";
		inputMap = this.jButtonCerrarTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEvaluacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEvaluacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEvaluacionEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoEvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoEvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoEvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoEvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoEvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoEvaluacionEmpleado.setName("jPanelParametrosReportesTipoEvaluacionEmpleado"); 
		
		this.jPanelParametrosReportesAccionesTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoEvaluacionEmpleado.setName("jPanelParametrosReportesAccionesTipoEvaluacionEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado.setToolTipText("Recargar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoEvaluacionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado.setToolTipText("Procesar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesTipoEvaluacionEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoEvaluacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesTipoEvaluacionEmpleado.setText("Acciones");		
		this.jLabelAccionesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoEvaluacionEmpleado = new JButtonMe();
		//this.jButtonAnterioresTipoEvaluacionEmpleado.setText("<<");
        this.jButtonAnterioresTipoEvaluacionEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoEvaluacionEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoEvaluacionEmpleado = new JButtonMe();
		//this.jButtonSiguientesTipoEvaluacionEmpleado.setText(">>");
        this.jButtonSiguientesTipoEvaluacionEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoEvaluacionEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado,"nuevoguardarcambios_button","Nue",this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoEvaluacionEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoEvaluacionEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoEvaluacionEmpleado";
		inputMap = this.jButtonRecargarInformacionTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoEvaluacionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoEvaluacionEmpleado";
		inputMap = this.jButtonSiguientesTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoEvaluacionEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoEvaluacionEmpleado";
		inputMap = this.jButtonAnterioresTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoEvaluacionEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoEvaluacionEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),TipoEvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),TipoEvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),TipoEvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoEvaluacionEmpleado = new GridBagLayout();

			this.jPanelPaginacionTipoEvaluacionEmpleado.setLayout(gridaBagLayoutPaginacionTipoEvaluacionEmpleado);						
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonAnterioresTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
					
						
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
			
			this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
						
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
			this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonSiguientesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonNuevoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 1;
				this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonNuevoRelacionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			}
			
			
			if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 1;
				this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			}
			
			
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonDuplicarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonCopiarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonVerFormTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoEvaluacionEmpleado.add(this.jButtonCerrarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
		
		
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoEvaluacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoEvaluacionEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoEvaluacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoEvaluacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoEvaluacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoEvaluacionEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.setLayout(gridaBagParametrosReportesTipoEvaluacionEmpleado);
			this.jPanelParametrosReportesAccionesTipoEvaluacionEmpleado.setLayout(gridaBagParametrosReportesAccionesTipoEvaluacionEmpleado);
			
			
			this.jPanelParametrosAuxiliar1TipoEvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar1TipoEvaluacionEmpleado);
			this.jPanelParametrosAuxiliar2TipoEvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar2TipoEvaluacionEmpleado);
			this.jPanelParametrosAuxiliar3TipoEvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar3TipoEvaluacionEmpleado);
			this.jPanelParametrosAuxiliar4TipoEvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar4TipoEvaluacionEmpleado);
			//this.jPanelParametrosAuxiliar5TipoEvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar2TipoEvaluacionEmpleado);			
			
			
			
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jButtonRecargarInformacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEvaluacionEmpleado.add(this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEvaluacionEmpleado.add(this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEvaluacionEmpleado.add(this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jPanelParametrosAuxiliar1TipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoEvaluacionEmpleado.add(this.jComboBoxTiposReportesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jPanelParametrosAuxiliar4TipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jComboBoxTiposReportesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jCheckBoxGenerarReporteTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jPanelParametrosAuxiliar2TipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jLabelAccionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jButtonAbrirOrderByTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
			
			
			/*
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEvaluacionEmpleado.add(this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);															
				
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEvaluacionEmpleado.add(this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jPanelParametrosAuxiliar3TipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
				
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jComboBoxTiposAccionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
	
				
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.add(this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoEvaluacionEmpleado = new GridBagLayout();

			this.jScrollPanelDatosTipoEvaluacionEmpleado.setLayout(gridaBagLayoutDatosTipoEvaluacionEmpleado);
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
			
			this.jScrollPanelDatosTipoEvaluacionEmpleado.add(this.jTableDatosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoEvaluacionEmpleado.setViewportView(this.jTableDatosTipoEvaluacionEmpleado);
		this.jTableDatosTipoEvaluacionEmpleado.setFillsViewportHeight(true);
		this.jTableDatosTipoEvaluacionEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoEvaluacionEmpleado= new GridBagLayout();
		this.jPanelAccionesTipoEvaluacionEmpleado.setLayout(gridaBagLayoutAccionesTipoEvaluacionEmpleado);
		
		
		/*	
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
			
		this.jPanelAccionesTipoEvaluacionEmpleado.add(this.jButtonNuevoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEvaluacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEvaluacionEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsTipoEvaluacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;		
		//this.gridBagConstraintsTipoEvaluacionEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoEvaluacionEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoEvaluacionEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);								
		
		
		/*
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		*/		
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =0;
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEvaluacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
				
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoEvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEvaluacionEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoEvaluacionEmpleado.setLayout(gridaBagLayoutBusquedasParametrosTipoEvaluacionEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
			
			
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
			
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoEvaluacionEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoEvaluacionEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoEvaluacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.setName("jPanelReporteDinamicoTipoEvaluacionEmpleado"); 
		
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.setLayout(gridaBagLayoutReporteDinamicoTipoEvaluacionEmpleado);
		
		
		this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Evaluacion Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoEvaluacionEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoEvaluacionEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jLabelColumnasSelectReporteTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoEvaluacionEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoEvaluacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoEvaluacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoEvaluacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEvaluacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEvaluacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado=new JScrollPane(this.jListColumnasSelectReporteTipoEvaluacionEmpleado);
			
			this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jListColumnasSelectReporteTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoEvaluacionEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoEvaluacionEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jLabelRelacionesSelectReporteTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoEvaluacionEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoEvaluacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoEvaluacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoEvaluacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEvaluacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEvaluacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoEvaluacionEmpleado=new JScrollPane(this.jListRelacionesSelectReporteTipoEvaluacionEmpleado);
			
			this.jScrollRelacionesSelectReporteTipoEvaluacionEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEvaluacionEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEvaluacionEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jListRelacionesSelectReporteTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jScrollRelacionesSelectReporteTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoEvaluacionEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoEvaluacionEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoEvaluacionEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoEvaluacionEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoEvaluacionEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jLabelGenerarExcelReporteDinamicoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleado.setToolTipText("Generar EXCEL"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jComboBoxTiposReportesDinamicoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoEvaluacionEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoEvaluacionEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jLabelTiposArchivoReporteDinamicoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoEvaluacionEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoEvaluacionEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoEvaluacionEmpleado.setToolTipText("Generar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jButtonGenerarReporteDinamicoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoEvaluacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoEvaluacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoEvaluacionEmpleado.setToolTipText("Cancelar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEvaluacionEmpleado.add(this.jButtonCerrarReporteDinamicoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoEvaluacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado= new JScrollPane(jPanelReporteDinamicoTipoEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Evaluacion Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoEvaluacionEmpleado);
		this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoEvaluacionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoEvaluacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoEvaluacionEmpleado.setName("jPanelImportacionTipoEvaluacionEmpleado"); 
		
		this.jPanelImportacionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoEvaluacionEmpleado.setLayout(gridaBagLayoutImportacionTipoEvaluacionEmpleado);
		
		
		this.jInternalFrameImportacionTipoEvaluacionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoEvaluacionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoEvaluacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionTipoEvaluacionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Evaluacion Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoEvaluacionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionTipoEvaluacionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEvaluacionEmpleado.add(this.jLabelArchivoImportacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoEvaluacionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionTipoEvaluacionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionTipoEvaluacionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoEvaluacionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoEvaluacionEmpleado.setToolTipText("Generar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEvaluacionEmpleado.add(this.jButtonAbrirImportacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoEvaluacionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoEvaluacionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEvaluacionEmpleado.add(this.jLabelPathArchivoImportacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoEvaluacionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoEvaluacionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEvaluacionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEvaluacionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEvaluacionEmpleado.add(this.jTextFieldPathArchivoImportacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionTipoEvaluacionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoEvaluacionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoEvaluacionEmpleado.setToolTipText("Generar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEvaluacionEmpleado.add(this.jButtonGenerarImportacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoEvaluacionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionTipoEvaluacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoEvaluacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoEvaluacionEmpleado.setToolTipText("Cancelar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEvaluacionEmpleado.add(this.jButtonCerrarImportacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoEvaluacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoEvaluacionEmpleado= new JScrollPane(jPanelImportacionTipoEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoEvaluacionEmpleado);
		this.jInternalFrameImportacionTipoEvaluacionEmpleado.getContentPane().add(this.jScrollPanelImportacionTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoEvaluacionEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoEvaluacionEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByTipoEvaluacionEmpleado.setText("Orden");
			this.jButtonAbrirOrderByTipoEvaluacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEvaluacionEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoEvaluacionEmpleado";
			inputMap = this.jButtonAbrirOrderByTipoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoEvaluacionEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoEvaluacionEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoEvaluacionEmpleado.setName("jPanelOrderByTipoEvaluacionEmpleado"); 
			
			this.jPanelOrderByTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoEvaluacionEmpleado.setLayout(gridaBagLayoutOrderByTipoEvaluacionEmpleado);
			
			
			this.jTableDatosTipoEvaluacionEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosTipoEvaluacionEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoEvaluacionEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoEvaluacionEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoEvaluacionEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoEvaluacionEmpleadoOrderBy.setViewportView(this.jTableDatosTipoEvaluacionEmpleadoOrderBy);
			this.jTableDatosTipoEvaluacionEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoEvaluacionEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoEvaluacionEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoEvaluacionEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoEvaluacionEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoEvaluacionEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setResizable(true);
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setClosable(true);
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Evaluacion Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoEvaluacionEmpleado.ipady =150;
				
			this.jPanelOrderByTipoEvaluacionEmpleado.add(jScrollPanelDatosTipoEvaluacionEmpleadoOrderBy, this.gridBagConstraintsTipoEvaluacionEmpleado);//this.jTableDatosTipoEvaluacionEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoEvaluacionEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByTipoEvaluacionEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoEvaluacionEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoEvaluacionEmpleado.setToolTipText("Cancelar"+" "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoEvaluacionEmpleado.add(this.jButtonCerrarOrderByTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoEvaluacionEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoEvaluacionEmpleado= new JScrollPane(jPanelOrderByTipoEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoEvaluacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoEvaluacionEmpleado);
			
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.getContentPane().add(this.jScrollPanelOrderByTipoEvaluacionEmpleado, this.gridBagConstraintsTipoEvaluacionEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByTipoEvaluacionEmpleado = new JButtonMe();
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
			&& this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoEvaluacionEmpleado.getRowHeight();//TipoEvaluacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoEvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado.isSelected()) {
					iHeightTable=TipoEvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoEvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEvaluacionEmpleado.isSelected()) {
					iHeightTable=TipoEvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoEvaluacionEmpleado!=null && this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoevaluacionempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoEvaluacionEmpleado> TraerTipoEvaluacionEmpleadoBeans(List<TipoEvaluacionEmpleado> tipoevaluacionempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoEvaluacionEmpleado tipoevaluacionempleado:tipoevaluacionempleados) {
					
				if(!(TipoEvaluacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoEvaluacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoevaluacionempleado.setsDetalleGeneralEntityReporte(TipoEvaluacionEmpleadoConstantesFunciones.getTipoEvaluacionEmpleadoDescripcion(tipoevaluacionempleado));
										
						
					
					

					if(tipoevaluacionempleado.getEvaluacionEmpleados()!=null && Funciones.existeClass(classes,EvaluacionEmpleado.class)) {
						try{tipoevaluacionempleado.setevaluacionempleadosDescripcionReporte(new JRBeanCollectionDataSource(EvaluacionEmpleadoJInternalFrame.TraerEvaluacionEmpleadoBeans(tipoevaluacionempleado.getEvaluacionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoevaluacionempleado.setsDetalleGeneralEntityReporte(tipoevaluacionempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoevaluacionempleadobeans.add(tipoevaluacionempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoevaluacionempleados;
    }
	//PARA REPORTES FIN
}
