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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoLineaFlujoCajaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoLineaFlujoCajaJInternalFrame extends TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoLineaFlujoCaja;
	
	protected JMenuBar jmenuBarTipoLineaFlujoCaja;
	
	protected JMenu jmenuTipoLineaFlujoCaja;
	protected JMenu jmenuDatosTipoLineaFlujoCaja;
	protected JMenu jmenuArchivoTipoLineaFlujoCaja;
	protected JMenu jmenuAccionesTipoLineaFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoLineaFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsTipoLineaFlujoCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoLineaFlujoCajaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoLineaFlujoCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoLineaFlujoCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoLineaFlujoCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoLineaFlujoCajaSessionBean tipolineaflujocajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoLineaFlujoCaja> tipolineaflujocajas;		
	public List<TipoLineaFlujoCaja> tipolineaflujocajasEliminados;	
	public List<TipoLineaFlujoCaja> tipolineaflujocajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoLineaFlujoCaja;		
	protected JButton jButtonAbrirOrderByTipoLineaFlujoCaja;
	
	
	//protected JPanel jPanelOrderByTipoLineaFlujoCaja;
	//public JScrollPane jScrollPanelOrderByTipoLineaFlujoCaja;	
	//protected JButton jButtonCerrarOrderByTipoLineaFlujoCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoLineaFlujoCajaLogic tipolineaflujocajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoLineaFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionTipoLineaFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralTipoLineaFlujoCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoLineaFlujoCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoLineaFlujoCaja;
	//public JScrollPane jScrollPanelImportacionTipoLineaFlujoCaja;
	
	
	
	protected JPanel jPanelAccionesTipoLineaFlujoCaja;
	
    protected JPanel jPanelPaginacionTipoLineaFlujoCaja;
    protected JPanel jPanelParametrosReportesTipoLineaFlujoCaja;
	protected JPanel jPanelParametrosReportesAccionesTipoLineaFlujoCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoLineaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar2TipoLineaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar3TipoLineaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar4TipoLineaFlujoCaja;
	//protected JPanel jPanelParametrosAuxiliar5TipoLineaFlujoCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoLineaFlujoCaja;
	//protected JPanel jPanelImportacionTipoLineaFlujoCaja;
	
	
	public JTable jTableDatosTipoLineaFlujoCaja;
	
	
	
	//public JTable jTableDatosTipoLineaFlujoCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoLineaFlujoCaja;
	protected JButton jButtonDuplicarTipoLineaFlujoCaja;
	protected JButton jButtonCopiarTipoLineaFlujoCaja;
	protected JButton jButtonVerFormTipoLineaFlujoCaja;
	protected JButton jButtonNuevoRelacionesTipoLineaFlujoCaja;
	protected JButton jButtonModificarTipoLineaFlujoCaja;
	
    protected JButton jButtonGuardarCambiosTablaTipoLineaFlujoCaja;
	protected JButton jButtonCerrarTipoLineaFlujoCaja;
	
	
	protected JButton jButtonRecargarInformacionTipoLineaFlujoCaja;
	protected JButton jButtonProcesarInformacionTipoLineaFlujoCaja;
	
	
	protected JButton jButtonAnterioresTipoLineaFlujoCaja;
	protected JButton jButtonSiguientesTipoLineaFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosTipoLineaFlujoCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoLineaFlujoCaja;
	//protected JButton jButtonCerrarReporteDinamicoTipoLineaFlujoCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoLineaFlujoCaja;
	//protected JButton jButtonGenerarImportacionTipoLineaFlujoCaja;
	//protected JButton jButtonCerrarImportacionTipoLineaFlujoCaja;
	//protected JFileChooser jFileChooserImportacionTipoLineaFlujoCaja;
	//protected File fileImportacionTipoLineaFlujoCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoLineaFlujoCaja;
	protected JButton jButtonDuplicarToolBarTipoLineaFlujoCaja;
	protected JButton jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoLineaFlujoCaja;
	protected JButton jButtonCopiarToolBarTipoLineaFlujoCaja;
	protected JButton jButtonVerFormToolBarTipoLineaFlujoCaja;
	public JButton jButtonGuardarCambiosTablaToolBarTipoLineaFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoLineaFlujoCaja;
	protected JButton jButtonCerrarToolBarTipoLineaFlujoCaja;
	
	protected JButton jButtonRecargarInformacionToolBarTipoLineaFlujoCaja;
	protected JButton jButtonProcesarInformacionToolBarTipoLineaFlujoCaja;
	protected JButton jButtonAnterioresToolBarTipoLineaFlujoCaja;
	protected JButton jButtonSiguientesToolBarTipoLineaFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoLineaFlujoCaja;
	protected JButton jButtonAbrirOrderByToolBarTipoLineaFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemDuplicarTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemNuevoRelacionesTipoLineaFlujoCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemCopiarTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemVerFormTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemCerrarTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemProcesarInformacionTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemAnterioresTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemSiguientesTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemAbrirOrderByTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarTipoLineaFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoLineaFlujoCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoLineaFlujoCaja;
	protected JCheckBox jCheckBoxSeleccionadosTipoLineaFlujoCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja;
	protected JCheckBox jCheckBoxConGraficoReporteTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoLineaFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoLineaFlujoCaja;
	protected JTextField jTextFieldValorCampoGeneralTipoLineaFlujoCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoLineaFlujoCaja;
	//public JList<Reporte> jListColumnasSelectReporteTipoLineaFlujoCaja;
	//public JScrollPane jScrollColumnasSelectReporteTipoLineaFlujoCaja;
	
	//public JLabel jLabelRelacionesSelectReporteTipoLineaFlujoCaja;
	//public JList<Reporte> jListRelacionesSelectReporteTipoLineaFlujoCaja;
	//public JScrollPane jScrollRelacionesSelectReporteTipoLineaFlujoCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoLineaFlujoCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoLineaFlujoCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoLineaFlujoCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoLineaFlujoCaja;
	
		
	//public JLabel jLabelArchivoImportacionTipoLineaFlujoCaja;	
	//public JLabel jLabelPathArchivoImportacionTipoLineaFlujoCaja;
	//protected JTextField jTextFieldPathArchivoImportacionTipoLineaFlujoCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoLineaFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoLineaFlujoCaja;
	
	//public JLabel jLabelColumnaCategoriaValorTipoLineaFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoLineaFlujoCaja;
	
	//public JLabel jLabelColumnasValoresGraficoTipoLineaFlujoCaja;
	//public JList<Reporte> jListColumnasValoresGraficoTipoLineaFlujoCaja;
	//public JScrollPane jScrollColumnasValoresGraficoTipoLineaFlujoCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoLineaFlujoCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoLineaFlujoCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoLineaFlujoCaja;
	public JPanel jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja;
	public JButton jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja;
	public JPanel jPanelBusquedaPorIdTipoLineaFlujoCaja;
	public JButton jButtonBusquedaPorIdTipoLineaFlujoCaja;
	public JPanel jPanelBusquedaPorNombreTipoLineaFlujoCaja;
	public JButton jButtonBusquedaPorNombreTipoLineaFlujoCaja;
	
	public JPanel jPanelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja;
	public JLabel jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja;
	public JTextField jTextFieldcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja;
	public JButton jButtoncodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelIdIdBusquedaPorIdTipoLineaFlujoCaja;
	public JLabel jLabelidBusquedaPorIdTipoLineaFlujoCaja;
	public JTextFieldMe jLabelidTipoLineaFlujoCajaBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoLineaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoLineaFlujoCaja;
	public JLabel jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoLineaFlujoCaja;
	public JButton jButtonnombreBusquedaPorNombreTipoLineaFlujoCajaBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoLineaFlujoCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLineaFlujoCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLineaFlujoCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLineaFlujoCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoLineaFlujoCaja)	{
		this.jButtonRecargarInformacionTipoLineaFlujoCaja = jButtonRecargarInformacionTipoLineaFlujoCaja;
	}
	
	public JButton getjButtonProcesarInformacionTipoLineaFlujoCaja() {
		return this.jButtonProcesarInformacionTipoLineaFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoLineaFlujoCaja)	{
		this.jButtonProcesarInformacionTipoLineaFlujoCaja = jButtonProcesarInformacionTipoLineaFlujoCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoLineaFlujoCaja() {
		return this.jButtonRecargarInformacionTipoLineaFlujoCaja;
	}
	
	
	public List<TipoLineaFlujoCaja> gettipolineaflujocajas() {
		return this.tipolineaflujocajas;
	}

	public void settipolineaflujocajas(List<TipoLineaFlujoCaja> tipolineaflujocajas) {
		this.tipolineaflujocajas = tipolineaflujocajas;
	}
	
	public List<TipoLineaFlujoCaja> gettipolineaflujocajasAux() {
		return this.tipolineaflujocajasAux;
	}

	public void settipolineaflujocajasAux(List<TipoLineaFlujoCaja> tipolineaflujocajasAux) {
		this.tipolineaflujocajasAux = tipolineaflujocajasAux;
	}
	
	public List<TipoLineaFlujoCaja> gettipolineaflujocajasEliminados() {
		return this.tipolineaflujocajasEliminados;
	}

	public void setTipoLineaFlujoCajasEliminados(List<TipoLineaFlujoCaja> tipolineaflujocajasEliminados) {
		this.tipolineaflujocajasEliminados = tipolineaflujocajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoLineaFlujoCaja() {
		return jComboBoxTiposSeleccionarTipoLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposSeleccionarTipoLineaFlujoCaja) {
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja = jComboBoxTiposSeleccionarTipoLineaFlujoCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoLineaFlujoCaja() {
		return jTextFieldValorCampoGeneralTipoLineaFlujoCaja;
	}

	public void setjTextFieldValorCampoGeneralTipoLineaFlujoCaja(
			JTextField jTextFieldValorCampoGeneralTipoLineaFlujoCaja) {
		this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja = jTextFieldValorCampoGeneralTipoLineaFlujoCaja;
	}

	public void setBorderResaltarValorCampoGeneralTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoLineaFlujoCaja() {
		return this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja;
	}

	public void setjCheckBoxSeleccionarTodosTipoLineaFlujoCaja(
			JCheckBox jCheckBoxSeleccionarTodosTipoLineaFlujoCaja) {
		this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja = jCheckBoxSeleccionarTodosTipoLineaFlujoCaja;
	}

	public void setBorderResaltarSeleccionarTodosTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoLineaFlujoCaja() {
		return this.jCheckBoxSeleccionadosTipoLineaFlujoCaja;
	}

	public void setjCheckBoxSeleccionadosTipoLineaFlujoCaja(
			JCheckBox jCheckBoxSeleccionadosTipoLineaFlujoCaja) {
		this.jCheckBoxSeleccionadosTipoLineaFlujoCaja = jCheckBoxSeleccionadosTipoLineaFlujoCaja;
	}
	
	public void setBorderResaltarSeleccionadosTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoLineaFlujoCaja() {
		return this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposArchivosReportesTipoLineaFlujoCaja) {
		this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja = jComboBoxTiposArchivosReportesTipoLineaFlujoCaja;
	}

	public void setBorderResaltarTiposArchivosReportesTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoLineaFlujoCaja() {
		return this.jComboBoxTiposReportesTipoLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposReportesTipoLineaFlujoCaja) {
		this.jComboBoxTiposReportesTipoLineaFlujoCaja = jComboBoxTiposReportesTipoLineaFlujoCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoLineaFlujoCaja() {
	//	return jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoLineaFlujoCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja) {
	//	this.jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja = jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja = jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja;
	//}
	
	public void setBorderResaltarTiposReportesTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoLineaFlujoCaja() {
		return this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposGraficosReportesTipoLineaFlujoCaja) {
		this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja = jComboBoxTiposGraficosReportesTipoLineaFlujoCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoLineaFlujoCaja() {
		return this.jComboBoxTiposPaginacionTipoLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposPaginacionTipoLineaFlujoCaja) {
		this.jComboBoxTiposPaginacionTipoLineaFlujoCaja = jComboBoxTiposPaginacionTipoLineaFlujoCaja;
	}
	
	public void setBorderResaltarTiposPaginacionTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoLineaFlujoCaja() {
		return this.jComboBoxTiposRelacionesTipoLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoLineaFlujoCaja() {
		return this.jComboBoxTiposAccionesTipoLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposRelacionesTipoLineaFlujoCaja) {
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja = jComboBoxTiposRelacionesTipoLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposAccionesTipoLineaFlujoCaja) {
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja = jComboBoxTiposAccionesTipoLineaFlujoCaja;
	}
	
	public void setBorderResaltarTiposRelacionesTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoLineaFlujoCaja() {
	//	return jCheckBoxConGraficoDinamicoTipoLineaFlujoCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoLineaFlujoCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoLineaFlujoCaja) {
	//	this.jCheckBoxConGraficoDinamicoTipoLineaFlujoCaja = jCheckBoxConGraficoDinamicoTipoLineaFlujoCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoLineaFlujoCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoLineaFlujoCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoLineaFlujoCaja .setBorder(borderResaltar);		
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
		this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
		
		this.tipolineaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolineaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoLineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoLineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoLineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoLineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoLineaFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Linea Flujo Caja  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoLineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoLineaFlujoCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"nuevo","nuevo","Nuevo"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"duplicar","duplicar","Duplicar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"copiar","copiar","Copiar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"ver_form","ver_form","Ver"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"recargar","recargar","Recargar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,
							"cerrar","cerrar","Salir"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja;
			
				this.jButtonProcesarInformacionToolBarTipoLineaFlujoCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoLineaFlujoCaja;
				
		//protected JButton jButtonModificarToolBarTipoLineaFlujoCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoLineaFlujoCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoLineaFlujoCaja=new JMenuMe("General");
		this.jmenuArchivoTipoLineaFlujoCaja=new JMenuMe("Archivo");
		this.jmenuAccionesTipoLineaFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDatosTipoLineaFlujoCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoLineaFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoLineaFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoLineaFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoLineaFlujoCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoLineaFlujoCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoLineaFlujoCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoLineaFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoLineaFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoLineaFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoLineaFlujoCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoLineaFlujoCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoLineaFlujoCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoLineaFlujoCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoLineaFlujoCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoLineaFlujoCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoLineaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoLineaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoLineaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoLineaFlujoCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoLineaFlujoCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoLineaFlujoCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoLineaFlujoCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoLineaFlujoCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoLineaFlujoCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoLineaFlujoCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoLineaFlujoCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoLineaFlujoCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoLineaFlujoCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoLineaFlujoCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoLineaFlujoCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoLineaFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoLineaFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoLineaFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoLineaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoLineaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoLineaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoLineaFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoLineaFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoLineaFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoLineaFlujoCaja.add(this.jMenuItemCerrarTipoLineaFlujoCaja);
			
			this.jmenuAccionesTipoLineaFlujoCaja.add(this.jMenuItemNuevoTipoLineaFlujoCaja);
			this.jmenuAccionesTipoLineaFlujoCaja.add(this.jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja);
			this.jmenuAccionesTipoLineaFlujoCaja.add(this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja);
			this.jmenuAccionesTipoLineaFlujoCaja.add(this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja);		
			this.jmenuAccionesTipoLineaFlujoCaja.add(this.jMenuItemDuplicarTipoLineaFlujoCaja);		
			this.jmenuAccionesTipoLineaFlujoCaja.add(this.jMenuItemCopiarTipoLineaFlujoCaja);		
			this.jmenuAccionesTipoLineaFlujoCaja.add(this.jMenuItemVerFormTipoLineaFlujoCaja);		
			
			this.jmenuDatosTipoLineaFlujoCaja.add(this.jMenuItemRecargarInformacionTipoLineaFlujoCaja);				
			this.jmenuDatosTipoLineaFlujoCaja.add(this.jMenuItemAnterioresTipoLineaFlujoCaja);				
			this.jmenuDatosTipoLineaFlujoCaja.add(this.jMenuItemSiguientesTipoLineaFlujoCaja);				
			this.jmenuDatosTipoLineaFlujoCaja.add(this.jMenuItemAbrirOrderByTipoLineaFlujoCaja);				
			this.jmenuDatosTipoLineaFlujoCaja.add(this.jMenuItemMostrarOcultarTipoLineaFlujoCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoLineaFlujoCaja.add(this.jMenuItemGuardarCambiosTipoLineaFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoLineaFlujoCaja.add(this.jmenuArchivoTipoLineaFlujoCaja);		
			this.jmenuBarTipoLineaFlujoCaja.add(this.jmenuAccionesTipoLineaFlujoCaja);		
			this.jmenuBarTipoLineaFlujoCaja.add(this.jmenuDatosTipoLineaFlujoCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoLineaFlujoCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoLineaFlujoCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja.setToolTipText("Buscar Por Codigo Sri ");
		this.jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja.setToolTipText("Buscar Por Codigo Sri ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja,"buscar_button","Buscar Por Codigo Sri ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja = new JLabelMe();
		jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.setText("Codigo Sri :");
		jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.setToolTipText("Codigo Sri");
		jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja= new JTextFieldMe();
		jTextFieldcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdTipoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoLineaFlujoCaja.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoLineaFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorIdTipoLineaFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorIdTipoLineaFlujoCaja.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoLineaFlujoCaja,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoLineaFlujoCaja = new JLabelMe();
		jLabelidBusquedaPorIdTipoLineaFlujoCaja.setText("Id :");
		jLabelidBusquedaPorIdTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-48),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-48),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-48),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidTipoLineaFlujoCajaBusquedaPorId= new JTextFieldMe();
		jLabelidTipoLineaFlujoCajaBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoLineaFlujoCajaBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoLineaFlujoCajaBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoLineaFlujoCaja.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoLineaFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoLineaFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoLineaFlujoCaja.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoLineaFlujoCaja,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoLineaFlujoCaja= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoLineaFlujoCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoLineaFlujoCaja = new TipoLineaFlujoCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Linea Flujo Caja  DATOS");
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja = new TipoLineaFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.tipolineaflujocajaSessionBean.getConGuardarRelaciones(),this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja = null;//new TipoLineaFlujoCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoLineaFlujoCaja= new GridBagLayout();
		
		
		this.jTableDatosTipoLineaFlujoCaja = new JTableMe();      
		
		String sToolTipTipoLineaFlujoCaja="";
		sToolTipTipoLineaFlujoCaja=TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoLineaFlujoCaja+="(Contabilidad.TipoLineaFlujoCaja)";
		}
		
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoLineaFlujoCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoLineaFlujoCaja.setToolTipText(sToolTipTipoLineaFlujoCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoLineaFlujoCaja);
		this.jTableDatosTipoLineaFlujoCaja.setAutoCreateRowSorter(true);
		this.jTableDatosTipoLineaFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoLineaFlujoCaja.setRowSelectionAllowed(true);
		this.jTableDatosTipoLineaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonDuplicarTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonCopiarTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonVerFormTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonNuevoRelacionesTipoLineaFlujoCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonCerrarTipoLineaFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosTipoLineaFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoLineaFlujoCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Linea Flujo Caja ";
		
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Linea Flujo Caja s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoLineaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoLineaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesTipoLineaFlujoCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja=new ReporteDinamicoJInternalFrame(TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoLineaFlujoCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoLineaFlujoCaja=new ImportacionJInternalFrame(TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoLineaFlujoCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoLineaFlujoCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoLineaFlujoCaja.setText("Orden");
		this.jButtonAbrirOrderByTipoLineaFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoLineaFlujoCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoLineaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLineaFlujoCaja,false,this);
			
			//this.cargarOrderByTipoLineaFlujoCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoLineaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLineaFlujoCaja,true,this);
			
			//this.cargarOrderByTipoLineaFlujoCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoLineaFlujoCaja.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoLineaFlujoCaja.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoLineaFlujoCaja.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoLineaFlujoCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoLineaFlujoCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoLineaFlujoCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoLineaFlujoCaja.setText("Nuevo");
		this.jButtonDuplicarTipoLineaFlujoCaja.setText("Duplicar");
		this.jButtonCopiarTipoLineaFlujoCaja.setText("Copiar");
		this.jButtonVerFormTipoLineaFlujoCaja.setText("Ver");
		this.jButtonNuevoRelacionesTipoLineaFlujoCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.setText("Guardar");
		this.jButtonCerrarTipoLineaFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoLineaFlujoCaja,"nuevo_button","Nuevo",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoLineaFlujoCaja,"duplicar_button","Duplicar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoLineaFlujoCaja,"copiar_button","Copiar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoLineaFlujoCaja,"ver_form","Ver",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoLineaFlujoCaja,"nuevorelaciones_button","Nuevo Rel",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja,"guardarcambiostabla_button","Guardar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoLineaFlujoCaja,"cerrar_button","Salir",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoLineaFlujoCaja.setToolTipText("Nuevo"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoLineaFlujoCaja.setToolTipText("Duplicar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoLineaFlujoCaja.setToolTipText("Copiar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoLineaFlujoCaja.setToolTipText("Ver"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoLineaFlujoCaja.setToolTipText("Nuevo Rel"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.setToolTipText("Guardar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoLineaFlujoCaja.setToolTipText("Salir"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoLineaFlujoCaja";
		inputMap = this.jButtonNuevoTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoLineaFlujoCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoLineaFlujoCaja";
		inputMap = this.jButtonDuplicarTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoLineaFlujoCaja"));
		
		//COPIAR
		sMapKey = "CopiarTipoLineaFlujoCaja";
		inputMap = this.jButtonCopiarTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoLineaFlujoCaja"));
		
		//VEr FORM
		sMapKey = "VerFormTipoLineaFlujoCaja";
		inputMap = this.jButtonVerFormTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoLineaFlujoCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoLineaFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoLineaFlujoCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoLineaFlujoCaja";
		inputMap = this.jButtonModificarTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoLineaFlujoCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoLineaFlujoCaja";
		inputMap = this.jButtonCerrarTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoLineaFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoLineaFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoLineaFlujoCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoLineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoLineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoLineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoLineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoLineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoLineaFlujoCaja.setName("jPanelParametrosReportesTipoLineaFlujoCaja"); 
		
		this.jPanelParametrosReportesAccionesTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoLineaFlujoCaja.setName("jPanelParametrosReportesAccionesTipoLineaFlujoCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonRecargarInformacionTipoLineaFlujoCaja.setText("Recargar");
		this.jButtonRecargarInformacionTipoLineaFlujoCaja.setToolTipText("Recargar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoLineaFlujoCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonProcesarInformacionTipoLineaFlujoCaja.setText("Procesar");
		this.jButtonProcesarInformacionTipoLineaFlujoCaja.setToolTipText("Procesar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoLineaFlujoCaja.setVisible(false);
			
		this.jButtonProcesarInformacionTipoLineaFlujoCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoLineaFlujoCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoLineaFlujoCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposReportesTipoLineaFlujoCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.setText("Accion");
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoLineaFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesTipoLineaFlujoCaja.setText("Acciones");		
		this.jLabelAccionesTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoLineaFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoLineaFlujoCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoLineaFlujoCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoLineaFlujoCaja = new JButtonMe();
		//this.jButtonAnterioresTipoLineaFlujoCaja.setText("<<");
        this.jButtonAnterioresTipoLineaFlujoCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoLineaFlujoCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoLineaFlujoCaja = new JButtonMe();
		//this.jButtonSiguientesTipoLineaFlujoCaja.setText(">>");
        this.jButtonSiguientesTipoLineaFlujoCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoLineaFlujoCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja,"nuevoguardarcambios_button","Nue",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoLineaFlujoCaja";
		inputMap = this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoLineaFlujoCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoLineaFlujoCaja";
		inputMap = this.jButtonRecargarInformacionTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoLineaFlujoCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoLineaFlujoCaja";
		inputMap = this.jButtonSiguientesTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoLineaFlujoCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoLineaFlujoCaja";
		inputMap = this.jButtonAnterioresTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoLineaFlujoCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoLineaFlujoCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoLineaFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),TipoLineaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLineaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoLineaFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),TipoLineaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLineaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoLineaFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),TipoLineaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLineaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoLineaFlujoCaja = new GridBagLayout();

			this.jPanelPaginacionTipoLineaFlujoCaja.setLayout(gridaBagLayoutPaginacionTipoLineaFlujoCaja);						
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonAnterioresTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
					
						
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
			
			this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
						
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
			this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonSiguientesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonNuevoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
				this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonNuevoRelacionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			}
			
			
			if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
				this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			}
			
			
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonDuplicarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonCopiarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonVerFormTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoLineaFlujoCaja.add(this.jButtonCerrarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
		
		
		this.jButtonRecargarInformacionTipoLineaFlujoCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoLineaFlujoCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoLineaFlujoCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoLineaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoLineaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoLineaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoLineaFlujoCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoLineaFlujoCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoLineaFlujoCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoLineaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoLineaFlujoCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoLineaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoLineaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoLineaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoLineaFlujoCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoLineaFlujoCaja.setLayout(gridaBagParametrosReportesTipoLineaFlujoCaja);
			this.jPanelParametrosReportesAccionesTipoLineaFlujoCaja.setLayout(gridaBagParametrosReportesAccionesTipoLineaFlujoCaja);
			
			
			this.jPanelParametrosAuxiliar1TipoLineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar1TipoLineaFlujoCaja);
			this.jPanelParametrosAuxiliar2TipoLineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar2TipoLineaFlujoCaja);
			this.jPanelParametrosAuxiliar3TipoLineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar3TipoLineaFlujoCaja);
			this.jPanelParametrosAuxiliar4TipoLineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar4TipoLineaFlujoCaja);
			//this.jPanelParametrosAuxiliar5TipoLineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar2TipoLineaFlujoCaja);			
			
			
			
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jButtonRecargarInformacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLineaFlujoCaja.add(this.jComboBoxTiposPaginacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLineaFlujoCaja.add(this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLineaFlujoCaja.add(this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jPanelParametrosAuxiliar1TipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoLineaFlujoCaja.add(this.jComboBoxTiposReportesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jPanelParametrosAuxiliar4TipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jComboBoxTiposReportesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jCheckBoxGenerarReporteTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jPanelParametrosAuxiliar2TipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jLabelAccionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jButtonAbrirOrderByTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
			
			
			/*
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoLineaFlujoCaja.add(this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);															
				
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoLineaFlujoCaja.add(this.jCheckBoxSeleccionadosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jPanelParametrosAuxiliar3TipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jComboBoxTiposRelacionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
				
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jComboBoxTiposAccionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
	
				
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLineaFlujoCaja.add(this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoLineaFlujoCaja = new GridBagLayout();

			this.jScrollPanelDatosTipoLineaFlujoCaja.setLayout(gridaBagLayoutDatosTipoLineaFlujoCaja);
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
			
			this.jScrollPanelDatosTipoLineaFlujoCaja.add(this.jTableDatosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoLineaFlujoCaja.setViewportView(this.jTableDatosTipoLineaFlujoCaja);
		this.jTableDatosTipoLineaFlujoCaja.setFillsViewportHeight(true);
		this.jTableDatosTipoLineaFlujoCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoLineaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesTipoLineaFlujoCaja.setLayout(gridaBagLayoutAccionesTipoLineaFlujoCaja);
		
		
		/*	
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
			
		this.jPanelAccionesTipoLineaFlujoCaja.add(this.jButtonNuevoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoSriTipoLineaFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoSriTipoLineaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSriTipoLineaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSriTipoLineaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoSriTipoLineaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja.setLayout(gridaBagLayoutBusquedaPorCodigoSriTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
		jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja.add(jLabelcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		gridBagConstraintsTipoLineaFlujoCaja.gridx = 1;
		jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja.add(jTextFieldcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
		gridBagConstraintsTipoLineaFlujoCaja.gridx =1;
		jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja.add(jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);

		jTabbedPaneBusquedasTipoLineaFlujoCaja.addTab("1.-Por Codigo Sri ", jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja);
		jTabbedPaneBusquedasTipoLineaFlujoCaja.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdTipoLineaFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoLineaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoLineaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoLineaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoLineaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoLineaFlujoCaja.setLayout(gridaBagLayoutBusquedaPorIdTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
		jPanelBusquedaPorIdTipoLineaFlujoCaja.add(jLabelidBusquedaPorIdTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		gridBagConstraintsTipoLineaFlujoCaja.gridx = 1;
		jPanelBusquedaPorIdTipoLineaFlujoCaja.add(jLabelidTipoLineaFlujoCajaBusquedaPorId, gridBagConstraintsTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
		gridBagConstraintsTipoLineaFlujoCaja.gridx =1;
		jPanelBusquedaPorIdTipoLineaFlujoCaja.add(jButtonBusquedaPorIdTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);

		jTabbedPaneBusquedasTipoLineaFlujoCaja.addTab("2.-Por Id ", jPanelBusquedaPorIdTipoLineaFlujoCaja);
		jTabbedPaneBusquedasTipoLineaFlujoCaja.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoLineaFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoLineaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoLineaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoLineaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoLineaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoLineaFlujoCaja.setLayout(gridaBagLayoutBusquedaPorNombreTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
		jPanelBusquedaPorNombreTipoLineaFlujoCaja.add(jLabelnombreBusquedaPorNombreTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		gridBagConstraintsTipoLineaFlujoCaja.gridx = 1;
		jPanelBusquedaPorNombreTipoLineaFlujoCaja.add(jTextAreanombreBusquedaPorNombreTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);

		gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoLineaFlujoCaja.gridy = 1;
		gridBagConstraintsTipoLineaFlujoCaja.gridx =1;
		jPanelBusquedaPorNombreTipoLineaFlujoCaja.add(jButtonBusquedaPorNombreTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);

		jTabbedPaneBusquedasTipoLineaFlujoCaja.addTab("3.-Por Nombre ", jPanelBusquedaPorNombreTipoLineaFlujoCaja);
		jTabbedPaneBusquedasTipoLineaFlujoCaja.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoLineaFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoLineaFlujoCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsTipoLineaFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;		
		//this.gridBagConstraintsTipoLineaFlujoCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoLineaFlujoCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;		
			this.gridBagConstraintsTipoLineaFlujoCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);								
		
		
		/*
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		*/		
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx =0;
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoLineaFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
				
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoLineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoLineaFlujoCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoLineaFlujoCaja.setLayout(gridaBagLayoutBusquedasParametrosTipoLineaFlujoCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoLineaFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			
			
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
			
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoLineaFlujoCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoLineaFlujoCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoLineaFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.setName("jPanelReporteDinamicoTipoLineaFlujoCaja"); 
		
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.setLayout(gridaBagLayoutReporteDinamicoTipoLineaFlujoCaja);
		
		
		this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoLineaFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Linea Flujo Caja s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoLineaFlujoCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoLineaFlujoCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jLabelColumnasSelectReporteTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoLineaFlujoCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoLineaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoLineaFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoLineaFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoLineaFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoLineaFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoLineaFlujoCaja=new JScrollPane(this.jListColumnasSelectReporteTipoLineaFlujoCaja);
			
			this.jScrollColumnasSelectReporteTipoLineaFlujoCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoLineaFlujoCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoLineaFlujoCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jListColumnasSelectReporteTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jScrollColumnasSelectReporteTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoLineaFlujoCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoLineaFlujoCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jLabelRelacionesSelectReporteTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoLineaFlujoCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoLineaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoLineaFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoLineaFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoLineaFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoLineaFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoLineaFlujoCaja=new JScrollPane(this.jListRelacionesSelectReporteTipoLineaFlujoCaja);
			
			this.jScrollRelacionesSelectReporteTipoLineaFlujoCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoLineaFlujoCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoLineaFlujoCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jListRelacionesSelectReporteTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jScrollRelacionesSelectReporteTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoLineaFlujoCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoLineaFlujoCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoLineaFlujoCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoLineaFlujoCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoLineaFlujoCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jLabelGenerarExcelReporteDinamicoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCaja.setToolTipText("Generar EXCEL"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jComboBoxTiposReportesDinamicoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoLineaFlujoCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoLineaFlujoCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jLabelTiposArchivoReporteDinamicoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jComboBoxTiposArchivosReportesDinamicoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoLineaFlujoCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoLineaFlujoCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoLineaFlujoCaja.setToolTipText("Generar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jButtonGenerarReporteDinamicoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoLineaFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoLineaFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoLineaFlujoCaja.setToolTipText("Cancelar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLineaFlujoCaja.add(this.jButtonCerrarReporteDinamicoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoLineaFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja= new JScrollPane(jPanelReporteDinamicoTipoLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Linea Flujo Caja s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoLineaFlujoCaja);
		this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getContentPane().add(this.jScrollPanelReporteDinamicoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoLineaFlujoCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoLineaFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoLineaFlujoCaja.setName("jPanelImportacionTipoLineaFlujoCaja"); 
		
		this.jPanelImportacionTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoLineaFlujoCaja.setLayout(gridaBagLayoutImportacionTipoLineaFlujoCaja);
		
		
		this.jInternalFrameImportacionTipoLineaFlujoCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoLineaFlujoCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoLineaFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoLineaFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoLineaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoLineaFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoLineaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoLineaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoLineaFlujoCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoLineaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionTipoLineaFlujoCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Linea Flujo Caja s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoLineaFlujoCaja = new JLabelMe();

		this.jLabelArchivoImportacionTipoLineaFlujoCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoLineaFlujoCaja.add(this.jLabelArchivoImportacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoLineaFlujoCaja = new JFileChooser();		
		this.jFileChooserImportacionTipoLineaFlujoCaja.setToolTipText("ESCOGER ARCHIVO"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonAbrirImportacionTipoLineaFlujoCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoLineaFlujoCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoLineaFlujoCaja.setToolTipText("Generar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLineaFlujoCaja.add(this.jButtonAbrirImportacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoLineaFlujoCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoLineaFlujoCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoLineaFlujoCaja.add(this.jLabelPathArchivoImportacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoLineaFlujoCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoLineaFlujoCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoLineaFlujoCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoLineaFlujoCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLineaFlujoCaja.add(this.jTextFieldPathArchivoImportacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonGenerarImportacionTipoLineaFlujoCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoLineaFlujoCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoLineaFlujoCaja.setToolTipText("Generar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLineaFlujoCaja.add(this.jButtonGenerarImportacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonCerrarImportacionTipoLineaFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoLineaFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoLineaFlujoCaja.setToolTipText("Cancelar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLineaFlujoCaja.add(this.jButtonCerrarImportacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoLineaFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoLineaFlujoCaja= new JScrollPane(jPanelImportacionTipoLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoLineaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoLineaFlujoCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoLineaFlujoCaja);
		this.jInternalFrameImportacionTipoLineaFlujoCaja.getContentPane().add(this.jScrollPanelImportacionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoLineaFlujoCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoLineaFlujoCaja = new JButtonMe();
			this.jButtonAbrirOrderByTipoLineaFlujoCaja.setText("Orden");
			this.jButtonAbrirOrderByTipoLineaFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoLineaFlujoCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoLineaFlujoCaja";
			inputMap = this.jButtonAbrirOrderByTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoLineaFlujoCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoLineaFlujoCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoLineaFlujoCaja.setName("jPanelOrderByTipoLineaFlujoCaja"); 
			
			this.jPanelOrderByTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoLineaFlujoCaja.setLayout(gridaBagLayoutOrderByTipoLineaFlujoCaja);
			
			
			this.jTableDatosTipoLineaFlujoCajaOrderBy = new JTableMe();        
			this.jTableDatosTipoLineaFlujoCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoLineaFlujoCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoLineaFlujoCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoLineaFlujoCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoLineaFlujoCajaOrderBy.setViewportView(this.jTableDatosTipoLineaFlujoCajaOrderBy);
			this.jTableDatosTipoLineaFlujoCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoLineaFlujoCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoLineaFlujoCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoLineaFlujoCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoLineaFlujoCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoLineaFlujoCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setTitle("Orden");
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setResizable(true);
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setClosable(true);
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Linea Flujo Caja s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoLineaFlujoCaja.ipady =150;
				
			this.jPanelOrderByTipoLineaFlujoCaja.add(jScrollPanelDatosTipoLineaFlujoCajaOrderBy, this.gridBagConstraintsTipoLineaFlujoCaja);//this.jTableDatosTipoLineaFlujoCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoLineaFlujoCaja = new JButtonMe();
			this.jButtonCerrarOrderByTipoLineaFlujoCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoLineaFlujoCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoLineaFlujoCaja.setToolTipText("Cancelar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoLineaFlujoCaja.add(this.jButtonCerrarOrderByTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoLineaFlujoCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoLineaFlujoCaja= new JScrollPane(jPanelOrderByTipoLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoLineaFlujoCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoLineaFlujoCaja);
			
			this.jInternalFrameOrderByTipoLineaFlujoCaja.getContentPane().add(this.jScrollPanelOrderByTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
		
		} else {
			this.jButtonAbrirOrderByTipoLineaFlujoCaja = new JButtonMe();
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
			&& this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoLineaFlujoCaja.getRowHeight();//TipoLineaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoLineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja.isSelected()) {
					iHeightTable=TipoLineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoLineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoLineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoLineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoLineaFlujoCaja.isSelected()) {
					iHeightTable=TipoLineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoLineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoLineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoLineaFlujoCaja!=null && this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoLineaFlujoCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoLineaFlujoCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoLineaFlujoCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolineaflujocajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoLineaFlujoCaja> TraerTipoLineaFlujoCajaBeans(List<TipoLineaFlujoCaja> tipolineaflujocajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoLineaFlujoCaja tipolineaflujocaja:tipolineaflujocajas) {
					
				if(!(TipoLineaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoLineaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipolineaflujocaja.setsDetalleGeneralEntityReporte(TipoLineaFlujoCajaConstantesFunciones.getTipoLineaFlujoCajaDescripcion(tipolineaflujocaja));
										
						
					
					

					if(tipolineaflujocaja.getLineaFlujoCajas()!=null && Funciones.existeClass(classes,LineaFlujoCaja.class)) {
						try{tipolineaflujocaja.setlineaflujocajasDescripcionReporte(new JRBeanCollectionDataSource(LineaFlujoCajaJInternalFrame.TraerLineaFlujoCajaBeans(tipolineaflujocaja.getLineaFlujoCajas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipolineaflujocaja.setsDetalleGeneralEntityReporte(tipolineaflujocaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipolineaflujocajabeans.add(tipolineaflujocajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipolineaflujocajas;
    }
	//PARA REPORTES FIN
}
