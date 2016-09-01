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
import com.bydan.erp.nomina.util.DiaFeriadoConstantesFunciones;

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
public class DiaFeriadoJInternalFrame extends DiaFeriadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDiaFeriado;
	
	protected JMenuBar jmenuBarDiaFeriado;
	
	protected JMenu jmenuDiaFeriado;
	protected JMenu jmenuDatosDiaFeriado;
	protected JMenu jmenuArchivoDiaFeriado;
	protected JMenu jmenuAccionesDiaFeriado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDiaFeriado;	
	protected GridBagConstraints gridBagConstraintsDiaFeriado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DiaFeriadoDetalleFormJInternalFrame jInternalFrameDetalleFormDiaFeriado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDiaFeriado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDiaFeriado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public DiaFeriadoSessionBean diaferiadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public MesSessionBean mesSessionBean;
	public AnioSessionBean anioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DiaFeriado> diaferiados;		
	public List<DiaFeriado> diaferiadosEliminados;	
	public List<DiaFeriado> diaferiadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDiaFeriado;		
	protected JButton jButtonAbrirOrderByDiaFeriado;
	
	
	//protected JPanel jPanelOrderByDiaFeriado;
	//public JScrollPane jScrollPanelOrderByDiaFeriado;	
	//protected JButton jButtonCerrarOrderByDiaFeriado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DiaFeriadoLogic diaferiadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDiaFeriado;
	public JScrollPane jScrollPanelDatosEdicionDiaFeriado;
	public JScrollPane jScrollPanelDatosGeneralDiaFeriado;
    
	
	
	//public JScrollPane jScrollPanelDatosDiaFeriadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDiaFeriado;
	//public JScrollPane jScrollPanelImportacionDiaFeriado;
	
	
	
	protected JPanel jPanelAccionesDiaFeriado;
	
    protected JPanel jPanelPaginacionDiaFeriado;
    protected JPanel jPanelParametrosReportesDiaFeriado;
	protected JPanel jPanelParametrosReportesAccionesDiaFeriado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DiaFeriado;
	protected JPanel jPanelParametrosAuxiliar2DiaFeriado;
	protected JPanel jPanelParametrosAuxiliar3DiaFeriado;
	protected JPanel jPanelParametrosAuxiliar4DiaFeriado;
	//protected JPanel jPanelParametrosAuxiliar5DiaFeriado;
	
	
	
	//protected JPanel jPanelReporteDinamicoDiaFeriado;
	//protected JPanel jPanelImportacionDiaFeriado;
	
	
	public JTable jTableDatosDiaFeriado;
	
	
	
	//public JTable jTableDatosDiaFeriadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDiaFeriado;
	protected JButton jButtonDuplicarDiaFeriado;
	protected JButton jButtonCopiarDiaFeriado;
	protected JButton jButtonVerFormDiaFeriado;
	protected JButton jButtonNuevoRelacionesDiaFeriado;
	protected JButton jButtonModificarDiaFeriado;
	
    protected JButton jButtonGuardarCambiosTablaDiaFeriado;
	protected JButton jButtonCerrarDiaFeriado;
	
	
	protected JButton jButtonRecargarInformacionDiaFeriado;
	protected JButton jButtonProcesarInformacionDiaFeriado;
	
	
	protected JButton jButtonAnterioresDiaFeriado;
	protected JButton jButtonSiguientesDiaFeriado;
	protected JButton jButtonNuevoGuardarCambiosDiaFeriado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDiaFeriado;
	//protected JButton jButtonCerrarReporteDinamicoDiaFeriado;
	//protected JButton jButtonGenerarExcelReporteDinamicoDiaFeriado;	
	
	
	
	//protected JButton jButtonAbrirImportacionDiaFeriado;
	//protected JButton jButtonGenerarImportacionDiaFeriado;
	//protected JButton jButtonCerrarImportacionDiaFeriado;
	//protected JFileChooser jFileChooserImportacionDiaFeriado;
	//protected File fileImportacionDiaFeriado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDiaFeriado;
	protected JButton jButtonDuplicarToolBarDiaFeriado;
	protected JButton jButtonNuevoRelacionesToolBarDiaFeriado;
	
	
	public JButton jButtonGuardarCambiosToolBarDiaFeriado;
	protected JButton jButtonCopiarToolBarDiaFeriado;
	protected JButton jButtonVerFormToolBarDiaFeriado;
	public JButton jButtonGuardarCambiosTablaToolBarDiaFeriado;
	protected JButton jButtonMostrarOcultarTablaToolBarDiaFeriado;
	protected JButton jButtonCerrarToolBarDiaFeriado;
	
	protected JButton jButtonRecargarInformacionToolBarDiaFeriado;
	protected JButton jButtonProcesarInformacionToolBarDiaFeriado;
	protected JButton jButtonAnterioresToolBarDiaFeriado;
	protected JButton jButtonSiguientesToolBarDiaFeriado;
	protected JButton jButtonNuevoGuardarCambiosToolBarDiaFeriado;
	protected JButton jButtonAbrirOrderByToolBarDiaFeriado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDiaFeriado;
	protected JMenuItem jMenuItemDuplicarDiaFeriado;
	protected JMenuItem jMenuItemNuevoRelacionesDiaFeriado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDiaFeriado;
	protected JMenuItem jMenuItemCopiarDiaFeriado;
	protected JMenuItem jMenuItemVerFormDiaFeriado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDiaFeriado;
	protected JMenuItem jMenuItemCerrarDiaFeriado;
	protected JMenuItem jMenuItemDetalleCerrarDiaFeriado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDiaFeriado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDiaFeriado;
	
	protected JMenuItem jMenuItemRecargarInformacionDiaFeriado;
	protected JMenuItem jMenuItemProcesarInformacionDiaFeriado;
	protected JMenuItem jMenuItemAnterioresDiaFeriado;
	protected JMenuItem jMenuItemSiguientesDiaFeriado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDiaFeriado;
	protected JMenuItem jMenuItemAbrirOrderByDiaFeriado;
	protected JMenuItem jMenuItemMostrarOcultarDiaFeriado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDiaFeriado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDiaFeriado;
	protected JCheckBox jCheckBoxSeleccionadosDiaFeriado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDiaFeriado;
	protected JCheckBox jCheckBoxConGraficoReporteDiaFeriado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDiaFeriado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDiaFeriado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDiaFeriado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDiaFeriado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDiaFeriado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDiaFeriado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDiaFeriado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDiaFeriado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDiaFeriado;
	protected JTextField jTextFieldValorCampoGeneralDiaFeriado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDiaFeriado;
	//public JList<Reporte> jListColumnasSelectReporteDiaFeriado;
	//public JScrollPane jScrollColumnasSelectReporteDiaFeriado;
	
	//public JLabel jLabelRelacionesSelectReporteDiaFeriado;
	//public JList<Reporte> jListRelacionesSelectReporteDiaFeriado;
	//public JScrollPane jScrollRelacionesSelectReporteDiaFeriado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDiaFeriado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDiaFeriado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDiaFeriado;
	//public JLabel jLabelTiposArchivoReporteDinamicoDiaFeriado;
	
		
	//public JLabel jLabelArchivoImportacionDiaFeriado;	
	//public JLabel jLabelPathArchivoImportacionDiaFeriado;
	//protected JTextField jTextFieldPathArchivoImportacionDiaFeriado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDiaFeriado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDiaFeriado;
	
	//public JLabel jLabelColumnaCategoriaValorDiaFeriado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDiaFeriado;
	
	//public JLabel jLabelColumnasValoresGraficoDiaFeriado;
	//public JList<Reporte> jListColumnasValoresGraficoDiaFeriado;
	//public JScrollPane jScrollColumnasValoresGraficoDiaFeriado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDiaFeriado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDiaFeriado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDiaFeriado;
	public JPanel jPanelFK_IdAnioDiaFeriado;
	public JButton jButtonFK_IdAnioDiaFeriado;
	public JPanel jPanelFK_IdMesDiaFeriado;
	public JButton jButtonFK_IdMesDiaFeriado;
	
	public JPanel jPanelid_anioFK_IdAnioDiaFeriado;
	public JLabel jLabelid_anioFK_IdAnioDiaFeriado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioDiaFeriado;
	public JButton jButtonid_anioFK_IdAnioDiaFeriado= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDiaFeriadoUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDiaFeriadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesDiaFeriado;
	public JLabel jLabelid_mesFK_IdMesDiaFeriado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesDiaFeriado;
	public JButton jButtonid_mesFK_IdMesDiaFeriado= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesDiaFeriadoUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesDiaFeriadoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DiaFeriadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaFeriadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaFeriadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaFeriadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDiaFeriado)	{
		this.jButtonRecargarInformacionDiaFeriado = jButtonRecargarInformacionDiaFeriado;
	}
	
	public JButton getjButtonProcesarInformacionDiaFeriado() {
		return this.jButtonProcesarInformacionDiaFeriado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDiaFeriado)	{
		this.jButtonProcesarInformacionDiaFeriado = jButtonProcesarInformacionDiaFeriado;
	}
	
	
	public JButton getjButtonRecargarInformacionDiaFeriado() {
		return this.jButtonRecargarInformacionDiaFeriado;
	}
	
	
	public List<DiaFeriado> getdiaferiados() {
		return this.diaferiados;
	}

	public void setdiaferiados(List<DiaFeriado> diaferiados) {
		this.diaferiados = diaferiados;
	}
	
	public List<DiaFeriado> getdiaferiadosAux() {
		return this.diaferiadosAux;
	}

	public void setdiaferiadosAux(List<DiaFeriado> diaferiadosAux) {
		this.diaferiadosAux = diaferiadosAux;
	}
	
	public List<DiaFeriado> getdiaferiadosEliminados() {
		return this.diaferiadosEliminados;
	}

	public void setDiaFeriadosEliminados(List<DiaFeriado> diaferiadosEliminados) {
		this.diaferiadosEliminados = diaferiadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDiaFeriado() {
		return jComboBoxTiposSeleccionarDiaFeriado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDiaFeriado(
			JComboBox jComboBoxTiposSeleccionarDiaFeriado) {
		this.jComboBoxTiposSeleccionarDiaFeriado = jComboBoxTiposSeleccionarDiaFeriado;
	}
	
	public void setBorderResaltarTiposSeleccionarDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDiaFeriado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDiaFeriado() {
		return jTextFieldValorCampoGeneralDiaFeriado;
	}

	public void setjTextFieldValorCampoGeneralDiaFeriado(
			JTextField jTextFieldValorCampoGeneralDiaFeriado) {
		this.jTextFieldValorCampoGeneralDiaFeriado = jTextFieldValorCampoGeneralDiaFeriado;
	}

	public void setBorderResaltarValorCampoGeneralDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDiaFeriado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDiaFeriado() {
		return this.jCheckBoxSeleccionarTodosDiaFeriado;
	}

	public void setjCheckBoxSeleccionarTodosDiaFeriado(
			JCheckBox jCheckBoxSeleccionarTodosDiaFeriado) {
		this.jCheckBoxSeleccionarTodosDiaFeriado = jCheckBoxSeleccionarTodosDiaFeriado;
	}

	public void setBorderResaltarSeleccionarTodosDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDiaFeriado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDiaFeriado() {
		return this.jCheckBoxSeleccionadosDiaFeriado;
	}

	public void setjCheckBoxSeleccionadosDiaFeriado(
			JCheckBox jCheckBoxSeleccionadosDiaFeriado) {
		this.jCheckBoxSeleccionadosDiaFeriado = jCheckBoxSeleccionadosDiaFeriado;
	}
	
	public void setBorderResaltarSeleccionadosDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDiaFeriado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDiaFeriado() {
		return this.jComboBoxTiposArchivosReportesDiaFeriado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDiaFeriado(
			JComboBox jComboBoxTiposArchivosReportesDiaFeriado) {
		this.jComboBoxTiposArchivosReportesDiaFeriado = jComboBoxTiposArchivosReportesDiaFeriado;
	}

	public void setBorderResaltarTiposArchivosReportesDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDiaFeriado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDiaFeriado() {
		return this.jComboBoxTiposReportesDiaFeriado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDiaFeriado(
			JComboBox jComboBoxTiposReportesDiaFeriado) {
		this.jComboBoxTiposReportesDiaFeriado = jComboBoxTiposReportesDiaFeriado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDiaFeriado() {
	//	return jComboBoxTiposReportesDinamicoDiaFeriado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDiaFeriado(
	//		JComboBox jComboBoxTiposReportesDinamicoDiaFeriado) {
	//	this.jComboBoxTiposReportesDinamicoDiaFeriado = jComboBoxTiposReportesDinamicoDiaFeriado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDiaFeriado() {
	//	return jComboBoxTiposArchivosReportesDinamicoDiaFeriado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDiaFeriado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDiaFeriado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDiaFeriado = jComboBoxTiposArchivosReportesDinamicoDiaFeriado;
	//}
	
	public void setBorderResaltarTiposReportesDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDiaFeriado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDiaFeriado() {
		return this.jComboBoxTiposGraficosReportesDiaFeriado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDiaFeriado(
			JComboBox jComboBoxTiposGraficosReportesDiaFeriado) {
		this.jComboBoxTiposGraficosReportesDiaFeriado = jComboBoxTiposGraficosReportesDiaFeriado;
	}
	
	public void setBorderResaltarTiposGraficosReportesDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDiaFeriado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDiaFeriado() {
		return this.jComboBoxTiposPaginacionDiaFeriado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDiaFeriado(
			JComboBox jComboBoxTiposPaginacionDiaFeriado) {
		this.jComboBoxTiposPaginacionDiaFeriado = jComboBoxTiposPaginacionDiaFeriado;
	}
	
	public void setBorderResaltarTiposPaginacionDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDiaFeriado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDiaFeriado() {
		return this.jComboBoxTiposRelacionesDiaFeriado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDiaFeriado() {
		return this.jComboBoxTiposAccionesDiaFeriado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDiaFeriado(
			JComboBox jComboBoxTiposRelacionesDiaFeriado) {
		this.jComboBoxTiposRelacionesDiaFeriado = jComboBoxTiposRelacionesDiaFeriado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDiaFeriado(
			JComboBox jComboBoxTiposAccionesDiaFeriado) {
		this.jComboBoxTiposAccionesDiaFeriado = jComboBoxTiposAccionesDiaFeriado;
	}
	
	public void setBorderResaltarTiposRelacionesDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDiaFeriado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDiaFeriado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDiaFeriado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDiaFeriado() {
	//	return jCheckBoxConGraficoDinamicoDiaFeriado;
	//}

	//public void setjCheckBoxConGraficoDinamicoDiaFeriado(
	//		JCheckBox jCheckBoxConGraficoDinamicoDiaFeriado) {
	//	this.jCheckBoxConGraficoDinamicoDiaFeriado = jCheckBoxConGraficoDinamicoDiaFeriado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDiaFeriado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDiaFeriado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDiaFeriado .setBorder(borderResaltar);		
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
		this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
		
		this.diaferiadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diaferiadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diaferiadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DiaFeriadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DiaFeriadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiaFeriadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiaFeriadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiaFeriadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dia Feriado MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
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
		
		DiaFeriadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DiaFeriado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDiaFeriado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"nuevo","nuevo","Nuevo"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"duplicar","duplicar","Duplicar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"copiar","copiar","Copiar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"ver_form","ver_form","Ver"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"recargar","recargar","Recargar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDiaFeriado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDiaFeriado,this.jTtoolBarDiaFeriado,
							"cerrar","cerrar","Salir"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDiaFeriado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDiaFeriado;
			
				this.jButtonProcesarInformacionToolBarDiaFeriado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDiaFeriado;
				
		//protected JButton jButtonModificarToolBarDiaFeriado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDiaFeriado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDiaFeriado=new JMenuMe("General");
		this.jmenuArchivoDiaFeriado=new JMenuMe("Archivo");
		this.jmenuAccionesDiaFeriado=new JMenuMe("Acciones");
		this.jmenuDatosDiaFeriado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDiaFeriado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDiaFeriado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDiaFeriado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDiaFeriado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDiaFeriado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDiaFeriado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDiaFeriado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDiaFeriado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDiaFeriado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDiaFeriado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDiaFeriado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDiaFeriado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDiaFeriado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDiaFeriado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDiaFeriado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDiaFeriado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDiaFeriado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDiaFeriado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDiaFeriado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDiaFeriado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDiaFeriado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDiaFeriado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDiaFeriado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDiaFeriado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDiaFeriado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDiaFeriado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDiaFeriado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDiaFeriado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDiaFeriado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDiaFeriado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDiaFeriado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDiaFeriado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDiaFeriado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDiaFeriado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDiaFeriado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDiaFeriado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDiaFeriado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDiaFeriado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDiaFeriado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDiaFeriado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDiaFeriado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDiaFeriado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDiaFeriado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDiaFeriado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDiaFeriado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDiaFeriado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDiaFeriado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDiaFeriado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDiaFeriado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDiaFeriado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDiaFeriado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDiaFeriado.add(this.jMenuItemCerrarDiaFeriado);
			
			this.jmenuAccionesDiaFeriado.add(this.jMenuItemNuevoDiaFeriado);
			this.jmenuAccionesDiaFeriado.add(this.jMenuItemNuevoGuardarCambiosDiaFeriado);
			this.jmenuAccionesDiaFeriado.add(this.jMenuItemNuevoRelacionesDiaFeriado);
			this.jmenuAccionesDiaFeriado.add(this.jMenuItemGuardarCambiosTablaDiaFeriado);		
			this.jmenuAccionesDiaFeriado.add(this.jMenuItemDuplicarDiaFeriado);		
			this.jmenuAccionesDiaFeriado.add(this.jMenuItemCopiarDiaFeriado);		
			this.jmenuAccionesDiaFeriado.add(this.jMenuItemVerFormDiaFeriado);		
			
			this.jmenuDatosDiaFeriado.add(this.jMenuItemRecargarInformacionDiaFeriado);				
			this.jmenuDatosDiaFeriado.add(this.jMenuItemAnterioresDiaFeriado);				
			this.jmenuDatosDiaFeriado.add(this.jMenuItemSiguientesDiaFeriado);				
			this.jmenuDatosDiaFeriado.add(this.jMenuItemAbrirOrderByDiaFeriado);				
			this.jmenuDatosDiaFeriado.add(this.jMenuItemMostrarOcultarDiaFeriado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDiaFeriado.add(this.jMenuItemGuardarCambiosDiaFeriado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDiaFeriado.add(this.jmenuArchivoDiaFeriado);		
			this.jmenuBarDiaFeriado.add(this.jmenuAccionesDiaFeriado);		
			this.jmenuBarDiaFeriado.add(this.jmenuDatosDiaFeriado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDiaFeriado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDiaFeriado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioDiaFeriado.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioDiaFeriado= new JButtonMe();
		this.jButtonFK_IdAnioDiaFeriado.setText("Buscar");
		this.jButtonFK_IdAnioDiaFeriado.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioDiaFeriado,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioDiaFeriado = new JLabelMe();
		jLabelid_anioFK_IdAnioDiaFeriado.setText("Anio :");
		jLabelid_anioFK_IdAnioDiaFeriado.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioDiaFeriado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioDiaFeriado= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioDiaFeriado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesDiaFeriado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesDiaFeriado.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesDiaFeriado= new JButtonMe();
		this.jButtonFK_IdMesDiaFeriado.setText("Buscar");
		this.jButtonFK_IdMesDiaFeriado.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesDiaFeriado,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesDiaFeriado = new JLabelMe();
		jLabelid_mesFK_IdMesDiaFeriado.setText("Mes :");
		jLabelid_mesFK_IdMesDiaFeriado.setToolTipText("Mes");
		jLabelid_mesFK_IdMesDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesDiaFeriado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesDiaFeriado= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesDiaFeriado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDiaFeriado=new JTabbedPane();


		this.jTabbedPaneBusquedasDiaFeriado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDiaFeriado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDiaFeriado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDiaFeriado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDiaFeriado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDiaFeriado = new DiaFeriadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dia Feriado DATOS");
			this.jInternalFrameDetalleFormDiaFeriado = new DiaFeriadoDetalleFormJInternalFrame(jDesktopPane,this.diaferiadoSessionBean.getConGuardarRelaciones(),this.diaferiadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDiaFeriado = null;//new DiaFeriadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDiaFeriado= new GridBagLayout();
		
		
		this.jTableDatosDiaFeriado = new JTableMe();      
		
		String sToolTipDiaFeriado="";
		sToolTipDiaFeriado=DiaFeriadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDiaFeriado+="(Nomina.DiaFeriado)";
		}
		
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDiaFeriado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDiaFeriado.setToolTipText(sToolTipDiaFeriado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDiaFeriado);
		this.jTableDatosDiaFeriado.setAutoCreateRowSorter(true);
		this.jTableDatosDiaFeriado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDiaFeriado.setRowSelectionAllowed(true);
		this.jTableDatosDiaFeriado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDiaFeriado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDiaFeriado = new JButtonMe();
		this.jButtonDuplicarDiaFeriado = new JButtonMe();
		this.jButtonCopiarDiaFeriado = new JButtonMe();
		this.jButtonVerFormDiaFeriado = new JButtonMe();
		this.jButtonNuevoRelacionesDiaFeriado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDiaFeriado = new JButtonMe();
		this.jButtonCerrarDiaFeriado = new JButtonMe();
		
		this.jScrollPanelDatosDiaFeriado = new JScrollPane();   
        this.jScrollPanelDatosGeneralDiaFeriado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dia Feriado";
		
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dia Feriados" + this.sPath));
		} else {
			this.jScrollPanelDatosDiaFeriado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDiaFeriado.setToolTipText("Acciones");
        this.jPanelAccionesDiaFeriado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDiaFeriado=new ReporteDinamicoJInternalFrame(DiaFeriadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDiaFeriado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDiaFeriado=new ImportacionJInternalFrame(DiaFeriadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDiaFeriado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDiaFeriado = new JButtonMe();
		
		this.jButtonAbrirOrderByDiaFeriado.setText("Orden");
		this.jButtonAbrirOrderByDiaFeriado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDiaFeriado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDiaFeriado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiaFeriado,false,this);
			
			//this.cargarOrderByDiaFeriado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDiaFeriado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiaFeriado,true,this);
			
			//this.cargarOrderByDiaFeriado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDiaFeriado.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosDiaFeriado.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosDiaFeriado.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosDiaFeriado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDiaFeriado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDiaFeriado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDiaFeriado.setText("Nuevo");
		this.jButtonDuplicarDiaFeriado.setText("Duplicar");
		this.jButtonCopiarDiaFeriado.setText("Copiar");
		this.jButtonVerFormDiaFeriado.setText("Ver");
		this.jButtonNuevoRelacionesDiaFeriado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDiaFeriado.setText("Guardar");
		this.jButtonCerrarDiaFeriado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDiaFeriado,"nuevo_button","Nuevo",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDiaFeriado,"duplicar_button","Duplicar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDiaFeriado,"copiar_button","Copiar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDiaFeriado,"ver_form","Ver",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDiaFeriado,"nuevorelaciones_button","Nuevo Rel",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDiaFeriado,"guardarcambiostabla_button","Guardar",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDiaFeriado,"cerrar_button","Salir",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDiaFeriado.setToolTipText("Nuevo"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDiaFeriado.setToolTipText("Duplicar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDiaFeriado.setToolTipText("Copiar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDiaFeriado.setToolTipText("Ver"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDiaFeriado.setToolTipText("Nuevo Rel"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDiaFeriado.setToolTipText("Guardar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDiaFeriado.setToolTipText("Salir"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDiaFeriado";
		inputMap = this.jButtonNuevoDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDiaFeriado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDiaFeriado"));
		
		//DUPLICAR
		sMapKey = "DuplicarDiaFeriado";
		inputMap = this.jButtonDuplicarDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDiaFeriado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDiaFeriado"));
		
		//COPIAR
		sMapKey = "CopiarDiaFeriado";
		inputMap = this.jButtonCopiarDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDiaFeriado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDiaFeriado"));
		
		//VEr FORM
		sMapKey = "VerFormDiaFeriado";
		inputMap = this.jButtonVerFormDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDiaFeriado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDiaFeriado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDiaFeriado";
		inputMap = this.jButtonNuevoRelacionesDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDiaFeriado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDiaFeriado";
		inputMap = this.jButtonModificarDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDiaFeriado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDiaFeriado";
		inputMap = this.jButtonCerrarDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDiaFeriado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDiaFeriado";
		inputMap = this.jButtonGuardarCambiosTablaDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDiaFeriado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DiaFeriado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DiaFeriado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DiaFeriado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DiaFeriado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DiaFeriado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDiaFeriado.setName("jPanelParametrosReportesDiaFeriado"); 
		
		this.jPanelParametrosReportesAccionesDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDiaFeriado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDiaFeriado.setName("jPanelParametrosReportesAccionesDiaFeriado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDiaFeriado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDiaFeriado = new JButtonMe();
		this.jButtonRecargarInformacionDiaFeriado.setText("Recargar");
		this.jButtonRecargarInformacionDiaFeriado.setToolTipText("Recargar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDiaFeriado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDiaFeriado = new JButtonMe();
		this.jButtonProcesarInformacionDiaFeriado.setText("Procesar");
		this.jButtonProcesarInformacionDiaFeriado.setToolTipText("Procesar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDiaFeriado.setVisible(false);
			
		this.jButtonProcesarInformacionDiaFeriado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDiaFeriado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDiaFeriado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiaFeriado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDiaFeriado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiaFeriado.setText("TIPO");       
		this.jComboBoxTiposReportesDiaFeriado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiaFeriado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDiaFeriado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDiaFeriado.setText("Paginacion");
		this.jComboBoxTiposPaginacionDiaFeriado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDiaFeriado.setText("Accion");
		this.jComboBoxTiposRelacionesDiaFeriado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDiaFeriado.setText("Accion");
		this.jComboBoxTiposAccionesDiaFeriado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDiaFeriado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDiaFeriado.setText("Accion");
		this.jComboBoxTiposSeleccionarDiaFeriado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDiaFeriado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDiaFeriado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDiaFeriado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDiaFeriado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDiaFeriado = new JLabelMe();
		
		this.jLabelAccionesDiaFeriado.setText("Acciones");		
		this.jLabelAccionesDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDiaFeriado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDiaFeriado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDiaFeriado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDiaFeriado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDiaFeriado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDiaFeriado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDiaFeriado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDiaFeriado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDiaFeriado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDiaFeriado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDiaFeriado.setText("Graf.");
		this.jCheckBoxConGraficoReporteDiaFeriado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDiaFeriado = new JButtonMe();
		//this.jButtonAnterioresDiaFeriado.setText("<<");
        this.jButtonAnterioresDiaFeriado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDiaFeriado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDiaFeriado = new JButtonMe();
		//this.jButtonSiguientesDiaFeriado.setText(">>");
        this.jButtonSiguientesDiaFeriado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDiaFeriado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDiaFeriado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDiaFeriado.setText("Nue");
        this.jButtonNuevoGuardarCambiosDiaFeriado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDiaFeriado,"nuevoguardarcambios_button","Nue",this.diaferiadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDiaFeriado";
		inputMap = this.jButtonNuevoGuardarCambiosDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDiaFeriado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDiaFeriado";
		inputMap = this.jButtonRecargarInformacionDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDiaFeriado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDiaFeriado";
		inputMap = this.jButtonSiguientesDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDiaFeriado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDiaFeriado";
		inputMap = this.jButtonAnterioresDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDiaFeriado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDiaFeriado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDiaFeriado.setMinimumSize(new Dimension(this.getWidth(),DiaFeriadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiaFeriadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDiaFeriado.setMaximumSize(new Dimension(this.getWidth(),DiaFeriadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiaFeriadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDiaFeriado.setPreferredSize(new Dimension(this.getWidth(),DiaFeriadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiaFeriadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDiaFeriado = new GridBagLayout();

			this.jPanelPaginacionDiaFeriado.setLayout(gridaBagLayoutPaginacionDiaFeriado);						
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = 0;
			this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDiaFeriado.add(this.jButtonAnterioresDiaFeriado, this.gridBagConstraintsDiaFeriado);
					
						
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDiaFeriado.gridy = 0;
			
			this.jPanelPaginacionDiaFeriado.add(this.jButtonNuevoGuardarCambiosDiaFeriado, this.gridBagConstraintsDiaFeriado);
						
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDiaFeriado.gridy = 0;
			this.jPanelPaginacionDiaFeriado.add(this.jButtonSiguientesDiaFeriado, this.gridBagConstraintsDiaFeriado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = 1;
			this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiaFeriado.add(this.jButtonNuevoDiaFeriado, this.gridBagConstraintsDiaFeriado);
						
			
			
			if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
				this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDiaFeriado.gridy = 1;
				this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDiaFeriado.add(this.jButtonGuardarCambiosTablaDiaFeriado, this.gridBagConstraintsDiaFeriado);
			}
			
			
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = 1;
			this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiaFeriado.add(this.jButtonDuplicarDiaFeriado, this.gridBagConstraintsDiaFeriado);
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = 1;
			this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiaFeriado.add(this.jButtonCopiarDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = 1;
			this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiaFeriado.add(this.jButtonVerFormDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = 1;
			this.gridBagConstraintsDiaFeriado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDiaFeriado.add(this.jButtonCerrarDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
		
		
		this.jButtonRecargarInformacionDiaFeriado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDiaFeriado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDiaFeriado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDiaFeriado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDiaFeriado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDiaFeriado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDiaFeriado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDiaFeriado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDiaFeriado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDiaFeriado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDiaFeriado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDiaFeriado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDiaFeriado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDiaFeriado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDiaFeriado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDiaFeriado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDiaFeriado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDiaFeriado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDiaFeriado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiaFeriado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiaFeriado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDiaFeriado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDiaFeriado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDiaFeriado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDiaFeriado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDiaFeriado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDiaFeriado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDiaFeriado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDiaFeriado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDiaFeriado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDiaFeriado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDiaFeriado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDiaFeriado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDiaFeriado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDiaFeriado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDiaFeriado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDiaFeriado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDiaFeriado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DiaFeriado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DiaFeriado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DiaFeriado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DiaFeriado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDiaFeriado.setLayout(gridaBagParametrosReportesDiaFeriado);
			this.jPanelParametrosReportesAccionesDiaFeriado.setLayout(gridaBagParametrosReportesAccionesDiaFeriado);
			
			
			this.jPanelParametrosAuxiliar1DiaFeriado.setLayout(gridaBagParametrosAuxiliar1DiaFeriado);
			this.jPanelParametrosAuxiliar2DiaFeriado.setLayout(gridaBagParametrosAuxiliar2DiaFeriado);
			this.jPanelParametrosAuxiliar3DiaFeriado.setLayout(gridaBagParametrosAuxiliar3DiaFeriado);
			this.jPanelParametrosAuxiliar4DiaFeriado.setLayout(gridaBagParametrosAuxiliar4DiaFeriado);
			//this.jPanelParametrosAuxiliar5DiaFeriado.setLayout(gridaBagParametrosAuxiliar2DiaFeriado);			
			
			
			
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiaFeriado.add(this.jButtonRecargarInformacionDiaFeriado, this.gridBagConstraintsDiaFeriado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiaFeriado.add(this.jComboBoxTiposPaginacionDiaFeriado, this.gridBagConstraintsDiaFeriado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiaFeriado.add(this.jCheckBoxConAltoMaximoTablaDiaFeriado, this.gridBagConstraintsDiaFeriado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiaFeriado.add(this.jComboBoxTiposArchivosReportesDiaFeriado, this.gridBagConstraintsDiaFeriado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiaFeriado.add(this.jPanelParametrosAuxiliar1DiaFeriado, this.gridBagConstraintsDiaFeriado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiaFeriado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DiaFeriado.add(this.jComboBoxTiposReportesDiaFeriado, this.gridBagConstraintsDiaFeriado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiaFeriado.add(this.jPanelParametrosAuxiliar4DiaFeriado, this.gridBagConstraintsDiaFeriado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiaFeriado.add(this.jComboBoxTiposReportesDiaFeriado, this.gridBagConstraintsDiaFeriado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiaFeriado.add(this.jCheckBoxGenerarReporteDiaFeriado, this.gridBagConstraintsDiaFeriado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiaFeriado.add(this.jPanelParametrosAuxiliar2DiaFeriado, this.gridBagConstraintsDiaFeriado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiaFeriado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiaFeriado.add(this.jLabelAccionesDiaFeriado, this.gridBagConstraintsDiaFeriado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
				this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDiaFeriado.add(this.jButtonAbrirOrderByDiaFeriado, this.gridBagConstraintsDiaFeriado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiaFeriado.add(this.jComboBoxTiposSeleccionarDiaFeriado, this.gridBagConstraintsDiaFeriado);			
			
			
			/*
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiaFeriado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiaFeriado.add(this.jCheckBoxSeleccionarTodosDiaFeriado, this.gridBagConstraintsDiaFeriado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiaFeriado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiaFeriado.add(this.jCheckBoxSeleccionarTodosDiaFeriado, this.gridBagConstraintsDiaFeriado);															
				
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiaFeriado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiaFeriado.add(this.jCheckBoxSeleccionadosDiaFeriado, this.gridBagConstraintsDiaFeriado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiaFeriado.add(this.jPanelParametrosAuxiliar3DiaFeriado, this.gridBagConstraintsDiaFeriado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiaFeriado.add(this.jComboBoxTiposAccionesDiaFeriado, this.gridBagConstraintsDiaFeriado);
	
				
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiaFeriado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiaFeriado.add(this.jTextFieldValorCampoGeneralDiaFeriado, this.gridBagConstraintsDiaFeriado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDiaFeriado = new GridBagLayout();

			this.jScrollPanelDatosDiaFeriado.setLayout(gridaBagLayoutDatosDiaFeriado);
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = 0;
			this.gridBagConstraintsDiaFeriado.gridx = 0;
			
			this.jScrollPanelDatosDiaFeriado.add(this.jTableDatosDiaFeriado, this.gridBagConstraintsDiaFeriado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDiaFeriado.setViewportView(this.jTableDatosDiaFeriado);
		this.jTableDatosDiaFeriado.setFillsViewportHeight(true);
		this.jTableDatosDiaFeriado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDiaFeriado= new GridBagLayout();
		this.jPanelAccionesDiaFeriado.setLayout(gridaBagLayoutAccionesDiaFeriado);
		
		
		/*	
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = 0;
		this.gridBagConstraintsDiaFeriado.gridx = 0;
			
		this.jPanelAccionesDiaFeriado.add(this.jButtonNuevoDiaFeriado, this.gridBagConstraintsDiaFeriado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioDiaFeriado= new GridBagLayout();
		gridaBagLayoutFK_IdAnioDiaFeriado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioDiaFeriado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioDiaFeriado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioDiaFeriado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioDiaFeriado.setLayout(gridaBagLayoutFK_IdAnioDiaFeriado);

		gridBagConstraintsDiaFeriado = new GridBagConstraints();
		gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiaFeriado.gridy = 0;
		gridBagConstraintsDiaFeriado.gridx = 0;
		jPanelFK_IdAnioDiaFeriado.add(jLabelid_anioFK_IdAnioDiaFeriado, gridBagConstraintsDiaFeriado);

		gridBagConstraintsDiaFeriado = new GridBagConstraints();
		gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiaFeriado.gridy = 0;
		gridBagConstraintsDiaFeriado.gridx = 1;
		jPanelFK_IdAnioDiaFeriado.add(jComboBoxid_anioFK_IdAnioDiaFeriado, gridBagConstraintsDiaFeriado);

		gridBagConstraintsDiaFeriado = new GridBagConstraints();
		gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiaFeriado.gridy = 1;
		gridBagConstraintsDiaFeriado.gridx =1;
		jPanelFK_IdAnioDiaFeriado.add(jButtonFK_IdAnioDiaFeriado, gridBagConstraintsDiaFeriado);

		jTabbedPaneBusquedasDiaFeriado.addTab("1.-Por Anio ", jPanelFK_IdAnioDiaFeriado);
		jTabbedPaneBusquedasDiaFeriado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMesDiaFeriado= new GridBagLayout();
		gridaBagLayoutFK_IdMesDiaFeriado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesDiaFeriado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesDiaFeriado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesDiaFeriado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesDiaFeriado.setLayout(gridaBagLayoutFK_IdMesDiaFeriado);

		gridBagConstraintsDiaFeriado = new GridBagConstraints();
		gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiaFeriado.gridy = 0;
		gridBagConstraintsDiaFeriado.gridx = 0;
		jPanelFK_IdMesDiaFeriado.add(jLabelid_mesFK_IdMesDiaFeriado, gridBagConstraintsDiaFeriado);

		gridBagConstraintsDiaFeriado = new GridBagConstraints();
		gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiaFeriado.gridy = 0;
		gridBagConstraintsDiaFeriado.gridx = 1;
		jPanelFK_IdMesDiaFeriado.add(jComboBoxid_mesFK_IdMesDiaFeriado, gridBagConstraintsDiaFeriado);

		gridBagConstraintsDiaFeriado = new GridBagConstraints();
		gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiaFeriado.gridy = 1;
		gridBagConstraintsDiaFeriado.gridx =1;
		jPanelFK_IdMesDiaFeriado.add(jButtonFK_IdMesDiaFeriado, gridBagConstraintsDiaFeriado);

		jTabbedPaneBusquedasDiaFeriado.addTab("2.-Por Mes ", jPanelFK_IdMesDiaFeriado);
		jTabbedPaneBusquedasDiaFeriado.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDiaFeriado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDiaFeriado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();						
			this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiaFeriado.gridx = 0;		
			//this.gridBagConstraintsDiaFeriado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDiaFeriado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDiaFeriado, this.gridBagConstraintsDiaFeriado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDiaFeriado.gridx = 0;		
		//this.gridBagConstraintsDiaFeriado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDiaFeriado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDiaFeriado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiaFeriado.gridx = 0;		
			this.gridBagConstraintsDiaFeriado.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDiaFeriado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDiaFeriado, this.gridBagConstraintsDiaFeriado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDiaFeriado, this.gridBagConstraintsDiaFeriado);								
		
		
		/*
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDiaFeriado, this.gridBagConstraintsDiaFeriado);
		*/		
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDiaFeriado.gridx =0;
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDiaFeriado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDiaFeriado, this.gridBagConstraintsDiaFeriado);
				
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDiaFeriado, this.gridBagConstraintsDiaFeriado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDiaFeriado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDiaFeriado = new GridBagLayout();
			this.jPanelBusquedasParametrosDiaFeriado.setLayout(gridaBagLayoutBusquedasParametrosDiaFeriado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDiaFeriado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDiaFeriado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiaFeriado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiaFeriado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDiaFeriado, this.gridBagConstraintsDiaFeriado);
			
			
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
			
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDiaFeriado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDiaFeriado, this.gridBagConstraintsDiaFeriado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDiaFeriado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDiaFeriado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDiaFeriado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDiaFeriado.setName("jPanelReporteDinamicoDiaFeriado"); 
		
		this.jPanelReporteDinamicoDiaFeriado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDiaFeriado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDiaFeriado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDiaFeriado.setLayout(gridaBagLayoutReporteDinamicoDiaFeriado);
		
		
		this.jInternalFrameReporteDinamicoDiaFeriado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDiaFeriado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiaFeriado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDiaFeriado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDiaFeriado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDiaFeriado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDiaFeriado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDiaFeriado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDiaFeriado.setResizable(true);
	    this.jInternalFrameReporteDinamicoDiaFeriado.setClosable(true);
	    this.jInternalFrameReporteDinamicoDiaFeriado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDiaFeriado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDiaFeriado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDiaFeriado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dia Feriados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDiaFeriado = new JLabelMe();

		this.jLabelColumnasSelectReporteDiaFeriado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiaFeriado.add(this.jLabelColumnasSelectReporteDiaFeriado, this.gridBagConstraintsDiaFeriado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDiaFeriado = new JList<Reporte>();
		this.jListColumnasSelectReporteDiaFeriado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDiaFeriado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDiaFeriado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDiaFeriado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDiaFeriado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDiaFeriado=new JScrollPane(this.jListColumnasSelectReporteDiaFeriado);
			
			this.jScrollColumnasSelectReporteDiaFeriado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDiaFeriado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDiaFeriado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDiaFeriado.add(this.jListColumnasSelectReporteDiaFeriado, this.gridBagConstraintsDiaFeriado);
		this.jPanelReporteDinamicoDiaFeriado.add(this.jScrollColumnasSelectReporteDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDiaFeriado = new JLabelMe();

		this.jLabelRelacionesSelectReporteDiaFeriado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDiaFeriado = new JList<Reporte>();
		this.jListRelacionesSelectReporteDiaFeriado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDiaFeriado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDiaFeriado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDiaFeriado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDiaFeriado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDiaFeriado=new JScrollPane(this.jListRelacionesSelectReporteDiaFeriado);
			
			this.jScrollRelacionesSelectReporteDiaFeriado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDiaFeriado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDiaFeriado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDiaFeriado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDiaFeriado = new JComboBoxMe();
		this.jListColumnasValoresGraficoDiaFeriado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDiaFeriado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDiaFeriado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDiaFeriado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDiaFeriado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDiaFeriado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDiaFeriado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDiaFeriado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDiaFeriado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDiaFeriado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDiaFeriado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDiaFeriado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDiaFeriado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiaFeriado.add(this.jLabelGenerarExcelReporteDinamicoDiaFeriado, this.gridBagConstraintsDiaFeriado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDiaFeriado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDiaFeriado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDiaFeriado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDiaFeriado.setToolTipText("Generar EXCEL"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		//this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDiaFeriado.add(this.jButtonGenerarExcelReporteDinamicoDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiaFeriado.add(this.jComboBoxTiposReportesDinamicoDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDiaFeriado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDiaFeriado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiaFeriado.add(this.jLabelTiposArchivoReporteDinamicoDiaFeriado, this.gridBagConstraintsDiaFeriado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiaFeriado.add(this.jComboBoxTiposArchivosReportesDinamicoDiaFeriado, this.gridBagConstraintsDiaFeriado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDiaFeriado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDiaFeriado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDiaFeriado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDiaFeriado.setToolTipText("Generar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiaFeriado.add(this.jButtonGenerarReporteDinamicoDiaFeriado, this.gridBagConstraintsDiaFeriado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDiaFeriado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDiaFeriado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDiaFeriado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDiaFeriado.setToolTipText("Cancelar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiaFeriado.add(this.jButtonCerrarReporteDinamicoDiaFeriado, this.gridBagConstraintsDiaFeriado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDiaFeriado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDiaFeriado= new JScrollPane(jPanelReporteDinamicoDiaFeriado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDiaFeriado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDiaFeriado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDiaFeriado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dia Feriados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDiaFeriado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDiaFeriado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDiaFeriado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDiaFeriado);
		this.jInternalFrameReporteDinamicoDiaFeriado.getContentPane().add(this.jScrollPanelReporteDinamicoDiaFeriado, this.gridBagConstraintsDiaFeriado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDiaFeriado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDiaFeriado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDiaFeriado.setName("jPanelImportacionDiaFeriado"); 
		
		this.jPanelImportacionDiaFeriado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDiaFeriado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDiaFeriado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDiaFeriado.setLayout(gridaBagLayoutImportacionDiaFeriado);
		
		
		this.jInternalFrameImportacionDiaFeriado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDiaFeriado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDiaFeriado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiaFeriado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDiaFeriado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDiaFeriado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDiaFeriado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDiaFeriado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDiaFeriado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDiaFeriado.setResizable(true);
	    this.jInternalFrameImportacionDiaFeriado.setClosable(true);
	    this.jInternalFrameImportacionDiaFeriado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDiaFeriado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDiaFeriado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDiaFeriado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDiaFeriado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDiaFeriado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDiaFeriado.setResizable(true);
	    this.jInternalFrameImportacionDiaFeriado.setClosable(true);
	    this.jInternalFrameImportacionDiaFeriado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDiaFeriado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDiaFeriado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDiaFeriado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dia Feriados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDiaFeriado = new JLabelMe();

		this.jLabelArchivoImportacionDiaFeriado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDiaFeriado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDiaFeriado.add(this.jLabelArchivoImportacionDiaFeriado, this.gridBagConstraintsDiaFeriado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDiaFeriado = new JFileChooser();		
		this.jFileChooserImportacionDiaFeriado.setToolTipText("ESCOGER ARCHIVO"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDiaFeriado = new JButtonMe();
		this.jButtonAbrirImportacionDiaFeriado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDiaFeriado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDiaFeriado.setToolTipText("Generar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYImportacion;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiaFeriado.add(this.jButtonAbrirImportacionDiaFeriado, this.gridBagConstraintsDiaFeriado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDiaFeriado = new JLabelMe();

		this.jLabelPathArchivoImportacionDiaFeriado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDiaFeriado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDiaFeriado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDiaFeriado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDiaFeriado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDiaFeriado.add(this.jLabelPathArchivoImportacionDiaFeriado, this.gridBagConstraintsDiaFeriado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDiaFeriado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDiaFeriado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDiaFeriado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDiaFeriado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYImportacion;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiaFeriado.add(this.jTextFieldPathArchivoImportacionDiaFeriado, this.gridBagConstraintsDiaFeriado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDiaFeriado = new JButtonMe();
		this.jButtonGenerarImportacionDiaFeriado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDiaFeriado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDiaFeriado.setToolTipText("Generar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYImportacion;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiaFeriado.add(this.jButtonGenerarImportacionDiaFeriado, this.gridBagConstraintsDiaFeriado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDiaFeriado = new JButtonMe();
		this.jButtonCerrarImportacionDiaFeriado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDiaFeriado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDiaFeriado.setToolTipText("Cancelar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiaFeriado.gridy = iPosYImportacion;
		this.gridBagConstraintsDiaFeriado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiaFeriado.add(this.jButtonCerrarImportacionDiaFeriado, this.gridBagConstraintsDiaFeriado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDiaFeriado = new GridBagLayout();
		
		this.jScrollPanelImportacionDiaFeriado= new JScrollPane(jPanelImportacionDiaFeriado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
		this.gridBagConstraintsDiaFeriado.gridy =iPosYImportacion;
		this.gridBagConstraintsDiaFeriado.gridx =iPosXImportacion;
		this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDiaFeriado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDiaFeriado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDiaFeriado);
		this.jInternalFrameImportacionDiaFeriado.getContentPane().add(this.jScrollPanelImportacionDiaFeriado, this.gridBagConstraintsDiaFeriado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDiaFeriado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDiaFeriado = new JButtonMe();
			this.jButtonAbrirOrderByDiaFeriado.setText("Orden");
			this.jButtonAbrirOrderByDiaFeriado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDiaFeriado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDiaFeriado";
			inputMap = this.jButtonAbrirOrderByDiaFeriado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDiaFeriado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDiaFeriado"));
		
		
			GridBagLayout gridaBagLayoutOrderByDiaFeriado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDiaFeriado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDiaFeriado.setName("jPanelOrderByDiaFeriado"); 
			
			this.jPanelOrderByDiaFeriado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDiaFeriado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDiaFeriado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDiaFeriado.setLayout(gridaBagLayoutOrderByDiaFeriado);
			
			
			this.jTableDatosDiaFeriadoOrderBy = new JTableMe();        
			this.jTableDatosDiaFeriadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDiaFeriadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDiaFeriadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDiaFeriadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDiaFeriadoOrderBy.setViewportView(this.jTableDatosDiaFeriadoOrderBy);
			this.jTableDatosDiaFeriadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDiaFeriadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDiaFeriado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDiaFeriado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDiaFeriado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDiaFeriado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDiaFeriado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDiaFeriado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDiaFeriado.setTitle("Orden");
			this.jInternalFrameOrderByDiaFeriado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDiaFeriado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDiaFeriado.setResizable(true);
			this.jInternalFrameOrderByDiaFeriado.setClosable(true);
			this.jInternalFrameOrderByDiaFeriado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDiaFeriado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDiaFeriado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDiaFeriado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDiaFeriado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dia Feriados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDiaFeriado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDiaFeriado.ipady =150;
				
			this.jPanelOrderByDiaFeriado.add(jScrollPanelDatosDiaFeriadoOrderBy, this.gridBagConstraintsDiaFeriado);//this.jTableDatosDiaFeriadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDiaFeriado = new JButtonMe();
			this.jButtonCerrarOrderByDiaFeriado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDiaFeriado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDiaFeriado.setToolTipText("Cancelar"+" "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDiaFeriado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiaFeriado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDiaFeriado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDiaFeriado.add(this.jButtonCerrarOrderByDiaFeriado, this.gridBagConstraintsDiaFeriado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDiaFeriado = new GridBagLayout();
			
			this.jScrollPanelOrderByDiaFeriado= new JScrollPane(jPanelOrderByDiaFeriado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDiaFeriado = new GridBagConstraints();
			this.gridBagConstraintsDiaFeriado.gridy =iPosYOrderBy;
			this.gridBagConstraintsDiaFeriado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDiaFeriado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDiaFeriado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDiaFeriado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDiaFeriado);
			
			this.jInternalFrameOrderByDiaFeriado.getContentPane().add(this.jScrollPanelOrderByDiaFeriado, this.gridBagConstraintsDiaFeriado);			
		
		} else {
			this.jButtonAbrirOrderByDiaFeriado = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.diaferiadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDiaFeriado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDiaFeriado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDiaFeriado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDiaFeriado.getRowHeight();//DiaFeriadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DiaFeriadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDiaFeriado.isSelected()) {
					iHeightTable=DiaFeriadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiaFeriadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiaFeriadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DiaFeriadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDiaFeriado.isSelected()) {
					iHeightTable=DiaFeriadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiaFeriadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiaFeriadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDiaFeriado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDiaFeriado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDiaFeriado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDiaFeriado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDiaFeriado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDiaFeriado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDiaFeriado!=null && this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy()!=null) {
			//if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDiaFeriado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDiaFeriado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDiaFeriado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDiaFeriado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDiaFeriado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDiaFeriado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=diaferiadoLogic.getDiaFeriados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diaferiados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DiaFeriado> TraerDiaFeriadoBeans(List<DiaFeriado> diaferiados,ArrayList<Classe> classes)throws Exception {
		try {
			for(DiaFeriado diaferiado:diaferiados) {
					
				if(!(DiaFeriadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DiaFeriadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					diaferiado.setsDetalleGeneralEntityReporte(DiaFeriadoConstantesFunciones.getDiaFeriadoDescripcion(diaferiado));
										
					diaferiado.setesta_activo_descripcion(DiaFeriadoConstantesFunciones.getesta_activoDescripcion(diaferiado));	
					
						
					
				} else  {
							
					//diaferiado.setsDetalleGeneralEntityReporte(diaferiado.getsDetalleGeneralEntityReporte());
										
				}
				
				//diaferiadobeans.add(diaferiadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return diaferiados;
    }
	//PARA REPORTES FIN
}
