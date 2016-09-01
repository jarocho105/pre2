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
import com.bydan.erp.nomina.util.TipoGrupoRubroEmpleaConstantesFunciones;

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
public class TipoGrupoRubroEmpleaJInternalFrame extends TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGrupoRubroEmplea;
	
	protected JMenuBar jmenuBarTipoGrupoRubroEmplea;
	
	protected JMenu jmenuTipoGrupoRubroEmplea;
	protected JMenu jmenuDatosTipoGrupoRubroEmplea;
	protected JMenu jmenuArchivoTipoGrupoRubroEmplea;
	protected JMenu jmenuAccionesTipoGrupoRubroEmplea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGrupoRubroEmplea;	
	protected GridBagConstraints gridBagConstraintsTipoGrupoRubroEmplea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGrupoRubroEmpleaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGrupoRubroEmplea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGrupoRubroEmplea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGrupoRubroEmplea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGrupoRubroEmpleaSessionBean tipogruporubroempleaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGrupoRubroEmplea> tipogruporubroempleas;		
	public List<TipoGrupoRubroEmplea> tipogruporubroempleasEliminados;	
	public List<TipoGrupoRubroEmplea> tipogruporubroempleasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGrupoRubroEmplea;		
	protected JButton jButtonAbrirOrderByTipoGrupoRubroEmplea;
	
	
	//protected JPanel jPanelOrderByTipoGrupoRubroEmplea;
	//public JScrollPane jScrollPanelOrderByTipoGrupoRubroEmplea;	
	//protected JButton jButtonCerrarOrderByTipoGrupoRubroEmplea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGrupoRubroEmpleaLogic tipogruporubroempleaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGrupoRubroEmplea;
	public JScrollPane jScrollPanelDatosEdicionTipoGrupoRubroEmplea;
	public JScrollPane jScrollPanelDatosGeneralTipoGrupoRubroEmplea;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGrupoRubroEmpleaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGrupoRubroEmplea;
	//public JScrollPane jScrollPanelImportacionTipoGrupoRubroEmplea;
	
	
	
	protected JPanel jPanelAccionesTipoGrupoRubroEmplea;
	
    protected JPanel jPanelPaginacionTipoGrupoRubroEmplea;
    protected JPanel jPanelParametrosReportesTipoGrupoRubroEmplea;
	protected JPanel jPanelParametrosReportesAccionesTipoGrupoRubroEmplea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGrupoRubroEmplea;
	protected JPanel jPanelParametrosAuxiliar2TipoGrupoRubroEmplea;
	protected JPanel jPanelParametrosAuxiliar3TipoGrupoRubroEmplea;
	protected JPanel jPanelParametrosAuxiliar4TipoGrupoRubroEmplea;
	//protected JPanel jPanelParametrosAuxiliar5TipoGrupoRubroEmplea;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGrupoRubroEmplea;
	//protected JPanel jPanelImportacionTipoGrupoRubroEmplea;
	
	
	public JTable jTableDatosTipoGrupoRubroEmplea;
	
	
	
	//public JTable jTableDatosTipoGrupoRubroEmpleaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGrupoRubroEmplea;
	protected JButton jButtonDuplicarTipoGrupoRubroEmplea;
	protected JButton jButtonCopiarTipoGrupoRubroEmplea;
	protected JButton jButtonVerFormTipoGrupoRubroEmplea;
	protected JButton jButtonNuevoRelacionesTipoGrupoRubroEmplea;
	protected JButton jButtonModificarTipoGrupoRubroEmplea;
	
    protected JButton jButtonGuardarCambiosTablaTipoGrupoRubroEmplea;
	protected JButton jButtonCerrarTipoGrupoRubroEmplea;
	
	
	protected JButton jButtonRecargarInformacionTipoGrupoRubroEmplea;
	protected JButton jButtonProcesarInformacionTipoGrupoRubroEmplea;
	
	
	protected JButton jButtonAnterioresTipoGrupoRubroEmplea;
	protected JButton jButtonSiguientesTipoGrupoRubroEmplea;
	protected JButton jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGrupoRubroEmplea;
	//protected JButton jButtonCerrarReporteDinamicoTipoGrupoRubroEmplea;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmplea;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGrupoRubroEmplea;
	//protected JButton jButtonGenerarImportacionTipoGrupoRubroEmplea;
	//protected JButton jButtonCerrarImportacionTipoGrupoRubroEmplea;
	//protected JFileChooser jFileChooserImportacionTipoGrupoRubroEmplea;
	//protected File fileImportacionTipoGrupoRubroEmplea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonDuplicarToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonCopiarToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonVerFormToolBarTipoGrupoRubroEmplea;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonCerrarToolBarTipoGrupoRubroEmplea;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonProcesarInformacionToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonAnterioresToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonSiguientesToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonAbrirOrderByToolBarTipoGrupoRubroEmplea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemDuplicarTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGrupoRubroEmplea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemCopiarTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemVerFormTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemCerrarTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemDetalleCerrarTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemProcesarInformacionTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemAnterioresTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemSiguientesTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemAbrirOrderByTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemMostrarOcultarTipoGrupoRubroEmplea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGrupoRubroEmplea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea;
	protected JCheckBox jCheckBoxSeleccionadosTipoGrupoRubroEmplea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGrupoRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGrupoRubroEmplea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGrupoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGrupoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGrupoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGrupoRubroEmplea;
	protected JTextField jTextFieldValorCampoGeneralTipoGrupoRubroEmplea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGrupoRubroEmplea;
	//public JList<Reporte> jListColumnasSelectReporteTipoGrupoRubroEmplea;
	//public JScrollPane jScrollColumnasSelectReporteTipoGrupoRubroEmplea;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGrupoRubroEmplea;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGrupoRubroEmplea;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGrupoRubroEmplea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGrupoRubroEmplea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGrupoRubroEmplea;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGrupoRubroEmplea;
	
		
	//public JLabel jLabelArchivoImportacionTipoGrupoRubroEmplea;	
	//public JLabel jLabelPathArchivoImportacionTipoGrupoRubroEmplea;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGrupoRubroEmplea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGrupoRubroEmplea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGrupoRubroEmplea;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGrupoRubroEmplea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGrupoRubroEmplea;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGrupoRubroEmplea;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGrupoRubroEmplea;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGrupoRubroEmplea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGrupoRubroEmplea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGrupoRubroEmplea;	
	
	
	
	
	
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
	public TipoGrupoRubroEmpleaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoRubroEmpleaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoRubroEmpleaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoRubroEmpleaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGrupoRubroEmplea)	{
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea = jButtonRecargarInformacionTipoGrupoRubroEmplea;
	}
	
	public JButton getjButtonProcesarInformacionTipoGrupoRubroEmplea() {
		return this.jButtonProcesarInformacionTipoGrupoRubroEmplea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGrupoRubroEmplea)	{
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea = jButtonProcesarInformacionTipoGrupoRubroEmplea;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGrupoRubroEmplea() {
		return this.jButtonRecargarInformacionTipoGrupoRubroEmplea;
	}
	
	
	public List<TipoGrupoRubroEmplea> gettipogruporubroempleas() {
		return this.tipogruporubroempleas;
	}

	public void settipogruporubroempleas(List<TipoGrupoRubroEmplea> tipogruporubroempleas) {
		this.tipogruporubroempleas = tipogruporubroempleas;
	}
	
	public List<TipoGrupoRubroEmplea> gettipogruporubroempleasAux() {
		return this.tipogruporubroempleasAux;
	}

	public void settipogruporubroempleasAux(List<TipoGrupoRubroEmplea> tipogruporubroempleasAux) {
		this.tipogruporubroempleasAux = tipogruporubroempleasAux;
	}
	
	public List<TipoGrupoRubroEmplea> gettipogruporubroempleasEliminados() {
		return this.tipogruporubroempleasEliminados;
	}

	public void setTipoGrupoRubroEmpleasEliminados(List<TipoGrupoRubroEmplea> tipogruporubroempleasEliminados) {
		this.tipogruporubroempleasEliminados = tipogruporubroempleasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGrupoRubroEmplea() {
		return jComboBoxTiposSeleccionarTipoGrupoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposSeleccionarTipoGrupoRubroEmplea) {
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea = jComboBoxTiposSeleccionarTipoGrupoRubroEmplea;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGrupoRubroEmplea() {
		return jTextFieldValorCampoGeneralTipoGrupoRubroEmplea;
	}

	public void setjTextFieldValorCampoGeneralTipoGrupoRubroEmplea(
			JTextField jTextFieldValorCampoGeneralTipoGrupoRubroEmplea) {
		this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea = jTextFieldValorCampoGeneralTipoGrupoRubroEmplea;
	}

	public void setBorderResaltarValorCampoGeneralTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGrupoRubroEmplea() {
		return this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea;
	}

	public void setjCheckBoxSeleccionarTodosTipoGrupoRubroEmplea(
			JCheckBox jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea) {
		this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea = jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea;
	}

	public void setBorderResaltarSeleccionarTodosTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGrupoRubroEmplea() {
		return this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea;
	}

	public void setjCheckBoxSeleccionadosTipoGrupoRubroEmplea(
			JCheckBox jCheckBoxSeleccionadosTipoGrupoRubroEmplea) {
		this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea = jCheckBoxSeleccionadosTipoGrupoRubroEmplea;
	}
	
	public void setBorderResaltarSeleccionadosTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGrupoRubroEmplea() {
		return this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea) {
		this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea = jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGrupoRubroEmplea() {
		return this.jComboBoxTiposReportesTipoGrupoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposReportesTipoGrupoRubroEmplea) {
		this.jComboBoxTiposReportesTipoGrupoRubroEmplea = jComboBoxTiposReportesTipoGrupoRubroEmplea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea() {
	//	return jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea) {
	//	this.jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea = jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea = jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea;
	//}
	
	public void setBorderResaltarTiposReportesTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGrupoRubroEmplea() {
		return this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea) {
		this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea = jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGrupoRubroEmplea() {
		return this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposPaginacionTipoGrupoRubroEmplea) {
		this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea = jComboBoxTiposPaginacionTipoGrupoRubroEmplea;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGrupoRubroEmplea() {
		return this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGrupoRubroEmplea() {
		return this.jComboBoxTiposAccionesTipoGrupoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposRelacionesTipoGrupoRubroEmplea) {
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea = jComboBoxTiposRelacionesTipoGrupoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposAccionesTipoGrupoRubroEmplea) {
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea = jComboBoxTiposAccionesTipoGrupoRubroEmplea;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGrupoRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea() {
	//	return jCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea) {
	//	this.jCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea = jCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGrupoRubroEmplea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGrupoRubroEmplea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea .setBorder(borderResaltar);		
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
		this.tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean();
		
		this.tipogruporubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogruporubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGrupoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGrupoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrupoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrupoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrupoRubroEmpleaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grupo Rubro Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGrupoRubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGrupoRubroEmplea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"nuevo","nuevo","Nuevo"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"duplicar","duplicar","Duplicar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"copiar","copiar","Copiar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"ver_form","ver_form","Ver"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"recargar","recargar","Recargar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,
							"cerrar","cerrar","Salir"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea;
			
				this.jButtonProcesarInformacionToolBarTipoGrupoRubroEmplea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGrupoRubroEmplea;
				
		//protected JButton jButtonModificarToolBarTipoGrupoRubroEmplea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGrupoRubroEmplea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGrupoRubroEmplea=new JMenuMe("General");
		this.jmenuArchivoTipoGrupoRubroEmplea=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGrupoRubroEmplea=new JMenuMe("Acciones");
		this.jmenuDatosTipoGrupoRubroEmplea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGrupoRubroEmplea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGrupoRubroEmplea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGrupoRubroEmplea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGrupoRubroEmplea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGrupoRubroEmplea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGrupoRubroEmplea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGrupoRubroEmplea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGrupoRubroEmplea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGrupoRubroEmplea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGrupoRubroEmplea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGrupoRubroEmplea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGrupoRubroEmplea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGrupoRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGrupoRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGrupoRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGrupoRubroEmplea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGrupoRubroEmplea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGrupoRubroEmplea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGrupoRubroEmplea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGrupoRubroEmplea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGrupoRubroEmplea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGrupoRubroEmplea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGrupoRubroEmplea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGrupoRubroEmplea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGrupoRubroEmplea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGrupoRubroEmplea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGrupoRubroEmplea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGrupoRubroEmplea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGrupoRubroEmplea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGrupoRubroEmplea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGrupoRubroEmplea.add(this.jMenuItemCerrarTipoGrupoRubroEmplea);
			
			this.jmenuAccionesTipoGrupoRubroEmplea.add(this.jMenuItemNuevoTipoGrupoRubroEmplea);
			this.jmenuAccionesTipoGrupoRubroEmplea.add(this.jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea);
			this.jmenuAccionesTipoGrupoRubroEmplea.add(this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea);
			this.jmenuAccionesTipoGrupoRubroEmplea.add(this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea);		
			this.jmenuAccionesTipoGrupoRubroEmplea.add(this.jMenuItemDuplicarTipoGrupoRubroEmplea);		
			this.jmenuAccionesTipoGrupoRubroEmplea.add(this.jMenuItemCopiarTipoGrupoRubroEmplea);		
			this.jmenuAccionesTipoGrupoRubroEmplea.add(this.jMenuItemVerFormTipoGrupoRubroEmplea);		
			
			this.jmenuDatosTipoGrupoRubroEmplea.add(this.jMenuItemRecargarInformacionTipoGrupoRubroEmplea);				
			this.jmenuDatosTipoGrupoRubroEmplea.add(this.jMenuItemAnterioresTipoGrupoRubroEmplea);				
			this.jmenuDatosTipoGrupoRubroEmplea.add(this.jMenuItemSiguientesTipoGrupoRubroEmplea);				
			this.jmenuDatosTipoGrupoRubroEmplea.add(this.jMenuItemAbrirOrderByTipoGrupoRubroEmplea);				
			this.jmenuDatosTipoGrupoRubroEmplea.add(this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGrupoRubroEmplea.add(this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGrupoRubroEmplea.add(this.jmenuArchivoTipoGrupoRubroEmplea);		
			this.jmenuBarTipoGrupoRubroEmplea.add(this.jmenuAccionesTipoGrupoRubroEmplea);		
			this.jmenuBarTipoGrupoRubroEmplea.add(this.jmenuDatosTipoGrupoRubroEmplea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGrupoRubroEmplea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGrupoRubroEmplea() {
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
			//this.jInternalFrameDetalleTipoGrupoRubroEmplea = new TipoGrupoRubroEmpleaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Grupo Rubro Empleado DATOS");
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea = new TipoGrupoRubroEmpleaDetalleFormJInternalFrame(jDesktopPane,this.tipogruporubroempleaSessionBean.getConGuardarRelaciones(),this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea = null;//new TipoGrupoRubroEmpleaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGrupoRubroEmplea= new GridBagLayout();
		
		
		this.jTableDatosTipoGrupoRubroEmplea = new JTableMe();      
		
		String sToolTipTipoGrupoRubroEmplea="";
		sToolTipTipoGrupoRubroEmplea=TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGrupoRubroEmplea+="(Nomina.TipoGrupoRubroEmplea)";
		}
		
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGrupoRubroEmplea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGrupoRubroEmplea.setToolTipText(sToolTipTipoGrupoRubroEmplea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGrupoRubroEmplea);
		this.jTableDatosTipoGrupoRubroEmplea.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGrupoRubroEmplea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGrupoRubroEmplea.setRowSelectionAllowed(true);
		this.jTableDatosTipoGrupoRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonDuplicarTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonCopiarTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonVerFormTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGrupoRubroEmplea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonCerrarTipoGrupoRubroEmplea = new JButtonMe();
		
		this.jScrollPanelDatosTipoGrupoRubroEmplea = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grupo Rubro Empleado";
		
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Rubro Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGrupoRubroEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGrupoRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesTipoGrupoRubroEmplea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea=new ReporteDinamicoJInternalFrame(TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGrupoRubroEmplea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGrupoRubroEmplea=new ImportacionJInternalFrame(TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGrupoRubroEmplea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGrupoRubroEmplea = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGrupoRubroEmplea.setText("Orden");
		this.jButtonAbrirOrderByTipoGrupoRubroEmplea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGrupoRubroEmplea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGrupoRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoRubroEmplea,false,this);
			
			//this.cargarOrderByTipoGrupoRubroEmplea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGrupoRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoRubroEmplea,true,this);
			
			//this.cargarOrderByTipoGrupoRubroEmplea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGrupoRubroEmplea.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGrupoRubroEmplea.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGrupoRubroEmplea.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoGrupoRubroEmplea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGrupoRubroEmplea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGrupoRubroEmplea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGrupoRubroEmplea.setText("Nuevo");
		this.jButtonDuplicarTipoGrupoRubroEmplea.setText("Duplicar");
		this.jButtonCopiarTipoGrupoRubroEmplea.setText("Copiar");
		this.jButtonVerFormTipoGrupoRubroEmplea.setText("Ver");
		this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.setText("Guardar");
		this.jButtonCerrarTipoGrupoRubroEmplea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGrupoRubroEmplea,"nuevo_button","Nuevo",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGrupoRubroEmplea,"duplicar_button","Duplicar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGrupoRubroEmplea,"copiar_button","Copiar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGrupoRubroEmplea,"ver_form","Ver",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGrupoRubroEmplea,"nuevorelaciones_button","Nuevo Rel",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea,"guardarcambiostabla_button","Guardar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGrupoRubroEmplea,"cerrar_button","Salir",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGrupoRubroEmplea.setToolTipText("Nuevo"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGrupoRubroEmplea.setToolTipText("Duplicar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGrupoRubroEmplea.setToolTipText("Copiar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGrupoRubroEmplea.setToolTipText("Ver"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.setToolTipText("Nuevo Rel"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.setToolTipText("Guardar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGrupoRubroEmplea.setToolTipText("Salir"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGrupoRubroEmplea";
		inputMap = this.jButtonNuevoTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGrupoRubroEmplea"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGrupoRubroEmplea";
		inputMap = this.jButtonDuplicarTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGrupoRubroEmplea"));
		
		//COPIAR
		sMapKey = "CopiarTipoGrupoRubroEmplea";
		inputMap = this.jButtonCopiarTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGrupoRubroEmplea"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGrupoRubroEmplea";
		inputMap = this.jButtonVerFormTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGrupoRubroEmplea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGrupoRubroEmplea";
		inputMap = this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGrupoRubroEmplea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGrupoRubroEmplea";
		inputMap = this.jButtonModificarTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGrupoRubroEmplea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGrupoRubroEmplea";
		inputMap = this.jButtonCerrarTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGrupoRubroEmplea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGrupoRubroEmplea";
		inputMap = this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGrupoRubroEmplea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGrupoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGrupoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGrupoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGrupoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGrupoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGrupoRubroEmplea.setName("jPanelParametrosReportesTipoGrupoRubroEmplea"); 
		
		this.jPanelParametrosReportesAccionesTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGrupoRubroEmplea.setName("jPanelParametrosReportesAccionesTipoGrupoRubroEmplea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea.setText("Recargar");
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea.setToolTipText("Recargar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGrupoRubroEmplea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea.setText("Procesar");
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea.setToolTipText("Procesar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGrupoRubroEmplea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setText("Accion");
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGrupoRubroEmplea = new JLabelMe();
		
		this.jLabelAccionesTipoGrupoRubroEmplea.setText("Acciones");		
		this.jLabelAccionesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGrupoRubroEmplea = new JButtonMe();
		//this.jButtonAnterioresTipoGrupoRubroEmplea.setText("<<");
        this.jButtonAnterioresTipoGrupoRubroEmplea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGrupoRubroEmplea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGrupoRubroEmplea = new JButtonMe();
		//this.jButtonSiguientesTipoGrupoRubroEmplea.setText(">>");
        this.jButtonSiguientesTipoGrupoRubroEmplea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGrupoRubroEmplea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea,"nuevoguardarcambios_button","Nue",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGrupoRubroEmplea";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGrupoRubroEmplea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGrupoRubroEmplea";
		inputMap = this.jButtonRecargarInformacionTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGrupoRubroEmplea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGrupoRubroEmplea";
		inputMap = this.jButtonSiguientesTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGrupoRubroEmplea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGrupoRubroEmplea";
		inputMap = this.jButtonAnterioresTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGrupoRubroEmplea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGrupoRubroEmplea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(this.getWidth(),TipoGrupoRubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoRubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(this.getWidth(),TipoGrupoRubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoRubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(this.getWidth(),TipoGrupoRubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoRubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGrupoRubroEmplea = new GridBagLayout();

			this.jPanelPaginacionTipoGrupoRubroEmplea.setLayout(gridaBagLayoutPaginacionTipoGrupoRubroEmplea);						
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonAnterioresTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
					
						
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
			
			this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
						
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
			this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonSiguientesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonNuevoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
						
			
			
			if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 1;
				this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			}
			
			
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonDuplicarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonCopiarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonVerFormTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 1;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGrupoRubroEmplea.add(this.jButtonCerrarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
		
		
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGrupoRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGrupoRubroEmplea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGrupoRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGrupoRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGrupoRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGrupoRubroEmplea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.setLayout(gridaBagParametrosReportesTipoGrupoRubroEmplea);
			this.jPanelParametrosReportesAccionesTipoGrupoRubroEmplea.setLayout(gridaBagParametrosReportesAccionesTipoGrupoRubroEmplea);
			
			
			this.jPanelParametrosAuxiliar1TipoGrupoRubroEmplea.setLayout(gridaBagParametrosAuxiliar1TipoGrupoRubroEmplea);
			this.jPanelParametrosAuxiliar2TipoGrupoRubroEmplea.setLayout(gridaBagParametrosAuxiliar2TipoGrupoRubroEmplea);
			this.jPanelParametrosAuxiliar3TipoGrupoRubroEmplea.setLayout(gridaBagParametrosAuxiliar3TipoGrupoRubroEmplea);
			this.jPanelParametrosAuxiliar4TipoGrupoRubroEmplea.setLayout(gridaBagParametrosAuxiliar4TipoGrupoRubroEmplea);
			//this.jPanelParametrosAuxiliar5TipoGrupoRubroEmplea.setLayout(gridaBagParametrosAuxiliar2TipoGrupoRubroEmplea);			
			
			
			
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jButtonRecargarInformacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoRubroEmplea.add(this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoRubroEmplea.add(this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoRubroEmplea.add(this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jPanelParametrosAuxiliar1TipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGrupoRubroEmplea.add(this.jComboBoxTiposReportesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jPanelParametrosAuxiliar4TipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jComboBoxTiposReportesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jCheckBoxGenerarReporteTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jPanelParametrosAuxiliar2TipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jLabelAccionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jButtonAbrirOrderByTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);			
			
			
			/*
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGrupoRubroEmplea.add(this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);															
				
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGrupoRubroEmplea.add(this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jPanelParametrosAuxiliar3TipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
				
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.add(this.jComboBoxTiposAccionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGrupoRubroEmplea = new GridBagLayout();

			this.jScrollPanelDatosTipoGrupoRubroEmplea.setLayout(gridaBagLayoutDatosTipoGrupoRubroEmplea);
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
			
			this.jScrollPanelDatosTipoGrupoRubroEmplea.add(this.jTableDatosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGrupoRubroEmplea.setViewportView(this.jTableDatosTipoGrupoRubroEmplea);
		this.jTableDatosTipoGrupoRubroEmplea.setFillsViewportHeight(true);
		this.jTableDatosTipoGrupoRubroEmplea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGrupoRubroEmplea= new GridBagLayout();
		this.jPanelAccionesTipoGrupoRubroEmplea.setLayout(gridaBagLayoutAccionesTipoGrupoRubroEmplea);
		
		
		/*	
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
			
		this.jPanelAccionesTipoGrupoRubroEmplea.add(this.jButtonNuevoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGrupoRubroEmplea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGrupoRubroEmplea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();						
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;		
			//this.gridBagConstraintsTipoGrupoRubroEmplea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;		
		//this.gridBagConstraintsTipoGrupoRubroEmplea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGrupoRubroEmplea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);								
		
		
		/*
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		*/		
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGrupoRubroEmplea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
				
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGrupoRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGrupoRubroEmplea = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGrupoRubroEmplea.setLayout(gridaBagLayoutBusquedasParametrosTipoGrupoRubroEmplea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			
			
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
			
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGrupoRubroEmplea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGrupoRubroEmplea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.setName("jPanelReporteDinamicoTipoGrupoRubroEmplea"); 
		
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.setLayout(gridaBagLayoutReporteDinamicoTipoGrupoRubroEmplea);
		
		
		this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Rubro Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGrupoRubroEmplea = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGrupoRubroEmplea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jLabelColumnasSelectReporteTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGrupoRubroEmplea = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGrupoRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGrupoRubroEmplea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGrupoRubroEmplea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGrupoRubroEmplea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGrupoRubroEmplea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea=new JScrollPane(this.jListColumnasSelectReporteTipoGrupoRubroEmplea);
			
			this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jListColumnasSelectReporteTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGrupoRubroEmplea = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGrupoRubroEmplea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGrupoRubroEmplea = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGrupoRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGrupoRubroEmplea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGrupoRubroEmplea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGrupoRubroEmplea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGrupoRubroEmplea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGrupoRubroEmplea=new JScrollPane(this.jListRelacionesSelectReporteTipoGrupoRubroEmplea);
			
			this.jScrollRelacionesSelectReporteTipoGrupoRubroEmplea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGrupoRubroEmplea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGrupoRubroEmplea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoGrupoRubroEmplea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGrupoRubroEmplea = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGrupoRubroEmplea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoRubroEmplea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGrupoRubroEmplea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jLabelGenerarExcelReporteDinamicoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmplea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmplea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmplea.setToolTipText("Generar EXCEL"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jComboBoxTiposReportesDinamicoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoRubroEmplea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGrupoRubroEmplea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jLabelTiposArchivoReporteDinamicoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGrupoRubroEmplea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGrupoRubroEmplea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGrupoRubroEmplea.setToolTipText("Generar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jButtonGenerarReporteDinamicoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGrupoRubroEmplea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGrupoRubroEmplea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGrupoRubroEmplea.setToolTipText("Cancelar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoRubroEmplea.add(this.jButtonCerrarReporteDinamicoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGrupoRubroEmplea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea= new JScrollPane(jPanelReporteDinamicoTipoGrupoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Rubro Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGrupoRubroEmplea);
		this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGrupoRubroEmplea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGrupoRubroEmplea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGrupoRubroEmplea.setName("jPanelImportacionTipoGrupoRubroEmplea"); 
		
		this.jPanelImportacionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGrupoRubroEmplea.setLayout(gridaBagLayoutImportacionTipoGrupoRubroEmplea);
		
		
		this.jInternalFrameImportacionTipoGrupoRubroEmplea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGrupoRubroEmplea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGrupoRubroEmplea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setResizable(true);
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setClosable(true);
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setResizable(true);
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setClosable(true);
	    this.jInternalFrameImportacionTipoGrupoRubroEmplea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Rubro Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGrupoRubroEmplea = new JLabelMe();

		this.jLabelArchivoImportacionTipoGrupoRubroEmplea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGrupoRubroEmplea.add(this.jLabelArchivoImportacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGrupoRubroEmplea = new JFileChooser();		
		this.jFileChooserImportacionTipoGrupoRubroEmplea.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonAbrirImportacionTipoGrupoRubroEmplea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGrupoRubroEmplea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGrupoRubroEmplea.setToolTipText("Generar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoRubroEmplea.add(this.jButtonAbrirImportacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGrupoRubroEmplea = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGrupoRubroEmplea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGrupoRubroEmplea.add(this.jLabelPathArchivoImportacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGrupoRubroEmplea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoRubroEmplea.add(this.jTextFieldPathArchivoImportacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonGenerarImportacionTipoGrupoRubroEmplea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGrupoRubroEmplea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGrupoRubroEmplea.setToolTipText("Generar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoRubroEmplea.add(this.jButtonGenerarImportacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonCerrarImportacionTipoGrupoRubroEmplea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGrupoRubroEmplea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGrupoRubroEmplea.setToolTipText("Cancelar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoRubroEmplea.add(this.jButtonCerrarImportacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGrupoRubroEmplea = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGrupoRubroEmplea= new JScrollPane(jPanelImportacionTipoGrupoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGrupoRubroEmplea);
		this.jInternalFrameImportacionTipoGrupoRubroEmplea.getContentPane().add(this.jScrollPanelImportacionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGrupoRubroEmplea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGrupoRubroEmplea = new JButtonMe();
			this.jButtonAbrirOrderByTipoGrupoRubroEmplea.setText("Orden");
			this.jButtonAbrirOrderByTipoGrupoRubroEmplea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGrupoRubroEmplea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGrupoRubroEmplea";
			inputMap = this.jButtonAbrirOrderByTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGrupoRubroEmplea"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGrupoRubroEmplea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGrupoRubroEmplea.setName("jPanelOrderByTipoGrupoRubroEmplea"); 
			
			this.jPanelOrderByTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGrupoRubroEmplea.setLayout(gridaBagLayoutOrderByTipoGrupoRubroEmplea);
			
			
			this.jTableDatosTipoGrupoRubroEmpleaOrderBy = new JTableMe();        
			this.jTableDatosTipoGrupoRubroEmpleaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGrupoRubroEmpleaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGrupoRubroEmpleaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGrupoRubroEmpleaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGrupoRubroEmpleaOrderBy.setViewportView(this.jTableDatosTipoGrupoRubroEmpleaOrderBy);
			this.jTableDatosTipoGrupoRubroEmpleaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGrupoRubroEmpleaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGrupoRubroEmplea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGrupoRubroEmplea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGrupoRubroEmplea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGrupoRubroEmplea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setTitle("Orden");
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setResizable(true);
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setClosable(true);
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Rubro Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGrupoRubroEmplea.ipady =150;
				
			this.jPanelOrderByTipoGrupoRubroEmplea.add(jScrollPanelDatosTipoGrupoRubroEmpleaOrderBy, this.gridBagConstraintsTipoGrupoRubroEmplea);//this.jTableDatosTipoGrupoRubroEmpleaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGrupoRubroEmplea = new JButtonMe();
			this.jButtonCerrarOrderByTipoGrupoRubroEmplea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGrupoRubroEmplea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGrupoRubroEmplea.setToolTipText("Cancelar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGrupoRubroEmplea.add(this.jButtonCerrarOrderByTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGrupoRubroEmplea = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGrupoRubroEmplea= new JScrollPane(jPanelOrderByTipoGrupoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGrupoRubroEmplea);
			
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.getContentPane().add(this.jScrollPanelOrderByTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);			
		
		} else {
			this.jButtonAbrirOrderByTipoGrupoRubroEmplea = new JButtonMe();
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
			&& this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGrupoRubroEmplea.getRowHeight();//TipoGrupoRubroEmpleaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGrupoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea.isSelected()) {
					iHeightTable=TipoGrupoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGrupoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGrupoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGrupoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGrupoRubroEmplea.isSelected()) {
					iHeightTable=TipoGrupoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGrupoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGrupoRubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGrupoRubroEmplea!=null && this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogruporubroempleas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGrupoRubroEmplea> TraerTipoGrupoRubroEmpleaBeans(List<TipoGrupoRubroEmplea> tipogruporubroempleas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGrupoRubroEmplea tipogruporubroemplea:tipogruporubroempleas) {
					
				if(!(TipoGrupoRubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGrupoRubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogruporubroemplea.setsDetalleGeneralEntityReporte(TipoGrupoRubroEmpleaConstantesFunciones.getTipoGrupoRubroEmpleaDescripcion(tipogruporubroemplea));
										
						
					
						
					
				} else  {
							
					//tipogruporubroemplea.setsDetalleGeneralEntityReporte(tipogruporubroemplea.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogruporubroempleabeans.add(tipogruporubroempleabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogruporubroempleas;
    }
	//PARA REPORTES FIN
}
