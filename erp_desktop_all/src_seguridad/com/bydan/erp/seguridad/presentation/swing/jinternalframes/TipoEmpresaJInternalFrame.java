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
import com.bydan.erp.seguridad.util.TipoEmpresaConstantesFunciones;

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
public class TipoEmpresaJInternalFrame extends TipoEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoEmpresa;
	
	protected JMenuBar jmenuBarTipoEmpresa;
	
	protected JMenu jmenuTipoEmpresa;
	protected JMenu jmenuDatosTipoEmpresa;
	protected JMenu jmenuArchivoTipoEmpresa;
	protected JMenu jmenuAccionesTipoEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoEmpresaSessionBean tipoempresaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoEmpresa> tipoempresas;		
	public List<TipoEmpresa> tipoempresasEliminados;	
	public List<TipoEmpresa> tipoempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoEmpresa;		
	protected JButton jButtonAbrirOrderByTipoEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoEmpresaLogic tipoempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoEmpresa;
	
    protected JPanel jPanelPaginacionTipoEmpresa;
    protected JPanel jPanelParametrosReportesTipoEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoEmpresa;
	//protected JPanel jPanelImportacionTipoEmpresa;
	
	
	public JTable jTableDatosTipoEmpresa;
	
	
	
	//public JTable jTableDatosTipoEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoEmpresa;
	protected JButton jButtonDuplicarTipoEmpresa;
	protected JButton jButtonCopiarTipoEmpresa;
	protected JButton jButtonVerFormTipoEmpresa;
	protected JButton jButtonNuevoRelacionesTipoEmpresa;
	protected JButton jButtonModificarTipoEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoEmpresa;
	protected JButton jButtonCerrarTipoEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoEmpresa;
	protected JButton jButtonProcesarInformacionTipoEmpresa;
	
	
	protected JButton jButtonAnterioresTipoEmpresa;
	protected JButton jButtonSiguientesTipoEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoEmpresa;
	//protected JButton jButtonGenerarImportacionTipoEmpresa;
	//protected JButton jButtonCerrarImportacionTipoEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoEmpresa;
	//protected File fileImportacionTipoEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEmpresa;
	protected JButton jButtonDuplicarToolBarTipoEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoEmpresa;
	protected JButton jButtonCopiarToolBarTipoEmpresa;
	protected JButton jButtonVerFormToolBarTipoEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEmpresa;
	protected JButton jButtonCerrarToolBarTipoEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoEmpresa;
	protected JButton jButtonAnterioresToolBarTipoEmpresa;
	protected JButton jButtonSiguientesToolBarTipoEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoEmpresa;
	protected JMenuItem jMenuItemCopiarTipoEmpresa;
	protected JMenuItem jMenuItemVerFormTipoEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEmpresa;
	protected JMenuItem jMenuItemCerrarTipoEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoEmpresa;	
	
	
	
	
	
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
	public TipoEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoEmpresa)	{
		this.jButtonRecargarInformacionTipoEmpresa = jButtonRecargarInformacionTipoEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoEmpresa() {
		return this.jButtonProcesarInformacionTipoEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEmpresa)	{
		this.jButtonProcesarInformacionTipoEmpresa = jButtonProcesarInformacionTipoEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoEmpresa() {
		return this.jButtonRecargarInformacionTipoEmpresa;
	}
	
	
	public List<TipoEmpresa> gettipoempresas() {
		return this.tipoempresas;
	}

	public void settipoempresas(List<TipoEmpresa> tipoempresas) {
		this.tipoempresas = tipoempresas;
	}
	
	public List<TipoEmpresa> gettipoempresasAux() {
		return this.tipoempresasAux;
	}

	public void settipoempresasAux(List<TipoEmpresa> tipoempresasAux) {
		this.tipoempresasAux = tipoempresasAux;
	}
	
	public List<TipoEmpresa> gettipoempresasEliminados() {
		return this.tipoempresasEliminados;
	}

	public void setTipoEmpresasEliminados(List<TipoEmpresa> tipoempresasEliminados) {
		this.tipoempresasEliminados = tipoempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoEmpresa() {
		return jComboBoxTiposSeleccionarTipoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoEmpresa) {
		this.jComboBoxTiposSeleccionarTipoEmpresa = jComboBoxTiposSeleccionarTipoEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoEmpresa() {
		return jTextFieldValorCampoGeneralTipoEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoEmpresa) {
		this.jTextFieldValorCampoGeneralTipoEmpresa = jTextFieldValorCampoGeneralTipoEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoEmpresa = jCheckBoxSeleccionarTodosTipoEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoEmpresa() {
		return this.jCheckBoxSeleccionadosTipoEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoEmpresa) {
		this.jCheckBoxSeleccionadosTipoEmpresa = jCheckBoxSeleccionadosTipoEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoEmpresa = jComboBoxTiposArchivosReportesTipoEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoEmpresa() {
		return this.jComboBoxTiposReportesTipoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoEmpresa(
			JComboBox jComboBoxTiposReportesTipoEmpresa) {
		this.jComboBoxTiposReportesTipoEmpresa = jComboBoxTiposReportesTipoEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoEmpresa = jComboBoxTiposReportesDinamicoTipoEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoEmpresa = jComboBoxTiposGraficosReportesTipoEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoEmpresa() {
		return this.jComboBoxTiposPaginacionTipoEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoEmpresa) {
		this.jComboBoxTiposPaginacionTipoEmpresa = jComboBoxTiposPaginacionTipoEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoEmpresa() {
		return this.jComboBoxTiposRelacionesTipoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEmpresa() {
		return this.jComboBoxTiposAccionesTipoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoEmpresa) {
		this.jComboBoxTiposRelacionesTipoEmpresa = jComboBoxTiposRelacionesTipoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEmpresa(
			JComboBox jComboBoxTiposAccionesTipoEmpresa) {
		this.jComboBoxTiposAccionesTipoEmpresa = jComboBoxTiposAccionesTipoEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoEmpresa = jCheckBoxConGraficoDinamicoTipoEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoEmpresa .setBorder(borderResaltar);		
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
		this.tipoempresaSessionBean=new TipoEmpresaSessionBean();
		
		this.tipoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"copiar","copiar","Copiar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"recargar","recargar","Recargar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoEmpresa,this.jTtoolBarTipoEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoEmpresa.add(this.jMenuItemCerrarTipoEmpresa);
			
			this.jmenuAccionesTipoEmpresa.add(this.jMenuItemNuevoTipoEmpresa);
			this.jmenuAccionesTipoEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoEmpresa);
			this.jmenuAccionesTipoEmpresa.add(this.jMenuItemNuevoRelacionesTipoEmpresa);
			this.jmenuAccionesTipoEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoEmpresa);		
			this.jmenuAccionesTipoEmpresa.add(this.jMenuItemDuplicarTipoEmpresa);		
			this.jmenuAccionesTipoEmpresa.add(this.jMenuItemCopiarTipoEmpresa);		
			this.jmenuAccionesTipoEmpresa.add(this.jMenuItemVerFormTipoEmpresa);		
			
			this.jmenuDatosTipoEmpresa.add(this.jMenuItemRecargarInformacionTipoEmpresa);				
			this.jmenuDatosTipoEmpresa.add(this.jMenuItemAnterioresTipoEmpresa);				
			this.jmenuDatosTipoEmpresa.add(this.jMenuItemSiguientesTipoEmpresa);				
			this.jmenuDatosTipoEmpresa.add(this.jMenuItemAbrirOrderByTipoEmpresa);				
			this.jmenuDatosTipoEmpresa.add(this.jMenuItemMostrarOcultarTipoEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoEmpresa.add(this.jMenuItemGuardarCambiosTipoEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoEmpresa.add(this.jmenuArchivoTipoEmpresa);		
			this.jmenuBarTipoEmpresa.add(this.jmenuAccionesTipoEmpresa);		
			this.jmenuBarTipoEmpresa.add(this.jmenuDatosTipoEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoEmpresa() {
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
			//this.jInternalFrameDetalleTipoEmpresa = new TipoEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Empresa DATOS");
			this.jInternalFrameDetalleFormTipoEmpresa = new TipoEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipoempresaSessionBean.getConGuardarRelaciones(),this.tipoempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoEmpresa = null;//new TipoEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoEmpresa = new JTableMe();      
		
		String sToolTipTipoEmpresa="";
		sToolTipTipoEmpresa=TipoEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEmpresa+="(Seguridad.TipoEmpresa)";
		}
		
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoEmpresa.setToolTipText(sToolTipTipoEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoEmpresa);
		this.jTableDatosTipoEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoEmpresa = new JButtonMe();
		this.jButtonCopiarTipoEmpresa = new JButtonMe();
		this.jButtonVerFormTipoEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoEmpresa = new JButtonMe();
		this.jButtonCerrarTipoEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Empresa";
		
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoEmpresa=new ReporteDinamicoJInternalFrame(TipoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoEmpresa=new ImportacionJInternalFrame(TipoEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEmpresa,false,this);
			
			//this.cargarOrderByTipoEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEmpresa,true,this);
			
			//this.cargarOrderByTipoEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoEmpresa.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEmpresa.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEmpresa.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoEmpresa.setText("Copiar");
		this.jButtonVerFormTipoEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoEmpresa.setText("Guardar");
		this.jButtonCerrarTipoEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEmpresa,"nuevo_button","Nuevo",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoEmpresa,"duplicar_button","Duplicar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoEmpresa,"copiar_button","Copiar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoEmpresa,"ver_form","Ver",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEmpresa,"guardarcambiostabla_button","Guardar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEmpresa,"cerrar_button","Salir",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoEmpresa.setToolTipText("Nuevo"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoEmpresa.setToolTipText("Duplicar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoEmpresa.setToolTipText("Copiar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoEmpresa.setToolTipText("Ver"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoEmpresa.setToolTipText("Nuevo Rel"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoEmpresa.setToolTipText("Guardar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEmpresa.setToolTipText("Salir"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEmpresa";
		inputMap = this.jButtonNuevoTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoEmpresa";
		inputMap = this.jButtonDuplicarTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoEmpresa";
		inputMap = this.jButtonCopiarTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoEmpresa";
		inputMap = this.jButtonVerFormTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoEmpresa";
		inputMap = this.jButtonModificarTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoEmpresa";
		inputMap = this.jButtonCerrarTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoEmpresa.setName("jPanelParametrosReportesTipoEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoEmpresa.setName("jPanelParametrosReportesAccionesTipoEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoEmpresa.setToolTipText("Recargar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoEmpresa.setToolTipText("Procesar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoEmpresa.setText("<<");
        this.jButtonAnterioresTipoEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoEmpresa.setText(">>");
        this.jButtonSiguientesTipoEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoEmpresa,"nuevoguardarcambios_button","Nue",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoEmpresa";
		inputMap = this.jButtonSiguientesTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoEmpresa";
		inputMap = this.jButtonAnterioresTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoEmpresa.setLayout(gridaBagLayoutPaginacionTipoEmpresa);						
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = 0;
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoEmpresa.add(this.jButtonAnterioresTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
					
						
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoEmpresa.add(this.jButtonNuevoGuardarCambiosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
						
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEmpresa.gridy = 0;
			this.jPanelPaginacionTipoEmpresa.add(this.jButtonSiguientesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEmpresa.add(this.jButtonNuevoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
						
			
			
			if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEmpresa.gridy = 1;
				this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoEmpresa.add(this.jButtonGuardarCambiosTablaTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEmpresa.add(this.jButtonDuplicarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEmpresa.add(this.jButtonCopiarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEmpresa.add(this.jButtonVerFormTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = 1;
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoEmpresa.add(this.jButtonCerrarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoEmpresa.setLayout(gridaBagParametrosReportesTipoEmpresa);
			this.jPanelParametrosReportesAccionesTipoEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoEmpresa);
			this.jPanelParametrosAuxiliar2TipoEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoEmpresa);
			this.jPanelParametrosAuxiliar3TipoEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoEmpresa);
			this.jPanelParametrosAuxiliar4TipoEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoEmpresa);
			//this.jPanelParametrosAuxiliar5TipoEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEmpresa.add(this.jButtonRecargarInformacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEmpresa.add(this.jComboBoxTiposPaginacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoEmpresa, this.gridBagConstraintsTipoEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEmpresa.add(this.jComboBoxTiposArchivosReportesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpresa.add(this.jPanelParametrosAuxiliar1TipoEmpresa, this.gridBagConstraintsTipoEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoEmpresa.add(this.jComboBoxTiposReportesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpresa.add(this.jPanelParametrosAuxiliar4TipoEmpresa, this.gridBagConstraintsTipoEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpresa.add(this.jComboBoxTiposReportesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEmpresa.add(this.jCheckBoxGenerarReporteTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpresa.add(this.jPanelParametrosAuxiliar2TipoEmpresa, this.gridBagConstraintsTipoEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEmpresa.add(this.jLabelAccionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoEmpresa.add(this.jButtonAbrirOrderByTipoEmpresa, this.gridBagConstraintsTipoEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEmpresa.add(this.jComboBoxTiposSeleccionarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEmpresa.add(this.jCheckBoxSeleccionarTodosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEmpresa.add(this.jCheckBoxSeleccionarTodosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);															
				
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEmpresa.add(this.jCheckBoxSeleccionadosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEmpresa.add(this.jPanelParametrosAuxiliar3TipoEmpresa, this.gridBagConstraintsTipoEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEmpresa.add(this.jComboBoxTiposRelacionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
				
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEmpresa.add(this.jComboBoxTiposAccionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoEmpresa.setLayout(gridaBagLayoutDatosTipoEmpresa);
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = 0;
			this.gridBagConstraintsTipoEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoEmpresa.add(this.jTableDatosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoEmpresa.setViewportView(this.jTableDatosTipoEmpresa);
		this.jTableDatosTipoEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoEmpresa.setLayout(gridaBagLayoutAccionesTipoEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoEmpresa.add(this.jButtonNuevoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		*/		
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEmpresa.gridx =0;
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
				
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			
			
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
			
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoEmpresa.setName("jPanelReporteDinamicoTipoEmpresa"); 
		
		this.jPanelReporteDinamicoTipoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEmpresa.add(this.jLabelColumnasSelectReporteTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoEmpresa);
			
			this.jScrollColumnasSelectReporteTipoEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEmpresa.add(this.jListColumnasSelectReporteTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		this.jPanelReporteDinamicoTipoEmpresa.add(this.jScrollColumnasSelectReporteTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoEmpresa.setToolTipText("Generar EXCEL"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoEmpresa.setToolTipText("Generar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEmpresa.add(this.jButtonGenerarReporteDinamicoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoEmpresa.setToolTipText("Cancelar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEmpresa.add(this.jButtonCerrarReporteDinamicoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoEmpresa= new JScrollPane(jPanelReporteDinamicoTipoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoEmpresa);
		this.jInternalFrameReporteDinamicoTipoEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoEmpresa.setName("jPanelImportacionTipoEmpresa"); 
		
		this.jPanelImportacionTipoEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoEmpresa.setLayout(gridaBagLayoutImportacionTipoEmpresa);
		
		
		this.jInternalFrameImportacionTipoEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEmpresa.add(this.jLabelArchivoImportacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoEmpresa.setToolTipText("Generar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEmpresa.add(this.jButtonAbrirImportacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEmpresa.add(this.jLabelPathArchivoImportacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEmpresa.add(this.jTextFieldPathArchivoImportacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoEmpresa.setToolTipText("Generar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEmpresa.add(this.jButtonGenerarImportacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoEmpresa.setToolTipText("Cancelar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEmpresa.add(this.jButtonCerrarImportacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoEmpresa= new JScrollPane(jPanelImportacionTipoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoEmpresa);
		this.jInternalFrameImportacionTipoEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoEmpresa.setName("jPanelOrderByTipoEmpresa"); 
			
			this.jPanelOrderByTipoEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoEmpresa.setLayout(gridaBagLayoutOrderByTipoEmpresa);
			
			
			this.jTableDatosTipoEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoEmpresaOrderBy.setViewportView(this.jTableDatosTipoEmpresaOrderBy);
			this.jTableDatosTipoEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoEmpresa.ipady =150;
				
			this.jPanelOrderByTipoEmpresa.add(jScrollPanelDatosTipoEmpresaOrderBy, this.gridBagConstraintsTipoEmpresa);//this.jTableDatosTipoEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoEmpresa.setToolTipText("Cancelar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoEmpresa.add(this.jButtonCerrarOrderByTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoEmpresa= new JScrollPane(jPanelOrderByTipoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoEmpresa);
			
			this.jInternalFrameOrderByTipoEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoEmpresa, this.gridBagConstraintsTipoEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoEmpresa = new JButtonMe();
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
			&& this.tipoempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoEmpresa.getRowHeight();//TipoEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEmpresa.isSelected()) {
					iHeightTable=TipoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEmpresa.isSelected()) {
					iHeightTable=TipoEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoEmpresa!=null && this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoempresaLogic.getTipoEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoEmpresa> TraerTipoEmpresaBeans(List<TipoEmpresa> tipoempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoEmpresa tipoempresa:tipoempresas) {
					
				if(!(TipoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoempresa.setsDetalleGeneralEntityReporte(TipoEmpresaConstantesFunciones.getTipoEmpresaDescripcion(tipoempresa));
										
						
					
						
					
				} else  {
							
					//tipoempresa.setsDetalleGeneralEntityReporte(tipoempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoempresabeans.add(tipoempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoempresas;
    }
	//PARA REPORTES FIN
}
