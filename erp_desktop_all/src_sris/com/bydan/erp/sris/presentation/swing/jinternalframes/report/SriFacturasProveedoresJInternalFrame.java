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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.SriFacturasProveedoresConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class SriFacturasProveedoresJInternalFrame extends SriFacturasProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSriFacturasProveedores;
	
	protected JMenuBar jmenuBarSriFacturasProveedores;
	
	protected JMenu jmenuSriFacturasProveedores;
	protected JMenu jmenuDatosSriFacturasProveedores;
	protected JMenu jmenuArchivoSriFacturasProveedores;
	protected JMenu jmenuAccionesSriFacturasProveedores;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriFacturasProveedores;	
	protected GridBagConstraints gridBagConstraintsSriFacturasProveedores;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SriFacturasProveedoresDetalleFormJInternalFrame jInternalFrameDetalleFormSriFacturasProveedores;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSriFacturasProveedores;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSriFacturasProveedores;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";
	
	public SriFacturasProveedoresSessionBean srifacturasproveedoresSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SriFacturasProveedores> srifacturasproveedoress;		
	public List<SriFacturasProveedores> srifacturasproveedoressEliminados;	
	public List<SriFacturasProveedores> srifacturasproveedoressAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySriFacturasProveedores;		
	protected JButton jButtonAbrirOrderBySriFacturasProveedores;
	
	
	//protected JPanel jPanelOrderBySriFacturasProveedores;
	//public JScrollPane jScrollPanelOrderBySriFacturasProveedores;	
	//protected JButton jButtonCerrarOrderBySriFacturasProveedores;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SriFacturasProveedoresLogic srifacturasproveedoresLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSriFacturasProveedores;
	public JScrollPane jScrollPanelDatosEdicionSriFacturasProveedores;
	public JScrollPane jScrollPanelDatosGeneralSriFacturasProveedores;
    
	
	
	//public JScrollPane jScrollPanelDatosSriFacturasProveedoresOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSriFacturasProveedores;
	//public JScrollPane jScrollPanelImportacionSriFacturasProveedores;
	
	
	
	protected JPanel jPanelAccionesSriFacturasProveedores;
	
    protected JPanel jPanelPaginacionSriFacturasProveedores;
    protected JPanel jPanelParametrosReportesSriFacturasProveedores;
	protected JPanel jPanelParametrosReportesAccionesSriFacturasProveedores;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SriFacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar2SriFacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar3SriFacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar4SriFacturasProveedores;
	//protected JPanel jPanelParametrosAuxiliar5SriFacturasProveedores;
	
	
	
	//protected JPanel jPanelReporteDinamicoSriFacturasProveedores;
	//protected JPanel jPanelImportacionSriFacturasProveedores;
	
	
	public JTable jTableDatosSriFacturasProveedores;
	
	
	
	//public JTable jTableDatosSriFacturasProveedoresOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSriFacturasProveedores;
	protected JButton jButtonDuplicarSriFacturasProveedores;
	protected JButton jButtonCopiarSriFacturasProveedores;
	protected JButton jButtonVerFormSriFacturasProveedores;
	protected JButton jButtonNuevoRelacionesSriFacturasProveedores;
	protected JButton jButtonModificarSriFacturasProveedores;
	
    protected JButton jButtonGuardarCambiosTablaSriFacturasProveedores;
	protected JButton jButtonCerrarSriFacturasProveedores;
	
	
	protected JButton jButtonRecargarInformacionSriFacturasProveedores;
	protected JButton jButtonProcesarInformacionSriFacturasProveedores;
	
	
	protected JButton jButtonAnterioresSriFacturasProveedores;
	protected JButton jButtonSiguientesSriFacturasProveedores;
	protected JButton jButtonNuevoGuardarCambiosSriFacturasProveedores;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSriFacturasProveedores;
	//protected JButton jButtonCerrarReporteDinamicoSriFacturasProveedores;
	//protected JButton jButtonGenerarExcelReporteDinamicoSriFacturasProveedores;	
	
	
	
	//protected JButton jButtonAbrirImportacionSriFacturasProveedores;
	//protected JButton jButtonGenerarImportacionSriFacturasProveedores;
	//protected JButton jButtonCerrarImportacionSriFacturasProveedores;
	//protected JFileChooser jFileChooserImportacionSriFacturasProveedores;
	//protected File fileImportacionSriFacturasProveedores;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriFacturasProveedores;
	protected JButton jButtonDuplicarToolBarSriFacturasProveedores;
	protected JButton jButtonNuevoRelacionesToolBarSriFacturasProveedores;
	
	
	public JButton jButtonGuardarCambiosToolBarSriFacturasProveedores;
	protected JButton jButtonCopiarToolBarSriFacturasProveedores;
	protected JButton jButtonVerFormToolBarSriFacturasProveedores;
	public JButton jButtonGuardarCambiosTablaToolBarSriFacturasProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarSriFacturasProveedores;
	protected JButton jButtonCerrarToolBarSriFacturasProveedores;
	
	protected JButton jButtonRecargarInformacionToolBarSriFacturasProveedores;
	protected JButton jButtonProcesarInformacionToolBarSriFacturasProveedores;
	protected JButton jButtonAnterioresToolBarSriFacturasProveedores;
	protected JButton jButtonSiguientesToolBarSriFacturasProveedores;
	protected JButton jButtonNuevoGuardarCambiosToolBarSriFacturasProveedores;
	protected JButton jButtonAbrirOrderByToolBarSriFacturasProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriFacturasProveedores;
	protected JMenuItem jMenuItemDuplicarSriFacturasProveedores;
	protected JMenuItem jMenuItemNuevoRelacionesSriFacturasProveedores;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSriFacturasProveedores;
	protected JMenuItem jMenuItemCopiarSriFacturasProveedores;
	protected JMenuItem jMenuItemVerFormSriFacturasProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriFacturasProveedores;
	protected JMenuItem jMenuItemCerrarSriFacturasProveedores;
	protected JMenuItem jMenuItemDetalleCerrarSriFacturasProveedores;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySriFacturasProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriFacturasProveedores;
	
	protected JMenuItem jMenuItemRecargarInformacionSriFacturasProveedores;
	protected JMenuItem jMenuItemProcesarInformacionSriFacturasProveedores;
	protected JMenuItem jMenuItemAnterioresSriFacturasProveedores;
	protected JMenuItem jMenuItemSiguientesSriFacturasProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriFacturasProveedores;
	protected JMenuItem jMenuItemAbrirOrderBySriFacturasProveedores;
	protected JMenuItem jMenuItemMostrarOcultarSriFacturasProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriFacturasProveedores;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSriFacturasProveedores;
	protected JCheckBox jCheckBoxSeleccionadosSriFacturasProveedores;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSriFacturasProveedores;
	protected JCheckBox jCheckBoxConGraficoReporteSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSriFacturasProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSriFacturasProveedores;
	protected JTextField jTextFieldValorCampoGeneralSriFacturasProveedores;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSriFacturasProveedores;
	//public JList<Reporte> jListColumnasSelectReporteSriFacturasProveedores;
	//public JScrollPane jScrollColumnasSelectReporteSriFacturasProveedores;
	
	//public JLabel jLabelRelacionesSelectReporteSriFacturasProveedores;
	//public JList<Reporte> jListRelacionesSelectReporteSriFacturasProveedores;
	//public JScrollPane jScrollRelacionesSelectReporteSriFacturasProveedores;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSriFacturasProveedores;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSriFacturasProveedores;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSriFacturasProveedores;
	//public JLabel jLabelTiposArchivoReporteDinamicoSriFacturasProveedores;
	
		
	//public JLabel jLabelArchivoImportacionSriFacturasProveedores;	
	//public JLabel jLabelPathArchivoImportacionSriFacturasProveedores;
	//protected JTextField jTextFieldPathArchivoImportacionSriFacturasProveedores;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSriFacturasProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSriFacturasProveedores;
	
	//public JLabel jLabelColumnaCategoriaValorSriFacturasProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSriFacturasProveedores;
	
	//public JLabel jLabelColumnasValoresGraficoSriFacturasProveedores;
	//public JList<Reporte> jListColumnasValoresGraficoSriFacturasProveedores;
	//public JScrollPane jScrollColumnasValoresGraficoSriFacturasProveedores;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSriFacturasProveedores;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedores;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSriFacturasProveedores;
	public JPanel jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores;
	public JButton jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores;
	
	public JPanel jPanelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores;
	public JLabel jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores;
	public JButton jButtonid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores;
	public JLabel jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores;
	public JButton jButtonfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores;
	public JLabel jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores;
	public JButton jButtonfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedoresBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SriFacturasProveedoresJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSriFacturasProveedores)	{
		this.jButtonRecargarInformacionSriFacturasProveedores = jButtonRecargarInformacionSriFacturasProveedores;
	}
	
	public JButton getjButtonProcesarInformacionSriFacturasProveedores() {
		return this.jButtonProcesarInformacionSriFacturasProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriFacturasProveedores)	{
		this.jButtonProcesarInformacionSriFacturasProveedores = jButtonProcesarInformacionSriFacturasProveedores;
	}
	
	
	public JButton getjButtonRecargarInformacionSriFacturasProveedores() {
		return this.jButtonRecargarInformacionSriFacturasProveedores;
	}
	
	
	public List<SriFacturasProveedores> getsrifacturasproveedoress() {
		return this.srifacturasproveedoress;
	}

	public void setsrifacturasproveedoress(List<SriFacturasProveedores> srifacturasproveedoress) {
		this.srifacturasproveedoress = srifacturasproveedoress;
	}
	
	public List<SriFacturasProveedores> getsrifacturasproveedoressAux() {
		return this.srifacturasproveedoressAux;
	}

	public void setsrifacturasproveedoressAux(List<SriFacturasProveedores> srifacturasproveedoressAux) {
		this.srifacturasproveedoressAux = srifacturasproveedoressAux;
	}
	
	public List<SriFacturasProveedores> getsrifacturasproveedoressEliminados() {
		return this.srifacturasproveedoressEliminados;
	}

	public void setSriFacturasProveedoressEliminados(List<SriFacturasProveedores> srifacturasproveedoressEliminados) {
		this.srifacturasproveedoressEliminados = srifacturasproveedoressEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSriFacturasProveedores() {
		return jComboBoxTiposSeleccionarSriFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSriFacturasProveedores(
			JComboBox jComboBoxTiposSeleccionarSriFacturasProveedores) {
		this.jComboBoxTiposSeleccionarSriFacturasProveedores = jComboBoxTiposSeleccionarSriFacturasProveedores;
	}
	
	public void setBorderResaltarTiposSeleccionarSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSriFacturasProveedores() {
		return jTextFieldValorCampoGeneralSriFacturasProveedores;
	}

	public void setjTextFieldValorCampoGeneralSriFacturasProveedores(
			JTextField jTextFieldValorCampoGeneralSriFacturasProveedores) {
		this.jTextFieldValorCampoGeneralSriFacturasProveedores = jTextFieldValorCampoGeneralSriFacturasProveedores;
	}

	public void setBorderResaltarValorCampoGeneralSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSriFacturasProveedores .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSriFacturasProveedores() {
		return this.jCheckBoxSeleccionarTodosSriFacturasProveedores;
	}

	public void setjCheckBoxSeleccionarTodosSriFacturasProveedores(
			JCheckBox jCheckBoxSeleccionarTodosSriFacturasProveedores) {
		this.jCheckBoxSeleccionarTodosSriFacturasProveedores = jCheckBoxSeleccionarTodosSriFacturasProveedores;
	}

	public void setBorderResaltarSeleccionarTodosSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSriFacturasProveedores() {
		return this.jCheckBoxSeleccionadosSriFacturasProveedores;
	}

	public void setjCheckBoxSeleccionadosSriFacturasProveedores(
			JCheckBox jCheckBoxSeleccionadosSriFacturasProveedores) {
		this.jCheckBoxSeleccionadosSriFacturasProveedores = jCheckBoxSeleccionadosSriFacturasProveedores;
	}
	
	public void setBorderResaltarSeleccionadosSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSriFacturasProveedores() {
		return this.jComboBoxTiposArchivosReportesSriFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSriFacturasProveedores(
			JComboBox jComboBoxTiposArchivosReportesSriFacturasProveedores) {
		this.jComboBoxTiposArchivosReportesSriFacturasProveedores = jComboBoxTiposArchivosReportesSriFacturasProveedores;
	}

	public void setBorderResaltarTiposArchivosReportesSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSriFacturasProveedores() {
		return this.jComboBoxTiposReportesSriFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSriFacturasProveedores(
			JComboBox jComboBoxTiposReportesSriFacturasProveedores) {
		this.jComboBoxTiposReportesSriFacturasProveedores = jComboBoxTiposReportesSriFacturasProveedores;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSriFacturasProveedores() {
	//	return jComboBoxTiposReportesDinamicoSriFacturasProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSriFacturasProveedores(
	//		JComboBox jComboBoxTiposReportesDinamicoSriFacturasProveedores) {
	//	this.jComboBoxTiposReportesDinamicoSriFacturasProveedores = jComboBoxTiposReportesDinamicoSriFacturasProveedores;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores() {
	//	return jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores = jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores;
	//}
	
	public void setBorderResaltarTiposReportesSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSriFacturasProveedores() {
		return this.jComboBoxTiposGraficosReportesSriFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSriFacturasProveedores(
			JComboBox jComboBoxTiposGraficosReportesSriFacturasProveedores) {
		this.jComboBoxTiposGraficosReportesSriFacturasProveedores = jComboBoxTiposGraficosReportesSriFacturasProveedores;
	}
	
	public void setBorderResaltarTiposGraficosReportesSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSriFacturasProveedores() {
		return this.jComboBoxTiposPaginacionSriFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSriFacturasProveedores(
			JComboBox jComboBoxTiposPaginacionSriFacturasProveedores) {
		this.jComboBoxTiposPaginacionSriFacturasProveedores = jComboBoxTiposPaginacionSriFacturasProveedores;
	}
	
	public void setBorderResaltarTiposPaginacionSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSriFacturasProveedores() {
		return this.jComboBoxTiposRelacionesSriFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriFacturasProveedores() {
		return this.jComboBoxTiposAccionesSriFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriFacturasProveedores(
			JComboBox jComboBoxTiposRelacionesSriFacturasProveedores) {
		this.jComboBoxTiposRelacionesSriFacturasProveedores = jComboBoxTiposRelacionesSriFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriFacturasProveedores(
			JComboBox jComboBoxTiposAccionesSriFacturasProveedores) {
		this.jComboBoxTiposAccionesSriFacturasProveedores = jComboBoxTiposAccionesSriFacturasProveedores;
	}
	
	public void setBorderResaltarTiposRelacionesSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSriFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSriFacturasProveedores .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSriFacturasProveedores() {
	//	return jCheckBoxConGraficoDinamicoSriFacturasProveedores;
	//}

	//public void setjCheckBoxConGraficoDinamicoSriFacturasProveedores(
	//		JCheckBox jCheckBoxConGraficoDinamicoSriFacturasProveedores) {
	//	this.jCheckBoxConGraficoDinamicoSriFacturasProveedores = jCheckBoxConGraficoDinamicoSriFacturasProveedores;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSriFacturasProveedores() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSriFacturasProveedores.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSriFacturasProveedores .setBorder(borderResaltar);		
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
		this.srifacturasproveedoresSessionBean=new SriFacturasProveedoresSessionBean();
		
		this.srifacturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.srifacturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SriFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SriFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriFacturasProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Facturas Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
		
		SriFacturasProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSriFacturasProveedores= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"nuevo","nuevo","Nuevo"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"duplicar","duplicar","Duplicar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"copiar","copiar","Copiar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"ver_form","ver_form","Ver"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"recargar","recargar","Buscar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,
							"cerrar","cerrar","Salir"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSriFacturasProveedores=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSriFacturasProveedores;
			
				this.jButtonProcesarInformacionToolBarSriFacturasProveedores=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSriFacturasProveedores;
				
		//protected JButton jButtonModificarToolBarSriFacturasProveedores;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSriFacturasProveedores=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSriFacturasProveedores=new JMenuMe("General");
		this.jmenuArchivoSriFacturasProveedores=new JMenuMe("Archivo");
		this.jmenuAccionesSriFacturasProveedores=new JMenuMe("Acciones");
		this.jmenuDatosSriFacturasProveedores=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriFacturasProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriFacturasProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriFacturasProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSriFacturasProveedores= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSriFacturasProveedores.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSriFacturasProveedores,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSriFacturasProveedores= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSriFacturasProveedores.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSriFacturasProveedores,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSriFacturasProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriFacturasProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriFacturasProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSriFacturasProveedores= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSriFacturasProveedores.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSriFacturasProveedores,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSriFacturasProveedores= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSriFacturasProveedores.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSriFacturasProveedores,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSriFacturasProveedores= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSriFacturasProveedores.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSriFacturasProveedores,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSriFacturasProveedores= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSriFacturasProveedores.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSriFacturasProveedores,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSriFacturasProveedores= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSriFacturasProveedores.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSriFacturasProveedores,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSriFacturasProveedores= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSriFacturasProveedores.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSriFacturasProveedores,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSriFacturasProveedores= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSriFacturasProveedores.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSriFacturasProveedores,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySriFacturasProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySriFacturasProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySriFacturasProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySriFacturasProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySriFacturasProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySriFacturasProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSriFacturasProveedores= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSriFacturasProveedores.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSriFacturasProveedores,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSriFacturasProveedores.add(this.jMenuItemCerrarSriFacturasProveedores);
			
			this.jmenuAccionesSriFacturasProveedores.add(this.jMenuItemNuevoSriFacturasProveedores);
			this.jmenuAccionesSriFacturasProveedores.add(this.jMenuItemNuevoGuardarCambiosSriFacturasProveedores);
			this.jmenuAccionesSriFacturasProveedores.add(this.jMenuItemNuevoRelacionesSriFacturasProveedores);
			this.jmenuAccionesSriFacturasProveedores.add(this.jMenuItemGuardarCambiosTablaSriFacturasProveedores);		
			this.jmenuAccionesSriFacturasProveedores.add(this.jMenuItemDuplicarSriFacturasProveedores);		
			this.jmenuAccionesSriFacturasProveedores.add(this.jMenuItemCopiarSriFacturasProveedores);		
			this.jmenuAccionesSriFacturasProveedores.add(this.jMenuItemVerFormSriFacturasProveedores);		
			
			this.jmenuDatosSriFacturasProveedores.add(this.jMenuItemRecargarInformacionSriFacturasProveedores);				
			this.jmenuDatosSriFacturasProveedores.add(this.jMenuItemAnterioresSriFacturasProveedores);				
			this.jmenuDatosSriFacturasProveedores.add(this.jMenuItemSiguientesSriFacturasProveedores);				
			this.jmenuDatosSriFacturasProveedores.add(this.jMenuItemAbrirOrderBySriFacturasProveedores);				
			this.jmenuDatosSriFacturasProveedores.add(this.jMenuItemMostrarOcultarSriFacturasProveedores);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSriFacturasProveedores.add(this.jMenuItemGuardarCambiosSriFacturasProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSriFacturasProveedores.add(this.jmenuArchivoSriFacturasProveedores);		
			this.jmenuBarSriFacturasProveedores.add(this.jmenuAccionesSriFacturasProveedores);		
			this.jmenuBarSriFacturasProveedores.add(this.jmenuDatosSriFacturasProveedores);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSriFacturasProveedores);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSriFacturasProveedores() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.setToolTipText("Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores= new JButtonMe();
		this.jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores.setText("Buscar");
		this.jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores.setToolTipText("Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores,"buscar_button","Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores = new JLabelMe();
		jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setText("Transaccion :");
		jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setToolTipText("Transaccion");
		jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores= new JComboBoxMe();
		jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasSriFacturasProveedores=new JTabbedPane();


		this.jTabbedPaneBusquedasSriFacturasProveedores.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSriFacturasProveedores.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSriFacturasProveedores.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSriFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSriFacturasProveedores = new SriFacturasProveedoresDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sri Facturas Proveedores DATOS");
			this.jInternalFrameDetalleFormSriFacturasProveedores = new SriFacturasProveedoresDetalleFormJInternalFrame(jDesktopPane,this.srifacturasproveedoresSessionBean.getConGuardarRelaciones(),this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSriFacturasProveedores = null;//new SriFacturasProveedoresDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriFacturasProveedores= new GridBagLayout();
		
		
		this.jTableDatosSriFacturasProveedores = new JTableMe();      
		
		String sToolTipSriFacturasProveedores="";
		sToolTipSriFacturasProveedores=SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriFacturasProveedores+="(Sris.SriFacturasProveedores)";
		}
		
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipSriFacturasProveedores+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSriFacturasProveedores.setToolTipText(sToolTipSriFacturasProveedores);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSriFacturasProveedores);
		this.jTableDatosSriFacturasProveedores.setAutoCreateRowSorter(true);
		this.jTableDatosSriFacturasProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSriFacturasProveedores.setRowSelectionAllowed(true);
		this.jTableDatosSriFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSriFacturasProveedores = new JButtonMe();
		this.jButtonDuplicarSriFacturasProveedores = new JButtonMe();
		this.jButtonCopiarSriFacturasProveedores = new JButtonMe();
		this.jButtonVerFormSriFacturasProveedores = new JButtonMe();
		this.jButtonNuevoRelacionesSriFacturasProveedores = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedores = new JButtonMe();
		this.jButtonCerrarSriFacturasProveedores = new JButtonMe();
		
		this.jScrollPanelDatosSriFacturasProveedores = new JScrollPane();   
        this.jScrollPanelDatosGeneralSriFacturasProveedores = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Facturas Proveedores";
		
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosSriFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesSriFacturasProveedores.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSriFacturasProveedores=new ReporteDinamicoJInternalFrame(SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSriFacturasProveedores();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSriFacturasProveedores=new ImportacionJInternalFrame(SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSriFacturasProveedores();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySriFacturasProveedores = new JButtonMe();
		
		this.jButtonAbrirOrderBySriFacturasProveedores.setText("Orden");
		this.jButtonAbrirOrderBySriFacturasProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriFacturasProveedores,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriFacturasProveedores,false,this);
			
			//this.cargarOrderBySriFacturasProveedores(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriFacturasProveedores,true,this);
			
			//this.cargarOrderBySriFacturasProveedores(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSriFacturasProveedores.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosSriFacturasProveedores.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosSriFacturasProveedores.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosSriFacturasProveedores.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriFacturasProveedores.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriFacturasProveedores.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSriFacturasProveedores.setText("Nuevo");
		this.jButtonDuplicarSriFacturasProveedores.setText("Duplicar");
		this.jButtonCopiarSriFacturasProveedores.setText("Copiar");
		this.jButtonVerFormSriFacturasProveedores.setText("Ver");
		this.jButtonNuevoRelacionesSriFacturasProveedores.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.setText("Guardar");
		this.jButtonCerrarSriFacturasProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriFacturasProveedores,"nuevo_button","Nuevo",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSriFacturasProveedores,"duplicar_button","Duplicar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSriFacturasProveedores,"copiar_button","Copiar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSriFacturasProveedores,"ver_form","Ver",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSriFacturasProveedores,"nuevorelaciones_button","Nuevo Rel",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriFacturasProveedores,"guardarcambiostabla_button","Guardar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriFacturasProveedores,"cerrar_button","Salir",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSriFacturasProveedores.setToolTipText("Nuevo"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSriFacturasProveedores.setToolTipText("Duplicar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSriFacturasProveedores.setToolTipText("Copiar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSriFacturasProveedores.setToolTipText("Ver"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSriFacturasProveedores.setToolTipText("Nuevo Rel"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.setToolTipText("Guardar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriFacturasProveedores.setToolTipText("Salir"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriFacturasProveedores";
		inputMap = this.jButtonNuevoSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriFacturasProveedores"));
		
		//DUPLICAR
		sMapKey = "DuplicarSriFacturasProveedores";
		inputMap = this.jButtonDuplicarSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSriFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSriFacturasProveedores"));
		
		//COPIAR
		sMapKey = "CopiarSriFacturasProveedores";
		inputMap = this.jButtonCopiarSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSriFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSriFacturasProveedores"));
		
		//VEr FORM
		sMapKey = "VerFormSriFacturasProveedores";
		inputMap = this.jButtonVerFormSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSriFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSriFacturasProveedores"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSriFacturasProveedores";
		inputMap = this.jButtonNuevoRelacionesSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSriFacturasProveedores"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSriFacturasProveedores";
		inputMap = this.jButtonModificarSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSriFacturasProveedores"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSriFacturasProveedores";
		inputMap = this.jButtonCerrarSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriFacturasProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriFacturasProveedores";
		inputMap = this.jButtonGuardarCambiosTablaSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriFacturasProveedores"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SriFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SriFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SriFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SriFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SriFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSriFacturasProveedores.setName("jPanelParametrosReportesSriFacturasProveedores"); 
		
		this.jPanelParametrosReportesAccionesSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSriFacturasProveedores.setName("jPanelParametrosReportesAccionesSriFacturasProveedores"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSriFacturasProveedores = new JButtonMe();
		this.jButtonRecargarInformacionSriFacturasProveedores.setText("Buscar");
		this.jButtonRecargarInformacionSriFacturasProveedores.setToolTipText("Buscar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSriFacturasProveedores,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionSriFacturasProveedores.setVisible(false);
		
		
		this.jButtonProcesarInformacionSriFacturasProveedores = new JButtonMe();
		this.jButtonProcesarInformacionSriFacturasProveedores.setText("Procesar");
		this.jButtonProcesarInformacionSriFacturasProveedores.setToolTipText("Procesar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSriFacturasProveedores.setVisible(false);
			
		this.jButtonProcesarInformacionSriFacturasProveedores.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriFacturasProveedores.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriFacturasProveedores.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSriFacturasProveedores.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposReportesSriFacturasProveedores.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSriFacturasProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSriFacturasProveedores.setText("Paginacion");
		this.jComboBoxTiposPaginacionSriFacturasProveedores.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSriFacturasProveedores.setText("Accion");
		this.jComboBoxTiposRelacionesSriFacturasProveedores.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriFacturasProveedores.setText("Accion");
		this.jComboBoxTiposAccionesSriFacturasProveedores.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSriFacturasProveedores.setText("Accion");
		this.jComboBoxTiposSeleccionarSriFacturasProveedores.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSriFacturasProveedores=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSriFacturasProveedores.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriFacturasProveedores.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriFacturasProveedores.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSriFacturasProveedores = new JLabelMe();
		
		this.jLabelAccionesSriFacturasProveedores.setText("Acciones");		
		this.jLabelAccionesSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSriFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSriFacturasProveedores.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSriFacturasProveedores.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSriFacturasProveedores = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSriFacturasProveedores.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSriFacturasProveedores.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSriFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSriFacturasProveedores.setText("Graf.");
		this.jCheckBoxConGraficoReporteSriFacturasProveedores.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSriFacturasProveedores = new JButtonMe();
		//this.jButtonAnterioresSriFacturasProveedores.setText("<<");
        this.jButtonAnterioresSriFacturasProveedores.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSriFacturasProveedores,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSriFacturasProveedores = new JButtonMe();
		//this.jButtonSiguientesSriFacturasProveedores.setText(">>");
        this.jButtonSiguientesSriFacturasProveedores.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSriFacturasProveedores,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSriFacturasProveedores = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSriFacturasProveedores.setText("Nue");
        this.jButtonNuevoGuardarCambiosSriFacturasProveedores.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSriFacturasProveedores,"nuevoguardarcambios_button","Nue",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSriFacturasProveedores";
		inputMap = this.jButtonNuevoGuardarCambiosSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSriFacturasProveedores"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSriFacturasProveedores";
		inputMap = this.jButtonRecargarInformacionSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSriFacturasProveedores"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSriFacturasProveedores";
		inputMap = this.jButtonSiguientesSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSriFacturasProveedores"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSriFacturasProveedores";
		inputMap = this.jButtonAnterioresSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSriFacturasProveedores"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSriFacturasProveedores();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSriFacturasProveedores.setMinimumSize(new Dimension(this.getWidth(),SriFacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriFacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriFacturasProveedores.setMaximumSize(new Dimension(this.getWidth(),SriFacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriFacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriFacturasProveedores.setPreferredSize(new Dimension(this.getWidth(),SriFacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriFacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSriFacturasProveedores = new GridBagLayout();

			this.jPanelPaginacionSriFacturasProveedores.setLayout(gridaBagLayoutPaginacionSriFacturasProveedores);						
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonAnterioresSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
					
						
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
			
			this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonNuevoGuardarCambiosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
						
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
			this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonSiguientesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonNuevoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
						
			
			
			if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSriFacturasProveedores.gridy = 1;
				this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonGuardarCambiosTablaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			}
			
			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonDuplicarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonCopiarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonVerFormSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSriFacturasProveedores.add(this.jButtonCerrarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		
		
		this.jButtonRecargarInformacionSriFacturasProveedores.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriFacturasProveedores.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriFacturasProveedores.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSriFacturasProveedores.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriFacturasProveedores.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriFacturasProveedores.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSriFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSriFacturasProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriFacturasProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriFacturasProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSriFacturasProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriFacturasProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriFacturasProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSriFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSriFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSriFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSriFacturasProveedores.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriFacturasProveedores.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriFacturasProveedores.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSriFacturasProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriFacturasProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriFacturasProveedores.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSriFacturasProveedores.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriFacturasProveedores.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriFacturasProveedores.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSriFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSriFacturasProveedores = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SriFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SriFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SriFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SriFacturasProveedores = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSriFacturasProveedores.setLayout(gridaBagParametrosReportesSriFacturasProveedores);
			this.jPanelParametrosReportesAccionesSriFacturasProveedores.setLayout(gridaBagParametrosReportesAccionesSriFacturasProveedores);
			
			
			this.jPanelParametrosAuxiliar1SriFacturasProveedores.setLayout(gridaBagParametrosAuxiliar1SriFacturasProveedores);
			this.jPanelParametrosAuxiliar2SriFacturasProveedores.setLayout(gridaBagParametrosAuxiliar2SriFacturasProveedores);
			this.jPanelParametrosAuxiliar3SriFacturasProveedores.setLayout(gridaBagParametrosAuxiliar3SriFacturasProveedores);
			this.jPanelParametrosAuxiliar4SriFacturasProveedores.setLayout(gridaBagParametrosAuxiliar4SriFacturasProveedores);
			//this.jPanelParametrosAuxiliar5SriFacturasProveedores.setLayout(gridaBagParametrosAuxiliar2SriFacturasProveedores);			
			
			
			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jButtonRecargarInformacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriFacturasProveedores.add(this.jComboBoxTiposPaginacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriFacturasProveedores.add(this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriFacturasProveedores.add(this.jComboBoxTiposArchivosReportesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jPanelParametrosAuxiliar1SriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SriFacturasProveedores.add(this.jComboBoxTiposReportesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);																		
			
			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SriFacturasProveedores.add(this.jComboBoxTiposGraficosReportesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jPanelParametrosAuxiliar4SriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jComboBoxTiposReportesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jCheckBoxGenerarReporteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jPanelParametrosAuxiliar2SriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jLabelAccionesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSriFacturasProveedores.add(this.jButtonAbrirOrderBySriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jComboBoxTiposSeleccionarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);			
			
			
			/*
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jCheckBoxSeleccionarTodosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jCheckBoxConGraficoReporteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriFacturasProveedores.add(this.jCheckBoxSeleccionarTodosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);															
				
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriFacturasProveedores.add(this.jCheckBoxSeleccionadosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);															
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriFacturasProveedores.add(this.jCheckBoxConGraficoReporteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jPanelParametrosAuxiliar3SriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriFacturasProveedores.add(this.jComboBoxTiposAccionesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSriFacturasProveedores = new GridBagLayout();

			this.jScrollPanelDatosSriFacturasProveedores.setLayout(gridaBagLayoutDatosSriFacturasProveedores);
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
			this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
			
			this.jScrollPanelDatosSriFacturasProveedores.add(this.jTableDatosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSriFacturasProveedores.setViewportView(this.jTableDatosSriFacturasProveedores);
		this.jTableDatosSriFacturasProveedores.setFillsViewportHeight(true);
		this.jTableDatosSriFacturasProveedores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSriFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesSriFacturasProveedores.setLayout(gridaBagLayoutAccionesSriFacturasProveedores);
		
		
		/*	
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
			
		this.jPanelAccionesSriFacturasProveedores.add(this.jButtonNuevoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaSriFacturasProveedoresSriFacturasProveedores= new GridBagLayout();
		gridaBagLayoutBusquedaSriFacturasProveedoresSriFacturasProveedores.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaSriFacturasProveedoresSriFacturasProveedores.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaSriFacturasProveedoresSriFacturasProveedores.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaSriFacturasProveedoresSriFacturasProveedores.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.setLayout(gridaBagLayoutBusquedaSriFacturasProveedoresSriFacturasProveedores);

		gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedores.gridy = 0;
		gridBagConstraintsSriFacturasProveedores.gridx = 0;
		jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.add(jLabelid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);

		gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedores.gridy = 0;
		gridBagConstraintsSriFacturasProveedores.gridx = 1;
		jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.add(jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);


		gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedores.gridy = 1;
		gridBagConstraintsSriFacturasProveedores.gridx = 0;
		jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.add(jLabelfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);

		gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedores.gridy = 1;
		gridBagConstraintsSriFacturasProveedores.gridx = 1;
		jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.add(jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);


		gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedores.gridy = 2;
		gridBagConstraintsSriFacturasProveedores.gridx = 0;
		jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.add(jLabelfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);

		gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedores.gridy = 2;
		gridBagConstraintsSriFacturasProveedores.gridx = 1;
		jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.add(jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);

		gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedores.gridy = 3;
		gridBagConstraintsSriFacturasProveedores.gridx =1;
		jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores.add(jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);

		jTabbedPaneBusquedasSriFacturasProveedores.addTab("1.-Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores);
		jTabbedPaneBusquedasSriFacturasProveedores.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriFacturasProveedores);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();						
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriFacturasProveedores.gridx = 0;		
			//this.gridBagConstraintsSriFacturasProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriFacturasProveedores.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;		
		//this.gridBagConstraintsSriFacturasProveedores.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSriFacturasProveedores);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriFacturasProveedores.gridx = 0;		
			this.gridBagConstraintsSriFacturasProveedores.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSriFacturasProveedores.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);								
		
		
		/*
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		*/		
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriFacturasProveedores.gridx =0;
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriFacturasProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
				
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSriFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriFacturasProveedores = new GridBagLayout();
			this.jPanelBusquedasParametrosSriFacturasProveedores.setLayout(gridaBagLayoutBusquedasParametrosSriFacturasProveedores);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSriFacturasProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			
			
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
			
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSriFacturasProveedores;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSriFacturasProveedores() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSriFacturasProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSriFacturasProveedores.setName("jPanelReporteDinamicoSriFacturasProveedores"); 
		
		this.jPanelReporteDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSriFacturasProveedores.setLayout(gridaBagLayoutReporteDinamicoSriFacturasProveedores);
		
		
		this.jInternalFrameReporteDinamicoSriFacturasProveedores= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSriFacturasProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriFacturasProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSriFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSriFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSriFacturasProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSriFacturasProveedores.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSriFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSriFacturasProveedores.setResizable(true);
	    this.jInternalFrameReporteDinamicoSriFacturasProveedores.setClosable(true);
	    this.jInternalFrameReporteDinamicoSriFacturasProveedores.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedoreses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSriFacturasProveedores = new JLabelMe();

		this.jLabelColumnasSelectReporteSriFacturasProveedores.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jLabelColumnasSelectReporteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSriFacturasProveedores = new JList<Reporte>();
		this.jListColumnasSelectReporteSriFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSriFacturasProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSriFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSriFacturasProveedores=new JScrollPane(this.jListColumnasSelectReporteSriFacturasProveedores);
			
			this.jScrollColumnasSelectReporteSriFacturasProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriFacturasProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriFacturasProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jListColumnasSelectReporteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jScrollColumnasSelectReporteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSriFacturasProveedores = new JLabelMe();

		this.jLabelRelacionesSelectReporteSriFacturasProveedores.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSriFacturasProveedores = new JList<Reporte>();
		this.jListRelacionesSelectReporteSriFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSriFacturasProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSriFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSriFacturasProveedores=new JScrollPane(this.jListRelacionesSelectReporteSriFacturasProveedores);
			
			this.jScrollRelacionesSelectReporteSriFacturasProveedores.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriFacturasProveedores.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriFacturasProveedores.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSriFacturasProveedores = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores = new JComboBoxMe();
		this.jListColumnasValoresGraficoSriFacturasProveedores = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedores = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSriFacturasProveedores = new JLabelMe();

		this.jLabelConGraficoDinamicoSriFacturasProveedores.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jLabelConGraficoDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSriFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSriFacturasProveedores.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSriFacturasProveedores.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jCheckBoxConGraficoDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSriFacturasProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSriFacturasProveedores.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jLabelColumnaCategoriaGraficoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSriFacturasProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaValorSriFacturasProveedores.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jLabelColumnaCategoriaValorSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSriFacturasProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSriFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSriFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jComboBoxColumnaCategoriaValorSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSriFacturasProveedores = new JLabelMe();

		this.jLabelColumnasValoresGraficoSriFacturasProveedores.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jLabelColumnasValoresGraficoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSriFacturasProveedores = new JList<Reporte>();
		this.jListColumnasValoresGraficoSriFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSriFacturasProveedores.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSriFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSriFacturasProveedores=new JScrollPane(this.jListColumnasValoresGraficoSriFacturasProveedores);
			
			this.jScrollColumnasValoresGraficoSriFacturasProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriFacturasProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriFacturasProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jListColumnasSelectReporteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jScrollColumnasValoresGraficoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedores = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedores.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedores.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedores = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedores.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedores = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedores.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedores,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedores.setToolTipText("Generar EXCEL"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jComboBoxTiposReportesDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedores = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedores.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSriFacturasProveedores = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSriFacturasProveedores.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSriFacturasProveedores,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSriFacturasProveedores.setToolTipText("Generar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jButtonGenerarReporteDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSriFacturasProveedores = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSriFacturasProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSriFacturasProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSriFacturasProveedores.setToolTipText("Cancelar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriFacturasProveedores.add(this.jButtonCerrarReporteDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSriFacturasProveedores = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSriFacturasProveedores= new JScrollPane(jPanelReporteDinamicoSriFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSriFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedoreses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedores.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSriFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSriFacturasProveedores.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSriFacturasProveedores);
		this.jInternalFrameReporteDinamicoSriFacturasProveedores.getContentPane().add(this.jScrollPanelReporteDinamicoSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSriFacturasProveedores() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSriFacturasProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSriFacturasProveedores.setName("jPanelImportacionSriFacturasProveedores"); 
		
		this.jPanelImportacionSriFacturasProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriFacturasProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriFacturasProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSriFacturasProveedores.setLayout(gridaBagLayoutImportacionSriFacturasProveedores);
		
		
		this.jInternalFrameImportacionSriFacturasProveedores= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSriFacturasProveedores= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSriFacturasProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriFacturasProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSriFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriFacturasProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSriFacturasProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriFacturasProveedores.setResizable(true);
	    this.jInternalFrameImportacionSriFacturasProveedores.setClosable(true);
	    this.jInternalFrameImportacionSriFacturasProveedores.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSriFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriFacturasProveedores.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSriFacturasProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriFacturasProveedores.setResizable(true);
	    this.jInternalFrameImportacionSriFacturasProveedores.setClosable(true);
	    this.jInternalFrameImportacionSriFacturasProveedores.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSriFacturasProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriFacturasProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriFacturasProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedoreses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSriFacturasProveedores = new JLabelMe();

		this.jLabelArchivoImportacionSriFacturasProveedores.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriFacturasProveedores.add(this.jLabelArchivoImportacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSriFacturasProveedores = new JFileChooser();		
		this.jFileChooserImportacionSriFacturasProveedores.setToolTipText("ESCOGER ARCHIVO"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSriFacturasProveedores = new JButtonMe();
		this.jButtonAbrirImportacionSriFacturasProveedores.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSriFacturasProveedores,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSriFacturasProveedores.setToolTipText("Generar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriFacturasProveedores.add(this.jButtonAbrirImportacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSriFacturasProveedores = new JLabelMe();

		this.jLabelPathArchivoImportacionSriFacturasProveedores.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriFacturasProveedores.add(this.jLabelPathArchivoImportacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSriFacturasProveedores=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSriFacturasProveedores.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriFacturasProveedores.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriFacturasProveedores.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriFacturasProveedores.add(this.jTextFieldPathArchivoImportacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSriFacturasProveedores = new JButtonMe();
		this.jButtonGenerarImportacionSriFacturasProveedores.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSriFacturasProveedores,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSriFacturasProveedores.setToolTipText("Generar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriFacturasProveedores.add(this.jButtonGenerarImportacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSriFacturasProveedores = new JButtonMe();
		this.jButtonCerrarImportacionSriFacturasProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSriFacturasProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSriFacturasProveedores.setToolTipText("Cancelar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriFacturasProveedores.add(this.jButtonCerrarImportacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSriFacturasProveedores = new GridBagLayout();
		
		this.jScrollPanelImportacionSriFacturasProveedores= new JScrollPane(jPanelImportacionSriFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy =iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedores.gridx =iPosXImportacion;
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSriFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSriFacturasProveedores.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSriFacturasProveedores);
		this.jInternalFrameImportacionSriFacturasProveedores.getContentPane().add(this.jScrollPanelImportacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySriFacturasProveedores(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySriFacturasProveedores = new JButtonMe();
			this.jButtonAbrirOrderBySriFacturasProveedores.setText("Orden");
			this.jButtonAbrirOrderBySriFacturasProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriFacturasProveedores,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySriFacturasProveedores";
			inputMap = this.jButtonAbrirOrderBySriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySriFacturasProveedores"));
		
		
			GridBagLayout gridaBagLayoutOrderBySriFacturasProveedores = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySriFacturasProveedores.setName("jPanelOrderBySriFacturasProveedores"); 
			
			this.jPanelOrderBySriFacturasProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriFacturasProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriFacturasProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySriFacturasProveedores.setLayout(gridaBagLayoutOrderBySriFacturasProveedores);
			
			
			this.jTableDatosSriFacturasProveedoresOrderBy = new JTableMe();        
			this.jTableDatosSriFacturasProveedoresOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSriFacturasProveedoresOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSriFacturasProveedoresOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSriFacturasProveedoresOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSriFacturasProveedoresOrderBy.setViewportView(this.jTableDatosSriFacturasProveedoresOrderBy);
			this.jTableDatosSriFacturasProveedoresOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSriFacturasProveedoresOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySriFacturasProveedores= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySriFacturasProveedores= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySriFacturasProveedores = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSriFacturasProveedores= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySriFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySriFacturasProveedores.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySriFacturasProveedores.setTitle("Orden");
			this.jInternalFrameOrderBySriFacturasProveedores.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySriFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySriFacturasProveedores.setResizable(true);
			this.jInternalFrameOrderBySriFacturasProveedores.setClosable(true);
			this.jInternalFrameOrderBySriFacturasProveedores.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySriFacturasProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriFacturasProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriFacturasProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedoreses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSriFacturasProveedores.ipady =150;
				
			this.jPanelOrderBySriFacturasProveedores.add(jScrollPanelDatosSriFacturasProveedoresOrderBy, this.gridBagConstraintsSriFacturasProveedores);//this.jTableDatosSriFacturasProveedoresTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySriFacturasProveedores = new JButtonMe();
			this.jButtonCerrarOrderBySriFacturasProveedores.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySriFacturasProveedores,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySriFacturasProveedores.setToolTipText("Cancelar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySriFacturasProveedores.add(this.jButtonCerrarOrderBySriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSriFacturasProveedores = new GridBagLayout();
			
			this.jScrollPanelOrderBySriFacturasProveedores= new JScrollPane(jPanelOrderBySriFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.gridy =iPosYOrderBy;
			this.gridBagConstraintsSriFacturasProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySriFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySriFacturasProveedores.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSriFacturasProveedores);
			
			this.jInternalFrameOrderBySriFacturasProveedores.getContentPane().add(this.jScrollPanelOrderBySriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);			
		
		} else {
			this.jButtonAbrirOrderBySriFacturasProveedores = new JButtonMe();
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
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSriFacturasProveedores.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosSriFacturasProveedores.getRowHeight();//SriFacturasProveedoresConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SriFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores.isSelected()) {
					iHeightTable=SriFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SriFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriFacturasProveedores.isSelected()) {
					iHeightTable=SriFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSriFacturasProveedores.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriFacturasProveedores.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriFacturasProveedores.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSriFacturasProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriFacturasProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriFacturasProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySriFacturasProveedores!=null && this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy()!=null) {
			//if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySriFacturasProveedores.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySriFacturasProveedores.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySriFacturasProveedores.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSriFacturasProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriFacturasProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriFacturasProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=srifacturasproveedoresLogic.getSriFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=srifacturasproveedoress.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SriFacturasProveedores> TraerSriFacturasProveedoresBeans(List<SriFacturasProveedores> srifacturasproveedoress,ArrayList<Classe> classes)throws Exception {
		try {
			for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoress) {
					
				if(!(SriFacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SriFacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					srifacturasproveedores.setsDetalleGeneralEntityReporte(SriFacturasProveedoresConstantesFunciones.getSriFacturasProveedoresDescripcion(srifacturasproveedores));
										
						
					
						
					
				} else  {
							
					//srifacturasproveedores.setsDetalleGeneralEntityReporte(srifacturasproveedores.getsDetalleGeneralEntityReporte());
										
				}
				
				//srifacturasproveedoresbeans.add(srifacturasproveedoresbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return srifacturasproveedoress;
    }
	//PARA REPORTES FIN
}
