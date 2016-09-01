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
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.sris.util.report.SriComprasConstantesFunciones;

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
public class SriComprasJInternalFrame extends SriComprasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSriCompras;
	
	protected JMenuBar jmenuBarSriCompras;
	
	protected JMenu jmenuSriCompras;
	protected JMenu jmenuDatosSriCompras;
	protected JMenu jmenuArchivoSriCompras;
	protected JMenu jmenuAccionesSriCompras;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriCompras;	
	protected GridBagConstraints gridBagConstraintsSriCompras;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SriComprasDetalleFormJInternalFrame jInternalFrameDetalleFormSriCompras;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSriCompras;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSriCompras;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivapresta="";
	
	public SriComprasSessionBean sricomprasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaprestaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SriCompras> sricomprass;		
	public List<SriCompras> sricomprassEliminados;	
	public List<SriCompras> sricomprassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySriCompras;		
	protected JButton jButtonAbrirOrderBySriCompras;
	
	
	//protected JPanel jPanelOrderBySriCompras;
	//public JScrollPane jScrollPanelOrderBySriCompras;	
	//protected JButton jButtonCerrarOrderBySriCompras;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SriComprasLogic sricomprasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSriCompras;
	public JScrollPane jScrollPanelDatosEdicionSriCompras;
	public JScrollPane jScrollPanelDatosGeneralSriCompras;
    
	
	
	//public JScrollPane jScrollPanelDatosSriComprasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSriCompras;
	//public JScrollPane jScrollPanelImportacionSriCompras;
	
	
	
	protected JPanel jPanelAccionesSriCompras;
	
    protected JPanel jPanelPaginacionSriCompras;
    protected JPanel jPanelParametrosReportesSriCompras;
	protected JPanel jPanelParametrosReportesAccionesSriCompras;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SriCompras;
	protected JPanel jPanelParametrosAuxiliar2SriCompras;
	protected JPanel jPanelParametrosAuxiliar3SriCompras;
	protected JPanel jPanelParametrosAuxiliar4SriCompras;
	//protected JPanel jPanelParametrosAuxiliar5SriCompras;
	
	
	
	//protected JPanel jPanelReporteDinamicoSriCompras;
	//protected JPanel jPanelImportacionSriCompras;
	
	
	public JTable jTableDatosSriCompras;
	
	
	
	//public JTable jTableDatosSriComprasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSriCompras;
	protected JButton jButtonDuplicarSriCompras;
	protected JButton jButtonCopiarSriCompras;
	protected JButton jButtonVerFormSriCompras;
	protected JButton jButtonNuevoRelacionesSriCompras;
	protected JButton jButtonModificarSriCompras;
	
    protected JButton jButtonGuardarCambiosTablaSriCompras;
	protected JButton jButtonCerrarSriCompras;
	
	
	protected JButton jButtonRecargarInformacionSriCompras;
	protected JButton jButtonProcesarInformacionSriCompras;
	
	
	protected JButton jButtonAnterioresSriCompras;
	protected JButton jButtonSiguientesSriCompras;
	protected JButton jButtonNuevoGuardarCambiosSriCompras;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSriCompras;
	//protected JButton jButtonCerrarReporteDinamicoSriCompras;
	//protected JButton jButtonGenerarExcelReporteDinamicoSriCompras;	
	
	
	
	//protected JButton jButtonAbrirImportacionSriCompras;
	//protected JButton jButtonGenerarImportacionSriCompras;
	//protected JButton jButtonCerrarImportacionSriCompras;
	//protected JFileChooser jFileChooserImportacionSriCompras;
	//protected File fileImportacionSriCompras;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriCompras;
	protected JButton jButtonDuplicarToolBarSriCompras;
	protected JButton jButtonNuevoRelacionesToolBarSriCompras;
	
	
	public JButton jButtonGuardarCambiosToolBarSriCompras;
	protected JButton jButtonCopiarToolBarSriCompras;
	protected JButton jButtonVerFormToolBarSriCompras;
	public JButton jButtonGuardarCambiosTablaToolBarSriCompras;
	protected JButton jButtonMostrarOcultarTablaToolBarSriCompras;
	protected JButton jButtonCerrarToolBarSriCompras;
	
	protected JButton jButtonRecargarInformacionToolBarSriCompras;
	protected JButton jButtonProcesarInformacionToolBarSriCompras;
	protected JButton jButtonAnterioresToolBarSriCompras;
	protected JButton jButtonSiguientesToolBarSriCompras;
	protected JButton jButtonNuevoGuardarCambiosToolBarSriCompras;
	protected JButton jButtonAbrirOrderByToolBarSriCompras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriCompras;
	protected JMenuItem jMenuItemDuplicarSriCompras;
	protected JMenuItem jMenuItemNuevoRelacionesSriCompras;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSriCompras;
	protected JMenuItem jMenuItemCopiarSriCompras;
	protected JMenuItem jMenuItemVerFormSriCompras;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriCompras;
	protected JMenuItem jMenuItemCerrarSriCompras;
	protected JMenuItem jMenuItemDetalleCerrarSriCompras;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySriCompras;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriCompras;
	
	protected JMenuItem jMenuItemRecargarInformacionSriCompras;
	protected JMenuItem jMenuItemProcesarInformacionSriCompras;
	protected JMenuItem jMenuItemAnterioresSriCompras;
	protected JMenuItem jMenuItemSiguientesSriCompras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriCompras;
	protected JMenuItem jMenuItemAbrirOrderBySriCompras;
	protected JMenuItem jMenuItemMostrarOcultarSriCompras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriCompras;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSriCompras;
	protected JCheckBox jCheckBoxSeleccionadosSriCompras;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSriCompras;
	protected JCheckBox jCheckBoxConGraficoReporteSriCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSriCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSriCompras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSriCompras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSriCompras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSriCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSriCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSriCompras;
	protected JTextField jTextFieldValorCampoGeneralSriCompras;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSriCompras;
	//public JList<Reporte> jListColumnasSelectReporteSriCompras;
	//public JScrollPane jScrollColumnasSelectReporteSriCompras;
	
	//public JLabel jLabelRelacionesSelectReporteSriCompras;
	//public JList<Reporte> jListRelacionesSelectReporteSriCompras;
	//public JScrollPane jScrollRelacionesSelectReporteSriCompras;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSriCompras;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSriCompras;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSriCompras;
	//public JLabel jLabelTiposArchivoReporteDinamicoSriCompras;
	
		
	//public JLabel jLabelArchivoImportacionSriCompras;	
	//public JLabel jLabelPathArchivoImportacionSriCompras;
	//protected JTextField jTextFieldPathArchivoImportacionSriCompras;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSriCompras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSriCompras;
	
	//public JLabel jLabelColumnaCategoriaValorSriCompras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSriCompras;
	
	//public JLabel jLabelColumnasValoresGraficoSriCompras;
	//public JList<Reporte> jListColumnasValoresGraficoSriCompras;
	//public JScrollPane jScrollColumnasValoresGraficoSriCompras;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSriCompras;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSriCompras;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSriCompras;
	public JPanel jPanelBusquedaSriComprasSriCompras;
	public JButton jButtonBusquedaSriComprasSriCompras;
	
	public JPanel jPanelid_periodo_declaraBusquedaSriComprasSriCompras;
	public JLabel jLabelid_periodo_declaraBusquedaSriComprasSriCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras;
	public JButton jButtonid_periodo_declaraBusquedaSriComprasSriCompras= new JButtonMe();
	public JButton jButtonid_periodo_declaraBusquedaSriComprasSriComprasUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraBusquedaSriComprasSriComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteBusquedaSriComprasSriCompras;
	public JLabel jLabelid_clienteBusquedaSriComprasSriCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBusquedaSriComprasSriCompras;
	public JButton jButtonid_clienteBusquedaSriComprasSriCompras= new JButtonMe();
	public JButton jButtonid_clienteBusquedaSriComprasSriComprasUpdate= new JButtonMe();
	public JButton jButtonid_clienteBusquedaSriComprasSriComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaSriComprasSriCompras;
	public JLabel jLabelrucBusquedaSriComprasSriCompras;
	public JTextField jTextFieldrucBusquedaSriComprasSriCompras;
	public JButton jButtonrucBusquedaSriComprasSriComprasBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SriComprasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriComprasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriComprasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriComprasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSriCompras)	{
		this.jButtonRecargarInformacionSriCompras = jButtonRecargarInformacionSriCompras;
	}
	
	public JButton getjButtonProcesarInformacionSriCompras() {
		return this.jButtonProcesarInformacionSriCompras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriCompras)	{
		this.jButtonProcesarInformacionSriCompras = jButtonProcesarInformacionSriCompras;
	}
	
	
	public JButton getjButtonRecargarInformacionSriCompras() {
		return this.jButtonRecargarInformacionSriCompras;
	}
	
	
	public List<SriCompras> getsricomprass() {
		return this.sricomprass;
	}

	public void setsricomprass(List<SriCompras> sricomprass) {
		this.sricomprass = sricomprass;
	}
	
	public List<SriCompras> getsricomprassAux() {
		return this.sricomprassAux;
	}

	public void setsricomprassAux(List<SriCompras> sricomprassAux) {
		this.sricomprassAux = sricomprassAux;
	}
	
	public List<SriCompras> getsricomprassEliminados() {
		return this.sricomprassEliminados;
	}

	public void setSriComprassEliminados(List<SriCompras> sricomprassEliminados) {
		this.sricomprassEliminados = sricomprassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSriCompras() {
		return jComboBoxTiposSeleccionarSriCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSriCompras(
			JComboBox jComboBoxTiposSeleccionarSriCompras) {
		this.jComboBoxTiposSeleccionarSriCompras = jComboBoxTiposSeleccionarSriCompras;
	}
	
	public void setBorderResaltarTiposSeleccionarSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSriCompras .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSriCompras() {
		return jTextFieldValorCampoGeneralSriCompras;
	}

	public void setjTextFieldValorCampoGeneralSriCompras(
			JTextField jTextFieldValorCampoGeneralSriCompras) {
		this.jTextFieldValorCampoGeneralSriCompras = jTextFieldValorCampoGeneralSriCompras;
	}

	public void setBorderResaltarValorCampoGeneralSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSriCompras .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSriCompras() {
		return this.jCheckBoxSeleccionarTodosSriCompras;
	}

	public void setjCheckBoxSeleccionarTodosSriCompras(
			JCheckBox jCheckBoxSeleccionarTodosSriCompras) {
		this.jCheckBoxSeleccionarTodosSriCompras = jCheckBoxSeleccionarTodosSriCompras;
	}

	public void setBorderResaltarSeleccionarTodosSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSriCompras .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSriCompras() {
		return this.jCheckBoxSeleccionadosSriCompras;
	}

	public void setjCheckBoxSeleccionadosSriCompras(
			JCheckBox jCheckBoxSeleccionadosSriCompras) {
		this.jCheckBoxSeleccionadosSriCompras = jCheckBoxSeleccionadosSriCompras;
	}
	
	public void setBorderResaltarSeleccionadosSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSriCompras .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSriCompras() {
		return this.jComboBoxTiposArchivosReportesSriCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSriCompras(
			JComboBox jComboBoxTiposArchivosReportesSriCompras) {
		this.jComboBoxTiposArchivosReportesSriCompras = jComboBoxTiposArchivosReportesSriCompras;
	}

	public void setBorderResaltarTiposArchivosReportesSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSriCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSriCompras() {
		return this.jComboBoxTiposReportesSriCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSriCompras(
			JComboBox jComboBoxTiposReportesSriCompras) {
		this.jComboBoxTiposReportesSriCompras = jComboBoxTiposReportesSriCompras;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSriCompras() {
	//	return jComboBoxTiposReportesDinamicoSriCompras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSriCompras(
	//		JComboBox jComboBoxTiposReportesDinamicoSriCompras) {
	//	this.jComboBoxTiposReportesDinamicoSriCompras = jComboBoxTiposReportesDinamicoSriCompras;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSriCompras() {
	//	return jComboBoxTiposArchivosReportesDinamicoSriCompras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSriCompras(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSriCompras) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSriCompras = jComboBoxTiposArchivosReportesDinamicoSriCompras;
	//}
	
	public void setBorderResaltarTiposReportesSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSriCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSriCompras() {
		return this.jComboBoxTiposGraficosReportesSriCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSriCompras(
			JComboBox jComboBoxTiposGraficosReportesSriCompras) {
		this.jComboBoxTiposGraficosReportesSriCompras = jComboBoxTiposGraficosReportesSriCompras;
	}
	
	public void setBorderResaltarTiposGraficosReportesSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSriCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSriCompras() {
		return this.jComboBoxTiposPaginacionSriCompras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSriCompras(
			JComboBox jComboBoxTiposPaginacionSriCompras) {
		this.jComboBoxTiposPaginacionSriCompras = jComboBoxTiposPaginacionSriCompras;
	}
	
	public void setBorderResaltarTiposPaginacionSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSriCompras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSriCompras() {
		return this.jComboBoxTiposRelacionesSriCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriCompras() {
		return this.jComboBoxTiposAccionesSriCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriCompras(
			JComboBox jComboBoxTiposRelacionesSriCompras) {
		this.jComboBoxTiposRelacionesSriCompras = jComboBoxTiposRelacionesSriCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriCompras(
			JComboBox jComboBoxTiposAccionesSriCompras) {
		this.jComboBoxTiposAccionesSriCompras = jComboBoxTiposAccionesSriCompras;
	}
	
	public void setBorderResaltarTiposRelacionesSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSriCompras .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSriCompras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriCompras.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSriCompras .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSriCompras() {
	//	return jCheckBoxConGraficoDinamicoSriCompras;
	//}

	//public void setjCheckBoxConGraficoDinamicoSriCompras(
	//		JCheckBox jCheckBoxConGraficoDinamicoSriCompras) {
	//	this.jCheckBoxConGraficoDinamicoSriCompras = jCheckBoxConGraficoDinamicoSriCompras;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSriCompras() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSriCompras.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSriCompras .setBorder(borderResaltar);		
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
		this.sricomprasSessionBean=new SriComprasSessionBean();
		
		this.sricomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sricomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sricomprasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SriComprasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SriComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriComprasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriComprasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Compras MANTENIMIENTO"));
		
		
		if(iWidth > 3150) {
			iWidth=3150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
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
		
		SriComprasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSriCompras= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSriCompras,this.jTtoolBarSriCompras,
							"nuevo","nuevo","Nuevo"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSriCompras,this.jTtoolBarSriCompras,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSriCompras,this.jTtoolBarSriCompras,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSriCompras,this.jTtoolBarSriCompras,
							"duplicar","duplicar","Duplicar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSriCompras,this.jTtoolBarSriCompras,
							"copiar","copiar","Copiar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSriCompras,this.jTtoolBarSriCompras,
							"ver_form","ver_form","Ver"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriCompras,this.jTtoolBarSriCompras,
							"recargar","recargar","Buscar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriCompras,this.jTtoolBarSriCompras,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriCompras,this.jTtoolBarSriCompras,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSriCompras,this.jTtoolBarSriCompras,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSriCompras,this.jTtoolBarSriCompras,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSriCompras,this.jTtoolBarSriCompras,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSriCompras,this.jTtoolBarSriCompras,
							"cerrar","cerrar","Salir"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSriCompras=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSriCompras;
			
				this.jButtonProcesarInformacionToolBarSriCompras=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSriCompras;
				
		//protected JButton jButtonModificarToolBarSriCompras;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSriCompras=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSriCompras=new JMenuMe("General");
		this.jmenuArchivoSriCompras=new JMenuMe("Archivo");
		this.jmenuAccionesSriCompras=new JMenuMe("Acciones");
		this.jmenuDatosSriCompras=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriCompras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriCompras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriCompras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSriCompras= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSriCompras.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSriCompras,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSriCompras= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSriCompras.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSriCompras,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSriCompras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriCompras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriCompras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSriCompras= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSriCompras.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSriCompras,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSriCompras= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSriCompras.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSriCompras,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSriCompras= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSriCompras.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSriCompras,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSriCompras= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSriCompras.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSriCompras,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSriCompras= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSriCompras.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSriCompras,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSriCompras= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSriCompras.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSriCompras,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSriCompras= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSriCompras.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSriCompras,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySriCompras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySriCompras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySriCompras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriCompras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySriCompras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySriCompras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySriCompras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriCompras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSriCompras= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSriCompras.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSriCompras,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSriCompras.add(this.jMenuItemCerrarSriCompras);
			
			this.jmenuAccionesSriCompras.add(this.jMenuItemNuevoSriCompras);
			this.jmenuAccionesSriCompras.add(this.jMenuItemNuevoGuardarCambiosSriCompras);
			this.jmenuAccionesSriCompras.add(this.jMenuItemNuevoRelacionesSriCompras);
			this.jmenuAccionesSriCompras.add(this.jMenuItemGuardarCambiosTablaSriCompras);		
			this.jmenuAccionesSriCompras.add(this.jMenuItemDuplicarSriCompras);		
			this.jmenuAccionesSriCompras.add(this.jMenuItemCopiarSriCompras);		
			this.jmenuAccionesSriCompras.add(this.jMenuItemVerFormSriCompras);		
			
			this.jmenuDatosSriCompras.add(this.jMenuItemRecargarInformacionSriCompras);				
			this.jmenuDatosSriCompras.add(this.jMenuItemAnterioresSriCompras);				
			this.jmenuDatosSriCompras.add(this.jMenuItemSiguientesSriCompras);				
			this.jmenuDatosSriCompras.add(this.jMenuItemAbrirOrderBySriCompras);				
			this.jmenuDatosSriCompras.add(this.jMenuItemMostrarOcultarSriCompras);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSriCompras.add(this.jMenuItemGuardarCambiosSriCompras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSriCompras.add(this.jmenuArchivoSriCompras);		
			this.jmenuBarSriCompras.add(this.jmenuAccionesSriCompras);		
			this.jmenuBarSriCompras.add(this.jmenuDatosSriCompras);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSriCompras);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSriCompras() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaSriComprasSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaSriComprasSriCompras.setToolTipText("Buscar Por Periodo Declara Por Cliente Por Ruc ");
		this.jButtonBusquedaSriComprasSriCompras= new JButtonMe();
		this.jButtonBusquedaSriComprasSriCompras.setText("Buscar");
		this.jButtonBusquedaSriComprasSriCompras.setToolTipText("Buscar Por Periodo Declara Por Cliente Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaSriComprasSriCompras,"buscar_button","Buscar Por Periodo Declara Por Cliente Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaSriComprasSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_periodo_declaraBusquedaSriComprasSriCompras = new JLabelMe();
		jLabelid_periodo_declaraBusquedaSriComprasSriCompras.setText("Periodo Declara :");
		jLabelid_periodo_declaraBusquedaSriComprasSriCompras.setToolTipText("Periodo Declara");
		jLabelid_periodo_declaraBusquedaSriComprasSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraBusquedaSriComprasSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraBusquedaSriComprasSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraBusquedaSriComprasSriCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras= new JComboBoxMe();
		jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_clienteBusquedaSriComprasSriCompras = new JLabelMe();
		jLabelid_clienteBusquedaSriComprasSriCompras.setText("Cliente :");
		jLabelid_clienteBusquedaSriComprasSriCompras.setToolTipText("Cliente");
		jLabelid_clienteBusquedaSriComprasSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaSriComprasSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaSriComprasSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBusquedaSriComprasSriCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteBusquedaSriComprasSriCompras= new JComboBoxMe();
		jComboBoxid_clienteBusquedaSriComprasSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaSriComprasSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaSriComprasSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBusquedaSriComprasSriCompras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelrucBusquedaSriComprasSriCompras = new JLabelMe();
		jLabelrucBusquedaSriComprasSriCompras.setText("Ruc :");
		jLabelrucBusquedaSriComprasSriCompras.setToolTipText("Ruc");
		jLabelrucBusquedaSriComprasSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaSriComprasSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaSriComprasSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaSriComprasSriCompras,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaSriComprasSriCompras= new JTextFieldMe();
		jTextFieldrucBusquedaSriComprasSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaSriComprasSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaSriComprasSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaSriComprasSriCompras,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSriCompras=new JTabbedPane();


		this.jTabbedPaneBusquedasSriCompras.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSriCompras.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSriCompras.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSriCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSriCompras,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSriCompras = new SriComprasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sri Compras DATOS");
			this.jInternalFrameDetalleFormSriCompras = new SriComprasDetalleFormJInternalFrame(jDesktopPane,this.sricomprasSessionBean.getConGuardarRelaciones(),this.sricomprasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSriCompras = null;//new SriComprasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriCompras= new GridBagLayout();
		
		
		this.jTableDatosSriCompras = new JTableMe();      
		
		String sToolTipSriCompras="";
		sToolTipSriCompras=SriComprasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriCompras+="(Sris.SriCompras)";
		}
		
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			sToolTipSriCompras+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSriCompras.setToolTipText(sToolTipSriCompras);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSriCompras);
		this.jTableDatosSriCompras.setAutoCreateRowSorter(true);
		this.jTableDatosSriCompras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSriCompras.setRowSelectionAllowed(true);
		this.jTableDatosSriCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSriCompras,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSriCompras = new JButtonMe();
		this.jButtonDuplicarSriCompras = new JButtonMe();
		this.jButtonCopiarSriCompras = new JButtonMe();
		this.jButtonVerFormSriCompras = new JButtonMe();
		this.jButtonNuevoRelacionesSriCompras = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSriCompras = new JButtonMe();
		this.jButtonCerrarSriCompras = new JButtonMe();
		
		this.jScrollPanelDatosSriCompras = new JScrollPane();   
        this.jScrollPanelDatosGeneralSriCompras = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Compras";
		
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Comprases" + this.sPath));
		} else {
			this.jScrollPanelDatosSriCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriCompras.setToolTipText("Acciones");
        this.jPanelAccionesSriCompras.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSriCompras=new ReporteDinamicoJInternalFrame(SriComprasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSriCompras();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSriCompras=new ImportacionJInternalFrame(SriComprasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSriCompras();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySriCompras = new JButtonMe();
		
		this.jButtonAbrirOrderBySriCompras.setText("Orden");
		this.jButtonAbrirOrderBySriCompras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriCompras,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriCompras,false,this);
			
			//this.cargarOrderBySriCompras(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriCompras,true,this);
			
			//this.cargarOrderBySriCompras(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSriCompras.setMinimumSize(new Dimension(400,50));//2830
		this.jTableDatosSriCompras.setMaximumSize(new Dimension(400,50));//2830
		this.jTableDatosSriCompras.setPreferredSize(new Dimension(400,50));//2830
		
		this.jScrollPanelDatosSriCompras.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriCompras.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriCompras.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSriCompras.setText("Nuevo");
		this.jButtonDuplicarSriCompras.setText("Duplicar");
		this.jButtonCopiarSriCompras.setText("Copiar");
		this.jButtonVerFormSriCompras.setText("Ver");
		this.jButtonNuevoRelacionesSriCompras.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSriCompras.setText("Guardar");
		this.jButtonCerrarSriCompras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriCompras,"nuevo_button","Nuevo",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSriCompras,"duplicar_button","Duplicar",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSriCompras,"copiar_button","Copiar",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSriCompras,"ver_form","Ver",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSriCompras,"nuevorelaciones_button","Nuevo Rel",this.sricomprasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriCompras,"guardarcambiostabla_button","Guardar",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriCompras,"cerrar_button","Salir",this.sricomprasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSriCompras.setToolTipText("Nuevo"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSriCompras.setToolTipText("Duplicar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSriCompras.setToolTipText("Copiar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSriCompras.setToolTipText("Ver"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSriCompras.setToolTipText("Nuevo Rel"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSriCompras.setToolTipText("Guardar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriCompras.setToolTipText("Salir"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriCompras";
		inputMap = this.jButtonNuevoSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriCompras"));
		
		//DUPLICAR
		sMapKey = "DuplicarSriCompras";
		inputMap = this.jButtonDuplicarSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSriCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSriCompras"));
		
		//COPIAR
		sMapKey = "CopiarSriCompras";
		inputMap = this.jButtonCopiarSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSriCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSriCompras"));
		
		//VEr FORM
		sMapKey = "VerFormSriCompras";
		inputMap = this.jButtonVerFormSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSriCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSriCompras"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSriCompras";
		inputMap = this.jButtonNuevoRelacionesSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSriCompras"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSriCompras";
		inputMap = this.jButtonModificarSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSriCompras"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSriCompras";
		inputMap = this.jButtonCerrarSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriCompras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriCompras";
		inputMap = this.jButtonGuardarCambiosTablaSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriCompras"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SriCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SriCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SriCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SriCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SriCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSriCompras.setName("jPanelParametrosReportesSriCompras"); 
		
		this.jPanelParametrosReportesAccionesSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSriCompras.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSriCompras.setName("jPanelParametrosReportesAccionesSriCompras"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSriCompras = new JButtonMe();
		this.jButtonRecargarInformacionSriCompras.setText("Buscar");
		this.jButtonRecargarInformacionSriCompras.setToolTipText("Buscar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSriCompras,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionSriCompras.setVisible(false);
		
		
		this.jButtonProcesarInformacionSriCompras = new JButtonMe();
		this.jButtonProcesarInformacionSriCompras.setText("Procesar");
		this.jButtonProcesarInformacionSriCompras.setToolTipText("Procesar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSriCompras.setVisible(false);
			
		this.jButtonProcesarInformacionSriCompras.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriCompras.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriCompras.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriCompras.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSriCompras.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriCompras.setText("TIPO");       
		this.jComboBoxTiposReportesSriCompras.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriCompras.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSriCompras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSriCompras.setText("Paginacion");
		this.jComboBoxTiposPaginacionSriCompras.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSriCompras.setText("Accion");
		this.jComboBoxTiposRelacionesSriCompras.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriCompras.setText("Accion");
		this.jComboBoxTiposAccionesSriCompras.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSriCompras.setText("Accion");
		this.jComboBoxTiposSeleccionarSriCompras.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSriCompras=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSriCompras.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriCompras.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriCompras.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSriCompras = new JLabelMe();
		
		this.jLabelAccionesSriCompras.setText("Acciones");		
		this.jLabelAccionesSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSriCompras = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSriCompras.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSriCompras.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSriCompras = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSriCompras.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSriCompras.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSriCompras = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSriCompras.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSriCompras.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSriCompras = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSriCompras.setText("Graf.");
		this.jCheckBoxConGraficoReporteSriCompras.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSriCompras = new JButtonMe();
		//this.jButtonAnterioresSriCompras.setText("<<");
        this.jButtonAnterioresSriCompras.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSriCompras,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSriCompras = new JButtonMe();
		//this.jButtonSiguientesSriCompras.setText(">>");
        this.jButtonSiguientesSriCompras.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSriCompras,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSriCompras = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSriCompras.setText("Nue");
        this.jButtonNuevoGuardarCambiosSriCompras.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSriCompras,"nuevoguardarcambios_button","Nue",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSriCompras";
		inputMap = this.jButtonNuevoGuardarCambiosSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSriCompras"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSriCompras";
		inputMap = this.jButtonRecargarInformacionSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSriCompras"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSriCompras";
		inputMap = this.jButtonSiguientesSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSriCompras"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSriCompras";
		inputMap = this.jButtonAnterioresSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSriCompras"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSriCompras();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSriCompras.setMinimumSize(new Dimension(this.getWidth(),SriComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriComprasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriCompras.setMaximumSize(new Dimension(this.getWidth(),SriComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriComprasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriCompras.setPreferredSize(new Dimension(this.getWidth(),SriComprasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriComprasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSriCompras = new GridBagLayout();

			this.jPanelPaginacionSriCompras.setLayout(gridaBagLayoutPaginacionSriCompras);						
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = 0;
			this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSriCompras.add(this.jButtonAnterioresSriCompras, this.gridBagConstraintsSriCompras);
					
						
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriCompras.gridy = 0;
			
			this.jPanelPaginacionSriCompras.add(this.jButtonNuevoGuardarCambiosSriCompras, this.gridBagConstraintsSriCompras);
						
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriCompras.gridy = 0;
			this.jPanelPaginacionSriCompras.add(this.jButtonSiguientesSriCompras, this.gridBagConstraintsSriCompras);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = 1;
			this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriCompras.add(this.jButtonNuevoSriCompras, this.gridBagConstraintsSriCompras);
						
			
			
			if(!this.sricomprasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSriCompras = new GridBagConstraints();
				this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSriCompras.gridy = 1;
				this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSriCompras.add(this.jButtonGuardarCambiosTablaSriCompras, this.gridBagConstraintsSriCompras);
			}
			
			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = 1;
			this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriCompras.add(this.jButtonDuplicarSriCompras, this.gridBagConstraintsSriCompras);
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = 1;
			this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriCompras.add(this.jButtonCopiarSriCompras, this.gridBagConstraintsSriCompras);
		
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = 1;
			this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriCompras.add(this.jButtonVerFormSriCompras, this.gridBagConstraintsSriCompras);
		
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = 1;
			this.gridBagConstraintsSriCompras.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSriCompras.add(this.jButtonCerrarSriCompras, this.gridBagConstraintsSriCompras);
		
		
		
		this.jButtonRecargarInformacionSriCompras.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriCompras.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriCompras.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSriCompras.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriCompras.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriCompras.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSriCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSriCompras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriCompras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriCompras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSriCompras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriCompras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriCompras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSriCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSriCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSriCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSriCompras.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriCompras.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriCompras.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSriCompras.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriCompras.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriCompras.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSriCompras.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriCompras.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriCompras.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSriCompras.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriCompras.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriCompras.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSriCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSriCompras = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SriCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SriCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SriCompras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SriCompras = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSriCompras.setLayout(gridaBagParametrosReportesSriCompras);
			this.jPanelParametrosReportesAccionesSriCompras.setLayout(gridaBagParametrosReportesAccionesSriCompras);
			
			
			this.jPanelParametrosAuxiliar1SriCompras.setLayout(gridaBagParametrosAuxiliar1SriCompras);
			this.jPanelParametrosAuxiliar2SriCompras.setLayout(gridaBagParametrosAuxiliar2SriCompras);
			this.jPanelParametrosAuxiliar3SriCompras.setLayout(gridaBagParametrosAuxiliar3SriCompras);
			this.jPanelParametrosAuxiliar4SriCompras.setLayout(gridaBagParametrosAuxiliar4SriCompras);
			//this.jPanelParametrosAuxiliar5SriCompras.setLayout(gridaBagParametrosAuxiliar2SriCompras);			
			
			
			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriCompras.add(this.jButtonRecargarInformacionSriCompras, this.gridBagConstraintsSriCompras);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriCompras.add(this.jComboBoxTiposPaginacionSriCompras, this.gridBagConstraintsSriCompras);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriCompras.add(this.jCheckBoxConAltoMaximoTablaSriCompras, this.gridBagConstraintsSriCompras);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriCompras.add(this.jComboBoxTiposArchivosReportesSriCompras, this.gridBagConstraintsSriCompras);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriCompras.add(this.jPanelParametrosAuxiliar1SriCompras, this.gridBagConstraintsSriCompras);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SriCompras.add(this.jComboBoxTiposReportesSriCompras, this.gridBagConstraintsSriCompras);																		
			
			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SriCompras.add(this.jComboBoxTiposGraficosReportesSriCompras, this.gridBagConstraintsSriCompras);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriCompras.add(this.jPanelParametrosAuxiliar4SriCompras, this.gridBagConstraintsSriCompras);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriCompras.add(this.jComboBoxTiposReportesSriCompras, this.gridBagConstraintsSriCompras);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriCompras.add(this.jCheckBoxGenerarReporteSriCompras, this.gridBagConstraintsSriCompras);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriCompras.add(this.jPanelParametrosAuxiliar2SriCompras, this.gridBagConstraintsSriCompras);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriCompras.add(this.jLabelAccionesSriCompras, this.gridBagConstraintsSriCompras);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSriCompras = new GridBagConstraints();
				this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSriCompras.add(this.jButtonAbrirOrderBySriCompras, this.gridBagConstraintsSriCompras);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriCompras.add(this.jComboBoxTiposSeleccionarSriCompras, this.gridBagConstraintsSriCompras);			
			
			
			/*
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriCompras.add(this.jCheckBoxSeleccionarTodosSriCompras, this.gridBagConstraintsSriCompras);
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriCompras.add(this.jCheckBoxConGraficoReporteSriCompras, this.gridBagConstraintsSriCompras);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriCompras.add(this.jCheckBoxSeleccionarTodosSriCompras, this.gridBagConstraintsSriCompras);															
				
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriCompras.add(this.jCheckBoxSeleccionadosSriCompras, this.gridBagConstraintsSriCompras);															
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriCompras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriCompras.add(this.jCheckBoxConGraficoReporteSriCompras, this.gridBagConstraintsSriCompras);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriCompras.add(this.jPanelParametrosAuxiliar3SriCompras, this.gridBagConstraintsSriCompras);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriCompras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriCompras.add(this.jComboBoxTiposAccionesSriCompras, this.gridBagConstraintsSriCompras);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSriCompras = new GridBagLayout();

			this.jScrollPanelDatosSriCompras.setLayout(gridaBagLayoutDatosSriCompras);
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = 0;
			this.gridBagConstraintsSriCompras.gridx = 0;
			
			this.jScrollPanelDatosSriCompras.add(this.jTableDatosSriCompras, this.gridBagConstraintsSriCompras);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSriCompras.setViewportView(this.jTableDatosSriCompras);
		this.jTableDatosSriCompras.setFillsViewportHeight(true);
		this.jTableDatosSriCompras.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSriCompras= new GridBagLayout();
		this.jPanelAccionesSriCompras.setLayout(gridaBagLayoutAccionesSriCompras);
		
		
		/*	
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 0;
			
		this.jPanelAccionesSriCompras.add(this.jButtonNuevoSriCompras, this.gridBagConstraintsSriCompras);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaSriComprasSriCompras= new GridBagLayout();
		gridaBagLayoutBusquedaSriComprasSriCompras.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaSriComprasSriCompras.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaSriComprasSriCompras.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaSriComprasSriCompras.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaSriComprasSriCompras.setLayout(gridaBagLayoutBusquedaSriComprasSriCompras);

		gridBagConstraintsSriCompras = new GridBagConstraints();
		gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriCompras.gridy = 0;
		gridBagConstraintsSriCompras.gridx = 0;
		jPanelBusquedaSriComprasSriCompras.add(jLabelid_periodo_declaraBusquedaSriComprasSriCompras, gridBagConstraintsSriCompras);

		gridBagConstraintsSriCompras = new GridBagConstraints();
		gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriCompras.gridy = 0;
		gridBagConstraintsSriCompras.gridx = 1;
		jPanelBusquedaSriComprasSriCompras.add(jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras, gridBagConstraintsSriCompras);


		gridBagConstraintsSriCompras = new GridBagConstraints();
		gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriCompras.gridy = 1;
		gridBagConstraintsSriCompras.gridx = 0;
		jPanelBusquedaSriComprasSriCompras.add(jLabelid_clienteBusquedaSriComprasSriCompras, gridBagConstraintsSriCompras);

		gridBagConstraintsSriCompras = new GridBagConstraints();
		gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriCompras.gridy = 1;
		gridBagConstraintsSriCompras.gridx = 1;
		jPanelBusquedaSriComprasSriCompras.add(jComboBoxid_clienteBusquedaSriComprasSriCompras, gridBagConstraintsSriCompras);


		gridBagConstraintsSriCompras = new GridBagConstraints();
		gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriCompras.gridy = 2;
		gridBagConstraintsSriCompras.gridx = 0;
		jPanelBusquedaSriComprasSriCompras.add(jLabelrucBusquedaSriComprasSriCompras, gridBagConstraintsSriCompras);

		gridBagConstraintsSriCompras = new GridBagConstraints();
		gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriCompras.gridy = 2;
		gridBagConstraintsSriCompras.gridx = 1;
		jPanelBusquedaSriComprasSriCompras.add(jTextFieldrucBusquedaSriComprasSriCompras, gridBagConstraintsSriCompras);

		gridBagConstraintsSriCompras = new GridBagConstraints();
		gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriCompras.gridy = 3;
		gridBagConstraintsSriCompras.gridx =1;
		jPanelBusquedaSriComprasSriCompras.add(jButtonBusquedaSriComprasSriCompras, gridBagConstraintsSriCompras);

		jTabbedPaneBusquedasSriCompras.addTab("1.-Por Periodo Declara Por Cliente Por Ruc ", jPanelBusquedaSriComprasSriCompras);
		jTabbedPaneBusquedasSriCompras.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriCompras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriCompras);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriCompras = new GridBagConstraints();						
			this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriCompras.gridx = 0;		
			//this.gridBagConstraintsSriCompras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriCompras.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSriCompras, this.gridBagConstraintsSriCompras);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSriCompras.gridx = 0;		
		//this.gridBagConstraintsSriCompras.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSriCompras.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSriCompras);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriCompras.gridx = 0;		
			this.gridBagConstraintsSriCompras.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSriCompras.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSriCompras, this.gridBagConstraintsSriCompras);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSriCompras, this.gridBagConstraintsSriCompras);								
		
		
		/*
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSriCompras, this.gridBagConstraintsSriCompras);
		*/		
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriCompras.gridx =0;
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriCompras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriCompras, this.gridBagConstraintsSriCompras);
				
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSriCompras, this.gridBagConstraintsSriCompras);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SriComprasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSriCompras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriCompras = new GridBagLayout();
			this.jPanelBusquedasParametrosSriCompras.setLayout(gridaBagLayoutBusquedasParametrosSriCompras);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSriCompras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriCompras, this.gridBagConstraintsSriCompras);
			
			
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriCompras, this.gridBagConstraintsSriCompras);
		
			
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriCompras, this.gridBagConstraintsSriCompras);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSriCompras;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSriCompras() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSriCompras = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSriCompras.setName("jPanelReporteDinamicoSriCompras"); 
		
		this.jPanelReporteDinamicoSriCompras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriCompras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriCompras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSriCompras.setLayout(gridaBagLayoutReporteDinamicoSriCompras);
		
		
		this.jInternalFrameReporteDinamicoSriCompras= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSriCompras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriCompras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSriCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSriCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSriCompras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSriCompras.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSriCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSriCompras.setResizable(true);
	    this.jInternalFrameReporteDinamicoSriCompras.setClosable(true);
	    this.jInternalFrameReporteDinamicoSriCompras.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSriCompras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriCompras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriCompras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Comprases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSriCompras = new JLabelMe();

		this.jLabelColumnasSelectReporteSriCompras.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriCompras.add(this.jLabelColumnasSelectReporteSriCompras, this.gridBagConstraintsSriCompras);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSriCompras = new JList<Reporte>();
		this.jListColumnasSelectReporteSriCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSriCompras.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSriCompras.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriCompras.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriCompras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSriCompras=new JScrollPane(this.jListColumnasSelectReporteSriCompras);
			
			this.jScrollColumnasSelectReporteSriCompras.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriCompras.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriCompras.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSriCompras.add(this.jListColumnasSelectReporteSriCompras, this.gridBagConstraintsSriCompras);
		this.jPanelReporteDinamicoSriCompras.add(this.jScrollColumnasSelectReporteSriCompras, this.gridBagConstraintsSriCompras);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSriCompras = new JLabelMe();

		this.jLabelRelacionesSelectReporteSriCompras.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSriCompras = new JList<Reporte>();
		this.jListRelacionesSelectReporteSriCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSriCompras.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSriCompras.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriCompras.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriCompras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSriCompras=new JScrollPane(this.jListRelacionesSelectReporteSriCompras);
			
			this.jScrollRelacionesSelectReporteSriCompras.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriCompras.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriCompras.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSriCompras = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSriCompras = new JComboBoxMe();
		this.jListColumnasValoresGraficoSriCompras = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSriCompras = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSriCompras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSriCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSriCompras = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSriCompras.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSriCompras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriCompras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriCompras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSriCompras = new JLabelMe();

		this.jLabelConGraficoDinamicoSriCompras.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriCompras.add(this.jLabelConGraficoDinamicoSriCompras, this.gridBagConstraintsSriCompras);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSriCompras = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSriCompras.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSriCompras.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSriCompras.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriCompras.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriCompras.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriCompras.add(this.jCheckBoxConGraficoDinamicoSriCompras, this.gridBagConstraintsSriCompras);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSriCompras = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSriCompras.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriCompras.add(this.jLabelColumnaCategoriaGraficoSriCompras, this.gridBagConstraintsSriCompras);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSriCompras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriCompras.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSriCompras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSriCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriCompras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSriCompras.add(this.jComboBoxColumnaCategoriaGraficoSriCompras, this.gridBagConstraintsSriCompras);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSriCompras = new JLabelMe();

		this.jLabelColumnaCategoriaValorSriCompras.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriCompras.add(this.jLabelColumnaCategoriaValorSriCompras, this.gridBagConstraintsSriCompras);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSriCompras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSriCompras.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSriCompras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSriCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriCompras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSriCompras.add(this.jComboBoxColumnaCategoriaValorSriCompras, this.gridBagConstraintsSriCompras);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSriCompras = new JLabelMe();

		this.jLabelColumnasValoresGraficoSriCompras.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriCompras.add(this.jLabelColumnasValoresGraficoSriCompras, this.gridBagConstraintsSriCompras);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSriCompras = new JList<Reporte>();
		this.jListColumnasValoresGraficoSriCompras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSriCompras.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSriCompras.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriCompras.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriCompras.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSriCompras=new JScrollPane(this.jListColumnasValoresGraficoSriCompras);
			
			this.jScrollColumnasValoresGraficoSriCompras.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriCompras.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriCompras.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSriCompras.add(this.jListColumnasSelectReporteSriCompras, this.gridBagConstraintsSriCompras);
		this.jPanelReporteDinamicoSriCompras.add(this.jScrollColumnasValoresGraficoSriCompras, this.gridBagConstraintsSriCompras);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSriCompras = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSriCompras.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriCompras.add(this.jLabelTiposGraficosReportesDinamicoSriCompras, this.gridBagConstraintsSriCompras);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSriCompras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriCompras.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSriCompras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSriCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriCompras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriCompras.add(this.jComboBoxTiposGraficosReportesDinamicoSriCompras, this.gridBagConstraintsSriCompras);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSriCompras = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSriCompras.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriCompras.add(this.jLabelGenerarExcelReporteDinamicoSriCompras, this.gridBagConstraintsSriCompras);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSriCompras = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSriCompras.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSriCompras,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSriCompras.setToolTipText("Generar EXCEL"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSriCompras.add(this.jButtonGenerarExcelReporteDinamicoSriCompras, this.gridBagConstraintsSriCompras);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriCompras.add(this.jComboBoxTiposReportesDinamicoSriCompras, this.gridBagConstraintsSriCompras);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSriCompras = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSriCompras.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriCompras.add(this.jLabelTiposArchivoReporteDinamicoSriCompras, this.gridBagConstraintsSriCompras);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriCompras.add(this.jComboBoxTiposArchivosReportesDinamicoSriCompras, this.gridBagConstraintsSriCompras);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSriCompras = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSriCompras.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSriCompras,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSriCompras.setToolTipText("Generar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriCompras.add(this.jButtonGenerarReporteDinamicoSriCompras, this.gridBagConstraintsSriCompras);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSriCompras = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSriCompras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSriCompras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSriCompras.setToolTipText("Cancelar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriCompras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriCompras.add(this.jButtonCerrarReporteDinamicoSriCompras, this.gridBagConstraintsSriCompras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSriCompras = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSriCompras= new JScrollPane(jPanelReporteDinamicoSriCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSriCompras.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriCompras.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriCompras.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Comprases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSriCompras.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSriCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSriCompras.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSriCompras);
		this.jInternalFrameReporteDinamicoSriCompras.getContentPane().add(this.jScrollPanelReporteDinamicoSriCompras, this.gridBagConstraintsSriCompras);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSriCompras() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSriCompras = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSriCompras.setName("jPanelImportacionSriCompras"); 
		
		this.jPanelImportacionSriCompras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriCompras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriCompras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSriCompras.setLayout(gridaBagLayoutImportacionSriCompras);
		
		
		this.jInternalFrameImportacionSriCompras= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSriCompras= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSriCompras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriCompras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSriCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriCompras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSriCompras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriCompras.setResizable(true);
	    this.jInternalFrameImportacionSriCompras.setClosable(true);
	    this.jInternalFrameImportacionSriCompras.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSriCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriCompras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriCompras.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSriCompras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriCompras.setResizable(true);
	    this.jInternalFrameImportacionSriCompras.setClosable(true);
	    this.jInternalFrameImportacionSriCompras.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSriCompras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriCompras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriCompras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Comprases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSriCompras = new JLabelMe();

		this.jLabelArchivoImportacionSriCompras.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriCompras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriCompras.add(this.jLabelArchivoImportacionSriCompras, this.gridBagConstraintsSriCompras);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSriCompras = new JFileChooser();		
		this.jFileChooserImportacionSriCompras.setToolTipText("ESCOGER ARCHIVO"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSriCompras = new JButtonMe();
		this.jButtonAbrirImportacionSriCompras.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSriCompras,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSriCompras.setToolTipText("Generar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsSriCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriCompras.add(this.jButtonAbrirImportacionSriCompras, this.gridBagConstraintsSriCompras);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSriCompras = new JLabelMe();

		this.jLabelPathArchivoImportacionSriCompras.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriCompras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriCompras.add(this.jLabelPathArchivoImportacionSriCompras, this.gridBagConstraintsSriCompras);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSriCompras=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSriCompras.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriCompras.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriCompras.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsSriCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriCompras.add(this.jTextFieldPathArchivoImportacionSriCompras, this.gridBagConstraintsSriCompras);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSriCompras = new JButtonMe();
		this.jButtonGenerarImportacionSriCompras.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSriCompras,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSriCompras.setToolTipText("Generar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsSriCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriCompras.add(this.jButtonGenerarImportacionSriCompras, this.gridBagConstraintsSriCompras);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSriCompras = new JButtonMe();
		this.jButtonCerrarImportacionSriCompras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSriCompras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSriCompras.setToolTipText("Cancelar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = iPosYImportacion;
		this.gridBagConstraintsSriCompras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriCompras.add(this.jButtonCerrarImportacionSriCompras, this.gridBagConstraintsSriCompras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSriCompras = new GridBagLayout();
		
		this.jScrollPanelImportacionSriCompras= new JScrollPane(jPanelImportacionSriCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy =iPosYImportacion;
		this.gridBagConstraintsSriCompras.gridx =iPosXImportacion;
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSriCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSriCompras.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSriCompras);
		this.jInternalFrameImportacionSriCompras.getContentPane().add(this.jScrollPanelImportacionSriCompras, this.gridBagConstraintsSriCompras);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySriCompras(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySriCompras = new JButtonMe();
			this.jButtonAbrirOrderBySriCompras.setText("Orden");
			this.jButtonAbrirOrderBySriCompras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriCompras,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySriCompras";
			inputMap = this.jButtonAbrirOrderBySriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySriCompras"));
		
		
			GridBagLayout gridaBagLayoutOrderBySriCompras = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySriCompras.setName("jPanelOrderBySriCompras"); 
			
			this.jPanelOrderBySriCompras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriCompras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriCompras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySriCompras.setLayout(gridaBagLayoutOrderBySriCompras);
			
			
			this.jTableDatosSriComprasOrderBy = new JTableMe();        
			this.jTableDatosSriComprasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSriComprasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSriComprasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSriComprasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSriComprasOrderBy.setViewportView(this.jTableDatosSriComprasOrderBy);
			this.jTableDatosSriComprasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSriComprasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySriCompras= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySriCompras= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySriCompras = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSriCompras= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySriCompras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySriCompras.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySriCompras.setTitle("Orden");
			this.jInternalFrameOrderBySriCompras.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySriCompras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySriCompras.setResizable(true);
			this.jInternalFrameOrderBySriCompras.setClosable(true);
			this.jInternalFrameOrderBySriCompras.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySriCompras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriCompras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriCompras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Comprases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSriCompras.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSriCompras.ipady =150;
				
			this.jPanelOrderBySriCompras.add(jScrollPanelDatosSriComprasOrderBy, this.gridBagConstraintsSriCompras);//this.jTableDatosSriComprasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySriCompras = new JButtonMe();
			this.jButtonCerrarOrderBySriCompras.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySriCompras,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySriCompras.setToolTipText("Cancelar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSriCompras.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySriCompras.add(this.jButtonCerrarOrderBySriCompras, this.gridBagConstraintsSriCompras);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSriCompras = new GridBagLayout();
			
			this.jScrollPanelOrderBySriCompras= new JScrollPane(jPanelOrderBySriCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.gridy =iPosYOrderBy;
			this.gridBagConstraintsSriCompras.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySriCompras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySriCompras.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSriCompras);
			
			this.jInternalFrameOrderBySriCompras.getContentPane().add(this.jScrollPanelOrderBySriCompras, this.gridBagConstraintsSriCompras);			
		
		} else {
			this.jButtonAbrirOrderBySriCompras = new JButtonMe();
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
		int iWidthTableCalculado=0;//5930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.sricomprasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSriCompras.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSriCompras.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSriCompras.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosSriCompras.getRowHeight();//SriComprasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SriComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriCompras.isSelected()) {
					iHeightTable=SriComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SriComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriCompras.isSelected()) {
					iHeightTable=SriComprasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriComprasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSriCompras.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriCompras.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriCompras.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSriCompras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriCompras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriCompras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySriCompras!=null && this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy()!=null) {
			//if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySriCompras.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySriCompras.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySriCompras.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSriCompras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriCompras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriCompras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=sricomprasLogic.getSriComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sricomprass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SriCompras> TraerSriComprasBeans(List<SriCompras> sricomprass,ArrayList<Classe> classes)throws Exception {
		try {
			for(SriCompras sricompras:sricomprass) {
					
				if(!(SriComprasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SriComprasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sricompras.setsDetalleGeneralEntityReporte(SriComprasConstantesFunciones.getSriComprasDescripcion(sricompras));
										
						
					
						
					
				} else  {
							
					//sricompras.setsDetalleGeneralEntityReporte(sricompras.getsDetalleGeneralEntityReporte());
										
				}
				
				//sricomprasbeans.add(sricomprasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sricomprass;
    }
	//PARA REPORTES FIN
}
