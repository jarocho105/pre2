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
import com.bydan.erp.cartera.util.RepresentanteLegalConstantesFunciones;

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
public class RepresentanteLegalJInternalFrame extends RepresentanteLegalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRepresentanteLegal;
	
	protected JMenuBar jmenuBarRepresentanteLegal;
	
	protected JMenu jmenuRepresentanteLegal;
	protected JMenu jmenuDatosRepresentanteLegal;
	protected JMenu jmenuArchivoRepresentanteLegal;
	protected JMenu jmenuAccionesRepresentanteLegal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRepresentanteLegal;	
	protected GridBagConstraints gridBagConstraintsRepresentanteLegal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RepresentanteLegalDetalleFormJInternalFrame jInternalFrameDetalleFormRepresentanteLegal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRepresentanteLegal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRepresentanteLegal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public RepresentanteLegalSessionBean representantelegalSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RepresentanteLegal> representantelegals;		
	public List<RepresentanteLegal> representantelegalsEliminados;	
	public List<RepresentanteLegal> representantelegalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRepresentanteLegal;		
	protected JButton jButtonAbrirOrderByRepresentanteLegal;
	
	
	//protected JPanel jPanelOrderByRepresentanteLegal;
	//public JScrollPane jScrollPanelOrderByRepresentanteLegal;	
	//protected JButton jButtonCerrarOrderByRepresentanteLegal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RepresentanteLegalLogic representantelegalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRepresentanteLegal;
	public JScrollPane jScrollPanelDatosEdicionRepresentanteLegal;
	public JScrollPane jScrollPanelDatosGeneralRepresentanteLegal;
    
	
	
	//public JScrollPane jScrollPanelDatosRepresentanteLegalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRepresentanteLegal;
	//public JScrollPane jScrollPanelImportacionRepresentanteLegal;
	
	
	
	protected JPanel jPanelAccionesRepresentanteLegal;
	
    protected JPanel jPanelPaginacionRepresentanteLegal;
    protected JPanel jPanelParametrosReportesRepresentanteLegal;
	protected JPanel jPanelParametrosReportesAccionesRepresentanteLegal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RepresentanteLegal;
	protected JPanel jPanelParametrosAuxiliar2RepresentanteLegal;
	protected JPanel jPanelParametrosAuxiliar3RepresentanteLegal;
	protected JPanel jPanelParametrosAuxiliar4RepresentanteLegal;
	//protected JPanel jPanelParametrosAuxiliar5RepresentanteLegal;
	
	
	
	//protected JPanel jPanelReporteDinamicoRepresentanteLegal;
	//protected JPanel jPanelImportacionRepresentanteLegal;
	
	
	public JTable jTableDatosRepresentanteLegal;
	
	
	
	//public JTable jTableDatosRepresentanteLegalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRepresentanteLegal;
	protected JButton jButtonDuplicarRepresentanteLegal;
	protected JButton jButtonCopiarRepresentanteLegal;
	protected JButton jButtonVerFormRepresentanteLegal;
	protected JButton jButtonNuevoRelacionesRepresentanteLegal;
	protected JButton jButtonModificarRepresentanteLegal;
	
    protected JButton jButtonGuardarCambiosTablaRepresentanteLegal;
	protected JButton jButtonCerrarRepresentanteLegal;
	
	
	protected JButton jButtonRecargarInformacionRepresentanteLegal;
	protected JButton jButtonProcesarInformacionRepresentanteLegal;
	
	
	protected JButton jButtonAnterioresRepresentanteLegal;
	protected JButton jButtonSiguientesRepresentanteLegal;
	protected JButton jButtonNuevoGuardarCambiosRepresentanteLegal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRepresentanteLegal;
	//protected JButton jButtonCerrarReporteDinamicoRepresentanteLegal;
	//protected JButton jButtonGenerarExcelReporteDinamicoRepresentanteLegal;	
	
	
	
	//protected JButton jButtonAbrirImportacionRepresentanteLegal;
	//protected JButton jButtonGenerarImportacionRepresentanteLegal;
	//protected JButton jButtonCerrarImportacionRepresentanteLegal;
	//protected JFileChooser jFileChooserImportacionRepresentanteLegal;
	//protected File fileImportacionRepresentanteLegal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRepresentanteLegal;
	protected JButton jButtonDuplicarToolBarRepresentanteLegal;
	protected JButton jButtonNuevoRelacionesToolBarRepresentanteLegal;
	
	
	public JButton jButtonGuardarCambiosToolBarRepresentanteLegal;
	protected JButton jButtonCopiarToolBarRepresentanteLegal;
	protected JButton jButtonVerFormToolBarRepresentanteLegal;
	public JButton jButtonGuardarCambiosTablaToolBarRepresentanteLegal;
	protected JButton jButtonMostrarOcultarTablaToolBarRepresentanteLegal;
	protected JButton jButtonCerrarToolBarRepresentanteLegal;
	
	protected JButton jButtonRecargarInformacionToolBarRepresentanteLegal;
	protected JButton jButtonProcesarInformacionToolBarRepresentanteLegal;
	protected JButton jButtonAnterioresToolBarRepresentanteLegal;
	protected JButton jButtonSiguientesToolBarRepresentanteLegal;
	protected JButton jButtonNuevoGuardarCambiosToolBarRepresentanteLegal;
	protected JButton jButtonAbrirOrderByToolBarRepresentanteLegal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRepresentanteLegal;
	protected JMenuItem jMenuItemDuplicarRepresentanteLegal;
	protected JMenuItem jMenuItemNuevoRelacionesRepresentanteLegal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRepresentanteLegal;
	protected JMenuItem jMenuItemCopiarRepresentanteLegal;
	protected JMenuItem jMenuItemVerFormRepresentanteLegal;
	protected JMenuItem jMenuItemGuardarCambiosTablaRepresentanteLegal;
	protected JMenuItem jMenuItemCerrarRepresentanteLegal;
	protected JMenuItem jMenuItemDetalleCerrarRepresentanteLegal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRepresentanteLegal;
	protected JMenuItem jMenuItemDetalleMostarOcultarRepresentanteLegal;
	
	protected JMenuItem jMenuItemRecargarInformacionRepresentanteLegal;
	protected JMenuItem jMenuItemProcesarInformacionRepresentanteLegal;
	protected JMenuItem jMenuItemAnterioresRepresentanteLegal;
	protected JMenuItem jMenuItemSiguientesRepresentanteLegal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRepresentanteLegal;
	protected JMenuItem jMenuItemAbrirOrderByRepresentanteLegal;
	protected JMenuItem jMenuItemMostrarOcultarRepresentanteLegal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRepresentanteLegal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRepresentanteLegal;
	protected JCheckBox jCheckBoxSeleccionadosRepresentanteLegal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRepresentanteLegal;
	protected JCheckBox jCheckBoxConGraficoReporteRepresentanteLegal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRepresentanteLegal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRepresentanteLegal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRepresentanteLegal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRepresentanteLegal;
	protected JTextField jTextFieldValorCampoGeneralRepresentanteLegal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRepresentanteLegal;
	//public JList<Reporte> jListColumnasSelectReporteRepresentanteLegal;
	//public JScrollPane jScrollColumnasSelectReporteRepresentanteLegal;
	
	//public JLabel jLabelRelacionesSelectReporteRepresentanteLegal;
	//public JList<Reporte> jListRelacionesSelectReporteRepresentanteLegal;
	//public JScrollPane jScrollRelacionesSelectReporteRepresentanteLegal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRepresentanteLegal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRepresentanteLegal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRepresentanteLegal;
	//public JLabel jLabelTiposArchivoReporteDinamicoRepresentanteLegal;
	
		
	//public JLabel jLabelArchivoImportacionRepresentanteLegal;	
	//public JLabel jLabelPathArchivoImportacionRepresentanteLegal;
	//protected JTextField jTextFieldPathArchivoImportacionRepresentanteLegal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRepresentanteLegal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRepresentanteLegal;
	
	//public JLabel jLabelColumnaCategoriaValorRepresentanteLegal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRepresentanteLegal;
	
	//public JLabel jLabelColumnasValoresGraficoRepresentanteLegal;
	//public JList<Reporte> jListColumnasValoresGraficoRepresentanteLegal;
	//public JScrollPane jScrollColumnasValoresGraficoRepresentanteLegal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRepresentanteLegal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRepresentanteLegal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRepresentanteLegal;
	public JPanel jPanelFK_IdCiudadRepresentanteLegal;
	public JButton jButtonFK_IdCiudadRepresentanteLegal;
	public JPanel jPanelFK_IdClienteRepresentanteLegal;
	public JButton jButtonFK_IdClienteRepresentanteLegal;
	public JPanel jPanelFK_IdPaisRepresentanteLegal;
	public JButton jButtonFK_IdPaisRepresentanteLegal;
	public JPanel jPanelFK_IdValorClienteDocumentoRepresentanteLegal;
	public JButton jButtonFK_IdValorClienteDocumentoRepresentanteLegal;
	
	public JPanel jPanelidciudadFK_IdCiudadRepresentanteLegal;
	public JLabel jLabelidciudadFK_IdCiudadRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidciudadFK_IdCiudadRepresentanteLegal;
	public JButton jButtonidciudadFK_IdCiudadRepresentanteLegal= new JButtonMe();
	public JButton jButtonidciudadFK_IdCiudadRepresentanteLegalUpdate= new JButtonMe();
	public JButton jButtonidciudadFK_IdCiudadRepresentanteLegalBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteFK_IdClienteRepresentanteLegal;
	public JLabel jLabelidclienteFK_IdClienteRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteRepresentanteLegal;
	public JButton jButtonidclienteFK_IdClienteRepresentanteLegal= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteRepresentanteLegalUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteRepresentanteLegalBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteRepresentanteLegal;
	
	public JPanel jPanelid_paisFK_IdPaisRepresentanteLegal;
	public JLabel jLabelid_paisFK_IdPaisRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisRepresentanteLegal;
	public JButton jButtonid_paisFK_IdPaisRepresentanteLegal= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisRepresentanteLegalUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisRepresentanteLegalBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal;
	public JLabel jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal;
	public JButton jButtonidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal= new JButtonMe();
	public JButton jButtonidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegalUpdate= new JButtonMe();
	public JButton jButtonidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegalBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RepresentanteLegalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RepresentanteLegalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RepresentanteLegalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RepresentanteLegalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRepresentanteLegal)	{
		this.jButtonRecargarInformacionRepresentanteLegal = jButtonRecargarInformacionRepresentanteLegal;
	}
	
	public JButton getjButtonProcesarInformacionRepresentanteLegal() {
		return this.jButtonProcesarInformacionRepresentanteLegal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRepresentanteLegal)	{
		this.jButtonProcesarInformacionRepresentanteLegal = jButtonProcesarInformacionRepresentanteLegal;
	}
	
	
	public JButton getjButtonRecargarInformacionRepresentanteLegal() {
		return this.jButtonRecargarInformacionRepresentanteLegal;
	}
	
	
	public List<RepresentanteLegal> getrepresentantelegals() {
		return this.representantelegals;
	}

	public void setrepresentantelegals(List<RepresentanteLegal> representantelegals) {
		this.representantelegals = representantelegals;
	}
	
	public List<RepresentanteLegal> getrepresentantelegalsAux() {
		return this.representantelegalsAux;
	}

	public void setrepresentantelegalsAux(List<RepresentanteLegal> representantelegalsAux) {
		this.representantelegalsAux = representantelegalsAux;
	}
	
	public List<RepresentanteLegal> getrepresentantelegalsEliminados() {
		return this.representantelegalsEliminados;
	}

	public void setRepresentanteLegalsEliminados(List<RepresentanteLegal> representantelegalsEliminados) {
		this.representantelegalsEliminados = representantelegalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRepresentanteLegal() {
		return jComboBoxTiposSeleccionarRepresentanteLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRepresentanteLegal(
			JComboBox jComboBoxTiposSeleccionarRepresentanteLegal) {
		this.jComboBoxTiposSeleccionarRepresentanteLegal = jComboBoxTiposSeleccionarRepresentanteLegal;
	}
	
	public void setBorderResaltarTiposSeleccionarRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRepresentanteLegal() {
		return jTextFieldValorCampoGeneralRepresentanteLegal;
	}

	public void setjTextFieldValorCampoGeneralRepresentanteLegal(
			JTextField jTextFieldValorCampoGeneralRepresentanteLegal) {
		this.jTextFieldValorCampoGeneralRepresentanteLegal = jTextFieldValorCampoGeneralRepresentanteLegal;
	}

	public void setBorderResaltarValorCampoGeneralRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRepresentanteLegal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRepresentanteLegal() {
		return this.jCheckBoxSeleccionarTodosRepresentanteLegal;
	}

	public void setjCheckBoxSeleccionarTodosRepresentanteLegal(
			JCheckBox jCheckBoxSeleccionarTodosRepresentanteLegal) {
		this.jCheckBoxSeleccionarTodosRepresentanteLegal = jCheckBoxSeleccionarTodosRepresentanteLegal;
	}

	public void setBorderResaltarSeleccionarTodosRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRepresentanteLegal() {
		return this.jCheckBoxSeleccionadosRepresentanteLegal;
	}

	public void setjCheckBoxSeleccionadosRepresentanteLegal(
			JCheckBox jCheckBoxSeleccionadosRepresentanteLegal) {
		this.jCheckBoxSeleccionadosRepresentanteLegal = jCheckBoxSeleccionadosRepresentanteLegal;
	}
	
	public void setBorderResaltarSeleccionadosRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRepresentanteLegal() {
		return this.jComboBoxTiposArchivosReportesRepresentanteLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRepresentanteLegal(
			JComboBox jComboBoxTiposArchivosReportesRepresentanteLegal) {
		this.jComboBoxTiposArchivosReportesRepresentanteLegal = jComboBoxTiposArchivosReportesRepresentanteLegal;
	}

	public void setBorderResaltarTiposArchivosReportesRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRepresentanteLegal() {
		return this.jComboBoxTiposReportesRepresentanteLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRepresentanteLegal(
			JComboBox jComboBoxTiposReportesRepresentanteLegal) {
		this.jComboBoxTiposReportesRepresentanteLegal = jComboBoxTiposReportesRepresentanteLegal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRepresentanteLegal() {
	//	return jComboBoxTiposReportesDinamicoRepresentanteLegal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRepresentanteLegal(
	//		JComboBox jComboBoxTiposReportesDinamicoRepresentanteLegal) {
	//	this.jComboBoxTiposReportesDinamicoRepresentanteLegal = jComboBoxTiposReportesDinamicoRepresentanteLegal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRepresentanteLegal() {
	//	return jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRepresentanteLegal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal = jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal;
	//}
	
	public void setBorderResaltarTiposReportesRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRepresentanteLegal() {
		return this.jComboBoxTiposGraficosReportesRepresentanteLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRepresentanteLegal(
			JComboBox jComboBoxTiposGraficosReportesRepresentanteLegal) {
		this.jComboBoxTiposGraficosReportesRepresentanteLegal = jComboBoxTiposGraficosReportesRepresentanteLegal;
	}
	
	public void setBorderResaltarTiposGraficosReportesRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRepresentanteLegal() {
		return this.jComboBoxTiposPaginacionRepresentanteLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRepresentanteLegal(
			JComboBox jComboBoxTiposPaginacionRepresentanteLegal) {
		this.jComboBoxTiposPaginacionRepresentanteLegal = jComboBoxTiposPaginacionRepresentanteLegal;
	}
	
	public void setBorderResaltarTiposPaginacionRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRepresentanteLegal() {
		return this.jComboBoxTiposRelacionesRepresentanteLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRepresentanteLegal() {
		return this.jComboBoxTiposAccionesRepresentanteLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRepresentanteLegal(
			JComboBox jComboBoxTiposRelacionesRepresentanteLegal) {
		this.jComboBoxTiposRelacionesRepresentanteLegal = jComboBoxTiposRelacionesRepresentanteLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRepresentanteLegal(
			JComboBox jComboBoxTiposAccionesRepresentanteLegal) {
		this.jComboBoxTiposAccionesRepresentanteLegal = jComboBoxTiposAccionesRepresentanteLegal;
	}
	
	public void setBorderResaltarTiposRelacionesRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRepresentanteLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRepresentanteLegal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRepresentanteLegal() {
	//	return jCheckBoxConGraficoDinamicoRepresentanteLegal;
	//}

	//public void setjCheckBoxConGraficoDinamicoRepresentanteLegal(
	//		JCheckBox jCheckBoxConGraficoDinamicoRepresentanteLegal) {
	//	this.jCheckBoxConGraficoDinamicoRepresentanteLegal = jCheckBoxConGraficoDinamicoRepresentanteLegal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRepresentanteLegal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRepresentanteLegal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRepresentanteLegal .setBorder(borderResaltar);		
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
		this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
		
		this.representantelegalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.representantelegalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.representantelegalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RepresentanteLegalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Representante Legal MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
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
		
		RepresentanteLegalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRepresentanteLegal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"nuevo","nuevo","Nuevo"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"duplicar","duplicar","Duplicar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"copiar","copiar","Copiar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"ver_form","ver_form","Ver"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"recargar","recargar","Recargar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRepresentanteLegal,this.jTtoolBarRepresentanteLegal,
							"cerrar","cerrar","Salir"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRepresentanteLegal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRepresentanteLegal;
			
				this.jButtonProcesarInformacionToolBarRepresentanteLegal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRepresentanteLegal;
				
		//protected JButton jButtonModificarToolBarRepresentanteLegal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRepresentanteLegal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRepresentanteLegal=new JMenuMe("General");
		this.jmenuArchivoRepresentanteLegal=new JMenuMe("Archivo");
		this.jmenuAccionesRepresentanteLegal=new JMenuMe("Acciones");
		this.jmenuDatosRepresentanteLegal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRepresentanteLegal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRepresentanteLegal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRepresentanteLegal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRepresentanteLegal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRepresentanteLegal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRepresentanteLegal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRepresentanteLegal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRepresentanteLegal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRepresentanteLegal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRepresentanteLegal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRepresentanteLegal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRepresentanteLegal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRepresentanteLegal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRepresentanteLegal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRepresentanteLegal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRepresentanteLegal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRepresentanteLegal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRepresentanteLegal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRepresentanteLegal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRepresentanteLegal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRepresentanteLegal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRepresentanteLegal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRepresentanteLegal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRepresentanteLegal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRepresentanteLegal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRepresentanteLegal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRepresentanteLegal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRepresentanteLegal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRepresentanteLegal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRepresentanteLegal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRepresentanteLegal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRepresentanteLegal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRepresentanteLegal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRepresentanteLegal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRepresentanteLegal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRepresentanteLegal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRepresentanteLegal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRepresentanteLegal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRepresentanteLegal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRepresentanteLegal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRepresentanteLegal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRepresentanteLegal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRepresentanteLegal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRepresentanteLegal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRepresentanteLegal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRepresentanteLegal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRepresentanteLegal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRepresentanteLegal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRepresentanteLegal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRepresentanteLegal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRepresentanteLegal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRepresentanteLegal.add(this.jMenuItemCerrarRepresentanteLegal);
			
			this.jmenuAccionesRepresentanteLegal.add(this.jMenuItemNuevoRepresentanteLegal);
			this.jmenuAccionesRepresentanteLegal.add(this.jMenuItemNuevoGuardarCambiosRepresentanteLegal);
			this.jmenuAccionesRepresentanteLegal.add(this.jMenuItemNuevoRelacionesRepresentanteLegal);
			this.jmenuAccionesRepresentanteLegal.add(this.jMenuItemGuardarCambiosTablaRepresentanteLegal);		
			this.jmenuAccionesRepresentanteLegal.add(this.jMenuItemDuplicarRepresentanteLegal);		
			this.jmenuAccionesRepresentanteLegal.add(this.jMenuItemCopiarRepresentanteLegal);		
			this.jmenuAccionesRepresentanteLegal.add(this.jMenuItemVerFormRepresentanteLegal);		
			
			this.jmenuDatosRepresentanteLegal.add(this.jMenuItemRecargarInformacionRepresentanteLegal);				
			this.jmenuDatosRepresentanteLegal.add(this.jMenuItemAnterioresRepresentanteLegal);				
			this.jmenuDatosRepresentanteLegal.add(this.jMenuItemSiguientesRepresentanteLegal);				
			this.jmenuDatosRepresentanteLegal.add(this.jMenuItemAbrirOrderByRepresentanteLegal);				
			this.jmenuDatosRepresentanteLegal.add(this.jMenuItemMostrarOcultarRepresentanteLegal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRepresentanteLegal.add(this.jMenuItemGuardarCambiosRepresentanteLegal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRepresentanteLegal.add(this.jmenuArchivoRepresentanteLegal);		
			this.jmenuBarRepresentanteLegal.add(this.jmenuAccionesRepresentanteLegal);		
			this.jmenuBarRepresentanteLegal.add(this.jmenuDatosRepresentanteLegal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRepresentanteLegal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRepresentanteLegal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadRepresentanteLegal.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadRepresentanteLegal= new JButtonMe();
		this.jButtonFK_IdCiudadRepresentanteLegal.setText("Buscar");
		this.jButtonFK_IdCiudadRepresentanteLegal.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadRepresentanteLegal,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidciudadFK_IdCiudadRepresentanteLegal = new JLabelMe();
		jLabelidciudadFK_IdCiudadRepresentanteLegal.setText("Ciudad :");
		jLabelidciudadFK_IdCiudadRepresentanteLegal.setToolTipText("Ciudad");
		jLabelidciudadFK_IdCiudadRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidciudadFK_IdCiudadRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidciudadFK_IdCiudadRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidciudadFK_IdCiudadRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidciudadFK_IdCiudadRepresentanteLegal= new JComboBoxMe();
		jComboBoxidciudadFK_IdCiudadRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadFK_IdCiudadRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadFK_IdCiudadRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidciudadFK_IdCiudadRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteRepresentanteLegal.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteRepresentanteLegal= new JButtonMe();
		this.jButtonFK_IdClienteRepresentanteLegal.setText("Buscar");
		this.jButtonFK_IdClienteRepresentanteLegal.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteRepresentanteLegal,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteRepresentanteLegal = new JLabelMe();
		jLabelidclienteFK_IdClienteRepresentanteLegal.setText("Cliente :");
		jLabelidclienteFK_IdClienteRepresentanteLegal.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteRepresentanteLegal= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal.setFocusable(false);

		this.jPanelFK_IdPaisRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisRepresentanteLegal.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisRepresentanteLegal= new JButtonMe();
		this.jButtonFK_IdPaisRepresentanteLegal.setText("Buscar");
		this.jButtonFK_IdPaisRepresentanteLegal.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisRepresentanteLegal,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisRepresentanteLegal = new JLabelMe();
		jLabelid_paisFK_IdPaisRepresentanteLegal.setText("Pais :");
		jLabelid_paisFK_IdPaisRepresentanteLegal.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisRepresentanteLegal= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdValorClienteDocumentoRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteDocumentoRepresentanteLegal.setToolTipText("Buscar Por Tipo Identificacion ");
		this.jButtonFK_IdValorClienteDocumentoRepresentanteLegal= new JButtonMe();
		this.jButtonFK_IdValorClienteDocumentoRepresentanteLegal.setText("Buscar");
		this.jButtonFK_IdValorClienteDocumentoRepresentanteLegal.setToolTipText("Buscar Por Tipo Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteDocumentoRepresentanteLegal,"buscar_button","Buscar Por Tipo Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteDocumentoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal = new JLabelMe();
		jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setText("Tipo Identificacion :");
		jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setToolTipText("Tipo Identificacion");
		jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal= new JComboBoxMe();
		jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRepresentanteLegal=new JTabbedPane();


		this.jTabbedPaneBusquedasRepresentanteLegal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRepresentanteLegal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRepresentanteLegal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRepresentanteLegal = new RepresentanteLegalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Representante Legal DATOS");
			this.jInternalFrameDetalleFormRepresentanteLegal = new RepresentanteLegalDetalleFormJInternalFrame(jDesktopPane,this.representantelegalSessionBean.getConGuardarRelaciones(),this.representantelegalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRepresentanteLegal = null;//new RepresentanteLegalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRepresentanteLegal= new GridBagLayout();
		
		
		this.jTableDatosRepresentanteLegal = new JTableMe();      
		
		String sToolTipRepresentanteLegal="";
		sToolTipRepresentanteLegal=RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRepresentanteLegal+="(Cartera.RepresentanteLegal)";
		}
		
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			sToolTipRepresentanteLegal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRepresentanteLegal.setToolTipText(sToolTipRepresentanteLegal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRepresentanteLegal);
		this.jTableDatosRepresentanteLegal.setAutoCreateRowSorter(true);
		this.jTableDatosRepresentanteLegal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRepresentanteLegal.setRowSelectionAllowed(true);
		this.jTableDatosRepresentanteLegal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRepresentanteLegal = new JButtonMe();
		this.jButtonDuplicarRepresentanteLegal = new JButtonMe();
		this.jButtonCopiarRepresentanteLegal = new JButtonMe();
		this.jButtonVerFormRepresentanteLegal = new JButtonMe();
		this.jButtonNuevoRelacionesRepresentanteLegal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRepresentanteLegal = new JButtonMe();
		this.jButtonCerrarRepresentanteLegal = new JButtonMe();
		
		this.jScrollPanelDatosRepresentanteLegal = new JScrollPane();   
        this.jScrollPanelDatosGeneralRepresentanteLegal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Representante Legal";
		
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Representante Legales" + this.sPath));
		} else {
			this.jScrollPanelDatosRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRepresentanteLegal.setToolTipText("Acciones");
        this.jPanelAccionesRepresentanteLegal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRepresentanteLegal=new ReporteDinamicoJInternalFrame(RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRepresentanteLegal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRepresentanteLegal=new ImportacionJInternalFrame(RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRepresentanteLegal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRepresentanteLegal = new JButtonMe();
		
		this.jButtonAbrirOrderByRepresentanteLegal.setText("Orden");
		this.jButtonAbrirOrderByRepresentanteLegal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRepresentanteLegal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRepresentanteLegal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRepresentanteLegal,false,this);
			
			//this.cargarOrderByRepresentanteLegal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRepresentanteLegal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRepresentanteLegal,true,this);
			
			//this.cargarOrderByRepresentanteLegal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRepresentanteLegal.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosRepresentanteLegal.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosRepresentanteLegal.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosRepresentanteLegal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRepresentanteLegal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRepresentanteLegal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRepresentanteLegal.setText("Nuevo");
		this.jButtonDuplicarRepresentanteLegal.setText("Duplicar");
		this.jButtonCopiarRepresentanteLegal.setText("Copiar");
		this.jButtonVerFormRepresentanteLegal.setText("Ver");
		this.jButtonNuevoRelacionesRepresentanteLegal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRepresentanteLegal.setText("Guardar");
		this.jButtonCerrarRepresentanteLegal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRepresentanteLegal,"nuevo_button","Nuevo",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRepresentanteLegal,"duplicar_button","Duplicar",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRepresentanteLegal,"copiar_button","Copiar",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRepresentanteLegal,"ver_form","Ver",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRepresentanteLegal,"nuevorelaciones_button","Nuevo Rel",this.representantelegalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRepresentanteLegal,"guardarcambiostabla_button","Guardar",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRepresentanteLegal,"cerrar_button","Salir",this.representantelegalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRepresentanteLegal.setToolTipText("Nuevo"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRepresentanteLegal.setToolTipText("Duplicar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRepresentanteLegal.setToolTipText("Copiar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRepresentanteLegal.setToolTipText("Ver"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRepresentanteLegal.setToolTipText("Nuevo Rel"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRepresentanteLegal.setToolTipText("Guardar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRepresentanteLegal.setToolTipText("Salir"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRepresentanteLegal";
		inputMap = this.jButtonNuevoRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRepresentanteLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRepresentanteLegal"));
		
		//DUPLICAR
		sMapKey = "DuplicarRepresentanteLegal";
		inputMap = this.jButtonDuplicarRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRepresentanteLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRepresentanteLegal"));
		
		//COPIAR
		sMapKey = "CopiarRepresentanteLegal";
		inputMap = this.jButtonCopiarRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRepresentanteLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRepresentanteLegal"));
		
		//VEr FORM
		sMapKey = "VerFormRepresentanteLegal";
		inputMap = this.jButtonVerFormRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRepresentanteLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRepresentanteLegal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRepresentanteLegal";
		inputMap = this.jButtonNuevoRelacionesRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRepresentanteLegal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRepresentanteLegal";
		inputMap = this.jButtonModificarRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRepresentanteLegal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRepresentanteLegal";
		inputMap = this.jButtonCerrarRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRepresentanteLegal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRepresentanteLegal";
		inputMap = this.jButtonGuardarCambiosTablaRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRepresentanteLegal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RepresentanteLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RepresentanteLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RepresentanteLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RepresentanteLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RepresentanteLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRepresentanteLegal.setName("jPanelParametrosReportesRepresentanteLegal"); 
		
		this.jPanelParametrosReportesAccionesRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRepresentanteLegal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRepresentanteLegal.setName("jPanelParametrosReportesAccionesRepresentanteLegal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRepresentanteLegal = new JButtonMe();
		this.jButtonRecargarInformacionRepresentanteLegal.setText("Recargar");
		this.jButtonRecargarInformacionRepresentanteLegal.setToolTipText("Recargar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRepresentanteLegal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRepresentanteLegal = new JButtonMe();
		this.jButtonProcesarInformacionRepresentanteLegal.setText("Procesar");
		this.jButtonProcesarInformacionRepresentanteLegal.setToolTipText("Procesar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRepresentanteLegal.setVisible(false);
			
		this.jButtonProcesarInformacionRepresentanteLegal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRepresentanteLegal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRepresentanteLegal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRepresentanteLegal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRepresentanteLegal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRepresentanteLegal.setText("TIPO");       
		this.jComboBoxTiposReportesRepresentanteLegal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRepresentanteLegal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRepresentanteLegal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRepresentanteLegal.setText("Paginacion");
		this.jComboBoxTiposPaginacionRepresentanteLegal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRepresentanteLegal.setText("Accion");
		this.jComboBoxTiposRelacionesRepresentanteLegal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRepresentanteLegal.setText("Accion");
		this.jComboBoxTiposAccionesRepresentanteLegal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRepresentanteLegal.setText("Accion");
		this.jComboBoxTiposSeleccionarRepresentanteLegal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRepresentanteLegal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRepresentanteLegal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRepresentanteLegal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRepresentanteLegal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRepresentanteLegal = new JLabelMe();
		
		this.jLabelAccionesRepresentanteLegal.setText("Acciones");		
		this.jLabelAccionesRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRepresentanteLegal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRepresentanteLegal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRepresentanteLegal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRepresentanteLegal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRepresentanteLegal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRepresentanteLegal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRepresentanteLegal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRepresentanteLegal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRepresentanteLegal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRepresentanteLegal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRepresentanteLegal.setText("Graf.");
		this.jCheckBoxConGraficoReporteRepresentanteLegal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRepresentanteLegal = new JButtonMe();
		//this.jButtonAnterioresRepresentanteLegal.setText("<<");
        this.jButtonAnterioresRepresentanteLegal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRepresentanteLegal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRepresentanteLegal = new JButtonMe();
		//this.jButtonSiguientesRepresentanteLegal.setText(">>");
        this.jButtonSiguientesRepresentanteLegal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRepresentanteLegal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRepresentanteLegal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRepresentanteLegal.setText("Nue");
        this.jButtonNuevoGuardarCambiosRepresentanteLegal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRepresentanteLegal,"nuevoguardarcambios_button","Nue",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRepresentanteLegal";
		inputMap = this.jButtonNuevoGuardarCambiosRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRepresentanteLegal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRepresentanteLegal";
		inputMap = this.jButtonRecargarInformacionRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRepresentanteLegal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRepresentanteLegal";
		inputMap = this.jButtonSiguientesRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRepresentanteLegal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRepresentanteLegal";
		inputMap = this.jButtonAnterioresRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRepresentanteLegal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRepresentanteLegal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRepresentanteLegal.setMinimumSize(new Dimension(this.getWidth(),RepresentanteLegalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RepresentanteLegalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRepresentanteLegal.setMaximumSize(new Dimension(this.getWidth(),RepresentanteLegalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RepresentanteLegalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRepresentanteLegal.setPreferredSize(new Dimension(this.getWidth(),RepresentanteLegalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RepresentanteLegalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRepresentanteLegal = new GridBagLayout();

			this.jPanelPaginacionRepresentanteLegal.setLayout(gridaBagLayoutPaginacionRepresentanteLegal);						
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = 0;
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRepresentanteLegal.add(this.jButtonAnterioresRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
					
						
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRepresentanteLegal.gridy = 0;
			
			this.jPanelPaginacionRepresentanteLegal.add(this.jButtonNuevoGuardarCambiosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
						
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRepresentanteLegal.gridy = 0;
			this.jPanelPaginacionRepresentanteLegal.add(this.jButtonSiguientesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = 1;
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRepresentanteLegal.add(this.jButtonNuevoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
						
			
			
			if(!this.representantelegalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
				this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRepresentanteLegal.gridy = 1;
				this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRepresentanteLegal.add(this.jButtonGuardarCambiosTablaRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			}
			
			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = 1;
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRepresentanteLegal.add(this.jButtonDuplicarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = 1;
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRepresentanteLegal.add(this.jButtonCopiarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = 1;
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRepresentanteLegal.add(this.jButtonVerFormRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = 1;
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRepresentanteLegal.add(this.jButtonCerrarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		
		
		this.jButtonRecargarInformacionRepresentanteLegal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRepresentanteLegal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRepresentanteLegal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRepresentanteLegal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRepresentanteLegal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRepresentanteLegal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRepresentanteLegal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRepresentanteLegal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRepresentanteLegal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRepresentanteLegal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRepresentanteLegal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRepresentanteLegal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRepresentanteLegal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRepresentanteLegal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRepresentanteLegal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRepresentanteLegal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRepresentanteLegal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRepresentanteLegal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRepresentanteLegal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRepresentanteLegal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRepresentanteLegal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRepresentanteLegal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRepresentanteLegal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRepresentanteLegal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRepresentanteLegal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRepresentanteLegal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRepresentanteLegal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRepresentanteLegal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRepresentanteLegal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRepresentanteLegal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRepresentanteLegal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRepresentanteLegal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRepresentanteLegal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRepresentanteLegal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRepresentanteLegal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRepresentanteLegal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRepresentanteLegal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRepresentanteLegal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RepresentanteLegal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RepresentanteLegal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RepresentanteLegal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RepresentanteLegal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRepresentanteLegal.setLayout(gridaBagParametrosReportesRepresentanteLegal);
			this.jPanelParametrosReportesAccionesRepresentanteLegal.setLayout(gridaBagParametrosReportesAccionesRepresentanteLegal);
			
			
			this.jPanelParametrosAuxiliar1RepresentanteLegal.setLayout(gridaBagParametrosAuxiliar1RepresentanteLegal);
			this.jPanelParametrosAuxiliar2RepresentanteLegal.setLayout(gridaBagParametrosAuxiliar2RepresentanteLegal);
			this.jPanelParametrosAuxiliar3RepresentanteLegal.setLayout(gridaBagParametrosAuxiliar3RepresentanteLegal);
			this.jPanelParametrosAuxiliar4RepresentanteLegal.setLayout(gridaBagParametrosAuxiliar4RepresentanteLegal);
			//this.jPanelParametrosAuxiliar5RepresentanteLegal.setLayout(gridaBagParametrosAuxiliar2RepresentanteLegal);			
			
			
			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jButtonRecargarInformacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RepresentanteLegal.add(this.jComboBoxTiposPaginacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RepresentanteLegal.add(this.jCheckBoxConAltoMaximoTablaRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RepresentanteLegal.add(this.jComboBoxTiposArchivosReportesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jPanelParametrosAuxiliar1RepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RepresentanteLegal.add(this.jComboBoxTiposReportesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);																		
			
			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RepresentanteLegal.add(this.jComboBoxTiposGraficosReportesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jPanelParametrosAuxiliar4RepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jComboBoxTiposReportesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jCheckBoxGenerarReporteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jPanelParametrosAuxiliar2RepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jLabelAccionesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
				this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRepresentanteLegal.add(this.jButtonAbrirOrderByRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jComboBoxTiposSeleccionarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
			
			
			/*
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jCheckBoxSeleccionarTodosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jCheckBoxConGraficoReporteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RepresentanteLegal.add(this.jCheckBoxSeleccionarTodosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);															
				
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RepresentanteLegal.add(this.jCheckBoxSeleccionadosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);															
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRepresentanteLegal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RepresentanteLegal.add(this.jCheckBoxConGraficoReporteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jPanelParametrosAuxiliar3RepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jComboBoxTiposAccionesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
	
				
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRepresentanteLegal.add(this.jTextFieldValorCampoGeneralRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRepresentanteLegal = new GridBagLayout();

			this.jScrollPanelDatosRepresentanteLegal.setLayout(gridaBagLayoutDatosRepresentanteLegal);
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = 0;
			this.gridBagConstraintsRepresentanteLegal.gridx = 0;
			
			this.jScrollPanelDatosRepresentanteLegal.add(this.jTableDatosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRepresentanteLegal.setViewportView(this.jTableDatosRepresentanteLegal);
		this.jTableDatosRepresentanteLegal.setFillsViewportHeight(true);
		this.jTableDatosRepresentanteLegal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRepresentanteLegal= new GridBagLayout();
		this.jPanelAccionesRepresentanteLegal.setLayout(gridaBagLayoutAccionesRepresentanteLegal);
		
		
		/*	
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;
			
		this.jPanelAccionesRepresentanteLegal.add(this.jButtonNuevoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadRepresentanteLegal= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadRepresentanteLegal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadRepresentanteLegal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadRepresentanteLegal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadRepresentanteLegal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadRepresentanteLegal.setLayout(gridaBagLayoutFK_IdCiudadRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 0;
		jPanelFK_IdCiudadRepresentanteLegal.add(jLabelidciudadFK_IdCiudadRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 1;
		jPanelFK_IdCiudadRepresentanteLegal.add(jComboBoxidciudadFK_IdCiudadRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 1;
		gridBagConstraintsRepresentanteLegal.gridx =1;
		jPanelFK_IdCiudadRepresentanteLegal.add(jButtonFK_IdCiudadRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		jTabbedPaneBusquedasRepresentanteLegal.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadRepresentanteLegal);
		jTabbedPaneBusquedasRepresentanteLegal.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteRepresentanteLegal= new GridBagLayout();
		gridaBagLayoutFK_IdClienteRepresentanteLegal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteRepresentanteLegal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteRepresentanteLegal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteRepresentanteLegal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteRepresentanteLegal.setLayout(gridaBagLayoutFK_IdClienteRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 0;
		jPanelFK_IdClienteRepresentanteLegal.add(jLabelidclienteFK_IdClienteRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 1;
		jPanelFK_IdClienteRepresentanteLegal.add(jComboBoxidclienteFK_IdClienteRepresentanteLegal, gridBagConstraintsRepresentanteLegal);


		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 0;
		jPanelFK_IdClienteRepresentanteLegal.add(this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 1;
		gridBagConstraintsRepresentanteLegal.gridx =1;
		jPanelFK_IdClienteRepresentanteLegal.add(jButtonFK_IdClienteRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		jTabbedPaneBusquedasRepresentanteLegal.addTab("2.-Por Cliente ", jPanelFK_IdClienteRepresentanteLegal);
		jTabbedPaneBusquedasRepresentanteLegal.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisRepresentanteLegal= new GridBagLayout();
		gridaBagLayoutFK_IdPaisRepresentanteLegal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisRepresentanteLegal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisRepresentanteLegal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisRepresentanteLegal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisRepresentanteLegal.setLayout(gridaBagLayoutFK_IdPaisRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 0;
		jPanelFK_IdPaisRepresentanteLegal.add(jLabelid_paisFK_IdPaisRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 1;
		jPanelFK_IdPaisRepresentanteLegal.add(jComboBoxid_paisFK_IdPaisRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 1;
		gridBagConstraintsRepresentanteLegal.gridx =1;
		jPanelFK_IdPaisRepresentanteLegal.add(jButtonFK_IdPaisRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		jTabbedPaneBusquedasRepresentanteLegal.addTab("3.-Por Pais ", jPanelFK_IdPaisRepresentanteLegal);
		jTabbedPaneBusquedasRepresentanteLegal.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdValorClienteDocumentoRepresentanteLegal= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteDocumentoRepresentanteLegal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteDocumentoRepresentanteLegal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteDocumentoRepresentanteLegal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteDocumentoRepresentanteLegal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteDocumentoRepresentanteLegal.setLayout(gridaBagLayoutFK_IdValorClienteDocumentoRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 0;
		jPanelFK_IdValorClienteDocumentoRepresentanteLegal.add(jLabelidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 0;
		gridBagConstraintsRepresentanteLegal.gridx = 1;
		jPanelFK_IdValorClienteDocumentoRepresentanteLegal.add(jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRepresentanteLegal.gridy = 1;
		gridBagConstraintsRepresentanteLegal.gridx =1;
		jPanelFK_IdValorClienteDocumentoRepresentanteLegal.add(jButtonFK_IdValorClienteDocumentoRepresentanteLegal, gridBagConstraintsRepresentanteLegal);

		jTabbedPaneBusquedasRepresentanteLegal.addTab("4.-Por Tipo Identificacion ", jPanelFK_IdValorClienteDocumentoRepresentanteLegal);
		jTabbedPaneBusquedasRepresentanteLegal.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRepresentanteLegal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();						
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRepresentanteLegal.gridx = 0;		
			//this.gridBagConstraintsRepresentanteLegal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRepresentanteLegal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;		
		//this.gridBagConstraintsRepresentanteLegal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRepresentanteLegal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRepresentanteLegal.gridx = 0;		
			this.gridBagConstraintsRepresentanteLegal.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRepresentanteLegal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);								
		
		
		/*
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		*/		
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRepresentanteLegal.gridx =0;
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRepresentanteLegal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
				
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRepresentanteLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRepresentanteLegal = new GridBagLayout();
			this.jPanelBusquedasParametrosRepresentanteLegal.setLayout(gridaBagLayoutBusquedasParametrosRepresentanteLegal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRepresentanteLegal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRepresentanteLegal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRepresentanteLegal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRepresentanteLegal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			
			
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
			
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRepresentanteLegal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRepresentanteLegal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRepresentanteLegal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRepresentanteLegal.setName("jPanelReporteDinamicoRepresentanteLegal"); 
		
		this.jPanelReporteDinamicoRepresentanteLegal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRepresentanteLegal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRepresentanteLegal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRepresentanteLegal.setLayout(gridaBagLayoutReporteDinamicoRepresentanteLegal);
		
		
		this.jInternalFrameReporteDinamicoRepresentanteLegal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRepresentanteLegal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRepresentanteLegal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRepresentanteLegal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRepresentanteLegal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRepresentanteLegal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRepresentanteLegal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRepresentanteLegal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRepresentanteLegal.setResizable(true);
	    this.jInternalFrameReporteDinamicoRepresentanteLegal.setClosable(true);
	    this.jInternalFrameReporteDinamicoRepresentanteLegal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRepresentanteLegal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRepresentanteLegal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRepresentanteLegal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Representante Legales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRepresentanteLegal = new JLabelMe();

		this.jLabelColumnasSelectReporteRepresentanteLegal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jLabelColumnasSelectReporteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRepresentanteLegal = new JList<Reporte>();
		this.jListColumnasSelectReporteRepresentanteLegal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRepresentanteLegal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRepresentanteLegal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRepresentanteLegal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRepresentanteLegal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRepresentanteLegal=new JScrollPane(this.jListColumnasSelectReporteRepresentanteLegal);
			
			this.jScrollColumnasSelectReporteRepresentanteLegal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRepresentanteLegal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRepresentanteLegal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRepresentanteLegal.add(this.jListColumnasSelectReporteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jScrollColumnasSelectReporteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRepresentanteLegal = new JLabelMe();

		this.jLabelRelacionesSelectReporteRepresentanteLegal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRepresentanteLegal = new JList<Reporte>();
		this.jListRelacionesSelectReporteRepresentanteLegal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRepresentanteLegal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRepresentanteLegal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRepresentanteLegal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRepresentanteLegal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRepresentanteLegal=new JScrollPane(this.jListRelacionesSelectReporteRepresentanteLegal);
			
			this.jScrollRelacionesSelectReporteRepresentanteLegal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRepresentanteLegal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRepresentanteLegal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRepresentanteLegal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal = new JComboBoxMe();
		this.jListColumnasValoresGraficoRepresentanteLegal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRepresentanteLegal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRepresentanteLegal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRepresentanteLegal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRepresentanteLegal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRepresentanteLegal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRepresentanteLegal = new JLabelMe();

		this.jLabelConGraficoDinamicoRepresentanteLegal.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jLabelConGraficoDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRepresentanteLegal = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRepresentanteLegal.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRepresentanteLegal.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRepresentanteLegal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRepresentanteLegal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRepresentanteLegal.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jCheckBoxConGraficoDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRepresentanteLegal = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRepresentanteLegal.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jLabelColumnaCategoriaGraficoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRepresentanteLegal = new JLabelMe();

		this.jLabelColumnaCategoriaValorRepresentanteLegal.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jLabelColumnaCategoriaValorRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRepresentanteLegal.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRepresentanteLegal.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRepresentanteLegal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRepresentanteLegal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRepresentanteLegal.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jComboBoxColumnaCategoriaValorRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRepresentanteLegal = new JLabelMe();

		this.jLabelColumnasValoresGraficoRepresentanteLegal.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jLabelColumnasValoresGraficoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRepresentanteLegal = new JList<Reporte>();
		this.jListColumnasValoresGraficoRepresentanteLegal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRepresentanteLegal.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRepresentanteLegal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRepresentanteLegal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRepresentanteLegal.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRepresentanteLegal=new JScrollPane(this.jListColumnasValoresGraficoRepresentanteLegal);
			
			this.jScrollColumnasValoresGraficoRepresentanteLegal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRepresentanteLegal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRepresentanteLegal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRepresentanteLegal.add(this.jListColumnasSelectReporteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jScrollColumnasValoresGraficoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRepresentanteLegal = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRepresentanteLegal.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jLabelTiposGraficosReportesDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRepresentanteLegal.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRepresentanteLegal.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRepresentanteLegal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRepresentanteLegal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRepresentanteLegal.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jComboBoxTiposGraficosReportesDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRepresentanteLegal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRepresentanteLegal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jLabelGenerarExcelReporteDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRepresentanteLegal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRepresentanteLegal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRepresentanteLegal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRepresentanteLegal.setToolTipText("Generar EXCEL"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRepresentanteLegal.add(this.jButtonGenerarExcelReporteDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jComboBoxTiposReportesDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRepresentanteLegal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRepresentanteLegal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jLabelTiposArchivoReporteDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jComboBoxTiposArchivosReportesDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRepresentanteLegal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRepresentanteLegal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRepresentanteLegal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRepresentanteLegal.setToolTipText("Generar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jButtonGenerarReporteDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRepresentanteLegal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRepresentanteLegal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRepresentanteLegal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRepresentanteLegal.setToolTipText("Cancelar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRepresentanteLegal.add(this.jButtonCerrarReporteDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRepresentanteLegal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRepresentanteLegal= new JScrollPane(jPanelReporteDinamicoRepresentanteLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRepresentanteLegal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRepresentanteLegal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRepresentanteLegal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Representante Legales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRepresentanteLegal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRepresentanteLegal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRepresentanteLegal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRepresentanteLegal);
		this.jInternalFrameReporteDinamicoRepresentanteLegal.getContentPane().add(this.jScrollPanelReporteDinamicoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRepresentanteLegal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRepresentanteLegal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRepresentanteLegal.setName("jPanelImportacionRepresentanteLegal"); 
		
		this.jPanelImportacionRepresentanteLegal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRepresentanteLegal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRepresentanteLegal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRepresentanteLegal.setLayout(gridaBagLayoutImportacionRepresentanteLegal);
		
		
		this.jInternalFrameImportacionRepresentanteLegal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRepresentanteLegal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRepresentanteLegal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRepresentanteLegal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRepresentanteLegal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRepresentanteLegal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRepresentanteLegal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRepresentanteLegal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRepresentanteLegal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRepresentanteLegal.setResizable(true);
	    this.jInternalFrameImportacionRepresentanteLegal.setClosable(true);
	    this.jInternalFrameImportacionRepresentanteLegal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRepresentanteLegal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRepresentanteLegal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRepresentanteLegal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRepresentanteLegal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRepresentanteLegal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRepresentanteLegal.setResizable(true);
	    this.jInternalFrameImportacionRepresentanteLegal.setClosable(true);
	    this.jInternalFrameImportacionRepresentanteLegal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRepresentanteLegal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRepresentanteLegal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRepresentanteLegal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Representante Legales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRepresentanteLegal = new JLabelMe();

		this.jLabelArchivoImportacionRepresentanteLegal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYImportacion;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRepresentanteLegal.add(this.jLabelArchivoImportacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRepresentanteLegal = new JFileChooser();		
		this.jFileChooserImportacionRepresentanteLegal.setToolTipText("ESCOGER ARCHIVO"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRepresentanteLegal = new JButtonMe();
		this.jButtonAbrirImportacionRepresentanteLegal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRepresentanteLegal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRepresentanteLegal.setToolTipText("Generar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYImportacion;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRepresentanteLegal.add(this.jButtonAbrirImportacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRepresentanteLegal = new JLabelMe();

		this.jLabelPathArchivoImportacionRepresentanteLegal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYImportacion;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRepresentanteLegal.add(this.jLabelPathArchivoImportacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRepresentanteLegal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRepresentanteLegal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRepresentanteLegal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRepresentanteLegal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYImportacion;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRepresentanteLegal.add(this.jTextFieldPathArchivoImportacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRepresentanteLegal = new JButtonMe();
		this.jButtonGenerarImportacionRepresentanteLegal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRepresentanteLegal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRepresentanteLegal.setToolTipText("Generar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYImportacion;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRepresentanteLegal.add(this.jButtonGenerarImportacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRepresentanteLegal = new JButtonMe();
		this.jButtonCerrarImportacionRepresentanteLegal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRepresentanteLegal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRepresentanteLegal.setToolTipText("Cancelar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = iPosYImportacion;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRepresentanteLegal.add(this.jButtonCerrarImportacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRepresentanteLegal = new GridBagLayout();
		
		this.jScrollPanelImportacionRepresentanteLegal= new JScrollPane(jPanelImportacionRepresentanteLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy =iPosYImportacion;
		this.gridBagConstraintsRepresentanteLegal.gridx =iPosXImportacion;
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRepresentanteLegal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRepresentanteLegal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRepresentanteLegal);
		this.jInternalFrameImportacionRepresentanteLegal.getContentPane().add(this.jScrollPanelImportacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRepresentanteLegal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRepresentanteLegal = new JButtonMe();
			this.jButtonAbrirOrderByRepresentanteLegal.setText("Orden");
			this.jButtonAbrirOrderByRepresentanteLegal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRepresentanteLegal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRepresentanteLegal";
			inputMap = this.jButtonAbrirOrderByRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRepresentanteLegal"));
		
		
			GridBagLayout gridaBagLayoutOrderByRepresentanteLegal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRepresentanteLegal.setName("jPanelOrderByRepresentanteLegal"); 
			
			this.jPanelOrderByRepresentanteLegal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRepresentanteLegal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRepresentanteLegal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRepresentanteLegal.setLayout(gridaBagLayoutOrderByRepresentanteLegal);
			
			
			this.jTableDatosRepresentanteLegalOrderBy = new JTableMe();        
			this.jTableDatosRepresentanteLegalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRepresentanteLegalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRepresentanteLegalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRepresentanteLegalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRepresentanteLegalOrderBy.setViewportView(this.jTableDatosRepresentanteLegalOrderBy);
			this.jTableDatosRepresentanteLegalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRepresentanteLegalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRepresentanteLegal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRepresentanteLegal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRepresentanteLegal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRepresentanteLegal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRepresentanteLegal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRepresentanteLegal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRepresentanteLegal.setTitle("Orden");
			this.jInternalFrameOrderByRepresentanteLegal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRepresentanteLegal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRepresentanteLegal.setResizable(true);
			this.jInternalFrameOrderByRepresentanteLegal.setClosable(true);
			this.jInternalFrameOrderByRepresentanteLegal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRepresentanteLegal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRepresentanteLegal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRepresentanteLegal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Representante Legales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRepresentanteLegal.gridx =iPosXOrderBy;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRepresentanteLegal.ipady =150;
				
			this.jPanelOrderByRepresentanteLegal.add(jScrollPanelDatosRepresentanteLegalOrderBy, this.gridBagConstraintsRepresentanteLegal);//this.jTableDatosRepresentanteLegalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRepresentanteLegal = new JButtonMe();
			this.jButtonCerrarOrderByRepresentanteLegal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRepresentanteLegal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRepresentanteLegal.setToolTipText("Cancelar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRepresentanteLegal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRepresentanteLegal.add(this.jButtonCerrarOrderByRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRepresentanteLegal = new GridBagLayout();
			
			this.jScrollPanelOrderByRepresentanteLegal= new JScrollPane(jPanelOrderByRepresentanteLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy =iPosYOrderBy;
			this.gridBagConstraintsRepresentanteLegal.gridx =iPosXOrderBy;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRepresentanteLegal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRepresentanteLegal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRepresentanteLegal);
			
			this.jInternalFrameOrderByRepresentanteLegal.getContentPane().add(this.jScrollPanelOrderByRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
		
		} else {
			this.jButtonAbrirOrderByRepresentanteLegal = new JButtonMe();
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
			&& this.representantelegalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRepresentanteLegal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRepresentanteLegal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRepresentanteLegal.getRowHeight();//RepresentanteLegalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RepresentanteLegalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRepresentanteLegal.isSelected()) {
					iHeightTable=RepresentanteLegalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RepresentanteLegalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RepresentanteLegalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RepresentanteLegalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRepresentanteLegal.isSelected()) {
					iHeightTable=RepresentanteLegalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RepresentanteLegalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RepresentanteLegalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRepresentanteLegal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRepresentanteLegal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRepresentanteLegal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRepresentanteLegal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRepresentanteLegal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRepresentanteLegal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRepresentanteLegal!=null && this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy()!=null) {
			//if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRepresentanteLegal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRepresentanteLegal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRepresentanteLegal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRepresentanteLegal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRepresentanteLegal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRepresentanteLegal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=representantelegalLogic.getRepresentanteLegals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=representantelegals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RepresentanteLegal> TraerRepresentanteLegalBeans(List<RepresentanteLegal> representantelegals,ArrayList<Classe> classes)throws Exception {
		try {
			for(RepresentanteLegal representantelegal:representantelegals) {
					
				if(!(RepresentanteLegalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RepresentanteLegalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					representantelegal.setsDetalleGeneralEntityReporte(RepresentanteLegalConstantesFunciones.getRepresentanteLegalDescripcion(representantelegal));
										
					representantelegal.setestaactivo_descripcion(RepresentanteLegalConstantesFunciones.getestaactivoDescripcion(representantelegal));	
					
						
					
				} else  {
							
					//representantelegal.setsDetalleGeneralEntityReporte(representantelegal.getsDetalleGeneralEntityReporte());
										
				}
				
				//representantelegalbeans.add(representantelegalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return representantelegals;
    }
	//PARA REPORTES FIN
}
