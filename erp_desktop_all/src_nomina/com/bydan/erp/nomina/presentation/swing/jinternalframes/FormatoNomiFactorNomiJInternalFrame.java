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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.FormatoNomiFactorNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class FormatoNomiFactorNomiJInternalFrame extends FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormatoNomiFactorNomi;
	
	protected JMenuBar jmenuBarFormatoNomiFactorNomi;
	
	protected JMenu jmenuFormatoNomiFactorNomi;
	protected JMenu jmenuDatosFormatoNomiFactorNomi;
	protected JMenu jmenuArchivoFormatoNomiFactorNomi;
	protected JMenu jmenuAccionesFormatoNomiFactorNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormatoNomiFactorNomi;	
	protected GridBagConstraints gridBagConstraintsFormatoNomiFactorNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormatoNomiFactorNomiDetalleFormJInternalFrame jInternalFrameDetalleFormFormatoNomiFactorNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormatoNomiFactorNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormatoNomiFactorNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomi="";

	protected FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factornomi="";
	
	public FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FormatoNomiSessionBean formatonomiSessionBean;
	public FactorNomiSessionBean factornomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormatoNomiFactorNomi> formatonomifactornomis;		
	public List<FormatoNomiFactorNomi> formatonomifactornomisEliminados;	
	public List<FormatoNomiFactorNomi> formatonomifactornomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormatoNomiFactorNomi;		
	protected JButton jButtonAbrirOrderByFormatoNomiFactorNomi;
	
	
	//protected JPanel jPanelOrderByFormatoNomiFactorNomi;
	//public JScrollPane jScrollPanelOrderByFormatoNomiFactorNomi;	
	//protected JButton jButtonCerrarOrderByFormatoNomiFactorNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormatoNomiFactorNomiLogic formatonomifactornomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormatoNomiFactorNomi;
	public JScrollPane jScrollPanelDatosEdicionFormatoNomiFactorNomi;
	public JScrollPane jScrollPanelDatosGeneralFormatoNomiFactorNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosFormatoNomiFactorNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormatoNomiFactorNomi;
	//public JScrollPane jScrollPanelImportacionFormatoNomiFactorNomi;
	
	
	
	protected JPanel jPanelAccionesFormatoNomiFactorNomi;
	
    protected JPanel jPanelPaginacionFormatoNomiFactorNomi;
    protected JPanel jPanelParametrosReportesFormatoNomiFactorNomi;
	protected JPanel jPanelParametrosReportesAccionesFormatoNomiFactorNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormatoNomiFactorNomi;
	protected JPanel jPanelParametrosAuxiliar2FormatoNomiFactorNomi;
	protected JPanel jPanelParametrosAuxiliar3FormatoNomiFactorNomi;
	protected JPanel jPanelParametrosAuxiliar4FormatoNomiFactorNomi;
	//protected JPanel jPanelParametrosAuxiliar5FormatoNomiFactorNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormatoNomiFactorNomi;
	//protected JPanel jPanelImportacionFormatoNomiFactorNomi;
	
	
	public JTable jTableDatosFormatoNomiFactorNomi;
	
	
	
	//public JTable jTableDatosFormatoNomiFactorNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormatoNomiFactorNomi;
	protected JButton jButtonDuplicarFormatoNomiFactorNomi;
	protected JButton jButtonCopiarFormatoNomiFactorNomi;
	protected JButton jButtonVerFormFormatoNomiFactorNomi;
	protected JButton jButtonNuevoRelacionesFormatoNomiFactorNomi;
	protected JButton jButtonModificarFormatoNomiFactorNomi;
	
    protected JButton jButtonGuardarCambiosTablaFormatoNomiFactorNomi;
	protected JButton jButtonCerrarFormatoNomiFactorNomi;
	
	
	protected JButton jButtonRecargarInformacionFormatoNomiFactorNomi;
	protected JButton jButtonProcesarInformacionFormatoNomiFactorNomi;
	
	
	protected JButton jButtonAnterioresFormatoNomiFactorNomi;
	protected JButton jButtonSiguientesFormatoNomiFactorNomi;
	protected JButton jButtonNuevoGuardarCambiosFormatoNomiFactorNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormatoNomiFactorNomi;
	//protected JButton jButtonCerrarReporteDinamicoFormatoNomiFactorNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormatoNomiFactorNomi;
	//protected JButton jButtonGenerarImportacionFormatoNomiFactorNomi;
	//protected JButton jButtonCerrarImportacionFormatoNomiFactorNomi;
	//protected JFileChooser jFileChooserImportacionFormatoNomiFactorNomi;
	//protected File fileImportacionFormatoNomiFactorNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormatoNomiFactorNomi;
	protected JButton jButtonDuplicarToolBarFormatoNomiFactorNomi;
	protected JButton jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarFormatoNomiFactorNomi;
	protected JButton jButtonCopiarToolBarFormatoNomiFactorNomi;
	protected JButton jButtonVerFormToolBarFormatoNomiFactorNomi;
	public JButton jButtonGuardarCambiosTablaToolBarFormatoNomiFactorNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarFormatoNomiFactorNomi;
	protected JButton jButtonCerrarToolBarFormatoNomiFactorNomi;
	
	protected JButton jButtonRecargarInformacionToolBarFormatoNomiFactorNomi;
	protected JButton jButtonProcesarInformacionToolBarFormatoNomiFactorNomi;
	protected JButton jButtonAnterioresToolBarFormatoNomiFactorNomi;
	protected JButton jButtonSiguientesToolBarFormatoNomiFactorNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormatoNomiFactorNomi;
	protected JButton jButtonAbrirOrderByToolBarFormatoNomiFactorNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemDuplicarFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemNuevoRelacionesFormatoNomiFactorNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemCopiarFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemVerFormFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemCerrarFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemDetalleCerrarFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemProcesarInformacionFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemAnterioresFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemSiguientesFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemAbrirOrderByFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemMostrarOcultarFormatoNomiFactorNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormatoNomiFactorNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormatoNomiFactorNomi;
	protected JCheckBox jCheckBoxSeleccionadosFormatoNomiFactorNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi;
	protected JCheckBox jCheckBoxConGraficoReporteFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormatoNomiFactorNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormatoNomiFactorNomi;
	protected JTextField jTextFieldValorCampoGeneralFormatoNomiFactorNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormatoNomiFactorNomi;
	//public JList<Reporte> jListColumnasSelectReporteFormatoNomiFactorNomi;
	//public JScrollPane jScrollColumnasSelectReporteFormatoNomiFactorNomi;
	
	//public JLabel jLabelRelacionesSelectReporteFormatoNomiFactorNomi;
	//public JList<Reporte> jListRelacionesSelectReporteFormatoNomiFactorNomi;
	//public JScrollPane jScrollRelacionesSelectReporteFormatoNomiFactorNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormatoNomiFactorNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormatoNomiFactorNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormatoNomiFactorNomi;
	
		
	//public JLabel jLabelArchivoImportacionFormatoNomiFactorNomi;	
	//public JLabel jLabelPathArchivoImportacionFormatoNomiFactorNomi;
	//protected JTextField jTextFieldPathArchivoImportacionFormatoNomiFactorNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormatoNomiFactorNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi;
	
	//public JLabel jLabelColumnaCategoriaValorFormatoNomiFactorNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormatoNomiFactorNomi;
	
	//public JLabel jLabelColumnasValoresGraficoFormatoNomiFactorNomi;
	//public JList<Reporte> jListColumnasValoresGraficoFormatoNomiFactorNomi;
	//public JScrollPane jScrollColumnasValoresGraficoFormatoNomiFactorNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormatoNomiFactorNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormatoNomiFactorNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormatoNomiFactorNomi;
	public JPanel jPanelFK_IdFactorNomiFormatoNomiFactorNomi;
	public JButton jButtonFK_IdFactorNomiFormatoNomiFactorNomi;
	public JPanel jPanelFK_IdFormatoNomiFormatoNomiFactorNomi;
	public JButton jButtonFK_IdFormatoNomiFormatoNomiFactorNomi;
	
	public JPanel jPanelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi;
	public JLabel jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi;
	public JButton jButtonid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi= new JButtonMe();
	public JButton jButtonid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomiUpdate= new JButtonMe();
	public JButton jButtonid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi;
	public JLabel jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi;
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi= new JButtonMe();
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomiUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomiBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FormatoNomiFactorNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiFactorNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiFactorNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiFactorNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormatoNomiFactorNomi)	{
		this.jButtonRecargarInformacionFormatoNomiFactorNomi = jButtonRecargarInformacionFormatoNomiFactorNomi;
	}
	
	public JButton getjButtonProcesarInformacionFormatoNomiFactorNomi() {
		return this.jButtonProcesarInformacionFormatoNomiFactorNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormatoNomiFactorNomi)	{
		this.jButtonProcesarInformacionFormatoNomiFactorNomi = jButtonProcesarInformacionFormatoNomiFactorNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionFormatoNomiFactorNomi() {
		return this.jButtonRecargarInformacionFormatoNomiFactorNomi;
	}
	
	
	public List<FormatoNomiFactorNomi> getformatonomifactornomis() {
		return this.formatonomifactornomis;
	}

	public void setformatonomifactornomis(List<FormatoNomiFactorNomi> formatonomifactornomis) {
		this.formatonomifactornomis = formatonomifactornomis;
	}
	
	public List<FormatoNomiFactorNomi> getformatonomifactornomisAux() {
		return this.formatonomifactornomisAux;
	}

	public void setformatonomifactornomisAux(List<FormatoNomiFactorNomi> formatonomifactornomisAux) {
		this.formatonomifactornomisAux = formatonomifactornomisAux;
	}
	
	public List<FormatoNomiFactorNomi> getformatonomifactornomisEliminados() {
		return this.formatonomifactornomisEliminados;
	}

	public void setFormatoNomiFactorNomisEliminados(List<FormatoNomiFactorNomi> formatonomifactornomisEliminados) {
		this.formatonomifactornomisEliminados = formatonomifactornomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormatoNomiFactorNomi() {
		return jComboBoxTiposSeleccionarFormatoNomiFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposSeleccionarFormatoNomiFactorNomi) {
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi = jComboBoxTiposSeleccionarFormatoNomiFactorNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormatoNomiFactorNomi() {
		return jTextFieldValorCampoGeneralFormatoNomiFactorNomi;
	}

	public void setjTextFieldValorCampoGeneralFormatoNomiFactorNomi(
			JTextField jTextFieldValorCampoGeneralFormatoNomiFactorNomi) {
		this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi = jTextFieldValorCampoGeneralFormatoNomiFactorNomi;
	}

	public void setBorderResaltarValorCampoGeneralFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormatoNomiFactorNomi() {
		return this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi;
	}

	public void setjCheckBoxSeleccionarTodosFormatoNomiFactorNomi(
			JCheckBox jCheckBoxSeleccionarTodosFormatoNomiFactorNomi) {
		this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi = jCheckBoxSeleccionarTodosFormatoNomiFactorNomi;
	}

	public void setBorderResaltarSeleccionarTodosFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormatoNomiFactorNomi() {
		return this.jCheckBoxSeleccionadosFormatoNomiFactorNomi;
	}

	public void setjCheckBoxSeleccionadosFormatoNomiFactorNomi(
			JCheckBox jCheckBoxSeleccionadosFormatoNomiFactorNomi) {
		this.jCheckBoxSeleccionadosFormatoNomiFactorNomi = jCheckBoxSeleccionadosFormatoNomiFactorNomi;
	}
	
	public void setBorderResaltarSeleccionadosFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormatoNomiFactorNomi() {
		return this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposArchivosReportesFormatoNomiFactorNomi) {
		this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi = jComboBoxTiposArchivosReportesFormatoNomiFactorNomi;
	}

	public void setBorderResaltarTiposArchivosReportesFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormatoNomiFactorNomi() {
		return this.jComboBoxTiposReportesFormatoNomiFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposReportesFormatoNomiFactorNomi) {
		this.jComboBoxTiposReportesFormatoNomiFactorNomi = jComboBoxTiposReportesFormatoNomiFactorNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormatoNomiFactorNomi() {
	//	return jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormatoNomiFactorNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi) {
	//	this.jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi = jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi = jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi;
	//}
	
	public void setBorderResaltarTiposReportesFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormatoNomiFactorNomi() {
		return this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposGraficosReportesFormatoNomiFactorNomi) {
		this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi = jComboBoxTiposGraficosReportesFormatoNomiFactorNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormatoNomiFactorNomi() {
		return this.jComboBoxTiposPaginacionFormatoNomiFactorNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposPaginacionFormatoNomiFactorNomi) {
		this.jComboBoxTiposPaginacionFormatoNomiFactorNomi = jComboBoxTiposPaginacionFormatoNomiFactorNomi;
	}
	
	public void setBorderResaltarTiposPaginacionFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormatoNomiFactorNomi() {
		return this.jComboBoxTiposRelacionesFormatoNomiFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormatoNomiFactorNomi() {
		return this.jComboBoxTiposAccionesFormatoNomiFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposRelacionesFormatoNomiFactorNomi) {
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi = jComboBoxTiposRelacionesFormatoNomiFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposAccionesFormatoNomiFactorNomi) {
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi = jComboBoxTiposAccionesFormatoNomiFactorNomi;
	}
	
	public void setBorderResaltarTiposRelacionesFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormatoNomiFactorNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormatoNomiFactorNomi() {
	//	return jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormatoNomiFactorNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi) {
	//	this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi = jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormatoNomiFactorNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormatoNomiFactorNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi .setBorder(borderResaltar);		
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
		this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		
		this.formatonomifactornomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatonomifactornomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoNomiFactorNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formato Nomi Factor Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
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
		
		FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormatoNomiFactorNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"nuevo","nuevo","Nuevo"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"duplicar","duplicar","Duplicar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"copiar","copiar","Copiar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"ver_form","ver_form","Ver"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"recargar","recargar","Recargar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,
							"cerrar","cerrar","Salir"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi;
			
				this.jButtonProcesarInformacionToolBarFormatoNomiFactorNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormatoNomiFactorNomi;
				
		//protected JButton jButtonModificarToolBarFormatoNomiFactorNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormatoNomiFactorNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormatoNomiFactorNomi=new JMenuMe("General");
		this.jmenuArchivoFormatoNomiFactorNomi=new JMenuMe("Archivo");
		this.jmenuAccionesFormatoNomiFactorNomi=new JMenuMe("Acciones");
		this.jmenuDatosFormatoNomiFactorNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormatoNomiFactorNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormatoNomiFactorNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormatoNomiFactorNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormatoNomiFactorNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormatoNomiFactorNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormatoNomiFactorNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormatoNomiFactorNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormatoNomiFactorNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormatoNomiFactorNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormatoNomiFactorNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormatoNomiFactorNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormatoNomiFactorNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormatoNomiFactorNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormatoNomiFactorNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormatoNomiFactorNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormatoNomiFactorNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormatoNomiFactorNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormatoNomiFactorNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormatoNomiFactorNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormatoNomiFactorNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormatoNomiFactorNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormatoNomiFactorNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormatoNomiFactorNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormatoNomiFactorNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormatoNomiFactorNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormatoNomiFactorNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormatoNomiFactorNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormatoNomiFactorNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormatoNomiFactorNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormatoNomiFactorNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormatoNomiFactorNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormatoNomiFactorNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormatoNomiFactorNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormatoNomiFactorNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormatoNomiFactorNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormatoNomiFactorNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormatoNomiFactorNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormatoNomiFactorNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormatoNomiFactorNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormatoNomiFactorNomi.add(this.jMenuItemCerrarFormatoNomiFactorNomi);
			
			this.jmenuAccionesFormatoNomiFactorNomi.add(this.jMenuItemNuevoFormatoNomiFactorNomi);
			this.jmenuAccionesFormatoNomiFactorNomi.add(this.jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi);
			this.jmenuAccionesFormatoNomiFactorNomi.add(this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi);
			this.jmenuAccionesFormatoNomiFactorNomi.add(this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi);		
			this.jmenuAccionesFormatoNomiFactorNomi.add(this.jMenuItemDuplicarFormatoNomiFactorNomi);		
			this.jmenuAccionesFormatoNomiFactorNomi.add(this.jMenuItemCopiarFormatoNomiFactorNomi);		
			this.jmenuAccionesFormatoNomiFactorNomi.add(this.jMenuItemVerFormFormatoNomiFactorNomi);		
			
			this.jmenuDatosFormatoNomiFactorNomi.add(this.jMenuItemRecargarInformacionFormatoNomiFactorNomi);				
			this.jmenuDatosFormatoNomiFactorNomi.add(this.jMenuItemAnterioresFormatoNomiFactorNomi);				
			this.jmenuDatosFormatoNomiFactorNomi.add(this.jMenuItemSiguientesFormatoNomiFactorNomi);				
			this.jmenuDatosFormatoNomiFactorNomi.add(this.jMenuItemAbrirOrderByFormatoNomiFactorNomi);				
			this.jmenuDatosFormatoNomiFactorNomi.add(this.jMenuItemMostrarOcultarFormatoNomiFactorNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormatoNomiFactorNomi.add(this.jMenuItemGuardarCambiosFormatoNomiFactorNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormatoNomiFactorNomi.add(this.jmenuArchivoFormatoNomiFactorNomi);		
			this.jmenuBarFormatoNomiFactorNomi.add(this.jmenuAccionesFormatoNomiFactorNomi);		
			this.jmenuBarFormatoNomiFactorNomi.add(this.jmenuDatosFormatoNomiFactorNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormatoNomiFactorNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormatoNomiFactorNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdFactorNomiFormatoNomiFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFactorNomiFormatoNomiFactorNomi.setToolTipText("Buscar Por Factor Nomi ");
		this.jButtonFK_IdFactorNomiFormatoNomiFactorNomi= new JButtonMe();
		this.jButtonFK_IdFactorNomiFormatoNomiFactorNomi.setText("Buscar");
		this.jButtonFK_IdFactorNomiFormatoNomiFactorNomi.setToolTipText("Buscar Por Factor Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFactorNomiFormatoNomiFactorNomi,"buscar_button","Buscar Por Factor Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFactorNomiFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi = new JLabelMe();
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setText("Factor Nomi :");
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setToolTipText("Factor Nomi");
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi= new JComboBoxMe();
		jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNomiFormatoNomiFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNomiFormatoNomiFactorNomi.setToolTipText("Buscar Por Formato Nomi ");
		this.jButtonFK_IdFormatoNomiFormatoNomiFactorNomi= new JButtonMe();
		this.jButtonFK_IdFormatoNomiFormatoNomiFactorNomi.setText("Buscar");
		this.jButtonFK_IdFormatoNomiFormatoNomiFactorNomi.setToolTipText("Buscar Por Formato Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNomiFormatoNomiFactorNomi,"buscar_button","Buscar Por Formato Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNomiFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi = new JLabelMe();
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setText("Formato Nomi :");
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setToolTipText("Formato Nomi");
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi= new JComboBoxMe();
		jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormatoNomiFactorNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormatoNomiFactorNomi = new FormatoNomiFactorNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formato Nomi Factor Nomi DATOS");
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi = new FormatoNomiFactorNomiDetalleFormJInternalFrame(jDesktopPane,this.formatonomifactornomiSessionBean.getConGuardarRelaciones(),this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi = null;//new FormatoNomiFactorNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormatoNomiFactorNomi= new GridBagLayout();
		
		
		this.jTableDatosFormatoNomiFactorNomi = new JTableMe();      
		
		String sToolTipFormatoNomiFactorNomi="";
		sToolTipFormatoNomiFactorNomi=FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormatoNomiFactorNomi+="(Nomina.FormatoNomiFactorNomi)";
		}
		
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormatoNomiFactorNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormatoNomiFactorNomi.setToolTipText(sToolTipFormatoNomiFactorNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormatoNomiFactorNomi);
		this.jTableDatosFormatoNomiFactorNomi.setAutoCreateRowSorter(true);
		this.jTableDatosFormatoNomiFactorNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormatoNomiFactorNomi.setRowSelectionAllowed(true);
		this.jTableDatosFormatoNomiFactorNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonDuplicarFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonCopiarFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonVerFormFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonNuevoRelacionesFormatoNomiFactorNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonCerrarFormatoNomiFactorNomi = new JButtonMe();
		
		this.jScrollPanelDatosFormatoNomiFactorNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormatoNomiFactorNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formato Nomi Factor Nomi";
		
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Factor Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosFormatoNomiFactorNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormatoNomiFactorNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormatoNomiFactorNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi=new ReporteDinamicoJInternalFrame(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormatoNomiFactorNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormatoNomiFactorNomi=new ImportacionJInternalFrame(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormatoNomiFactorNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormatoNomiFactorNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByFormatoNomiFactorNomi.setText("Orden");
		this.jButtonAbrirOrderByFormatoNomiFactorNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormatoNomiFactorNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormatoNomiFactorNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomiFactorNomi,false,this);
			
			//this.cargarOrderByFormatoNomiFactorNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormatoNomiFactorNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomiFactorNomi,true,this);
			
			//this.cargarOrderByFormatoNomiFactorNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormatoNomiFactorNomi.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosFormatoNomiFactorNomi.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosFormatoNomiFactorNomi.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosFormatoNomiFactorNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormatoNomiFactorNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormatoNomiFactorNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormatoNomiFactorNomi.setText("Nuevo");
		this.jButtonDuplicarFormatoNomiFactorNomi.setText("Duplicar");
		this.jButtonCopiarFormatoNomiFactorNomi.setText("Copiar");
		this.jButtonVerFormFormatoNomiFactorNomi.setText("Ver");
		this.jButtonNuevoRelacionesFormatoNomiFactorNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.setText("Guardar");
		this.jButtonCerrarFormatoNomiFactorNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormatoNomiFactorNomi,"nuevo_button","Nuevo",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormatoNomiFactorNomi,"duplicar_button","Duplicar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormatoNomiFactorNomi,"copiar_button","Copiar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormatoNomiFactorNomi,"ver_form","Ver",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormatoNomiFactorNomi,"nuevorelaciones_button","Nuevo Rel",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi,"guardarcambiostabla_button","Guardar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormatoNomiFactorNomi,"cerrar_button","Salir",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormatoNomiFactorNomi.setToolTipText("Nuevo"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormatoNomiFactorNomi.setToolTipText("Duplicar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormatoNomiFactorNomi.setToolTipText("Copiar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormatoNomiFactorNomi.setToolTipText("Ver"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormatoNomiFactorNomi.setToolTipText("Nuevo Rel"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.setToolTipText("Guardar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormatoNomiFactorNomi.setToolTipText("Salir"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormatoNomiFactorNomi";
		inputMap = this.jButtonNuevoFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormatoNomiFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormatoNomiFactorNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormatoNomiFactorNomi";
		inputMap = this.jButtonDuplicarFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormatoNomiFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormatoNomiFactorNomi"));
		
		//COPIAR
		sMapKey = "CopiarFormatoNomiFactorNomi";
		inputMap = this.jButtonCopiarFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormatoNomiFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormatoNomiFactorNomi"));
		
		//VEr FORM
		sMapKey = "VerFormFormatoNomiFactorNomi";
		inputMap = this.jButtonVerFormFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormatoNomiFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormatoNomiFactorNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormatoNomiFactorNomi";
		inputMap = this.jButtonNuevoRelacionesFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormatoNomiFactorNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormatoNomiFactorNomi";
		inputMap = this.jButtonModificarFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormatoNomiFactorNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormatoNomiFactorNomi";
		inputMap = this.jButtonCerrarFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormatoNomiFactorNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormatoNomiFactorNomi";
		inputMap = this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormatoNomiFactorNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormatoNomiFactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormatoNomiFactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormatoNomiFactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormatoNomiFactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormatoNomiFactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormatoNomiFactorNomi.setName("jPanelParametrosReportesFormatoNomiFactorNomi"); 
		
		this.jPanelParametrosReportesAccionesFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormatoNomiFactorNomi.setName("jPanelParametrosReportesAccionesFormatoNomiFactorNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonRecargarInformacionFormatoNomiFactorNomi.setText("Recargar");
		this.jButtonRecargarInformacionFormatoNomiFactorNomi.setToolTipText("Recargar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormatoNomiFactorNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonProcesarInformacionFormatoNomiFactorNomi.setText("Procesar");
		this.jButtonProcesarInformacionFormatoNomiFactorNomi.setToolTipText("Procesar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormatoNomiFactorNomi.setVisible(false);
			
		this.jButtonProcesarInformacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.setText("TIPO");       
		this.jComboBoxTiposReportesFormatoNomiFactorNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.setText("Accion");
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setText("Accion");
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormatoNomiFactorNomi = new JLabelMe();
		
		this.jLabelAccionesFormatoNomiFactorNomi.setText("Acciones");		
		this.jLabelAccionesFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormatoNomiFactorNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormatoNomiFactorNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormatoNomiFactorNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormatoNomiFactorNomi = new JButtonMe();
		//this.jButtonAnterioresFormatoNomiFactorNomi.setText("<<");
        this.jButtonAnterioresFormatoNomiFactorNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormatoNomiFactorNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormatoNomiFactorNomi = new JButtonMe();
		//this.jButtonSiguientesFormatoNomiFactorNomi.setText(">>");
        this.jButtonSiguientesFormatoNomiFactorNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormatoNomiFactorNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi,"nuevoguardarcambios_button","Nue",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormatoNomiFactorNomi";
		inputMap = this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormatoNomiFactorNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormatoNomiFactorNomi";
		inputMap = this.jButtonRecargarInformacionFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormatoNomiFactorNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormatoNomiFactorNomi";
		inputMap = this.jButtonSiguientesFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormatoNomiFactorNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormatoNomiFactorNomi";
		inputMap = this.jButtonAnterioresFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormatoNomiFactorNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormatoNomiFactorNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormatoNomiFactorNomi.setMinimumSize(new Dimension(this.getWidth(),FormatoNomiFactorNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiFactorNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormatoNomiFactorNomi.setMaximumSize(new Dimension(this.getWidth(),FormatoNomiFactorNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiFactorNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormatoNomiFactorNomi.setPreferredSize(new Dimension(this.getWidth(),FormatoNomiFactorNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiFactorNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormatoNomiFactorNomi = new GridBagLayout();

			this.jPanelPaginacionFormatoNomiFactorNomi.setLayout(gridaBagLayoutPaginacionFormatoNomiFactorNomi);						
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonAnterioresFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
					
						
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
			
			this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
						
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
			this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonSiguientesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonNuevoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
				this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonNuevoRelacionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			}
			
			
			if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
				this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			}
			
			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonDuplicarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonCopiarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonVerFormFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormatoNomiFactorNomi.add(this.jButtonCerrarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		
		
		this.jButtonRecargarInformacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormatoNomiFactorNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormatoNomiFactorNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormatoNomiFactorNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormatoNomiFactorNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormatoNomiFactorNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormatoNomiFactorNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormatoNomiFactorNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormatoNomiFactorNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormatoNomiFactorNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormatoNomiFactorNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormatoNomiFactorNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormatoNomiFactorNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormatoNomiFactorNomi.setLayout(gridaBagParametrosReportesFormatoNomiFactorNomi);
			this.jPanelParametrosReportesAccionesFormatoNomiFactorNomi.setLayout(gridaBagParametrosReportesAccionesFormatoNomiFactorNomi);
			
			
			this.jPanelParametrosAuxiliar1FormatoNomiFactorNomi.setLayout(gridaBagParametrosAuxiliar1FormatoNomiFactorNomi);
			this.jPanelParametrosAuxiliar2FormatoNomiFactorNomi.setLayout(gridaBagParametrosAuxiliar2FormatoNomiFactorNomi);
			this.jPanelParametrosAuxiliar3FormatoNomiFactorNomi.setLayout(gridaBagParametrosAuxiliar3FormatoNomiFactorNomi);
			this.jPanelParametrosAuxiliar4FormatoNomiFactorNomi.setLayout(gridaBagParametrosAuxiliar4FormatoNomiFactorNomi);
			//this.jPanelParametrosAuxiliar5FormatoNomiFactorNomi.setLayout(gridaBagParametrosAuxiliar2FormatoNomiFactorNomi);			
			
			
			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jButtonRecargarInformacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomiFactorNomi.add(this.jComboBoxTiposPaginacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomiFactorNomi.add(this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomiFactorNomi.add(this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jPanelParametrosAuxiliar1FormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormatoNomiFactorNomi.add(this.jComboBoxTiposReportesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);																		
			
			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FormatoNomiFactorNomi.add(this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jPanelParametrosAuxiliar4FormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jComboBoxTiposReportesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jCheckBoxGenerarReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jPanelParametrosAuxiliar2FormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jLabelAccionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jButtonAbrirOrderByFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
			
			
			/*
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoNomiFactorNomi.add(this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);															
				
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoNomiFactorNomi.add(this.jCheckBoxSeleccionadosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);															
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoNomiFactorNomi.add(this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jPanelParametrosAuxiliar3FormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jComboBoxTiposRelacionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
				
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jComboBoxTiposAccionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
	
				
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiFactorNomi.add(this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormatoNomiFactorNomi = new GridBagLayout();

			this.jScrollPanelDatosFormatoNomiFactorNomi.setLayout(gridaBagLayoutDatosFormatoNomiFactorNomi);
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
			
			this.jScrollPanelDatosFormatoNomiFactorNomi.add(this.jTableDatosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormatoNomiFactorNomi.setViewportView(this.jTableDatosFormatoNomiFactorNomi);
		this.jTableDatosFormatoNomiFactorNomi.setFillsViewportHeight(true);
		this.jTableDatosFormatoNomiFactorNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormatoNomiFactorNomi= new GridBagLayout();
		this.jPanelAccionesFormatoNomiFactorNomi.setLayout(gridaBagLayoutAccionesFormatoNomiFactorNomi);
		
		
		/*	
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
			
		this.jPanelAccionesFormatoNomiFactorNomi.add(this.jButtonNuevoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdFactorNomiFormatoNomiFactorNomi= new GridBagLayout();
		gridaBagLayoutFK_IdFactorNomiFormatoNomiFactorNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFactorNomiFormatoNomiFactorNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFactorNomiFormatoNomiFactorNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFactorNomiFormatoNomiFactorNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFactorNomiFormatoNomiFactorNomi.setLayout(gridaBagLayoutFK_IdFactorNomiFormatoNomiFactorNomi);

		gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
		jPanelFK_IdFactorNomiFormatoNomiFactorNomi.add(jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);

		gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
		jPanelFK_IdFactorNomiFormatoNomiFactorNomi.add(jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);

		gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
		gridBagConstraintsFormatoNomiFactorNomi.gridx =1;
		jPanelFK_IdFactorNomiFormatoNomiFactorNomi.add(jButtonFK_IdFactorNomiFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);

		jTabbedPaneBusquedasFormatoNomiFactorNomi.addTab("1.-Por Factor Nomi ", jPanelFK_IdFactorNomiFormatoNomiFactorNomi);
		jTabbedPaneBusquedasFormatoNomiFactorNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFormatoNomiFormatoNomiFactorNomi= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNomiFormatoNomiFactorNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiFormatoNomiFactorNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiFormatoNomiFactorNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNomiFormatoNomiFactorNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNomiFormatoNomiFactorNomi.setLayout(gridaBagLayoutFK_IdFormatoNomiFormatoNomiFactorNomi);

		gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
		jPanelFK_IdFormatoNomiFormatoNomiFactorNomi.add(jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);

		gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
		jPanelFK_IdFormatoNomiFormatoNomiFactorNomi.add(jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);

		gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiFactorNomi.gridy = 1;
		gridBagConstraintsFormatoNomiFactorNomi.gridx =1;
		jPanelFK_IdFormatoNomiFormatoNomiFactorNomi.add(jButtonFK_IdFormatoNomiFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);

		jTabbedPaneBusquedasFormatoNomiFactorNomi.addTab("2.-Por Formato Nomi ", jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);
		jTabbedPaneBusquedasFormatoNomiFactorNomi.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormatoNomiFactorNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormatoNomiFactorNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();						
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;		
			//this.gridBagConstraintsFormatoNomiFactorNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;		
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormatoNomiFactorNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;		
			this.gridBagConstraintsFormatoNomiFactorNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);								
		
		
		/*
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		*/		
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx =0;
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormatoNomiFactorNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
				
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormatoNomiFactorNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormatoNomiFactorNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosFormatoNomiFactorNomi.setLayout(gridaBagLayoutBusquedasParametrosFormatoNomiFactorNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormatoNomiFactorNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			
			
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
			
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormatoNomiFactorNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormatoNomiFactorNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormatoNomiFactorNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.setName("jPanelReporteDinamicoFormatoNomiFactorNomi"); 
		
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.setLayout(gridaBagLayoutReporteDinamicoFormatoNomiFactorNomi);
		
		
		this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormatoNomiFactorNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Factor Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteFormatoNomiFactorNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelColumnasSelectReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormatoNomiFactorNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteFormatoNomiFactorNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormatoNomiFactorNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormatoNomiFactorNomi=new JScrollPane(this.jListColumnasSelectReporteFormatoNomiFactorNomi);
			
			this.jScrollColumnasSelectReporteFormatoNomiFactorNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormatoNomiFactorNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormatoNomiFactorNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jListColumnasSelectReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jScrollColumnasSelectReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormatoNomiFactorNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelRelacionesSelectReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormatoNomiFactorNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormatoNomiFactorNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormatoNomiFactorNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormatoNomiFactorNomi=new JScrollPane(this.jListRelacionesSelectReporteFormatoNomiFactorNomi);
			
			this.jScrollRelacionesSelectReporteFormatoNomiFactorNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormatoNomiFactorNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormatoNomiFactorNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jListRelacionesSelectReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jScrollRelacionesSelectReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormatoNomiFactorNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelConGraficoDinamicoFormatoNomiFactorNomi.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelConGraficoDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jCheckBoxConGraficoDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormatoNomiFactorNomi.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelColumnaCategoriaGraficoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormatoNomiFactorNomi.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelColumnaCategoriaValorFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormatoNomiFactorNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormatoNomiFactorNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jComboBoxColumnaCategoriaValorFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormatoNomiFactorNomi.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelColumnasValoresGraficoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormatoNomiFactorNomi = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormatoNomiFactorNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormatoNomiFactorNomi.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormatoNomiFactorNomi=new JScrollPane(this.jListColumnasValoresGraficoFormatoNomiFactorNomi);
			
			this.jScrollColumnasValoresGraficoFormatoNomiFactorNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormatoNomiFactorNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormatoNomiFactorNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jListColumnasSelectReporteFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jScrollColumnasValoresGraficoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormatoNomiFactorNomi.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelTiposGraficosReportesDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormatoNomiFactorNomi.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiFactorNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormatoNomiFactorNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelGenerarExcelReporteDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomi.setToolTipText("Generar EXCEL"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jComboBoxTiposReportesDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormatoNomiFactorNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jLabelTiposArchivoReporteDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormatoNomiFactorNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormatoNomiFactorNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormatoNomiFactorNomi.setToolTipText("Generar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jButtonGenerarReporteDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormatoNomiFactorNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormatoNomiFactorNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormatoNomiFactorNomi.setToolTipText("Cancelar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomiFactorNomi.add(this.jButtonCerrarReporteDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormatoNomiFactorNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi= new JScrollPane(jPanelReporteDinamicoFormatoNomiFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Factor Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormatoNomiFactorNomi);
		this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getContentPane().add(this.jScrollPanelReporteDinamicoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormatoNomiFactorNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormatoNomiFactorNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormatoNomiFactorNomi.setName("jPanelImportacionFormatoNomiFactorNomi"); 
		
		this.jPanelImportacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormatoNomiFactorNomi.setLayout(gridaBagLayoutImportacionFormatoNomiFactorNomi);
		
		
		this.jInternalFrameImportacionFormatoNomiFactorNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormatoNomiFactorNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormatoNomiFactorNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormatoNomiFactorNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormatoNomiFactorNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormatoNomiFactorNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormatoNomiFactorNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setResizable(true);
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setClosable(true);
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormatoNomiFactorNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormatoNomiFactorNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormatoNomiFactorNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setResizable(true);
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setClosable(true);
	    this.jInternalFrameImportacionFormatoNomiFactorNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Factor Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelArchivoImportacionFormatoNomiFactorNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormatoNomiFactorNomi.add(this.jLabelArchivoImportacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormatoNomiFactorNomi = new JFileChooser();		
		this.jFileChooserImportacionFormatoNomiFactorNomi.setToolTipText("ESCOGER ARCHIVO"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonAbrirImportacionFormatoNomiFactorNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormatoNomiFactorNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormatoNomiFactorNomi.setToolTipText("Generar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomiFactorNomi.add(this.jButtonAbrirImportacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormatoNomiFactorNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionFormatoNomiFactorNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormatoNomiFactorNomi.add(this.jLabelPathArchivoImportacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormatoNomiFactorNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomiFactorNomi.add(this.jTextFieldPathArchivoImportacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonGenerarImportacionFormatoNomiFactorNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormatoNomiFactorNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormatoNomiFactorNomi.setToolTipText("Generar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomiFactorNomi.add(this.jButtonGenerarImportacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonCerrarImportacionFormatoNomiFactorNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormatoNomiFactorNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormatoNomiFactorNomi.setToolTipText("Cancelar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomiFactorNomi.add(this.jButtonCerrarImportacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormatoNomiFactorNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionFormatoNomiFactorNomi= new JScrollPane(jPanelImportacionFormatoNomiFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormatoNomiFactorNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormatoNomiFactorNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormatoNomiFactorNomi);
		this.jInternalFrameImportacionFormatoNomiFactorNomi.getContentPane().add(this.jScrollPanelImportacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormatoNomiFactorNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormatoNomiFactorNomi = new JButtonMe();
			this.jButtonAbrirOrderByFormatoNomiFactorNomi.setText("Orden");
			this.jButtonAbrirOrderByFormatoNomiFactorNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormatoNomiFactorNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormatoNomiFactorNomi";
			inputMap = this.jButtonAbrirOrderByFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormatoNomiFactorNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormatoNomiFactorNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormatoNomiFactorNomi.setName("jPanelOrderByFormatoNomiFactorNomi"); 
			
			this.jPanelOrderByFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormatoNomiFactorNomi.setLayout(gridaBagLayoutOrderByFormatoNomiFactorNomi);
			
			
			this.jTableDatosFormatoNomiFactorNomiOrderBy = new JTableMe();        
			this.jTableDatosFormatoNomiFactorNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormatoNomiFactorNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormatoNomiFactorNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormatoNomiFactorNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormatoNomiFactorNomiOrderBy.setViewportView(this.jTableDatosFormatoNomiFactorNomiOrderBy);
			this.jTableDatosFormatoNomiFactorNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormatoNomiFactorNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormatoNomiFactorNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormatoNomiFactorNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormatoNomiFactorNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormatoNomiFactorNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setTitle("Orden");
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setResizable(true);
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setClosable(true);
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Factor Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormatoNomiFactorNomi.ipady =150;
				
			this.jPanelOrderByFormatoNomiFactorNomi.add(jScrollPanelDatosFormatoNomiFactorNomiOrderBy, this.gridBagConstraintsFormatoNomiFactorNomi);//this.jTableDatosFormatoNomiFactorNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormatoNomiFactorNomi = new JButtonMe();
			this.jButtonCerrarOrderByFormatoNomiFactorNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormatoNomiFactorNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormatoNomiFactorNomi.setToolTipText("Cancelar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormatoNomiFactorNomi.add(this.jButtonCerrarOrderByFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormatoNomiFactorNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByFormatoNomiFactorNomi= new JScrollPane(jPanelOrderByFormatoNomiFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormatoNomiFactorNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormatoNomiFactorNomi);
			
			this.jInternalFrameOrderByFormatoNomiFactorNomi.getContentPane().add(this.jScrollPanelOrderByFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
		
		} else {
			this.jButtonAbrirOrderByFormatoNomiFactorNomi = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formatonomifactornomiSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormatoNomiFactorNomi.getRowHeight();//FormatoNomiFactorNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormatoNomiFactorNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi.isSelected()) {
					iHeightTable=FormatoNomiFactorNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoNomiFactorNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoNomiFactorNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormatoNomiFactorNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormatoNomiFactorNomi.isSelected()) {
					iHeightTable=FormatoNomiFactorNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoNomiFactorNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoNomiFactorNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormatoNomiFactorNomi!=null && this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormatoNomiFactorNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormatoNomiFactorNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormatoNomiFactorNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formatonomifactornomiLogic.getFormatoNomiFactorNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomifactornomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormatoNomiFactorNomi> TraerFormatoNomiFactorNomiBeans(List<FormatoNomiFactorNomi> formatonomifactornomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomis) {
					
				if(!(FormatoNomiFactorNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormatoNomiFactorNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formatonomifactornomi.setsDetalleGeneralEntityReporte(FormatoNomiFactorNomiConstantesFunciones.getFormatoNomiFactorNomiDescripcion(formatonomifactornomi));
										
					formatonomifactornomi.setesta_activo_descripcion(FormatoNomiFactorNomiConstantesFunciones.getesta_activoDescripcion(formatonomifactornomi));	
					
					

					if(formatonomifactornomi.getCalificacionEmpleados()!=null && Funciones.existeClass(classes,CalificacionEmpleado.class)) {
						try{formatonomifactornomi.setcalificacionempleadosDescripcionReporte(new JRBeanCollectionDataSource(CalificacionEmpleadoJInternalFrame.TraerCalificacionEmpleadoBeans(formatonomifactornomi.getCalificacionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//formatonomifactornomi.setsDetalleGeneralEntityReporte(formatonomifactornomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//formatonomifactornomibeans.add(formatonomifactornomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formatonomifactornomis;
    }
	//PARA REPORTES FIN
}
