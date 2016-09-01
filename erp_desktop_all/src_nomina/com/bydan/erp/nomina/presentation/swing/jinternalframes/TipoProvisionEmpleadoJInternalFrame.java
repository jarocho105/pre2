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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.TipoProvisionEmpleadoConstantesFunciones;

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
public class TipoProvisionEmpleadoJInternalFrame extends TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProvisionEmpleado;
	
	protected JMenuBar jmenuBarTipoProvisionEmpleado;
	
	protected JMenu jmenuTipoProvisionEmpleado;
	protected JMenu jmenuDatosTipoProvisionEmpleado;
	protected JMenu jmenuArchivoTipoProvisionEmpleado;
	protected JMenu jmenuAccionesTipoProvisionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProvisionEmpleado;	
	protected GridBagConstraints gridBagConstraintsTipoProvisionEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProvisionEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProvisionEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProvisionEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProvisionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProvisionEmpleadoSessionBean tipoprovisionempleadoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProvisionEmpleado> tipoprovisionempleados;		
	public List<TipoProvisionEmpleado> tipoprovisionempleadosEliminados;	
	public List<TipoProvisionEmpleado> tipoprovisionempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProvisionEmpleado;		
	protected JButton jButtonAbrirOrderByTipoProvisionEmpleado;
	
	
	//protected JPanel jPanelOrderByTipoProvisionEmpleado;
	//public JScrollPane jScrollPanelOrderByTipoProvisionEmpleado;	
	//protected JButton jButtonCerrarOrderByTipoProvisionEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProvisionEmpleadoLogic tipoprovisionempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProvisionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionTipoProvisionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralTipoProvisionEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProvisionEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProvisionEmpleado;
	//public JScrollPane jScrollPanelImportacionTipoProvisionEmpleado;
	
	
	
	protected JPanel jPanelAccionesTipoProvisionEmpleado;
	
    protected JPanel jPanelPaginacionTipoProvisionEmpleado;
    protected JPanel jPanelParametrosReportesTipoProvisionEmpleado;
	protected JPanel jPanelParametrosReportesAccionesTipoProvisionEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar2TipoProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar3TipoProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar4TipoProvisionEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5TipoProvisionEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProvisionEmpleado;
	//protected JPanel jPanelImportacionTipoProvisionEmpleado;
	
	
	public JTable jTableDatosTipoProvisionEmpleado;
	
	
	
	//public JTable jTableDatosTipoProvisionEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProvisionEmpleado;
	protected JButton jButtonDuplicarTipoProvisionEmpleado;
	protected JButton jButtonCopiarTipoProvisionEmpleado;
	protected JButton jButtonVerFormTipoProvisionEmpleado;
	protected JButton jButtonNuevoRelacionesTipoProvisionEmpleado;
	protected JButton jButtonModificarTipoProvisionEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaTipoProvisionEmpleado;
	protected JButton jButtonCerrarTipoProvisionEmpleado;
	
	
	protected JButton jButtonRecargarInformacionTipoProvisionEmpleado;
	protected JButton jButtonProcesarInformacionTipoProvisionEmpleado;
	
	
	protected JButton jButtonAnterioresTipoProvisionEmpleado;
	protected JButton jButtonSiguientesTipoProvisionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosTipoProvisionEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProvisionEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoTipoProvisionEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProvisionEmpleado;
	//protected JButton jButtonGenerarImportacionTipoProvisionEmpleado;
	//protected JButton jButtonCerrarImportacionTipoProvisionEmpleado;
	//protected JFileChooser jFileChooserImportacionTipoProvisionEmpleado;
	//protected File fileImportacionTipoProvisionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProvisionEmpleado;
	protected JButton jButtonDuplicarToolBarTipoProvisionEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarTipoProvisionEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProvisionEmpleado;
	protected JButton jButtonCopiarToolBarTipoProvisionEmpleado;
	protected JButton jButtonVerFormToolBarTipoProvisionEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProvisionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProvisionEmpleado;
	protected JButton jButtonCerrarToolBarTipoProvisionEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProvisionEmpleado;
	protected JButton jButtonProcesarInformacionToolBarTipoProvisionEmpleado;
	protected JButton jButtonAnterioresToolBarTipoProvisionEmpleado;
	protected JButton jButtonSiguientesToolBarTipoProvisionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProvisionEmpleado;
	protected JButton jButtonAbrirOrderByToolBarTipoProvisionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProvisionEmpleado;
	protected JMenuItem jMenuItemDuplicarTipoProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProvisionEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProvisionEmpleado;
	protected JMenuItem jMenuItemCopiarTipoProvisionEmpleado;
	protected JMenuItem jMenuItemVerFormTipoProvisionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProvisionEmpleado;
	protected JMenuItem jMenuItemCerrarTipoProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarTipoProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProvisionEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProvisionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionTipoProvisionEmpleado;
	protected JMenuItem jMenuItemAnterioresTipoProvisionEmpleado;
	protected JMenuItem jMenuItemSiguientesTipoProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByTipoProvisionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarTipoProvisionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProvisionEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProvisionEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosTipoProvisionEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProvisionEmpleado;
	protected JTextField jTextFieldValorCampoGeneralTipoProvisionEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProvisionEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteTipoProvisionEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteTipoProvisionEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProvisionEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProvisionEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProvisionEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProvisionEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProvisionEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProvisionEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProvisionEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionTipoProvisionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionTipoProvisionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProvisionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProvisionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProvisionEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProvisionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProvisionEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProvisionEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProvisionEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProvisionEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProvisionEmpleado;	
	
	
	
	
	
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
	public TipoProvisionEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProvisionEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProvisionEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProvisionEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProvisionEmpleado)	{
		this.jButtonRecargarInformacionTipoProvisionEmpleado = jButtonRecargarInformacionTipoProvisionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionTipoProvisionEmpleado() {
		return this.jButtonProcesarInformacionTipoProvisionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProvisionEmpleado)	{
		this.jButtonProcesarInformacionTipoProvisionEmpleado = jButtonProcesarInformacionTipoProvisionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProvisionEmpleado() {
		return this.jButtonRecargarInformacionTipoProvisionEmpleado;
	}
	
	
	public List<TipoProvisionEmpleado> gettipoprovisionempleados() {
		return this.tipoprovisionempleados;
	}

	public void settipoprovisionempleados(List<TipoProvisionEmpleado> tipoprovisionempleados) {
		this.tipoprovisionempleados = tipoprovisionempleados;
	}
	
	public List<TipoProvisionEmpleado> gettipoprovisionempleadosAux() {
		return this.tipoprovisionempleadosAux;
	}

	public void settipoprovisionempleadosAux(List<TipoProvisionEmpleado> tipoprovisionempleadosAux) {
		this.tipoprovisionempleadosAux = tipoprovisionempleadosAux;
	}
	
	public List<TipoProvisionEmpleado> gettipoprovisionempleadosEliminados() {
		return this.tipoprovisionempleadosEliminados;
	}

	public void setTipoProvisionEmpleadosEliminados(List<TipoProvisionEmpleado> tipoprovisionempleadosEliminados) {
		this.tipoprovisionempleadosEliminados = tipoprovisionempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProvisionEmpleado() {
		return jComboBoxTiposSeleccionarTipoProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProvisionEmpleado(
			JComboBox jComboBoxTiposSeleccionarTipoProvisionEmpleado) {
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado = jComboBoxTiposSeleccionarTipoProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProvisionEmpleado() {
		return jTextFieldValorCampoGeneralTipoProvisionEmpleado;
	}

	public void setjTextFieldValorCampoGeneralTipoProvisionEmpleado(
			JTextField jTextFieldValorCampoGeneralTipoProvisionEmpleado) {
		this.jTextFieldValorCampoGeneralTipoProvisionEmpleado = jTextFieldValorCampoGeneralTipoProvisionEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProvisionEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProvisionEmpleado() {
		return this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosTipoProvisionEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosTipoProvisionEmpleado) {
		this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado = jCheckBoxSeleccionarTodosTipoProvisionEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProvisionEmpleado() {
		return this.jCheckBoxSeleccionadosTipoProvisionEmpleado;
	}

	public void setjCheckBoxSeleccionadosTipoProvisionEmpleado(
			JCheckBox jCheckBoxSeleccionadosTipoProvisionEmpleado) {
		this.jCheckBoxSeleccionadosTipoProvisionEmpleado = jCheckBoxSeleccionadosTipoProvisionEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProvisionEmpleado() {
		return this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProvisionEmpleado(
			JComboBox jComboBoxTiposArchivosReportesTipoProvisionEmpleado) {
		this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado = jComboBoxTiposArchivosReportesTipoProvisionEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProvisionEmpleado() {
		return this.jComboBoxTiposReportesTipoProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProvisionEmpleado(
			JComboBox jComboBoxTiposReportesTipoProvisionEmpleado) {
		this.jComboBoxTiposReportesTipoProvisionEmpleado = jComboBoxTiposReportesTipoProvisionEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProvisionEmpleado() {
	//	return jComboBoxTiposReportesDinamicoTipoProvisionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProvisionEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProvisionEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoTipoProvisionEmpleado = jComboBoxTiposReportesDinamicoTipoProvisionEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado = jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProvisionEmpleado() {
		return this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProvisionEmpleado(
			JComboBox jComboBoxTiposGraficosReportesTipoProvisionEmpleado) {
		this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado = jComboBoxTiposGraficosReportesTipoProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProvisionEmpleado() {
		return this.jComboBoxTiposPaginacionTipoProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProvisionEmpleado(
			JComboBox jComboBoxTiposPaginacionTipoProvisionEmpleado) {
		this.jComboBoxTiposPaginacionTipoProvisionEmpleado = jComboBoxTiposPaginacionTipoProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProvisionEmpleado() {
		return this.jComboBoxTiposRelacionesTipoProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProvisionEmpleado() {
		return this.jComboBoxTiposAccionesTipoProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProvisionEmpleado(
			JComboBox jComboBoxTiposRelacionesTipoProvisionEmpleado) {
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado = jComboBoxTiposRelacionesTipoProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesTipoProvisionEmpleado) {
		this.jComboBoxTiposAccionesTipoProvisionEmpleado = jComboBoxTiposAccionesTipoProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProvisionEmpleado() {
	//	return jCheckBoxConGraficoDinamicoTipoProvisionEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProvisionEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProvisionEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoTipoProvisionEmpleado = jCheckBoxConGraficoDinamicoTipoProvisionEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProvisionEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProvisionEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProvisionEmpleado .setBorder(borderResaltar);		
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
		this.tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
		
		this.tipoprovisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprovisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProvisionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Provision Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProvisionEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"nuevo","nuevo","Nuevo"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"duplicar","duplicar","Duplicar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"copiar","copiar","Copiar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"ver_form","ver_form","Ver"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"recargar","recargar","Recargar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,
							"cerrar","cerrar","Salir"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProvisionEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProvisionEmpleado;
			
				this.jButtonProcesarInformacionToolBarTipoProvisionEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProvisionEmpleado;
				
		//protected JButton jButtonModificarToolBarTipoProvisionEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProvisionEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProvisionEmpleado=new JMenuMe("General");
		this.jmenuArchivoTipoProvisionEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProvisionEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosTipoProvisionEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProvisionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProvisionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProvisionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProvisionEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProvisionEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProvisionEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProvisionEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProvisionEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProvisionEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProvisionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProvisionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProvisionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProvisionEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProvisionEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProvisionEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProvisionEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProvisionEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProvisionEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProvisionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProvisionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProvisionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProvisionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProvisionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProvisionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProvisionEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProvisionEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProvisionEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProvisionEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProvisionEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProvisionEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProvisionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProvisionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProvisionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProvisionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProvisionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProvisionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProvisionEmpleado.add(this.jMenuItemCerrarTipoProvisionEmpleado);
			
			this.jmenuAccionesTipoProvisionEmpleado.add(this.jMenuItemNuevoTipoProvisionEmpleado);
			this.jmenuAccionesTipoProvisionEmpleado.add(this.jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado);
			this.jmenuAccionesTipoProvisionEmpleado.add(this.jMenuItemNuevoRelacionesTipoProvisionEmpleado);
			this.jmenuAccionesTipoProvisionEmpleado.add(this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado);		
			this.jmenuAccionesTipoProvisionEmpleado.add(this.jMenuItemDuplicarTipoProvisionEmpleado);		
			this.jmenuAccionesTipoProvisionEmpleado.add(this.jMenuItemCopiarTipoProvisionEmpleado);		
			this.jmenuAccionesTipoProvisionEmpleado.add(this.jMenuItemVerFormTipoProvisionEmpleado);		
			
			this.jmenuDatosTipoProvisionEmpleado.add(this.jMenuItemRecargarInformacionTipoProvisionEmpleado);				
			this.jmenuDatosTipoProvisionEmpleado.add(this.jMenuItemAnterioresTipoProvisionEmpleado);				
			this.jmenuDatosTipoProvisionEmpleado.add(this.jMenuItemSiguientesTipoProvisionEmpleado);				
			this.jmenuDatosTipoProvisionEmpleado.add(this.jMenuItemAbrirOrderByTipoProvisionEmpleado);				
			this.jmenuDatosTipoProvisionEmpleado.add(this.jMenuItemMostrarOcultarTipoProvisionEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProvisionEmpleado.add(this.jMenuItemGuardarCambiosTipoProvisionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProvisionEmpleado.add(this.jmenuArchivoTipoProvisionEmpleado);		
			this.jmenuBarTipoProvisionEmpleado.add(this.jmenuAccionesTipoProvisionEmpleado);		
			this.jmenuBarTipoProvisionEmpleado.add(this.jmenuDatosTipoProvisionEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProvisionEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProvisionEmpleado() {
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
			//this.jInternalFrameDetalleTipoProvisionEmpleado = new TipoProvisionEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Provision Empleado DATOS");
			this.jInternalFrameDetalleFormTipoProvisionEmpleado = new TipoProvisionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones(),this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado = null;//new TipoProvisionEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProvisionEmpleado= new GridBagLayout();
		
		
		this.jTableDatosTipoProvisionEmpleado = new JTableMe();      
		
		String sToolTipTipoProvisionEmpleado="";
		sToolTipTipoProvisionEmpleado=TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProvisionEmpleado+="(Nomina.TipoProvisionEmpleado)";
		}
		
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProvisionEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProvisionEmpleado.setToolTipText(sToolTipTipoProvisionEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProvisionEmpleado);
		this.jTableDatosTipoProvisionEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProvisionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProvisionEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosTipoProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProvisionEmpleado = new JButtonMe();
		this.jButtonDuplicarTipoProvisionEmpleado = new JButtonMe();
		this.jButtonCopiarTipoProvisionEmpleado = new JButtonMe();
		this.jButtonVerFormTipoProvisionEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProvisionEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarTipoProvisionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosTipoProvisionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProvisionEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Provision Empleado";
		
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Provision Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesTipoProvisionEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProvisionEmpleado=new ReporteDinamicoJInternalFrame(TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProvisionEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProvisionEmpleado=new ImportacionJInternalFrame(TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProvisionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProvisionEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProvisionEmpleado.setText("Orden");
		this.jButtonAbrirOrderByTipoProvisionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProvisionEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProvisionEmpleado,false,this);
			
			//this.cargarOrderByTipoProvisionEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProvisionEmpleado,true,this);
			
			//this.cargarOrderByTipoProvisionEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProvisionEmpleado.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProvisionEmpleado.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProvisionEmpleado.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoProvisionEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProvisionEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProvisionEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProvisionEmpleado.setText("Nuevo");
		this.jButtonDuplicarTipoProvisionEmpleado.setText("Duplicar");
		this.jButtonCopiarTipoProvisionEmpleado.setText("Copiar");
		this.jButtonVerFormTipoProvisionEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesTipoProvisionEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.setText("Guardar");
		this.jButtonCerrarTipoProvisionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProvisionEmpleado,"nuevo_button","Nuevo",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProvisionEmpleado,"duplicar_button","Duplicar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProvisionEmpleado,"copiar_button","Copiar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProvisionEmpleado,"ver_form","Ver",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProvisionEmpleado,"nuevorelaciones_button","Nuevo Rel",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProvisionEmpleado,"guardarcambiostabla_button","Guardar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProvisionEmpleado,"cerrar_button","Salir",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProvisionEmpleado.setToolTipText("Nuevo"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProvisionEmpleado.setToolTipText("Duplicar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProvisionEmpleado.setToolTipText("Copiar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProvisionEmpleado.setToolTipText("Ver"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProvisionEmpleado.setToolTipText("Nuevo Rel"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.setToolTipText("Guardar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProvisionEmpleado.setToolTipText("Salir"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProvisionEmpleado";
		inputMap = this.jButtonNuevoTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProvisionEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProvisionEmpleado";
		inputMap = this.jButtonDuplicarTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProvisionEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarTipoProvisionEmpleado";
		inputMap = this.jButtonCopiarTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProvisionEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProvisionEmpleado";
		inputMap = this.jButtonVerFormTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProvisionEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProvisionEmpleado";
		inputMap = this.jButtonNuevoRelacionesTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProvisionEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProvisionEmpleado";
		inputMap = this.jButtonModificarTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProvisionEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProvisionEmpleado";
		inputMap = this.jButtonCerrarTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProvisionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProvisionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProvisionEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProvisionEmpleado.setName("jPanelParametrosReportesTipoProvisionEmpleado"); 
		
		this.jPanelParametrosReportesAccionesTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProvisionEmpleado.setName("jPanelParametrosReportesAccionesTipoProvisionEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProvisionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionTipoProvisionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionTipoProvisionEmpleado.setToolTipText("Recargar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProvisionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProvisionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionTipoProvisionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionTipoProvisionEmpleado.setToolTipText("Procesar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProvisionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProvisionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProvisionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProvisionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProvisionEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProvisionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProvisionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProvisionEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProvisionEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProvisionEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProvisionEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProvisionEmpleado = new JLabelMe();
		
		this.jLabelAccionesTipoProvisionEmpleado.setText("Acciones");		
		this.jLabelAccionesTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProvisionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProvisionEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProvisionEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProvisionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProvisionEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProvisionEmpleado = new JButtonMe();
		//this.jButtonAnterioresTipoProvisionEmpleado.setText("<<");
        this.jButtonAnterioresTipoProvisionEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProvisionEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProvisionEmpleado = new JButtonMe();
		//this.jButtonSiguientesTipoProvisionEmpleado.setText(">>");
        this.jButtonSiguientesTipoProvisionEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProvisionEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado,"nuevoguardarcambios_button","Nue",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProvisionEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProvisionEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProvisionEmpleado";
		inputMap = this.jButtonRecargarInformacionTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProvisionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProvisionEmpleado";
		inputMap = this.jButtonSiguientesTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProvisionEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProvisionEmpleado";
		inputMap = this.jButtonAnterioresTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProvisionEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProvisionEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProvisionEmpleado.setMinimumSize(new Dimension(this.getWidth(),TipoProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProvisionEmpleado.setMaximumSize(new Dimension(this.getWidth(),TipoProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProvisionEmpleado.setPreferredSize(new Dimension(this.getWidth(),TipoProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProvisionEmpleado = new GridBagLayout();

			this.jPanelPaginacionTipoProvisionEmpleado.setLayout(gridaBagLayoutPaginacionTipoProvisionEmpleado);						
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonAnterioresTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
					
						
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
			
			this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
						
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
			this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonSiguientesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonNuevoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProvisionEmpleado.gridy = 1;
				this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonNuevoRelacionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			}
			
			
			if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProvisionEmpleado.gridy = 1;
				this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonGuardarCambiosTablaTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			}
			
			
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonDuplicarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonCopiarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonVerFormTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProvisionEmpleado.add(this.jButtonCerrarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
		
		
		this.jButtonRecargarInformacionTipoProvisionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProvisionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProvisionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProvisionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProvisionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProvisionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProvisionEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProvisionEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProvisionEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProvisionEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProvisionEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProvisionEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProvisionEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProvisionEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProvisionEmpleado.setLayout(gridaBagParametrosReportesTipoProvisionEmpleado);
			this.jPanelParametrosReportesAccionesTipoProvisionEmpleado.setLayout(gridaBagParametrosReportesAccionesTipoProvisionEmpleado);
			
			
			this.jPanelParametrosAuxiliar1TipoProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar1TipoProvisionEmpleado);
			this.jPanelParametrosAuxiliar2TipoProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar2TipoProvisionEmpleado);
			this.jPanelParametrosAuxiliar3TipoProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar3TipoProvisionEmpleado);
			this.jPanelParametrosAuxiliar4TipoProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar4TipoProvisionEmpleado);
			//this.jPanelParametrosAuxiliar5TipoProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar2TipoProvisionEmpleado);			
			
			
			
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jButtonRecargarInformacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProvisionEmpleado.add(this.jComboBoxTiposPaginacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProvisionEmpleado.add(this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProvisionEmpleado.add(this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jPanelParametrosAuxiliar1TipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProvisionEmpleado.add(this.jComboBoxTiposReportesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jPanelParametrosAuxiliar4TipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jComboBoxTiposReportesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jCheckBoxGenerarReporteTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jPanelParametrosAuxiliar2TipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jLabelAccionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jButtonAbrirOrderByTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jComboBoxTiposSeleccionarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
			
			
			/*
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProvisionEmpleado.add(this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);															
				
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProvisionEmpleado.add(this.jCheckBoxSeleccionadosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jPanelParametrosAuxiliar3TipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jComboBoxTiposRelacionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
				
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jComboBoxTiposAccionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
	
				
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProvisionEmpleado.add(this.jTextFieldValorCampoGeneralTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProvisionEmpleado = new GridBagLayout();

			this.jScrollPanelDatosTipoProvisionEmpleado.setLayout(gridaBagLayoutDatosTipoProvisionEmpleado);
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
			
			this.jScrollPanelDatosTipoProvisionEmpleado.add(this.jTableDatosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProvisionEmpleado.setViewportView(this.jTableDatosTipoProvisionEmpleado);
		this.jTableDatosTipoProvisionEmpleado.setFillsViewportHeight(true);
		this.jTableDatosTipoProvisionEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesTipoProvisionEmpleado.setLayout(gridaBagLayoutAccionesTipoProvisionEmpleado);
		
		
		/*	
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
			
		this.jPanelAccionesTipoProvisionEmpleado.add(this.jButtonNuevoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProvisionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProvisionEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;		
			//this.gridBagConstraintsTipoProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;		
		//this.gridBagConstraintsTipoProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProvisionEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);								
		
		
		/*
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		*/		
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx =0;
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProvisionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
				
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProvisionEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProvisionEmpleado.setLayout(gridaBagLayoutBusquedasParametrosTipoProvisionEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProvisionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			
			
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
			
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProvisionEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProvisionEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProvisionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProvisionEmpleado.setName("jPanelReporteDinamicoTipoProvisionEmpleado"); 
		
		this.jPanelReporteDinamicoTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProvisionEmpleado.setLayout(gridaBagLayoutReporteDinamicoTipoProvisionEmpleado);
		
		
		this.jInternalFrameReporteDinamicoTipoProvisionEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProvisionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProvisionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Provision Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProvisionEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProvisionEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jLabelColumnasSelectReporteTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProvisionEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProvisionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProvisionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProvisionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProvisionEmpleado=new JScrollPane(this.jListColumnasSelectReporteTipoProvisionEmpleado);
			
			this.jScrollColumnasSelectReporteTipoProvisionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProvisionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProvisionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jListColumnasSelectReporteTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jScrollColumnasSelectReporteTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProvisionEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProvisionEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jLabelRelacionesSelectReporteTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProvisionEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProvisionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProvisionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProvisionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProvisionEmpleado=new JScrollPane(this.jListRelacionesSelectReporteTipoProvisionEmpleado);
			
			this.jScrollRelacionesSelectReporteTipoProvisionEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProvisionEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProvisionEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jListRelacionesSelectReporteTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jScrollRelacionesSelectReporteTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoProvisionEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProvisionEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProvisionEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProvisionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProvisionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProvisionEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProvisionEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jLabelGenerarExcelReporteDinamicoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleado.setToolTipText("Generar EXCEL"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jComboBoxTiposReportesDinamicoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProvisionEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProvisionEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jLabelTiposArchivoReporteDinamicoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProvisionEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProvisionEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProvisionEmpleado.setToolTipText("Generar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jButtonGenerarReporteDinamicoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProvisionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProvisionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProvisionEmpleado.setToolTipText("Cancelar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProvisionEmpleado.add(this.jButtonCerrarReporteDinamicoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProvisionEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProvisionEmpleado= new JScrollPane(jPanelReporteDinamicoTipoProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Provision Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProvisionEmpleado);
		this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProvisionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProvisionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProvisionEmpleado.setName("jPanelImportacionTipoProvisionEmpleado"); 
		
		this.jPanelImportacionTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProvisionEmpleado.setLayout(gridaBagLayoutImportacionTipoProvisionEmpleado);
		
		
		this.jInternalFrameImportacionTipoProvisionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProvisionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProvisionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProvisionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProvisionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProvisionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionTipoProvisionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Provision Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProvisionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionTipoProvisionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProvisionEmpleado.add(this.jLabelArchivoImportacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProvisionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionTipoProvisionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProvisionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionTipoProvisionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProvisionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProvisionEmpleado.setToolTipText("Generar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProvisionEmpleado.add(this.jButtonAbrirImportacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProvisionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProvisionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProvisionEmpleado.add(this.jLabelPathArchivoImportacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProvisionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProvisionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProvisionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProvisionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProvisionEmpleado.add(this.jTextFieldPathArchivoImportacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionTipoProvisionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProvisionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProvisionEmpleado.setToolTipText("Generar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProvisionEmpleado.add(this.jButtonGenerarImportacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionTipoProvisionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProvisionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProvisionEmpleado.setToolTipText("Cancelar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProvisionEmpleado.add(this.jButtonCerrarImportacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProvisionEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProvisionEmpleado= new JScrollPane(jPanelImportacionTipoProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProvisionEmpleado);
		this.jInternalFrameImportacionTipoProvisionEmpleado.getContentPane().add(this.jScrollPanelImportacionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProvisionEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProvisionEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByTipoProvisionEmpleado.setText("Orden");
			this.jButtonAbrirOrderByTipoProvisionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProvisionEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProvisionEmpleado";
			inputMap = this.jButtonAbrirOrderByTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProvisionEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProvisionEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProvisionEmpleado.setName("jPanelOrderByTipoProvisionEmpleado"); 
			
			this.jPanelOrderByTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProvisionEmpleado.setLayout(gridaBagLayoutOrderByTipoProvisionEmpleado);
			
			
			this.jTableDatosTipoProvisionEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosTipoProvisionEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProvisionEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProvisionEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProvisionEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProvisionEmpleadoOrderBy.setViewportView(this.jTableDatosTipoProvisionEmpleadoOrderBy);
			this.jTableDatosTipoProvisionEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProvisionEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProvisionEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProvisionEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProvisionEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProvisionEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProvisionEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProvisionEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByTipoProvisionEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProvisionEmpleado.setResizable(true);
			this.jInternalFrameOrderByTipoProvisionEmpleado.setClosable(true);
			this.jInternalFrameOrderByTipoProvisionEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Provision Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProvisionEmpleado.ipady =150;
				
			this.jPanelOrderByTipoProvisionEmpleado.add(jScrollPanelDatosTipoProvisionEmpleadoOrderBy, this.gridBagConstraintsTipoProvisionEmpleado);//this.jTableDatosTipoProvisionEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProvisionEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByTipoProvisionEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProvisionEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProvisionEmpleado.setToolTipText("Cancelar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProvisionEmpleado.add(this.jButtonCerrarOrderByTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProvisionEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProvisionEmpleado= new JScrollPane(jPanelOrderByTipoProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProvisionEmpleado);
			
			this.jInternalFrameOrderByTipoProvisionEmpleado.getContentPane().add(this.jScrollPanelOrderByTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByTipoProvisionEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProvisionEmpleado.getRowHeight();//TipoProvisionEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado.isSelected()) {
					iHeightTable=TipoProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProvisionEmpleado.isSelected()) {
					iHeightTable=TipoProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProvisionEmpleado!=null && this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProvisionEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProvisionEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProvisionEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprovisionempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProvisionEmpleado> TraerTipoProvisionEmpleadoBeans(List<TipoProvisionEmpleado> tipoprovisionempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProvisionEmpleado tipoprovisionempleado:tipoprovisionempleados) {
					
				if(!(TipoProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprovisionempleado.setsDetalleGeneralEntityReporte(TipoProvisionEmpleadoConstantesFunciones.getTipoProvisionEmpleadoDescripcion(tipoprovisionempleado));
										
						
					
					

					if(tipoprovisionempleado.getProvisionEmpleados()!=null && Funciones.existeClass(classes,ProvisionEmpleado.class)) {
						try{tipoprovisionempleado.setprovisionempleadosDescripcionReporte(new JRBeanCollectionDataSource(ProvisionEmpleadoJInternalFrame.TraerProvisionEmpleadoBeans(tipoprovisionempleado.getProvisionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoprovisionempleado.setsDetalleGeneralEntityReporte(tipoprovisionempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprovisionempleadobeans.add(tipoprovisionempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprovisionempleados;
    }
	//PARA REPORTES FIN
}
