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
import com.bydan.erp.cartera.util.TipoRelaLaboConstantesFunciones;

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
public class TipoRelaLaboJInternalFrame extends TipoRelaLaboBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRelaLabo;
	
	protected JMenuBar jmenuBarTipoRelaLabo;
	
	protected JMenu jmenuTipoRelaLabo;
	protected JMenu jmenuDatosTipoRelaLabo;
	protected JMenu jmenuArchivoTipoRelaLabo;
	protected JMenu jmenuAccionesTipoRelaLabo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRelaLabo;	
	protected GridBagConstraints gridBagConstraintsTipoRelaLabo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRelaLaboDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRelaLabo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRelaLabo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRelaLabo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoRelaLaboSessionBean tiporelalaboSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRelaLabo> tiporelalabos;		
	public List<TipoRelaLabo> tiporelalabosEliminados;	
	public List<TipoRelaLabo> tiporelalabosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRelaLabo;		
	protected JButton jButtonAbrirOrderByTipoRelaLabo;
	
	
	//protected JPanel jPanelOrderByTipoRelaLabo;
	//public JScrollPane jScrollPanelOrderByTipoRelaLabo;	
	//protected JButton jButtonCerrarOrderByTipoRelaLabo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRelaLaboLogic tiporelalaboLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRelaLabo;
	public JScrollPane jScrollPanelDatosEdicionTipoRelaLabo;
	public JScrollPane jScrollPanelDatosGeneralTipoRelaLabo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRelaLaboOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRelaLabo;
	//public JScrollPane jScrollPanelImportacionTipoRelaLabo;
	
	
	
	protected JPanel jPanelAccionesTipoRelaLabo;
	
    protected JPanel jPanelPaginacionTipoRelaLabo;
    protected JPanel jPanelParametrosReportesTipoRelaLabo;
	protected JPanel jPanelParametrosReportesAccionesTipoRelaLabo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRelaLabo;
	protected JPanel jPanelParametrosAuxiliar2TipoRelaLabo;
	protected JPanel jPanelParametrosAuxiliar3TipoRelaLabo;
	protected JPanel jPanelParametrosAuxiliar4TipoRelaLabo;
	//protected JPanel jPanelParametrosAuxiliar5TipoRelaLabo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRelaLabo;
	//protected JPanel jPanelImportacionTipoRelaLabo;
	
	
	public JTable jTableDatosTipoRelaLabo;
	
	
	
	//public JTable jTableDatosTipoRelaLaboOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRelaLabo;
	protected JButton jButtonDuplicarTipoRelaLabo;
	protected JButton jButtonCopiarTipoRelaLabo;
	protected JButton jButtonVerFormTipoRelaLabo;
	protected JButton jButtonNuevoRelacionesTipoRelaLabo;
	protected JButton jButtonModificarTipoRelaLabo;
	
    protected JButton jButtonGuardarCambiosTablaTipoRelaLabo;
	protected JButton jButtonCerrarTipoRelaLabo;
	
	
	protected JButton jButtonRecargarInformacionTipoRelaLabo;
	protected JButton jButtonProcesarInformacionTipoRelaLabo;
	
	
	protected JButton jButtonAnterioresTipoRelaLabo;
	protected JButton jButtonSiguientesTipoRelaLabo;
	protected JButton jButtonNuevoGuardarCambiosTipoRelaLabo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRelaLabo;
	//protected JButton jButtonCerrarReporteDinamicoTipoRelaLabo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRelaLabo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRelaLabo;
	//protected JButton jButtonGenerarImportacionTipoRelaLabo;
	//protected JButton jButtonCerrarImportacionTipoRelaLabo;
	//protected JFileChooser jFileChooserImportacionTipoRelaLabo;
	//protected File fileImportacionTipoRelaLabo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRelaLabo;
	protected JButton jButtonDuplicarToolBarTipoRelaLabo;
	protected JButton jButtonNuevoRelacionesToolBarTipoRelaLabo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRelaLabo;
	protected JButton jButtonCopiarToolBarTipoRelaLabo;
	protected JButton jButtonVerFormToolBarTipoRelaLabo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRelaLabo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRelaLabo;
	protected JButton jButtonCerrarToolBarTipoRelaLabo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRelaLabo;
	protected JButton jButtonProcesarInformacionToolBarTipoRelaLabo;
	protected JButton jButtonAnterioresToolBarTipoRelaLabo;
	protected JButton jButtonSiguientesToolBarTipoRelaLabo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRelaLabo;
	protected JButton jButtonAbrirOrderByToolBarTipoRelaLabo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRelaLabo;
	protected JMenuItem jMenuItemDuplicarTipoRelaLabo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRelaLabo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRelaLabo;
	protected JMenuItem jMenuItemCopiarTipoRelaLabo;
	protected JMenuItem jMenuItemVerFormTipoRelaLabo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRelaLabo;
	protected JMenuItem jMenuItemCerrarTipoRelaLabo;
	protected JMenuItem jMenuItemDetalleCerrarTipoRelaLabo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRelaLabo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRelaLabo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRelaLabo;
	protected JMenuItem jMenuItemProcesarInformacionTipoRelaLabo;
	protected JMenuItem jMenuItemAnterioresTipoRelaLabo;
	protected JMenuItem jMenuItemSiguientesTipoRelaLabo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRelaLabo;
	protected JMenuItem jMenuItemAbrirOrderByTipoRelaLabo;
	protected JMenuItem jMenuItemMostrarOcultarTipoRelaLabo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRelaLabo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRelaLabo;
	protected JCheckBox jCheckBoxSeleccionadosTipoRelaLabo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRelaLabo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRelaLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRelaLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRelaLabo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRelaLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRelaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRelaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRelaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRelaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRelaLabo;
	protected JTextField jTextFieldValorCampoGeneralTipoRelaLabo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRelaLabo;
	//public JList<Reporte> jListColumnasSelectReporteTipoRelaLabo;
	//public JScrollPane jScrollColumnasSelectReporteTipoRelaLabo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRelaLabo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRelaLabo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRelaLabo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRelaLabo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRelaLabo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRelaLabo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRelaLabo;
	
		
	//public JLabel jLabelArchivoImportacionTipoRelaLabo;	
	//public JLabel jLabelPathArchivoImportacionTipoRelaLabo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRelaLabo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRelaLabo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRelaLabo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRelaLabo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRelaLabo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRelaLabo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRelaLabo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRelaLabo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRelaLabo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRelaLabo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRelaLabo;
	
	
	
	
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
	public TipoRelaLaboJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRelaLaboJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRelaLaboJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRelaLaboJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRelaLabo)	{
		this.jButtonRecargarInformacionTipoRelaLabo = jButtonRecargarInformacionTipoRelaLabo;
	}
	
	public JButton getjButtonProcesarInformacionTipoRelaLabo() {
		return this.jButtonProcesarInformacionTipoRelaLabo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRelaLabo)	{
		this.jButtonProcesarInformacionTipoRelaLabo = jButtonProcesarInformacionTipoRelaLabo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRelaLabo() {
		return this.jButtonRecargarInformacionTipoRelaLabo;
	}
	
	
	public List<TipoRelaLabo> gettiporelalabos() {
		return this.tiporelalabos;
	}

	public void settiporelalabos(List<TipoRelaLabo> tiporelalabos) {
		this.tiporelalabos = tiporelalabos;
	}
	
	public List<TipoRelaLabo> gettiporelalabosAux() {
		return this.tiporelalabosAux;
	}

	public void settiporelalabosAux(List<TipoRelaLabo> tiporelalabosAux) {
		this.tiporelalabosAux = tiporelalabosAux;
	}
	
	public List<TipoRelaLabo> gettiporelalabosEliminados() {
		return this.tiporelalabosEliminados;
	}

	public void setTipoRelaLabosEliminados(List<TipoRelaLabo> tiporelalabosEliminados) {
		this.tiporelalabosEliminados = tiporelalabosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRelaLabo() {
		return jComboBoxTiposSeleccionarTipoRelaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRelaLabo(
			JComboBox jComboBoxTiposSeleccionarTipoRelaLabo) {
		this.jComboBoxTiposSeleccionarTipoRelaLabo = jComboBoxTiposSeleccionarTipoRelaLabo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRelaLabo() {
		return jTextFieldValorCampoGeneralTipoRelaLabo;
	}

	public void setjTextFieldValorCampoGeneralTipoRelaLabo(
			JTextField jTextFieldValorCampoGeneralTipoRelaLabo) {
		this.jTextFieldValorCampoGeneralTipoRelaLabo = jTextFieldValorCampoGeneralTipoRelaLabo;
	}

	public void setBorderResaltarValorCampoGeneralTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRelaLabo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRelaLabo() {
		return this.jCheckBoxSeleccionarTodosTipoRelaLabo;
	}

	public void setjCheckBoxSeleccionarTodosTipoRelaLabo(
			JCheckBox jCheckBoxSeleccionarTodosTipoRelaLabo) {
		this.jCheckBoxSeleccionarTodosTipoRelaLabo = jCheckBoxSeleccionarTodosTipoRelaLabo;
	}

	public void setBorderResaltarSeleccionarTodosTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRelaLabo() {
		return this.jCheckBoxSeleccionadosTipoRelaLabo;
	}

	public void setjCheckBoxSeleccionadosTipoRelaLabo(
			JCheckBox jCheckBoxSeleccionadosTipoRelaLabo) {
		this.jCheckBoxSeleccionadosTipoRelaLabo = jCheckBoxSeleccionadosTipoRelaLabo;
	}
	
	public void setBorderResaltarSeleccionadosTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRelaLabo() {
		return this.jComboBoxTiposArchivosReportesTipoRelaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRelaLabo(
			JComboBox jComboBoxTiposArchivosReportesTipoRelaLabo) {
		this.jComboBoxTiposArchivosReportesTipoRelaLabo = jComboBoxTiposArchivosReportesTipoRelaLabo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRelaLabo() {
		return this.jComboBoxTiposReportesTipoRelaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRelaLabo(
			JComboBox jComboBoxTiposReportesTipoRelaLabo) {
		this.jComboBoxTiposReportesTipoRelaLabo = jComboBoxTiposReportesTipoRelaLabo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRelaLabo() {
	//	return jComboBoxTiposReportesDinamicoTipoRelaLabo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRelaLabo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRelaLabo) {
	//	this.jComboBoxTiposReportesDinamicoTipoRelaLabo = jComboBoxTiposReportesDinamicoTipoRelaLabo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRelaLabo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRelaLabo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo = jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo;
	//}
	
	public void setBorderResaltarTiposReportesTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRelaLabo() {
		return this.jComboBoxTiposGraficosReportesTipoRelaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRelaLabo(
			JComboBox jComboBoxTiposGraficosReportesTipoRelaLabo) {
		this.jComboBoxTiposGraficosReportesTipoRelaLabo = jComboBoxTiposGraficosReportesTipoRelaLabo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRelaLabo() {
		return this.jComboBoxTiposPaginacionTipoRelaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRelaLabo(
			JComboBox jComboBoxTiposPaginacionTipoRelaLabo) {
		this.jComboBoxTiposPaginacionTipoRelaLabo = jComboBoxTiposPaginacionTipoRelaLabo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRelaLabo() {
		return this.jComboBoxTiposRelacionesTipoRelaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRelaLabo() {
		return this.jComboBoxTiposAccionesTipoRelaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRelaLabo(
			JComboBox jComboBoxTiposRelacionesTipoRelaLabo) {
		this.jComboBoxTiposRelacionesTipoRelaLabo = jComboBoxTiposRelacionesTipoRelaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRelaLabo(
			JComboBox jComboBoxTiposAccionesTipoRelaLabo) {
		this.jComboBoxTiposAccionesTipoRelaLabo = jComboBoxTiposAccionesTipoRelaLabo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRelaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRelaLabo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRelaLabo() {
	//	return jCheckBoxConGraficoDinamicoTipoRelaLabo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRelaLabo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRelaLabo) {
	//	this.jCheckBoxConGraficoDinamicoTipoRelaLabo = jCheckBoxConGraficoDinamicoTipoRelaLabo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRelaLabo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRelaLabo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRelaLabo .setBorder(borderResaltar);		
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
		this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
		
		this.tiporelalaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporelalaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporelalaboSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRelaLaboJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRelaLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRelaLaboJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRelaLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRelaLaboJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Rela Labo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRelaLaboJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRelaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRelaLabo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"nuevo","nuevo","Nuevo"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"duplicar","duplicar","Duplicar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"copiar","copiar","Copiar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"ver_form","ver_form","Ver"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"recargar","recargar","Recargar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRelaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRelaLabo,this.jTtoolBarTipoRelaLabo,
							"cerrar","cerrar","Salir"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRelaLabo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRelaLabo;
			
				this.jButtonProcesarInformacionToolBarTipoRelaLabo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRelaLabo;
				
		//protected JButton jButtonModificarToolBarTipoRelaLabo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRelaLabo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRelaLabo=new JMenuMe("General");
		this.jmenuArchivoTipoRelaLabo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRelaLabo=new JMenuMe("Acciones");
		this.jmenuDatosTipoRelaLabo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRelaLabo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRelaLabo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRelaLabo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRelaLabo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRelaLabo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRelaLabo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRelaLabo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRelaLabo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRelaLabo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRelaLabo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRelaLabo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRelaLabo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRelaLabo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRelaLabo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRelaLabo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRelaLabo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRelaLabo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRelaLabo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRelaLabo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRelaLabo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRelaLabo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRelaLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRelaLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRelaLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRelaLabo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRelaLabo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRelaLabo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRelaLabo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRelaLabo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRelaLabo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRelaLabo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRelaLabo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRelaLabo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRelaLabo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRelaLabo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRelaLabo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRelaLabo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRelaLabo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRelaLabo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRelaLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRelaLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRelaLabo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRelaLabo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRelaLabo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRelaLabo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRelaLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRelaLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRelaLabo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRelaLabo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRelaLabo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRelaLabo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRelaLabo.add(this.jMenuItemCerrarTipoRelaLabo);
			
			this.jmenuAccionesTipoRelaLabo.add(this.jMenuItemNuevoTipoRelaLabo);
			this.jmenuAccionesTipoRelaLabo.add(this.jMenuItemNuevoGuardarCambiosTipoRelaLabo);
			this.jmenuAccionesTipoRelaLabo.add(this.jMenuItemNuevoRelacionesTipoRelaLabo);
			this.jmenuAccionesTipoRelaLabo.add(this.jMenuItemGuardarCambiosTablaTipoRelaLabo);		
			this.jmenuAccionesTipoRelaLabo.add(this.jMenuItemDuplicarTipoRelaLabo);		
			this.jmenuAccionesTipoRelaLabo.add(this.jMenuItemCopiarTipoRelaLabo);		
			this.jmenuAccionesTipoRelaLabo.add(this.jMenuItemVerFormTipoRelaLabo);		
			
			this.jmenuDatosTipoRelaLabo.add(this.jMenuItemRecargarInformacionTipoRelaLabo);				
			this.jmenuDatosTipoRelaLabo.add(this.jMenuItemAnterioresTipoRelaLabo);				
			this.jmenuDatosTipoRelaLabo.add(this.jMenuItemSiguientesTipoRelaLabo);				
			this.jmenuDatosTipoRelaLabo.add(this.jMenuItemAbrirOrderByTipoRelaLabo);				
			this.jmenuDatosTipoRelaLabo.add(this.jMenuItemMostrarOcultarTipoRelaLabo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRelaLabo.add(this.jMenuItemGuardarCambiosTipoRelaLabo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRelaLabo.add(this.jmenuArchivoTipoRelaLabo);		
			this.jmenuBarTipoRelaLabo.add(this.jmenuAccionesTipoRelaLabo);		
			this.jmenuBarTipoRelaLabo.add(this.jmenuDatosTipoRelaLabo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRelaLabo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRelaLabo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoRelaLabo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRelaLabo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRelaLabo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRelaLabo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRelaLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRelaLabo = new TipoRelaLaboDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Rela Labo DATOS");
			this.jInternalFrameDetalleFormTipoRelaLabo = new TipoRelaLaboDetalleFormJInternalFrame(jDesktopPane,this.tiporelalaboSessionBean.getConGuardarRelaciones(),this.tiporelalaboSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRelaLabo = null;//new TipoRelaLaboDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRelaLabo= new GridBagLayout();
		
		
		this.jTableDatosTipoRelaLabo = new JTableMe();      
		
		String sToolTipTipoRelaLabo="";
		sToolTipTipoRelaLabo=TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRelaLabo+="(Cartera.TipoRelaLabo)";
		}
		
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRelaLabo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRelaLabo.setToolTipText(sToolTipTipoRelaLabo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRelaLabo);
		this.jTableDatosTipoRelaLabo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRelaLabo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRelaLabo.setRowSelectionAllowed(true);
		this.jTableDatosTipoRelaLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRelaLabo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRelaLabo = new JButtonMe();
		this.jButtonDuplicarTipoRelaLabo = new JButtonMe();
		this.jButtonCopiarTipoRelaLabo = new JButtonMe();
		this.jButtonVerFormTipoRelaLabo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRelaLabo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRelaLabo = new JButtonMe();
		this.jButtonCerrarTipoRelaLabo = new JButtonMe();
		
		this.jScrollPanelDatosTipoRelaLabo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRelaLabo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Rela Labo";
		
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rela Labos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRelaLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRelaLabo.setToolTipText("Acciones");
        this.jPanelAccionesTipoRelaLabo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRelaLabo=new ReporteDinamicoJInternalFrame(TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRelaLabo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRelaLabo=new ImportacionJInternalFrame(TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRelaLabo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRelaLabo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRelaLabo.setText("Orden");
		this.jButtonAbrirOrderByTipoRelaLabo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRelaLabo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRelaLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRelaLabo,false,this);
			
			//this.cargarOrderByTipoRelaLabo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRelaLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRelaLabo,true,this);
			
			//this.cargarOrderByTipoRelaLabo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRelaLabo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRelaLabo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRelaLabo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoRelaLabo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRelaLabo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRelaLabo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRelaLabo.setText("Nuevo");
		this.jButtonDuplicarTipoRelaLabo.setText("Duplicar");
		this.jButtonCopiarTipoRelaLabo.setText("Copiar");
		this.jButtonVerFormTipoRelaLabo.setText("Ver");
		this.jButtonNuevoRelacionesTipoRelaLabo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRelaLabo.setText("Guardar");
		this.jButtonCerrarTipoRelaLabo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRelaLabo,"nuevo_button","Nuevo",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRelaLabo,"duplicar_button","Duplicar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRelaLabo,"copiar_button","Copiar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRelaLabo,"ver_form","Ver",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRelaLabo,"nuevorelaciones_button","Nuevo Rel",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRelaLabo,"guardarcambiostabla_button","Guardar",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRelaLabo,"cerrar_button","Salir",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRelaLabo.setToolTipText("Nuevo"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRelaLabo.setToolTipText("Duplicar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRelaLabo.setToolTipText("Copiar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRelaLabo.setToolTipText("Ver"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRelaLabo.setToolTipText("Nuevo Rel"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRelaLabo.setToolTipText("Guardar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRelaLabo.setToolTipText("Salir"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRelaLabo";
		inputMap = this.jButtonNuevoTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRelaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRelaLabo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRelaLabo";
		inputMap = this.jButtonDuplicarTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRelaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRelaLabo"));
		
		//COPIAR
		sMapKey = "CopiarTipoRelaLabo";
		inputMap = this.jButtonCopiarTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRelaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRelaLabo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRelaLabo";
		inputMap = this.jButtonVerFormTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRelaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRelaLabo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRelaLabo";
		inputMap = this.jButtonNuevoRelacionesTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRelaLabo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRelaLabo";
		inputMap = this.jButtonModificarTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRelaLabo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRelaLabo";
		inputMap = this.jButtonCerrarTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRelaLabo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRelaLabo";
		inputMap = this.jButtonGuardarCambiosTablaTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRelaLabo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRelaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRelaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRelaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRelaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRelaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRelaLabo.setName("jPanelParametrosReportesTipoRelaLabo"); 
		
		this.jPanelParametrosReportesAccionesTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRelaLabo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRelaLabo.setName("jPanelParametrosReportesAccionesTipoRelaLabo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRelaLabo = new JButtonMe();
		this.jButtonRecargarInformacionTipoRelaLabo.setText("Recargar");
		this.jButtonRecargarInformacionTipoRelaLabo.setToolTipText("Recargar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRelaLabo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRelaLabo = new JButtonMe();
		this.jButtonProcesarInformacionTipoRelaLabo.setText("Procesar");
		this.jButtonProcesarInformacionTipoRelaLabo.setToolTipText("Procesar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRelaLabo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRelaLabo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRelaLabo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRelaLabo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRelaLabo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRelaLabo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRelaLabo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRelaLabo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRelaLabo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRelaLabo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRelaLabo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRelaLabo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRelaLabo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRelaLabo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRelaLabo.setText("Accion");
		this.jComboBoxTiposAccionesTipoRelaLabo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRelaLabo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRelaLabo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRelaLabo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRelaLabo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRelaLabo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRelaLabo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRelaLabo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRelaLabo = new JLabelMe();
		
		this.jLabelAccionesTipoRelaLabo.setText("Acciones");		
		this.jLabelAccionesTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRelaLabo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRelaLabo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRelaLabo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRelaLabo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRelaLabo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRelaLabo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRelaLabo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRelaLabo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRelaLabo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRelaLabo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRelaLabo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRelaLabo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRelaLabo = new JButtonMe();
		//this.jButtonAnterioresTipoRelaLabo.setText("<<");
        this.jButtonAnterioresTipoRelaLabo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRelaLabo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRelaLabo = new JButtonMe();
		//this.jButtonSiguientesTipoRelaLabo.setText(">>");
        this.jButtonSiguientesTipoRelaLabo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRelaLabo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRelaLabo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRelaLabo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRelaLabo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRelaLabo,"nuevoguardarcambios_button","Nue",this.tiporelalaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRelaLabo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRelaLabo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRelaLabo";
		inputMap = this.jButtonRecargarInformacionTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRelaLabo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRelaLabo";
		inputMap = this.jButtonSiguientesTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRelaLabo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRelaLabo";
		inputMap = this.jButtonAnterioresTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRelaLabo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRelaLabo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRelaLabo.setMinimumSize(new Dimension(this.getWidth(),TipoRelaLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRelaLaboBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRelaLabo.setMaximumSize(new Dimension(this.getWidth(),TipoRelaLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRelaLaboBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRelaLabo.setPreferredSize(new Dimension(this.getWidth(),TipoRelaLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRelaLaboBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRelaLabo = new GridBagLayout();

			this.jPanelPaginacionTipoRelaLabo.setLayout(gridaBagLayoutPaginacionTipoRelaLabo);						
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = 0;
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRelaLabo.add(this.jButtonAnterioresTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
					
						
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRelaLabo.gridy = 0;
			
			this.jPanelPaginacionTipoRelaLabo.add(this.jButtonNuevoGuardarCambiosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
						
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRelaLabo.gridy = 0;
			this.jPanelPaginacionTipoRelaLabo.add(this.jButtonSiguientesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = 1;
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRelaLabo.add(this.jButtonNuevoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRelaLabo.gridy = 1;
				this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoRelaLabo.add(this.jButtonNuevoRelacionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			}
			
			
			if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRelaLabo.gridy = 1;
				this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRelaLabo.add(this.jButtonGuardarCambiosTablaTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			}
			
			
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = 1;
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRelaLabo.add(this.jButtonDuplicarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = 1;
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRelaLabo.add(this.jButtonCopiarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = 1;
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRelaLabo.add(this.jButtonVerFormTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = 1;
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRelaLabo.add(this.jButtonCerrarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
		
		
		this.jButtonRecargarInformacionTipoRelaLabo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRelaLabo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRelaLabo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRelaLabo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRelaLabo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRelaLabo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRelaLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRelaLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRelaLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRelaLabo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRelaLabo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRelaLabo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRelaLabo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRelaLabo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRelaLabo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRelaLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRelaLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRelaLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRelaLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRelaLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRelaLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRelaLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRelaLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRelaLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRelaLabo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRelaLabo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRelaLabo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRelaLabo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRelaLabo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRelaLabo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRelaLabo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRelaLabo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRelaLabo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRelaLabo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRelaLabo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRelaLabo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRelaLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRelaLabo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRelaLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRelaLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRelaLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRelaLabo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRelaLabo.setLayout(gridaBagParametrosReportesTipoRelaLabo);
			this.jPanelParametrosReportesAccionesTipoRelaLabo.setLayout(gridaBagParametrosReportesAccionesTipoRelaLabo);
			
			
			this.jPanelParametrosAuxiliar1TipoRelaLabo.setLayout(gridaBagParametrosAuxiliar1TipoRelaLabo);
			this.jPanelParametrosAuxiliar2TipoRelaLabo.setLayout(gridaBagParametrosAuxiliar2TipoRelaLabo);
			this.jPanelParametrosAuxiliar3TipoRelaLabo.setLayout(gridaBagParametrosAuxiliar3TipoRelaLabo);
			this.jPanelParametrosAuxiliar4TipoRelaLabo.setLayout(gridaBagParametrosAuxiliar4TipoRelaLabo);
			//this.jPanelParametrosAuxiliar5TipoRelaLabo.setLayout(gridaBagParametrosAuxiliar2TipoRelaLabo);			
			
			
			
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jButtonRecargarInformacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRelaLabo.add(this.jComboBoxTiposPaginacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRelaLabo.add(this.jCheckBoxConAltoMaximoTablaTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRelaLabo.add(this.jComboBoxTiposArchivosReportesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jPanelParametrosAuxiliar1TipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRelaLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRelaLabo.add(this.jComboBoxTiposReportesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jPanelParametrosAuxiliar4TipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jComboBoxTiposReportesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jCheckBoxGenerarReporteTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jPanelParametrosAuxiliar2TipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRelaLabo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jLabelAccionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRelaLabo.add(this.jButtonAbrirOrderByTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jComboBoxTiposSeleccionarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
			
			
			/*
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRelaLabo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jCheckBoxSeleccionarTodosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRelaLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRelaLabo.add(this.jCheckBoxSeleccionarTodosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);															
				
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRelaLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRelaLabo.add(this.jCheckBoxSeleccionadosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jPanelParametrosAuxiliar3TipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jComboBoxTiposRelacionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
				
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jComboBoxTiposAccionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
	
				
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRelaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRelaLabo.add(this.jTextFieldValorCampoGeneralTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRelaLabo = new GridBagLayout();

			this.jScrollPanelDatosTipoRelaLabo.setLayout(gridaBagLayoutDatosTipoRelaLabo);
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = 0;
			this.gridBagConstraintsTipoRelaLabo.gridx = 0;
			
			this.jScrollPanelDatosTipoRelaLabo.add(this.jTableDatosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRelaLabo.setViewportView(this.jTableDatosTipoRelaLabo);
		this.jTableDatosTipoRelaLabo.setFillsViewportHeight(true);
		this.jTableDatosTipoRelaLabo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRelaLabo= new GridBagLayout();
		this.jPanelAccionesTipoRelaLabo.setLayout(gridaBagLayoutAccionesTipoRelaLabo);
		
		
		/*	
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = 0;
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;
			
		this.jPanelAccionesTipoRelaLabo.add(this.jButtonNuevoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRelaLabo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRelaLabo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();						
			this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRelaLabo.gridx = 0;		
			//this.gridBagConstraintsTipoRelaLabo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRelaLabo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;		
		//this.gridBagConstraintsTipoRelaLabo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRelaLabo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRelaLabo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);								
		
		
		/*
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		*/		
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRelaLabo.gridx =0;
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRelaLabo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
				
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRelaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRelaLabo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRelaLabo.setLayout(gridaBagLayoutBusquedasParametrosTipoRelaLabo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRelaLabo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRelaLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRelaLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRelaLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
			
			
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
			
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRelaLabo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRelaLabo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRelaLabo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRelaLabo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRelaLabo.setName("jPanelReporteDinamicoTipoRelaLabo"); 
		
		this.jPanelReporteDinamicoTipoRelaLabo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRelaLabo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRelaLabo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRelaLabo.setLayout(gridaBagLayoutReporteDinamicoTipoRelaLabo);
		
		
		this.jInternalFrameReporteDinamicoTipoRelaLabo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRelaLabo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRelaLabo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRelaLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRelaLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRelaLabo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRelaLabo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRelaLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRelaLabo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRelaLabo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRelaLabo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRelaLabo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRelaLabo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRelaLabo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rela Labos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRelaLabo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRelaLabo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jLabelColumnasSelectReporteTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRelaLabo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRelaLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRelaLabo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRelaLabo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRelaLabo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRelaLabo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRelaLabo=new JScrollPane(this.jListColumnasSelectReporteTipoRelaLabo);
			
			this.jScrollColumnasSelectReporteTipoRelaLabo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRelaLabo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRelaLabo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRelaLabo.add(this.jListColumnasSelectReporteTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jScrollColumnasSelectReporteTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRelaLabo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRelaLabo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jLabelRelacionesSelectReporteTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRelaLabo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRelaLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRelaLabo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRelaLabo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRelaLabo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRelaLabo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRelaLabo=new JScrollPane(this.jListRelacionesSelectReporteTipoRelaLabo);
			
			this.jScrollRelacionesSelectReporteTipoRelaLabo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRelaLabo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRelaLabo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRelaLabo.add(this.jListRelacionesSelectReporteTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jScrollRelacionesSelectReporteTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoRelaLabo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRelaLabo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRelaLabo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRelaLabo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRelaLabo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRelaLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRelaLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRelaLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRelaLabo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRelaLabo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jLabelGenerarExcelReporteDinamicoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRelaLabo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRelaLabo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRelaLabo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRelaLabo.setToolTipText("Generar EXCEL"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRelaLabo.add(this.jButtonGenerarExcelReporteDinamicoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jComboBoxTiposReportesDinamicoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRelaLabo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRelaLabo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jLabelTiposArchivoReporteDinamicoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRelaLabo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRelaLabo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRelaLabo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRelaLabo.setToolTipText("Generar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jButtonGenerarReporteDinamicoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRelaLabo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRelaLabo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRelaLabo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRelaLabo.setToolTipText("Cancelar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRelaLabo.add(this.jButtonCerrarReporteDinamicoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRelaLabo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRelaLabo= new JScrollPane(jPanelReporteDinamicoTipoRelaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRelaLabo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRelaLabo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRelaLabo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rela Labos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRelaLabo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRelaLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRelaLabo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRelaLabo);
		this.jInternalFrameReporteDinamicoTipoRelaLabo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRelaLabo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRelaLabo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRelaLabo.setName("jPanelImportacionTipoRelaLabo"); 
		
		this.jPanelImportacionTipoRelaLabo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRelaLabo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRelaLabo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRelaLabo.setLayout(gridaBagLayoutImportacionTipoRelaLabo);
		
		
		this.jInternalFrameImportacionTipoRelaLabo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRelaLabo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRelaLabo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRelaLabo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRelaLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRelaLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRelaLabo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRelaLabo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRelaLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRelaLabo.setResizable(true);
	    this.jInternalFrameImportacionTipoRelaLabo.setClosable(true);
	    this.jInternalFrameImportacionTipoRelaLabo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRelaLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRelaLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRelaLabo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRelaLabo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRelaLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRelaLabo.setResizable(true);
	    this.jInternalFrameImportacionTipoRelaLabo.setClosable(true);
	    this.jInternalFrameImportacionTipoRelaLabo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRelaLabo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRelaLabo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRelaLabo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rela Labos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRelaLabo = new JLabelMe();

		this.jLabelArchivoImportacionTipoRelaLabo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRelaLabo.add(this.jLabelArchivoImportacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRelaLabo = new JFileChooser();		
		this.jFileChooserImportacionTipoRelaLabo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRelaLabo = new JButtonMe();
		this.jButtonAbrirImportacionTipoRelaLabo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRelaLabo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRelaLabo.setToolTipText("Generar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRelaLabo.add(this.jButtonAbrirImportacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRelaLabo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRelaLabo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRelaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRelaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRelaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRelaLabo.add(this.jLabelPathArchivoImportacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRelaLabo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRelaLabo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRelaLabo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRelaLabo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRelaLabo.add(this.jTextFieldPathArchivoImportacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRelaLabo = new JButtonMe();
		this.jButtonGenerarImportacionTipoRelaLabo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRelaLabo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRelaLabo.setToolTipText("Generar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRelaLabo.add(this.jButtonGenerarImportacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRelaLabo = new JButtonMe();
		this.jButtonCerrarImportacionTipoRelaLabo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRelaLabo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRelaLabo.setToolTipText("Cancelar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRelaLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRelaLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRelaLabo.add(this.jButtonCerrarImportacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRelaLabo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRelaLabo= new JScrollPane(jPanelImportacionTipoRelaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoRelaLabo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRelaLabo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRelaLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRelaLabo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRelaLabo);
		this.jInternalFrameImportacionTipoRelaLabo.getContentPane().add(this.jScrollPanelImportacionTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRelaLabo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRelaLabo = new JButtonMe();
			this.jButtonAbrirOrderByTipoRelaLabo.setText("Orden");
			this.jButtonAbrirOrderByTipoRelaLabo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRelaLabo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRelaLabo";
			inputMap = this.jButtonAbrirOrderByTipoRelaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRelaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRelaLabo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRelaLabo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRelaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRelaLabo.setName("jPanelOrderByTipoRelaLabo"); 
			
			this.jPanelOrderByTipoRelaLabo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRelaLabo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRelaLabo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRelaLabo.setLayout(gridaBagLayoutOrderByTipoRelaLabo);
			
			
			this.jTableDatosTipoRelaLaboOrderBy = new JTableMe();        
			this.jTableDatosTipoRelaLaboOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRelaLaboOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRelaLaboOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRelaLaboOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRelaLaboOrderBy.setViewportView(this.jTableDatosTipoRelaLaboOrderBy);
			this.jTableDatosTipoRelaLaboOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRelaLaboOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRelaLabo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRelaLabo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRelaLabo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRelaLabo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRelaLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRelaLabo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRelaLabo.setTitle("Orden");
			this.jInternalFrameOrderByTipoRelaLabo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRelaLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRelaLabo.setResizable(true);
			this.jInternalFrameOrderByTipoRelaLabo.setClosable(true);
			this.jInternalFrameOrderByTipoRelaLabo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRelaLabo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRelaLabo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRelaLabo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRelaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rela Labos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRelaLabo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRelaLabo.ipady =150;
				
			this.jPanelOrderByTipoRelaLabo.add(jScrollPanelDatosTipoRelaLaboOrderBy, this.gridBagConstraintsTipoRelaLabo);//this.jTableDatosTipoRelaLaboTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRelaLabo = new JButtonMe();
			this.jButtonCerrarOrderByTipoRelaLabo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRelaLabo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRelaLabo.setToolTipText("Cancelar"+" "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRelaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRelaLabo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRelaLabo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRelaLabo.add(this.jButtonCerrarOrderByTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRelaLabo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRelaLabo= new JScrollPane(jPanelOrderByTipoRelaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRelaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoRelaLabo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRelaLabo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRelaLabo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRelaLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRelaLabo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRelaLabo);
			
			this.jInternalFrameOrderByTipoRelaLabo.getContentPane().add(this.jScrollPanelOrderByTipoRelaLabo, this.gridBagConstraintsTipoRelaLabo);			
		
		} else {
			this.jButtonAbrirOrderByTipoRelaLabo = new JButtonMe();
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
			&& this.tiporelalaboSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRelaLabo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRelaLabo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRelaLabo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRelaLabo.getRowHeight();//TipoRelaLaboConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRelaLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRelaLabo.isSelected()) {
					iHeightTable=TipoRelaLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRelaLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRelaLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRelaLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRelaLabo.isSelected()) {
					iHeightTable=TipoRelaLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRelaLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRelaLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRelaLabo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRelaLabo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRelaLabo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRelaLabo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRelaLabo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRelaLabo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRelaLabo!=null && this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRelaLabo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRelaLabo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRelaLabo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRelaLabo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRelaLabo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRelaLabo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporelalaboLogic.getTipoRelaLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporelalabos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRelaLabo> TraerTipoRelaLaboBeans(List<TipoRelaLabo> tiporelalabos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRelaLabo tiporelalabo:tiporelalabos) {
					
				if(!(TipoRelaLaboConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRelaLaboConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporelalabo.setsDetalleGeneralEntityReporte(TipoRelaLaboConstantesFunciones.getTipoRelaLaboDescripcion(tiporelalabo));
										
						
					
					

					if(tiporelalabo.getInformacionLaborals()!=null && Funciones.existeClass(classes,InformacionLaboral.class)) {
						try{tiporelalabo.setinformacionlaboralsDescripcionReporte(new JRBeanCollectionDataSource(InformacionLaboralJInternalFrame.TraerInformacionLaboralBeans(tiporelalabo.getInformacionLaborals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiporelalabo.setsDetalleGeneralEntityReporte(tiporelalabo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporelalabobeans.add(tiporelalabobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporelalabos;
    }
	//PARA REPORTES FIN
}
