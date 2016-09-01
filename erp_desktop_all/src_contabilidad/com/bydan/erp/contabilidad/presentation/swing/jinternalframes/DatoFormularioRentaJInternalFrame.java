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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.DatoFormularioRentaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class DatoFormularioRentaJInternalFrame extends DatoFormularioRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDatoFormularioRenta;
	
	protected JMenuBar jmenuBarDatoFormularioRenta;
	
	protected JMenu jmenuDatoFormularioRenta;
	protected JMenu jmenuDatosDatoFormularioRenta;
	protected JMenu jmenuArchivoDatoFormularioRenta;
	protected JMenu jmenuAccionesDatoFormularioRenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoFormularioRenta;	
	protected GridBagConstraints gridBagConstraintsDatoFormularioRenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DatoFormularioRentaDetalleFormJInternalFrame jInternalFrameDetalleFormDatoFormularioRenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDatoFormularioRenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDatoFormularioRenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DatoFormularioRentaSessionBean datoformulariorentaSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DatoFormularioRenta> datoformulariorentas;		
	public List<DatoFormularioRenta> datoformulariorentasEliminados;	
	public List<DatoFormularioRenta> datoformulariorentasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDatoFormularioRenta;		
	protected JButton jButtonAbrirOrderByDatoFormularioRenta;
	
	
	//protected JPanel jPanelOrderByDatoFormularioRenta;
	//public JScrollPane jScrollPanelOrderByDatoFormularioRenta;	
	//protected JButton jButtonCerrarOrderByDatoFormularioRenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DatoFormularioRentaLogic datoformulariorentaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDatoFormularioRenta;
	public JScrollPane jScrollPanelDatosEdicionDatoFormularioRenta;
	public JScrollPane jScrollPanelDatosGeneralDatoFormularioRenta;
    
	
	
	//public JScrollPane jScrollPanelDatosDatoFormularioRentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDatoFormularioRenta;
	//public JScrollPane jScrollPanelImportacionDatoFormularioRenta;
	
	
	
	protected JPanel jPanelAccionesDatoFormularioRenta;
	
    protected JPanel jPanelPaginacionDatoFormularioRenta;
    protected JPanel jPanelParametrosReportesDatoFormularioRenta;
	protected JPanel jPanelParametrosReportesAccionesDatoFormularioRenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DatoFormularioRenta;
	protected JPanel jPanelParametrosAuxiliar2DatoFormularioRenta;
	protected JPanel jPanelParametrosAuxiliar3DatoFormularioRenta;
	protected JPanel jPanelParametrosAuxiliar4DatoFormularioRenta;
	//protected JPanel jPanelParametrosAuxiliar5DatoFormularioRenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoDatoFormularioRenta;
	//protected JPanel jPanelImportacionDatoFormularioRenta;
	
	
	public JTable jTableDatosDatoFormularioRenta;
	
	
	
	//public JTable jTableDatosDatoFormularioRentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDatoFormularioRenta;
	protected JButton jButtonDuplicarDatoFormularioRenta;
	protected JButton jButtonCopiarDatoFormularioRenta;
	protected JButton jButtonVerFormDatoFormularioRenta;
	protected JButton jButtonNuevoRelacionesDatoFormularioRenta;
	protected JButton jButtonModificarDatoFormularioRenta;
	
    protected JButton jButtonGuardarCambiosTablaDatoFormularioRenta;
	protected JButton jButtonCerrarDatoFormularioRenta;
	
	
	protected JButton jButtonRecargarInformacionDatoFormularioRenta;
	protected JButton jButtonProcesarInformacionDatoFormularioRenta;
	
	
	protected JButton jButtonAnterioresDatoFormularioRenta;
	protected JButton jButtonSiguientesDatoFormularioRenta;
	protected JButton jButtonNuevoGuardarCambiosDatoFormularioRenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDatoFormularioRenta;
	//protected JButton jButtonCerrarReporteDinamicoDatoFormularioRenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoDatoFormularioRenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionDatoFormularioRenta;
	//protected JButton jButtonGenerarImportacionDatoFormularioRenta;
	//protected JButton jButtonCerrarImportacionDatoFormularioRenta;
	//protected JFileChooser jFileChooserImportacionDatoFormularioRenta;
	//protected File fileImportacionDatoFormularioRenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoFormularioRenta;
	protected JButton jButtonDuplicarToolBarDatoFormularioRenta;
	protected JButton jButtonNuevoRelacionesToolBarDatoFormularioRenta;
	
	
	public JButton jButtonGuardarCambiosToolBarDatoFormularioRenta;
	protected JButton jButtonCopiarToolBarDatoFormularioRenta;
	protected JButton jButtonVerFormToolBarDatoFormularioRenta;
	public JButton jButtonGuardarCambiosTablaToolBarDatoFormularioRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoFormularioRenta;
	protected JButton jButtonCerrarToolBarDatoFormularioRenta;
	
	protected JButton jButtonRecargarInformacionToolBarDatoFormularioRenta;
	protected JButton jButtonProcesarInformacionToolBarDatoFormularioRenta;
	protected JButton jButtonAnterioresToolBarDatoFormularioRenta;
	protected JButton jButtonSiguientesToolBarDatoFormularioRenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarDatoFormularioRenta;
	protected JButton jButtonAbrirOrderByToolBarDatoFormularioRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoFormularioRenta;
	protected JMenuItem jMenuItemDuplicarDatoFormularioRenta;
	protected JMenuItem jMenuItemNuevoRelacionesDatoFormularioRenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDatoFormularioRenta;
	protected JMenuItem jMenuItemCopiarDatoFormularioRenta;
	protected JMenuItem jMenuItemVerFormDatoFormularioRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoFormularioRenta;
	protected JMenuItem jMenuItemCerrarDatoFormularioRenta;
	protected JMenuItem jMenuItemDetalleCerrarDatoFormularioRenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDatoFormularioRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoFormularioRenta;
	
	protected JMenuItem jMenuItemRecargarInformacionDatoFormularioRenta;
	protected JMenuItem jMenuItemProcesarInformacionDatoFormularioRenta;
	protected JMenuItem jMenuItemAnterioresDatoFormularioRenta;
	protected JMenuItem jMenuItemSiguientesDatoFormularioRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoFormularioRenta;
	protected JMenuItem jMenuItemAbrirOrderByDatoFormularioRenta;
	protected JMenuItem jMenuItemMostrarOcultarDatoFormularioRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoFormularioRenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDatoFormularioRenta;
	protected JCheckBox jCheckBoxSeleccionadosDatoFormularioRenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDatoFormularioRenta;
	protected JCheckBox jCheckBoxConGraficoReporteDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDatoFormularioRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDatoFormularioRenta;
	protected JTextField jTextFieldValorCampoGeneralDatoFormularioRenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDatoFormularioRenta;
	//public JList<Reporte> jListColumnasSelectReporteDatoFormularioRenta;
	//public JScrollPane jScrollColumnasSelectReporteDatoFormularioRenta;
	
	//public JLabel jLabelRelacionesSelectReporteDatoFormularioRenta;
	//public JList<Reporte> jListRelacionesSelectReporteDatoFormularioRenta;
	//public JScrollPane jScrollRelacionesSelectReporteDatoFormularioRenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDatoFormularioRenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDatoFormularioRenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDatoFormularioRenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoDatoFormularioRenta;
	
		
	//public JLabel jLabelArchivoImportacionDatoFormularioRenta;	
	//public JLabel jLabelPathArchivoImportacionDatoFormularioRenta;
	//protected JTextField jTextFieldPathArchivoImportacionDatoFormularioRenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDatoFormularioRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDatoFormularioRenta;
	
	//public JLabel jLabelColumnaCategoriaValorDatoFormularioRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDatoFormularioRenta;
	
	//public JLabel jLabelColumnasValoresGraficoDatoFormularioRenta;
	//public JList<Reporte> jListColumnasValoresGraficoDatoFormularioRenta;
	//public JScrollPane jScrollColumnasValoresGraficoDatoFormularioRenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDatoFormularioRenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDatoFormularioRenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDatoFormularioRenta;
	public JPanel jPanelFK_IdAnioDatoFormularioRenta;
	public JButton jButtonFK_IdAnioDatoFormularioRenta;
	public JPanel jPanelFK_IdMesDatoFormularioRenta;
	public JButton jButtonFK_IdMesDatoFormularioRenta;
	
	public JPanel jPanelid_anioFK_IdAnioDatoFormularioRenta;
	public JLabel jLabelid_anioFK_IdAnioDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioDatoFormularioRenta;
	public JButton jButtonid_anioFK_IdAnioDatoFormularioRenta= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDatoFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDatoFormularioRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesDatoFormularioRenta;
	public JLabel jLabelid_mesFK_IdMesDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesDatoFormularioRenta;
	public JButton jButtonid_mesFK_IdMesDatoFormularioRenta= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesDatoFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesDatoFormularioRentaBusqueda= new JButtonMe();

	
	
	
	
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
	public DatoFormularioRentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioRentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioRentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioRentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDatoFormularioRenta)	{
		this.jButtonRecargarInformacionDatoFormularioRenta = jButtonRecargarInformacionDatoFormularioRenta;
	}
	
	public JButton getjButtonProcesarInformacionDatoFormularioRenta() {
		return this.jButtonProcesarInformacionDatoFormularioRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoFormularioRenta)	{
		this.jButtonProcesarInformacionDatoFormularioRenta = jButtonProcesarInformacionDatoFormularioRenta;
	}
	
	
	public JButton getjButtonRecargarInformacionDatoFormularioRenta() {
		return this.jButtonRecargarInformacionDatoFormularioRenta;
	}
	
	
	public List<DatoFormularioRenta> getdatoformulariorentas() {
		return this.datoformulariorentas;
	}

	public void setdatoformulariorentas(List<DatoFormularioRenta> datoformulariorentas) {
		this.datoformulariorentas = datoformulariorentas;
	}
	
	public List<DatoFormularioRenta> getdatoformulariorentasAux() {
		return this.datoformulariorentasAux;
	}

	public void setdatoformulariorentasAux(List<DatoFormularioRenta> datoformulariorentasAux) {
		this.datoformulariorentasAux = datoformulariorentasAux;
	}
	
	public List<DatoFormularioRenta> getdatoformulariorentasEliminados() {
		return this.datoformulariorentasEliminados;
	}

	public void setDatoFormularioRentasEliminados(List<DatoFormularioRenta> datoformulariorentasEliminados) {
		this.datoformulariorentasEliminados = datoformulariorentasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDatoFormularioRenta() {
		return jComboBoxTiposSeleccionarDatoFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDatoFormularioRenta(
			JComboBox jComboBoxTiposSeleccionarDatoFormularioRenta) {
		this.jComboBoxTiposSeleccionarDatoFormularioRenta = jComboBoxTiposSeleccionarDatoFormularioRenta;
	}
	
	public void setBorderResaltarTiposSeleccionarDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDatoFormularioRenta() {
		return jTextFieldValorCampoGeneralDatoFormularioRenta;
	}

	public void setjTextFieldValorCampoGeneralDatoFormularioRenta(
			JTextField jTextFieldValorCampoGeneralDatoFormularioRenta) {
		this.jTextFieldValorCampoGeneralDatoFormularioRenta = jTextFieldValorCampoGeneralDatoFormularioRenta;
	}

	public void setBorderResaltarValorCampoGeneralDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDatoFormularioRenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDatoFormularioRenta() {
		return this.jCheckBoxSeleccionarTodosDatoFormularioRenta;
	}

	public void setjCheckBoxSeleccionarTodosDatoFormularioRenta(
			JCheckBox jCheckBoxSeleccionarTodosDatoFormularioRenta) {
		this.jCheckBoxSeleccionarTodosDatoFormularioRenta = jCheckBoxSeleccionarTodosDatoFormularioRenta;
	}

	public void setBorderResaltarSeleccionarTodosDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDatoFormularioRenta() {
		return this.jCheckBoxSeleccionadosDatoFormularioRenta;
	}

	public void setjCheckBoxSeleccionadosDatoFormularioRenta(
			JCheckBox jCheckBoxSeleccionadosDatoFormularioRenta) {
		this.jCheckBoxSeleccionadosDatoFormularioRenta = jCheckBoxSeleccionadosDatoFormularioRenta;
	}
	
	public void setBorderResaltarSeleccionadosDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDatoFormularioRenta() {
		return this.jComboBoxTiposArchivosReportesDatoFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDatoFormularioRenta(
			JComboBox jComboBoxTiposArchivosReportesDatoFormularioRenta) {
		this.jComboBoxTiposArchivosReportesDatoFormularioRenta = jComboBoxTiposArchivosReportesDatoFormularioRenta;
	}

	public void setBorderResaltarTiposArchivosReportesDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDatoFormularioRenta() {
		return this.jComboBoxTiposReportesDatoFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDatoFormularioRenta(
			JComboBox jComboBoxTiposReportesDatoFormularioRenta) {
		this.jComboBoxTiposReportesDatoFormularioRenta = jComboBoxTiposReportesDatoFormularioRenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDatoFormularioRenta() {
	//	return jComboBoxTiposReportesDinamicoDatoFormularioRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDatoFormularioRenta(
	//		JComboBox jComboBoxTiposReportesDinamicoDatoFormularioRenta) {
	//	this.jComboBoxTiposReportesDinamicoDatoFormularioRenta = jComboBoxTiposReportesDinamicoDatoFormularioRenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta = jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta;
	//}
	
	public void setBorderResaltarTiposReportesDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDatoFormularioRenta() {
		return this.jComboBoxTiposGraficosReportesDatoFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDatoFormularioRenta(
			JComboBox jComboBoxTiposGraficosReportesDatoFormularioRenta) {
		this.jComboBoxTiposGraficosReportesDatoFormularioRenta = jComboBoxTiposGraficosReportesDatoFormularioRenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDatoFormularioRenta() {
		return this.jComboBoxTiposPaginacionDatoFormularioRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDatoFormularioRenta(
			JComboBox jComboBoxTiposPaginacionDatoFormularioRenta) {
		this.jComboBoxTiposPaginacionDatoFormularioRenta = jComboBoxTiposPaginacionDatoFormularioRenta;
	}
	
	public void setBorderResaltarTiposPaginacionDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDatoFormularioRenta() {
		return this.jComboBoxTiposRelacionesDatoFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoFormularioRenta() {
		return this.jComboBoxTiposAccionesDatoFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoFormularioRenta(
			JComboBox jComboBoxTiposRelacionesDatoFormularioRenta) {
		this.jComboBoxTiposRelacionesDatoFormularioRenta = jComboBoxTiposRelacionesDatoFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoFormularioRenta(
			JComboBox jComboBoxTiposAccionesDatoFormularioRenta) {
		this.jComboBoxTiposAccionesDatoFormularioRenta = jComboBoxTiposAccionesDatoFormularioRenta;
	}
	
	public void setBorderResaltarTiposRelacionesDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDatoFormularioRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDatoFormularioRenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDatoFormularioRenta() {
	//	return jCheckBoxConGraficoDinamicoDatoFormularioRenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoDatoFormularioRenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoDatoFormularioRenta) {
	//	this.jCheckBoxConGraficoDinamicoDatoFormularioRenta = jCheckBoxConGraficoDinamicoDatoFormularioRenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDatoFormularioRenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDatoFormularioRenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDatoFormularioRenta .setBorder(borderResaltar);		
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
		this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
		
		this.datoformulariorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoformulariorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datoformulariorentaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoFormularioRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato Formulario Renta MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
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
		
		DatoFormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDatoFormularioRenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"nuevo","nuevo","Nuevo"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"duplicar","duplicar","Duplicar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"copiar","copiar","Copiar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"ver_form","ver_form","Ver"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"recargar","recargar","Recargar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,
							"cerrar","cerrar","Salir"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDatoFormularioRenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDatoFormularioRenta;
			
				this.jButtonProcesarInformacionToolBarDatoFormularioRenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDatoFormularioRenta;
				
		//protected JButton jButtonModificarToolBarDatoFormularioRenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDatoFormularioRenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDatoFormularioRenta=new JMenuMe("General");
		this.jmenuArchivoDatoFormularioRenta=new JMenuMe("Archivo");
		this.jmenuAccionesDatoFormularioRenta=new JMenuMe("Acciones");
		this.jmenuDatosDatoFormularioRenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoFormularioRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoFormularioRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoFormularioRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDatoFormularioRenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDatoFormularioRenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDatoFormularioRenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDatoFormularioRenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDatoFormularioRenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDatoFormularioRenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDatoFormularioRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoFormularioRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoFormularioRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDatoFormularioRenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDatoFormularioRenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDatoFormularioRenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDatoFormularioRenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDatoFormularioRenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDatoFormularioRenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDatoFormularioRenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDatoFormularioRenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDatoFormularioRenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoFormularioRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoFormularioRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoFormularioRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDatoFormularioRenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDatoFormularioRenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDatoFormularioRenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDatoFormularioRenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDatoFormularioRenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDatoFormularioRenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDatoFormularioRenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDatoFormularioRenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDatoFormularioRenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDatoFormularioRenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDatoFormularioRenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDatoFormularioRenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDatoFormularioRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDatoFormularioRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDatoFormularioRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoFormularioRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoFormularioRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoFormularioRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDatoFormularioRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDatoFormularioRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDatoFormularioRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoFormularioRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoFormularioRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoFormularioRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDatoFormularioRenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDatoFormularioRenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDatoFormularioRenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDatoFormularioRenta.add(this.jMenuItemCerrarDatoFormularioRenta);
			
			this.jmenuAccionesDatoFormularioRenta.add(this.jMenuItemNuevoDatoFormularioRenta);
			this.jmenuAccionesDatoFormularioRenta.add(this.jMenuItemNuevoGuardarCambiosDatoFormularioRenta);
			this.jmenuAccionesDatoFormularioRenta.add(this.jMenuItemNuevoRelacionesDatoFormularioRenta);
			this.jmenuAccionesDatoFormularioRenta.add(this.jMenuItemGuardarCambiosTablaDatoFormularioRenta);		
			this.jmenuAccionesDatoFormularioRenta.add(this.jMenuItemDuplicarDatoFormularioRenta);		
			this.jmenuAccionesDatoFormularioRenta.add(this.jMenuItemCopiarDatoFormularioRenta);		
			this.jmenuAccionesDatoFormularioRenta.add(this.jMenuItemVerFormDatoFormularioRenta);		
			
			this.jmenuDatosDatoFormularioRenta.add(this.jMenuItemRecargarInformacionDatoFormularioRenta);				
			this.jmenuDatosDatoFormularioRenta.add(this.jMenuItemAnterioresDatoFormularioRenta);				
			this.jmenuDatosDatoFormularioRenta.add(this.jMenuItemSiguientesDatoFormularioRenta);				
			this.jmenuDatosDatoFormularioRenta.add(this.jMenuItemAbrirOrderByDatoFormularioRenta);				
			this.jmenuDatosDatoFormularioRenta.add(this.jMenuItemMostrarOcultarDatoFormularioRenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDatoFormularioRenta.add(this.jMenuItemGuardarCambiosDatoFormularioRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDatoFormularioRenta.add(this.jmenuArchivoDatoFormularioRenta);		
			this.jmenuBarDatoFormularioRenta.add(this.jmenuAccionesDatoFormularioRenta);		
			this.jmenuBarDatoFormularioRenta.add(this.jmenuDatosDatoFormularioRenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDatoFormularioRenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDatoFormularioRenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioDatoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioDatoFormularioRenta.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioDatoFormularioRenta= new JButtonMe();
		this.jButtonFK_IdAnioDatoFormularioRenta.setText("Buscar");
		this.jButtonFK_IdAnioDatoFormularioRenta.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioDatoFormularioRenta,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioDatoFormularioRenta = new JLabelMe();
		jLabelid_anioFK_IdAnioDatoFormularioRenta.setText("Anio :");
		jLabelid_anioFK_IdAnioDatoFormularioRenta.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioDatoFormularioRenta= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesDatoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesDatoFormularioRenta.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesDatoFormularioRenta= new JButtonMe();
		this.jButtonFK_IdMesDatoFormularioRenta.setText("Buscar");
		this.jButtonFK_IdMesDatoFormularioRenta.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesDatoFormularioRenta,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesDatoFormularioRenta = new JLabelMe();
		jLabelid_mesFK_IdMesDatoFormularioRenta.setText("Mes :");
		jLabelid_mesFK_IdMesDatoFormularioRenta.setToolTipText("Mes");
		jLabelid_mesFK_IdMesDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesDatoFormularioRenta= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDatoFormularioRenta=new JTabbedPane();


		this.jTabbedPaneBusquedasDatoFormularioRenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDatoFormularioRenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDatoFormularioRenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDatoFormularioRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDatoFormularioRenta = new DatoFormularioRentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dato Formulario Renta DATOS");
			this.jInternalFrameDetalleFormDatoFormularioRenta = new DatoFormularioRentaDetalleFormJInternalFrame(jDesktopPane,this.datoformulariorentaSessionBean.getConGuardarRelaciones(),this.datoformulariorentaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDatoFormularioRenta = null;//new DatoFormularioRentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoFormularioRenta= new GridBagLayout();
		
		
		this.jTableDatosDatoFormularioRenta = new JTableMe();      
		
		String sToolTipDatoFormularioRenta="";
		sToolTipDatoFormularioRenta=DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoFormularioRenta+="(Contabilidad.DatoFormularioRenta)";
		}
		
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoFormularioRenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDatoFormularioRenta.setToolTipText(sToolTipDatoFormularioRenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDatoFormularioRenta);
		this.jTableDatosDatoFormularioRenta.setAutoCreateRowSorter(true);
		this.jTableDatosDatoFormularioRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDatoFormularioRenta.setRowSelectionAllowed(true);
		this.jTableDatosDatoFormularioRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDatoFormularioRenta = new JButtonMe();
		this.jButtonDuplicarDatoFormularioRenta = new JButtonMe();
		this.jButtonCopiarDatoFormularioRenta = new JButtonMe();
		this.jButtonVerFormDatoFormularioRenta = new JButtonMe();
		this.jButtonNuevoRelacionesDatoFormularioRenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDatoFormularioRenta = new JButtonMe();
		this.jButtonCerrarDatoFormularioRenta = new JButtonMe();
		
		this.jScrollPanelDatosDatoFormularioRenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralDatoFormularioRenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dato Formulario Renta";
		
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoFormularioRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoFormularioRenta.setToolTipText("Acciones");
        this.jPanelAccionesDatoFormularioRenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDatoFormularioRenta=new ReporteDinamicoJInternalFrame(DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDatoFormularioRenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDatoFormularioRenta=new ImportacionJInternalFrame(DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDatoFormularioRenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDatoFormularioRenta = new JButtonMe();
		
		this.jButtonAbrirOrderByDatoFormularioRenta.setText("Orden");
		this.jButtonAbrirOrderByDatoFormularioRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoFormularioRenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoFormularioRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoFormularioRenta,false,this);
			
			//this.cargarOrderByDatoFormularioRenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoFormularioRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoFormularioRenta,true,this);
			
			//this.cargarOrderByDatoFormularioRenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDatoFormularioRenta.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDatoFormularioRenta.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDatoFormularioRenta.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDatoFormularioRenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoFormularioRenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoFormularioRenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDatoFormularioRenta.setText("Nuevo");
		this.jButtonDuplicarDatoFormularioRenta.setText("Duplicar");
		this.jButtonCopiarDatoFormularioRenta.setText("Copiar");
		this.jButtonVerFormDatoFormularioRenta.setText("Ver");
		this.jButtonNuevoRelacionesDatoFormularioRenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.setText("Guardar");
		this.jButtonCerrarDatoFormularioRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoFormularioRenta,"nuevo_button","Nuevo",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDatoFormularioRenta,"duplicar_button","Duplicar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDatoFormularioRenta,"copiar_button","Copiar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDatoFormularioRenta,"ver_form","Ver",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDatoFormularioRenta,"nuevorelaciones_button","Nuevo Rel",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoFormularioRenta,"guardarcambiostabla_button","Guardar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoFormularioRenta,"cerrar_button","Salir",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDatoFormularioRenta.setToolTipText("Nuevo"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDatoFormularioRenta.setToolTipText("Duplicar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDatoFormularioRenta.setToolTipText("Copiar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDatoFormularioRenta.setToolTipText("Ver"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDatoFormularioRenta.setToolTipText("Nuevo Rel"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.setToolTipText("Guardar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoFormularioRenta.setToolTipText("Salir"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoFormularioRenta";
		inputMap = this.jButtonNuevoDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoFormularioRenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarDatoFormularioRenta";
		inputMap = this.jButtonDuplicarDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDatoFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDatoFormularioRenta"));
		
		//COPIAR
		sMapKey = "CopiarDatoFormularioRenta";
		inputMap = this.jButtonCopiarDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDatoFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDatoFormularioRenta"));
		
		//VEr FORM
		sMapKey = "VerFormDatoFormularioRenta";
		inputMap = this.jButtonVerFormDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDatoFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDatoFormularioRenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDatoFormularioRenta";
		inputMap = this.jButtonNuevoRelacionesDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDatoFormularioRenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDatoFormularioRenta";
		inputMap = this.jButtonModificarDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDatoFormularioRenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDatoFormularioRenta";
		inputMap = this.jButtonCerrarDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoFormularioRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoFormularioRenta";
		inputMap = this.jButtonGuardarCambiosTablaDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoFormularioRenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DatoFormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DatoFormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DatoFormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DatoFormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DatoFormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDatoFormularioRenta.setName("jPanelParametrosReportesDatoFormularioRenta"); 
		
		this.jPanelParametrosReportesAccionesDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDatoFormularioRenta.setName("jPanelParametrosReportesAccionesDatoFormularioRenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDatoFormularioRenta = new JButtonMe();
		this.jButtonRecargarInformacionDatoFormularioRenta.setText("Recargar");
		this.jButtonRecargarInformacionDatoFormularioRenta.setToolTipText("Recargar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDatoFormularioRenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDatoFormularioRenta = new JButtonMe();
		this.jButtonProcesarInformacionDatoFormularioRenta.setText("Procesar");
		this.jButtonProcesarInformacionDatoFormularioRenta.setToolTipText("Procesar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDatoFormularioRenta.setVisible(false);
			
		this.jButtonProcesarInformacionDatoFormularioRenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoFormularioRenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoFormularioRenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoFormularioRenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDatoFormularioRenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoFormularioRenta.setText("TIPO");       
		this.jComboBoxTiposReportesDatoFormularioRenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoFormularioRenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDatoFormularioRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDatoFormularioRenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionDatoFormularioRenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDatoFormularioRenta.setText("Accion");
		this.jComboBoxTiposRelacionesDatoFormularioRenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoFormularioRenta.setText("Accion");
		this.jComboBoxTiposAccionesDatoFormularioRenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDatoFormularioRenta.setText("Accion");
		this.jComboBoxTiposSeleccionarDatoFormularioRenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDatoFormularioRenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDatoFormularioRenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoFormularioRenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoFormularioRenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDatoFormularioRenta = new JLabelMe();
		
		this.jLabelAccionesDatoFormularioRenta.setText("Acciones");		
		this.jLabelAccionesDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDatoFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDatoFormularioRenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDatoFormularioRenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDatoFormularioRenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDatoFormularioRenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDatoFormularioRenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDatoFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDatoFormularioRenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteDatoFormularioRenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDatoFormularioRenta = new JButtonMe();
		//this.jButtonAnterioresDatoFormularioRenta.setText("<<");
        this.jButtonAnterioresDatoFormularioRenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDatoFormularioRenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDatoFormularioRenta = new JButtonMe();
		//this.jButtonSiguientesDatoFormularioRenta.setText(">>");
        this.jButtonSiguientesDatoFormularioRenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDatoFormularioRenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDatoFormularioRenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDatoFormularioRenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosDatoFormularioRenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDatoFormularioRenta,"nuevoguardarcambios_button","Nue",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDatoFormularioRenta";
		inputMap = this.jButtonNuevoGuardarCambiosDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDatoFormularioRenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDatoFormularioRenta";
		inputMap = this.jButtonRecargarInformacionDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDatoFormularioRenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDatoFormularioRenta";
		inputMap = this.jButtonSiguientesDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDatoFormularioRenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDatoFormularioRenta";
		inputMap = this.jButtonAnterioresDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDatoFormularioRenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDatoFormularioRenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDatoFormularioRenta.setMinimumSize(new Dimension(this.getWidth(),DatoFormularioRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoFormularioRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoFormularioRenta.setMaximumSize(new Dimension(this.getWidth(),DatoFormularioRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoFormularioRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoFormularioRenta.setPreferredSize(new Dimension(this.getWidth(),DatoFormularioRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoFormularioRentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDatoFormularioRenta = new GridBagLayout();

			this.jPanelPaginacionDatoFormularioRenta.setLayout(gridaBagLayoutPaginacionDatoFormularioRenta);						
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonAnterioresDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
					
						
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
			
			this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonNuevoGuardarCambiosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
						
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
			this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonSiguientesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 1;
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonNuevoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
				this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDatoFormularioRenta.gridy = 1;
				this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonNuevoRelacionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			}
			
			
			if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
				this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDatoFormularioRenta.gridy = 1;
				this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonGuardarCambiosTablaDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			}
			
			
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 1;
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonDuplicarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 1;
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonCopiarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 1;
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonVerFormDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 1;
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDatoFormularioRenta.add(this.jButtonCerrarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
		
		
		this.jButtonRecargarInformacionDatoFormularioRenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoFormularioRenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoFormularioRenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDatoFormularioRenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoFormularioRenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoFormularioRenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDatoFormularioRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoFormularioRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoFormularioRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDatoFormularioRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoFormularioRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoFormularioRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDatoFormularioRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoFormularioRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoFormularioRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDatoFormularioRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoFormularioRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoFormularioRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDatoFormularioRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoFormularioRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoFormularioRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDatoFormularioRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoFormularioRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoFormularioRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDatoFormularioRenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoFormularioRenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoFormularioRenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDatoFormularioRenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoFormularioRenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoFormularioRenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDatoFormularioRenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoFormularioRenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoFormularioRenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDatoFormularioRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDatoFormularioRenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DatoFormularioRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DatoFormularioRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DatoFormularioRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DatoFormularioRenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDatoFormularioRenta.setLayout(gridaBagParametrosReportesDatoFormularioRenta);
			this.jPanelParametrosReportesAccionesDatoFormularioRenta.setLayout(gridaBagParametrosReportesAccionesDatoFormularioRenta);
			
			
			this.jPanelParametrosAuxiliar1DatoFormularioRenta.setLayout(gridaBagParametrosAuxiliar1DatoFormularioRenta);
			this.jPanelParametrosAuxiliar2DatoFormularioRenta.setLayout(gridaBagParametrosAuxiliar2DatoFormularioRenta);
			this.jPanelParametrosAuxiliar3DatoFormularioRenta.setLayout(gridaBagParametrosAuxiliar3DatoFormularioRenta);
			this.jPanelParametrosAuxiliar4DatoFormularioRenta.setLayout(gridaBagParametrosAuxiliar4DatoFormularioRenta);
			//this.jPanelParametrosAuxiliar5DatoFormularioRenta.setLayout(gridaBagParametrosAuxiliar2DatoFormularioRenta);			
			
			
			
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jButtonRecargarInformacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoFormularioRenta.add(this.jComboBoxTiposPaginacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoFormularioRenta.add(this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoFormularioRenta.add(this.jComboBoxTiposArchivosReportesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jPanelParametrosAuxiliar1DatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DatoFormularioRenta.add(this.jComboBoxTiposReportesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jPanelParametrosAuxiliar4DatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jComboBoxTiposReportesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jCheckBoxGenerarReporteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jPanelParametrosAuxiliar2DatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jLabelAccionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
				this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDatoFormularioRenta.add(this.jButtonAbrirOrderByDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jComboBoxTiposSeleccionarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
			
			
			/*
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jCheckBoxSeleccionarTodosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoFormularioRenta.add(this.jCheckBoxSeleccionarTodosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);															
				
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoFormularioRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoFormularioRenta.add(this.jCheckBoxSeleccionadosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jPanelParametrosAuxiliar3DatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jComboBoxTiposRelacionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
				
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jComboBoxTiposAccionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
	
				
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoFormularioRenta.add(this.jTextFieldValorCampoGeneralDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDatoFormularioRenta = new GridBagLayout();

			this.jScrollPanelDatosDatoFormularioRenta.setLayout(gridaBagLayoutDatosDatoFormularioRenta);
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
			this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
			
			this.jScrollPanelDatosDatoFormularioRenta.add(this.jTableDatosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDatoFormularioRenta.setViewportView(this.jTableDatosDatoFormularioRenta);
		this.jTableDatosDatoFormularioRenta.setFillsViewportHeight(true);
		this.jTableDatosDatoFormularioRenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDatoFormularioRenta= new GridBagLayout();
		this.jPanelAccionesDatoFormularioRenta.setLayout(gridaBagLayoutAccionesDatoFormularioRenta);
		
		
		/*	
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
			
		this.jPanelAccionesDatoFormularioRenta.add(this.jButtonNuevoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioDatoFormularioRenta= new GridBagLayout();
		gridaBagLayoutFK_IdAnioDatoFormularioRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioDatoFormularioRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioDatoFormularioRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioDatoFormularioRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioDatoFormularioRenta.setLayout(gridaBagLayoutFK_IdAnioDatoFormularioRenta);

		gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioRenta.gridy = 0;
		gridBagConstraintsDatoFormularioRenta.gridx = 0;
		jPanelFK_IdAnioDatoFormularioRenta.add(jLabelid_anioFK_IdAnioDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);

		gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioRenta.gridy = 0;
		gridBagConstraintsDatoFormularioRenta.gridx = 1;
		jPanelFK_IdAnioDatoFormularioRenta.add(jComboBoxid_anioFK_IdAnioDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);

		gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioRenta.gridy = 1;
		gridBagConstraintsDatoFormularioRenta.gridx =1;
		jPanelFK_IdAnioDatoFormularioRenta.add(jButtonFK_IdAnioDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);

		jTabbedPaneBusquedasDatoFormularioRenta.addTab("1.-Por Anio ", jPanelFK_IdAnioDatoFormularioRenta);
		jTabbedPaneBusquedasDatoFormularioRenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMesDatoFormularioRenta= new GridBagLayout();
		gridaBagLayoutFK_IdMesDatoFormularioRenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesDatoFormularioRenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesDatoFormularioRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesDatoFormularioRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesDatoFormularioRenta.setLayout(gridaBagLayoutFK_IdMesDatoFormularioRenta);

		gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioRenta.gridy = 0;
		gridBagConstraintsDatoFormularioRenta.gridx = 0;
		jPanelFK_IdMesDatoFormularioRenta.add(jLabelid_mesFK_IdMesDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);

		gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioRenta.gridy = 0;
		gridBagConstraintsDatoFormularioRenta.gridx = 1;
		jPanelFK_IdMesDatoFormularioRenta.add(jComboBoxid_mesFK_IdMesDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);

		gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoFormularioRenta.gridy = 1;
		gridBagConstraintsDatoFormularioRenta.gridx =1;
		jPanelFK_IdMesDatoFormularioRenta.add(jButtonFK_IdMesDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);

		jTabbedPaneBusquedasDatoFormularioRenta.addTab("2.-Por Mes ", jPanelFK_IdMesDatoFormularioRenta);
		jTabbedPaneBusquedasDatoFormularioRenta.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoFormularioRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoFormularioRenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();						
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoFormularioRenta.gridx = 0;		
			//this.gridBagConstraintsDatoFormularioRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoFormularioRenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;		
		//this.gridBagConstraintsDatoFormularioRenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDatoFormularioRenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoFormularioRenta.gridx = 0;		
			this.gridBagConstraintsDatoFormularioRenta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDatoFormularioRenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);								
		
		
		/*
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		*/		
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoFormularioRenta.gridx =0;
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoFormularioRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
				
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDatoFormularioRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoFormularioRenta = new GridBagLayout();
			this.jPanelBusquedasParametrosDatoFormularioRenta.setLayout(gridaBagLayoutBusquedasParametrosDatoFormularioRenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDatoFormularioRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoFormularioRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoFormularioRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoFormularioRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			
			
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
			
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDatoFormularioRenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDatoFormularioRenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDatoFormularioRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDatoFormularioRenta.setName("jPanelReporteDinamicoDatoFormularioRenta"); 
		
		this.jPanelReporteDinamicoDatoFormularioRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoFormularioRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoFormularioRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDatoFormularioRenta.setLayout(gridaBagLayoutReporteDinamicoDatoFormularioRenta);
		
		
		this.jInternalFrameReporteDinamicoDatoFormularioRenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDatoFormularioRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoFormularioRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDatoFormularioRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDatoFormularioRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDatoFormularioRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDatoFormularioRenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDatoFormularioRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDatoFormularioRenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoDatoFormularioRenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoDatoFormularioRenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDatoFormularioRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoFormularioRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoFormularioRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Rentas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDatoFormularioRenta = new JLabelMe();

		this.jLabelColumnasSelectReporteDatoFormularioRenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jLabelColumnasSelectReporteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDatoFormularioRenta = new JList<Reporte>();
		this.jListColumnasSelectReporteDatoFormularioRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDatoFormularioRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDatoFormularioRenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoFormularioRenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoFormularioRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDatoFormularioRenta=new JScrollPane(this.jListColumnasSelectReporteDatoFormularioRenta);
			
			this.jScrollColumnasSelectReporteDatoFormularioRenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoFormularioRenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoFormularioRenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jListColumnasSelectReporteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jScrollColumnasSelectReporteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDatoFormularioRenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteDatoFormularioRenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jLabelRelacionesSelectReporteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDatoFormularioRenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteDatoFormularioRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDatoFormularioRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDatoFormularioRenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoFormularioRenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoFormularioRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDatoFormularioRenta=new JScrollPane(this.jListRelacionesSelectReporteDatoFormularioRenta);
			
			this.jScrollRelacionesSelectReporteDatoFormularioRenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoFormularioRenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoFormularioRenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jListRelacionesSelectReporteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jScrollRelacionesSelectReporteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDatoFormularioRenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDatoFormularioRenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoDatoFormularioRenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDatoFormularioRenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDatoFormularioRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDatoFormularioRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoFormularioRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoFormularioRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDatoFormularioRenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDatoFormularioRenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jLabelGenerarExcelReporteDinamicoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDatoFormularioRenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDatoFormularioRenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDatoFormularioRenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDatoFormularioRenta.setToolTipText("Generar EXCEL"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jButtonGenerarExcelReporteDinamicoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jComboBoxTiposReportesDinamicoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDatoFormularioRenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDatoFormularioRenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jLabelTiposArchivoReporteDinamicoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jComboBoxTiposArchivosReportesDinamicoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDatoFormularioRenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDatoFormularioRenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDatoFormularioRenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDatoFormularioRenta.setToolTipText("Generar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jButtonGenerarReporteDinamicoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDatoFormularioRenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDatoFormularioRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDatoFormularioRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDatoFormularioRenta.setToolTipText("Cancelar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoFormularioRenta.add(this.jButtonCerrarReporteDinamicoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDatoFormularioRenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDatoFormularioRenta= new JScrollPane(jPanelReporteDinamicoDatoFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDatoFormularioRenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoFormularioRenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoFormularioRenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Rentas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDatoFormularioRenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDatoFormularioRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDatoFormularioRenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDatoFormularioRenta);
		this.jInternalFrameReporteDinamicoDatoFormularioRenta.getContentPane().add(this.jScrollPanelReporteDinamicoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDatoFormularioRenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDatoFormularioRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDatoFormularioRenta.setName("jPanelImportacionDatoFormularioRenta"); 
		
		this.jPanelImportacionDatoFormularioRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoFormularioRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoFormularioRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDatoFormularioRenta.setLayout(gridaBagLayoutImportacionDatoFormularioRenta);
		
		
		this.jInternalFrameImportacionDatoFormularioRenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDatoFormularioRenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDatoFormularioRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoFormularioRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDatoFormularioRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoFormularioRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoFormularioRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDatoFormularioRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoFormularioRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoFormularioRenta.setResizable(true);
	    this.jInternalFrameImportacionDatoFormularioRenta.setClosable(true);
	    this.jInternalFrameImportacionDatoFormularioRenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDatoFormularioRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoFormularioRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoFormularioRenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDatoFormularioRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoFormularioRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoFormularioRenta.setResizable(true);
	    this.jInternalFrameImportacionDatoFormularioRenta.setClosable(true);
	    this.jInternalFrameImportacionDatoFormularioRenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDatoFormularioRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoFormularioRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoFormularioRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Rentas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDatoFormularioRenta = new JLabelMe();

		this.jLabelArchivoImportacionDatoFormularioRenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoFormularioRenta.add(this.jLabelArchivoImportacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDatoFormularioRenta = new JFileChooser();		
		this.jFileChooserImportacionDatoFormularioRenta.setToolTipText("ESCOGER ARCHIVO"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDatoFormularioRenta = new JButtonMe();
		this.jButtonAbrirImportacionDatoFormularioRenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDatoFormularioRenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDatoFormularioRenta.setToolTipText("Generar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoFormularioRenta.add(this.jButtonAbrirImportacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDatoFormularioRenta = new JLabelMe();

		this.jLabelPathArchivoImportacionDatoFormularioRenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoFormularioRenta.add(this.jLabelPathArchivoImportacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDatoFormularioRenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDatoFormularioRenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoFormularioRenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoFormularioRenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoFormularioRenta.add(this.jTextFieldPathArchivoImportacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDatoFormularioRenta = new JButtonMe();
		this.jButtonGenerarImportacionDatoFormularioRenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDatoFormularioRenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDatoFormularioRenta.setToolTipText("Generar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoFormularioRenta.add(this.jButtonGenerarImportacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDatoFormularioRenta = new JButtonMe();
		this.jButtonCerrarImportacionDatoFormularioRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDatoFormularioRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDatoFormularioRenta.setToolTipText("Cancelar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoFormularioRenta.add(this.jButtonCerrarImportacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDatoFormularioRenta = new GridBagLayout();
		
		this.jScrollPanelImportacionDatoFormularioRenta= new JScrollPane(jPanelImportacionDatoFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy =iPosYImportacion;
		this.gridBagConstraintsDatoFormularioRenta.gridx =iPosXImportacion;
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDatoFormularioRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDatoFormularioRenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDatoFormularioRenta);
		this.jInternalFrameImportacionDatoFormularioRenta.getContentPane().add(this.jScrollPanelImportacionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDatoFormularioRenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDatoFormularioRenta = new JButtonMe();
			this.jButtonAbrirOrderByDatoFormularioRenta.setText("Orden");
			this.jButtonAbrirOrderByDatoFormularioRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoFormularioRenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDatoFormularioRenta";
			inputMap = this.jButtonAbrirOrderByDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDatoFormularioRenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByDatoFormularioRenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDatoFormularioRenta.setName("jPanelOrderByDatoFormularioRenta"); 
			
			this.jPanelOrderByDatoFormularioRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoFormularioRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoFormularioRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDatoFormularioRenta.setLayout(gridaBagLayoutOrderByDatoFormularioRenta);
			
			
			this.jTableDatosDatoFormularioRentaOrderBy = new JTableMe();        
			this.jTableDatosDatoFormularioRentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDatoFormularioRentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDatoFormularioRentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDatoFormularioRentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDatoFormularioRentaOrderBy.setViewportView(this.jTableDatosDatoFormularioRentaOrderBy);
			this.jTableDatosDatoFormularioRentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDatoFormularioRentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDatoFormularioRenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDatoFormularioRenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDatoFormularioRenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDatoFormularioRenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDatoFormularioRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDatoFormularioRenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDatoFormularioRenta.setTitle("Orden");
			this.jInternalFrameOrderByDatoFormularioRenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDatoFormularioRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDatoFormularioRenta.setResizable(true);
			this.jInternalFrameOrderByDatoFormularioRenta.setClosable(true);
			this.jInternalFrameOrderByDatoFormularioRenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDatoFormularioRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoFormularioRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoFormularioRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Rentas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDatoFormularioRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDatoFormularioRenta.ipady =150;
				
			this.jPanelOrderByDatoFormularioRenta.add(jScrollPanelDatosDatoFormularioRentaOrderBy, this.gridBagConstraintsDatoFormularioRenta);//this.jTableDatosDatoFormularioRentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDatoFormularioRenta = new JButtonMe();
			this.jButtonCerrarOrderByDatoFormularioRenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDatoFormularioRenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDatoFormularioRenta.setToolTipText("Cancelar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDatoFormularioRenta.add(this.jButtonCerrarOrderByDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDatoFormularioRenta = new GridBagLayout();
			
			this.jScrollPanelOrderByDatoFormularioRenta= new JScrollPane(jPanelOrderByDatoFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsDatoFormularioRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDatoFormularioRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDatoFormularioRenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDatoFormularioRenta);
			
			this.jInternalFrameOrderByDatoFormularioRenta.getContentPane().add(this.jScrollPanelOrderByDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
		
		} else {
			this.jButtonAbrirOrderByDatoFormularioRenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.datoformulariorentaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDatoFormularioRenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDatoFormularioRenta.getRowHeight();//DatoFormularioRentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DatoFormularioRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta.isSelected()) {
					iHeightTable=DatoFormularioRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoFormularioRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoFormularioRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DatoFormularioRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoFormularioRenta.isSelected()) {
					iHeightTable=DatoFormularioRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoFormularioRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoFormularioRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDatoFormularioRenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoFormularioRenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoFormularioRenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDatoFormularioRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoFormularioRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoFormularioRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDatoFormularioRenta!=null && this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy()!=null) {
			//if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDatoFormularioRenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDatoFormularioRenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDatoFormularioRenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDatoFormularioRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoFormularioRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoFormularioRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=datoformulariorentaLogic.getDatoFormularioRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoformulariorentas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DatoFormularioRenta> TraerDatoFormularioRentaBeans(List<DatoFormularioRenta> datoformulariorentas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DatoFormularioRenta datoformulariorenta:datoformulariorentas) {
					
				if(!(DatoFormularioRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DatoFormularioRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					datoformulariorenta.setsDetalleGeneralEntityReporte(DatoFormularioRentaConstantesFunciones.getDatoFormularioRentaDescripcion(datoformulariorenta));
										
					datoformulariorenta.setes_sustitutiva_descripcion(DatoFormularioRentaConstantesFunciones.getes_sustitutivaDescripcion(datoformulariorenta));	
					
					

					if(datoformulariorenta.getFormularioRentas()!=null && Funciones.existeClass(classes,FormularioRenta.class)) {
						try{datoformulariorenta.setformulariorentasDescripcionReporte(new JRBeanCollectionDataSource(FormularioRentaJInternalFrame.TraerFormularioRentaBeans(datoformulariorenta.getFormularioRentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(datoformulariorenta.getFormularioRentaExtras()!=null && Funciones.existeClass(classes,FormularioRentaExtra.class)) {
						try{datoformulariorenta.setformulariorentaextrasDescripcionReporte(new JRBeanCollectionDataSource(FormularioRentaExtraJInternalFrame.TraerFormularioRentaExtraBeans(datoformulariorenta.getFormularioRentaExtras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//datoformulariorenta.setsDetalleGeneralEntityReporte(datoformulariorenta.getsDetalleGeneralEntityReporte());
										
				}
				
				//datoformulariorentabeans.add(datoformulariorentabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return datoformulariorentas;
    }
	//PARA REPORTES FIN
}
