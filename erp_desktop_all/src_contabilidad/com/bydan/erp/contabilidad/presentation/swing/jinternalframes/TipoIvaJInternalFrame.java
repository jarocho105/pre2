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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.sris.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoIvaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoIvaJInternalFrame extends TipoIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoIva;
	
	protected JMenuBar jmenuBarTipoIva;
	
	protected JMenu jmenuTipoIva;
	protected JMenu jmenuDatosTipoIva;
	protected JMenu jmenuArchivoTipoIva;
	protected JMenu jmenuAccionesTipoIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIva;	
	protected GridBagConstraints gridBagConstraintsTipoIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoIvaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIvaSessionBean tipoivaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoIva> tipoivas;		
	public List<TipoIva> tipoivasEliminados;	
	public List<TipoIva> tipoivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoIva;		
	protected JButton jButtonAbrirOrderByTipoIva;
	
	
	//protected JPanel jPanelOrderByTipoIva;
	//public JScrollPane jScrollPanelOrderByTipoIva;	
	//protected JButton jButtonCerrarOrderByTipoIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoIvaLogic tipoivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoIva;
	public JScrollPane jScrollPanelDatosEdicionTipoIva;
	public JScrollPane jScrollPanelDatosGeneralTipoIva;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoIva;
	//public JScrollPane jScrollPanelImportacionTipoIva;
	
	
	
	protected JPanel jPanelAccionesTipoIva;
	
    protected JPanel jPanelPaginacionTipoIva;
    protected JPanel jPanelParametrosReportesTipoIva;
	protected JPanel jPanelParametrosReportesAccionesTipoIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoIva;
	protected JPanel jPanelParametrosAuxiliar2TipoIva;
	protected JPanel jPanelParametrosAuxiliar3TipoIva;
	protected JPanel jPanelParametrosAuxiliar4TipoIva;
	//protected JPanel jPanelParametrosAuxiliar5TipoIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoIva;
	//protected JPanel jPanelImportacionTipoIva;
	
	
	public JTable jTableDatosTipoIva;
	
	
	
	//public JTable jTableDatosTipoIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoIva;
	protected JButton jButtonDuplicarTipoIva;
	protected JButton jButtonCopiarTipoIva;
	protected JButton jButtonVerFormTipoIva;
	protected JButton jButtonNuevoRelacionesTipoIva;
	protected JButton jButtonModificarTipoIva;
	
    protected JButton jButtonGuardarCambiosTablaTipoIva;
	protected JButton jButtonCerrarTipoIva;
	
	
	protected JButton jButtonRecargarInformacionTipoIva;
	protected JButton jButtonProcesarInformacionTipoIva;
	
	
	protected JButton jButtonAnterioresTipoIva;
	protected JButton jButtonSiguientesTipoIva;
	protected JButton jButtonNuevoGuardarCambiosTipoIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoIva;
	//protected JButton jButtonCerrarReporteDinamicoTipoIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoIva;
	//protected JButton jButtonGenerarImportacionTipoIva;
	//protected JButton jButtonCerrarImportacionTipoIva;
	//protected JFileChooser jFileChooserImportacionTipoIva;
	//protected File fileImportacionTipoIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIva;
	protected JButton jButtonDuplicarToolBarTipoIva;
	protected JButton jButtonNuevoRelacionesToolBarTipoIva;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoIva;
	protected JButton jButtonCopiarToolBarTipoIva;
	protected JButton jButtonVerFormToolBarTipoIva;
	public JButton jButtonGuardarCambiosTablaToolBarTipoIva;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIva;
	protected JButton jButtonCerrarToolBarTipoIva;
	
	protected JButton jButtonRecargarInformacionToolBarTipoIva;
	protected JButton jButtonProcesarInformacionToolBarTipoIva;
	protected JButton jButtonAnterioresToolBarTipoIva;
	protected JButton jButtonSiguientesToolBarTipoIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoIva;
	protected JButton jButtonAbrirOrderByToolBarTipoIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIva;
	protected JMenuItem jMenuItemDuplicarTipoIva;
	protected JMenuItem jMenuItemNuevoRelacionesTipoIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoIva;
	protected JMenuItem jMenuItemCopiarTipoIva;
	protected JMenuItem jMenuItemVerFormTipoIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIva;
	protected JMenuItem jMenuItemCerrarTipoIva;
	protected JMenuItem jMenuItemDetalleCerrarTipoIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIva;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoIva;
	protected JMenuItem jMenuItemProcesarInformacionTipoIva;
	protected JMenuItem jMenuItemAnterioresTipoIva;
	protected JMenuItem jMenuItemSiguientesTipoIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIva;
	protected JMenuItem jMenuItemAbrirOrderByTipoIva;
	protected JMenuItem jMenuItemMostrarOcultarTipoIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoIva;
	protected JCheckBox jCheckBoxSeleccionadosTipoIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoIva;
	protected JCheckBox jCheckBoxConGraficoReporteTipoIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoIva;
	protected JTextField jTextFieldValorCampoGeneralTipoIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoIva;
	//public JList<Reporte> jListColumnasSelectReporteTipoIva;
	//public JScrollPane jScrollColumnasSelectReporteTipoIva;
	
	//public JLabel jLabelRelacionesSelectReporteTipoIva;
	//public JList<Reporte> jListRelacionesSelectReporteTipoIva;
	//public JScrollPane jScrollRelacionesSelectReporteTipoIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoIva;
	
		
	//public JLabel jLabelArchivoImportacionTipoIva;	
	//public JLabel jLabelPathArchivoImportacionTipoIva;
	//protected JTextField jTextFieldPathArchivoImportacionTipoIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoIva;
	
	//public JLabel jLabelColumnaCategoriaValorTipoIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoIva;
	
	//public JLabel jLabelColumnasValoresGraficoTipoIva;
	//public JList<Reporte> jListColumnasValoresGraficoTipoIva;
	//public JScrollPane jScrollColumnasValoresGraficoTipoIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoIva;	
	
	
	
	
	
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
	public TipoIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoIva)	{
		this.jButtonRecargarInformacionTipoIva = jButtonRecargarInformacionTipoIva;
	}
	
	public JButton getjButtonProcesarInformacionTipoIva() {
		return this.jButtonProcesarInformacionTipoIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIva)	{
		this.jButtonProcesarInformacionTipoIva = jButtonProcesarInformacionTipoIva;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoIva() {
		return this.jButtonRecargarInformacionTipoIva;
	}
	
	
	public List<TipoIva> gettipoivas() {
		return this.tipoivas;
	}

	public void settipoivas(List<TipoIva> tipoivas) {
		this.tipoivas = tipoivas;
	}
	
	public List<TipoIva> gettipoivasAux() {
		return this.tipoivasAux;
	}

	public void settipoivasAux(List<TipoIva> tipoivasAux) {
		this.tipoivasAux = tipoivasAux;
	}
	
	public List<TipoIva> gettipoivasEliminados() {
		return this.tipoivasEliminados;
	}

	public void setTipoIvasEliminados(List<TipoIva> tipoivasEliminados) {
		this.tipoivasEliminados = tipoivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoIva() {
		return jComboBoxTiposSeleccionarTipoIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoIva(
			JComboBox jComboBoxTiposSeleccionarTipoIva) {
		this.jComboBoxTiposSeleccionarTipoIva = jComboBoxTiposSeleccionarTipoIva;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoIva() {
		return jTextFieldValorCampoGeneralTipoIva;
	}

	public void setjTextFieldValorCampoGeneralTipoIva(
			JTextField jTextFieldValorCampoGeneralTipoIva) {
		this.jTextFieldValorCampoGeneralTipoIva = jTextFieldValorCampoGeneralTipoIva;
	}

	public void setBorderResaltarValorCampoGeneralTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoIva() {
		return this.jCheckBoxSeleccionarTodosTipoIva;
	}

	public void setjCheckBoxSeleccionarTodosTipoIva(
			JCheckBox jCheckBoxSeleccionarTodosTipoIva) {
		this.jCheckBoxSeleccionarTodosTipoIva = jCheckBoxSeleccionarTodosTipoIva;
	}

	public void setBorderResaltarSeleccionarTodosTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoIva() {
		return this.jCheckBoxSeleccionadosTipoIva;
	}

	public void setjCheckBoxSeleccionadosTipoIva(
			JCheckBox jCheckBoxSeleccionadosTipoIva) {
		this.jCheckBoxSeleccionadosTipoIva = jCheckBoxSeleccionadosTipoIva;
	}
	
	public void setBorderResaltarSeleccionadosTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoIva() {
		return this.jComboBoxTiposArchivosReportesTipoIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoIva(
			JComboBox jComboBoxTiposArchivosReportesTipoIva) {
		this.jComboBoxTiposArchivosReportesTipoIva = jComboBoxTiposArchivosReportesTipoIva;
	}

	public void setBorderResaltarTiposArchivosReportesTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoIva() {
		return this.jComboBoxTiposReportesTipoIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoIva(
			JComboBox jComboBoxTiposReportesTipoIva) {
		this.jComboBoxTiposReportesTipoIva = jComboBoxTiposReportesTipoIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoIva() {
	//	return jComboBoxTiposReportesDinamicoTipoIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoIva(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoIva) {
	//	this.jComboBoxTiposReportesDinamicoTipoIva = jComboBoxTiposReportesDinamicoTipoIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoIva = jComboBoxTiposArchivosReportesDinamicoTipoIva;
	//}
	
	public void setBorderResaltarTiposReportesTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoIva() {
		return this.jComboBoxTiposGraficosReportesTipoIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoIva(
			JComboBox jComboBoxTiposGraficosReportesTipoIva) {
		this.jComboBoxTiposGraficosReportesTipoIva = jComboBoxTiposGraficosReportesTipoIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoIva() {
		return this.jComboBoxTiposPaginacionTipoIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoIva(
			JComboBox jComboBoxTiposPaginacionTipoIva) {
		this.jComboBoxTiposPaginacionTipoIva = jComboBoxTiposPaginacionTipoIva;
	}
	
	public void setBorderResaltarTiposPaginacionTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoIva() {
		return this.jComboBoxTiposRelacionesTipoIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIva() {
		return this.jComboBoxTiposAccionesTipoIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIva(
			JComboBox jComboBoxTiposRelacionesTipoIva) {
		this.jComboBoxTiposRelacionesTipoIva = jComboBoxTiposRelacionesTipoIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIva(
			JComboBox jComboBoxTiposAccionesTipoIva) {
		this.jComboBoxTiposAccionesTipoIva = jComboBoxTiposAccionesTipoIva;
	}
	
	public void setBorderResaltarTiposRelacionesTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoIva() {
	//	return jCheckBoxConGraficoDinamicoTipoIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoIva) {
	//	this.jCheckBoxConGraficoDinamicoTipoIva = jCheckBoxConGraficoDinamicoTipoIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoIva .setBorder(borderResaltar);		
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
		this.tipoivaSessionBean=new TipoIvaSessionBean();
		
		this.tipoivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Iva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoIva,this.jTtoolBarTipoIva,
							"nuevo","nuevo","Nuevo"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoIva,this.jTtoolBarTipoIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoIva,this.jTtoolBarTipoIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoIva,this.jTtoolBarTipoIva,
							"duplicar","duplicar","Duplicar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoIva,this.jTtoolBarTipoIva,
							"copiar","copiar","Copiar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoIva,this.jTtoolBarTipoIva,
							"ver_form","ver_form","Ver"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIva,this.jTtoolBarTipoIva,
							"recargar","recargar","Recargar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIva,this.jTtoolBarTipoIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIva,this.jTtoolBarTipoIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoIva,this.jTtoolBarTipoIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoIva,this.jTtoolBarTipoIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoIva,this.jTtoolBarTipoIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoIva,this.jTtoolBarTipoIva,
							"cerrar","cerrar","Salir"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoIva;
			
				this.jButtonProcesarInformacionToolBarTipoIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoIva;
				
		//protected JButton jButtonModificarToolBarTipoIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoIva=new JMenuMe("General");
		this.jmenuArchivoTipoIva=new JMenuMe("Archivo");
		this.jmenuAccionesTipoIva=new JMenuMe("Acciones");
		this.jmenuDatosTipoIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoIva.add(this.jMenuItemCerrarTipoIva);
			
			this.jmenuAccionesTipoIva.add(this.jMenuItemNuevoTipoIva);
			this.jmenuAccionesTipoIva.add(this.jMenuItemNuevoGuardarCambiosTipoIva);
			this.jmenuAccionesTipoIva.add(this.jMenuItemNuevoRelacionesTipoIva);
			this.jmenuAccionesTipoIva.add(this.jMenuItemGuardarCambiosTablaTipoIva);		
			this.jmenuAccionesTipoIva.add(this.jMenuItemDuplicarTipoIva);		
			this.jmenuAccionesTipoIva.add(this.jMenuItemCopiarTipoIva);		
			this.jmenuAccionesTipoIva.add(this.jMenuItemVerFormTipoIva);		
			
			this.jmenuDatosTipoIva.add(this.jMenuItemRecargarInformacionTipoIva);				
			this.jmenuDatosTipoIva.add(this.jMenuItemAnterioresTipoIva);				
			this.jmenuDatosTipoIva.add(this.jMenuItemSiguientesTipoIva);				
			this.jmenuDatosTipoIva.add(this.jMenuItemAbrirOrderByTipoIva);				
			this.jmenuDatosTipoIva.add(this.jMenuItemMostrarOcultarTipoIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoIva.add(this.jMenuItemGuardarCambiosTipoIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoIva.add(this.jmenuArchivoTipoIva);		
			this.jmenuBarTipoIva.add(this.jmenuAccionesTipoIva);		
			this.jmenuBarTipoIva.add(this.jmenuDatosTipoIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoIva() {
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
			//this.jInternalFrameDetalleTipoIva = new TipoIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Iva DATOS");
			this.jInternalFrameDetalleFormTipoIva = new TipoIvaDetalleFormJInternalFrame(jDesktopPane,this.tipoivaSessionBean.getConGuardarRelaciones(),this.tipoivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoIva = null;//new TipoIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIva= new GridBagLayout();
		
		
		this.jTableDatosTipoIva = new JTableMe();      
		
		String sToolTipTipoIva="";
		sToolTipTipoIva=TipoIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIva+="(Contabilidad.TipoIva)";
		}
		
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoIva.setToolTipText(sToolTipTipoIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoIva);
		this.jTableDatosTipoIva.setAutoCreateRowSorter(true);
		this.jTableDatosTipoIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoIva.setRowSelectionAllowed(true);
		this.jTableDatosTipoIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoIva = new JButtonMe();
		this.jButtonDuplicarTipoIva = new JButtonMe();
		this.jButtonCopiarTipoIva = new JButtonMe();
		this.jButtonVerFormTipoIva = new JButtonMe();
		this.jButtonNuevoRelacionesTipoIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoIva = new JButtonMe();
		this.jButtonCerrarTipoIva = new JButtonMe();
		
		this.jScrollPanelDatosTipoIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Iva";
		
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIva.setToolTipText("Acciones");
        this.jPanelAccionesTipoIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoIva=new ReporteDinamicoJInternalFrame(TipoIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoIva=new ImportacionJInternalFrame(TipoIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoIva = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoIva.setText("Orden");
		this.jButtonAbrirOrderByTipoIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIva,false,this);
			
			//this.cargarOrderByTipoIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIva,true,this);
			
			//this.cargarOrderByTipoIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoIva.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoIva.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoIva.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoIva.setText("Nuevo");
		this.jButtonDuplicarTipoIva.setText("Duplicar");
		this.jButtonCopiarTipoIva.setText("Copiar");
		this.jButtonVerFormTipoIva.setText("Ver");
		this.jButtonNuevoRelacionesTipoIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoIva.setText("Guardar");
		this.jButtonCerrarTipoIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIva,"nuevo_button","Nuevo",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoIva,"duplicar_button","Duplicar",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoIva,"copiar_button","Copiar",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoIva,"ver_form","Ver",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoIva,"nuevorelaciones_button","Nuevo Rel",this.tipoivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIva,"guardarcambiostabla_button","Guardar",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIva,"cerrar_button","Salir",this.tipoivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoIva.setToolTipText("Nuevo"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoIva.setToolTipText("Duplicar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoIva.setToolTipText("Copiar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoIva.setToolTipText("Ver"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoIva.setToolTipText("Nuevo Rel"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoIva.setToolTipText("Guardar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIva.setToolTipText("Salir"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIva";
		inputMap = this.jButtonNuevoTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoIva";
		inputMap = this.jButtonDuplicarTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoIva"));
		
		//COPIAR
		sMapKey = "CopiarTipoIva";
		inputMap = this.jButtonCopiarTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoIva"));
		
		//VEr FORM
		sMapKey = "VerFormTipoIva";
		inputMap = this.jButtonVerFormTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoIva";
		inputMap = this.jButtonNuevoRelacionesTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoIva";
		inputMap = this.jButtonModificarTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoIva";
		inputMap = this.jButtonCerrarTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIva";
		inputMap = this.jButtonGuardarCambiosTablaTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoIva.setName("jPanelParametrosReportesTipoIva"); 
		
		this.jPanelParametrosReportesAccionesTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoIva.setName("jPanelParametrosReportesAccionesTipoIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoIva = new JButtonMe();
		this.jButtonRecargarInformacionTipoIva.setText("Recargar");
		this.jButtonRecargarInformacionTipoIva.setToolTipText("Recargar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoIva = new JButtonMe();
		this.jButtonProcesarInformacionTipoIva.setText("Procesar");
		this.jButtonProcesarInformacionTipoIva.setToolTipText("Procesar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoIva.setVisible(false);
			
		this.jButtonProcesarInformacionTipoIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIva.setText("TIPO");       
		this.jComboBoxTiposReportesTipoIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoIva.setText("Accion");
		this.jComboBoxTiposRelacionesTipoIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIva.setText("Accion");
		this.jComboBoxTiposAccionesTipoIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoIva.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoIva = new JLabelMe();
		
		this.jLabelAccionesTipoIva.setText("Acciones");		
		this.jLabelAccionesTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoIva = new JButtonMe();
		//this.jButtonAnterioresTipoIva.setText("<<");
        this.jButtonAnterioresTipoIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoIva = new JButtonMe();
		//this.jButtonSiguientesTipoIva.setText(">>");
        this.jButtonSiguientesTipoIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoIva,"nuevoguardarcambios_button","Nue",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoIva";
		inputMap = this.jButtonNuevoGuardarCambiosTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoIva";
		inputMap = this.jButtonRecargarInformacionTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoIva";
		inputMap = this.jButtonSiguientesTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoIva";
		inputMap = this.jButtonAnterioresTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoIva.setMinimumSize(new Dimension(this.getWidth(),TipoIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIva.setMaximumSize(new Dimension(this.getWidth(),TipoIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIva.setPreferredSize(new Dimension(this.getWidth(),TipoIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoIva = new GridBagLayout();

			this.jPanelPaginacionTipoIva.setLayout(gridaBagLayoutPaginacionTipoIva);						
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = 0;
			this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoIva.add(this.jButtonAnterioresTipoIva, this.gridBagConstraintsTipoIva);
					
						
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIva.gridy = 0;
			
			this.jPanelPaginacionTipoIva.add(this.jButtonNuevoGuardarCambiosTipoIva, this.gridBagConstraintsTipoIva);
						
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIva.gridy = 0;
			this.jPanelPaginacionTipoIva.add(this.jButtonSiguientesTipoIva, this.gridBagConstraintsTipoIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = 1;
			this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIva.add(this.jButtonNuevoTipoIva, this.gridBagConstraintsTipoIva);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoIva = new GridBagConstraints();
				this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIva.gridy = 1;
				this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoIva.add(this.jButtonNuevoRelacionesTipoIva, this.gridBagConstraintsTipoIva);
			}
			
			
			if(!this.tipoivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoIva = new GridBagConstraints();
				this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIva.gridy = 1;
				this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoIva.add(this.jButtonGuardarCambiosTablaTipoIva, this.gridBagConstraintsTipoIva);
			}
			
			
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = 1;
			this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIva.add(this.jButtonDuplicarTipoIva, this.gridBagConstraintsTipoIva);
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = 1;
			this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIva.add(this.jButtonCopiarTipoIva, this.gridBagConstraintsTipoIva);
		
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = 1;
			this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIva.add(this.jButtonVerFormTipoIva, this.gridBagConstraintsTipoIva);
		
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = 1;
			this.gridBagConstraintsTipoIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoIva.add(this.jButtonCerrarTipoIva, this.gridBagConstraintsTipoIva);
		
		
		
		this.jButtonRecargarInformacionTipoIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoIva.setLayout(gridaBagParametrosReportesTipoIva);
			this.jPanelParametrosReportesAccionesTipoIva.setLayout(gridaBagParametrosReportesAccionesTipoIva);
			
			
			this.jPanelParametrosAuxiliar1TipoIva.setLayout(gridaBagParametrosAuxiliar1TipoIva);
			this.jPanelParametrosAuxiliar2TipoIva.setLayout(gridaBagParametrosAuxiliar2TipoIva);
			this.jPanelParametrosAuxiliar3TipoIva.setLayout(gridaBagParametrosAuxiliar3TipoIva);
			this.jPanelParametrosAuxiliar4TipoIva.setLayout(gridaBagParametrosAuxiliar4TipoIva);
			//this.jPanelParametrosAuxiliar5TipoIva.setLayout(gridaBagParametrosAuxiliar2TipoIva);			
			
			
			
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIva.add(this.jButtonRecargarInformacionTipoIva, this.gridBagConstraintsTipoIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIva.add(this.jComboBoxTiposPaginacionTipoIva, this.gridBagConstraintsTipoIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIva.add(this.jCheckBoxConAltoMaximoTablaTipoIva, this.gridBagConstraintsTipoIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIva.add(this.jComboBoxTiposArchivosReportesTipoIva, this.gridBagConstraintsTipoIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIva.add(this.jPanelParametrosAuxiliar1TipoIva, this.gridBagConstraintsTipoIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoIva.add(this.jComboBoxTiposReportesTipoIva, this.gridBagConstraintsTipoIva);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIva.add(this.jPanelParametrosAuxiliar4TipoIva, this.gridBagConstraintsTipoIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIva.add(this.jComboBoxTiposReportesTipoIva, this.gridBagConstraintsTipoIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIva.add(this.jCheckBoxGenerarReporteTipoIva, this.gridBagConstraintsTipoIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIva.add(this.jPanelParametrosAuxiliar2TipoIva, this.gridBagConstraintsTipoIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIva.add(this.jLabelAccionesTipoIva, this.gridBagConstraintsTipoIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoIva = new GridBagConstraints();
				this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoIva.add(this.jButtonAbrirOrderByTipoIva, this.gridBagConstraintsTipoIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIva.add(this.jComboBoxTiposSeleccionarTipoIva, this.gridBagConstraintsTipoIva);			
			
			
			/*
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIva.add(this.jCheckBoxSeleccionarTodosTipoIva, this.gridBagConstraintsTipoIva);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIva.add(this.jCheckBoxSeleccionarTodosTipoIva, this.gridBagConstraintsTipoIva);															
				
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIva.add(this.jCheckBoxSeleccionadosTipoIva, this.gridBagConstraintsTipoIva);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIva.add(this.jPanelParametrosAuxiliar3TipoIva, this.gridBagConstraintsTipoIva);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIva.add(this.jComboBoxTiposRelacionesTipoIva, this.gridBagConstraintsTipoIva);
				
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIva.add(this.jComboBoxTiposAccionesTipoIva, this.gridBagConstraintsTipoIva);
	
				
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIva.add(this.jTextFieldValorCampoGeneralTipoIva, this.gridBagConstraintsTipoIva);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoIva = new GridBagLayout();

			this.jScrollPanelDatosTipoIva.setLayout(gridaBagLayoutDatosTipoIva);
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = 0;
			this.gridBagConstraintsTipoIva.gridx = 0;
			
			this.jScrollPanelDatosTipoIva.add(this.jTableDatosTipoIva, this.gridBagConstraintsTipoIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoIva.setViewportView(this.jTableDatosTipoIva);
		this.jTableDatosTipoIva.setFillsViewportHeight(true);
		this.jTableDatosTipoIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoIva= new GridBagLayout();
		this.jPanelAccionesTipoIva.setLayout(gridaBagLayoutAccionesTipoIva);
		
		
		/*	
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = 0;
		this.gridBagConstraintsTipoIva.gridx = 0;
			
		this.jPanelAccionesTipoIva.add(this.jButtonNuevoTipoIva, this.gridBagConstraintsTipoIva);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIva = new GridBagConstraints();						
			this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIva.gridx = 0;		
			//this.gridBagConstraintsTipoIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoIva, this.gridBagConstraintsTipoIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoIva.gridx = 0;		
		//this.gridBagConstraintsTipoIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoIva, this.gridBagConstraintsTipoIva);								
		
		
		/*
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoIva, this.gridBagConstraintsTipoIva);
		*/		
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIva.gridx =0;
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIva, this.gridBagConstraintsTipoIva);
				
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoIva, this.gridBagConstraintsTipoIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIva = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoIva.setLayout(gridaBagLayoutBusquedasParametrosTipoIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIva, this.gridBagConstraintsTipoIva);
			
			
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIva, this.gridBagConstraintsTipoIva);
		
			
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIva, this.gridBagConstraintsTipoIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoIva.setName("jPanelReporteDinamicoTipoIva"); 
		
		this.jPanelReporteDinamicoTipoIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoIva.setLayout(gridaBagLayoutReporteDinamicoTipoIva);
		
		
		this.jInternalFrameReporteDinamicoTipoIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ivas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoIva = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIva.add(this.jLabelColumnasSelectReporteTipoIva, this.gridBagConstraintsTipoIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoIva = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoIva=new JScrollPane(this.jListColumnasSelectReporteTipoIva);
			
			this.jScrollColumnasSelectReporteTipoIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIva.add(this.jListColumnasSelectReporteTipoIva, this.gridBagConstraintsTipoIva);
		this.jPanelReporteDinamicoTipoIva.add(this.jScrollColumnasSelectReporteTipoIva, this.gridBagConstraintsTipoIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIva.add(this.jLabelRelacionesSelectReporteTipoIva, this.gridBagConstraintsTipoIva);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoIva=new JScrollPane(this.jListRelacionesSelectReporteTipoIva);
			
			this.jScrollRelacionesSelectReporteTipoIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIva.add(this.jListRelacionesSelectReporteTipoIva, this.gridBagConstraintsTipoIva);
		this.jPanelReporteDinamicoTipoIva.add(this.jScrollRelacionesSelectReporteTipoIva, this.gridBagConstraintsTipoIva);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIva.add(this.jLabelGenerarExcelReporteDinamicoTipoIva, this.gridBagConstraintsTipoIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoIva.setToolTipText("Generar EXCEL"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoIva.add(this.jButtonGenerarExcelReporteDinamicoTipoIva, this.gridBagConstraintsTipoIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIva.add(this.jComboBoxTiposReportesDinamicoTipoIva, this.gridBagConstraintsTipoIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIva.add(this.jLabelTiposArchivoReporteDinamicoTipoIva, this.gridBagConstraintsTipoIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIva.add(this.jComboBoxTiposArchivosReportesDinamicoTipoIva, this.gridBagConstraintsTipoIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoIva.setToolTipText("Generar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIva.add(this.jButtonGenerarReporteDinamicoTipoIva, this.gridBagConstraintsTipoIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoIva.setToolTipText("Cancelar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIva.add(this.jButtonCerrarReporteDinamicoTipoIva, this.gridBagConstraintsTipoIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoIva= new JScrollPane(jPanelReporteDinamicoTipoIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ivas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoIva);
		this.jInternalFrameReporteDinamicoTipoIva.getContentPane().add(this.jScrollPanelReporteDinamicoTipoIva, this.gridBagConstraintsTipoIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoIva.setName("jPanelImportacionTipoIva"); 
		
		this.jPanelImportacionTipoIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoIva.setLayout(gridaBagLayoutImportacionTipoIva);
		
		
		this.jInternalFrameImportacionTipoIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIva.setResizable(true);
	    this.jInternalFrameImportacionTipoIva.setClosable(true);
	    this.jInternalFrameImportacionTipoIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIva.setResizable(true);
	    this.jInternalFrameImportacionTipoIva.setClosable(true);
	    this.jInternalFrameImportacionTipoIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ivas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoIva = new JLabelMe();

		this.jLabelArchivoImportacionTipoIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIva.add(this.jLabelArchivoImportacionTipoIva, this.gridBagConstraintsTipoIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoIva = new JFileChooser();		
		this.jFileChooserImportacionTipoIva.setToolTipText("ESCOGER ARCHIVO"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoIva = new JButtonMe();
		this.jButtonAbrirImportacionTipoIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoIva.setToolTipText("Generar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIva.add(this.jButtonAbrirImportacionTipoIva, this.gridBagConstraintsTipoIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoIva = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIva.add(this.jLabelPathArchivoImportacionTipoIva, this.gridBagConstraintsTipoIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIva.add(this.jTextFieldPathArchivoImportacionTipoIva, this.gridBagConstraintsTipoIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoIva = new JButtonMe();
		this.jButtonGenerarImportacionTipoIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoIva.setToolTipText("Generar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIva.add(this.jButtonGenerarImportacionTipoIva, this.gridBagConstraintsTipoIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoIva = new JButtonMe();
		this.jButtonCerrarImportacionTipoIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoIva.setToolTipText("Cancelar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIva.add(this.jButtonCerrarImportacionTipoIva, this.gridBagConstraintsTipoIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoIva = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoIva= new JScrollPane(jPanelImportacionTipoIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoIva.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoIva);
		this.jInternalFrameImportacionTipoIva.getContentPane().add(this.jScrollPanelImportacionTipoIva, this.gridBagConstraintsTipoIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoIva = new JButtonMe();
			this.jButtonAbrirOrderByTipoIva.setText("Orden");
			this.jButtonAbrirOrderByTipoIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoIva";
			inputMap = this.jButtonAbrirOrderByTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoIva"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoIva.setName("jPanelOrderByTipoIva"); 
			
			this.jPanelOrderByTipoIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoIva.setLayout(gridaBagLayoutOrderByTipoIva);
			
			
			this.jTableDatosTipoIvaOrderBy = new JTableMe();        
			this.jTableDatosTipoIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoIvaOrderBy.setViewportView(this.jTableDatosTipoIvaOrderBy);
			this.jTableDatosTipoIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoIva.setTitle("Orden");
			this.jInternalFrameOrderByTipoIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoIva.setResizable(true);
			this.jInternalFrameOrderByTipoIva.setClosable(true);
			this.jInternalFrameOrderByTipoIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ivas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoIva.ipady =150;
				
			this.jPanelOrderByTipoIva.add(jScrollPanelDatosTipoIvaOrderBy, this.gridBagConstraintsTipoIva);//this.jTableDatosTipoIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoIva = new JButtonMe();
			this.jButtonCerrarOrderByTipoIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoIva.setToolTipText("Cancelar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoIva.add(this.jButtonCerrarOrderByTipoIva, this.gridBagConstraintsTipoIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoIva = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoIva= new JScrollPane(jPanelOrderByTipoIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoIva);
			
			this.jInternalFrameOrderByTipoIva.getContentPane().add(this.jScrollPanelOrderByTipoIva, this.gridBagConstraintsTipoIva);			
		
		} else {
			this.jButtonAbrirOrderByTipoIva = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoIva.getRowHeight();//TipoIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIva.isSelected()) {
					iHeightTable=TipoIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIva.isSelected()) {
					iHeightTable=TipoIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoIva!=null && this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoivaLogic.getTipoIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoIva> TraerTipoIvaBeans(List<TipoIva> tipoivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoIva tipoiva:tipoivas) {
					
				if(!(TipoIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoiva.setsDetalleGeneralEntityReporte(TipoIvaConstantesFunciones.getTipoIvaDescripcion(tipoiva));
										
						
					
					

					if(tipoiva.getTransaccionLocals()!=null && Funciones.existeClass(classes,TransaccionLocal.class)) {
						try{tipoiva.settransaccionlocalsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionLocalJInternalFrame.TraerTransaccionLocalBeans(tipoiva.getTransaccionLocals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoiva.getFacturaDiarios()!=null && Funciones.existeClass(classes,FacturaDiario.class)) {
						try{tipoiva.setfacturadiariosDescripcionReporte(new JRBeanCollectionDataSource(FacturaDiarioJInternalFrame.TraerFacturaDiarioBeans(tipoiva.getFacturaDiarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoiva.setsDetalleGeneralEntityReporte(tipoiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoivabeans.add(tipoivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoivas;
    }
	//PARA REPORTES FIN
}
