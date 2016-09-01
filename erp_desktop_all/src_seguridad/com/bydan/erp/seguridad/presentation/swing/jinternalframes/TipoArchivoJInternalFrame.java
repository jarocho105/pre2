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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.seguridad.util.TipoArchivoConstantesFunciones;

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
public class TipoArchivoJInternalFrame extends TipoArchivoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoArchivo;
	
	protected JMenuBar jmenuBarTipoArchivo;
	
	protected JMenu jmenuTipoArchivo;
	protected JMenu jmenuDatosTipoArchivo;
	protected JMenu jmenuArchivoTipoArchivo;
	protected JMenu jmenuAccionesTipoArchivo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoArchivo;	
	protected GridBagConstraints gridBagConstraintsTipoArchivo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoArchivoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoArchivo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoArchivo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoArchivo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoArchivoSessionBean tipoarchivoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoArchivo> tipoarchivos;		
	public List<TipoArchivo> tipoarchivosEliminados;	
	public List<TipoArchivo> tipoarchivosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoArchivo;		
	protected JButton jButtonAbrirOrderByTipoArchivo;
	
	
	//protected JPanel jPanelOrderByTipoArchivo;
	//public JScrollPane jScrollPanelOrderByTipoArchivo;	
	//protected JButton jButtonCerrarOrderByTipoArchivo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoArchivoLogic tipoarchivoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoArchivo;
	public JScrollPane jScrollPanelDatosEdicionTipoArchivo;
	public JScrollPane jScrollPanelDatosGeneralTipoArchivo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoArchivoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoArchivo;
	//public JScrollPane jScrollPanelImportacionTipoArchivo;
	
	
	
	protected JPanel jPanelAccionesTipoArchivo;
	
    protected JPanel jPanelPaginacionTipoArchivo;
    protected JPanel jPanelParametrosReportesTipoArchivo;
	protected JPanel jPanelParametrosReportesAccionesTipoArchivo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoArchivo;
	protected JPanel jPanelParametrosAuxiliar2TipoArchivo;
	protected JPanel jPanelParametrosAuxiliar3TipoArchivo;
	protected JPanel jPanelParametrosAuxiliar4TipoArchivo;
	//protected JPanel jPanelParametrosAuxiliar5TipoArchivo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoArchivo;
	//protected JPanel jPanelImportacionTipoArchivo;
	
	
	public JTable jTableDatosTipoArchivo;
	
	
	
	//public JTable jTableDatosTipoArchivoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoArchivo;
	protected JButton jButtonDuplicarTipoArchivo;
	protected JButton jButtonCopiarTipoArchivo;
	protected JButton jButtonVerFormTipoArchivo;
	protected JButton jButtonNuevoRelacionesTipoArchivo;
	protected JButton jButtonModificarTipoArchivo;
	
    protected JButton jButtonGuardarCambiosTablaTipoArchivo;
	protected JButton jButtonCerrarTipoArchivo;
	
	
	protected JButton jButtonRecargarInformacionTipoArchivo;
	protected JButton jButtonProcesarInformacionTipoArchivo;
	
	
	protected JButton jButtonAnterioresTipoArchivo;
	protected JButton jButtonSiguientesTipoArchivo;
	protected JButton jButtonNuevoGuardarCambiosTipoArchivo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoArchivo;
	//protected JButton jButtonCerrarReporteDinamicoTipoArchivo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoArchivo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoArchivo;
	//protected JButton jButtonGenerarImportacionTipoArchivo;
	//protected JButton jButtonCerrarImportacionTipoArchivo;
	//protected JFileChooser jFileChooserImportacionTipoArchivo;
	//protected File fileImportacionTipoArchivo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoArchivo;
	protected JButton jButtonDuplicarToolBarTipoArchivo;
	protected JButton jButtonNuevoRelacionesToolBarTipoArchivo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoArchivo;
	protected JButton jButtonCopiarToolBarTipoArchivo;
	protected JButton jButtonVerFormToolBarTipoArchivo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoArchivo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoArchivo;
	protected JButton jButtonCerrarToolBarTipoArchivo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoArchivo;
	protected JButton jButtonProcesarInformacionToolBarTipoArchivo;
	protected JButton jButtonAnterioresToolBarTipoArchivo;
	protected JButton jButtonSiguientesToolBarTipoArchivo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoArchivo;
	protected JButton jButtonAbrirOrderByToolBarTipoArchivo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoArchivo;
	protected JMenuItem jMenuItemDuplicarTipoArchivo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoArchivo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoArchivo;
	protected JMenuItem jMenuItemCopiarTipoArchivo;
	protected JMenuItem jMenuItemVerFormTipoArchivo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoArchivo;
	protected JMenuItem jMenuItemCerrarTipoArchivo;
	protected JMenuItem jMenuItemDetalleCerrarTipoArchivo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoArchivo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoArchivo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoArchivo;
	protected JMenuItem jMenuItemProcesarInformacionTipoArchivo;
	protected JMenuItem jMenuItemAnterioresTipoArchivo;
	protected JMenuItem jMenuItemSiguientesTipoArchivo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoArchivo;
	protected JMenuItem jMenuItemAbrirOrderByTipoArchivo;
	protected JMenuItem jMenuItemMostrarOcultarTipoArchivo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoArchivo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoArchivo;
	protected JCheckBox jCheckBoxSeleccionadosTipoArchivo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoArchivo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoArchivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoArchivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoArchivo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoArchivo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoArchivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoArchivo;
	protected JTextField jTextFieldValorCampoGeneralTipoArchivo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoArchivo;
	//public JList<Reporte> jListColumnasSelectReporteTipoArchivo;
	//public JScrollPane jScrollColumnasSelectReporteTipoArchivo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoArchivo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoArchivo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoArchivo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoArchivo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoArchivo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoArchivo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoArchivo;
	
		
	//public JLabel jLabelArchivoImportacionTipoArchivo;	
	//public JLabel jLabelPathArchivoImportacionTipoArchivo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoArchivo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoArchivo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoArchivo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoArchivo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoArchivo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoArchivo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoArchivo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoArchivo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoArchivo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoArchivo;	
	
	
	
	
	
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
	public TipoArchivoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoArchivoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoArchivoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoArchivoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoArchivo)	{
		this.jButtonRecargarInformacionTipoArchivo = jButtonRecargarInformacionTipoArchivo;
	}
	
	public JButton getjButtonProcesarInformacionTipoArchivo() {
		return this.jButtonProcesarInformacionTipoArchivo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoArchivo)	{
		this.jButtonProcesarInformacionTipoArchivo = jButtonProcesarInformacionTipoArchivo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoArchivo() {
		return this.jButtonRecargarInformacionTipoArchivo;
	}
	
	
	public List<TipoArchivo> gettipoarchivos() {
		return this.tipoarchivos;
	}

	public void settipoarchivos(List<TipoArchivo> tipoarchivos) {
		this.tipoarchivos = tipoarchivos;
	}
	
	public List<TipoArchivo> gettipoarchivosAux() {
		return this.tipoarchivosAux;
	}

	public void settipoarchivosAux(List<TipoArchivo> tipoarchivosAux) {
		this.tipoarchivosAux = tipoarchivosAux;
	}
	
	public List<TipoArchivo> gettipoarchivosEliminados() {
		return this.tipoarchivosEliminados;
	}

	public void setTipoArchivosEliminados(List<TipoArchivo> tipoarchivosEliminados) {
		this.tipoarchivosEliminados = tipoarchivosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoArchivo() {
		return jComboBoxTiposSeleccionarTipoArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoArchivo(
			JComboBox jComboBoxTiposSeleccionarTipoArchivo) {
		this.jComboBoxTiposSeleccionarTipoArchivo = jComboBoxTiposSeleccionarTipoArchivo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoArchivo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoArchivo() {
		return jTextFieldValorCampoGeneralTipoArchivo;
	}

	public void setjTextFieldValorCampoGeneralTipoArchivo(
			JTextField jTextFieldValorCampoGeneralTipoArchivo) {
		this.jTextFieldValorCampoGeneralTipoArchivo = jTextFieldValorCampoGeneralTipoArchivo;
	}

	public void setBorderResaltarValorCampoGeneralTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoArchivo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoArchivo() {
		return this.jCheckBoxSeleccionarTodosTipoArchivo;
	}

	public void setjCheckBoxSeleccionarTodosTipoArchivo(
			JCheckBox jCheckBoxSeleccionarTodosTipoArchivo) {
		this.jCheckBoxSeleccionarTodosTipoArchivo = jCheckBoxSeleccionarTodosTipoArchivo;
	}

	public void setBorderResaltarSeleccionarTodosTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoArchivo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoArchivo() {
		return this.jCheckBoxSeleccionadosTipoArchivo;
	}

	public void setjCheckBoxSeleccionadosTipoArchivo(
			JCheckBox jCheckBoxSeleccionadosTipoArchivo) {
		this.jCheckBoxSeleccionadosTipoArchivo = jCheckBoxSeleccionadosTipoArchivo;
	}
	
	public void setBorderResaltarSeleccionadosTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoArchivo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoArchivo() {
		return this.jComboBoxTiposArchivosReportesTipoArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoArchivo(
			JComboBox jComboBoxTiposArchivosReportesTipoArchivo) {
		this.jComboBoxTiposArchivosReportesTipoArchivo = jComboBoxTiposArchivosReportesTipoArchivo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoArchivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoArchivo() {
		return this.jComboBoxTiposReportesTipoArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoArchivo(
			JComboBox jComboBoxTiposReportesTipoArchivo) {
		this.jComboBoxTiposReportesTipoArchivo = jComboBoxTiposReportesTipoArchivo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoArchivo() {
	//	return jComboBoxTiposReportesDinamicoTipoArchivo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoArchivo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoArchivo) {
	//	this.jComboBoxTiposReportesDinamicoTipoArchivo = jComboBoxTiposReportesDinamicoTipoArchivo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoArchivo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoArchivo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoArchivo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoArchivo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoArchivo = jComboBoxTiposArchivosReportesDinamicoTipoArchivo;
	//}
	
	public void setBorderResaltarTiposReportesTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoArchivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoArchivo() {
		return this.jComboBoxTiposGraficosReportesTipoArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoArchivo(
			JComboBox jComboBoxTiposGraficosReportesTipoArchivo) {
		this.jComboBoxTiposGraficosReportesTipoArchivo = jComboBoxTiposGraficosReportesTipoArchivo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoArchivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoArchivo() {
		return this.jComboBoxTiposPaginacionTipoArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoArchivo(
			JComboBox jComboBoxTiposPaginacionTipoArchivo) {
		this.jComboBoxTiposPaginacionTipoArchivo = jComboBoxTiposPaginacionTipoArchivo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoArchivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoArchivo() {
		return this.jComboBoxTiposRelacionesTipoArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoArchivo() {
		return this.jComboBoxTiposAccionesTipoArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoArchivo(
			JComboBox jComboBoxTiposRelacionesTipoArchivo) {
		this.jComboBoxTiposRelacionesTipoArchivo = jComboBoxTiposRelacionesTipoArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoArchivo(
			JComboBox jComboBoxTiposAccionesTipoArchivo) {
		this.jComboBoxTiposAccionesTipoArchivo = jComboBoxTiposAccionesTipoArchivo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoArchivo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoArchivo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoArchivo() {
	//	return jCheckBoxConGraficoDinamicoTipoArchivo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoArchivo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoArchivo) {
	//	this.jCheckBoxConGraficoDinamicoTipoArchivo = jCheckBoxConGraficoDinamicoTipoArchivo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoArchivo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoArchivo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoArchivo .setBorder(borderResaltar);		
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
		this.tipoarchivoSessionBean=new TipoArchivoSessionBean();
		
		this.tipoarchivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoarchivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoarchivoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoArchivoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoArchivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoArchivoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoArchivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoArchivoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Archivo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoArchivoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoArchivo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"nuevo","nuevo","Nuevo"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"duplicar","duplicar","Duplicar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"copiar","copiar","Copiar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"ver_form","ver_form","Ver"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"recargar","recargar","Recargar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoArchivo,this.jTtoolBarTipoArchivo,
							"cerrar","cerrar","Salir"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoArchivo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoArchivo;
			
				this.jButtonProcesarInformacionToolBarTipoArchivo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoArchivo;
				
		//protected JButton jButtonModificarToolBarTipoArchivo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoArchivo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoArchivo=new JMenuMe("General");
		this.jmenuArchivoTipoArchivo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoArchivo=new JMenuMe("Acciones");
		this.jmenuDatosTipoArchivo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoArchivo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoArchivo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoArchivo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoArchivo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoArchivo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoArchivo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoArchivo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoArchivo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoArchivo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoArchivo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoArchivo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoArchivo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoArchivo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoArchivo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoArchivo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoArchivo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoArchivo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoArchivo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoArchivo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoArchivo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoArchivo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoArchivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoArchivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoArchivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoArchivo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoArchivo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoArchivo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoArchivo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoArchivo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoArchivo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoArchivo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoArchivo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoArchivo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoArchivo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoArchivo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoArchivo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoArchivo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoArchivo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoArchivo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoArchivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoArchivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoArchivo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoArchivo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoArchivo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoArchivo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoArchivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoArchivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoArchivo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoArchivo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoArchivo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoArchivo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoArchivo.add(this.jMenuItemCerrarTipoArchivo);
			
			this.jmenuAccionesTipoArchivo.add(this.jMenuItemNuevoTipoArchivo);
			this.jmenuAccionesTipoArchivo.add(this.jMenuItemNuevoGuardarCambiosTipoArchivo);
			this.jmenuAccionesTipoArchivo.add(this.jMenuItemNuevoRelacionesTipoArchivo);
			this.jmenuAccionesTipoArchivo.add(this.jMenuItemGuardarCambiosTablaTipoArchivo);		
			this.jmenuAccionesTipoArchivo.add(this.jMenuItemDuplicarTipoArchivo);		
			this.jmenuAccionesTipoArchivo.add(this.jMenuItemCopiarTipoArchivo);		
			this.jmenuAccionesTipoArchivo.add(this.jMenuItemVerFormTipoArchivo);		
			
			this.jmenuDatosTipoArchivo.add(this.jMenuItemRecargarInformacionTipoArchivo);				
			this.jmenuDatosTipoArchivo.add(this.jMenuItemAnterioresTipoArchivo);				
			this.jmenuDatosTipoArchivo.add(this.jMenuItemSiguientesTipoArchivo);				
			this.jmenuDatosTipoArchivo.add(this.jMenuItemAbrirOrderByTipoArchivo);				
			this.jmenuDatosTipoArchivo.add(this.jMenuItemMostrarOcultarTipoArchivo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoArchivo.add(this.jMenuItemGuardarCambiosTipoArchivo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoArchivo.add(this.jmenuArchivoTipoArchivo);		
			this.jmenuBarTipoArchivo.add(this.jmenuAccionesTipoArchivo);		
			this.jmenuBarTipoArchivo.add(this.jmenuDatosTipoArchivo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoArchivo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoArchivo() {
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
			//this.jInternalFrameDetalleTipoArchivo = new TipoArchivoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Archivo DATOS");
			this.jInternalFrameDetalleFormTipoArchivo = new TipoArchivoDetalleFormJInternalFrame(jDesktopPane,this.tipoarchivoSessionBean.getConGuardarRelaciones(),this.tipoarchivoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoArchivo = null;//new TipoArchivoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoArchivo= new GridBagLayout();
		
		
		this.jTableDatosTipoArchivo = new JTableMe();      
		
		String sToolTipTipoArchivo="";
		sToolTipTipoArchivo=TipoArchivoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoArchivo+="(Seguridad.TipoArchivo)";
		}
		
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoArchivo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoArchivo.setToolTipText(sToolTipTipoArchivo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoArchivo);
		this.jTableDatosTipoArchivo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoArchivo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoArchivo.setRowSelectionAllowed(true);
		this.jTableDatosTipoArchivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoArchivo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoArchivo = new JButtonMe();
		this.jButtonDuplicarTipoArchivo = new JButtonMe();
		this.jButtonCopiarTipoArchivo = new JButtonMe();
		this.jButtonVerFormTipoArchivo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoArchivo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoArchivo = new JButtonMe();
		this.jButtonCerrarTipoArchivo = new JButtonMe();
		
		this.jScrollPanelDatosTipoArchivo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoArchivo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Archivo";
		
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Archivos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoArchivo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoArchivo.setToolTipText("Acciones");
        this.jPanelAccionesTipoArchivo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoArchivo=new ReporteDinamicoJInternalFrame(TipoArchivoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoArchivo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoArchivo=new ImportacionJInternalFrame(TipoArchivoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoArchivo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoArchivo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoArchivo.setText("Orden");
		this.jButtonAbrirOrderByTipoArchivo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoArchivo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoArchivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoArchivo,false,this);
			
			//this.cargarOrderByTipoArchivo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoArchivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoArchivo,true,this);
			
			//this.cargarOrderByTipoArchivo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoArchivo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoArchivo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoArchivo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoArchivo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoArchivo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoArchivo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoArchivo.setText("Nuevo");
		this.jButtonDuplicarTipoArchivo.setText("Duplicar");
		this.jButtonCopiarTipoArchivo.setText("Copiar");
		this.jButtonVerFormTipoArchivo.setText("Ver");
		this.jButtonNuevoRelacionesTipoArchivo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoArchivo.setText("Guardar");
		this.jButtonCerrarTipoArchivo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoArchivo,"nuevo_button","Nuevo",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoArchivo,"duplicar_button","Duplicar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoArchivo,"copiar_button","Copiar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoArchivo,"ver_form","Ver",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoArchivo,"nuevorelaciones_button","Nuevo Rel",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoArchivo,"guardarcambiostabla_button","Guardar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoArchivo,"cerrar_button","Salir",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoArchivo.setToolTipText("Nuevo"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoArchivo.setToolTipText("Duplicar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoArchivo.setToolTipText("Copiar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoArchivo.setToolTipText("Ver"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoArchivo.setToolTipText("Nuevo Rel"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoArchivo.setToolTipText("Guardar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoArchivo.setToolTipText("Salir"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoArchivo";
		inputMap = this.jButtonNuevoTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoArchivo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoArchivo";
		inputMap = this.jButtonDuplicarTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoArchivo"));
		
		//COPIAR
		sMapKey = "CopiarTipoArchivo";
		inputMap = this.jButtonCopiarTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoArchivo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoArchivo";
		inputMap = this.jButtonVerFormTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoArchivo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoArchivo";
		inputMap = this.jButtonNuevoRelacionesTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoArchivo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoArchivo";
		inputMap = this.jButtonModificarTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoArchivo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoArchivo";
		inputMap = this.jButtonCerrarTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoArchivo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoArchivo";
		inputMap = this.jButtonGuardarCambiosTablaTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoArchivo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoArchivo.setName("jPanelParametrosReportesTipoArchivo"); 
		
		this.jPanelParametrosReportesAccionesTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoArchivo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoArchivo.setName("jPanelParametrosReportesAccionesTipoArchivo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoArchivo = new JButtonMe();
		this.jButtonRecargarInformacionTipoArchivo.setText("Recargar");
		this.jButtonRecargarInformacionTipoArchivo.setToolTipText("Recargar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoArchivo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoArchivo = new JButtonMe();
		this.jButtonProcesarInformacionTipoArchivo.setText("Procesar");
		this.jButtonProcesarInformacionTipoArchivo.setToolTipText("Procesar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoArchivo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoArchivo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoArchivo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoArchivo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoArchivo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoArchivo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoArchivo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoArchivo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoArchivo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoArchivo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoArchivo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoArchivo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoArchivo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoArchivo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoArchivo.setText("Accion");
		this.jComboBoxTiposAccionesTipoArchivo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoArchivo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoArchivo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoArchivo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoArchivo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoArchivo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoArchivo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoArchivo = new JLabelMe();
		
		this.jLabelAccionesTipoArchivo.setText("Acciones");		
		this.jLabelAccionesTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoArchivo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoArchivo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoArchivo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoArchivo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoArchivo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoArchivo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoArchivo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoArchivo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoArchivo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoArchivo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoArchivo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoArchivo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoArchivo = new JButtonMe();
		//this.jButtonAnterioresTipoArchivo.setText("<<");
        this.jButtonAnterioresTipoArchivo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoArchivo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoArchivo = new JButtonMe();
		//this.jButtonSiguientesTipoArchivo.setText(">>");
        this.jButtonSiguientesTipoArchivo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoArchivo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoArchivo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoArchivo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoArchivo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoArchivo,"nuevoguardarcambios_button","Nue",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoArchivo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoArchivo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoArchivo";
		inputMap = this.jButtonRecargarInformacionTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoArchivo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoArchivo";
		inputMap = this.jButtonSiguientesTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoArchivo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoArchivo";
		inputMap = this.jButtonAnterioresTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoArchivo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoArchivo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoArchivo.setMinimumSize(new Dimension(this.getWidth(),TipoArchivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoArchivoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoArchivo.setMaximumSize(new Dimension(this.getWidth(),TipoArchivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoArchivoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoArchivo.setPreferredSize(new Dimension(this.getWidth(),TipoArchivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoArchivoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoArchivo = new GridBagLayout();

			this.jPanelPaginacionTipoArchivo.setLayout(gridaBagLayoutPaginacionTipoArchivo);						
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = 0;
			this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoArchivo.add(this.jButtonAnterioresTipoArchivo, this.gridBagConstraintsTipoArchivo);
					
						
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoArchivo.gridy = 0;
			
			this.jPanelPaginacionTipoArchivo.add(this.jButtonNuevoGuardarCambiosTipoArchivo, this.gridBagConstraintsTipoArchivo);
						
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoArchivo.gridy = 0;
			this.jPanelPaginacionTipoArchivo.add(this.jButtonSiguientesTipoArchivo, this.gridBagConstraintsTipoArchivo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = 1;
			this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoArchivo.add(this.jButtonNuevoTipoArchivo, this.gridBagConstraintsTipoArchivo);
						
			
			
			if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
				this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoArchivo.gridy = 1;
				this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoArchivo.add(this.jButtonGuardarCambiosTablaTipoArchivo, this.gridBagConstraintsTipoArchivo);
			}
			
			
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = 1;
			this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoArchivo.add(this.jButtonDuplicarTipoArchivo, this.gridBagConstraintsTipoArchivo);
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = 1;
			this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoArchivo.add(this.jButtonCopiarTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = 1;
			this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoArchivo.add(this.jButtonVerFormTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = 1;
			this.gridBagConstraintsTipoArchivo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoArchivo.add(this.jButtonCerrarTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
		
		
		this.jButtonRecargarInformacionTipoArchivo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoArchivo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoArchivo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoArchivo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoArchivo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoArchivo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoArchivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoArchivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoArchivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoArchivo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoArchivo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoArchivo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoArchivo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoArchivo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoArchivo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoArchivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoArchivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoArchivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoArchivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoArchivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoArchivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoArchivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoArchivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoArchivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoArchivo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoArchivo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoArchivo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoArchivo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoArchivo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoArchivo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoArchivo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoArchivo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoArchivo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoArchivo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoArchivo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoArchivo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoArchivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoArchivo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoArchivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoArchivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoArchivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoArchivo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoArchivo.setLayout(gridaBagParametrosReportesTipoArchivo);
			this.jPanelParametrosReportesAccionesTipoArchivo.setLayout(gridaBagParametrosReportesAccionesTipoArchivo);
			
			
			this.jPanelParametrosAuxiliar1TipoArchivo.setLayout(gridaBagParametrosAuxiliar1TipoArchivo);
			this.jPanelParametrosAuxiliar2TipoArchivo.setLayout(gridaBagParametrosAuxiliar2TipoArchivo);
			this.jPanelParametrosAuxiliar3TipoArchivo.setLayout(gridaBagParametrosAuxiliar3TipoArchivo);
			this.jPanelParametrosAuxiliar4TipoArchivo.setLayout(gridaBagParametrosAuxiliar4TipoArchivo);
			//this.jPanelParametrosAuxiliar5TipoArchivo.setLayout(gridaBagParametrosAuxiliar2TipoArchivo);			
			
			
			
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoArchivo.add(this.jButtonRecargarInformacionTipoArchivo, this.gridBagConstraintsTipoArchivo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoArchivo.add(this.jComboBoxTiposPaginacionTipoArchivo, this.gridBagConstraintsTipoArchivo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoArchivo.add(this.jCheckBoxConAltoMaximoTablaTipoArchivo, this.gridBagConstraintsTipoArchivo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoArchivo.add(this.jComboBoxTiposArchivosReportesTipoArchivo, this.gridBagConstraintsTipoArchivo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoArchivo.add(this.jPanelParametrosAuxiliar1TipoArchivo, this.gridBagConstraintsTipoArchivo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoArchivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoArchivo.add(this.jComboBoxTiposReportesTipoArchivo, this.gridBagConstraintsTipoArchivo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoArchivo.add(this.jPanelParametrosAuxiliar4TipoArchivo, this.gridBagConstraintsTipoArchivo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoArchivo.add(this.jComboBoxTiposReportesTipoArchivo, this.gridBagConstraintsTipoArchivo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoArchivo.add(this.jCheckBoxGenerarReporteTipoArchivo, this.gridBagConstraintsTipoArchivo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoArchivo.add(this.jPanelParametrosAuxiliar2TipoArchivo, this.gridBagConstraintsTipoArchivo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoArchivo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoArchivo.add(this.jLabelAccionesTipoArchivo, this.gridBagConstraintsTipoArchivo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
				this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoArchivo.add(this.jButtonAbrirOrderByTipoArchivo, this.gridBagConstraintsTipoArchivo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoArchivo.add(this.jComboBoxTiposSeleccionarTipoArchivo, this.gridBagConstraintsTipoArchivo);			
			
			
			/*
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoArchivo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoArchivo.add(this.jCheckBoxSeleccionarTodosTipoArchivo, this.gridBagConstraintsTipoArchivo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoArchivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoArchivo.add(this.jCheckBoxSeleccionarTodosTipoArchivo, this.gridBagConstraintsTipoArchivo);															
				
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoArchivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoArchivo.add(this.jCheckBoxSeleccionadosTipoArchivo, this.gridBagConstraintsTipoArchivo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoArchivo.add(this.jPanelParametrosAuxiliar3TipoArchivo, this.gridBagConstraintsTipoArchivo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoArchivo.add(this.jComboBoxTiposRelacionesTipoArchivo, this.gridBagConstraintsTipoArchivo);
				
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoArchivo.add(this.jComboBoxTiposAccionesTipoArchivo, this.gridBagConstraintsTipoArchivo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoArchivo = new GridBagLayout();

			this.jScrollPanelDatosTipoArchivo.setLayout(gridaBagLayoutDatosTipoArchivo);
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = 0;
			this.gridBagConstraintsTipoArchivo.gridx = 0;
			
			this.jScrollPanelDatosTipoArchivo.add(this.jTableDatosTipoArchivo, this.gridBagConstraintsTipoArchivo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoArchivo.setViewportView(this.jTableDatosTipoArchivo);
		this.jTableDatosTipoArchivo.setFillsViewportHeight(true);
		this.jTableDatosTipoArchivo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoArchivo= new GridBagLayout();
		this.jPanelAccionesTipoArchivo.setLayout(gridaBagLayoutAccionesTipoArchivo);
		
		
		/*	
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = 0;
		this.gridBagConstraintsTipoArchivo.gridx = 0;
			
		this.jPanelAccionesTipoArchivo.add(this.jButtonNuevoTipoArchivo, this.gridBagConstraintsTipoArchivo);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoArchivo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoArchivo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();						
			this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoArchivo.gridx = 0;		
			//this.gridBagConstraintsTipoArchivo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoArchivo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoArchivo, this.gridBagConstraintsTipoArchivo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoArchivo.gridx = 0;		
		//this.gridBagConstraintsTipoArchivo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoArchivo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoArchivo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoArchivo, this.gridBagConstraintsTipoArchivo);								
		
		
		/*
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoArchivo, this.gridBagConstraintsTipoArchivo);
		*/		
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoArchivo.gridx =0;
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoArchivo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoArchivo, this.gridBagConstraintsTipoArchivo);
				
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoArchivo, this.gridBagConstraintsTipoArchivo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoArchivoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoArchivo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoArchivo.setLayout(gridaBagLayoutBusquedasParametrosTipoArchivo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoArchivo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoArchivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoArchivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoArchivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoArchivo, this.gridBagConstraintsTipoArchivo);
			
			
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
			
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoArchivo, this.gridBagConstraintsTipoArchivo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoArchivo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoArchivo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoArchivo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoArchivo.setName("jPanelReporteDinamicoTipoArchivo"); 
		
		this.jPanelReporteDinamicoTipoArchivo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoArchivo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoArchivo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoArchivo.setLayout(gridaBagLayoutReporteDinamicoTipoArchivo);
		
		
		this.jInternalFrameReporteDinamicoTipoArchivo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoArchivo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoArchivo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoArchivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoArchivo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoArchivo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoArchivo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoArchivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoArchivo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoArchivo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoArchivo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoArchivo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoArchivo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoArchivo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Archivos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoArchivo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoArchivo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoArchivo.add(this.jLabelColumnasSelectReporteTipoArchivo, this.gridBagConstraintsTipoArchivo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoArchivo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoArchivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoArchivo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoArchivo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoArchivo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoArchivo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoArchivo=new JScrollPane(this.jListColumnasSelectReporteTipoArchivo);
			
			this.jScrollColumnasSelectReporteTipoArchivo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoArchivo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoArchivo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoArchivo.add(this.jListColumnasSelectReporteTipoArchivo, this.gridBagConstraintsTipoArchivo);
		this.jPanelReporteDinamicoTipoArchivo.add(this.jScrollColumnasSelectReporteTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoArchivo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoArchivo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoArchivo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoArchivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoArchivo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoArchivo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoArchivo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoArchivo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoArchivo=new JScrollPane(this.jListRelacionesSelectReporteTipoArchivo);
			
			this.jScrollRelacionesSelectReporteTipoArchivo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoArchivo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoArchivo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoArchivo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoArchivo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoArchivo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoArchivo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoArchivo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoArchivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoArchivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoArchivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoArchivo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoArchivo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoArchivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoArchivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoArchivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoArchivo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoArchivo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoArchivo.add(this.jLabelGenerarExcelReporteDinamicoTipoArchivo, this.gridBagConstraintsTipoArchivo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoArchivo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoArchivo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoArchivo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoArchivo.setToolTipText("Generar EXCEL"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		//this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoArchivo.add(this.jButtonGenerarExcelReporteDinamicoTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoArchivo.add(this.jComboBoxTiposReportesDinamicoTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoArchivo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoArchivo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoArchivo.add(this.jLabelTiposArchivoReporteDinamicoTipoArchivo, this.gridBagConstraintsTipoArchivo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoArchivo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoArchivo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoArchivo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoArchivo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoArchivo.setToolTipText("Generar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoArchivo.add(this.jButtonGenerarReporteDinamicoTipoArchivo, this.gridBagConstraintsTipoArchivo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoArchivo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoArchivo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoArchivo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoArchivo.setToolTipText("Cancelar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoArchivo.add(this.jButtonCerrarReporteDinamicoTipoArchivo, this.gridBagConstraintsTipoArchivo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoArchivo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoArchivo= new JScrollPane(jPanelReporteDinamicoTipoArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoArchivo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoArchivo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoArchivo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Archivos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoArchivo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoArchivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoArchivo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoArchivo);
		this.jInternalFrameReporteDinamicoTipoArchivo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoArchivo, this.gridBagConstraintsTipoArchivo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoArchivo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoArchivo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoArchivo.setName("jPanelImportacionTipoArchivo"); 
		
		this.jPanelImportacionTipoArchivo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoArchivo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoArchivo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoArchivo.setLayout(gridaBagLayoutImportacionTipoArchivo);
		
		
		this.jInternalFrameImportacionTipoArchivo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoArchivo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoArchivo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoArchivo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoArchivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoArchivo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoArchivo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoArchivo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoArchivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoArchivo.setResizable(true);
	    this.jInternalFrameImportacionTipoArchivo.setClosable(true);
	    this.jInternalFrameImportacionTipoArchivo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoArchivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoArchivo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoArchivo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoArchivo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoArchivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoArchivo.setResizable(true);
	    this.jInternalFrameImportacionTipoArchivo.setClosable(true);
	    this.jInternalFrameImportacionTipoArchivo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoArchivo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoArchivo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoArchivo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Archivos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoArchivo = new JLabelMe();

		this.jLabelArchivoImportacionTipoArchivo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoArchivo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoArchivo.add(this.jLabelArchivoImportacionTipoArchivo, this.gridBagConstraintsTipoArchivo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoArchivo = new JFileChooser();		
		this.jFileChooserImportacionTipoArchivo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoArchivo = new JButtonMe();
		this.jButtonAbrirImportacionTipoArchivo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoArchivo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoArchivo.setToolTipText("Generar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoArchivo.add(this.jButtonAbrirImportacionTipoArchivo, this.gridBagConstraintsTipoArchivo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoArchivo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoArchivo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoArchivo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoArchivo.add(this.jLabelPathArchivoImportacionTipoArchivo, this.gridBagConstraintsTipoArchivo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoArchivo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoArchivo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoArchivo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoArchivo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoArchivo.add(this.jTextFieldPathArchivoImportacionTipoArchivo, this.gridBagConstraintsTipoArchivo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoArchivo = new JButtonMe();
		this.jButtonGenerarImportacionTipoArchivo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoArchivo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoArchivo.setToolTipText("Generar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoArchivo.add(this.jButtonGenerarImportacionTipoArchivo, this.gridBagConstraintsTipoArchivo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoArchivo = new JButtonMe();
		this.jButtonCerrarImportacionTipoArchivo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoArchivo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoArchivo.setToolTipText("Cancelar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoArchivo.add(this.jButtonCerrarImportacionTipoArchivo, this.gridBagConstraintsTipoArchivo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoArchivo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoArchivo= new JScrollPane(jPanelImportacionTipoArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoArchivo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoArchivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoArchivo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoArchivo);
		this.jInternalFrameImportacionTipoArchivo.getContentPane().add(this.jScrollPanelImportacionTipoArchivo, this.gridBagConstraintsTipoArchivo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoArchivo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoArchivo = new JButtonMe();
			this.jButtonAbrirOrderByTipoArchivo.setText("Orden");
			this.jButtonAbrirOrderByTipoArchivo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoArchivo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoArchivo";
			inputMap = this.jButtonAbrirOrderByTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoArchivo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoArchivo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoArchivo.setName("jPanelOrderByTipoArchivo"); 
			
			this.jPanelOrderByTipoArchivo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoArchivo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoArchivo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoArchivo.setLayout(gridaBagLayoutOrderByTipoArchivo);
			
			
			this.jTableDatosTipoArchivoOrderBy = new JTableMe();        
			this.jTableDatosTipoArchivoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoArchivoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoArchivoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoArchivoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoArchivoOrderBy.setViewportView(this.jTableDatosTipoArchivoOrderBy);
			this.jTableDatosTipoArchivoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoArchivoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoArchivo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoArchivo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoArchivo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoArchivo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoArchivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoArchivo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoArchivo.setTitle("Orden");
			this.jInternalFrameOrderByTipoArchivo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoArchivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoArchivo.setResizable(true);
			this.jInternalFrameOrderByTipoArchivo.setClosable(true);
			this.jInternalFrameOrderByTipoArchivo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoArchivo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoArchivo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoArchivo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Archivos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoArchivo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoArchivo.ipady =150;
				
			this.jPanelOrderByTipoArchivo.add(jScrollPanelDatosTipoArchivoOrderBy, this.gridBagConstraintsTipoArchivo);//this.jTableDatosTipoArchivoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoArchivo = new JButtonMe();
			this.jButtonCerrarOrderByTipoArchivo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoArchivo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoArchivo.setToolTipText("Cancelar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoArchivo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoArchivo.add(this.jButtonCerrarOrderByTipoArchivo, this.gridBagConstraintsTipoArchivo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoArchivo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoArchivo= new JScrollPane(jPanelOrderByTipoArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoArchivo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoArchivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoArchivo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoArchivo);
			
			this.jInternalFrameOrderByTipoArchivo.getContentPane().add(this.jScrollPanelOrderByTipoArchivo, this.gridBagConstraintsTipoArchivo);			
		
		} else {
			this.jButtonAbrirOrderByTipoArchivo = new JButtonMe();
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
			&& this.tipoarchivoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoArchivo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoArchivo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoArchivo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoArchivo.getRowHeight();//TipoArchivoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoArchivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoArchivo.isSelected()) {
					iHeightTable=TipoArchivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoArchivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoArchivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoArchivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoArchivo.isSelected()) {
					iHeightTable=TipoArchivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoArchivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoArchivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoArchivo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoArchivo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoArchivo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoArchivo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoArchivo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoArchivo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoArchivo!=null && this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoArchivo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoArchivo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoArchivo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoArchivo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoArchivo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoArchivo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoarchivoLogic.getTipoArchivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoarchivos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoArchivo> TraerTipoArchivoBeans(List<TipoArchivo> tipoarchivos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoArchivo tipoarchivo:tipoarchivos) {
					
				if(!(TipoArchivoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoArchivoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoarchivo.setsDetalleGeneralEntityReporte(TipoArchivoConstantesFunciones.getTipoArchivoDescripcion(tipoarchivo));
										
						
					
						
					
				} else  {
							
					//tipoarchivo.setsDetalleGeneralEntityReporte(tipoarchivo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoarchivobeans.add(tipoarchivobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoarchivos;
    }
	//PARA REPORTES FIN
}
