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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoDescripcionAsientoConstantesFunciones;

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
public class TipoDescripcionAsientoJInternalFrame extends TipoDescripcionAsientoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDescripcionAsiento;
	
	protected JMenuBar jmenuBarTipoDescripcionAsiento;
	
	protected JMenu jmenuTipoDescripcionAsiento;
	protected JMenu jmenuDatosTipoDescripcionAsiento;
	protected JMenu jmenuArchivoTipoDescripcionAsiento;
	protected JMenu jmenuAccionesTipoDescripcionAsiento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDescripcionAsiento;	
	protected GridBagConstraints gridBagConstraintsTipoDescripcionAsiento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDescripcionAsientoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDescripcionAsiento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDescripcionAsiento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDescripcionAsiento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public TipoDescripcionAsientoSessionBean tipodescripcionasientoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDescripcionAsiento> tipodescripcionasientos;		
	public List<TipoDescripcionAsiento> tipodescripcionasientosEliminados;	
	public List<TipoDescripcionAsiento> tipodescripcionasientosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDescripcionAsiento;		
	protected JButton jButtonAbrirOrderByTipoDescripcionAsiento;
	
	
	//protected JPanel jPanelOrderByTipoDescripcionAsiento;
	//public JScrollPane jScrollPanelOrderByTipoDescripcionAsiento;	
	//protected JButton jButtonCerrarOrderByTipoDescripcionAsiento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDescripcionAsientoLogic tipodescripcionasientoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDescripcionAsiento;
	public JScrollPane jScrollPanelDatosEdicionTipoDescripcionAsiento;
	public JScrollPane jScrollPanelDatosGeneralTipoDescripcionAsiento;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDescripcionAsientoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDescripcionAsiento;
	//public JScrollPane jScrollPanelImportacionTipoDescripcionAsiento;
	
	
	
	protected JPanel jPanelAccionesTipoDescripcionAsiento;
	
    protected JPanel jPanelPaginacionTipoDescripcionAsiento;
    protected JPanel jPanelParametrosReportesTipoDescripcionAsiento;
	protected JPanel jPanelParametrosReportesAccionesTipoDescripcionAsiento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDescripcionAsiento;
	protected JPanel jPanelParametrosAuxiliar2TipoDescripcionAsiento;
	protected JPanel jPanelParametrosAuxiliar3TipoDescripcionAsiento;
	protected JPanel jPanelParametrosAuxiliar4TipoDescripcionAsiento;
	//protected JPanel jPanelParametrosAuxiliar5TipoDescripcionAsiento;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDescripcionAsiento;
	//protected JPanel jPanelImportacionTipoDescripcionAsiento;
	
	
	public JTable jTableDatosTipoDescripcionAsiento;
	
	
	
	//public JTable jTableDatosTipoDescripcionAsientoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDescripcionAsiento;
	protected JButton jButtonDuplicarTipoDescripcionAsiento;
	protected JButton jButtonCopiarTipoDescripcionAsiento;
	protected JButton jButtonVerFormTipoDescripcionAsiento;
	protected JButton jButtonNuevoRelacionesTipoDescripcionAsiento;
	protected JButton jButtonModificarTipoDescripcionAsiento;
	
    protected JButton jButtonGuardarCambiosTablaTipoDescripcionAsiento;
	protected JButton jButtonCerrarTipoDescripcionAsiento;
	
	
	protected JButton jButtonRecargarInformacionTipoDescripcionAsiento;
	protected JButton jButtonProcesarInformacionTipoDescripcionAsiento;
	
	
	protected JButton jButtonAnterioresTipoDescripcionAsiento;
	protected JButton jButtonSiguientesTipoDescripcionAsiento;
	protected JButton jButtonNuevoGuardarCambiosTipoDescripcionAsiento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDescripcionAsiento;
	//protected JButton jButtonCerrarReporteDinamicoTipoDescripcionAsiento;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDescripcionAsiento;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDescripcionAsiento;
	//protected JButton jButtonGenerarImportacionTipoDescripcionAsiento;
	//protected JButton jButtonCerrarImportacionTipoDescripcionAsiento;
	//protected JFileChooser jFileChooserImportacionTipoDescripcionAsiento;
	//protected File fileImportacionTipoDescripcionAsiento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDescripcionAsiento;
	protected JButton jButtonDuplicarToolBarTipoDescripcionAsiento;
	protected JButton jButtonNuevoRelacionesToolBarTipoDescripcionAsiento;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDescripcionAsiento;
	protected JButton jButtonCopiarToolBarTipoDescripcionAsiento;
	protected JButton jButtonVerFormToolBarTipoDescripcionAsiento;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDescripcionAsiento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDescripcionAsiento;
	protected JButton jButtonCerrarToolBarTipoDescripcionAsiento;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDescripcionAsiento;
	protected JButton jButtonProcesarInformacionToolBarTipoDescripcionAsiento;
	protected JButton jButtonAnterioresToolBarTipoDescripcionAsiento;
	protected JButton jButtonSiguientesToolBarTipoDescripcionAsiento;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDescripcionAsiento;
	protected JButton jButtonAbrirOrderByToolBarTipoDescripcionAsiento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDescripcionAsiento;
	protected JMenuItem jMenuItemDuplicarTipoDescripcionAsiento;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDescripcionAsiento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDescripcionAsiento;
	protected JMenuItem jMenuItemCopiarTipoDescripcionAsiento;
	protected JMenuItem jMenuItemVerFormTipoDescripcionAsiento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDescripcionAsiento;
	protected JMenuItem jMenuItemCerrarTipoDescripcionAsiento;
	protected JMenuItem jMenuItemDetalleCerrarTipoDescripcionAsiento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDescripcionAsiento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDescripcionAsiento;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDescripcionAsiento;
	protected JMenuItem jMenuItemProcesarInformacionTipoDescripcionAsiento;
	protected JMenuItem jMenuItemAnterioresTipoDescripcionAsiento;
	protected JMenuItem jMenuItemSiguientesTipoDescripcionAsiento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento;
	protected JMenuItem jMenuItemAbrirOrderByTipoDescripcionAsiento;
	protected JMenuItem jMenuItemMostrarOcultarTipoDescripcionAsiento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDescripcionAsiento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDescripcionAsiento;
	protected JCheckBox jCheckBoxSeleccionadosTipoDescripcionAsiento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDescripcionAsiento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDescripcionAsiento;
	protected JTextField jTextFieldValorCampoGeneralTipoDescripcionAsiento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDescripcionAsiento;
	//public JList<Reporte> jListColumnasSelectReporteTipoDescripcionAsiento;
	//public JScrollPane jScrollColumnasSelectReporteTipoDescripcionAsiento;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDescripcionAsiento;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDescripcionAsiento;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDescripcionAsiento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDescripcionAsiento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDescripcionAsiento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDescripcionAsiento;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDescripcionAsiento;
	
		
	//public JLabel jLabelArchivoImportacionTipoDescripcionAsiento;	
	//public JLabel jLabelPathArchivoImportacionTipoDescripcionAsiento;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDescripcionAsiento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDescripcionAsiento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDescripcionAsiento;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDescripcionAsiento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDescripcionAsiento;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDescripcionAsiento;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDescripcionAsiento;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDescripcionAsiento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDescripcionAsiento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDescripcionAsiento;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDescripcionAsiento;
	public JPanel jPanelFK_IdModuloTipoDescripcionAsiento;
	public JButton jButtonFK_IdModuloTipoDescripcionAsiento;
	
	public JPanel jPanelid_moduloFK_IdModuloTipoDescripcionAsiento;
	public JLabel jLabelid_moduloFK_IdModuloTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento;
	public JButton jButtonid_moduloFK_IdModuloTipoDescripcionAsiento= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloTipoDescripcionAsientoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloTipoDescripcionAsientoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoDescripcionAsientoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDescripcionAsientoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDescripcionAsientoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDescripcionAsientoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDescripcionAsiento)	{
		this.jButtonRecargarInformacionTipoDescripcionAsiento = jButtonRecargarInformacionTipoDescripcionAsiento;
	}
	
	public JButton getjButtonProcesarInformacionTipoDescripcionAsiento() {
		return this.jButtonProcesarInformacionTipoDescripcionAsiento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDescripcionAsiento)	{
		this.jButtonProcesarInformacionTipoDescripcionAsiento = jButtonProcesarInformacionTipoDescripcionAsiento;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDescripcionAsiento() {
		return this.jButtonRecargarInformacionTipoDescripcionAsiento;
	}
	
	
	public List<TipoDescripcionAsiento> gettipodescripcionasientos() {
		return this.tipodescripcionasientos;
	}

	public void settipodescripcionasientos(List<TipoDescripcionAsiento> tipodescripcionasientos) {
		this.tipodescripcionasientos = tipodescripcionasientos;
	}
	
	public List<TipoDescripcionAsiento> gettipodescripcionasientosAux() {
		return this.tipodescripcionasientosAux;
	}

	public void settipodescripcionasientosAux(List<TipoDescripcionAsiento> tipodescripcionasientosAux) {
		this.tipodescripcionasientosAux = tipodescripcionasientosAux;
	}
	
	public List<TipoDescripcionAsiento> gettipodescripcionasientosEliminados() {
		return this.tipodescripcionasientosEliminados;
	}

	public void setTipoDescripcionAsientosEliminados(List<TipoDescripcionAsiento> tipodescripcionasientosEliminados) {
		this.tipodescripcionasientosEliminados = tipodescripcionasientosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDescripcionAsiento() {
		return jComboBoxTiposSeleccionarTipoDescripcionAsiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDescripcionAsiento(
			JComboBox jComboBoxTiposSeleccionarTipoDescripcionAsiento) {
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento = jComboBoxTiposSeleccionarTipoDescripcionAsiento;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDescripcionAsiento() {
		return jTextFieldValorCampoGeneralTipoDescripcionAsiento;
	}

	public void setjTextFieldValorCampoGeneralTipoDescripcionAsiento(
			JTextField jTextFieldValorCampoGeneralTipoDescripcionAsiento) {
		this.jTextFieldValorCampoGeneralTipoDescripcionAsiento = jTextFieldValorCampoGeneralTipoDescripcionAsiento;
	}

	public void setBorderResaltarValorCampoGeneralTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDescripcionAsiento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDescripcionAsiento() {
		return this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento;
	}

	public void setjCheckBoxSeleccionarTodosTipoDescripcionAsiento(
			JCheckBox jCheckBoxSeleccionarTodosTipoDescripcionAsiento) {
		this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento = jCheckBoxSeleccionarTodosTipoDescripcionAsiento;
	}

	public void setBorderResaltarSeleccionarTodosTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDescripcionAsiento() {
		return this.jCheckBoxSeleccionadosTipoDescripcionAsiento;
	}

	public void setjCheckBoxSeleccionadosTipoDescripcionAsiento(
			JCheckBox jCheckBoxSeleccionadosTipoDescripcionAsiento) {
		this.jCheckBoxSeleccionadosTipoDescripcionAsiento = jCheckBoxSeleccionadosTipoDescripcionAsiento;
	}
	
	public void setBorderResaltarSeleccionadosTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDescripcionAsiento() {
		return this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDescripcionAsiento(
			JComboBox jComboBoxTiposArchivosReportesTipoDescripcionAsiento) {
		this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento = jComboBoxTiposArchivosReportesTipoDescripcionAsiento;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDescripcionAsiento() {
		return this.jComboBoxTiposReportesTipoDescripcionAsiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDescripcionAsiento(
			JComboBox jComboBoxTiposReportesTipoDescripcionAsiento) {
		this.jComboBoxTiposReportesTipoDescripcionAsiento = jComboBoxTiposReportesTipoDescripcionAsiento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDescripcionAsiento() {
	//	return jComboBoxTiposReportesDinamicoTipoDescripcionAsiento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDescripcionAsiento(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDescripcionAsiento) {
	//	this.jComboBoxTiposReportesDinamicoTipoDescripcionAsiento = jComboBoxTiposReportesDinamicoTipoDescripcionAsiento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento = jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento;
	//}
	
	public void setBorderResaltarTiposReportesTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDescripcionAsiento() {
		return this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDescripcionAsiento(
			JComboBox jComboBoxTiposGraficosReportesTipoDescripcionAsiento) {
		this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento = jComboBoxTiposGraficosReportesTipoDescripcionAsiento;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDescripcionAsiento() {
		return this.jComboBoxTiposPaginacionTipoDescripcionAsiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDescripcionAsiento(
			JComboBox jComboBoxTiposPaginacionTipoDescripcionAsiento) {
		this.jComboBoxTiposPaginacionTipoDescripcionAsiento = jComboBoxTiposPaginacionTipoDescripcionAsiento;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDescripcionAsiento() {
		return this.jComboBoxTiposRelacionesTipoDescripcionAsiento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDescripcionAsiento() {
		return this.jComboBoxTiposAccionesTipoDescripcionAsiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDescripcionAsiento(
			JComboBox jComboBoxTiposRelacionesTipoDescripcionAsiento) {
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento = jComboBoxTiposRelacionesTipoDescripcionAsiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDescripcionAsiento(
			JComboBox jComboBoxTiposAccionesTipoDescripcionAsiento) {
		this.jComboBoxTiposAccionesTipoDescripcionAsiento = jComboBoxTiposAccionesTipoDescripcionAsiento;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDescripcionAsiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDescripcionAsiento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDescripcionAsiento() {
	//	return jCheckBoxConGraficoDinamicoTipoDescripcionAsiento;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDescripcionAsiento(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDescripcionAsiento) {
	//	this.jCheckBoxConGraficoDinamicoTipoDescripcionAsiento = jCheckBoxConGraficoDinamicoTipoDescripcionAsiento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDescripcionAsiento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDescripcionAsiento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDescripcionAsiento .setBorder(borderResaltar);		
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
		this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
		
		this.tipodescripcionasientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodescripcionasientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDescripcionAsientoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDescripcionAsientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDescripcionAsientoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDescripcionAsientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDescripcionAsientoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Descripcion Asiento Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDescripcionAsientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDescripcionAsiento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"nuevo","nuevo","Nuevo"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"duplicar","duplicar","Duplicar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"copiar","copiar","Copiar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"ver_form","ver_form","Ver"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"recargar","recargar","Recargar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,
							"cerrar","cerrar","Salir"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDescripcionAsiento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDescripcionAsiento;
			
				this.jButtonProcesarInformacionToolBarTipoDescripcionAsiento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDescripcionAsiento;
				
		//protected JButton jButtonModificarToolBarTipoDescripcionAsiento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDescripcionAsiento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDescripcionAsiento=new JMenuMe("General");
		this.jmenuArchivoTipoDescripcionAsiento=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDescripcionAsiento=new JMenuMe("Acciones");
		this.jmenuDatosTipoDescripcionAsiento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDescripcionAsiento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDescripcionAsiento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDescripcionAsiento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDescripcionAsiento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDescripcionAsiento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDescripcionAsiento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDescripcionAsiento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDescripcionAsiento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDescripcionAsiento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDescripcionAsiento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDescripcionAsiento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDescripcionAsiento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDescripcionAsiento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDescripcionAsiento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDescripcionAsiento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDescripcionAsiento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDescripcionAsiento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDescripcionAsiento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDescripcionAsiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDescripcionAsiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDescripcionAsiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDescripcionAsiento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDescripcionAsiento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDescripcionAsiento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDescripcionAsiento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDescripcionAsiento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDescripcionAsiento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDescripcionAsiento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDescripcionAsiento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDescripcionAsiento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDescripcionAsiento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDescripcionAsiento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDescripcionAsiento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDescripcionAsiento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDescripcionAsiento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDescripcionAsiento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDescripcionAsiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDescripcionAsiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDescripcionAsiento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDescripcionAsiento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDescripcionAsiento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDescripcionAsiento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDescripcionAsiento.add(this.jMenuItemCerrarTipoDescripcionAsiento);
			
			this.jmenuAccionesTipoDescripcionAsiento.add(this.jMenuItemNuevoTipoDescripcionAsiento);
			this.jmenuAccionesTipoDescripcionAsiento.add(this.jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento);
			this.jmenuAccionesTipoDescripcionAsiento.add(this.jMenuItemNuevoRelacionesTipoDescripcionAsiento);
			this.jmenuAccionesTipoDescripcionAsiento.add(this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento);		
			this.jmenuAccionesTipoDescripcionAsiento.add(this.jMenuItemDuplicarTipoDescripcionAsiento);		
			this.jmenuAccionesTipoDescripcionAsiento.add(this.jMenuItemCopiarTipoDescripcionAsiento);		
			this.jmenuAccionesTipoDescripcionAsiento.add(this.jMenuItemVerFormTipoDescripcionAsiento);		
			
			this.jmenuDatosTipoDescripcionAsiento.add(this.jMenuItemRecargarInformacionTipoDescripcionAsiento);				
			this.jmenuDatosTipoDescripcionAsiento.add(this.jMenuItemAnterioresTipoDescripcionAsiento);				
			this.jmenuDatosTipoDescripcionAsiento.add(this.jMenuItemSiguientesTipoDescripcionAsiento);				
			this.jmenuDatosTipoDescripcionAsiento.add(this.jMenuItemAbrirOrderByTipoDescripcionAsiento);				
			this.jmenuDatosTipoDescripcionAsiento.add(this.jMenuItemMostrarOcultarTipoDescripcionAsiento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDescripcionAsiento.add(this.jMenuItemGuardarCambiosTipoDescripcionAsiento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDescripcionAsiento.add(this.jmenuArchivoTipoDescripcionAsiento);		
			this.jmenuBarTipoDescripcionAsiento.add(this.jmenuAccionesTipoDescripcionAsiento);		
			this.jmenuBarTipoDescripcionAsiento.add(this.jmenuDatosTipoDescripcionAsiento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDescripcionAsiento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDescripcionAsiento() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdModuloTipoDescripcionAsiento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloTipoDescripcionAsiento.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloTipoDescripcionAsiento= new JButtonMe();
		this.jButtonFK_IdModuloTipoDescripcionAsiento.setText("Buscar");
		this.jButtonFK_IdModuloTipoDescripcionAsiento.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloTipoDescripcionAsiento,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloTipoDescripcionAsiento = new JLabelMe();
		jLabelid_moduloFK_IdModuloTipoDescripcionAsiento.setText("Modulo :");
		jLabelid_moduloFK_IdModuloTipoDescripcionAsiento.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDescripcionAsiento=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDescripcionAsiento.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDescripcionAsiento.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDescripcionAsiento.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDescripcionAsiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDescripcionAsiento = new TipoDescripcionAsientoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Descripcion Asiento Contable DATOS");
			this.jInternalFrameDetalleFormTipoDescripcionAsiento = new TipoDescripcionAsientoDetalleFormJInternalFrame(jDesktopPane,this.tipodescripcionasientoSessionBean.getConGuardarRelaciones(),this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento = null;//new TipoDescripcionAsientoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDescripcionAsiento= new GridBagLayout();
		
		
		this.jTableDatosTipoDescripcionAsiento = new JTableMe();      
		
		String sToolTipTipoDescripcionAsiento="";
		sToolTipTipoDescripcionAsiento=TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDescripcionAsiento+="(Contabilidad.TipoDescripcionAsiento)";
		}
		
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDescripcionAsiento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDescripcionAsiento.setToolTipText(sToolTipTipoDescripcionAsiento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDescripcionAsiento);
		this.jTableDatosTipoDescripcionAsiento.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDescripcionAsiento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDescripcionAsiento.setRowSelectionAllowed(true);
		this.jTableDatosTipoDescripcionAsiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDescripcionAsiento = new JButtonMe();
		this.jButtonDuplicarTipoDescripcionAsiento = new JButtonMe();
		this.jButtonCopiarTipoDescripcionAsiento = new JButtonMe();
		this.jButtonVerFormTipoDescripcionAsiento = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDescripcionAsiento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento = new JButtonMe();
		this.jButtonCerrarTipoDescripcionAsiento = new JButtonMe();
		
		this.jScrollPanelDatosTipoDescripcionAsiento = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDescripcionAsiento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Descripcion Asiento Contable";
		
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descripcion Asiento Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDescripcionAsiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDescripcionAsiento.setToolTipText("Acciones");
        this.jPanelAccionesTipoDescripcionAsiento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDescripcionAsiento=new ReporteDinamicoJInternalFrame(TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDescripcionAsiento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDescripcionAsiento=new ImportacionJInternalFrame(TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDescripcionAsiento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDescripcionAsiento = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDescripcionAsiento.setText("Orden");
		this.jButtonAbrirOrderByTipoDescripcionAsiento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDescripcionAsiento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDescripcionAsiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDescripcionAsiento,false,this);
			
			//this.cargarOrderByTipoDescripcionAsiento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDescripcionAsiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDescripcionAsiento,true,this);
			
			//this.cargarOrderByTipoDescripcionAsiento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDescripcionAsiento.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoDescripcionAsiento.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoDescripcionAsiento.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoDescripcionAsiento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDescripcionAsiento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDescripcionAsiento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDescripcionAsiento.setText("Nuevo");
		this.jButtonDuplicarTipoDescripcionAsiento.setText("Duplicar");
		this.jButtonCopiarTipoDescripcionAsiento.setText("Copiar");
		this.jButtonVerFormTipoDescripcionAsiento.setText("Ver");
		this.jButtonNuevoRelacionesTipoDescripcionAsiento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.setText("Guardar");
		this.jButtonCerrarTipoDescripcionAsiento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDescripcionAsiento,"nuevo_button","Nuevo",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDescripcionAsiento,"duplicar_button","Duplicar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDescripcionAsiento,"copiar_button","Copiar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDescripcionAsiento,"ver_form","Ver",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDescripcionAsiento,"nuevorelaciones_button","Nuevo Rel",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDescripcionAsiento,"guardarcambiostabla_button","Guardar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDescripcionAsiento,"cerrar_button","Salir",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDescripcionAsiento.setToolTipText("Nuevo"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDescripcionAsiento.setToolTipText("Duplicar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDescripcionAsiento.setToolTipText("Copiar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDescripcionAsiento.setToolTipText("Ver"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDescripcionAsiento.setToolTipText("Nuevo Rel"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.setToolTipText("Guardar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDescripcionAsiento.setToolTipText("Salir"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDescripcionAsiento";
		inputMap = this.jButtonNuevoTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDescripcionAsiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDescripcionAsiento"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDescripcionAsiento";
		inputMap = this.jButtonDuplicarTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDescripcionAsiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDescripcionAsiento"));
		
		//COPIAR
		sMapKey = "CopiarTipoDescripcionAsiento";
		inputMap = this.jButtonCopiarTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDescripcionAsiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDescripcionAsiento"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDescripcionAsiento";
		inputMap = this.jButtonVerFormTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDescripcionAsiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDescripcionAsiento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDescripcionAsiento";
		inputMap = this.jButtonNuevoRelacionesTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDescripcionAsiento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDescripcionAsiento";
		inputMap = this.jButtonModificarTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDescripcionAsiento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDescripcionAsiento";
		inputMap = this.jButtonCerrarTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDescripcionAsiento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDescripcionAsiento";
		inputMap = this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDescripcionAsiento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDescripcionAsiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDescripcionAsiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDescripcionAsiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDescripcionAsiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDescripcionAsiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDescripcionAsiento.setName("jPanelParametrosReportesTipoDescripcionAsiento"); 
		
		this.jPanelParametrosReportesAccionesTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDescripcionAsiento.setName("jPanelParametrosReportesAccionesTipoDescripcionAsiento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDescripcionAsiento = new JButtonMe();
		this.jButtonRecargarInformacionTipoDescripcionAsiento.setText("Recargar");
		this.jButtonRecargarInformacionTipoDescripcionAsiento.setToolTipText("Recargar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDescripcionAsiento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDescripcionAsiento = new JButtonMe();
		this.jButtonProcesarInformacionTipoDescripcionAsiento.setText("Procesar");
		this.jButtonProcesarInformacionTipoDescripcionAsiento.setToolTipText("Procesar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDescripcionAsiento.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDescripcionAsiento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDescripcionAsiento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDescripcionAsiento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDescripcionAsiento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDescripcionAsiento.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDescripcionAsiento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDescripcionAsiento.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDescripcionAsiento.setText("Accion");
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDescripcionAsiento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDescripcionAsiento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDescripcionAsiento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDescripcionAsiento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDescripcionAsiento = new JLabelMe();
		
		this.jLabelAccionesTipoDescripcionAsiento.setText("Acciones");		
		this.jLabelAccionesTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDescripcionAsiento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDescripcionAsiento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDescripcionAsiento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDescripcionAsiento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDescripcionAsiento.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDescripcionAsiento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDescripcionAsiento = new JButtonMe();
		//this.jButtonAnterioresTipoDescripcionAsiento.setText("<<");
        this.jButtonAnterioresTipoDescripcionAsiento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDescripcionAsiento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDescripcionAsiento = new JButtonMe();
		//this.jButtonSiguientesTipoDescripcionAsiento.setText(">>");
        this.jButtonSiguientesTipoDescripcionAsiento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDescripcionAsiento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento,"nuevoguardarcambios_button","Nue",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDescripcionAsiento";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDescripcionAsiento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDescripcionAsiento";
		inputMap = this.jButtonRecargarInformacionTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDescripcionAsiento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDescripcionAsiento";
		inputMap = this.jButtonSiguientesTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDescripcionAsiento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDescripcionAsiento";
		inputMap = this.jButtonAnterioresTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDescripcionAsiento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDescripcionAsiento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDescripcionAsiento.setMinimumSize(new Dimension(this.getWidth(),TipoDescripcionAsientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDescripcionAsientoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDescripcionAsiento.setMaximumSize(new Dimension(this.getWidth(),TipoDescripcionAsientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDescripcionAsientoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDescripcionAsiento.setPreferredSize(new Dimension(this.getWidth(),TipoDescripcionAsientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDescripcionAsientoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDescripcionAsiento = new GridBagLayout();

			this.jPanelPaginacionTipoDescripcionAsiento.setLayout(gridaBagLayoutPaginacionTipoDescripcionAsiento);						
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonAnterioresTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
					
						
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
			
			this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
						
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
			this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonSiguientesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 1;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonNuevoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
						
			
			
			if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
				this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDescripcionAsiento.gridy = 1;
				this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonGuardarCambiosTablaTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			}
			
			
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 1;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonDuplicarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 1;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonCopiarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 1;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonVerFormTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 1;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDescripcionAsiento.add(this.jButtonCerrarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
		
		
		this.jButtonRecargarInformacionTipoDescripcionAsiento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDescripcionAsiento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDescripcionAsiento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDescripcionAsiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDescripcionAsiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDescripcionAsiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDescripcionAsiento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDescripcionAsiento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDescripcionAsiento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDescripcionAsiento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDescripcionAsiento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDescripcionAsiento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDescripcionAsiento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDescripcionAsiento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDescripcionAsiento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDescripcionAsiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDescripcionAsiento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDescripcionAsiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDescripcionAsiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDescripcionAsiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDescripcionAsiento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDescripcionAsiento.setLayout(gridaBagParametrosReportesTipoDescripcionAsiento);
			this.jPanelParametrosReportesAccionesTipoDescripcionAsiento.setLayout(gridaBagParametrosReportesAccionesTipoDescripcionAsiento);
			
			
			this.jPanelParametrosAuxiliar1TipoDescripcionAsiento.setLayout(gridaBagParametrosAuxiliar1TipoDescripcionAsiento);
			this.jPanelParametrosAuxiliar2TipoDescripcionAsiento.setLayout(gridaBagParametrosAuxiliar2TipoDescripcionAsiento);
			this.jPanelParametrosAuxiliar3TipoDescripcionAsiento.setLayout(gridaBagParametrosAuxiliar3TipoDescripcionAsiento);
			this.jPanelParametrosAuxiliar4TipoDescripcionAsiento.setLayout(gridaBagParametrosAuxiliar4TipoDescripcionAsiento);
			//this.jPanelParametrosAuxiliar5TipoDescripcionAsiento.setLayout(gridaBagParametrosAuxiliar2TipoDescripcionAsiento);			
			
			
			
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jButtonRecargarInformacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDescripcionAsiento.add(this.jComboBoxTiposPaginacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDescripcionAsiento.add(this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDescripcionAsiento.add(this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jPanelParametrosAuxiliar1TipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDescripcionAsiento.add(this.jComboBoxTiposReportesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jPanelParametrosAuxiliar4TipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jComboBoxTiposReportesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jCheckBoxGenerarReporteTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jPanelParametrosAuxiliar2TipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jLabelAccionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
				this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jButtonAbrirOrderByTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jComboBoxTiposSeleccionarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
			
			
			/*
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDescripcionAsiento.add(this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);															
				
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDescripcionAsiento.add(this.jCheckBoxSeleccionadosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jPanelParametrosAuxiliar3TipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jComboBoxTiposRelacionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
				
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jComboBoxTiposAccionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
	
				
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDescripcionAsiento.add(this.jTextFieldValorCampoGeneralTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDescripcionAsiento = new GridBagLayout();

			this.jScrollPanelDatosTipoDescripcionAsiento.setLayout(gridaBagLayoutDatosTipoDescripcionAsiento);
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
			
			this.jScrollPanelDatosTipoDescripcionAsiento.add(this.jTableDatosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDescripcionAsiento.setViewportView(this.jTableDatosTipoDescripcionAsiento);
		this.jTableDatosTipoDescripcionAsiento.setFillsViewportHeight(true);
		this.jTableDatosTipoDescripcionAsiento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDescripcionAsiento= new GridBagLayout();
		this.jPanelAccionesTipoDescripcionAsiento.setLayout(gridaBagLayoutAccionesTipoDescripcionAsiento);
		
		
		/*	
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
			
		this.jPanelAccionesTipoDescripcionAsiento.add(this.jButtonNuevoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdModuloTipoDescripcionAsiento= new GridBagLayout();
		gridaBagLayoutFK_IdModuloTipoDescripcionAsiento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloTipoDescripcionAsiento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloTipoDescripcionAsiento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloTipoDescripcionAsiento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloTipoDescripcionAsiento.setLayout(gridaBagLayoutFK_IdModuloTipoDescripcionAsiento);

		gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
		jPanelFK_IdModuloTipoDescripcionAsiento.add(jLabelid_moduloFK_IdModuloTipoDescripcionAsiento, gridBagConstraintsTipoDescripcionAsiento);

		gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		gridBagConstraintsTipoDescripcionAsiento.gridx = 1;
		jPanelFK_IdModuloTipoDescripcionAsiento.add(jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento, gridBagConstraintsTipoDescripcionAsiento);

		gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDescripcionAsiento.gridy = 1;
		gridBagConstraintsTipoDescripcionAsiento.gridx =1;
		jPanelFK_IdModuloTipoDescripcionAsiento.add(jButtonFK_IdModuloTipoDescripcionAsiento, gridBagConstraintsTipoDescripcionAsiento);

		jTabbedPaneBusquedasTipoDescripcionAsiento.addTab("1.-Por Modulo ", jPanelFK_IdModuloTipoDescripcionAsiento);
		jTabbedPaneBusquedasTipoDescripcionAsiento.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDescripcionAsiento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDescripcionAsiento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();						
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;		
			//this.gridBagConstraintsTipoDescripcionAsiento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;		
		//this.gridBagConstraintsTipoDescripcionAsiento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDescripcionAsiento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;		
			this.gridBagConstraintsTipoDescripcionAsiento.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);								
		
		
		/*
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		*/		
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx =0;
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDescripcionAsiento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
				
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDescripcionAsiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDescripcionAsiento = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDescripcionAsiento.setLayout(gridaBagLayoutBusquedasParametrosTipoDescripcionAsiento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDescripcionAsiento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			
			
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
			
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDescripcionAsiento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDescripcionAsiento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDescripcionAsiento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDescripcionAsiento.setName("jPanelReporteDinamicoTipoDescripcionAsiento"); 
		
		this.jPanelReporteDinamicoTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDescripcionAsiento.setLayout(gridaBagLayoutReporteDinamicoTipoDescripcionAsiento);
		
		
		this.jInternalFrameReporteDinamicoTipoDescripcionAsiento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDescripcionAsiento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDescripcionAsiento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descripcion Asiento Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDescripcionAsiento = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDescripcionAsiento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jLabelColumnasSelectReporteTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDescripcionAsiento = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDescripcionAsiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDescripcionAsiento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDescripcionAsiento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDescripcionAsiento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDescripcionAsiento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDescripcionAsiento=new JScrollPane(this.jListColumnasSelectReporteTipoDescripcionAsiento);
			
			this.jScrollColumnasSelectReporteTipoDescripcionAsiento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDescripcionAsiento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDescripcionAsiento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jListColumnasSelectReporteTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jScrollColumnasSelectReporteTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDescripcionAsiento = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDescripcionAsiento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDescripcionAsiento = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDescripcionAsiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDescripcionAsiento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDescripcionAsiento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDescripcionAsiento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDescripcionAsiento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDescripcionAsiento=new JScrollPane(this.jListRelacionesSelectReporteTipoDescripcionAsiento);
			
			this.jScrollRelacionesSelectReporteTipoDescripcionAsiento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDescripcionAsiento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDescripcionAsiento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoDescripcionAsiento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDescripcionAsiento = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDescripcionAsiento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDescripcionAsiento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDescripcionAsiento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDescripcionAsiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDescripcionAsiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDescripcionAsiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDescripcionAsiento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDescripcionAsiento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jLabelGenerarExcelReporteDinamicoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDescripcionAsiento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDescripcionAsiento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDescripcionAsiento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDescripcionAsiento.setToolTipText("Generar EXCEL"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jButtonGenerarExcelReporteDinamicoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jComboBoxTiposReportesDinamicoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDescripcionAsiento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDescripcionAsiento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jLabelTiposArchivoReporteDinamicoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDescripcionAsiento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDescripcionAsiento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDescripcionAsiento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDescripcionAsiento.setToolTipText("Generar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jButtonGenerarReporteDinamicoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDescripcionAsiento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDescripcionAsiento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDescripcionAsiento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDescripcionAsiento.setToolTipText("Cancelar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDescripcionAsiento.add(this.jButtonCerrarReporteDinamicoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDescripcionAsiento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDescripcionAsiento= new JScrollPane(jPanelReporteDinamicoTipoDescripcionAsiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descripcion Asiento Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDescripcionAsiento);
		this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDescripcionAsiento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDescripcionAsiento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDescripcionAsiento.setName("jPanelImportacionTipoDescripcionAsiento"); 
		
		this.jPanelImportacionTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDescripcionAsiento.setLayout(gridaBagLayoutImportacionTipoDescripcionAsiento);
		
		
		this.jInternalFrameImportacionTipoDescripcionAsiento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDescripcionAsiento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDescripcionAsiento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDescripcionAsiento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDescripcionAsiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDescripcionAsiento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDescripcionAsiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setResizable(true);
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setClosable(true);
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDescripcionAsiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDescripcionAsiento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDescripcionAsiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setResizable(true);
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setClosable(true);
	    this.jInternalFrameImportacionTipoDescripcionAsiento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descripcion Asiento Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDescripcionAsiento = new JLabelMe();

		this.jLabelArchivoImportacionTipoDescripcionAsiento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDescripcionAsiento.add(this.jLabelArchivoImportacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDescripcionAsiento = new JFileChooser();		
		this.jFileChooserImportacionTipoDescripcionAsiento.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDescripcionAsiento = new JButtonMe();
		this.jButtonAbrirImportacionTipoDescripcionAsiento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDescripcionAsiento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDescripcionAsiento.setToolTipText("Generar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDescripcionAsiento.add(this.jButtonAbrirImportacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDescripcionAsiento = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDescripcionAsiento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDescripcionAsiento.add(this.jLabelPathArchivoImportacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDescripcionAsiento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDescripcionAsiento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDescripcionAsiento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDescripcionAsiento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDescripcionAsiento.add(this.jTextFieldPathArchivoImportacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDescripcionAsiento = new JButtonMe();
		this.jButtonGenerarImportacionTipoDescripcionAsiento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDescripcionAsiento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDescripcionAsiento.setToolTipText("Generar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDescripcionAsiento.add(this.jButtonGenerarImportacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDescripcionAsiento = new JButtonMe();
		this.jButtonCerrarImportacionTipoDescripcionAsiento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDescripcionAsiento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDescripcionAsiento.setToolTipText("Cancelar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDescripcionAsiento.add(this.jButtonCerrarImportacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDescripcionAsiento = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDescripcionAsiento= new JScrollPane(jPanelImportacionTipoDescripcionAsiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDescripcionAsiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDescripcionAsiento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDescripcionAsiento);
		this.jInternalFrameImportacionTipoDescripcionAsiento.getContentPane().add(this.jScrollPanelImportacionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDescripcionAsiento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDescripcionAsiento = new JButtonMe();
			this.jButtonAbrirOrderByTipoDescripcionAsiento.setText("Orden");
			this.jButtonAbrirOrderByTipoDescripcionAsiento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDescripcionAsiento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDescripcionAsiento";
			inputMap = this.jButtonAbrirOrderByTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDescripcionAsiento"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDescripcionAsiento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDescripcionAsiento.setName("jPanelOrderByTipoDescripcionAsiento"); 
			
			this.jPanelOrderByTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDescripcionAsiento.setLayout(gridaBagLayoutOrderByTipoDescripcionAsiento);
			
			
			this.jTableDatosTipoDescripcionAsientoOrderBy = new JTableMe();        
			this.jTableDatosTipoDescripcionAsientoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDescripcionAsientoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDescripcionAsientoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDescripcionAsientoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDescripcionAsientoOrderBy.setViewportView(this.jTableDatosTipoDescripcionAsientoOrderBy);
			this.jTableDatosTipoDescripcionAsientoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDescripcionAsientoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDescripcionAsiento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDescripcionAsiento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDescripcionAsiento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDescripcionAsiento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDescripcionAsiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDescripcionAsiento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDescripcionAsiento.setTitle("Orden");
			this.jInternalFrameOrderByTipoDescripcionAsiento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDescripcionAsiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDescripcionAsiento.setResizable(true);
			this.jInternalFrameOrderByTipoDescripcionAsiento.setClosable(true);
			this.jInternalFrameOrderByTipoDescripcionAsiento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descripcion Asiento Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDescripcionAsiento.ipady =150;
				
			this.jPanelOrderByTipoDescripcionAsiento.add(jScrollPanelDatosTipoDescripcionAsientoOrderBy, this.gridBagConstraintsTipoDescripcionAsiento);//this.jTableDatosTipoDescripcionAsientoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDescripcionAsiento = new JButtonMe();
			this.jButtonCerrarOrderByTipoDescripcionAsiento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDescripcionAsiento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDescripcionAsiento.setToolTipText("Cancelar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDescripcionAsiento.add(this.jButtonCerrarOrderByTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDescripcionAsiento = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDescripcionAsiento= new JScrollPane(jPanelOrderByTipoDescripcionAsiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDescripcionAsiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDescripcionAsiento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDescripcionAsiento);
			
			this.jInternalFrameOrderByTipoDescripcionAsiento.getContentPane().add(this.jScrollPanelOrderByTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
		
		} else {
			this.jButtonAbrirOrderByTipoDescripcionAsiento = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDescripcionAsiento.getRowHeight();//TipoDescripcionAsientoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDescripcionAsientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento.isSelected()) {
					iHeightTable=TipoDescripcionAsientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDescripcionAsientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDescripcionAsientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDescripcionAsientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDescripcionAsiento.isSelected()) {
					iHeightTable=TipoDescripcionAsientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDescripcionAsientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDescripcionAsientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDescripcionAsiento!=null && this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDescripcionAsiento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDescripcionAsiento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDescripcionAsiento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodescripcionasientoLogic.getTipoDescripcionAsientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodescripcionasientos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDescripcionAsiento> TraerTipoDescripcionAsientoBeans(List<TipoDescripcionAsiento> tipodescripcionasientos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDescripcionAsiento tipodescripcionasiento:tipodescripcionasientos) {
					
				if(!(TipoDescripcionAsientoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDescripcionAsientoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodescripcionasiento.setsDetalleGeneralEntityReporte(TipoDescripcionAsientoConstantesFunciones.getTipoDescripcionAsientoDescripcion(tipodescripcionasiento));
										
						
					
						
					
				} else  {
							
					//tipodescripcionasiento.setsDetalleGeneralEntityReporte(tipodescripcionasiento.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodescripcionasientobeans.add(tipodescripcionasientobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodescripcionasientos;
    }
	//PARA REPORTES FIN
}
