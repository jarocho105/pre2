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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.SaldosVencidosProveedoresConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class SaldosVencidosProveedoresJInternalFrame extends SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSaldosVencidosProveedores;
	
	protected JMenuBar jmenuBarSaldosVencidosProveedores;
	
	protected JMenu jmenuSaldosVencidosProveedores;
	protected JMenu jmenuDatosSaldosVencidosProveedores;
	protected JMenu jmenuArchivoSaldosVencidosProveedores;
	protected JMenu jmenuAccionesSaldosVencidosProveedores;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldosVencidosProveedores;	
	protected GridBagConstraints gridBagConstraintsSaldosVencidosProveedores;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SaldosVencidosProveedoresDetalleFormJInternalFrame jInternalFrameDetalleFormSaldosVencidosProveedores;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSaldosVencidosProveedores;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSaldosVencidosProveedores;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public SaldosVencidosProveedoresSessionBean saldosvencidosproveedoresSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SaldosVencidosProveedores> saldosvencidosproveedoress;		
	public List<SaldosVencidosProveedores> saldosvencidosproveedoressEliminados;	
	public List<SaldosVencidosProveedores> saldosvencidosproveedoressAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySaldosVencidosProveedores;		
	protected JButton jButtonAbrirOrderBySaldosVencidosProveedores;
	
	
	//protected JPanel jPanelOrderBySaldosVencidosProveedores;
	//public JScrollPane jScrollPanelOrderBySaldosVencidosProveedores;	
	//protected JButton jButtonCerrarOrderBySaldosVencidosProveedores;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SaldosVencidosProveedoresLogic saldosvencidosproveedoresLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSaldosVencidosProveedores;
	public JScrollPane jScrollPanelDatosEdicionSaldosVencidosProveedores;
	public JScrollPane jScrollPanelDatosGeneralSaldosVencidosProveedores;
    
	
	
	//public JScrollPane jScrollPanelDatosSaldosVencidosProveedoresOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSaldosVencidosProveedores;
	//public JScrollPane jScrollPanelImportacionSaldosVencidosProveedores;
	
	
	
	protected JPanel jPanelAccionesSaldosVencidosProveedores;
	
    protected JPanel jPanelPaginacionSaldosVencidosProveedores;
    protected JPanel jPanelParametrosReportesSaldosVencidosProveedores;
	protected JPanel jPanelParametrosReportesAccionesSaldosVencidosProveedores;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SaldosVencidosProveedores;
	protected JPanel jPanelParametrosAuxiliar2SaldosVencidosProveedores;
	protected JPanel jPanelParametrosAuxiliar3SaldosVencidosProveedores;
	protected JPanel jPanelParametrosAuxiliar4SaldosVencidosProveedores;
	//protected JPanel jPanelParametrosAuxiliar5SaldosVencidosProveedores;
	
	
	
	//protected JPanel jPanelReporteDinamicoSaldosVencidosProveedores;
	//protected JPanel jPanelImportacionSaldosVencidosProveedores;
	
	
	public JTable jTableDatosSaldosVencidosProveedores;
	
	
	
	//public JTable jTableDatosSaldosVencidosProveedoresOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSaldosVencidosProveedores;
	protected JButton jButtonDuplicarSaldosVencidosProveedores;
	protected JButton jButtonCopiarSaldosVencidosProveedores;
	protected JButton jButtonVerFormSaldosVencidosProveedores;
	protected JButton jButtonNuevoRelacionesSaldosVencidosProveedores;
	protected JButton jButtonModificarSaldosVencidosProveedores;
	
    protected JButton jButtonGuardarCambiosTablaSaldosVencidosProveedores;
	protected JButton jButtonCerrarSaldosVencidosProveedores;
	
	
	protected JButton jButtonRecargarInformacionSaldosVencidosProveedores;
	protected JButton jButtonProcesarInformacionSaldosVencidosProveedores;
	
	
	protected JButton jButtonAnterioresSaldosVencidosProveedores;
	protected JButton jButtonSiguientesSaldosVencidosProveedores;
	protected JButton jButtonNuevoGuardarCambiosSaldosVencidosProveedores;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSaldosVencidosProveedores;
	//protected JButton jButtonCerrarReporteDinamicoSaldosVencidosProveedores;
	//protected JButton jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedores;	
	
	
	
	//protected JButton jButtonAbrirImportacionSaldosVencidosProveedores;
	//protected JButton jButtonGenerarImportacionSaldosVencidosProveedores;
	//protected JButton jButtonCerrarImportacionSaldosVencidosProveedores;
	//protected JFileChooser jFileChooserImportacionSaldosVencidosProveedores;
	//protected File fileImportacionSaldosVencidosProveedores;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldosVencidosProveedores;
	protected JButton jButtonDuplicarToolBarSaldosVencidosProveedores;
	protected JButton jButtonNuevoRelacionesToolBarSaldosVencidosProveedores;
	
	
	public JButton jButtonGuardarCambiosToolBarSaldosVencidosProveedores;
	protected JButton jButtonCopiarToolBarSaldosVencidosProveedores;
	protected JButton jButtonVerFormToolBarSaldosVencidosProveedores;
	public JButton jButtonGuardarCambiosTablaToolBarSaldosVencidosProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldosVencidosProveedores;
	protected JButton jButtonCerrarToolBarSaldosVencidosProveedores;
	
	protected JButton jButtonRecargarInformacionToolBarSaldosVencidosProveedores;
	protected JButton jButtonProcesarInformacionToolBarSaldosVencidosProveedores;
	protected JButton jButtonAnterioresToolBarSaldosVencidosProveedores;
	protected JButton jButtonSiguientesToolBarSaldosVencidosProveedores;
	protected JButton jButtonNuevoGuardarCambiosToolBarSaldosVencidosProveedores;
	protected JButton jButtonAbrirOrderByToolBarSaldosVencidosProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldosVencidosProveedores;
	protected JMenuItem jMenuItemDuplicarSaldosVencidosProveedores;
	protected JMenuItem jMenuItemNuevoRelacionesSaldosVencidosProveedores;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSaldosVencidosProveedores;
	protected JMenuItem jMenuItemCopiarSaldosVencidosProveedores;
	protected JMenuItem jMenuItemVerFormSaldosVencidosProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldosVencidosProveedores;
	protected JMenuItem jMenuItemCerrarSaldosVencidosProveedores;
	protected JMenuItem jMenuItemDetalleCerrarSaldosVencidosProveedores;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySaldosVencidosProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldosVencidosProveedores;
	
	protected JMenuItem jMenuItemRecargarInformacionSaldosVencidosProveedores;
	protected JMenuItem jMenuItemProcesarInformacionSaldosVencidosProveedores;
	protected JMenuItem jMenuItemAnterioresSaldosVencidosProveedores;
	protected JMenuItem jMenuItemSiguientesSaldosVencidosProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores;
	protected JMenuItem jMenuItemAbrirOrderBySaldosVencidosProveedores;
	protected JMenuItem jMenuItemMostrarOcultarSaldosVencidosProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldosVencidosProveedores;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSaldosVencidosProveedores;
	protected JCheckBox jCheckBoxSeleccionadosSaldosVencidosProveedores;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores;
	protected JCheckBox jCheckBoxConGraficoReporteSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSaldosVencidosProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSaldosVencidosProveedores;
	protected JTextField jTextFieldValorCampoGeneralSaldosVencidosProveedores;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSaldosVencidosProveedores;
	//public JList<Reporte> jListColumnasSelectReporteSaldosVencidosProveedores;
	//public JScrollPane jScrollColumnasSelectReporteSaldosVencidosProveedores;
	
	//public JLabel jLabelRelacionesSelectReporteSaldosVencidosProveedores;
	//public JList<Reporte> jListRelacionesSelectReporteSaldosVencidosProveedores;
	//public JScrollPane jScrollRelacionesSelectReporteSaldosVencidosProveedores;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSaldosVencidosProveedores;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSaldosVencidosProveedores;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSaldosVencidosProveedores;
	//public JLabel jLabelTiposArchivoReporteDinamicoSaldosVencidosProveedores;
	
		
	//public JLabel jLabelArchivoImportacionSaldosVencidosProveedores;	
	//public JLabel jLabelPathArchivoImportacionSaldosVencidosProveedores;
	//protected JTextField jTextFieldPathArchivoImportacionSaldosVencidosProveedores;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSaldosVencidosProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores;
	
	//public JLabel jLabelColumnaCategoriaValorSaldosVencidosProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSaldosVencidosProveedores;
	
	//public JLabel jLabelColumnasValoresGraficoSaldosVencidosProveedores;
	//public JList<Reporte> jListColumnasValoresGraficoSaldosVencidosProveedores;
	//public JScrollPane jScrollColumnasValoresGraficoSaldosVencidosProveedores;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSaldosVencidosProveedores;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSaldosVencidosProveedores;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSaldosVencidosProveedores;
	public JPanel jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores;
	public JButton jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores;
	
	public JPanel jPanelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores;
	public JLabel jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores;
	public JButton jButtonid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedoresBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SaldosVencidosProveedoresJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosVencidosProveedoresJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosVencidosProveedoresJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosVencidosProveedoresJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSaldosVencidosProveedores)	{
		this.jButtonRecargarInformacionSaldosVencidosProveedores = jButtonRecargarInformacionSaldosVencidosProveedores;
	}
	
	public JButton getjButtonProcesarInformacionSaldosVencidosProveedores() {
		return this.jButtonProcesarInformacionSaldosVencidosProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldosVencidosProveedores)	{
		this.jButtonProcesarInformacionSaldosVencidosProveedores = jButtonProcesarInformacionSaldosVencidosProveedores;
	}
	
	
	public JButton getjButtonRecargarInformacionSaldosVencidosProveedores() {
		return this.jButtonRecargarInformacionSaldosVencidosProveedores;
	}
	
	
	public List<SaldosVencidosProveedores> getsaldosvencidosproveedoress() {
		return this.saldosvencidosproveedoress;
	}

	public void setsaldosvencidosproveedoress(List<SaldosVencidosProveedores> saldosvencidosproveedoress) {
		this.saldosvencidosproveedoress = saldosvencidosproveedoress;
	}
	
	public List<SaldosVencidosProveedores> getsaldosvencidosproveedoressAux() {
		return this.saldosvencidosproveedoressAux;
	}

	public void setsaldosvencidosproveedoressAux(List<SaldosVencidosProveedores> saldosvencidosproveedoressAux) {
		this.saldosvencidosproveedoressAux = saldosvencidosproveedoressAux;
	}
	
	public List<SaldosVencidosProveedores> getsaldosvencidosproveedoressEliminados() {
		return this.saldosvencidosproveedoressEliminados;
	}

	public void setSaldosVencidosProveedoressEliminados(List<SaldosVencidosProveedores> saldosvencidosproveedoressEliminados) {
		this.saldosvencidosproveedoressEliminados = saldosvencidosproveedoressEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSaldosVencidosProveedores() {
		return jComboBoxTiposSeleccionarSaldosVencidosProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSaldosVencidosProveedores(
			JComboBox jComboBoxTiposSeleccionarSaldosVencidosProveedores) {
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores = jComboBoxTiposSeleccionarSaldosVencidosProveedores;
	}
	
	public void setBorderResaltarTiposSeleccionarSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSaldosVencidosProveedores() {
		return jTextFieldValorCampoGeneralSaldosVencidosProveedores;
	}

	public void setjTextFieldValorCampoGeneralSaldosVencidosProveedores(
			JTextField jTextFieldValorCampoGeneralSaldosVencidosProveedores) {
		this.jTextFieldValorCampoGeneralSaldosVencidosProveedores = jTextFieldValorCampoGeneralSaldosVencidosProveedores;
	}

	public void setBorderResaltarValorCampoGeneralSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSaldosVencidosProveedores .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSaldosVencidosProveedores() {
		return this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores;
	}

	public void setjCheckBoxSeleccionarTodosSaldosVencidosProveedores(
			JCheckBox jCheckBoxSeleccionarTodosSaldosVencidosProveedores) {
		this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores = jCheckBoxSeleccionarTodosSaldosVencidosProveedores;
	}

	public void setBorderResaltarSeleccionarTodosSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSaldosVencidosProveedores() {
		return this.jCheckBoxSeleccionadosSaldosVencidosProveedores;
	}

	public void setjCheckBoxSeleccionadosSaldosVencidosProveedores(
			JCheckBox jCheckBoxSeleccionadosSaldosVencidosProveedores) {
		this.jCheckBoxSeleccionadosSaldosVencidosProveedores = jCheckBoxSeleccionadosSaldosVencidosProveedores;
	}
	
	public void setBorderResaltarSeleccionadosSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSaldosVencidosProveedores() {
		return this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSaldosVencidosProveedores(
			JComboBox jComboBoxTiposArchivosReportesSaldosVencidosProveedores) {
		this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores = jComboBoxTiposArchivosReportesSaldosVencidosProveedores;
	}

	public void setBorderResaltarTiposArchivosReportesSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSaldosVencidosProveedores() {
		return this.jComboBoxTiposReportesSaldosVencidosProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSaldosVencidosProveedores(
			JComboBox jComboBoxTiposReportesSaldosVencidosProveedores) {
		this.jComboBoxTiposReportesSaldosVencidosProveedores = jComboBoxTiposReportesSaldosVencidosProveedores;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSaldosVencidosProveedores() {
	//	return jComboBoxTiposReportesDinamicoSaldosVencidosProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSaldosVencidosProveedores(
	//		JComboBox jComboBoxTiposReportesDinamicoSaldosVencidosProveedores) {
	//	this.jComboBoxTiposReportesDinamicoSaldosVencidosProveedores = jComboBoxTiposReportesDinamicoSaldosVencidosProveedores;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores() {
	//	return jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores = jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores;
	//}
	
	public void setBorderResaltarTiposReportesSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSaldosVencidosProveedores() {
		return this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSaldosVencidosProveedores(
			JComboBox jComboBoxTiposGraficosReportesSaldosVencidosProveedores) {
		this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores = jComboBoxTiposGraficosReportesSaldosVencidosProveedores;
	}
	
	public void setBorderResaltarTiposGraficosReportesSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSaldosVencidosProveedores() {
		return this.jComboBoxTiposPaginacionSaldosVencidosProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSaldosVencidosProveedores(
			JComboBox jComboBoxTiposPaginacionSaldosVencidosProveedores) {
		this.jComboBoxTiposPaginacionSaldosVencidosProveedores = jComboBoxTiposPaginacionSaldosVencidosProveedores;
	}
	
	public void setBorderResaltarTiposPaginacionSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSaldosVencidosProveedores() {
		return this.jComboBoxTiposRelacionesSaldosVencidosProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldosVencidosProveedores() {
		return this.jComboBoxTiposAccionesSaldosVencidosProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldosVencidosProveedores(
			JComboBox jComboBoxTiposRelacionesSaldosVencidosProveedores) {
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores = jComboBoxTiposRelacionesSaldosVencidosProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldosVencidosProveedores(
			JComboBox jComboBoxTiposAccionesSaldosVencidosProveedores) {
		this.jComboBoxTiposAccionesSaldosVencidosProveedores = jComboBoxTiposAccionesSaldosVencidosProveedores;
	}
	
	public void setBorderResaltarTiposRelacionesSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSaldosVencidosProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSaldosVencidosProveedores .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSaldosVencidosProveedores() {
	//	return jCheckBoxConGraficoDinamicoSaldosVencidosProveedores;
	//}

	//public void setjCheckBoxConGraficoDinamicoSaldosVencidosProveedores(
	//		JCheckBox jCheckBoxConGraficoDinamicoSaldosVencidosProveedores) {
	//	this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores = jCheckBoxConGraficoDinamicoSaldosVencidosProveedores;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSaldosVencidosProveedores() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSaldosVencidosProveedores.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores .setBorder(borderResaltar);		
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
		this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
		
		this.saldosvencidosproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldosvencidosproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SaldosVencidosProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SaldosVencidosProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldosVencidosProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldosVencidosProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldosVencidosProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldos Vencidos Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
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
		
		SaldosVencidosProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSaldosVencidosProveedores= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"nuevo","nuevo","Nuevo"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"duplicar","duplicar","Duplicar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"copiar","copiar","Copiar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"ver_form","ver_form","Ver"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"recargar","recargar","Buscar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,
							"cerrar","cerrar","Salir"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSaldosVencidosProveedores=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSaldosVencidosProveedores;
			
				this.jButtonProcesarInformacionToolBarSaldosVencidosProveedores=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSaldosVencidosProveedores;
				
		//protected JButton jButtonModificarToolBarSaldosVencidosProveedores;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSaldosVencidosProveedores=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSaldosVencidosProveedores=new JMenuMe("General");
		this.jmenuArchivoSaldosVencidosProveedores=new JMenuMe("Archivo");
		this.jmenuAccionesSaldosVencidosProveedores=new JMenuMe("Acciones");
		this.jmenuDatosSaldosVencidosProveedores=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldosVencidosProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldosVencidosProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldosVencidosProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSaldosVencidosProveedores= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSaldosVencidosProveedores.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSaldosVencidosProveedores,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSaldosVencidosProveedores= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSaldosVencidosProveedores.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSaldosVencidosProveedores,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSaldosVencidosProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldosVencidosProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldosVencidosProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSaldosVencidosProveedores= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSaldosVencidosProveedores.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSaldosVencidosProveedores,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSaldosVencidosProveedores= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSaldosVencidosProveedores.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSaldosVencidosProveedores,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldosVencidosProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldosVencidosProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldosVencidosProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSaldosVencidosProveedores= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSaldosVencidosProveedores.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSaldosVencidosProveedores,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSaldosVencidosProveedores= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSaldosVencidosProveedores.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSaldosVencidosProveedores,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSaldosVencidosProveedores= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSaldosVencidosProveedores.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSaldosVencidosProveedores,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSaldosVencidosProveedores= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSaldosVencidosProveedores.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSaldosVencidosProveedores,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySaldosVencidosProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySaldosVencidosProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySaldosVencidosProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldosVencidosProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldosVencidosProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldosVencidosProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySaldosVencidosProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySaldosVencidosProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySaldosVencidosProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSaldosVencidosProveedores.add(this.jMenuItemCerrarSaldosVencidosProveedores);
			
			this.jmenuAccionesSaldosVencidosProveedores.add(this.jMenuItemNuevoSaldosVencidosProveedores);
			this.jmenuAccionesSaldosVencidosProveedores.add(this.jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores);
			this.jmenuAccionesSaldosVencidosProveedores.add(this.jMenuItemNuevoRelacionesSaldosVencidosProveedores);
			this.jmenuAccionesSaldosVencidosProveedores.add(this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores);		
			this.jmenuAccionesSaldosVencidosProveedores.add(this.jMenuItemDuplicarSaldosVencidosProveedores);		
			this.jmenuAccionesSaldosVencidosProveedores.add(this.jMenuItemCopiarSaldosVencidosProveedores);		
			this.jmenuAccionesSaldosVencidosProveedores.add(this.jMenuItemVerFormSaldosVencidosProveedores);		
			
			this.jmenuDatosSaldosVencidosProveedores.add(this.jMenuItemRecargarInformacionSaldosVencidosProveedores);				
			this.jmenuDatosSaldosVencidosProveedores.add(this.jMenuItemAnterioresSaldosVencidosProveedores);				
			this.jmenuDatosSaldosVencidosProveedores.add(this.jMenuItemSiguientesSaldosVencidosProveedores);				
			this.jmenuDatosSaldosVencidosProveedores.add(this.jMenuItemAbrirOrderBySaldosVencidosProveedores);				
			this.jmenuDatosSaldosVencidosProveedores.add(this.jMenuItemMostrarOcultarSaldosVencidosProveedores);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSaldosVencidosProveedores.add(this.jMenuItemGuardarCambiosSaldosVencidosProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSaldosVencidosProveedores.add(this.jmenuArchivoSaldosVencidosProveedores);		
			this.jmenuBarSaldosVencidosProveedores.add(this.jmenuAccionesSaldosVencidosProveedores);		
			this.jmenuBarSaldosVencidosProveedores.add(this.jmenuDatosSaldosVencidosProveedores);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSaldosVencidosProveedores);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSaldosVencidosProveedores() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setToolTipText("Buscar Por Grupo Cliente ");
		this.jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores= new JButtonMe();
		this.jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setText("Buscar");
		this.jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setToolTipText("Buscar Por Grupo Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores,"buscar_button","Buscar Por Grupo Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores = new JLabelMe();
		jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSaldosVencidosProveedores=new JTabbedPane();


		this.jTabbedPaneBusquedasSaldosVencidosProveedores.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasSaldosVencidosProveedores.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasSaldosVencidosProveedores.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSaldosVencidosProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSaldosVencidosProveedores = new SaldosVencidosProveedoresDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Saldos Vencidos Proveedores DATOS");
			this.jInternalFrameDetalleFormSaldosVencidosProveedores = new SaldosVencidosProveedoresDetalleFormJInternalFrame(jDesktopPane,this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones(),this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores = null;//new SaldosVencidosProveedoresDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldosVencidosProveedores= new GridBagLayout();
		
		
		this.jTableDatosSaldosVencidosProveedores = new JTableMe();      
		
		String sToolTipSaldosVencidosProveedores="";
		sToolTipSaldosVencidosProveedores=SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldosVencidosProveedores+="(Cartera.SaldosVencidosProveedores)";
		}
		
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldosVencidosProveedores+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSaldosVencidosProveedores.setToolTipText(sToolTipSaldosVencidosProveedores);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSaldosVencidosProveedores);
		this.jTableDatosSaldosVencidosProveedores.setAutoCreateRowSorter(true);
		this.jTableDatosSaldosVencidosProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSaldosVencidosProveedores.setRowSelectionAllowed(true);
		this.jTableDatosSaldosVencidosProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSaldosVencidosProveedores = new JButtonMe();
		this.jButtonDuplicarSaldosVencidosProveedores = new JButtonMe();
		this.jButtonCopiarSaldosVencidosProveedores = new JButtonMe();
		this.jButtonVerFormSaldosVencidosProveedores = new JButtonMe();
		this.jButtonNuevoRelacionesSaldosVencidosProveedores = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores = new JButtonMe();
		this.jButtonCerrarSaldosVencidosProveedores = new JButtonMe();
		
		this.jScrollPanelDatosSaldosVencidosProveedores = new JScrollPane();   
        this.jScrollPanelDatosGeneralSaldosVencidosProveedores = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Saldos Vencidos Proveedores";
		
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Vencidos Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldosVencidosProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldosVencidosProveedores.setToolTipText("Acciones");
        this.jPanelAccionesSaldosVencidosProveedores.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSaldosVencidosProveedores=new ReporteDinamicoJInternalFrame(SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSaldosVencidosProveedores();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSaldosVencidosProveedores=new ImportacionJInternalFrame(SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSaldosVencidosProveedores();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySaldosVencidosProveedores = new JButtonMe();
		
		this.jButtonAbrirOrderBySaldosVencidosProveedores.setText("Orden");
		this.jButtonAbrirOrderBySaldosVencidosProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldosVencidosProveedores,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldosVencidosProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosVencidosProveedores,false,this);
			
			//this.cargarOrderBySaldosVencidosProveedores(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySaldosVencidosProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosVencidosProveedores,true,this);
			
			//this.cargarOrderBySaldosVencidosProveedores(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSaldosVencidosProveedores.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosSaldosVencidosProveedores.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosSaldosVencidosProveedores.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosSaldosVencidosProveedores.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldosVencidosProveedores.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSaldosVencidosProveedores.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSaldosVencidosProveedores.setText("Nuevo");
		this.jButtonDuplicarSaldosVencidosProveedores.setText("Duplicar");
		this.jButtonCopiarSaldosVencidosProveedores.setText("Copiar");
		this.jButtonVerFormSaldosVencidosProveedores.setText("Ver");
		this.jButtonNuevoRelacionesSaldosVencidosProveedores.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.setText("Guardar");
		this.jButtonCerrarSaldosVencidosProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldosVencidosProveedores,"nuevo_button","Nuevo",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSaldosVencidosProveedores,"duplicar_button","Duplicar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSaldosVencidosProveedores,"copiar_button","Copiar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSaldosVencidosProveedores,"ver_form","Ver",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSaldosVencidosProveedores,"nuevorelaciones_button","Nuevo Rel",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldosVencidosProveedores,"guardarcambiostabla_button","Guardar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldosVencidosProveedores,"cerrar_button","Salir",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSaldosVencidosProveedores.setToolTipText("Nuevo"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSaldosVencidosProveedores.setToolTipText("Duplicar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSaldosVencidosProveedores.setToolTipText("Copiar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSaldosVencidosProveedores.setToolTipText("Ver"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSaldosVencidosProveedores.setToolTipText("Nuevo Rel"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.setToolTipText("Guardar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldosVencidosProveedores.setToolTipText("Salir"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldosVencidosProveedores";
		inputMap = this.jButtonNuevoSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldosVencidosProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldosVencidosProveedores"));
		
		//DUPLICAR
		sMapKey = "DuplicarSaldosVencidosProveedores";
		inputMap = this.jButtonDuplicarSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSaldosVencidosProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSaldosVencidosProveedores"));
		
		//COPIAR
		sMapKey = "CopiarSaldosVencidosProveedores";
		inputMap = this.jButtonCopiarSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSaldosVencidosProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSaldosVencidosProveedores"));
		
		//VEr FORM
		sMapKey = "VerFormSaldosVencidosProveedores";
		inputMap = this.jButtonVerFormSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSaldosVencidosProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSaldosVencidosProveedores"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSaldosVencidosProveedores";
		inputMap = this.jButtonNuevoRelacionesSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSaldosVencidosProveedores"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSaldosVencidosProveedores";
		inputMap = this.jButtonModificarSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSaldosVencidosProveedores"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSaldosVencidosProveedores";
		inputMap = this.jButtonCerrarSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldosVencidosProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldosVencidosProveedores";
		inputMap = this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldosVencidosProveedores"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SaldosVencidosProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SaldosVencidosProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SaldosVencidosProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SaldosVencidosProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SaldosVencidosProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSaldosVencidosProveedores.setName("jPanelParametrosReportesSaldosVencidosProveedores"); 
		
		this.jPanelParametrosReportesAccionesSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSaldosVencidosProveedores.setName("jPanelParametrosReportesAccionesSaldosVencidosProveedores"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSaldosVencidosProveedores = new JButtonMe();
		this.jButtonRecargarInformacionSaldosVencidosProveedores.setText("Buscar");
		this.jButtonRecargarInformacionSaldosVencidosProveedores.setToolTipText("Buscar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSaldosVencidosProveedores,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionSaldosVencidosProveedores.setVisible(false);
		
		
		this.jButtonProcesarInformacionSaldosVencidosProveedores = new JButtonMe();
		this.jButtonProcesarInformacionSaldosVencidosProveedores.setText("Procesar");
		this.jButtonProcesarInformacionSaldosVencidosProveedores.setToolTipText("Procesar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSaldosVencidosProveedores.setVisible(false);
			
		this.jButtonProcesarInformacionSaldosVencidosProveedores.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldosVencidosProveedores.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSaldosVencidosProveedores.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.setText("TIPO");       
		this.jComboBoxTiposReportesSaldosVencidosProveedores.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSaldosVencidosProveedores.setText("Paginacion");
		this.jComboBoxTiposPaginacionSaldosVencidosProveedores.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSaldosVencidosProveedores.setText("Accion");
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldosVencidosProveedores.setText("Accion");
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.setText("Accion");
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSaldosVencidosProveedores=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSaldosVencidosProveedores.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldosVencidosProveedores.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSaldosVencidosProveedores.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSaldosVencidosProveedores = new JLabelMe();
		
		this.jLabelAccionesSaldosVencidosProveedores.setText("Acciones");		
		this.jLabelAccionesSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSaldosVencidosProveedores = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSaldosVencidosProveedores.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSaldosVencidosProveedores.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSaldosVencidosProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSaldosVencidosProveedores.setText("Graf.");
		this.jCheckBoxConGraficoReporteSaldosVencidosProveedores.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSaldosVencidosProveedores = new JButtonMe();
		//this.jButtonAnterioresSaldosVencidosProveedores.setText("<<");
        this.jButtonAnterioresSaldosVencidosProveedores.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSaldosVencidosProveedores,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSaldosVencidosProveedores = new JButtonMe();
		//this.jButtonSiguientesSaldosVencidosProveedores.setText(">>");
        this.jButtonSiguientesSaldosVencidosProveedores.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSaldosVencidosProveedores,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores.setText("Nue");
        this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores,"nuevoguardarcambios_button","Nue",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSaldosVencidosProveedores";
		inputMap = this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSaldosVencidosProveedores"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSaldosVencidosProveedores";
		inputMap = this.jButtonRecargarInformacionSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSaldosVencidosProveedores"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSaldosVencidosProveedores";
		inputMap = this.jButtonSiguientesSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSaldosVencidosProveedores"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSaldosVencidosProveedores";
		inputMap = this.jButtonAnterioresSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSaldosVencidosProveedores"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSaldosVencidosProveedores();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSaldosVencidosProveedores.setMinimumSize(new Dimension(this.getWidth(),SaldosVencidosProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosVencidosProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldosVencidosProveedores.setMaximumSize(new Dimension(this.getWidth(),SaldosVencidosProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosVencidosProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSaldosVencidosProveedores.setPreferredSize(new Dimension(this.getWidth(),SaldosVencidosProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SaldosVencidosProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSaldosVencidosProveedores = new GridBagLayout();

			this.jPanelPaginacionSaldosVencidosProveedores.setLayout(gridaBagLayoutPaginacionSaldosVencidosProveedores);						
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonAnterioresSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
					
						
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
			
			this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
						
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
			this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonSiguientesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 1;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonNuevoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
						
			
			
			if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
				this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSaldosVencidosProveedores.gridy = 1;
				this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonGuardarCambiosTablaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			}
			
			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 1;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonDuplicarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 1;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonCopiarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 1;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonVerFormSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 1;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSaldosVencidosProveedores.add(this.jButtonCerrarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		
		
		this.jButtonRecargarInformacionSaldosVencidosProveedores.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldosVencidosProveedores.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSaldosVencidosProveedores.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSaldosVencidosProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldosVencidosProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSaldosVencidosProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSaldosVencidosProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldosVencidosProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSaldosVencidosProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSaldosVencidosProveedores.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldosVencidosProveedores.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSaldosVencidosProveedores.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSaldosVencidosProveedores.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldosVencidosProveedores.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSaldosVencidosProveedores.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSaldosVencidosProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSaldosVencidosProveedores = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SaldosVencidosProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SaldosVencidosProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SaldosVencidosProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SaldosVencidosProveedores = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSaldosVencidosProveedores.setLayout(gridaBagParametrosReportesSaldosVencidosProveedores);
			this.jPanelParametrosReportesAccionesSaldosVencidosProveedores.setLayout(gridaBagParametrosReportesAccionesSaldosVencidosProveedores);
			
			
			this.jPanelParametrosAuxiliar1SaldosVencidosProveedores.setLayout(gridaBagParametrosAuxiliar1SaldosVencidosProveedores);
			this.jPanelParametrosAuxiliar2SaldosVencidosProveedores.setLayout(gridaBagParametrosAuxiliar2SaldosVencidosProveedores);
			this.jPanelParametrosAuxiliar3SaldosVencidosProveedores.setLayout(gridaBagParametrosAuxiliar3SaldosVencidosProveedores);
			this.jPanelParametrosAuxiliar4SaldosVencidosProveedores.setLayout(gridaBagParametrosAuxiliar4SaldosVencidosProveedores);
			//this.jPanelParametrosAuxiliar5SaldosVencidosProveedores.setLayout(gridaBagParametrosAuxiliar2SaldosVencidosProveedores);			
			
			
			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jButtonRecargarInformacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosVencidosProveedores.add(this.jComboBoxTiposPaginacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosVencidosProveedores.add(this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SaldosVencidosProveedores.add(this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jPanelParametrosAuxiliar1SaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SaldosVencidosProveedores.add(this.jComboBoxTiposReportesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);																		
			
			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SaldosVencidosProveedores.add(this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jPanelParametrosAuxiliar4SaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jComboBoxTiposReportesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jCheckBoxGenerarReporteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jPanelParametrosAuxiliar2SaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jLabelAccionesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
				this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jButtonAbrirOrderBySaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jComboBoxTiposSeleccionarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);			
			
			
			/*
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jCheckBoxConGraficoReporteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosVencidosProveedores.add(this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);															
				
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosVencidosProveedores.add(this.jCheckBoxSeleccionadosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);															
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SaldosVencidosProveedores.add(this.jCheckBoxConGraficoReporteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jPanelParametrosAuxiliar3SaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSaldosVencidosProveedores.add(this.jComboBoxTiposAccionesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSaldosVencidosProveedores = new GridBagLayout();

			this.jScrollPanelDatosSaldosVencidosProveedores.setLayout(gridaBagLayoutDatosSaldosVencidosProveedores);
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
			
			this.jScrollPanelDatosSaldosVencidosProveedores.add(this.jTableDatosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSaldosVencidosProveedores.setViewportView(this.jTableDatosSaldosVencidosProveedores);
		this.jTableDatosSaldosVencidosProveedores.setFillsViewportHeight(true);
		this.jTableDatosSaldosVencidosProveedores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSaldosVencidosProveedores= new GridBagLayout();
		this.jPanelAccionesSaldosVencidosProveedores.setLayout(gridaBagLayoutAccionesSaldosVencidosProveedores);
		
		
		/*	
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
			
		this.jPanelAccionesSaldosVencidosProveedores.add(this.jButtonNuevoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores= new GridBagLayout();
		gridaBagLayoutBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setLayout(gridaBagLayoutBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);

		gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
		jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.add(jLabelid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores, gridBagConstraintsSaldosVencidosProveedores);

		gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
		jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.add(jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores, gridBagConstraintsSaldosVencidosProveedores);

		gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSaldosVencidosProveedores.gridy = 1;
		gridBagConstraintsSaldosVencidosProveedores.gridx =1;
		jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.add(jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores, gridBagConstraintsSaldosVencidosProveedores);

		jTabbedPaneBusquedasSaldosVencidosProveedores.addTab("1.-Por Grupo Cliente ", jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
		jTabbedPaneBusquedasSaldosVencidosProveedores.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldosVencidosProveedores);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();						
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;		
			//this.gridBagConstraintsSaldosVencidosProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;		
		//this.gridBagConstraintsSaldosVencidosProveedores.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSaldosVencidosProveedores);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;		
			this.gridBagConstraintsSaldosVencidosProveedores.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);								
		
		
		/*
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		*/		
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx =0;
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldosVencidosProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
				
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSaldosVencidosProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldosVencidosProveedores = new GridBagLayout();
			this.jPanelBusquedasParametrosSaldosVencidosProveedores.setLayout(gridaBagLayoutBusquedasParametrosSaldosVencidosProveedores);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSaldosVencidosProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			
			
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
			
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSaldosVencidosProveedores;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSaldosVencidosProveedores() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSaldosVencidosProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSaldosVencidosProveedores.setName("jPanelReporteDinamicoSaldosVencidosProveedores"); 
		
		this.jPanelReporteDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSaldosVencidosProveedores.setLayout(gridaBagLayoutReporteDinamicoSaldosVencidosProveedores);
		
		
		this.jInternalFrameReporteDinamicoSaldosVencidosProveedores= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSaldosVencidosProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldosVencidosProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setResizable(true);
	    this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setClosable(true);
	    this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Vencidos Proveedoreses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSaldosVencidosProveedores = new JLabelMe();

		this.jLabelColumnasSelectReporteSaldosVencidosProveedores.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jLabelColumnasSelectReporteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSaldosVencidosProveedores = new JList<Reporte>();
		this.jListColumnasSelectReporteSaldosVencidosProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSaldosVencidosProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSaldosVencidosProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldosVencidosProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSaldosVencidosProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSaldosVencidosProveedores=new JScrollPane(this.jListColumnasSelectReporteSaldosVencidosProveedores);
			
			this.jScrollColumnasSelectReporteSaldosVencidosProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldosVencidosProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSaldosVencidosProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jListColumnasSelectReporteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jScrollColumnasSelectReporteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSaldosVencidosProveedores = new JLabelMe();

		this.jLabelRelacionesSelectReporteSaldosVencidosProveedores.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSaldosVencidosProveedores = new JList<Reporte>();
		this.jListRelacionesSelectReporteSaldosVencidosProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSaldosVencidosProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSaldosVencidosProveedores.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldosVencidosProveedores.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSaldosVencidosProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSaldosVencidosProveedores=new JScrollPane(this.jListRelacionesSelectReporteSaldosVencidosProveedores);
			
			this.jScrollRelacionesSelectReporteSaldosVencidosProveedores.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldosVencidosProveedores.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSaldosVencidosProveedores.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores = new JComboBoxMe();
		this.jListColumnasValoresGraficoSaldosVencidosProveedores = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSaldosVencidosProveedores = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSaldosVencidosProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSaldosVencidosProveedores = new JLabelMe();

		this.jLabelConGraficoDinamicoSaldosVencidosProveedores.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jLabelConGraficoDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jCheckBoxConGraficoDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSaldosVencidosProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSaldosVencidosProveedores.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jLabelColumnaCategoriaGraficoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSaldosVencidosProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaValorSaldosVencidosProveedores.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jLabelColumnaCategoriaValorSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSaldosVencidosProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSaldosVencidosProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSaldosVencidosProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldosVencidosProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSaldosVencidosProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jComboBoxColumnaCategoriaValorSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSaldosVencidosProveedores = new JLabelMe();

		this.jLabelColumnasValoresGraficoSaldosVencidosProveedores.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jLabelColumnasValoresGraficoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSaldosVencidosProveedores = new JList<Reporte>();
		this.jListColumnasValoresGraficoSaldosVencidosProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSaldosVencidosProveedores.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSaldosVencidosProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldosVencidosProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSaldosVencidosProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSaldosVencidosProveedores=new JScrollPane(this.jListColumnasValoresGraficoSaldosVencidosProveedores);
			
			this.jScrollColumnasValoresGraficoSaldosVencidosProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldosVencidosProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSaldosVencidosProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jListColumnasSelectReporteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jScrollColumnasValoresGraficoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSaldosVencidosProveedores = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSaldosVencidosProveedores.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jLabelTiposGraficosReportesDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSaldosVencidosProveedores.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSaldosVencidosProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jComboBoxTiposGraficosReportesDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSaldosVencidosProveedores = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSaldosVencidosProveedores.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jLabelGenerarExcelReporteDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedores = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedores.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedores,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedores.setToolTipText("Generar EXCEL"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jComboBoxTiposReportesDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSaldosVencidosProveedores = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSaldosVencidosProveedores.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jLabelTiposArchivoReporteDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jComboBoxTiposArchivosReportesDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSaldosVencidosProveedores = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSaldosVencidosProveedores.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSaldosVencidosProveedores,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSaldosVencidosProveedores.setToolTipText("Generar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jButtonGenerarReporteDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSaldosVencidosProveedores = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSaldosVencidosProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSaldosVencidosProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSaldosVencidosProveedores.setToolTipText("Cancelar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSaldosVencidosProveedores.add(this.jButtonCerrarReporteDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSaldosVencidosProveedores = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSaldosVencidosProveedores= new JScrollPane(jPanelReporteDinamicoSaldosVencidosProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Vencidos Proveedoreses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSaldosVencidosProveedores);
		this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getContentPane().add(this.jScrollPanelReporteDinamicoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSaldosVencidosProveedores() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSaldosVencidosProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSaldosVencidosProveedores.setName("jPanelImportacionSaldosVencidosProveedores"); 
		
		this.jPanelImportacionSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSaldosVencidosProveedores.setLayout(gridaBagLayoutImportacionSaldosVencidosProveedores);
		
		
		this.jInternalFrameImportacionSaldosVencidosProveedores= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSaldosVencidosProveedores= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSaldosVencidosProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSaldosVencidosProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSaldosVencidosProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldosVencidosProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldosVencidosProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setResizable(true);
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setClosable(true);
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSaldosVencidosProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSaldosVencidosProveedores.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSaldosVencidosProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setResizable(true);
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setClosable(true);
	    this.jInternalFrameImportacionSaldosVencidosProveedores.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Vencidos Proveedoreses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSaldosVencidosProveedores = new JLabelMe();

		this.jLabelArchivoImportacionSaldosVencidosProveedores.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldosVencidosProveedores.add(this.jLabelArchivoImportacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSaldosVencidosProveedores = new JFileChooser();		
		this.jFileChooserImportacionSaldosVencidosProveedores.setToolTipText("ESCOGER ARCHIVO"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSaldosVencidosProveedores = new JButtonMe();
		this.jButtonAbrirImportacionSaldosVencidosProveedores.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSaldosVencidosProveedores,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSaldosVencidosProveedores.setToolTipText("Generar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosVencidosProveedores.add(this.jButtonAbrirImportacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSaldosVencidosProveedores = new JLabelMe();

		this.jLabelPathArchivoImportacionSaldosVencidosProveedores.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSaldosVencidosProveedores.add(this.jLabelPathArchivoImportacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSaldosVencidosProveedores=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSaldosVencidosProveedores.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldosVencidosProveedores.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSaldosVencidosProveedores.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosVencidosProveedores.add(this.jTextFieldPathArchivoImportacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSaldosVencidosProveedores = new JButtonMe();
		this.jButtonGenerarImportacionSaldosVencidosProveedores.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSaldosVencidosProveedores,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSaldosVencidosProveedores.setToolTipText("Generar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosVencidosProveedores.add(this.jButtonGenerarImportacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSaldosVencidosProveedores = new JButtonMe();
		this.jButtonCerrarImportacionSaldosVencidosProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSaldosVencidosProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSaldosVencidosProveedores.setToolTipText("Cancelar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSaldosVencidosProveedores.add(this.jButtonCerrarImportacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSaldosVencidosProveedores = new GridBagLayout();
		
		this.jScrollPanelImportacionSaldosVencidosProveedores= new JScrollPane(jPanelImportacionSaldosVencidosProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy =iPosYImportacion;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx =iPosXImportacion;
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSaldosVencidosProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSaldosVencidosProveedores.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSaldosVencidosProveedores);
		this.jInternalFrameImportacionSaldosVencidosProveedores.getContentPane().add(this.jScrollPanelImportacionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySaldosVencidosProveedores(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySaldosVencidosProveedores = new JButtonMe();
			this.jButtonAbrirOrderBySaldosVencidosProveedores.setText("Orden");
			this.jButtonAbrirOrderBySaldosVencidosProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySaldosVencidosProveedores,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySaldosVencidosProveedores";
			inputMap = this.jButtonAbrirOrderBySaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySaldosVencidosProveedores"));
		
		
			GridBagLayout gridaBagLayoutOrderBySaldosVencidosProveedores = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySaldosVencidosProveedores.setName("jPanelOrderBySaldosVencidosProveedores"); 
			
			this.jPanelOrderBySaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySaldosVencidosProveedores.setLayout(gridaBagLayoutOrderBySaldosVencidosProveedores);
			
			
			this.jTableDatosSaldosVencidosProveedoresOrderBy = new JTableMe();        
			this.jTableDatosSaldosVencidosProveedoresOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSaldosVencidosProveedoresOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSaldosVencidosProveedoresOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSaldosVencidosProveedoresOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSaldosVencidosProveedoresOrderBy.setViewportView(this.jTableDatosSaldosVencidosProveedoresOrderBy);
			this.jTableDatosSaldosVencidosProveedoresOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSaldosVencidosProveedoresOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySaldosVencidosProveedores= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySaldosVencidosProveedores= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySaldosVencidosProveedores = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSaldosVencidosProveedores= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySaldosVencidosProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySaldosVencidosProveedores.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySaldosVencidosProveedores.setTitle("Orden");
			this.jInternalFrameOrderBySaldosVencidosProveedores.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySaldosVencidosProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySaldosVencidosProveedores.setResizable(true);
			this.jInternalFrameOrderBySaldosVencidosProveedores.setClosable(true);
			this.jInternalFrameOrderBySaldosVencidosProveedores.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Vencidos Proveedoreses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSaldosVencidosProveedores.ipady =150;
				
			this.jPanelOrderBySaldosVencidosProveedores.add(jScrollPanelDatosSaldosVencidosProveedoresOrderBy, this.gridBagConstraintsSaldosVencidosProveedores);//this.jTableDatosSaldosVencidosProveedoresTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySaldosVencidosProveedores = new JButtonMe();
			this.jButtonCerrarOrderBySaldosVencidosProveedores.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySaldosVencidosProveedores,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySaldosVencidosProveedores.setToolTipText("Cancelar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySaldosVencidosProveedores.add(this.jButtonCerrarOrderBySaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSaldosVencidosProveedores = new GridBagLayout();
			
			this.jScrollPanelOrderBySaldosVencidosProveedores= new JScrollPane(jPanelOrderBySaldosVencidosProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iPosYOrderBy;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySaldosVencidosProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySaldosVencidosProveedores.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSaldosVencidosProveedores);
			
			this.jInternalFrameOrderBySaldosVencidosProveedores.getContentPane().add(this.jScrollPanelOrderBySaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);			
		
		} else {
			this.jButtonAbrirOrderBySaldosVencidosProveedores = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosSaldosVencidosProveedores.getRowHeight();//SaldosVencidosProveedoresConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SaldosVencidosProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores.isSelected()) {
					iHeightTable=SaldosVencidosProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldosVencidosProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldosVencidosProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SaldosVencidosProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSaldosVencidosProveedores.isSelected()) {
					iHeightTable=SaldosVencidosProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SaldosVencidosProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SaldosVencidosProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySaldosVencidosProveedores!=null && this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy()!=null) {
			//if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySaldosVencidosProveedores.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySaldosVencidosProveedores.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySaldosVencidosProveedores.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldosvencidosproveedoress.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SaldosVencidosProveedores> TraerSaldosVencidosProveedoresBeans(List<SaldosVencidosProveedores> saldosvencidosproveedoress,ArrayList<Classe> classes)throws Exception {
		try {
			for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoress) {
					
				if(!(SaldosVencidosProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SaldosVencidosProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					saldosvencidosproveedores.setsDetalleGeneralEntityReporte(SaldosVencidosProveedoresConstantesFunciones.getSaldosVencidosProveedoresDescripcion(saldosvencidosproveedores));
										
						
					
						
					
				} else  {
							
					//saldosvencidosproveedores.setsDetalleGeneralEntityReporte(saldosvencidosproveedores.getsDetalleGeneralEntityReporte());
										
				}
				
				//saldosvencidosproveedoresbeans.add(saldosvencidosproveedoresbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return saldosvencidosproveedoress;
    }
	//PARA REPORTES FIN
}
