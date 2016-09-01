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
import com.bydan.erp.cartera.util.ReferenciaComercialConstantesFunciones;

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
public class ReferenciaComercialJInternalFrame extends ReferenciaComercialBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarReferenciaComercial;
	
	protected JMenuBar jmenuBarReferenciaComercial;
	
	protected JMenu jmenuReferenciaComercial;
	protected JMenu jmenuDatosReferenciaComercial;
	protected JMenu jmenuArchivoReferenciaComercial;
	protected JMenu jmenuAccionesReferenciaComercial;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReferenciaComercial;	
	protected GridBagConstraints gridBagConstraintsReferenciaComercial;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ReferenciaComercialDetalleFormJInternalFrame jInternalFrameDetalleFormReferenciaComercial;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoReferenciaComercial;	
	protected ImportacionJInternalFrame jInternalFrameImportacionReferenciaComercial;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoSectorEconoBeanSwingJInternalFrame tiposectoreconoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiposectorecono="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovaloracion="";
	
	public ReferenciaComercialSessionBean referenciacomercialSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoSectorEconoSessionBean tiposectoreconoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public TipoValoracionSessionBean tipovaloracionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ReferenciaComercial> referenciacomercials;		
	public List<ReferenciaComercial> referenciacomercialsEliminados;	
	public List<ReferenciaComercial> referenciacomercialsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByReferenciaComercial;		
	protected JButton jButtonAbrirOrderByReferenciaComercial;
	
	
	//protected JPanel jPanelOrderByReferenciaComercial;
	//public JScrollPane jScrollPanelOrderByReferenciaComercial;	
	//protected JButton jButtonCerrarOrderByReferenciaComercial;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ReferenciaComercialLogic referenciacomercialLogic;
	
	
	
	public JScrollPane jScrollPanelDatosReferenciaComercial;
	public JScrollPane jScrollPanelDatosEdicionReferenciaComercial;
	public JScrollPane jScrollPanelDatosGeneralReferenciaComercial;
    
	
	
	//public JScrollPane jScrollPanelDatosReferenciaComercialOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoReferenciaComercial;
	//public JScrollPane jScrollPanelImportacionReferenciaComercial;
	
	
	
	protected JPanel jPanelAccionesReferenciaComercial;
	
    protected JPanel jPanelPaginacionReferenciaComercial;
    protected JPanel jPanelParametrosReportesReferenciaComercial;
	protected JPanel jPanelParametrosReportesAccionesReferenciaComercial;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ReferenciaComercial;
	protected JPanel jPanelParametrosAuxiliar2ReferenciaComercial;
	protected JPanel jPanelParametrosAuxiliar3ReferenciaComercial;
	protected JPanel jPanelParametrosAuxiliar4ReferenciaComercial;
	//protected JPanel jPanelParametrosAuxiliar5ReferenciaComercial;
	
	
	
	//protected JPanel jPanelReporteDinamicoReferenciaComercial;
	//protected JPanel jPanelImportacionReferenciaComercial;
	
	
	public JTable jTableDatosReferenciaComercial;
	
	
	
	//public JTable jTableDatosReferenciaComercialOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoReferenciaComercial;
	protected JButton jButtonDuplicarReferenciaComercial;
	protected JButton jButtonCopiarReferenciaComercial;
	protected JButton jButtonVerFormReferenciaComercial;
	protected JButton jButtonNuevoRelacionesReferenciaComercial;
	protected JButton jButtonModificarReferenciaComercial;
	
    protected JButton jButtonGuardarCambiosTablaReferenciaComercial;
	protected JButton jButtonCerrarReferenciaComercial;
	
	
	protected JButton jButtonRecargarInformacionReferenciaComercial;
	protected JButton jButtonProcesarInformacionReferenciaComercial;
	
	
	protected JButton jButtonAnterioresReferenciaComercial;
	protected JButton jButtonSiguientesReferenciaComercial;
	protected JButton jButtonNuevoGuardarCambiosReferenciaComercial;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoReferenciaComercial;
	//protected JButton jButtonCerrarReporteDinamicoReferenciaComercial;
	//protected JButton jButtonGenerarExcelReporteDinamicoReferenciaComercial;	
	
	
	
	//protected JButton jButtonAbrirImportacionReferenciaComercial;
	//protected JButton jButtonGenerarImportacionReferenciaComercial;
	//protected JButton jButtonCerrarImportacionReferenciaComercial;
	//protected JFileChooser jFileChooserImportacionReferenciaComercial;
	//protected File fileImportacionReferenciaComercial;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReferenciaComercial;
	protected JButton jButtonDuplicarToolBarReferenciaComercial;
	protected JButton jButtonNuevoRelacionesToolBarReferenciaComercial;
	
	
	public JButton jButtonGuardarCambiosToolBarReferenciaComercial;
	protected JButton jButtonCopiarToolBarReferenciaComercial;
	protected JButton jButtonVerFormToolBarReferenciaComercial;
	public JButton jButtonGuardarCambiosTablaToolBarReferenciaComercial;
	protected JButton jButtonMostrarOcultarTablaToolBarReferenciaComercial;
	protected JButton jButtonCerrarToolBarReferenciaComercial;
	
	protected JButton jButtonRecargarInformacionToolBarReferenciaComercial;
	protected JButton jButtonProcesarInformacionToolBarReferenciaComercial;
	protected JButton jButtonAnterioresToolBarReferenciaComercial;
	protected JButton jButtonSiguientesToolBarReferenciaComercial;
	protected JButton jButtonNuevoGuardarCambiosToolBarReferenciaComercial;
	protected JButton jButtonAbrirOrderByToolBarReferenciaComercial;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReferenciaComercial;
	protected JMenuItem jMenuItemDuplicarReferenciaComercial;
	protected JMenuItem jMenuItemNuevoRelacionesReferenciaComercial;
	
	
	protected JMenuItem jMenuItemGuardarCambiosReferenciaComercial;
	protected JMenuItem jMenuItemCopiarReferenciaComercial;
	protected JMenuItem jMenuItemVerFormReferenciaComercial;
	protected JMenuItem jMenuItemGuardarCambiosTablaReferenciaComercial;
	protected JMenuItem jMenuItemCerrarReferenciaComercial;
	protected JMenuItem jMenuItemDetalleCerrarReferenciaComercial;
	protected JMenuItem jMenuItemDetalleAbrirOrderByReferenciaComercial;
	protected JMenuItem jMenuItemDetalleMostarOcultarReferenciaComercial;
	
	protected JMenuItem jMenuItemRecargarInformacionReferenciaComercial;
	protected JMenuItem jMenuItemProcesarInformacionReferenciaComercial;
	protected JMenuItem jMenuItemAnterioresReferenciaComercial;
	protected JMenuItem jMenuItemSiguientesReferenciaComercial;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReferenciaComercial;
	protected JMenuItem jMenuItemAbrirOrderByReferenciaComercial;
	protected JMenuItem jMenuItemMostrarOcultarReferenciaComercial;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReferenciaComercial;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosReferenciaComercial;
	protected JCheckBox jCheckBoxSeleccionadosReferenciaComercial;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaReferenciaComercial;
	protected JCheckBox jCheckBoxConGraficoReporteReferenciaComercial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesReferenciaComercial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesReferenciaComercial;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoReferenciaComercial;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoReferenciaComercial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesReferenciaComercial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionReferenciaComercial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReferenciaComercial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReferenciaComercial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarReferenciaComercial;
	protected JTextField jTextFieldValorCampoGeneralReferenciaComercial;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteReferenciaComercial;
	//public JList<Reporte> jListColumnasSelectReporteReferenciaComercial;
	//public JScrollPane jScrollColumnasSelectReporteReferenciaComercial;
	
	//public JLabel jLabelRelacionesSelectReporteReferenciaComercial;
	//public JList<Reporte> jListRelacionesSelectReporteReferenciaComercial;
	//public JScrollPane jScrollRelacionesSelectReporteReferenciaComercial;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoReferenciaComercial;
	//protected JCheckBox jCheckBoxConGraficoDinamicoReferenciaComercial;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoReferenciaComercial;
	//public JLabel jLabelTiposArchivoReporteDinamicoReferenciaComercial;
	
		
	//public JLabel jLabelArchivoImportacionReferenciaComercial;	
	//public JLabel jLabelPathArchivoImportacionReferenciaComercial;
	//protected JTextField jTextFieldPathArchivoImportacionReferenciaComercial;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoReferenciaComercial;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoReferenciaComercial;
	
	//public JLabel jLabelColumnaCategoriaValorReferenciaComercial;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorReferenciaComercial;
	
	//public JLabel jLabelColumnasValoresGraficoReferenciaComercial;
	//public JList<Reporte> jListColumnasValoresGraficoReferenciaComercial;
	//public JScrollPane jScrollColumnasValoresGraficoReferenciaComercial;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoReferenciaComercial;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoReferenciaComercial;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasReferenciaComercial;
	public JPanel jPanelFK_IdCiudadReferenciaComercial;
	public JButton jButtonFK_IdCiudadReferenciaComercial;
	public JPanel jPanelFK_IdClienteReferenciaComercial;
	public JButton jButtonFK_IdClienteReferenciaComercial;
	public JPanel jPanelFK_IdPaisReferenciaComercial;
	public JButton jButtonFK_IdPaisReferenciaComercial;
	public JPanel jPanelFK_IdTipoValoracionReferenciaComercial;
	public JButton jButtonFK_IdTipoValoracionReferenciaComercial;
	public JPanel jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial;
	public JButton jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial;
	
	public JPanel jPanelidciudadFK_IdCiudadReferenciaComercial;
	public JLabel jLabelidciudadFK_IdCiudadReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidciudadFK_IdCiudadReferenciaComercial;
	public JButton jButtonidciudadFK_IdCiudadReferenciaComercial= new JButtonMe();
	public JButton jButtonidciudadFK_IdCiudadReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonidciudadFK_IdCiudadReferenciaComercialBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteFK_IdClienteReferenciaComercial;
	public JLabel jLabelidclienteFK_IdClienteReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteReferenciaComercial;
	public JButton jButtonidclienteFK_IdClienteReferenciaComercial= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteReferenciaComercialBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteReferenciaComercial;
	
	public JPanel jPanelid_paisFK_IdPaisReferenciaComercial;
	public JLabel jLabelid_paisFK_IdPaisReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisReferenciaComercial;
	public JButton jButtonid_paisFK_IdPaisReferenciaComercial= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisReferenciaComercialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial;
	public JLabel jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial;
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial= new JButtonMe();
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionReferenciaComercialBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial;
	public JLabel jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial;
	public JButton jButtonidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial= new JButtonMe();
	public JButton jButtonidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercialBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ReferenciaComercialJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaComercialJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaComercialJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaComercialJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionReferenciaComercial)	{
		this.jButtonRecargarInformacionReferenciaComercial = jButtonRecargarInformacionReferenciaComercial;
	}
	
	public JButton getjButtonProcesarInformacionReferenciaComercial() {
		return this.jButtonProcesarInformacionReferenciaComercial;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReferenciaComercial)	{
		this.jButtonProcesarInformacionReferenciaComercial = jButtonProcesarInformacionReferenciaComercial;
	}
	
	
	public JButton getjButtonRecargarInformacionReferenciaComercial() {
		return this.jButtonRecargarInformacionReferenciaComercial;
	}
	
	
	public List<ReferenciaComercial> getreferenciacomercials() {
		return this.referenciacomercials;
	}

	public void setreferenciacomercials(List<ReferenciaComercial> referenciacomercials) {
		this.referenciacomercials = referenciacomercials;
	}
	
	public List<ReferenciaComercial> getreferenciacomercialsAux() {
		return this.referenciacomercialsAux;
	}

	public void setreferenciacomercialsAux(List<ReferenciaComercial> referenciacomercialsAux) {
		this.referenciacomercialsAux = referenciacomercialsAux;
	}
	
	public List<ReferenciaComercial> getreferenciacomercialsEliminados() {
		return this.referenciacomercialsEliminados;
	}

	public void setReferenciaComercialsEliminados(List<ReferenciaComercial> referenciacomercialsEliminados) {
		this.referenciacomercialsEliminados = referenciacomercialsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarReferenciaComercial() {
		return jComboBoxTiposSeleccionarReferenciaComercial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarReferenciaComercial(
			JComboBox jComboBoxTiposSeleccionarReferenciaComercial) {
		this.jComboBoxTiposSeleccionarReferenciaComercial = jComboBoxTiposSeleccionarReferenciaComercial;
	}
	
	public void setBorderResaltarTiposSeleccionarReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarReferenciaComercial .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralReferenciaComercial() {
		return jTextFieldValorCampoGeneralReferenciaComercial;
	}

	public void setjTextFieldValorCampoGeneralReferenciaComercial(
			JTextField jTextFieldValorCampoGeneralReferenciaComercial) {
		this.jTextFieldValorCampoGeneralReferenciaComercial = jTextFieldValorCampoGeneralReferenciaComercial;
	}

	public void setBorderResaltarValorCampoGeneralReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralReferenciaComercial .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosReferenciaComercial() {
		return this.jCheckBoxSeleccionarTodosReferenciaComercial;
	}

	public void setjCheckBoxSeleccionarTodosReferenciaComercial(
			JCheckBox jCheckBoxSeleccionarTodosReferenciaComercial) {
		this.jCheckBoxSeleccionarTodosReferenciaComercial = jCheckBoxSeleccionarTodosReferenciaComercial;
	}

	public void setBorderResaltarSeleccionarTodosReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosReferenciaComercial .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosReferenciaComercial() {
		return this.jCheckBoxSeleccionadosReferenciaComercial;
	}

	public void setjCheckBoxSeleccionadosReferenciaComercial(
			JCheckBox jCheckBoxSeleccionadosReferenciaComercial) {
		this.jCheckBoxSeleccionadosReferenciaComercial = jCheckBoxSeleccionadosReferenciaComercial;
	}
	
	public void setBorderResaltarSeleccionadosReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosReferenciaComercial .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesReferenciaComercial() {
		return this.jComboBoxTiposArchivosReportesReferenciaComercial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesReferenciaComercial(
			JComboBox jComboBoxTiposArchivosReportesReferenciaComercial) {
		this.jComboBoxTiposArchivosReportesReferenciaComercial = jComboBoxTiposArchivosReportesReferenciaComercial;
	}

	public void setBorderResaltarTiposArchivosReportesReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesReferenciaComercial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesReferenciaComercial() {
		return this.jComboBoxTiposReportesReferenciaComercial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesReferenciaComercial(
			JComboBox jComboBoxTiposReportesReferenciaComercial) {
		this.jComboBoxTiposReportesReferenciaComercial = jComboBoxTiposReportesReferenciaComercial;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoReferenciaComercial() {
	//	return jComboBoxTiposReportesDinamicoReferenciaComercial;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoReferenciaComercial(
	//		JComboBox jComboBoxTiposReportesDinamicoReferenciaComercial) {
	//	this.jComboBoxTiposReportesDinamicoReferenciaComercial = jComboBoxTiposReportesDinamicoReferenciaComercial;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoReferenciaComercial() {
	//	return jComboBoxTiposArchivosReportesDinamicoReferenciaComercial;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoReferenciaComercial(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoReferenciaComercial) {
	//	this.jComboBoxTiposArchivosReportesDinamicoReferenciaComercial = jComboBoxTiposArchivosReportesDinamicoReferenciaComercial;
	//}
	
	public void setBorderResaltarTiposReportesReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesReferenciaComercial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesReferenciaComercial() {
		return this.jComboBoxTiposGraficosReportesReferenciaComercial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesReferenciaComercial(
			JComboBox jComboBoxTiposGraficosReportesReferenciaComercial) {
		this.jComboBoxTiposGraficosReportesReferenciaComercial = jComboBoxTiposGraficosReportesReferenciaComercial;
	}
	
	public void setBorderResaltarTiposGraficosReportesReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesReferenciaComercial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionReferenciaComercial() {
		return this.jComboBoxTiposPaginacionReferenciaComercial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionReferenciaComercial(
			JComboBox jComboBoxTiposPaginacionReferenciaComercial) {
		this.jComboBoxTiposPaginacionReferenciaComercial = jComboBoxTiposPaginacionReferenciaComercial;
	}
	
	public void setBorderResaltarTiposPaginacionReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionReferenciaComercial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesReferenciaComercial() {
		return this.jComboBoxTiposRelacionesReferenciaComercial;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReferenciaComercial() {
		return this.jComboBoxTiposAccionesReferenciaComercial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReferenciaComercial(
			JComboBox jComboBoxTiposRelacionesReferenciaComercial) {
		this.jComboBoxTiposRelacionesReferenciaComercial = jComboBoxTiposRelacionesReferenciaComercial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReferenciaComercial(
			JComboBox jComboBoxTiposAccionesReferenciaComercial) {
		this.jComboBoxTiposAccionesReferenciaComercial = jComboBoxTiposAccionesReferenciaComercial;
	}
	
	public void setBorderResaltarTiposRelacionesReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesReferenciaComercial .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesReferenciaComercial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesReferenciaComercial .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoReferenciaComercial() {
	//	return jCheckBoxConGraficoDinamicoReferenciaComercial;
	//}

	//public void setjCheckBoxConGraficoDinamicoReferenciaComercial(
	//		JCheckBox jCheckBoxConGraficoDinamicoReferenciaComercial) {
	//	this.jCheckBoxConGraficoDinamicoReferenciaComercial = jCheckBoxConGraficoDinamicoReferenciaComercial;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoReferenciaComercial() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarReferenciaComercial.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoReferenciaComercial .setBorder(borderResaltar);		
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
		this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		
		this.referenciacomercialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciacomercialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.referenciacomercialSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReferenciaComercialJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Referencia Comercial MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
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
		
		ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarReferenciaComercial= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"nuevo","nuevo","Nuevo"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"duplicar","duplicar","Duplicar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"copiar","copiar","Copiar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"ver_form","ver_form","Ver"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"recargar","recargar","Recargar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarReferenciaComercial,this.jTtoolBarReferenciaComercial,
							"cerrar","cerrar","Salir"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarReferenciaComercial=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarReferenciaComercial;
			
				this.jButtonProcesarInformacionToolBarReferenciaComercial=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarReferenciaComercial;
				
		//protected JButton jButtonModificarToolBarReferenciaComercial;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarReferenciaComercial=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuReferenciaComercial=new JMenuMe("General");
		this.jmenuArchivoReferenciaComercial=new JMenuMe("Archivo");
		this.jmenuAccionesReferenciaComercial=new JMenuMe("Acciones");
		this.jmenuDatosReferenciaComercial=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReferenciaComercial= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReferenciaComercial.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReferenciaComercial,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarReferenciaComercial= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarReferenciaComercial.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarReferenciaComercial,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesReferenciaComercial= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesReferenciaComercial.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesReferenciaComercial,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosReferenciaComercial= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReferenciaComercial.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReferenciaComercial,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarReferenciaComercial= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarReferenciaComercial.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarReferenciaComercial,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormReferenciaComercial= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormReferenciaComercial.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormReferenciaComercial,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaReferenciaComercial= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaReferenciaComercial.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaReferenciaComercial,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReferenciaComercial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReferenciaComercial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReferenciaComercial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionReferenciaComercial= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionReferenciaComercial.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionReferenciaComercial,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionReferenciaComercial= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionReferenciaComercial.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionReferenciaComercial,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresReferenciaComercial= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresReferenciaComercial.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresReferenciaComercial,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesReferenciaComercial= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesReferenciaComercial.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesReferenciaComercial,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByReferenciaComercial= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByReferenciaComercial.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByReferenciaComercial,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReferenciaComercial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReferenciaComercial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReferenciaComercial,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByReferenciaComercial= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByReferenciaComercial.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByReferenciaComercial,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReferenciaComercial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReferenciaComercial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReferenciaComercial,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosReferenciaComercial= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosReferenciaComercial.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosReferenciaComercial,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoReferenciaComercial.add(this.jMenuItemCerrarReferenciaComercial);
			
			this.jmenuAccionesReferenciaComercial.add(this.jMenuItemNuevoReferenciaComercial);
			this.jmenuAccionesReferenciaComercial.add(this.jMenuItemNuevoGuardarCambiosReferenciaComercial);
			this.jmenuAccionesReferenciaComercial.add(this.jMenuItemNuevoRelacionesReferenciaComercial);
			this.jmenuAccionesReferenciaComercial.add(this.jMenuItemGuardarCambiosTablaReferenciaComercial);		
			this.jmenuAccionesReferenciaComercial.add(this.jMenuItemDuplicarReferenciaComercial);		
			this.jmenuAccionesReferenciaComercial.add(this.jMenuItemCopiarReferenciaComercial);		
			this.jmenuAccionesReferenciaComercial.add(this.jMenuItemVerFormReferenciaComercial);		
			
			this.jmenuDatosReferenciaComercial.add(this.jMenuItemRecargarInformacionReferenciaComercial);				
			this.jmenuDatosReferenciaComercial.add(this.jMenuItemAnterioresReferenciaComercial);				
			this.jmenuDatosReferenciaComercial.add(this.jMenuItemSiguientesReferenciaComercial);				
			this.jmenuDatosReferenciaComercial.add(this.jMenuItemAbrirOrderByReferenciaComercial);				
			this.jmenuDatosReferenciaComercial.add(this.jMenuItemMostrarOcultarReferenciaComercial);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesReferenciaComercial.add(this.jMenuItemGuardarCambiosReferenciaComercial);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarReferenciaComercial.add(this.jmenuArchivoReferenciaComercial);		
			this.jmenuBarReferenciaComercial.add(this.jmenuAccionesReferenciaComercial);		
			this.jmenuBarReferenciaComercial.add(this.jmenuDatosReferenciaComercial);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarReferenciaComercial);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasReferenciaComercial() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadReferenciaComercial.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadReferenciaComercial= new JButtonMe();
		this.jButtonFK_IdCiudadReferenciaComercial.setText("Buscar");
		this.jButtonFK_IdCiudadReferenciaComercial.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadReferenciaComercial,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidciudadFK_IdCiudadReferenciaComercial = new JLabelMe();
		jLabelidciudadFK_IdCiudadReferenciaComercial.setText("Ciudad :");
		jLabelidciudadFK_IdCiudadReferenciaComercial.setToolTipText("Ciudad");
		jLabelidciudadFK_IdCiudadReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidciudadFK_IdCiudadReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidciudadFK_IdCiudadReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidciudadFK_IdCiudadReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidciudadFK_IdCiudadReferenciaComercial= new JComboBoxMe();
		jComboBoxidciudadFK_IdCiudadReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadFK_IdCiudadReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadFK_IdCiudadReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidciudadFK_IdCiudadReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteReferenciaComercial.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteReferenciaComercial= new JButtonMe();
		this.jButtonFK_IdClienteReferenciaComercial.setText("Buscar");
		this.jButtonFK_IdClienteReferenciaComercial.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteReferenciaComercial,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteReferenciaComercial = new JLabelMe();
		jLabelidclienteFK_IdClienteReferenciaComercial.setText("Cliente :");
		jLabelidclienteFK_IdClienteReferenciaComercial.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteReferenciaComercial= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial.setFocusable(false);

		this.jPanelFK_IdPaisReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisReferenciaComercial.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisReferenciaComercial= new JButtonMe();
		this.jButtonFK_IdPaisReferenciaComercial.setText("Buscar");
		this.jButtonFK_IdPaisReferenciaComercial.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisReferenciaComercial,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisReferenciaComercial = new JLabelMe();
		jLabelid_paisFK_IdPaisReferenciaComercial.setText("Pais :");
		jLabelid_paisFK_IdPaisReferenciaComercial.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisReferenciaComercial= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoValoracionReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoValoracionReferenciaComercial.setToolTipText("Buscar Por Tipo Valoracion ");
		this.jButtonFK_IdTipoValoracionReferenciaComercial= new JButtonMe();
		this.jButtonFK_IdTipoValoracionReferenciaComercial.setText("Buscar");
		this.jButtonFK_IdTipoValoracionReferenciaComercial.setToolTipText("Buscar Por Tipo Valoracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoValoracionReferenciaComercial,"buscar_button","Buscar Por Tipo Valoracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoValoracionReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial = new JLabelMe();
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setText("Tipo Valoracion :");
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setToolTipText("Tipo Valoracion");
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial= new JComboBoxMe();
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial.setToolTipText("Buscar Por Tipo Sector Econo ");
		this.jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial= new JButtonMe();
		this.jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial.setText("Buscar");
		this.jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial.setToolTipText("Buscar Por Tipo Sector Econo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial,"buscar_button","Buscar Por Tipo Sector Econo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial = new JLabelMe();
		jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setText("Tipo Sector Econo :");
		jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setToolTipText("Tipo Sector Econo");
		jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial= new JComboBoxMe();
		jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasReferenciaComercial=new JTabbedPane();


		this.jTabbedPaneBusquedasReferenciaComercial.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReferenciaComercial.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReferenciaComercial.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleReferenciaComercial = new ReferenciaComercialDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Referencia Comercial DATOS");
			this.jInternalFrameDetalleFormReferenciaComercial = new ReferenciaComercialDetalleFormJInternalFrame(jDesktopPane,this.referenciacomercialSessionBean.getConGuardarRelaciones(),this.referenciacomercialSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormReferenciaComercial = null;//new ReferenciaComercialDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReferenciaComercial= new GridBagLayout();
		
		
		this.jTableDatosReferenciaComercial = new JTableMe();      
		
		String sToolTipReferenciaComercial="";
		sToolTipReferenciaComercial=ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReferenciaComercial+="(Cartera.ReferenciaComercial)";
		}
		
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			sToolTipReferenciaComercial+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosReferenciaComercial.setToolTipText(sToolTipReferenciaComercial);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosReferenciaComercial);
		this.jTableDatosReferenciaComercial.setAutoCreateRowSorter(true);
		this.jTableDatosReferenciaComercial.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosReferenciaComercial.setRowSelectionAllowed(true);
		this.jTableDatosReferenciaComercial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosReferenciaComercial,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoReferenciaComercial = new JButtonMe();
		this.jButtonDuplicarReferenciaComercial = new JButtonMe();
		this.jButtonCopiarReferenciaComercial = new JButtonMe();
		this.jButtonVerFormReferenciaComercial = new JButtonMe();
		this.jButtonNuevoRelacionesReferenciaComercial = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaReferenciaComercial = new JButtonMe();
		this.jButtonCerrarReferenciaComercial = new JButtonMe();
		
		this.jScrollPanelDatosReferenciaComercial = new JScrollPane();   
        this.jScrollPanelDatosGeneralReferenciaComercial = new JScrollPane();
		
				
		
		
		this.jPanelAccionesReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Referencia Comercial";
		
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Comerciales" + this.sPath));
		} else {
			this.jScrollPanelDatosReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReferenciaComercial.setToolTipText("Acciones");
        this.jPanelAccionesReferenciaComercial.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoReferenciaComercial=new ReporteDinamicoJInternalFrame(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoReferenciaComercial();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionReferenciaComercial=new ImportacionJInternalFrame(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionReferenciaComercial();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByReferenciaComercial = new JButtonMe();
		
		this.jButtonAbrirOrderByReferenciaComercial.setText("Orden");
		this.jButtonAbrirOrderByReferenciaComercial.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReferenciaComercial,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReferenciaComercial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaComercial,false,this);
			
			//this.cargarOrderByReferenciaComercial(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReferenciaComercial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaComercial,true,this);
			
			//this.cargarOrderByReferenciaComercial(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosReferenciaComercial.setMinimumSize(new Dimension(400,50));//2030
		this.jTableDatosReferenciaComercial.setMaximumSize(new Dimension(400,50));//2030
		this.jTableDatosReferenciaComercial.setPreferredSize(new Dimension(400,50));//2030
		
		this.jScrollPanelDatosReferenciaComercial.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosReferenciaComercial.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosReferenciaComercial.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoReferenciaComercial.setText("Nuevo");
		this.jButtonDuplicarReferenciaComercial.setText("Duplicar");
		this.jButtonCopiarReferenciaComercial.setText("Copiar");
		this.jButtonVerFormReferenciaComercial.setText("Ver");
		this.jButtonNuevoRelacionesReferenciaComercial.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaReferenciaComercial.setText("Guardar");
		this.jButtonCerrarReferenciaComercial.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReferenciaComercial,"nuevo_button","Nuevo",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarReferenciaComercial,"duplicar_button","Duplicar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarReferenciaComercial,"copiar_button","Copiar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormReferenciaComercial,"ver_form","Ver",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesReferenciaComercial,"nuevorelaciones_button","Nuevo Rel",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReferenciaComercial,"guardarcambiostabla_button","Guardar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReferenciaComercial,"cerrar_button","Salir",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoReferenciaComercial.setToolTipText("Nuevo"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarReferenciaComercial.setToolTipText("Duplicar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarReferenciaComercial.setToolTipText("Copiar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormReferenciaComercial.setToolTipText("Ver"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesReferenciaComercial.setToolTipText("Nuevo Rel"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaReferenciaComercial.setToolTipText("Guardar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReferenciaComercial.setToolTipText("Salir"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReferenciaComercial";
		inputMap = this.jButtonNuevoReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReferenciaComercial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReferenciaComercial"));
		
		//DUPLICAR
		sMapKey = "DuplicarReferenciaComercial";
		inputMap = this.jButtonDuplicarReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarReferenciaComercial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarReferenciaComercial"));
		
		//COPIAR
		sMapKey = "CopiarReferenciaComercial";
		inputMap = this.jButtonCopiarReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarReferenciaComercial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarReferenciaComercial"));
		
		//VEr FORM
		sMapKey = "VerFormReferenciaComercial";
		inputMap = this.jButtonVerFormReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormReferenciaComercial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormReferenciaComercial"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesReferenciaComercial";
		inputMap = this.jButtonNuevoRelacionesReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesReferenciaComercial"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarReferenciaComercial";
		inputMap = this.jButtonModificarReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarReferenciaComercial"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarReferenciaComercial";
		inputMap = this.jButtonCerrarReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReferenciaComercial"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReferenciaComercial";
		inputMap = this.jButtonGuardarCambiosTablaReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReferenciaComercial"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ReferenciaComercial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ReferenciaComercial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ReferenciaComercial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ReferenciaComercial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ReferenciaComercial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesReferenciaComercial.setName("jPanelParametrosReportesReferenciaComercial"); 
		
		this.jPanelParametrosReportesAccionesReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesReferenciaComercial.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesReferenciaComercial.setName("jPanelParametrosReportesAccionesReferenciaComercial"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionReferenciaComercial = new JButtonMe();
		this.jButtonRecargarInformacionReferenciaComercial.setText("Recargar");
		this.jButtonRecargarInformacionReferenciaComercial.setToolTipText("Recargar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionReferenciaComercial,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionReferenciaComercial = new JButtonMe();
		this.jButtonProcesarInformacionReferenciaComercial.setText("Procesar");
		this.jButtonProcesarInformacionReferenciaComercial.setToolTipText("Procesar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionReferenciaComercial.setVisible(false);
			
		this.jButtonProcesarInformacionReferenciaComercial.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReferenciaComercial.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReferenciaComercial.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaComercial.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesReferenciaComercial.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaComercial.setText("TIPO");       
		this.jComboBoxTiposReportesReferenciaComercial.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaComercial.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesReferenciaComercial.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionReferenciaComercial.setText("Paginacion");
		this.jComboBoxTiposPaginacionReferenciaComercial.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesReferenciaComercial.setText("Accion");
		this.jComboBoxTiposRelacionesReferenciaComercial.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReferenciaComercial.setText("Accion");
		this.jComboBoxTiposAccionesReferenciaComercial.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarReferenciaComercial.setText("Accion");
		this.jComboBoxTiposSeleccionarReferenciaComercial.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralReferenciaComercial=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralReferenciaComercial.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReferenciaComercial.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReferenciaComercial.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesReferenciaComercial = new JLabelMe();
		
		this.jLabelAccionesReferenciaComercial.setText("Acciones");		
		this.jLabelAccionesReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosReferenciaComercial = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosReferenciaComercial.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosReferenciaComercial.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosReferenciaComercial = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosReferenciaComercial.setText("Seleccionados");
		this.jCheckBoxSeleccionadosReferenciaComercial.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaReferenciaComercial = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaReferenciaComercial.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaReferenciaComercial.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteReferenciaComercial = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteReferenciaComercial.setText("Graf.");
		this.jCheckBoxConGraficoReporteReferenciaComercial.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresReferenciaComercial = new JButtonMe();
		//this.jButtonAnterioresReferenciaComercial.setText("<<");
        this.jButtonAnterioresReferenciaComercial.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresReferenciaComercial,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesReferenciaComercial = new JButtonMe();
		//this.jButtonSiguientesReferenciaComercial.setText(">>");
        this.jButtonSiguientesReferenciaComercial.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesReferenciaComercial,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosReferenciaComercial = new JButtonMe();
		this.jButtonNuevoGuardarCambiosReferenciaComercial.setText("Nue");
        this.jButtonNuevoGuardarCambiosReferenciaComercial.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosReferenciaComercial,"nuevoguardarcambios_button","Nue",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosReferenciaComercial";
		inputMap = this.jButtonNuevoGuardarCambiosReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosReferenciaComercial"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionReferenciaComercial";
		inputMap = this.jButtonRecargarInformacionReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionReferenciaComercial"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesReferenciaComercial";
		inputMap = this.jButtonSiguientesReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesReferenciaComercial"));
		
		//ANTERIORES		
		sMapKey = "AnterioresReferenciaComercial";
		inputMap = this.jButtonAnterioresReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresReferenciaComercial"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasReferenciaComercial();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesReferenciaComercial.setMinimumSize(new Dimension(this.getWidth(),ReferenciaComercialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaComercialBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReferenciaComercial.setMaximumSize(new Dimension(this.getWidth(),ReferenciaComercialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaComercialBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReferenciaComercial.setPreferredSize(new Dimension(this.getWidth(),ReferenciaComercialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaComercialBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionReferenciaComercial = new GridBagLayout();

			this.jPanelPaginacionReferenciaComercial.setLayout(gridaBagLayoutPaginacionReferenciaComercial);						
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = 0;
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionReferenciaComercial.add(this.jButtonAnterioresReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
					
						
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReferenciaComercial.gridy = 0;
			
			this.jPanelPaginacionReferenciaComercial.add(this.jButtonNuevoGuardarCambiosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
						
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReferenciaComercial.gridy = 0;
			this.jPanelPaginacionReferenciaComercial.add(this.jButtonSiguientesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = 1;
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaComercial.add(this.jButtonNuevoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
						
			
			
			if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
				this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReferenciaComercial.gridy = 1;
				this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionReferenciaComercial.add(this.jButtonGuardarCambiosTablaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			}
			
			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = 1;
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaComercial.add(this.jButtonDuplicarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = 1;
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaComercial.add(this.jButtonCopiarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = 1;
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaComercial.add(this.jButtonVerFormReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = 1;
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionReferenciaComercial.add(this.jButtonCerrarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		
		
		this.jButtonRecargarInformacionReferenciaComercial.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReferenciaComercial.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReferenciaComercial.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesReferenciaComercial.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReferenciaComercial.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReferenciaComercial.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesReferenciaComercial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReferenciaComercial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReferenciaComercial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesReferenciaComercial.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReferenciaComercial.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReferenciaComercial.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionReferenciaComercial.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReferenciaComercial.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReferenciaComercial.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesReferenciaComercial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReferenciaComercial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReferenciaComercial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesReferenciaComercial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaComercial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaComercial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarReferenciaComercial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReferenciaComercial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReferenciaComercial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaReferenciaComercial.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReferenciaComercial.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReferenciaComercial.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteReferenciaComercial.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReferenciaComercial.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReferenciaComercial.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosReferenciaComercial.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReferenciaComercial.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReferenciaComercial.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosReferenciaComercial.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReferenciaComercial.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReferenciaComercial.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesReferenciaComercial = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesReferenciaComercial = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ReferenciaComercial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ReferenciaComercial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ReferenciaComercial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ReferenciaComercial = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesReferenciaComercial.setLayout(gridaBagParametrosReportesReferenciaComercial);
			this.jPanelParametrosReportesAccionesReferenciaComercial.setLayout(gridaBagParametrosReportesAccionesReferenciaComercial);
			
			
			this.jPanelParametrosAuxiliar1ReferenciaComercial.setLayout(gridaBagParametrosAuxiliar1ReferenciaComercial);
			this.jPanelParametrosAuxiliar2ReferenciaComercial.setLayout(gridaBagParametrosAuxiliar2ReferenciaComercial);
			this.jPanelParametrosAuxiliar3ReferenciaComercial.setLayout(gridaBagParametrosAuxiliar3ReferenciaComercial);
			this.jPanelParametrosAuxiliar4ReferenciaComercial.setLayout(gridaBagParametrosAuxiliar4ReferenciaComercial);
			//this.jPanelParametrosAuxiliar5ReferenciaComercial.setLayout(gridaBagParametrosAuxiliar2ReferenciaComercial);			
			
			
			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaComercial.add(this.jButtonRecargarInformacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaComercial.add(this.jComboBoxTiposPaginacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaComercial.add(this.jCheckBoxConAltoMaximoTablaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaComercial.add(this.jComboBoxTiposArchivosReportesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaComercial.add(this.jPanelParametrosAuxiliar1ReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ReferenciaComercial.add(this.jComboBoxTiposReportesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);																		
			
			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ReferenciaComercial.add(this.jComboBoxTiposGraficosReportesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaComercial.add(this.jPanelParametrosAuxiliar4ReferenciaComercial, this.gridBagConstraintsReferenciaComercial);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaComercial.add(this.jComboBoxTiposReportesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaComercial.add(this.jCheckBoxGenerarReporteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaComercial.add(this.jPanelParametrosAuxiliar2ReferenciaComercial, this.gridBagConstraintsReferenciaComercial);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaComercial.add(this.jLabelAccionesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
				this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesReferenciaComercial.add(this.jButtonAbrirOrderByReferenciaComercial, this.gridBagConstraintsReferenciaComercial);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaComercial.add(this.jComboBoxTiposSeleccionarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
			
			
			/*
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaComercial.add(this.jCheckBoxSeleccionarTodosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaComercial.add(this.jCheckBoxConGraficoReporteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReferenciaComercial.add(this.jCheckBoxSeleccionarTodosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);															
				
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReferenciaComercial.add(this.jCheckBoxSeleccionadosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);															
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaComercial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReferenciaComercial.add(this.jCheckBoxConGraficoReporteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaComercial.add(this.jPanelParametrosAuxiliar3ReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaComercial.add(this.jComboBoxTiposAccionesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
	
				
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaComercial.add(this.jTextFieldValorCampoGeneralReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosReferenciaComercial = new GridBagLayout();

			this.jScrollPanelDatosReferenciaComercial.setLayout(gridaBagLayoutDatosReferenciaComercial);
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = 0;
			this.gridBagConstraintsReferenciaComercial.gridx = 0;
			
			this.jScrollPanelDatosReferenciaComercial.add(this.jTableDatosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosReferenciaComercial.setViewportView(this.jTableDatosReferenciaComercial);
		this.jTableDatosReferenciaComercial.setFillsViewportHeight(true);
		this.jTableDatosReferenciaComercial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesReferenciaComercial= new GridBagLayout();
		this.jPanelAccionesReferenciaComercial.setLayout(gridaBagLayoutAccionesReferenciaComercial);
		
		
		/*	
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 0;
			
		this.jPanelAccionesReferenciaComercial.add(this.jButtonNuevoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadReferenciaComercial= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadReferenciaComercial.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadReferenciaComercial.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadReferenciaComercial.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadReferenciaComercial.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadReferenciaComercial.setLayout(gridaBagLayoutFK_IdCiudadReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 0;
		jPanelFK_IdCiudadReferenciaComercial.add(jLabelidciudadFK_IdCiudadReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 1;
		jPanelFK_IdCiudadReferenciaComercial.add(jComboBoxidciudadFK_IdCiudadReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 1;
		gridBagConstraintsReferenciaComercial.gridx =1;
		jPanelFK_IdCiudadReferenciaComercial.add(jButtonFK_IdCiudadReferenciaComercial, gridBagConstraintsReferenciaComercial);

		jTabbedPaneBusquedasReferenciaComercial.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadReferenciaComercial);
		jTabbedPaneBusquedasReferenciaComercial.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteReferenciaComercial= new GridBagLayout();
		gridaBagLayoutFK_IdClienteReferenciaComercial.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteReferenciaComercial.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteReferenciaComercial.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteReferenciaComercial.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteReferenciaComercial.setLayout(gridaBagLayoutFK_IdClienteReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 0;
		jPanelFK_IdClienteReferenciaComercial.add(jLabelidclienteFK_IdClienteReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 1;
		jPanelFK_IdClienteReferenciaComercial.add(jComboBoxidclienteFK_IdClienteReferenciaComercial, gridBagConstraintsReferenciaComercial);


		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.EAST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 0;
		jPanelFK_IdClienteReferenciaComercial.add(this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 1;
		gridBagConstraintsReferenciaComercial.gridx =1;
		jPanelFK_IdClienteReferenciaComercial.add(jButtonFK_IdClienteReferenciaComercial, gridBagConstraintsReferenciaComercial);

		jTabbedPaneBusquedasReferenciaComercial.addTab("2.-Por Cliente ", jPanelFK_IdClienteReferenciaComercial);
		jTabbedPaneBusquedasReferenciaComercial.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisReferenciaComercial= new GridBagLayout();
		gridaBagLayoutFK_IdPaisReferenciaComercial.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisReferenciaComercial.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisReferenciaComercial.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisReferenciaComercial.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisReferenciaComercial.setLayout(gridaBagLayoutFK_IdPaisReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 0;
		jPanelFK_IdPaisReferenciaComercial.add(jLabelid_paisFK_IdPaisReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 1;
		jPanelFK_IdPaisReferenciaComercial.add(jComboBoxid_paisFK_IdPaisReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 1;
		gridBagConstraintsReferenciaComercial.gridx =1;
		jPanelFK_IdPaisReferenciaComercial.add(jButtonFK_IdPaisReferenciaComercial, gridBagConstraintsReferenciaComercial);

		jTabbedPaneBusquedasReferenciaComercial.addTab("3.-Por Pais ", jPanelFK_IdPaisReferenciaComercial);
		jTabbedPaneBusquedasReferenciaComercial.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoValoracionReferenciaComercial= new GridBagLayout();
		gridaBagLayoutFK_IdTipoValoracionReferenciaComercial.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoValoracionReferenciaComercial.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoValoracionReferenciaComercial.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoValoracionReferenciaComercial.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoValoracionReferenciaComercial.setLayout(gridaBagLayoutFK_IdTipoValoracionReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 0;
		jPanelFK_IdTipoValoracionReferenciaComercial.add(jLabelid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 1;
		jPanelFK_IdTipoValoracionReferenciaComercial.add(jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 1;
		gridBagConstraintsReferenciaComercial.gridx =1;
		jPanelFK_IdTipoValoracionReferenciaComercial.add(jButtonFK_IdTipoValoracionReferenciaComercial, gridBagConstraintsReferenciaComercial);

		jTabbedPaneBusquedasReferenciaComercial.addTab("4.-Por Tipo Valoracion ", jPanelFK_IdTipoValoracionReferenciaComercial);
		jTabbedPaneBusquedasReferenciaComercial.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdValorClienteSectorEconomicoReferenciaComercial= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteSectorEconomicoReferenciaComercial.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteSectorEconomicoReferenciaComercial.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteSectorEconomicoReferenciaComercial.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteSectorEconomicoReferenciaComercial.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial.setLayout(gridaBagLayoutFK_IdValorClienteSectorEconomicoReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 0;
		jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial.add(jLabelidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 0;
		gridBagConstraintsReferenciaComercial.gridx = 1;
		jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial.add(jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial, gridBagConstraintsReferenciaComercial);

		gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaComercial.gridy = 1;
		gridBagConstraintsReferenciaComercial.gridx =1;
		jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial.add(jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial, gridBagConstraintsReferenciaComercial);

		jTabbedPaneBusquedasReferenciaComercial.addTab("5.-Por Tipo Sector Econo ", jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);
		jTabbedPaneBusquedasReferenciaComercial.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReferenciaComercial = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReferenciaComercial);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();						
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaComercial.gridx = 0;		
			//this.gridBagConstraintsReferenciaComercial.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReferenciaComercial.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;
		this.gridBagConstraintsReferenciaComercial.gridx = 0;		
		//this.gridBagConstraintsReferenciaComercial.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsReferenciaComercial.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsReferenciaComercial);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaComercial.gridx = 0;		
			this.gridBagConstraintsReferenciaComercial.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsReferenciaComercial.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasReferenciaComercial, this.gridBagConstraintsReferenciaComercial);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);								
		
		
		/*
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		*/		
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReferenciaComercial.gridx =0;
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReferenciaComercial.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
				
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosReferenciaComercial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReferenciaComercial = new GridBagLayout();
			this.jPanelBusquedasParametrosReferenciaComercial.setLayout(gridaBagLayoutBusquedasParametrosReferenciaComercial);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralReferenciaComercial=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReferenciaComercial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaComercial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaComercial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			
			
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
			
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralReferenciaComercial;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoReferenciaComercial() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoReferenciaComercial = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoReferenciaComercial.setName("jPanelReporteDinamicoReferenciaComercial"); 
		
		this.jPanelReporteDinamicoReferenciaComercial.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReferenciaComercial.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReferenciaComercial.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoReferenciaComercial.setLayout(gridaBagLayoutReporteDinamicoReferenciaComercial);
		
		
		this.jInternalFrameReporteDinamicoReferenciaComercial= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoReferenciaComercial = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReferenciaComercial= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoReferenciaComercial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoReferenciaComercial.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoReferenciaComercial.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoReferenciaComercial.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoReferenciaComercial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoReferenciaComercial.setResizable(true);
	    this.jInternalFrameReporteDinamicoReferenciaComercial.setClosable(true);
	    this.jInternalFrameReporteDinamicoReferenciaComercial.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoReferenciaComercial.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReferenciaComercial.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReferenciaComercial.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Comerciales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteReferenciaComercial = new JLabelMe();

		this.jLabelColumnasSelectReporteReferenciaComercial.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jLabelColumnasSelectReporteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteReferenciaComercial = new JList<Reporte>();
		this.jListColumnasSelectReporteReferenciaComercial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteReferenciaComercial.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteReferenciaComercial.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReferenciaComercial.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReferenciaComercial.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteReferenciaComercial=new JScrollPane(this.jListColumnasSelectReporteReferenciaComercial);
			
			this.jScrollColumnasSelectReporteReferenciaComercial.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReferenciaComercial.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReferenciaComercial.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReferenciaComercial.add(this.jListColumnasSelectReporteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jScrollColumnasSelectReporteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteReferenciaComercial = new JLabelMe();

		this.jLabelRelacionesSelectReporteReferenciaComercial.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteReferenciaComercial = new JList<Reporte>();
		this.jListRelacionesSelectReporteReferenciaComercial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteReferenciaComercial.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteReferenciaComercial.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReferenciaComercial.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReferenciaComercial.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteReferenciaComercial=new JScrollPane(this.jListRelacionesSelectReporteReferenciaComercial);
			
			this.jScrollRelacionesSelectReporteReferenciaComercial.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReferenciaComercial.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReferenciaComercial.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoReferenciaComercial = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoReferenciaComercial = new JComboBoxMe();
		this.jListColumnasValoresGraficoReferenciaComercial = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoReferenciaComercial = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoReferenciaComercial.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoReferenciaComercial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReferenciaComercial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReferenciaComercial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaComercial = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaComercial.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaComercial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaComercial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaComercial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoReferenciaComercial = new JLabelMe();

		this.jLabelConGraficoDinamicoReferenciaComercial.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jLabelConGraficoDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoReferenciaComercial = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoReferenciaComercial.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoReferenciaComercial.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoReferenciaComercial.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoReferenciaComercial.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoReferenciaComercial.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jCheckBoxConGraficoDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoReferenciaComercial = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoReferenciaComercial.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jLabelColumnaCategoriaGraficoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoReferenciaComercial.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoReferenciaComercial.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoReferenciaComercial.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoReferenciaComercial.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoReferenciaComercial.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jComboBoxColumnaCategoriaGraficoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorReferenciaComercial = new JLabelMe();

		this.jLabelColumnaCategoriaValorReferenciaComercial.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jLabelColumnaCategoriaValorReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorReferenciaComercial.setText("Accion");
        this.jComboBoxColumnaCategoriaValorReferenciaComercial.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorReferenciaComercial.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorReferenciaComercial.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorReferenciaComercial.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jComboBoxColumnaCategoriaValorReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoReferenciaComercial = new JLabelMe();

		this.jLabelColumnasValoresGraficoReferenciaComercial.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jLabelColumnasValoresGraficoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoReferenciaComercial = new JList<Reporte>();
		this.jListColumnasValoresGraficoReferenciaComercial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoReferenciaComercial.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoReferenciaComercial.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoReferenciaComercial.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoReferenciaComercial.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoReferenciaComercial=new JScrollPane(this.jListColumnasValoresGraficoReferenciaComercial);
			
			this.jScrollColumnasValoresGraficoReferenciaComercial.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoReferenciaComercial.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoReferenciaComercial.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoReferenciaComercial.add(this.jListColumnasSelectReporteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jScrollColumnasValoresGraficoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoReferenciaComercial = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoReferenciaComercial.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jLabelTiposGraficosReportesDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoReferenciaComercial.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoReferenciaComercial.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoReferenciaComercial.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoReferenciaComercial.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoReferenciaComercial.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jComboBoxTiposGraficosReportesDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoReferenciaComercial = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoReferenciaComercial.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jLabelGenerarExcelReporteDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoReferenciaComercial = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoReferenciaComercial.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoReferenciaComercial,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoReferenciaComercial.setToolTipText("Generar EXCEL"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoReferenciaComercial.add(this.jButtonGenerarExcelReporteDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jComboBoxTiposReportesDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoReferenciaComercial = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoReferenciaComercial.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jLabelTiposArchivoReporteDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jComboBoxTiposArchivosReportesDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoReferenciaComercial = new JButtonMe();
		this.jButtonGenerarReporteDinamicoReferenciaComercial.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoReferenciaComercial,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoReferenciaComercial.setToolTipText("Generar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jButtonGenerarReporteDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoReferenciaComercial = new JButtonMe();
		this.jButtonCerrarReporteDinamicoReferenciaComercial.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoReferenciaComercial,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoReferenciaComercial.setToolTipText("Cancelar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaComercial.add(this.jButtonCerrarReporteDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalReferenciaComercial = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoReferenciaComercial= new JScrollPane(jPanelReporteDinamicoReferenciaComercial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoReferenciaComercial.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReferenciaComercial.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReferenciaComercial.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Comerciales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaComercial.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoReferenciaComercial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoReferenciaComercial.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalReferenciaComercial);
		this.jInternalFrameReporteDinamicoReferenciaComercial.getContentPane().add(this.jScrollPanelReporteDinamicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionReferenciaComercial() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionReferenciaComercial = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionReferenciaComercial.setName("jPanelImportacionReferenciaComercial"); 
		
		this.jPanelImportacionReferenciaComercial.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReferenciaComercial.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReferenciaComercial.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionReferenciaComercial.setLayout(gridaBagLayoutImportacionReferenciaComercial);
		
		
		this.jInternalFrameImportacionReferenciaComercial= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionReferenciaComercial= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionReferenciaComercial = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReferenciaComercial= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionReferenciaComercial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReferenciaComercial.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReferenciaComercial.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionReferenciaComercial.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReferenciaComercial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReferenciaComercial.setResizable(true);
	    this.jInternalFrameImportacionReferenciaComercial.setClosable(true);
	    this.jInternalFrameImportacionReferenciaComercial.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionReferenciaComercial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReferenciaComercial.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReferenciaComercial.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionReferenciaComercial.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReferenciaComercial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReferenciaComercial.setResizable(true);
	    this.jInternalFrameImportacionReferenciaComercial.setClosable(true);
	    this.jInternalFrameImportacionReferenciaComercial.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionReferenciaComercial.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReferenciaComercial.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReferenciaComercial.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Comerciales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionReferenciaComercial = new JLabelMe();

		this.jLabelArchivoImportacionReferenciaComercial.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYImportacion;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReferenciaComercial.add(this.jLabelArchivoImportacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionReferenciaComercial = new JFileChooser();		
		this.jFileChooserImportacionReferenciaComercial.setToolTipText("ESCOGER ARCHIVO"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionReferenciaComercial = new JButtonMe();
		this.jButtonAbrirImportacionReferenciaComercial.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionReferenciaComercial,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionReferenciaComercial.setToolTipText("Generar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaComercial.add(this.jButtonAbrirImportacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionReferenciaComercial = new JLabelMe();

		this.jLabelPathArchivoImportacionReferenciaComercial.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYImportacion;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReferenciaComercial.add(this.jLabelPathArchivoImportacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionReferenciaComercial=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionReferenciaComercial.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReferenciaComercial.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReferenciaComercial.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaComercial.add(this.jTextFieldPathArchivoImportacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionReferenciaComercial = new JButtonMe();
		this.jButtonGenerarImportacionReferenciaComercial.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionReferenciaComercial,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionReferenciaComercial.setToolTipText("Generar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaComercial.add(this.jButtonGenerarImportacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionReferenciaComercial = new JButtonMe();
		this.jButtonCerrarImportacionReferenciaComercial.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionReferenciaComercial,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionReferenciaComercial.setToolTipText("Cancelar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaComercial.add(this.jButtonCerrarImportacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalReferenciaComercial = new GridBagLayout();
		
		this.jScrollPanelImportacionReferenciaComercial= new JScrollPane(jPanelImportacionReferenciaComercial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy =iPosYImportacion;
		this.gridBagConstraintsReferenciaComercial.gridx =iPosXImportacion;
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionReferenciaComercial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionReferenciaComercial.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalReferenciaComercial);
		this.jInternalFrameImportacionReferenciaComercial.getContentPane().add(this.jScrollPanelImportacionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByReferenciaComercial(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByReferenciaComercial = new JButtonMe();
			this.jButtonAbrirOrderByReferenciaComercial.setText("Orden");
			this.jButtonAbrirOrderByReferenciaComercial.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReferenciaComercial,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByReferenciaComercial";
			inputMap = this.jButtonAbrirOrderByReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByReferenciaComercial"));
		
		
			GridBagLayout gridaBagLayoutOrderByReferenciaComercial = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByReferenciaComercial.setName("jPanelOrderByReferenciaComercial"); 
			
			this.jPanelOrderByReferenciaComercial.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReferenciaComercial.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReferenciaComercial.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByReferenciaComercial.setLayout(gridaBagLayoutOrderByReferenciaComercial);
			
			
			this.jTableDatosReferenciaComercialOrderBy = new JTableMe();        
			this.jTableDatosReferenciaComercialOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosReferenciaComercialOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosReferenciaComercialOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosReferenciaComercialOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosReferenciaComercialOrderBy.setViewportView(this.jTableDatosReferenciaComercialOrderBy);
			this.jTableDatosReferenciaComercialOrderBy.setFillsViewportHeight(true);
			this.jTableDatosReferenciaComercialOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByReferenciaComercial= new OrderByJInternalFrame();
			this.jInternalFrameOrderByReferenciaComercial= new OrderByJInternalFrame();
			this.jScrollPanelOrderByReferenciaComercial = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteReferenciaComercial= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByReferenciaComercial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByReferenciaComercial.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByReferenciaComercial.setTitle("Orden");
			this.jInternalFrameOrderByReferenciaComercial.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByReferenciaComercial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByReferenciaComercial.setResizable(true);
			this.jInternalFrameOrderByReferenciaComercial.setClosable(true);
			this.jInternalFrameOrderByReferenciaComercial.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByReferenciaComercial.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReferenciaComercial.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReferenciaComercial.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Comerciales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy =iPosYOrderBy++;
			this.gridBagConstraintsReferenciaComercial.gridx =iPosXOrderBy;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsReferenciaComercial.ipady =150;
				
			this.jPanelOrderByReferenciaComercial.add(jScrollPanelDatosReferenciaComercialOrderBy, this.gridBagConstraintsReferenciaComercial);//this.jTableDatosReferenciaComercialTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByReferenciaComercial = new JButtonMe();
			this.jButtonCerrarOrderByReferenciaComercial.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByReferenciaComercial,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByReferenciaComercial.setToolTipText("Cancelar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.gridy = iPosYOrderBy++;
			this.gridBagConstraintsReferenciaComercial.gridx = iPosXOrderBy;
									
			this.jPanelOrderByReferenciaComercial.add(this.jButtonCerrarOrderByReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalReferenciaComercial = new GridBagLayout();
			
			this.jScrollPanelOrderByReferenciaComercial= new JScrollPane(jPanelOrderByReferenciaComercial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy =iPosYOrderBy;
			this.gridBagConstraintsReferenciaComercial.gridx =iPosXOrderBy;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByReferenciaComercial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByReferenciaComercial.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalReferenciaComercial);
			
			this.jInternalFrameOrderByReferenciaComercial.getContentPane().add(this.jScrollPanelOrderByReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
		
		} else {
			this.jButtonAbrirOrderByReferenciaComercial = new JButtonMe();
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
		int iWidthTableCalculado=0;//4030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.referenciacomercialSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosReferenciaComercial.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosReferenciaComercial.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosReferenciaComercial.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosReferenciaComercial.getRowHeight();//ReferenciaComercialConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ReferenciaComercialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReferenciaComercial.isSelected()) {
					iHeightTable=ReferenciaComercialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReferenciaComercialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReferenciaComercialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ReferenciaComercialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReferenciaComercial.isSelected()) {
					iHeightTable=ReferenciaComercialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReferenciaComercialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReferenciaComercialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosReferenciaComercial.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReferenciaComercial.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReferenciaComercial.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosReferenciaComercial.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReferenciaComercial.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReferenciaComercial.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByReferenciaComercial!=null && this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy()!=null) {
			//if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByReferenciaComercial.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByReferenciaComercial.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByReferenciaComercial.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosReferenciaComercial.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReferenciaComercial.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReferenciaComercial.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=referenciacomercialLogic.getReferenciaComercials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciacomercials.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ReferenciaComercial> TraerReferenciaComercialBeans(List<ReferenciaComercial> referenciacomercials,ArrayList<Classe> classes)throws Exception {
		try {
			for(ReferenciaComercial referenciacomercial:referenciacomercials) {
					
				if(!(ReferenciaComercialConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ReferenciaComercialConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					referenciacomercial.setsDetalleGeneralEntityReporte(ReferenciaComercialConstantesFunciones.getReferenciaComercialDescripcion(referenciacomercial));
										
					referenciacomercial.setesactivo_descripcion(ReferenciaComercialConstantesFunciones.getesactivoDescripcion(referenciacomercial));	
					
						
					
				} else  {
							
					//referenciacomercial.setsDetalleGeneralEntityReporte(referenciacomercial.getsDetalleGeneralEntityReporte());
										
				}
				
				//referenciacomercialbeans.add(referenciacomercialbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return referenciacomercials;
    }
	//PARA REPORTES FIN
}
