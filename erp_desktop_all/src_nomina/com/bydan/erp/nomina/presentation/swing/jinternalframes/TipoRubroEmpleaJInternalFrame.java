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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.TipoRubroEmpleaConstantesFunciones;

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
public class TipoRubroEmpleaJInternalFrame extends TipoRubroEmpleaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRubroEmplea;
	
	protected JMenuBar jmenuBarTipoRubroEmplea;
	
	protected JMenu jmenuTipoRubroEmplea;
	protected JMenu jmenuDatosTipoRubroEmplea;
	protected JMenu jmenuArchivoTipoRubroEmplea;
	protected JMenu jmenuAccionesTipoRubroEmplea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRubroEmplea;	
	protected GridBagConstraints gridBagConstraintsTipoRubroEmplea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRubroEmpleaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRubroEmplea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRubroEmplea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRubroEmplea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRubroEmpleaSessionBean tiporubroempleaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRubroEmplea> tiporubroempleas;		
	public List<TipoRubroEmplea> tiporubroempleasEliminados;	
	public List<TipoRubroEmplea> tiporubroempleasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRubroEmplea;		
	protected JButton jButtonAbrirOrderByTipoRubroEmplea;
	
	
	//protected JPanel jPanelOrderByTipoRubroEmplea;
	//public JScrollPane jScrollPanelOrderByTipoRubroEmplea;	
	//protected JButton jButtonCerrarOrderByTipoRubroEmplea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRubroEmpleaLogic tiporubroempleaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRubroEmplea;
	public JScrollPane jScrollPanelDatosEdicionTipoRubroEmplea;
	public JScrollPane jScrollPanelDatosGeneralTipoRubroEmplea;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRubroEmpleaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRubroEmplea;
	//public JScrollPane jScrollPanelImportacionTipoRubroEmplea;
	
	
	
	protected JPanel jPanelAccionesTipoRubroEmplea;
	
    protected JPanel jPanelPaginacionTipoRubroEmplea;
    protected JPanel jPanelParametrosReportesTipoRubroEmplea;
	protected JPanel jPanelParametrosReportesAccionesTipoRubroEmplea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRubroEmplea;
	protected JPanel jPanelParametrosAuxiliar2TipoRubroEmplea;
	protected JPanel jPanelParametrosAuxiliar3TipoRubroEmplea;
	protected JPanel jPanelParametrosAuxiliar4TipoRubroEmplea;
	//protected JPanel jPanelParametrosAuxiliar5TipoRubroEmplea;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRubroEmplea;
	//protected JPanel jPanelImportacionTipoRubroEmplea;
	
	
	public JTable jTableDatosTipoRubroEmplea;
	
	
	
	//public JTable jTableDatosTipoRubroEmpleaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRubroEmplea;
	protected JButton jButtonDuplicarTipoRubroEmplea;
	protected JButton jButtonCopiarTipoRubroEmplea;
	protected JButton jButtonVerFormTipoRubroEmplea;
	protected JButton jButtonNuevoRelacionesTipoRubroEmplea;
	protected JButton jButtonModificarTipoRubroEmplea;
	
    protected JButton jButtonGuardarCambiosTablaTipoRubroEmplea;
	protected JButton jButtonCerrarTipoRubroEmplea;
	
	
	protected JButton jButtonRecargarInformacionTipoRubroEmplea;
	protected JButton jButtonProcesarInformacionTipoRubroEmplea;
	
	
	protected JButton jButtonAnterioresTipoRubroEmplea;
	protected JButton jButtonSiguientesTipoRubroEmplea;
	protected JButton jButtonNuevoGuardarCambiosTipoRubroEmplea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRubroEmplea;
	//protected JButton jButtonCerrarReporteDinamicoTipoRubroEmplea;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRubroEmplea;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRubroEmplea;
	//protected JButton jButtonGenerarImportacionTipoRubroEmplea;
	//protected JButton jButtonCerrarImportacionTipoRubroEmplea;
	//protected JFileChooser jFileChooserImportacionTipoRubroEmplea;
	//protected File fileImportacionTipoRubroEmplea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRubroEmplea;
	protected JButton jButtonDuplicarToolBarTipoRubroEmplea;
	protected JButton jButtonNuevoRelacionesToolBarTipoRubroEmplea;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRubroEmplea;
	protected JButton jButtonCopiarToolBarTipoRubroEmplea;
	protected JButton jButtonVerFormToolBarTipoRubroEmplea;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRubroEmplea;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRubroEmplea;
	protected JButton jButtonCerrarToolBarTipoRubroEmplea;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRubroEmplea;
	protected JButton jButtonProcesarInformacionToolBarTipoRubroEmplea;
	protected JButton jButtonAnterioresToolBarTipoRubroEmplea;
	protected JButton jButtonSiguientesToolBarTipoRubroEmplea;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRubroEmplea;
	protected JButton jButtonAbrirOrderByToolBarTipoRubroEmplea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRubroEmplea;
	protected JMenuItem jMenuItemDuplicarTipoRubroEmplea;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRubroEmplea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRubroEmplea;
	protected JMenuItem jMenuItemCopiarTipoRubroEmplea;
	protected JMenuItem jMenuItemVerFormTipoRubroEmplea;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRubroEmplea;
	protected JMenuItem jMenuItemCerrarTipoRubroEmplea;
	protected JMenuItem jMenuItemDetalleCerrarTipoRubroEmplea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRubroEmplea;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRubroEmplea;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRubroEmplea;
	protected JMenuItem jMenuItemProcesarInformacionTipoRubroEmplea;
	protected JMenuItem jMenuItemAnterioresTipoRubroEmplea;
	protected JMenuItem jMenuItemSiguientesTipoRubroEmplea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRubroEmplea;
	protected JMenuItem jMenuItemAbrirOrderByTipoRubroEmplea;
	protected JMenuItem jMenuItemMostrarOcultarTipoRubroEmplea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRubroEmplea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRubroEmplea;
	protected JCheckBox jCheckBoxSeleccionadosTipoRubroEmplea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRubroEmplea;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRubroEmplea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRubroEmplea;
	protected JTextField jTextFieldValorCampoGeneralTipoRubroEmplea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRubroEmplea;
	//public JList<Reporte> jListColumnasSelectReporteTipoRubroEmplea;
	//public JScrollPane jScrollColumnasSelectReporteTipoRubroEmplea;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRubroEmplea;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRubroEmplea;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRubroEmplea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRubroEmplea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRubroEmplea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRubroEmplea;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRubroEmplea;
	
		
	//public JLabel jLabelArchivoImportacionTipoRubroEmplea;	
	//public JLabel jLabelPathArchivoImportacionTipoRubroEmplea;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRubroEmplea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRubroEmplea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRubroEmplea;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRubroEmplea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRubroEmplea;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRubroEmplea;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRubroEmplea;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRubroEmplea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRubroEmplea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRubroEmplea;	
	
	
	
	
	
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
	public TipoRubroEmpleaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRubroEmpleaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRubroEmpleaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRubroEmpleaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRubroEmplea)	{
		this.jButtonRecargarInformacionTipoRubroEmplea = jButtonRecargarInformacionTipoRubroEmplea;
	}
	
	public JButton getjButtonProcesarInformacionTipoRubroEmplea() {
		return this.jButtonProcesarInformacionTipoRubroEmplea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRubroEmplea)	{
		this.jButtonProcesarInformacionTipoRubroEmplea = jButtonProcesarInformacionTipoRubroEmplea;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRubroEmplea() {
		return this.jButtonRecargarInformacionTipoRubroEmplea;
	}
	
	
	public List<TipoRubroEmplea> gettiporubroempleas() {
		return this.tiporubroempleas;
	}

	public void settiporubroempleas(List<TipoRubroEmplea> tiporubroempleas) {
		this.tiporubroempleas = tiporubroempleas;
	}
	
	public List<TipoRubroEmplea> gettiporubroempleasAux() {
		return this.tiporubroempleasAux;
	}

	public void settiporubroempleasAux(List<TipoRubroEmplea> tiporubroempleasAux) {
		this.tiporubroempleasAux = tiporubroempleasAux;
	}
	
	public List<TipoRubroEmplea> gettiporubroempleasEliminados() {
		return this.tiporubroempleasEliminados;
	}

	public void setTipoRubroEmpleasEliminados(List<TipoRubroEmplea> tiporubroempleasEliminados) {
		this.tiporubroempleasEliminados = tiporubroempleasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRubroEmplea() {
		return jComboBoxTiposSeleccionarTipoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRubroEmplea(
			JComboBox jComboBoxTiposSeleccionarTipoRubroEmplea) {
		this.jComboBoxTiposSeleccionarTipoRubroEmplea = jComboBoxTiposSeleccionarTipoRubroEmplea;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRubroEmplea() {
		return jTextFieldValorCampoGeneralTipoRubroEmplea;
	}

	public void setjTextFieldValorCampoGeneralTipoRubroEmplea(
			JTextField jTextFieldValorCampoGeneralTipoRubroEmplea) {
		this.jTextFieldValorCampoGeneralTipoRubroEmplea = jTextFieldValorCampoGeneralTipoRubroEmplea;
	}

	public void setBorderResaltarValorCampoGeneralTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRubroEmplea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRubroEmplea() {
		return this.jCheckBoxSeleccionarTodosTipoRubroEmplea;
	}

	public void setjCheckBoxSeleccionarTodosTipoRubroEmplea(
			JCheckBox jCheckBoxSeleccionarTodosTipoRubroEmplea) {
		this.jCheckBoxSeleccionarTodosTipoRubroEmplea = jCheckBoxSeleccionarTodosTipoRubroEmplea;
	}

	public void setBorderResaltarSeleccionarTodosTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRubroEmplea() {
		return this.jCheckBoxSeleccionadosTipoRubroEmplea;
	}

	public void setjCheckBoxSeleccionadosTipoRubroEmplea(
			JCheckBox jCheckBoxSeleccionadosTipoRubroEmplea) {
		this.jCheckBoxSeleccionadosTipoRubroEmplea = jCheckBoxSeleccionadosTipoRubroEmplea;
	}
	
	public void setBorderResaltarSeleccionadosTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRubroEmplea() {
		return this.jComboBoxTiposArchivosReportesTipoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRubroEmplea(
			JComboBox jComboBoxTiposArchivosReportesTipoRubroEmplea) {
		this.jComboBoxTiposArchivosReportesTipoRubroEmplea = jComboBoxTiposArchivosReportesTipoRubroEmplea;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRubroEmplea() {
		return this.jComboBoxTiposReportesTipoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRubroEmplea(
			JComboBox jComboBoxTiposReportesTipoRubroEmplea) {
		this.jComboBoxTiposReportesTipoRubroEmplea = jComboBoxTiposReportesTipoRubroEmplea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRubroEmplea() {
	//	return jComboBoxTiposReportesDinamicoTipoRubroEmplea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRubroEmplea(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRubroEmplea) {
	//	this.jComboBoxTiposReportesDinamicoTipoRubroEmplea = jComboBoxTiposReportesDinamicoTipoRubroEmplea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea = jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea;
	//}
	
	public void setBorderResaltarTiposReportesTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRubroEmplea() {
		return this.jComboBoxTiposGraficosReportesTipoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRubroEmplea(
			JComboBox jComboBoxTiposGraficosReportesTipoRubroEmplea) {
		this.jComboBoxTiposGraficosReportesTipoRubroEmplea = jComboBoxTiposGraficosReportesTipoRubroEmplea;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRubroEmplea() {
		return this.jComboBoxTiposPaginacionTipoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRubroEmplea(
			JComboBox jComboBoxTiposPaginacionTipoRubroEmplea) {
		this.jComboBoxTiposPaginacionTipoRubroEmplea = jComboBoxTiposPaginacionTipoRubroEmplea;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRubroEmplea() {
		return this.jComboBoxTiposRelacionesTipoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRubroEmplea() {
		return this.jComboBoxTiposAccionesTipoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRubroEmplea(
			JComboBox jComboBoxTiposRelacionesTipoRubroEmplea) {
		this.jComboBoxTiposRelacionesTipoRubroEmplea = jComboBoxTiposRelacionesTipoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRubroEmplea(
			JComboBox jComboBoxTiposAccionesTipoRubroEmplea) {
		this.jComboBoxTiposAccionesTipoRubroEmplea = jComboBoxTiposAccionesTipoRubroEmplea;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRubroEmplea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRubroEmplea() {
	//	return jCheckBoxConGraficoDinamicoTipoRubroEmplea;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRubroEmplea(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRubroEmplea) {
	//	this.jCheckBoxConGraficoDinamicoTipoRubroEmplea = jCheckBoxConGraficoDinamicoTipoRubroEmplea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRubroEmplea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRubroEmplea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRubroEmplea .setBorder(borderResaltar);		
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
		this.tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
		
		this.tiporubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporubroempleaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRubroEmpleaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Rubro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRubroEmplea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"nuevo","nuevo","Nuevo"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"duplicar","duplicar","Duplicar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"copiar","copiar","Copiar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"ver_form","ver_form","Ver"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"recargar","recargar","Recargar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,
							"cerrar","cerrar","Salir"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRubroEmplea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRubroEmplea;
			
				this.jButtonProcesarInformacionToolBarTipoRubroEmplea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRubroEmplea;
				
		//protected JButton jButtonModificarToolBarTipoRubroEmplea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRubroEmplea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRubroEmplea=new JMenuMe("General");
		this.jmenuArchivoTipoRubroEmplea=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRubroEmplea=new JMenuMe("Acciones");
		this.jmenuDatosTipoRubroEmplea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRubroEmplea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRubroEmplea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRubroEmplea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRubroEmplea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRubroEmplea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRubroEmplea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRubroEmplea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRubroEmplea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRubroEmplea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRubroEmplea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRubroEmplea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRubroEmplea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRubroEmplea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRubroEmplea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRubroEmplea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRubroEmplea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRubroEmplea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRubroEmplea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRubroEmplea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRubroEmplea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRubroEmplea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRubroEmplea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRubroEmplea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRubroEmplea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRubroEmplea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRubroEmplea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRubroEmplea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRubroEmplea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRubroEmplea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRubroEmplea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRubroEmplea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRubroEmplea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRubroEmplea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRubroEmplea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRubroEmplea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRubroEmplea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRubroEmplea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRubroEmplea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRubroEmplea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRubroEmplea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRubroEmplea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRubroEmplea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRubroEmplea.add(this.jMenuItemCerrarTipoRubroEmplea);
			
			this.jmenuAccionesTipoRubroEmplea.add(this.jMenuItemNuevoTipoRubroEmplea);
			this.jmenuAccionesTipoRubroEmplea.add(this.jMenuItemNuevoGuardarCambiosTipoRubroEmplea);
			this.jmenuAccionesTipoRubroEmplea.add(this.jMenuItemNuevoRelacionesTipoRubroEmplea);
			this.jmenuAccionesTipoRubroEmplea.add(this.jMenuItemGuardarCambiosTablaTipoRubroEmplea);		
			this.jmenuAccionesTipoRubroEmplea.add(this.jMenuItemDuplicarTipoRubroEmplea);		
			this.jmenuAccionesTipoRubroEmplea.add(this.jMenuItemCopiarTipoRubroEmplea);		
			this.jmenuAccionesTipoRubroEmplea.add(this.jMenuItemVerFormTipoRubroEmplea);		
			
			this.jmenuDatosTipoRubroEmplea.add(this.jMenuItemRecargarInformacionTipoRubroEmplea);				
			this.jmenuDatosTipoRubroEmplea.add(this.jMenuItemAnterioresTipoRubroEmplea);				
			this.jmenuDatosTipoRubroEmplea.add(this.jMenuItemSiguientesTipoRubroEmplea);				
			this.jmenuDatosTipoRubroEmplea.add(this.jMenuItemAbrirOrderByTipoRubroEmplea);				
			this.jmenuDatosTipoRubroEmplea.add(this.jMenuItemMostrarOcultarTipoRubroEmplea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRubroEmplea.add(this.jMenuItemGuardarCambiosTipoRubroEmplea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRubroEmplea.add(this.jmenuArchivoTipoRubroEmplea);		
			this.jmenuBarTipoRubroEmplea.add(this.jmenuAccionesTipoRubroEmplea);		
			this.jmenuBarTipoRubroEmplea.add(this.jmenuDatosTipoRubroEmplea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRubroEmplea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRubroEmplea() {
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
			//this.jInternalFrameDetalleTipoRubroEmplea = new TipoRubroEmpleaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Rubro DATOS");
			this.jInternalFrameDetalleFormTipoRubroEmplea = new TipoRubroEmpleaDetalleFormJInternalFrame(jDesktopPane,this.tiporubroempleaSessionBean.getConGuardarRelaciones(),this.tiporubroempleaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRubroEmplea = null;//new TipoRubroEmpleaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRubroEmplea= new GridBagLayout();
		
		
		this.jTableDatosTipoRubroEmplea = new JTableMe();      
		
		String sToolTipTipoRubroEmplea="";
		sToolTipTipoRubroEmplea=TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRubroEmplea+="(Nomina.TipoRubroEmplea)";
		}
		
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRubroEmplea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRubroEmplea.setToolTipText(sToolTipTipoRubroEmplea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRubroEmplea);
		this.jTableDatosTipoRubroEmplea.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRubroEmplea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRubroEmplea.setRowSelectionAllowed(true);
		this.jTableDatosTipoRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRubroEmplea = new JButtonMe();
		this.jButtonDuplicarTipoRubroEmplea = new JButtonMe();
		this.jButtonCopiarTipoRubroEmplea = new JButtonMe();
		this.jButtonVerFormTipoRubroEmplea = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRubroEmplea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRubroEmplea = new JButtonMe();
		this.jButtonCerrarTipoRubroEmplea = new JButtonMe();
		
		this.jScrollPanelDatosTipoRubroEmplea = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRubroEmplea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Rubro";
		
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rubros" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRubroEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesTipoRubroEmplea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRubroEmplea=new ReporteDinamicoJInternalFrame(TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRubroEmplea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRubroEmplea=new ImportacionJInternalFrame(TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRubroEmplea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRubroEmplea = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRubroEmplea.setText("Orden");
		this.jButtonAbrirOrderByTipoRubroEmplea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRubroEmplea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRubroEmplea,false,this);
			
			//this.cargarOrderByTipoRubroEmplea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRubroEmplea,true,this);
			
			//this.cargarOrderByTipoRubroEmplea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRubroEmplea.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRubroEmplea.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRubroEmplea.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoRubroEmplea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRubroEmplea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRubroEmplea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRubroEmplea.setText("Nuevo");
		this.jButtonDuplicarTipoRubroEmplea.setText("Duplicar");
		this.jButtonCopiarTipoRubroEmplea.setText("Copiar");
		this.jButtonVerFormTipoRubroEmplea.setText("Ver");
		this.jButtonNuevoRelacionesTipoRubroEmplea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.setText("Guardar");
		this.jButtonCerrarTipoRubroEmplea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRubroEmplea,"nuevo_button","Nuevo",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRubroEmplea,"duplicar_button","Duplicar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRubroEmplea,"copiar_button","Copiar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRubroEmplea,"ver_form","Ver",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRubroEmplea,"nuevorelaciones_button","Nuevo Rel",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRubroEmplea,"guardarcambiostabla_button","Guardar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRubroEmplea,"cerrar_button","Salir",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRubroEmplea.setToolTipText("Nuevo"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRubroEmplea.setToolTipText("Duplicar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRubroEmplea.setToolTipText("Copiar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRubroEmplea.setToolTipText("Ver"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRubroEmplea.setToolTipText("Nuevo Rel"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.setToolTipText("Guardar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRubroEmplea.setToolTipText("Salir"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRubroEmplea";
		inputMap = this.jButtonNuevoTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRubroEmplea"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRubroEmplea";
		inputMap = this.jButtonDuplicarTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRubroEmplea"));
		
		//COPIAR
		sMapKey = "CopiarTipoRubroEmplea";
		inputMap = this.jButtonCopiarTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRubroEmplea"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRubroEmplea";
		inputMap = this.jButtonVerFormTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRubroEmplea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRubroEmplea";
		inputMap = this.jButtonNuevoRelacionesTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRubroEmplea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRubroEmplea";
		inputMap = this.jButtonModificarTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRubroEmplea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRubroEmplea";
		inputMap = this.jButtonCerrarTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRubroEmplea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRubroEmplea";
		inputMap = this.jButtonGuardarCambiosTablaTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRubroEmplea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRubroEmplea.setName("jPanelParametrosReportesTipoRubroEmplea"); 
		
		this.jPanelParametrosReportesAccionesTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRubroEmplea.setName("jPanelParametrosReportesAccionesTipoRubroEmplea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRubroEmplea = new JButtonMe();
		this.jButtonRecargarInformacionTipoRubroEmplea.setText("Recargar");
		this.jButtonRecargarInformacionTipoRubroEmplea.setToolTipText("Recargar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRubroEmplea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRubroEmplea = new JButtonMe();
		this.jButtonProcesarInformacionTipoRubroEmplea.setText("Procesar");
		this.jButtonProcesarInformacionTipoRubroEmplea.setToolTipText("Procesar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRubroEmplea.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRubroEmplea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRubroEmplea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRubroEmplea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRubroEmplea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRubroEmplea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRubroEmplea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRubroEmplea.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRubroEmplea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRubroEmplea.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRubroEmplea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRubroEmplea.setText("Accion");
		this.jComboBoxTiposAccionesTipoRubroEmplea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRubroEmplea.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRubroEmplea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRubroEmplea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRubroEmplea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRubroEmplea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRubroEmplea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRubroEmplea = new JLabelMe();
		
		this.jLabelAccionesTipoRubroEmplea.setText("Acciones");		
		this.jLabelAccionesTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRubroEmplea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRubroEmplea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRubroEmplea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRubroEmplea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRubroEmplea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRubroEmplea.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRubroEmplea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRubroEmplea = new JButtonMe();
		//this.jButtonAnterioresTipoRubroEmplea.setText("<<");
        this.jButtonAnterioresTipoRubroEmplea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRubroEmplea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRubroEmplea = new JButtonMe();
		//this.jButtonSiguientesTipoRubroEmplea.setText(">>");
        this.jButtonSiguientesTipoRubroEmplea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRubroEmplea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRubroEmplea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRubroEmplea.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRubroEmplea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRubroEmplea,"nuevoguardarcambios_button","Nue",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRubroEmplea";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRubroEmplea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRubroEmplea";
		inputMap = this.jButtonRecargarInformacionTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRubroEmplea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRubroEmplea";
		inputMap = this.jButtonSiguientesTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRubroEmplea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRubroEmplea";
		inputMap = this.jButtonAnterioresTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRubroEmplea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRubroEmplea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRubroEmplea.setMinimumSize(new Dimension(this.getWidth(),TipoRubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRubroEmplea.setMaximumSize(new Dimension(this.getWidth(),TipoRubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRubroEmplea.setPreferredSize(new Dimension(this.getWidth(),TipoRubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRubroEmplea = new GridBagLayout();

			this.jPanelPaginacionTipoRubroEmplea.setLayout(gridaBagLayoutPaginacionTipoRubroEmplea);						
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonAnterioresTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
					
						
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
			
			this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonNuevoGuardarCambiosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
						
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
			this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonSiguientesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonNuevoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRubroEmplea.gridy = 1;
				this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonNuevoRelacionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			}
			
			
			if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRubroEmplea.gridy = 1;
				this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonGuardarCambiosTablaTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			}
			
			
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonDuplicarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonCopiarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonVerFormTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRubroEmplea.add(this.jButtonCerrarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
		
		
		this.jButtonRecargarInformacionTipoRubroEmplea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRubroEmplea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRubroEmplea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRubroEmplea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRubroEmplea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRubroEmplea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRubroEmplea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRubroEmplea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRubroEmplea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRubroEmplea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRubroEmplea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRubroEmplea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRubroEmplea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRubroEmplea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRubroEmplea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRubroEmplea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRubroEmplea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRubroEmplea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRubroEmplea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRubroEmplea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRubroEmplea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRubroEmplea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRubroEmplea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRubroEmplea.setLayout(gridaBagParametrosReportesTipoRubroEmplea);
			this.jPanelParametrosReportesAccionesTipoRubroEmplea.setLayout(gridaBagParametrosReportesAccionesTipoRubroEmplea);
			
			
			this.jPanelParametrosAuxiliar1TipoRubroEmplea.setLayout(gridaBagParametrosAuxiliar1TipoRubroEmplea);
			this.jPanelParametrosAuxiliar2TipoRubroEmplea.setLayout(gridaBagParametrosAuxiliar2TipoRubroEmplea);
			this.jPanelParametrosAuxiliar3TipoRubroEmplea.setLayout(gridaBagParametrosAuxiliar3TipoRubroEmplea);
			this.jPanelParametrosAuxiliar4TipoRubroEmplea.setLayout(gridaBagParametrosAuxiliar4TipoRubroEmplea);
			//this.jPanelParametrosAuxiliar5TipoRubroEmplea.setLayout(gridaBagParametrosAuxiliar2TipoRubroEmplea);			
			
			
			
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jButtonRecargarInformacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRubroEmplea.add(this.jComboBoxTiposPaginacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRubroEmplea.add(this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRubroEmplea.add(this.jComboBoxTiposArchivosReportesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jPanelParametrosAuxiliar1TipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRubroEmplea.add(this.jComboBoxTiposReportesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jPanelParametrosAuxiliar4TipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jComboBoxTiposReportesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jCheckBoxGenerarReporteTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jPanelParametrosAuxiliar2TipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRubroEmplea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jLabelAccionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRubroEmplea.add(this.jButtonAbrirOrderByTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jComboBoxTiposSeleccionarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
			
			
			/*
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRubroEmplea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jCheckBoxSeleccionarTodosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRubroEmplea.add(this.jCheckBoxSeleccionarTodosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);															
				
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRubroEmplea.add(this.jCheckBoxSeleccionadosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jPanelParametrosAuxiliar3TipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jComboBoxTiposRelacionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
				
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jComboBoxTiposAccionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
	
				
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRubroEmplea.add(this.jTextFieldValorCampoGeneralTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRubroEmplea = new GridBagLayout();

			this.jScrollPanelDatosTipoRubroEmplea.setLayout(gridaBagLayoutDatosTipoRubroEmplea);
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
			this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
			
			this.jScrollPanelDatosTipoRubroEmplea.add(this.jTableDatosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRubroEmplea.setViewportView(this.jTableDatosTipoRubroEmplea);
		this.jTableDatosTipoRubroEmplea.setFillsViewportHeight(true);
		this.jTableDatosTipoRubroEmplea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRubroEmplea= new GridBagLayout();
		this.jPanelAccionesTipoRubroEmplea.setLayout(gridaBagLayoutAccionesTipoRubroEmplea);
		
		
		/*	
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
			
		this.jPanelAccionesTipoRubroEmplea.add(this.jButtonNuevoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRubroEmplea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRubroEmplea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();						
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRubroEmplea.gridx = 0;		
			//this.gridBagConstraintsTipoRubroEmplea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRubroEmplea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;		
		//this.gridBagConstraintsTipoRubroEmplea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRubroEmplea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRubroEmplea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);								
		
		
		/*
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		*/		
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRubroEmplea.gridx =0;
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRubroEmplea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
				
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRubroEmplea = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRubroEmplea.setLayout(gridaBagLayoutBusquedasParametrosTipoRubroEmplea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRubroEmplea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			
			
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
			
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRubroEmplea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRubroEmplea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRubroEmplea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRubroEmplea.setName("jPanelReporteDinamicoTipoRubroEmplea"); 
		
		this.jPanelReporteDinamicoTipoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRubroEmplea.setLayout(gridaBagLayoutReporteDinamicoTipoRubroEmplea);
		
		
		this.jInternalFrameReporteDinamicoTipoRubroEmplea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRubroEmplea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRubroEmplea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRubroEmplea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRubroEmplea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRubroEmplea.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRubroEmplea.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRubroEmplea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rubros"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRubroEmplea = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRubroEmplea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jLabelColumnasSelectReporteTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRubroEmplea = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRubroEmplea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRubroEmplea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRubroEmplea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRubroEmplea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRubroEmplea=new JScrollPane(this.jListColumnasSelectReporteTipoRubroEmplea);
			
			this.jScrollColumnasSelectReporteTipoRubroEmplea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRubroEmplea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRubroEmplea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jListColumnasSelectReporteTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jScrollColumnasSelectReporteTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRubroEmplea = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRubroEmplea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jLabelRelacionesSelectReporteTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRubroEmplea = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRubroEmplea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRubroEmplea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRubroEmplea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRubroEmplea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRubroEmplea=new JScrollPane(this.jListRelacionesSelectReporteTipoRubroEmplea);
			
			this.jScrollRelacionesSelectReporteTipoRubroEmplea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRubroEmplea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRubroEmplea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jListRelacionesSelectReporteTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jScrollRelacionesSelectReporteTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoRubroEmplea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRubroEmplea = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRubroEmplea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRubroEmplea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRubroEmplea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRubroEmplea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRubroEmplea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jLabelGenerarExcelReporteDinamicoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRubroEmplea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRubroEmplea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRubroEmplea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRubroEmplea.setToolTipText("Generar EXCEL"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jButtonGenerarExcelReporteDinamicoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jComboBoxTiposReportesDinamicoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRubroEmplea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRubroEmplea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jLabelTiposArchivoReporteDinamicoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRubroEmplea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRubroEmplea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRubroEmplea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRubroEmplea.setToolTipText("Generar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jButtonGenerarReporteDinamicoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRubroEmplea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRubroEmplea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRubroEmplea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRubroEmplea.setToolTipText("Cancelar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRubroEmplea.add(this.jButtonCerrarReporteDinamicoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRubroEmplea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRubroEmplea= new JScrollPane(jPanelReporteDinamicoTipoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rubros"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRubroEmplea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRubroEmplea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRubroEmplea);
		this.jInternalFrameReporteDinamicoTipoRubroEmplea.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRubroEmplea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRubroEmplea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRubroEmplea.setName("jPanelImportacionTipoRubroEmplea"); 
		
		this.jPanelImportacionTipoRubroEmplea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRubroEmplea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRubroEmplea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRubroEmplea.setLayout(gridaBagLayoutImportacionTipoRubroEmplea);
		
		
		this.jInternalFrameImportacionTipoRubroEmplea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRubroEmplea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRubroEmplea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRubroEmplea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRubroEmplea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRubroEmplea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRubroEmplea.setResizable(true);
	    this.jInternalFrameImportacionTipoRubroEmplea.setClosable(true);
	    this.jInternalFrameImportacionTipoRubroEmplea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRubroEmplea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRubroEmplea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRubroEmplea.setResizable(true);
	    this.jInternalFrameImportacionTipoRubroEmplea.setClosable(true);
	    this.jInternalFrameImportacionTipoRubroEmplea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRubroEmplea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRubroEmplea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRubroEmplea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rubros"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRubroEmplea = new JLabelMe();

		this.jLabelArchivoImportacionTipoRubroEmplea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRubroEmplea.add(this.jLabelArchivoImportacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRubroEmplea = new JFileChooser();		
		this.jFileChooserImportacionTipoRubroEmplea.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRubroEmplea = new JButtonMe();
		this.jButtonAbrirImportacionTipoRubroEmplea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRubroEmplea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRubroEmplea.setToolTipText("Generar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRubroEmplea.add(this.jButtonAbrirImportacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRubroEmplea = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRubroEmplea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRubroEmplea.add(this.jLabelPathArchivoImportacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRubroEmplea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRubroEmplea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRubroEmplea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRubroEmplea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRubroEmplea.add(this.jTextFieldPathArchivoImportacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRubroEmplea = new JButtonMe();
		this.jButtonGenerarImportacionTipoRubroEmplea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRubroEmplea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRubroEmplea.setToolTipText("Generar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRubroEmplea.add(this.jButtonGenerarImportacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRubroEmplea = new JButtonMe();
		this.jButtonCerrarImportacionTipoRubroEmplea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRubroEmplea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRubroEmplea.setToolTipText("Cancelar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRubroEmplea.add(this.jButtonCerrarImportacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRubroEmplea = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRubroEmplea= new JScrollPane(jPanelImportacionTipoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRubroEmplea.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRubroEmplea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRubroEmplea);
		this.jInternalFrameImportacionTipoRubroEmplea.getContentPane().add(this.jScrollPanelImportacionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRubroEmplea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRubroEmplea = new JButtonMe();
			this.jButtonAbrirOrderByTipoRubroEmplea.setText("Orden");
			this.jButtonAbrirOrderByTipoRubroEmplea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRubroEmplea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRubroEmplea";
			inputMap = this.jButtonAbrirOrderByTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRubroEmplea"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRubroEmplea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRubroEmplea.setName("jPanelOrderByTipoRubroEmplea"); 
			
			this.jPanelOrderByTipoRubroEmplea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRubroEmplea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRubroEmplea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRubroEmplea.setLayout(gridaBagLayoutOrderByTipoRubroEmplea);
			
			
			this.jTableDatosTipoRubroEmpleaOrderBy = new JTableMe();        
			this.jTableDatosTipoRubroEmpleaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRubroEmpleaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRubroEmpleaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRubroEmpleaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRubroEmpleaOrderBy.setViewportView(this.jTableDatosTipoRubroEmpleaOrderBy);
			this.jTableDatosTipoRubroEmpleaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRubroEmpleaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRubroEmplea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRubroEmplea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRubroEmplea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRubroEmplea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRubroEmplea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRubroEmplea.setTitle("Orden");
			this.jInternalFrameOrderByTipoRubroEmplea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRubroEmplea.setResizable(true);
			this.jInternalFrameOrderByTipoRubroEmplea.setClosable(true);
			this.jInternalFrameOrderByTipoRubroEmplea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRubroEmplea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRubroEmplea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRubroEmplea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rubros"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRubroEmplea.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRubroEmplea.ipady =150;
				
			this.jPanelOrderByTipoRubroEmplea.add(jScrollPanelDatosTipoRubroEmpleaOrderBy, this.gridBagConstraintsTipoRubroEmplea);//this.jTableDatosTipoRubroEmpleaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRubroEmplea = new JButtonMe();
			this.jButtonCerrarOrderByTipoRubroEmplea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRubroEmplea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRubroEmplea.setToolTipText("Cancelar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRubroEmplea.add(this.jButtonCerrarOrderByTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRubroEmplea = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRubroEmplea= new JScrollPane(jPanelOrderByTipoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRubroEmplea.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRubroEmplea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRubroEmplea);
			
			this.jInternalFrameOrderByTipoRubroEmplea.getContentPane().add(this.jScrollPanelOrderByTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
		
		} else {
			this.jButtonAbrirOrderByTipoRubroEmplea = new JButtonMe();
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
			&& this.tiporubroempleaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRubroEmplea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRubroEmplea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRubroEmplea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRubroEmplea.getRowHeight();//TipoRubroEmpleaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea.isSelected()) {
					iHeightTable=TipoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRubroEmplea.isSelected()) {
					iHeightTable=TipoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRubroEmplea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRubroEmplea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRubroEmplea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRubroEmplea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRubroEmplea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRubroEmplea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRubroEmplea!=null && this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRubroEmplea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRubroEmplea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRubroEmplea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRubroEmplea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRubroEmplea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRubroEmplea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporubroempleaLogic.getTipoRubroEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporubroempleas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRubroEmplea> TraerTipoRubroEmpleaBeans(List<TipoRubroEmplea> tiporubroempleas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRubroEmplea tiporubroemplea:tiporubroempleas) {
					
				if(!(TipoRubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporubroemplea.setsDetalleGeneralEntityReporte(TipoRubroEmpleaConstantesFunciones.getTipoRubroEmpleaDescripcion(tiporubroemplea));
										
						
					
					

					if(tiporubroemplea.getRubroEmpleas()!=null && Funciones.existeClass(classes,RubroEmplea.class)) {
						try{tiporubroemplea.setrubroempleasDescripcionReporte(new JRBeanCollectionDataSource(RubroEmpleaJInternalFrame.TraerRubroEmpleaBeans(tiporubroemplea.getRubroEmpleas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiporubroemplea.setsDetalleGeneralEntityReporte(tiporubroemplea.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporubroempleabeans.add(tiporubroempleabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporubroempleas;
    }
	//PARA REPORTES FIN
}
