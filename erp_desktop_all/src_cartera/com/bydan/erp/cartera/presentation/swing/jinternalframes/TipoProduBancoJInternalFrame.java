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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoProduBancoConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoProduBancoJInternalFrame extends TipoProduBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProduBanco;
	
	protected JMenuBar jmenuBarTipoProduBanco;
	
	protected JMenu jmenuTipoProduBanco;
	protected JMenu jmenuDatosTipoProduBanco;
	protected JMenu jmenuArchivoTipoProduBanco;
	protected JMenu jmenuAccionesTipoProduBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProduBanco;	
	protected GridBagConstraints gridBagConstraintsTipoProduBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProduBancoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProduBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProduBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProduBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProduBancoSessionBean tipoprodubancoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProduBanco> tipoprodubancos;		
	public List<TipoProduBanco> tipoprodubancosEliminados;	
	public List<TipoProduBanco> tipoprodubancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProduBanco;		
	protected JButton jButtonAbrirOrderByTipoProduBanco;
	
	
	//protected JPanel jPanelOrderByTipoProduBanco;
	//public JScrollPane jScrollPanelOrderByTipoProduBanco;	
	//protected JButton jButtonCerrarOrderByTipoProduBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProduBancoLogic tipoprodubancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProduBanco;
	public JScrollPane jScrollPanelDatosEdicionTipoProduBanco;
	public JScrollPane jScrollPanelDatosGeneralTipoProduBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProduBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProduBanco;
	//public JScrollPane jScrollPanelImportacionTipoProduBanco;
	
	
	
	protected JPanel jPanelAccionesTipoProduBanco;
	
    protected JPanel jPanelPaginacionTipoProduBanco;
    protected JPanel jPanelParametrosReportesTipoProduBanco;
	protected JPanel jPanelParametrosReportesAccionesTipoProduBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProduBanco;
	protected JPanel jPanelParametrosAuxiliar2TipoProduBanco;
	protected JPanel jPanelParametrosAuxiliar3TipoProduBanco;
	protected JPanel jPanelParametrosAuxiliar4TipoProduBanco;
	//protected JPanel jPanelParametrosAuxiliar5TipoProduBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProduBanco;
	//protected JPanel jPanelImportacionTipoProduBanco;
	
	
	public JTable jTableDatosTipoProduBanco;
	
	
	
	//public JTable jTableDatosTipoProduBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProduBanco;
	protected JButton jButtonDuplicarTipoProduBanco;
	protected JButton jButtonCopiarTipoProduBanco;
	protected JButton jButtonVerFormTipoProduBanco;
	protected JButton jButtonNuevoRelacionesTipoProduBanco;
	protected JButton jButtonModificarTipoProduBanco;
	
    protected JButton jButtonGuardarCambiosTablaTipoProduBanco;
	protected JButton jButtonCerrarTipoProduBanco;
	
	
	protected JButton jButtonRecargarInformacionTipoProduBanco;
	protected JButton jButtonProcesarInformacionTipoProduBanco;
	
	
	protected JButton jButtonAnterioresTipoProduBanco;
	protected JButton jButtonSiguientesTipoProduBanco;
	protected JButton jButtonNuevoGuardarCambiosTipoProduBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProduBanco;
	//protected JButton jButtonCerrarReporteDinamicoTipoProduBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProduBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProduBanco;
	//protected JButton jButtonGenerarImportacionTipoProduBanco;
	//protected JButton jButtonCerrarImportacionTipoProduBanco;
	//protected JFileChooser jFileChooserImportacionTipoProduBanco;
	//protected File fileImportacionTipoProduBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProduBanco;
	protected JButton jButtonDuplicarToolBarTipoProduBanco;
	protected JButton jButtonNuevoRelacionesToolBarTipoProduBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProduBanco;
	protected JButton jButtonCopiarToolBarTipoProduBanco;
	protected JButton jButtonVerFormToolBarTipoProduBanco;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProduBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProduBanco;
	protected JButton jButtonCerrarToolBarTipoProduBanco;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProduBanco;
	protected JButton jButtonProcesarInformacionToolBarTipoProduBanco;
	protected JButton jButtonAnterioresToolBarTipoProduBanco;
	protected JButton jButtonSiguientesToolBarTipoProduBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProduBanco;
	protected JButton jButtonAbrirOrderByToolBarTipoProduBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProduBanco;
	protected JMenuItem jMenuItemDuplicarTipoProduBanco;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProduBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProduBanco;
	protected JMenuItem jMenuItemCopiarTipoProduBanco;
	protected JMenuItem jMenuItemVerFormTipoProduBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProduBanco;
	protected JMenuItem jMenuItemCerrarTipoProduBanco;
	protected JMenuItem jMenuItemDetalleCerrarTipoProduBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProduBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProduBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProduBanco;
	protected JMenuItem jMenuItemProcesarInformacionTipoProduBanco;
	protected JMenuItem jMenuItemAnterioresTipoProduBanco;
	protected JMenuItem jMenuItemSiguientesTipoProduBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProduBanco;
	protected JMenuItem jMenuItemAbrirOrderByTipoProduBanco;
	protected JMenuItem jMenuItemMostrarOcultarTipoProduBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProduBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProduBanco;
	protected JCheckBox jCheckBoxSeleccionadosTipoProduBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProduBanco;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProduBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProduBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProduBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProduBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProduBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProduBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProduBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProduBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProduBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProduBanco;
	protected JTextField jTextFieldValorCampoGeneralTipoProduBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProduBanco;
	//public JList<Reporte> jListColumnasSelectReporteTipoProduBanco;
	//public JScrollPane jScrollColumnasSelectReporteTipoProduBanco;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProduBanco;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProduBanco;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProduBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProduBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProduBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProduBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProduBanco;
	
		
	//public JLabel jLabelArchivoImportacionTipoProduBanco;	
	//public JLabel jLabelPathArchivoImportacionTipoProduBanco;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProduBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProduBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProduBanco;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProduBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProduBanco;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProduBanco;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProduBanco;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProduBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProduBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProduBanco;	
	
	
	
	
	
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
	public TipoProduBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProduBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProduBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProduBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProduBanco)	{
		this.jButtonRecargarInformacionTipoProduBanco = jButtonRecargarInformacionTipoProduBanco;
	}
	
	public JButton getjButtonProcesarInformacionTipoProduBanco() {
		return this.jButtonProcesarInformacionTipoProduBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProduBanco)	{
		this.jButtonProcesarInformacionTipoProduBanco = jButtonProcesarInformacionTipoProduBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProduBanco() {
		return this.jButtonRecargarInformacionTipoProduBanco;
	}
	
	
	public List<TipoProduBanco> gettipoprodubancos() {
		return this.tipoprodubancos;
	}

	public void settipoprodubancos(List<TipoProduBanco> tipoprodubancos) {
		this.tipoprodubancos = tipoprodubancos;
	}
	
	public List<TipoProduBanco> gettipoprodubancosAux() {
		return this.tipoprodubancosAux;
	}

	public void settipoprodubancosAux(List<TipoProduBanco> tipoprodubancosAux) {
		this.tipoprodubancosAux = tipoprodubancosAux;
	}
	
	public List<TipoProduBanco> gettipoprodubancosEliminados() {
		return this.tipoprodubancosEliminados;
	}

	public void setTipoProduBancosEliminados(List<TipoProduBanco> tipoprodubancosEliminados) {
		this.tipoprodubancosEliminados = tipoprodubancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProduBanco() {
		return jComboBoxTiposSeleccionarTipoProduBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProduBanco(
			JComboBox jComboBoxTiposSeleccionarTipoProduBanco) {
		this.jComboBoxTiposSeleccionarTipoProduBanco = jComboBoxTiposSeleccionarTipoProduBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProduBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProduBanco() {
		return jTextFieldValorCampoGeneralTipoProduBanco;
	}

	public void setjTextFieldValorCampoGeneralTipoProduBanco(
			JTextField jTextFieldValorCampoGeneralTipoProduBanco) {
		this.jTextFieldValorCampoGeneralTipoProduBanco = jTextFieldValorCampoGeneralTipoProduBanco;
	}

	public void setBorderResaltarValorCampoGeneralTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProduBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProduBanco() {
		return this.jCheckBoxSeleccionarTodosTipoProduBanco;
	}

	public void setjCheckBoxSeleccionarTodosTipoProduBanco(
			JCheckBox jCheckBoxSeleccionarTodosTipoProduBanco) {
		this.jCheckBoxSeleccionarTodosTipoProduBanco = jCheckBoxSeleccionarTodosTipoProduBanco;
	}

	public void setBorderResaltarSeleccionarTodosTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProduBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProduBanco() {
		return this.jCheckBoxSeleccionadosTipoProduBanco;
	}

	public void setjCheckBoxSeleccionadosTipoProduBanco(
			JCheckBox jCheckBoxSeleccionadosTipoProduBanco) {
		this.jCheckBoxSeleccionadosTipoProduBanco = jCheckBoxSeleccionadosTipoProduBanco;
	}
	
	public void setBorderResaltarSeleccionadosTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProduBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProduBanco() {
		return this.jComboBoxTiposArchivosReportesTipoProduBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProduBanco(
			JComboBox jComboBoxTiposArchivosReportesTipoProduBanco) {
		this.jComboBoxTiposArchivosReportesTipoProduBanco = jComboBoxTiposArchivosReportesTipoProduBanco;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProduBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProduBanco() {
		return this.jComboBoxTiposReportesTipoProduBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProduBanco(
			JComboBox jComboBoxTiposReportesTipoProduBanco) {
		this.jComboBoxTiposReportesTipoProduBanco = jComboBoxTiposReportesTipoProduBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProduBanco() {
	//	return jComboBoxTiposReportesDinamicoTipoProduBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProduBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProduBanco) {
	//	this.jComboBoxTiposReportesDinamicoTipoProduBanco = jComboBoxTiposReportesDinamicoTipoProduBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProduBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProduBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProduBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProduBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProduBanco = jComboBoxTiposArchivosReportesDinamicoTipoProduBanco;
	//}
	
	public void setBorderResaltarTiposReportesTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProduBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProduBanco() {
		return this.jComboBoxTiposGraficosReportesTipoProduBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProduBanco(
			JComboBox jComboBoxTiposGraficosReportesTipoProduBanco) {
		this.jComboBoxTiposGraficosReportesTipoProduBanco = jComboBoxTiposGraficosReportesTipoProduBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProduBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProduBanco() {
		return this.jComboBoxTiposPaginacionTipoProduBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProduBanco(
			JComboBox jComboBoxTiposPaginacionTipoProduBanco) {
		this.jComboBoxTiposPaginacionTipoProduBanco = jComboBoxTiposPaginacionTipoProduBanco;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProduBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProduBanco() {
		return this.jComboBoxTiposRelacionesTipoProduBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProduBanco() {
		return this.jComboBoxTiposAccionesTipoProduBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProduBanco(
			JComboBox jComboBoxTiposRelacionesTipoProduBanco) {
		this.jComboBoxTiposRelacionesTipoProduBanco = jComboBoxTiposRelacionesTipoProduBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProduBanco(
			JComboBox jComboBoxTiposAccionesTipoProduBanco) {
		this.jComboBoxTiposAccionesTipoProduBanco = jComboBoxTiposAccionesTipoProduBanco;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProduBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProduBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProduBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProduBanco() {
	//	return jCheckBoxConGraficoDinamicoTipoProduBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProduBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProduBanco) {
	//	this.jCheckBoxConGraficoDinamicoTipoProduBanco = jCheckBoxConGraficoDinamicoTipoProduBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProduBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProduBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProduBanco .setBorder(borderResaltar);		
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
		this.tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
		
		this.tipoprodubancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprodubancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprodubancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProduBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProduBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProduBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProduBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProduBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Produ Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProduBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProduBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"nuevo","nuevo","Nuevo"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"duplicar","duplicar","Duplicar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"copiar","copiar","Copiar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"ver_form","ver_form","Ver"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"recargar","recargar","Recargar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProduBanco,this.jTtoolBarTipoProduBanco,
							"cerrar","cerrar","Salir"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProduBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProduBanco;
			
				this.jButtonProcesarInformacionToolBarTipoProduBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProduBanco;
				
		//protected JButton jButtonModificarToolBarTipoProduBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProduBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProduBanco=new JMenuMe("General");
		this.jmenuArchivoTipoProduBanco=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProduBanco=new JMenuMe("Acciones");
		this.jmenuDatosTipoProduBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProduBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProduBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProduBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProduBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProduBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProduBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProduBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProduBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProduBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProduBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProduBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProduBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProduBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProduBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProduBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProduBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProduBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProduBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProduBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProduBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProduBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProduBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProduBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProduBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProduBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProduBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProduBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProduBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProduBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProduBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProduBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProduBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProduBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProduBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProduBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProduBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProduBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProduBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProduBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProduBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProduBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProduBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProduBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProduBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProduBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProduBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProduBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProduBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProduBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProduBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProduBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProduBanco.add(this.jMenuItemCerrarTipoProduBanco);
			
			this.jmenuAccionesTipoProduBanco.add(this.jMenuItemNuevoTipoProduBanco);
			this.jmenuAccionesTipoProduBanco.add(this.jMenuItemNuevoGuardarCambiosTipoProduBanco);
			this.jmenuAccionesTipoProduBanco.add(this.jMenuItemNuevoRelacionesTipoProduBanco);
			this.jmenuAccionesTipoProduBanco.add(this.jMenuItemGuardarCambiosTablaTipoProduBanco);		
			this.jmenuAccionesTipoProduBanco.add(this.jMenuItemDuplicarTipoProduBanco);		
			this.jmenuAccionesTipoProduBanco.add(this.jMenuItemCopiarTipoProduBanco);		
			this.jmenuAccionesTipoProduBanco.add(this.jMenuItemVerFormTipoProduBanco);		
			
			this.jmenuDatosTipoProduBanco.add(this.jMenuItemRecargarInformacionTipoProduBanco);				
			this.jmenuDatosTipoProduBanco.add(this.jMenuItemAnterioresTipoProduBanco);				
			this.jmenuDatosTipoProduBanco.add(this.jMenuItemSiguientesTipoProduBanco);				
			this.jmenuDatosTipoProduBanco.add(this.jMenuItemAbrirOrderByTipoProduBanco);				
			this.jmenuDatosTipoProduBanco.add(this.jMenuItemMostrarOcultarTipoProduBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProduBanco.add(this.jMenuItemGuardarCambiosTipoProduBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProduBanco.add(this.jmenuArchivoTipoProduBanco);		
			this.jmenuBarTipoProduBanco.add(this.jmenuAccionesTipoProduBanco);		
			this.jmenuBarTipoProduBanco.add(this.jmenuDatosTipoProduBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProduBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProduBanco() {
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
			//this.jInternalFrameDetalleTipoProduBanco = new TipoProduBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Produ Banco DATOS");
			this.jInternalFrameDetalleFormTipoProduBanco = new TipoProduBancoDetalleFormJInternalFrame(jDesktopPane,this.tipoprodubancoSessionBean.getConGuardarRelaciones(),this.tipoprodubancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProduBanco = null;//new TipoProduBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProduBanco= new GridBagLayout();
		
		
		this.jTableDatosTipoProduBanco = new JTableMe();      
		
		String sToolTipTipoProduBanco="";
		sToolTipTipoProduBanco=TipoProduBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProduBanco+="(Cartera.TipoProduBanco)";
		}
		
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProduBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProduBanco.setToolTipText(sToolTipTipoProduBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProduBanco);
		this.jTableDatosTipoProduBanco.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProduBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProduBanco.setRowSelectionAllowed(true);
		this.jTableDatosTipoProduBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProduBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProduBanco = new JButtonMe();
		this.jButtonDuplicarTipoProduBanco = new JButtonMe();
		this.jButtonCopiarTipoProduBanco = new JButtonMe();
		this.jButtonVerFormTipoProduBanco = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProduBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProduBanco = new JButtonMe();
		this.jButtonCerrarTipoProduBanco = new JButtonMe();
		
		this.jScrollPanelDatosTipoProduBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProduBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Produ Banco";
		
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Produ Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProduBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProduBanco.setToolTipText("Acciones");
        this.jPanelAccionesTipoProduBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProduBanco=new ReporteDinamicoJInternalFrame(TipoProduBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProduBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProduBanco=new ImportacionJInternalFrame(TipoProduBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProduBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProduBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProduBanco.setText("Orden");
		this.jButtonAbrirOrderByTipoProduBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProduBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProduBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProduBanco,false,this);
			
			//this.cargarOrderByTipoProduBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProduBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProduBanco,true,this);
			
			//this.cargarOrderByTipoProduBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProduBanco.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProduBanco.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProduBanco.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoProduBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProduBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProduBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProduBanco.setText("Nuevo");
		this.jButtonDuplicarTipoProduBanco.setText("Duplicar");
		this.jButtonCopiarTipoProduBanco.setText("Copiar");
		this.jButtonVerFormTipoProduBanco.setText("Ver");
		this.jButtonNuevoRelacionesTipoProduBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProduBanco.setText("Guardar");
		this.jButtonCerrarTipoProduBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProduBanco,"nuevo_button","Nuevo",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProduBanco,"duplicar_button","Duplicar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProduBanco,"copiar_button","Copiar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProduBanco,"ver_form","Ver",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProduBanco,"nuevorelaciones_button","Nuevo Rel",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProduBanco,"guardarcambiostabla_button","Guardar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProduBanco,"cerrar_button","Salir",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProduBanco.setToolTipText("Nuevo"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProduBanco.setToolTipText("Duplicar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProduBanco.setToolTipText("Copiar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProduBanco.setToolTipText("Ver"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProduBanco.setToolTipText("Nuevo Rel"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProduBanco.setToolTipText("Guardar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProduBanco.setToolTipText("Salir"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProduBanco";
		inputMap = this.jButtonNuevoTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProduBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProduBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProduBanco";
		inputMap = this.jButtonDuplicarTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProduBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProduBanco"));
		
		//COPIAR
		sMapKey = "CopiarTipoProduBanco";
		inputMap = this.jButtonCopiarTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProduBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProduBanco"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProduBanco";
		inputMap = this.jButtonVerFormTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProduBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProduBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProduBanco";
		inputMap = this.jButtonNuevoRelacionesTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProduBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProduBanco";
		inputMap = this.jButtonModificarTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProduBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProduBanco";
		inputMap = this.jButtonCerrarTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProduBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProduBanco";
		inputMap = this.jButtonGuardarCambiosTablaTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProduBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProduBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProduBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProduBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProduBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProduBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProduBanco.setName("jPanelParametrosReportesTipoProduBanco"); 
		
		this.jPanelParametrosReportesAccionesTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProduBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProduBanco.setName("jPanelParametrosReportesAccionesTipoProduBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProduBanco = new JButtonMe();
		this.jButtonRecargarInformacionTipoProduBanco.setText("Recargar");
		this.jButtonRecargarInformacionTipoProduBanco.setToolTipText("Recargar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProduBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProduBanco = new JButtonMe();
		this.jButtonProcesarInformacionTipoProduBanco.setText("Procesar");
		this.jButtonProcesarInformacionTipoProduBanco.setToolTipText("Procesar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProduBanco.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProduBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProduBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProduBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProduBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProduBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProduBanco.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProduBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProduBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProduBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProduBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProduBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProduBanco.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProduBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProduBanco.setText("Accion");
		this.jComboBoxTiposAccionesTipoProduBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProduBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProduBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProduBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProduBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProduBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProduBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProduBanco = new JLabelMe();
		
		this.jLabelAccionesTipoProduBanco.setText("Acciones");		
		this.jLabelAccionesTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProduBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProduBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProduBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProduBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProduBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProduBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProduBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProduBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProduBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProduBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProduBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProduBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProduBanco = new JButtonMe();
		//this.jButtonAnterioresTipoProduBanco.setText("<<");
        this.jButtonAnterioresTipoProduBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProduBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProduBanco = new JButtonMe();
		//this.jButtonSiguientesTipoProduBanco.setText(">>");
        this.jButtonSiguientesTipoProduBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProduBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProduBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProduBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProduBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProduBanco,"nuevoguardarcambios_button","Nue",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProduBanco";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProduBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProduBanco";
		inputMap = this.jButtonRecargarInformacionTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProduBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProduBanco";
		inputMap = this.jButtonSiguientesTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProduBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProduBanco";
		inputMap = this.jButtonAnterioresTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProduBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProduBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProduBanco.setMinimumSize(new Dimension(this.getWidth(),TipoProduBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProduBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProduBanco.setMaximumSize(new Dimension(this.getWidth(),TipoProduBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProduBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProduBanco.setPreferredSize(new Dimension(this.getWidth(),TipoProduBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProduBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProduBanco = new GridBagLayout();

			this.jPanelPaginacionTipoProduBanco.setLayout(gridaBagLayoutPaginacionTipoProduBanco);						
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = 0;
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProduBanco.add(this.jButtonAnterioresTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
					
						
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProduBanco.gridy = 0;
			
			this.jPanelPaginacionTipoProduBanco.add(this.jButtonNuevoGuardarCambiosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
						
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProduBanco.gridy = 0;
			this.jPanelPaginacionTipoProduBanco.add(this.jButtonSiguientesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = 1;
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProduBanco.add(this.jButtonNuevoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProduBanco.gridy = 1;
				this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoProduBanco.add(this.jButtonNuevoRelacionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			}
			
			
			if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProduBanco.gridy = 1;
				this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProduBanco.add(this.jButtonGuardarCambiosTablaTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			}
			
			
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = 1;
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProduBanco.add(this.jButtonDuplicarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = 1;
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProduBanco.add(this.jButtonCopiarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = 1;
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProduBanco.add(this.jButtonVerFormTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = 1;
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProduBanco.add(this.jButtonCerrarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
		
		
		this.jButtonRecargarInformacionTipoProduBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProduBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProduBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProduBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProduBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProduBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProduBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProduBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProduBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProduBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProduBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProduBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProduBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProduBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProduBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProduBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProduBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProduBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProduBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProduBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProduBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProduBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProduBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProduBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProduBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProduBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProduBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProduBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProduBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProduBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProduBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProduBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProduBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProduBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProduBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProduBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProduBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProduBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProduBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProduBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProduBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProduBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProduBanco.setLayout(gridaBagParametrosReportesTipoProduBanco);
			this.jPanelParametrosReportesAccionesTipoProduBanco.setLayout(gridaBagParametrosReportesAccionesTipoProduBanco);
			
			
			this.jPanelParametrosAuxiliar1TipoProduBanco.setLayout(gridaBagParametrosAuxiliar1TipoProduBanco);
			this.jPanelParametrosAuxiliar2TipoProduBanco.setLayout(gridaBagParametrosAuxiliar2TipoProduBanco);
			this.jPanelParametrosAuxiliar3TipoProduBanco.setLayout(gridaBagParametrosAuxiliar3TipoProduBanco);
			this.jPanelParametrosAuxiliar4TipoProduBanco.setLayout(gridaBagParametrosAuxiliar4TipoProduBanco);
			//this.jPanelParametrosAuxiliar5TipoProduBanco.setLayout(gridaBagParametrosAuxiliar2TipoProduBanco);			
			
			
			
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProduBanco.add(this.jButtonRecargarInformacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProduBanco.add(this.jComboBoxTiposPaginacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProduBanco.add(this.jCheckBoxConAltoMaximoTablaTipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProduBanco.add(this.jComboBoxTiposArchivosReportesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProduBanco.add(this.jPanelParametrosAuxiliar1TipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProduBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProduBanco.add(this.jComboBoxTiposReportesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProduBanco.add(this.jPanelParametrosAuxiliar4TipoProduBanco, this.gridBagConstraintsTipoProduBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProduBanco.add(this.jComboBoxTiposReportesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProduBanco.add(this.jCheckBoxGenerarReporteTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProduBanco.add(this.jPanelParametrosAuxiliar2TipoProduBanco, this.gridBagConstraintsTipoProduBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProduBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProduBanco.add(this.jLabelAccionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProduBanco.add(this.jButtonAbrirOrderByTipoProduBanco, this.gridBagConstraintsTipoProduBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProduBanco.add(this.jComboBoxTiposSeleccionarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
			
			
			/*
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProduBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProduBanco.add(this.jCheckBoxSeleccionarTodosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProduBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProduBanco.add(this.jCheckBoxSeleccionarTodosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);															
				
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProduBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProduBanco.add(this.jCheckBoxSeleccionadosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProduBanco.add(this.jPanelParametrosAuxiliar3TipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProduBanco.add(this.jComboBoxTiposRelacionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
				
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProduBanco.add(this.jComboBoxTiposAccionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
	
				
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProduBanco.add(this.jTextFieldValorCampoGeneralTipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProduBanco = new GridBagLayout();

			this.jScrollPanelDatosTipoProduBanco.setLayout(gridaBagLayoutDatosTipoProduBanco);
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = 0;
			this.gridBagConstraintsTipoProduBanco.gridx = 0;
			
			this.jScrollPanelDatosTipoProduBanco.add(this.jTableDatosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProduBanco.setViewportView(this.jTableDatosTipoProduBanco);
		this.jTableDatosTipoProduBanco.setFillsViewportHeight(true);
		this.jTableDatosTipoProduBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProduBanco= new GridBagLayout();
		this.jPanelAccionesTipoProduBanco.setLayout(gridaBagLayoutAccionesTipoProduBanco);
		
		
		/*	
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = 0;
		this.gridBagConstraintsTipoProduBanco.gridx = 0;
			
		this.jPanelAccionesTipoProduBanco.add(this.jButtonNuevoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProduBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProduBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();						
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProduBanco.gridx = 0;		
			//this.gridBagConstraintsTipoProduBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProduBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProduBanco.gridx = 0;		
		//this.gridBagConstraintsTipoProduBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProduBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProduBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);								
		
		
		/*
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		*/		
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProduBanco.gridx =0;
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProduBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
				
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProduBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProduBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProduBanco.setLayout(gridaBagLayoutBusquedasParametrosTipoProduBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProduBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProduBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProduBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProduBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			
			
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
			
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProduBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProduBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProduBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProduBanco.setName("jPanelReporteDinamicoTipoProduBanco"); 
		
		this.jPanelReporteDinamicoTipoProduBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProduBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProduBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProduBanco.setLayout(gridaBagLayoutReporteDinamicoTipoProduBanco);
		
		
		this.jInternalFrameReporteDinamicoTipoProduBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProduBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProduBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProduBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProduBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProduBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProduBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProduBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProduBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProduBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProduBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProduBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProduBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProduBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Produ Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProduBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProduBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jLabelColumnasSelectReporteTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProduBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProduBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProduBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProduBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProduBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProduBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProduBanco=new JScrollPane(this.jListColumnasSelectReporteTipoProduBanco);
			
			this.jScrollColumnasSelectReporteTipoProduBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProduBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProduBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProduBanco.add(this.jListColumnasSelectReporteTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jScrollColumnasSelectReporteTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProduBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProduBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jLabelRelacionesSelectReporteTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProduBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProduBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProduBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProduBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProduBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProduBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProduBanco=new JScrollPane(this.jListRelacionesSelectReporteTipoProduBanco);
			
			this.jScrollRelacionesSelectReporteTipoProduBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProduBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProduBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProduBanco.add(this.jListRelacionesSelectReporteTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jScrollRelacionesSelectReporteTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoProduBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProduBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProduBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProduBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProduBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProduBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProduBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProduBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProduBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProduBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProduBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProduBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProduBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProduBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProduBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jLabelGenerarExcelReporteDinamicoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProduBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProduBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProduBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProduBanco.setToolTipText("Generar EXCEL"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProduBanco.add(this.jButtonGenerarExcelReporteDinamicoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jComboBoxTiposReportesDinamicoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProduBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProduBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jLabelTiposArchivoReporteDinamicoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProduBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProduBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProduBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProduBanco.setToolTipText("Generar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jButtonGenerarReporteDinamicoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProduBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProduBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProduBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProduBanco.setToolTipText("Cancelar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProduBanco.add(this.jButtonCerrarReporteDinamicoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProduBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProduBanco= new JScrollPane(jPanelReporteDinamicoTipoProduBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProduBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProduBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProduBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Produ Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProduBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProduBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProduBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProduBanco);
		this.jInternalFrameReporteDinamicoTipoProduBanco.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProduBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProduBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProduBanco.setName("jPanelImportacionTipoProduBanco"); 
		
		this.jPanelImportacionTipoProduBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProduBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProduBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProduBanco.setLayout(gridaBagLayoutImportacionTipoProduBanco);
		
		
		this.jInternalFrameImportacionTipoProduBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProduBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProduBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProduBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProduBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProduBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProduBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProduBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProduBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProduBanco.setResizable(true);
	    this.jInternalFrameImportacionTipoProduBanco.setClosable(true);
	    this.jInternalFrameImportacionTipoProduBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProduBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProduBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProduBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProduBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProduBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProduBanco.setResizable(true);
	    this.jInternalFrameImportacionTipoProduBanco.setClosable(true);
	    this.jInternalFrameImportacionTipoProduBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProduBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProduBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProduBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Produ Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProduBanco = new JLabelMe();

		this.jLabelArchivoImportacionTipoProduBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProduBanco.add(this.jLabelArchivoImportacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProduBanco = new JFileChooser();		
		this.jFileChooserImportacionTipoProduBanco.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProduBanco = new JButtonMe();
		this.jButtonAbrirImportacionTipoProduBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProduBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProduBanco.setToolTipText("Generar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProduBanco.add(this.jButtonAbrirImportacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProduBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProduBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProduBanco.add(this.jLabelPathArchivoImportacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProduBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProduBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProduBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProduBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProduBanco.add(this.jTextFieldPathArchivoImportacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProduBanco = new JButtonMe();
		this.jButtonGenerarImportacionTipoProduBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProduBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProduBanco.setToolTipText("Generar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProduBanco.add(this.jButtonGenerarImportacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProduBanco = new JButtonMe();
		this.jButtonCerrarImportacionTipoProduBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProduBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProduBanco.setToolTipText("Cancelar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProduBanco.add(this.jButtonCerrarImportacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProduBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProduBanco= new JScrollPane(jPanelImportacionTipoProduBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProduBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProduBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProduBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProduBanco);
		this.jInternalFrameImportacionTipoProduBanco.getContentPane().add(this.jScrollPanelImportacionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProduBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProduBanco = new JButtonMe();
			this.jButtonAbrirOrderByTipoProduBanco.setText("Orden");
			this.jButtonAbrirOrderByTipoProduBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProduBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProduBanco";
			inputMap = this.jButtonAbrirOrderByTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProduBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProduBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProduBanco.setName("jPanelOrderByTipoProduBanco"); 
			
			this.jPanelOrderByTipoProduBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProduBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProduBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProduBanco.setLayout(gridaBagLayoutOrderByTipoProduBanco);
			
			
			this.jTableDatosTipoProduBancoOrderBy = new JTableMe();        
			this.jTableDatosTipoProduBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProduBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProduBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProduBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProduBancoOrderBy.setViewportView(this.jTableDatosTipoProduBancoOrderBy);
			this.jTableDatosTipoProduBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProduBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProduBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProduBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProduBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProduBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProduBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProduBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProduBanco.setTitle("Orden");
			this.jInternalFrameOrderByTipoProduBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProduBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProduBanco.setResizable(true);
			this.jInternalFrameOrderByTipoProduBanco.setClosable(true);
			this.jInternalFrameOrderByTipoProduBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProduBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProduBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProduBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Produ Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProduBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProduBanco.ipady =150;
				
			this.jPanelOrderByTipoProduBanco.add(jScrollPanelDatosTipoProduBancoOrderBy, this.gridBagConstraintsTipoProduBanco);//this.jTableDatosTipoProduBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProduBanco = new JButtonMe();
			this.jButtonCerrarOrderByTipoProduBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProduBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProduBanco.setToolTipText("Cancelar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProduBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProduBanco.add(this.jButtonCerrarOrderByTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProduBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProduBanco= new JScrollPane(jPanelOrderByTipoProduBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProduBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProduBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProduBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProduBanco);
			
			this.jInternalFrameOrderByTipoProduBanco.getContentPane().add(this.jScrollPanelOrderByTipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
		
		} else {
			this.jButtonAbrirOrderByTipoProduBanco = new JButtonMe();
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
			&& this.tipoprodubancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProduBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProduBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProduBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProduBanco.getRowHeight();//TipoProduBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProduBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProduBanco.isSelected()) {
					iHeightTable=TipoProduBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProduBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProduBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProduBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProduBanco.isSelected()) {
					iHeightTable=TipoProduBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProduBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProduBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProduBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProduBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProduBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProduBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProduBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProduBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProduBanco!=null && this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProduBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProduBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProduBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProduBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProduBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProduBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprodubancoLogic.getTipoProduBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprodubancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProduBanco> TraerTipoProduBancoBeans(List<TipoProduBanco> tipoprodubancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProduBanco tipoprodubanco:tipoprodubancos) {
					
				if(!(TipoProduBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProduBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprodubanco.setsDetalleGeneralEntityReporte(TipoProduBancoConstantesFunciones.getTipoProduBancoDescripcion(tipoprodubanco));
										
						
					
					

					if(tipoprodubanco.getReferenciaBancarias()!=null && Funciones.existeClass(classes,ReferenciaBancaria.class)) {
						try{tipoprodubanco.setreferenciabancariasDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaBancariaJInternalFrame.TraerReferenciaBancariaBeans(tipoprodubanco.getReferenciaBancarias(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoprodubanco.setsDetalleGeneralEntityReporte(tipoprodubanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprodubancobeans.add(tipoprodubancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprodubancos;
    }
	//PARA REPORTES FIN
}
