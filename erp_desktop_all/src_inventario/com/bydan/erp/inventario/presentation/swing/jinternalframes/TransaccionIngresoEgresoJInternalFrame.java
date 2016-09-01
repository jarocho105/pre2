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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TransaccionIngresoEgresoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TransaccionIngresoEgresoJInternalFrame extends TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransaccionIngresoEgreso;
	
	protected JMenuBar jmenuBarTransaccionIngresoEgreso;
	
	protected JMenu jmenuTransaccionIngresoEgreso;
	protected JMenu jmenuDatosTransaccionIngresoEgreso;
	protected JMenu jmenuArchivoTransaccionIngresoEgreso;
	protected JMenu jmenuAccionesTransaccionIngresoEgreso;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionIngresoEgreso;	
	protected GridBagConstraints gridBagConstraintsTransaccionIngresoEgreso;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransaccionIngresoEgresoDetalleFormJInternalFrame jInternalFrameDetalleFormTransaccionIngresoEgreso;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransaccionIngresoEgreso;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransaccionIngresoEgreso;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";
	
	public TransaccionIngresoEgresoSessionBean transaccioningresoegresoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TransaccionIngresoEgreso> transaccioningresoegresos;		
	public List<TransaccionIngresoEgreso> transaccioningresoegresosEliminados;	
	public List<TransaccionIngresoEgreso> transaccioningresoegresosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransaccionIngresoEgreso;		
	protected JButton jButtonAbrirOrderByTransaccionIngresoEgreso;
	
	
	//protected JPanel jPanelOrderByTransaccionIngresoEgreso;
	//public JScrollPane jScrollPanelOrderByTransaccionIngresoEgreso;	
	//protected JButton jButtonCerrarOrderByTransaccionIngresoEgreso;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransaccionIngresoEgresoLogic transaccioningresoegresoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransaccionIngresoEgreso;
	public JScrollPane jScrollPanelDatosEdicionTransaccionIngresoEgreso;
	public JScrollPane jScrollPanelDatosGeneralTransaccionIngresoEgreso;
    
	
	
	//public JScrollPane jScrollPanelDatosTransaccionIngresoEgresoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransaccionIngresoEgreso;
	//public JScrollPane jScrollPanelImportacionTransaccionIngresoEgreso;
	
	
	
	protected JPanel jPanelAccionesTransaccionIngresoEgreso;
	
    protected JPanel jPanelPaginacionTransaccionIngresoEgreso;
    protected JPanel jPanelParametrosReportesTransaccionIngresoEgreso;
	protected JPanel jPanelParametrosReportesAccionesTransaccionIngresoEgreso;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TransaccionIngresoEgreso;
	protected JPanel jPanelParametrosAuxiliar2TransaccionIngresoEgreso;
	protected JPanel jPanelParametrosAuxiliar3TransaccionIngresoEgreso;
	protected JPanel jPanelParametrosAuxiliar4TransaccionIngresoEgreso;
	//protected JPanel jPanelParametrosAuxiliar5TransaccionIngresoEgreso;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransaccionIngresoEgreso;
	//protected JPanel jPanelImportacionTransaccionIngresoEgreso;
	
	
	public JTable jTableDatosTransaccionIngresoEgreso;
	
	
	
	//public JTable jTableDatosTransaccionIngresoEgresoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransaccionIngresoEgreso;
	protected JButton jButtonDuplicarTransaccionIngresoEgreso;
	protected JButton jButtonCopiarTransaccionIngresoEgreso;
	protected JButton jButtonVerFormTransaccionIngresoEgreso;
	protected JButton jButtonNuevoRelacionesTransaccionIngresoEgreso;
	protected JButton jButtonModificarTransaccionIngresoEgreso;
	
    protected JButton jButtonGuardarCambiosTablaTransaccionIngresoEgreso;
	protected JButton jButtonCerrarTransaccionIngresoEgreso;
	
	
	protected JButton jButtonRecargarInformacionTransaccionIngresoEgreso;
	protected JButton jButtonProcesarInformacionTransaccionIngresoEgreso;
	
	
	protected JButton jButtonAnterioresTransaccionIngresoEgreso;
	protected JButton jButtonSiguientesTransaccionIngresoEgreso;
	protected JButton jButtonNuevoGuardarCambiosTransaccionIngresoEgreso;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransaccionIngresoEgreso;
	//protected JButton jButtonCerrarReporteDinamicoTransaccionIngresoEgreso;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgreso;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransaccionIngresoEgreso;
	//protected JButton jButtonGenerarImportacionTransaccionIngresoEgreso;
	//protected JButton jButtonCerrarImportacionTransaccionIngresoEgreso;
	//protected JFileChooser jFileChooserImportacionTransaccionIngresoEgreso;
	//protected File fileImportacionTransaccionIngresoEgreso;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionIngresoEgreso;
	protected JButton jButtonDuplicarToolBarTransaccionIngresoEgreso;
	protected JButton jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso;
	
	
	public JButton jButtonGuardarCambiosToolBarTransaccionIngresoEgreso;
	protected JButton jButtonCopiarToolBarTransaccionIngresoEgreso;
	protected JButton jButtonVerFormToolBarTransaccionIngresoEgreso;
	public JButton jButtonGuardarCambiosTablaToolBarTransaccionIngresoEgreso;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionIngresoEgreso;
	protected JButton jButtonCerrarToolBarTransaccionIngresoEgreso;
	
	protected JButton jButtonRecargarInformacionToolBarTransaccionIngresoEgreso;
	protected JButton jButtonProcesarInformacionToolBarTransaccionIngresoEgreso;
	protected JButton jButtonAnterioresToolBarTransaccionIngresoEgreso;
	protected JButton jButtonSiguientesToolBarTransaccionIngresoEgreso;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransaccionIngresoEgreso;
	protected JButton jButtonAbrirOrderByToolBarTransaccionIngresoEgreso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemDuplicarTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemNuevoRelacionesTransaccionIngresoEgreso;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemCopiarTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemVerFormTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemCerrarTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso;
	
	protected JMenuItem jMenuItemRecargarInformacionTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemProcesarInformacionTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemAnterioresTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemSiguientesTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemAbrirOrderByTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionIngresoEgreso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionIngresoEgreso;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransaccionIngresoEgreso;
	protected JCheckBox jCheckBoxSeleccionadosTransaccionIngresoEgreso;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso;
	protected JCheckBox jCheckBoxConGraficoReporteTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransaccionIngresoEgreso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransaccionIngresoEgreso;
	protected JTextField jTextFieldValorCampoGeneralTransaccionIngresoEgreso;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransaccionIngresoEgreso;
	//public JList<Reporte> jListColumnasSelectReporteTransaccionIngresoEgreso;
	//public JScrollPane jScrollColumnasSelectReporteTransaccionIngresoEgreso;
	
	//public JLabel jLabelRelacionesSelectReporteTransaccionIngresoEgreso;
	//public JList<Reporte> jListRelacionesSelectReporteTransaccionIngresoEgreso;
	//public JScrollPane jScrollRelacionesSelectReporteTransaccionIngresoEgreso;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransaccionIngresoEgreso;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransaccionIngresoEgreso;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransaccionIngresoEgreso;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransaccionIngresoEgreso;
	
		
	//public JLabel jLabelArchivoImportacionTransaccionIngresoEgreso;	
	//public JLabel jLabelPathArchivoImportacionTransaccionIngresoEgreso;
	//protected JTextField jTextFieldPathArchivoImportacionTransaccionIngresoEgreso;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransaccionIngresoEgreso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransaccionIngresoEgreso;
	
	//public JLabel jLabelColumnaCategoriaValorTransaccionIngresoEgreso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransaccionIngresoEgreso;
	
	//public JLabel jLabelColumnasValoresGraficoTransaccionIngresoEgreso;
	//public JList<Reporte> jListColumnasValoresGraficoTransaccionIngresoEgreso;
	//public JScrollPane jScrollColumnasValoresGraficoTransaccionIngresoEgreso;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransaccionIngresoEgreso;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransaccionIngresoEgreso;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransaccionIngresoEgreso;
	public JPanel jPanelFK_IdTransaccionTransaccionIngresoEgreso;
	public JButton jButtonFK_IdTransaccionTransaccionIngresoEgreso;
	
	public JPanel jPanelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso;
	public JLabel jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso;
	public JButton jButtonid_transaccionFK_IdTransaccionTransaccionIngresoEgreso= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionTransaccionIngresoEgresoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionTransaccionIngresoEgresoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransaccionIngresoEgresoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionIngresoEgresoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionIngresoEgresoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionIngresoEgresoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransaccionIngresoEgreso)	{
		this.jButtonRecargarInformacionTransaccionIngresoEgreso = jButtonRecargarInformacionTransaccionIngresoEgreso;
	}
	
	public JButton getjButtonProcesarInformacionTransaccionIngresoEgreso() {
		return this.jButtonProcesarInformacionTransaccionIngresoEgreso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionIngresoEgreso)	{
		this.jButtonProcesarInformacionTransaccionIngresoEgreso = jButtonProcesarInformacionTransaccionIngresoEgreso;
	}
	
	
	public JButton getjButtonRecargarInformacionTransaccionIngresoEgreso() {
		return this.jButtonRecargarInformacionTransaccionIngresoEgreso;
	}
	
	
	public List<TransaccionIngresoEgreso> gettransaccioningresoegresos() {
		return this.transaccioningresoegresos;
	}

	public void settransaccioningresoegresos(List<TransaccionIngresoEgreso> transaccioningresoegresos) {
		this.transaccioningresoegresos = transaccioningresoegresos;
	}
	
	public List<TransaccionIngresoEgreso> gettransaccioningresoegresosAux() {
		return this.transaccioningresoegresosAux;
	}

	public void settransaccioningresoegresosAux(List<TransaccionIngresoEgreso> transaccioningresoegresosAux) {
		this.transaccioningresoegresosAux = transaccioningresoegresosAux;
	}
	
	public List<TransaccionIngresoEgreso> gettransaccioningresoegresosEliminados() {
		return this.transaccioningresoegresosEliminados;
	}

	public void setTransaccionIngresoEgresosEliminados(List<TransaccionIngresoEgreso> transaccioningresoegresosEliminados) {
		this.transaccioningresoegresosEliminados = transaccioningresoegresosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransaccionIngresoEgreso() {
		return jComboBoxTiposSeleccionarTransaccionIngresoEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposSeleccionarTransaccionIngresoEgreso) {
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso = jComboBoxTiposSeleccionarTransaccionIngresoEgreso;
	}
	
	public void setBorderResaltarTiposSeleccionarTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransaccionIngresoEgreso() {
		return jTextFieldValorCampoGeneralTransaccionIngresoEgreso;
	}

	public void setjTextFieldValorCampoGeneralTransaccionIngresoEgreso(
			JTextField jTextFieldValorCampoGeneralTransaccionIngresoEgreso) {
		this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso = jTextFieldValorCampoGeneralTransaccionIngresoEgreso;
	}

	public void setBorderResaltarValorCampoGeneralTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransaccionIngresoEgreso() {
		return this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso;
	}

	public void setjCheckBoxSeleccionarTodosTransaccionIngresoEgreso(
			JCheckBox jCheckBoxSeleccionarTodosTransaccionIngresoEgreso) {
		this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso = jCheckBoxSeleccionarTodosTransaccionIngresoEgreso;
	}

	public void setBorderResaltarSeleccionarTodosTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransaccionIngresoEgreso() {
		return this.jCheckBoxSeleccionadosTransaccionIngresoEgreso;
	}

	public void setjCheckBoxSeleccionadosTransaccionIngresoEgreso(
			JCheckBox jCheckBoxSeleccionadosTransaccionIngresoEgreso) {
		this.jCheckBoxSeleccionadosTransaccionIngresoEgreso = jCheckBoxSeleccionadosTransaccionIngresoEgreso;
	}
	
	public void setBorderResaltarSeleccionadosTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransaccionIngresoEgreso() {
		return this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposArchivosReportesTransaccionIngresoEgreso) {
		this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso = jComboBoxTiposArchivosReportesTransaccionIngresoEgreso;
	}

	public void setBorderResaltarTiposArchivosReportesTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransaccionIngresoEgreso() {
		return this.jComboBoxTiposReportesTransaccionIngresoEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposReportesTransaccionIngresoEgreso) {
		this.jComboBoxTiposReportesTransaccionIngresoEgreso = jComboBoxTiposReportesTransaccionIngresoEgreso;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransaccionIngresoEgreso() {
	//	return jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransaccionIngresoEgreso(
	//		JComboBox jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso) {
	//	this.jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso = jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso = jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso;
	//}
	
	public void setBorderResaltarTiposReportesTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransaccionIngresoEgreso() {
		return this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposGraficosReportesTransaccionIngresoEgreso) {
		this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso = jComboBoxTiposGraficosReportesTransaccionIngresoEgreso;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransaccionIngresoEgreso() {
		return this.jComboBoxTiposPaginacionTransaccionIngresoEgreso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposPaginacionTransaccionIngresoEgreso) {
		this.jComboBoxTiposPaginacionTransaccionIngresoEgreso = jComboBoxTiposPaginacionTransaccionIngresoEgreso;
	}
	
	public void setBorderResaltarTiposPaginacionTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransaccionIngresoEgreso() {
		return this.jComboBoxTiposRelacionesTransaccionIngresoEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionIngresoEgreso() {
		return this.jComboBoxTiposAccionesTransaccionIngresoEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposRelacionesTransaccionIngresoEgreso) {
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso = jComboBoxTiposRelacionesTransaccionIngresoEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposAccionesTransaccionIngresoEgreso) {
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso = jComboBoxTiposAccionesTransaccionIngresoEgreso;
	}
	
	public void setBorderResaltarTiposRelacionesTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransaccionIngresoEgreso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransaccionIngresoEgreso() {
	//	return jCheckBoxConGraficoDinamicoTransaccionIngresoEgreso;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransaccionIngresoEgreso(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransaccionIngresoEgreso) {
	//	this.jCheckBoxConGraficoDinamicoTransaccionIngresoEgreso = jCheckBoxConGraficoDinamicoTransaccionIngresoEgreso;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransaccionIngresoEgreso() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransaccionIngresoEgreso.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransaccionIngresoEgreso .setBorder(borderResaltar);		
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
		this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
		
		this.transaccioningresoegresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioningresoegresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransaccionIngresoEgresoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransaccionIngresoEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionIngresoEgresoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionIngresoEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionIngresoEgresoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transaccion Ingreso Egreso MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
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
		
		TransaccionIngresoEgresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransaccionIngresoEgreso= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"nuevo","nuevo","Nuevo"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"duplicar","duplicar","Duplicar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"copiar","copiar","Copiar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"ver_form","ver_form","Ver"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"recargar","recargar","Recargar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,
							"cerrar","cerrar","Salir"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso;
			
				this.jButtonProcesarInformacionToolBarTransaccionIngresoEgreso=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransaccionIngresoEgreso;
				
		//protected JButton jButtonModificarToolBarTransaccionIngresoEgreso;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransaccionIngresoEgreso=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransaccionIngresoEgreso=new JMenuMe("General");
		this.jmenuArchivoTransaccionIngresoEgreso=new JMenuMe("Archivo");
		this.jmenuAccionesTransaccionIngresoEgreso=new JMenuMe("Acciones");
		this.jmenuDatosTransaccionIngresoEgreso=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionIngresoEgreso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionIngresoEgreso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionIngresoEgreso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransaccionIngresoEgreso= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransaccionIngresoEgreso.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransaccionIngresoEgreso,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransaccionIngresoEgreso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionIngresoEgreso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionIngresoEgreso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransaccionIngresoEgreso= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransaccionIngresoEgreso.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransaccionIngresoEgreso,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransaccionIngresoEgreso= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransaccionIngresoEgreso.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransaccionIngresoEgreso,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionIngresoEgreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionIngresoEgreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionIngresoEgreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransaccionIngresoEgreso= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransaccionIngresoEgreso.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransaccionIngresoEgreso,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransaccionIngresoEgreso= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransaccionIngresoEgreso.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransaccionIngresoEgreso,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransaccionIngresoEgreso= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransaccionIngresoEgreso.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransaccionIngresoEgreso,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransaccionIngresoEgreso= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransaccionIngresoEgreso.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransaccionIngresoEgreso,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransaccionIngresoEgreso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransaccionIngresoEgreso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransaccionIngresoEgreso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionIngresoEgreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionIngresoEgreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionIngresoEgreso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransaccionIngresoEgreso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransaccionIngresoEgreso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransaccionIngresoEgreso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransaccionIngresoEgreso.add(this.jMenuItemCerrarTransaccionIngresoEgreso);
			
			this.jmenuAccionesTransaccionIngresoEgreso.add(this.jMenuItemNuevoTransaccionIngresoEgreso);
			this.jmenuAccionesTransaccionIngresoEgreso.add(this.jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso);
			this.jmenuAccionesTransaccionIngresoEgreso.add(this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso);
			this.jmenuAccionesTransaccionIngresoEgreso.add(this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso);		
			this.jmenuAccionesTransaccionIngresoEgreso.add(this.jMenuItemDuplicarTransaccionIngresoEgreso);		
			this.jmenuAccionesTransaccionIngresoEgreso.add(this.jMenuItemCopiarTransaccionIngresoEgreso);		
			this.jmenuAccionesTransaccionIngresoEgreso.add(this.jMenuItemVerFormTransaccionIngresoEgreso);		
			
			this.jmenuDatosTransaccionIngresoEgreso.add(this.jMenuItemRecargarInformacionTransaccionIngresoEgreso);				
			this.jmenuDatosTransaccionIngresoEgreso.add(this.jMenuItemAnterioresTransaccionIngresoEgreso);				
			this.jmenuDatosTransaccionIngresoEgreso.add(this.jMenuItemSiguientesTransaccionIngresoEgreso);				
			this.jmenuDatosTransaccionIngresoEgreso.add(this.jMenuItemAbrirOrderByTransaccionIngresoEgreso);				
			this.jmenuDatosTransaccionIngresoEgreso.add(this.jMenuItemMostrarOcultarTransaccionIngresoEgreso);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransaccionIngresoEgreso.add(this.jMenuItemGuardarCambiosTransaccionIngresoEgreso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransaccionIngresoEgreso.add(this.jmenuArchivoTransaccionIngresoEgreso);		
			this.jmenuBarTransaccionIngresoEgreso.add(this.jmenuAccionesTransaccionIngresoEgreso);		
			this.jmenuBarTransaccionIngresoEgreso.add(this.jmenuDatosTransaccionIngresoEgreso);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransaccionIngresoEgreso);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransaccionIngresoEgreso() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTransaccionTransaccionIngresoEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionTransaccionIngresoEgreso.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionTransaccionIngresoEgreso= new JButtonMe();
		this.jButtonFK_IdTransaccionTransaccionIngresoEgreso.setText("Buscar");
		this.jButtonFK_IdTransaccionTransaccionIngresoEgreso.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionTransaccionIngresoEgreso,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTransaccionIngresoEgreso=new JTabbedPane();


		this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransaccionIngresoEgreso = new TransaccionIngresoEgresoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transaccion Ingreso Egreso DATOS");
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso = new TransaccionIngresoEgresoDetalleFormJInternalFrame(jDesktopPane,this.transaccioningresoegresoSessionBean.getConGuardarRelaciones(),this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso = null;//new TransaccionIngresoEgresoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionIngresoEgreso= new GridBagLayout();
		
		
		this.jTableDatosTransaccionIngresoEgreso = new JTableMe();      
		
		String sToolTipTransaccionIngresoEgreso="";
		sToolTipTransaccionIngresoEgreso=TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionIngresoEgreso+="(Inventario.TransaccionIngresoEgreso)";
		}
		
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionIngresoEgreso+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransaccionIngresoEgreso.setToolTipText(sToolTipTransaccionIngresoEgreso);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransaccionIngresoEgreso);
		this.jTableDatosTransaccionIngresoEgreso.setAutoCreateRowSorter(true);
		this.jTableDatosTransaccionIngresoEgreso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransaccionIngresoEgreso.setRowSelectionAllowed(true);
		this.jTableDatosTransaccionIngresoEgreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonDuplicarTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonCopiarTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonVerFormTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonNuevoRelacionesTransaccionIngresoEgreso = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonCerrarTransaccionIngresoEgreso = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionIngresoEgreso = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransaccionIngresoEgreso = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transaccion Ingreso Egreso";
		
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Ingreso Egresoes" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionIngresoEgreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionIngresoEgreso.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionIngresoEgreso.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso=new ReporteDinamicoJInternalFrame(TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransaccionIngresoEgreso();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransaccionIngresoEgreso=new ImportacionJInternalFrame(TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransaccionIngresoEgreso();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransaccionIngresoEgreso = new JButtonMe();
		
		this.jButtonAbrirOrderByTransaccionIngresoEgreso.setText("Orden");
		this.jButtonAbrirOrderByTransaccionIngresoEgreso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionIngresoEgreso,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionIngresoEgreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionIngresoEgreso,false,this);
			
			//this.cargarOrderByTransaccionIngresoEgreso(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionIngresoEgreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionIngresoEgreso,true,this);
			
			//this.cargarOrderByTransaccionIngresoEgreso(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransaccionIngresoEgreso.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTransaccionIngresoEgreso.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTransaccionIngresoEgreso.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTransaccionIngresoEgreso.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionIngresoEgreso.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionIngresoEgreso.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransaccionIngresoEgreso.setText("Nuevo");
		this.jButtonDuplicarTransaccionIngresoEgreso.setText("Duplicar");
		this.jButtonCopiarTransaccionIngresoEgreso.setText("Copiar");
		this.jButtonVerFormTransaccionIngresoEgreso.setText("Ver");
		this.jButtonNuevoRelacionesTransaccionIngresoEgreso.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.setText("Guardar");
		this.jButtonCerrarTransaccionIngresoEgreso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionIngresoEgreso,"nuevo_button","Nuevo",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransaccionIngresoEgreso,"duplicar_button","Duplicar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransaccionIngresoEgreso,"copiar_button","Copiar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransaccionIngresoEgreso,"ver_form","Ver",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransaccionIngresoEgreso,"nuevorelaciones_button","Nuevo Rel",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso,"guardarcambiostabla_button","Guardar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionIngresoEgreso,"cerrar_button","Salir",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransaccionIngresoEgreso.setToolTipText("Nuevo"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransaccionIngresoEgreso.setToolTipText("Duplicar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransaccionIngresoEgreso.setToolTipText("Copiar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransaccionIngresoEgreso.setToolTipText("Ver"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransaccionIngresoEgreso.setToolTipText("Nuevo Rel"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.setToolTipText("Guardar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionIngresoEgreso.setToolTipText("Salir"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionIngresoEgreso";
		inputMap = this.jButtonNuevoTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionIngresoEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionIngresoEgreso"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransaccionIngresoEgreso";
		inputMap = this.jButtonDuplicarTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransaccionIngresoEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransaccionIngresoEgreso"));
		
		//COPIAR
		sMapKey = "CopiarTransaccionIngresoEgreso";
		inputMap = this.jButtonCopiarTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransaccionIngresoEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransaccionIngresoEgreso"));
		
		//VEr FORM
		sMapKey = "VerFormTransaccionIngresoEgreso";
		inputMap = this.jButtonVerFormTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransaccionIngresoEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransaccionIngresoEgreso"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransaccionIngresoEgreso";
		inputMap = this.jButtonNuevoRelacionesTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransaccionIngresoEgreso"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransaccionIngresoEgreso";
		inputMap = this.jButtonModificarTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransaccionIngresoEgreso"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransaccionIngresoEgreso";
		inputMap = this.jButtonCerrarTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionIngresoEgreso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionIngresoEgreso";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionIngresoEgreso"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TransaccionIngresoEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TransaccionIngresoEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TransaccionIngresoEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TransaccionIngresoEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TransaccionIngresoEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransaccionIngresoEgreso.setName("jPanelParametrosReportesTransaccionIngresoEgreso"); 
		
		this.jPanelParametrosReportesAccionesTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransaccionIngresoEgreso.setName("jPanelParametrosReportesAccionesTransaccionIngresoEgreso"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonRecargarInformacionTransaccionIngresoEgreso.setText("Recargar");
		this.jButtonRecargarInformacionTransaccionIngresoEgreso.setToolTipText("Recargar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransaccionIngresoEgreso,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonProcesarInformacionTransaccionIngresoEgreso.setText("Procesar");
		this.jButtonProcesarInformacionTransaccionIngresoEgreso.setToolTipText("Procesar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransaccionIngresoEgreso.setVisible(false);
			
		this.jButtonProcesarInformacionTransaccionIngresoEgreso.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionIngresoEgreso.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionIngresoEgreso.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.setText("TIPO");       
		this.jComboBoxTiposReportesTransaccionIngresoEgreso.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.setText("Accion");
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.setText("Accion");
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransaccionIngresoEgreso = new JLabelMe();
		
		this.jLabelAccionesTransaccionIngresoEgreso.setText("Acciones");		
		this.jLabelAccionesTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransaccionIngresoEgreso = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransaccionIngresoEgreso.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransaccionIngresoEgreso.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransaccionIngresoEgreso = new JButtonMe();
		//this.jButtonAnterioresTransaccionIngresoEgreso.setText("<<");
        this.jButtonAnterioresTransaccionIngresoEgreso.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransaccionIngresoEgreso,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransaccionIngresoEgreso = new JButtonMe();
		//this.jButtonSiguientesTransaccionIngresoEgreso.setText(">>");
        this.jButtonSiguientesTransaccionIngresoEgreso.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransaccionIngresoEgreso,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso,"nuevoguardarcambios_button","Nue",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransaccionIngresoEgreso";
		inputMap = this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransaccionIngresoEgreso"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransaccionIngresoEgreso";
		inputMap = this.jButtonRecargarInformacionTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransaccionIngresoEgreso"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransaccionIngresoEgreso";
		inputMap = this.jButtonSiguientesTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransaccionIngresoEgreso"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransaccionIngresoEgreso";
		inputMap = this.jButtonAnterioresTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransaccionIngresoEgreso"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransaccionIngresoEgreso();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransaccionIngresoEgreso.setMinimumSize(new Dimension(this.getWidth(),TransaccionIngresoEgresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionIngresoEgresoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionIngresoEgreso.setMaximumSize(new Dimension(this.getWidth(),TransaccionIngresoEgresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionIngresoEgresoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionIngresoEgreso.setPreferredSize(new Dimension(this.getWidth(),TransaccionIngresoEgresoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionIngresoEgresoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransaccionIngresoEgreso = new GridBagLayout();

			this.jPanelPaginacionTransaccionIngresoEgreso.setLayout(gridaBagLayoutPaginacionTransaccionIngresoEgreso);						
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonAnterioresTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
					
						
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
			
			this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
						
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
			this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonSiguientesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 1;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonNuevoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
						
			
			
			if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
				this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 1;
				this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			}
			
			
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 1;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonDuplicarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 1;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonCopiarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 1;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonVerFormTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 1;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransaccionIngresoEgreso.add(this.jButtonCerrarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
		
		
		this.jButtonRecargarInformacionTransaccionIngresoEgreso.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionIngresoEgreso.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionIngresoEgreso.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransaccionIngresoEgreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionIngresoEgreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionIngresoEgreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransaccionIngresoEgreso.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionIngresoEgreso.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionIngresoEgreso.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransaccionIngresoEgreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransaccionIngresoEgreso = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TransaccionIngresoEgreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TransaccionIngresoEgreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TransaccionIngresoEgreso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TransaccionIngresoEgreso = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransaccionIngresoEgreso.setLayout(gridaBagParametrosReportesTransaccionIngresoEgreso);
			this.jPanelParametrosReportesAccionesTransaccionIngresoEgreso.setLayout(gridaBagParametrosReportesAccionesTransaccionIngresoEgreso);
			
			
			this.jPanelParametrosAuxiliar1TransaccionIngresoEgreso.setLayout(gridaBagParametrosAuxiliar1TransaccionIngresoEgreso);
			this.jPanelParametrosAuxiliar2TransaccionIngresoEgreso.setLayout(gridaBagParametrosAuxiliar2TransaccionIngresoEgreso);
			this.jPanelParametrosAuxiliar3TransaccionIngresoEgreso.setLayout(gridaBagParametrosAuxiliar3TransaccionIngresoEgreso);
			this.jPanelParametrosAuxiliar4TransaccionIngresoEgreso.setLayout(gridaBagParametrosAuxiliar4TransaccionIngresoEgreso);
			//this.jPanelParametrosAuxiliar5TransaccionIngresoEgreso.setLayout(gridaBagParametrosAuxiliar2TransaccionIngresoEgreso);			
			
			
			
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jButtonRecargarInformacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionIngresoEgreso.add(this.jComboBoxTiposPaginacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionIngresoEgreso.add(this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionIngresoEgreso.add(this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jPanelParametrosAuxiliar1TransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TransaccionIngresoEgreso.add(this.jComboBoxTiposReportesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jPanelParametrosAuxiliar4TransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jComboBoxTiposReportesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jCheckBoxGenerarReporteTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jPanelParametrosAuxiliar2TransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jLabelAccionesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
				this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jButtonAbrirOrderByTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
			
			
			/*
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionIngresoEgreso.add(this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);															
				
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionIngresoEgreso.add(this.jCheckBoxSeleccionadosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jPanelParametrosAuxiliar3TransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jComboBoxTiposAccionesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
	
				
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionIngresoEgreso.add(this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransaccionIngresoEgreso = new GridBagLayout();

			this.jScrollPanelDatosTransaccionIngresoEgreso.setLayout(gridaBagLayoutDatosTransaccionIngresoEgreso);
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
			
			this.jScrollPanelDatosTransaccionIngresoEgreso.add(this.jTableDatosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransaccionIngresoEgreso.setViewportView(this.jTableDatosTransaccionIngresoEgreso);
		this.jTableDatosTransaccionIngresoEgreso.setFillsViewportHeight(true);
		this.jTableDatosTransaccionIngresoEgreso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransaccionIngresoEgreso= new GridBagLayout();
		this.jPanelAccionesTransaccionIngresoEgreso.setLayout(gridaBagLayoutAccionesTransaccionIngresoEgreso);
		
		
		/*	
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
			
		this.jPanelAccionesTransaccionIngresoEgreso.add(this.jButtonNuevoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTransaccionTransaccionIngresoEgreso= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionTransaccionIngresoEgreso.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionTransaccionIngresoEgreso.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionTransaccionIngresoEgreso.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionTransaccionIngresoEgreso.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionTransaccionIngresoEgreso.setLayout(gridaBagLayoutFK_IdTransaccionTransaccionIngresoEgreso);

		gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
		jPanelFK_IdTransaccionTransaccionIngresoEgreso.add(jLabelid_transaccionFK_IdTransaccionTransaccionIngresoEgreso, gridBagConstraintsTransaccionIngresoEgreso);

		gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		gridBagConstraintsTransaccionIngresoEgreso.gridx = 1;
		jPanelFK_IdTransaccionTransaccionIngresoEgreso.add(jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso, gridBagConstraintsTransaccionIngresoEgreso);

		gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionIngresoEgreso.gridy = 1;
		gridBagConstraintsTransaccionIngresoEgreso.gridx =1;
		jPanelFK_IdTransaccionTransaccionIngresoEgreso.add(jButtonFK_IdTransaccionTransaccionIngresoEgreso, gridBagConstraintsTransaccionIngresoEgreso);

		jTabbedPaneBusquedasTransaccionIngresoEgreso.addTab("1.-Por Transaccion ", jPanelFK_IdTransaccionTransaccionIngresoEgreso);
		jTabbedPaneBusquedasTransaccionIngresoEgreso.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionIngresoEgreso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionIngresoEgreso);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;		
			//this.gridBagConstraintsTransaccionIngresoEgreso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;		
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransaccionIngresoEgreso);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;		
			this.gridBagConstraintsTransaccionIngresoEgreso.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);								
		
		
		/*
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		*/		
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx =0;
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionIngresoEgreso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
				
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransaccionIngresoEgreso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionIngresoEgreso = new GridBagLayout();
			this.jPanelBusquedasParametrosTransaccionIngresoEgreso.setLayout(gridaBagLayoutBusquedasParametrosTransaccionIngresoEgreso);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransaccionIngresoEgreso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			
			
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
			
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransaccionIngresoEgreso;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransaccionIngresoEgreso() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransaccionIngresoEgreso = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.setName("jPanelReporteDinamicoTransaccionIngresoEgreso"); 
		
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.setLayout(gridaBagLayoutReporteDinamicoTransaccionIngresoEgreso);
		
		
		this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionIngresoEgreso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Ingreso Egresoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransaccionIngresoEgreso = new JLabelMe();

		this.jLabelColumnasSelectReporteTransaccionIngresoEgreso.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jLabelColumnasSelectReporteTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransaccionIngresoEgreso = new JList<Reporte>();
		this.jListColumnasSelectReporteTransaccionIngresoEgreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransaccionIngresoEgreso.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransaccionIngresoEgreso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionIngresoEgreso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionIngresoEgreso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransaccionIngresoEgreso=new JScrollPane(this.jListColumnasSelectReporteTransaccionIngresoEgreso);
			
			this.jScrollColumnasSelectReporteTransaccionIngresoEgreso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionIngresoEgreso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionIngresoEgreso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jListColumnasSelectReporteTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jScrollColumnasSelectReporteTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransaccionIngresoEgreso = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransaccionIngresoEgreso.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransaccionIngresoEgreso = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransaccionIngresoEgreso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransaccionIngresoEgreso.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransaccionIngresoEgreso.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionIngresoEgreso.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionIngresoEgreso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransaccionIngresoEgreso=new JScrollPane(this.jListRelacionesSelectReporteTransaccionIngresoEgreso);
			
			this.jScrollRelacionesSelectReporteTransaccionIngresoEgreso.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionIngresoEgreso.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionIngresoEgreso.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransaccionIngresoEgreso = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransaccionIngresoEgreso = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransaccionIngresoEgreso = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransaccionIngresoEgreso = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransaccionIngresoEgreso.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jLabelGenerarExcelReporteDinamicoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgreso.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgreso,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgreso.setToolTipText("Generar EXCEL"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jComboBoxTiposReportesDinamicoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransaccionIngresoEgreso = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransaccionIngresoEgreso.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jLabelTiposArchivoReporteDinamicoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jComboBoxTiposArchivosReportesDinamicoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransaccionIngresoEgreso.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransaccionIngresoEgreso,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransaccionIngresoEgreso.setToolTipText("Generar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jButtonGenerarReporteDinamicoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransaccionIngresoEgreso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransaccionIngresoEgreso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransaccionIngresoEgreso.setToolTipText("Cancelar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionIngresoEgreso.add(this.jButtonCerrarReporteDinamicoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransaccionIngresoEgreso = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso= new JScrollPane(jPanelReporteDinamicoTransaccionIngresoEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Ingreso Egresoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransaccionIngresoEgreso);
		this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getContentPane().add(this.jScrollPanelReporteDinamicoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransaccionIngresoEgreso() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransaccionIngresoEgreso = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransaccionIngresoEgreso.setName("jPanelImportacionTransaccionIngresoEgreso"); 
		
		this.jPanelImportacionTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransaccionIngresoEgreso.setLayout(gridaBagLayoutImportacionTransaccionIngresoEgreso);
		
		
		this.jInternalFrameImportacionTransaccionIngresoEgreso= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransaccionIngresoEgreso= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransaccionIngresoEgreso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionIngresoEgreso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransaccionIngresoEgreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionIngresoEgreso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionIngresoEgreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setResizable(true);
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setClosable(true);
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransaccionIngresoEgreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionIngresoEgreso.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionIngresoEgreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setResizable(true);
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setClosable(true);
	    this.jInternalFrameImportacionTransaccionIngresoEgreso.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Ingreso Egresoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransaccionIngresoEgreso = new JLabelMe();

		this.jLabelArchivoImportacionTransaccionIngresoEgreso.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionIngresoEgreso.add(this.jLabelArchivoImportacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransaccionIngresoEgreso = new JFileChooser();		
		this.jFileChooserImportacionTransaccionIngresoEgreso.setToolTipText("ESCOGER ARCHIVO"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonAbrirImportacionTransaccionIngresoEgreso.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransaccionIngresoEgreso,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransaccionIngresoEgreso.setToolTipText("Generar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionIngresoEgreso.add(this.jButtonAbrirImportacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransaccionIngresoEgreso = new JLabelMe();

		this.jLabelPathArchivoImportacionTransaccionIngresoEgreso.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionIngresoEgreso.add(this.jLabelPathArchivoImportacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransaccionIngresoEgreso=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransaccionIngresoEgreso.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionIngresoEgreso.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionIngresoEgreso.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionIngresoEgreso.add(this.jTextFieldPathArchivoImportacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonGenerarImportacionTransaccionIngresoEgreso.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransaccionIngresoEgreso,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransaccionIngresoEgreso.setToolTipText("Generar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionIngresoEgreso.add(this.jButtonGenerarImportacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonCerrarImportacionTransaccionIngresoEgreso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransaccionIngresoEgreso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransaccionIngresoEgreso.setToolTipText("Cancelar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionIngresoEgreso.add(this.jButtonCerrarImportacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransaccionIngresoEgreso = new GridBagLayout();
		
		this.jScrollPanelImportacionTransaccionIngresoEgreso= new JScrollPane(jPanelImportacionTransaccionIngresoEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iPosYImportacion;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iPosXImportacion;
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransaccionIngresoEgreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransaccionIngresoEgreso.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransaccionIngresoEgreso);
		this.jInternalFrameImportacionTransaccionIngresoEgreso.getContentPane().add(this.jScrollPanelImportacionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransaccionIngresoEgreso(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransaccionIngresoEgreso = new JButtonMe();
			this.jButtonAbrirOrderByTransaccionIngresoEgreso.setText("Orden");
			this.jButtonAbrirOrderByTransaccionIngresoEgreso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionIngresoEgreso,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransaccionIngresoEgreso";
			inputMap = this.jButtonAbrirOrderByTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransaccionIngresoEgreso"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransaccionIngresoEgreso = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransaccionIngresoEgreso.setName("jPanelOrderByTransaccionIngresoEgreso"); 
			
			this.jPanelOrderByTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransaccionIngresoEgreso.setLayout(gridaBagLayoutOrderByTransaccionIngresoEgreso);
			
			
			this.jTableDatosTransaccionIngresoEgresoOrderBy = new JTableMe();        
			this.jTableDatosTransaccionIngresoEgresoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransaccionIngresoEgresoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransaccionIngresoEgresoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransaccionIngresoEgresoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransaccionIngresoEgresoOrderBy.setViewportView(this.jTableDatosTransaccionIngresoEgresoOrderBy);
			this.jTableDatosTransaccionIngresoEgresoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransaccionIngresoEgresoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransaccionIngresoEgreso= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransaccionIngresoEgreso= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransaccionIngresoEgreso = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransaccionIngresoEgreso= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setTitle("Orden");
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setResizable(true);
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setClosable(true);
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Ingreso Egresoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransaccionIngresoEgreso.ipady =150;
				
			this.jPanelOrderByTransaccionIngresoEgreso.add(jScrollPanelDatosTransaccionIngresoEgresoOrderBy, this.gridBagConstraintsTransaccionIngresoEgreso);//this.jTableDatosTransaccionIngresoEgresoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransaccionIngresoEgreso = new JButtonMe();
			this.jButtonCerrarOrderByTransaccionIngresoEgreso.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransaccionIngresoEgreso,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransaccionIngresoEgreso.setToolTipText("Cancelar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransaccionIngresoEgreso.add(this.jButtonCerrarOrderByTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransaccionIngresoEgreso = new GridBagLayout();
			
			this.jScrollPanelOrderByTransaccionIngresoEgreso= new JScrollPane(jPanelOrderByTransaccionIngresoEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransaccionIngresoEgreso.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransaccionIngresoEgreso);
			
			this.jInternalFrameOrderByTransaccionIngresoEgreso.getContentPane().add(this.jScrollPanelOrderByTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
		
		} else {
			this.jButtonAbrirOrderByTransaccionIngresoEgreso = new JButtonMe();
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
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTransaccionIngresoEgreso.getRowHeight();//TransaccionIngresoEgresoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransaccionIngresoEgresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso.isSelected()) {
					iHeightTable=TransaccionIngresoEgresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionIngresoEgresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionIngresoEgresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransaccionIngresoEgresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionIngresoEgreso.isSelected()) {
					iHeightTable=TransaccionIngresoEgresoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionIngresoEgresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionIngresoEgresoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransaccionIngresoEgreso!=null && this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy()!=null) {
			//if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransaccionIngresoEgreso.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransaccionIngresoEgreso.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransaccionIngresoEgreso.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioningresoegresos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TransaccionIngresoEgreso> TraerTransaccionIngresoEgresoBeans(List<TransaccionIngresoEgreso> transaccioningresoegresos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TransaccionIngresoEgreso transaccioningresoegreso:transaccioningresoegresos) {
					
				if(!(TransaccionIngresoEgresoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransaccionIngresoEgresoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transaccioningresoegreso.setsDetalleGeneralEntityReporte(TransaccionIngresoEgresoConstantesFunciones.getTransaccionIngresoEgresoDescripcion(transaccioningresoegreso));
										
					transaccioningresoegreso.setes_ingreso_descripcion(TransaccionIngresoEgresoConstantesFunciones.getes_ingresoDescripcion(transaccioningresoegreso));	
					
						
					
				} else  {
							
					//transaccioningresoegreso.setsDetalleGeneralEntityReporte(transaccioningresoegreso.getsDetalleGeneralEntityReporte());
										
				}
				
				//transaccioningresoegresobeans.add(transaccioningresoegresobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transaccioningresoegresos;
    }
	//PARA REPORTES FIN
}
