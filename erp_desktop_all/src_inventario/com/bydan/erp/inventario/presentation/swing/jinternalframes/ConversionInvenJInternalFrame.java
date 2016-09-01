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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.ConversionInvenConstantesFunciones;

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
public class ConversionInvenJInternalFrame extends ConversionInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConversionInven;
	
	protected JMenuBar jmenuBarConversionInven;
	
	protected JMenu jmenuConversionInven;
	protected JMenu jmenuDatosConversionInven;
	protected JMenu jmenuArchivoConversionInven;
	protected JMenu jmenuAccionesConversionInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConversionInven;	
	protected GridBagConstraints gridBagConstraintsConversionInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConversionInvenDetalleFormJInternalFrame jInternalFrameDetalleFormConversionInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConversionInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConversionInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoConversionInvenBeanSwingJInternalFrame tipoconversioninvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoconversioninven="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected UnidadBeanSwingJInternalFrame unidadconversionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidadconversion="";
	
	public ConversionInvenSessionBean conversioninvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoConversionInvenSessionBean tipoconversioninvenSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public UnidadSessionBean unidadconversionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConversionInven> conversioninvens;		
	public List<ConversionInven> conversioninvensEliminados;	
	public List<ConversionInven> conversioninvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConversionInven;		
	protected JButton jButtonAbrirOrderByConversionInven;
	
	
	//protected JPanel jPanelOrderByConversionInven;
	//public JScrollPane jScrollPanelOrderByConversionInven;	
	//protected JButton jButtonCerrarOrderByConversionInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConversionInvenLogic conversioninvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConversionInven;
	public JScrollPane jScrollPanelDatosEdicionConversionInven;
	public JScrollPane jScrollPanelDatosGeneralConversionInven;
    
	
	
	//public JScrollPane jScrollPanelDatosConversionInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConversionInven;
	//public JScrollPane jScrollPanelImportacionConversionInven;
	
	
	
	protected JPanel jPanelAccionesConversionInven;
	
    protected JPanel jPanelPaginacionConversionInven;
    protected JPanel jPanelParametrosReportesConversionInven;
	protected JPanel jPanelParametrosReportesAccionesConversionInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConversionInven;
	protected JPanel jPanelParametrosAuxiliar2ConversionInven;
	protected JPanel jPanelParametrosAuxiliar3ConversionInven;
	protected JPanel jPanelParametrosAuxiliar4ConversionInven;
	//protected JPanel jPanelParametrosAuxiliar5ConversionInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoConversionInven;
	//protected JPanel jPanelImportacionConversionInven;
	
	
	public JTable jTableDatosConversionInven;
	
	
	
	//public JTable jTableDatosConversionInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConversionInven;
	protected JButton jButtonDuplicarConversionInven;
	protected JButton jButtonCopiarConversionInven;
	protected JButton jButtonVerFormConversionInven;
	protected JButton jButtonNuevoRelacionesConversionInven;
	protected JButton jButtonModificarConversionInven;
	
    protected JButton jButtonGuardarCambiosTablaConversionInven;
	protected JButton jButtonCerrarConversionInven;
	
	
	protected JButton jButtonRecargarInformacionConversionInven;
	protected JButton jButtonProcesarInformacionConversionInven;
	
	
	protected JButton jButtonAnterioresConversionInven;
	protected JButton jButtonSiguientesConversionInven;
	protected JButton jButtonNuevoGuardarCambiosConversionInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConversionInven;
	//protected JButton jButtonCerrarReporteDinamicoConversionInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoConversionInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionConversionInven;
	//protected JButton jButtonGenerarImportacionConversionInven;
	//protected JButton jButtonCerrarImportacionConversionInven;
	//protected JFileChooser jFileChooserImportacionConversionInven;
	//protected File fileImportacionConversionInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConversionInven;
	protected JButton jButtonDuplicarToolBarConversionInven;
	protected JButton jButtonNuevoRelacionesToolBarConversionInven;
	
	
	public JButton jButtonGuardarCambiosToolBarConversionInven;
	protected JButton jButtonCopiarToolBarConversionInven;
	protected JButton jButtonVerFormToolBarConversionInven;
	public JButton jButtonGuardarCambiosTablaToolBarConversionInven;
	protected JButton jButtonMostrarOcultarTablaToolBarConversionInven;
	protected JButton jButtonCerrarToolBarConversionInven;
	
	protected JButton jButtonRecargarInformacionToolBarConversionInven;
	protected JButton jButtonProcesarInformacionToolBarConversionInven;
	protected JButton jButtonAnterioresToolBarConversionInven;
	protected JButton jButtonSiguientesToolBarConversionInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarConversionInven;
	protected JButton jButtonAbrirOrderByToolBarConversionInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConversionInven;
	protected JMenuItem jMenuItemDuplicarConversionInven;
	protected JMenuItem jMenuItemNuevoRelacionesConversionInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConversionInven;
	protected JMenuItem jMenuItemCopiarConversionInven;
	protected JMenuItem jMenuItemVerFormConversionInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaConversionInven;
	protected JMenuItem jMenuItemCerrarConversionInven;
	protected JMenuItem jMenuItemDetalleCerrarConversionInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConversionInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarConversionInven;
	
	protected JMenuItem jMenuItemRecargarInformacionConversionInven;
	protected JMenuItem jMenuItemProcesarInformacionConversionInven;
	protected JMenuItem jMenuItemAnterioresConversionInven;
	protected JMenuItem jMenuItemSiguientesConversionInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConversionInven;
	protected JMenuItem jMenuItemAbrirOrderByConversionInven;
	protected JMenuItem jMenuItemMostrarOcultarConversionInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConversionInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConversionInven;
	protected JCheckBox jCheckBoxSeleccionadosConversionInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConversionInven;
	protected JCheckBox jCheckBoxConGraficoReporteConversionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConversionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConversionInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConversionInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConversionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConversionInven;
	protected JTextField jTextFieldValorCampoGeneralConversionInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConversionInven;
	//public JList<Reporte> jListColumnasSelectReporteConversionInven;
	//public JScrollPane jScrollColumnasSelectReporteConversionInven;
	
	//public JLabel jLabelRelacionesSelectReporteConversionInven;
	//public JList<Reporte> jListRelacionesSelectReporteConversionInven;
	//public JScrollPane jScrollRelacionesSelectReporteConversionInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConversionInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConversionInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConversionInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoConversionInven;
	
		
	//public JLabel jLabelArchivoImportacionConversionInven;	
	//public JLabel jLabelPathArchivoImportacionConversionInven;
	//protected JTextField jTextFieldPathArchivoImportacionConversionInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConversionInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConversionInven;
	
	//public JLabel jLabelColumnaCategoriaValorConversionInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConversionInven;
	
	//public JLabel jLabelColumnasValoresGraficoConversionInven;
	//public JList<Reporte> jListColumnasValoresGraficoConversionInven;
	//public JScrollPane jScrollColumnasValoresGraficoConversionInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConversionInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConversionInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConversionInven;
	public JPanel jPanelFK_IdTipoConversionInvenConversionInven;
	public JButton jButtonFK_IdTipoConversionInvenConversionInven;
	public JPanel jPanelFK_IdUnidadConversionInven;
	public JButton jButtonFK_IdUnidadConversionInven;
	public JPanel jPanelFK_IdUnidadConversionConversionInven;
	public JButton jButtonFK_IdUnidadConversionConversionInven;
	
	public JPanel jPanelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven;
	public JLabel jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven;
	public JButton jButtonid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven= new JButtonMe();
	public JButton jButtonid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInvenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadConversionInven;
	public JLabel jLabelid_unidadFK_IdUnidadConversionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadConversionInven;
	public JButton jButtonid_unidadFK_IdUnidadConversionInven= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadConversionInvenUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadConversionInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidad_conversionFK_IdUnidadConversionConversionInven;
	public JLabel jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven;
	public JButton jButtonid_unidad_conversionFK_IdUnidadConversionConversionInven= new JButtonMe();
	public JButton jButtonid_unidad_conversionFK_IdUnidadConversionConversionInvenUpdate= new JButtonMe();
	public JButton jButtonid_unidad_conversionFK_IdUnidadConversionConversionInvenBusqueda= new JButtonMe();

	
	
	
	
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
	public ConversionInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConversionInven)	{
		this.jButtonRecargarInformacionConversionInven = jButtonRecargarInformacionConversionInven;
	}
	
	public JButton getjButtonProcesarInformacionConversionInven() {
		return this.jButtonProcesarInformacionConversionInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConversionInven)	{
		this.jButtonProcesarInformacionConversionInven = jButtonProcesarInformacionConversionInven;
	}
	
	
	public JButton getjButtonRecargarInformacionConversionInven() {
		return this.jButtonRecargarInformacionConversionInven;
	}
	
	
	public List<ConversionInven> getconversioninvens() {
		return this.conversioninvens;
	}

	public void setconversioninvens(List<ConversionInven> conversioninvens) {
		this.conversioninvens = conversioninvens;
	}
	
	public List<ConversionInven> getconversioninvensAux() {
		return this.conversioninvensAux;
	}

	public void setconversioninvensAux(List<ConversionInven> conversioninvensAux) {
		this.conversioninvensAux = conversioninvensAux;
	}
	
	public List<ConversionInven> getconversioninvensEliminados() {
		return this.conversioninvensEliminados;
	}

	public void setConversionInvensEliminados(List<ConversionInven> conversioninvensEliminados) {
		this.conversioninvensEliminados = conversioninvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConversionInven() {
		return jComboBoxTiposSeleccionarConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConversionInven(
			JComboBox jComboBoxTiposSeleccionarConversionInven) {
		this.jComboBoxTiposSeleccionarConversionInven = jComboBoxTiposSeleccionarConversionInven;
	}
	
	public void setBorderResaltarTiposSeleccionarConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConversionInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConversionInven() {
		return jTextFieldValorCampoGeneralConversionInven;
	}

	public void setjTextFieldValorCampoGeneralConversionInven(
			JTextField jTextFieldValorCampoGeneralConversionInven) {
		this.jTextFieldValorCampoGeneralConversionInven = jTextFieldValorCampoGeneralConversionInven;
	}

	public void setBorderResaltarValorCampoGeneralConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConversionInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConversionInven() {
		return this.jCheckBoxSeleccionarTodosConversionInven;
	}

	public void setjCheckBoxSeleccionarTodosConversionInven(
			JCheckBox jCheckBoxSeleccionarTodosConversionInven) {
		this.jCheckBoxSeleccionarTodosConversionInven = jCheckBoxSeleccionarTodosConversionInven;
	}

	public void setBorderResaltarSeleccionarTodosConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConversionInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConversionInven() {
		return this.jCheckBoxSeleccionadosConversionInven;
	}

	public void setjCheckBoxSeleccionadosConversionInven(
			JCheckBox jCheckBoxSeleccionadosConversionInven) {
		this.jCheckBoxSeleccionadosConversionInven = jCheckBoxSeleccionadosConversionInven;
	}
	
	public void setBorderResaltarSeleccionadosConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConversionInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConversionInven() {
		return this.jComboBoxTiposArchivosReportesConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConversionInven(
			JComboBox jComboBoxTiposArchivosReportesConversionInven) {
		this.jComboBoxTiposArchivosReportesConversionInven = jComboBoxTiposArchivosReportesConversionInven;
	}

	public void setBorderResaltarTiposArchivosReportesConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConversionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConversionInven() {
		return this.jComboBoxTiposReportesConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConversionInven(
			JComboBox jComboBoxTiposReportesConversionInven) {
		this.jComboBoxTiposReportesConversionInven = jComboBoxTiposReportesConversionInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConversionInven() {
	//	return jComboBoxTiposReportesDinamicoConversionInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConversionInven(
	//		JComboBox jComboBoxTiposReportesDinamicoConversionInven) {
	//	this.jComboBoxTiposReportesDinamicoConversionInven = jComboBoxTiposReportesDinamicoConversionInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConversionInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoConversionInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConversionInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConversionInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConversionInven = jComboBoxTiposArchivosReportesDinamicoConversionInven;
	//}
	
	public void setBorderResaltarTiposReportesConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConversionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConversionInven() {
		return this.jComboBoxTiposGraficosReportesConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConversionInven(
			JComboBox jComboBoxTiposGraficosReportesConversionInven) {
		this.jComboBoxTiposGraficosReportesConversionInven = jComboBoxTiposGraficosReportesConversionInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConversionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConversionInven() {
		return this.jComboBoxTiposPaginacionConversionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConversionInven(
			JComboBox jComboBoxTiposPaginacionConversionInven) {
		this.jComboBoxTiposPaginacionConversionInven = jComboBoxTiposPaginacionConversionInven;
	}
	
	public void setBorderResaltarTiposPaginacionConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConversionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConversionInven() {
		return this.jComboBoxTiposRelacionesConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConversionInven() {
		return this.jComboBoxTiposAccionesConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConversionInven(
			JComboBox jComboBoxTiposRelacionesConversionInven) {
		this.jComboBoxTiposRelacionesConversionInven = jComboBoxTiposRelacionesConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConversionInven(
			JComboBox jComboBoxTiposAccionesConversionInven) {
		this.jComboBoxTiposAccionesConversionInven = jComboBoxTiposAccionesConversionInven;
	}
	
	public void setBorderResaltarTiposRelacionesConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConversionInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConversionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConversionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConversionInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConversionInven() {
	//	return jCheckBoxConGraficoDinamicoConversionInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoConversionInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoConversionInven) {
	//	this.jCheckBoxConGraficoDinamicoConversionInven = jCheckBoxConGraficoDinamicoConversionInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConversionInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConversionInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConversionInven .setBorder(borderResaltar);		
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
		this.conversioninvenSessionBean=new ConversionInvenSessionBean();
		
		this.conversioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conversioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conversioninvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConversionInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conversion Inven MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
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
		
		ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConversionInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConversionInven,this.jTtoolBarConversionInven,
							"nuevo","nuevo","Nuevo"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConversionInven,this.jTtoolBarConversionInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConversionInven,this.jTtoolBarConversionInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConversionInven,this.jTtoolBarConversionInven,
							"duplicar","duplicar","Duplicar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConversionInven,this.jTtoolBarConversionInven,
							"copiar","copiar","Copiar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConversionInven,this.jTtoolBarConversionInven,
							"ver_form","ver_form","Ver"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConversionInven,this.jTtoolBarConversionInven,
							"recargar","recargar","Recargar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConversionInven,this.jTtoolBarConversionInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConversionInven,this.jTtoolBarConversionInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConversionInven,this.jTtoolBarConversionInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConversionInven,this.jTtoolBarConversionInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConversionInven,this.jTtoolBarConversionInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConversionInven,this.jTtoolBarConversionInven,
							"cerrar","cerrar","Salir"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConversionInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConversionInven;
			
				this.jButtonProcesarInformacionToolBarConversionInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConversionInven;
				
		//protected JButton jButtonModificarToolBarConversionInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConversionInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConversionInven=new JMenuMe("General");
		this.jmenuArchivoConversionInven=new JMenuMe("Archivo");
		this.jmenuAccionesConversionInven=new JMenuMe("Acciones");
		this.jmenuDatosConversionInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConversionInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConversionInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConversionInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConversionInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConversionInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConversionInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConversionInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConversionInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConversionInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConversionInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConversionInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConversionInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConversionInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConversionInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConversionInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConversionInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConversionInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConversionInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConversionInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConversionInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConversionInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConversionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConversionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConversionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConversionInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConversionInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConversionInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConversionInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConversionInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConversionInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConversionInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConversionInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConversionInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConversionInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConversionInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConversionInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConversionInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConversionInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConversionInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConversionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConversionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConversionInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConversionInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConversionInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConversionInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConversionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConversionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConversionInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConversionInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConversionInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConversionInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConversionInven.add(this.jMenuItemCerrarConversionInven);
			
			this.jmenuAccionesConversionInven.add(this.jMenuItemNuevoConversionInven);
			this.jmenuAccionesConversionInven.add(this.jMenuItemNuevoGuardarCambiosConversionInven);
			this.jmenuAccionesConversionInven.add(this.jMenuItemNuevoRelacionesConversionInven);
			this.jmenuAccionesConversionInven.add(this.jMenuItemGuardarCambiosTablaConversionInven);		
			this.jmenuAccionesConversionInven.add(this.jMenuItemDuplicarConversionInven);		
			this.jmenuAccionesConversionInven.add(this.jMenuItemCopiarConversionInven);		
			this.jmenuAccionesConversionInven.add(this.jMenuItemVerFormConversionInven);		
			
			this.jmenuDatosConversionInven.add(this.jMenuItemRecargarInformacionConversionInven);				
			this.jmenuDatosConversionInven.add(this.jMenuItemAnterioresConversionInven);				
			this.jmenuDatosConversionInven.add(this.jMenuItemSiguientesConversionInven);				
			this.jmenuDatosConversionInven.add(this.jMenuItemAbrirOrderByConversionInven);				
			this.jmenuDatosConversionInven.add(this.jMenuItemMostrarOcultarConversionInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConversionInven.add(this.jMenuItemGuardarCambiosConversionInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConversionInven.add(this.jmenuArchivoConversionInven);		
			this.jmenuBarConversionInven.add(this.jmenuAccionesConversionInven);		
			this.jmenuBarConversionInven.add(this.jmenuDatosConversionInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConversionInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConversionInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoConversionInvenConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoConversionInvenConversionInven.setToolTipText("Buscar Por Tipo Conversion ");
		this.jButtonFK_IdTipoConversionInvenConversionInven= new JButtonMe();
		this.jButtonFK_IdTipoConversionInvenConversionInven.setText("Buscar");
		this.jButtonFK_IdTipoConversionInvenConversionInven.setToolTipText("Buscar Por Tipo Conversion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoConversionInvenConversionInven,"buscar_button","Buscar Por Tipo Conversion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoConversionInvenConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven = new JLabelMe();
		jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setText("Tipo Conversion :");
		jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setToolTipText("Tipo Conversion");
		jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven= new JComboBoxMe();
		jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadConversionInven.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadConversionInven= new JButtonMe();
		this.jButtonFK_IdUnidadConversionInven.setText("Buscar");
		this.jButtonFK_IdUnidadConversionInven.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadConversionInven,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadConversionInven = new JLabelMe();
		jLabelid_unidadFK_IdUnidadConversionInven.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadConversionInven.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadConversionInven= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadConversionConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadConversionConversionInven.setToolTipText("Buscar Por Unidad Conversion ");
		this.jButtonFK_IdUnidadConversionConversionInven= new JButtonMe();
		this.jButtonFK_IdUnidadConversionConversionInven.setText("Buscar");
		this.jButtonFK_IdUnidadConversionConversionInven.setToolTipText("Buscar Por Unidad Conversion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadConversionConversionInven,"buscar_button","Buscar Por Unidad Conversion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadConversionConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven = new JLabelMe();
		jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven.setText("Unidad Conversion :");
		jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven.setToolTipText("Unidad Conversion");
		jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven= new JComboBoxMe();
		jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasConversionInven=new JTabbedPane();


		this.jTabbedPaneBusquedasConversionInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConversionInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConversionInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConversionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConversionInven = new ConversionInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Conversion Inven DATOS");
			this.jInternalFrameDetalleFormConversionInven = new ConversionInvenDetalleFormJInternalFrame(jDesktopPane,this.conversioninvenSessionBean.getConGuardarRelaciones(),this.conversioninvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConversionInven = null;//new ConversionInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConversionInven= new GridBagLayout();
		
		
		this.jTableDatosConversionInven = new JTableMe();      
		
		String sToolTipConversionInven="";
		sToolTipConversionInven=ConversionInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConversionInven+="(Inventario.ConversionInven)";
		}
		
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipConversionInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConversionInven.setToolTipText(sToolTipConversionInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConversionInven);
		this.jTableDatosConversionInven.setAutoCreateRowSorter(true);
		this.jTableDatosConversionInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConversionInven.setRowSelectionAllowed(true);
		this.jTableDatosConversionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConversionInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConversionInven = new JButtonMe();
		this.jButtonDuplicarConversionInven = new JButtonMe();
		this.jButtonCopiarConversionInven = new JButtonMe();
		this.jButtonVerFormConversionInven = new JButtonMe();
		this.jButtonNuevoRelacionesConversionInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConversionInven = new JButtonMe();
		this.jButtonCerrarConversionInven = new JButtonMe();
		
		this.jScrollPanelDatosConversionInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralConversionInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Conversion Inven";
		
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosConversionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConversionInven.setToolTipText("Acciones");
        this.jPanelAccionesConversionInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConversionInven=new ReporteDinamicoJInternalFrame(ConversionInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConversionInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConversionInven=new ImportacionJInternalFrame(ConversionInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConversionInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConversionInven = new JButtonMe();
		
		this.jButtonAbrirOrderByConversionInven.setText("Orden");
		this.jButtonAbrirOrderByConversionInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConversionInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConversionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConversionInven,false,this);
			
			//this.cargarOrderByConversionInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConversionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConversionInven,true,this);
			
			//this.cargarOrderByConversionInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConversionInven.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosConversionInven.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosConversionInven.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosConversionInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConversionInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConversionInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConversionInven.setText("Nuevo");
		this.jButtonDuplicarConversionInven.setText("Duplicar");
		this.jButtonCopiarConversionInven.setText("Copiar");
		this.jButtonVerFormConversionInven.setText("Ver");
		this.jButtonNuevoRelacionesConversionInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConversionInven.setText("Guardar");
		this.jButtonCerrarConversionInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConversionInven,"nuevo_button","Nuevo",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConversionInven,"duplicar_button","Duplicar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConversionInven,"copiar_button","Copiar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConversionInven,"ver_form","Ver",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConversionInven,"nuevorelaciones_button","Nuevo Rel",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConversionInven,"guardarcambiostabla_button","Guardar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConversionInven,"cerrar_button","Salir",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConversionInven.setToolTipText("Nuevo"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConversionInven.setToolTipText("Duplicar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConversionInven.setToolTipText("Copiar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConversionInven.setToolTipText("Ver"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConversionInven.setToolTipText("Nuevo Rel"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConversionInven.setToolTipText("Guardar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConversionInven.setToolTipText("Salir"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConversionInven";
		inputMap = this.jButtonNuevoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConversionInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarConversionInven";
		inputMap = this.jButtonDuplicarConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConversionInven"));
		
		//COPIAR
		sMapKey = "CopiarConversionInven";
		inputMap = this.jButtonCopiarConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConversionInven"));
		
		//VEr FORM
		sMapKey = "VerFormConversionInven";
		inputMap = this.jButtonVerFormConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConversionInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConversionInven";
		inputMap = this.jButtonNuevoRelacionesConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConversionInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConversionInven";
		inputMap = this.jButtonModificarConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConversionInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConversionInven";
		inputMap = this.jButtonCerrarConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConversionInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConversionInven";
		inputMap = this.jButtonGuardarCambiosTablaConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConversionInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConversionInven.setName("jPanelParametrosReportesConversionInven"); 
		
		this.jPanelParametrosReportesAccionesConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConversionInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConversionInven.setName("jPanelParametrosReportesAccionesConversionInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConversionInven = new JButtonMe();
		this.jButtonRecargarInformacionConversionInven.setText("Recargar");
		this.jButtonRecargarInformacionConversionInven.setToolTipText("Recargar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConversionInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConversionInven = new JButtonMe();
		this.jButtonProcesarInformacionConversionInven.setText("Procesar");
		this.jButtonProcesarInformacionConversionInven.setToolTipText("Procesar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConversionInven.setVisible(false);
			
		this.jButtonProcesarInformacionConversionInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConversionInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConversionInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConversionInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConversionInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConversionInven.setText("TIPO");       
		this.jComboBoxTiposReportesConversionInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConversionInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConversionInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConversionInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionConversionInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConversionInven.setText("Accion");
		this.jComboBoxTiposRelacionesConversionInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConversionInven.setText("Accion");
		this.jComboBoxTiposAccionesConversionInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConversionInven.setText("Accion");
		this.jComboBoxTiposSeleccionarConversionInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConversionInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConversionInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConversionInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConversionInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConversionInven = new JLabelMe();
		
		this.jLabelAccionesConversionInven.setText("Acciones");		
		this.jLabelAccionesConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConversionInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConversionInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConversionInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConversionInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConversionInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConversionInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConversionInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConversionInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConversionInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConversionInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConversionInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteConversionInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConversionInven = new JButtonMe();
		//this.jButtonAnterioresConversionInven.setText("<<");
        this.jButtonAnterioresConversionInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConversionInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConversionInven = new JButtonMe();
		//this.jButtonSiguientesConversionInven.setText(">>");
        this.jButtonSiguientesConversionInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConversionInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConversionInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConversionInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosConversionInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConversionInven,"nuevoguardarcambios_button","Nue",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConversionInven";
		inputMap = this.jButtonNuevoGuardarCambiosConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConversionInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConversionInven";
		inputMap = this.jButtonRecargarInformacionConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConversionInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConversionInven";
		inputMap = this.jButtonSiguientesConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConversionInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConversionInven";
		inputMap = this.jButtonAnterioresConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConversionInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConversionInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConversionInven.setMinimumSize(new Dimension(this.getWidth(),ConversionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConversionInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConversionInven.setMaximumSize(new Dimension(this.getWidth(),ConversionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConversionInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConversionInven.setPreferredSize(new Dimension(this.getWidth(),ConversionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConversionInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConversionInven = new GridBagLayout();

			this.jPanelPaginacionConversionInven.setLayout(gridaBagLayoutPaginacionConversionInven);						
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = 0;
			this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConversionInven.add(this.jButtonAnterioresConversionInven, this.gridBagConstraintsConversionInven);
					
						
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConversionInven.gridy = 0;
			
			this.jPanelPaginacionConversionInven.add(this.jButtonNuevoGuardarCambiosConversionInven, this.gridBagConstraintsConversionInven);
						
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConversionInven.gridy = 0;
			this.jPanelPaginacionConversionInven.add(this.jButtonSiguientesConversionInven, this.gridBagConstraintsConversionInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = 1;
			this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConversionInven.add(this.jButtonNuevoConversionInven, this.gridBagConstraintsConversionInven);
						
			
			
			if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConversionInven = new GridBagConstraints();
				this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConversionInven.gridy = 1;
				this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConversionInven.add(this.jButtonGuardarCambiosTablaConversionInven, this.gridBagConstraintsConversionInven);
			}
			
			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = 1;
			this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConversionInven.add(this.jButtonDuplicarConversionInven, this.gridBagConstraintsConversionInven);
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = 1;
			this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConversionInven.add(this.jButtonCopiarConversionInven, this.gridBagConstraintsConversionInven);
		
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = 1;
			this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConversionInven.add(this.jButtonVerFormConversionInven, this.gridBagConstraintsConversionInven);
		
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = 1;
			this.gridBagConstraintsConversionInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConversionInven.add(this.jButtonCerrarConversionInven, this.gridBagConstraintsConversionInven);
		
		
		
		this.jButtonRecargarInformacionConversionInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConversionInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConversionInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConversionInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConversionInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConversionInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConversionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConversionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConversionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConversionInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConversionInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConversionInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConversionInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConversionInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConversionInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConversionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConversionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConversionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConversionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConversionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConversionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConversionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConversionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConversionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConversionInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConversionInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConversionInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConversionInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConversionInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConversionInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConversionInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConversionInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConversionInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConversionInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConversionInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConversionInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConversionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConversionInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConversionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConversionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConversionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConversionInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConversionInven.setLayout(gridaBagParametrosReportesConversionInven);
			this.jPanelParametrosReportesAccionesConversionInven.setLayout(gridaBagParametrosReportesAccionesConversionInven);
			
			
			this.jPanelParametrosAuxiliar1ConversionInven.setLayout(gridaBagParametrosAuxiliar1ConversionInven);
			this.jPanelParametrosAuxiliar2ConversionInven.setLayout(gridaBagParametrosAuxiliar2ConversionInven);
			this.jPanelParametrosAuxiliar3ConversionInven.setLayout(gridaBagParametrosAuxiliar3ConversionInven);
			this.jPanelParametrosAuxiliar4ConversionInven.setLayout(gridaBagParametrosAuxiliar4ConversionInven);
			//this.jPanelParametrosAuxiliar5ConversionInven.setLayout(gridaBagParametrosAuxiliar2ConversionInven);			
			
			
			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConversionInven.add(this.jButtonRecargarInformacionConversionInven, this.gridBagConstraintsConversionInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConversionInven.add(this.jComboBoxTiposPaginacionConversionInven, this.gridBagConstraintsConversionInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConversionInven.add(this.jCheckBoxConAltoMaximoTablaConversionInven, this.gridBagConstraintsConversionInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConversionInven.add(this.jComboBoxTiposArchivosReportesConversionInven, this.gridBagConstraintsConversionInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionInven.add(this.jPanelParametrosAuxiliar1ConversionInven, this.gridBagConstraintsConversionInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConversionInven.add(this.jComboBoxTiposReportesConversionInven, this.gridBagConstraintsConversionInven);																		
			
			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConversionInven.add(this.jComboBoxTiposGraficosReportesConversionInven, this.gridBagConstraintsConversionInven);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionInven.add(this.jPanelParametrosAuxiliar4ConversionInven, this.gridBagConstraintsConversionInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionInven.add(this.jComboBoxTiposReportesConversionInven, this.gridBagConstraintsConversionInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConversionInven.add(this.jCheckBoxGenerarReporteConversionInven, this.gridBagConstraintsConversionInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionInven.add(this.jPanelParametrosAuxiliar2ConversionInven, this.gridBagConstraintsConversionInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConversionInven.add(this.jLabelAccionesConversionInven, this.gridBagConstraintsConversionInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConversionInven = new GridBagConstraints();
				this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConversionInven.add(this.jButtonAbrirOrderByConversionInven, this.gridBagConstraintsConversionInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConversionInven.add(this.jComboBoxTiposSeleccionarConversionInven, this.gridBagConstraintsConversionInven);			
			
			
			/*
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConversionInven.add(this.jCheckBoxSeleccionarTodosConversionInven, this.gridBagConstraintsConversionInven);
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConversionInven.add(this.jCheckBoxConGraficoReporteConversionInven, this.gridBagConstraintsConversionInven);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConversionInven.add(this.jCheckBoxSeleccionarTodosConversionInven, this.gridBagConstraintsConversionInven);															
				
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConversionInven.add(this.jCheckBoxSeleccionadosConversionInven, this.gridBagConstraintsConversionInven);															
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConversionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConversionInven.add(this.jCheckBoxConGraficoReporteConversionInven, this.gridBagConstraintsConversionInven);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConversionInven.add(this.jPanelParametrosAuxiliar3ConversionInven, this.gridBagConstraintsConversionInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConversionInven.add(this.jComboBoxTiposAccionesConversionInven, this.gridBagConstraintsConversionInven);
	
				
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConversionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConversionInven.add(this.jTextFieldValorCampoGeneralConversionInven, this.gridBagConstraintsConversionInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConversionInven = new GridBagLayout();

			this.jScrollPanelDatosConversionInven.setLayout(gridaBagLayoutDatosConversionInven);
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = 0;
			this.gridBagConstraintsConversionInven.gridx = 0;
			
			this.jScrollPanelDatosConversionInven.add(this.jTableDatosConversionInven, this.gridBagConstraintsConversionInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConversionInven.setViewportView(this.jTableDatosConversionInven);
		this.jTableDatosConversionInven.setFillsViewportHeight(true);
		this.jTableDatosConversionInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConversionInven= new GridBagLayout();
		this.jPanelAccionesConversionInven.setLayout(gridaBagLayoutAccionesConversionInven);
		
		
		/*	
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 0;
			
		this.jPanelAccionesConversionInven.add(this.jButtonNuevoConversionInven, this.gridBagConstraintsConversionInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoConversionInvenConversionInven= new GridBagLayout();
		gridaBagLayoutFK_IdTipoConversionInvenConversionInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoConversionInvenConversionInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoConversionInvenConversionInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoConversionInvenConversionInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoConversionInvenConversionInven.setLayout(gridaBagLayoutFK_IdTipoConversionInvenConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 0;
		gridBagConstraintsConversionInven.gridx = 0;
		jPanelFK_IdTipoConversionInvenConversionInven.add(jLabelid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven, gridBagConstraintsConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 0;
		gridBagConstraintsConversionInven.gridx = 1;
		jPanelFK_IdTipoConversionInvenConversionInven.add(jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven, gridBagConstraintsConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 1;
		gridBagConstraintsConversionInven.gridx =1;
		jPanelFK_IdTipoConversionInvenConversionInven.add(jButtonFK_IdTipoConversionInvenConversionInven, gridBagConstraintsConversionInven);

		jTabbedPaneBusquedasConversionInven.addTab("1.-Por Tipo Conversion ", jPanelFK_IdTipoConversionInvenConversionInven);
		jTabbedPaneBusquedasConversionInven.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdUnidadConversionInven= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadConversionInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadConversionInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadConversionInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadConversionInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadConversionInven.setLayout(gridaBagLayoutFK_IdUnidadConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 0;
		gridBagConstraintsConversionInven.gridx = 0;
		jPanelFK_IdUnidadConversionInven.add(jLabelid_unidadFK_IdUnidadConversionInven, gridBagConstraintsConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 0;
		gridBagConstraintsConversionInven.gridx = 1;
		jPanelFK_IdUnidadConversionInven.add(jComboBoxid_unidadFK_IdUnidadConversionInven, gridBagConstraintsConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 1;
		gridBagConstraintsConversionInven.gridx =1;
		jPanelFK_IdUnidadConversionInven.add(jButtonFK_IdUnidadConversionInven, gridBagConstraintsConversionInven);

		jTabbedPaneBusquedasConversionInven.addTab("2.-Por Unidad ", jPanelFK_IdUnidadConversionInven);
		jTabbedPaneBusquedasConversionInven.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdUnidadConversionConversionInven= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadConversionConversionInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadConversionConversionInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadConversionConversionInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadConversionConversionInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadConversionConversionInven.setLayout(gridaBagLayoutFK_IdUnidadConversionConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 0;
		gridBagConstraintsConversionInven.gridx = 0;
		jPanelFK_IdUnidadConversionConversionInven.add(jLabelid_unidad_conversionFK_IdUnidadConversionConversionInven, gridBagConstraintsConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 0;
		gridBagConstraintsConversionInven.gridx = 1;
		jPanelFK_IdUnidadConversionConversionInven.add(jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven, gridBagConstraintsConversionInven);

		gridBagConstraintsConversionInven = new GridBagConstraints();
		gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConversionInven.gridy = 1;
		gridBagConstraintsConversionInven.gridx =1;
		jPanelFK_IdUnidadConversionConversionInven.add(jButtonFK_IdUnidadConversionConversionInven, gridBagConstraintsConversionInven);

		jTabbedPaneBusquedasConversionInven.addTab("3.-Por Unidad Conversion ", jPanelFK_IdUnidadConversionConversionInven);
		jTabbedPaneBusquedasConversionInven.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConversionInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConversionInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConversionInven = new GridBagConstraints();						
			this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConversionInven.gridx = 0;		
			//this.gridBagConstraintsConversionInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConversionInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConversionInven, this.gridBagConstraintsConversionInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConversionInven.gridx = 0;		
		//this.gridBagConstraintsConversionInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConversionInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConversionInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConversionInven.gridx = 0;		
			this.gridBagConstraintsConversionInven.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConversionInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConversionInven, this.gridBagConstraintsConversionInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConversionInven, this.gridBagConstraintsConversionInven);								
		
		
		/*
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConversionInven, this.gridBagConstraintsConversionInven);
		*/		
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConversionInven.gridx =0;
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConversionInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConversionInven, this.gridBagConstraintsConversionInven);
				
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConversionInven, this.gridBagConstraintsConversionInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConversionInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConversionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConversionInven = new GridBagLayout();
			this.jPanelBusquedasParametrosConversionInven.setLayout(gridaBagLayoutBusquedasParametrosConversionInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConversionInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConversionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConversionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConversionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConversionInven, this.gridBagConstraintsConversionInven);
			
			
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConversionInven, this.gridBagConstraintsConversionInven);
		
			
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConversionInven, this.gridBagConstraintsConversionInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConversionInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConversionInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConversionInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConversionInven.setName("jPanelReporteDinamicoConversionInven"); 
		
		this.jPanelReporteDinamicoConversionInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConversionInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConversionInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConversionInven.setLayout(gridaBagLayoutReporteDinamicoConversionInven);
		
		
		this.jInternalFrameReporteDinamicoConversionInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConversionInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConversionInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConversionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConversionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConversionInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConversionInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConversionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConversionInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoConversionInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoConversionInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConversionInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConversionInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConversionInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConversionInven = new JLabelMe();

		this.jLabelColumnasSelectReporteConversionInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConversionInven.add(this.jLabelColumnasSelectReporteConversionInven, this.gridBagConstraintsConversionInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConversionInven = new JList<Reporte>();
		this.jListColumnasSelectReporteConversionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConversionInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConversionInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConversionInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConversionInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConversionInven=new JScrollPane(this.jListColumnasSelectReporteConversionInven);
			
			this.jScrollColumnasSelectReporteConversionInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConversionInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConversionInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConversionInven.add(this.jListColumnasSelectReporteConversionInven, this.gridBagConstraintsConversionInven);
		this.jPanelReporteDinamicoConversionInven.add(this.jScrollColumnasSelectReporteConversionInven, this.gridBagConstraintsConversionInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConversionInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteConversionInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConversionInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteConversionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConversionInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConversionInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConversionInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConversionInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConversionInven=new JScrollPane(this.jListRelacionesSelectReporteConversionInven);
			
			this.jScrollRelacionesSelectReporteConversionInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConversionInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConversionInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConversionInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConversionInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoConversionInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConversionInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConversionInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConversionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConversionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConversionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConversionInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConversionInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConversionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConversionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConversionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConversionInven = new JLabelMe();

		this.jLabelConGraficoDinamicoConversionInven.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConversionInven.add(this.jLabelConGraficoDinamicoConversionInven, this.gridBagConstraintsConversionInven);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConversionInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConversionInven.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConversionInven.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConversionInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConversionInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConversionInven.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionInven.add(this.jCheckBoxConGraficoDinamicoConversionInven, this.gridBagConstraintsConversionInven);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConversionInven = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConversionInven.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConversionInven.add(this.jLabelColumnaCategoriaGraficoConversionInven, this.gridBagConstraintsConversionInven);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConversionInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConversionInven.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConversionInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConversionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConversionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConversionInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConversionInven.add(this.jComboBoxColumnaCategoriaGraficoConversionInven, this.gridBagConstraintsConversionInven);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConversionInven = new JLabelMe();

		this.jLabelColumnaCategoriaValorConversionInven.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionInven.add(this.jLabelColumnaCategoriaValorConversionInven, this.gridBagConstraintsConversionInven);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConversionInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConversionInven.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConversionInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConversionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConversionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConversionInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConversionInven.add(this.jComboBoxColumnaCategoriaValorConversionInven, this.gridBagConstraintsConversionInven);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConversionInven = new JLabelMe();

		this.jLabelColumnasValoresGraficoConversionInven.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionInven.add(this.jLabelColumnasValoresGraficoConversionInven, this.gridBagConstraintsConversionInven);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConversionInven = new JList<Reporte>();
		this.jListColumnasValoresGraficoConversionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConversionInven.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConversionInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConversionInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConversionInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConversionInven=new JScrollPane(this.jListColumnasValoresGraficoConversionInven);
			
			this.jScrollColumnasValoresGraficoConversionInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConversionInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConversionInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConversionInven.add(this.jListColumnasSelectReporteConversionInven, this.gridBagConstraintsConversionInven);
		this.jPanelReporteDinamicoConversionInven.add(this.jScrollColumnasValoresGraficoConversionInven, this.gridBagConstraintsConversionInven);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConversionInven = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConversionInven.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionInven.add(this.jLabelTiposGraficosReportesDinamicoConversionInven, this.gridBagConstraintsConversionInven);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConversionInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConversionInven.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConversionInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConversionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConversionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConversionInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionInven.add(this.jComboBoxTiposGraficosReportesDinamicoConversionInven, this.gridBagConstraintsConversionInven);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConversionInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConversionInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionInven.add(this.jLabelGenerarExcelReporteDinamicoConversionInven, this.gridBagConstraintsConversionInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConversionInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConversionInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConversionInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConversionInven.setToolTipText("Generar EXCEL"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConversionInven.add(this.jButtonGenerarExcelReporteDinamicoConversionInven, this.gridBagConstraintsConversionInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConversionInven.add(this.jComboBoxTiposReportesDinamicoConversionInven, this.gridBagConstraintsConversionInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConversionInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConversionInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConversionInven.add(this.jLabelTiposArchivoReporteDinamicoConversionInven, this.gridBagConstraintsConversionInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConversionInven.add(this.jComboBoxTiposArchivosReportesDinamicoConversionInven, this.gridBagConstraintsConversionInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConversionInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConversionInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConversionInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConversionInven.setToolTipText("Generar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConversionInven.add(this.jButtonGenerarReporteDinamicoConversionInven, this.gridBagConstraintsConversionInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConversionInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConversionInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConversionInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConversionInven.setToolTipText("Cancelar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConversionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConversionInven.add(this.jButtonCerrarReporteDinamicoConversionInven, this.gridBagConstraintsConversionInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConversionInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConversionInven= new JScrollPane(jPanelReporteDinamicoConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConversionInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConversionInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConversionInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConversionInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConversionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConversionInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConversionInven);
		this.jInternalFrameReporteDinamicoConversionInven.getContentPane().add(this.jScrollPanelReporteDinamicoConversionInven, this.gridBagConstraintsConversionInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConversionInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConversionInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConversionInven.setName("jPanelImportacionConversionInven"); 
		
		this.jPanelImportacionConversionInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConversionInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConversionInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConversionInven.setLayout(gridaBagLayoutImportacionConversionInven);
		
		
		this.jInternalFrameImportacionConversionInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConversionInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConversionInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConversionInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConversionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConversionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConversionInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConversionInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConversionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConversionInven.setResizable(true);
	    this.jInternalFrameImportacionConversionInven.setClosable(true);
	    this.jInternalFrameImportacionConversionInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConversionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConversionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConversionInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConversionInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConversionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConversionInven.setResizable(true);
	    this.jInternalFrameImportacionConversionInven.setClosable(true);
	    this.jInternalFrameImportacionConversionInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConversionInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConversionInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConversionInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConversionInven = new JLabelMe();

		this.jLabelArchivoImportacionConversionInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsConversionInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConversionInven.add(this.jLabelArchivoImportacionConversionInven, this.gridBagConstraintsConversionInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConversionInven = new JFileChooser();		
		this.jFileChooserImportacionConversionInven.setToolTipText("ESCOGER ARCHIVO"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConversionInven = new JButtonMe();
		this.jButtonAbrirImportacionConversionInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConversionInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConversionInven.setToolTipText("Generar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsConversionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConversionInven.add(this.jButtonAbrirImportacionConversionInven, this.gridBagConstraintsConversionInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConversionInven = new JLabelMe();

		this.jLabelPathArchivoImportacionConversionInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsConversionInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConversionInven.add(this.jLabelPathArchivoImportacionConversionInven, this.gridBagConstraintsConversionInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConversionInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConversionInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConversionInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConversionInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsConversionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConversionInven.add(this.jTextFieldPathArchivoImportacionConversionInven, this.gridBagConstraintsConversionInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConversionInven = new JButtonMe();
		this.jButtonGenerarImportacionConversionInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConversionInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConversionInven.setToolTipText("Generar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsConversionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConversionInven.add(this.jButtonGenerarImportacionConversionInven, this.gridBagConstraintsConversionInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConversionInven = new JButtonMe();
		this.jButtonCerrarImportacionConversionInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConversionInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConversionInven.setToolTipText("Cancelar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsConversionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConversionInven.add(this.jButtonCerrarImportacionConversionInven, this.gridBagConstraintsConversionInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConversionInven = new GridBagLayout();
		
		this.jScrollPanelImportacionConversionInven= new JScrollPane(jPanelImportacionConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy =iPosYImportacion;
		this.gridBagConstraintsConversionInven.gridx =iPosXImportacion;
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConversionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConversionInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConversionInven);
		this.jInternalFrameImportacionConversionInven.getContentPane().add(this.jScrollPanelImportacionConversionInven, this.gridBagConstraintsConversionInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConversionInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConversionInven = new JButtonMe();
			this.jButtonAbrirOrderByConversionInven.setText("Orden");
			this.jButtonAbrirOrderByConversionInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConversionInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConversionInven";
			inputMap = this.jButtonAbrirOrderByConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConversionInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByConversionInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConversionInven.setName("jPanelOrderByConversionInven"); 
			
			this.jPanelOrderByConversionInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConversionInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConversionInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConversionInven.setLayout(gridaBagLayoutOrderByConversionInven);
			
			
			this.jTableDatosConversionInvenOrderBy = new JTableMe();        
			this.jTableDatosConversionInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConversionInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConversionInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConversionInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConversionInvenOrderBy.setViewportView(this.jTableDatosConversionInvenOrderBy);
			this.jTableDatosConversionInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConversionInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConversionInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConversionInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConversionInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConversionInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConversionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConversionInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConversionInven.setTitle("Orden");
			this.jInternalFrameOrderByConversionInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConversionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConversionInven.setResizable(true);
			this.jInternalFrameOrderByConversionInven.setClosable(true);
			this.jInternalFrameOrderByConversionInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConversionInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConversionInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConversionInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConversionInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConversionInven.ipady =150;
				
			this.jPanelOrderByConversionInven.add(jScrollPanelDatosConversionInvenOrderBy, this.gridBagConstraintsConversionInven);//this.jTableDatosConversionInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConversionInven = new JButtonMe();
			this.jButtonCerrarOrderByConversionInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConversionInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConversionInven.setToolTipText("Cancelar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConversionInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConversionInven.add(this.jButtonCerrarOrderByConversionInven, this.gridBagConstraintsConversionInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConversionInven = new GridBagLayout();
			
			this.jScrollPanelOrderByConversionInven= new JScrollPane(jPanelOrderByConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsConversionInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConversionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConversionInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConversionInven);
			
			this.jInternalFrameOrderByConversionInven.getContentPane().add(this.jScrollPanelOrderByConversionInven, this.gridBagConstraintsConversionInven);			
		
		} else {
			this.jButtonAbrirOrderByConversionInven = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.conversioninvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConversionInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConversionInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConversionInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConversionInven.getRowHeight();//ConversionInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConversionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConversionInven.isSelected()) {
					iHeightTable=ConversionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConversionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConversionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConversionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConversionInven.isSelected()) {
					iHeightTable=ConversionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConversionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConversionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConversionInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConversionInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConversionInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConversionInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConversionInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConversionInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConversionInven!=null && this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy()!=null) {
			//if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConversionInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConversionInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConversionInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConversionInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConversionInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConversionInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=conversioninvenLogic.getConversionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conversioninvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConversionInven> TraerConversionInvenBeans(List<ConversionInven> conversioninvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConversionInven conversioninven:conversioninvens) {
					
				if(!(ConversionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConversionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					conversioninven.setsDetalleGeneralEntityReporte(ConversionInvenConstantesFunciones.getConversionInvenDescripcion(conversioninven));
										
						
					
						
					
				} else  {
							
					//conversioninven.setsDetalleGeneralEntityReporte(conversioninven.getsDetalleGeneralEntityReporte());
										
				}
				
				//conversioninvenbeans.add(conversioninvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return conversioninvens;
    }
	//PARA REPORTES FIN
}
