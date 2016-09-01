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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;



import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionesConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionesJInternalFrame extends ComisionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComisiones;
	
	protected JMenuBar jmenuBarComisiones;
	
	protected JMenu jmenuComisiones;
	protected JMenu jmenuDatosComisiones;
	protected JMenu jmenuArchivoComisiones;
	protected JMenu jmenuAccionesComisiones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisiones;	
	protected GridBagConstraints gridBagConstraintsComisiones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComisionesDetalleFormJInternalFrame jInternalFrameDetalleFormComisiones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComisiones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComisiones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ComisionesSessionBean comisionesSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Comisiones> comisioness;		
	public List<Comisiones> comisionessEliminados;	
	public List<Comisiones> comisionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComisiones;		
	protected JButton jButtonAbrirOrderByComisiones;
	
	
	//protected JPanel jPanelOrderByComisiones;
	//public JScrollPane jScrollPanelOrderByComisiones;	
	//protected JButton jButtonCerrarOrderByComisiones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComisionesLogic comisionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComisiones;
	public JScrollPane jScrollPanelDatosEdicionComisiones;
	public JScrollPane jScrollPanelDatosGeneralComisiones;
    
	
	
	//public JScrollPane jScrollPanelDatosComisionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComisiones;
	//public JScrollPane jScrollPanelImportacionComisiones;
	
	
	
	protected JPanel jPanelAccionesComisiones;
	
    protected JPanel jPanelPaginacionComisiones;
    protected JPanel jPanelParametrosReportesComisiones;
	protected JPanel jPanelParametrosReportesAccionesComisiones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Comisiones;
	protected JPanel jPanelParametrosAuxiliar2Comisiones;
	protected JPanel jPanelParametrosAuxiliar3Comisiones;
	protected JPanel jPanelParametrosAuxiliar4Comisiones;
	//protected JPanel jPanelParametrosAuxiliar5Comisiones;
	
	
	
	//protected JPanel jPanelReporteDinamicoComisiones;
	//protected JPanel jPanelImportacionComisiones;
	
	
	public JTable jTableDatosComisiones;
	
	
	
	//public JTable jTableDatosComisionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComisiones;
	protected JButton jButtonDuplicarComisiones;
	protected JButton jButtonCopiarComisiones;
	protected JButton jButtonVerFormComisiones;
	protected JButton jButtonNuevoRelacionesComisiones;
	protected JButton jButtonModificarComisiones;
	
    protected JButton jButtonGuardarCambiosTablaComisiones;
	protected JButton jButtonCerrarComisiones;
	
	
	protected JButton jButtonRecargarInformacionComisiones;
	protected JButton jButtonProcesarInformacionComisiones;
	
	
	protected JButton jButtonAnterioresComisiones;
	protected JButton jButtonSiguientesComisiones;
	protected JButton jButtonNuevoGuardarCambiosComisiones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComisiones;
	//protected JButton jButtonCerrarReporteDinamicoComisiones;
	//protected JButton jButtonGenerarExcelReporteDinamicoComisiones;	
	
	
	
	//protected JButton jButtonAbrirImportacionComisiones;
	//protected JButton jButtonGenerarImportacionComisiones;
	//protected JButton jButtonCerrarImportacionComisiones;
	//protected JFileChooser jFileChooserImportacionComisiones;
	//protected File fileImportacionComisiones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisiones;
	protected JButton jButtonDuplicarToolBarComisiones;
	protected JButton jButtonNuevoRelacionesToolBarComisiones;
	
	
	public JButton jButtonGuardarCambiosToolBarComisiones;
	protected JButton jButtonCopiarToolBarComisiones;
	protected JButton jButtonVerFormToolBarComisiones;
	public JButton jButtonGuardarCambiosTablaToolBarComisiones;
	protected JButton jButtonMostrarOcultarTablaToolBarComisiones;
	protected JButton jButtonCerrarToolBarComisiones;
	
	protected JButton jButtonRecargarInformacionToolBarComisiones;
	protected JButton jButtonProcesarInformacionToolBarComisiones;
	protected JButton jButtonAnterioresToolBarComisiones;
	protected JButton jButtonSiguientesToolBarComisiones;
	protected JButton jButtonNuevoGuardarCambiosToolBarComisiones;
	protected JButton jButtonAbrirOrderByToolBarComisiones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisiones;
	protected JMenuItem jMenuItemDuplicarComisiones;
	protected JMenuItem jMenuItemNuevoRelacionesComisiones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComisiones;
	protected JMenuItem jMenuItemCopiarComisiones;
	protected JMenuItem jMenuItemVerFormComisiones;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisiones;
	protected JMenuItem jMenuItemCerrarComisiones;
	protected JMenuItem jMenuItemDetalleCerrarComisiones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComisiones;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisiones;
	
	protected JMenuItem jMenuItemRecargarInformacionComisiones;
	protected JMenuItem jMenuItemProcesarInformacionComisiones;
	protected JMenuItem jMenuItemAnterioresComisiones;
	protected JMenuItem jMenuItemSiguientesComisiones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisiones;
	protected JMenuItem jMenuItemAbrirOrderByComisiones;
	protected JMenuItem jMenuItemMostrarOcultarComisiones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisiones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComisiones;
	protected JCheckBox jCheckBoxSeleccionadosComisiones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComisiones;
	protected JCheckBox jCheckBoxConGraficoReporteComisiones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComisiones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComisiones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComisiones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComisiones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComisiones;
	protected JTextField jTextFieldValorCampoGeneralComisiones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComisiones;
	//public JList<Reporte> jListColumnasSelectReporteComisiones;
	//public JScrollPane jScrollColumnasSelectReporteComisiones;
	
	//public JLabel jLabelRelacionesSelectReporteComisiones;
	//public JList<Reporte> jListRelacionesSelectReporteComisiones;
	//public JScrollPane jScrollRelacionesSelectReporteComisiones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComisiones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComisiones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComisiones;
	//public JLabel jLabelTiposArchivoReporteDinamicoComisiones;
	
		
	//public JLabel jLabelArchivoImportacionComisiones;	
	//public JLabel jLabelPathArchivoImportacionComisiones;
	//protected JTextField jTextFieldPathArchivoImportacionComisiones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComisiones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComisiones;
	
	//public JLabel jLabelColumnaCategoriaValorComisiones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComisiones;
	
	//public JLabel jLabelColumnasValoresGraficoComisiones;
	//public JList<Reporte> jListColumnasValoresGraficoComisiones;
	//public JScrollPane jScrollColumnasValoresGraficoComisiones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComisiones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComisiones;	
	
	
	
	
	
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
	public ComisionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComisiones)	{
		this.jButtonRecargarInformacionComisiones = jButtonRecargarInformacionComisiones;
	}
	
	public JButton getjButtonProcesarInformacionComisiones() {
		return this.jButtonProcesarInformacionComisiones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisiones)	{
		this.jButtonProcesarInformacionComisiones = jButtonProcesarInformacionComisiones;
	}
	
	
	public JButton getjButtonRecargarInformacionComisiones() {
		return this.jButtonRecargarInformacionComisiones;
	}
	
	
	public List<Comisiones> getcomisioness() {
		return this.comisioness;
	}

	public void setcomisioness(List<Comisiones> comisioness) {
		this.comisioness = comisioness;
	}
	
	public List<Comisiones> getcomisionessAux() {
		return this.comisionessAux;
	}

	public void setcomisionessAux(List<Comisiones> comisionessAux) {
		this.comisionessAux = comisionessAux;
	}
	
	public List<Comisiones> getcomisionessEliminados() {
		return this.comisionessEliminados;
	}

	public void setComisionessEliminados(List<Comisiones> comisionessEliminados) {
		this.comisionessEliminados = comisionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComisiones() {
		return jComboBoxTiposSeleccionarComisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComisiones(
			JComboBox jComboBoxTiposSeleccionarComisiones) {
		this.jComboBoxTiposSeleccionarComisiones = jComboBoxTiposSeleccionarComisiones;
	}
	
	public void setBorderResaltarTiposSeleccionarComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComisiones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComisiones() {
		return jTextFieldValorCampoGeneralComisiones;
	}

	public void setjTextFieldValorCampoGeneralComisiones(
			JTextField jTextFieldValorCampoGeneralComisiones) {
		this.jTextFieldValorCampoGeneralComisiones = jTextFieldValorCampoGeneralComisiones;
	}

	public void setBorderResaltarValorCampoGeneralComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComisiones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComisiones() {
		return this.jCheckBoxSeleccionarTodosComisiones;
	}

	public void setjCheckBoxSeleccionarTodosComisiones(
			JCheckBox jCheckBoxSeleccionarTodosComisiones) {
		this.jCheckBoxSeleccionarTodosComisiones = jCheckBoxSeleccionarTodosComisiones;
	}

	public void setBorderResaltarSeleccionarTodosComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComisiones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComisiones() {
		return this.jCheckBoxSeleccionadosComisiones;
	}

	public void setjCheckBoxSeleccionadosComisiones(
			JCheckBox jCheckBoxSeleccionadosComisiones) {
		this.jCheckBoxSeleccionadosComisiones = jCheckBoxSeleccionadosComisiones;
	}
	
	public void setBorderResaltarSeleccionadosComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComisiones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComisiones() {
		return this.jComboBoxTiposArchivosReportesComisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComisiones(
			JComboBox jComboBoxTiposArchivosReportesComisiones) {
		this.jComboBoxTiposArchivosReportesComisiones = jComboBoxTiposArchivosReportesComisiones;
	}

	public void setBorderResaltarTiposArchivosReportesComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComisiones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComisiones() {
		return this.jComboBoxTiposReportesComisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComisiones(
			JComboBox jComboBoxTiposReportesComisiones) {
		this.jComboBoxTiposReportesComisiones = jComboBoxTiposReportesComisiones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComisiones() {
	//	return jComboBoxTiposReportesDinamicoComisiones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComisiones(
	//		JComboBox jComboBoxTiposReportesDinamicoComisiones) {
	//	this.jComboBoxTiposReportesDinamicoComisiones = jComboBoxTiposReportesDinamicoComisiones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComisiones() {
	//	return jComboBoxTiposArchivosReportesDinamicoComisiones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComisiones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComisiones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComisiones = jComboBoxTiposArchivosReportesDinamicoComisiones;
	//}
	
	public void setBorderResaltarTiposReportesComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComisiones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComisiones() {
		return this.jComboBoxTiposGraficosReportesComisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComisiones(
			JComboBox jComboBoxTiposGraficosReportesComisiones) {
		this.jComboBoxTiposGraficosReportesComisiones = jComboBoxTiposGraficosReportesComisiones;
	}
	
	public void setBorderResaltarTiposGraficosReportesComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComisiones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComisiones() {
		return this.jComboBoxTiposPaginacionComisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComisiones(
			JComboBox jComboBoxTiposPaginacionComisiones) {
		this.jComboBoxTiposPaginacionComisiones = jComboBoxTiposPaginacionComisiones;
	}
	
	public void setBorderResaltarTiposPaginacionComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComisiones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComisiones() {
		return this.jComboBoxTiposRelacionesComisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisiones() {
		return this.jComboBoxTiposAccionesComisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisiones(
			JComboBox jComboBoxTiposRelacionesComisiones) {
		this.jComboBoxTiposRelacionesComisiones = jComboBoxTiposRelacionesComisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisiones(
			JComboBox jComboBoxTiposAccionesComisiones) {
		this.jComboBoxTiposAccionesComisiones = jComboBoxTiposAccionesComisiones;
	}
	
	public void setBorderResaltarTiposRelacionesComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComisiones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComisiones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComisiones() {
	//	return jCheckBoxConGraficoDinamicoComisiones;
	//}

	//public void setjCheckBoxConGraficoDinamicoComisiones(
	//		JCheckBox jCheckBoxConGraficoDinamicoComisiones) {
	//	this.jCheckBoxConGraficoDinamicoComisiones = jCheckBoxConGraficoDinamicoComisiones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComisiones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComisiones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComisiones .setBorder(borderResaltar);		
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
		this.comisionesSessionBean=new ComisionesSessionBean();
		
		this.comisionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComisionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComisionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comisiones MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
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
		
		ComisionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Comisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComisiones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComisiones,this.jTtoolBarComisiones,
							"nuevo","nuevo","Nuevo"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComisiones,this.jTtoolBarComisiones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComisiones,this.jTtoolBarComisiones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComisiones,this.jTtoolBarComisiones,
							"duplicar","duplicar","Duplicar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComisiones,this.jTtoolBarComisiones,
							"copiar","copiar","Copiar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComisiones,this.jTtoolBarComisiones,
							"ver_form","ver_form","Ver"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisiones,this.jTtoolBarComisiones,
							"recargar","recargar","Recargar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisiones,this.jTtoolBarComisiones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisiones,this.jTtoolBarComisiones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComisiones,this.jTtoolBarComisiones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComisiones,this.jTtoolBarComisiones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComisiones,this.jTtoolBarComisiones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComisiones,this.jTtoolBarComisiones,
							"cerrar","cerrar","Salir"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComisiones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComisiones;
			
				this.jButtonProcesarInformacionToolBarComisiones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComisiones;
				
		//protected JButton jButtonModificarToolBarComisiones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComisiones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComisiones=new JMenuMe("General");
		this.jmenuArchivoComisiones=new JMenuMe("Archivo");
		this.jmenuAccionesComisiones=new JMenuMe("Acciones");
		this.jmenuDatosComisiones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisiones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisiones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisiones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComisiones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComisiones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComisiones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComisiones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComisiones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComisiones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComisiones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisiones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisiones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComisiones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComisiones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComisiones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComisiones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComisiones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComisiones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComisiones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComisiones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComisiones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisiones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisiones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisiones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComisiones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComisiones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComisiones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComisiones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComisiones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComisiones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComisiones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComisiones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComisiones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComisiones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComisiones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComisiones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComisiones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComisiones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComisiones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisiones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisiones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisiones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComisiones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComisiones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComisiones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisiones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisiones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisiones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComisiones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComisiones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComisiones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComisiones.add(this.jMenuItemCerrarComisiones);
			
			this.jmenuAccionesComisiones.add(this.jMenuItemNuevoComisiones);
			this.jmenuAccionesComisiones.add(this.jMenuItemNuevoGuardarCambiosComisiones);
			this.jmenuAccionesComisiones.add(this.jMenuItemNuevoRelacionesComisiones);
			this.jmenuAccionesComisiones.add(this.jMenuItemGuardarCambiosTablaComisiones);		
			this.jmenuAccionesComisiones.add(this.jMenuItemDuplicarComisiones);		
			this.jmenuAccionesComisiones.add(this.jMenuItemCopiarComisiones);		
			this.jmenuAccionesComisiones.add(this.jMenuItemVerFormComisiones);		
			
			this.jmenuDatosComisiones.add(this.jMenuItemRecargarInformacionComisiones);				
			this.jmenuDatosComisiones.add(this.jMenuItemAnterioresComisiones);				
			this.jmenuDatosComisiones.add(this.jMenuItemSiguientesComisiones);				
			this.jmenuDatosComisiones.add(this.jMenuItemAbrirOrderByComisiones);				
			this.jmenuDatosComisiones.add(this.jMenuItemMostrarOcultarComisiones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComisiones.add(this.jMenuItemGuardarCambiosComisiones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComisiones.add(this.jmenuArchivoComisiones);		
			this.jmenuBarComisiones.add(this.jmenuAccionesComisiones);		
			this.jmenuBarComisiones.add(this.jmenuDatosComisiones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComisiones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComisiones() {
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
			//this.jInternalFrameDetalleComisiones = new ComisionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comisiones DATOS");
			this.jInternalFrameDetalleFormComisiones = new ComisionesDetalleFormJInternalFrame(jDesktopPane,this.comisionesSessionBean.getConGuardarRelaciones(),this.comisionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComisiones = null;//new ComisionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisiones= new GridBagLayout();
		
		
		this.jTableDatosComisiones = new JTableMe();      
		
		String sToolTipComisiones="";
		sToolTipComisiones=ComisionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisiones+="(Comisiones.Comisiones)";
		}
		
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisiones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComisiones.setToolTipText(sToolTipComisiones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComisiones);
		this.jTableDatosComisiones.setAutoCreateRowSorter(true);
		this.jTableDatosComisiones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComisiones.setRowSelectionAllowed(true);
		this.jTableDatosComisiones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComisiones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComisiones = new JButtonMe();
		this.jButtonDuplicarComisiones = new JButtonMe();
		this.jButtonCopiarComisiones = new JButtonMe();
		this.jButtonVerFormComisiones = new JButtonMe();
		this.jButtonNuevoRelacionesComisiones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComisiones = new JButtonMe();
		this.jButtonCerrarComisiones = new JButtonMe();
		
		this.jScrollPanelDatosComisiones = new JScrollPane();   
        this.jScrollPanelDatosGeneralComisiones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comisiones";
		
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comisioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosComisiones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisiones.setToolTipText("Acciones");
        this.jPanelAccionesComisiones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisiones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComisiones=new ReporteDinamicoJInternalFrame(ComisionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComisiones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComisiones=new ImportacionJInternalFrame(ComisionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComisiones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComisiones = new JButtonMe();
		
		this.jButtonAbrirOrderByComisiones.setText("Orden");
		this.jButtonAbrirOrderByComisiones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisiones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisiones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisiones,false,this);
			
			//this.cargarOrderByComisiones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisiones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisiones,true,this);
			
			//this.cargarOrderByComisiones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComisiones.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosComisiones.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosComisiones.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosComisiones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisiones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisiones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComisiones.setText("Nuevo");
		this.jButtonDuplicarComisiones.setText("Duplicar");
		this.jButtonCopiarComisiones.setText("Copiar");
		this.jButtonVerFormComisiones.setText("Ver");
		this.jButtonNuevoRelacionesComisiones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComisiones.setText("Guardar");
		this.jButtonCerrarComisiones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisiones,"nuevo_button","Nuevo",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComisiones,"duplicar_button","Duplicar",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComisiones,"copiar_button","Copiar",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComisiones,"ver_form","Ver",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComisiones,"nuevorelaciones_button","Nuevo Rel",this.comisionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisiones,"guardarcambiostabla_button","Guardar",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisiones,"cerrar_button","Salir",this.comisionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComisiones.setToolTipText("Nuevo"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComisiones.setToolTipText("Duplicar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComisiones.setToolTipText("Copiar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComisiones.setToolTipText("Ver"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComisiones.setToolTipText("Nuevo Rel"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComisiones.setToolTipText("Guardar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisiones.setToolTipText("Salir"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisiones";
		inputMap = this.jButtonNuevoComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisiones"));
		
		//DUPLICAR
		sMapKey = "DuplicarComisiones";
		inputMap = this.jButtonDuplicarComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComisiones"));
		
		//COPIAR
		sMapKey = "CopiarComisiones";
		inputMap = this.jButtonCopiarComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComisiones"));
		
		//VEr FORM
		sMapKey = "VerFormComisiones";
		inputMap = this.jButtonVerFormComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComisiones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComisiones";
		inputMap = this.jButtonNuevoRelacionesComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComisiones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComisiones";
		inputMap = this.jButtonModificarComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComisiones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComisiones";
		inputMap = this.jButtonCerrarComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisiones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisiones";
		inputMap = this.jButtonGuardarCambiosTablaComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisiones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Comisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Comisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Comisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Comisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Comisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComisiones.setName("jPanelParametrosReportesComisiones"); 
		
		this.jPanelParametrosReportesAccionesComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComisiones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComisiones.setName("jPanelParametrosReportesAccionesComisiones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComisiones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComisiones = new JButtonMe();
		this.jButtonRecargarInformacionComisiones.setText("Recargar");
		this.jButtonRecargarInformacionComisiones.setToolTipText("Recargar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComisiones,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionComisiones = new JButtonMe();
		this.jButtonProcesarInformacionComisiones.setText("Procesar");
		this.jButtonProcesarInformacionComisiones.setToolTipText("Procesar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComisiones.setVisible(false);
			
		this.jButtonProcesarInformacionComisiones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisiones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisiones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComisiones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisiones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComisiones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComisiones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisiones.setText("TIPO");       
		this.jComboBoxTiposReportesComisiones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComisiones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisiones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComisiones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComisiones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComisiones.setText("Paginacion");
		this.jComboBoxTiposPaginacionComisiones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComisiones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComisiones.setText("Accion");
		this.jComboBoxTiposRelacionesComisiones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComisiones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisiones.setText("Accion");
		this.jComboBoxTiposAccionesComisiones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComisiones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComisiones.setText("Accion");
		this.jComboBoxTiposSeleccionarComisiones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComisiones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComisiones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisiones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisiones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComisiones = new JLabelMe();
		
		this.jLabelAccionesComisiones.setText("Acciones");		
		this.jLabelAccionesComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComisiones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComisiones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComisiones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComisiones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComisiones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComisiones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComisiones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComisiones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComisiones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComisiones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComisiones.setText("Graf.");
		this.jCheckBoxConGraficoReporteComisiones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComisiones = new JButtonMe();
		//this.jButtonAnterioresComisiones.setText("<<");
        this.jButtonAnterioresComisiones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComisiones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComisiones = new JButtonMe();
		//this.jButtonSiguientesComisiones.setText(">>");
        this.jButtonSiguientesComisiones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComisiones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComisiones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComisiones.setText("Nue");
        this.jButtonNuevoGuardarCambiosComisiones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComisiones,"nuevoguardarcambios_button","Nue",this.comisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComisiones";
		inputMap = this.jButtonNuevoGuardarCambiosComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComisiones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComisiones";
		inputMap = this.jButtonRecargarInformacionComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComisiones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComisiones";
		inputMap = this.jButtonSiguientesComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComisiones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComisiones";
		inputMap = this.jButtonAnterioresComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComisiones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComisiones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComisiones.setMinimumSize(new Dimension(this.getWidth(),ComisionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisiones.setMaximumSize(new Dimension(this.getWidth(),ComisionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisiones.setPreferredSize(new Dimension(this.getWidth(),ComisionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComisiones = new GridBagLayout();

			this.jPanelPaginacionComisiones.setLayout(gridaBagLayoutPaginacionComisiones);						
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = 0;
			this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComisiones.add(this.jButtonAnterioresComisiones, this.gridBagConstraintsComisiones);
					
						
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisiones.gridy = 0;
			
			this.jPanelPaginacionComisiones.add(this.jButtonNuevoGuardarCambiosComisiones, this.gridBagConstraintsComisiones);
						
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisiones.gridy = 0;
			this.jPanelPaginacionComisiones.add(this.jButtonSiguientesComisiones, this.gridBagConstraintsComisiones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = 1;
			this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisiones.add(this.jButtonNuevoComisiones, this.gridBagConstraintsComisiones);
						
			
			
			if(!this.comisionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComisiones = new GridBagConstraints();
				this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisiones.gridy = 1;
				this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComisiones.add(this.jButtonGuardarCambiosTablaComisiones, this.gridBagConstraintsComisiones);
			}
			
			
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = 1;
			this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisiones.add(this.jButtonDuplicarComisiones, this.gridBagConstraintsComisiones);
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = 1;
			this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisiones.add(this.jButtonCopiarComisiones, this.gridBagConstraintsComisiones);
		
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = 1;
			this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisiones.add(this.jButtonVerFormComisiones, this.gridBagConstraintsComisiones);
		
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = 1;
			this.gridBagConstraintsComisiones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComisiones.add(this.jButtonCerrarComisiones, this.gridBagConstraintsComisiones);
		
		
		
		this.jButtonRecargarInformacionComisiones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisiones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisiones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComisiones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComisiones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisiones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisiones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComisiones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisiones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisiones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComisiones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisiones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisiones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComisiones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisiones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisiones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComisiones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisiones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisiones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComisiones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisiones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisiones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComisiones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisiones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisiones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComisiones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisiones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisiones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComisiones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisiones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisiones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComisiones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComisiones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisiones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisiones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComisiones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisiones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisiones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComisiones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComisiones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Comisiones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Comisiones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Comisiones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Comisiones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComisiones.setLayout(gridaBagParametrosReportesComisiones);
			this.jPanelParametrosReportesAccionesComisiones.setLayout(gridaBagParametrosReportesAccionesComisiones);
			
			
			this.jPanelParametrosAuxiliar1Comisiones.setLayout(gridaBagParametrosAuxiliar1Comisiones);
			this.jPanelParametrosAuxiliar2Comisiones.setLayout(gridaBagParametrosAuxiliar2Comisiones);
			this.jPanelParametrosAuxiliar3Comisiones.setLayout(gridaBagParametrosAuxiliar3Comisiones);
			this.jPanelParametrosAuxiliar4Comisiones.setLayout(gridaBagParametrosAuxiliar4Comisiones);
			//this.jPanelParametrosAuxiliar5Comisiones.setLayout(gridaBagParametrosAuxiliar2Comisiones);			
			
			
			
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisiones.add(this.jButtonRecargarInformacionComisiones, this.gridBagConstraintsComisiones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Comisiones.add(this.jComboBoxTiposPaginacionComisiones, this.gridBagConstraintsComisiones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Comisiones.add(this.jCheckBoxConAltoMaximoTablaComisiones, this.gridBagConstraintsComisiones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Comisiones.add(this.jComboBoxTiposArchivosReportesComisiones, this.gridBagConstraintsComisiones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisiones.add(this.jPanelParametrosAuxiliar1Comisiones, this.gridBagConstraintsComisiones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisiones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Comisiones.add(this.jComboBoxTiposReportesComisiones, this.gridBagConstraintsComisiones);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisiones.add(this.jPanelParametrosAuxiliar4Comisiones, this.gridBagConstraintsComisiones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisiones.add(this.jComboBoxTiposReportesComisiones, this.gridBagConstraintsComisiones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisiones.add(this.jCheckBoxGenerarReporteComisiones, this.gridBagConstraintsComisiones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisiones.add(this.jPanelParametrosAuxiliar2Comisiones, this.gridBagConstraintsComisiones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisiones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisiones.add(this.jLabelAccionesComisiones, this.gridBagConstraintsComisiones);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisiones.add(this.jComboBoxTiposSeleccionarComisiones, this.gridBagConstraintsComisiones);			
			
			
			/*
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisiones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisiones.add(this.jCheckBoxSeleccionarTodosComisiones, this.gridBagConstraintsComisiones);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisiones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Comisiones.add(this.jCheckBoxSeleccionarTodosComisiones, this.gridBagConstraintsComisiones);															
				
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisiones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Comisiones.add(this.jCheckBoxSeleccionadosComisiones, this.gridBagConstraintsComisiones);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisiones.add(this.jPanelParametrosAuxiliar3Comisiones, this.gridBagConstraintsComisiones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisiones.add(this.jComboBoxTiposAccionesComisiones, this.gridBagConstraintsComisiones);
	
				
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisiones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisiones.add(this.jTextFieldValorCampoGeneralComisiones, this.gridBagConstraintsComisiones);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComisiones = new GridBagLayout();

			this.jScrollPanelDatosComisiones.setLayout(gridaBagLayoutDatosComisiones);
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = 0;
			this.gridBagConstraintsComisiones.gridx = 0;
			
			this.jScrollPanelDatosComisiones.add(this.jTableDatosComisiones, this.gridBagConstraintsComisiones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComisiones.setViewportView(this.jTableDatosComisiones);
		this.jTableDatosComisiones.setFillsViewportHeight(true);
		this.jTableDatosComisiones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComisiones= new GridBagLayout();
		this.jPanelAccionesComisiones.setLayout(gridaBagLayoutAccionesComisiones);
		
		
		/*	
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = 0;
		this.gridBagConstraintsComisiones.gridx = 0;
			
		this.jPanelAccionesComisiones.add(this.jButtonNuevoComisiones, this.gridBagConstraintsComisiones);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisiones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisiones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisiones = new GridBagConstraints();						
			this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisiones.gridx = 0;		
			//this.gridBagConstraintsComisiones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisiones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComisiones, this.gridBagConstraintsComisiones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComisiones.gridx = 0;		
		//this.gridBagConstraintsComisiones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComisiones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComisiones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComisiones, this.gridBagConstraintsComisiones);								
		
		
		/*
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComisiones, this.gridBagConstraintsComisiones);
		*/		
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisiones.gridx =0;
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisiones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisiones, this.gridBagConstraintsComisiones);
				
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComisiones, this.gridBagConstraintsComisiones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComisionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisiones = new GridBagLayout();
			this.jPanelBusquedasParametrosComisiones.setLayout(gridaBagLayoutBusquedasParametrosComisiones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComisiones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisiones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisiones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisiones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisiones, this.gridBagConstraintsComisiones);
			
			
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisiones, this.gridBagConstraintsComisiones);
		
			
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisiones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisiones, this.gridBagConstraintsComisiones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComisiones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComisiones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComisiones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComisiones.setName("jPanelReporteDinamicoComisiones"); 
		
		this.jPanelReporteDinamicoComisiones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisiones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisiones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComisiones.setLayout(gridaBagLayoutReporteDinamicoComisiones);
		
		
		this.jInternalFrameReporteDinamicoComisiones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComisiones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisiones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComisiones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComisiones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComisiones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComisiones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComisiones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComisiones.setResizable(true);
	    this.jInternalFrameReporteDinamicoComisiones.setClosable(true);
	    this.jInternalFrameReporteDinamicoComisiones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComisiones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisiones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisiones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comisioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComisiones = new JLabelMe();

		this.jLabelColumnasSelectReporteComisiones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisiones.add(this.jLabelColumnasSelectReporteComisiones, this.gridBagConstraintsComisiones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComisiones = new JList<Reporte>();
		this.jListColumnasSelectReporteComisiones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComisiones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComisiones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisiones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisiones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComisiones=new JScrollPane(this.jListColumnasSelectReporteComisiones);
			
			this.jScrollColumnasSelectReporteComisiones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisiones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisiones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisiones.add(this.jListColumnasSelectReporteComisiones, this.gridBagConstraintsComisiones);
		this.jPanelReporteDinamicoComisiones.add(this.jScrollColumnasSelectReporteComisiones, this.gridBagConstraintsComisiones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComisiones = new JLabelMe();

		this.jLabelRelacionesSelectReporteComisiones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComisiones = new JList<Reporte>();
		this.jListRelacionesSelectReporteComisiones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComisiones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComisiones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisiones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisiones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComisiones=new JScrollPane(this.jListRelacionesSelectReporteComisiones);
			
			this.jScrollRelacionesSelectReporteComisiones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisiones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisiones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComisiones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComisiones = new JComboBoxMe();
		this.jListColumnasValoresGraficoComisiones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComisiones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComisiones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComisiones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisiones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisiones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComisiones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComisiones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComisiones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisiones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisiones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComisiones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComisiones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisiones.add(this.jLabelGenerarExcelReporteDinamicoComisiones, this.gridBagConstraintsComisiones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComisiones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComisiones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComisiones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComisiones.setToolTipText("Generar EXCEL"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComisiones = new GridBagConstraints();
		//this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComisiones.add(this.jButtonGenerarExcelReporteDinamicoComisiones, this.gridBagConstraintsComisiones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisiones.add(this.jComboBoxTiposReportesDinamicoComisiones, this.gridBagConstraintsComisiones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComisiones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComisiones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisiones.add(this.jLabelTiposArchivoReporteDinamicoComisiones, this.gridBagConstraintsComisiones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisiones.add(this.jComboBoxTiposArchivosReportesDinamicoComisiones, this.gridBagConstraintsComisiones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComisiones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComisiones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComisiones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComisiones.setToolTipText("Generar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisiones.add(this.jButtonGenerarReporteDinamicoComisiones, this.gridBagConstraintsComisiones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComisiones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComisiones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComisiones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComisiones.setToolTipText("Cancelar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisiones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisiones.add(this.jButtonCerrarReporteDinamicoComisiones, this.gridBagConstraintsComisiones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComisiones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComisiones= new JScrollPane(jPanelReporteDinamicoComisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComisiones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisiones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisiones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comisioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComisiones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComisiones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComisiones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComisiones);
		this.jInternalFrameReporteDinamicoComisiones.getContentPane().add(this.jScrollPanelReporteDinamicoComisiones, this.gridBagConstraintsComisiones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComisiones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComisiones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComisiones.setName("jPanelImportacionComisiones"); 
		
		this.jPanelImportacionComisiones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisiones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisiones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComisiones.setLayout(gridaBagLayoutImportacionComisiones);
		
		
		this.jInternalFrameImportacionComisiones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComisiones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComisiones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisiones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComisiones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisiones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisiones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComisiones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisiones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisiones.setResizable(true);
	    this.jInternalFrameImportacionComisiones.setClosable(true);
	    this.jInternalFrameImportacionComisiones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComisiones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisiones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisiones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComisiones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisiones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisiones.setResizable(true);
	    this.jInternalFrameImportacionComisiones.setClosable(true);
	    this.jInternalFrameImportacionComisiones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComisiones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisiones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisiones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comisioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComisiones = new JLabelMe();

		this.jLabelArchivoImportacionComisiones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisiones.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisiones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisiones.add(this.jLabelArchivoImportacionComisiones, this.gridBagConstraintsComisiones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComisiones = new JFileChooser();		
		this.jFileChooserImportacionComisiones.setToolTipText("ESCOGER ARCHIVO"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComisiones = new JButtonMe();
		this.jButtonAbrirImportacionComisiones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComisiones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComisiones.setToolTipText("Generar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = iPosYImportacion;
		this.gridBagConstraintsComisiones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisiones.add(this.jButtonAbrirImportacionComisiones, this.gridBagConstraintsComisiones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComisiones = new JLabelMe();

		this.jLabelPathArchivoImportacionComisiones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisiones.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisiones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisiones.add(this.jLabelPathArchivoImportacionComisiones, this.gridBagConstraintsComisiones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComisiones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComisiones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisiones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisiones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = iPosYImportacion;
		this.gridBagConstraintsComisiones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisiones.add(this.jTextFieldPathArchivoImportacionComisiones, this.gridBagConstraintsComisiones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComisiones = new JButtonMe();
		this.jButtonGenerarImportacionComisiones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComisiones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComisiones.setToolTipText("Generar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = iPosYImportacion;
		this.gridBagConstraintsComisiones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisiones.add(this.jButtonGenerarImportacionComisiones, this.gridBagConstraintsComisiones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComisiones = new JButtonMe();
		this.jButtonCerrarImportacionComisiones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComisiones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComisiones.setToolTipText("Cancelar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisiones.gridy = iPosYImportacion;
		this.gridBagConstraintsComisiones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisiones.add(this.jButtonCerrarImportacionComisiones, this.gridBagConstraintsComisiones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComisiones = new GridBagLayout();
		
		this.jScrollPanelImportacionComisiones= new JScrollPane(jPanelImportacionComisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComisiones = new GridBagConstraints();
		this.gridBagConstraintsComisiones.gridy =iPosYImportacion;
		this.gridBagConstraintsComisiones.gridx =iPosXImportacion;
		this.gridBagConstraintsComisiones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComisiones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComisiones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComisiones);
		this.jInternalFrameImportacionComisiones.getContentPane().add(this.jScrollPanelImportacionComisiones, this.gridBagConstraintsComisiones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComisiones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComisiones = new JButtonMe();
			this.jButtonAbrirOrderByComisiones.setText("Orden");
			this.jButtonAbrirOrderByComisiones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisiones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComisiones";
			inputMap = this.jButtonAbrirOrderByComisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComisiones"));
		
		
			GridBagLayout gridaBagLayoutOrderByComisiones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComisiones.setName("jPanelOrderByComisiones"); 
			
			this.jPanelOrderByComisiones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisiones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisiones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComisiones.setLayout(gridaBagLayoutOrderByComisiones);
			
			
			this.jTableDatosComisionesOrderBy = new JTableMe();        
			this.jTableDatosComisionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComisionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComisionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComisionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComisionesOrderBy.setViewportView(this.jTableDatosComisionesOrderBy);
			this.jTableDatosComisionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComisionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComisiones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComisiones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComisiones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComisiones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComisiones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComisiones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComisiones.setTitle("Orden");
			this.jInternalFrameOrderByComisiones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComisiones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComisiones.setResizable(true);
			this.jInternalFrameOrderByComisiones.setClosable(true);
			this.jInternalFrameOrderByComisiones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComisiones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisiones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisiones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comisioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComisiones.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComisiones.ipady =150;
				
			this.jPanelOrderByComisiones.add(jScrollPanelDatosComisionesOrderBy, this.gridBagConstraintsComisiones);//this.jTableDatosComisionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComisiones = new JButtonMe();
			this.jButtonCerrarOrderByComisiones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComisiones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComisiones.setToolTipText("Cancelar"+" "+ComisionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisiones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComisiones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComisiones.add(this.jButtonCerrarOrderByComisiones, this.gridBagConstraintsComisiones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComisiones = new GridBagLayout();
			
			this.jScrollPanelOrderByComisiones= new JScrollPane(jPanelOrderByComisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComisiones = new GridBagConstraints();
			this.gridBagConstraintsComisiones.gridy =iPosYOrderBy;
			this.gridBagConstraintsComisiones.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisiones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComisiones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComisiones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComisiones);
			
			this.jInternalFrameOrderByComisiones.getContentPane().add(this.jScrollPanelOrderByComisiones, this.gridBagConstraintsComisiones);			
		
		} else {
			this.jButtonAbrirOrderByComisiones = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.comisionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComisiones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComisiones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComisiones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosComisiones.getRowHeight();//ComisionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComisionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisiones.isSelected()) {
					iHeightTable=ComisionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComisionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisiones.isSelected()) {
					iHeightTable=ComisionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComisiones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisiones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisiones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComisiones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisiones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisiones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComisiones!=null && this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy()!=null) {
			//if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComisiones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComisiones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComisiones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComisiones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisiones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisiones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=comisionesLogic.getComisioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Comisiones> TraerComisionesBeans(List<Comisiones> comisioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(Comisiones comisiones:comisioness) {
					
				if(!(ComisionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComisionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comisiones.setsDetalleGeneralEntityReporte(ComisionesConstantesFunciones.getComisionesDescripcion(comisiones));
										
						
					
						
					
				} else  {
							
					//comisiones.setsDetalleGeneralEntityReporte(comisiones.getsDetalleGeneralEntityReporte());
										
				}
				
				//comisionesbeans.add(comisionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comisioness;
    }
	//PARA REPORTES FIN
}
