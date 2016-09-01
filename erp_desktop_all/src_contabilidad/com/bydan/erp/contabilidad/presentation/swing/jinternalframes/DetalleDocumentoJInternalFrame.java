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
import com.bydan.erp.contabilidad.util.DetalleDocumentoConstantesFunciones;

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
public class DetalleDocumentoJInternalFrame extends DetalleDocumentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleDocumento;
	
	protected JMenuBar jmenuBarDetalleDocumento;
	
	protected JMenu jmenuDetalleDocumento;
	protected JMenu jmenuDatosDetalleDocumento;
	protected JMenu jmenuArchivoDetalleDocumento;
	protected JMenu jmenuAccionesDetalleDocumento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleDocumento;	
	protected GridBagConstraints gridBagConstraintsDetalleDocumento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleDocumentoDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleDocumento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleDocumento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleDocumento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected TipoDetalleDocumentoBeanSwingJInternalFrame tipodetalledocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodetalledocumento="";
	
	public DetalleDocumentoSessionBean detalledocumentoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public TipoDetalleDocumentoSessionBean tipodetalledocumentoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleDocumento> detalledocumentos;		
	public List<DetalleDocumento> detalledocumentosEliminados;	
	public List<DetalleDocumento> detalledocumentosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleDocumento;		
	protected JButton jButtonAbrirOrderByDetalleDocumento;
	
	
	//protected JPanel jPanelOrderByDetalleDocumento;
	//public JScrollPane jScrollPanelOrderByDetalleDocumento;	
	//protected JButton jButtonCerrarOrderByDetalleDocumento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleDocumentoLogic detalledocumentoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleDocumento;
	public JScrollPane jScrollPanelDatosEdicionDetalleDocumento;
	public JScrollPane jScrollPanelDatosGeneralDetalleDocumento;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleDocumentoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleDocumento;
	//public JScrollPane jScrollPanelImportacionDetalleDocumento;
	
	
	
	protected JPanel jPanelAccionesDetalleDocumento;
	
    protected JPanel jPanelPaginacionDetalleDocumento;
    protected JPanel jPanelParametrosReportesDetalleDocumento;
	protected JPanel jPanelParametrosReportesAccionesDetalleDocumento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleDocumento;
	protected JPanel jPanelParametrosAuxiliar2DetalleDocumento;
	protected JPanel jPanelParametrosAuxiliar3DetalleDocumento;
	protected JPanel jPanelParametrosAuxiliar4DetalleDocumento;
	//protected JPanel jPanelParametrosAuxiliar5DetalleDocumento;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleDocumento;
	//protected JPanel jPanelImportacionDetalleDocumento;
	
	
	public JTable jTableDatosDetalleDocumento;
	
	
	
	//public JTable jTableDatosDetalleDocumentoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleDocumento;
	protected JButton jButtonDuplicarDetalleDocumento;
	protected JButton jButtonCopiarDetalleDocumento;
	protected JButton jButtonVerFormDetalleDocumento;
	protected JButton jButtonNuevoRelacionesDetalleDocumento;
	protected JButton jButtonModificarDetalleDocumento;
	
    protected JButton jButtonGuardarCambiosTablaDetalleDocumento;
	protected JButton jButtonCerrarDetalleDocumento;
	
	
	protected JButton jButtonRecargarInformacionDetalleDocumento;
	protected JButton jButtonProcesarInformacionDetalleDocumento;
	
	
	protected JButton jButtonAnterioresDetalleDocumento;
	protected JButton jButtonSiguientesDetalleDocumento;
	protected JButton jButtonNuevoGuardarCambiosDetalleDocumento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleDocumento;
	//protected JButton jButtonCerrarReporteDinamicoDetalleDocumento;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleDocumento;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleDocumento;
	//protected JButton jButtonGenerarImportacionDetalleDocumento;
	//protected JButton jButtonCerrarImportacionDetalleDocumento;
	//protected JFileChooser jFileChooserImportacionDetalleDocumento;
	//protected File fileImportacionDetalleDocumento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleDocumento;
	protected JButton jButtonDuplicarToolBarDetalleDocumento;
	protected JButton jButtonNuevoRelacionesToolBarDetalleDocumento;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleDocumento;
	protected JButton jButtonCopiarToolBarDetalleDocumento;
	protected JButton jButtonVerFormToolBarDetalleDocumento;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleDocumento;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleDocumento;
	protected JButton jButtonCerrarToolBarDetalleDocumento;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleDocumento;
	protected JButton jButtonProcesarInformacionToolBarDetalleDocumento;
	protected JButton jButtonAnterioresToolBarDetalleDocumento;
	protected JButton jButtonSiguientesToolBarDetalleDocumento;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleDocumento;
	protected JButton jButtonAbrirOrderByToolBarDetalleDocumento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleDocumento;
	protected JMenuItem jMenuItemDuplicarDetalleDocumento;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleDocumento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleDocumento;
	protected JMenuItem jMenuItemCopiarDetalleDocumento;
	protected JMenuItem jMenuItemVerFormDetalleDocumento;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleDocumento;
	protected JMenuItem jMenuItemCerrarDetalleDocumento;
	protected JMenuItem jMenuItemDetalleCerrarDetalleDocumento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleDocumento;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleDocumento;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleDocumento;
	protected JMenuItem jMenuItemProcesarInformacionDetalleDocumento;
	protected JMenuItem jMenuItemAnterioresDetalleDocumento;
	protected JMenuItem jMenuItemSiguientesDetalleDocumento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleDocumento;
	protected JMenuItem jMenuItemAbrirOrderByDetalleDocumento;
	protected JMenuItem jMenuItemMostrarOcultarDetalleDocumento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleDocumento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleDocumento;
	protected JCheckBox jCheckBoxSeleccionadosDetalleDocumento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleDocumento;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleDocumento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleDocumento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleDocumento;
	protected JTextField jTextFieldValorCampoGeneralDetalleDocumento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleDocumento;
	//public JList<Reporte> jListColumnasSelectReporteDetalleDocumento;
	//public JScrollPane jScrollColumnasSelectReporteDetalleDocumento;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleDocumento;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleDocumento;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleDocumento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleDocumento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleDocumento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleDocumento;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleDocumento;
	
		
	//public JLabel jLabelArchivoImportacionDetalleDocumento;	
	//public JLabel jLabelPathArchivoImportacionDetalleDocumento;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleDocumento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleDocumento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleDocumento;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleDocumento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleDocumento;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleDocumento;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleDocumento;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleDocumento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleDocumento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleDocumento;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleDocumento;
	public JPanel jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento;
	public JButton jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento;
	public JPanel jPanelFK_IdDetalleDocumentoDetalleDocumento;
	public JButton jButtonFK_IdDetalleDocumentoDetalleDocumento;
	public JPanel jPanelFK_IdModuloDetalleDocumento;
	public JButton jButtonFK_IdModuloDetalleDocumento;
	
	public JPanel jPanelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento;
	public JLabel jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento;
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento;
	public JLabel jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento;
	public JButton jButtonid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento;
	public JLabel jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento;
	public JButton jButtonid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento= new JButtonMe();
	public JButton jButtonid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloFK_IdModuloDetalleDocumento;
	public JLabel jLabelid_moduloFK_IdModuloDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloDetalleDocumento;
	public JButton jButtonid_moduloFK_IdModuloDetalleDocumento= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloDetalleDocumentoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleDocumentoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDocumentoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDocumentoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDocumentoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleDocumento)	{
		this.jButtonRecargarInformacionDetalleDocumento = jButtonRecargarInformacionDetalleDocumento;
	}
	
	public JButton getjButtonProcesarInformacionDetalleDocumento() {
		return this.jButtonProcesarInformacionDetalleDocumento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleDocumento)	{
		this.jButtonProcesarInformacionDetalleDocumento = jButtonProcesarInformacionDetalleDocumento;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleDocumento() {
		return this.jButtonRecargarInformacionDetalleDocumento;
	}
	
	
	public List<DetalleDocumento> getdetalledocumentos() {
		return this.detalledocumentos;
	}

	public void setdetalledocumentos(List<DetalleDocumento> detalledocumentos) {
		this.detalledocumentos = detalledocumentos;
	}
	
	public List<DetalleDocumento> getdetalledocumentosAux() {
		return this.detalledocumentosAux;
	}

	public void setdetalledocumentosAux(List<DetalleDocumento> detalledocumentosAux) {
		this.detalledocumentosAux = detalledocumentosAux;
	}
	
	public List<DetalleDocumento> getdetalledocumentosEliminados() {
		return this.detalledocumentosEliminados;
	}

	public void setDetalleDocumentosEliminados(List<DetalleDocumento> detalledocumentosEliminados) {
		this.detalledocumentosEliminados = detalledocumentosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleDocumento() {
		return jComboBoxTiposSeleccionarDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleDocumento(
			JComboBox jComboBoxTiposSeleccionarDetalleDocumento) {
		this.jComboBoxTiposSeleccionarDetalleDocumento = jComboBoxTiposSeleccionarDetalleDocumento;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleDocumento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleDocumento() {
		return jTextFieldValorCampoGeneralDetalleDocumento;
	}

	public void setjTextFieldValorCampoGeneralDetalleDocumento(
			JTextField jTextFieldValorCampoGeneralDetalleDocumento) {
		this.jTextFieldValorCampoGeneralDetalleDocumento = jTextFieldValorCampoGeneralDetalleDocumento;
	}

	public void setBorderResaltarValorCampoGeneralDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleDocumento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleDocumento() {
		return this.jCheckBoxSeleccionarTodosDetalleDocumento;
	}

	public void setjCheckBoxSeleccionarTodosDetalleDocumento(
			JCheckBox jCheckBoxSeleccionarTodosDetalleDocumento) {
		this.jCheckBoxSeleccionarTodosDetalleDocumento = jCheckBoxSeleccionarTodosDetalleDocumento;
	}

	public void setBorderResaltarSeleccionarTodosDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleDocumento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleDocumento() {
		return this.jCheckBoxSeleccionadosDetalleDocumento;
	}

	public void setjCheckBoxSeleccionadosDetalleDocumento(
			JCheckBox jCheckBoxSeleccionadosDetalleDocumento) {
		this.jCheckBoxSeleccionadosDetalleDocumento = jCheckBoxSeleccionadosDetalleDocumento;
	}
	
	public void setBorderResaltarSeleccionadosDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleDocumento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleDocumento() {
		return this.jComboBoxTiposArchivosReportesDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleDocumento(
			JComboBox jComboBoxTiposArchivosReportesDetalleDocumento) {
		this.jComboBoxTiposArchivosReportesDetalleDocumento = jComboBoxTiposArchivosReportesDetalleDocumento;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleDocumento() {
		return this.jComboBoxTiposReportesDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleDocumento(
			JComboBox jComboBoxTiposReportesDetalleDocumento) {
		this.jComboBoxTiposReportesDetalleDocumento = jComboBoxTiposReportesDetalleDocumento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleDocumento() {
	//	return jComboBoxTiposReportesDinamicoDetalleDocumento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleDocumento(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleDocumento) {
	//	this.jComboBoxTiposReportesDinamicoDetalleDocumento = jComboBoxTiposReportesDinamicoDetalleDocumento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleDocumento() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleDocumento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleDocumento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleDocumento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleDocumento = jComboBoxTiposArchivosReportesDinamicoDetalleDocumento;
	//}
	
	public void setBorderResaltarTiposReportesDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleDocumento() {
		return this.jComboBoxTiposGraficosReportesDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleDocumento(
			JComboBox jComboBoxTiposGraficosReportesDetalleDocumento) {
		this.jComboBoxTiposGraficosReportesDetalleDocumento = jComboBoxTiposGraficosReportesDetalleDocumento;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleDocumento() {
		return this.jComboBoxTiposPaginacionDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleDocumento(
			JComboBox jComboBoxTiposPaginacionDetalleDocumento) {
		this.jComboBoxTiposPaginacionDetalleDocumento = jComboBoxTiposPaginacionDetalleDocumento;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleDocumento() {
		return this.jComboBoxTiposRelacionesDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleDocumento() {
		return this.jComboBoxTiposAccionesDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleDocumento(
			JComboBox jComboBoxTiposRelacionesDetalleDocumento) {
		this.jComboBoxTiposRelacionesDetalleDocumento = jComboBoxTiposRelacionesDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleDocumento(
			JComboBox jComboBoxTiposAccionesDetalleDocumento) {
		this.jComboBoxTiposAccionesDetalleDocumento = jComboBoxTiposAccionesDetalleDocumento;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleDocumento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleDocumento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleDocumento() {
	//	return jCheckBoxConGraficoDinamicoDetalleDocumento;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleDocumento(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleDocumento) {
	//	this.jCheckBoxConGraficoDinamicoDetalleDocumento = jCheckBoxConGraficoDinamicoDetalleDocumento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleDocumento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleDocumento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleDocumento .setBorder(borderResaltar);		
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
		this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
		
		this.detalledocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalledocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalledocumentoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleDocumentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Documento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDocumento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"nuevo","nuevo","Nuevo"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"duplicar","duplicar","Duplicar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"copiar","copiar","Copiar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"ver_form","ver_form","Ver"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"recargar","recargar","Recargar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleDocumento,this.jTtoolBarDetalleDocumento,
							"cerrar","cerrar","Salir"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleDocumento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleDocumento;
			
				this.jButtonProcesarInformacionToolBarDetalleDocumento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleDocumento;
				
		//protected JButton jButtonModificarToolBarDetalleDocumento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleDocumento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleDocumento=new JMenuMe("General");
		this.jmenuArchivoDetalleDocumento=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleDocumento=new JMenuMe("Acciones");
		this.jmenuDatosDetalleDocumento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleDocumento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleDocumento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleDocumento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleDocumento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleDocumento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleDocumento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleDocumento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleDocumento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleDocumento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleDocumento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleDocumento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleDocumento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleDocumento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleDocumento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleDocumento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleDocumento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleDocumento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleDocumento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleDocumento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleDocumento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleDocumento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleDocumento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleDocumento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleDocumento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleDocumento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleDocumento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleDocumento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleDocumento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleDocumento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleDocumento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleDocumento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleDocumento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleDocumento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleDocumento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleDocumento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleDocumento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleDocumento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleDocumento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleDocumento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleDocumento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleDocumento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleDocumento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleDocumento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleDocumento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleDocumento.add(this.jMenuItemCerrarDetalleDocumento);
			
			this.jmenuAccionesDetalleDocumento.add(this.jMenuItemNuevoDetalleDocumento);
			this.jmenuAccionesDetalleDocumento.add(this.jMenuItemNuevoGuardarCambiosDetalleDocumento);
			this.jmenuAccionesDetalleDocumento.add(this.jMenuItemNuevoRelacionesDetalleDocumento);
			this.jmenuAccionesDetalleDocumento.add(this.jMenuItemGuardarCambiosTablaDetalleDocumento);		
			this.jmenuAccionesDetalleDocumento.add(this.jMenuItemDuplicarDetalleDocumento);		
			this.jmenuAccionesDetalleDocumento.add(this.jMenuItemCopiarDetalleDocumento);		
			this.jmenuAccionesDetalleDocumento.add(this.jMenuItemVerFormDetalleDocumento);		
			
			this.jmenuDatosDetalleDocumento.add(this.jMenuItemRecargarInformacionDetalleDocumento);				
			this.jmenuDatosDetalleDocumento.add(this.jMenuItemAnterioresDetalleDocumento);				
			this.jmenuDatosDetalleDocumento.add(this.jMenuItemSiguientesDetalleDocumento);				
			this.jmenuDatosDetalleDocumento.add(this.jMenuItemAbrirOrderByDetalleDocumento);				
			this.jmenuDatosDetalleDocumento.add(this.jMenuItemMostrarOcultarDetalleDocumento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleDocumento.add(this.jMenuItemGuardarCambiosDetalleDocumento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDocumento.add(this.jmenuArchivoDetalleDocumento);		
			this.jmenuBarDetalleDocumento.add(this.jmenuAccionesDetalleDocumento);		
			this.jmenuBarDetalleDocumento.add(this.jmenuDatosDetalleDocumento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleDocumento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleDocumento() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setToolTipText("Buscar Por Modulo Por Tipo Transaccion Modulo ");
		this.jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento= new JButtonMe();
		this.jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setText("Buscar");
		this.jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setToolTipText("Buscar Por Modulo Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,"buscar_button","Buscar Por Modulo Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento = new JLabelMe();
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento = new JLabelMe();
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetalleDocumentoDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleDocumentoDetalleDocumento.setToolTipText("Buscar Por T Detalle Documento ");
		this.jButtonFK_IdDetalleDocumentoDetalleDocumento= new JButtonMe();
		this.jButtonFK_IdDetalleDocumentoDetalleDocumento.setText("Buscar");
		this.jButtonFK_IdDetalleDocumentoDetalleDocumento.setToolTipText("Buscar Por T Detalle Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleDocumentoDetalleDocumento,"buscar_button","Buscar Por T Detalle Documento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleDocumentoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento = new JLabelMe();
		jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setText("T Detalle Documento :");
		jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setToolTipText("T Detalle Documento");
		jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento= new JComboBoxMe();
		jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModuloDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloDetalleDocumento.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloDetalleDocumento= new JButtonMe();
		this.jButtonFK_IdModuloDetalleDocumento.setText("Buscar");
		this.jButtonFK_IdModuloDetalleDocumento.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloDetalleDocumento,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloDetalleDocumento = new JLabelMe();
		jLabelid_moduloFK_IdModuloDetalleDocumento.setText("Modulo :");
		jLabelid_moduloFK_IdModuloDetalleDocumento.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloDetalleDocumento= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleDocumento=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleDocumento.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleDocumento.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleDocumento.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleDocumento = new DetalleDocumentoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Documento DATOS");
			this.jInternalFrameDetalleFormDetalleDocumento = new DetalleDocumentoDetalleFormJInternalFrame(jDesktopPane,this.detalledocumentoSessionBean.getConGuardarRelaciones(),this.detalledocumentoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleDocumento = null;//new DetalleDocumentoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleDocumento= new GridBagLayout();
		
		
		this.jTableDatosDetalleDocumento = new JTableMe();      
		
		String sToolTipDetalleDocumento="";
		sToolTipDetalleDocumento=DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleDocumento+="(Contabilidad.DetalleDocumento)";
		}
		
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleDocumento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleDocumento.setToolTipText(sToolTipDetalleDocumento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleDocumento);
		this.jTableDatosDetalleDocumento.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleDocumento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleDocumento.setRowSelectionAllowed(true);
		this.jTableDatosDetalleDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleDocumento = new JButtonMe();
		this.jButtonDuplicarDetalleDocumento = new JButtonMe();
		this.jButtonCopiarDetalleDocumento = new JButtonMe();
		this.jButtonVerFormDetalleDocumento = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleDocumento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleDocumento = new JButtonMe();
		this.jButtonCerrarDetalleDocumento = new JButtonMe();
		
		this.jScrollPanelDatosDetalleDocumento = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleDocumento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Documento";
		
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Documentos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleDocumento.setToolTipText("Acciones");
        this.jPanelAccionesDetalleDocumento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleDocumento=new ReporteDinamicoJInternalFrame(DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleDocumento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleDocumento=new ImportacionJInternalFrame(DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleDocumento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleDocumento = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleDocumento.setText("Orden");
		this.jButtonAbrirOrderByDetalleDocumento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleDocumento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleDocumento,false,this);
			
			//this.cargarOrderByDetalleDocumento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleDocumento,true,this);
			
			//this.cargarOrderByDetalleDocumento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleDocumento.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleDocumento.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleDocumento.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosDetalleDocumento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleDocumento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleDocumento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleDocumento.setText("Nuevo");
		this.jButtonDuplicarDetalleDocumento.setText("Duplicar");
		this.jButtonCopiarDetalleDocumento.setText("Copiar");
		this.jButtonVerFormDetalleDocumento.setText("Ver");
		this.jButtonNuevoRelacionesDetalleDocumento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleDocumento.setText("Guardar");
		this.jButtonCerrarDetalleDocumento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleDocumento,"nuevo_button","Nuevo",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleDocumento,"duplicar_button","Duplicar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleDocumento,"copiar_button","Copiar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleDocumento,"ver_form","Ver",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleDocumento,"nuevorelaciones_button","Nuevo Rel",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleDocumento,"guardarcambiostabla_button","Guardar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleDocumento,"cerrar_button","Salir",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleDocumento.setToolTipText("Nuevo"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleDocumento.setToolTipText("Duplicar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleDocumento.setToolTipText("Copiar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleDocumento.setToolTipText("Ver"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleDocumento.setToolTipText("Nuevo Rel"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleDocumento.setToolTipText("Guardar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleDocumento.setToolTipText("Salir"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleDocumento";
		inputMap = this.jButtonNuevoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleDocumento"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleDocumento";
		inputMap = this.jButtonDuplicarDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleDocumento"));
		
		//COPIAR
		sMapKey = "CopiarDetalleDocumento";
		inputMap = this.jButtonCopiarDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleDocumento"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleDocumento";
		inputMap = this.jButtonVerFormDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleDocumento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleDocumento";
		inputMap = this.jButtonNuevoRelacionesDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleDocumento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleDocumento";
		inputMap = this.jButtonModificarDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleDocumento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleDocumento";
		inputMap = this.jButtonCerrarDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleDocumento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleDocumento";
		inputMap = this.jButtonGuardarCambiosTablaDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleDocumento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleDocumento.setName("jPanelParametrosReportesDetalleDocumento"); 
		
		this.jPanelParametrosReportesAccionesDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleDocumento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleDocumento.setName("jPanelParametrosReportesAccionesDetalleDocumento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleDocumento = new JButtonMe();
		this.jButtonRecargarInformacionDetalleDocumento.setText("Recargar");
		this.jButtonRecargarInformacionDetalleDocumento.setToolTipText("Recargar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleDocumento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleDocumento = new JButtonMe();
		this.jButtonProcesarInformacionDetalleDocumento.setText("Procesar");
		this.jButtonProcesarInformacionDetalleDocumento.setToolTipText("Procesar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleDocumento.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleDocumento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleDocumento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleDocumento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleDocumento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleDocumento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleDocumento.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleDocumento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleDocumento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleDocumento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleDocumento.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleDocumento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleDocumento.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleDocumento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleDocumento.setText("Accion");
		this.jComboBoxTiposAccionesDetalleDocumento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleDocumento.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleDocumento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleDocumento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleDocumento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleDocumento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleDocumento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleDocumento = new JLabelMe();
		
		this.jLabelAccionesDetalleDocumento.setText("Acciones");		
		this.jLabelAccionesDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleDocumento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleDocumento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleDocumento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleDocumento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleDocumento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleDocumento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleDocumento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleDocumento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleDocumento.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleDocumento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleDocumento = new JButtonMe();
		//this.jButtonAnterioresDetalleDocumento.setText("<<");
        this.jButtonAnterioresDetalleDocumento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleDocumento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleDocumento = new JButtonMe();
		//this.jButtonSiguientesDetalleDocumento.setText(">>");
        this.jButtonSiguientesDetalleDocumento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleDocumento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleDocumento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleDocumento.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleDocumento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleDocumento,"nuevoguardarcambios_button","Nue",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleDocumento";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleDocumento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleDocumento";
		inputMap = this.jButtonRecargarInformacionDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleDocumento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleDocumento";
		inputMap = this.jButtonSiguientesDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleDocumento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleDocumento";
		inputMap = this.jButtonAnterioresDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleDocumento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleDocumento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleDocumento.setMinimumSize(new Dimension(this.getWidth(),DetalleDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleDocumento.setMaximumSize(new Dimension(this.getWidth(),DetalleDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleDocumento.setPreferredSize(new Dimension(this.getWidth(),DetalleDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleDocumento = new GridBagLayout();

			this.jPanelPaginacionDetalleDocumento.setLayout(gridaBagLayoutPaginacionDetalleDocumento);						
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = 0;
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleDocumento.add(this.jButtonAnterioresDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
					
						
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleDocumento.gridy = 0;
			
			this.jPanelPaginacionDetalleDocumento.add(this.jButtonNuevoGuardarCambiosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
						
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleDocumento.gridy = 0;
			this.jPanelPaginacionDetalleDocumento.add(this.jButtonSiguientesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = 1;
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleDocumento.add(this.jButtonNuevoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
						
			
			
			if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
				this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleDocumento.gridy = 1;
				this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleDocumento.add(this.jButtonGuardarCambiosTablaDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			}
			
			
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = 1;
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleDocumento.add(this.jButtonDuplicarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = 1;
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleDocumento.add(this.jButtonCopiarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = 1;
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleDocumento.add(this.jButtonVerFormDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = 1;
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleDocumento.add(this.jButtonCerrarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
		
		
		this.jButtonRecargarInformacionDetalleDocumento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleDocumento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleDocumento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleDocumento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleDocumento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleDocumento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleDocumento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleDocumento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleDocumento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleDocumento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleDocumento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleDocumento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleDocumento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleDocumento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleDocumento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleDocumento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleDocumento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleDocumento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleDocumento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleDocumento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleDocumento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleDocumento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleDocumento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleDocumento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleDocumento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleDocumento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleDocumento.setLayout(gridaBagParametrosReportesDetalleDocumento);
			this.jPanelParametrosReportesAccionesDetalleDocumento.setLayout(gridaBagParametrosReportesAccionesDetalleDocumento);
			
			
			this.jPanelParametrosAuxiliar1DetalleDocumento.setLayout(gridaBagParametrosAuxiliar1DetalleDocumento);
			this.jPanelParametrosAuxiliar2DetalleDocumento.setLayout(gridaBagParametrosAuxiliar2DetalleDocumento);
			this.jPanelParametrosAuxiliar3DetalleDocumento.setLayout(gridaBagParametrosAuxiliar3DetalleDocumento);
			this.jPanelParametrosAuxiliar4DetalleDocumento.setLayout(gridaBagParametrosAuxiliar4DetalleDocumento);
			//this.jPanelParametrosAuxiliar5DetalleDocumento.setLayout(gridaBagParametrosAuxiliar2DetalleDocumento);			
			
			
			
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleDocumento.add(this.jButtonRecargarInformacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleDocumento.add(this.jComboBoxTiposPaginacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleDocumento.add(this.jCheckBoxConAltoMaximoTablaDetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleDocumento.add(this.jComboBoxTiposArchivosReportesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDocumento.add(this.jPanelParametrosAuxiliar1DetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleDocumento.add(this.jComboBoxTiposReportesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDocumento.add(this.jPanelParametrosAuxiliar4DetalleDocumento, this.gridBagConstraintsDetalleDocumento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDocumento.add(this.jComboBoxTiposReportesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleDocumento.add(this.jCheckBoxGenerarReporteDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDocumento.add(this.jPanelParametrosAuxiliar2DetalleDocumento, this.gridBagConstraintsDetalleDocumento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDocumento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleDocumento.add(this.jLabelAccionesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
				this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleDocumento.add(this.jButtonAbrirOrderByDetalleDocumento, this.gridBagConstraintsDetalleDocumento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleDocumento.add(this.jComboBoxTiposSeleccionarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
			
			
			/*
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDocumento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleDocumento.add(this.jCheckBoxSeleccionarTodosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleDocumento.add(this.jCheckBoxSeleccionarTodosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);															
				
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleDocumento.add(this.jCheckBoxSeleccionadosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDocumento.add(this.jPanelParametrosAuxiliar3DetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleDocumento.add(this.jComboBoxTiposAccionesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
	
				
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleDocumento.add(this.jTextFieldValorCampoGeneralDetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleDocumento = new GridBagLayout();

			this.jScrollPanelDatosDetalleDocumento.setLayout(gridaBagLayoutDatosDetalleDocumento);
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = 0;
			this.gridBagConstraintsDetalleDocumento.gridx = 0;
			
			this.jScrollPanelDatosDetalleDocumento.add(this.jTableDatosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleDocumento.setViewportView(this.jTableDatosDetalleDocumento);
		this.jTableDatosDetalleDocumento.setFillsViewportHeight(true);
		this.jTableDatosDetalleDocumento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleDocumento= new GridBagLayout();
		this.jPanelAccionesDetalleDocumento.setLayout(gridaBagLayoutAccionesDetalleDocumento);
		
		
		/*	
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 0;
			
		this.jPanelAccionesDetalleDocumento.add(this.jButtonNuevoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setLayout(gridaBagLayoutBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 0;
		gridBagConstraintsDetalleDocumento.gridx = 0;
		jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.add(jLabelid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento, gridBagConstraintsDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 0;
		gridBagConstraintsDetalleDocumento.gridx = 1;
		jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.add(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento, gridBagConstraintsDetalleDocumento);


		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 1;
		gridBagConstraintsDetalleDocumento.gridx = 0;
		jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.add(jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento, gridBagConstraintsDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 1;
		gridBagConstraintsDetalleDocumento.gridx = 1;
		jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.add(jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento, gridBagConstraintsDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 2;
		gridBagConstraintsDetalleDocumento.gridx =1;
		jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.add(jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento, gridBagConstraintsDetalleDocumento);

		jTabbedPaneBusquedasDetalleDocumento.addTab("1.-Por Modulo Por Tipo Transaccion Modulo ", jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
		jTabbedPaneBusquedasDetalleDocumento.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetalleDocumentoDetalleDocumento= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleDocumentoDetalleDocumento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleDocumentoDetalleDocumento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleDocumentoDetalleDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleDocumentoDetalleDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleDocumentoDetalleDocumento.setLayout(gridaBagLayoutFK_IdDetalleDocumentoDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 0;
		gridBagConstraintsDetalleDocumento.gridx = 0;
		jPanelFK_IdDetalleDocumentoDetalleDocumento.add(jLabelid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento, gridBagConstraintsDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 0;
		gridBagConstraintsDetalleDocumento.gridx = 1;
		jPanelFK_IdDetalleDocumentoDetalleDocumento.add(jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento, gridBagConstraintsDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 1;
		gridBagConstraintsDetalleDocumento.gridx =1;
		jPanelFK_IdDetalleDocumentoDetalleDocumento.add(jButtonFK_IdDetalleDocumentoDetalleDocumento, gridBagConstraintsDetalleDocumento);

		jTabbedPaneBusquedasDetalleDocumento.addTab("2.-Por T Detalle Documento ", jPanelFK_IdDetalleDocumentoDetalleDocumento);
		jTabbedPaneBusquedasDetalleDocumento.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdModuloDetalleDocumento= new GridBagLayout();
		gridaBagLayoutFK_IdModuloDetalleDocumento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloDetalleDocumento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloDetalleDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloDetalleDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloDetalleDocumento.setLayout(gridaBagLayoutFK_IdModuloDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 0;
		gridBagConstraintsDetalleDocumento.gridx = 0;
		jPanelFK_IdModuloDetalleDocumento.add(jLabelid_moduloFK_IdModuloDetalleDocumento, gridBagConstraintsDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 0;
		gridBagConstraintsDetalleDocumento.gridx = 1;
		jPanelFK_IdModuloDetalleDocumento.add(jComboBoxid_moduloFK_IdModuloDetalleDocumento, gridBagConstraintsDetalleDocumento);

		gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDocumento.gridy = 1;
		gridBagConstraintsDetalleDocumento.gridx =1;
		jPanelFK_IdModuloDetalleDocumento.add(jButtonFK_IdModuloDetalleDocumento, gridBagConstraintsDetalleDocumento);

		jTabbedPaneBusquedasDetalleDocumento.addTab("3.-Por Modulo ", jPanelFK_IdModuloDetalleDocumento);
		jTabbedPaneBusquedasDetalleDocumento.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleDocumento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleDocumento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();						
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleDocumento.gridx = 0;		
			//this.gridBagConstraintsDetalleDocumento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleDocumento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleDocumento.gridx = 0;		
		//this.gridBagConstraintsDetalleDocumento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleDocumento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleDocumento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleDocumento.gridx = 0;		
			this.gridBagConstraintsDetalleDocumento.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleDocumento.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleDocumento, this.gridBagConstraintsDetalleDocumento);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);								
		
		
		/*
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		*/		
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleDocumento.gridx =0;
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleDocumento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
				
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleDocumento = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleDocumento.setLayout(gridaBagLayoutBusquedasParametrosDetalleDocumento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleDocumento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			
			
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
			
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleDocumento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleDocumento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleDocumento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleDocumento.setName("jPanelReporteDinamicoDetalleDocumento"); 
		
		this.jPanelReporteDinamicoDetalleDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleDocumento.setLayout(gridaBagLayoutReporteDinamicoDetalleDocumento);
		
		
		this.jInternalFrameReporteDinamicoDetalleDocumento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleDocumento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleDocumento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleDocumento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleDocumento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleDocumento.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleDocumento.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleDocumento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Documentos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleDocumento = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleDocumento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleDocumento.add(this.jLabelColumnasSelectReporteDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleDocumento = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleDocumento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleDocumento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleDocumento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleDocumento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleDocumento=new JScrollPane(this.jListColumnasSelectReporteDetalleDocumento);
			
			this.jScrollColumnasSelectReporteDetalleDocumento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleDocumento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleDocumento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleDocumento.add(this.jListColumnasSelectReporteDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		this.jPanelReporteDinamicoDetalleDocumento.add(this.jScrollColumnasSelectReporteDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleDocumento = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleDocumento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleDocumento = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleDocumento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleDocumento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleDocumento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleDocumento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleDocumento=new JScrollPane(this.jListRelacionesSelectReporteDetalleDocumento);
			
			this.jScrollRelacionesSelectReporteDetalleDocumento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleDocumento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleDocumento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleDocumento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleDocumento = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleDocumento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleDocumento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleDocumento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDocumento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDocumento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleDocumento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleDocumento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDocumento.add(this.jLabelGenerarExcelReporteDinamicoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleDocumento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleDocumento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleDocumento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleDocumento.setToolTipText("Generar EXCEL"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleDocumento.add(this.jButtonGenerarExcelReporteDinamicoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleDocumento.add(this.jComboBoxTiposReportesDinamicoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleDocumento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleDocumento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDocumento.add(this.jLabelTiposArchivoReporteDinamicoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleDocumento.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleDocumento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleDocumento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleDocumento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleDocumento.setToolTipText("Generar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleDocumento.add(this.jButtonGenerarReporteDinamicoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleDocumento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleDocumento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleDocumento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleDocumento.setToolTipText("Cancelar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleDocumento.add(this.jButtonCerrarReporteDinamicoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleDocumento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleDocumento= new JScrollPane(jPanelReporteDinamicoDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Documentos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDocumento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleDocumento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleDocumento);
		this.jInternalFrameReporteDinamicoDetalleDocumento.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleDocumento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleDocumento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleDocumento.setName("jPanelImportacionDetalleDocumento"); 
		
		this.jPanelImportacionDetalleDocumento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleDocumento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleDocumento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleDocumento.setLayout(gridaBagLayoutImportacionDetalleDocumento);
		
		
		this.jInternalFrameImportacionDetalleDocumento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleDocumento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleDocumento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleDocumento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleDocumento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleDocumento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleDocumento.setResizable(true);
	    this.jInternalFrameImportacionDetalleDocumento.setClosable(true);
	    this.jInternalFrameImportacionDetalleDocumento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleDocumento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleDocumento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleDocumento.setResizable(true);
	    this.jInternalFrameImportacionDetalleDocumento.setClosable(true);
	    this.jInternalFrameImportacionDetalleDocumento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleDocumento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleDocumento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleDocumento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Documentos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleDocumento = new JLabelMe();

		this.jLabelArchivoImportacionDetalleDocumento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleDocumento.add(this.jLabelArchivoImportacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleDocumento = new JFileChooser();		
		this.jFileChooserImportacionDetalleDocumento.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleDocumento = new JButtonMe();
		this.jButtonAbrirImportacionDetalleDocumento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleDocumento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleDocumento.setToolTipText("Generar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleDocumento.add(this.jButtonAbrirImportacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleDocumento = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleDocumento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleDocumento.add(this.jLabelPathArchivoImportacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleDocumento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleDocumento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleDocumento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleDocumento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleDocumento.add(this.jTextFieldPathArchivoImportacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleDocumento = new JButtonMe();
		this.jButtonGenerarImportacionDetalleDocumento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleDocumento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleDocumento.setToolTipText("Generar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleDocumento.add(this.jButtonGenerarImportacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleDocumento = new JButtonMe();
		this.jButtonCerrarImportacionDetalleDocumento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleDocumento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleDocumento.setToolTipText("Cancelar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleDocumento.add(this.jButtonCerrarImportacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleDocumento = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleDocumento= new JScrollPane(jPanelImportacionDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleDocumento.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleDocumento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleDocumento);
		this.jInternalFrameImportacionDetalleDocumento.getContentPane().add(this.jScrollPanelImportacionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleDocumento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleDocumento = new JButtonMe();
			this.jButtonAbrirOrderByDetalleDocumento.setText("Orden");
			this.jButtonAbrirOrderByDetalleDocumento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleDocumento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleDocumento";
			inputMap = this.jButtonAbrirOrderByDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleDocumento"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleDocumento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleDocumento.setName("jPanelOrderByDetalleDocumento"); 
			
			this.jPanelOrderByDetalleDocumento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleDocumento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleDocumento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleDocumento.setLayout(gridaBagLayoutOrderByDetalleDocumento);
			
			
			this.jTableDatosDetalleDocumentoOrderBy = new JTableMe();        
			this.jTableDatosDetalleDocumentoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleDocumentoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleDocumentoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleDocumentoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleDocumentoOrderBy.setViewportView(this.jTableDatosDetalleDocumentoOrderBy);
			this.jTableDatosDetalleDocumentoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleDocumentoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleDocumento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleDocumento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleDocumento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleDocumento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleDocumento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleDocumento.setTitle("Orden");
			this.jInternalFrameOrderByDetalleDocumento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleDocumento.setResizable(true);
			this.jInternalFrameOrderByDetalleDocumento.setClosable(true);
			this.jInternalFrameOrderByDetalleDocumento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleDocumento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleDocumento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleDocumento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Documentos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleDocumento.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleDocumento.ipady =150;
				
			this.jPanelOrderByDetalleDocumento.add(jScrollPanelDatosDetalleDocumentoOrderBy, this.gridBagConstraintsDetalleDocumento);//this.jTableDatosDetalleDocumentoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleDocumento = new JButtonMe();
			this.jButtonCerrarOrderByDetalleDocumento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleDocumento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleDocumento.setToolTipText("Cancelar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleDocumento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleDocumento.add(this.jButtonCerrarOrderByDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleDocumento = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleDocumento= new JScrollPane(jPanelOrderByDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleDocumento.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleDocumento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleDocumento);
			
			this.jInternalFrameOrderByDetalleDocumento.getContentPane().add(this.jScrollPanelOrderByDetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
		
		} else {
			this.jButtonAbrirOrderByDetalleDocumento = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalledocumentoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleDocumento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleDocumento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleDocumento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleDocumento.getRowHeight();//DetalleDocumentoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleDocumento.isSelected()) {
					iHeightTable=DetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleDocumento.isSelected()) {
					iHeightTable=DetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleDocumento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleDocumento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleDocumento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleDocumento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleDocumento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleDocumento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleDocumento!=null && this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy()!=null) {
			//if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleDocumento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleDocumento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleDocumento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleDocumento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleDocumento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleDocumento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalledocumentoLogic.getDetalleDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalledocumentos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleDocumento> TraerDetalleDocumentoBeans(List<DetalleDocumento> detalledocumentos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleDocumento detalledocumento:detalledocumentos) {
					
				if(!(DetalleDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalledocumento.setsDetalleGeneralEntityReporte(DetalleDocumentoConstantesFunciones.getDetalleDocumentoDescripcion(detalledocumento));
										
						
					
						
					
				} else  {
							
					//detalledocumento.setsDetalleGeneralEntityReporte(detalledocumento.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalledocumentobeans.add(detalledocumentobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalledocumentos;
    }
	//PARA REPORTES FIN
}
