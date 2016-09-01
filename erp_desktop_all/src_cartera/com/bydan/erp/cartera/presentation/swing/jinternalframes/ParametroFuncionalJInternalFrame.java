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
import com.bydan.erp.cartera.util.ParametroFuncionalConstantesFunciones;

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
public class ParametroFuncionalJInternalFrame extends ParametroFuncionalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroFuncional;
	
	protected JMenuBar jmenuBarParametroFuncional;
	
	protected JMenu jmenuParametroFuncional;
	protected JMenu jmenuDatosParametroFuncional;
	protected JMenu jmenuArchivoParametroFuncional;
	protected JMenu jmenuAccionesParametroFuncional;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFuncional;	
	protected GridBagConstraints gridBagConstraintsParametroFuncional;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroFuncionalDetalleFormJInternalFrame jInternalFrameDetalleFormParametroFuncional;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroFuncional;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroFuncional;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ParametroFuncionalSessionBean parametrofuncionalSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroFuncional> parametrofuncionals;		
	public List<ParametroFuncional> parametrofuncionalsEliminados;	
	public List<ParametroFuncional> parametrofuncionalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroFuncional;		
	protected JButton jButtonAbrirOrderByParametroFuncional;
	
	
	//protected JPanel jPanelOrderByParametroFuncional;
	//public JScrollPane jScrollPanelOrderByParametroFuncional;	
	//protected JButton jButtonCerrarOrderByParametroFuncional;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroFuncionalLogic parametrofuncionalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroFuncional;
	public JScrollPane jScrollPanelDatosEdicionParametroFuncional;
	public JScrollPane jScrollPanelDatosGeneralParametroFuncional;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroFuncionalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroFuncional;
	//public JScrollPane jScrollPanelImportacionParametroFuncional;
	
	
	
	protected JPanel jPanelAccionesParametroFuncional;
	
    protected JPanel jPanelPaginacionParametroFuncional;
    protected JPanel jPanelParametrosReportesParametroFuncional;
	protected JPanel jPanelParametrosReportesAccionesParametroFuncional;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroFuncional;
	protected JPanel jPanelParametrosAuxiliar2ParametroFuncional;
	protected JPanel jPanelParametrosAuxiliar3ParametroFuncional;
	protected JPanel jPanelParametrosAuxiliar4ParametroFuncional;
	//protected JPanel jPanelParametrosAuxiliar5ParametroFuncional;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroFuncional;
	//protected JPanel jPanelImportacionParametroFuncional;
	
	
	public JTable jTableDatosParametroFuncional;
	
	
	
	//public JTable jTableDatosParametroFuncionalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroFuncional;
	protected JButton jButtonDuplicarParametroFuncional;
	protected JButton jButtonCopiarParametroFuncional;
	protected JButton jButtonVerFormParametroFuncional;
	protected JButton jButtonNuevoRelacionesParametroFuncional;
	protected JButton jButtonModificarParametroFuncional;
	
    protected JButton jButtonGuardarCambiosTablaParametroFuncional;
	protected JButton jButtonCerrarParametroFuncional;
	
	
	protected JButton jButtonRecargarInformacionParametroFuncional;
	protected JButton jButtonProcesarInformacionParametroFuncional;
	
	
	protected JButton jButtonAnterioresParametroFuncional;
	protected JButton jButtonSiguientesParametroFuncional;
	protected JButton jButtonNuevoGuardarCambiosParametroFuncional;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroFuncional;
	//protected JButton jButtonCerrarReporteDinamicoParametroFuncional;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroFuncional;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroFuncional;
	//protected JButton jButtonGenerarImportacionParametroFuncional;
	//protected JButton jButtonCerrarImportacionParametroFuncional;
	//protected JFileChooser jFileChooserImportacionParametroFuncional;
	//protected File fileImportacionParametroFuncional;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFuncional;
	protected JButton jButtonDuplicarToolBarParametroFuncional;
	protected JButton jButtonNuevoRelacionesToolBarParametroFuncional;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroFuncional;
	protected JButton jButtonCopiarToolBarParametroFuncional;
	protected JButton jButtonVerFormToolBarParametroFuncional;
	public JButton jButtonGuardarCambiosTablaToolBarParametroFuncional;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFuncional;
	protected JButton jButtonCerrarToolBarParametroFuncional;
	
	protected JButton jButtonRecargarInformacionToolBarParametroFuncional;
	protected JButton jButtonProcesarInformacionToolBarParametroFuncional;
	protected JButton jButtonAnterioresToolBarParametroFuncional;
	protected JButton jButtonSiguientesToolBarParametroFuncional;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroFuncional;
	protected JButton jButtonAbrirOrderByToolBarParametroFuncional;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFuncional;
	protected JMenuItem jMenuItemDuplicarParametroFuncional;
	protected JMenuItem jMenuItemNuevoRelacionesParametroFuncional;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroFuncional;
	protected JMenuItem jMenuItemCopiarParametroFuncional;
	protected JMenuItem jMenuItemVerFormParametroFuncional;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFuncional;
	protected JMenuItem jMenuItemCerrarParametroFuncional;
	protected JMenuItem jMenuItemDetalleCerrarParametroFuncional;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroFuncional;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFuncional;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroFuncional;
	protected JMenuItem jMenuItemProcesarInformacionParametroFuncional;
	protected JMenuItem jMenuItemAnterioresParametroFuncional;
	protected JMenuItem jMenuItemSiguientesParametroFuncional;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFuncional;
	protected JMenuItem jMenuItemAbrirOrderByParametroFuncional;
	protected JMenuItem jMenuItemMostrarOcultarParametroFuncional;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFuncional;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroFuncional;
	protected JCheckBox jCheckBoxSeleccionadosParametroFuncional;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroFuncional;
	protected JCheckBox jCheckBoxConGraficoReporteParametroFuncional;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroFuncional;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroFuncional;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFuncional;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroFuncional;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroFuncional;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroFuncional;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFuncional;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFuncional;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroFuncional;
	protected JTextField jTextFieldValorCampoGeneralParametroFuncional;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroFuncional;
	//public JList<Reporte> jListColumnasSelectReporteParametroFuncional;
	//public JScrollPane jScrollColumnasSelectReporteParametroFuncional;
	
	//public JLabel jLabelRelacionesSelectReporteParametroFuncional;
	//public JList<Reporte> jListRelacionesSelectReporteParametroFuncional;
	//public JScrollPane jScrollRelacionesSelectReporteParametroFuncional;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroFuncional;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroFuncional;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroFuncional;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroFuncional;
	
		
	//public JLabel jLabelArchivoImportacionParametroFuncional;	
	//public JLabel jLabelPathArchivoImportacionParametroFuncional;
	//protected JTextField jTextFieldPathArchivoImportacionParametroFuncional;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroFuncional;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroFuncional;
	
	//public JLabel jLabelColumnaCategoriaValorParametroFuncional;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroFuncional;
	
	//public JLabel jLabelColumnasValoresGraficoParametroFuncional;
	//public JList<Reporte> jListColumnasValoresGraficoParametroFuncional;
	//public JScrollPane jScrollColumnasValoresGraficoParametroFuncional;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroFuncional;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroFuncional;	
	
	
	
	
	
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
	public ParametroFuncionalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFuncionalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFuncionalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFuncionalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroFuncional)	{
		this.jButtonRecargarInformacionParametroFuncional = jButtonRecargarInformacionParametroFuncional;
	}
	
	public JButton getjButtonProcesarInformacionParametroFuncional() {
		return this.jButtonProcesarInformacionParametroFuncional;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFuncional)	{
		this.jButtonProcesarInformacionParametroFuncional = jButtonProcesarInformacionParametroFuncional;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroFuncional() {
		return this.jButtonRecargarInformacionParametroFuncional;
	}
	
	
	public List<ParametroFuncional> getparametrofuncionals() {
		return this.parametrofuncionals;
	}

	public void setparametrofuncionals(List<ParametroFuncional> parametrofuncionals) {
		this.parametrofuncionals = parametrofuncionals;
	}
	
	public List<ParametroFuncional> getparametrofuncionalsAux() {
		return this.parametrofuncionalsAux;
	}

	public void setparametrofuncionalsAux(List<ParametroFuncional> parametrofuncionalsAux) {
		this.parametrofuncionalsAux = parametrofuncionalsAux;
	}
	
	public List<ParametroFuncional> getparametrofuncionalsEliminados() {
		return this.parametrofuncionalsEliminados;
	}

	public void setParametroFuncionalsEliminados(List<ParametroFuncional> parametrofuncionalsEliminados) {
		this.parametrofuncionalsEliminados = parametrofuncionalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroFuncional() {
		return jComboBoxTiposSeleccionarParametroFuncional;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroFuncional(
			JComboBox jComboBoxTiposSeleccionarParametroFuncional) {
		this.jComboBoxTiposSeleccionarParametroFuncional = jComboBoxTiposSeleccionarParametroFuncional;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroFuncional .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroFuncional() {
		return jTextFieldValorCampoGeneralParametroFuncional;
	}

	public void setjTextFieldValorCampoGeneralParametroFuncional(
			JTextField jTextFieldValorCampoGeneralParametroFuncional) {
		this.jTextFieldValorCampoGeneralParametroFuncional = jTextFieldValorCampoGeneralParametroFuncional;
	}

	public void setBorderResaltarValorCampoGeneralParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroFuncional .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroFuncional() {
		return this.jCheckBoxSeleccionarTodosParametroFuncional;
	}

	public void setjCheckBoxSeleccionarTodosParametroFuncional(
			JCheckBox jCheckBoxSeleccionarTodosParametroFuncional) {
		this.jCheckBoxSeleccionarTodosParametroFuncional = jCheckBoxSeleccionarTodosParametroFuncional;
	}

	public void setBorderResaltarSeleccionarTodosParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroFuncional .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroFuncional() {
		return this.jCheckBoxSeleccionadosParametroFuncional;
	}

	public void setjCheckBoxSeleccionadosParametroFuncional(
			JCheckBox jCheckBoxSeleccionadosParametroFuncional) {
		this.jCheckBoxSeleccionadosParametroFuncional = jCheckBoxSeleccionadosParametroFuncional;
	}
	
	public void setBorderResaltarSeleccionadosParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroFuncional .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroFuncional() {
		return this.jComboBoxTiposArchivosReportesParametroFuncional;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroFuncional(
			JComboBox jComboBoxTiposArchivosReportesParametroFuncional) {
		this.jComboBoxTiposArchivosReportesParametroFuncional = jComboBoxTiposArchivosReportesParametroFuncional;
	}

	public void setBorderResaltarTiposArchivosReportesParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroFuncional .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroFuncional() {
		return this.jComboBoxTiposReportesParametroFuncional;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroFuncional(
			JComboBox jComboBoxTiposReportesParametroFuncional) {
		this.jComboBoxTiposReportesParametroFuncional = jComboBoxTiposReportesParametroFuncional;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroFuncional() {
	//	return jComboBoxTiposReportesDinamicoParametroFuncional;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroFuncional(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroFuncional) {
	//	this.jComboBoxTiposReportesDinamicoParametroFuncional = jComboBoxTiposReportesDinamicoParametroFuncional;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroFuncional() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroFuncional;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroFuncional(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFuncional) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroFuncional = jComboBoxTiposArchivosReportesDinamicoParametroFuncional;
	//}
	
	public void setBorderResaltarTiposReportesParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroFuncional .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroFuncional() {
		return this.jComboBoxTiposGraficosReportesParametroFuncional;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroFuncional(
			JComboBox jComboBoxTiposGraficosReportesParametroFuncional) {
		this.jComboBoxTiposGraficosReportesParametroFuncional = jComboBoxTiposGraficosReportesParametroFuncional;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroFuncional .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroFuncional() {
		return this.jComboBoxTiposPaginacionParametroFuncional;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroFuncional(
			JComboBox jComboBoxTiposPaginacionParametroFuncional) {
		this.jComboBoxTiposPaginacionParametroFuncional = jComboBoxTiposPaginacionParametroFuncional;
	}
	
	public void setBorderResaltarTiposPaginacionParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroFuncional .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroFuncional() {
		return this.jComboBoxTiposRelacionesParametroFuncional;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFuncional() {
		return this.jComboBoxTiposAccionesParametroFuncional;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFuncional(
			JComboBox jComboBoxTiposRelacionesParametroFuncional) {
		this.jComboBoxTiposRelacionesParametroFuncional = jComboBoxTiposRelacionesParametroFuncional;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFuncional(
			JComboBox jComboBoxTiposAccionesParametroFuncional) {
		this.jComboBoxTiposAccionesParametroFuncional = jComboBoxTiposAccionesParametroFuncional;
	}
	
	public void setBorderResaltarTiposRelacionesParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroFuncional .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroFuncional() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroFuncional .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroFuncional() {
	//	return jCheckBoxConGraficoDinamicoParametroFuncional;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroFuncional(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroFuncional) {
	//	this.jCheckBoxConGraficoDinamicoParametroFuncional = jCheckBoxConGraficoDinamicoParametroFuncional;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroFuncional() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroFuncional.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroFuncional .setBorder(borderResaltar);		
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
		this.parametrofuncionalSessionBean=new ParametroFuncionalSessionBean();
		
		this.parametrofuncionalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofuncionalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofuncionalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroFuncionalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroFuncionalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFuncionalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFuncionalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFuncionalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Funcional MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroFuncionalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroFuncional= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"nuevo","nuevo","Nuevo"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"duplicar","duplicar","Duplicar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"copiar","copiar","Copiar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"ver_form","ver_form","Ver"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"recargar","recargar","Recargar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroFuncional,this.jTtoolBarParametroFuncional,
							"cerrar","cerrar","Salir"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroFuncional=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroFuncional;
			
				this.jButtonProcesarInformacionToolBarParametroFuncional=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroFuncional;
				
		//protected JButton jButtonModificarToolBarParametroFuncional;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroFuncional=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroFuncional=new JMenuMe("General");
		this.jmenuArchivoParametroFuncional=new JMenuMe("Archivo");
		this.jmenuAccionesParametroFuncional=new JMenuMe("Acciones");
		this.jmenuDatosParametroFuncional=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFuncional= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFuncional.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFuncional,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroFuncional= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroFuncional.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroFuncional,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroFuncional= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroFuncional.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroFuncional,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroFuncional= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFuncional.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFuncional,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroFuncional= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroFuncional.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroFuncional,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroFuncional= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroFuncional.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroFuncional,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroFuncional= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroFuncional.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroFuncional,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFuncional= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFuncional.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFuncional,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroFuncional= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroFuncional.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroFuncional,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroFuncional= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroFuncional.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroFuncional,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroFuncional= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroFuncional.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroFuncional,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroFuncional= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroFuncional.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroFuncional,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroFuncional= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroFuncional.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroFuncional,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFuncional= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFuncional.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFuncional,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroFuncional= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroFuncional.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroFuncional,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFuncional= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFuncional.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFuncional,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroFuncional= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroFuncional.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroFuncional,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroFuncional.add(this.jMenuItemCerrarParametroFuncional);
			
			this.jmenuAccionesParametroFuncional.add(this.jMenuItemNuevoParametroFuncional);
			this.jmenuAccionesParametroFuncional.add(this.jMenuItemNuevoGuardarCambiosParametroFuncional);
			this.jmenuAccionesParametroFuncional.add(this.jMenuItemNuevoRelacionesParametroFuncional);
			this.jmenuAccionesParametroFuncional.add(this.jMenuItemGuardarCambiosTablaParametroFuncional);		
			this.jmenuAccionesParametroFuncional.add(this.jMenuItemDuplicarParametroFuncional);		
			this.jmenuAccionesParametroFuncional.add(this.jMenuItemCopiarParametroFuncional);		
			this.jmenuAccionesParametroFuncional.add(this.jMenuItemVerFormParametroFuncional);		
			
			this.jmenuDatosParametroFuncional.add(this.jMenuItemRecargarInformacionParametroFuncional);				
			this.jmenuDatosParametroFuncional.add(this.jMenuItemAnterioresParametroFuncional);				
			this.jmenuDatosParametroFuncional.add(this.jMenuItemSiguientesParametroFuncional);				
			this.jmenuDatosParametroFuncional.add(this.jMenuItemAbrirOrderByParametroFuncional);				
			this.jmenuDatosParametroFuncional.add(this.jMenuItemMostrarOcultarParametroFuncional);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroFuncional.add(this.jMenuItemGuardarCambiosParametroFuncional);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroFuncional.add(this.jmenuArchivoParametroFuncional);		
			this.jmenuBarParametroFuncional.add(this.jmenuAccionesParametroFuncional);		
			this.jmenuBarParametroFuncional.add(this.jmenuDatosParametroFuncional);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroFuncional);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroFuncional() {
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
			//this.jInternalFrameDetalleParametroFuncional = new ParametroFuncionalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Funcional DATOS");
			this.jInternalFrameDetalleFormParametroFuncional = new ParametroFuncionalDetalleFormJInternalFrame(jDesktopPane,this.parametrofuncionalSessionBean.getConGuardarRelaciones(),this.parametrofuncionalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroFuncional = null;//new ParametroFuncionalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFuncional= new GridBagLayout();
		
		
		this.jTableDatosParametroFuncional = new JTableMe();      
		
		String sToolTipParametroFuncional="";
		sToolTipParametroFuncional=ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFuncional+="(Cartera.ParametroFuncional)";
		}
		
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFuncional+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroFuncional.setToolTipText(sToolTipParametroFuncional);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroFuncional);
		this.jTableDatosParametroFuncional.setAutoCreateRowSorter(true);
		this.jTableDatosParametroFuncional.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroFuncional.setRowSelectionAllowed(true);
		this.jTableDatosParametroFuncional.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroFuncional,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroFuncional = new JButtonMe();
		this.jButtonDuplicarParametroFuncional = new JButtonMe();
		this.jButtonCopiarParametroFuncional = new JButtonMe();
		this.jButtonVerFormParametroFuncional = new JButtonMe();
		this.jButtonNuevoRelacionesParametroFuncional = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroFuncional = new JButtonMe();
		this.jButtonCerrarParametroFuncional = new JButtonMe();
		
		this.jScrollPanelDatosParametroFuncional = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroFuncional = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Funcional";
		
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Funcionales" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFuncional.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFuncional.setToolTipText("Acciones");
        this.jPanelAccionesParametroFuncional.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroFuncional=new ReporteDinamicoJInternalFrame(ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroFuncional();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroFuncional=new ImportacionJInternalFrame(ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroFuncional();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroFuncional = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroFuncional.setText("Orden");
		this.jButtonAbrirOrderByParametroFuncional.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFuncional,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFuncional=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFuncional,false,this);
			
			//this.cargarOrderByParametroFuncional(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFuncional=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFuncional,true,this);
			
			//this.cargarOrderByParametroFuncional(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroFuncional.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosParametroFuncional.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosParametroFuncional.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosParametroFuncional.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFuncional.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFuncional.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroFuncional.setText("Nuevo");
		this.jButtonDuplicarParametroFuncional.setText("Duplicar");
		this.jButtonCopiarParametroFuncional.setText("Copiar");
		this.jButtonVerFormParametroFuncional.setText("Ver");
		this.jButtonNuevoRelacionesParametroFuncional.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroFuncional.setText("Guardar");
		this.jButtonCerrarParametroFuncional.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFuncional,"nuevo_button","Nuevo",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroFuncional,"duplicar_button","Duplicar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroFuncional,"copiar_button","Copiar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroFuncional,"ver_form","Ver",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroFuncional,"nuevorelaciones_button","Nuevo Rel",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFuncional,"guardarcambiostabla_button","Guardar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFuncional,"cerrar_button","Salir",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroFuncional.setToolTipText("Nuevo"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroFuncional.setToolTipText("Duplicar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroFuncional.setToolTipText("Copiar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroFuncional.setToolTipText("Ver"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroFuncional.setToolTipText("Nuevo Rel"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroFuncional.setToolTipText("Guardar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFuncional.setToolTipText("Salir"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFuncional";
		inputMap = this.jButtonNuevoParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFuncional.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFuncional"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroFuncional";
		inputMap = this.jButtonDuplicarParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroFuncional.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroFuncional"));
		
		//COPIAR
		sMapKey = "CopiarParametroFuncional";
		inputMap = this.jButtonCopiarParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroFuncional.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroFuncional"));
		
		//VEr FORM
		sMapKey = "VerFormParametroFuncional";
		inputMap = this.jButtonVerFormParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroFuncional.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroFuncional"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroFuncional";
		inputMap = this.jButtonNuevoRelacionesParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroFuncional"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroFuncional";
		inputMap = this.jButtonModificarParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroFuncional"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroFuncional";
		inputMap = this.jButtonCerrarParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFuncional"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFuncional";
		inputMap = this.jButtonGuardarCambiosTablaParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFuncional"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroFuncional= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroFuncional= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroFuncional= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroFuncional= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroFuncional= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroFuncional.setName("jPanelParametrosReportesParametroFuncional"); 
		
		this.jPanelParametrosReportesAccionesParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroFuncional.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroFuncional.setName("jPanelParametrosReportesAccionesParametroFuncional"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroFuncional = new JButtonMe();
		this.jButtonRecargarInformacionParametroFuncional.setText("Recargar");
		this.jButtonRecargarInformacionParametroFuncional.setToolTipText("Recargar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroFuncional,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroFuncional = new JButtonMe();
		this.jButtonProcesarInformacionParametroFuncional.setText("Procesar");
		this.jButtonProcesarInformacionParametroFuncional.setToolTipText("Procesar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroFuncional.setVisible(false);
			
		this.jButtonProcesarInformacionParametroFuncional.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFuncional.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFuncional.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFuncional.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroFuncional.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFuncional.setText("TIPO");       
		this.jComboBoxTiposReportesParametroFuncional.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFuncional.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroFuncional.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroFuncional.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroFuncional.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroFuncional.setText("Accion");
		this.jComboBoxTiposRelacionesParametroFuncional.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFuncional.setText("Accion");
		this.jComboBoxTiposAccionesParametroFuncional.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroFuncional.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroFuncional.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroFuncional=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroFuncional.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFuncional.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFuncional.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroFuncional = new JLabelMe();
		
		this.jLabelAccionesParametroFuncional.setText("Acciones");		
		this.jLabelAccionesParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroFuncional = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroFuncional.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroFuncional.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroFuncional = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroFuncional.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroFuncional.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroFuncional = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroFuncional.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroFuncional.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroFuncional = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroFuncional.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroFuncional.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroFuncional = new JButtonMe();
		//this.jButtonAnterioresParametroFuncional.setText("<<");
        this.jButtonAnterioresParametroFuncional.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroFuncional,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroFuncional = new JButtonMe();
		//this.jButtonSiguientesParametroFuncional.setText(">>");
        this.jButtonSiguientesParametroFuncional.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroFuncional,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroFuncional = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroFuncional.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroFuncional.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroFuncional,"nuevoguardarcambios_button","Nue",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroFuncional";
		inputMap = this.jButtonNuevoGuardarCambiosParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroFuncional"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroFuncional";
		inputMap = this.jButtonRecargarInformacionParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroFuncional"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroFuncional";
		inputMap = this.jButtonSiguientesParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroFuncional"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroFuncional";
		inputMap = this.jButtonAnterioresParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroFuncional"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroFuncional();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroFuncional.setMinimumSize(new Dimension(this.getWidth(),ParametroFuncionalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFuncionalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFuncional.setMaximumSize(new Dimension(this.getWidth(),ParametroFuncionalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFuncionalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFuncional.setPreferredSize(new Dimension(this.getWidth(),ParametroFuncionalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFuncionalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroFuncional = new GridBagLayout();

			this.jPanelPaginacionParametroFuncional.setLayout(gridaBagLayoutPaginacionParametroFuncional);						
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = 0;
			this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroFuncional.add(this.jButtonAnterioresParametroFuncional, this.gridBagConstraintsParametroFuncional);
					
						
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFuncional.gridy = 0;
			
			this.jPanelPaginacionParametroFuncional.add(this.jButtonNuevoGuardarCambiosParametroFuncional, this.gridBagConstraintsParametroFuncional);
						
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFuncional.gridy = 0;
			this.jPanelPaginacionParametroFuncional.add(this.jButtonSiguientesParametroFuncional, this.gridBagConstraintsParametroFuncional);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = 1;
			this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFuncional.add(this.jButtonNuevoParametroFuncional, this.gridBagConstraintsParametroFuncional);
						
			
			
			if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
				this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFuncional.gridy = 1;
				this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroFuncional.add(this.jButtonGuardarCambiosTablaParametroFuncional, this.gridBagConstraintsParametroFuncional);
			}
			
			
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = 1;
			this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFuncional.add(this.jButtonDuplicarParametroFuncional, this.gridBagConstraintsParametroFuncional);
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = 1;
			this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFuncional.add(this.jButtonCopiarParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = 1;
			this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFuncional.add(this.jButtonVerFormParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = 1;
			this.gridBagConstraintsParametroFuncional.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroFuncional.add(this.jButtonCerrarParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
		
		
		this.jButtonRecargarInformacionParametroFuncional.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFuncional.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFuncional.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroFuncional.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFuncional.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFuncional.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroFuncional.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFuncional.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFuncional.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroFuncional.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFuncional.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFuncional.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroFuncional.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFuncional.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFuncional.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroFuncional.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFuncional.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFuncional.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroFuncional.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFuncional.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFuncional.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroFuncional.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFuncional.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFuncional.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroFuncional.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFuncional.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFuncional.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroFuncional.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFuncional.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFuncional.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroFuncional.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFuncional.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFuncional.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroFuncional.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFuncional.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFuncional.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroFuncional = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroFuncional = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroFuncional = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroFuncional = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroFuncional = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroFuncional = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroFuncional.setLayout(gridaBagParametrosReportesParametroFuncional);
			this.jPanelParametrosReportesAccionesParametroFuncional.setLayout(gridaBagParametrosReportesAccionesParametroFuncional);
			
			
			this.jPanelParametrosAuxiliar1ParametroFuncional.setLayout(gridaBagParametrosAuxiliar1ParametroFuncional);
			this.jPanelParametrosAuxiliar2ParametroFuncional.setLayout(gridaBagParametrosAuxiliar2ParametroFuncional);
			this.jPanelParametrosAuxiliar3ParametroFuncional.setLayout(gridaBagParametrosAuxiliar3ParametroFuncional);
			this.jPanelParametrosAuxiliar4ParametroFuncional.setLayout(gridaBagParametrosAuxiliar4ParametroFuncional);
			//this.jPanelParametrosAuxiliar5ParametroFuncional.setLayout(gridaBagParametrosAuxiliar2ParametroFuncional);			
			
			
			
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFuncional.add(this.jButtonRecargarInformacionParametroFuncional, this.gridBagConstraintsParametroFuncional);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFuncional.add(this.jComboBoxTiposPaginacionParametroFuncional, this.gridBagConstraintsParametroFuncional);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFuncional.add(this.jCheckBoxConAltoMaximoTablaParametroFuncional, this.gridBagConstraintsParametroFuncional);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFuncional.add(this.jComboBoxTiposArchivosReportesParametroFuncional, this.gridBagConstraintsParametroFuncional);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFuncional.add(this.jPanelParametrosAuxiliar1ParametroFuncional, this.gridBagConstraintsParametroFuncional);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFuncional.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroFuncional.add(this.jComboBoxTiposReportesParametroFuncional, this.gridBagConstraintsParametroFuncional);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFuncional.add(this.jPanelParametrosAuxiliar4ParametroFuncional, this.gridBagConstraintsParametroFuncional);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFuncional.add(this.jComboBoxTiposReportesParametroFuncional, this.gridBagConstraintsParametroFuncional);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFuncional.add(this.jCheckBoxGenerarReporteParametroFuncional, this.gridBagConstraintsParametroFuncional);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFuncional.add(this.jPanelParametrosAuxiliar2ParametroFuncional, this.gridBagConstraintsParametroFuncional);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFuncional.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFuncional.add(this.jLabelAccionesParametroFuncional, this.gridBagConstraintsParametroFuncional);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
				this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroFuncional.add(this.jButtonAbrirOrderByParametroFuncional, this.gridBagConstraintsParametroFuncional);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFuncional.add(this.jComboBoxTiposSeleccionarParametroFuncional, this.gridBagConstraintsParametroFuncional);			
			
			
			/*
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFuncional.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFuncional.add(this.jCheckBoxSeleccionarTodosParametroFuncional, this.gridBagConstraintsParametroFuncional);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFuncional.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFuncional.add(this.jCheckBoxSeleccionarTodosParametroFuncional, this.gridBagConstraintsParametroFuncional);															
				
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFuncional.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFuncional.add(this.jCheckBoxSeleccionadosParametroFuncional, this.gridBagConstraintsParametroFuncional);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFuncional.add(this.jPanelParametrosAuxiliar3ParametroFuncional, this.gridBagConstraintsParametroFuncional);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFuncional.add(this.jComboBoxTiposAccionesParametroFuncional, this.gridBagConstraintsParametroFuncional);
	
				
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFuncional.add(this.jTextFieldValorCampoGeneralParametroFuncional, this.gridBagConstraintsParametroFuncional);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroFuncional = new GridBagLayout();

			this.jScrollPanelDatosParametroFuncional.setLayout(gridaBagLayoutDatosParametroFuncional);
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = 0;
			this.gridBagConstraintsParametroFuncional.gridx = 0;
			
			this.jScrollPanelDatosParametroFuncional.add(this.jTableDatosParametroFuncional, this.gridBagConstraintsParametroFuncional);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroFuncional.setViewportView(this.jTableDatosParametroFuncional);
		this.jTableDatosParametroFuncional.setFillsViewportHeight(true);
		this.jTableDatosParametroFuncional.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroFuncional= new GridBagLayout();
		this.jPanelAccionesParametroFuncional.setLayout(gridaBagLayoutAccionesParametroFuncional);
		
		
		/*	
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = 0;
		this.gridBagConstraintsParametroFuncional.gridx = 0;
			
		this.jPanelAccionesParametroFuncional.add(this.jButtonNuevoParametroFuncional, this.gridBagConstraintsParametroFuncional);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFuncional = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFuncional);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();						
			this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFuncional.gridx = 0;		
			//this.gridBagConstraintsParametroFuncional.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFuncional.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroFuncional, this.gridBagConstraintsParametroFuncional);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroFuncional.gridx = 0;		
		//this.gridBagConstraintsParametroFuncional.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroFuncional.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroFuncional);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroFuncional, this.gridBagConstraintsParametroFuncional);								
		
		
		/*
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroFuncional, this.gridBagConstraintsParametroFuncional);
		*/		
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFuncional.gridx =0;
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFuncional.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFuncional, this.gridBagConstraintsParametroFuncional);
				
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroFuncional, this.gridBagConstraintsParametroFuncional);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroFuncional= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFuncional = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroFuncional.setLayout(gridaBagLayoutBusquedasParametrosParametroFuncional);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroFuncional=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFuncional.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFuncional.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFuncional.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFuncional, this.gridBagConstraintsParametroFuncional);
			
			
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
			
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFuncional, this.gridBagConstraintsParametroFuncional);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroFuncional;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroFuncional() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroFuncional = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroFuncional.setName("jPanelReporteDinamicoParametroFuncional"); 
		
		this.jPanelReporteDinamicoParametroFuncional.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFuncional.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFuncional.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroFuncional.setLayout(gridaBagLayoutReporteDinamicoParametroFuncional);
		
		
		this.jInternalFrameReporteDinamicoParametroFuncional= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroFuncional = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFuncional= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroFuncional.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroFuncional.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroFuncional.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroFuncional.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroFuncional.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroFuncional.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroFuncional.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroFuncional.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroFuncional.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFuncional.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFuncional.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Funcionales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroFuncional = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroFuncional.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFuncional.add(this.jLabelColumnasSelectReporteParametroFuncional, this.gridBagConstraintsParametroFuncional);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroFuncional = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroFuncional.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroFuncional.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroFuncional.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFuncional.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFuncional.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroFuncional=new JScrollPane(this.jListColumnasSelectReporteParametroFuncional);
			
			this.jScrollColumnasSelectReporteParametroFuncional.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFuncional.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFuncional.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFuncional.add(this.jListColumnasSelectReporteParametroFuncional, this.gridBagConstraintsParametroFuncional);
		this.jPanelReporteDinamicoParametroFuncional.add(this.jScrollColumnasSelectReporteParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroFuncional = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroFuncional.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroFuncional = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroFuncional.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroFuncional.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroFuncional.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFuncional.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFuncional.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroFuncional=new JScrollPane(this.jListRelacionesSelectReporteParametroFuncional);
			
			this.jScrollRelacionesSelectReporteParametroFuncional.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFuncional.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFuncional.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroFuncional = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroFuncional = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroFuncional = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroFuncional = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroFuncional.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroFuncional.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFuncional.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFuncional.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroFuncional = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFuncional.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFuncional.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFuncional.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFuncional.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroFuncional = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroFuncional.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFuncional.add(this.jLabelGenerarExcelReporteDinamicoParametroFuncional, this.gridBagConstraintsParametroFuncional);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroFuncional = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroFuncional.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroFuncional,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroFuncional.setToolTipText("Generar EXCEL"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		//this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroFuncional.add(this.jButtonGenerarExcelReporteDinamicoParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFuncional.add(this.jComboBoxTiposReportesDinamicoParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroFuncional = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroFuncional.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFuncional.add(this.jLabelTiposArchivoReporteDinamicoParametroFuncional, this.gridBagConstraintsParametroFuncional);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFuncional.add(this.jComboBoxTiposArchivosReportesDinamicoParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroFuncional = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroFuncional.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroFuncional,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroFuncional.setToolTipText("Generar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFuncional.add(this.jButtonGenerarReporteDinamicoParametroFuncional, this.gridBagConstraintsParametroFuncional);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroFuncional = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroFuncional.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroFuncional,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroFuncional.setToolTipText("Cancelar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFuncional.add(this.jButtonCerrarReporteDinamicoParametroFuncional, this.gridBagConstraintsParametroFuncional);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroFuncional = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroFuncional= new JScrollPane(jPanelReporteDinamicoParametroFuncional,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroFuncional.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFuncional.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFuncional.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Funcionales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroFuncional.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroFuncional.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroFuncional.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroFuncional);
		this.jInternalFrameReporteDinamicoParametroFuncional.getContentPane().add(this.jScrollPanelReporteDinamicoParametroFuncional, this.gridBagConstraintsParametroFuncional);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroFuncional() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroFuncional = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroFuncional.setName("jPanelImportacionParametroFuncional"); 
		
		this.jPanelImportacionParametroFuncional.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFuncional.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFuncional.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroFuncional.setLayout(gridaBagLayoutImportacionParametroFuncional);
		
		
		this.jInternalFrameImportacionParametroFuncional= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroFuncional= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroFuncional = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFuncional= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroFuncional.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFuncional.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFuncional.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroFuncional.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFuncional.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFuncional.setResizable(true);
	    this.jInternalFrameImportacionParametroFuncional.setClosable(true);
	    this.jInternalFrameImportacionParametroFuncional.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroFuncional.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFuncional.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFuncional.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroFuncional.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFuncional.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFuncional.setResizable(true);
	    this.jInternalFrameImportacionParametroFuncional.setClosable(true);
	    this.jInternalFrameImportacionParametroFuncional.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroFuncional.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFuncional.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFuncional.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Funcionales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroFuncional = new JLabelMe();

		this.jLabelArchivoImportacionParametroFuncional.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFuncional.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFuncional.add(this.jLabelArchivoImportacionParametroFuncional, this.gridBagConstraintsParametroFuncional);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroFuncional = new JFileChooser();		
		this.jFileChooserImportacionParametroFuncional.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroFuncional = new JButtonMe();
		this.jButtonAbrirImportacionParametroFuncional.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroFuncional,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroFuncional.setToolTipText("Generar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFuncional.add(this.jButtonAbrirImportacionParametroFuncional, this.gridBagConstraintsParametroFuncional);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroFuncional = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroFuncional.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFuncional.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFuncional.add(this.jLabelPathArchivoImportacionParametroFuncional, this.gridBagConstraintsParametroFuncional);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroFuncional=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroFuncional.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFuncional.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFuncional.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFuncional.add(this.jTextFieldPathArchivoImportacionParametroFuncional, this.gridBagConstraintsParametroFuncional);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroFuncional = new JButtonMe();
		this.jButtonGenerarImportacionParametroFuncional.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroFuncional,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroFuncional.setToolTipText("Generar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFuncional.add(this.jButtonGenerarImportacionParametroFuncional, this.gridBagConstraintsParametroFuncional);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroFuncional = new JButtonMe();
		this.jButtonCerrarImportacionParametroFuncional.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroFuncional,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroFuncional.setToolTipText("Cancelar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFuncional.add(this.jButtonCerrarImportacionParametroFuncional, this.gridBagConstraintsParametroFuncional);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroFuncional = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroFuncional= new JScrollPane(jPanelImportacionParametroFuncional,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroFuncional.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroFuncional.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroFuncional.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroFuncional);
		this.jInternalFrameImportacionParametroFuncional.getContentPane().add(this.jScrollPanelImportacionParametroFuncional, this.gridBagConstraintsParametroFuncional);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroFuncional(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroFuncional = new JButtonMe();
			this.jButtonAbrirOrderByParametroFuncional.setText("Orden");
			this.jButtonAbrirOrderByParametroFuncional.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFuncional,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroFuncional";
			inputMap = this.jButtonAbrirOrderByParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroFuncional"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroFuncional = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroFuncional.setName("jPanelOrderByParametroFuncional"); 
			
			this.jPanelOrderByParametroFuncional.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFuncional.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFuncional.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroFuncional.setLayout(gridaBagLayoutOrderByParametroFuncional);
			
			
			this.jTableDatosParametroFuncionalOrderBy = new JTableMe();        
			this.jTableDatosParametroFuncionalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroFuncionalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroFuncionalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroFuncionalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroFuncionalOrderBy.setViewportView(this.jTableDatosParametroFuncionalOrderBy);
			this.jTableDatosParametroFuncionalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroFuncionalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroFuncional= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroFuncional= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroFuncional = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroFuncional= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroFuncional.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroFuncional.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroFuncional.setTitle("Orden");
			this.jInternalFrameOrderByParametroFuncional.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroFuncional.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroFuncional.setResizable(true);
			this.jInternalFrameOrderByParametroFuncional.setClosable(true);
			this.jInternalFrameOrderByParametroFuncional.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroFuncional.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFuncional.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFuncional.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Funcionales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroFuncional.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroFuncional.ipady =150;
				
			this.jPanelOrderByParametroFuncional.add(jScrollPanelDatosParametroFuncionalOrderBy, this.gridBagConstraintsParametroFuncional);//this.jTableDatosParametroFuncionalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroFuncional = new JButtonMe();
			this.jButtonCerrarOrderByParametroFuncional.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroFuncional,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroFuncional.setToolTipText("Cancelar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroFuncional.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroFuncional.add(this.jButtonCerrarOrderByParametroFuncional, this.gridBagConstraintsParametroFuncional);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroFuncional = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroFuncional= new JScrollPane(jPanelOrderByParametroFuncional,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroFuncional.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroFuncional.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroFuncional.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroFuncional);
			
			this.jInternalFrameOrderByParametroFuncional.getContentPane().add(this.jScrollPanelOrderByParametroFuncional, this.gridBagConstraintsParametroFuncional);			
		
		} else {
			this.jButtonAbrirOrderByParametroFuncional = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrofuncionalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroFuncional.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroFuncional.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroFuncional.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroFuncional.getRowHeight();//ParametroFuncionalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroFuncionalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFuncional.isSelected()) {
					iHeightTable=ParametroFuncionalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFuncionalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFuncionalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroFuncionalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFuncional.isSelected()) {
					iHeightTable=ParametroFuncionalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFuncionalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFuncionalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroFuncional.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFuncional.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFuncional.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroFuncional.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFuncional.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFuncional.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroFuncional!=null && this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroFuncional.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroFuncional.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroFuncional.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroFuncional.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFuncional.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFuncional.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrofuncionalLogic.getParametroFuncionals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofuncionals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroFuncional> TraerParametroFuncionalBeans(List<ParametroFuncional> parametrofuncionals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroFuncional parametrofuncional:parametrofuncionals) {
					
				if(!(ParametroFuncionalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroFuncionalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrofuncional.setsDetalleGeneralEntityReporte(ParametroFuncionalConstantesFunciones.getParametroFuncionalDescripcion(parametrofuncional));
										
					parametrofuncional.setcon_copia_clientes_descripcion(ParametroFuncionalConstantesFunciones.getcon_copia_clientesDescripcion(parametrofuncional));parametrofuncional.setcon_copia_proveedor_descripcion(ParametroFuncionalConstantesFunciones.getcon_copia_proveedorDescripcion(parametrofuncional));parametrofuncional.setcon_proveedor_cliente_descripcion(ParametroFuncionalConstantesFunciones.getcon_proveedor_clienteDescripcion(parametrofuncional));	
					
						
					
				} else  {
							
					//parametrofuncional.setsDetalleGeneralEntityReporte(parametrofuncional.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrofuncionalbeans.add(parametrofuncionalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrofuncionals;
    }
	//PARA REPORTES FIN
}
