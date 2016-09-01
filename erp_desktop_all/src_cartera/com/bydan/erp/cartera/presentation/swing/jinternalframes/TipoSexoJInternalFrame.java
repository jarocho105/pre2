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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.TipoSexoConstantesFunciones;

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
public class TipoSexoJInternalFrame extends TipoSexoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoSexo;
	
	protected JMenuBar jmenuBarTipoSexo;
	
	protected JMenu jmenuTipoSexo;
	protected JMenu jmenuDatosTipoSexo;
	protected JMenu jmenuArchivoTipoSexo;
	protected JMenu jmenuAccionesTipoSexo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSexo;	
	protected GridBagConstraints gridBagConstraintsTipoSexo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoSexoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoSexo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoSexo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoSexo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoSexoSessionBean tiposexoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoSexo> tiposexos;		
	public List<TipoSexo> tiposexosEliminados;	
	public List<TipoSexo> tiposexosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoSexo;		
	protected JButton jButtonAbrirOrderByTipoSexo;
	
	
	//protected JPanel jPanelOrderByTipoSexo;
	//public JScrollPane jScrollPanelOrderByTipoSexo;	
	//protected JButton jButtonCerrarOrderByTipoSexo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoSexoLogic tiposexoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoSexo;
	public JScrollPane jScrollPanelDatosEdicionTipoSexo;
	public JScrollPane jScrollPanelDatosGeneralTipoSexo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoSexoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoSexo;
	//public JScrollPane jScrollPanelImportacionTipoSexo;
	
	
	
	protected JPanel jPanelAccionesTipoSexo;
	
    protected JPanel jPanelPaginacionTipoSexo;
    protected JPanel jPanelParametrosReportesTipoSexo;
	protected JPanel jPanelParametrosReportesAccionesTipoSexo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoSexo;
	protected JPanel jPanelParametrosAuxiliar2TipoSexo;
	protected JPanel jPanelParametrosAuxiliar3TipoSexo;
	protected JPanel jPanelParametrosAuxiliar4TipoSexo;
	//protected JPanel jPanelParametrosAuxiliar5TipoSexo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoSexo;
	//protected JPanel jPanelImportacionTipoSexo;
	
	
	public JTable jTableDatosTipoSexo;
	
	
	
	//public JTable jTableDatosTipoSexoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoSexo;
	protected JButton jButtonDuplicarTipoSexo;
	protected JButton jButtonCopiarTipoSexo;
	protected JButton jButtonVerFormTipoSexo;
	protected JButton jButtonNuevoRelacionesTipoSexo;
	protected JButton jButtonModificarTipoSexo;
	
    protected JButton jButtonGuardarCambiosTablaTipoSexo;
	protected JButton jButtonCerrarTipoSexo;
	
	
	protected JButton jButtonRecargarInformacionTipoSexo;
	protected JButton jButtonProcesarInformacionTipoSexo;
	
	
	protected JButton jButtonAnterioresTipoSexo;
	protected JButton jButtonSiguientesTipoSexo;
	protected JButton jButtonNuevoGuardarCambiosTipoSexo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoSexo;
	//protected JButton jButtonCerrarReporteDinamicoTipoSexo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoSexo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoSexo;
	//protected JButton jButtonGenerarImportacionTipoSexo;
	//protected JButton jButtonCerrarImportacionTipoSexo;
	//protected JFileChooser jFileChooserImportacionTipoSexo;
	//protected File fileImportacionTipoSexo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSexo;
	protected JButton jButtonDuplicarToolBarTipoSexo;
	protected JButton jButtonNuevoRelacionesToolBarTipoSexo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoSexo;
	protected JButton jButtonCopiarToolBarTipoSexo;
	protected JButton jButtonVerFormToolBarTipoSexo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoSexo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSexo;
	protected JButton jButtonCerrarToolBarTipoSexo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoSexo;
	protected JButton jButtonProcesarInformacionToolBarTipoSexo;
	protected JButton jButtonAnterioresToolBarTipoSexo;
	protected JButton jButtonSiguientesToolBarTipoSexo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoSexo;
	protected JButton jButtonAbrirOrderByToolBarTipoSexo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSexo;
	protected JMenuItem jMenuItemDuplicarTipoSexo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoSexo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoSexo;
	protected JMenuItem jMenuItemCopiarTipoSexo;
	protected JMenuItem jMenuItemVerFormTipoSexo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSexo;
	protected JMenuItem jMenuItemCerrarTipoSexo;
	protected JMenuItem jMenuItemDetalleCerrarTipoSexo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoSexo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSexo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoSexo;
	protected JMenuItem jMenuItemProcesarInformacionTipoSexo;
	protected JMenuItem jMenuItemAnterioresTipoSexo;
	protected JMenuItem jMenuItemSiguientesTipoSexo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSexo;
	protected JMenuItem jMenuItemAbrirOrderByTipoSexo;
	protected JMenuItem jMenuItemMostrarOcultarTipoSexo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSexo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoSexo;
	protected JCheckBox jCheckBoxSeleccionadosTipoSexo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoSexo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoSexo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoSexo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoSexo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSexo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoSexo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoSexo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoSexo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSexo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSexo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoSexo;
	protected JTextField jTextFieldValorCampoGeneralTipoSexo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoSexo;
	//public JList<Reporte> jListColumnasSelectReporteTipoSexo;
	//public JScrollPane jScrollColumnasSelectReporteTipoSexo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoSexo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoSexo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoSexo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoSexo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoSexo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoSexo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoSexo;
	
		
	//public JLabel jLabelArchivoImportacionTipoSexo;	
	//public JLabel jLabelPathArchivoImportacionTipoSexo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoSexo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoSexo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoSexo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoSexo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoSexo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoSexo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoSexo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoSexo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoSexo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoSexo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoSexo;
	
	
	
	
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
	public TipoSexoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSexoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSexoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSexoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoSexo)	{
		this.jButtonRecargarInformacionTipoSexo = jButtonRecargarInformacionTipoSexo;
	}
	
	public JButton getjButtonProcesarInformacionTipoSexo() {
		return this.jButtonProcesarInformacionTipoSexo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSexo)	{
		this.jButtonProcesarInformacionTipoSexo = jButtonProcesarInformacionTipoSexo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoSexo() {
		return this.jButtonRecargarInformacionTipoSexo;
	}
	
	
	public List<TipoSexo> gettiposexos() {
		return this.tiposexos;
	}

	public void settiposexos(List<TipoSexo> tiposexos) {
		this.tiposexos = tiposexos;
	}
	
	public List<TipoSexo> gettiposexosAux() {
		return this.tiposexosAux;
	}

	public void settiposexosAux(List<TipoSexo> tiposexosAux) {
		this.tiposexosAux = tiposexosAux;
	}
	
	public List<TipoSexo> gettiposexosEliminados() {
		return this.tiposexosEliminados;
	}

	public void setTipoSexosEliminados(List<TipoSexo> tiposexosEliminados) {
		this.tiposexosEliminados = tiposexosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoSexo() {
		return jComboBoxTiposSeleccionarTipoSexo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoSexo(
			JComboBox jComboBoxTiposSeleccionarTipoSexo) {
		this.jComboBoxTiposSeleccionarTipoSexo = jComboBoxTiposSeleccionarTipoSexo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoSexo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoSexo() {
		return jTextFieldValorCampoGeneralTipoSexo;
	}

	public void setjTextFieldValorCampoGeneralTipoSexo(
			JTextField jTextFieldValorCampoGeneralTipoSexo) {
		this.jTextFieldValorCampoGeneralTipoSexo = jTextFieldValorCampoGeneralTipoSexo;
	}

	public void setBorderResaltarValorCampoGeneralTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoSexo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoSexo() {
		return this.jCheckBoxSeleccionarTodosTipoSexo;
	}

	public void setjCheckBoxSeleccionarTodosTipoSexo(
			JCheckBox jCheckBoxSeleccionarTodosTipoSexo) {
		this.jCheckBoxSeleccionarTodosTipoSexo = jCheckBoxSeleccionarTodosTipoSexo;
	}

	public void setBorderResaltarSeleccionarTodosTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoSexo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoSexo() {
		return this.jCheckBoxSeleccionadosTipoSexo;
	}

	public void setjCheckBoxSeleccionadosTipoSexo(
			JCheckBox jCheckBoxSeleccionadosTipoSexo) {
		this.jCheckBoxSeleccionadosTipoSexo = jCheckBoxSeleccionadosTipoSexo;
	}
	
	public void setBorderResaltarSeleccionadosTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoSexo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoSexo() {
		return this.jComboBoxTiposArchivosReportesTipoSexo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoSexo(
			JComboBox jComboBoxTiposArchivosReportesTipoSexo) {
		this.jComboBoxTiposArchivosReportesTipoSexo = jComboBoxTiposArchivosReportesTipoSexo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoSexo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoSexo() {
		return this.jComboBoxTiposReportesTipoSexo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoSexo(
			JComboBox jComboBoxTiposReportesTipoSexo) {
		this.jComboBoxTiposReportesTipoSexo = jComboBoxTiposReportesTipoSexo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoSexo() {
	//	return jComboBoxTiposReportesDinamicoTipoSexo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoSexo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoSexo) {
	//	this.jComboBoxTiposReportesDinamicoTipoSexo = jComboBoxTiposReportesDinamicoTipoSexo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoSexo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoSexo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoSexo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSexo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoSexo = jComboBoxTiposArchivosReportesDinamicoTipoSexo;
	//}
	
	public void setBorderResaltarTiposReportesTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoSexo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoSexo() {
		return this.jComboBoxTiposGraficosReportesTipoSexo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoSexo(
			JComboBox jComboBoxTiposGraficosReportesTipoSexo) {
		this.jComboBoxTiposGraficosReportesTipoSexo = jComboBoxTiposGraficosReportesTipoSexo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoSexo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoSexo() {
		return this.jComboBoxTiposPaginacionTipoSexo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoSexo(
			JComboBox jComboBoxTiposPaginacionTipoSexo) {
		this.jComboBoxTiposPaginacionTipoSexo = jComboBoxTiposPaginacionTipoSexo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoSexo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoSexo() {
		return this.jComboBoxTiposRelacionesTipoSexo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSexo() {
		return this.jComboBoxTiposAccionesTipoSexo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSexo(
			JComboBox jComboBoxTiposRelacionesTipoSexo) {
		this.jComboBoxTiposRelacionesTipoSexo = jComboBoxTiposRelacionesTipoSexo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSexo(
			JComboBox jComboBoxTiposAccionesTipoSexo) {
		this.jComboBoxTiposAccionesTipoSexo = jComboBoxTiposAccionesTipoSexo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoSexo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoSexo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSexo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoSexo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoSexo() {
	//	return jCheckBoxConGraficoDinamicoTipoSexo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoSexo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoSexo) {
	//	this.jCheckBoxConGraficoDinamicoTipoSexo = jCheckBoxConGraficoDinamicoTipoSexo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoSexo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoSexo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoSexo .setBorder(borderResaltar);		
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
		this.tiposexoSessionBean=new TipoSexoSessionBean();
		
		this.tiposexoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposexoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposexoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoSexoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoSexoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSexoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSexoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSexoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Sexo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoSexoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoSexo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"nuevo","nuevo","Nuevo"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"duplicar","duplicar","Duplicar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"copiar","copiar","Copiar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"ver_form","ver_form","Ver"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"recargar","recargar","Recargar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoSexo,this.jTtoolBarTipoSexo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoSexo,this.jTtoolBarTipoSexo,
							"cerrar","cerrar","Salir"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoSexo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoSexo;
			
				this.jButtonProcesarInformacionToolBarTipoSexo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoSexo;
				
		//protected JButton jButtonModificarToolBarTipoSexo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoSexo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoSexo=new JMenuMe("General");
		this.jmenuArchivoTipoSexo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoSexo=new JMenuMe("Acciones");
		this.jmenuDatosTipoSexo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSexo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSexo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSexo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoSexo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoSexo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoSexo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoSexo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoSexo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoSexo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoSexo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSexo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSexo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoSexo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoSexo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoSexo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoSexo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoSexo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoSexo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoSexo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoSexo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoSexo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSexo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSexo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSexo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoSexo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoSexo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoSexo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoSexo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoSexo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoSexo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoSexo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoSexo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoSexo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoSexo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoSexo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoSexo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoSexo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoSexo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoSexo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSexo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSexo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSexo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoSexo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoSexo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoSexo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSexo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSexo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSexo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoSexo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoSexo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoSexo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoSexo.add(this.jMenuItemCerrarTipoSexo);
			
			this.jmenuAccionesTipoSexo.add(this.jMenuItemNuevoTipoSexo);
			this.jmenuAccionesTipoSexo.add(this.jMenuItemNuevoGuardarCambiosTipoSexo);
			this.jmenuAccionesTipoSexo.add(this.jMenuItemNuevoRelacionesTipoSexo);
			this.jmenuAccionesTipoSexo.add(this.jMenuItemGuardarCambiosTablaTipoSexo);		
			this.jmenuAccionesTipoSexo.add(this.jMenuItemDuplicarTipoSexo);		
			this.jmenuAccionesTipoSexo.add(this.jMenuItemCopiarTipoSexo);		
			this.jmenuAccionesTipoSexo.add(this.jMenuItemVerFormTipoSexo);		
			
			this.jmenuDatosTipoSexo.add(this.jMenuItemRecargarInformacionTipoSexo);				
			this.jmenuDatosTipoSexo.add(this.jMenuItemAnterioresTipoSexo);				
			this.jmenuDatosTipoSexo.add(this.jMenuItemSiguientesTipoSexo);				
			this.jmenuDatosTipoSexo.add(this.jMenuItemAbrirOrderByTipoSexo);				
			this.jmenuDatosTipoSexo.add(this.jMenuItemMostrarOcultarTipoSexo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoSexo.add(this.jMenuItemGuardarCambiosTipoSexo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoSexo.add(this.jmenuArchivoTipoSexo);		
			this.jmenuBarTipoSexo.add(this.jmenuAccionesTipoSexo);		
			this.jmenuBarTipoSexo.add(this.jmenuDatosTipoSexo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoSexo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoSexo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoSexo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoSexo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoSexo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoSexo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoSexo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoSexo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoSexo = new TipoSexoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Sexo DATOS");
			this.jInternalFrameDetalleFormTipoSexo = new TipoSexoDetalleFormJInternalFrame(jDesktopPane,this.tiposexoSessionBean.getConGuardarRelaciones(),this.tiposexoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoSexo = null;//new TipoSexoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSexo= new GridBagLayout();
		
		
		this.jTableDatosTipoSexo = new JTableMe();      
		
		String sToolTipTipoSexo="";
		sToolTipTipoSexo=TipoSexoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSexo+="(Cartera.TipoSexo)";
		}
		
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSexo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoSexo.setToolTipText(sToolTipTipoSexo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoSexo);
		this.jTableDatosTipoSexo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoSexo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoSexo.setRowSelectionAllowed(true);
		this.jTableDatosTipoSexo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoSexo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoSexo = new JButtonMe();
		this.jButtonDuplicarTipoSexo = new JButtonMe();
		this.jButtonCopiarTipoSexo = new JButtonMe();
		this.jButtonVerFormTipoSexo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoSexo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoSexo = new JButtonMe();
		this.jButtonCerrarTipoSexo = new JButtonMe();
		
		this.jScrollPanelDatosTipoSexo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoSexo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Sexo";
		
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sexos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSexo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSexo.setToolTipText("Acciones");
        this.jPanelAccionesTipoSexo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoSexo=new ReporteDinamicoJInternalFrame(TipoSexoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoSexo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoSexo=new ImportacionJInternalFrame(TipoSexoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoSexo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoSexo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoSexo.setText("Orden");
		this.jButtonAbrirOrderByTipoSexo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSexo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSexo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSexo,false,this);
			
			//this.cargarOrderByTipoSexo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSexo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSexo,true,this);
			
			//this.cargarOrderByTipoSexo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoSexo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSexo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSexo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoSexo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSexo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSexo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoSexo.setText("Nuevo");
		this.jButtonDuplicarTipoSexo.setText("Duplicar");
		this.jButtonCopiarTipoSexo.setText("Copiar");
		this.jButtonVerFormTipoSexo.setText("Ver");
		this.jButtonNuevoRelacionesTipoSexo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoSexo.setText("Guardar");
		this.jButtonCerrarTipoSexo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSexo,"nuevo_button","Nuevo",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoSexo,"duplicar_button","Duplicar",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoSexo,"copiar_button","Copiar",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoSexo,"ver_form","Ver",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoSexo,"nuevorelaciones_button","Nuevo Rel",this.tiposexoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSexo,"guardarcambiostabla_button","Guardar",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSexo,"cerrar_button","Salir",this.tiposexoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoSexo.setToolTipText("Nuevo"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoSexo.setToolTipText("Duplicar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoSexo.setToolTipText("Copiar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoSexo.setToolTipText("Ver"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoSexo.setToolTipText("Nuevo Rel"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoSexo.setToolTipText("Guardar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSexo.setToolTipText("Salir"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSexo";
		inputMap = this.jButtonNuevoTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSexo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSexo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoSexo";
		inputMap = this.jButtonDuplicarTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoSexo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoSexo"));
		
		//COPIAR
		sMapKey = "CopiarTipoSexo";
		inputMap = this.jButtonCopiarTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoSexo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoSexo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoSexo";
		inputMap = this.jButtonVerFormTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoSexo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoSexo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoSexo";
		inputMap = this.jButtonNuevoRelacionesTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoSexo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoSexo";
		inputMap = this.jButtonModificarTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoSexo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoSexo";
		inputMap = this.jButtonCerrarTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSexo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSexo";
		inputMap = this.jButtonGuardarCambiosTablaTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSexo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoSexo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoSexo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoSexo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoSexo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoSexo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoSexo.setName("jPanelParametrosReportesTipoSexo"); 
		
		this.jPanelParametrosReportesAccionesTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoSexo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoSexo.setName("jPanelParametrosReportesAccionesTipoSexo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoSexo = new JButtonMe();
		this.jButtonRecargarInformacionTipoSexo.setText("Recargar");
		this.jButtonRecargarInformacionTipoSexo.setToolTipText("Recargar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoSexo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoSexo = new JButtonMe();
		this.jButtonProcesarInformacionTipoSexo.setText("Procesar");
		this.jButtonProcesarInformacionTipoSexo.setToolTipText("Procesar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoSexo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoSexo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSexo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSexo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSexo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoSexo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSexo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoSexo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSexo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoSexo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoSexo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoSexo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoSexo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoSexo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSexo.setText("Accion");
		this.jComboBoxTiposAccionesTipoSexo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoSexo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoSexo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoSexo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoSexo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSexo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSexo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoSexo = new JLabelMe();
		
		this.jLabelAccionesTipoSexo.setText("Acciones");		
		this.jLabelAccionesTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoSexo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoSexo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoSexo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoSexo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoSexo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoSexo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoSexo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoSexo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoSexo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoSexo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoSexo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoSexo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoSexo = new JButtonMe();
		//this.jButtonAnterioresTipoSexo.setText("<<");
        this.jButtonAnterioresTipoSexo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoSexo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoSexo = new JButtonMe();
		//this.jButtonSiguientesTipoSexo.setText(">>");
        this.jButtonSiguientesTipoSexo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoSexo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoSexo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoSexo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoSexo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoSexo,"nuevoguardarcambios_button","Nue",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoSexo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoSexo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoSexo";
		inputMap = this.jButtonRecargarInformacionTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoSexo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoSexo";
		inputMap = this.jButtonSiguientesTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoSexo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoSexo";
		inputMap = this.jButtonAnterioresTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoSexo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoSexo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoSexo.setMinimumSize(new Dimension(this.getWidth(),TipoSexoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSexoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSexo.setMaximumSize(new Dimension(this.getWidth(),TipoSexoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSexoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSexo.setPreferredSize(new Dimension(this.getWidth(),TipoSexoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSexoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoSexo = new GridBagLayout();

			this.jPanelPaginacionTipoSexo.setLayout(gridaBagLayoutPaginacionTipoSexo);						
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = 0;
			this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoSexo.add(this.jButtonAnterioresTipoSexo, this.gridBagConstraintsTipoSexo);
					
						
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSexo.gridy = 0;
			
			this.jPanelPaginacionTipoSexo.add(this.jButtonNuevoGuardarCambiosTipoSexo, this.gridBagConstraintsTipoSexo);
						
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSexo.gridy = 0;
			this.jPanelPaginacionTipoSexo.add(this.jButtonSiguientesTipoSexo, this.gridBagConstraintsTipoSexo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = 1;
			this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSexo.add(this.jButtonNuevoTipoSexo, this.gridBagConstraintsTipoSexo);
						
			
			
			if(!this.tiposexoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoSexo = new GridBagConstraints();
				this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoSexo.gridy = 1;
				this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoSexo.add(this.jButtonGuardarCambiosTablaTipoSexo, this.gridBagConstraintsTipoSexo);
			}
			
			
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = 1;
			this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSexo.add(this.jButtonDuplicarTipoSexo, this.gridBagConstraintsTipoSexo);
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = 1;
			this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSexo.add(this.jButtonCopiarTipoSexo, this.gridBagConstraintsTipoSexo);
		
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = 1;
			this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSexo.add(this.jButtonVerFormTipoSexo, this.gridBagConstraintsTipoSexo);
		
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = 1;
			this.gridBagConstraintsTipoSexo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoSexo.add(this.jButtonCerrarTipoSexo, this.gridBagConstraintsTipoSexo);
		
		
		
		this.jButtonRecargarInformacionTipoSexo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSexo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSexo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoSexo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSexo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSexo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoSexo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSexo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSexo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoSexo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSexo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSexo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoSexo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSexo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSexo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoSexo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSexo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSexo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoSexo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSexo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSexo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoSexo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSexo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSexo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoSexo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSexo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSexo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoSexo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSexo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSexo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoSexo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSexo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSexo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoSexo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSexo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSexo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoSexo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoSexo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoSexo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoSexo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoSexo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoSexo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoSexo.setLayout(gridaBagParametrosReportesTipoSexo);
			this.jPanelParametrosReportesAccionesTipoSexo.setLayout(gridaBagParametrosReportesAccionesTipoSexo);
			
			
			this.jPanelParametrosAuxiliar1TipoSexo.setLayout(gridaBagParametrosAuxiliar1TipoSexo);
			this.jPanelParametrosAuxiliar2TipoSexo.setLayout(gridaBagParametrosAuxiliar2TipoSexo);
			this.jPanelParametrosAuxiliar3TipoSexo.setLayout(gridaBagParametrosAuxiliar3TipoSexo);
			this.jPanelParametrosAuxiliar4TipoSexo.setLayout(gridaBagParametrosAuxiliar4TipoSexo);
			//this.jPanelParametrosAuxiliar5TipoSexo.setLayout(gridaBagParametrosAuxiliar2TipoSexo);			
			
			
			
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSexo.add(this.jButtonRecargarInformacionTipoSexo, this.gridBagConstraintsTipoSexo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSexo.add(this.jComboBoxTiposPaginacionTipoSexo, this.gridBagConstraintsTipoSexo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSexo.add(this.jCheckBoxConAltoMaximoTablaTipoSexo, this.gridBagConstraintsTipoSexo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSexo.add(this.jComboBoxTiposArchivosReportesTipoSexo, this.gridBagConstraintsTipoSexo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSexo.add(this.jPanelParametrosAuxiliar1TipoSexo, this.gridBagConstraintsTipoSexo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSexo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoSexo.add(this.jComboBoxTiposReportesTipoSexo, this.gridBagConstraintsTipoSexo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSexo.add(this.jPanelParametrosAuxiliar4TipoSexo, this.gridBagConstraintsTipoSexo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSexo.add(this.jComboBoxTiposReportesTipoSexo, this.gridBagConstraintsTipoSexo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSexo.add(this.jCheckBoxGenerarReporteTipoSexo, this.gridBagConstraintsTipoSexo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSexo.add(this.jPanelParametrosAuxiliar2TipoSexo, this.gridBagConstraintsTipoSexo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSexo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSexo.add(this.jLabelAccionesTipoSexo, this.gridBagConstraintsTipoSexo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoSexo = new GridBagConstraints();
				this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoSexo.add(this.jButtonAbrirOrderByTipoSexo, this.gridBagConstraintsTipoSexo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSexo.add(this.jComboBoxTiposSeleccionarTipoSexo, this.gridBagConstraintsTipoSexo);			
			
			
			/*
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSexo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSexo.add(this.jCheckBoxSeleccionarTodosTipoSexo, this.gridBagConstraintsTipoSexo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSexo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSexo.add(this.jCheckBoxSeleccionarTodosTipoSexo, this.gridBagConstraintsTipoSexo);															
				
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSexo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSexo.add(this.jCheckBoxSeleccionadosTipoSexo, this.gridBagConstraintsTipoSexo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSexo.add(this.jPanelParametrosAuxiliar3TipoSexo, this.gridBagConstraintsTipoSexo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSexo.add(this.jComboBoxTiposAccionesTipoSexo, this.gridBagConstraintsTipoSexo);
	
				
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSexo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSexo.add(this.jTextFieldValorCampoGeneralTipoSexo, this.gridBagConstraintsTipoSexo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoSexo = new GridBagLayout();

			this.jScrollPanelDatosTipoSexo.setLayout(gridaBagLayoutDatosTipoSexo);
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = 0;
			this.gridBagConstraintsTipoSexo.gridx = 0;
			
			this.jScrollPanelDatosTipoSexo.add(this.jTableDatosTipoSexo, this.gridBagConstraintsTipoSexo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoSexo.setViewportView(this.jTableDatosTipoSexo);
		this.jTableDatosTipoSexo.setFillsViewportHeight(true);
		this.jTableDatosTipoSexo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoSexo= new GridBagLayout();
		this.jPanelAccionesTipoSexo.setLayout(gridaBagLayoutAccionesTipoSexo);
		
		
		/*	
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = 0;
		this.gridBagConstraintsTipoSexo.gridx = 0;
			
		this.jPanelAccionesTipoSexo.add(this.jButtonNuevoTipoSexo, this.gridBagConstraintsTipoSexo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSexo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSexo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();						
			this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSexo.gridx = 0;		
			//this.gridBagConstraintsTipoSexo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSexo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoSexo, this.gridBagConstraintsTipoSexo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoSexo.gridx = 0;		
		//this.gridBagConstraintsTipoSexo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoSexo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoSexo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoSexo, this.gridBagConstraintsTipoSexo);								
		
		
		/*
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoSexo, this.gridBagConstraintsTipoSexo);
		*/		
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSexo.gridx =0;
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSexo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSexo, this.gridBagConstraintsTipoSexo);
				
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoSexo, this.gridBagConstraintsTipoSexo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoSexoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoSexo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSexo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoSexo.setLayout(gridaBagLayoutBusquedasParametrosTipoSexo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoSexo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSexo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSexo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSexo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSexo, this.gridBagConstraintsTipoSexo);
			
			
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSexo, this.gridBagConstraintsTipoSexo);
		
			
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSexo, this.gridBagConstraintsTipoSexo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoSexo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoSexo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoSexo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoSexo.setName("jPanelReporteDinamicoTipoSexo"); 
		
		this.jPanelReporteDinamicoTipoSexo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSexo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSexo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoSexo.setLayout(gridaBagLayoutReporteDinamicoTipoSexo);
		
		
		this.jInternalFrameReporteDinamicoTipoSexo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoSexo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSexo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoSexo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoSexo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoSexo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoSexo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoSexo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoSexo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoSexo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoSexo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoSexo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSexo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSexo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sexos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoSexo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoSexo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoSexo.add(this.jLabelColumnasSelectReporteTipoSexo, this.gridBagConstraintsTipoSexo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoSexo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoSexo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoSexo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoSexo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSexo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSexo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoSexo=new JScrollPane(this.jListColumnasSelectReporteTipoSexo);
			
			this.jScrollColumnasSelectReporteTipoSexo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSexo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSexo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoSexo.add(this.jListColumnasSelectReporteTipoSexo, this.gridBagConstraintsTipoSexo);
		this.jPanelReporteDinamicoTipoSexo.add(this.jScrollColumnasSelectReporteTipoSexo, this.gridBagConstraintsTipoSexo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoSexo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoSexo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoSexo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoSexo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoSexo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoSexo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSexo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSexo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoSexo=new JScrollPane(this.jListRelacionesSelectReporteTipoSexo);
			
			this.jScrollRelacionesSelectReporteTipoSexo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSexo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSexo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoSexo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoSexo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoSexo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoSexo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoSexo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoSexo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSexo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSexo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoSexo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSexo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSexo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSexo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSexo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoSexo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoSexo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSexo.add(this.jLabelGenerarExcelReporteDinamicoTipoSexo, this.gridBagConstraintsTipoSexo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoSexo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoSexo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoSexo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoSexo.setToolTipText("Generar EXCEL"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		//this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoSexo.add(this.jButtonGenerarExcelReporteDinamicoTipoSexo, this.gridBagConstraintsTipoSexo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSexo.add(this.jComboBoxTiposReportesDinamicoTipoSexo, this.gridBagConstraintsTipoSexo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoSexo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoSexo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSexo.add(this.jLabelTiposArchivoReporteDinamicoTipoSexo, this.gridBagConstraintsTipoSexo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSexo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoSexo, this.gridBagConstraintsTipoSexo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoSexo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoSexo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoSexo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoSexo.setToolTipText("Generar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSexo.add(this.jButtonGenerarReporteDinamicoTipoSexo, this.gridBagConstraintsTipoSexo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoSexo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoSexo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoSexo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoSexo.setToolTipText("Cancelar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSexo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSexo.add(this.jButtonCerrarReporteDinamicoTipoSexo, this.gridBagConstraintsTipoSexo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoSexo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoSexo= new JScrollPane(jPanelReporteDinamicoTipoSexo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoSexo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSexo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSexo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sexos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoSexo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoSexo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoSexo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoSexo);
		this.jInternalFrameReporteDinamicoTipoSexo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoSexo, this.gridBagConstraintsTipoSexo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoSexo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoSexo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoSexo.setName("jPanelImportacionTipoSexo"); 
		
		this.jPanelImportacionTipoSexo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSexo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSexo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoSexo.setLayout(gridaBagLayoutImportacionTipoSexo);
		
		
		this.jInternalFrameImportacionTipoSexo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoSexo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoSexo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSexo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoSexo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSexo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSexo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoSexo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSexo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSexo.setResizable(true);
	    this.jInternalFrameImportacionTipoSexo.setClosable(true);
	    this.jInternalFrameImportacionTipoSexo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoSexo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSexo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSexo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoSexo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSexo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSexo.setResizable(true);
	    this.jInternalFrameImportacionTipoSexo.setClosable(true);
	    this.jInternalFrameImportacionTipoSexo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoSexo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSexo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSexo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sexos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoSexo = new JLabelMe();

		this.jLabelArchivoImportacionTipoSexo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSexo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSexo.add(this.jLabelArchivoImportacionTipoSexo, this.gridBagConstraintsTipoSexo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoSexo = new JFileChooser();		
		this.jFileChooserImportacionTipoSexo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoSexo = new JButtonMe();
		this.jButtonAbrirImportacionTipoSexo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoSexo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoSexo.setToolTipText("Generar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSexo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSexo.add(this.jButtonAbrirImportacionTipoSexo, this.gridBagConstraintsTipoSexo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoSexo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoSexo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSexo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSexo.add(this.jLabelPathArchivoImportacionTipoSexo, this.gridBagConstraintsTipoSexo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoSexo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoSexo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSexo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSexo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSexo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSexo.add(this.jTextFieldPathArchivoImportacionTipoSexo, this.gridBagConstraintsTipoSexo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoSexo = new JButtonMe();
		this.jButtonGenerarImportacionTipoSexo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoSexo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoSexo.setToolTipText("Generar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSexo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSexo.add(this.jButtonGenerarImportacionTipoSexo, this.gridBagConstraintsTipoSexo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoSexo = new JButtonMe();
		this.jButtonCerrarImportacionTipoSexo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoSexo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoSexo.setToolTipText("Cancelar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSexo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSexo.add(this.jButtonCerrarImportacionTipoSexo, this.gridBagConstraintsTipoSexo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoSexo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoSexo= new JScrollPane(jPanelImportacionTipoSexo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoSexo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoSexo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoSexo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoSexo);
		this.jInternalFrameImportacionTipoSexo.getContentPane().add(this.jScrollPanelImportacionTipoSexo, this.gridBagConstraintsTipoSexo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoSexo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoSexo = new JButtonMe();
			this.jButtonAbrirOrderByTipoSexo.setText("Orden");
			this.jButtonAbrirOrderByTipoSexo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSexo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoSexo";
			inputMap = this.jButtonAbrirOrderByTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoSexo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoSexo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoSexo.setName("jPanelOrderByTipoSexo"); 
			
			this.jPanelOrderByTipoSexo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSexo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSexo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoSexo.setLayout(gridaBagLayoutOrderByTipoSexo);
			
			
			this.jTableDatosTipoSexoOrderBy = new JTableMe();        
			this.jTableDatosTipoSexoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoSexoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoSexoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoSexoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoSexoOrderBy.setViewportView(this.jTableDatosTipoSexoOrderBy);
			this.jTableDatosTipoSexoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoSexoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoSexo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoSexo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoSexo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoSexo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoSexo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoSexo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoSexo.setTitle("Orden");
			this.jInternalFrameOrderByTipoSexo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoSexo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoSexo.setResizable(true);
			this.jInternalFrameOrderByTipoSexo.setClosable(true);
			this.jInternalFrameOrderByTipoSexo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoSexo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSexo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSexo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sexos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoSexo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoSexo.ipady =150;
				
			this.jPanelOrderByTipoSexo.add(jScrollPanelDatosTipoSexoOrderBy, this.gridBagConstraintsTipoSexo);//this.jTableDatosTipoSexoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoSexo = new JButtonMe();
			this.jButtonCerrarOrderByTipoSexo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoSexo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoSexo.setToolTipText("Cancelar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoSexo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoSexo.add(this.jButtonCerrarOrderByTipoSexo, this.gridBagConstraintsTipoSexo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoSexo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoSexo= new JScrollPane(jPanelOrderByTipoSexo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoSexo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoSexo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoSexo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoSexo);
			
			this.jInternalFrameOrderByTipoSexo.getContentPane().add(this.jScrollPanelOrderByTipoSexo, this.gridBagConstraintsTipoSexo);			
		
		} else {
			this.jButtonAbrirOrderByTipoSexo = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiposexoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoSexo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoSexo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoSexo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoSexo.getRowHeight();//TipoSexoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoSexoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSexo.isSelected()) {
					iHeightTable=TipoSexoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSexoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSexoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoSexoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSexo.isSelected()) {
					iHeightTable=TipoSexoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSexoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSexoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoSexo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSexo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSexo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoSexo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSexo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSexo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoSexo!=null && this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy()!=null) {
			//if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoSexo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoSexo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoSexo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoSexo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSexo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSexo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiposexoLogic.getTipoSexos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposexos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoSexo> TraerTipoSexoBeans(List<TipoSexo> tiposexos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoSexo tiposexo:tiposexos) {
					
				if(!(TipoSexoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoSexoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiposexo.setsDetalleGeneralEntityReporte(TipoSexoConstantesFunciones.getTipoSexoDescripcion(tiposexo));
										
						
					
						
					
				} else  {
							
					//tiposexo.setsDetalleGeneralEntityReporte(tiposexo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiposexobeans.add(tiposexobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiposexos;
    }
	//PARA REPORTES FIN
}
