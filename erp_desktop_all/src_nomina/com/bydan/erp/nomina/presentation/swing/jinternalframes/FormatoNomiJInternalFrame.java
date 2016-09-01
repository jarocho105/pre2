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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.FormatoNomiConstantesFunciones;

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
public class FormatoNomiJInternalFrame extends FormatoNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormatoNomi;
	
	protected JMenuBar jmenuBarFormatoNomi;
	
	protected JMenu jmenuFormatoNomi;
	protected JMenu jmenuDatosFormatoNomi;
	protected JMenu jmenuArchivoFormatoNomi;
	protected JMenu jmenuAccionesFormatoNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormatoNomi;	
	protected GridBagConstraints gridBagConstraintsFormatoNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormatoNomiDetalleFormJInternalFrame jInternalFrameDetalleFormFormatoNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormatoNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormatoNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected PuntajeNomiBeanSwingJInternalFrame puntajenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puntajenomi="";
	
	public FormatoNomiSessionBean formatonomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public PuntajeNomiSessionBean puntajenomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormatoNomi> formatonomis;		
	public List<FormatoNomi> formatonomisEliminados;	
	public List<FormatoNomi> formatonomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormatoNomi;		
	protected JButton jButtonAbrirOrderByFormatoNomi;
	
	
	//protected JPanel jPanelOrderByFormatoNomi;
	//public JScrollPane jScrollPanelOrderByFormatoNomi;	
	//protected JButton jButtonCerrarOrderByFormatoNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormatoNomiLogic formatonomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormatoNomi;
	public JScrollPane jScrollPanelDatosEdicionFormatoNomi;
	public JScrollPane jScrollPanelDatosGeneralFormatoNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosFormatoNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormatoNomi;
	//public JScrollPane jScrollPanelImportacionFormatoNomi;
	
	
	
	protected JPanel jPanelAccionesFormatoNomi;
	
    protected JPanel jPanelPaginacionFormatoNomi;
    protected JPanel jPanelParametrosReportesFormatoNomi;
	protected JPanel jPanelParametrosReportesAccionesFormatoNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormatoNomi;
	protected JPanel jPanelParametrosAuxiliar2FormatoNomi;
	protected JPanel jPanelParametrosAuxiliar3FormatoNomi;
	protected JPanel jPanelParametrosAuxiliar4FormatoNomi;
	//protected JPanel jPanelParametrosAuxiliar5FormatoNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormatoNomi;
	//protected JPanel jPanelImportacionFormatoNomi;
	
	
	public JTable jTableDatosFormatoNomi;
	
	
	
	//public JTable jTableDatosFormatoNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormatoNomi;
	protected JButton jButtonDuplicarFormatoNomi;
	protected JButton jButtonCopiarFormatoNomi;
	protected JButton jButtonVerFormFormatoNomi;
	protected JButton jButtonNuevoRelacionesFormatoNomi;
	protected JButton jButtonModificarFormatoNomi;
	
    protected JButton jButtonGuardarCambiosTablaFormatoNomi;
	protected JButton jButtonCerrarFormatoNomi;
	
	
	protected JButton jButtonRecargarInformacionFormatoNomi;
	protected JButton jButtonProcesarInformacionFormatoNomi;
	
	
	protected JButton jButtonAnterioresFormatoNomi;
	protected JButton jButtonSiguientesFormatoNomi;
	protected JButton jButtonNuevoGuardarCambiosFormatoNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormatoNomi;
	//protected JButton jButtonCerrarReporteDinamicoFormatoNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormatoNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormatoNomi;
	//protected JButton jButtonGenerarImportacionFormatoNomi;
	//protected JButton jButtonCerrarImportacionFormatoNomi;
	//protected JFileChooser jFileChooserImportacionFormatoNomi;
	//protected File fileImportacionFormatoNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormatoNomi;
	protected JButton jButtonDuplicarToolBarFormatoNomi;
	protected JButton jButtonNuevoRelacionesToolBarFormatoNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarFormatoNomi;
	protected JButton jButtonCopiarToolBarFormatoNomi;
	protected JButton jButtonVerFormToolBarFormatoNomi;
	public JButton jButtonGuardarCambiosTablaToolBarFormatoNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarFormatoNomi;
	protected JButton jButtonCerrarToolBarFormatoNomi;
	
	protected JButton jButtonRecargarInformacionToolBarFormatoNomi;
	protected JButton jButtonProcesarInformacionToolBarFormatoNomi;
	protected JButton jButtonAnterioresToolBarFormatoNomi;
	protected JButton jButtonSiguientesToolBarFormatoNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormatoNomi;
	protected JButton jButtonAbrirOrderByToolBarFormatoNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormatoNomi;
	protected JMenuItem jMenuItemDuplicarFormatoNomi;
	protected JMenuItem jMenuItemNuevoRelacionesFormatoNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormatoNomi;
	protected JMenuItem jMenuItemCopiarFormatoNomi;
	protected JMenuItem jMenuItemVerFormFormatoNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormatoNomi;
	protected JMenuItem jMenuItemCerrarFormatoNomi;
	protected JMenuItem jMenuItemDetalleCerrarFormatoNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormatoNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormatoNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionFormatoNomi;
	protected JMenuItem jMenuItemProcesarInformacionFormatoNomi;
	protected JMenuItem jMenuItemAnterioresFormatoNomi;
	protected JMenuItem jMenuItemSiguientesFormatoNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormatoNomi;
	protected JMenuItem jMenuItemAbrirOrderByFormatoNomi;
	protected JMenuItem jMenuItemMostrarOcultarFormatoNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormatoNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormatoNomi;
	protected JCheckBox jCheckBoxSeleccionadosFormatoNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormatoNomi;
	protected JCheckBox jCheckBoxConGraficoReporteFormatoNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormatoNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormatoNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormatoNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormatoNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormatoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormatoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormatoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormatoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormatoNomi;
	protected JTextField jTextFieldValorCampoGeneralFormatoNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormatoNomi;
	//public JList<Reporte> jListColumnasSelectReporteFormatoNomi;
	//public JScrollPane jScrollColumnasSelectReporteFormatoNomi;
	
	//public JLabel jLabelRelacionesSelectReporteFormatoNomi;
	//public JList<Reporte> jListRelacionesSelectReporteFormatoNomi;
	//public JScrollPane jScrollRelacionesSelectReporteFormatoNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormatoNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormatoNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormatoNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormatoNomi;
	
		
	//public JLabel jLabelArchivoImportacionFormatoNomi;	
	//public JLabel jLabelPathArchivoImportacionFormatoNomi;
	//protected JTextField jTextFieldPathArchivoImportacionFormatoNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormatoNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormatoNomi;
	
	//public JLabel jLabelColumnaCategoriaValorFormatoNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormatoNomi;
	
	//public JLabel jLabelColumnasValoresGraficoFormatoNomi;
	//public JList<Reporte> jListColumnasValoresGraficoFormatoNomi;
	//public JScrollPane jScrollColumnasValoresGraficoFormatoNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormatoNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormatoNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormatoNomi;
	public JPanel jPanelFK_IdEstructuraFormatoNomi;
	public JButton jButtonFK_IdEstructuraFormatoNomi;
	public JPanel jPanelFK_IdPuntajeNomiFormatoNomi;
	public JButton jButtonFK_IdPuntajeNomiFormatoNomi;
	
	public JPanel jPanelid_estructuraFK_IdEstructuraFormatoNomi;
	public JLabel jLabelid_estructuraFK_IdEstructuraFormatoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraFormatoNomi;
	public JButton jButtonid_estructuraFK_IdEstructuraFormatoNomi= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraFormatoNomiUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraFormatoNomiBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraFormatoNomiArbol= new JButtonMe();

	
	public JPanel jPanelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi;
	public JLabel jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi;
	public JButton jButtonid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi= new JButtonMe();
	public JButton jButtonid_puntaje_nomiFK_IdPuntajeNomiFormatoNomiUpdate= new JButtonMe();
	public JButton jButtonid_puntaje_nomiFK_IdPuntajeNomiFormatoNomiBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FormatoNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormatoNomi)	{
		this.jButtonRecargarInformacionFormatoNomi = jButtonRecargarInformacionFormatoNomi;
	}
	
	public JButton getjButtonProcesarInformacionFormatoNomi() {
		return this.jButtonProcesarInformacionFormatoNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormatoNomi)	{
		this.jButtonProcesarInformacionFormatoNomi = jButtonProcesarInformacionFormatoNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionFormatoNomi() {
		return this.jButtonRecargarInformacionFormatoNomi;
	}
	
	
	public List<FormatoNomi> getformatonomis() {
		return this.formatonomis;
	}

	public void setformatonomis(List<FormatoNomi> formatonomis) {
		this.formatonomis = formatonomis;
	}
	
	public List<FormatoNomi> getformatonomisAux() {
		return this.formatonomisAux;
	}

	public void setformatonomisAux(List<FormatoNomi> formatonomisAux) {
		this.formatonomisAux = formatonomisAux;
	}
	
	public List<FormatoNomi> getformatonomisEliminados() {
		return this.formatonomisEliminados;
	}

	public void setFormatoNomisEliminados(List<FormatoNomi> formatonomisEliminados) {
		this.formatonomisEliminados = formatonomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormatoNomi() {
		return jComboBoxTiposSeleccionarFormatoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormatoNomi(
			JComboBox jComboBoxTiposSeleccionarFormatoNomi) {
		this.jComboBoxTiposSeleccionarFormatoNomi = jComboBoxTiposSeleccionarFormatoNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormatoNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormatoNomi() {
		return jTextFieldValorCampoGeneralFormatoNomi;
	}

	public void setjTextFieldValorCampoGeneralFormatoNomi(
			JTextField jTextFieldValorCampoGeneralFormatoNomi) {
		this.jTextFieldValorCampoGeneralFormatoNomi = jTextFieldValorCampoGeneralFormatoNomi;
	}

	public void setBorderResaltarValorCampoGeneralFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormatoNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormatoNomi() {
		return this.jCheckBoxSeleccionarTodosFormatoNomi;
	}

	public void setjCheckBoxSeleccionarTodosFormatoNomi(
			JCheckBox jCheckBoxSeleccionarTodosFormatoNomi) {
		this.jCheckBoxSeleccionarTodosFormatoNomi = jCheckBoxSeleccionarTodosFormatoNomi;
	}

	public void setBorderResaltarSeleccionarTodosFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormatoNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormatoNomi() {
		return this.jCheckBoxSeleccionadosFormatoNomi;
	}

	public void setjCheckBoxSeleccionadosFormatoNomi(
			JCheckBox jCheckBoxSeleccionadosFormatoNomi) {
		this.jCheckBoxSeleccionadosFormatoNomi = jCheckBoxSeleccionadosFormatoNomi;
	}
	
	public void setBorderResaltarSeleccionadosFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormatoNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormatoNomi() {
		return this.jComboBoxTiposArchivosReportesFormatoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormatoNomi(
			JComboBox jComboBoxTiposArchivosReportesFormatoNomi) {
		this.jComboBoxTiposArchivosReportesFormatoNomi = jComboBoxTiposArchivosReportesFormatoNomi;
	}

	public void setBorderResaltarTiposArchivosReportesFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormatoNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormatoNomi() {
		return this.jComboBoxTiposReportesFormatoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormatoNomi(
			JComboBox jComboBoxTiposReportesFormatoNomi) {
		this.jComboBoxTiposReportesFormatoNomi = jComboBoxTiposReportesFormatoNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormatoNomi() {
	//	return jComboBoxTiposReportesDinamicoFormatoNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormatoNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoFormatoNomi) {
	//	this.jComboBoxTiposReportesDinamicoFormatoNomi = jComboBoxTiposReportesDinamicoFormatoNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormatoNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormatoNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormatoNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormatoNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormatoNomi = jComboBoxTiposArchivosReportesDinamicoFormatoNomi;
	//}
	
	public void setBorderResaltarTiposReportesFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormatoNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormatoNomi() {
		return this.jComboBoxTiposGraficosReportesFormatoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormatoNomi(
			JComboBox jComboBoxTiposGraficosReportesFormatoNomi) {
		this.jComboBoxTiposGraficosReportesFormatoNomi = jComboBoxTiposGraficosReportesFormatoNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormatoNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormatoNomi() {
		return this.jComboBoxTiposPaginacionFormatoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormatoNomi(
			JComboBox jComboBoxTiposPaginacionFormatoNomi) {
		this.jComboBoxTiposPaginacionFormatoNomi = jComboBoxTiposPaginacionFormatoNomi;
	}
	
	public void setBorderResaltarTiposPaginacionFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormatoNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormatoNomi() {
		return this.jComboBoxTiposRelacionesFormatoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormatoNomi() {
		return this.jComboBoxTiposAccionesFormatoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormatoNomi(
			JComboBox jComboBoxTiposRelacionesFormatoNomi) {
		this.jComboBoxTiposRelacionesFormatoNomi = jComboBoxTiposRelacionesFormatoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormatoNomi(
			JComboBox jComboBoxTiposAccionesFormatoNomi) {
		this.jComboBoxTiposAccionesFormatoNomi = jComboBoxTiposAccionesFormatoNomi;
	}
	
	public void setBorderResaltarTiposRelacionesFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormatoNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormatoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormatoNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormatoNomi() {
	//	return jCheckBoxConGraficoDinamicoFormatoNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormatoNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormatoNomi) {
	//	this.jCheckBoxConGraficoDinamicoFormatoNomi = jCheckBoxConGraficoDinamicoFormatoNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormatoNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormatoNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormatoNomi .setBorder(borderResaltar);		
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
		this.formatonomiSessionBean=new FormatoNomiSessionBean();
		
		this.formatonomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatonomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formato Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
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
		
		FormatoNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormatoNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"nuevo","nuevo","Nuevo"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"duplicar","duplicar","Duplicar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"copiar","copiar","Copiar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"ver_form","ver_form","Ver"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"recargar","recargar","Recargar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormatoNomi,this.jTtoolBarFormatoNomi,
							"cerrar","cerrar","Salir"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormatoNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormatoNomi;
			
				this.jButtonProcesarInformacionToolBarFormatoNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormatoNomi;
				
		//protected JButton jButtonModificarToolBarFormatoNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormatoNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormatoNomi=new JMenuMe("General");
		this.jmenuArchivoFormatoNomi=new JMenuMe("Archivo");
		this.jmenuAccionesFormatoNomi=new JMenuMe("Acciones");
		this.jmenuDatosFormatoNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormatoNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormatoNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormatoNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormatoNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormatoNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormatoNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormatoNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormatoNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormatoNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormatoNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormatoNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormatoNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormatoNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormatoNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormatoNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormatoNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormatoNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormatoNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormatoNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormatoNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormatoNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormatoNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormatoNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormatoNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormatoNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormatoNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormatoNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormatoNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormatoNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormatoNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormatoNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormatoNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormatoNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormatoNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormatoNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormatoNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormatoNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormatoNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormatoNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormatoNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormatoNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormatoNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormatoNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormatoNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormatoNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormatoNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormatoNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormatoNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormatoNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormatoNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormatoNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormatoNomi.add(this.jMenuItemCerrarFormatoNomi);
			
			this.jmenuAccionesFormatoNomi.add(this.jMenuItemNuevoFormatoNomi);
			this.jmenuAccionesFormatoNomi.add(this.jMenuItemNuevoGuardarCambiosFormatoNomi);
			this.jmenuAccionesFormatoNomi.add(this.jMenuItemNuevoRelacionesFormatoNomi);
			this.jmenuAccionesFormatoNomi.add(this.jMenuItemGuardarCambiosTablaFormatoNomi);		
			this.jmenuAccionesFormatoNomi.add(this.jMenuItemDuplicarFormatoNomi);		
			this.jmenuAccionesFormatoNomi.add(this.jMenuItemCopiarFormatoNomi);		
			this.jmenuAccionesFormatoNomi.add(this.jMenuItemVerFormFormatoNomi);		
			
			this.jmenuDatosFormatoNomi.add(this.jMenuItemRecargarInformacionFormatoNomi);				
			this.jmenuDatosFormatoNomi.add(this.jMenuItemAnterioresFormatoNomi);				
			this.jmenuDatosFormatoNomi.add(this.jMenuItemSiguientesFormatoNomi);				
			this.jmenuDatosFormatoNomi.add(this.jMenuItemAbrirOrderByFormatoNomi);				
			this.jmenuDatosFormatoNomi.add(this.jMenuItemMostrarOcultarFormatoNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormatoNomi.add(this.jMenuItemGuardarCambiosFormatoNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormatoNomi.add(this.jmenuArchivoFormatoNomi);		
			this.jmenuBarFormatoNomi.add(this.jmenuAccionesFormatoNomi);		
			this.jmenuBarFormatoNomi.add(this.jmenuDatosFormatoNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormatoNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormatoNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEstructuraFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraFormatoNomi.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraFormatoNomi= new JButtonMe();
		this.jButtonFK_IdEstructuraFormatoNomi.setText("Buscar");
		this.jButtonFK_IdEstructuraFormatoNomi.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraFormatoNomi,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraFormatoNomi = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraFormatoNomi.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraFormatoNomi.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraFormatoNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraFormatoNomi= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraFormatoNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPuntajeNomiFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPuntajeNomiFormatoNomi.setToolTipText("Buscar Por Puntaje Nomi ");
		this.jButtonFK_IdPuntajeNomiFormatoNomi= new JButtonMe();
		this.jButtonFK_IdPuntajeNomiFormatoNomi.setText("Buscar");
		this.jButtonFK_IdPuntajeNomiFormatoNomi.setToolTipText("Buscar Por Puntaje Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPuntajeNomiFormatoNomi,"buscar_button","Buscar Por Puntaje Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPuntajeNomiFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi = new JLabelMe();
		jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setText("Puntaje Nomi :");
		jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setToolTipText("Puntaje Nomi");
		jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi= new JComboBoxMe();
		jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormatoNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasFormatoNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormatoNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormatoNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormatoNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormatoNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormatoNomi = new FormatoNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formato Nomi DATOS");
			this.jInternalFrameDetalleFormFormatoNomi = new FormatoNomiDetalleFormJInternalFrame(jDesktopPane,this.formatonomiSessionBean.getConGuardarRelaciones(),this.formatonomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormatoNomi = null;//new FormatoNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormatoNomi= new GridBagLayout();
		
		
		this.jTableDatosFormatoNomi = new JTableMe();      
		
		String sToolTipFormatoNomi="";
		sToolTipFormatoNomi=FormatoNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormatoNomi+="(Nomina.FormatoNomi)";
		}
		
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormatoNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormatoNomi.setToolTipText(sToolTipFormatoNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormatoNomi);
		this.jTableDatosFormatoNomi.setAutoCreateRowSorter(true);
		this.jTableDatosFormatoNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormatoNomi.setRowSelectionAllowed(true);
		this.jTableDatosFormatoNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormatoNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormatoNomi = new JButtonMe();
		this.jButtonDuplicarFormatoNomi = new JButtonMe();
		this.jButtonCopiarFormatoNomi = new JButtonMe();
		this.jButtonVerFormFormatoNomi = new JButtonMe();
		this.jButtonNuevoRelacionesFormatoNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormatoNomi = new JButtonMe();
		this.jButtonCerrarFormatoNomi = new JButtonMe();
		
		this.jScrollPanelDatosFormatoNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormatoNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formato Nomi";
		
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosFormatoNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormatoNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormatoNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormatoNomi=new ReporteDinamicoJInternalFrame(FormatoNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormatoNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormatoNomi=new ImportacionJInternalFrame(FormatoNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormatoNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormatoNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByFormatoNomi.setText("Orden");
		this.jButtonAbrirOrderByFormatoNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormatoNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormatoNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomi,false,this);
			
			//this.cargarOrderByFormatoNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormatoNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomi,true,this);
			
			//this.cargarOrderByFormatoNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormatoNomi.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosFormatoNomi.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosFormatoNomi.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosFormatoNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormatoNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormatoNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormatoNomi.setText("Nuevo");
		this.jButtonDuplicarFormatoNomi.setText("Duplicar");
		this.jButtonCopiarFormatoNomi.setText("Copiar");
		this.jButtonVerFormFormatoNomi.setText("Ver");
		this.jButtonNuevoRelacionesFormatoNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormatoNomi.setText("Guardar");
		this.jButtonCerrarFormatoNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormatoNomi,"nuevo_button","Nuevo",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormatoNomi,"duplicar_button","Duplicar",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormatoNomi,"copiar_button","Copiar",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormatoNomi,"ver_form","Ver",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormatoNomi,"nuevorelaciones_button","Nuevo Rel",this.formatonomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormatoNomi,"guardarcambiostabla_button","Guardar",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormatoNomi,"cerrar_button","Salir",this.formatonomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormatoNomi.setToolTipText("Nuevo"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormatoNomi.setToolTipText("Duplicar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormatoNomi.setToolTipText("Copiar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormatoNomi.setToolTipText("Ver"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormatoNomi.setToolTipText("Nuevo Rel"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormatoNomi.setToolTipText("Guardar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormatoNomi.setToolTipText("Salir"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormatoNomi";
		inputMap = this.jButtonNuevoFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormatoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormatoNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormatoNomi";
		inputMap = this.jButtonDuplicarFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormatoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormatoNomi"));
		
		//COPIAR
		sMapKey = "CopiarFormatoNomi";
		inputMap = this.jButtonCopiarFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormatoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormatoNomi"));
		
		//VEr FORM
		sMapKey = "VerFormFormatoNomi";
		inputMap = this.jButtonVerFormFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormatoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormatoNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormatoNomi";
		inputMap = this.jButtonNuevoRelacionesFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormatoNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormatoNomi";
		inputMap = this.jButtonModificarFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormatoNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormatoNomi";
		inputMap = this.jButtonCerrarFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormatoNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormatoNomi";
		inputMap = this.jButtonGuardarCambiosTablaFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormatoNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormatoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormatoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormatoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormatoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormatoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormatoNomi.setName("jPanelParametrosReportesFormatoNomi"); 
		
		this.jPanelParametrosReportesAccionesFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormatoNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormatoNomi.setName("jPanelParametrosReportesAccionesFormatoNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormatoNomi = new JButtonMe();
		this.jButtonRecargarInformacionFormatoNomi.setText("Recargar");
		this.jButtonRecargarInformacionFormatoNomi.setToolTipText("Recargar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormatoNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormatoNomi = new JButtonMe();
		this.jButtonProcesarInformacionFormatoNomi.setText("Procesar");
		this.jButtonProcesarInformacionFormatoNomi.setToolTipText("Procesar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormatoNomi.setVisible(false);
			
		this.jButtonProcesarInformacionFormatoNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormatoNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormatoNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormatoNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomi.setText("TIPO");       
		this.jComboBoxTiposReportesFormatoNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormatoNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormatoNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormatoNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormatoNomi.setText("Accion");
		this.jComboBoxTiposRelacionesFormatoNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormatoNomi.setText("Accion");
		this.jComboBoxTiposAccionesFormatoNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormatoNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarFormatoNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormatoNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormatoNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormatoNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormatoNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormatoNomi = new JLabelMe();
		
		this.jLabelAccionesFormatoNomi.setText("Acciones");		
		this.jLabelAccionesFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormatoNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormatoNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormatoNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormatoNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormatoNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormatoNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormatoNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormatoNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormatoNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormatoNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormatoNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormatoNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormatoNomi = new JButtonMe();
		//this.jButtonAnterioresFormatoNomi.setText("<<");
        this.jButtonAnterioresFormatoNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormatoNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormatoNomi = new JButtonMe();
		//this.jButtonSiguientesFormatoNomi.setText(">>");
        this.jButtonSiguientesFormatoNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormatoNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormatoNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormatoNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormatoNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormatoNomi,"nuevoguardarcambios_button","Nue",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormatoNomi";
		inputMap = this.jButtonNuevoGuardarCambiosFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormatoNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormatoNomi";
		inputMap = this.jButtonRecargarInformacionFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormatoNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormatoNomi";
		inputMap = this.jButtonSiguientesFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormatoNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormatoNomi";
		inputMap = this.jButtonAnterioresFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormatoNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormatoNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormatoNomi.setMinimumSize(new Dimension(this.getWidth(),FormatoNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormatoNomi.setMaximumSize(new Dimension(this.getWidth(),FormatoNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormatoNomi.setPreferredSize(new Dimension(this.getWidth(),FormatoNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormatoNomi = new GridBagLayout();

			this.jPanelPaginacionFormatoNomi.setLayout(gridaBagLayoutPaginacionFormatoNomi);						
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = 0;
			this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormatoNomi.add(this.jButtonAnterioresFormatoNomi, this.gridBagConstraintsFormatoNomi);
					
						
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormatoNomi.gridy = 0;
			
			this.jPanelPaginacionFormatoNomi.add(this.jButtonNuevoGuardarCambiosFormatoNomi, this.gridBagConstraintsFormatoNomi);
						
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormatoNomi.gridy = 0;
			this.jPanelPaginacionFormatoNomi.add(this.jButtonSiguientesFormatoNomi, this.gridBagConstraintsFormatoNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomi.add(this.jButtonNuevoFormatoNomi, this.gridBagConstraintsFormatoNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormatoNomi.gridy = 1;
				this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFormatoNomi.add(this.jButtonNuevoRelacionesFormatoNomi, this.gridBagConstraintsFormatoNomi);
			}
			
			
			if(!this.formatonomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormatoNomi.gridy = 1;
				this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormatoNomi.add(this.jButtonGuardarCambiosTablaFormatoNomi, this.gridBagConstraintsFormatoNomi);
			}
			
			
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomi.add(this.jButtonDuplicarFormatoNomi, this.gridBagConstraintsFormatoNomi);
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomi.add(this.jButtonCopiarFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomi.add(this.jButtonVerFormFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormatoNomi.add(this.jButtonCerrarFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
		
		
		this.jButtonRecargarInformacionFormatoNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormatoNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormatoNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormatoNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormatoNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormatoNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormatoNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormatoNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormatoNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormatoNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormatoNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormatoNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormatoNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormatoNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormatoNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormatoNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormatoNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormatoNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormatoNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormatoNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormatoNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormatoNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormatoNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormatoNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormatoNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormatoNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormatoNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormatoNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormatoNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormatoNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormatoNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormatoNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormatoNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormatoNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormatoNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormatoNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormatoNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormatoNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormatoNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormatoNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormatoNomi.setLayout(gridaBagParametrosReportesFormatoNomi);
			this.jPanelParametrosReportesAccionesFormatoNomi.setLayout(gridaBagParametrosReportesAccionesFormatoNomi);
			
			
			this.jPanelParametrosAuxiliar1FormatoNomi.setLayout(gridaBagParametrosAuxiliar1FormatoNomi);
			this.jPanelParametrosAuxiliar2FormatoNomi.setLayout(gridaBagParametrosAuxiliar2FormatoNomi);
			this.jPanelParametrosAuxiliar3FormatoNomi.setLayout(gridaBagParametrosAuxiliar3FormatoNomi);
			this.jPanelParametrosAuxiliar4FormatoNomi.setLayout(gridaBagParametrosAuxiliar4FormatoNomi);
			//this.jPanelParametrosAuxiliar5FormatoNomi.setLayout(gridaBagParametrosAuxiliar2FormatoNomi);			
			
			
			
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomi.add(this.jButtonRecargarInformacionFormatoNomi, this.gridBagConstraintsFormatoNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomi.add(this.jComboBoxTiposPaginacionFormatoNomi, this.gridBagConstraintsFormatoNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomi.add(this.jCheckBoxConAltoMaximoTablaFormatoNomi, this.gridBagConstraintsFormatoNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomi.add(this.jComboBoxTiposArchivosReportesFormatoNomi, this.gridBagConstraintsFormatoNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomi.add(this.jPanelParametrosAuxiliar1FormatoNomi, this.gridBagConstraintsFormatoNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormatoNomi.add(this.jComboBoxTiposReportesFormatoNomi, this.gridBagConstraintsFormatoNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomi.add(this.jPanelParametrosAuxiliar4FormatoNomi, this.gridBagConstraintsFormatoNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomi.add(this.jComboBoxTiposReportesFormatoNomi, this.gridBagConstraintsFormatoNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomi.add(this.jCheckBoxGenerarReporteFormatoNomi, this.gridBagConstraintsFormatoNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomi.add(this.jPanelParametrosAuxiliar2FormatoNomi, this.gridBagConstraintsFormatoNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomi.add(this.jLabelAccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormatoNomi.add(this.jButtonAbrirOrderByFormatoNomi, this.gridBagConstraintsFormatoNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomi.add(this.jComboBoxTiposSeleccionarFormatoNomi, this.gridBagConstraintsFormatoNomi);			
			
			
			/*
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomi.add(this.jCheckBoxSeleccionarTodosFormatoNomi, this.gridBagConstraintsFormatoNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoNomi.add(this.jCheckBoxSeleccionarTodosFormatoNomi, this.gridBagConstraintsFormatoNomi);															
				
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoNomi.add(this.jCheckBoxSeleccionadosFormatoNomi, this.gridBagConstraintsFormatoNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomi.add(this.jPanelParametrosAuxiliar3FormatoNomi, this.gridBagConstraintsFormatoNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomi.add(this.jComboBoxTiposRelacionesFormatoNomi, this.gridBagConstraintsFormatoNomi);
				
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomi.add(this.jComboBoxTiposAccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);
	
				
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomi.add(this.jTextFieldValorCampoGeneralFormatoNomi, this.gridBagConstraintsFormatoNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormatoNomi = new GridBagLayout();

			this.jScrollPanelDatosFormatoNomi.setLayout(gridaBagLayoutDatosFormatoNomi);
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = 0;
			this.gridBagConstraintsFormatoNomi.gridx = 0;
			
			this.jScrollPanelDatosFormatoNomi.add(this.jTableDatosFormatoNomi, this.gridBagConstraintsFormatoNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormatoNomi.setViewportView(this.jTableDatosFormatoNomi);
		this.jTableDatosFormatoNomi.setFillsViewportHeight(true);
		this.jTableDatosFormatoNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormatoNomi= new GridBagLayout();
		this.jPanelAccionesFormatoNomi.setLayout(gridaBagLayoutAccionesFormatoNomi);
		
		
		/*	
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 0;
			
		this.jPanelAccionesFormatoNomi.add(this.jButtonNuevoFormatoNomi, this.gridBagConstraintsFormatoNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEstructuraFormatoNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraFormatoNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraFormatoNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraFormatoNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraFormatoNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraFormatoNomi.setLayout(gridaBagLayoutFK_IdEstructuraFormatoNomi);

		gridBagConstraintsFormatoNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomi.gridy = 0;
		gridBagConstraintsFormatoNomi.gridx = 0;
		jPanelFK_IdEstructuraFormatoNomi.add(jLabelid_estructuraFK_IdEstructuraFormatoNomi, gridBagConstraintsFormatoNomi);

		gridBagConstraintsFormatoNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomi.gridy = 0;
		gridBagConstraintsFormatoNomi.gridx = 1;
		jPanelFK_IdEstructuraFormatoNomi.add(jComboBoxid_estructuraFK_IdEstructuraFormatoNomi, gridBagConstraintsFormatoNomi);

		gridBagConstraintsFormatoNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomi.gridy = 1;
		gridBagConstraintsFormatoNomi.gridx =1;
		jPanelFK_IdEstructuraFormatoNomi.add(jButtonFK_IdEstructuraFormatoNomi, gridBagConstraintsFormatoNomi);

		jTabbedPaneBusquedasFormatoNomi.addTab("1.-Por Estructura ", jPanelFK_IdEstructuraFormatoNomi);
		jTabbedPaneBusquedasFormatoNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPuntajeNomiFormatoNomi= new GridBagLayout();
		gridaBagLayoutFK_IdPuntajeNomiFormatoNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPuntajeNomiFormatoNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPuntajeNomiFormatoNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPuntajeNomiFormatoNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPuntajeNomiFormatoNomi.setLayout(gridaBagLayoutFK_IdPuntajeNomiFormatoNomi);

		gridBagConstraintsFormatoNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomi.gridy = 0;
		gridBagConstraintsFormatoNomi.gridx = 0;
		jPanelFK_IdPuntajeNomiFormatoNomi.add(jLabelid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi, gridBagConstraintsFormatoNomi);

		gridBagConstraintsFormatoNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomi.gridy = 0;
		gridBagConstraintsFormatoNomi.gridx = 1;
		jPanelFK_IdPuntajeNomiFormatoNomi.add(jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi, gridBagConstraintsFormatoNomi);

		gridBagConstraintsFormatoNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomi.gridy = 1;
		gridBagConstraintsFormatoNomi.gridx =1;
		jPanelFK_IdPuntajeNomiFormatoNomi.add(jButtonFK_IdPuntajeNomiFormatoNomi, gridBagConstraintsFormatoNomi);

		jTabbedPaneBusquedasFormatoNomi.addTab("2.-Por Puntaje Nomi ", jPanelFK_IdPuntajeNomiFormatoNomi);
		jTabbedPaneBusquedasFormatoNomi.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormatoNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormatoNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();						
			this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomi.gridx = 0;		
			//this.gridBagConstraintsFormatoNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormatoNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormatoNomi, this.gridBagConstraintsFormatoNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomi.gridx = 0;		
		//this.gridBagConstraintsFormatoNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormatoNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormatoNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomi.gridx = 0;		
			this.gridBagConstraintsFormatoNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormatoNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormatoNomi, this.gridBagConstraintsFormatoNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormatoNomi, this.gridBagConstraintsFormatoNomi);								
		
		
		/*
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);
		*/		
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomi.gridx =0;
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormatoNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormatoNomi, this.gridBagConstraintsFormatoNomi);
				
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormatoNomi, this.gridBagConstraintsFormatoNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FormatoNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormatoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormatoNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosFormatoNomi.setLayout(gridaBagLayoutBusquedasParametrosFormatoNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormatoNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormatoNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormatoNomi, this.gridBagConstraintsFormatoNomi);
			
			
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
			
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormatoNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormatoNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormatoNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormatoNomi.setName("jPanelReporteDinamicoFormatoNomi"); 
		
		this.jPanelReporteDinamicoFormatoNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormatoNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormatoNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormatoNomi.setLayout(gridaBagLayoutReporteDinamicoFormatoNomi);
		
		
		this.jInternalFrameReporteDinamicoFormatoNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormatoNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormatoNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormatoNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormatoNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormatoNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormatoNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormatoNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormatoNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormatoNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormatoNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormatoNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormatoNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormatoNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormatoNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteFormatoNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomi.add(this.jLabelColumnasSelectReporteFormatoNomi, this.gridBagConstraintsFormatoNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormatoNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteFormatoNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormatoNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormatoNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormatoNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormatoNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormatoNomi=new JScrollPane(this.jListColumnasSelectReporteFormatoNomi);
			
			this.jScrollColumnasSelectReporteFormatoNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormatoNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormatoNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormatoNomi.add(this.jListColumnasSelectReporteFormatoNomi, this.gridBagConstraintsFormatoNomi);
		this.jPanelReporteDinamicoFormatoNomi.add(this.jScrollColumnasSelectReporteFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormatoNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormatoNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomi.add(this.jLabelRelacionesSelectReporteFormatoNomi, this.gridBagConstraintsFormatoNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormatoNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormatoNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormatoNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormatoNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormatoNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormatoNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormatoNomi=new JScrollPane(this.jListRelacionesSelectReporteFormatoNomi);
			
			this.jScrollRelacionesSelectReporteFormatoNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormatoNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormatoNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormatoNomi.add(this.jListRelacionesSelectReporteFormatoNomi, this.gridBagConstraintsFormatoNomi);
		this.jPanelReporteDinamicoFormatoNomi.add(this.jScrollRelacionesSelectReporteFormatoNomi, this.gridBagConstraintsFormatoNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFormatoNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormatoNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormatoNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormatoNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormatoNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormatoNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormatoNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormatoNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormatoNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormatoNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomi.add(this.jLabelGenerarExcelReporteDinamicoFormatoNomi, this.gridBagConstraintsFormatoNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormatoNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormatoNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomi.setToolTipText("Generar EXCEL"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormatoNomi.add(this.jButtonGenerarExcelReporteDinamicoFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomi.add(this.jComboBoxTiposReportesDinamicoFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormatoNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormatoNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomi.add(this.jLabelTiposArchivoReporteDinamicoFormatoNomi, this.gridBagConstraintsFormatoNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomi.add(this.jComboBoxTiposArchivosReportesDinamicoFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormatoNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormatoNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormatoNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormatoNomi.setToolTipText("Generar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomi.add(this.jButtonGenerarReporteDinamicoFormatoNomi, this.gridBagConstraintsFormatoNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormatoNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormatoNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormatoNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormatoNomi.setToolTipText("Cancelar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomi.add(this.jButtonCerrarReporteDinamicoFormatoNomi, this.gridBagConstraintsFormatoNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormatoNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormatoNomi= new JScrollPane(jPanelReporteDinamicoFormatoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormatoNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormatoNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormatoNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormatoNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormatoNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormatoNomi);
		this.jInternalFrameReporteDinamicoFormatoNomi.getContentPane().add(this.jScrollPanelReporteDinamicoFormatoNomi, this.gridBagConstraintsFormatoNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormatoNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormatoNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormatoNomi.setName("jPanelImportacionFormatoNomi"); 
		
		this.jPanelImportacionFormatoNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormatoNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormatoNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormatoNomi.setLayout(gridaBagLayoutImportacionFormatoNomi);
		
		
		this.jInternalFrameImportacionFormatoNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormatoNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormatoNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormatoNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormatoNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormatoNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormatoNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormatoNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormatoNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormatoNomi.setResizable(true);
	    this.jInternalFrameImportacionFormatoNomi.setClosable(true);
	    this.jInternalFrameImportacionFormatoNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormatoNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormatoNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormatoNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormatoNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormatoNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormatoNomi.setResizable(true);
	    this.jInternalFrameImportacionFormatoNomi.setClosable(true);
	    this.jInternalFrameImportacionFormatoNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormatoNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormatoNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormatoNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormatoNomi = new JLabelMe();

		this.jLabelArchivoImportacionFormatoNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormatoNomi.add(this.jLabelArchivoImportacionFormatoNomi, this.gridBagConstraintsFormatoNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormatoNomi = new JFileChooser();		
		this.jFileChooserImportacionFormatoNomi.setToolTipText("ESCOGER ARCHIVO"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormatoNomi = new JButtonMe();
		this.jButtonAbrirImportacionFormatoNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormatoNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormatoNomi.setToolTipText("Generar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomi.add(this.jButtonAbrirImportacionFormatoNomi, this.gridBagConstraintsFormatoNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormatoNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionFormatoNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormatoNomi.add(this.jLabelPathArchivoImportacionFormatoNomi, this.gridBagConstraintsFormatoNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormatoNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormatoNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormatoNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormatoNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomi.add(this.jTextFieldPathArchivoImportacionFormatoNomi, this.gridBagConstraintsFormatoNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormatoNomi = new JButtonMe();
		this.jButtonGenerarImportacionFormatoNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormatoNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormatoNomi.setToolTipText("Generar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomi.add(this.jButtonGenerarImportacionFormatoNomi, this.gridBagConstraintsFormatoNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormatoNomi = new JButtonMe();
		this.jButtonCerrarImportacionFormatoNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormatoNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormatoNomi.setToolTipText("Cancelar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomi.add(this.jButtonCerrarImportacionFormatoNomi, this.gridBagConstraintsFormatoNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormatoNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionFormatoNomi= new JScrollPane(jPanelImportacionFormatoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsFormatoNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormatoNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormatoNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormatoNomi);
		this.jInternalFrameImportacionFormatoNomi.getContentPane().add(this.jScrollPanelImportacionFormatoNomi, this.gridBagConstraintsFormatoNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormatoNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormatoNomi = new JButtonMe();
			this.jButtonAbrirOrderByFormatoNomi.setText("Orden");
			this.jButtonAbrirOrderByFormatoNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormatoNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormatoNomi";
			inputMap = this.jButtonAbrirOrderByFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormatoNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormatoNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormatoNomi.setName("jPanelOrderByFormatoNomi"); 
			
			this.jPanelOrderByFormatoNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormatoNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormatoNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormatoNomi.setLayout(gridaBagLayoutOrderByFormatoNomi);
			
			
			this.jTableDatosFormatoNomiOrderBy = new JTableMe();        
			this.jTableDatosFormatoNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormatoNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormatoNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormatoNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormatoNomiOrderBy.setViewportView(this.jTableDatosFormatoNomiOrderBy);
			this.jTableDatosFormatoNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormatoNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormatoNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormatoNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormatoNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormatoNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormatoNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormatoNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormatoNomi.setTitle("Orden");
			this.jInternalFrameOrderByFormatoNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormatoNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormatoNomi.setResizable(true);
			this.jInternalFrameOrderByFormatoNomi.setClosable(true);
			this.jInternalFrameOrderByFormatoNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormatoNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormatoNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormatoNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormatoNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormatoNomi.ipady =150;
				
			this.jPanelOrderByFormatoNomi.add(jScrollPanelDatosFormatoNomiOrderBy, this.gridBagConstraintsFormatoNomi);//this.jTableDatosFormatoNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormatoNomi = new JButtonMe();
			this.jButtonCerrarOrderByFormatoNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormatoNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormatoNomi.setToolTipText("Cancelar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormatoNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormatoNomi.add(this.jButtonCerrarOrderByFormatoNomi, this.gridBagConstraintsFormatoNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormatoNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByFormatoNomi= new JScrollPane(jPanelOrderByFormatoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormatoNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormatoNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormatoNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormatoNomi);
			
			this.jInternalFrameOrderByFormatoNomi.getContentPane().add(this.jScrollPanelOrderByFormatoNomi, this.gridBagConstraintsFormatoNomi);			
		
		} else {
			this.jButtonAbrirOrderByFormatoNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formatonomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormatoNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormatoNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormatoNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormatoNomi.getRowHeight();//FormatoNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormatoNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormatoNomi.isSelected()) {
					iHeightTable=FormatoNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormatoNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormatoNomi.isSelected()) {
					iHeightTable=FormatoNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormatoNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormatoNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormatoNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormatoNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormatoNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormatoNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormatoNomi!=null && this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormatoNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormatoNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormatoNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormatoNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormatoNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormatoNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formatonomiLogic.getFormatoNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormatoNomi> TraerFormatoNomiBeans(List<FormatoNomi> formatonomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormatoNomi formatonomi:formatonomis) {
					
				if(!(FormatoNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormatoNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formatonomi.setsDetalleGeneralEntityReporte(FormatoNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomi));
										
						
					
					

					if(formatonomi.getFormatoNomiPreguntaNomis()!=null && Funciones.existeClass(classes,FormatoNomiPreguntaNomi.class)) {
						try{formatonomi.setformatonomipreguntanomisDescripcionReporte(new JRBeanCollectionDataSource(FormatoNomiPreguntaNomiJInternalFrame.TraerFormatoNomiPreguntaNomiBeans(formatonomi.getFormatoNomiPreguntaNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(formatonomi.getFormatoNomiFactorNomis()!=null && Funciones.existeClass(classes,FormatoNomiFactorNomi.class)) {
						try{formatonomi.setformatonomifactornomisDescripcionReporte(new JRBeanCollectionDataSource(FormatoNomiFactorNomiJInternalFrame.TraerFormatoNomiFactorNomiBeans(formatonomi.getFormatoNomiFactorNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(formatonomi.getEvaluacionNomis()!=null && Funciones.existeClass(classes,EvaluacionNomi.class)) {
						try{formatonomi.setevaluacionnomisDescripcionReporte(new JRBeanCollectionDataSource(EvaluacionNomiJInternalFrame.TraerEvaluacionNomiBeans(formatonomi.getEvaluacionNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(formatonomi.getDetalleEvaluacionNomis()!=null && Funciones.existeClass(classes,DetalleEvaluacionNomi.class)) {
						try{formatonomi.setdetalleevaluacionnomisDescripcionReporte(new JRBeanCollectionDataSource(DetalleEvaluacionNomiJInternalFrame.TraerDetalleEvaluacionNomiBeans(formatonomi.getDetalleEvaluacionNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//formatonomi.setsDetalleGeneralEntityReporte(formatonomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//formatonomibeans.add(formatonomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formatonomis;
    }
	//PARA REPORTES FIN
}
