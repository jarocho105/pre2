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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.IngresosPromediosConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class IngresosPromediosJInternalFrame extends IngresosPromediosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarIngresosPromedios;
	
	protected JMenuBar jmenuBarIngresosPromedios;
	
	protected JMenu jmenuIngresosPromedios;
	protected JMenu jmenuDatosIngresosPromedios;
	protected JMenu jmenuArchivoIngresosPromedios;
	protected JMenu jmenuAccionesIngresosPromedios;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIngresosPromedios;	
	protected GridBagConstraints gridBagConstraintsIngresosPromedios;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public IngresosPromediosDetalleFormJInternalFrame jInternalFrameDetalleFormIngresosPromedios;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoIngresosPromedios;	
	protected ImportacionJInternalFrame jInternalFrameImportacionIngresosPromedios;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public IngresosPromediosSessionBean ingresospromediosSessionBean;
		
	
	
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<IngresosPromedios> ingresospromedioss;		
	public List<IngresosPromedios> ingresospromediossEliminados;	
	public List<IngresosPromedios> ingresospromediossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByIngresosPromedios;		
	protected JButton jButtonAbrirOrderByIngresosPromedios;
	
	
	//protected JPanel jPanelOrderByIngresosPromedios;
	//public JScrollPane jScrollPanelOrderByIngresosPromedios;	
	//protected JButton jButtonCerrarOrderByIngresosPromedios;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public IngresosPromediosLogic ingresospromediosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosIngresosPromedios;
	public JScrollPane jScrollPanelDatosEdicionIngresosPromedios;
	public JScrollPane jScrollPanelDatosGeneralIngresosPromedios;
    
	
	
	//public JScrollPane jScrollPanelDatosIngresosPromediosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoIngresosPromedios;
	//public JScrollPane jScrollPanelImportacionIngresosPromedios;
	
	
	
	protected JPanel jPanelAccionesIngresosPromedios;
	
    protected JPanel jPanelPaginacionIngresosPromedios;
    protected JPanel jPanelParametrosReportesIngresosPromedios;
	protected JPanel jPanelParametrosReportesAccionesIngresosPromedios;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1IngresosPromedios;
	protected JPanel jPanelParametrosAuxiliar2IngresosPromedios;
	protected JPanel jPanelParametrosAuxiliar3IngresosPromedios;
	protected JPanel jPanelParametrosAuxiliar4IngresosPromedios;
	//protected JPanel jPanelParametrosAuxiliar5IngresosPromedios;
	
	
	
	//protected JPanel jPanelReporteDinamicoIngresosPromedios;
	//protected JPanel jPanelImportacionIngresosPromedios;
	
	
	public JTable jTableDatosIngresosPromedios;
	
	
	
	//public JTable jTableDatosIngresosPromediosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoIngresosPromedios;
	protected JButton jButtonDuplicarIngresosPromedios;
	protected JButton jButtonCopiarIngresosPromedios;
	protected JButton jButtonVerFormIngresosPromedios;
	protected JButton jButtonNuevoRelacionesIngresosPromedios;
	protected JButton jButtonModificarIngresosPromedios;
	
    protected JButton jButtonGuardarCambiosTablaIngresosPromedios;
	protected JButton jButtonCerrarIngresosPromedios;
	
	
	protected JButton jButtonRecargarInformacionIngresosPromedios;
	protected JButton jButtonProcesarInformacionIngresosPromedios;
	
	
	protected JButton jButtonAnterioresIngresosPromedios;
	protected JButton jButtonSiguientesIngresosPromedios;
	protected JButton jButtonNuevoGuardarCambiosIngresosPromedios;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoIngresosPromedios;
	//protected JButton jButtonCerrarReporteDinamicoIngresosPromedios;
	//protected JButton jButtonGenerarExcelReporteDinamicoIngresosPromedios;	
	
	
	
	//protected JButton jButtonAbrirImportacionIngresosPromedios;
	//protected JButton jButtonGenerarImportacionIngresosPromedios;
	//protected JButton jButtonCerrarImportacionIngresosPromedios;
	//protected JFileChooser jFileChooserImportacionIngresosPromedios;
	//protected File fileImportacionIngresosPromedios;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIngresosPromedios;
	protected JButton jButtonDuplicarToolBarIngresosPromedios;
	protected JButton jButtonNuevoRelacionesToolBarIngresosPromedios;
	
	
	public JButton jButtonGuardarCambiosToolBarIngresosPromedios;
	protected JButton jButtonCopiarToolBarIngresosPromedios;
	protected JButton jButtonVerFormToolBarIngresosPromedios;
	public JButton jButtonGuardarCambiosTablaToolBarIngresosPromedios;
	protected JButton jButtonMostrarOcultarTablaToolBarIngresosPromedios;
	protected JButton jButtonCerrarToolBarIngresosPromedios;
	
	protected JButton jButtonRecargarInformacionToolBarIngresosPromedios;
	protected JButton jButtonProcesarInformacionToolBarIngresosPromedios;
	protected JButton jButtonAnterioresToolBarIngresosPromedios;
	protected JButton jButtonSiguientesToolBarIngresosPromedios;
	protected JButton jButtonNuevoGuardarCambiosToolBarIngresosPromedios;
	protected JButton jButtonAbrirOrderByToolBarIngresosPromedios;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIngresosPromedios;
	protected JMenuItem jMenuItemDuplicarIngresosPromedios;
	protected JMenuItem jMenuItemNuevoRelacionesIngresosPromedios;
	
	
	protected JMenuItem jMenuItemGuardarCambiosIngresosPromedios;
	protected JMenuItem jMenuItemCopiarIngresosPromedios;
	protected JMenuItem jMenuItemVerFormIngresosPromedios;
	protected JMenuItem jMenuItemGuardarCambiosTablaIngresosPromedios;
	protected JMenuItem jMenuItemCerrarIngresosPromedios;
	protected JMenuItem jMenuItemDetalleCerrarIngresosPromedios;
	protected JMenuItem jMenuItemDetalleAbrirOrderByIngresosPromedios;
	protected JMenuItem jMenuItemDetalleMostarOcultarIngresosPromedios;
	
	protected JMenuItem jMenuItemRecargarInformacionIngresosPromedios;
	protected JMenuItem jMenuItemProcesarInformacionIngresosPromedios;
	protected JMenuItem jMenuItemAnterioresIngresosPromedios;
	protected JMenuItem jMenuItemSiguientesIngresosPromedios;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIngresosPromedios;
	protected JMenuItem jMenuItemAbrirOrderByIngresosPromedios;
	protected JMenuItem jMenuItemMostrarOcultarIngresosPromedios;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIngresosPromedios;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosIngresosPromedios;
	protected JCheckBox jCheckBoxSeleccionadosIngresosPromedios;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaIngresosPromedios;
	protected JCheckBox jCheckBoxConGraficoReporteIngresosPromedios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesIngresosPromedios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesIngresosPromedios;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoIngresosPromedios;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoIngresosPromedios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesIngresosPromedios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionIngresosPromedios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIngresosPromedios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIngresosPromedios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarIngresosPromedios;
	protected JTextField jTextFieldValorCampoGeneralIngresosPromedios;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteIngresosPromedios;
	//public JList<Reporte> jListColumnasSelectReporteIngresosPromedios;
	//public JScrollPane jScrollColumnasSelectReporteIngresosPromedios;
	
	//public JLabel jLabelRelacionesSelectReporteIngresosPromedios;
	//public JList<Reporte> jListRelacionesSelectReporteIngresosPromedios;
	//public JScrollPane jScrollRelacionesSelectReporteIngresosPromedios;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoIngresosPromedios;
	//protected JCheckBox jCheckBoxConGraficoDinamicoIngresosPromedios;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoIngresosPromedios;
	//public JLabel jLabelTiposArchivoReporteDinamicoIngresosPromedios;
	
		
	//public JLabel jLabelArchivoImportacionIngresosPromedios;	
	//public JLabel jLabelPathArchivoImportacionIngresosPromedios;
	//protected JTextField jTextFieldPathArchivoImportacionIngresosPromedios;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoIngresosPromedios;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoIngresosPromedios;
	
	//public JLabel jLabelColumnaCategoriaValorIngresosPromedios;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorIngresosPromedios;
	
	//public JLabel jLabelColumnasValoresGraficoIngresosPromedios;
	//public JList<Reporte> jListColumnasValoresGraficoIngresosPromedios;
	//public JScrollPane jScrollColumnasValoresGraficoIngresosPromedios;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoIngresosPromedios;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoIngresosPromedios;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasIngresosPromedios;
	public JPanel jPanelBusquedaIngresosPromediosIngresosPromedios;
	public JButton jButtonBusquedaIngresosPromediosIngresosPromedios;
	
	public JPanel jPanelid_estructuraBusquedaIngresosPromediosIngresosPromedios;
	public JLabel jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios;
	public JButton jButtonid_estructuraBusquedaIngresosPromediosIngresosPromedios= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaIngresosPromediosIngresosPromediosUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaIngresosPromediosIngresosPromediosBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaIngresosPromediosIngresosPromedios;
	public JLabel jLabelcodigoBusquedaIngresosPromediosIngresosPromedios;
	public JTextField jTextFieldcodigoBusquedaIngresosPromediosIngresosPromedios;
	public JButton jButtoncodigoBusquedaIngresosPromediosIngresosPromediosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioBusquedaIngresosPromediosIngresosPromedios;
	public JLabel jLabelid_anioBusquedaIngresosPromediosIngresosPromedios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios;
	public JButton jButtonid_anioBusquedaIngresosPromediosIngresosPromedios= new JButtonMe();
	public JButton jButtonid_anioBusquedaIngresosPromediosIngresosPromediosUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaIngresosPromediosIngresosPromediosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesBusquedaIngresosPromediosIngresosPromedios;
	public JLabel jLabelid_mesBusquedaIngresosPromediosIngresosPromedios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios;
	public JButton jButtonid_mesBusquedaIngresosPromediosIngresosPromedios= new JButtonMe();
	public JButton jButtonid_mesBusquedaIngresosPromediosIngresosPromediosUpdate= new JButtonMe();
	public JButton jButtonid_mesBusquedaIngresosPromediosIngresosPromediosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public IngresosPromediosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosPromediosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosPromediosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosPromediosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionIngresosPromedios)	{
		this.jButtonRecargarInformacionIngresosPromedios = jButtonRecargarInformacionIngresosPromedios;
	}
	
	public JButton getjButtonProcesarInformacionIngresosPromedios() {
		return this.jButtonProcesarInformacionIngresosPromedios;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIngresosPromedios)	{
		this.jButtonProcesarInformacionIngresosPromedios = jButtonProcesarInformacionIngresosPromedios;
	}
	
	
	public JButton getjButtonRecargarInformacionIngresosPromedios() {
		return this.jButtonRecargarInformacionIngresosPromedios;
	}
	
	
	public List<IngresosPromedios> getingresospromedioss() {
		return this.ingresospromedioss;
	}

	public void setingresospromedioss(List<IngresosPromedios> ingresospromedioss) {
		this.ingresospromedioss = ingresospromedioss;
	}
	
	public List<IngresosPromedios> getingresospromediossAux() {
		return this.ingresospromediossAux;
	}

	public void setingresospromediossAux(List<IngresosPromedios> ingresospromediossAux) {
		this.ingresospromediossAux = ingresospromediossAux;
	}
	
	public List<IngresosPromedios> getingresospromediossEliminados() {
		return this.ingresospromediossEliminados;
	}

	public void setIngresosPromediossEliminados(List<IngresosPromedios> ingresospromediossEliminados) {
		this.ingresospromediossEliminados = ingresospromediossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarIngresosPromedios() {
		return jComboBoxTiposSeleccionarIngresosPromedios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarIngresosPromedios(
			JComboBox jComboBoxTiposSeleccionarIngresosPromedios) {
		this.jComboBoxTiposSeleccionarIngresosPromedios = jComboBoxTiposSeleccionarIngresosPromedios;
	}
	
	public void setBorderResaltarTiposSeleccionarIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarIngresosPromedios .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralIngresosPromedios() {
		return jTextFieldValorCampoGeneralIngresosPromedios;
	}

	public void setjTextFieldValorCampoGeneralIngresosPromedios(
			JTextField jTextFieldValorCampoGeneralIngresosPromedios) {
		this.jTextFieldValorCampoGeneralIngresosPromedios = jTextFieldValorCampoGeneralIngresosPromedios;
	}

	public void setBorderResaltarValorCampoGeneralIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralIngresosPromedios .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosIngresosPromedios() {
		return this.jCheckBoxSeleccionarTodosIngresosPromedios;
	}

	public void setjCheckBoxSeleccionarTodosIngresosPromedios(
			JCheckBox jCheckBoxSeleccionarTodosIngresosPromedios) {
		this.jCheckBoxSeleccionarTodosIngresosPromedios = jCheckBoxSeleccionarTodosIngresosPromedios;
	}

	public void setBorderResaltarSeleccionarTodosIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosIngresosPromedios .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosIngresosPromedios() {
		return this.jCheckBoxSeleccionadosIngresosPromedios;
	}

	public void setjCheckBoxSeleccionadosIngresosPromedios(
			JCheckBox jCheckBoxSeleccionadosIngresosPromedios) {
		this.jCheckBoxSeleccionadosIngresosPromedios = jCheckBoxSeleccionadosIngresosPromedios;
	}
	
	public void setBorderResaltarSeleccionadosIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosIngresosPromedios .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesIngresosPromedios() {
		return this.jComboBoxTiposArchivosReportesIngresosPromedios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesIngresosPromedios(
			JComboBox jComboBoxTiposArchivosReportesIngresosPromedios) {
		this.jComboBoxTiposArchivosReportesIngresosPromedios = jComboBoxTiposArchivosReportesIngresosPromedios;
	}

	public void setBorderResaltarTiposArchivosReportesIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesIngresosPromedios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesIngresosPromedios() {
		return this.jComboBoxTiposReportesIngresosPromedios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesIngresosPromedios(
			JComboBox jComboBoxTiposReportesIngresosPromedios) {
		this.jComboBoxTiposReportesIngresosPromedios = jComboBoxTiposReportesIngresosPromedios;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoIngresosPromedios() {
	//	return jComboBoxTiposReportesDinamicoIngresosPromedios;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoIngresosPromedios(
	//		JComboBox jComboBoxTiposReportesDinamicoIngresosPromedios) {
	//	this.jComboBoxTiposReportesDinamicoIngresosPromedios = jComboBoxTiposReportesDinamicoIngresosPromedios;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoIngresosPromedios() {
	//	return jComboBoxTiposArchivosReportesDinamicoIngresosPromedios;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoIngresosPromedios(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoIngresosPromedios) {
	//	this.jComboBoxTiposArchivosReportesDinamicoIngresosPromedios = jComboBoxTiposArchivosReportesDinamicoIngresosPromedios;
	//}
	
	public void setBorderResaltarTiposReportesIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesIngresosPromedios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesIngresosPromedios() {
		return this.jComboBoxTiposGraficosReportesIngresosPromedios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesIngresosPromedios(
			JComboBox jComboBoxTiposGraficosReportesIngresosPromedios) {
		this.jComboBoxTiposGraficosReportesIngresosPromedios = jComboBoxTiposGraficosReportesIngresosPromedios;
	}
	
	public void setBorderResaltarTiposGraficosReportesIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesIngresosPromedios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionIngresosPromedios() {
		return this.jComboBoxTiposPaginacionIngresosPromedios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionIngresosPromedios(
			JComboBox jComboBoxTiposPaginacionIngresosPromedios) {
		this.jComboBoxTiposPaginacionIngresosPromedios = jComboBoxTiposPaginacionIngresosPromedios;
	}
	
	public void setBorderResaltarTiposPaginacionIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionIngresosPromedios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesIngresosPromedios() {
		return this.jComboBoxTiposRelacionesIngresosPromedios;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIngresosPromedios() {
		return this.jComboBoxTiposAccionesIngresosPromedios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIngresosPromedios(
			JComboBox jComboBoxTiposRelacionesIngresosPromedios) {
		this.jComboBoxTiposRelacionesIngresosPromedios = jComboBoxTiposRelacionesIngresosPromedios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIngresosPromedios(
			JComboBox jComboBoxTiposAccionesIngresosPromedios) {
		this.jComboBoxTiposAccionesIngresosPromedios = jComboBoxTiposAccionesIngresosPromedios;
	}
	
	public void setBorderResaltarTiposRelacionesIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesIngresosPromedios .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesIngresosPromedios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesIngresosPromedios .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoIngresosPromedios() {
	//	return jCheckBoxConGraficoDinamicoIngresosPromedios;
	//}

	//public void setjCheckBoxConGraficoDinamicoIngresosPromedios(
	//		JCheckBox jCheckBoxConGraficoDinamicoIngresosPromedios) {
	//	this.jCheckBoxConGraficoDinamicoIngresosPromedios = jCheckBoxConGraficoDinamicoIngresosPromedios;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoIngresosPromedios() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarIngresosPromedios.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoIngresosPromedios .setBorder(borderResaltar);		
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
		this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
		
		this.ingresospromediosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingresospromediosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ingresospromediosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=IngresosPromediosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=IngresosPromediosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IngresosPromediosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IngresosPromediosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IngresosPromediosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ingresos Promedios MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
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
		
		IngresosPromediosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarIngresosPromedios= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"nuevo","nuevo","Nuevo"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"duplicar","duplicar","Duplicar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"copiar","copiar","Copiar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"ver_form","ver_form","Ver"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"recargar","recargar","Buscar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarIngresosPromedios,this.jTtoolBarIngresosPromedios,
							"cerrar","cerrar","Salir"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarIngresosPromedios=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarIngresosPromedios;
			
				this.jButtonProcesarInformacionToolBarIngresosPromedios=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarIngresosPromedios;
				
		//protected JButton jButtonModificarToolBarIngresosPromedios;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarIngresosPromedios=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuIngresosPromedios=new JMenuMe("General");
		this.jmenuArchivoIngresosPromedios=new JMenuMe("Archivo");
		this.jmenuAccionesIngresosPromedios=new JMenuMe("Acciones");
		this.jmenuDatosIngresosPromedios=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIngresosPromedios= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIngresosPromedios.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIngresosPromedios,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarIngresosPromedios= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarIngresosPromedios.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarIngresosPromedios,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesIngresosPromedios= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesIngresosPromedios.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesIngresosPromedios,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosIngresosPromedios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIngresosPromedios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIngresosPromedios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarIngresosPromedios= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarIngresosPromedios.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarIngresosPromedios,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormIngresosPromedios= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormIngresosPromedios.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormIngresosPromedios,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaIngresosPromedios= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaIngresosPromedios.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaIngresosPromedios,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIngresosPromedios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIngresosPromedios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIngresosPromedios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionIngresosPromedios= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionIngresosPromedios.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionIngresosPromedios,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionIngresosPromedios= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionIngresosPromedios.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionIngresosPromedios,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresIngresosPromedios= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresIngresosPromedios.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresIngresosPromedios,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesIngresosPromedios= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesIngresosPromedios.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesIngresosPromedios,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByIngresosPromedios= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByIngresosPromedios.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByIngresosPromedios,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIngresosPromedios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIngresosPromedios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIngresosPromedios,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByIngresosPromedios= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByIngresosPromedios.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByIngresosPromedios,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIngresosPromedios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIngresosPromedios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIngresosPromedios,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosIngresosPromedios= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosIngresosPromedios.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosIngresosPromedios,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoIngresosPromedios.add(this.jMenuItemCerrarIngresosPromedios);
			
			this.jmenuAccionesIngresosPromedios.add(this.jMenuItemNuevoIngresosPromedios);
			this.jmenuAccionesIngresosPromedios.add(this.jMenuItemNuevoGuardarCambiosIngresosPromedios);
			this.jmenuAccionesIngresosPromedios.add(this.jMenuItemNuevoRelacionesIngresosPromedios);
			this.jmenuAccionesIngresosPromedios.add(this.jMenuItemGuardarCambiosTablaIngresosPromedios);		
			this.jmenuAccionesIngresosPromedios.add(this.jMenuItemDuplicarIngresosPromedios);		
			this.jmenuAccionesIngresosPromedios.add(this.jMenuItemCopiarIngresosPromedios);		
			this.jmenuAccionesIngresosPromedios.add(this.jMenuItemVerFormIngresosPromedios);		
			
			this.jmenuDatosIngresosPromedios.add(this.jMenuItemRecargarInformacionIngresosPromedios);				
			this.jmenuDatosIngresosPromedios.add(this.jMenuItemAnterioresIngresosPromedios);				
			this.jmenuDatosIngresosPromedios.add(this.jMenuItemSiguientesIngresosPromedios);				
			this.jmenuDatosIngresosPromedios.add(this.jMenuItemAbrirOrderByIngresosPromedios);				
			this.jmenuDatosIngresosPromedios.add(this.jMenuItemMostrarOcultarIngresosPromedios);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesIngresosPromedios.add(this.jMenuItemGuardarCambiosIngresosPromedios);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarIngresosPromedios.add(this.jmenuArchivoIngresosPromedios);		
			this.jmenuBarIngresosPromedios.add(this.jmenuAccionesIngresosPromedios);		
			this.jmenuBarIngresosPromedios.add(this.jmenuDatosIngresosPromedios);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarIngresosPromedios);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasIngresosPromedios() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaIngresosPromediosIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaIngresosPromediosIngresosPromedios.setToolTipText("Buscar Por Estructura Por Codigo Por Anio Por Mes ");
		this.jButtonBusquedaIngresosPromediosIngresosPromedios= new JButtonMe();
		this.jButtonBusquedaIngresosPromediosIngresosPromedios.setText("Buscar");
		this.jButtonBusquedaIngresosPromediosIngresosPromedios.setToolTipText("Buscar Por Estructura Por Codigo Por Anio Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaIngresosPromediosIngresosPromedios,"buscar_button","Buscar Por Estructura Por Codigo Por Anio Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaIngresosPromediosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios = new JLabelMe();
		jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios.setText("Estructura :");
		jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcodigoBusquedaIngresosPromediosIngresosPromedios = new JLabelMe();
		jLabelcodigoBusquedaIngresosPromediosIngresosPromedios.setText("Codigo :");
		jLabelcodigoBusquedaIngresosPromediosIngresosPromedios.setToolTipText("Codigo");
		jLabelcodigoBusquedaIngresosPromediosIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaIngresosPromediosIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaIngresosPromediosIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaIngresosPromediosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaIngresosPromediosIngresosPromedios= new JTextFieldMe();
		jTextFieldcodigoBusquedaIngresosPromediosIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaIngresosPromediosIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaIngresosPromediosIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaIngresosPromediosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_anioBusquedaIngresosPromediosIngresosPromedios = new JLabelMe();
		jLabelid_anioBusquedaIngresosPromediosIngresosPromedios.setText("Anio :");
		jLabelid_anioBusquedaIngresosPromediosIngresosPromedios.setToolTipText("Anio");
		jLabelid_anioBusquedaIngresosPromediosIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaIngresosPromediosIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaIngresosPromediosIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaIngresosPromediosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios= new JComboBoxMe();
		jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_mesBusquedaIngresosPromediosIngresosPromedios = new JLabelMe();
		jLabelid_mesBusquedaIngresosPromediosIngresosPromedios.setText("Mes :");
		jLabelid_mesBusquedaIngresosPromediosIngresosPromedios.setToolTipText("Mes");
		jLabelid_mesBusquedaIngresosPromediosIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaIngresosPromediosIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaIngresosPromediosIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesBusquedaIngresosPromediosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios= new JComboBoxMe();
		jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasIngresosPromedios=new JTabbedPane();


		this.jTabbedPaneBusquedasIngresosPromedios.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasIngresosPromedios.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasIngresosPromedios.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasIngresosPromedios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleIngresosPromedios = new IngresosPromediosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ingresos Promedios DATOS");
			this.jInternalFrameDetalleFormIngresosPromedios = new IngresosPromediosDetalleFormJInternalFrame(jDesktopPane,this.ingresospromediosSessionBean.getConGuardarRelaciones(),this.ingresospromediosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormIngresosPromedios = null;//new IngresosPromediosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIngresosPromedios= new GridBagLayout();
		
		
		this.jTableDatosIngresosPromedios = new JTableMe();      
		
		String sToolTipIngresosPromedios="";
		sToolTipIngresosPromedios=IngresosPromediosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIngresosPromedios+="(Nomina.IngresosPromedios)";
		}
		
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			sToolTipIngresosPromedios+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosIngresosPromedios.setToolTipText(sToolTipIngresosPromedios);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosIngresosPromedios);
		this.jTableDatosIngresosPromedios.setAutoCreateRowSorter(true);
		this.jTableDatosIngresosPromedios.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosIngresosPromedios.setRowSelectionAllowed(true);
		this.jTableDatosIngresosPromedios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosIngresosPromedios,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoIngresosPromedios = new JButtonMe();
		this.jButtonDuplicarIngresosPromedios = new JButtonMe();
		this.jButtonCopiarIngresosPromedios = new JButtonMe();
		this.jButtonVerFormIngresosPromedios = new JButtonMe();
		this.jButtonNuevoRelacionesIngresosPromedios = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaIngresosPromedios = new JButtonMe();
		this.jButtonCerrarIngresosPromedios = new JButtonMe();
		
		this.jScrollPanelDatosIngresosPromedios = new JScrollPane();   
        this.jScrollPanelDatosGeneralIngresosPromedios = new JScrollPane();
		
				
		
		
		this.jPanelAccionesIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ingresos Promedios";
		
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Promedioses" + this.sPath));
		} else {
			this.jScrollPanelDatosIngresosPromedios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIngresosPromedios.setToolTipText("Acciones");
        this.jPanelAccionesIngresosPromedios.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoIngresosPromedios=new ReporteDinamicoJInternalFrame(IngresosPromediosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoIngresosPromedios();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionIngresosPromedios=new ImportacionJInternalFrame(IngresosPromediosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionIngresosPromedios();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByIngresosPromedios = new JButtonMe();
		
		this.jButtonAbrirOrderByIngresosPromedios.setText("Orden");
		this.jButtonAbrirOrderByIngresosPromedios.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIngresosPromedios,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIngresosPromedios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngresosPromedios,false,this);
			
			//this.cargarOrderByIngresosPromedios(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIngresosPromedios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngresosPromedios,true,this);
			
			//this.cargarOrderByIngresosPromedios(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosIngresosPromedios.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosIngresosPromedios.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosIngresosPromedios.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosIngresosPromedios.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosIngresosPromedios.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosIngresosPromedios.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoIngresosPromedios.setText("Nuevo");
		this.jButtonDuplicarIngresosPromedios.setText("Duplicar");
		this.jButtonCopiarIngresosPromedios.setText("Copiar");
		this.jButtonVerFormIngresosPromedios.setText("Ver");
		this.jButtonNuevoRelacionesIngresosPromedios.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaIngresosPromedios.setText("Guardar");
		this.jButtonCerrarIngresosPromedios.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIngresosPromedios,"nuevo_button","Nuevo",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarIngresosPromedios,"duplicar_button","Duplicar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarIngresosPromedios,"copiar_button","Copiar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormIngresosPromedios,"ver_form","Ver",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesIngresosPromedios,"nuevorelaciones_button","Nuevo Rel",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIngresosPromedios,"guardarcambiostabla_button","Guardar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIngresosPromedios,"cerrar_button","Salir",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoIngresosPromedios.setToolTipText("Nuevo"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarIngresosPromedios.setToolTipText("Duplicar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarIngresosPromedios.setToolTipText("Copiar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormIngresosPromedios.setToolTipText("Ver"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesIngresosPromedios.setToolTipText("Nuevo Rel"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaIngresosPromedios.setToolTipText("Guardar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIngresosPromedios.setToolTipText("Salir"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIngresosPromedios";
		inputMap = this.jButtonNuevoIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIngresosPromedios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIngresosPromedios"));
		
		//DUPLICAR
		sMapKey = "DuplicarIngresosPromedios";
		inputMap = this.jButtonDuplicarIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarIngresosPromedios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarIngresosPromedios"));
		
		//COPIAR
		sMapKey = "CopiarIngresosPromedios";
		inputMap = this.jButtonCopiarIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarIngresosPromedios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarIngresosPromedios"));
		
		//VEr FORM
		sMapKey = "VerFormIngresosPromedios";
		inputMap = this.jButtonVerFormIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormIngresosPromedios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormIngresosPromedios"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesIngresosPromedios";
		inputMap = this.jButtonNuevoRelacionesIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesIngresosPromedios"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarIngresosPromedios";
		inputMap = this.jButtonModificarIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarIngresosPromedios"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarIngresosPromedios";
		inputMap = this.jButtonCerrarIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIngresosPromedios"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIngresosPromedios";
		inputMap = this.jButtonGuardarCambiosTablaIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIngresosPromedios"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1IngresosPromedios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2IngresosPromedios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3IngresosPromedios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4IngresosPromedios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5IngresosPromedios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesIngresosPromedios.setName("jPanelParametrosReportesIngresosPromedios"); 
		
		this.jPanelParametrosReportesAccionesIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesIngresosPromedios.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesIngresosPromedios.setName("jPanelParametrosReportesAccionesIngresosPromedios"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionIngresosPromedios = new JButtonMe();
		this.jButtonRecargarInformacionIngresosPromedios.setText("Buscar");
		this.jButtonRecargarInformacionIngresosPromedios.setToolTipText("Buscar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionIngresosPromedios,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionIngresosPromedios.setVisible(false);
		
		
		this.jButtonProcesarInformacionIngresosPromedios = new JButtonMe();
		this.jButtonProcesarInformacionIngresosPromedios.setText("Procesar");
		this.jButtonProcesarInformacionIngresosPromedios.setToolTipText("Procesar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionIngresosPromedios.setVisible(false);
			
		this.jButtonProcesarInformacionIngresosPromedios.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIngresosPromedios.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIngresosPromedios.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngresosPromedios.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesIngresosPromedios.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngresosPromedios.setText("TIPO");       
		this.jComboBoxTiposReportesIngresosPromedios.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngresosPromedios.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesIngresosPromedios.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionIngresosPromedios.setText("Paginacion");
		this.jComboBoxTiposPaginacionIngresosPromedios.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesIngresosPromedios.setText("Accion");
		this.jComboBoxTiposRelacionesIngresosPromedios.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIngresosPromedios.setText("Accion");
		this.jComboBoxTiposAccionesIngresosPromedios.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarIngresosPromedios.setText("Accion");
		this.jComboBoxTiposSeleccionarIngresosPromedios.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralIngresosPromedios=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralIngresosPromedios.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIngresosPromedios.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIngresosPromedios.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesIngresosPromedios = new JLabelMe();
		
		this.jLabelAccionesIngresosPromedios.setText("Acciones");		
		this.jLabelAccionesIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosIngresosPromedios = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosIngresosPromedios.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosIngresosPromedios.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosIngresosPromedios = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosIngresosPromedios.setText("Seleccionados");
		this.jCheckBoxSeleccionadosIngresosPromedios.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaIngresosPromedios = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaIngresosPromedios.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaIngresosPromedios.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteIngresosPromedios = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteIngresosPromedios.setText("Graf.");
		this.jCheckBoxConGraficoReporteIngresosPromedios.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresIngresosPromedios = new JButtonMe();
		//this.jButtonAnterioresIngresosPromedios.setText("<<");
        this.jButtonAnterioresIngresosPromedios.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresIngresosPromedios,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesIngresosPromedios = new JButtonMe();
		//this.jButtonSiguientesIngresosPromedios.setText(">>");
        this.jButtonSiguientesIngresosPromedios.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesIngresosPromedios,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosIngresosPromedios = new JButtonMe();
		this.jButtonNuevoGuardarCambiosIngresosPromedios.setText("Nue");
        this.jButtonNuevoGuardarCambiosIngresosPromedios.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosIngresosPromedios,"nuevoguardarcambios_button","Nue",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosIngresosPromedios";
		inputMap = this.jButtonNuevoGuardarCambiosIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosIngresosPromedios"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionIngresosPromedios";
		inputMap = this.jButtonRecargarInformacionIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionIngresosPromedios"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesIngresosPromedios";
		inputMap = this.jButtonSiguientesIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesIngresosPromedios"));
		
		//ANTERIORES		
		sMapKey = "AnterioresIngresosPromedios";
		inputMap = this.jButtonAnterioresIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresIngresosPromedios"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasIngresosPromedios();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesIngresosPromedios.setMinimumSize(new Dimension(this.getWidth(),IngresosPromediosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngresosPromediosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIngresosPromedios.setMaximumSize(new Dimension(this.getWidth(),IngresosPromediosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngresosPromediosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIngresosPromedios.setPreferredSize(new Dimension(this.getWidth(),IngresosPromediosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngresosPromediosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionIngresosPromedios = new GridBagLayout();

			this.jPanelPaginacionIngresosPromedios.setLayout(gridaBagLayoutPaginacionIngresosPromedios);						
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = 0;
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionIngresosPromedios.add(this.jButtonAnterioresIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
					
						
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIngresosPromedios.gridy = 0;
			
			this.jPanelPaginacionIngresosPromedios.add(this.jButtonNuevoGuardarCambiosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
						
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIngresosPromedios.gridy = 0;
			this.jPanelPaginacionIngresosPromedios.add(this.jButtonSiguientesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = 1;
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngresosPromedios.add(this.jButtonNuevoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
						
			
			
			if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
				this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsIngresosPromedios.gridy = 1;
				this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionIngresosPromedios.add(this.jButtonGuardarCambiosTablaIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			}
			
			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = 1;
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngresosPromedios.add(this.jButtonDuplicarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = 1;
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngresosPromedios.add(this.jButtonCopiarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = 1;
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngresosPromedios.add(this.jButtonVerFormIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = 1;
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionIngresosPromedios.add(this.jButtonCerrarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		
		
		this.jButtonRecargarInformacionIngresosPromedios.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIngresosPromedios.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIngresosPromedios.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesIngresosPromedios.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIngresosPromedios.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIngresosPromedios.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesIngresosPromedios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIngresosPromedios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIngresosPromedios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesIngresosPromedios.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIngresosPromedios.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIngresosPromedios.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionIngresosPromedios.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIngresosPromedios.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIngresosPromedios.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesIngresosPromedios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIngresosPromedios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIngresosPromedios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesIngresosPromedios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngresosPromedios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngresosPromedios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarIngresosPromedios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIngresosPromedios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIngresosPromedios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaIngresosPromedios.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIngresosPromedios.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIngresosPromedios.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteIngresosPromedios.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIngresosPromedios.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIngresosPromedios.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosIngresosPromedios.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIngresosPromedios.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIngresosPromedios.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosIngresosPromedios.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIngresosPromedios.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIngresosPromedios.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesIngresosPromedios = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesIngresosPromedios = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1IngresosPromedios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2IngresosPromedios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3IngresosPromedios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4IngresosPromedios = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesIngresosPromedios.setLayout(gridaBagParametrosReportesIngresosPromedios);
			this.jPanelParametrosReportesAccionesIngresosPromedios.setLayout(gridaBagParametrosReportesAccionesIngresosPromedios);
			
			
			this.jPanelParametrosAuxiliar1IngresosPromedios.setLayout(gridaBagParametrosAuxiliar1IngresosPromedios);
			this.jPanelParametrosAuxiliar2IngresosPromedios.setLayout(gridaBagParametrosAuxiliar2IngresosPromedios);
			this.jPanelParametrosAuxiliar3IngresosPromedios.setLayout(gridaBagParametrosAuxiliar3IngresosPromedios);
			this.jPanelParametrosAuxiliar4IngresosPromedios.setLayout(gridaBagParametrosAuxiliar4IngresosPromedios);
			//this.jPanelParametrosAuxiliar5IngresosPromedios.setLayout(gridaBagParametrosAuxiliar2IngresosPromedios);			
			
			
			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngresosPromedios.add(this.jButtonRecargarInformacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IngresosPromedios.add(this.jComboBoxTiposPaginacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IngresosPromedios.add(this.jCheckBoxConAltoMaximoTablaIngresosPromedios, this.gridBagConstraintsIngresosPromedios);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IngresosPromedios.add(this.jComboBoxTiposArchivosReportesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosPromedios.add(this.jPanelParametrosAuxiliar1IngresosPromedios, this.gridBagConstraintsIngresosPromedios);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4IngresosPromedios.add(this.jComboBoxTiposReportesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);																		
			
			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4IngresosPromedios.add(this.jComboBoxTiposGraficosReportesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosPromedios.add(this.jPanelParametrosAuxiliar4IngresosPromedios, this.gridBagConstraintsIngresosPromedios);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosPromedios.add(this.jComboBoxTiposReportesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngresosPromedios.add(this.jCheckBoxGenerarReporteIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosPromedios.add(this.jPanelParametrosAuxiliar2IngresosPromedios, this.gridBagConstraintsIngresosPromedios);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngresosPromedios.add(this.jLabelAccionesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
				this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesIngresosPromedios.add(this.jButtonAbrirOrderByIngresosPromedios, this.gridBagConstraintsIngresosPromedios);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngresosPromedios.add(this.jComboBoxTiposSeleccionarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);			
			
			
			/*
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngresosPromedios.add(this.jCheckBoxSeleccionarTodosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngresosPromedios.add(this.jCheckBoxConGraficoReporteIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3IngresosPromedios.add(this.jCheckBoxSeleccionarTodosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);															
				
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3IngresosPromedios.add(this.jCheckBoxSeleccionadosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);															
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngresosPromedios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3IngresosPromedios.add(this.jCheckBoxConGraficoReporteIngresosPromedios, this.gridBagConstraintsIngresosPromedios);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosPromedios.add(this.jPanelParametrosAuxiliar3IngresosPromedios, this.gridBagConstraintsIngresosPromedios);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosPromedios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngresosPromedios.add(this.jComboBoxTiposAccionesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosIngresosPromedios = new GridBagLayout();

			this.jScrollPanelDatosIngresosPromedios.setLayout(gridaBagLayoutDatosIngresosPromedios);
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = 0;
			this.gridBagConstraintsIngresosPromedios.gridx = 0;
			
			this.jScrollPanelDatosIngresosPromedios.add(this.jTableDatosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosIngresosPromedios.setViewportView(this.jTableDatosIngresosPromedios);
		this.jTableDatosIngresosPromedios.setFillsViewportHeight(true);
		this.jTableDatosIngresosPromedios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesIngresosPromedios= new GridBagLayout();
		this.jPanelAccionesIngresosPromedios.setLayout(gridaBagLayoutAccionesIngresosPromedios);
		
		
		/*	
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 0;
			
		this.jPanelAccionesIngresosPromedios.add(this.jButtonNuevoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaIngresosPromediosIngresosPromedios= new GridBagLayout();
		gridaBagLayoutBusquedaIngresosPromediosIngresosPromedios.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaIngresosPromediosIngresosPromedios.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaIngresosPromediosIngresosPromedios.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaIngresosPromediosIngresosPromedios.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaIngresosPromediosIngresosPromedios.setLayout(gridaBagLayoutBusquedaIngresosPromediosIngresosPromedios);

		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 0;
		gridBagConstraintsIngresosPromedios.gridx = 0;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jLabelid_estructuraBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);

		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 0;
		gridBagConstraintsIngresosPromedios.gridx = 1;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);


		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 1;
		gridBagConstraintsIngresosPromedios.gridx = 0;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jLabelcodigoBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);

		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 1;
		gridBagConstraintsIngresosPromedios.gridx = 1;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jTextFieldcodigoBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);


		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 2;
		gridBagConstraintsIngresosPromedios.gridx = 0;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jLabelid_anioBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);

		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 2;
		gridBagConstraintsIngresosPromedios.gridx = 1;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);


		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 3;
		gridBagConstraintsIngresosPromedios.gridx = 0;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jLabelid_mesBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);

		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 3;
		gridBagConstraintsIngresosPromedios.gridx = 1;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);

		gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosPromedios.gridy = 4;
		gridBagConstraintsIngresosPromedios.gridx =1;
		jPanelBusquedaIngresosPromediosIngresosPromedios.add(jButtonBusquedaIngresosPromediosIngresosPromedios, gridBagConstraintsIngresosPromedios);

		jTabbedPaneBusquedasIngresosPromedios.addTab("1.-Por Estructura Por Codigo Por Anio Por Mes ", jPanelBusquedaIngresosPromediosIngresosPromedios);
		jTabbedPaneBusquedasIngresosPromedios.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIngresosPromedios = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIngresosPromedios);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();						
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngresosPromedios.gridx = 0;		
			//this.gridBagConstraintsIngresosPromedios.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIngresosPromedios.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;
		this.gridBagConstraintsIngresosPromedios.gridx = 0;		
		//this.gridBagConstraintsIngresosPromedios.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsIngresosPromedios.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsIngresosPromedios);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngresosPromedios.gridx = 0;		
			this.gridBagConstraintsIngresosPromedios.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsIngresosPromedios.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasIngresosPromedios, this.gridBagConstraintsIngresosPromedios);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);								
		
		
		/*
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		*/		
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIngresosPromedios.gridx =0;
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIngresosPromedios.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
				
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosIngresosPromedios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIngresosPromedios = new GridBagLayout();
			this.jPanelBusquedasParametrosIngresosPromedios.setLayout(gridaBagLayoutBusquedasParametrosIngresosPromedios);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralIngresosPromedios=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIngresosPromedios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngresosPromedios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngresosPromedios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			
			
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
			
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralIngresosPromedios;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoIngresosPromedios() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoIngresosPromedios = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoIngresosPromedios.setName("jPanelReporteDinamicoIngresosPromedios"); 
		
		this.jPanelReporteDinamicoIngresosPromedios.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIngresosPromedios.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIngresosPromedios.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoIngresosPromedios.setLayout(gridaBagLayoutReporteDinamicoIngresosPromedios);
		
		
		this.jInternalFrameReporteDinamicoIngresosPromedios= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoIngresosPromedios = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIngresosPromedios= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoIngresosPromedios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoIngresosPromedios.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoIngresosPromedios.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoIngresosPromedios.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoIngresosPromedios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoIngresosPromedios.setResizable(true);
	    this.jInternalFrameReporteDinamicoIngresosPromedios.setClosable(true);
	    this.jInternalFrameReporteDinamicoIngresosPromedios.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoIngresosPromedios.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIngresosPromedios.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIngresosPromedios.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Promedioses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteIngresosPromedios = new JLabelMe();

		this.jLabelColumnasSelectReporteIngresosPromedios.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jLabelColumnasSelectReporteIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteIngresosPromedios = new JList<Reporte>();
		this.jListColumnasSelectReporteIngresosPromedios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteIngresosPromedios.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteIngresosPromedios.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIngresosPromedios.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIngresosPromedios.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteIngresosPromedios=new JScrollPane(this.jListColumnasSelectReporteIngresosPromedios);
			
			this.jScrollColumnasSelectReporteIngresosPromedios.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIngresosPromedios.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIngresosPromedios.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoIngresosPromedios.add(this.jListColumnasSelectReporteIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jScrollColumnasSelectReporteIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteIngresosPromedios = new JLabelMe();

		this.jLabelRelacionesSelectReporteIngresosPromedios.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteIngresosPromedios = new JList<Reporte>();
		this.jListRelacionesSelectReporteIngresosPromedios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteIngresosPromedios.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteIngresosPromedios.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIngresosPromedios.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIngresosPromedios.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteIngresosPromedios=new JScrollPane(this.jListRelacionesSelectReporteIngresosPromedios);
			
			this.jScrollRelacionesSelectReporteIngresosPromedios.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIngresosPromedios.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIngresosPromedios.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoIngresosPromedios = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoIngresosPromedios = new JComboBoxMe();
		this.jListColumnasValoresGraficoIngresosPromedios = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoIngresosPromedios = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoIngresosPromedios.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoIngresosPromedios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIngresosPromedios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIngresosPromedios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoIngresosPromedios = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoIngresosPromedios.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoIngresosPromedios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIngresosPromedios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIngresosPromedios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoIngresosPromedios = new JLabelMe();

		this.jLabelConGraficoDinamicoIngresosPromedios.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jLabelConGraficoDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoIngresosPromedios = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoIngresosPromedios.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoIngresosPromedios.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoIngresosPromedios.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoIngresosPromedios.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoIngresosPromedios.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jCheckBoxConGraficoDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoIngresosPromedios = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoIngresosPromedios.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jLabelColumnaCategoriaGraficoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoIngresosPromedios.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoIngresosPromedios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoIngresosPromedios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoIngresosPromedios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoIngresosPromedios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jComboBoxColumnaCategoriaGraficoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorIngresosPromedios = new JLabelMe();

		this.jLabelColumnaCategoriaValorIngresosPromedios.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jLabelColumnaCategoriaValorIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorIngresosPromedios.setText("Accion");
        this.jComboBoxColumnaCategoriaValorIngresosPromedios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorIngresosPromedios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorIngresosPromedios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorIngresosPromedios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jComboBoxColumnaCategoriaValorIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoIngresosPromedios = new JLabelMe();

		this.jLabelColumnasValoresGraficoIngresosPromedios.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jLabelColumnasValoresGraficoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoIngresosPromedios = new JList<Reporte>();
		this.jListColumnasValoresGraficoIngresosPromedios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoIngresosPromedios.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoIngresosPromedios.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoIngresosPromedios.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoIngresosPromedios.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoIngresosPromedios=new JScrollPane(this.jListColumnasValoresGraficoIngresosPromedios);
			
			this.jScrollColumnasValoresGraficoIngresosPromedios.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoIngresosPromedios.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoIngresosPromedios.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoIngresosPromedios.add(this.jListColumnasSelectReporteIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jScrollColumnasValoresGraficoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoIngresosPromedios = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoIngresosPromedios.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jLabelTiposGraficosReportesDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoIngresosPromedios.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoIngresosPromedios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoIngresosPromedios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoIngresosPromedios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoIngresosPromedios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jComboBoxTiposGraficosReportesDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoIngresosPromedios = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoIngresosPromedios.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jLabelGenerarExcelReporteDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoIngresosPromedios = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoIngresosPromedios.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoIngresosPromedios,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoIngresosPromedios.setToolTipText("Generar EXCEL"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoIngresosPromedios.add(this.jButtonGenerarExcelReporteDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jComboBoxTiposReportesDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoIngresosPromedios = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoIngresosPromedios.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jLabelTiposArchivoReporteDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jComboBoxTiposArchivosReportesDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoIngresosPromedios = new JButtonMe();
		this.jButtonGenerarReporteDinamicoIngresosPromedios.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoIngresosPromedios,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoIngresosPromedios.setToolTipText("Generar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jButtonGenerarReporteDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoIngresosPromedios = new JButtonMe();
		this.jButtonCerrarReporteDinamicoIngresosPromedios.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoIngresosPromedios,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoIngresosPromedios.setToolTipText("Cancelar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngresosPromedios.add(this.jButtonCerrarReporteDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalIngresosPromedios = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoIngresosPromedios= new JScrollPane(jPanelReporteDinamicoIngresosPromedios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoIngresosPromedios.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIngresosPromedios.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIngresosPromedios.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Promedioses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsIngresosPromedios.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoIngresosPromedios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoIngresosPromedios.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalIngresosPromedios);
		this.jInternalFrameReporteDinamicoIngresosPromedios.getContentPane().add(this.jScrollPanelReporteDinamicoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionIngresosPromedios() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionIngresosPromedios = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionIngresosPromedios.setName("jPanelImportacionIngresosPromedios"); 
		
		this.jPanelImportacionIngresosPromedios.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIngresosPromedios.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIngresosPromedios.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionIngresosPromedios.setLayout(gridaBagLayoutImportacionIngresosPromedios);
		
		
		this.jInternalFrameImportacionIngresosPromedios= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionIngresosPromedios= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionIngresosPromedios = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIngresosPromedios= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionIngresosPromedios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIngresosPromedios.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIngresosPromedios.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionIngresosPromedios.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIngresosPromedios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIngresosPromedios.setResizable(true);
	    this.jInternalFrameImportacionIngresosPromedios.setClosable(true);
	    this.jInternalFrameImportacionIngresosPromedios.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionIngresosPromedios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIngresosPromedios.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIngresosPromedios.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionIngresosPromedios.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIngresosPromedios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIngresosPromedios.setResizable(true);
	    this.jInternalFrameImportacionIngresosPromedios.setClosable(true);
	    this.jInternalFrameImportacionIngresosPromedios.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionIngresosPromedios.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIngresosPromedios.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIngresosPromedios.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Promedioses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionIngresosPromedios = new JLabelMe();

		this.jLabelArchivoImportacionIngresosPromedios.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYImportacion;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIngresosPromedios.add(this.jLabelArchivoImportacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionIngresosPromedios = new JFileChooser();		
		this.jFileChooserImportacionIngresosPromedios.setToolTipText("ESCOGER ARCHIVO"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionIngresosPromedios = new JButtonMe();
		this.jButtonAbrirImportacionIngresosPromedios.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionIngresosPromedios,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionIngresosPromedios.setToolTipText("Generar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYImportacion;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngresosPromedios.add(this.jButtonAbrirImportacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionIngresosPromedios = new JLabelMe();

		this.jLabelPathArchivoImportacionIngresosPromedios.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYImportacion;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIngresosPromedios.add(this.jLabelPathArchivoImportacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionIngresosPromedios=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionIngresosPromedios.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIngresosPromedios.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIngresosPromedios.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYImportacion;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngresosPromedios.add(this.jTextFieldPathArchivoImportacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionIngresosPromedios = new JButtonMe();
		this.jButtonGenerarImportacionIngresosPromedios.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionIngresosPromedios,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionIngresosPromedios.setToolTipText("Generar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYImportacion;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngresosPromedios.add(this.jButtonGenerarImportacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionIngresosPromedios = new JButtonMe();
		this.jButtonCerrarImportacionIngresosPromedios.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionIngresosPromedios,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionIngresosPromedios.setToolTipText("Cancelar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = iPosYImportacion;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngresosPromedios.add(this.jButtonCerrarImportacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalIngresosPromedios = new GridBagLayout();
		
		this.jScrollPanelImportacionIngresosPromedios= new JScrollPane(jPanelImportacionIngresosPromedios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy =iPosYImportacion;
		this.gridBagConstraintsIngresosPromedios.gridx =iPosXImportacion;
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionIngresosPromedios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionIngresosPromedios.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalIngresosPromedios);
		this.jInternalFrameImportacionIngresosPromedios.getContentPane().add(this.jScrollPanelImportacionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByIngresosPromedios(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByIngresosPromedios = new JButtonMe();
			this.jButtonAbrirOrderByIngresosPromedios.setText("Orden");
			this.jButtonAbrirOrderByIngresosPromedios.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIngresosPromedios,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByIngresosPromedios";
			inputMap = this.jButtonAbrirOrderByIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByIngresosPromedios"));
		
		
			GridBagLayout gridaBagLayoutOrderByIngresosPromedios = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByIngresosPromedios.setName("jPanelOrderByIngresosPromedios"); 
			
			this.jPanelOrderByIngresosPromedios.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIngresosPromedios.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIngresosPromedios.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByIngresosPromedios.setLayout(gridaBagLayoutOrderByIngresosPromedios);
			
			
			this.jTableDatosIngresosPromediosOrderBy = new JTableMe();        
			this.jTableDatosIngresosPromediosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosIngresosPromediosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosIngresosPromediosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosIngresosPromediosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosIngresosPromediosOrderBy.setViewportView(this.jTableDatosIngresosPromediosOrderBy);
			this.jTableDatosIngresosPromediosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosIngresosPromediosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByIngresosPromedios= new OrderByJInternalFrame();
			this.jInternalFrameOrderByIngresosPromedios= new OrderByJInternalFrame();
			this.jScrollPanelOrderByIngresosPromedios = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteIngresosPromedios= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByIngresosPromedios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByIngresosPromedios.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByIngresosPromedios.setTitle("Orden");
			this.jInternalFrameOrderByIngresosPromedios.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByIngresosPromedios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByIngresosPromedios.setResizable(true);
			this.jInternalFrameOrderByIngresosPromedios.setClosable(true);
			this.jInternalFrameOrderByIngresosPromedios.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByIngresosPromedios.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIngresosPromedios.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIngresosPromedios.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Promedioses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.gridy =iPosYOrderBy++;
			this.gridBagConstraintsIngresosPromedios.gridx =iPosXOrderBy;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsIngresosPromedios.ipady =150;
				
			this.jPanelOrderByIngresosPromedios.add(jScrollPanelDatosIngresosPromediosOrderBy, this.gridBagConstraintsIngresosPromedios);//this.jTableDatosIngresosPromediosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByIngresosPromedios = new JButtonMe();
			this.jButtonCerrarOrderByIngresosPromedios.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByIngresosPromedios,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByIngresosPromedios.setToolTipText("Cancelar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.gridy = iPosYOrderBy++;
			this.gridBagConstraintsIngresosPromedios.gridx = iPosXOrderBy;
									
			this.jPanelOrderByIngresosPromedios.add(this.jButtonCerrarOrderByIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalIngresosPromedios = new GridBagLayout();
			
			this.jScrollPanelOrderByIngresosPromedios= new JScrollPane(jPanelOrderByIngresosPromedios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.gridy =iPosYOrderBy;
			this.gridBagConstraintsIngresosPromedios.gridx =iPosXOrderBy;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByIngresosPromedios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByIngresosPromedios.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalIngresosPromedios);
			
			this.jInternalFrameOrderByIngresosPromedios.getContentPane().add(this.jScrollPanelOrderByIngresosPromedios, this.gridBagConstraintsIngresosPromedios);			
		
		} else {
			this.jButtonAbrirOrderByIngresosPromedios = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ingresospromediosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosIngresosPromedios.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosIngresosPromedios.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosIngresosPromedios.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosIngresosPromedios.getRowHeight();//IngresosPromediosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > IngresosPromediosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIngresosPromedios.isSelected()) {
					iHeightTable=IngresosPromediosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IngresosPromediosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IngresosPromediosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > IngresosPromediosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIngresosPromedios.isSelected()) {
					iHeightTable=IngresosPromediosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IngresosPromediosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IngresosPromediosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosIngresosPromedios.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIngresosPromedios.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIngresosPromedios.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosIngresosPromedios.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIngresosPromedios.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIngresosPromedios.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByIngresosPromedios!=null && this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy()!=null) {
			//if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByIngresosPromedios.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByIngresosPromedios.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByIngresosPromedios.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosIngresosPromedios.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIngresosPromedios.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIngresosPromedios.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ingresospromediosLogic.getIngresosPromedioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingresospromedioss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<IngresosPromedios> TraerIngresosPromediosBeans(List<IngresosPromedios> ingresospromedioss,ArrayList<Classe> classes)throws Exception {
		try {
			for(IngresosPromedios ingresospromedios:ingresospromedioss) {
					
				if(!(IngresosPromediosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || IngresosPromediosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ingresospromedios.setsDetalleGeneralEntityReporte(IngresosPromediosConstantesFunciones.getIngresosPromediosDescripcion(ingresospromedios));
										
						
					
						
					
				} else  {
							
					//ingresospromedios.setsDetalleGeneralEntityReporte(ingresospromedios.getsDetalleGeneralEntityReporte());
										
				}
				
				//ingresospromediosbeans.add(ingresospromediosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ingresospromedioss;
    }
	//PARA REPORTES FIN
}
