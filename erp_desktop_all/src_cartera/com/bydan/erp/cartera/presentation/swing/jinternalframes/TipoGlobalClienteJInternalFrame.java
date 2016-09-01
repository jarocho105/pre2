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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.cartera.util.TipoGlobalClienteConstantesFunciones;

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
public class TipoGlobalClienteJInternalFrame extends TipoGlobalClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGlobalCliente;
	
	protected JMenuBar jmenuBarTipoGlobalCliente;
	
	protected JMenu jmenuTipoGlobalCliente;
	protected JMenu jmenuDatosTipoGlobalCliente;
	protected JMenu jmenuArchivoTipoGlobalCliente;
	protected JMenu jmenuAccionesTipoGlobalCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGlobalCliente;	
	protected GridBagConstraints gridBagConstraintsTipoGlobalCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGlobalClienteDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGlobalCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGlobalCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGlobalCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGlobalClienteSessionBean tipoglobalclienteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGlobalCliente> tipoglobalclientes;		
	public List<TipoGlobalCliente> tipoglobalclientesEliminados;	
	public List<TipoGlobalCliente> tipoglobalclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGlobalCliente;		
	protected JButton jButtonAbrirOrderByTipoGlobalCliente;
	
	
	//protected JPanel jPanelOrderByTipoGlobalCliente;
	//public JScrollPane jScrollPanelOrderByTipoGlobalCliente;	
	//protected JButton jButtonCerrarOrderByTipoGlobalCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGlobalClienteLogic tipoglobalclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGlobalCliente;
	public JScrollPane jScrollPanelDatosEdicionTipoGlobalCliente;
	public JScrollPane jScrollPanelDatosGeneralTipoGlobalCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGlobalClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGlobalCliente;
	//public JScrollPane jScrollPanelImportacionTipoGlobalCliente;
	
	
	
	protected JPanel jPanelAccionesTipoGlobalCliente;
	
    protected JPanel jPanelPaginacionTipoGlobalCliente;
    protected JPanel jPanelParametrosReportesTipoGlobalCliente;
	protected JPanel jPanelParametrosReportesAccionesTipoGlobalCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGlobalCliente;
	protected JPanel jPanelParametrosAuxiliar2TipoGlobalCliente;
	protected JPanel jPanelParametrosAuxiliar3TipoGlobalCliente;
	protected JPanel jPanelParametrosAuxiliar4TipoGlobalCliente;
	//protected JPanel jPanelParametrosAuxiliar5TipoGlobalCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGlobalCliente;
	//protected JPanel jPanelImportacionTipoGlobalCliente;
	
	
	public JTable jTableDatosTipoGlobalCliente;
	
	
	
	//public JTable jTableDatosTipoGlobalClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGlobalCliente;
	protected JButton jButtonDuplicarTipoGlobalCliente;
	protected JButton jButtonCopiarTipoGlobalCliente;
	protected JButton jButtonVerFormTipoGlobalCliente;
	protected JButton jButtonNuevoRelacionesTipoGlobalCliente;
	protected JButton jButtonModificarTipoGlobalCliente;
	
    protected JButton jButtonGuardarCambiosTablaTipoGlobalCliente;
	protected JButton jButtonCerrarTipoGlobalCliente;
	
	
	protected JButton jButtonRecargarInformacionTipoGlobalCliente;
	protected JButton jButtonProcesarInformacionTipoGlobalCliente;
	
	
	protected JButton jButtonAnterioresTipoGlobalCliente;
	protected JButton jButtonSiguientesTipoGlobalCliente;
	protected JButton jButtonNuevoGuardarCambiosTipoGlobalCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGlobalCliente;
	//protected JButton jButtonCerrarReporteDinamicoTipoGlobalCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGlobalCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGlobalCliente;
	//protected JButton jButtonGenerarImportacionTipoGlobalCliente;
	//protected JButton jButtonCerrarImportacionTipoGlobalCliente;
	//protected JFileChooser jFileChooserImportacionTipoGlobalCliente;
	//protected File fileImportacionTipoGlobalCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGlobalCliente;
	protected JButton jButtonDuplicarToolBarTipoGlobalCliente;
	protected JButton jButtonNuevoRelacionesToolBarTipoGlobalCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGlobalCliente;
	protected JButton jButtonCopiarToolBarTipoGlobalCliente;
	protected JButton jButtonVerFormToolBarTipoGlobalCliente;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGlobalCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGlobalCliente;
	protected JButton jButtonCerrarToolBarTipoGlobalCliente;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGlobalCliente;
	protected JButton jButtonProcesarInformacionToolBarTipoGlobalCliente;
	protected JButton jButtonAnterioresToolBarTipoGlobalCliente;
	protected JButton jButtonSiguientesToolBarTipoGlobalCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGlobalCliente;
	protected JButton jButtonAbrirOrderByToolBarTipoGlobalCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGlobalCliente;
	protected JMenuItem jMenuItemDuplicarTipoGlobalCliente;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGlobalCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGlobalCliente;
	protected JMenuItem jMenuItemCopiarTipoGlobalCliente;
	protected JMenuItem jMenuItemVerFormTipoGlobalCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGlobalCliente;
	protected JMenuItem jMenuItemCerrarTipoGlobalCliente;
	protected JMenuItem jMenuItemDetalleCerrarTipoGlobalCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGlobalCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGlobalCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGlobalCliente;
	protected JMenuItem jMenuItemProcesarInformacionTipoGlobalCliente;
	protected JMenuItem jMenuItemAnterioresTipoGlobalCliente;
	protected JMenuItem jMenuItemSiguientesTipoGlobalCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGlobalCliente;
	protected JMenuItem jMenuItemAbrirOrderByTipoGlobalCliente;
	protected JMenuItem jMenuItemMostrarOcultarTipoGlobalCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGlobalCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGlobalCliente;
	protected JCheckBox jCheckBoxSeleccionadosTipoGlobalCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGlobalCliente;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGlobalCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGlobalCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGlobalCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGlobalCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGlobalCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGlobalCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGlobalCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGlobalCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGlobalCliente;
	protected JTextField jTextFieldValorCampoGeneralTipoGlobalCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGlobalCliente;
	//public JList<Reporte> jListColumnasSelectReporteTipoGlobalCliente;
	//public JScrollPane jScrollColumnasSelectReporteTipoGlobalCliente;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGlobalCliente;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGlobalCliente;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGlobalCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGlobalCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGlobalCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGlobalCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGlobalCliente;
	
		
	//public JLabel jLabelArchivoImportacionTipoGlobalCliente;	
	//public JLabel jLabelPathArchivoImportacionTipoGlobalCliente;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGlobalCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGlobalCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGlobalCliente;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGlobalCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGlobalCliente;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGlobalCliente;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGlobalCliente;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGlobalCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGlobalCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGlobalCliente;	
	
	
	
	
	
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
	public TipoGlobalClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGlobalClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGlobalClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGlobalClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGlobalCliente)	{
		this.jButtonRecargarInformacionTipoGlobalCliente = jButtonRecargarInformacionTipoGlobalCliente;
	}
	
	public JButton getjButtonProcesarInformacionTipoGlobalCliente() {
		return this.jButtonProcesarInformacionTipoGlobalCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGlobalCliente)	{
		this.jButtonProcesarInformacionTipoGlobalCliente = jButtonProcesarInformacionTipoGlobalCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGlobalCliente() {
		return this.jButtonRecargarInformacionTipoGlobalCliente;
	}
	
	
	public List<TipoGlobalCliente> gettipoglobalclientes() {
		return this.tipoglobalclientes;
	}

	public void settipoglobalclientes(List<TipoGlobalCliente> tipoglobalclientes) {
		this.tipoglobalclientes = tipoglobalclientes;
	}
	
	public List<TipoGlobalCliente> gettipoglobalclientesAux() {
		return this.tipoglobalclientesAux;
	}

	public void settipoglobalclientesAux(List<TipoGlobalCliente> tipoglobalclientesAux) {
		this.tipoglobalclientesAux = tipoglobalclientesAux;
	}
	
	public List<TipoGlobalCliente> gettipoglobalclientesEliminados() {
		return this.tipoglobalclientesEliminados;
	}

	public void setTipoGlobalClientesEliminados(List<TipoGlobalCliente> tipoglobalclientesEliminados) {
		this.tipoglobalclientesEliminados = tipoglobalclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGlobalCliente() {
		return jComboBoxTiposSeleccionarTipoGlobalCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGlobalCliente(
			JComboBox jComboBoxTiposSeleccionarTipoGlobalCliente) {
		this.jComboBoxTiposSeleccionarTipoGlobalCliente = jComboBoxTiposSeleccionarTipoGlobalCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGlobalCliente() {
		return jTextFieldValorCampoGeneralTipoGlobalCliente;
	}

	public void setjTextFieldValorCampoGeneralTipoGlobalCliente(
			JTextField jTextFieldValorCampoGeneralTipoGlobalCliente) {
		this.jTextFieldValorCampoGeneralTipoGlobalCliente = jTextFieldValorCampoGeneralTipoGlobalCliente;
	}

	public void setBorderResaltarValorCampoGeneralTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGlobalCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGlobalCliente() {
		return this.jCheckBoxSeleccionarTodosTipoGlobalCliente;
	}

	public void setjCheckBoxSeleccionarTodosTipoGlobalCliente(
			JCheckBox jCheckBoxSeleccionarTodosTipoGlobalCliente) {
		this.jCheckBoxSeleccionarTodosTipoGlobalCliente = jCheckBoxSeleccionarTodosTipoGlobalCliente;
	}

	public void setBorderResaltarSeleccionarTodosTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGlobalCliente() {
		return this.jCheckBoxSeleccionadosTipoGlobalCliente;
	}

	public void setjCheckBoxSeleccionadosTipoGlobalCliente(
			JCheckBox jCheckBoxSeleccionadosTipoGlobalCliente) {
		this.jCheckBoxSeleccionadosTipoGlobalCliente = jCheckBoxSeleccionadosTipoGlobalCliente;
	}
	
	public void setBorderResaltarSeleccionadosTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGlobalCliente() {
		return this.jComboBoxTiposArchivosReportesTipoGlobalCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGlobalCliente(
			JComboBox jComboBoxTiposArchivosReportesTipoGlobalCliente) {
		this.jComboBoxTiposArchivosReportesTipoGlobalCliente = jComboBoxTiposArchivosReportesTipoGlobalCliente;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGlobalCliente() {
		return this.jComboBoxTiposReportesTipoGlobalCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGlobalCliente(
			JComboBox jComboBoxTiposReportesTipoGlobalCliente) {
		this.jComboBoxTiposReportesTipoGlobalCliente = jComboBoxTiposReportesTipoGlobalCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGlobalCliente() {
	//	return jComboBoxTiposReportesDinamicoTipoGlobalCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGlobalCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGlobalCliente) {
	//	this.jComboBoxTiposReportesDinamicoTipoGlobalCliente = jComboBoxTiposReportesDinamicoTipoGlobalCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente = jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente;
	//}
	
	public void setBorderResaltarTiposReportesTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGlobalCliente() {
		return this.jComboBoxTiposGraficosReportesTipoGlobalCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGlobalCliente(
			JComboBox jComboBoxTiposGraficosReportesTipoGlobalCliente) {
		this.jComboBoxTiposGraficosReportesTipoGlobalCliente = jComboBoxTiposGraficosReportesTipoGlobalCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGlobalCliente() {
		return this.jComboBoxTiposPaginacionTipoGlobalCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGlobalCliente(
			JComboBox jComboBoxTiposPaginacionTipoGlobalCliente) {
		this.jComboBoxTiposPaginacionTipoGlobalCliente = jComboBoxTiposPaginacionTipoGlobalCliente;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGlobalCliente() {
		return this.jComboBoxTiposRelacionesTipoGlobalCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGlobalCliente() {
		return this.jComboBoxTiposAccionesTipoGlobalCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGlobalCliente(
			JComboBox jComboBoxTiposRelacionesTipoGlobalCliente) {
		this.jComboBoxTiposRelacionesTipoGlobalCliente = jComboBoxTiposRelacionesTipoGlobalCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGlobalCliente(
			JComboBox jComboBoxTiposAccionesTipoGlobalCliente) {
		this.jComboBoxTiposAccionesTipoGlobalCliente = jComboBoxTiposAccionesTipoGlobalCliente;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGlobalCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGlobalCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGlobalCliente() {
	//	return jCheckBoxConGraficoDinamicoTipoGlobalCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGlobalCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGlobalCliente) {
	//	this.jCheckBoxConGraficoDinamicoTipoGlobalCliente = jCheckBoxConGraficoDinamicoTipoGlobalCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGlobalCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGlobalCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGlobalCliente .setBorder(borderResaltar);		
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
		this.tipoglobalclienteSessionBean=new TipoGlobalClienteSessionBean();
		
		this.tipoglobalclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoglobalclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoglobalclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGlobalClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGlobalClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGlobalClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGlobalClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGlobalClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Global Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGlobalClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGlobalCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGlobalCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"nuevo","nuevo","Nuevo"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"duplicar","duplicar","Duplicar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"copiar","copiar","Copiar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"ver_form","ver_form","Ver"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"recargar","recargar","Recargar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGlobalCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGlobalCliente,this.jTtoolBarTipoGlobalCliente,
							"cerrar","cerrar","Salir"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGlobalCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGlobalCliente;
			
				this.jButtonProcesarInformacionToolBarTipoGlobalCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGlobalCliente;
				
		//protected JButton jButtonModificarToolBarTipoGlobalCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGlobalCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGlobalCliente=new JMenuMe("General");
		this.jmenuArchivoTipoGlobalCliente=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGlobalCliente=new JMenuMe("Acciones");
		this.jmenuDatosTipoGlobalCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGlobalCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGlobalCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGlobalCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGlobalCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGlobalCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGlobalCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGlobalCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGlobalCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGlobalCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGlobalCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGlobalCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGlobalCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGlobalCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGlobalCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGlobalCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGlobalCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGlobalCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGlobalCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGlobalCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGlobalCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGlobalCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGlobalCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGlobalCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGlobalCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGlobalCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGlobalCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGlobalCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGlobalCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGlobalCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGlobalCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGlobalCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGlobalCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGlobalCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGlobalCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGlobalCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGlobalCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGlobalCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGlobalCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGlobalCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGlobalCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGlobalCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGlobalCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGlobalCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGlobalCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGlobalCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGlobalCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGlobalCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGlobalCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGlobalCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGlobalCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGlobalCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGlobalCliente.add(this.jMenuItemCerrarTipoGlobalCliente);
			
			this.jmenuAccionesTipoGlobalCliente.add(this.jMenuItemNuevoTipoGlobalCliente);
			this.jmenuAccionesTipoGlobalCliente.add(this.jMenuItemNuevoGuardarCambiosTipoGlobalCliente);
			this.jmenuAccionesTipoGlobalCliente.add(this.jMenuItemNuevoRelacionesTipoGlobalCliente);
			this.jmenuAccionesTipoGlobalCliente.add(this.jMenuItemGuardarCambiosTablaTipoGlobalCliente);		
			this.jmenuAccionesTipoGlobalCliente.add(this.jMenuItemDuplicarTipoGlobalCliente);		
			this.jmenuAccionesTipoGlobalCliente.add(this.jMenuItemCopiarTipoGlobalCliente);		
			this.jmenuAccionesTipoGlobalCliente.add(this.jMenuItemVerFormTipoGlobalCliente);		
			
			this.jmenuDatosTipoGlobalCliente.add(this.jMenuItemRecargarInformacionTipoGlobalCliente);				
			this.jmenuDatosTipoGlobalCliente.add(this.jMenuItemAnterioresTipoGlobalCliente);				
			this.jmenuDatosTipoGlobalCliente.add(this.jMenuItemSiguientesTipoGlobalCliente);				
			this.jmenuDatosTipoGlobalCliente.add(this.jMenuItemAbrirOrderByTipoGlobalCliente);				
			this.jmenuDatosTipoGlobalCliente.add(this.jMenuItemMostrarOcultarTipoGlobalCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGlobalCliente.add(this.jMenuItemGuardarCambiosTipoGlobalCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGlobalCliente.add(this.jmenuArchivoTipoGlobalCliente);		
			this.jmenuBarTipoGlobalCliente.add(this.jmenuAccionesTipoGlobalCliente);		
			this.jmenuBarTipoGlobalCliente.add(this.jmenuDatosTipoGlobalCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGlobalCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGlobalCliente() {
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
			//this.jInternalFrameDetalleTipoGlobalCliente = new TipoGlobalClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Global Cliente DATOS");
			this.jInternalFrameDetalleFormTipoGlobalCliente = new TipoGlobalClienteDetalleFormJInternalFrame(jDesktopPane,this.tipoglobalclienteSessionBean.getConGuardarRelaciones(),this.tipoglobalclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGlobalCliente = null;//new TipoGlobalClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGlobalCliente= new GridBagLayout();
		
		
		this.jTableDatosTipoGlobalCliente = new JTableMe();      
		
		String sToolTipTipoGlobalCliente="";
		sToolTipTipoGlobalCliente=TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGlobalCliente+="(Cartera.TipoGlobalCliente)";
		}
		
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGlobalCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGlobalCliente.setToolTipText(sToolTipTipoGlobalCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGlobalCliente);
		this.jTableDatosTipoGlobalCliente.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGlobalCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGlobalCliente.setRowSelectionAllowed(true);
		this.jTableDatosTipoGlobalCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGlobalCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGlobalCliente = new JButtonMe();
		this.jButtonDuplicarTipoGlobalCliente = new JButtonMe();
		this.jButtonCopiarTipoGlobalCliente = new JButtonMe();
		this.jButtonVerFormTipoGlobalCliente = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGlobalCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGlobalCliente = new JButtonMe();
		this.jButtonCerrarTipoGlobalCliente = new JButtonMe();
		
		this.jScrollPanelDatosTipoGlobalCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGlobalCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Global Cliente";
		
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Global Clientees" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGlobalCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGlobalCliente.setToolTipText("Acciones");
        this.jPanelAccionesTipoGlobalCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGlobalCliente=new ReporteDinamicoJInternalFrame(TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGlobalCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGlobalCliente=new ImportacionJInternalFrame(TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGlobalCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGlobalCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGlobalCliente.setText("Orden");
		this.jButtonAbrirOrderByTipoGlobalCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGlobalCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGlobalCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGlobalCliente,false,this);
			
			//this.cargarOrderByTipoGlobalCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGlobalCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGlobalCliente,true,this);
			
			//this.cargarOrderByTipoGlobalCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGlobalCliente.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGlobalCliente.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGlobalCliente.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoGlobalCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGlobalCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGlobalCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGlobalCliente.setText("Nuevo");
		this.jButtonDuplicarTipoGlobalCliente.setText("Duplicar");
		this.jButtonCopiarTipoGlobalCliente.setText("Copiar");
		this.jButtonVerFormTipoGlobalCliente.setText("Ver");
		this.jButtonNuevoRelacionesTipoGlobalCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.setText("Guardar");
		this.jButtonCerrarTipoGlobalCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGlobalCliente,"nuevo_button","Nuevo",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGlobalCliente,"duplicar_button","Duplicar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGlobalCliente,"copiar_button","Copiar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGlobalCliente,"ver_form","Ver",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGlobalCliente,"nuevorelaciones_button","Nuevo Rel",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGlobalCliente,"guardarcambiostabla_button","Guardar",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGlobalCliente,"cerrar_button","Salir",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGlobalCliente.setToolTipText("Nuevo"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGlobalCliente.setToolTipText("Duplicar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGlobalCliente.setToolTipText("Copiar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGlobalCliente.setToolTipText("Ver"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGlobalCliente.setToolTipText("Nuevo Rel"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.setToolTipText("Guardar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGlobalCliente.setToolTipText("Salir"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGlobalCliente";
		inputMap = this.jButtonNuevoTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGlobalCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGlobalCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGlobalCliente";
		inputMap = this.jButtonDuplicarTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGlobalCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGlobalCliente"));
		
		//COPIAR
		sMapKey = "CopiarTipoGlobalCliente";
		inputMap = this.jButtonCopiarTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGlobalCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGlobalCliente"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGlobalCliente";
		inputMap = this.jButtonVerFormTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGlobalCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGlobalCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGlobalCliente";
		inputMap = this.jButtonNuevoRelacionesTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGlobalCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGlobalCliente";
		inputMap = this.jButtonModificarTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGlobalCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGlobalCliente";
		inputMap = this.jButtonCerrarTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGlobalCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGlobalCliente";
		inputMap = this.jButtonGuardarCambiosTablaTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGlobalCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGlobalCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGlobalCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGlobalCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGlobalCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGlobalCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGlobalCliente.setName("jPanelParametrosReportesTipoGlobalCliente"); 
		
		this.jPanelParametrosReportesAccionesTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGlobalCliente.setName("jPanelParametrosReportesAccionesTipoGlobalCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGlobalCliente = new JButtonMe();
		this.jButtonRecargarInformacionTipoGlobalCliente.setText("Recargar");
		this.jButtonRecargarInformacionTipoGlobalCliente.setToolTipText("Recargar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGlobalCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGlobalCliente = new JButtonMe();
		this.jButtonProcesarInformacionTipoGlobalCliente.setText("Procesar");
		this.jButtonProcesarInformacionTipoGlobalCliente.setToolTipText("Procesar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGlobalCliente.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGlobalCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGlobalCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGlobalCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGlobalCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGlobalCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGlobalCliente.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGlobalCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGlobalCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGlobalCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGlobalCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGlobalCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGlobalCliente.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGlobalCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGlobalCliente.setText("Accion");
		this.jComboBoxTiposAccionesTipoGlobalCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGlobalCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGlobalCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGlobalCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGlobalCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGlobalCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGlobalCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGlobalCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGlobalCliente = new JLabelMe();
		
		this.jLabelAccionesTipoGlobalCliente.setText("Acciones");		
		this.jLabelAccionesTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGlobalCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGlobalCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGlobalCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGlobalCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGlobalCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGlobalCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGlobalCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGlobalCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGlobalCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGlobalCliente = new JButtonMe();
		//this.jButtonAnterioresTipoGlobalCliente.setText("<<");
        this.jButtonAnterioresTipoGlobalCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGlobalCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGlobalCliente = new JButtonMe();
		//this.jButtonSiguientesTipoGlobalCliente.setText(">>");
        this.jButtonSiguientesTipoGlobalCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGlobalCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGlobalCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGlobalCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGlobalCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGlobalCliente,"nuevoguardarcambios_button","Nue",this.tipoglobalclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGlobalCliente";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGlobalCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGlobalCliente";
		inputMap = this.jButtonRecargarInformacionTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGlobalCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGlobalCliente";
		inputMap = this.jButtonSiguientesTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGlobalCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGlobalCliente";
		inputMap = this.jButtonAnterioresTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGlobalCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGlobalCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGlobalCliente.setMinimumSize(new Dimension(this.getWidth(),TipoGlobalClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGlobalClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGlobalCliente.setMaximumSize(new Dimension(this.getWidth(),TipoGlobalClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGlobalClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGlobalCliente.setPreferredSize(new Dimension(this.getWidth(),TipoGlobalClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGlobalClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGlobalCliente = new GridBagLayout();

			this.jPanelPaginacionTipoGlobalCliente.setLayout(gridaBagLayoutPaginacionTipoGlobalCliente);						
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonAnterioresTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
					
						
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
			
			this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonNuevoGuardarCambiosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
						
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
			this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonSiguientesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 1;
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonNuevoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGlobalCliente.gridy = 1;
				this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonNuevoRelacionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			}
			
			
			if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGlobalCliente.gridy = 1;
				this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonGuardarCambiosTablaTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			}
			
			
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 1;
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonDuplicarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 1;
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonCopiarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 1;
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonVerFormTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 1;
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGlobalCliente.add(this.jButtonCerrarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
		
		
		this.jButtonRecargarInformacionTipoGlobalCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGlobalCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGlobalCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGlobalCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGlobalCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGlobalCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGlobalCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGlobalCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGlobalCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGlobalCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGlobalCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGlobalCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGlobalCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGlobalCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGlobalCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGlobalCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGlobalCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGlobalCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGlobalCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGlobalCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGlobalCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGlobalCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGlobalCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGlobalCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGlobalCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGlobalCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGlobalCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGlobalCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGlobalCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGlobalCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGlobalCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGlobalCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGlobalCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGlobalCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGlobalCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGlobalCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGlobalCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGlobalCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGlobalCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGlobalCliente.setLayout(gridaBagParametrosReportesTipoGlobalCliente);
			this.jPanelParametrosReportesAccionesTipoGlobalCliente.setLayout(gridaBagParametrosReportesAccionesTipoGlobalCliente);
			
			
			this.jPanelParametrosAuxiliar1TipoGlobalCliente.setLayout(gridaBagParametrosAuxiliar1TipoGlobalCliente);
			this.jPanelParametrosAuxiliar2TipoGlobalCliente.setLayout(gridaBagParametrosAuxiliar2TipoGlobalCliente);
			this.jPanelParametrosAuxiliar3TipoGlobalCliente.setLayout(gridaBagParametrosAuxiliar3TipoGlobalCliente);
			this.jPanelParametrosAuxiliar4TipoGlobalCliente.setLayout(gridaBagParametrosAuxiliar4TipoGlobalCliente);
			//this.jPanelParametrosAuxiliar5TipoGlobalCliente.setLayout(gridaBagParametrosAuxiliar2TipoGlobalCliente);			
			
			
			
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jButtonRecargarInformacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGlobalCliente.add(this.jComboBoxTiposPaginacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGlobalCliente.add(this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGlobalCliente.add(this.jComboBoxTiposArchivosReportesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jPanelParametrosAuxiliar1TipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGlobalCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGlobalCliente.add(this.jComboBoxTiposReportesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jPanelParametrosAuxiliar4TipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jComboBoxTiposReportesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jCheckBoxGenerarReporteTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jPanelParametrosAuxiliar2TipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGlobalCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jLabelAccionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGlobalCliente.add(this.jButtonAbrirOrderByTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jComboBoxTiposSeleccionarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);			
			
			
			/*
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGlobalCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jCheckBoxSeleccionarTodosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGlobalCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGlobalCliente.add(this.jCheckBoxSeleccionarTodosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);															
				
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGlobalCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGlobalCliente.add(this.jCheckBoxSeleccionadosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jPanelParametrosAuxiliar3TipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jComboBoxTiposRelacionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
				
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGlobalCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGlobalCliente.add(this.jComboBoxTiposAccionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGlobalCliente = new GridBagLayout();

			this.jScrollPanelDatosTipoGlobalCliente.setLayout(gridaBagLayoutDatosTipoGlobalCliente);
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
			this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
			
			this.jScrollPanelDatosTipoGlobalCliente.add(this.jTableDatosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGlobalCliente.setViewportView(this.jTableDatosTipoGlobalCliente);
		this.jTableDatosTipoGlobalCliente.setFillsViewportHeight(true);
		this.jTableDatosTipoGlobalCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGlobalCliente= new GridBagLayout();
		this.jPanelAccionesTipoGlobalCliente.setLayout(gridaBagLayoutAccionesTipoGlobalCliente);
		
		
		/*	
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = 0;
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
			
		this.jPanelAccionesTipoGlobalCliente.add(this.jButtonNuevoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGlobalCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGlobalCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();						
			this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGlobalCliente.gridx = 0;		
			//this.gridBagConstraintsTipoGlobalCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGlobalCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;		
		//this.gridBagConstraintsTipoGlobalCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGlobalCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGlobalCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);								
		
		
		/*
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		*/		
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGlobalCliente.gridx =0;
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGlobalCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
				
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoGlobalClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGlobalCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGlobalCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGlobalCliente.setLayout(gridaBagLayoutBusquedasParametrosTipoGlobalCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGlobalCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGlobalCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGlobalCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGlobalCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
			
			
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
			
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGlobalCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGlobalCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGlobalCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGlobalCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGlobalCliente.setName("jPanelReporteDinamicoTipoGlobalCliente"); 
		
		this.jPanelReporteDinamicoTipoGlobalCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGlobalCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGlobalCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGlobalCliente.setLayout(gridaBagLayoutReporteDinamicoTipoGlobalCliente);
		
		
		this.jInternalFrameReporteDinamicoTipoGlobalCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGlobalCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGlobalCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGlobalCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGlobalCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGlobalCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGlobalCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGlobalCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGlobalCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGlobalCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGlobalCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGlobalCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGlobalCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGlobalCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Global Clientees"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGlobalCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGlobalCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jLabelColumnasSelectReporteTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGlobalCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGlobalCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGlobalCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGlobalCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGlobalCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGlobalCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGlobalCliente=new JScrollPane(this.jListColumnasSelectReporteTipoGlobalCliente);
			
			this.jScrollColumnasSelectReporteTipoGlobalCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGlobalCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGlobalCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jListColumnasSelectReporteTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jScrollColumnasSelectReporteTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGlobalCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGlobalCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jLabelRelacionesSelectReporteTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGlobalCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGlobalCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGlobalCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGlobalCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGlobalCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGlobalCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGlobalCliente=new JScrollPane(this.jListRelacionesSelectReporteTipoGlobalCliente);
			
			this.jScrollRelacionesSelectReporteTipoGlobalCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGlobalCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGlobalCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jListRelacionesSelectReporteTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jScrollRelacionesSelectReporteTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoGlobalCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGlobalCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGlobalCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGlobalCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGlobalCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGlobalCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGlobalCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGlobalCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGlobalCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGlobalCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jLabelGenerarExcelReporteDinamicoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGlobalCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGlobalCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGlobalCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGlobalCliente.setToolTipText("Generar EXCEL"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jButtonGenerarExcelReporteDinamicoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jComboBoxTiposReportesDinamicoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGlobalCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGlobalCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jLabelTiposArchivoReporteDinamicoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGlobalCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGlobalCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGlobalCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGlobalCliente.setToolTipText("Generar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jButtonGenerarReporteDinamicoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGlobalCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGlobalCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGlobalCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGlobalCliente.setToolTipText("Cancelar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGlobalCliente.add(this.jButtonCerrarReporteDinamicoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGlobalCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGlobalCliente= new JScrollPane(jPanelReporteDinamicoTipoGlobalCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGlobalCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGlobalCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGlobalCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Global Clientees"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGlobalCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGlobalCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGlobalCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGlobalCliente);
		this.jInternalFrameReporteDinamicoTipoGlobalCliente.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGlobalCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGlobalCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGlobalCliente.setName("jPanelImportacionTipoGlobalCliente"); 
		
		this.jPanelImportacionTipoGlobalCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGlobalCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGlobalCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGlobalCliente.setLayout(gridaBagLayoutImportacionTipoGlobalCliente);
		
		
		this.jInternalFrameImportacionTipoGlobalCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGlobalCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGlobalCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGlobalCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGlobalCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGlobalCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGlobalCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGlobalCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGlobalCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGlobalCliente.setResizable(true);
	    this.jInternalFrameImportacionTipoGlobalCliente.setClosable(true);
	    this.jInternalFrameImportacionTipoGlobalCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGlobalCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGlobalCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGlobalCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGlobalCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGlobalCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGlobalCliente.setResizable(true);
	    this.jInternalFrameImportacionTipoGlobalCliente.setClosable(true);
	    this.jInternalFrameImportacionTipoGlobalCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGlobalCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGlobalCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGlobalCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Global Clientees"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGlobalCliente = new JLabelMe();

		this.jLabelArchivoImportacionTipoGlobalCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGlobalCliente.add(this.jLabelArchivoImportacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGlobalCliente = new JFileChooser();		
		this.jFileChooserImportacionTipoGlobalCliente.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGlobalCliente = new JButtonMe();
		this.jButtonAbrirImportacionTipoGlobalCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGlobalCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGlobalCliente.setToolTipText("Generar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGlobalCliente.add(this.jButtonAbrirImportacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGlobalCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGlobalCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGlobalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGlobalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGlobalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGlobalCliente.add(this.jLabelPathArchivoImportacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGlobalCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGlobalCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGlobalCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGlobalCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGlobalCliente.add(this.jTextFieldPathArchivoImportacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGlobalCliente = new JButtonMe();
		this.jButtonGenerarImportacionTipoGlobalCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGlobalCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGlobalCliente.setToolTipText("Generar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGlobalCliente.add(this.jButtonGenerarImportacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGlobalCliente = new JButtonMe();
		this.jButtonCerrarImportacionTipoGlobalCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGlobalCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGlobalCliente.setToolTipText("Cancelar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGlobalCliente.add(this.jButtonCerrarImportacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGlobalCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGlobalCliente= new JScrollPane(jPanelImportacionTipoGlobalCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoGlobalCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGlobalCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGlobalCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGlobalCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGlobalCliente);
		this.jInternalFrameImportacionTipoGlobalCliente.getContentPane().add(this.jScrollPanelImportacionTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGlobalCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGlobalCliente = new JButtonMe();
			this.jButtonAbrirOrderByTipoGlobalCliente.setText("Orden");
			this.jButtonAbrirOrderByTipoGlobalCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGlobalCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGlobalCliente";
			inputMap = this.jButtonAbrirOrderByTipoGlobalCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGlobalCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGlobalCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGlobalCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGlobalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGlobalCliente.setName("jPanelOrderByTipoGlobalCliente"); 
			
			this.jPanelOrderByTipoGlobalCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGlobalCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGlobalCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGlobalCliente.setLayout(gridaBagLayoutOrderByTipoGlobalCliente);
			
			
			this.jTableDatosTipoGlobalClienteOrderBy = new JTableMe();        
			this.jTableDatosTipoGlobalClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGlobalClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGlobalClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGlobalClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGlobalClienteOrderBy.setViewportView(this.jTableDatosTipoGlobalClienteOrderBy);
			this.jTableDatosTipoGlobalClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGlobalClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGlobalCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGlobalCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGlobalCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGlobalCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGlobalCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGlobalCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGlobalCliente.setTitle("Orden");
			this.jInternalFrameOrderByTipoGlobalCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGlobalCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGlobalCliente.setResizable(true);
			this.jInternalFrameOrderByTipoGlobalCliente.setClosable(true);
			this.jInternalFrameOrderByTipoGlobalCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGlobalCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGlobalCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGlobalCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGlobalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Global Clientees"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGlobalCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGlobalCliente.ipady =150;
				
			this.jPanelOrderByTipoGlobalCliente.add(jScrollPanelDatosTipoGlobalClienteOrderBy, this.gridBagConstraintsTipoGlobalCliente);//this.jTableDatosTipoGlobalClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGlobalCliente = new JButtonMe();
			this.jButtonCerrarOrderByTipoGlobalCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGlobalCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGlobalCliente.setToolTipText("Cancelar"+" "+TipoGlobalClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGlobalCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGlobalCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGlobalCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGlobalCliente.add(this.jButtonCerrarOrderByTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGlobalCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGlobalCliente= new JScrollPane(jPanelOrderByTipoGlobalCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGlobalCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoGlobalCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGlobalCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGlobalCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGlobalCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGlobalCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGlobalCliente);
			
			this.jInternalFrameOrderByTipoGlobalCliente.getContentPane().add(this.jScrollPanelOrderByTipoGlobalCliente, this.gridBagConstraintsTipoGlobalCliente);			
		
		} else {
			this.jButtonAbrirOrderByTipoGlobalCliente = new JButtonMe();
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
			&& this.tipoglobalclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGlobalCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGlobalCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGlobalCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGlobalCliente.getRowHeight();//TipoGlobalClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGlobalClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente.isSelected()) {
					iHeightTable=TipoGlobalClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGlobalClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGlobalClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGlobalClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGlobalCliente.isSelected()) {
					iHeightTable=TipoGlobalClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGlobalClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGlobalClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGlobalCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGlobalCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGlobalCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGlobalCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGlobalCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGlobalCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGlobalCliente!=null && this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoglobalclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGlobalCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGlobalCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGlobalCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGlobalCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGlobalCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGlobalCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGlobalCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoglobalclienteLogic.getTipoGlobalClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoglobalclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGlobalCliente> TraerTipoGlobalClienteBeans(List<TipoGlobalCliente> tipoglobalclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGlobalCliente tipoglobalcliente:tipoglobalclientes) {
					
				if(!(TipoGlobalClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGlobalClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoglobalcliente.setsDetalleGeneralEntityReporte(TipoGlobalClienteConstantesFunciones.getTipoGlobalClienteDescripcion(tipoglobalcliente));
										
						
					
					

					if(tipoglobalcliente.getDefinicions()!=null && Funciones.existeClass(classes,Definicion.class)) {
						try{tipoglobalcliente.setdefinicionsDescripcionReporte(new JRBeanCollectionDataSource(DefinicionJInternalFrame.TraerDefinicionBeans(tipoglobalcliente.getDefinicions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoglobalcliente.setsDetalleGeneralEntityReporte(tipoglobalcliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoglobalclientebeans.add(tipoglobalclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoglobalclientes;
    }
	//PARA REPORTES FIN
}
