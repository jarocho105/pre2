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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoConceptoFlujoCajaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoConceptoFlujoCajaJInternalFrame extends TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoConceptoFlujoCaja;
	
	protected JMenuBar jmenuBarTipoConceptoFlujoCaja;
	
	protected JMenu jmenuTipoConceptoFlujoCaja;
	protected JMenu jmenuDatosTipoConceptoFlujoCaja;
	protected JMenu jmenuArchivoTipoConceptoFlujoCaja;
	protected JMenu jmenuAccionesTipoConceptoFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoConceptoFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsTipoConceptoFlujoCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoConceptoFlujoCajaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoConceptoFlujoCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoConceptoFlujoCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoConceptoFlujoCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoConceptoFlujoCajaSessionBean tipoconceptoflujocajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoConceptoFlujoCaja> tipoconceptoflujocajas;		
	public List<TipoConceptoFlujoCaja> tipoconceptoflujocajasEliminados;	
	public List<TipoConceptoFlujoCaja> tipoconceptoflujocajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoConceptoFlujoCaja;		
	protected JButton jButtonAbrirOrderByTipoConceptoFlujoCaja;
	
	
	//protected JPanel jPanelOrderByTipoConceptoFlujoCaja;
	//public JScrollPane jScrollPanelOrderByTipoConceptoFlujoCaja;	
	//protected JButton jButtonCerrarOrderByTipoConceptoFlujoCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoConceptoFlujoCajaLogic tipoconceptoflujocajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoConceptoFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionTipoConceptoFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralTipoConceptoFlujoCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoConceptoFlujoCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoConceptoFlujoCaja;
	//public JScrollPane jScrollPanelImportacionTipoConceptoFlujoCaja;
	
	
	
	protected JPanel jPanelAccionesTipoConceptoFlujoCaja;
	
    protected JPanel jPanelPaginacionTipoConceptoFlujoCaja;
    protected JPanel jPanelParametrosReportesTipoConceptoFlujoCaja;
	protected JPanel jPanelParametrosReportesAccionesTipoConceptoFlujoCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoConceptoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar2TipoConceptoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar3TipoConceptoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar4TipoConceptoFlujoCaja;
	//protected JPanel jPanelParametrosAuxiliar5TipoConceptoFlujoCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoConceptoFlujoCaja;
	//protected JPanel jPanelImportacionTipoConceptoFlujoCaja;
	
	
	public JTable jTableDatosTipoConceptoFlujoCaja;
	
	
	
	//public JTable jTableDatosTipoConceptoFlujoCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoConceptoFlujoCaja;
	protected JButton jButtonDuplicarTipoConceptoFlujoCaja;
	protected JButton jButtonCopiarTipoConceptoFlujoCaja;
	protected JButton jButtonVerFormTipoConceptoFlujoCaja;
	protected JButton jButtonNuevoRelacionesTipoConceptoFlujoCaja;
	protected JButton jButtonModificarTipoConceptoFlujoCaja;
	
    protected JButton jButtonGuardarCambiosTablaTipoConceptoFlujoCaja;
	protected JButton jButtonCerrarTipoConceptoFlujoCaja;
	
	
	protected JButton jButtonRecargarInformacionTipoConceptoFlujoCaja;
	protected JButton jButtonProcesarInformacionTipoConceptoFlujoCaja;
	
	
	protected JButton jButtonAnterioresTipoConceptoFlujoCaja;
	protected JButton jButtonSiguientesTipoConceptoFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoConceptoFlujoCaja;
	//protected JButton jButtonCerrarReporteDinamicoTipoConceptoFlujoCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoConceptoFlujoCaja;
	//protected JButton jButtonGenerarImportacionTipoConceptoFlujoCaja;
	//protected JButton jButtonCerrarImportacionTipoConceptoFlujoCaja;
	//protected JFileChooser jFileChooserImportacionTipoConceptoFlujoCaja;
	//protected File fileImportacionTipoConceptoFlujoCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonDuplicarToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonCopiarToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonVerFormToolBarTipoConceptoFlujoCaja;
	public JButton jButtonGuardarCambiosTablaToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonCerrarToolBarTipoConceptoFlujoCaja;
	
	protected JButton jButtonRecargarInformacionToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonProcesarInformacionToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonAnterioresToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonSiguientesToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoConceptoFlujoCaja;
	protected JButton jButtonAbrirOrderByToolBarTipoConceptoFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemDuplicarTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemNuevoRelacionesTipoConceptoFlujoCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemCopiarTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemVerFormTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemCerrarTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemProcesarInformacionTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemAnterioresTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemSiguientesTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemAbrirOrderByTipoConceptoFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarTipoConceptoFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoConceptoFlujoCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja;
	protected JCheckBox jCheckBoxSeleccionadosTipoConceptoFlujoCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja;
	protected JCheckBox jCheckBoxConGraficoReporteTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoConceptoFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoConceptoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoConceptoFlujoCaja;
	protected JTextField jTextFieldValorCampoGeneralTipoConceptoFlujoCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoConceptoFlujoCaja;
	//public JList<Reporte> jListColumnasSelectReporteTipoConceptoFlujoCaja;
	//public JScrollPane jScrollColumnasSelectReporteTipoConceptoFlujoCaja;
	
	//public JLabel jLabelRelacionesSelectReporteTipoConceptoFlujoCaja;
	//public JList<Reporte> jListRelacionesSelectReporteTipoConceptoFlujoCaja;
	//public JScrollPane jScrollRelacionesSelectReporteTipoConceptoFlujoCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoConceptoFlujoCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoConceptoFlujoCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoConceptoFlujoCaja;
	
		
	//public JLabel jLabelArchivoImportacionTipoConceptoFlujoCaja;	
	//public JLabel jLabelPathArchivoImportacionTipoConceptoFlujoCaja;
	//protected JTextField jTextFieldPathArchivoImportacionTipoConceptoFlujoCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoConceptoFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoConceptoFlujoCaja;
	
	//public JLabel jLabelColumnaCategoriaValorTipoConceptoFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoConceptoFlujoCaja;
	
	//public JLabel jLabelColumnasValoresGraficoTipoConceptoFlujoCaja;
	//public JList<Reporte> jListColumnasValoresGraficoTipoConceptoFlujoCaja;
	//public JScrollPane jScrollColumnasValoresGraficoTipoConceptoFlujoCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoConceptoFlujoCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoConceptoFlujoCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoConceptoFlujoCaja;
	public JPanel jPanelBusquedaPorCodigoTipoConceptoFlujoCaja;
	public JButton jButtonBusquedaPorCodigoTipoConceptoFlujoCaja;
	public JPanel jPanelBusquedaPorIdTipoConceptoFlujoCaja;
	public JButton jButtonBusquedaPorIdTipoConceptoFlujoCaja;
	public JPanel jPanelBusquedaPorNombreTipoConceptoFlujoCaja;
	public JButton jButtonBusquedaPorNombreTipoConceptoFlujoCaja;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoConceptoFlujoCaja;
	public JButton jButtoncodigoBusquedaPorCodigoTipoConceptoFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelIdIdBusquedaPorIdTipoConceptoFlujoCaja;
	public JLabel jLabelidBusquedaPorIdTipoConceptoFlujoCaja;
	public JTextFieldMe jLabelidTipoConceptoFlujoCajaBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoConceptoFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoConceptoFlujoCaja;
	public JLabel jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoConceptoFlujoCaja;
	public JButton jButtonnombreBusquedaPorNombreTipoConceptoFlujoCajaBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoConceptoFlujoCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConceptoFlujoCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConceptoFlujoCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConceptoFlujoCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoConceptoFlujoCaja)	{
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja = jButtonRecargarInformacionTipoConceptoFlujoCaja;
	}
	
	public JButton getjButtonProcesarInformacionTipoConceptoFlujoCaja() {
		return this.jButtonProcesarInformacionTipoConceptoFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoConceptoFlujoCaja)	{
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja = jButtonProcesarInformacionTipoConceptoFlujoCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoConceptoFlujoCaja() {
		return this.jButtonRecargarInformacionTipoConceptoFlujoCaja;
	}
	
	
	public List<TipoConceptoFlujoCaja> gettipoconceptoflujocajas() {
		return this.tipoconceptoflujocajas;
	}

	public void settipoconceptoflujocajas(List<TipoConceptoFlujoCaja> tipoconceptoflujocajas) {
		this.tipoconceptoflujocajas = tipoconceptoflujocajas;
	}
	
	public List<TipoConceptoFlujoCaja> gettipoconceptoflujocajasAux() {
		return this.tipoconceptoflujocajasAux;
	}

	public void settipoconceptoflujocajasAux(List<TipoConceptoFlujoCaja> tipoconceptoflujocajasAux) {
		this.tipoconceptoflujocajasAux = tipoconceptoflujocajasAux;
	}
	
	public List<TipoConceptoFlujoCaja> gettipoconceptoflujocajasEliminados() {
		return this.tipoconceptoflujocajasEliminados;
	}

	public void setTipoConceptoFlujoCajasEliminados(List<TipoConceptoFlujoCaja> tipoconceptoflujocajasEliminados) {
		this.tipoconceptoflujocajasEliminados = tipoconceptoflujocajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoConceptoFlujoCaja() {
		return jComboBoxTiposSeleccionarTipoConceptoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposSeleccionarTipoConceptoFlujoCaja) {
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja = jComboBoxTiposSeleccionarTipoConceptoFlujoCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoConceptoFlujoCaja() {
		return jTextFieldValorCampoGeneralTipoConceptoFlujoCaja;
	}

	public void setjTextFieldValorCampoGeneralTipoConceptoFlujoCaja(
			JTextField jTextFieldValorCampoGeneralTipoConceptoFlujoCaja) {
		this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja = jTextFieldValorCampoGeneralTipoConceptoFlujoCaja;
	}

	public void setBorderResaltarValorCampoGeneralTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoConceptoFlujoCaja() {
		return this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja;
	}

	public void setjCheckBoxSeleccionarTodosTipoConceptoFlujoCaja(
			JCheckBox jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja) {
		this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja = jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja;
	}

	public void setBorderResaltarSeleccionarTodosTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoConceptoFlujoCaja() {
		return this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja;
	}

	public void setjCheckBoxSeleccionadosTipoConceptoFlujoCaja(
			JCheckBox jCheckBoxSeleccionadosTipoConceptoFlujoCaja) {
		this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja = jCheckBoxSeleccionadosTipoConceptoFlujoCaja;
	}
	
	public void setBorderResaltarSeleccionadosTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoConceptoFlujoCaja() {
		return this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja) {
		this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja = jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja;
	}

	public void setBorderResaltarTiposArchivosReportesTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoConceptoFlujoCaja() {
		return this.jComboBoxTiposReportesTipoConceptoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposReportesTipoConceptoFlujoCaja) {
		this.jComboBoxTiposReportesTipoConceptoFlujoCaja = jComboBoxTiposReportesTipoConceptoFlujoCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja() {
	//	return jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja) {
	//	this.jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja = jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja = jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja;
	//}
	
	public void setBorderResaltarTiposReportesTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoConceptoFlujoCaja() {
		return this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja) {
		this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja = jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoConceptoFlujoCaja() {
		return this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposPaginacionTipoConceptoFlujoCaja) {
		this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja = jComboBoxTiposPaginacionTipoConceptoFlujoCaja;
	}
	
	public void setBorderResaltarTiposPaginacionTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoConceptoFlujoCaja() {
		return this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoConceptoFlujoCaja() {
		return this.jComboBoxTiposAccionesTipoConceptoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposRelacionesTipoConceptoFlujoCaja) {
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja = jComboBoxTiposRelacionesTipoConceptoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoConceptoFlujoCaja(
			JComboBox jComboBoxTiposAccionesTipoConceptoFlujoCaja) {
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja = jComboBoxTiposAccionesTipoConceptoFlujoCaja;
	}
	
	public void setBorderResaltarTiposRelacionesTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoConceptoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja() {
	//	return jCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja) {
	//	this.jCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja = jCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoConceptoFlujoCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoConceptoFlujoCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja .setBorder(borderResaltar);		
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
		this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
		
		this.tipoconceptoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconceptoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoConceptoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoConceptoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoConceptoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoConceptoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoConceptoFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Concepto Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoConceptoFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoConceptoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoConceptoFlujoCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"nuevo","nuevo","Nuevo"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"duplicar","duplicar","Duplicar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"copiar","copiar","Copiar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"ver_form","ver_form","Ver"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"recargar","recargar","Recargar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoConceptoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,
							"cerrar","cerrar","Salir"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja;
			
				this.jButtonProcesarInformacionToolBarTipoConceptoFlujoCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoConceptoFlujoCaja;
				
		//protected JButton jButtonModificarToolBarTipoConceptoFlujoCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoConceptoFlujoCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoConceptoFlujoCaja=new JMenuMe("General");
		this.jmenuArchivoTipoConceptoFlujoCaja=new JMenuMe("Archivo");
		this.jmenuAccionesTipoConceptoFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDatosTipoConceptoFlujoCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoConceptoFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoConceptoFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoConceptoFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoConceptoFlujoCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoConceptoFlujoCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoConceptoFlujoCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoConceptoFlujoCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoConceptoFlujoCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoConceptoFlujoCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoConceptoFlujoCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoConceptoFlujoCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoConceptoFlujoCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoConceptoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoConceptoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoConceptoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoConceptoFlujoCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoConceptoFlujoCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoConceptoFlujoCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoConceptoFlujoCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoConceptoFlujoCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoConceptoFlujoCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoConceptoFlujoCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoConceptoFlujoCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoConceptoFlujoCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoConceptoFlujoCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoConceptoFlujoCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoConceptoFlujoCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoConceptoFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoConceptoFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoConceptoFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoConceptoFlujoCaja.add(this.jMenuItemCerrarTipoConceptoFlujoCaja);
			
			this.jmenuAccionesTipoConceptoFlujoCaja.add(this.jMenuItemNuevoTipoConceptoFlujoCaja);
			this.jmenuAccionesTipoConceptoFlujoCaja.add(this.jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja);
			this.jmenuAccionesTipoConceptoFlujoCaja.add(this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja);
			this.jmenuAccionesTipoConceptoFlujoCaja.add(this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja);		
			this.jmenuAccionesTipoConceptoFlujoCaja.add(this.jMenuItemDuplicarTipoConceptoFlujoCaja);		
			this.jmenuAccionesTipoConceptoFlujoCaja.add(this.jMenuItemCopiarTipoConceptoFlujoCaja);		
			this.jmenuAccionesTipoConceptoFlujoCaja.add(this.jMenuItemVerFormTipoConceptoFlujoCaja);		
			
			this.jmenuDatosTipoConceptoFlujoCaja.add(this.jMenuItemRecargarInformacionTipoConceptoFlujoCaja);				
			this.jmenuDatosTipoConceptoFlujoCaja.add(this.jMenuItemAnterioresTipoConceptoFlujoCaja);				
			this.jmenuDatosTipoConceptoFlujoCaja.add(this.jMenuItemSiguientesTipoConceptoFlujoCaja);				
			this.jmenuDatosTipoConceptoFlujoCaja.add(this.jMenuItemAbrirOrderByTipoConceptoFlujoCaja);				
			this.jmenuDatosTipoConceptoFlujoCaja.add(this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoConceptoFlujoCaja.add(this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoConceptoFlujoCaja.add(this.jmenuArchivoTipoConceptoFlujoCaja);		
			this.jmenuBarTipoConceptoFlujoCaja.add(this.jmenuAccionesTipoConceptoFlujoCaja);		
			this.jmenuBarTipoConceptoFlujoCaja.add(this.jmenuDatosTipoConceptoFlujoCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoConceptoFlujoCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoConceptoFlujoCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoConceptoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoConceptoFlujoCaja.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoConceptoFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoConceptoFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoConceptoFlujoCaja.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoConceptoFlujoCaja,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoConceptoFlujoCaja= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdTipoConceptoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoConceptoFlujoCaja.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoConceptoFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorIdTipoConceptoFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorIdTipoConceptoFlujoCaja.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoConceptoFlujoCaja,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoConceptoFlujoCaja = new JLabelMe();
		jLabelidBusquedaPorIdTipoConceptoFlujoCaja.setText("Id :");
		jLabelidBusquedaPorIdTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidTipoConceptoFlujoCajaBusquedaPorId= new JTextFieldMe();
		jLabelidTipoConceptoFlujoCajaBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoConceptoFlujoCajaBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoConceptoFlujoCajaBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoConceptoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoConceptoFlujoCaja.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoConceptoFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoConceptoFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoConceptoFlujoCaja.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoConceptoFlujoCaja,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoConceptoFlujoCaja= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoConceptoFlujoCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoConceptoFlujoCaja = new TipoConceptoFlujoCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Concepto Flujo Caja DATOS");
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja = new TipoConceptoFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones(),this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja = null;//new TipoConceptoFlujoCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoConceptoFlujoCaja= new GridBagLayout();
		
		
		this.jTableDatosTipoConceptoFlujoCaja = new JTableMe();      
		
		String sToolTipTipoConceptoFlujoCaja="";
		sToolTipTipoConceptoFlujoCaja=TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoConceptoFlujoCaja+="(Tesoreria.TipoConceptoFlujoCaja)";
		}
		
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoConceptoFlujoCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoConceptoFlujoCaja.setToolTipText(sToolTipTipoConceptoFlujoCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoConceptoFlujoCaja);
		this.jTableDatosTipoConceptoFlujoCaja.setAutoCreateRowSorter(true);
		this.jTableDatosTipoConceptoFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoConceptoFlujoCaja.setRowSelectionAllowed(true);
		this.jTableDatosTipoConceptoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoConceptoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonDuplicarTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonCopiarTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonVerFormTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonNuevoRelacionesTipoConceptoFlujoCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonCerrarTipoConceptoFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosTipoConceptoFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Concepto Flujo Caja";
		
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Concepto Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoConceptoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoConceptoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesTipoConceptoFlujoCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja=new ReporteDinamicoJInternalFrame(TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoConceptoFlujoCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoConceptoFlujoCaja=new ImportacionJInternalFrame(TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoConceptoFlujoCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoConceptoFlujoCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoConceptoFlujoCaja.setText("Orden");
		this.jButtonAbrirOrderByTipoConceptoFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoConceptoFlujoCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoConceptoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConceptoFlujoCaja,false,this);
			
			//this.cargarOrderByTipoConceptoFlujoCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoConceptoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConceptoFlujoCaja,true,this);
			
			//this.cargarOrderByTipoConceptoFlujoCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoConceptoFlujoCaja.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoConceptoFlujoCaja.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoConceptoFlujoCaja.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoConceptoFlujoCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoConceptoFlujoCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoConceptoFlujoCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoConceptoFlujoCaja.setText("Nuevo");
		this.jButtonDuplicarTipoConceptoFlujoCaja.setText("Duplicar");
		this.jButtonCopiarTipoConceptoFlujoCaja.setText("Copiar");
		this.jButtonVerFormTipoConceptoFlujoCaja.setText("Ver");
		this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.setText("Guardar");
		this.jButtonCerrarTipoConceptoFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoConceptoFlujoCaja,"nuevo_button","Nuevo",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoConceptoFlujoCaja,"duplicar_button","Duplicar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoConceptoFlujoCaja,"copiar_button","Copiar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoConceptoFlujoCaja,"ver_form","Ver",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoConceptoFlujoCaja,"nuevorelaciones_button","Nuevo Rel",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja,"guardarcambiostabla_button","Guardar",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoConceptoFlujoCaja,"cerrar_button","Salir",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoConceptoFlujoCaja.setToolTipText("Nuevo"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoConceptoFlujoCaja.setToolTipText("Duplicar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoConceptoFlujoCaja.setToolTipText("Copiar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoConceptoFlujoCaja.setToolTipText("Ver"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.setToolTipText("Nuevo Rel"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.setToolTipText("Guardar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoConceptoFlujoCaja.setToolTipText("Salir"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoConceptoFlujoCaja";
		inputMap = this.jButtonNuevoTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoConceptoFlujoCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoConceptoFlujoCaja";
		inputMap = this.jButtonDuplicarTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoConceptoFlujoCaja"));
		
		//COPIAR
		sMapKey = "CopiarTipoConceptoFlujoCaja";
		inputMap = this.jButtonCopiarTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoConceptoFlujoCaja"));
		
		//VEr FORM
		sMapKey = "VerFormTipoConceptoFlujoCaja";
		inputMap = this.jButtonVerFormTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoConceptoFlujoCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoConceptoFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoConceptoFlujoCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoConceptoFlujoCaja";
		inputMap = this.jButtonModificarTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoConceptoFlujoCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoConceptoFlujoCaja";
		inputMap = this.jButtonCerrarTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoConceptoFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoConceptoFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoConceptoFlujoCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoConceptoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoConceptoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoConceptoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoConceptoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoConceptoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoConceptoFlujoCaja.setName("jPanelParametrosReportesTipoConceptoFlujoCaja"); 
		
		this.jPanelParametrosReportesAccionesTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoConceptoFlujoCaja.setName("jPanelParametrosReportesAccionesTipoConceptoFlujoCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja.setText("Recargar");
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja.setToolTipText("Recargar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoConceptoFlujoCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja.setText("Procesar");
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja.setToolTipText("Procesar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja.setVisible(false);
			
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposReportesTipoConceptoFlujoCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.setText("Accion");
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoConceptoFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesTipoConceptoFlujoCaja.setText("Acciones");		
		this.jLabelAccionesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoConceptoFlujoCaja = new JButtonMe();
		//this.jButtonAnterioresTipoConceptoFlujoCaja.setText("<<");
        this.jButtonAnterioresTipoConceptoFlujoCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoConceptoFlujoCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoConceptoFlujoCaja = new JButtonMe();
		//this.jButtonSiguientesTipoConceptoFlujoCaja.setText(">>");
        this.jButtonSiguientesTipoConceptoFlujoCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoConceptoFlujoCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja,"nuevoguardarcambios_button","Nue",this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoConceptoFlujoCaja";
		inputMap = this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoConceptoFlujoCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoConceptoFlujoCaja";
		inputMap = this.jButtonRecargarInformacionTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoConceptoFlujoCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoConceptoFlujoCaja";
		inputMap = this.jButtonSiguientesTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoConceptoFlujoCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoConceptoFlujoCaja";
		inputMap = this.jButtonAnterioresTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoConceptoFlujoCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoConceptoFlujoCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),TipoConceptoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConceptoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),TipoConceptoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConceptoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),TipoConceptoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConceptoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoConceptoFlujoCaja = new GridBagLayout();

			this.jPanelPaginacionTipoConceptoFlujoCaja.setLayout(gridaBagLayoutPaginacionTipoConceptoFlujoCaja);						
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonAnterioresTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
					
						
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
			
			this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
						
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
			this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonSiguientesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonNuevoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
						
			
			
			if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
				this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			}
			
			
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonDuplicarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonCopiarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonVerFormTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoConceptoFlujoCaja.add(this.jButtonCerrarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
		
		
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoConceptoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoConceptoFlujoCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoConceptoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoConceptoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoConceptoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoConceptoFlujoCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.setLayout(gridaBagParametrosReportesTipoConceptoFlujoCaja);
			this.jPanelParametrosReportesAccionesTipoConceptoFlujoCaja.setLayout(gridaBagParametrosReportesAccionesTipoConceptoFlujoCaja);
			
			
			this.jPanelParametrosAuxiliar1TipoConceptoFlujoCaja.setLayout(gridaBagParametrosAuxiliar1TipoConceptoFlujoCaja);
			this.jPanelParametrosAuxiliar2TipoConceptoFlujoCaja.setLayout(gridaBagParametrosAuxiliar2TipoConceptoFlujoCaja);
			this.jPanelParametrosAuxiliar3TipoConceptoFlujoCaja.setLayout(gridaBagParametrosAuxiliar3TipoConceptoFlujoCaja);
			this.jPanelParametrosAuxiliar4TipoConceptoFlujoCaja.setLayout(gridaBagParametrosAuxiliar4TipoConceptoFlujoCaja);
			//this.jPanelParametrosAuxiliar5TipoConceptoFlujoCaja.setLayout(gridaBagParametrosAuxiliar2TipoConceptoFlujoCaja);			
			
			
			
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jButtonRecargarInformacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConceptoFlujoCaja.add(this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConceptoFlujoCaja.add(this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConceptoFlujoCaja.add(this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jPanelParametrosAuxiliar1TipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoConceptoFlujoCaja.add(this.jComboBoxTiposReportesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jPanelParametrosAuxiliar4TipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jComboBoxTiposReportesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jCheckBoxGenerarReporteTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jPanelParametrosAuxiliar2TipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jLabelAccionesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jButtonAbrirOrderByTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);			
			
			
			/*
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoConceptoFlujoCaja.add(this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);															
				
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoConceptoFlujoCaja.add(this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jPanelParametrosAuxiliar3TipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.add(this.jComboBoxTiposAccionesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoConceptoFlujoCaja = new GridBagLayout();

			this.jScrollPanelDatosTipoConceptoFlujoCaja.setLayout(gridaBagLayoutDatosTipoConceptoFlujoCaja);
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
			
			this.jScrollPanelDatosTipoConceptoFlujoCaja.add(this.jTableDatosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoConceptoFlujoCaja.setViewportView(this.jTableDatosTipoConceptoFlujoCaja);
		this.jTableDatosTipoConceptoFlujoCaja.setFillsViewportHeight(true);
		this.jTableDatosTipoConceptoFlujoCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoConceptoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesTipoConceptoFlujoCaja.setLayout(gridaBagLayoutAccionesTipoConceptoFlujoCaja);
		
		
		/*	
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
			
		this.jPanelAccionesTipoConceptoFlujoCaja.add(this.jButtonNuevoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoConceptoFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoConceptoFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoConceptoFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoConceptoFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoConceptoFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoConceptoFlujoCaja.setLayout(gridaBagLayoutBusquedaPorCodigoTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
		jPanelBusquedaPorCodigoTipoConceptoFlujoCaja.add(jLabelcodigoBusquedaPorCodigoTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx = 1;
		jPanelBusquedaPorCodigoTipoConceptoFlujoCaja.add(jTextFieldcodigoBusquedaPorCodigoTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx =1;
		jPanelBusquedaPorCodigoTipoConceptoFlujoCaja.add(jButtonBusquedaPorCodigoTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);

		jTabbedPaneBusquedasTipoConceptoFlujoCaja.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoConceptoFlujoCaja);
		jTabbedPaneBusquedasTipoConceptoFlujoCaja.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdTipoConceptoFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoConceptoFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoConceptoFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoConceptoFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoConceptoFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoConceptoFlujoCaja.setLayout(gridaBagLayoutBusquedaPorIdTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
		jPanelBusquedaPorIdTipoConceptoFlujoCaja.add(jLabelidBusquedaPorIdTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx = 1;
		jPanelBusquedaPorIdTipoConceptoFlujoCaja.add(jLabelidTipoConceptoFlujoCajaBusquedaPorId, gridBagConstraintsTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx =1;
		jPanelBusquedaPorIdTipoConceptoFlujoCaja.add(jButtonBusquedaPorIdTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);

		jTabbedPaneBusquedasTipoConceptoFlujoCaja.addTab("2.-Por Id ", jPanelBusquedaPorIdTipoConceptoFlujoCaja);
		jTabbedPaneBusquedasTipoConceptoFlujoCaja.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoConceptoFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoConceptoFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoConceptoFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoConceptoFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoConceptoFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoConceptoFlujoCaja.setLayout(gridaBagLayoutBusquedaPorNombreTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
		jPanelBusquedaPorNombreTipoConceptoFlujoCaja.add(jLabelnombreBusquedaPorNombreTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx = 1;
		jPanelBusquedaPorNombreTipoConceptoFlujoCaja.add(jTextAreanombreBusquedaPorNombreTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);

		gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoConceptoFlujoCaja.gridy = 1;
		gridBagConstraintsTipoConceptoFlujoCaja.gridx =1;
		jPanelBusquedaPorNombreTipoConceptoFlujoCaja.add(jButtonBusquedaPorNombreTipoConceptoFlujoCaja, gridBagConstraintsTipoConceptoFlujoCaja);

		jTabbedPaneBusquedasTipoConceptoFlujoCaja.addTab("3.-Por Nombre ", jPanelBusquedaPorNombreTipoConceptoFlujoCaja);
		jTabbedPaneBusquedasTipoConceptoFlujoCaja.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoConceptoFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoConceptoFlujoCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsTipoConceptoFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;		
		//this.gridBagConstraintsTipoConceptoFlujoCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoConceptoFlujoCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;		
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoConceptoFlujoCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);								
		
		
		/*
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		*/		
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =0;
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoConceptoFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
				
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoConceptoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoConceptoFlujoCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoConceptoFlujoCaja.setLayout(gridaBagLayoutBusquedasParametrosTipoConceptoFlujoCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
			
			
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
			
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoConceptoFlujoCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoConceptoFlujoCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoConceptoFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.setName("jPanelReporteDinamicoTipoConceptoFlujoCaja"); 
		
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.setLayout(gridaBagLayoutReporteDinamicoTipoConceptoFlujoCaja);
		
		
		this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Concepto Flujo Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoConceptoFlujoCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoConceptoFlujoCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jLabelColumnasSelectReporteTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoConceptoFlujoCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoConceptoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoConceptoFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoConceptoFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoConceptoFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoConceptoFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja=new JScrollPane(this.jListColumnasSelectReporteTipoConceptoFlujoCaja);
			
			this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jListColumnasSelectReporteTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoConceptoFlujoCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoConceptoFlujoCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoConceptoFlujoCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoConceptoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoConceptoFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoConceptoFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoConceptoFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoConceptoFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoConceptoFlujoCaja=new JScrollPane(this.jListRelacionesSelectReporteTipoConceptoFlujoCaja);
			
			this.jScrollRelacionesSelectReporteTipoConceptoFlujoCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoConceptoFlujoCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoConceptoFlujoCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoConceptoFlujoCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoConceptoFlujoCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoConceptoFlujoCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoConceptoFlujoCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoConceptoFlujoCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jLabelGenerarExcelReporteDinamicoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCaja.setToolTipText("Generar EXCEL"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jComboBoxTiposReportesDinamicoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoConceptoFlujoCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoConceptoFlujoCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jLabelTiposArchivoReporteDinamicoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jComboBoxTiposArchivosReportesDinamicoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoConceptoFlujoCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoConceptoFlujoCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoConceptoFlujoCaja.setToolTipText("Generar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jButtonGenerarReporteDinamicoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoConceptoFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoConceptoFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoConceptoFlujoCaja.setToolTipText("Cancelar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConceptoFlujoCaja.add(this.jButtonCerrarReporteDinamicoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoConceptoFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja= new JScrollPane(jPanelReporteDinamicoTipoConceptoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Concepto Flujo Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoConceptoFlujoCaja);
		this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getContentPane().add(this.jScrollPanelReporteDinamicoTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoConceptoFlujoCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoConceptoFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoConceptoFlujoCaja.setName("jPanelImportacionTipoConceptoFlujoCaja"); 
		
		this.jPanelImportacionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoConceptoFlujoCaja.setLayout(gridaBagLayoutImportacionTipoConceptoFlujoCaja);
		
		
		this.jInternalFrameImportacionTipoConceptoFlujoCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoConceptoFlujoCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoConceptoFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionTipoConceptoFlujoCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Concepto Flujo Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoConceptoFlujoCaja = new JLabelMe();

		this.jLabelArchivoImportacionTipoConceptoFlujoCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoConceptoFlujoCaja.add(this.jLabelArchivoImportacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoConceptoFlujoCaja = new JFileChooser();		
		this.jFileChooserImportacionTipoConceptoFlujoCaja.setToolTipText("ESCOGER ARCHIVO"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonAbrirImportacionTipoConceptoFlujoCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoConceptoFlujoCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoConceptoFlujoCaja.setToolTipText("Generar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConceptoFlujoCaja.add(this.jButtonAbrirImportacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoConceptoFlujoCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoConceptoFlujoCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoConceptoFlujoCaja.add(this.jLabelPathArchivoImportacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoConceptoFlujoCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoConceptoFlujoCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoConceptoFlujoCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoConceptoFlujoCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConceptoFlujoCaja.add(this.jTextFieldPathArchivoImportacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonGenerarImportacionTipoConceptoFlujoCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoConceptoFlujoCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoConceptoFlujoCaja.setToolTipText("Generar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConceptoFlujoCaja.add(this.jButtonGenerarImportacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoConceptoFlujoCaja = new JButtonMe();
		this.jButtonCerrarImportacionTipoConceptoFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoConceptoFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoConceptoFlujoCaja.setToolTipText("Cancelar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConceptoFlujoCaja.add(this.jButtonCerrarImportacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoConceptoFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoConceptoFlujoCaja= new JScrollPane(jPanelImportacionTipoConceptoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoConceptoFlujoCaja);
		this.jInternalFrameImportacionTipoConceptoFlujoCaja.getContentPane().add(this.jScrollPanelImportacionTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoConceptoFlujoCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoConceptoFlujoCaja = new JButtonMe();
			this.jButtonAbrirOrderByTipoConceptoFlujoCaja.setText("Orden");
			this.jButtonAbrirOrderByTipoConceptoFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoConceptoFlujoCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoConceptoFlujoCaja";
			inputMap = this.jButtonAbrirOrderByTipoConceptoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoConceptoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoConceptoFlujoCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoConceptoFlujoCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoConceptoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoConceptoFlujoCaja.setName("jPanelOrderByTipoConceptoFlujoCaja"); 
			
			this.jPanelOrderByTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoConceptoFlujoCaja.setLayout(gridaBagLayoutOrderByTipoConceptoFlujoCaja);
			
			
			this.jTableDatosTipoConceptoFlujoCajaOrderBy = new JTableMe();        
			this.jTableDatosTipoConceptoFlujoCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoConceptoFlujoCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoConceptoFlujoCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoConceptoFlujoCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoConceptoFlujoCajaOrderBy.setViewportView(this.jTableDatosTipoConceptoFlujoCajaOrderBy);
			this.jTableDatosTipoConceptoFlujoCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoConceptoFlujoCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoConceptoFlujoCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoConceptoFlujoCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoConceptoFlujoCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoConceptoFlujoCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setTitle("Orden");
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setResizable(true);
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setClosable(true);
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoConceptoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Concepto Flujo Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoConceptoFlujoCaja.ipady =150;
				
			this.jPanelOrderByTipoConceptoFlujoCaja.add(jScrollPanelDatosTipoConceptoFlujoCajaOrderBy, this.gridBagConstraintsTipoConceptoFlujoCaja);//this.jTableDatosTipoConceptoFlujoCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoConceptoFlujoCaja = new JButtonMe();
			this.jButtonCerrarOrderByTipoConceptoFlujoCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoConceptoFlujoCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoConceptoFlujoCaja.setToolTipText("Cancelar"+" "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoConceptoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoConceptoFlujoCaja.add(this.jButtonCerrarOrderByTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoConceptoFlujoCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoConceptoFlujoCaja= new JScrollPane(jPanelOrderByTipoConceptoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoConceptoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoConceptoFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoConceptoFlujoCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoConceptoFlujoCaja);
			
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.getContentPane().add(this.jScrollPanelOrderByTipoConceptoFlujoCaja, this.gridBagConstraintsTipoConceptoFlujoCaja);			
		
		} else {
			this.jButtonAbrirOrderByTipoConceptoFlujoCaja = new JButtonMe();
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
			&& this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoConceptoFlujoCaja.getRowHeight();//TipoConceptoFlujoCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoConceptoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja.isSelected()) {
					iHeightTable=TipoConceptoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoConceptoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoConceptoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoConceptoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoConceptoFlujoCaja.isSelected()) {
					iHeightTable=TipoConceptoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoConceptoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoConceptoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoConceptoFlujoCaja!=null && this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoConceptoFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoConceptoFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoConceptoFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconceptoflujocajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoConceptoFlujoCaja> TraerTipoConceptoFlujoCajaBeans(List<TipoConceptoFlujoCaja> tipoconceptoflujocajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoConceptoFlujoCaja tipoconceptoflujocaja:tipoconceptoflujocajas) {
					
				if(!(TipoConceptoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoConceptoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoconceptoflujocaja.setsDetalleGeneralEntityReporte(TipoConceptoFlujoCajaConstantesFunciones.getTipoConceptoFlujoCajaDescripcion(tipoconceptoflujocaja));
										
						
					
						
					
				} else  {
							
					//tipoconceptoflujocaja.setsDetalleGeneralEntityReporte(tipoconceptoflujocaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoconceptoflujocajabeans.add(tipoconceptoflujocajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoconceptoflujocajas;
    }
	//PARA REPORTES FIN
}
