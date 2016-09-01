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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.FacturaDiarioConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class FacturaDiarioJInternalFrame extends FacturaDiarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturaDiario;
	
	protected JMenuBar jmenuBarFacturaDiario;
	
	protected JMenu jmenuFacturaDiario;
	protected JMenu jmenuDatosFacturaDiario;
	protected JMenu jmenuArchivoFacturaDiario;
	protected JMenu jmenuAccionesFacturaDiario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaDiario;	
	protected GridBagConstraints gridBagConstraintsFacturaDiario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturaDiarioDetalleFormJInternalFrame jInternalFrameDetalleFormFacturaDiario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturaDiario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturaDiario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";
	
	public FacturaDiarioSessionBean facturadiarioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturaDiario> facturadiarios;		
	public List<FacturaDiario> facturadiariosEliminados;	
	public List<FacturaDiario> facturadiariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturaDiario;		
	protected JButton jButtonAbrirOrderByFacturaDiario;
	
	
	//protected JPanel jPanelOrderByFacturaDiario;
	//public JScrollPane jScrollPanelOrderByFacturaDiario;	
	//protected JButton jButtonCerrarOrderByFacturaDiario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturaDiarioLogic facturadiarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturaDiario;
	public JScrollPane jScrollPanelDatosEdicionFacturaDiario;
	public JScrollPane jScrollPanelDatosGeneralFacturaDiario;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturaDiarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturaDiario;
	//public JScrollPane jScrollPanelImportacionFacturaDiario;
	
	
	
	protected JPanel jPanelAccionesFacturaDiario;
	
    protected JPanel jPanelPaginacionFacturaDiario;
    protected JPanel jPanelParametrosReportesFacturaDiario;
	protected JPanel jPanelParametrosReportesAccionesFacturaDiario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturaDiario;
	protected JPanel jPanelParametrosAuxiliar2FacturaDiario;
	protected JPanel jPanelParametrosAuxiliar3FacturaDiario;
	protected JPanel jPanelParametrosAuxiliar4FacturaDiario;
	//protected JPanel jPanelParametrosAuxiliar5FacturaDiario;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturaDiario;
	//protected JPanel jPanelImportacionFacturaDiario;
	
	
	public JTable jTableDatosFacturaDiario;
	
	
	
	//public JTable jTableDatosFacturaDiarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturaDiario;
	protected JButton jButtonDuplicarFacturaDiario;
	protected JButton jButtonCopiarFacturaDiario;
	protected JButton jButtonVerFormFacturaDiario;
	protected JButton jButtonNuevoRelacionesFacturaDiario;
	protected JButton jButtonModificarFacturaDiario;
	
    protected JButton jButtonGuardarCambiosTablaFacturaDiario;
	protected JButton jButtonCerrarFacturaDiario;
	
	
	protected JButton jButtonRecargarInformacionFacturaDiario;
	protected JButton jButtonProcesarInformacionFacturaDiario;
	
	
	protected JButton jButtonAnterioresFacturaDiario;
	protected JButton jButtonSiguientesFacturaDiario;
	protected JButton jButtonNuevoGuardarCambiosFacturaDiario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturaDiario;
	//protected JButton jButtonCerrarReporteDinamicoFacturaDiario;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturaDiario;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturaDiario;
	//protected JButton jButtonGenerarImportacionFacturaDiario;
	//protected JButton jButtonCerrarImportacionFacturaDiario;
	//protected JFileChooser jFileChooserImportacionFacturaDiario;
	//protected File fileImportacionFacturaDiario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaDiario;
	protected JButton jButtonDuplicarToolBarFacturaDiario;
	protected JButton jButtonNuevoRelacionesToolBarFacturaDiario;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturaDiario;
	protected JButton jButtonCopiarToolBarFacturaDiario;
	protected JButton jButtonVerFormToolBarFacturaDiario;
	public JButton jButtonGuardarCambiosTablaToolBarFacturaDiario;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaDiario;
	protected JButton jButtonCerrarToolBarFacturaDiario;
	
	protected JButton jButtonRecargarInformacionToolBarFacturaDiario;
	protected JButton jButtonProcesarInformacionToolBarFacturaDiario;
	protected JButton jButtonAnterioresToolBarFacturaDiario;
	protected JButton jButtonSiguientesToolBarFacturaDiario;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturaDiario;
	protected JButton jButtonAbrirOrderByToolBarFacturaDiario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaDiario;
	protected JMenuItem jMenuItemDuplicarFacturaDiario;
	protected JMenuItem jMenuItemNuevoRelacionesFacturaDiario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturaDiario;
	protected JMenuItem jMenuItemCopiarFacturaDiario;
	protected JMenuItem jMenuItemVerFormFacturaDiario;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaDiario;
	protected JMenuItem jMenuItemCerrarFacturaDiario;
	protected JMenuItem jMenuItemDetalleCerrarFacturaDiario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturaDiario;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaDiario;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturaDiario;
	protected JMenuItem jMenuItemProcesarInformacionFacturaDiario;
	protected JMenuItem jMenuItemAnterioresFacturaDiario;
	protected JMenuItem jMenuItemSiguientesFacturaDiario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaDiario;
	protected JMenuItem jMenuItemAbrirOrderByFacturaDiario;
	protected JMenuItem jMenuItemMostrarOcultarFacturaDiario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaDiario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturaDiario;
	protected JCheckBox jCheckBoxSeleccionadosFacturaDiario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturaDiario;
	protected JCheckBox jCheckBoxConGraficoReporteFacturaDiario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturaDiario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturaDiario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaDiario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturaDiario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturaDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturaDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaDiario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturaDiario;
	protected JTextField jTextFieldValorCampoGeneralFacturaDiario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturaDiario;
	//public JList<Reporte> jListColumnasSelectReporteFacturaDiario;
	//public JScrollPane jScrollColumnasSelectReporteFacturaDiario;
	
	//public JLabel jLabelRelacionesSelectReporteFacturaDiario;
	//public JList<Reporte> jListRelacionesSelectReporteFacturaDiario;
	//public JScrollPane jScrollRelacionesSelectReporteFacturaDiario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturaDiario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturaDiario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturaDiario;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturaDiario;
	
		
	//public JLabel jLabelArchivoImportacionFacturaDiario;	
	//public JLabel jLabelPathArchivoImportacionFacturaDiario;
	//protected JTextField jTextFieldPathArchivoImportacionFacturaDiario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturaDiario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturaDiario;
	
	//public JLabel jLabelColumnaCategoriaValorFacturaDiario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturaDiario;
	
	//public JLabel jLabelColumnasValoresGraficoFacturaDiario;
	//public JList<Reporte> jListColumnasValoresGraficoFacturaDiario;
	//public JScrollPane jScrollColumnasValoresGraficoFacturaDiario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturaDiario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturaDiario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturaDiario;
	public JPanel jPanelFK_IdClienteFacturaDiario;
	public JButton jButtonFK_IdClienteFacturaDiario;
	public JPanel jPanelFK_IdPeriodoDeclaraFacturaDiario;
	public JButton jButtonFK_IdPeriodoDeclaraFacturaDiario;
	public JPanel jPanelFK_IdTipoIvaFacturaDiario;
	public JButton jButtonFK_IdTipoIvaFacturaDiario;
	
	public JPanel jPanelid_clienteFK_IdClienteFacturaDiario;
	public JLabel jLabelid_clienteFK_IdClienteFacturaDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteFacturaDiario;
	public JButton jButtonid_clienteFK_IdClienteFacturaDiario= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaDiarioUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaDiarioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteFacturaDiario;
	
	public JPanel jPanelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario;
	public JLabel jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario;
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario= new JButtonMe();
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiarioUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_ivaFK_IdTipoIvaFacturaDiario;
	public JLabel jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario;
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaFacturaDiario= new JButtonMe();
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaFacturaDiarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaFacturaDiarioBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturaDiarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDiarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDiarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDiarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturaDiario)	{
		this.jButtonRecargarInformacionFacturaDiario = jButtonRecargarInformacionFacturaDiario;
	}
	
	public JButton getjButtonProcesarInformacionFacturaDiario() {
		return this.jButtonProcesarInformacionFacturaDiario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaDiario)	{
		this.jButtonProcesarInformacionFacturaDiario = jButtonProcesarInformacionFacturaDiario;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturaDiario() {
		return this.jButtonRecargarInformacionFacturaDiario;
	}
	
	
	public List<FacturaDiario> getfacturadiarios() {
		return this.facturadiarios;
	}

	public void setfacturadiarios(List<FacturaDiario> facturadiarios) {
		this.facturadiarios = facturadiarios;
	}
	
	public List<FacturaDiario> getfacturadiariosAux() {
		return this.facturadiariosAux;
	}

	public void setfacturadiariosAux(List<FacturaDiario> facturadiariosAux) {
		this.facturadiariosAux = facturadiariosAux;
	}
	
	public List<FacturaDiario> getfacturadiariosEliminados() {
		return this.facturadiariosEliminados;
	}

	public void setFacturaDiariosEliminados(List<FacturaDiario> facturadiariosEliminados) {
		this.facturadiariosEliminados = facturadiariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturaDiario() {
		return jComboBoxTiposSeleccionarFacturaDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturaDiario(
			JComboBox jComboBoxTiposSeleccionarFacturaDiario) {
		this.jComboBoxTiposSeleccionarFacturaDiario = jComboBoxTiposSeleccionarFacturaDiario;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturaDiario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturaDiario() {
		return jTextFieldValorCampoGeneralFacturaDiario;
	}

	public void setjTextFieldValorCampoGeneralFacturaDiario(
			JTextField jTextFieldValorCampoGeneralFacturaDiario) {
		this.jTextFieldValorCampoGeneralFacturaDiario = jTextFieldValorCampoGeneralFacturaDiario;
	}

	public void setBorderResaltarValorCampoGeneralFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturaDiario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturaDiario() {
		return this.jCheckBoxSeleccionarTodosFacturaDiario;
	}

	public void setjCheckBoxSeleccionarTodosFacturaDiario(
			JCheckBox jCheckBoxSeleccionarTodosFacturaDiario) {
		this.jCheckBoxSeleccionarTodosFacturaDiario = jCheckBoxSeleccionarTodosFacturaDiario;
	}

	public void setBorderResaltarSeleccionarTodosFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturaDiario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturaDiario() {
		return this.jCheckBoxSeleccionadosFacturaDiario;
	}

	public void setjCheckBoxSeleccionadosFacturaDiario(
			JCheckBox jCheckBoxSeleccionadosFacturaDiario) {
		this.jCheckBoxSeleccionadosFacturaDiario = jCheckBoxSeleccionadosFacturaDiario;
	}
	
	public void setBorderResaltarSeleccionadosFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturaDiario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturaDiario() {
		return this.jComboBoxTiposArchivosReportesFacturaDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturaDiario(
			JComboBox jComboBoxTiposArchivosReportesFacturaDiario) {
		this.jComboBoxTiposArchivosReportesFacturaDiario = jComboBoxTiposArchivosReportesFacturaDiario;
	}

	public void setBorderResaltarTiposArchivosReportesFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturaDiario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturaDiario() {
		return this.jComboBoxTiposReportesFacturaDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturaDiario(
			JComboBox jComboBoxTiposReportesFacturaDiario) {
		this.jComboBoxTiposReportesFacturaDiario = jComboBoxTiposReportesFacturaDiario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturaDiario() {
	//	return jComboBoxTiposReportesDinamicoFacturaDiario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturaDiario(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturaDiario) {
	//	this.jComboBoxTiposReportesDinamicoFacturaDiario = jComboBoxTiposReportesDinamicoFacturaDiario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturaDiario() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturaDiario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturaDiario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaDiario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturaDiario = jComboBoxTiposArchivosReportesDinamicoFacturaDiario;
	//}
	
	public void setBorderResaltarTiposReportesFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturaDiario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturaDiario() {
		return this.jComboBoxTiposGraficosReportesFacturaDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturaDiario(
			JComboBox jComboBoxTiposGraficosReportesFacturaDiario) {
		this.jComboBoxTiposGraficosReportesFacturaDiario = jComboBoxTiposGraficosReportesFacturaDiario;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturaDiario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturaDiario() {
		return this.jComboBoxTiposPaginacionFacturaDiario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturaDiario(
			JComboBox jComboBoxTiposPaginacionFacturaDiario) {
		this.jComboBoxTiposPaginacionFacturaDiario = jComboBoxTiposPaginacionFacturaDiario;
	}
	
	public void setBorderResaltarTiposPaginacionFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturaDiario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturaDiario() {
		return this.jComboBoxTiposRelacionesFacturaDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaDiario() {
		return this.jComboBoxTiposAccionesFacturaDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaDiario(
			JComboBox jComboBoxTiposRelacionesFacturaDiario) {
		this.jComboBoxTiposRelacionesFacturaDiario = jComboBoxTiposRelacionesFacturaDiario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaDiario(
			JComboBox jComboBoxTiposAccionesFacturaDiario) {
		this.jComboBoxTiposAccionesFacturaDiario = jComboBoxTiposAccionesFacturaDiario;
	}
	
	public void setBorderResaltarTiposRelacionesFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturaDiario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturaDiario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturaDiario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturaDiario() {
	//	return jCheckBoxConGraficoDinamicoFacturaDiario;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturaDiario(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturaDiario) {
	//	this.jCheckBoxConGraficoDinamicoFacturaDiario = jCheckBoxConGraficoDinamicoFacturaDiario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturaDiario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturaDiario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturaDiario .setBorder(borderResaltar);		
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
		this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
		
		this.facturadiarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturadiarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturadiarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaDiarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Diario MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturaDiario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturaDiario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"nuevo","nuevo","Nuevo"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"duplicar","duplicar","Duplicar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"copiar","copiar","Copiar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"ver_form","ver_form","Ver"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"recargar","recargar","Recargar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturaDiario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturaDiario,this.jTtoolBarFacturaDiario,
							"cerrar","cerrar","Salir"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturaDiario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturaDiario;
			
				this.jButtonProcesarInformacionToolBarFacturaDiario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturaDiario;
				
		//protected JButton jButtonModificarToolBarFacturaDiario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturaDiario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturaDiario=new JMenuMe("General");
		this.jmenuArchivoFacturaDiario=new JMenuMe("Archivo");
		this.jmenuAccionesFacturaDiario=new JMenuMe("Acciones");
		this.jmenuDatosFacturaDiario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaDiario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaDiario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaDiario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturaDiario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturaDiario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturaDiario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturaDiario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturaDiario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturaDiario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturaDiario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaDiario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaDiario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturaDiario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturaDiario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturaDiario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturaDiario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturaDiario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturaDiario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturaDiario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturaDiario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturaDiario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaDiario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaDiario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaDiario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturaDiario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturaDiario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturaDiario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturaDiario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturaDiario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturaDiario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturaDiario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturaDiario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturaDiario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturaDiario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturaDiario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturaDiario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturaDiario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturaDiario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturaDiario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaDiario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaDiario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaDiario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturaDiario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturaDiario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturaDiario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaDiario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaDiario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaDiario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturaDiario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturaDiario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturaDiario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturaDiario.add(this.jMenuItemCerrarFacturaDiario);
			
			this.jmenuAccionesFacturaDiario.add(this.jMenuItemNuevoFacturaDiario);
			this.jmenuAccionesFacturaDiario.add(this.jMenuItemNuevoGuardarCambiosFacturaDiario);
			this.jmenuAccionesFacturaDiario.add(this.jMenuItemNuevoRelacionesFacturaDiario);
			this.jmenuAccionesFacturaDiario.add(this.jMenuItemGuardarCambiosTablaFacturaDiario);		
			this.jmenuAccionesFacturaDiario.add(this.jMenuItemDuplicarFacturaDiario);		
			this.jmenuAccionesFacturaDiario.add(this.jMenuItemCopiarFacturaDiario);		
			this.jmenuAccionesFacturaDiario.add(this.jMenuItemVerFormFacturaDiario);		
			
			this.jmenuDatosFacturaDiario.add(this.jMenuItemRecargarInformacionFacturaDiario);				
			this.jmenuDatosFacturaDiario.add(this.jMenuItemAnterioresFacturaDiario);				
			this.jmenuDatosFacturaDiario.add(this.jMenuItemSiguientesFacturaDiario);				
			this.jmenuDatosFacturaDiario.add(this.jMenuItemAbrirOrderByFacturaDiario);				
			this.jmenuDatosFacturaDiario.add(this.jMenuItemMostrarOcultarFacturaDiario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturaDiario.add(this.jMenuItemGuardarCambiosFacturaDiario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturaDiario.add(this.jmenuArchivoFacturaDiario);		
			this.jmenuBarFacturaDiario.add(this.jmenuAccionesFacturaDiario);		
			this.jmenuBarFacturaDiario.add(this.jmenuDatosFacturaDiario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturaDiario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturaDiario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteFacturaDiario.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteFacturaDiario= new JButtonMe();
		this.jButtonFK_IdClienteFacturaDiario.setText("Buscar");
		this.jButtonFK_IdClienteFacturaDiario.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteFacturaDiario,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteFacturaDiario = new JLabelMe();
		jLabelid_clienteFK_IdClienteFacturaDiario.setText("Cliente :");
		jLabelid_clienteFK_IdClienteFacturaDiario.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteFacturaDiario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteFacturaDiario= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteFacturaDiario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario.setFocusable(false);

		this.jPanelFK_IdPeriodoDeclaraFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPeriodoDeclaraFacturaDiario.setToolTipText("Buscar Por Periodo Declara ");
		this.jButtonFK_IdPeriodoDeclaraFacturaDiario= new JButtonMe();
		this.jButtonFK_IdPeriodoDeclaraFacturaDiario.setText("Buscar");
		this.jButtonFK_IdPeriodoDeclaraFacturaDiario.setToolTipText("Buscar Por Periodo Declara ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPeriodoDeclaraFacturaDiario,"buscar_button","Buscar Por Periodo Declara ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPeriodoDeclaraFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario = new JLabelMe();
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setText("Periodo Declara :");
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setToolTipText("Periodo Declara");
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario= new JComboBoxMe();
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIvaFacturaDiario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIvaFacturaDiario.setToolTipText("Buscar Por Tipo Iva ");
		this.jButtonFK_IdTipoIvaFacturaDiario= new JButtonMe();
		this.jButtonFK_IdTipoIvaFacturaDiario.setText("Buscar");
		this.jButtonFK_IdTipoIvaFacturaDiario.setToolTipText("Buscar Por Tipo Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIvaFacturaDiario,"buscar_button","Buscar Por Tipo Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIvaFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario = new JLabelMe();
		jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario.setText("Tipo Iva :");
		jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario.setToolTipText("Tipo Iva");
		jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario= new JComboBoxMe();
		jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFacturaDiario=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturaDiario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturaDiario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturaDiario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturaDiario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturaDiario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturaDiario = new FacturaDiarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Factura Diario DATOS");
			this.jInternalFrameDetalleFormFacturaDiario = new FacturaDiarioDetalleFormJInternalFrame(jDesktopPane,this.facturadiarioSessionBean.getConGuardarRelaciones(),this.facturadiarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturaDiario = null;//new FacturaDiarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaDiario= new GridBagLayout();
		
		
		this.jTableDatosFacturaDiario = new JTableMe();      
		
		String sToolTipFacturaDiario="";
		sToolTipFacturaDiario=FacturaDiarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaDiario+="(Sris.FacturaDiario)";
		}
		
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaDiario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturaDiario.setToolTipText(sToolTipFacturaDiario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturaDiario);
		this.jTableDatosFacturaDiario.setAutoCreateRowSorter(true);
		this.jTableDatosFacturaDiario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturaDiario.setRowSelectionAllowed(true);
		this.jTableDatosFacturaDiario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturaDiario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturaDiario = new JButtonMe();
		this.jButtonDuplicarFacturaDiario = new JButtonMe();
		this.jButtonCopiarFacturaDiario = new JButtonMe();
		this.jButtonVerFormFacturaDiario = new JButtonMe();
		this.jButtonNuevoRelacionesFacturaDiario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturaDiario = new JButtonMe();
		this.jButtonCerrarFacturaDiario = new JButtonMe();
		
		this.jScrollPanelDatosFacturaDiario = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturaDiario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Diario";
		
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Diarios" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaDiario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaDiario.setToolTipText("Acciones");
        this.jPanelAccionesFacturaDiario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturaDiario=new ReporteDinamicoJInternalFrame(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturaDiario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturaDiario=new ImportacionJInternalFrame(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturaDiario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturaDiario = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturaDiario.setText("Orden");
		this.jButtonAbrirOrderByFacturaDiario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaDiario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaDiario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaDiario,false,this);
			
			//this.cargarOrderByFacturaDiario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaDiario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaDiario,true,this);
			
			//this.cargarOrderByFacturaDiario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturaDiario.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosFacturaDiario.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosFacturaDiario.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosFacturaDiario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaDiario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaDiario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturaDiario.setText("Nuevo");
		this.jButtonDuplicarFacturaDiario.setText("Duplicar");
		this.jButtonCopiarFacturaDiario.setText("Copiar");
		this.jButtonVerFormFacturaDiario.setText("Ver");
		this.jButtonNuevoRelacionesFacturaDiario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturaDiario.setText("Guardar");
		this.jButtonCerrarFacturaDiario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaDiario,"nuevo_button","Nuevo",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturaDiario,"duplicar_button","Duplicar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturaDiario,"copiar_button","Copiar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturaDiario,"ver_form","Ver",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturaDiario,"nuevorelaciones_button","Nuevo Rel",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaDiario,"guardarcambiostabla_button","Guardar",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaDiario,"cerrar_button","Salir",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturaDiario.setToolTipText("Nuevo"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturaDiario.setToolTipText("Duplicar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturaDiario.setToolTipText("Copiar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturaDiario.setToolTipText("Ver"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturaDiario.setToolTipText("Nuevo Rel"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturaDiario.setToolTipText("Guardar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaDiario.setToolTipText("Salir"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaDiario";
		inputMap = this.jButtonNuevoFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaDiario"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturaDiario";
		inputMap = this.jButtonDuplicarFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturaDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturaDiario"));
		
		//COPIAR
		sMapKey = "CopiarFacturaDiario";
		inputMap = this.jButtonCopiarFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturaDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturaDiario"));
		
		//VEr FORM
		sMapKey = "VerFormFacturaDiario";
		inputMap = this.jButtonVerFormFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturaDiario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturaDiario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturaDiario";
		inputMap = this.jButtonNuevoRelacionesFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturaDiario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturaDiario";
		inputMap = this.jButtonModificarFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturaDiario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturaDiario";
		inputMap = this.jButtonCerrarFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaDiario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaDiario";
		inputMap = this.jButtonGuardarCambiosTablaFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaDiario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturaDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturaDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturaDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturaDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturaDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturaDiario.setName("jPanelParametrosReportesFacturaDiario"); 
		
		this.jPanelParametrosReportesAccionesFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturaDiario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturaDiario.setName("jPanelParametrosReportesAccionesFacturaDiario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturaDiario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturaDiario = new JButtonMe();
		this.jButtonRecargarInformacionFacturaDiario.setText("Recargar");
		this.jButtonRecargarInformacionFacturaDiario.setToolTipText("Recargar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturaDiario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFacturaDiario = new JButtonMe();
		this.jButtonProcesarInformacionFacturaDiario.setText("Procesar");
		this.jButtonProcesarInformacionFacturaDiario.setToolTipText("Procesar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturaDiario.setVisible(false);
			
		this.jButtonProcesarInformacionFacturaDiario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaDiario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaDiario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaDiario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturaDiario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaDiario.setText("TIPO");       
		this.jComboBoxTiposReportesFacturaDiario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaDiario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturaDiario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturaDiario.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturaDiario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturaDiario.setText("Accion");
		this.jComboBoxTiposRelacionesFacturaDiario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaDiario.setText("Accion");
		this.jComboBoxTiposAccionesFacturaDiario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturaDiario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturaDiario.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturaDiario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturaDiario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturaDiario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaDiario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaDiario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturaDiario = new JLabelMe();
		
		this.jLabelAccionesFacturaDiario.setText("Acciones");		
		this.jLabelAccionesFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturaDiario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturaDiario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturaDiario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturaDiario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturaDiario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturaDiario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturaDiario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturaDiario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturaDiario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturaDiario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturaDiario.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturaDiario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturaDiario = new JButtonMe();
		//this.jButtonAnterioresFacturaDiario.setText("<<");
        this.jButtonAnterioresFacturaDiario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturaDiario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturaDiario = new JButtonMe();
		//this.jButtonSiguientesFacturaDiario.setText(">>");
        this.jButtonSiguientesFacturaDiario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturaDiario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturaDiario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturaDiario.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturaDiario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturaDiario,"nuevoguardarcambios_button","Nue",this.facturadiarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturaDiario";
		inputMap = this.jButtonNuevoGuardarCambiosFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturaDiario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturaDiario";
		inputMap = this.jButtonRecargarInformacionFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturaDiario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturaDiario";
		inputMap = this.jButtonSiguientesFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturaDiario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturaDiario";
		inputMap = this.jButtonAnterioresFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturaDiario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturaDiario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturaDiario.setMinimumSize(new Dimension(this.getWidth(),FacturaDiarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaDiarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaDiario.setMaximumSize(new Dimension(this.getWidth(),FacturaDiarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaDiarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaDiario.setPreferredSize(new Dimension(this.getWidth(),FacturaDiarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaDiarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturaDiario = new GridBagLayout();

			this.jPanelPaginacionFacturaDiario.setLayout(gridaBagLayoutPaginacionFacturaDiario);						
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = 0;
			this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturaDiario.add(this.jButtonAnterioresFacturaDiario, this.gridBagConstraintsFacturaDiario);
					
						
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaDiario.gridy = 0;
			
			this.jPanelPaginacionFacturaDiario.add(this.jButtonNuevoGuardarCambiosFacturaDiario, this.gridBagConstraintsFacturaDiario);
						
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaDiario.gridy = 0;
			this.jPanelPaginacionFacturaDiario.add(this.jButtonSiguientesFacturaDiario, this.gridBagConstraintsFacturaDiario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = 1;
			this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaDiario.add(this.jButtonNuevoFacturaDiario, this.gridBagConstraintsFacturaDiario);
						
			
			
			if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
				this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturaDiario.gridy = 1;
				this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturaDiario.add(this.jButtonGuardarCambiosTablaFacturaDiario, this.gridBagConstraintsFacturaDiario);
			}
			
			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = 1;
			this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaDiario.add(this.jButtonDuplicarFacturaDiario, this.gridBagConstraintsFacturaDiario);
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = 1;
			this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaDiario.add(this.jButtonCopiarFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = 1;
			this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaDiario.add(this.jButtonVerFormFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = 1;
			this.gridBagConstraintsFacturaDiario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturaDiario.add(this.jButtonCerrarFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		
		
		this.jButtonRecargarInformacionFacturaDiario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaDiario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaDiario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturaDiario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaDiario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaDiario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturaDiario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaDiario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaDiario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturaDiario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaDiario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaDiario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturaDiario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaDiario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaDiario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturaDiario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaDiario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaDiario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturaDiario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaDiario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaDiario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturaDiario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaDiario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaDiario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturaDiario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaDiario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaDiario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturaDiario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaDiario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaDiario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturaDiario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaDiario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaDiario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturaDiario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaDiario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaDiario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturaDiario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturaDiario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturaDiario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturaDiario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturaDiario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturaDiario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturaDiario.setLayout(gridaBagParametrosReportesFacturaDiario);
			this.jPanelParametrosReportesAccionesFacturaDiario.setLayout(gridaBagParametrosReportesAccionesFacturaDiario);
			
			
			this.jPanelParametrosAuxiliar1FacturaDiario.setLayout(gridaBagParametrosAuxiliar1FacturaDiario);
			this.jPanelParametrosAuxiliar2FacturaDiario.setLayout(gridaBagParametrosAuxiliar2FacturaDiario);
			this.jPanelParametrosAuxiliar3FacturaDiario.setLayout(gridaBagParametrosAuxiliar3FacturaDiario);
			this.jPanelParametrosAuxiliar4FacturaDiario.setLayout(gridaBagParametrosAuxiliar4FacturaDiario);
			//this.jPanelParametrosAuxiliar5FacturaDiario.setLayout(gridaBagParametrosAuxiliar2FacturaDiario);			
			
			
			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaDiario.add(this.jButtonRecargarInformacionFacturaDiario, this.gridBagConstraintsFacturaDiario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaDiario.add(this.jComboBoxTiposPaginacionFacturaDiario, this.gridBagConstraintsFacturaDiario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaDiario.add(this.jCheckBoxConAltoMaximoTablaFacturaDiario, this.gridBagConstraintsFacturaDiario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaDiario.add(this.jComboBoxTiposArchivosReportesFacturaDiario, this.gridBagConstraintsFacturaDiario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDiario.add(this.jPanelParametrosAuxiliar1FacturaDiario, this.gridBagConstraintsFacturaDiario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturaDiario.add(this.jComboBoxTiposReportesFacturaDiario, this.gridBagConstraintsFacturaDiario);																		
			
			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturaDiario.add(this.jComboBoxTiposGraficosReportesFacturaDiario, this.gridBagConstraintsFacturaDiario);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDiario.add(this.jPanelParametrosAuxiliar4FacturaDiario, this.gridBagConstraintsFacturaDiario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDiario.add(this.jComboBoxTiposReportesFacturaDiario, this.gridBagConstraintsFacturaDiario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaDiario.add(this.jCheckBoxGenerarReporteFacturaDiario, this.gridBagConstraintsFacturaDiario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDiario.add(this.jPanelParametrosAuxiliar2FacturaDiario, this.gridBagConstraintsFacturaDiario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaDiario.add(this.jLabelAccionesFacturaDiario, this.gridBagConstraintsFacturaDiario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
				this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturaDiario.add(this.jButtonAbrirOrderByFacturaDiario, this.gridBagConstraintsFacturaDiario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaDiario.add(this.jComboBoxTiposSeleccionarFacturaDiario, this.gridBagConstraintsFacturaDiario);			
			
			
			/*
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaDiario.add(this.jCheckBoxSeleccionarTodosFacturaDiario, this.gridBagConstraintsFacturaDiario);
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaDiario.add(this.jCheckBoxConGraficoReporteFacturaDiario, this.gridBagConstraintsFacturaDiario);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaDiario.add(this.jCheckBoxSeleccionarTodosFacturaDiario, this.gridBagConstraintsFacturaDiario);															
				
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaDiario.add(this.jCheckBoxSeleccionadosFacturaDiario, this.gridBagConstraintsFacturaDiario);															
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaDiario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaDiario.add(this.jCheckBoxConGraficoReporteFacturaDiario, this.gridBagConstraintsFacturaDiario);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaDiario.add(this.jPanelParametrosAuxiliar3FacturaDiario, this.gridBagConstraintsFacturaDiario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaDiario.add(this.jComboBoxTiposAccionesFacturaDiario, this.gridBagConstraintsFacturaDiario);
	
				
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaDiario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaDiario.add(this.jTextFieldValorCampoGeneralFacturaDiario, this.gridBagConstraintsFacturaDiario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturaDiario = new GridBagLayout();

			this.jScrollPanelDatosFacturaDiario.setLayout(gridaBagLayoutDatosFacturaDiario);
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = 0;
			this.gridBagConstraintsFacturaDiario.gridx = 0;
			
			this.jScrollPanelDatosFacturaDiario.add(this.jTableDatosFacturaDiario, this.gridBagConstraintsFacturaDiario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturaDiario.setViewportView(this.jTableDatosFacturaDiario);
		this.jTableDatosFacturaDiario.setFillsViewportHeight(true);
		this.jTableDatosFacturaDiario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturaDiario= new GridBagLayout();
		this.jPanelAccionesFacturaDiario.setLayout(gridaBagLayoutAccionesFacturaDiario);
		
		
		/*	
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = 0;
		this.gridBagConstraintsFacturaDiario.gridx = 0;
			
		this.jPanelAccionesFacturaDiario.add(this.jButtonNuevoFacturaDiario, this.gridBagConstraintsFacturaDiario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteFacturaDiario= new GridBagLayout();
		gridaBagLayoutFK_IdClienteFacturaDiario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteFacturaDiario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteFacturaDiario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteFacturaDiario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteFacturaDiario.setLayout(gridaBagLayoutFK_IdClienteFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 0;
		gridBagConstraintsFacturaDiario.gridx = 0;
		jPanelFK_IdClienteFacturaDiario.add(jLabelid_clienteFK_IdClienteFacturaDiario, gridBagConstraintsFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 0;
		gridBagConstraintsFacturaDiario.gridx = 1;
		jPanelFK_IdClienteFacturaDiario.add(jComboBoxid_clienteFK_IdClienteFacturaDiario, gridBagConstraintsFacturaDiario);


		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaDiario.gridy = 0;
		gridBagConstraintsFacturaDiario.gridx = 0;
		jPanelFK_IdClienteFacturaDiario.add(this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario, gridBagConstraintsFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 1;
		gridBagConstraintsFacturaDiario.gridx =1;
		jPanelFK_IdClienteFacturaDiario.add(jButtonFK_IdClienteFacturaDiario, gridBagConstraintsFacturaDiario);

		jTabbedPaneBusquedasFacturaDiario.addTab("1.-Por Cliente ", jPanelFK_IdClienteFacturaDiario);
		jTabbedPaneBusquedasFacturaDiario.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPeriodoDeclaraFacturaDiario= new GridBagLayout();
		gridaBagLayoutFK_IdPeriodoDeclaraFacturaDiario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPeriodoDeclaraFacturaDiario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPeriodoDeclaraFacturaDiario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPeriodoDeclaraFacturaDiario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPeriodoDeclaraFacturaDiario.setLayout(gridaBagLayoutFK_IdPeriodoDeclaraFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 0;
		gridBagConstraintsFacturaDiario.gridx = 0;
		jPanelFK_IdPeriodoDeclaraFacturaDiario.add(jLabelid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario, gridBagConstraintsFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 0;
		gridBagConstraintsFacturaDiario.gridx = 1;
		jPanelFK_IdPeriodoDeclaraFacturaDiario.add(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario, gridBagConstraintsFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 1;
		gridBagConstraintsFacturaDiario.gridx =1;
		jPanelFK_IdPeriodoDeclaraFacturaDiario.add(jButtonFK_IdPeriodoDeclaraFacturaDiario, gridBagConstraintsFacturaDiario);

		jTabbedPaneBusquedasFacturaDiario.addTab("2.-Por Periodo Declara ", jPanelFK_IdPeriodoDeclaraFacturaDiario);
		jTabbedPaneBusquedasFacturaDiario.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoIvaFacturaDiario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIvaFacturaDiario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaFacturaDiario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaFacturaDiario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIvaFacturaDiario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIvaFacturaDiario.setLayout(gridaBagLayoutFK_IdTipoIvaFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 0;
		gridBagConstraintsFacturaDiario.gridx = 0;
		jPanelFK_IdTipoIvaFacturaDiario.add(jLabelid_tipo_ivaFK_IdTipoIvaFacturaDiario, gridBagConstraintsFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 0;
		gridBagConstraintsFacturaDiario.gridx = 1;
		jPanelFK_IdTipoIvaFacturaDiario.add(jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario, gridBagConstraintsFacturaDiario);

		gridBagConstraintsFacturaDiario = new GridBagConstraints();
		gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaDiario.gridy = 1;
		gridBagConstraintsFacturaDiario.gridx =1;
		jPanelFK_IdTipoIvaFacturaDiario.add(jButtonFK_IdTipoIvaFacturaDiario, gridBagConstraintsFacturaDiario);

		jTabbedPaneBusquedasFacturaDiario.addTab("3.-Por Tipo Iva ", jPanelFK_IdTipoIvaFacturaDiario);
		jTabbedPaneBusquedasFacturaDiario.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaDiario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaDiario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();						
			this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaDiario.gridx = 0;		
			//this.gridBagConstraintsFacturaDiario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaDiario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturaDiario, this.gridBagConstraintsFacturaDiario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturaDiario.gridx = 0;		
		//this.gridBagConstraintsFacturaDiario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturaDiario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturaDiario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaDiario.gridx = 0;		
			this.gridBagConstraintsFacturaDiario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturaDiario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturaDiario, this.gridBagConstraintsFacturaDiario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturaDiario, this.gridBagConstraintsFacturaDiario);								
		
		
		/*
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturaDiario, this.gridBagConstraintsFacturaDiario);
		*/		
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaDiario.gridx =0;
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaDiario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaDiario, this.gridBagConstraintsFacturaDiario);
				
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturaDiario, this.gridBagConstraintsFacturaDiario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturaDiario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaDiario = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturaDiario.setLayout(gridaBagLayoutBusquedasParametrosFacturaDiario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturaDiario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaDiario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaDiario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaDiario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaDiario, this.gridBagConstraintsFacturaDiario);
			
			
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
			
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDiario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaDiario, this.gridBagConstraintsFacturaDiario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturaDiario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturaDiario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturaDiario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturaDiario.setName("jPanelReporteDinamicoFacturaDiario"); 
		
		this.jPanelReporteDinamicoFacturaDiario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaDiario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaDiario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturaDiario.setLayout(gridaBagLayoutReporteDinamicoFacturaDiario);
		
		
		this.jInternalFrameReporteDinamicoFacturaDiario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturaDiario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaDiario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturaDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturaDiario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturaDiario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturaDiario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturaDiario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturaDiario.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturaDiario.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturaDiario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturaDiario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaDiario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaDiario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Diarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturaDiario = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturaDiario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaDiario.add(this.jLabelColumnasSelectReporteFacturaDiario, this.gridBagConstraintsFacturaDiario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturaDiario = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturaDiario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturaDiario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturaDiario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaDiario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaDiario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturaDiario=new JScrollPane(this.jListColumnasSelectReporteFacturaDiario);
			
			this.jScrollColumnasSelectReporteFacturaDiario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaDiario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaDiario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturaDiario.add(this.jListColumnasSelectReporteFacturaDiario, this.gridBagConstraintsFacturaDiario);
		this.jPanelReporteDinamicoFacturaDiario.add(this.jScrollColumnasSelectReporteFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturaDiario = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturaDiario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturaDiario = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturaDiario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturaDiario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturaDiario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaDiario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaDiario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturaDiario=new JScrollPane(this.jListRelacionesSelectReporteFacturaDiario);
			
			this.jScrollRelacionesSelectReporteFacturaDiario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaDiario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaDiario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturaDiario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturaDiario = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturaDiario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturaDiario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturaDiario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturaDiario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaDiario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaDiario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDiario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDiario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDiario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDiario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaDiario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturaDiario = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturaDiario.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaDiario.add(this.jLabelConGraficoDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturaDiario = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturaDiario.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturaDiario.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturaDiario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaDiario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaDiario.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDiario.add(this.jCheckBoxConGraficoDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturaDiario = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturaDiario.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaDiario.add(this.jLabelColumnaCategoriaGraficoFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturaDiario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaDiario.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturaDiario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturaDiario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaDiario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaDiario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturaDiario.add(this.jComboBoxColumnaCategoriaGraficoFacturaDiario, this.gridBagConstraintsFacturaDiario);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturaDiario = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturaDiario.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDiario.add(this.jLabelColumnaCategoriaValorFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturaDiario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturaDiario.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturaDiario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturaDiario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaDiario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaDiario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturaDiario.add(this.jComboBoxColumnaCategoriaValorFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturaDiario = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturaDiario.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDiario.add(this.jLabelColumnasValoresGraficoFacturaDiario, this.gridBagConstraintsFacturaDiario);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturaDiario = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturaDiario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturaDiario.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturaDiario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaDiario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaDiario.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturaDiario=new JScrollPane(this.jListColumnasValoresGraficoFacturaDiario);
			
			this.jScrollColumnasValoresGraficoFacturaDiario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaDiario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaDiario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturaDiario.add(this.jListColumnasSelectReporteFacturaDiario, this.gridBagConstraintsFacturaDiario);
		this.jPanelReporteDinamicoFacturaDiario.add(this.jScrollColumnasValoresGraficoFacturaDiario, this.gridBagConstraintsFacturaDiario);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturaDiario = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturaDiario.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDiario.add(this.jLabelTiposGraficosReportesDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturaDiario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaDiario.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturaDiario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturaDiario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaDiario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaDiario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDiario.add(this.jComboBoxTiposGraficosReportesDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturaDiario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturaDiario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDiario.add(this.jLabelGenerarExcelReporteDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturaDiario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturaDiario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturaDiario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturaDiario.setToolTipText("Generar EXCEL"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturaDiario.add(this.jButtonGenerarExcelReporteDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaDiario.add(this.jComboBoxTiposReportesDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturaDiario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturaDiario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaDiario.add(this.jLabelTiposArchivoReporteDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaDiario.add(this.jComboBoxTiposArchivosReportesDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturaDiario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturaDiario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturaDiario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturaDiario.setToolTipText("Generar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaDiario.add(this.jButtonGenerarReporteDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturaDiario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturaDiario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturaDiario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturaDiario.setToolTipText("Cancelar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaDiario.add(this.jButtonCerrarReporteDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturaDiario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturaDiario= new JScrollPane(jPanelReporteDinamicoFacturaDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturaDiario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaDiario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaDiario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Diarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturaDiario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturaDiario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturaDiario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturaDiario);
		this.jInternalFrameReporteDinamicoFacturaDiario.getContentPane().add(this.jScrollPanelReporteDinamicoFacturaDiario, this.gridBagConstraintsFacturaDiario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturaDiario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturaDiario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturaDiario.setName("jPanelImportacionFacturaDiario"); 
		
		this.jPanelImportacionFacturaDiario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaDiario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaDiario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturaDiario.setLayout(gridaBagLayoutImportacionFacturaDiario);
		
		
		this.jInternalFrameImportacionFacturaDiario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturaDiario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturaDiario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaDiario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturaDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaDiario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaDiario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturaDiario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaDiario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaDiario.setResizable(true);
	    this.jInternalFrameImportacionFacturaDiario.setClosable(true);
	    this.jInternalFrameImportacionFacturaDiario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturaDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaDiario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaDiario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturaDiario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaDiario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaDiario.setResizable(true);
	    this.jInternalFrameImportacionFacturaDiario.setClosable(true);
	    this.jInternalFrameImportacionFacturaDiario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturaDiario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaDiario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaDiario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Diarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturaDiario = new JLabelMe();

		this.jLabelArchivoImportacionFacturaDiario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaDiario.add(this.jLabelArchivoImportacionFacturaDiario, this.gridBagConstraintsFacturaDiario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturaDiario = new JFileChooser();		
		this.jFileChooserImportacionFacturaDiario.setToolTipText("ESCOGER ARCHIVO"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturaDiario = new JButtonMe();
		this.jButtonAbrirImportacionFacturaDiario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturaDiario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturaDiario.setToolTipText("Generar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaDiario.add(this.jButtonAbrirImportacionFacturaDiario, this.gridBagConstraintsFacturaDiario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturaDiario = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturaDiario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturaDiario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaDiario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaDiario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaDiario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaDiario.add(this.jLabelPathArchivoImportacionFacturaDiario, this.gridBagConstraintsFacturaDiario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturaDiario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturaDiario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaDiario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaDiario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaDiario.add(this.jTextFieldPathArchivoImportacionFacturaDiario, this.gridBagConstraintsFacturaDiario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturaDiario = new JButtonMe();
		this.jButtonGenerarImportacionFacturaDiario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturaDiario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturaDiario.setToolTipText("Generar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaDiario.add(this.jButtonGenerarImportacionFacturaDiario, this.gridBagConstraintsFacturaDiario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturaDiario = new JButtonMe();
		this.jButtonCerrarImportacionFacturaDiario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturaDiario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturaDiario.setToolTipText("Cancelar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDiario.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaDiario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaDiario.add(this.jButtonCerrarImportacionFacturaDiario, this.gridBagConstraintsFacturaDiario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturaDiario = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturaDiario= new JScrollPane(jPanelImportacionFacturaDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
		this.gridBagConstraintsFacturaDiario.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturaDiario.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturaDiario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturaDiario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturaDiario);
		this.jInternalFrameImportacionFacturaDiario.getContentPane().add(this.jScrollPanelImportacionFacturaDiario, this.gridBagConstraintsFacturaDiario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturaDiario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturaDiario = new JButtonMe();
			this.jButtonAbrirOrderByFacturaDiario.setText("Orden");
			this.jButtonAbrirOrderByFacturaDiario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaDiario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturaDiario";
			inputMap = this.jButtonAbrirOrderByFacturaDiario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturaDiario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturaDiario"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturaDiario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturaDiario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturaDiario.setName("jPanelOrderByFacturaDiario"); 
			
			this.jPanelOrderByFacturaDiario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaDiario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaDiario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturaDiario.setLayout(gridaBagLayoutOrderByFacturaDiario);
			
			
			this.jTableDatosFacturaDiarioOrderBy = new JTableMe();        
			this.jTableDatosFacturaDiarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturaDiarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturaDiarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturaDiarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturaDiarioOrderBy.setViewportView(this.jTableDatosFacturaDiarioOrderBy);
			this.jTableDatosFacturaDiarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturaDiarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturaDiario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturaDiario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturaDiario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturaDiario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturaDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturaDiario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturaDiario.setTitle("Orden");
			this.jInternalFrameOrderByFacturaDiario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturaDiario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturaDiario.setResizable(true);
			this.jInternalFrameOrderByFacturaDiario.setClosable(true);
			this.jInternalFrameOrderByFacturaDiario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturaDiario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaDiario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaDiario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturaDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Diarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturaDiario.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturaDiario.ipady =150;
				
			this.jPanelOrderByFacturaDiario.add(jScrollPanelDatosFacturaDiarioOrderBy, this.gridBagConstraintsFacturaDiario);//this.jTableDatosFacturaDiarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturaDiario = new JButtonMe();
			this.jButtonCerrarOrderByFacturaDiario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturaDiario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturaDiario.setToolTipText("Cancelar"+" "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturaDiario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDiario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturaDiario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturaDiario.add(this.jButtonCerrarOrderByFacturaDiario, this.gridBagConstraintsFacturaDiario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturaDiario = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturaDiario= new JScrollPane(jPanelOrderByFacturaDiario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturaDiario = new GridBagConstraints();
			this.gridBagConstraintsFacturaDiario.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturaDiario.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaDiario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturaDiario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturaDiario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturaDiario);
			
			this.jInternalFrameOrderByFacturaDiario.getContentPane().add(this.jScrollPanelOrderByFacturaDiario, this.gridBagConstraintsFacturaDiario);			
		
		} else {
			this.jButtonAbrirOrderByFacturaDiario = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.facturadiarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturaDiario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturaDiario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturaDiario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFacturaDiario.getRowHeight();//FacturaDiarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturaDiarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaDiario.isSelected()) {
					iHeightTable=FacturaDiarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaDiarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaDiarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturaDiarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaDiario.isSelected()) {
					iHeightTable=FacturaDiarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaDiarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaDiarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturaDiario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaDiario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaDiario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturaDiario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaDiario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaDiario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturaDiario!=null && this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy()!=null) {
			//if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturaDiario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturaDiario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturaDiario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturaDiario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaDiario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaDiario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=facturadiarioLogic.getFacturaDiarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturadiarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturaDiario> TraerFacturaDiarioBeans(List<FacturaDiario> facturadiarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturaDiario facturadiario:facturadiarios) {
					
				if(!(FacturaDiarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturaDiarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturadiario.setsDetalleGeneralEntityReporte(FacturaDiarioConstantesFunciones.getFacturaDiarioDescripcion(facturadiario));
										
					facturadiario.setes_devolucion_descripcion(FacturaDiarioConstantesFunciones.getes_devolucionDescripcion(facturadiario));	
					
						
					
				} else  {
							
					//facturadiario.setsDetalleGeneralEntityReporte(facturadiario.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturadiariobeans.add(facturadiariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturadiarios;
    }
	//PARA REPORTES FIN
}
