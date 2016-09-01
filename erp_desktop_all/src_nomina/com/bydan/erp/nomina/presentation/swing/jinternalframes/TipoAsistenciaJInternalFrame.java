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
import com.bydan.erp.nomina.util.TipoAsistenciaConstantesFunciones;

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
public class TipoAsistenciaJInternalFrame extends TipoAsistenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoAsistencia;
	
	protected JMenuBar jmenuBarTipoAsistencia;
	
	protected JMenu jmenuTipoAsistencia;
	protected JMenu jmenuDatosTipoAsistencia;
	protected JMenu jmenuArchivoTipoAsistencia;
	protected JMenu jmenuAccionesTipoAsistencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAsistencia;	
	protected GridBagConstraints gridBagConstraintsTipoAsistencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoAsistenciaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoAsistencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoAsistencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoAsistencia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoAsistenciaSessionBean tipoasistenciaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoAsistencia> tipoasistencias;		
	public List<TipoAsistencia> tipoasistenciasEliminados;	
	public List<TipoAsistencia> tipoasistenciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoAsistencia;		
	protected JButton jButtonAbrirOrderByTipoAsistencia;
	
	
	//protected JPanel jPanelOrderByTipoAsistencia;
	//public JScrollPane jScrollPanelOrderByTipoAsistencia;	
	//protected JButton jButtonCerrarOrderByTipoAsistencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoAsistenciaLogic tipoasistenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoAsistencia;
	public JScrollPane jScrollPanelDatosEdicionTipoAsistencia;
	public JScrollPane jScrollPanelDatosGeneralTipoAsistencia;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoAsistenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoAsistencia;
	//public JScrollPane jScrollPanelImportacionTipoAsistencia;
	
	
	
	protected JPanel jPanelAccionesTipoAsistencia;
	
    protected JPanel jPanelPaginacionTipoAsistencia;
    protected JPanel jPanelParametrosReportesTipoAsistencia;
	protected JPanel jPanelParametrosReportesAccionesTipoAsistencia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoAsistencia;
	protected JPanel jPanelParametrosAuxiliar2TipoAsistencia;
	protected JPanel jPanelParametrosAuxiliar3TipoAsistencia;
	protected JPanel jPanelParametrosAuxiliar4TipoAsistencia;
	//protected JPanel jPanelParametrosAuxiliar5TipoAsistencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoAsistencia;
	//protected JPanel jPanelImportacionTipoAsistencia;
	
	
	public JTable jTableDatosTipoAsistencia;
	
	
	
	//public JTable jTableDatosTipoAsistenciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoAsistencia;
	protected JButton jButtonDuplicarTipoAsistencia;
	protected JButton jButtonCopiarTipoAsistencia;
	protected JButton jButtonVerFormTipoAsistencia;
	protected JButton jButtonNuevoRelacionesTipoAsistencia;
	protected JButton jButtonModificarTipoAsistencia;
	
    protected JButton jButtonGuardarCambiosTablaTipoAsistencia;
	protected JButton jButtonCerrarTipoAsistencia;
	
	
	protected JButton jButtonRecargarInformacionTipoAsistencia;
	protected JButton jButtonProcesarInformacionTipoAsistencia;
	
	
	protected JButton jButtonAnterioresTipoAsistencia;
	protected JButton jButtonSiguientesTipoAsistencia;
	protected JButton jButtonNuevoGuardarCambiosTipoAsistencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoAsistencia;
	//protected JButton jButtonCerrarReporteDinamicoTipoAsistencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoAsistencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoAsistencia;
	//protected JButton jButtonGenerarImportacionTipoAsistencia;
	//protected JButton jButtonCerrarImportacionTipoAsistencia;
	//protected JFileChooser jFileChooserImportacionTipoAsistencia;
	//protected File fileImportacionTipoAsistencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAsistencia;
	protected JButton jButtonDuplicarToolBarTipoAsistencia;
	protected JButton jButtonNuevoRelacionesToolBarTipoAsistencia;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoAsistencia;
	protected JButton jButtonCopiarToolBarTipoAsistencia;
	protected JButton jButtonVerFormToolBarTipoAsistencia;
	public JButton jButtonGuardarCambiosTablaToolBarTipoAsistencia;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAsistencia;
	protected JButton jButtonCerrarToolBarTipoAsistencia;
	
	protected JButton jButtonRecargarInformacionToolBarTipoAsistencia;
	protected JButton jButtonProcesarInformacionToolBarTipoAsistencia;
	protected JButton jButtonAnterioresToolBarTipoAsistencia;
	protected JButton jButtonSiguientesToolBarTipoAsistencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoAsistencia;
	protected JButton jButtonAbrirOrderByToolBarTipoAsistencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAsistencia;
	protected JMenuItem jMenuItemDuplicarTipoAsistencia;
	protected JMenuItem jMenuItemNuevoRelacionesTipoAsistencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoAsistencia;
	protected JMenuItem jMenuItemCopiarTipoAsistencia;
	protected JMenuItem jMenuItemVerFormTipoAsistencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAsistencia;
	protected JMenuItem jMenuItemCerrarTipoAsistencia;
	protected JMenuItem jMenuItemDetalleCerrarTipoAsistencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoAsistencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAsistencia;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoAsistencia;
	protected JMenuItem jMenuItemProcesarInformacionTipoAsistencia;
	protected JMenuItem jMenuItemAnterioresTipoAsistencia;
	protected JMenuItem jMenuItemSiguientesTipoAsistencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAsistencia;
	protected JMenuItem jMenuItemAbrirOrderByTipoAsistencia;
	protected JMenuItem jMenuItemMostrarOcultarTipoAsistencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAsistencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoAsistencia;
	protected JCheckBox jCheckBoxSeleccionadosTipoAsistencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoAsistencia;
	protected JCheckBox jCheckBoxConGraficoReporteTipoAsistencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoAsistencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoAsistencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAsistencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoAsistencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoAsistencia;
	protected JTextField jTextFieldValorCampoGeneralTipoAsistencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoAsistencia;
	//public JList<Reporte> jListColumnasSelectReporteTipoAsistencia;
	//public JScrollPane jScrollColumnasSelectReporteTipoAsistencia;
	
	//public JLabel jLabelRelacionesSelectReporteTipoAsistencia;
	//public JList<Reporte> jListRelacionesSelectReporteTipoAsistencia;
	//public JScrollPane jScrollRelacionesSelectReporteTipoAsistencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoAsistencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoAsistencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoAsistencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoAsistencia;
	
		
	//public JLabel jLabelArchivoImportacionTipoAsistencia;	
	//public JLabel jLabelPathArchivoImportacionTipoAsistencia;
	//protected JTextField jTextFieldPathArchivoImportacionTipoAsistencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoAsistencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoAsistencia;
	
	//public JLabel jLabelColumnaCategoriaValorTipoAsistencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoAsistencia;
	
	//public JLabel jLabelColumnasValoresGraficoTipoAsistencia;
	//public JList<Reporte> jListColumnasValoresGraficoTipoAsistencia;
	//public JScrollPane jScrollColumnasValoresGraficoTipoAsistencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoAsistencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoAsistencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoAsistencia;
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoAsistenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAsistenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAsistenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAsistenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoAsistencia)	{
		this.jButtonRecargarInformacionTipoAsistencia = jButtonRecargarInformacionTipoAsistencia;
	}
	
	public JButton getjButtonProcesarInformacionTipoAsistencia() {
		return this.jButtonProcesarInformacionTipoAsistencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAsistencia)	{
		this.jButtonProcesarInformacionTipoAsistencia = jButtonProcesarInformacionTipoAsistencia;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoAsistencia() {
		return this.jButtonRecargarInformacionTipoAsistencia;
	}
	
	
	public List<TipoAsistencia> gettipoasistencias() {
		return this.tipoasistencias;
	}

	public void settipoasistencias(List<TipoAsistencia> tipoasistencias) {
		this.tipoasistencias = tipoasistencias;
	}
	
	public List<TipoAsistencia> gettipoasistenciasAux() {
		return this.tipoasistenciasAux;
	}

	public void settipoasistenciasAux(List<TipoAsistencia> tipoasistenciasAux) {
		this.tipoasistenciasAux = tipoasistenciasAux;
	}
	
	public List<TipoAsistencia> gettipoasistenciasEliminados() {
		return this.tipoasistenciasEliminados;
	}

	public void setTipoAsistenciasEliminados(List<TipoAsistencia> tipoasistenciasEliminados) {
		this.tipoasistenciasEliminados = tipoasistenciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoAsistencia() {
		return jComboBoxTiposSeleccionarTipoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoAsistencia(
			JComboBox jComboBoxTiposSeleccionarTipoAsistencia) {
		this.jComboBoxTiposSeleccionarTipoAsistencia = jComboBoxTiposSeleccionarTipoAsistencia;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoAsistencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoAsistencia() {
		return jTextFieldValorCampoGeneralTipoAsistencia;
	}

	public void setjTextFieldValorCampoGeneralTipoAsistencia(
			JTextField jTextFieldValorCampoGeneralTipoAsistencia) {
		this.jTextFieldValorCampoGeneralTipoAsistencia = jTextFieldValorCampoGeneralTipoAsistencia;
	}

	public void setBorderResaltarValorCampoGeneralTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoAsistencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoAsistencia() {
		return this.jCheckBoxSeleccionarTodosTipoAsistencia;
	}

	public void setjCheckBoxSeleccionarTodosTipoAsistencia(
			JCheckBox jCheckBoxSeleccionarTodosTipoAsistencia) {
		this.jCheckBoxSeleccionarTodosTipoAsistencia = jCheckBoxSeleccionarTodosTipoAsistencia;
	}

	public void setBorderResaltarSeleccionarTodosTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoAsistencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoAsistencia() {
		return this.jCheckBoxSeleccionadosTipoAsistencia;
	}

	public void setjCheckBoxSeleccionadosTipoAsistencia(
			JCheckBox jCheckBoxSeleccionadosTipoAsistencia) {
		this.jCheckBoxSeleccionadosTipoAsistencia = jCheckBoxSeleccionadosTipoAsistencia;
	}
	
	public void setBorderResaltarSeleccionadosTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoAsistencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoAsistencia() {
		return this.jComboBoxTiposArchivosReportesTipoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoAsistencia(
			JComboBox jComboBoxTiposArchivosReportesTipoAsistencia) {
		this.jComboBoxTiposArchivosReportesTipoAsistencia = jComboBoxTiposArchivosReportesTipoAsistencia;
	}

	public void setBorderResaltarTiposArchivosReportesTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoAsistencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoAsistencia() {
		return this.jComboBoxTiposReportesTipoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoAsistencia(
			JComboBox jComboBoxTiposReportesTipoAsistencia) {
		this.jComboBoxTiposReportesTipoAsistencia = jComboBoxTiposReportesTipoAsistencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoAsistencia() {
	//	return jComboBoxTiposReportesDinamicoTipoAsistencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoAsistencia(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoAsistencia) {
	//	this.jComboBoxTiposReportesDinamicoTipoAsistencia = jComboBoxTiposReportesDinamicoTipoAsistencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoAsistencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoAsistencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoAsistencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAsistencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoAsistencia = jComboBoxTiposArchivosReportesDinamicoTipoAsistencia;
	//}
	
	public void setBorderResaltarTiposReportesTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoAsistencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoAsistencia() {
		return this.jComboBoxTiposGraficosReportesTipoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoAsistencia(
			JComboBox jComboBoxTiposGraficosReportesTipoAsistencia) {
		this.jComboBoxTiposGraficosReportesTipoAsistencia = jComboBoxTiposGraficosReportesTipoAsistencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoAsistencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoAsistencia() {
		return this.jComboBoxTiposPaginacionTipoAsistencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoAsistencia(
			JComboBox jComboBoxTiposPaginacionTipoAsistencia) {
		this.jComboBoxTiposPaginacionTipoAsistencia = jComboBoxTiposPaginacionTipoAsistencia;
	}
	
	public void setBorderResaltarTiposPaginacionTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoAsistencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoAsistencia() {
		return this.jComboBoxTiposRelacionesTipoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAsistencia() {
		return this.jComboBoxTiposAccionesTipoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAsistencia(
			JComboBox jComboBoxTiposRelacionesTipoAsistencia) {
		this.jComboBoxTiposRelacionesTipoAsistencia = jComboBoxTiposRelacionesTipoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAsistencia(
			JComboBox jComboBoxTiposAccionesTipoAsistencia) {
		this.jComboBoxTiposAccionesTipoAsistencia = jComboBoxTiposAccionesTipoAsistencia;
	}
	
	public void setBorderResaltarTiposRelacionesTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoAsistencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoAsistencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoAsistencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoAsistencia() {
	//	return jCheckBoxConGraficoDinamicoTipoAsistencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoAsistencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoAsistencia) {
	//	this.jCheckBoxConGraficoDinamicoTipoAsistencia = jCheckBoxConGraficoDinamicoTipoAsistencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoAsistencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoAsistencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoAsistencia .setBorder(borderResaltar);		
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
		this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
		
		this.tipoasistenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoasistenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoasistenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAsistenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Asistencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoAsistenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoAsistencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"nuevo","nuevo","Nuevo"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"duplicar","duplicar","Duplicar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"copiar","copiar","Copiar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"ver_form","ver_form","Ver"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"recargar","recargar","Recargar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoAsistencia,this.jTtoolBarTipoAsistencia,
							"cerrar","cerrar","Salir"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoAsistencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoAsistencia;
			
				this.jButtonProcesarInformacionToolBarTipoAsistencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoAsistencia;
				
		//protected JButton jButtonModificarToolBarTipoAsistencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoAsistencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoAsistencia=new JMenuMe("General");
		this.jmenuArchivoTipoAsistencia=new JMenuMe("Archivo");
		this.jmenuAccionesTipoAsistencia=new JMenuMe("Acciones");
		this.jmenuDatosTipoAsistencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAsistencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAsistencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAsistencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoAsistencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoAsistencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoAsistencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoAsistencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoAsistencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoAsistencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoAsistencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAsistencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAsistencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoAsistencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoAsistencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoAsistencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoAsistencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoAsistencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoAsistencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoAsistencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoAsistencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoAsistencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAsistencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAsistencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAsistencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoAsistencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoAsistencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoAsistencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoAsistencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoAsistencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoAsistencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoAsistencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoAsistencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoAsistencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoAsistencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoAsistencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoAsistencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoAsistencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoAsistencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoAsistencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAsistencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAsistencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAsistencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoAsistencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoAsistencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoAsistencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAsistencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAsistencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAsistencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoAsistencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoAsistencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoAsistencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoAsistencia.add(this.jMenuItemCerrarTipoAsistencia);
			
			this.jmenuAccionesTipoAsistencia.add(this.jMenuItemNuevoTipoAsistencia);
			this.jmenuAccionesTipoAsistencia.add(this.jMenuItemNuevoGuardarCambiosTipoAsistencia);
			this.jmenuAccionesTipoAsistencia.add(this.jMenuItemNuevoRelacionesTipoAsistencia);
			this.jmenuAccionesTipoAsistencia.add(this.jMenuItemGuardarCambiosTablaTipoAsistencia);		
			this.jmenuAccionesTipoAsistencia.add(this.jMenuItemDuplicarTipoAsistencia);		
			this.jmenuAccionesTipoAsistencia.add(this.jMenuItemCopiarTipoAsistencia);		
			this.jmenuAccionesTipoAsistencia.add(this.jMenuItemVerFormTipoAsistencia);		
			
			this.jmenuDatosTipoAsistencia.add(this.jMenuItemRecargarInformacionTipoAsistencia);				
			this.jmenuDatosTipoAsistencia.add(this.jMenuItemAnterioresTipoAsistencia);				
			this.jmenuDatosTipoAsistencia.add(this.jMenuItemSiguientesTipoAsistencia);				
			this.jmenuDatosTipoAsistencia.add(this.jMenuItemAbrirOrderByTipoAsistencia);				
			this.jmenuDatosTipoAsistencia.add(this.jMenuItemMostrarOcultarTipoAsistencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoAsistencia.add(this.jMenuItemGuardarCambiosTipoAsistencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoAsistencia.add(this.jmenuArchivoTipoAsistencia);		
			this.jmenuBarTipoAsistencia.add(this.jmenuAccionesTipoAsistencia);		
			this.jmenuBarTipoAsistencia.add(this.jmenuDatosTipoAsistencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoAsistencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoAsistencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoAsistencia=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoAsistencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAsistencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAsistencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoAsistencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoAsistencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoAsistencia = new TipoAsistenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Asistencia DATOS");
			this.jInternalFrameDetalleFormTipoAsistencia = new TipoAsistenciaDetalleFormJInternalFrame(jDesktopPane,this.tipoasistenciaSessionBean.getConGuardarRelaciones(),this.tipoasistenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoAsistencia = null;//new TipoAsistenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAsistencia= new GridBagLayout();
		
		
		this.jTableDatosTipoAsistencia = new JTableMe();      
		
		String sToolTipTipoAsistencia="";
		sToolTipTipoAsistencia=TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAsistencia+="(Nomina.TipoAsistencia)";
		}
		
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAsistencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoAsistencia.setToolTipText(sToolTipTipoAsistencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoAsistencia);
		this.jTableDatosTipoAsistencia.setAutoCreateRowSorter(true);
		this.jTableDatosTipoAsistencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoAsistencia.setRowSelectionAllowed(true);
		this.jTableDatosTipoAsistencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoAsistencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoAsistencia = new JButtonMe();
		this.jButtonDuplicarTipoAsistencia = new JButtonMe();
		this.jButtonCopiarTipoAsistencia = new JButtonMe();
		this.jButtonVerFormTipoAsistencia = new JButtonMe();
		this.jButtonNuevoRelacionesTipoAsistencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoAsistencia = new JButtonMe();
		this.jButtonCerrarTipoAsistencia = new JButtonMe();
		
		this.jScrollPanelDatosTipoAsistencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoAsistencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Asistencia";
		
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Asistencias" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAsistencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAsistencia.setToolTipText("Acciones");
        this.jPanelAccionesTipoAsistencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoAsistencia=new ReporteDinamicoJInternalFrame(TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoAsistencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoAsistencia=new ImportacionJInternalFrame(TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoAsistencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoAsistencia = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoAsistencia.setText("Orden");
		this.jButtonAbrirOrderByTipoAsistencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAsistencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAsistencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAsistencia,false,this);
			
			//this.cargarOrderByTipoAsistencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAsistencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAsistencia,true,this);
			
			//this.cargarOrderByTipoAsistencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoAsistencia.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoAsistencia.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoAsistencia.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoAsistencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAsistencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAsistencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoAsistencia.setText("Nuevo");
		this.jButtonDuplicarTipoAsistencia.setText("Duplicar");
		this.jButtonCopiarTipoAsistencia.setText("Copiar");
		this.jButtonVerFormTipoAsistencia.setText("Ver");
		this.jButtonNuevoRelacionesTipoAsistencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoAsistencia.setText("Guardar");
		this.jButtonCerrarTipoAsistencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAsistencia,"nuevo_button","Nuevo",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoAsistencia,"duplicar_button","Duplicar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoAsistencia,"copiar_button","Copiar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoAsistencia,"ver_form","Ver",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoAsistencia,"nuevorelaciones_button","Nuevo Rel",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAsistencia,"guardarcambiostabla_button","Guardar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAsistencia,"cerrar_button","Salir",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoAsistencia.setToolTipText("Nuevo"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoAsistencia.setToolTipText("Duplicar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoAsistencia.setToolTipText("Copiar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoAsistencia.setToolTipText("Ver"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoAsistencia.setToolTipText("Nuevo Rel"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoAsistencia.setToolTipText("Guardar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAsistencia.setToolTipText("Salir"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAsistencia";
		inputMap = this.jButtonNuevoTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAsistencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoAsistencia";
		inputMap = this.jButtonDuplicarTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoAsistencia"));
		
		//COPIAR
		sMapKey = "CopiarTipoAsistencia";
		inputMap = this.jButtonCopiarTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoAsistencia"));
		
		//VEr FORM
		sMapKey = "VerFormTipoAsistencia";
		inputMap = this.jButtonVerFormTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoAsistencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoAsistencia";
		inputMap = this.jButtonNuevoRelacionesTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoAsistencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoAsistencia";
		inputMap = this.jButtonModificarTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoAsistencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoAsistencia";
		inputMap = this.jButtonCerrarTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAsistencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAsistencia";
		inputMap = this.jButtonGuardarCambiosTablaTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAsistencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoAsistencia.setName("jPanelParametrosReportesTipoAsistencia"); 
		
		this.jPanelParametrosReportesAccionesTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoAsistencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoAsistencia.setName("jPanelParametrosReportesAccionesTipoAsistencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoAsistencia = new JButtonMe();
		this.jButtonRecargarInformacionTipoAsistencia.setText("Recargar");
		this.jButtonRecargarInformacionTipoAsistencia.setToolTipText("Recargar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoAsistencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoAsistencia = new JButtonMe();
		this.jButtonProcesarInformacionTipoAsistencia.setText("Procesar");
		this.jButtonProcesarInformacionTipoAsistencia.setToolTipText("Procesar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoAsistencia.setVisible(false);
			
		this.jButtonProcesarInformacionTipoAsistencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAsistencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAsistencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAsistencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoAsistencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAsistencia.setText("TIPO");       
		this.jComboBoxTiposReportesTipoAsistencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAsistencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoAsistencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoAsistencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoAsistencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoAsistencia.setText("Accion");
		this.jComboBoxTiposRelacionesTipoAsistencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAsistencia.setText("Accion");
		this.jComboBoxTiposAccionesTipoAsistencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoAsistencia.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoAsistencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoAsistencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoAsistencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAsistencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAsistencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoAsistencia = new JLabelMe();
		
		this.jLabelAccionesTipoAsistencia.setText("Acciones");		
		this.jLabelAccionesTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoAsistencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoAsistencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoAsistencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoAsistencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoAsistencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoAsistencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoAsistencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoAsistencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoAsistencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoAsistencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoAsistencia.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoAsistencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoAsistencia = new JButtonMe();
		//this.jButtonAnterioresTipoAsistencia.setText("<<");
        this.jButtonAnterioresTipoAsistencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoAsistencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoAsistencia = new JButtonMe();
		//this.jButtonSiguientesTipoAsistencia.setText(">>");
        this.jButtonSiguientesTipoAsistencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoAsistencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoAsistencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoAsistencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoAsistencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoAsistencia,"nuevoguardarcambios_button","Nue",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoAsistencia";
		inputMap = this.jButtonNuevoGuardarCambiosTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoAsistencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoAsistencia";
		inputMap = this.jButtonRecargarInformacionTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoAsistencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoAsistencia";
		inputMap = this.jButtonSiguientesTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoAsistencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoAsistencia";
		inputMap = this.jButtonAnterioresTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoAsistencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoAsistencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoAsistencia.setMinimumSize(new Dimension(this.getWidth(),TipoAsistenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAsistenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAsistencia.setMaximumSize(new Dimension(this.getWidth(),TipoAsistenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAsistenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAsistencia.setPreferredSize(new Dimension(this.getWidth(),TipoAsistenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAsistenciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoAsistencia = new GridBagLayout();

			this.jPanelPaginacionTipoAsistencia.setLayout(gridaBagLayoutPaginacionTipoAsistencia);						
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = 0;
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoAsistencia.add(this.jButtonAnterioresTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
					
						
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAsistencia.gridy = 0;
			
			this.jPanelPaginacionTipoAsistencia.add(this.jButtonNuevoGuardarCambiosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
						
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAsistencia.gridy = 0;
			this.jPanelPaginacionTipoAsistencia.add(this.jButtonSiguientesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = 1;
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAsistencia.add(this.jButtonNuevoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
						
			
			
			if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
				this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAsistencia.gridy = 1;
				this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoAsistencia.add(this.jButtonGuardarCambiosTablaTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			}
			
			
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = 1;
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAsistencia.add(this.jButtonDuplicarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = 1;
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAsistencia.add(this.jButtonCopiarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = 1;
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAsistencia.add(this.jButtonVerFormTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = 1;
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoAsistencia.add(this.jButtonCerrarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
		
		
		this.jButtonRecargarInformacionTipoAsistencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAsistencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAsistencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoAsistencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAsistencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAsistencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoAsistencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAsistencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAsistencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoAsistencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAsistencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAsistencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoAsistencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAsistencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAsistencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoAsistencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAsistencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAsistencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoAsistencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAsistencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAsistencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoAsistencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAsistencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAsistencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoAsistencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAsistencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAsistencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoAsistencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAsistencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAsistencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoAsistencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAsistencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAsistencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoAsistencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAsistencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAsistencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoAsistencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoAsistencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoAsistencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoAsistencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoAsistencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoAsistencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoAsistencia.setLayout(gridaBagParametrosReportesTipoAsistencia);
			this.jPanelParametrosReportesAccionesTipoAsistencia.setLayout(gridaBagParametrosReportesAccionesTipoAsistencia);
			
			
			this.jPanelParametrosAuxiliar1TipoAsistencia.setLayout(gridaBagParametrosAuxiliar1TipoAsistencia);
			this.jPanelParametrosAuxiliar2TipoAsistencia.setLayout(gridaBagParametrosAuxiliar2TipoAsistencia);
			this.jPanelParametrosAuxiliar3TipoAsistencia.setLayout(gridaBagParametrosAuxiliar3TipoAsistencia);
			this.jPanelParametrosAuxiliar4TipoAsistencia.setLayout(gridaBagParametrosAuxiliar4TipoAsistencia);
			//this.jPanelParametrosAuxiliar5TipoAsistencia.setLayout(gridaBagParametrosAuxiliar2TipoAsistencia);			
			
			
			
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAsistencia.add(this.jButtonRecargarInformacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAsistencia.add(this.jComboBoxTiposPaginacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAsistencia.add(this.jCheckBoxConAltoMaximoTablaTipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAsistencia.add(this.jComboBoxTiposArchivosReportesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAsistencia.add(this.jPanelParametrosAuxiliar1TipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAsistencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoAsistencia.add(this.jComboBoxTiposReportesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAsistencia.add(this.jPanelParametrosAuxiliar4TipoAsistencia, this.gridBagConstraintsTipoAsistencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAsistencia.add(this.jComboBoxTiposReportesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAsistencia.add(this.jCheckBoxGenerarReporteTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAsistencia.add(this.jPanelParametrosAuxiliar2TipoAsistencia, this.gridBagConstraintsTipoAsistencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAsistencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAsistencia.add(this.jLabelAccionesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
				this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoAsistencia.add(this.jButtonAbrirOrderByTipoAsistencia, this.gridBagConstraintsTipoAsistencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAsistencia.add(this.jComboBoxTiposSeleccionarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
			
			
			/*
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAsistencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAsistencia.add(this.jCheckBoxSeleccionarTodosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAsistencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAsistencia.add(this.jCheckBoxSeleccionarTodosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);															
				
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAsistencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAsistencia.add(this.jCheckBoxSeleccionadosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAsistencia.add(this.jPanelParametrosAuxiliar3TipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAsistencia.add(this.jComboBoxTiposAccionesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
	
				
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAsistencia.add(this.jTextFieldValorCampoGeneralTipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoAsistencia = new GridBagLayout();

			this.jScrollPanelDatosTipoAsistencia.setLayout(gridaBagLayoutDatosTipoAsistencia);
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = 0;
			this.gridBagConstraintsTipoAsistencia.gridx = 0;
			
			this.jScrollPanelDatosTipoAsistencia.add(this.jTableDatosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoAsistencia.setViewportView(this.jTableDatosTipoAsistencia);
		this.jTableDatosTipoAsistencia.setFillsViewportHeight(true);
		this.jTableDatosTipoAsistencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoAsistencia= new GridBagLayout();
		this.jPanelAccionesTipoAsistencia.setLayout(gridaBagLayoutAccionesTipoAsistencia);
		
		
		/*	
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = 0;
		this.gridBagConstraintsTipoAsistencia.gridx = 0;
			
		this.jPanelAccionesTipoAsistencia.add(this.jButtonNuevoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAsistencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAsistencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();						
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAsistencia.gridx = 0;		
			//this.gridBagConstraintsTipoAsistencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAsistencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoAsistencia.gridx = 0;		
		//this.gridBagConstraintsTipoAsistencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoAsistencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoAsistencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);								
		
		
		/*
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		*/		
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAsistencia.gridx =0;
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAsistencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
				
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoAsistencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAsistencia = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoAsistencia.setLayout(gridaBagLayoutBusquedasParametrosTipoAsistencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoAsistencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAsistencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAsistencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAsistencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			
			
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
			
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoAsistencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoAsistencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoAsistencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoAsistencia.setName("jPanelReporteDinamicoTipoAsistencia"); 
		
		this.jPanelReporteDinamicoTipoAsistencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAsistencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAsistencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoAsistencia.setLayout(gridaBagLayoutReporteDinamicoTipoAsistencia);
		
		
		this.jInternalFrameReporteDinamicoTipoAsistencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoAsistencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAsistencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoAsistencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoAsistencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoAsistencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoAsistencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoAsistencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoAsistencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoAsistencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoAsistencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoAsistencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAsistencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAsistencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Asistencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoAsistencia = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoAsistencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAsistencia.add(this.jLabelColumnasSelectReporteTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoAsistencia = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoAsistencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoAsistencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoAsistencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAsistencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAsistencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoAsistencia=new JScrollPane(this.jListColumnasSelectReporteTipoAsistencia);
			
			this.jScrollColumnasSelectReporteTipoAsistencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAsistencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAsistencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAsistencia.add(this.jListColumnasSelectReporteTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		this.jPanelReporteDinamicoTipoAsistencia.add(this.jScrollColumnasSelectReporteTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoAsistencia = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoAsistencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoAsistencia = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoAsistencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoAsistencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoAsistencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAsistencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAsistencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoAsistencia=new JScrollPane(this.jListRelacionesSelectReporteTipoAsistencia);
			
			this.jScrollRelacionesSelectReporteTipoAsistencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAsistencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAsistencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoAsistencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoAsistencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoAsistencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoAsistencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoAsistencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoAsistencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAsistencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAsistencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoAsistencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAsistencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAsistencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAsistencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAsistencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoAsistencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoAsistencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAsistencia.add(this.jLabelGenerarExcelReporteDinamicoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoAsistencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoAsistencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoAsistencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoAsistencia.setToolTipText("Generar EXCEL"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoAsistencia.add(this.jButtonGenerarExcelReporteDinamicoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAsistencia.add(this.jComboBoxTiposReportesDinamicoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoAsistencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoAsistencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAsistencia.add(this.jLabelTiposArchivoReporteDinamicoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAsistencia.add(this.jComboBoxTiposArchivosReportesDinamicoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoAsistencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoAsistencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoAsistencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoAsistencia.setToolTipText("Generar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAsistencia.add(this.jButtonGenerarReporteDinamicoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoAsistencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoAsistencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoAsistencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoAsistencia.setToolTipText("Cancelar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAsistencia.add(this.jButtonCerrarReporteDinamicoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoAsistencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoAsistencia= new JScrollPane(jPanelReporteDinamicoTipoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoAsistencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAsistencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAsistencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Asistencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoAsistencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoAsistencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoAsistencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoAsistencia);
		this.jInternalFrameReporteDinamicoTipoAsistencia.getContentPane().add(this.jScrollPanelReporteDinamicoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoAsistencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoAsistencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoAsistencia.setName("jPanelImportacionTipoAsistencia"); 
		
		this.jPanelImportacionTipoAsistencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAsistencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAsistencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoAsistencia.setLayout(gridaBagLayoutImportacionTipoAsistencia);
		
		
		this.jInternalFrameImportacionTipoAsistencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoAsistencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoAsistencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAsistencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoAsistencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAsistencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAsistencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoAsistencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAsistencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAsistencia.setResizable(true);
	    this.jInternalFrameImportacionTipoAsistencia.setClosable(true);
	    this.jInternalFrameImportacionTipoAsistencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoAsistencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAsistencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAsistencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoAsistencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAsistencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAsistencia.setResizable(true);
	    this.jInternalFrameImportacionTipoAsistencia.setClosable(true);
	    this.jInternalFrameImportacionTipoAsistencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoAsistencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAsistencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAsistencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Asistencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoAsistencia = new JLabelMe();

		this.jLabelArchivoImportacionTipoAsistencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAsistencia.add(this.jLabelArchivoImportacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoAsistencia = new JFileChooser();		
		this.jFileChooserImportacionTipoAsistencia.setToolTipText("ESCOGER ARCHIVO"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoAsistencia = new JButtonMe();
		this.jButtonAbrirImportacionTipoAsistencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoAsistencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoAsistencia.setToolTipText("Generar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAsistencia.add(this.jButtonAbrirImportacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoAsistencia = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoAsistencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAsistencia.add(this.jLabelPathArchivoImportacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoAsistencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoAsistencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAsistencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAsistencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAsistencia.add(this.jTextFieldPathArchivoImportacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoAsistencia = new JButtonMe();
		this.jButtonGenerarImportacionTipoAsistencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoAsistencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoAsistencia.setToolTipText("Generar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAsistencia.add(this.jButtonGenerarImportacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoAsistencia = new JButtonMe();
		this.jButtonCerrarImportacionTipoAsistencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoAsistencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoAsistencia.setToolTipText("Cancelar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAsistencia.add(this.jButtonCerrarImportacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoAsistencia = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoAsistencia= new JScrollPane(jPanelImportacionTipoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoAsistencia.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoAsistencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoAsistencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoAsistencia);
		this.jInternalFrameImportacionTipoAsistencia.getContentPane().add(this.jScrollPanelImportacionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoAsistencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoAsistencia = new JButtonMe();
			this.jButtonAbrirOrderByTipoAsistencia.setText("Orden");
			this.jButtonAbrirOrderByTipoAsistencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAsistencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoAsistencia";
			inputMap = this.jButtonAbrirOrderByTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoAsistencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoAsistencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoAsistencia.setName("jPanelOrderByTipoAsistencia"); 
			
			this.jPanelOrderByTipoAsistencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAsistencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAsistencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoAsistencia.setLayout(gridaBagLayoutOrderByTipoAsistencia);
			
			
			this.jTableDatosTipoAsistenciaOrderBy = new JTableMe();        
			this.jTableDatosTipoAsistenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoAsistenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoAsistenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoAsistenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoAsistenciaOrderBy.setViewportView(this.jTableDatosTipoAsistenciaOrderBy);
			this.jTableDatosTipoAsistenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoAsistenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoAsistencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoAsistencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoAsistencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoAsistencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoAsistencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoAsistencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoAsistencia.setTitle("Orden");
			this.jInternalFrameOrderByTipoAsistencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoAsistencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoAsistencia.setResizable(true);
			this.jInternalFrameOrderByTipoAsistencia.setClosable(true);
			this.jInternalFrameOrderByTipoAsistencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoAsistencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAsistencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAsistencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Asistencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoAsistencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoAsistencia.ipady =150;
				
			this.jPanelOrderByTipoAsistencia.add(jScrollPanelDatosTipoAsistenciaOrderBy, this.gridBagConstraintsTipoAsistencia);//this.jTableDatosTipoAsistenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoAsistencia = new JButtonMe();
			this.jButtonCerrarOrderByTipoAsistencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoAsistencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoAsistencia.setToolTipText("Cancelar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoAsistencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoAsistencia.add(this.jButtonCerrarOrderByTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoAsistencia = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoAsistencia= new JScrollPane(jPanelOrderByTipoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoAsistencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoAsistencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoAsistencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoAsistencia);
			
			this.jInternalFrameOrderByTipoAsistencia.getContentPane().add(this.jScrollPanelOrderByTipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
		
		} else {
			this.jButtonAbrirOrderByTipoAsistencia = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoasistenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoAsistencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoAsistencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoAsistencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoAsistencia.getRowHeight();//TipoAsistenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoAsistenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAsistencia.isSelected()) {
					iHeightTable=TipoAsistenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAsistenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAsistenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoAsistenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAsistencia.isSelected()) {
					iHeightTable=TipoAsistenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAsistenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAsistenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoAsistencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAsistencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAsistencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoAsistencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAsistencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAsistencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoAsistencia!=null && this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoAsistencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoAsistencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoAsistencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoAsistencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAsistencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAsistencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoasistenciaLogic.getTipoAsistencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoasistencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoAsistencia> TraerTipoAsistenciaBeans(List<TipoAsistencia> tipoasistencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoAsistencia tipoasistencia:tipoasistencias) {
					
				if(!(TipoAsistenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoAsistenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoasistencia.setsDetalleGeneralEntityReporte(TipoAsistenciaConstantesFunciones.getTipoAsistenciaDescripcion(tipoasistencia));
										
						
					
						
					
				} else  {
							
					//tipoasistencia.setsDetalleGeneralEntityReporte(tipoasistencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoasistenciabeans.add(tipoasistenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoasistencias;
    }
	//PARA REPORTES FIN
}
