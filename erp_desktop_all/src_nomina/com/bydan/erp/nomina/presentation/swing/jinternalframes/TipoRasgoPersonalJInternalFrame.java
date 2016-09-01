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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.TipoRasgoPersonalConstantesFunciones;

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
public class TipoRasgoPersonalJInternalFrame extends TipoRasgoPersonalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRasgoPersonal;
	
	protected JMenuBar jmenuBarTipoRasgoPersonal;
	
	protected JMenu jmenuTipoRasgoPersonal;
	protected JMenu jmenuDatosTipoRasgoPersonal;
	protected JMenu jmenuArchivoTipoRasgoPersonal;
	protected JMenu jmenuAccionesTipoRasgoPersonal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRasgoPersonal;	
	protected GridBagConstraints gridBagConstraintsTipoRasgoPersonal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRasgoPersonalDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRasgoPersonal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRasgoPersonal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRasgoPersonal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoRasgoPersonalSessionBean tiporasgopersonalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRasgoPersonal> tiporasgopersonals;		
	public List<TipoRasgoPersonal> tiporasgopersonalsEliminados;	
	public List<TipoRasgoPersonal> tiporasgopersonalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRasgoPersonal;		
	protected JButton jButtonAbrirOrderByTipoRasgoPersonal;
	
	
	//protected JPanel jPanelOrderByTipoRasgoPersonal;
	//public JScrollPane jScrollPanelOrderByTipoRasgoPersonal;	
	//protected JButton jButtonCerrarOrderByTipoRasgoPersonal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRasgoPersonalLogic tiporasgopersonalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRasgoPersonal;
	public JScrollPane jScrollPanelDatosEdicionTipoRasgoPersonal;
	public JScrollPane jScrollPanelDatosGeneralTipoRasgoPersonal;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRasgoPersonalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRasgoPersonal;
	//public JScrollPane jScrollPanelImportacionTipoRasgoPersonal;
	
	
	
	protected JPanel jPanelAccionesTipoRasgoPersonal;
	
    protected JPanel jPanelPaginacionTipoRasgoPersonal;
    protected JPanel jPanelParametrosReportesTipoRasgoPersonal;
	protected JPanel jPanelParametrosReportesAccionesTipoRasgoPersonal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRasgoPersonal;
	protected JPanel jPanelParametrosAuxiliar2TipoRasgoPersonal;
	protected JPanel jPanelParametrosAuxiliar3TipoRasgoPersonal;
	protected JPanel jPanelParametrosAuxiliar4TipoRasgoPersonal;
	//protected JPanel jPanelParametrosAuxiliar5TipoRasgoPersonal;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRasgoPersonal;
	//protected JPanel jPanelImportacionTipoRasgoPersonal;
	
	
	public JTable jTableDatosTipoRasgoPersonal;
	
	
	
	//public JTable jTableDatosTipoRasgoPersonalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRasgoPersonal;
	protected JButton jButtonDuplicarTipoRasgoPersonal;
	protected JButton jButtonCopiarTipoRasgoPersonal;
	protected JButton jButtonVerFormTipoRasgoPersonal;
	protected JButton jButtonNuevoRelacionesTipoRasgoPersonal;
	protected JButton jButtonModificarTipoRasgoPersonal;
	
    protected JButton jButtonGuardarCambiosTablaTipoRasgoPersonal;
	protected JButton jButtonCerrarTipoRasgoPersonal;
	
	
	protected JButton jButtonRecargarInformacionTipoRasgoPersonal;
	protected JButton jButtonProcesarInformacionTipoRasgoPersonal;
	
	
	protected JButton jButtonAnterioresTipoRasgoPersonal;
	protected JButton jButtonSiguientesTipoRasgoPersonal;
	protected JButton jButtonNuevoGuardarCambiosTipoRasgoPersonal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRasgoPersonal;
	//protected JButton jButtonCerrarReporteDinamicoTipoRasgoPersonal;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRasgoPersonal;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRasgoPersonal;
	//protected JButton jButtonGenerarImportacionTipoRasgoPersonal;
	//protected JButton jButtonCerrarImportacionTipoRasgoPersonal;
	//protected JFileChooser jFileChooserImportacionTipoRasgoPersonal;
	//protected File fileImportacionTipoRasgoPersonal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRasgoPersonal;
	protected JButton jButtonDuplicarToolBarTipoRasgoPersonal;
	protected JButton jButtonNuevoRelacionesToolBarTipoRasgoPersonal;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRasgoPersonal;
	protected JButton jButtonCopiarToolBarTipoRasgoPersonal;
	protected JButton jButtonVerFormToolBarTipoRasgoPersonal;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRasgoPersonal;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRasgoPersonal;
	protected JButton jButtonCerrarToolBarTipoRasgoPersonal;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRasgoPersonal;
	protected JButton jButtonProcesarInformacionToolBarTipoRasgoPersonal;
	protected JButton jButtonAnterioresToolBarTipoRasgoPersonal;
	protected JButton jButtonSiguientesToolBarTipoRasgoPersonal;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRasgoPersonal;
	protected JButton jButtonAbrirOrderByToolBarTipoRasgoPersonal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRasgoPersonal;
	protected JMenuItem jMenuItemDuplicarTipoRasgoPersonal;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRasgoPersonal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRasgoPersonal;
	protected JMenuItem jMenuItemCopiarTipoRasgoPersonal;
	protected JMenuItem jMenuItemVerFormTipoRasgoPersonal;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRasgoPersonal;
	protected JMenuItem jMenuItemCerrarTipoRasgoPersonal;
	protected JMenuItem jMenuItemDetalleCerrarTipoRasgoPersonal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRasgoPersonal;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRasgoPersonal;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRasgoPersonal;
	protected JMenuItem jMenuItemProcesarInformacionTipoRasgoPersonal;
	protected JMenuItem jMenuItemAnterioresTipoRasgoPersonal;
	protected JMenuItem jMenuItemSiguientesTipoRasgoPersonal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRasgoPersonal;
	protected JMenuItem jMenuItemAbrirOrderByTipoRasgoPersonal;
	protected JMenuItem jMenuItemMostrarOcultarTipoRasgoPersonal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRasgoPersonal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRasgoPersonal;
	protected JCheckBox jCheckBoxSeleccionadosTipoRasgoPersonal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRasgoPersonal;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRasgoPersonal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRasgoPersonal;
	protected JTextField jTextFieldValorCampoGeneralTipoRasgoPersonal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRasgoPersonal;
	//public JList<Reporte> jListColumnasSelectReporteTipoRasgoPersonal;
	//public JScrollPane jScrollColumnasSelectReporteTipoRasgoPersonal;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRasgoPersonal;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRasgoPersonal;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRasgoPersonal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRasgoPersonal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRasgoPersonal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRasgoPersonal;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRasgoPersonal;
	
		
	//public JLabel jLabelArchivoImportacionTipoRasgoPersonal;	
	//public JLabel jLabelPathArchivoImportacionTipoRasgoPersonal;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRasgoPersonal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRasgoPersonal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRasgoPersonal;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRasgoPersonal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRasgoPersonal;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRasgoPersonal;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRasgoPersonal;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRasgoPersonal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRasgoPersonal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRasgoPersonal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRasgoPersonal;
	
	
	
	
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
	public TipoRasgoPersonalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRasgoPersonalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRasgoPersonalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRasgoPersonalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRasgoPersonal)	{
		this.jButtonRecargarInformacionTipoRasgoPersonal = jButtonRecargarInformacionTipoRasgoPersonal;
	}
	
	public JButton getjButtonProcesarInformacionTipoRasgoPersonal() {
		return this.jButtonProcesarInformacionTipoRasgoPersonal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRasgoPersonal)	{
		this.jButtonProcesarInformacionTipoRasgoPersonal = jButtonProcesarInformacionTipoRasgoPersonal;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRasgoPersonal() {
		return this.jButtonRecargarInformacionTipoRasgoPersonal;
	}
	
	
	public List<TipoRasgoPersonal> gettiporasgopersonals() {
		return this.tiporasgopersonals;
	}

	public void settiporasgopersonals(List<TipoRasgoPersonal> tiporasgopersonals) {
		this.tiporasgopersonals = tiporasgopersonals;
	}
	
	public List<TipoRasgoPersonal> gettiporasgopersonalsAux() {
		return this.tiporasgopersonalsAux;
	}

	public void settiporasgopersonalsAux(List<TipoRasgoPersonal> tiporasgopersonalsAux) {
		this.tiporasgopersonalsAux = tiporasgopersonalsAux;
	}
	
	public List<TipoRasgoPersonal> gettiporasgopersonalsEliminados() {
		return this.tiporasgopersonalsEliminados;
	}

	public void setTipoRasgoPersonalsEliminados(List<TipoRasgoPersonal> tiporasgopersonalsEliminados) {
		this.tiporasgopersonalsEliminados = tiporasgopersonalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRasgoPersonal() {
		return jComboBoxTiposSeleccionarTipoRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRasgoPersonal(
			JComboBox jComboBoxTiposSeleccionarTipoRasgoPersonal) {
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal = jComboBoxTiposSeleccionarTipoRasgoPersonal;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRasgoPersonal() {
		return jTextFieldValorCampoGeneralTipoRasgoPersonal;
	}

	public void setjTextFieldValorCampoGeneralTipoRasgoPersonal(
			JTextField jTextFieldValorCampoGeneralTipoRasgoPersonal) {
		this.jTextFieldValorCampoGeneralTipoRasgoPersonal = jTextFieldValorCampoGeneralTipoRasgoPersonal;
	}

	public void setBorderResaltarValorCampoGeneralTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRasgoPersonal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRasgoPersonal() {
		return this.jCheckBoxSeleccionarTodosTipoRasgoPersonal;
	}

	public void setjCheckBoxSeleccionarTodosTipoRasgoPersonal(
			JCheckBox jCheckBoxSeleccionarTodosTipoRasgoPersonal) {
		this.jCheckBoxSeleccionarTodosTipoRasgoPersonal = jCheckBoxSeleccionarTodosTipoRasgoPersonal;
	}

	public void setBorderResaltarSeleccionarTodosTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRasgoPersonal() {
		return this.jCheckBoxSeleccionadosTipoRasgoPersonal;
	}

	public void setjCheckBoxSeleccionadosTipoRasgoPersonal(
			JCheckBox jCheckBoxSeleccionadosTipoRasgoPersonal) {
		this.jCheckBoxSeleccionadosTipoRasgoPersonal = jCheckBoxSeleccionadosTipoRasgoPersonal;
	}
	
	public void setBorderResaltarSeleccionadosTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRasgoPersonal() {
		return this.jComboBoxTiposArchivosReportesTipoRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRasgoPersonal(
			JComboBox jComboBoxTiposArchivosReportesTipoRasgoPersonal) {
		this.jComboBoxTiposArchivosReportesTipoRasgoPersonal = jComboBoxTiposArchivosReportesTipoRasgoPersonal;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRasgoPersonal() {
		return this.jComboBoxTiposReportesTipoRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRasgoPersonal(
			JComboBox jComboBoxTiposReportesTipoRasgoPersonal) {
		this.jComboBoxTiposReportesTipoRasgoPersonal = jComboBoxTiposReportesTipoRasgoPersonal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRasgoPersonal() {
	//	return jComboBoxTiposReportesDinamicoTipoRasgoPersonal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRasgoPersonal(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRasgoPersonal) {
	//	this.jComboBoxTiposReportesDinamicoTipoRasgoPersonal = jComboBoxTiposReportesDinamicoTipoRasgoPersonal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal = jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal;
	//}
	
	public void setBorderResaltarTiposReportesTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRasgoPersonal() {
		return this.jComboBoxTiposGraficosReportesTipoRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRasgoPersonal(
			JComboBox jComboBoxTiposGraficosReportesTipoRasgoPersonal) {
		this.jComboBoxTiposGraficosReportesTipoRasgoPersonal = jComboBoxTiposGraficosReportesTipoRasgoPersonal;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRasgoPersonal() {
		return this.jComboBoxTiposPaginacionTipoRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRasgoPersonal(
			JComboBox jComboBoxTiposPaginacionTipoRasgoPersonal) {
		this.jComboBoxTiposPaginacionTipoRasgoPersonal = jComboBoxTiposPaginacionTipoRasgoPersonal;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRasgoPersonal() {
		return this.jComboBoxTiposRelacionesTipoRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRasgoPersonal() {
		return this.jComboBoxTiposAccionesTipoRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRasgoPersonal(
			JComboBox jComboBoxTiposRelacionesTipoRasgoPersonal) {
		this.jComboBoxTiposRelacionesTipoRasgoPersonal = jComboBoxTiposRelacionesTipoRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRasgoPersonal(
			JComboBox jComboBoxTiposAccionesTipoRasgoPersonal) {
		this.jComboBoxTiposAccionesTipoRasgoPersonal = jComboBoxTiposAccionesTipoRasgoPersonal;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRasgoPersonal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRasgoPersonal() {
	//	return jCheckBoxConGraficoDinamicoTipoRasgoPersonal;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRasgoPersonal(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRasgoPersonal) {
	//	this.jCheckBoxConGraficoDinamicoTipoRasgoPersonal = jCheckBoxConGraficoDinamicoTipoRasgoPersonal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRasgoPersonal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRasgoPersonal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRasgoPersonal .setBorder(borderResaltar);		
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
		this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
		
		this.tiporasgopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporasgopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporasgopersonalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRasgoPersonalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Rasgo Personal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRasgoPersonal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"nuevo","nuevo","Nuevo"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"duplicar","duplicar","Duplicar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"copiar","copiar","Copiar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"ver_form","ver_form","Ver"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"recargar","recargar","Recargar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,
							"cerrar","cerrar","Salir"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRasgoPersonal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRasgoPersonal;
			
				this.jButtonProcesarInformacionToolBarTipoRasgoPersonal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRasgoPersonal;
				
		//protected JButton jButtonModificarToolBarTipoRasgoPersonal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRasgoPersonal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRasgoPersonal=new JMenuMe("General");
		this.jmenuArchivoTipoRasgoPersonal=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRasgoPersonal=new JMenuMe("Acciones");
		this.jmenuDatosTipoRasgoPersonal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRasgoPersonal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRasgoPersonal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRasgoPersonal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRasgoPersonal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRasgoPersonal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRasgoPersonal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRasgoPersonal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRasgoPersonal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRasgoPersonal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRasgoPersonal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRasgoPersonal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRasgoPersonal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRasgoPersonal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRasgoPersonal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRasgoPersonal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRasgoPersonal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRasgoPersonal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRasgoPersonal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRasgoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRasgoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRasgoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRasgoPersonal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRasgoPersonal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRasgoPersonal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRasgoPersonal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRasgoPersonal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRasgoPersonal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRasgoPersonal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRasgoPersonal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRasgoPersonal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRasgoPersonal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRasgoPersonal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRasgoPersonal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRasgoPersonal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRasgoPersonal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRasgoPersonal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRasgoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRasgoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRasgoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRasgoPersonal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRasgoPersonal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRasgoPersonal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRasgoPersonal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRasgoPersonal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRasgoPersonal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRasgoPersonal.add(this.jMenuItemCerrarTipoRasgoPersonal);
			
			this.jmenuAccionesTipoRasgoPersonal.add(this.jMenuItemNuevoTipoRasgoPersonal);
			this.jmenuAccionesTipoRasgoPersonal.add(this.jMenuItemNuevoGuardarCambiosTipoRasgoPersonal);
			this.jmenuAccionesTipoRasgoPersonal.add(this.jMenuItemNuevoRelacionesTipoRasgoPersonal);
			this.jmenuAccionesTipoRasgoPersonal.add(this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal);		
			this.jmenuAccionesTipoRasgoPersonal.add(this.jMenuItemDuplicarTipoRasgoPersonal);		
			this.jmenuAccionesTipoRasgoPersonal.add(this.jMenuItemCopiarTipoRasgoPersonal);		
			this.jmenuAccionesTipoRasgoPersonal.add(this.jMenuItemVerFormTipoRasgoPersonal);		
			
			this.jmenuDatosTipoRasgoPersonal.add(this.jMenuItemRecargarInformacionTipoRasgoPersonal);				
			this.jmenuDatosTipoRasgoPersonal.add(this.jMenuItemAnterioresTipoRasgoPersonal);				
			this.jmenuDatosTipoRasgoPersonal.add(this.jMenuItemSiguientesTipoRasgoPersonal);				
			this.jmenuDatosTipoRasgoPersonal.add(this.jMenuItemAbrirOrderByTipoRasgoPersonal);				
			this.jmenuDatosTipoRasgoPersonal.add(this.jMenuItemMostrarOcultarTipoRasgoPersonal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRasgoPersonal.add(this.jMenuItemGuardarCambiosTipoRasgoPersonal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRasgoPersonal.add(this.jmenuArchivoTipoRasgoPersonal);		
			this.jmenuBarTipoRasgoPersonal.add(this.jmenuAccionesTipoRasgoPersonal);		
			this.jmenuBarTipoRasgoPersonal.add(this.jmenuDatosTipoRasgoPersonal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRasgoPersonal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRasgoPersonal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoRasgoPersonal=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRasgoPersonal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRasgoPersonal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRasgoPersonal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRasgoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRasgoPersonal = new TipoRasgoPersonalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Rasgo Personal DATOS");
			this.jInternalFrameDetalleFormTipoRasgoPersonal = new TipoRasgoPersonalDetalleFormJInternalFrame(jDesktopPane,this.tiporasgopersonalSessionBean.getConGuardarRelaciones(),this.tiporasgopersonalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRasgoPersonal = null;//new TipoRasgoPersonalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRasgoPersonal= new GridBagLayout();
		
		
		this.jTableDatosTipoRasgoPersonal = new JTableMe();      
		
		String sToolTipTipoRasgoPersonal="";
		sToolTipTipoRasgoPersonal=TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRasgoPersonal+="(Nomina.TipoRasgoPersonal)";
		}
		
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRasgoPersonal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRasgoPersonal.setToolTipText(sToolTipTipoRasgoPersonal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRasgoPersonal);
		this.jTableDatosTipoRasgoPersonal.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRasgoPersonal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRasgoPersonal.setRowSelectionAllowed(true);
		this.jTableDatosTipoRasgoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRasgoPersonal = new JButtonMe();
		this.jButtonDuplicarTipoRasgoPersonal = new JButtonMe();
		this.jButtonCopiarTipoRasgoPersonal = new JButtonMe();
		this.jButtonVerFormTipoRasgoPersonal = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRasgoPersonal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal = new JButtonMe();
		this.jButtonCerrarTipoRasgoPersonal = new JButtonMe();
		
		this.jScrollPanelDatosTipoRasgoPersonal = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRasgoPersonal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Rasgo Personal";
		
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rasgo Personales" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRasgoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRasgoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesTipoRasgoPersonal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRasgoPersonal=new ReporteDinamicoJInternalFrame(TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRasgoPersonal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRasgoPersonal=new ImportacionJInternalFrame(TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRasgoPersonal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRasgoPersonal = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRasgoPersonal.setText("Orden");
		this.jButtonAbrirOrderByTipoRasgoPersonal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRasgoPersonal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRasgoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRasgoPersonal,false,this);
			
			//this.cargarOrderByTipoRasgoPersonal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRasgoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRasgoPersonal,true,this);
			
			//this.cargarOrderByTipoRasgoPersonal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRasgoPersonal.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRasgoPersonal.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRasgoPersonal.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoRasgoPersonal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRasgoPersonal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRasgoPersonal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRasgoPersonal.setText("Nuevo");
		this.jButtonDuplicarTipoRasgoPersonal.setText("Duplicar");
		this.jButtonCopiarTipoRasgoPersonal.setText("Copiar");
		this.jButtonVerFormTipoRasgoPersonal.setText("Ver");
		this.jButtonNuevoRelacionesTipoRasgoPersonal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.setText("Guardar");
		this.jButtonCerrarTipoRasgoPersonal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRasgoPersonal,"nuevo_button","Nuevo",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRasgoPersonal,"duplicar_button","Duplicar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRasgoPersonal,"copiar_button","Copiar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRasgoPersonal,"ver_form","Ver",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRasgoPersonal,"nuevorelaciones_button","Nuevo Rel",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRasgoPersonal,"guardarcambiostabla_button","Guardar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRasgoPersonal,"cerrar_button","Salir",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRasgoPersonal.setToolTipText("Nuevo"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRasgoPersonal.setToolTipText("Duplicar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRasgoPersonal.setToolTipText("Copiar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRasgoPersonal.setToolTipText("Ver"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRasgoPersonal.setToolTipText("Nuevo Rel"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.setToolTipText("Guardar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRasgoPersonal.setToolTipText("Salir"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRasgoPersonal";
		inputMap = this.jButtonNuevoTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRasgoPersonal"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRasgoPersonal";
		inputMap = this.jButtonDuplicarTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRasgoPersonal"));
		
		//COPIAR
		sMapKey = "CopiarTipoRasgoPersonal";
		inputMap = this.jButtonCopiarTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRasgoPersonal"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRasgoPersonal";
		inputMap = this.jButtonVerFormTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRasgoPersonal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRasgoPersonal";
		inputMap = this.jButtonNuevoRelacionesTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRasgoPersonal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRasgoPersonal";
		inputMap = this.jButtonModificarTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRasgoPersonal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRasgoPersonal";
		inputMap = this.jButtonCerrarTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRasgoPersonal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRasgoPersonal";
		inputMap = this.jButtonGuardarCambiosTablaTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRasgoPersonal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRasgoPersonal.setName("jPanelParametrosReportesTipoRasgoPersonal"); 
		
		this.jPanelParametrosReportesAccionesTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRasgoPersonal.setName("jPanelParametrosReportesAccionesTipoRasgoPersonal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRasgoPersonal = new JButtonMe();
		this.jButtonRecargarInformacionTipoRasgoPersonal.setText("Recargar");
		this.jButtonRecargarInformacionTipoRasgoPersonal.setToolTipText("Recargar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRasgoPersonal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRasgoPersonal = new JButtonMe();
		this.jButtonProcesarInformacionTipoRasgoPersonal.setText("Procesar");
		this.jButtonProcesarInformacionTipoRasgoPersonal.setToolTipText("Procesar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRasgoPersonal.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRasgoPersonal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRasgoPersonal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRasgoPersonal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRasgoPersonal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRasgoPersonal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRasgoPersonal.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRasgoPersonal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRasgoPersonal.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRasgoPersonal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRasgoPersonal.setText("Accion");
		this.jComboBoxTiposAccionesTipoRasgoPersonal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRasgoPersonal.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRasgoPersonal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRasgoPersonal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRasgoPersonal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRasgoPersonal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRasgoPersonal = new JLabelMe();
		
		this.jLabelAccionesTipoRasgoPersonal.setText("Acciones");		
		this.jLabelAccionesTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRasgoPersonal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRasgoPersonal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRasgoPersonal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRasgoPersonal.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRasgoPersonal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRasgoPersonal = new JButtonMe();
		//this.jButtonAnterioresTipoRasgoPersonal.setText("<<");
        this.jButtonAnterioresTipoRasgoPersonal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRasgoPersonal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRasgoPersonal = new JButtonMe();
		//this.jButtonSiguientesTipoRasgoPersonal.setText(">>");
        this.jButtonSiguientesTipoRasgoPersonal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRasgoPersonal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRasgoPersonal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRasgoPersonal.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRasgoPersonal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRasgoPersonal,"nuevoguardarcambios_button","Nue",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRasgoPersonal";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRasgoPersonal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRasgoPersonal";
		inputMap = this.jButtonRecargarInformacionTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRasgoPersonal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRasgoPersonal";
		inputMap = this.jButtonSiguientesTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRasgoPersonal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRasgoPersonal";
		inputMap = this.jButtonAnterioresTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRasgoPersonal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRasgoPersonal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRasgoPersonal.setMinimumSize(new Dimension(this.getWidth(),TipoRasgoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRasgoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRasgoPersonal.setMaximumSize(new Dimension(this.getWidth(),TipoRasgoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRasgoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRasgoPersonal.setPreferredSize(new Dimension(this.getWidth(),TipoRasgoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRasgoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRasgoPersonal = new GridBagLayout();

			this.jPanelPaginacionTipoRasgoPersonal.setLayout(gridaBagLayoutPaginacionTipoRasgoPersonal);						
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonAnterioresTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
					
						
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
			
			this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonNuevoGuardarCambiosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
						
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
			this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonSiguientesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 1;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonNuevoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
				this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRasgoPersonal.gridy = 1;
				this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonNuevoRelacionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			}
			
			
			if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
				this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRasgoPersonal.gridy = 1;
				this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonGuardarCambiosTablaTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			}
			
			
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 1;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonDuplicarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 1;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonCopiarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 1;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonVerFormTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 1;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRasgoPersonal.add(this.jButtonCerrarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
		
		
		this.jButtonRecargarInformacionTipoRasgoPersonal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRasgoPersonal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRasgoPersonal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRasgoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRasgoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRasgoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRasgoPersonal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRasgoPersonal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRasgoPersonal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRasgoPersonal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRasgoPersonal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRasgoPersonal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRasgoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRasgoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRasgoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRasgoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRasgoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRasgoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRasgoPersonal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRasgoPersonal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRasgoPersonal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRasgoPersonal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRasgoPersonal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRasgoPersonal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRasgoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRasgoPersonal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRasgoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRasgoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRasgoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRasgoPersonal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRasgoPersonal.setLayout(gridaBagParametrosReportesTipoRasgoPersonal);
			this.jPanelParametrosReportesAccionesTipoRasgoPersonal.setLayout(gridaBagParametrosReportesAccionesTipoRasgoPersonal);
			
			
			this.jPanelParametrosAuxiliar1TipoRasgoPersonal.setLayout(gridaBagParametrosAuxiliar1TipoRasgoPersonal);
			this.jPanelParametrosAuxiliar2TipoRasgoPersonal.setLayout(gridaBagParametrosAuxiliar2TipoRasgoPersonal);
			this.jPanelParametrosAuxiliar3TipoRasgoPersonal.setLayout(gridaBagParametrosAuxiliar3TipoRasgoPersonal);
			this.jPanelParametrosAuxiliar4TipoRasgoPersonal.setLayout(gridaBagParametrosAuxiliar4TipoRasgoPersonal);
			//this.jPanelParametrosAuxiliar5TipoRasgoPersonal.setLayout(gridaBagParametrosAuxiliar2TipoRasgoPersonal);			
			
			
			
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jButtonRecargarInformacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRasgoPersonal.add(this.jComboBoxTiposPaginacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRasgoPersonal.add(this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRasgoPersonal.add(this.jComboBoxTiposArchivosReportesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jPanelParametrosAuxiliar1TipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRasgoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRasgoPersonal.add(this.jComboBoxTiposReportesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jPanelParametrosAuxiliar4TipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jComboBoxTiposReportesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jCheckBoxGenerarReporteTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jPanelParametrosAuxiliar2TipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRasgoPersonal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jLabelAccionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
				this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jButtonAbrirOrderByTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jComboBoxTiposSeleccionarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
			
			
			/*
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRasgoPersonal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jCheckBoxSeleccionarTodosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRasgoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRasgoPersonal.add(this.jCheckBoxSeleccionarTodosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);															
				
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRasgoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRasgoPersonal.add(this.jCheckBoxSeleccionadosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jPanelParametrosAuxiliar3TipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jComboBoxTiposRelacionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
				
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jComboBoxTiposAccionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
	
				
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRasgoPersonal.add(this.jTextFieldValorCampoGeneralTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRasgoPersonal = new GridBagLayout();

			this.jScrollPanelDatosTipoRasgoPersonal.setLayout(gridaBagLayoutDatosTipoRasgoPersonal);
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
			
			this.jScrollPanelDatosTipoRasgoPersonal.add(this.jTableDatosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRasgoPersonal.setViewportView(this.jTableDatosTipoRasgoPersonal);
		this.jTableDatosTipoRasgoPersonal.setFillsViewportHeight(true);
		this.jTableDatosTipoRasgoPersonal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRasgoPersonal= new GridBagLayout();
		this.jPanelAccionesTipoRasgoPersonal.setLayout(gridaBagLayoutAccionesTipoRasgoPersonal);
		
		
		/*	
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
			
		this.jPanelAccionesTipoRasgoPersonal.add(this.jButtonNuevoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRasgoPersonal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRasgoPersonal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();						
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;		
			//this.gridBagConstraintsTipoRasgoPersonal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRasgoPersonal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;		
		//this.gridBagConstraintsTipoRasgoPersonal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRasgoPersonal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRasgoPersonal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);								
		
		
		/*
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		*/		
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRasgoPersonal.gridx =0;
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRasgoPersonal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
				
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRasgoPersonal = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRasgoPersonal.setLayout(gridaBagLayoutBusquedasParametrosTipoRasgoPersonal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRasgoPersonal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			
			
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
			
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRasgoPersonal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRasgoPersonal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRasgoPersonal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRasgoPersonal.setName("jPanelReporteDinamicoTipoRasgoPersonal"); 
		
		this.jPanelReporteDinamicoTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRasgoPersonal.setLayout(gridaBagLayoutReporteDinamicoTipoRasgoPersonal);
		
		
		this.jInternalFrameReporteDinamicoTipoRasgoPersonal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRasgoPersonal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRasgoPersonal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rasgo Personales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRasgoPersonal = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRasgoPersonal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jLabelColumnasSelectReporteTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRasgoPersonal = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRasgoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRasgoPersonal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRasgoPersonal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRasgoPersonal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRasgoPersonal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRasgoPersonal=new JScrollPane(this.jListColumnasSelectReporteTipoRasgoPersonal);
			
			this.jScrollColumnasSelectReporteTipoRasgoPersonal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRasgoPersonal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRasgoPersonal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jListColumnasSelectReporteTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jScrollColumnasSelectReporteTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRasgoPersonal = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRasgoPersonal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jLabelRelacionesSelectReporteTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRasgoPersonal = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRasgoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRasgoPersonal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRasgoPersonal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRasgoPersonal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRasgoPersonal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRasgoPersonal=new JScrollPane(this.jListRelacionesSelectReporteTipoRasgoPersonal);
			
			this.jScrollRelacionesSelectReporteTipoRasgoPersonal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRasgoPersonal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRasgoPersonal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jListRelacionesSelectReporteTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jScrollRelacionesSelectReporteTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoRasgoPersonal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRasgoPersonal = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRasgoPersonal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRasgoPersonal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRasgoPersonal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRasgoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRasgoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRasgoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRasgoPersonal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRasgoPersonal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jLabelGenerarExcelReporteDinamicoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRasgoPersonal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRasgoPersonal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRasgoPersonal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRasgoPersonal.setToolTipText("Generar EXCEL"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jButtonGenerarExcelReporteDinamicoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jComboBoxTiposReportesDinamicoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRasgoPersonal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRasgoPersonal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jLabelTiposArchivoReporteDinamicoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRasgoPersonal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRasgoPersonal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRasgoPersonal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRasgoPersonal.setToolTipText("Generar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jButtonGenerarReporteDinamicoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRasgoPersonal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRasgoPersonal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRasgoPersonal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRasgoPersonal.setToolTipText("Cancelar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRasgoPersonal.add(this.jButtonCerrarReporteDinamicoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRasgoPersonal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRasgoPersonal= new JScrollPane(jPanelReporteDinamicoTipoRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rasgo Personales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRasgoPersonal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRasgoPersonal);
		this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRasgoPersonal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRasgoPersonal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRasgoPersonal.setName("jPanelImportacionTipoRasgoPersonal"); 
		
		this.jPanelImportacionTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRasgoPersonal.setLayout(gridaBagLayoutImportacionTipoRasgoPersonal);
		
		
		this.jInternalFrameImportacionTipoRasgoPersonal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRasgoPersonal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRasgoPersonal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRasgoPersonal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRasgoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRasgoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRasgoPersonal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRasgoPersonal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRasgoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRasgoPersonal.setResizable(true);
	    this.jInternalFrameImportacionTipoRasgoPersonal.setClosable(true);
	    this.jInternalFrameImportacionTipoRasgoPersonal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRasgoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRasgoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRasgoPersonal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRasgoPersonal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRasgoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRasgoPersonal.setResizable(true);
	    this.jInternalFrameImportacionTipoRasgoPersonal.setClosable(true);
	    this.jInternalFrameImportacionTipoRasgoPersonal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rasgo Personales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRasgoPersonal = new JLabelMe();

		this.jLabelArchivoImportacionTipoRasgoPersonal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRasgoPersonal.add(this.jLabelArchivoImportacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRasgoPersonal = new JFileChooser();		
		this.jFileChooserImportacionTipoRasgoPersonal.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRasgoPersonal = new JButtonMe();
		this.jButtonAbrirImportacionTipoRasgoPersonal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRasgoPersonal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRasgoPersonal.setToolTipText("Generar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRasgoPersonal.add(this.jButtonAbrirImportacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRasgoPersonal = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRasgoPersonal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRasgoPersonal.add(this.jLabelPathArchivoImportacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRasgoPersonal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRasgoPersonal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRasgoPersonal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRasgoPersonal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRasgoPersonal.add(this.jTextFieldPathArchivoImportacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRasgoPersonal = new JButtonMe();
		this.jButtonGenerarImportacionTipoRasgoPersonal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRasgoPersonal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRasgoPersonal.setToolTipText("Generar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRasgoPersonal.add(this.jButtonGenerarImportacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRasgoPersonal = new JButtonMe();
		this.jButtonCerrarImportacionTipoRasgoPersonal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRasgoPersonal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRasgoPersonal.setToolTipText("Cancelar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRasgoPersonal.add(this.jButtonCerrarImportacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRasgoPersonal = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRasgoPersonal= new JScrollPane(jPanelImportacionTipoRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRasgoPersonal.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRasgoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRasgoPersonal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRasgoPersonal);
		this.jInternalFrameImportacionTipoRasgoPersonal.getContentPane().add(this.jScrollPanelImportacionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRasgoPersonal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRasgoPersonal = new JButtonMe();
			this.jButtonAbrirOrderByTipoRasgoPersonal.setText("Orden");
			this.jButtonAbrirOrderByTipoRasgoPersonal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRasgoPersonal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRasgoPersonal";
			inputMap = this.jButtonAbrirOrderByTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRasgoPersonal"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRasgoPersonal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRasgoPersonal.setName("jPanelOrderByTipoRasgoPersonal"); 
			
			this.jPanelOrderByTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRasgoPersonal.setLayout(gridaBagLayoutOrderByTipoRasgoPersonal);
			
			
			this.jTableDatosTipoRasgoPersonalOrderBy = new JTableMe();        
			this.jTableDatosTipoRasgoPersonalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRasgoPersonalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRasgoPersonalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRasgoPersonalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRasgoPersonalOrderBy.setViewportView(this.jTableDatosTipoRasgoPersonalOrderBy);
			this.jTableDatosTipoRasgoPersonalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRasgoPersonalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRasgoPersonal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRasgoPersonal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRasgoPersonal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRasgoPersonal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRasgoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRasgoPersonal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRasgoPersonal.setTitle("Orden");
			this.jInternalFrameOrderByTipoRasgoPersonal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRasgoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRasgoPersonal.setResizable(true);
			this.jInternalFrameOrderByTipoRasgoPersonal.setClosable(true);
			this.jInternalFrameOrderByTipoRasgoPersonal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rasgo Personales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRasgoPersonal.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRasgoPersonal.ipady =150;
				
			this.jPanelOrderByTipoRasgoPersonal.add(jScrollPanelDatosTipoRasgoPersonalOrderBy, this.gridBagConstraintsTipoRasgoPersonal);//this.jTableDatosTipoRasgoPersonalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRasgoPersonal = new JButtonMe();
			this.jButtonCerrarOrderByTipoRasgoPersonal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRasgoPersonal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRasgoPersonal.setToolTipText("Cancelar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRasgoPersonal.add(this.jButtonCerrarOrderByTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRasgoPersonal = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRasgoPersonal= new JScrollPane(jPanelOrderByTipoRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRasgoPersonal.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRasgoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRasgoPersonal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRasgoPersonal);
			
			this.jInternalFrameOrderByTipoRasgoPersonal.getContentPane().add(this.jScrollPanelOrderByTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
		
		} else {
			this.jButtonAbrirOrderByTipoRasgoPersonal = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporasgopersonalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRasgoPersonal.getRowHeight();//TipoRasgoPersonalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRasgoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal.isSelected()) {
					iHeightTable=TipoRasgoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRasgoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRasgoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRasgoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRasgoPersonal.isSelected()) {
					iHeightTable=TipoRasgoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRasgoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRasgoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRasgoPersonal!=null && this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRasgoPersonal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRasgoPersonal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRasgoPersonal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporasgopersonalLogic.getTipoRasgoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporasgopersonals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRasgoPersonal> TraerTipoRasgoPersonalBeans(List<TipoRasgoPersonal> tiporasgopersonals,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRasgoPersonal tiporasgopersonal:tiporasgopersonals) {
					
				if(!(TipoRasgoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRasgoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporasgopersonal.setsDetalleGeneralEntityReporte(TipoRasgoPersonalConstantesFunciones.getTipoRasgoPersonalDescripcion(tiporasgopersonal));
										
						
					
					

					if(tiporasgopersonal.getRasgoPersonals()!=null && Funciones.existeClass(classes,RasgoPersonal.class)) {
						try{tiporasgopersonal.setrasgopersonalsDescripcionReporte(new JRBeanCollectionDataSource(RasgoPersonalJInternalFrame.TraerRasgoPersonalBeans(tiporasgopersonal.getRasgoPersonals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiporasgopersonal.setsDetalleGeneralEntityReporte(tiporasgopersonal.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporasgopersonalbeans.add(tiporasgopersonalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporasgopersonals;
    }
	//PARA REPORTES FIN
}
