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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.InformacionLaboralConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class InformacionLaboralJInternalFrame extends InformacionLaboralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarInformacionLaboral;
	
	protected JMenuBar jmenuBarInformacionLaboral;
	
	protected JMenu jmenuInformacionLaboral;
	protected JMenu jmenuDatosInformacionLaboral;
	protected JMenu jmenuArchivoInformacionLaboral;
	protected JMenu jmenuAccionesInformacionLaboral;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInformacionLaboral;	
	protected GridBagConstraints gridBagConstraintsInformacionLaboral;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public InformacionLaboralDetalleFormJInternalFrame jInternalFrameDetalleFormInformacionLaboral;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoInformacionLaboral;	
	protected ImportacionJInternalFrame jInternalFrameImportacionInformacionLaboral;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoEmpresaBeanSwingJInternalFrame tipoempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoempresa="";

	protected TipoRelaLaboBeanSwingJInternalFrame tiporelalaboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporelalabo="";

	protected TipoAreaLaboBeanSwingJInternalFrame tipoarealaboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoarealabo="";

	protected TipoCargoLaboBeanSwingJInternalFrame tipocargolaboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocargolabo="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public InformacionLaboralSessionBean informacionlaboralSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoEmpresaSessionBean tipoempresaSessionBean;
	public TipoRelaLaboSessionBean tiporelalaboSessionBean;
	public TipoAreaLaboSessionBean tipoarealaboSessionBean;
	public TipoCargoLaboSessionBean tipocargolaboSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<InformacionLaboral> informacionlaborals;		
	public List<InformacionLaboral> informacionlaboralsEliminados;	
	public List<InformacionLaboral> informacionlaboralsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByInformacionLaboral;		
	protected JButton jButtonAbrirOrderByInformacionLaboral;
	
	
	//protected JPanel jPanelOrderByInformacionLaboral;
	//public JScrollPane jScrollPanelOrderByInformacionLaboral;	
	//protected JButton jButtonCerrarOrderByInformacionLaboral;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public InformacionLaboralLogic informacionlaboralLogic;
	
	
	
	public JScrollPane jScrollPanelDatosInformacionLaboral;
	public JScrollPane jScrollPanelDatosEdicionInformacionLaboral;
	public JScrollPane jScrollPanelDatosGeneralInformacionLaboral;
    
	
	
	//public JScrollPane jScrollPanelDatosInformacionLaboralOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoInformacionLaboral;
	//public JScrollPane jScrollPanelImportacionInformacionLaboral;
	
	
	
	protected JPanel jPanelAccionesInformacionLaboral;
	
    protected JPanel jPanelPaginacionInformacionLaboral;
    protected JPanel jPanelParametrosReportesInformacionLaboral;
	protected JPanel jPanelParametrosReportesAccionesInformacionLaboral;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1InformacionLaboral;
	protected JPanel jPanelParametrosAuxiliar2InformacionLaboral;
	protected JPanel jPanelParametrosAuxiliar3InformacionLaboral;
	protected JPanel jPanelParametrosAuxiliar4InformacionLaboral;
	//protected JPanel jPanelParametrosAuxiliar5InformacionLaboral;
	
	
	
	//protected JPanel jPanelReporteDinamicoInformacionLaboral;
	//protected JPanel jPanelImportacionInformacionLaboral;
	
	
	public JTable jTableDatosInformacionLaboral;
	
	
	
	//public JTable jTableDatosInformacionLaboralOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoInformacionLaboral;
	protected JButton jButtonDuplicarInformacionLaboral;
	protected JButton jButtonCopiarInformacionLaboral;
	protected JButton jButtonVerFormInformacionLaboral;
	protected JButton jButtonNuevoRelacionesInformacionLaboral;
	protected JButton jButtonModificarInformacionLaboral;
	
    protected JButton jButtonGuardarCambiosTablaInformacionLaboral;
	protected JButton jButtonCerrarInformacionLaboral;
	
	
	protected JButton jButtonRecargarInformacionInformacionLaboral;
	protected JButton jButtonProcesarInformacionInformacionLaboral;
	
	
	protected JButton jButtonAnterioresInformacionLaboral;
	protected JButton jButtonSiguientesInformacionLaboral;
	protected JButton jButtonNuevoGuardarCambiosInformacionLaboral;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoInformacionLaboral;
	//protected JButton jButtonCerrarReporteDinamicoInformacionLaboral;
	//protected JButton jButtonGenerarExcelReporteDinamicoInformacionLaboral;	
	
	
	
	//protected JButton jButtonAbrirImportacionInformacionLaboral;
	//protected JButton jButtonGenerarImportacionInformacionLaboral;
	//protected JButton jButtonCerrarImportacionInformacionLaboral;
	//protected JFileChooser jFileChooserImportacionInformacionLaboral;
	//protected File fileImportacionInformacionLaboral;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInformacionLaboral;
	protected JButton jButtonDuplicarToolBarInformacionLaboral;
	protected JButton jButtonNuevoRelacionesToolBarInformacionLaboral;
	
	
	public JButton jButtonGuardarCambiosToolBarInformacionLaboral;
	protected JButton jButtonCopiarToolBarInformacionLaboral;
	protected JButton jButtonVerFormToolBarInformacionLaboral;
	public JButton jButtonGuardarCambiosTablaToolBarInformacionLaboral;
	protected JButton jButtonMostrarOcultarTablaToolBarInformacionLaboral;
	protected JButton jButtonCerrarToolBarInformacionLaboral;
	
	protected JButton jButtonRecargarInformacionToolBarInformacionLaboral;
	protected JButton jButtonProcesarInformacionToolBarInformacionLaboral;
	protected JButton jButtonAnterioresToolBarInformacionLaboral;
	protected JButton jButtonSiguientesToolBarInformacionLaboral;
	protected JButton jButtonNuevoGuardarCambiosToolBarInformacionLaboral;
	protected JButton jButtonAbrirOrderByToolBarInformacionLaboral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInformacionLaboral;
	protected JMenuItem jMenuItemDuplicarInformacionLaboral;
	protected JMenuItem jMenuItemNuevoRelacionesInformacionLaboral;
	
	
	protected JMenuItem jMenuItemGuardarCambiosInformacionLaboral;
	protected JMenuItem jMenuItemCopiarInformacionLaboral;
	protected JMenuItem jMenuItemVerFormInformacionLaboral;
	protected JMenuItem jMenuItemGuardarCambiosTablaInformacionLaboral;
	protected JMenuItem jMenuItemCerrarInformacionLaboral;
	protected JMenuItem jMenuItemDetalleCerrarInformacionLaboral;
	protected JMenuItem jMenuItemDetalleAbrirOrderByInformacionLaboral;
	protected JMenuItem jMenuItemDetalleMostarOcultarInformacionLaboral;
	
	protected JMenuItem jMenuItemRecargarInformacionInformacionLaboral;
	protected JMenuItem jMenuItemProcesarInformacionInformacionLaboral;
	protected JMenuItem jMenuItemAnterioresInformacionLaboral;
	protected JMenuItem jMenuItemSiguientesInformacionLaboral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInformacionLaboral;
	protected JMenuItem jMenuItemAbrirOrderByInformacionLaboral;
	protected JMenuItem jMenuItemMostrarOcultarInformacionLaboral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInformacionLaboral;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosInformacionLaboral;
	protected JCheckBox jCheckBoxSeleccionadosInformacionLaboral;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaInformacionLaboral;
	protected JCheckBox jCheckBoxConGraficoReporteInformacionLaboral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesInformacionLaboral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesInformacionLaboral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoInformacionLaboral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoInformacionLaboral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesInformacionLaboral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionInformacionLaboral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInformacionLaboral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInformacionLaboral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarInformacionLaboral;
	protected JTextField jTextFieldValorCampoGeneralInformacionLaboral;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteInformacionLaboral;
	//public JList<Reporte> jListColumnasSelectReporteInformacionLaboral;
	//public JScrollPane jScrollColumnasSelectReporteInformacionLaboral;
	
	//public JLabel jLabelRelacionesSelectReporteInformacionLaboral;
	//public JList<Reporte> jListRelacionesSelectReporteInformacionLaboral;
	//public JScrollPane jScrollRelacionesSelectReporteInformacionLaboral;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoInformacionLaboral;
	//protected JCheckBox jCheckBoxConGraficoDinamicoInformacionLaboral;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoInformacionLaboral;
	//public JLabel jLabelTiposArchivoReporteDinamicoInformacionLaboral;
	
		
	//public JLabel jLabelArchivoImportacionInformacionLaboral;	
	//public JLabel jLabelPathArchivoImportacionInformacionLaboral;
	//protected JTextField jTextFieldPathArchivoImportacionInformacionLaboral;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoInformacionLaboral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoInformacionLaboral;
	
	//public JLabel jLabelColumnaCategoriaValorInformacionLaboral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorInformacionLaboral;
	
	//public JLabel jLabelColumnasValoresGraficoInformacionLaboral;
	//public JList<Reporte> jListColumnasValoresGraficoInformacionLaboral;
	//public JScrollPane jScrollColumnasValoresGraficoInformacionLaboral;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoInformacionLaboral;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoInformacionLaboral;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasInformacionLaboral;
	public JPanel jPanelFK_IdCiudadInformacionLaboral;
	public JButton jButtonFK_IdCiudadInformacionLaboral;
	public JPanel jPanelFK_IdClienteInformacionLaboral;
	public JButton jButtonFK_IdClienteInformacionLaboral;
	public JPanel jPanelFK_IdPaisInformacionLaboral;
	public JButton jButtonFK_IdPaisInformacionLaboral;
	public JPanel jPanelFK_IdTipoEmpresaInformacionLaboral;
	public JButton jButtonFK_IdTipoEmpresaInformacionLaboral;
	public JPanel jPanelFK_IdValorClienteAreaLaboralInformacionLaboral;
	public JButton jButtonFK_IdValorClienteAreaLaboralInformacionLaboral;
	public JPanel jPanelFK_IdValorClienteCargoLaboralInformacionLaboral;
	public JButton jButtonFK_IdValorClienteCargoLaboralInformacionLaboral;
	public JPanel jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral;
	public JButton jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral;
	
	public JPanel jPanelidciudadFK_IdCiudadInformacionLaboral;
	public JLabel jLabelidciudadFK_IdCiudadInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidciudadFK_IdCiudadInformacionLaboral;
	public JButton jButtonidciudadFK_IdCiudadInformacionLaboral= new JButtonMe();
	public JButton jButtonidciudadFK_IdCiudadInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidciudadFK_IdCiudadInformacionLaboralBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteFK_IdClienteInformacionLaboral;
	public JLabel jLabelidclienteFK_IdClienteInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteInformacionLaboral;
	public JButton jButtonidclienteFK_IdClienteInformacionLaboral= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteInformacionLaboralBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteInformacionLaboral;
	
	public JPanel jPanelid_paisFK_IdPaisInformacionLaboral;
	public JLabel jLabelid_paisFK_IdPaisInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisInformacionLaboral;
	public JButton jButtonid_paisFK_IdPaisInformacionLaboral= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisInformacionLaboralBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorempresaFK_IdTipoEmpresaInformacionLaboral;
	public JLabel jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral;
	public JButton jButtonidvalorempresaFK_IdTipoEmpresaInformacionLaboral= new JButtonMe();
	public JButton jButtonidvalorempresaFK_IdTipoEmpresaInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidvalorempresaFK_IdTipoEmpresaInformacionLaboralBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral;
	public JLabel jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral;
	public JButton jButtonidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral= new JButtonMe();
	public JButton jButtonidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboralBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral;
	public JLabel jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral;
	public JButton jButtonidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral= new JButtonMe();
	public JButton jButtonidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboralBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral;
	public JLabel jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral;
	public JButton jButtonidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral= new JButtonMe();
	public JButton jButtonidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboralBusqueda= new JButtonMe();

	
	
	
	
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
	public InformacionLaboralJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionLaboralJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionLaboralJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionLaboralJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionInformacionLaboral)	{
		this.jButtonRecargarInformacionInformacionLaboral = jButtonRecargarInformacionInformacionLaboral;
	}
	
	public JButton getjButtonProcesarInformacionInformacionLaboral() {
		return this.jButtonProcesarInformacionInformacionLaboral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInformacionLaboral)	{
		this.jButtonProcesarInformacionInformacionLaboral = jButtonProcesarInformacionInformacionLaboral;
	}
	
	
	public JButton getjButtonRecargarInformacionInformacionLaboral() {
		return this.jButtonRecargarInformacionInformacionLaboral;
	}
	
	
	public List<InformacionLaboral> getinformacionlaborals() {
		return this.informacionlaborals;
	}

	public void setinformacionlaborals(List<InformacionLaboral> informacionlaborals) {
		this.informacionlaborals = informacionlaborals;
	}
	
	public List<InformacionLaboral> getinformacionlaboralsAux() {
		return this.informacionlaboralsAux;
	}

	public void setinformacionlaboralsAux(List<InformacionLaboral> informacionlaboralsAux) {
		this.informacionlaboralsAux = informacionlaboralsAux;
	}
	
	public List<InformacionLaboral> getinformacionlaboralsEliminados() {
		return this.informacionlaboralsEliminados;
	}

	public void setInformacionLaboralsEliminados(List<InformacionLaboral> informacionlaboralsEliminados) {
		this.informacionlaboralsEliminados = informacionlaboralsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarInformacionLaboral() {
		return jComboBoxTiposSeleccionarInformacionLaboral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarInformacionLaboral(
			JComboBox jComboBoxTiposSeleccionarInformacionLaboral) {
		this.jComboBoxTiposSeleccionarInformacionLaboral = jComboBoxTiposSeleccionarInformacionLaboral;
	}
	
	public void setBorderResaltarTiposSeleccionarInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarInformacionLaboral .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralInformacionLaboral() {
		return jTextFieldValorCampoGeneralInformacionLaboral;
	}

	public void setjTextFieldValorCampoGeneralInformacionLaboral(
			JTextField jTextFieldValorCampoGeneralInformacionLaboral) {
		this.jTextFieldValorCampoGeneralInformacionLaboral = jTextFieldValorCampoGeneralInformacionLaboral;
	}

	public void setBorderResaltarValorCampoGeneralInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralInformacionLaboral .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosInformacionLaboral() {
		return this.jCheckBoxSeleccionarTodosInformacionLaboral;
	}

	public void setjCheckBoxSeleccionarTodosInformacionLaboral(
			JCheckBox jCheckBoxSeleccionarTodosInformacionLaboral) {
		this.jCheckBoxSeleccionarTodosInformacionLaboral = jCheckBoxSeleccionarTodosInformacionLaboral;
	}

	public void setBorderResaltarSeleccionarTodosInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosInformacionLaboral .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosInformacionLaboral() {
		return this.jCheckBoxSeleccionadosInformacionLaboral;
	}

	public void setjCheckBoxSeleccionadosInformacionLaboral(
			JCheckBox jCheckBoxSeleccionadosInformacionLaboral) {
		this.jCheckBoxSeleccionadosInformacionLaboral = jCheckBoxSeleccionadosInformacionLaboral;
	}
	
	public void setBorderResaltarSeleccionadosInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosInformacionLaboral .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesInformacionLaboral() {
		return this.jComboBoxTiposArchivosReportesInformacionLaboral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesInformacionLaboral(
			JComboBox jComboBoxTiposArchivosReportesInformacionLaboral) {
		this.jComboBoxTiposArchivosReportesInformacionLaboral = jComboBoxTiposArchivosReportesInformacionLaboral;
	}

	public void setBorderResaltarTiposArchivosReportesInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesInformacionLaboral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesInformacionLaboral() {
		return this.jComboBoxTiposReportesInformacionLaboral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesInformacionLaboral(
			JComboBox jComboBoxTiposReportesInformacionLaboral) {
		this.jComboBoxTiposReportesInformacionLaboral = jComboBoxTiposReportesInformacionLaboral;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoInformacionLaboral() {
	//	return jComboBoxTiposReportesDinamicoInformacionLaboral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoInformacionLaboral(
	//		JComboBox jComboBoxTiposReportesDinamicoInformacionLaboral) {
	//	this.jComboBoxTiposReportesDinamicoInformacionLaboral = jComboBoxTiposReportesDinamicoInformacionLaboral;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoInformacionLaboral() {
	//	return jComboBoxTiposArchivosReportesDinamicoInformacionLaboral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoInformacionLaboral(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoInformacionLaboral) {
	//	this.jComboBoxTiposArchivosReportesDinamicoInformacionLaboral = jComboBoxTiposArchivosReportesDinamicoInformacionLaboral;
	//}
	
	public void setBorderResaltarTiposReportesInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesInformacionLaboral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesInformacionLaboral() {
		return this.jComboBoxTiposGraficosReportesInformacionLaboral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesInformacionLaboral(
			JComboBox jComboBoxTiposGraficosReportesInformacionLaboral) {
		this.jComboBoxTiposGraficosReportesInformacionLaboral = jComboBoxTiposGraficosReportesInformacionLaboral;
	}
	
	public void setBorderResaltarTiposGraficosReportesInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesInformacionLaboral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionInformacionLaboral() {
		return this.jComboBoxTiposPaginacionInformacionLaboral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionInformacionLaboral(
			JComboBox jComboBoxTiposPaginacionInformacionLaboral) {
		this.jComboBoxTiposPaginacionInformacionLaboral = jComboBoxTiposPaginacionInformacionLaboral;
	}
	
	public void setBorderResaltarTiposPaginacionInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionInformacionLaboral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesInformacionLaboral() {
		return this.jComboBoxTiposRelacionesInformacionLaboral;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInformacionLaboral() {
		return this.jComboBoxTiposAccionesInformacionLaboral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInformacionLaboral(
			JComboBox jComboBoxTiposRelacionesInformacionLaboral) {
		this.jComboBoxTiposRelacionesInformacionLaboral = jComboBoxTiposRelacionesInformacionLaboral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInformacionLaboral(
			JComboBox jComboBoxTiposAccionesInformacionLaboral) {
		this.jComboBoxTiposAccionesInformacionLaboral = jComboBoxTiposAccionesInformacionLaboral;
	}
	
	public void setBorderResaltarTiposRelacionesInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesInformacionLaboral .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesInformacionLaboral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesInformacionLaboral .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoInformacionLaboral() {
	//	return jCheckBoxConGraficoDinamicoInformacionLaboral;
	//}

	//public void setjCheckBoxConGraficoDinamicoInformacionLaboral(
	//		JCheckBox jCheckBoxConGraficoDinamicoInformacionLaboral) {
	//	this.jCheckBoxConGraficoDinamicoInformacionLaboral = jCheckBoxConGraficoDinamicoInformacionLaboral;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoInformacionLaboral() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarInformacionLaboral.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoInformacionLaboral .setBorder(borderResaltar);		
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
		this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		
		this.informacionlaboralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacionlaboralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.informacionlaboralSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InformacionLaboralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Informacion Laboral MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
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
		
		InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarInformacionLaboral= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"nuevo","nuevo","Nuevo"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"duplicar","duplicar","Duplicar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"copiar","copiar","Copiar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"ver_form","ver_form","Ver"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"recargar","recargar","Recargar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarInformacionLaboral,this.jTtoolBarInformacionLaboral,
							"cerrar","cerrar","Salir"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarInformacionLaboral=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarInformacionLaboral;
			
				this.jButtonProcesarInformacionToolBarInformacionLaboral=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarInformacionLaboral;
				
		//protected JButton jButtonModificarToolBarInformacionLaboral;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarInformacionLaboral=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuInformacionLaboral=new JMenuMe("General");
		this.jmenuArchivoInformacionLaboral=new JMenuMe("Archivo");
		this.jmenuAccionesInformacionLaboral=new JMenuMe("Acciones");
		this.jmenuDatosInformacionLaboral=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInformacionLaboral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInformacionLaboral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInformacionLaboral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarInformacionLaboral= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarInformacionLaboral.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarInformacionLaboral,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesInformacionLaboral= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesInformacionLaboral.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesInformacionLaboral,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosInformacionLaboral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInformacionLaboral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInformacionLaboral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarInformacionLaboral= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarInformacionLaboral.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarInformacionLaboral,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormInformacionLaboral= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormInformacionLaboral.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormInformacionLaboral,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaInformacionLaboral= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaInformacionLaboral.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaInformacionLaboral,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInformacionLaboral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInformacionLaboral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInformacionLaboral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionInformacionLaboral= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionInformacionLaboral.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionInformacionLaboral,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionInformacionLaboral= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionInformacionLaboral.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionInformacionLaboral,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresInformacionLaboral= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresInformacionLaboral.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresInformacionLaboral,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesInformacionLaboral= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesInformacionLaboral.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesInformacionLaboral,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByInformacionLaboral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByInformacionLaboral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByInformacionLaboral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInformacionLaboral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInformacionLaboral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInformacionLaboral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByInformacionLaboral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByInformacionLaboral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByInformacionLaboral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInformacionLaboral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInformacionLaboral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInformacionLaboral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosInformacionLaboral= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosInformacionLaboral.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosInformacionLaboral,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoInformacionLaboral.add(this.jMenuItemCerrarInformacionLaboral);
			
			this.jmenuAccionesInformacionLaboral.add(this.jMenuItemNuevoInformacionLaboral);
			this.jmenuAccionesInformacionLaboral.add(this.jMenuItemNuevoGuardarCambiosInformacionLaboral);
			this.jmenuAccionesInformacionLaboral.add(this.jMenuItemNuevoRelacionesInformacionLaboral);
			this.jmenuAccionesInformacionLaboral.add(this.jMenuItemGuardarCambiosTablaInformacionLaboral);		
			this.jmenuAccionesInformacionLaboral.add(this.jMenuItemDuplicarInformacionLaboral);		
			this.jmenuAccionesInformacionLaboral.add(this.jMenuItemCopiarInformacionLaboral);		
			this.jmenuAccionesInformacionLaboral.add(this.jMenuItemVerFormInformacionLaboral);		
			
			this.jmenuDatosInformacionLaboral.add(this.jMenuItemRecargarInformacionInformacionLaboral);				
			this.jmenuDatosInformacionLaboral.add(this.jMenuItemAnterioresInformacionLaboral);				
			this.jmenuDatosInformacionLaboral.add(this.jMenuItemSiguientesInformacionLaboral);				
			this.jmenuDatosInformacionLaboral.add(this.jMenuItemAbrirOrderByInformacionLaboral);				
			this.jmenuDatosInformacionLaboral.add(this.jMenuItemMostrarOcultarInformacionLaboral);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesInformacionLaboral.add(this.jMenuItemGuardarCambiosInformacionLaboral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarInformacionLaboral.add(this.jmenuArchivoInformacionLaboral);		
			this.jmenuBarInformacionLaboral.add(this.jmenuAccionesInformacionLaboral);		
			this.jmenuBarInformacionLaboral.add(this.jmenuDatosInformacionLaboral);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarInformacionLaboral);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasInformacionLaboral() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadInformacionLaboral.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadInformacionLaboral= new JButtonMe();
		this.jButtonFK_IdCiudadInformacionLaboral.setText("Buscar");
		this.jButtonFK_IdCiudadInformacionLaboral.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadInformacionLaboral,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidciudadFK_IdCiudadInformacionLaboral = new JLabelMe();
		jLabelidciudadFK_IdCiudadInformacionLaboral.setText("Ciudad :");
		jLabelidciudadFK_IdCiudadInformacionLaboral.setToolTipText("Ciudad");
		jLabelidciudadFK_IdCiudadInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidciudadFK_IdCiudadInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidciudadFK_IdCiudadInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidciudadFK_IdCiudadInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidciudadFK_IdCiudadInformacionLaboral= new JComboBoxMe();
		jComboBoxidciudadFK_IdCiudadInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadFK_IdCiudadInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadFK_IdCiudadInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidciudadFK_IdCiudadInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteInformacionLaboral.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteInformacionLaboral= new JButtonMe();
		this.jButtonFK_IdClienteInformacionLaboral.setText("Buscar");
		this.jButtonFK_IdClienteInformacionLaboral.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteInformacionLaboral,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteInformacionLaboral = new JLabelMe();
		jLabelidclienteFK_IdClienteInformacionLaboral.setText("Cliente :");
		jLabelidclienteFK_IdClienteInformacionLaboral.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteInformacionLaboral= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral.setFocusable(false);

		this.jPanelFK_IdPaisInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisInformacionLaboral.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisInformacionLaboral= new JButtonMe();
		this.jButtonFK_IdPaisInformacionLaboral.setText("Buscar");
		this.jButtonFK_IdPaisInformacionLaboral.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisInformacionLaboral,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisInformacionLaboral = new JLabelMe();
		jLabelid_paisFK_IdPaisInformacionLaboral.setText("Pais :");
		jLabelid_paisFK_IdPaisInformacionLaboral.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisInformacionLaboral= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoEmpresaInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoEmpresaInformacionLaboral.setToolTipText("Buscar Por Tipo Empresa ");
		this.jButtonFK_IdTipoEmpresaInformacionLaboral= new JButtonMe();
		this.jButtonFK_IdTipoEmpresaInformacionLaboral.setText("Buscar");
		this.jButtonFK_IdTipoEmpresaInformacionLaboral.setToolTipText("Buscar Por Tipo Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoEmpresaInformacionLaboral,"buscar_button","Buscar Por Tipo Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoEmpresaInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral = new JLabelMe();
		jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setText("Tipo Empresa :");
		jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setToolTipText("Tipo Empresa");
		jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral= new JComboBoxMe();
		jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdValorClienteAreaLaboralInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteAreaLaboralInformacionLaboral.setToolTipText("Buscar Por Tipo Area Labo ");
		this.jButtonFK_IdValorClienteAreaLaboralInformacionLaboral= new JButtonMe();
		this.jButtonFK_IdValorClienteAreaLaboralInformacionLaboral.setText("Buscar");
		this.jButtonFK_IdValorClienteAreaLaboralInformacionLaboral.setToolTipText("Buscar Por Tipo Area Labo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteAreaLaboralInformacionLaboral,"buscar_button","Buscar Por Tipo Area Labo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteAreaLaboralInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral = new JLabelMe();
		jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setText("Tipo Area Labo :");
		jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setToolTipText("Tipo Area Labo");
		jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral= new JComboBoxMe();
		jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdValorClienteCargoLaboralInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteCargoLaboralInformacionLaboral.setToolTipText("Buscar Por Tipo Cargo Labo ");
		this.jButtonFK_IdValorClienteCargoLaboralInformacionLaboral= new JButtonMe();
		this.jButtonFK_IdValorClienteCargoLaboralInformacionLaboral.setText("Buscar");
		this.jButtonFK_IdValorClienteCargoLaboralInformacionLaboral.setToolTipText("Buscar Por Tipo Cargo Labo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteCargoLaboralInformacionLaboral,"buscar_button","Buscar Por Tipo Cargo Labo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteCargoLaboralInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral = new JLabelMe();
		jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setText("Tipo Cargo Labo :");
		jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setToolTipText("Tipo Cargo Labo");
		jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral= new JComboBoxMe();
		jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral.setToolTipText("Buscar Por Tipo Rela Labo ");
		this.jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral= new JButtonMe();
		this.jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral.setText("Buscar");
		this.jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral.setToolTipText("Buscar Por Tipo Rela Labo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral,"buscar_button","Buscar Por Tipo Rela Labo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral = new JLabelMe();
		jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setText("Tipo Rela Labo :");
		jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setToolTipText("Tipo Rela Labo");
		jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral= new JComboBoxMe();
		jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasInformacionLaboral=new JTabbedPane();


		this.jTabbedPaneBusquedasInformacionLaboral.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasInformacionLaboral.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasInformacionLaboral.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleInformacionLaboral = new InformacionLaboralDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Informacion Laboral DATOS");
			this.jInternalFrameDetalleFormInformacionLaboral = new InformacionLaboralDetalleFormJInternalFrame(jDesktopPane,this.informacionlaboralSessionBean.getConGuardarRelaciones(),this.informacionlaboralSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormInformacionLaboral = null;//new InformacionLaboralDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInformacionLaboral= new GridBagLayout();
		
		
		this.jTableDatosInformacionLaboral = new JTableMe();      
		
		String sToolTipInformacionLaboral="";
		sToolTipInformacionLaboral=InformacionLaboralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInformacionLaboral+="(Cartera.InformacionLaboral)";
		}
		
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			sToolTipInformacionLaboral+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosInformacionLaboral.setToolTipText(sToolTipInformacionLaboral);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosInformacionLaboral);
		this.jTableDatosInformacionLaboral.setAutoCreateRowSorter(true);
		this.jTableDatosInformacionLaboral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosInformacionLaboral.setRowSelectionAllowed(true);
		this.jTableDatosInformacionLaboral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosInformacionLaboral,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoInformacionLaboral = new JButtonMe();
		this.jButtonDuplicarInformacionLaboral = new JButtonMe();
		this.jButtonCopiarInformacionLaboral = new JButtonMe();
		this.jButtonVerFormInformacionLaboral = new JButtonMe();
		this.jButtonNuevoRelacionesInformacionLaboral = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaInformacionLaboral = new JButtonMe();
		this.jButtonCerrarInformacionLaboral = new JButtonMe();
		
		this.jScrollPanelDatosInformacionLaboral = new JScrollPane();   
        this.jScrollPanelDatosGeneralInformacionLaboral = new JScrollPane();
		
				
		
		
		this.jPanelAccionesInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Informacion Laboral";
		
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Laborales" + this.sPath));
		} else {
			this.jScrollPanelDatosInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInformacionLaboral.setToolTipText("Acciones");
        this.jPanelAccionesInformacionLaboral.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoInformacionLaboral=new ReporteDinamicoJInternalFrame(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoInformacionLaboral();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionInformacionLaboral=new ImportacionJInternalFrame(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionInformacionLaboral();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByInformacionLaboral = new JButtonMe();
		
		this.jButtonAbrirOrderByInformacionLaboral.setText("Orden");
		this.jButtonAbrirOrderByInformacionLaboral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInformacionLaboral,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInformacionLaboral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionLaboral,false,this);
			
			//this.cargarOrderByInformacionLaboral(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInformacionLaboral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionLaboral,true,this);
			
			//this.cargarOrderByInformacionLaboral(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosInformacionLaboral.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosInformacionLaboral.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosInformacionLaboral.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosInformacionLaboral.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosInformacionLaboral.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosInformacionLaboral.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoInformacionLaboral.setText("Nuevo");
		this.jButtonDuplicarInformacionLaboral.setText("Duplicar");
		this.jButtonCopiarInformacionLaboral.setText("Copiar");
		this.jButtonVerFormInformacionLaboral.setText("Ver");
		this.jButtonNuevoRelacionesInformacionLaboral.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaInformacionLaboral.setText("Guardar");
		this.jButtonCerrarInformacionLaboral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInformacionLaboral,"nuevo_button","Nuevo",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarInformacionLaboral,"duplicar_button","Duplicar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarInformacionLaboral,"copiar_button","Copiar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormInformacionLaboral,"ver_form","Ver",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesInformacionLaboral,"nuevorelaciones_button","Nuevo Rel",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInformacionLaboral,"guardarcambiostabla_button","Guardar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInformacionLaboral,"cerrar_button","Salir",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoInformacionLaboral.setToolTipText("Nuevo"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarInformacionLaboral.setToolTipText("Duplicar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarInformacionLaboral.setToolTipText("Copiar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormInformacionLaboral.setToolTipText("Ver"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesInformacionLaboral.setToolTipText("Nuevo Rel"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaInformacionLaboral.setToolTipText("Guardar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInformacionLaboral.setToolTipText("Salir"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInformacionLaboral";
		inputMap = this.jButtonNuevoInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInformacionLaboral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInformacionLaboral"));
		
		//DUPLICAR
		sMapKey = "DuplicarInformacionLaboral";
		inputMap = this.jButtonDuplicarInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarInformacionLaboral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarInformacionLaboral"));
		
		//COPIAR
		sMapKey = "CopiarInformacionLaboral";
		inputMap = this.jButtonCopiarInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarInformacionLaboral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarInformacionLaboral"));
		
		//VEr FORM
		sMapKey = "VerFormInformacionLaboral";
		inputMap = this.jButtonVerFormInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormInformacionLaboral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormInformacionLaboral"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesInformacionLaboral";
		inputMap = this.jButtonNuevoRelacionesInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesInformacionLaboral"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarInformacionLaboral";
		inputMap = this.jButtonModificarInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarInformacionLaboral"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarInformacionLaboral";
		inputMap = this.jButtonCerrarInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInformacionLaboral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInformacionLaboral";
		inputMap = this.jButtonGuardarCambiosTablaInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInformacionLaboral"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1InformacionLaboral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2InformacionLaboral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3InformacionLaboral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4InformacionLaboral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5InformacionLaboral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesInformacionLaboral.setName("jPanelParametrosReportesInformacionLaboral"); 
		
		this.jPanelParametrosReportesAccionesInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesInformacionLaboral.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesInformacionLaboral.setName("jPanelParametrosReportesAccionesInformacionLaboral"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionInformacionLaboral = new JButtonMe();
		this.jButtonRecargarInformacionInformacionLaboral.setText("Recargar");
		this.jButtonRecargarInformacionInformacionLaboral.setToolTipText("Recargar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionInformacionLaboral,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionInformacionLaboral = new JButtonMe();
		this.jButtonProcesarInformacionInformacionLaboral.setText("Procesar");
		this.jButtonProcesarInformacionInformacionLaboral.setToolTipText("Procesar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionInformacionLaboral.setVisible(false);
			
		this.jButtonProcesarInformacionInformacionLaboral.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInformacionLaboral.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInformacionLaboral.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionLaboral.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesInformacionLaboral.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionLaboral.setText("TIPO");       
		this.jComboBoxTiposReportesInformacionLaboral.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionLaboral.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesInformacionLaboral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionInformacionLaboral.setText("Paginacion");
		this.jComboBoxTiposPaginacionInformacionLaboral.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesInformacionLaboral.setText("Accion");
		this.jComboBoxTiposRelacionesInformacionLaboral.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInformacionLaboral.setText("Accion");
		this.jComboBoxTiposAccionesInformacionLaboral.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarInformacionLaboral.setText("Accion");
		this.jComboBoxTiposSeleccionarInformacionLaboral.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralInformacionLaboral=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralInformacionLaboral.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInformacionLaboral.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInformacionLaboral.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesInformacionLaboral = new JLabelMe();
		
		this.jLabelAccionesInformacionLaboral.setText("Acciones");		
		this.jLabelAccionesInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosInformacionLaboral = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosInformacionLaboral.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosInformacionLaboral.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosInformacionLaboral = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosInformacionLaboral.setText("Seleccionados");
		this.jCheckBoxSeleccionadosInformacionLaboral.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaInformacionLaboral = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaInformacionLaboral.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaInformacionLaboral.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteInformacionLaboral = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteInformacionLaboral.setText("Graf.");
		this.jCheckBoxConGraficoReporteInformacionLaboral.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresInformacionLaboral = new JButtonMe();
		//this.jButtonAnterioresInformacionLaboral.setText("<<");
        this.jButtonAnterioresInformacionLaboral.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresInformacionLaboral,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesInformacionLaboral = new JButtonMe();
		//this.jButtonSiguientesInformacionLaboral.setText(">>");
        this.jButtonSiguientesInformacionLaboral.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesInformacionLaboral,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosInformacionLaboral = new JButtonMe();
		this.jButtonNuevoGuardarCambiosInformacionLaboral.setText("Nue");
        this.jButtonNuevoGuardarCambiosInformacionLaboral.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosInformacionLaboral,"nuevoguardarcambios_button","Nue",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosInformacionLaboral";
		inputMap = this.jButtonNuevoGuardarCambiosInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosInformacionLaboral"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionInformacionLaboral";
		inputMap = this.jButtonRecargarInformacionInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionInformacionLaboral"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesInformacionLaboral";
		inputMap = this.jButtonSiguientesInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesInformacionLaboral"));
		
		//ANTERIORES		
		sMapKey = "AnterioresInformacionLaboral";
		inputMap = this.jButtonAnterioresInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresInformacionLaboral"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasInformacionLaboral();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesInformacionLaboral.setMinimumSize(new Dimension(this.getWidth(),InformacionLaboralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionLaboralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInformacionLaboral.setMaximumSize(new Dimension(this.getWidth(),InformacionLaboralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionLaboralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInformacionLaboral.setPreferredSize(new Dimension(this.getWidth(),InformacionLaboralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionLaboralBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionInformacionLaboral = new GridBagLayout();

			this.jPanelPaginacionInformacionLaboral.setLayout(gridaBagLayoutPaginacionInformacionLaboral);						
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = 0;
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionInformacionLaboral.add(this.jButtonAnterioresInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
					
						
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInformacionLaboral.gridy = 0;
			
			this.jPanelPaginacionInformacionLaboral.add(this.jButtonNuevoGuardarCambiosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
						
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInformacionLaboral.gridy = 0;
			this.jPanelPaginacionInformacionLaboral.add(this.jButtonSiguientesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = 1;
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionLaboral.add(this.jButtonNuevoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
						
			
			
			if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
				this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsInformacionLaboral.gridy = 1;
				this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionInformacionLaboral.add(this.jButtonGuardarCambiosTablaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			}
			
			
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = 1;
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionLaboral.add(this.jButtonDuplicarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = 1;
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionLaboral.add(this.jButtonCopiarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = 1;
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionLaboral.add(this.jButtonVerFormInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = 1;
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionInformacionLaboral.add(this.jButtonCerrarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
		
		
		this.jButtonRecargarInformacionInformacionLaboral.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInformacionLaboral.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInformacionLaboral.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesInformacionLaboral.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInformacionLaboral.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInformacionLaboral.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesInformacionLaboral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInformacionLaboral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInformacionLaboral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesInformacionLaboral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInformacionLaboral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInformacionLaboral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionInformacionLaboral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInformacionLaboral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInformacionLaboral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesInformacionLaboral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInformacionLaboral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInformacionLaboral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesInformacionLaboral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionLaboral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionLaboral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarInformacionLaboral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInformacionLaboral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInformacionLaboral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaInformacionLaboral.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInformacionLaboral.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInformacionLaboral.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteInformacionLaboral.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInformacionLaboral.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInformacionLaboral.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosInformacionLaboral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInformacionLaboral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInformacionLaboral.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosInformacionLaboral.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInformacionLaboral.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInformacionLaboral.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesInformacionLaboral = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesInformacionLaboral = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1InformacionLaboral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2InformacionLaboral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3InformacionLaboral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4InformacionLaboral = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesInformacionLaboral.setLayout(gridaBagParametrosReportesInformacionLaboral);
			this.jPanelParametrosReportesAccionesInformacionLaboral.setLayout(gridaBagParametrosReportesAccionesInformacionLaboral);
			
			
			this.jPanelParametrosAuxiliar1InformacionLaboral.setLayout(gridaBagParametrosAuxiliar1InformacionLaboral);
			this.jPanelParametrosAuxiliar2InformacionLaboral.setLayout(gridaBagParametrosAuxiliar2InformacionLaboral);
			this.jPanelParametrosAuxiliar3InformacionLaboral.setLayout(gridaBagParametrosAuxiliar3InformacionLaboral);
			this.jPanelParametrosAuxiliar4InformacionLaboral.setLayout(gridaBagParametrosAuxiliar4InformacionLaboral);
			//this.jPanelParametrosAuxiliar5InformacionLaboral.setLayout(gridaBagParametrosAuxiliar2InformacionLaboral);			
			
			
			
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionLaboral.add(this.jButtonRecargarInformacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionLaboral.add(this.jComboBoxTiposPaginacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionLaboral.add(this.jCheckBoxConAltoMaximoTablaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionLaboral.add(this.jComboBoxTiposArchivosReportesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionLaboral.add(this.jPanelParametrosAuxiliar1InformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionLaboral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4InformacionLaboral.add(this.jComboBoxTiposReportesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionLaboral.add(this.jPanelParametrosAuxiliar4InformacionLaboral, this.gridBagConstraintsInformacionLaboral);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionLaboral.add(this.jComboBoxTiposReportesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionLaboral.add(this.jCheckBoxGenerarReporteInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionLaboral.add(this.jPanelParametrosAuxiliar2InformacionLaboral, this.gridBagConstraintsInformacionLaboral);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionLaboral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionLaboral.add(this.jLabelAccionesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
				this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesInformacionLaboral.add(this.jButtonAbrirOrderByInformacionLaboral, this.gridBagConstraintsInformacionLaboral);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionLaboral.add(this.jComboBoxTiposSeleccionarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
			
			
			/*
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionLaboral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionLaboral.add(this.jCheckBoxSeleccionarTodosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionLaboral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformacionLaboral.add(this.jCheckBoxSeleccionarTodosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);															
				
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionLaboral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformacionLaboral.add(this.jCheckBoxSeleccionadosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionLaboral.add(this.jPanelParametrosAuxiliar3InformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionLaboral.add(this.jComboBoxTiposAccionesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
	
				
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionLaboral.add(this.jTextFieldValorCampoGeneralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosInformacionLaboral = new GridBagLayout();

			this.jScrollPanelDatosInformacionLaboral.setLayout(gridaBagLayoutDatosInformacionLaboral);
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = 0;
			this.gridBagConstraintsInformacionLaboral.gridx = 0;
			
			this.jScrollPanelDatosInformacionLaboral.add(this.jTableDatosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosInformacionLaboral.setViewportView(this.jTableDatosInformacionLaboral);
		this.jTableDatosInformacionLaboral.setFillsViewportHeight(true);
		this.jTableDatosInformacionLaboral.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesInformacionLaboral= new GridBagLayout();
		this.jPanelAccionesInformacionLaboral.setLayout(gridaBagLayoutAccionesInformacionLaboral);
		
		
		/*	
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 0;
			
		this.jPanelAccionesInformacionLaboral.add(this.jButtonNuevoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadInformacionLaboral= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadInformacionLaboral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadInformacionLaboral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadInformacionLaboral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadInformacionLaboral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadInformacionLaboral.setLayout(gridaBagLayoutFK_IdCiudadInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 0;
		jPanelFK_IdCiudadInformacionLaboral.add(jLabelidciudadFK_IdCiudadInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 1;
		jPanelFK_IdCiudadInformacionLaboral.add(jComboBoxidciudadFK_IdCiudadInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 1;
		gridBagConstraintsInformacionLaboral.gridx =1;
		jPanelFK_IdCiudadInformacionLaboral.add(jButtonFK_IdCiudadInformacionLaboral, gridBagConstraintsInformacionLaboral);

		jTabbedPaneBusquedasInformacionLaboral.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadInformacionLaboral);
		jTabbedPaneBusquedasInformacionLaboral.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteInformacionLaboral= new GridBagLayout();
		gridaBagLayoutFK_IdClienteInformacionLaboral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteInformacionLaboral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteInformacionLaboral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteInformacionLaboral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteInformacionLaboral.setLayout(gridaBagLayoutFK_IdClienteInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 0;
		jPanelFK_IdClienteInformacionLaboral.add(jLabelidclienteFK_IdClienteInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 1;
		jPanelFK_IdClienteInformacionLaboral.add(jComboBoxidclienteFK_IdClienteInformacionLaboral, gridBagConstraintsInformacionLaboral);


		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.EAST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 0;
		jPanelFK_IdClienteInformacionLaboral.add(this.jButtonBuscarFK_IdClienteidclienteInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 1;
		gridBagConstraintsInformacionLaboral.gridx =1;
		jPanelFK_IdClienteInformacionLaboral.add(jButtonFK_IdClienteInformacionLaboral, gridBagConstraintsInformacionLaboral);

		jTabbedPaneBusquedasInformacionLaboral.addTab("2.-Por Cliente ", jPanelFK_IdClienteInformacionLaboral);
		jTabbedPaneBusquedasInformacionLaboral.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisInformacionLaboral= new GridBagLayout();
		gridaBagLayoutFK_IdPaisInformacionLaboral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisInformacionLaboral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisInformacionLaboral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisInformacionLaboral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisInformacionLaboral.setLayout(gridaBagLayoutFK_IdPaisInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 0;
		jPanelFK_IdPaisInformacionLaboral.add(jLabelid_paisFK_IdPaisInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 1;
		jPanelFK_IdPaisInformacionLaboral.add(jComboBoxid_paisFK_IdPaisInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 1;
		gridBagConstraintsInformacionLaboral.gridx =1;
		jPanelFK_IdPaisInformacionLaboral.add(jButtonFK_IdPaisInformacionLaboral, gridBagConstraintsInformacionLaboral);

		jTabbedPaneBusquedasInformacionLaboral.addTab("3.-Por Pais ", jPanelFK_IdPaisInformacionLaboral);
		jTabbedPaneBusquedasInformacionLaboral.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoEmpresaInformacionLaboral= new GridBagLayout();
		gridaBagLayoutFK_IdTipoEmpresaInformacionLaboral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoEmpresaInformacionLaboral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoEmpresaInformacionLaboral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoEmpresaInformacionLaboral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoEmpresaInformacionLaboral.setLayout(gridaBagLayoutFK_IdTipoEmpresaInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 0;
		jPanelFK_IdTipoEmpresaInformacionLaboral.add(jLabelidvalorempresaFK_IdTipoEmpresaInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 1;
		jPanelFK_IdTipoEmpresaInformacionLaboral.add(jComboBoxidvalorempresaFK_IdTipoEmpresaInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 1;
		gridBagConstraintsInformacionLaboral.gridx =1;
		jPanelFK_IdTipoEmpresaInformacionLaboral.add(jButtonFK_IdTipoEmpresaInformacionLaboral, gridBagConstraintsInformacionLaboral);

		jTabbedPaneBusquedasInformacionLaboral.addTab("4.-Por Tipo Empresa ", jPanelFK_IdTipoEmpresaInformacionLaboral);
		jTabbedPaneBusquedasInformacionLaboral.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdValorClienteAreaLaboralInformacionLaboral= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteAreaLaboralInformacionLaboral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteAreaLaboralInformacionLaboral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteAreaLaboralInformacionLaboral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteAreaLaboralInformacionLaboral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteAreaLaboralInformacionLaboral.setLayout(gridaBagLayoutFK_IdValorClienteAreaLaboralInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 0;
		jPanelFK_IdValorClienteAreaLaboralInformacionLaboral.add(jLabelidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 1;
		jPanelFK_IdValorClienteAreaLaboralInformacionLaboral.add(jComboBoxidvalorclientearealaboralFK_IdValorClienteAreaLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 1;
		gridBagConstraintsInformacionLaboral.gridx =1;
		jPanelFK_IdValorClienteAreaLaboralInformacionLaboral.add(jButtonFK_IdValorClienteAreaLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		jTabbedPaneBusquedasInformacionLaboral.addTab("5.-Por Tipo Area Labo ", jPanelFK_IdValorClienteAreaLaboralInformacionLaboral);
		jTabbedPaneBusquedasInformacionLaboral.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdValorClienteCargoLaboralInformacionLaboral= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteCargoLaboralInformacionLaboral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteCargoLaboralInformacionLaboral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteCargoLaboralInformacionLaboral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteCargoLaboralInformacionLaboral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteCargoLaboralInformacionLaboral.setLayout(gridaBagLayoutFK_IdValorClienteCargoLaboralInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 0;
		jPanelFK_IdValorClienteCargoLaboralInformacionLaboral.add(jLabelidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 1;
		jPanelFK_IdValorClienteCargoLaboralInformacionLaboral.add(jComboBoxidvalorclientecargolaboralFK_IdValorClienteCargoLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 1;
		gridBagConstraintsInformacionLaboral.gridx =1;
		jPanelFK_IdValorClienteCargoLaboralInformacionLaboral.add(jButtonFK_IdValorClienteCargoLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		jTabbedPaneBusquedasInformacionLaboral.addTab("6.-Por Tipo Cargo Labo ", jPanelFK_IdValorClienteCargoLaboralInformacionLaboral);
		jTabbedPaneBusquedasInformacionLaboral.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdValorClienteRelacionLaboralInformacionLaboral= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteRelacionLaboralInformacionLaboral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteRelacionLaboralInformacionLaboral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteRelacionLaboralInformacionLaboral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteRelacionLaboralInformacionLaboral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral.setLayout(gridaBagLayoutFK_IdValorClienteRelacionLaboralInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 0;
		jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral.add(jLabelidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 0;
		gridBagConstraintsInformacionLaboral.gridx = 1;
		jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral.add(jComboBoxidvalorclienterelacionlaboralFK_IdValorClienteRelacionLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionLaboral.gridy = 1;
		gridBagConstraintsInformacionLaboral.gridx =1;
		jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral.add(jButtonFK_IdValorClienteRelacionLaboralInformacionLaboral, gridBagConstraintsInformacionLaboral);

		jTabbedPaneBusquedasInformacionLaboral.addTab("7.-Por Tipo Rela Labo ", jPanelFK_IdValorClienteRelacionLaboralInformacionLaboral);
		jTabbedPaneBusquedasInformacionLaboral.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInformacionLaboral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInformacionLaboral);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();						
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionLaboral.gridx = 0;		
			//this.gridBagConstraintsInformacionLaboral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInformacionLaboral.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;
		this.gridBagConstraintsInformacionLaboral.gridx = 0;		
		//this.gridBagConstraintsInformacionLaboral.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsInformacionLaboral.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsInformacionLaboral);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionLaboral.gridx = 0;		
			this.gridBagConstraintsInformacionLaboral.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsInformacionLaboral.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasInformacionLaboral, this.gridBagConstraintsInformacionLaboral);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);								
		
		
		/*
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		*/		
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInformacionLaboral.gridx =0;
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInformacionLaboral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
				
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosInformacionLaboral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInformacionLaboral = new GridBagLayout();
			this.jPanelBusquedasParametrosInformacionLaboral.setLayout(gridaBagLayoutBusquedasParametrosInformacionLaboral);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralInformacionLaboral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInformacionLaboral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionLaboral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionLaboral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			
			
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
			
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralInformacionLaboral;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoInformacionLaboral() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoInformacionLaboral = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoInformacionLaboral.setName("jPanelReporteDinamicoInformacionLaboral"); 
		
		this.jPanelReporteDinamicoInformacionLaboral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInformacionLaboral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInformacionLaboral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoInformacionLaboral.setLayout(gridaBagLayoutReporteDinamicoInformacionLaboral);
		
		
		this.jInternalFrameReporteDinamicoInformacionLaboral= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoInformacionLaboral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInformacionLaboral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoInformacionLaboral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoInformacionLaboral.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoInformacionLaboral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoInformacionLaboral.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoInformacionLaboral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoInformacionLaboral.setResizable(true);
	    this.jInternalFrameReporteDinamicoInformacionLaboral.setClosable(true);
	    this.jInternalFrameReporteDinamicoInformacionLaboral.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoInformacionLaboral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInformacionLaboral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInformacionLaboral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Laborales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteInformacionLaboral = new JLabelMe();

		this.jLabelColumnasSelectReporteInformacionLaboral.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoInformacionLaboral.add(this.jLabelColumnasSelectReporteInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteInformacionLaboral = new JList<Reporte>();
		this.jListColumnasSelectReporteInformacionLaboral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteInformacionLaboral.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteInformacionLaboral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInformacionLaboral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInformacionLaboral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteInformacionLaboral=new JScrollPane(this.jListColumnasSelectReporteInformacionLaboral);
			
			this.jScrollColumnasSelectReporteInformacionLaboral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInformacionLaboral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInformacionLaboral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoInformacionLaboral.add(this.jListColumnasSelectReporteInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		this.jPanelReporteDinamicoInformacionLaboral.add(this.jScrollColumnasSelectReporteInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteInformacionLaboral = new JLabelMe();

		this.jLabelRelacionesSelectReporteInformacionLaboral.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteInformacionLaboral = new JList<Reporte>();
		this.jListRelacionesSelectReporteInformacionLaboral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteInformacionLaboral.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteInformacionLaboral.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInformacionLaboral.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInformacionLaboral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteInformacionLaboral=new JScrollPane(this.jListRelacionesSelectReporteInformacionLaboral);
			
			this.jScrollRelacionesSelectReporteInformacionLaboral.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInformacionLaboral.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInformacionLaboral.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoInformacionLaboral = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoInformacionLaboral = new JComboBoxMe();
		this.jListColumnasValoresGraficoInformacionLaboral = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoInformacionLaboral = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoInformacionLaboral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoInformacionLaboral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInformacionLaboral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInformacionLaboral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoInformacionLaboral = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoInformacionLaboral.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoInformacionLaboral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInformacionLaboral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInformacionLaboral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoInformacionLaboral = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoInformacionLaboral.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionLaboral.add(this.jLabelGenerarExcelReporteDinamicoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoInformacionLaboral = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoInformacionLaboral.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoInformacionLaboral,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoInformacionLaboral.setToolTipText("Generar EXCEL"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoInformacionLaboral.add(this.jButtonGenerarExcelReporteDinamicoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionLaboral.add(this.jComboBoxTiposReportesDinamicoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoInformacionLaboral = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoInformacionLaboral.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionLaboral.add(this.jLabelTiposArchivoReporteDinamicoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionLaboral.add(this.jComboBoxTiposArchivosReportesDinamicoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoInformacionLaboral = new JButtonMe();
		this.jButtonGenerarReporteDinamicoInformacionLaboral.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoInformacionLaboral,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoInformacionLaboral.setToolTipText("Generar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionLaboral.add(this.jButtonGenerarReporteDinamicoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoInformacionLaboral = new JButtonMe();
		this.jButtonCerrarReporteDinamicoInformacionLaboral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoInformacionLaboral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoInformacionLaboral.setToolTipText("Cancelar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionLaboral.add(this.jButtonCerrarReporteDinamicoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalInformacionLaboral = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoInformacionLaboral= new JScrollPane(jPanelReporteDinamicoInformacionLaboral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoInformacionLaboral.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInformacionLaboral.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInformacionLaboral.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Laborales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsInformacionLaboral.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoInformacionLaboral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoInformacionLaboral.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalInformacionLaboral);
		this.jInternalFrameReporteDinamicoInformacionLaboral.getContentPane().add(this.jScrollPanelReporteDinamicoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionInformacionLaboral() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionInformacionLaboral = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionInformacionLaboral.setName("jPanelImportacionInformacionLaboral"); 
		
		this.jPanelImportacionInformacionLaboral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInformacionLaboral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInformacionLaboral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionInformacionLaboral.setLayout(gridaBagLayoutImportacionInformacionLaboral);
		
		
		this.jInternalFrameImportacionInformacionLaboral= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionInformacionLaboral= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionInformacionLaboral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInformacionLaboral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionInformacionLaboral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInformacionLaboral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInformacionLaboral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionInformacionLaboral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInformacionLaboral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInformacionLaboral.setResizable(true);
	    this.jInternalFrameImportacionInformacionLaboral.setClosable(true);
	    this.jInternalFrameImportacionInformacionLaboral.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionInformacionLaboral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInformacionLaboral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInformacionLaboral.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionInformacionLaboral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInformacionLaboral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInformacionLaboral.setResizable(true);
	    this.jInternalFrameImportacionInformacionLaboral.setClosable(true);
	    this.jInternalFrameImportacionInformacionLaboral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionInformacionLaboral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInformacionLaboral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInformacionLaboral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Laborales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionInformacionLaboral = new JLabelMe();

		this.jLabelArchivoImportacionInformacionLaboral.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYImportacion;		
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInformacionLaboral.add(this.jLabelArchivoImportacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionInformacionLaboral = new JFileChooser();		
		this.jFileChooserImportacionInformacionLaboral.setToolTipText("ESCOGER ARCHIVO"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionInformacionLaboral = new JButtonMe();
		this.jButtonAbrirImportacionInformacionLaboral.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionInformacionLaboral,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionInformacionLaboral.setToolTipText("Generar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionLaboral.add(this.jButtonAbrirImportacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionInformacionLaboral = new JLabelMe();

		this.jLabelPathArchivoImportacionInformacionLaboral.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYImportacion;		
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInformacionLaboral.add(this.jLabelPathArchivoImportacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionInformacionLaboral=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionInformacionLaboral.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInformacionLaboral.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInformacionLaboral.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionLaboral.add(this.jTextFieldPathArchivoImportacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionInformacionLaboral = new JButtonMe();
		this.jButtonGenerarImportacionInformacionLaboral.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionInformacionLaboral,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionInformacionLaboral.setToolTipText("Generar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionLaboral.add(this.jButtonGenerarImportacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionInformacionLaboral = new JButtonMe();
		this.jButtonCerrarImportacionInformacionLaboral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionInformacionLaboral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionInformacionLaboral.setToolTipText("Cancelar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionLaboral.add(this.jButtonCerrarImportacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalInformacionLaboral = new GridBagLayout();
		
		this.jScrollPanelImportacionInformacionLaboral= new JScrollPane(jPanelImportacionInformacionLaboral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy =iPosYImportacion;
		this.gridBagConstraintsInformacionLaboral.gridx =iPosXImportacion;
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionInformacionLaboral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionInformacionLaboral.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalInformacionLaboral);
		this.jInternalFrameImportacionInformacionLaboral.getContentPane().add(this.jScrollPanelImportacionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByInformacionLaboral(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByInformacionLaboral = new JButtonMe();
			this.jButtonAbrirOrderByInformacionLaboral.setText("Orden");
			this.jButtonAbrirOrderByInformacionLaboral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInformacionLaboral,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByInformacionLaboral";
			inputMap = this.jButtonAbrirOrderByInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByInformacionLaboral"));
		
		
			GridBagLayout gridaBagLayoutOrderByInformacionLaboral = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByInformacionLaboral.setName("jPanelOrderByInformacionLaboral"); 
			
			this.jPanelOrderByInformacionLaboral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInformacionLaboral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInformacionLaboral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByInformacionLaboral.setLayout(gridaBagLayoutOrderByInformacionLaboral);
			
			
			this.jTableDatosInformacionLaboralOrderBy = new JTableMe();        
			this.jTableDatosInformacionLaboralOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosInformacionLaboralOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosInformacionLaboralOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosInformacionLaboralOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosInformacionLaboralOrderBy.setViewportView(this.jTableDatosInformacionLaboralOrderBy);
			this.jTableDatosInformacionLaboralOrderBy.setFillsViewportHeight(true);
			this.jTableDatosInformacionLaboralOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByInformacionLaboral= new OrderByJInternalFrame();
			this.jInternalFrameOrderByInformacionLaboral= new OrderByJInternalFrame();
			this.jScrollPanelOrderByInformacionLaboral = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteInformacionLaboral= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByInformacionLaboral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByInformacionLaboral.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByInformacionLaboral.setTitle("Orden");
			this.jInternalFrameOrderByInformacionLaboral.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByInformacionLaboral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByInformacionLaboral.setResizable(true);
			this.jInternalFrameOrderByInformacionLaboral.setClosable(true);
			this.jInternalFrameOrderByInformacionLaboral.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByInformacionLaboral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInformacionLaboral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInformacionLaboral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Laborales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy =iPosYOrderBy++;
			this.gridBagConstraintsInformacionLaboral.gridx =iPosXOrderBy;
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsInformacionLaboral.ipady =150;
				
			this.jPanelOrderByInformacionLaboral.add(jScrollPanelDatosInformacionLaboralOrderBy, this.gridBagConstraintsInformacionLaboral);//this.jTableDatosInformacionLaboralTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByInformacionLaboral = new JButtonMe();
			this.jButtonCerrarOrderByInformacionLaboral.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByInformacionLaboral,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByInformacionLaboral.setToolTipText("Cancelar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.gridy = iPosYOrderBy++;
			this.gridBagConstraintsInformacionLaboral.gridx = iPosXOrderBy;
									
			this.jPanelOrderByInformacionLaboral.add(this.jButtonCerrarOrderByInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalInformacionLaboral = new GridBagLayout();
			
			this.jScrollPanelOrderByInformacionLaboral= new JScrollPane(jPanelOrderByInformacionLaboral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy =iPosYOrderBy;
			this.gridBagConstraintsInformacionLaboral.gridx =iPosXOrderBy;
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByInformacionLaboral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByInformacionLaboral.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalInformacionLaboral);
			
			this.jInternalFrameOrderByInformacionLaboral.getContentPane().add(this.jScrollPanelOrderByInformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
		
		} else {
			this.jButtonAbrirOrderByInformacionLaboral = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.informacionlaboralSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosInformacionLaboral.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosInformacionLaboral.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosInformacionLaboral.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosInformacionLaboral.getRowHeight();//InformacionLaboralConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > InformacionLaboralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInformacionLaboral.isSelected()) {
					iHeightTable=InformacionLaboralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InformacionLaboralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InformacionLaboralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > InformacionLaboralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInformacionLaboral.isSelected()) {
					iHeightTable=InformacionLaboralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InformacionLaboralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InformacionLaboralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosInformacionLaboral.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInformacionLaboral.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInformacionLaboral.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosInformacionLaboral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInformacionLaboral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInformacionLaboral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByInformacionLaboral!=null && this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy()!=null) {
			//if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByInformacionLaboral.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByInformacionLaboral.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByInformacionLaboral.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByInformacionLaboral.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosInformacionLaboral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInformacionLaboral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInformacionLaboral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=informacionlaboralLogic.getInformacionLaborals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacionlaborals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<InformacionLaboral> TraerInformacionLaboralBeans(List<InformacionLaboral> informacionlaborals,ArrayList<Classe> classes)throws Exception {
		try {
			for(InformacionLaboral informacionlaboral:informacionlaborals) {
					
				if(!(InformacionLaboralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || InformacionLaboralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					informacionlaboral.setsDetalleGeneralEntityReporte(InformacionLaboralConstantesFunciones.getInformacionLaboralDescripcion(informacionlaboral));
										
					informacionlaboral.setesactivo_descripcion(InformacionLaboralConstantesFunciones.getesactivoDescripcion(informacionlaboral));	
					
						
					
				} else  {
							
					//informacionlaboral.setsDetalleGeneralEntityReporte(informacionlaboral.getsDetalleGeneralEntityReporte());
										
				}
				
				//informacionlaboralbeans.add(informacionlaboralbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return informacionlaborals;
    }
	//PARA REPORTES FIN
}
