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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoParamFactuSecuenciaTrabajoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoParamFactuSecuenciaTrabajoJInternalFrame extends TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoParamFactuSecuenciaTrabajo;
	
	protected JMenuBar jmenuBarTipoParamFactuSecuenciaTrabajo;
	
	protected JMenu jmenuTipoParamFactuSecuenciaTrabajo;
	protected JMenu jmenuDatosTipoParamFactuSecuenciaTrabajo;
	protected JMenu jmenuArchivoTipoParamFactuSecuenciaTrabajo;
	protected JMenu jmenuAccionesTipoParamFactuSecuenciaTrabajo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParamFactuSecuenciaTrabajo;	
	protected GridBagConstraints gridBagConstraintsTipoParamFactuSecuenciaTrabajo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParamFactuSecuenciaTrabajoSessionBean tipoparamfactusecuenciatrabajoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajos;		
	public List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosEliminados;	
	public List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo;		
	protected JButton jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo;
	
	
	//protected JPanel jPanelOrderByTipoParamFactuSecuenciaTrabajo;
	//public JScrollPane jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo;	
	//protected JButton jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoParamFactuSecuenciaTrabajoLogic tipoparamfactusecuenciatrabajoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoParamFactuSecuenciaTrabajo;
	public JScrollPane jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo;
	public JScrollPane jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoParamFactuSecuenciaTrabajoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo;
	//public JScrollPane jScrollPanelImportacionTipoParamFactuSecuenciaTrabajo;
	
	
	
	protected JPanel jPanelAccionesTipoParamFactuSecuenciaTrabajo;
	
    protected JPanel jPanelPaginacionTipoParamFactuSecuenciaTrabajo;
    protected JPanel jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo;
	protected JPanel jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo;
	protected JPanel jPanelParametrosAuxiliar2TipoParamFactuSecuenciaTrabajo;
	protected JPanel jPanelParametrosAuxiliar3TipoParamFactuSecuenciaTrabajo;
	protected JPanel jPanelParametrosAuxiliar4TipoParamFactuSecuenciaTrabajo;
	//protected JPanel jPanelParametrosAuxiliar5TipoParamFactuSecuenciaTrabajo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo;
	//protected JPanel jPanelImportacionTipoParamFactuSecuenciaTrabajo;
	
	
	public JTable jTableDatosTipoParamFactuSecuenciaTrabajo;
	
	
	
	//public JTable jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonDuplicarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonCopiarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonVerFormTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonModificarTipoParamFactuSecuenciaTrabajo;
	
    protected JButton jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonCerrarTipoParamFactuSecuenciaTrabajo;
	
	
	protected JButton jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo;
	
	
	protected JButton jButtonAnterioresTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonSiguientesTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo;
	//protected JButton jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajo;
	//protected JButton jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajo;
	//protected JButton jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajo;
	//protected JFileChooser jFileChooserImportacionTipoParamFactuSecuenciaTrabajo;
	//protected File fileImportacionTipoParamFactuSecuenciaTrabajo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonDuplicarToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonCopiarToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonVerFormToolBarTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonCerrarToolBarTipoParamFactuSecuenciaTrabajo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonProcesarInformacionToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonAnterioresToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonSiguientesToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonAbrirOrderByToolBarTipoParamFactuSecuenciaTrabajo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemDuplicarTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemCopiarTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemVerFormTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemCerrarTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemProcesarInformacionTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemAnterioresTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemSiguientesTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParamFactuSecuenciaTrabajo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo;
	protected JCheckBox jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo;
	protected JTextField jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoParamFactuSecuenciaTrabajo;
	//public JList<Reporte> jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo;
	//public JScrollPane jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoParamFactuSecuenciaTrabajo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoParamFactuSecuenciaTrabajo;
	
		
	//public JLabel jLabelArchivoImportacionTipoParamFactuSecuenciaTrabajo;	
	//public JLabel jLabelPathArchivoImportacionTipoParamFactuSecuenciaTrabajo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoParamFactuSecuenciaTrabajo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoParamFactuSecuenciaTrabajo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoParamFactuSecuenciaTrabajo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoParamFactuSecuenciaTrabajo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoParamFactuSecuenciaTrabajo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoParamFactuSecuenciaTrabajo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoParamFactuSecuenciaTrabajo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoParamFactuSecuenciaTrabajo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoParamFactuSecuenciaTrabajo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoParamFactuSecuenciaTrabajo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo;
	public JPanel jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo;
	public JLabel jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoParamFactuSecuenciaTrabajoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuSecuenciaTrabajoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuSecuenciaTrabajoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuSecuenciaTrabajoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo)	{
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo = jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo;
	}
	
	public JButton getjButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo() {
		return this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo)	{
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo = jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo() {
		return this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo;
	}
	
	
	public List<TipoParamFactuSecuenciaTrabajo> gettipoparamfactusecuenciatrabajos() {
		return this.tipoparamfactusecuenciatrabajos;
	}

	public void settipoparamfactusecuenciatrabajos(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajos) {
		this.tipoparamfactusecuenciatrabajos = tipoparamfactusecuenciatrabajos;
	}
	
	public List<TipoParamFactuSecuenciaTrabajo> gettipoparamfactusecuenciatrabajosAux() {
		return this.tipoparamfactusecuenciatrabajosAux;
	}

	public void settipoparamfactusecuenciatrabajosAux(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosAux) {
		this.tipoparamfactusecuenciatrabajosAux = tipoparamfactusecuenciatrabajosAux;
	}
	
	public List<TipoParamFactuSecuenciaTrabajo> gettipoparamfactusecuenciatrabajosEliminados() {
		return this.tipoparamfactusecuenciatrabajosEliminados;
	}

	public void setTipoParamFactuSecuenciaTrabajosEliminados(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosEliminados) {
		this.tipoparamfactusecuenciatrabajosEliminados = tipoparamfactusecuenciatrabajosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo() {
		return jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo = jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo() {
		return jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo;
	}

	public void setjTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo(
			JTextField jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo) {
		this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo = jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo;
	}

	public void setBorderResaltarValorCampoGeneralTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo() {
		return this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo;
	}

	public void setjCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo(
			JCheckBox jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo) {
		this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo = jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo;
	}

	public void setBorderResaltarSeleccionarTodosTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo() {
		return this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo;
	}

	public void setjCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo(
			JCheckBox jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo) {
		this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo = jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo;
	}
	
	public void setBorderResaltarSeleccionadosTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo() {
		return this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo = jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo() {
		return this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo = jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo() {
	//	return jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo) {
	//	this.jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo = jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo = jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo;
	//}
	
	public void setBorderResaltarTiposReportesTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo() {
		return this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo = jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo() {
		return this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo = jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo() {
		return this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo() {
		return this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo = jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo = jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoParamFactuSecuenciaTrabajo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo() {
	//	return jCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo) {
	//	this.jCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo = jCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoParamFactuSecuenciaTrabajo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo .setBorder(borderResaltar);		
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
		this.tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean();
		
		this.tipoparamfactusecuenciatrabajoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactusecuenciatrabajoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoParamFactuSecuenciaTrabajoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoParamFactuSecuenciaTrabajoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParamFactuSecuenciaTrabajoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParamFactuSecuenciaTrabajoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParamFactuSecuenciaTrabajoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Secuencia Trabajo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoParamFactuSecuenciaTrabajoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoParamFactuSecuenciaTrabajo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"nuevo","nuevo","Nuevo"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"duplicar","duplicar","Duplicar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"copiar","copiar","Copiar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"ver_form","ver_form","Ver"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"recargar","recargar","Recargar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,
							"cerrar","cerrar","Salir"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo;
			
				this.jButtonProcesarInformacionToolBarTipoParamFactuSecuenciaTrabajo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoParamFactuSecuenciaTrabajo;
				
		//protected JButton jButtonModificarToolBarTipoParamFactuSecuenciaTrabajo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoParamFactuSecuenciaTrabajo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoParamFactuSecuenciaTrabajo=new JMenuMe("General");
		this.jmenuArchivoTipoParamFactuSecuenciaTrabajo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoParamFactuSecuenciaTrabajo=new JMenuMe("Acciones");
		this.jmenuDatosTipoParamFactuSecuenciaTrabajo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoParamFactuSecuenciaTrabajo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoParamFactuSecuenciaTrabajo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoParamFactuSecuenciaTrabajo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoParamFactuSecuenciaTrabajo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoParamFactuSecuenciaTrabajo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoParamFactuSecuenciaTrabajo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoParamFactuSecuenciaTrabajo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoParamFactuSecuenciaTrabajo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoParamFactuSecuenciaTrabajo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoParamFactuSecuenciaTrabajo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoParamFactuSecuenciaTrabajo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoParamFactuSecuenciaTrabajo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoParamFactuSecuenciaTrabajo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoParamFactuSecuenciaTrabajo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoParamFactuSecuenciaTrabajo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoParamFactuSecuenciaTrabajo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo);
			
			this.jmenuAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo);
			this.jmenuAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo);
			this.jmenuAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo);
			this.jmenuAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo);		
			this.jmenuAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemDuplicarTipoParamFactuSecuenciaTrabajo);		
			this.jmenuAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemCopiarTipoParamFactuSecuenciaTrabajo);		
			this.jmenuAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemVerFormTipoParamFactuSecuenciaTrabajo);		
			
			this.jmenuDatosTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo);				
			this.jmenuDatosTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemAnterioresTipoParamFactuSecuenciaTrabajo);				
			this.jmenuDatosTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemSiguientesTipoParamFactuSecuenciaTrabajo);				
			this.jmenuDatosTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo);				
			this.jmenuDatosTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoParamFactuSecuenciaTrabajo.add(this.jmenuArchivoTipoParamFactuSecuenciaTrabajo);		
			this.jmenuBarTipoParamFactuSecuenciaTrabajo.add(this.jmenuAccionesTipoParamFactuSecuenciaTrabajo);		
			this.jmenuBarTipoParamFactuSecuenciaTrabajo.add(this.jmenuDatosTipoParamFactuSecuenciaTrabajo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoParamFactuSecuenciaTrabajo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoParamFactuSecuenciaTrabajo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoParamFactuSecuenciaTrabajo = new TipoParamFactuSecuenciaTrabajoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Secuencia Trabajo DATOS");
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo = new TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame(jDesktopPane,this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones(),this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo = null;//new TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParamFactuSecuenciaTrabajo= new GridBagLayout();
		
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo = new JTableMe();      
		
		String sToolTipTipoParamFactuSecuenciaTrabajo="";
		sToolTipTipoParamFactuSecuenciaTrabajo=TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParamFactuSecuenciaTrabajo+="(Facturacion.TipoParamFactuSecuenciaTrabajo)";
		}
		
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParamFactuSecuenciaTrabajo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setToolTipText(sToolTipTipoParamFactuSecuenciaTrabajo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoParamFactuSecuenciaTrabajo);
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setRowSelectionAllowed(true);
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonCopiarTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonVerFormTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Secuencia Trabajo";
		
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Secuencia Trabajos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setToolTipText("Acciones");
        this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo=new ReporteDinamicoJInternalFrame(TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoParamFactuSecuenciaTrabajo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo=new ImportacionJInternalFrame(TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoParamFactuSecuenciaTrabajo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.setText("Orden");
		this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo,false,this);
			
			//this.cargarOrderByTipoParamFactuSecuenciaTrabajo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo,true,this);
			
			//this.cargarOrderByTipoParamFactuSecuenciaTrabajo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.setText("Nuevo");
		this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo.setText("Duplicar");
		this.jButtonCopiarTipoParamFactuSecuenciaTrabajo.setText("Copiar");
		this.jButtonVerFormTipoParamFactuSecuenciaTrabajo.setText("Ver");
		this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.setText("Guardar");
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParamFactuSecuenciaTrabajo,"nuevo_button","Nuevo",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo,"duplicar_button","Duplicar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoParamFactuSecuenciaTrabajo,"copiar_button","Copiar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoParamFactuSecuenciaTrabajo,"ver_form","Ver",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo,"nuevorelaciones_button","Nuevo Rel",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo,"guardarcambiostabla_button","Guardar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParamFactuSecuenciaTrabajo,"cerrar_button","Salir",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.setToolTipText("Nuevo"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo.setToolTipText("Duplicar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoParamFactuSecuenciaTrabajo.setToolTipText("Copiar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoParamFactuSecuenciaTrabajo.setToolTipText("Ver"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.setToolTipText("Nuevo Rel"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.setToolTipText("Guardar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.setToolTipText("Salir"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParamFactuSecuenciaTrabajo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoParamFactuSecuenciaTrabajo"));
		
		//COPIAR
		sMapKey = "CopiarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonCopiarTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoParamFactuSecuenciaTrabajo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonVerFormTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoParamFactuSecuenciaTrabajo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoParamFactuSecuenciaTrabajo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonModificarTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoParamFactuSecuenciaTrabajo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParamFactuSecuenciaTrabajo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParamFactuSecuenciaTrabajo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoParamFactuSecuenciaTrabajo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoParamFactuSecuenciaTrabajo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoParamFactuSecuenciaTrabajo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoParamFactuSecuenciaTrabajo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setName("jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo"); 
		
		this.jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo.setName("jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.setText("Recargar");
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.setToolTipText("Recargar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo.setText("Procesar");
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo.setToolTipText("Procesar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setText("Accion");
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo = new JLabelMe();
		
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo.setText("Acciones");		
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		//this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo.setText("<<");
        this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		//this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo.setText(">>");
        this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo,"nuevoguardarcambios_button","Nue",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoParamFactuSecuenciaTrabajo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoParamFactuSecuenciaTrabajo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoParamFactuSecuenciaTrabajo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoParamFactuSecuenciaTrabajo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(this.getWidth(),TipoParamFactuSecuenciaTrabajoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuSecuenciaTrabajoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(this.getWidth(),TipoParamFactuSecuenciaTrabajoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuSecuenciaTrabajoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(this.getWidth(),TipoParamFactuSecuenciaTrabajoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuSecuenciaTrabajoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoParamFactuSecuenciaTrabajo = new GridBagLayout();

			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutPaginacionTipoParamFactuSecuenciaTrabajo);						
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
					
						
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
			
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
						
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonNuevoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
						
			
			
			if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 1;
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			}
			
			
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonCopiarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonVerFormTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonCerrarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
		
		
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagParametrosReportesTipoParamFactuSecuenciaTrabajo);
			this.jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo);
			
			
			this.jPanelParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo.setLayout(gridaBagParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo);
			this.jPanelParametrosAuxiliar2TipoParamFactuSecuenciaTrabajo.setLayout(gridaBagParametrosAuxiliar2TipoParamFactuSecuenciaTrabajo);
			this.jPanelParametrosAuxiliar3TipoParamFactuSecuenciaTrabajo.setLayout(gridaBagParametrosAuxiliar3TipoParamFactuSecuenciaTrabajo);
			this.jPanelParametrosAuxiliar4TipoParamFactuSecuenciaTrabajo.setLayout(gridaBagParametrosAuxiliar4TipoParamFactuSecuenciaTrabajo);
			//this.jPanelParametrosAuxiliar5TipoParamFactuSecuenciaTrabajo.setLayout(gridaBagParametrosAuxiliar2TipoParamFactuSecuenciaTrabajo);			
			
			
			
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo.add(this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jPanelParametrosAuxiliar1TipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jPanelParametrosAuxiliar4TipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jCheckBoxGenerarReporteTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jPanelParametrosAuxiliar2TipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jLabelAccionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
			
			
			/*
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParamFactuSecuenciaTrabajo.add(this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);															
				
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParamFactuSecuenciaTrabajo.add(this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jPanelParametrosAuxiliar3TipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
				
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
	
				
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.add(this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoParamFactuSecuenciaTrabajo = new GridBagLayout();

			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutDatosTipoParamFactuSecuenciaTrabajo);
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
			
			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.add(this.jTableDatosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setViewportView(this.jTableDatosTipoParamFactuSecuenciaTrabajo);
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setFillsViewportHeight(true);
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoParamFactuSecuenciaTrabajo= new GridBagLayout();
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutAccionesTipoParamFactuSecuenciaTrabajo);
		
		
		/*	
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
			
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.add(this.jButtonNuevoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoParamFactuSecuenciaTrabajo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);

		gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
		jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.add(jLabelnombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo, gridBagConstraintsTipoParamFactuSecuenciaTrabajo);

		gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 1;
		jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.add(jTextAreanombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo, gridBagConstraintsTipoParamFactuSecuenciaTrabajo);

		gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 1;
		gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =1;
		jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.add(jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo, gridBagConstraintsTipoParamFactuSecuenciaTrabajo);

		jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
		jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParamFactuSecuenciaTrabajo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();						
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;		
			//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;		
		//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);								
		
		
		/*
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		*/		
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =0;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
				
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoParamFactuSecuenciaTrabajo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutBusquedasParametrosTipoParamFactuSecuenciaTrabajo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			
			
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
			
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoParamFactuSecuenciaTrabajo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setName("jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo"); 
		
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutReporteDinamicoTipoParamFactuSecuenciaTrabajo);
		
		
		this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Secuencia Trabajos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoParamFactuSecuenciaTrabajo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jLabelColumnasSelectReporteTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo=new JScrollPane(this.jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo);
			
			this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jListColumnasSelectReporteTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo=new JScrollPane(this.jListRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo);
			
			this.jScrollRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoParamFactuSecuenciaTrabajo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoParamFactuSecuenciaTrabajo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jLabelGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setToolTipText("Generar EXCEL"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposReportesDinamicoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuSecuenciaTrabajo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuSecuenciaTrabajo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jLabelTiposArchivoReporteDinamicoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo.setToolTipText("Generar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo.setToolTipText("Cancelar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.add(this.jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo= new JScrollPane(jPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Secuencia Trabajos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoParamFactuSecuenciaTrabajo);
		this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoParamFactuSecuenciaTrabajo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.setName("jPanelImportacionTipoParamFactuSecuenciaTrabajo"); 
		
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutImportacionTipoParamFactuSecuenciaTrabajo);
		
		
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoParamFactuSecuenciaTrabajo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setResizable(true);
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setClosable(true);
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setResizable(true);
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setClosable(true);
	    this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Secuencia Trabajos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoParamFactuSecuenciaTrabajo = new JLabelMe();

		this.jLabelArchivoImportacionTipoParamFactuSecuenciaTrabajo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.add(this.jLabelArchivoImportacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoParamFactuSecuenciaTrabajo = new JFileChooser();		
		this.jFileChooserImportacionTipoParamFactuSecuenciaTrabajo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajo.setToolTipText("Generar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoParamFactuSecuenciaTrabajo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoParamFactuSecuenciaTrabajo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.add(this.jLabelPathArchivoImportacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoParamFactuSecuenciaTrabajo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.add(this.jTextFieldPathArchivoImportacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajo.setToolTipText("Generar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajo.setToolTipText("Cancelar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuSecuenciaTrabajo.add(this.jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoParamFactuSecuenciaTrabajo= new JScrollPane(jPanelImportacionTipoParamFactuSecuenciaTrabajo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoParamFactuSecuenciaTrabajo);
		this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getContentPane().add(this.jScrollPanelImportacionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoParamFactuSecuenciaTrabajo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo = new JButtonMe();
			this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.setText("Orden");
			this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoParamFactuSecuenciaTrabajo";
			inputMap = this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoParamFactuSecuenciaTrabajo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo.setName("jPanelOrderByTipoParamFactuSecuenciaTrabajo"); 
			
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutOrderByTipoParamFactuSecuenciaTrabajo);
			
			
			this.jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy = new JTableMe();        
			this.jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajoOrderBy.setViewportView(this.jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy);
			this.jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoParamFactuSecuenciaTrabajo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setTitle("Orden");
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setResizable(true);
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setClosable(true);
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Secuencia Trabajos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipady =150;
				
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo.add(jScrollPanelDatosTipoParamFactuSecuenciaTrabajoOrderBy, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);//this.jTableDatosTipoParamFactuSecuenciaTrabajoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajo = new JButtonMe();
			this.jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajo.setToolTipText("Cancelar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoParamFactuSecuenciaTrabajo.add(this.jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo= new JScrollPane(jPanelOrderByTipoParamFactuSecuenciaTrabajo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoParamFactuSecuenciaTrabajo);
			
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getContentPane().add(this.jScrollPanelOrderByTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
		
		} else {
			this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo = new JButtonMe();
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
			&& this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getRowHeight();//TipoParamFactuSecuenciaTrabajoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoParamFactuSecuenciaTrabajoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo.isSelected()) {
					iHeightTable=TipoParamFactuSecuenciaTrabajoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParamFactuSecuenciaTrabajoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParamFactuSecuenciaTrabajoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoParamFactuSecuenciaTrabajoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParamFactuSecuenciaTrabajo.isSelected()) {
					iHeightTable=TipoParamFactuSecuenciaTrabajoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParamFactuSecuenciaTrabajoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParamFactuSecuenciaTrabajoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo!=null && this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactusecuenciatrabajos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoParamFactuSecuenciaTrabajo> TraerTipoParamFactuSecuenciaTrabajoBeans(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:tipoparamfactusecuenciatrabajos) {
					
				if(!(TipoParamFactuSecuenciaTrabajoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoParamFactuSecuenciaTrabajoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoparamfactusecuenciatrabajo.setsDetalleGeneralEntityReporte(TipoParamFactuSecuenciaTrabajoConstantesFunciones.getTipoParamFactuSecuenciaTrabajoDescripcion(tipoparamfactusecuenciatrabajo));
										
						
					
						
					
				} else  {
							
					//tipoparamfactusecuenciatrabajo.setsDetalleGeneralEntityReporte(tipoparamfactusecuenciatrabajo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoparamfactusecuenciatrabajobeans.add(tipoparamfactusecuenciatrabajobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoparamfactusecuenciatrabajos;
    }
	//PARA REPORTES FIN
}
