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
import com.bydan.erp.seguridad.util.TipoTeclaMascaraConstantesFunciones;

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
public class TipoTeclaMascaraJInternalFrame extends TipoTeclaMascaraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoTeclaMascara;
	
	protected JMenuBar jmenuBarTipoTeclaMascara;
	
	protected JMenu jmenuTipoTeclaMascara;
	protected JMenu jmenuDatosTipoTeclaMascara;
	protected JMenu jmenuArchivoTipoTeclaMascara;
	protected JMenu jmenuAccionesTipoTeclaMascara;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTeclaMascara;	
	protected GridBagConstraints gridBagConstraintsTipoTeclaMascara;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoTeclaMascaraDetalleFormJInternalFrame jInternalFrameDetalleFormTipoTeclaMascara;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoTeclaMascara;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoTeclaMascara;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoTeclaMascara> tipoteclamascaras;		
	public List<TipoTeclaMascara> tipoteclamascarasEliminados;	
	public List<TipoTeclaMascara> tipoteclamascarasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoTeclaMascara;		
	protected JButton jButtonAbrirOrderByTipoTeclaMascara;
	
	
	//protected JPanel jPanelOrderByTipoTeclaMascara;
	//public JScrollPane jScrollPanelOrderByTipoTeclaMascara;	
	//protected JButton jButtonCerrarOrderByTipoTeclaMascara;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoTeclaMascaraLogic tipoteclamascaraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoTeclaMascara;
	public JScrollPane jScrollPanelDatosEdicionTipoTeclaMascara;
	public JScrollPane jScrollPanelDatosGeneralTipoTeclaMascara;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoTeclaMascaraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoTeclaMascara;
	//public JScrollPane jScrollPanelImportacionTipoTeclaMascara;
	
	
	
	protected JPanel jPanelAccionesTipoTeclaMascara;
	
    protected JPanel jPanelPaginacionTipoTeclaMascara;
    protected JPanel jPanelParametrosReportesTipoTeclaMascara;
	protected JPanel jPanelParametrosReportesAccionesTipoTeclaMascara;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoTeclaMascara;
	protected JPanel jPanelParametrosAuxiliar2TipoTeclaMascara;
	protected JPanel jPanelParametrosAuxiliar3TipoTeclaMascara;
	protected JPanel jPanelParametrosAuxiliar4TipoTeclaMascara;
	//protected JPanel jPanelParametrosAuxiliar5TipoTeclaMascara;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoTeclaMascara;
	//protected JPanel jPanelImportacionTipoTeclaMascara;
	
	
	public JTable jTableDatosTipoTeclaMascara;
	
	
	
	//public JTable jTableDatosTipoTeclaMascaraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoTeclaMascara;
	protected JButton jButtonDuplicarTipoTeclaMascara;
	protected JButton jButtonCopiarTipoTeclaMascara;
	protected JButton jButtonVerFormTipoTeclaMascara;
	protected JButton jButtonNuevoRelacionesTipoTeclaMascara;
	protected JButton jButtonModificarTipoTeclaMascara;
	
    protected JButton jButtonGuardarCambiosTablaTipoTeclaMascara;
	protected JButton jButtonCerrarTipoTeclaMascara;
	
	
	protected JButton jButtonRecargarInformacionTipoTeclaMascara;
	protected JButton jButtonProcesarInformacionTipoTeclaMascara;
	
	
	protected JButton jButtonAnterioresTipoTeclaMascara;
	protected JButton jButtonSiguientesTipoTeclaMascara;
	protected JButton jButtonNuevoGuardarCambiosTipoTeclaMascara;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoTeclaMascara;
	//protected JButton jButtonCerrarReporteDinamicoTipoTeclaMascara;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoTeclaMascara;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoTeclaMascara;
	//protected JButton jButtonGenerarImportacionTipoTeclaMascara;
	//protected JButton jButtonCerrarImportacionTipoTeclaMascara;
	//protected JFileChooser jFileChooserImportacionTipoTeclaMascara;
	//protected File fileImportacionTipoTeclaMascara;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTeclaMascara;
	protected JButton jButtonDuplicarToolBarTipoTeclaMascara;
	protected JButton jButtonNuevoRelacionesToolBarTipoTeclaMascara;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoTeclaMascara;
	protected JButton jButtonCopiarToolBarTipoTeclaMascara;
	protected JButton jButtonVerFormToolBarTipoTeclaMascara;
	public JButton jButtonGuardarCambiosTablaToolBarTipoTeclaMascara;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTeclaMascara;
	protected JButton jButtonCerrarToolBarTipoTeclaMascara;
	
	protected JButton jButtonRecargarInformacionToolBarTipoTeclaMascara;
	protected JButton jButtonProcesarInformacionToolBarTipoTeclaMascara;
	protected JButton jButtonAnterioresToolBarTipoTeclaMascara;
	protected JButton jButtonSiguientesToolBarTipoTeclaMascara;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoTeclaMascara;
	protected JButton jButtonAbrirOrderByToolBarTipoTeclaMascara;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTeclaMascara;
	protected JMenuItem jMenuItemDuplicarTipoTeclaMascara;
	protected JMenuItem jMenuItemNuevoRelacionesTipoTeclaMascara;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoTeclaMascara;
	protected JMenuItem jMenuItemCopiarTipoTeclaMascara;
	protected JMenuItem jMenuItemVerFormTipoTeclaMascara;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTeclaMascara;
	protected JMenuItem jMenuItemCerrarTipoTeclaMascara;
	protected JMenuItem jMenuItemDetalleCerrarTipoTeclaMascara;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoTeclaMascara;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTeclaMascara;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoTeclaMascara;
	protected JMenuItem jMenuItemProcesarInformacionTipoTeclaMascara;
	protected JMenuItem jMenuItemAnterioresTipoTeclaMascara;
	protected JMenuItem jMenuItemSiguientesTipoTeclaMascara;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTeclaMascara;
	protected JMenuItem jMenuItemAbrirOrderByTipoTeclaMascara;
	protected JMenuItem jMenuItemMostrarOcultarTipoTeclaMascara;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTeclaMascara;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoTeclaMascara;
	protected JCheckBox jCheckBoxSeleccionadosTipoTeclaMascara;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoTeclaMascara;
	protected JCheckBox jCheckBoxConGraficoReporteTipoTeclaMascara;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoTeclaMascara;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoTeclaMascara;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoTeclaMascara;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoTeclaMascara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoTeclaMascara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTeclaMascara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTeclaMascara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoTeclaMascara;
	protected JTextField jTextFieldValorCampoGeneralTipoTeclaMascara;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoTeclaMascara;
	//public JList<Reporte> jListColumnasSelectReporteTipoTeclaMascara;
	//public JScrollPane jScrollColumnasSelectReporteTipoTeclaMascara;
	
	//public JLabel jLabelRelacionesSelectReporteTipoTeclaMascara;
	//public JList<Reporte> jListRelacionesSelectReporteTipoTeclaMascara;
	//public JScrollPane jScrollRelacionesSelectReporteTipoTeclaMascara;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoTeclaMascara;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoTeclaMascara;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoTeclaMascara;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoTeclaMascara;
	
		
	//public JLabel jLabelArchivoImportacionTipoTeclaMascara;	
	//public JLabel jLabelPathArchivoImportacionTipoTeclaMascara;
	//protected JTextField jTextFieldPathArchivoImportacionTipoTeclaMascara;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoTeclaMascara;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoTeclaMascara;
	
	//public JLabel jLabelColumnaCategoriaValorTipoTeclaMascara;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoTeclaMascara;
	
	//public JLabel jLabelColumnasValoresGraficoTipoTeclaMascara;
	//public JList<Reporte> jListColumnasValoresGraficoTipoTeclaMascara;
	//public JScrollPane jScrollColumnasValoresGraficoTipoTeclaMascara;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoTeclaMascara;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoTeclaMascara;	
	
	
	
	
	
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
	public TipoTeclaMascaraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTeclaMascaraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTeclaMascaraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTeclaMascaraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoTeclaMascara)	{
		this.jButtonRecargarInformacionTipoTeclaMascara = jButtonRecargarInformacionTipoTeclaMascara;
	}
	
	public JButton getjButtonProcesarInformacionTipoTeclaMascara() {
		return this.jButtonProcesarInformacionTipoTeclaMascara;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTeclaMascara)	{
		this.jButtonProcesarInformacionTipoTeclaMascara = jButtonProcesarInformacionTipoTeclaMascara;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoTeclaMascara() {
		return this.jButtonRecargarInformacionTipoTeclaMascara;
	}
	
	
	public List<TipoTeclaMascara> gettipoteclamascaras() {
		return this.tipoteclamascaras;
	}

	public void settipoteclamascaras(List<TipoTeclaMascara> tipoteclamascaras) {
		this.tipoteclamascaras = tipoteclamascaras;
	}
	
	public List<TipoTeclaMascara> gettipoteclamascarasAux() {
		return this.tipoteclamascarasAux;
	}

	public void settipoteclamascarasAux(List<TipoTeclaMascara> tipoteclamascarasAux) {
		this.tipoteclamascarasAux = tipoteclamascarasAux;
	}
	
	public List<TipoTeclaMascara> gettipoteclamascarasEliminados() {
		return this.tipoteclamascarasEliminados;
	}

	public void setTipoTeclaMascarasEliminados(List<TipoTeclaMascara> tipoteclamascarasEliminados) {
		this.tipoteclamascarasEliminados = tipoteclamascarasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoTeclaMascara() {
		return jComboBoxTiposSeleccionarTipoTeclaMascara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoTeclaMascara(
			JComboBox jComboBoxTiposSeleccionarTipoTeclaMascara) {
		this.jComboBoxTiposSeleccionarTipoTeclaMascara = jComboBoxTiposSeleccionarTipoTeclaMascara;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoTeclaMascara() {
		return jTextFieldValorCampoGeneralTipoTeclaMascara;
	}

	public void setjTextFieldValorCampoGeneralTipoTeclaMascara(
			JTextField jTextFieldValorCampoGeneralTipoTeclaMascara) {
		this.jTextFieldValorCampoGeneralTipoTeclaMascara = jTextFieldValorCampoGeneralTipoTeclaMascara;
	}

	public void setBorderResaltarValorCampoGeneralTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoTeclaMascara .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoTeclaMascara() {
		return this.jCheckBoxSeleccionarTodosTipoTeclaMascara;
	}

	public void setjCheckBoxSeleccionarTodosTipoTeclaMascara(
			JCheckBox jCheckBoxSeleccionarTodosTipoTeclaMascara) {
		this.jCheckBoxSeleccionarTodosTipoTeclaMascara = jCheckBoxSeleccionarTodosTipoTeclaMascara;
	}

	public void setBorderResaltarSeleccionarTodosTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoTeclaMascara() {
		return this.jCheckBoxSeleccionadosTipoTeclaMascara;
	}

	public void setjCheckBoxSeleccionadosTipoTeclaMascara(
			JCheckBox jCheckBoxSeleccionadosTipoTeclaMascara) {
		this.jCheckBoxSeleccionadosTipoTeclaMascara = jCheckBoxSeleccionadosTipoTeclaMascara;
	}
	
	public void setBorderResaltarSeleccionadosTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoTeclaMascara() {
		return this.jComboBoxTiposArchivosReportesTipoTeclaMascara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoTeclaMascara(
			JComboBox jComboBoxTiposArchivosReportesTipoTeclaMascara) {
		this.jComboBoxTiposArchivosReportesTipoTeclaMascara = jComboBoxTiposArchivosReportesTipoTeclaMascara;
	}

	public void setBorderResaltarTiposArchivosReportesTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoTeclaMascara() {
		return this.jComboBoxTiposReportesTipoTeclaMascara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoTeclaMascara(
			JComboBox jComboBoxTiposReportesTipoTeclaMascara) {
		this.jComboBoxTiposReportesTipoTeclaMascara = jComboBoxTiposReportesTipoTeclaMascara;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoTeclaMascara() {
	//	return jComboBoxTiposReportesDinamicoTipoTeclaMascara;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoTeclaMascara(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoTeclaMascara) {
	//	this.jComboBoxTiposReportesDinamicoTipoTeclaMascara = jComboBoxTiposReportesDinamicoTipoTeclaMascara;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara = jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara;
	//}
	
	public void setBorderResaltarTiposReportesTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoTeclaMascara() {
		return this.jComboBoxTiposGraficosReportesTipoTeclaMascara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoTeclaMascara(
			JComboBox jComboBoxTiposGraficosReportesTipoTeclaMascara) {
		this.jComboBoxTiposGraficosReportesTipoTeclaMascara = jComboBoxTiposGraficosReportesTipoTeclaMascara;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoTeclaMascara() {
		return this.jComboBoxTiposPaginacionTipoTeclaMascara;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoTeclaMascara(
			JComboBox jComboBoxTiposPaginacionTipoTeclaMascara) {
		this.jComboBoxTiposPaginacionTipoTeclaMascara = jComboBoxTiposPaginacionTipoTeclaMascara;
	}
	
	public void setBorderResaltarTiposPaginacionTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoTeclaMascara() {
		return this.jComboBoxTiposRelacionesTipoTeclaMascara;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTeclaMascara() {
		return this.jComboBoxTiposAccionesTipoTeclaMascara;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTeclaMascara(
			JComboBox jComboBoxTiposRelacionesTipoTeclaMascara) {
		this.jComboBoxTiposRelacionesTipoTeclaMascara = jComboBoxTiposRelacionesTipoTeclaMascara;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTeclaMascara(
			JComboBox jComboBoxTiposAccionesTipoTeclaMascara) {
		this.jComboBoxTiposAccionesTipoTeclaMascara = jComboBoxTiposAccionesTipoTeclaMascara;
	}
	
	public void setBorderResaltarTiposRelacionesTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoTeclaMascara() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoTeclaMascara .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoTeclaMascara() {
	//	return jCheckBoxConGraficoDinamicoTipoTeclaMascara;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoTeclaMascara(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoTeclaMascara) {
	//	this.jCheckBoxConGraficoDinamicoTipoTeclaMascara = jCheckBoxConGraficoDinamicoTipoTeclaMascara;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoTeclaMascara() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoTeclaMascara.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoTeclaMascara .setBorder(borderResaltar);		
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
		this.tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean();
		
		this.tipoteclamascaraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoteclamascaraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoteclamascaraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoTeclaMascaraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoTeclaMascaraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTeclaMascaraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTeclaMascaraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTeclaMascaraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Tecla Mascara MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoTeclaMascaraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoTeclaMascara= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"nuevo","nuevo","Nuevo"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"duplicar","duplicar","Duplicar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"copiar","copiar","Copiar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"ver_form","ver_form","Ver"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"recargar","recargar","Recargar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoTeclaMascara,this.jTtoolBarTipoTeclaMascara,
							"cerrar","cerrar","Salir"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoTeclaMascara=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoTeclaMascara;
			
				this.jButtonProcesarInformacionToolBarTipoTeclaMascara=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoTeclaMascara;
				
		//protected JButton jButtonModificarToolBarTipoTeclaMascara;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoTeclaMascara=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoTeclaMascara=new JMenuMe("General");
		this.jmenuArchivoTipoTeclaMascara=new JMenuMe("Archivo");
		this.jmenuAccionesTipoTeclaMascara=new JMenuMe("Acciones");
		this.jmenuDatosTipoTeclaMascara=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTeclaMascara= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTeclaMascara.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTeclaMascara,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoTeclaMascara= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoTeclaMascara.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoTeclaMascara,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoTeclaMascara= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoTeclaMascara.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoTeclaMascara,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoTeclaMascara= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTeclaMascara.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTeclaMascara,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoTeclaMascara= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoTeclaMascara.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoTeclaMascara,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoTeclaMascara= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoTeclaMascara.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoTeclaMascara,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoTeclaMascara= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoTeclaMascara.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoTeclaMascara,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTeclaMascara= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTeclaMascara.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTeclaMascara,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoTeclaMascara= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoTeclaMascara.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoTeclaMascara,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoTeclaMascara= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoTeclaMascara.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoTeclaMascara,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoTeclaMascara= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoTeclaMascara.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoTeclaMascara,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoTeclaMascara= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoTeclaMascara.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoTeclaMascara,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoTeclaMascara= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoTeclaMascara.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoTeclaMascara,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTeclaMascara= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTeclaMascara.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTeclaMascara,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoTeclaMascara= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoTeclaMascara.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoTeclaMascara,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTeclaMascara= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTeclaMascara.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTeclaMascara,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoTeclaMascara= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoTeclaMascara.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoTeclaMascara,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoTeclaMascara.add(this.jMenuItemCerrarTipoTeclaMascara);
			
			this.jmenuAccionesTipoTeclaMascara.add(this.jMenuItemNuevoTipoTeclaMascara);
			this.jmenuAccionesTipoTeclaMascara.add(this.jMenuItemNuevoGuardarCambiosTipoTeclaMascara);
			this.jmenuAccionesTipoTeclaMascara.add(this.jMenuItemNuevoRelacionesTipoTeclaMascara);
			this.jmenuAccionesTipoTeclaMascara.add(this.jMenuItemGuardarCambiosTablaTipoTeclaMascara);		
			this.jmenuAccionesTipoTeclaMascara.add(this.jMenuItemDuplicarTipoTeclaMascara);		
			this.jmenuAccionesTipoTeclaMascara.add(this.jMenuItemCopiarTipoTeclaMascara);		
			this.jmenuAccionesTipoTeclaMascara.add(this.jMenuItemVerFormTipoTeclaMascara);		
			
			this.jmenuDatosTipoTeclaMascara.add(this.jMenuItemRecargarInformacionTipoTeclaMascara);				
			this.jmenuDatosTipoTeclaMascara.add(this.jMenuItemAnterioresTipoTeclaMascara);				
			this.jmenuDatosTipoTeclaMascara.add(this.jMenuItemSiguientesTipoTeclaMascara);				
			this.jmenuDatosTipoTeclaMascara.add(this.jMenuItemAbrirOrderByTipoTeclaMascara);				
			this.jmenuDatosTipoTeclaMascara.add(this.jMenuItemMostrarOcultarTipoTeclaMascara);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoTeclaMascara.add(this.jMenuItemGuardarCambiosTipoTeclaMascara);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoTeclaMascara.add(this.jmenuArchivoTipoTeclaMascara);		
			this.jmenuBarTipoTeclaMascara.add(this.jmenuAccionesTipoTeclaMascara);		
			this.jmenuBarTipoTeclaMascara.add(this.jmenuDatosTipoTeclaMascara);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoTeclaMascara);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoTeclaMascara() {
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
			//this.jInternalFrameDetalleTipoTeclaMascara = new TipoTeclaMascaraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Tecla Mascara DATOS");
			this.jInternalFrameDetalleFormTipoTeclaMascara = new TipoTeclaMascaraDetalleFormJInternalFrame(jDesktopPane,this.tipoteclamascaraSessionBean.getConGuardarRelaciones(),this.tipoteclamascaraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoTeclaMascara = null;//new TipoTeclaMascaraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTeclaMascara= new GridBagLayout();
		
		
		this.jTableDatosTipoTeclaMascara = new JTableMe();      
		
		String sToolTipTipoTeclaMascara="";
		sToolTipTipoTeclaMascara=TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTeclaMascara+="(Seguridad.TipoTeclaMascara)";
		}
		
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTeclaMascara+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoTeclaMascara.setToolTipText(sToolTipTipoTeclaMascara);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoTeclaMascara);
		this.jTableDatosTipoTeclaMascara.setAutoCreateRowSorter(true);
		this.jTableDatosTipoTeclaMascara.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoTeclaMascara.setRowSelectionAllowed(true);
		this.jTableDatosTipoTeclaMascara.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoTeclaMascara = new JButtonMe();
		this.jButtonDuplicarTipoTeclaMascara = new JButtonMe();
		this.jButtonCopiarTipoTeclaMascara = new JButtonMe();
		this.jButtonVerFormTipoTeclaMascara = new JButtonMe();
		this.jButtonNuevoRelacionesTipoTeclaMascara = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoTeclaMascara = new JButtonMe();
		this.jButtonCerrarTipoTeclaMascara = new JButtonMe();
		
		this.jScrollPanelDatosTipoTeclaMascara = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoTeclaMascara = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Tecla Mascara";
		
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tecla Mascaras" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTeclaMascara.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTeclaMascara.setToolTipText("Acciones");
        this.jPanelAccionesTipoTeclaMascara.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoTeclaMascara=new ReporteDinamicoJInternalFrame(TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoTeclaMascara();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoTeclaMascara=new ImportacionJInternalFrame(TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoTeclaMascara();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoTeclaMascara = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoTeclaMascara.setText("Orden");
		this.jButtonAbrirOrderByTipoTeclaMascara.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTeclaMascara,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTeclaMascara=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTeclaMascara,false,this);
			
			//this.cargarOrderByTipoTeclaMascara(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTeclaMascara=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTeclaMascara,true,this);
			
			//this.cargarOrderByTipoTeclaMascara(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoTeclaMascara.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoTeclaMascara.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoTeclaMascara.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoTeclaMascara.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTeclaMascara.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTeclaMascara.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoTeclaMascara.setText("Nuevo");
		this.jButtonDuplicarTipoTeclaMascara.setText("Duplicar");
		this.jButtonCopiarTipoTeclaMascara.setText("Copiar");
		this.jButtonVerFormTipoTeclaMascara.setText("Ver");
		this.jButtonNuevoRelacionesTipoTeclaMascara.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.setText("Guardar");
		this.jButtonCerrarTipoTeclaMascara.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTeclaMascara,"nuevo_button","Nuevo",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoTeclaMascara,"duplicar_button","Duplicar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoTeclaMascara,"copiar_button","Copiar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoTeclaMascara,"ver_form","Ver",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoTeclaMascara,"nuevorelaciones_button","Nuevo Rel",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTeclaMascara,"guardarcambiostabla_button","Guardar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTeclaMascara,"cerrar_button","Salir",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoTeclaMascara.setToolTipText("Nuevo"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoTeclaMascara.setToolTipText("Duplicar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoTeclaMascara.setToolTipText("Copiar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoTeclaMascara.setToolTipText("Ver"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoTeclaMascara.setToolTipText("Nuevo Rel"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.setToolTipText("Guardar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTeclaMascara.setToolTipText("Salir"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTeclaMascara";
		inputMap = this.jButtonNuevoTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTeclaMascara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTeclaMascara"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoTeclaMascara";
		inputMap = this.jButtonDuplicarTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoTeclaMascara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoTeclaMascara"));
		
		//COPIAR
		sMapKey = "CopiarTipoTeclaMascara";
		inputMap = this.jButtonCopiarTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoTeclaMascara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoTeclaMascara"));
		
		//VEr FORM
		sMapKey = "VerFormTipoTeclaMascara";
		inputMap = this.jButtonVerFormTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoTeclaMascara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoTeclaMascara"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoTeclaMascara";
		inputMap = this.jButtonNuevoRelacionesTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoTeclaMascara"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoTeclaMascara";
		inputMap = this.jButtonModificarTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoTeclaMascara"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoTeclaMascara";
		inputMap = this.jButtonCerrarTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTeclaMascara"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTeclaMascara";
		inputMap = this.jButtonGuardarCambiosTablaTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTeclaMascara"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoTeclaMascara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoTeclaMascara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoTeclaMascara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoTeclaMascara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoTeclaMascara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoTeclaMascara.setName("jPanelParametrosReportesTipoTeclaMascara"); 
		
		this.jPanelParametrosReportesAccionesTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoTeclaMascara.setName("jPanelParametrosReportesAccionesTipoTeclaMascara"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoTeclaMascara = new JButtonMe();
		this.jButtonRecargarInformacionTipoTeclaMascara.setText("Recargar");
		this.jButtonRecargarInformacionTipoTeclaMascara.setToolTipText("Recargar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoTeclaMascara,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoTeclaMascara = new JButtonMe();
		this.jButtonProcesarInformacionTipoTeclaMascara.setText("Procesar");
		this.jButtonProcesarInformacionTipoTeclaMascara.setToolTipText("Procesar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoTeclaMascara.setVisible(false);
			
		this.jButtonProcesarInformacionTipoTeclaMascara.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTeclaMascara.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTeclaMascara.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTeclaMascara.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoTeclaMascara.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTeclaMascara.setText("TIPO");       
		this.jComboBoxTiposReportesTipoTeclaMascara.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTeclaMascara.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoTeclaMascara.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoTeclaMascara.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoTeclaMascara.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoTeclaMascara.setText("Accion");
		this.jComboBoxTiposRelacionesTipoTeclaMascara.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTeclaMascara.setText("Accion");
		this.jComboBoxTiposAccionesTipoTeclaMascara.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoTeclaMascara.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoTeclaMascara.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoTeclaMascara=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoTeclaMascara.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTeclaMascara.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTeclaMascara.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoTeclaMascara = new JLabelMe();
		
		this.jLabelAccionesTipoTeclaMascara.setText("Acciones");		
		this.jLabelAccionesTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoTeclaMascara = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoTeclaMascara.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoTeclaMascara.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoTeclaMascara = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoTeclaMascara.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoTeclaMascara.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoTeclaMascara = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoTeclaMascara.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoTeclaMascara.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoTeclaMascara = new JButtonMe();
		//this.jButtonAnterioresTipoTeclaMascara.setText("<<");
        this.jButtonAnterioresTipoTeclaMascara.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoTeclaMascara,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoTeclaMascara = new JButtonMe();
		//this.jButtonSiguientesTipoTeclaMascara.setText(">>");
        this.jButtonSiguientesTipoTeclaMascara.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoTeclaMascara,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoTeclaMascara = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoTeclaMascara.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoTeclaMascara.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoTeclaMascara,"nuevoguardarcambios_button","Nue",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoTeclaMascara";
		inputMap = this.jButtonNuevoGuardarCambiosTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoTeclaMascara"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoTeclaMascara";
		inputMap = this.jButtonRecargarInformacionTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoTeclaMascara"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoTeclaMascara";
		inputMap = this.jButtonSiguientesTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoTeclaMascara"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoTeclaMascara";
		inputMap = this.jButtonAnterioresTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoTeclaMascara"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoTeclaMascara();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoTeclaMascara.setMinimumSize(new Dimension(this.getWidth(),TipoTeclaMascaraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTeclaMascaraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTeclaMascara.setMaximumSize(new Dimension(this.getWidth(),TipoTeclaMascaraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTeclaMascaraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTeclaMascara.setPreferredSize(new Dimension(this.getWidth(),TipoTeclaMascaraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTeclaMascaraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoTeclaMascara = new GridBagLayout();

			this.jPanelPaginacionTipoTeclaMascara.setLayout(gridaBagLayoutPaginacionTipoTeclaMascara);						
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonAnterioresTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
					
						
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
			
			this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonNuevoGuardarCambiosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
						
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
			this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonSiguientesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 1;
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonNuevoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
						
			
			
			if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
				this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTeclaMascara.gridy = 1;
				this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonGuardarCambiosTablaTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			}
			
			
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 1;
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonDuplicarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 1;
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonCopiarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 1;
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonVerFormTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 1;
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoTeclaMascara.add(this.jButtonCerrarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
		
		
		this.jButtonRecargarInformacionTipoTeclaMascara.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTeclaMascara.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTeclaMascara.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoTeclaMascara.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTeclaMascara.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTeclaMascara.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoTeclaMascara.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTeclaMascara.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTeclaMascara.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoTeclaMascara.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTeclaMascara.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTeclaMascara.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoTeclaMascara.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTeclaMascara.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTeclaMascara.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoTeclaMascara.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTeclaMascara.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTeclaMascara.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoTeclaMascara.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTeclaMascara.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTeclaMascara.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoTeclaMascara.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTeclaMascara.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTeclaMascara.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoTeclaMascara.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTeclaMascara.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTeclaMascara.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoTeclaMascara.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTeclaMascara.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTeclaMascara.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoTeclaMascara.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTeclaMascara.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTeclaMascara.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoTeclaMascara = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoTeclaMascara = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoTeclaMascara = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoTeclaMascara = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoTeclaMascara = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoTeclaMascara = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoTeclaMascara.setLayout(gridaBagParametrosReportesTipoTeclaMascara);
			this.jPanelParametrosReportesAccionesTipoTeclaMascara.setLayout(gridaBagParametrosReportesAccionesTipoTeclaMascara);
			
			
			this.jPanelParametrosAuxiliar1TipoTeclaMascara.setLayout(gridaBagParametrosAuxiliar1TipoTeclaMascara);
			this.jPanelParametrosAuxiliar2TipoTeclaMascara.setLayout(gridaBagParametrosAuxiliar2TipoTeclaMascara);
			this.jPanelParametrosAuxiliar3TipoTeclaMascara.setLayout(gridaBagParametrosAuxiliar3TipoTeclaMascara);
			this.jPanelParametrosAuxiliar4TipoTeclaMascara.setLayout(gridaBagParametrosAuxiliar4TipoTeclaMascara);
			//this.jPanelParametrosAuxiliar5TipoTeclaMascara.setLayout(gridaBagParametrosAuxiliar2TipoTeclaMascara);			
			
			
			
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jButtonRecargarInformacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTeclaMascara.add(this.jComboBoxTiposPaginacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTeclaMascara.add(this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTeclaMascara.add(this.jComboBoxTiposArchivosReportesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jPanelParametrosAuxiliar1TipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTeclaMascara.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoTeclaMascara.add(this.jComboBoxTiposReportesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jPanelParametrosAuxiliar4TipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jComboBoxTiposReportesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jCheckBoxGenerarReporteTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jPanelParametrosAuxiliar2TipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTeclaMascara.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jLabelAccionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
				this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoTeclaMascara.add(this.jButtonAbrirOrderByTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jComboBoxTiposSeleccionarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);			
			
			
			/*
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTeclaMascara.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jCheckBoxSeleccionarTodosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTeclaMascara.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTeclaMascara.add(this.jCheckBoxSeleccionarTodosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);															
				
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTeclaMascara.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTeclaMascara.add(this.jCheckBoxSeleccionadosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jPanelParametrosAuxiliar3TipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jComboBoxTiposRelacionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
				
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTeclaMascara.add(this.jComboBoxTiposAccionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoTeclaMascara = new GridBagLayout();

			this.jScrollPanelDatosTipoTeclaMascara.setLayout(gridaBagLayoutDatosTipoTeclaMascara);
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
			this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
			
			this.jScrollPanelDatosTipoTeclaMascara.add(this.jTableDatosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoTeclaMascara.setViewportView(this.jTableDatosTipoTeclaMascara);
		this.jTableDatosTipoTeclaMascara.setFillsViewportHeight(true);
		this.jTableDatosTipoTeclaMascara.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoTeclaMascara= new GridBagLayout();
		this.jPanelAccionesTipoTeclaMascara.setLayout(gridaBagLayoutAccionesTipoTeclaMascara);
		
		
		/*	
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
			
		this.jPanelAccionesTipoTeclaMascara.add(this.jButtonNuevoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTeclaMascara = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTeclaMascara);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();						
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTeclaMascara.gridx = 0;		
			//this.gridBagConstraintsTipoTeclaMascara.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTeclaMascara.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;		
		//this.gridBagConstraintsTipoTeclaMascara.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoTeclaMascara.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoTeclaMascara);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);								
		
		
		/*
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		*/		
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTeclaMascara.gridx =0;
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTeclaMascara.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
				
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoTeclaMascara= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTeclaMascara = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoTeclaMascara.setLayout(gridaBagLayoutBusquedasParametrosTipoTeclaMascara);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoTeclaMascara=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTeclaMascara.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTeclaMascara.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTeclaMascara.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			
			
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
			
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoTeclaMascara;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoTeclaMascara() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoTeclaMascara = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoTeclaMascara.setName("jPanelReporteDinamicoTipoTeclaMascara"); 
		
		this.jPanelReporteDinamicoTipoTeclaMascara.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTeclaMascara.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTeclaMascara.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoTeclaMascara.setLayout(gridaBagLayoutReporteDinamicoTipoTeclaMascara);
		
		
		this.jInternalFrameReporteDinamicoTipoTeclaMascara= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoTeclaMascara = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTeclaMascara= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoTeclaMascara.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoTeclaMascara.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoTeclaMascara.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoTeclaMascara.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoTeclaMascara.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoTeclaMascara.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoTeclaMascara.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoTeclaMascara.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoTeclaMascara.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTeclaMascara.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTeclaMascara.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tecla Mascaras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoTeclaMascara = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoTeclaMascara.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jLabelColumnasSelectReporteTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoTeclaMascara = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoTeclaMascara.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoTeclaMascara.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoTeclaMascara.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTeclaMascara.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTeclaMascara.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoTeclaMascara=new JScrollPane(this.jListColumnasSelectReporteTipoTeclaMascara);
			
			this.jScrollColumnasSelectReporteTipoTeclaMascara.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTeclaMascara.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTeclaMascara.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jListColumnasSelectReporteTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jScrollColumnasSelectReporteTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoTeclaMascara = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoTeclaMascara.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoTeclaMascara = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoTeclaMascara.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoTeclaMascara.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoTeclaMascara.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTeclaMascara.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTeclaMascara.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoTeclaMascara=new JScrollPane(this.jListRelacionesSelectReporteTipoTeclaMascara);
			
			this.jScrollRelacionesSelectReporteTipoTeclaMascara.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTeclaMascara.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTeclaMascara.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoTeclaMascara = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoTeclaMascara = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoTeclaMascara = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoTeclaMascara = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoTeclaMascara.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoTeclaMascara.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTeclaMascara.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTeclaMascara.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoTeclaMascara = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoTeclaMascara.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jLabelGenerarExcelReporteDinamicoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoTeclaMascara = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoTeclaMascara.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoTeclaMascara,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoTeclaMascara.setToolTipText("Generar EXCEL"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		//this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jButtonGenerarExcelReporteDinamicoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jComboBoxTiposReportesDinamicoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoTeclaMascara = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoTeclaMascara.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jLabelTiposArchivoReporteDinamicoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jComboBoxTiposArchivosReportesDinamicoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoTeclaMascara = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoTeclaMascara.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoTeclaMascara,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoTeclaMascara.setToolTipText("Generar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jButtonGenerarReporteDinamicoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoTeclaMascara = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoTeclaMascara.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoTeclaMascara,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoTeclaMascara.setToolTipText("Cancelar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTeclaMascara.add(this.jButtonCerrarReporteDinamicoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoTeclaMascara = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoTeclaMascara= new JScrollPane(jPanelReporteDinamicoTipoTeclaMascara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoTeclaMascara.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTeclaMascara.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTeclaMascara.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tecla Mascaras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoTeclaMascara.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoTeclaMascara.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoTeclaMascara.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoTeclaMascara);
		this.jInternalFrameReporteDinamicoTipoTeclaMascara.getContentPane().add(this.jScrollPanelReporteDinamicoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoTeclaMascara() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoTeclaMascara = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoTeclaMascara.setName("jPanelImportacionTipoTeclaMascara"); 
		
		this.jPanelImportacionTipoTeclaMascara.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTeclaMascara.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTeclaMascara.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoTeclaMascara.setLayout(gridaBagLayoutImportacionTipoTeclaMascara);
		
		
		this.jInternalFrameImportacionTipoTeclaMascara= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoTeclaMascara= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoTeclaMascara = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTeclaMascara= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoTeclaMascara.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTeclaMascara.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTeclaMascara.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoTeclaMascara.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTeclaMascara.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTeclaMascara.setResizable(true);
	    this.jInternalFrameImportacionTipoTeclaMascara.setClosable(true);
	    this.jInternalFrameImportacionTipoTeclaMascara.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoTeclaMascara.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTeclaMascara.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTeclaMascara.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoTeclaMascara.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTeclaMascara.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTeclaMascara.setResizable(true);
	    this.jInternalFrameImportacionTipoTeclaMascara.setClosable(true);
	    this.jInternalFrameImportacionTipoTeclaMascara.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoTeclaMascara.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTeclaMascara.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTeclaMascara.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tecla Mascaras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoTeclaMascara = new JLabelMe();

		this.jLabelArchivoImportacionTipoTeclaMascara.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTeclaMascara.add(this.jLabelArchivoImportacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoTeclaMascara = new JFileChooser();		
		this.jFileChooserImportacionTipoTeclaMascara.setToolTipText("ESCOGER ARCHIVO"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoTeclaMascara = new JButtonMe();
		this.jButtonAbrirImportacionTipoTeclaMascara.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoTeclaMascara,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoTeclaMascara.setToolTipText("Generar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTeclaMascara.add(this.jButtonAbrirImportacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoTeclaMascara = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoTeclaMascara.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTeclaMascara.add(this.jLabelPathArchivoImportacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoTeclaMascara=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoTeclaMascara.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTeclaMascara.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTeclaMascara.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTeclaMascara.add(this.jTextFieldPathArchivoImportacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoTeclaMascara = new JButtonMe();
		this.jButtonGenerarImportacionTipoTeclaMascara.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoTeclaMascara,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoTeclaMascara.setToolTipText("Generar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTeclaMascara.add(this.jButtonGenerarImportacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoTeclaMascara = new JButtonMe();
		this.jButtonCerrarImportacionTipoTeclaMascara.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoTeclaMascara,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoTeclaMascara.setToolTipText("Cancelar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTeclaMascara.add(this.jButtonCerrarImportacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoTeclaMascara = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoTeclaMascara= new JScrollPane(jPanelImportacionTipoTeclaMascara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoTeclaMascara.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoTeclaMascara.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoTeclaMascara.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoTeclaMascara);
		this.jInternalFrameImportacionTipoTeclaMascara.getContentPane().add(this.jScrollPanelImportacionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoTeclaMascara(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoTeclaMascara = new JButtonMe();
			this.jButtonAbrirOrderByTipoTeclaMascara.setText("Orden");
			this.jButtonAbrirOrderByTipoTeclaMascara.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTeclaMascara,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoTeclaMascara";
			inputMap = this.jButtonAbrirOrderByTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoTeclaMascara"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoTeclaMascara = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoTeclaMascara.setName("jPanelOrderByTipoTeclaMascara"); 
			
			this.jPanelOrderByTipoTeclaMascara.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTeclaMascara.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTeclaMascara.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoTeclaMascara.setLayout(gridaBagLayoutOrderByTipoTeclaMascara);
			
			
			this.jTableDatosTipoTeclaMascaraOrderBy = new JTableMe();        
			this.jTableDatosTipoTeclaMascaraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoTeclaMascaraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoTeclaMascaraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoTeclaMascaraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoTeclaMascaraOrderBy.setViewportView(this.jTableDatosTipoTeclaMascaraOrderBy);
			this.jTableDatosTipoTeclaMascaraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoTeclaMascaraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoTeclaMascara= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoTeclaMascara= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoTeclaMascara = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoTeclaMascara= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoTeclaMascara.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoTeclaMascara.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoTeclaMascara.setTitle("Orden");
			this.jInternalFrameOrderByTipoTeclaMascara.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoTeclaMascara.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoTeclaMascara.setResizable(true);
			this.jInternalFrameOrderByTipoTeclaMascara.setClosable(true);
			this.jInternalFrameOrderByTipoTeclaMascara.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoTeclaMascara.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTeclaMascara.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTeclaMascara.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tecla Mascaras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoTeclaMascara.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoTeclaMascara.ipady =150;
				
			this.jPanelOrderByTipoTeclaMascara.add(jScrollPanelDatosTipoTeclaMascaraOrderBy, this.gridBagConstraintsTipoTeclaMascara);//this.jTableDatosTipoTeclaMascaraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoTeclaMascara = new JButtonMe();
			this.jButtonCerrarOrderByTipoTeclaMascara.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoTeclaMascara,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoTeclaMascara.setToolTipText("Cancelar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoTeclaMascara.add(this.jButtonCerrarOrderByTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoTeclaMascara = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoTeclaMascara= new JScrollPane(jPanelOrderByTipoTeclaMascara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoTeclaMascara.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoTeclaMascara.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoTeclaMascara.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoTeclaMascara);
			
			this.jInternalFrameOrderByTipoTeclaMascara.getContentPane().add(this.jScrollPanelOrderByTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);			
		
		} else {
			this.jButtonAbrirOrderByTipoTeclaMascara = new JButtonMe();
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
			&& this.tipoteclamascaraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoTeclaMascara.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoTeclaMascara.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoTeclaMascara.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoTeclaMascara.getRowHeight();//TipoTeclaMascaraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoTeclaMascaraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara.isSelected()) {
					iHeightTable=TipoTeclaMascaraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTeclaMascaraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTeclaMascaraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoTeclaMascaraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTeclaMascara.isSelected()) {
					iHeightTable=TipoTeclaMascaraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTeclaMascaraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTeclaMascaraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoTeclaMascara.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTeclaMascara.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTeclaMascara.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoTeclaMascara.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTeclaMascara.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTeclaMascara.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoTeclaMascara!=null && this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoTeclaMascara.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoTeclaMascara.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoTeclaMascara.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoTeclaMascara.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoTeclaMascara.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTeclaMascara.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTeclaMascara.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoteclamascaraLogic.getTipoTeclaMascaras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoteclamascaras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoTeclaMascara> TraerTipoTeclaMascaraBeans(List<TipoTeclaMascara> tipoteclamascaras,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoTeclaMascara tipoteclamascara:tipoteclamascaras) {
					
				if(!(TipoTeclaMascaraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoTeclaMascaraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoteclamascara.setsDetalleGeneralEntityReporte(TipoTeclaMascaraConstantesFunciones.getTipoTeclaMascaraDescripcion(tipoteclamascara));
										
						
					
						
					
				} else  {
							
					//tipoteclamascara.setsDetalleGeneralEntityReporte(tipoteclamascara.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoteclamascarabeans.add(tipoteclamascarabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoteclamascaras;
    }
	//PARA REPORTES FIN
}
