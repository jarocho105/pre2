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
import com.bydan.erp.nomina.util.RangoDiaNomiConstantesFunciones;

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
public class RangoDiaNomiJInternalFrame extends RangoDiaNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRangoDiaNomi;
	
	protected JMenuBar jmenuBarRangoDiaNomi;
	
	protected JMenu jmenuRangoDiaNomi;
	protected JMenu jmenuDatosRangoDiaNomi;
	protected JMenu jmenuArchivoRangoDiaNomi;
	protected JMenu jmenuAccionesRangoDiaNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRangoDiaNomi;	
	protected GridBagConstraints gridBagConstraintsRangoDiaNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RangoDiaNomiDetalleFormJInternalFrame jInternalFrameDetalleFormRangoDiaNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRangoDiaNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRangoDiaNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public RangoDiaNomiSessionBean rangodianomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RangoDiaNomi> rangodianomis;		
	public List<RangoDiaNomi> rangodianomisEliminados;	
	public List<RangoDiaNomi> rangodianomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRangoDiaNomi;		
	protected JButton jButtonAbrirOrderByRangoDiaNomi;
	
	
	//protected JPanel jPanelOrderByRangoDiaNomi;
	//public JScrollPane jScrollPanelOrderByRangoDiaNomi;	
	//protected JButton jButtonCerrarOrderByRangoDiaNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RangoDiaNomiLogic rangodianomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRangoDiaNomi;
	public JScrollPane jScrollPanelDatosEdicionRangoDiaNomi;
	public JScrollPane jScrollPanelDatosGeneralRangoDiaNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosRangoDiaNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRangoDiaNomi;
	//public JScrollPane jScrollPanelImportacionRangoDiaNomi;
	
	
	
	protected JPanel jPanelAccionesRangoDiaNomi;
	
    protected JPanel jPanelPaginacionRangoDiaNomi;
    protected JPanel jPanelParametrosReportesRangoDiaNomi;
	protected JPanel jPanelParametrosReportesAccionesRangoDiaNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RangoDiaNomi;
	protected JPanel jPanelParametrosAuxiliar2RangoDiaNomi;
	protected JPanel jPanelParametrosAuxiliar3RangoDiaNomi;
	protected JPanel jPanelParametrosAuxiliar4RangoDiaNomi;
	//protected JPanel jPanelParametrosAuxiliar5RangoDiaNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoRangoDiaNomi;
	//protected JPanel jPanelImportacionRangoDiaNomi;
	
	
	public JTable jTableDatosRangoDiaNomi;
	
	
	
	//public JTable jTableDatosRangoDiaNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRangoDiaNomi;
	protected JButton jButtonDuplicarRangoDiaNomi;
	protected JButton jButtonCopiarRangoDiaNomi;
	protected JButton jButtonVerFormRangoDiaNomi;
	protected JButton jButtonNuevoRelacionesRangoDiaNomi;
	protected JButton jButtonModificarRangoDiaNomi;
	
    protected JButton jButtonGuardarCambiosTablaRangoDiaNomi;
	protected JButton jButtonCerrarRangoDiaNomi;
	
	
	protected JButton jButtonRecargarInformacionRangoDiaNomi;
	protected JButton jButtonProcesarInformacionRangoDiaNomi;
	
	
	protected JButton jButtonAnterioresRangoDiaNomi;
	protected JButton jButtonSiguientesRangoDiaNomi;
	protected JButton jButtonNuevoGuardarCambiosRangoDiaNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRangoDiaNomi;
	//protected JButton jButtonCerrarReporteDinamicoRangoDiaNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoRangoDiaNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionRangoDiaNomi;
	//protected JButton jButtonGenerarImportacionRangoDiaNomi;
	//protected JButton jButtonCerrarImportacionRangoDiaNomi;
	//protected JFileChooser jFileChooserImportacionRangoDiaNomi;
	//protected File fileImportacionRangoDiaNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRangoDiaNomi;
	protected JButton jButtonDuplicarToolBarRangoDiaNomi;
	protected JButton jButtonNuevoRelacionesToolBarRangoDiaNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarRangoDiaNomi;
	protected JButton jButtonCopiarToolBarRangoDiaNomi;
	protected JButton jButtonVerFormToolBarRangoDiaNomi;
	public JButton jButtonGuardarCambiosTablaToolBarRangoDiaNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarRangoDiaNomi;
	protected JButton jButtonCerrarToolBarRangoDiaNomi;
	
	protected JButton jButtonRecargarInformacionToolBarRangoDiaNomi;
	protected JButton jButtonProcesarInformacionToolBarRangoDiaNomi;
	protected JButton jButtonAnterioresToolBarRangoDiaNomi;
	protected JButton jButtonSiguientesToolBarRangoDiaNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarRangoDiaNomi;
	protected JButton jButtonAbrirOrderByToolBarRangoDiaNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRangoDiaNomi;
	protected JMenuItem jMenuItemDuplicarRangoDiaNomi;
	protected JMenuItem jMenuItemNuevoRelacionesRangoDiaNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRangoDiaNomi;
	protected JMenuItem jMenuItemCopiarRangoDiaNomi;
	protected JMenuItem jMenuItemVerFormRangoDiaNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaRangoDiaNomi;
	protected JMenuItem jMenuItemCerrarRangoDiaNomi;
	protected JMenuItem jMenuItemDetalleCerrarRangoDiaNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRangoDiaNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarRangoDiaNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionRangoDiaNomi;
	protected JMenuItem jMenuItemProcesarInformacionRangoDiaNomi;
	protected JMenuItem jMenuItemAnterioresRangoDiaNomi;
	protected JMenuItem jMenuItemSiguientesRangoDiaNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRangoDiaNomi;
	protected JMenuItem jMenuItemAbrirOrderByRangoDiaNomi;
	protected JMenuItem jMenuItemMostrarOcultarRangoDiaNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRangoDiaNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRangoDiaNomi;
	protected JCheckBox jCheckBoxSeleccionadosRangoDiaNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRangoDiaNomi;
	protected JCheckBox jCheckBoxConGraficoReporteRangoDiaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRangoDiaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRangoDiaNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRangoDiaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRangoDiaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRangoDiaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRangoDiaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRangoDiaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRangoDiaNomi;
	protected JTextField jTextFieldValorCampoGeneralRangoDiaNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRangoDiaNomi;
	//public JList<Reporte> jListColumnasSelectReporteRangoDiaNomi;
	//public JScrollPane jScrollColumnasSelectReporteRangoDiaNomi;
	
	//public JLabel jLabelRelacionesSelectReporteRangoDiaNomi;
	//public JList<Reporte> jListRelacionesSelectReporteRangoDiaNomi;
	//public JScrollPane jScrollRelacionesSelectReporteRangoDiaNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRangoDiaNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRangoDiaNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRangoDiaNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoRangoDiaNomi;
	
		
	//public JLabel jLabelArchivoImportacionRangoDiaNomi;	
	//public JLabel jLabelPathArchivoImportacionRangoDiaNomi;
	//protected JTextField jTextFieldPathArchivoImportacionRangoDiaNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRangoDiaNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRangoDiaNomi;
	
	//public JLabel jLabelColumnaCategoriaValorRangoDiaNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRangoDiaNomi;
	
	//public JLabel jLabelColumnasValoresGraficoRangoDiaNomi;
	//public JList<Reporte> jListColumnasValoresGraficoRangoDiaNomi;
	//public JScrollPane jScrollColumnasValoresGraficoRangoDiaNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRangoDiaNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRangoDiaNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRangoDiaNomi;
	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RangoDiaNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoDiaNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoDiaNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoDiaNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRangoDiaNomi)	{
		this.jButtonRecargarInformacionRangoDiaNomi = jButtonRecargarInformacionRangoDiaNomi;
	}
	
	public JButton getjButtonProcesarInformacionRangoDiaNomi() {
		return this.jButtonProcesarInformacionRangoDiaNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRangoDiaNomi)	{
		this.jButtonProcesarInformacionRangoDiaNomi = jButtonProcesarInformacionRangoDiaNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionRangoDiaNomi() {
		return this.jButtonRecargarInformacionRangoDiaNomi;
	}
	
	
	public List<RangoDiaNomi> getrangodianomis() {
		return this.rangodianomis;
	}

	public void setrangodianomis(List<RangoDiaNomi> rangodianomis) {
		this.rangodianomis = rangodianomis;
	}
	
	public List<RangoDiaNomi> getrangodianomisAux() {
		return this.rangodianomisAux;
	}

	public void setrangodianomisAux(List<RangoDiaNomi> rangodianomisAux) {
		this.rangodianomisAux = rangodianomisAux;
	}
	
	public List<RangoDiaNomi> getrangodianomisEliminados() {
		return this.rangodianomisEliminados;
	}

	public void setRangoDiaNomisEliminados(List<RangoDiaNomi> rangodianomisEliminados) {
		this.rangodianomisEliminados = rangodianomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRangoDiaNomi() {
		return jComboBoxTiposSeleccionarRangoDiaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRangoDiaNomi(
			JComboBox jComboBoxTiposSeleccionarRangoDiaNomi) {
		this.jComboBoxTiposSeleccionarRangoDiaNomi = jComboBoxTiposSeleccionarRangoDiaNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRangoDiaNomi() {
		return jTextFieldValorCampoGeneralRangoDiaNomi;
	}

	public void setjTextFieldValorCampoGeneralRangoDiaNomi(
			JTextField jTextFieldValorCampoGeneralRangoDiaNomi) {
		this.jTextFieldValorCampoGeneralRangoDiaNomi = jTextFieldValorCampoGeneralRangoDiaNomi;
	}

	public void setBorderResaltarValorCampoGeneralRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRangoDiaNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRangoDiaNomi() {
		return this.jCheckBoxSeleccionarTodosRangoDiaNomi;
	}

	public void setjCheckBoxSeleccionarTodosRangoDiaNomi(
			JCheckBox jCheckBoxSeleccionarTodosRangoDiaNomi) {
		this.jCheckBoxSeleccionarTodosRangoDiaNomi = jCheckBoxSeleccionarTodosRangoDiaNomi;
	}

	public void setBorderResaltarSeleccionarTodosRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRangoDiaNomi() {
		return this.jCheckBoxSeleccionadosRangoDiaNomi;
	}

	public void setjCheckBoxSeleccionadosRangoDiaNomi(
			JCheckBox jCheckBoxSeleccionadosRangoDiaNomi) {
		this.jCheckBoxSeleccionadosRangoDiaNomi = jCheckBoxSeleccionadosRangoDiaNomi;
	}
	
	public void setBorderResaltarSeleccionadosRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRangoDiaNomi() {
		return this.jComboBoxTiposArchivosReportesRangoDiaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRangoDiaNomi(
			JComboBox jComboBoxTiposArchivosReportesRangoDiaNomi) {
		this.jComboBoxTiposArchivosReportesRangoDiaNomi = jComboBoxTiposArchivosReportesRangoDiaNomi;
	}

	public void setBorderResaltarTiposArchivosReportesRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRangoDiaNomi() {
		return this.jComboBoxTiposReportesRangoDiaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRangoDiaNomi(
			JComboBox jComboBoxTiposReportesRangoDiaNomi) {
		this.jComboBoxTiposReportesRangoDiaNomi = jComboBoxTiposReportesRangoDiaNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRangoDiaNomi() {
	//	return jComboBoxTiposReportesDinamicoRangoDiaNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRangoDiaNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoRangoDiaNomi) {
	//	this.jComboBoxTiposReportesDinamicoRangoDiaNomi = jComboBoxTiposReportesDinamicoRangoDiaNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRangoDiaNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRangoDiaNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi = jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi;
	//}
	
	public void setBorderResaltarTiposReportesRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRangoDiaNomi() {
		return this.jComboBoxTiposGraficosReportesRangoDiaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRangoDiaNomi(
			JComboBox jComboBoxTiposGraficosReportesRangoDiaNomi) {
		this.jComboBoxTiposGraficosReportesRangoDiaNomi = jComboBoxTiposGraficosReportesRangoDiaNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRangoDiaNomi() {
		return this.jComboBoxTiposPaginacionRangoDiaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRangoDiaNomi(
			JComboBox jComboBoxTiposPaginacionRangoDiaNomi) {
		this.jComboBoxTiposPaginacionRangoDiaNomi = jComboBoxTiposPaginacionRangoDiaNomi;
	}
	
	public void setBorderResaltarTiposPaginacionRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRangoDiaNomi() {
		return this.jComboBoxTiposRelacionesRangoDiaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRangoDiaNomi() {
		return this.jComboBoxTiposAccionesRangoDiaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRangoDiaNomi(
			JComboBox jComboBoxTiposRelacionesRangoDiaNomi) {
		this.jComboBoxTiposRelacionesRangoDiaNomi = jComboBoxTiposRelacionesRangoDiaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRangoDiaNomi(
			JComboBox jComboBoxTiposAccionesRangoDiaNomi) {
		this.jComboBoxTiposAccionesRangoDiaNomi = jComboBoxTiposAccionesRangoDiaNomi;
	}
	
	public void setBorderResaltarTiposRelacionesRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRangoDiaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRangoDiaNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRangoDiaNomi() {
	//	return jCheckBoxConGraficoDinamicoRangoDiaNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoRangoDiaNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoRangoDiaNomi) {
	//	this.jCheckBoxConGraficoDinamicoRangoDiaNomi = jCheckBoxConGraficoDinamicoRangoDiaNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRangoDiaNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRangoDiaNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRangoDiaNomi .setBorder(borderResaltar);		
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
		this.rangodianomiSessionBean=new RangoDiaNomiSessionBean();
		
		this.rangodianomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rangodianomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rangodianomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RangoDiaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RangoDiaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RangoDiaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RangoDiaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RangoDiaNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rango Dia Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
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
		
		RangoDiaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRangoDiaNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"nuevo","nuevo","Nuevo"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"duplicar","duplicar","Duplicar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"copiar","copiar","Copiar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"ver_form","ver_form","Ver"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"recargar","recargar","Recargar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRangoDiaNomi,this.jTtoolBarRangoDiaNomi,
							"cerrar","cerrar","Salir"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRangoDiaNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRangoDiaNomi;
			
				this.jButtonProcesarInformacionToolBarRangoDiaNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRangoDiaNomi;
				
		//protected JButton jButtonModificarToolBarRangoDiaNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRangoDiaNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRangoDiaNomi=new JMenuMe("General");
		this.jmenuArchivoRangoDiaNomi=new JMenuMe("Archivo");
		this.jmenuAccionesRangoDiaNomi=new JMenuMe("Acciones");
		this.jmenuDatosRangoDiaNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRangoDiaNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRangoDiaNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRangoDiaNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRangoDiaNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRangoDiaNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRangoDiaNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRangoDiaNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRangoDiaNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRangoDiaNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRangoDiaNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRangoDiaNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRangoDiaNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRangoDiaNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRangoDiaNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRangoDiaNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRangoDiaNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRangoDiaNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRangoDiaNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRangoDiaNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRangoDiaNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRangoDiaNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRangoDiaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRangoDiaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRangoDiaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRangoDiaNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRangoDiaNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRangoDiaNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRangoDiaNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRangoDiaNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRangoDiaNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRangoDiaNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRangoDiaNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRangoDiaNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRangoDiaNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRangoDiaNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRangoDiaNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRangoDiaNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRangoDiaNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRangoDiaNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRangoDiaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRangoDiaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRangoDiaNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRangoDiaNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRangoDiaNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRangoDiaNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRangoDiaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRangoDiaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRangoDiaNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRangoDiaNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRangoDiaNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRangoDiaNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRangoDiaNomi.add(this.jMenuItemCerrarRangoDiaNomi);
			
			this.jmenuAccionesRangoDiaNomi.add(this.jMenuItemNuevoRangoDiaNomi);
			this.jmenuAccionesRangoDiaNomi.add(this.jMenuItemNuevoGuardarCambiosRangoDiaNomi);
			this.jmenuAccionesRangoDiaNomi.add(this.jMenuItemNuevoRelacionesRangoDiaNomi);
			this.jmenuAccionesRangoDiaNomi.add(this.jMenuItemGuardarCambiosTablaRangoDiaNomi);		
			this.jmenuAccionesRangoDiaNomi.add(this.jMenuItemDuplicarRangoDiaNomi);		
			this.jmenuAccionesRangoDiaNomi.add(this.jMenuItemCopiarRangoDiaNomi);		
			this.jmenuAccionesRangoDiaNomi.add(this.jMenuItemVerFormRangoDiaNomi);		
			
			this.jmenuDatosRangoDiaNomi.add(this.jMenuItemRecargarInformacionRangoDiaNomi);				
			this.jmenuDatosRangoDiaNomi.add(this.jMenuItemAnterioresRangoDiaNomi);				
			this.jmenuDatosRangoDiaNomi.add(this.jMenuItemSiguientesRangoDiaNomi);				
			this.jmenuDatosRangoDiaNomi.add(this.jMenuItemAbrirOrderByRangoDiaNomi);				
			this.jmenuDatosRangoDiaNomi.add(this.jMenuItemMostrarOcultarRangoDiaNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRangoDiaNomi.add(this.jMenuItemGuardarCambiosRangoDiaNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRangoDiaNomi.add(this.jmenuArchivoRangoDiaNomi);		
			this.jmenuBarRangoDiaNomi.add(this.jmenuAccionesRangoDiaNomi);		
			this.jmenuBarRangoDiaNomi.add(this.jmenuDatosRangoDiaNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRangoDiaNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRangoDiaNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasRangoDiaNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasRangoDiaNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRangoDiaNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRangoDiaNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRangoDiaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRangoDiaNomi = new RangoDiaNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Rango Dia Nomi DATOS");
			this.jInternalFrameDetalleFormRangoDiaNomi = new RangoDiaNomiDetalleFormJInternalFrame(jDesktopPane,this.rangodianomiSessionBean.getConGuardarRelaciones(),this.rangodianomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRangoDiaNomi = null;//new RangoDiaNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRangoDiaNomi= new GridBagLayout();
		
		
		this.jTableDatosRangoDiaNomi = new JTableMe();      
		
		String sToolTipRangoDiaNomi="";
		sToolTipRangoDiaNomi=RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRangoDiaNomi+="(Nomina.RangoDiaNomi)";
		}
		
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipRangoDiaNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRangoDiaNomi.setToolTipText(sToolTipRangoDiaNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRangoDiaNomi);
		this.jTableDatosRangoDiaNomi.setAutoCreateRowSorter(true);
		this.jTableDatosRangoDiaNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRangoDiaNomi.setRowSelectionAllowed(true);
		this.jTableDatosRangoDiaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRangoDiaNomi = new JButtonMe();
		this.jButtonDuplicarRangoDiaNomi = new JButtonMe();
		this.jButtonCopiarRangoDiaNomi = new JButtonMe();
		this.jButtonVerFormRangoDiaNomi = new JButtonMe();
		this.jButtonNuevoRelacionesRangoDiaNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRangoDiaNomi = new JButtonMe();
		this.jButtonCerrarRangoDiaNomi = new JButtonMe();
		
		this.jScrollPanelDatosRangoDiaNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralRangoDiaNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Rango Dia Nomi";
		
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Dia Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosRangoDiaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRangoDiaNomi.setToolTipText("Acciones");
        this.jPanelAccionesRangoDiaNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRangoDiaNomi=new ReporteDinamicoJInternalFrame(RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRangoDiaNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRangoDiaNomi=new ImportacionJInternalFrame(RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRangoDiaNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRangoDiaNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByRangoDiaNomi.setText("Orden");
		this.jButtonAbrirOrderByRangoDiaNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRangoDiaNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRangoDiaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRangoDiaNomi,false,this);
			
			//this.cargarOrderByRangoDiaNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRangoDiaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRangoDiaNomi,true,this);
			
			//this.cargarOrderByRangoDiaNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRangoDiaNomi.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosRangoDiaNomi.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosRangoDiaNomi.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosRangoDiaNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRangoDiaNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRangoDiaNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRangoDiaNomi.setText("Nuevo");
		this.jButtonDuplicarRangoDiaNomi.setText("Duplicar");
		this.jButtonCopiarRangoDiaNomi.setText("Copiar");
		this.jButtonVerFormRangoDiaNomi.setText("Ver");
		this.jButtonNuevoRelacionesRangoDiaNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRangoDiaNomi.setText("Guardar");
		this.jButtonCerrarRangoDiaNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRangoDiaNomi,"nuevo_button","Nuevo",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRangoDiaNomi,"duplicar_button","Duplicar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRangoDiaNomi,"copiar_button","Copiar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRangoDiaNomi,"ver_form","Ver",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRangoDiaNomi,"nuevorelaciones_button","Nuevo Rel",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRangoDiaNomi,"guardarcambiostabla_button","Guardar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRangoDiaNomi,"cerrar_button","Salir",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRangoDiaNomi.setToolTipText("Nuevo"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRangoDiaNomi.setToolTipText("Duplicar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRangoDiaNomi.setToolTipText("Copiar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRangoDiaNomi.setToolTipText("Ver"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRangoDiaNomi.setToolTipText("Nuevo Rel"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRangoDiaNomi.setToolTipText("Guardar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRangoDiaNomi.setToolTipText("Salir"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRangoDiaNomi";
		inputMap = this.jButtonNuevoRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRangoDiaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRangoDiaNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarRangoDiaNomi";
		inputMap = this.jButtonDuplicarRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRangoDiaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRangoDiaNomi"));
		
		//COPIAR
		sMapKey = "CopiarRangoDiaNomi";
		inputMap = this.jButtonCopiarRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRangoDiaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRangoDiaNomi"));
		
		//VEr FORM
		sMapKey = "VerFormRangoDiaNomi";
		inputMap = this.jButtonVerFormRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRangoDiaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRangoDiaNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRangoDiaNomi";
		inputMap = this.jButtonNuevoRelacionesRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRangoDiaNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRangoDiaNomi";
		inputMap = this.jButtonModificarRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRangoDiaNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRangoDiaNomi";
		inputMap = this.jButtonCerrarRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRangoDiaNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRangoDiaNomi";
		inputMap = this.jButtonGuardarCambiosTablaRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRangoDiaNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RangoDiaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RangoDiaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RangoDiaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RangoDiaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RangoDiaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRangoDiaNomi.setName("jPanelParametrosReportesRangoDiaNomi"); 
		
		this.jPanelParametrosReportesAccionesRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRangoDiaNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRangoDiaNomi.setName("jPanelParametrosReportesAccionesRangoDiaNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRangoDiaNomi = new JButtonMe();
		this.jButtonRecargarInformacionRangoDiaNomi.setText("Recargar");
		this.jButtonRecargarInformacionRangoDiaNomi.setToolTipText("Recargar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRangoDiaNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRangoDiaNomi = new JButtonMe();
		this.jButtonProcesarInformacionRangoDiaNomi.setText("Procesar");
		this.jButtonProcesarInformacionRangoDiaNomi.setToolTipText("Procesar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRangoDiaNomi.setVisible(false);
			
		this.jButtonProcesarInformacionRangoDiaNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRangoDiaNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRangoDiaNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRangoDiaNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRangoDiaNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRangoDiaNomi.setText("TIPO");       
		this.jComboBoxTiposReportesRangoDiaNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRangoDiaNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRangoDiaNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRangoDiaNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionRangoDiaNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRangoDiaNomi.setText("Accion");
		this.jComboBoxTiposRelacionesRangoDiaNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRangoDiaNomi.setText("Accion");
		this.jComboBoxTiposAccionesRangoDiaNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRangoDiaNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarRangoDiaNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRangoDiaNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRangoDiaNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRangoDiaNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRangoDiaNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRangoDiaNomi = new JLabelMe();
		
		this.jLabelAccionesRangoDiaNomi.setText("Acciones");		
		this.jLabelAccionesRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRangoDiaNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRangoDiaNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRangoDiaNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRangoDiaNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRangoDiaNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRangoDiaNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRangoDiaNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRangoDiaNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRangoDiaNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRangoDiaNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRangoDiaNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteRangoDiaNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRangoDiaNomi = new JButtonMe();
		//this.jButtonAnterioresRangoDiaNomi.setText("<<");
        this.jButtonAnterioresRangoDiaNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRangoDiaNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRangoDiaNomi = new JButtonMe();
		//this.jButtonSiguientesRangoDiaNomi.setText(">>");
        this.jButtonSiguientesRangoDiaNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRangoDiaNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRangoDiaNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRangoDiaNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosRangoDiaNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRangoDiaNomi,"nuevoguardarcambios_button","Nue",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRangoDiaNomi";
		inputMap = this.jButtonNuevoGuardarCambiosRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRangoDiaNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRangoDiaNomi";
		inputMap = this.jButtonRecargarInformacionRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRangoDiaNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRangoDiaNomi";
		inputMap = this.jButtonSiguientesRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRangoDiaNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRangoDiaNomi";
		inputMap = this.jButtonAnterioresRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRangoDiaNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRangoDiaNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRangoDiaNomi.setMinimumSize(new Dimension(this.getWidth(),RangoDiaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RangoDiaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRangoDiaNomi.setMaximumSize(new Dimension(this.getWidth(),RangoDiaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RangoDiaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRangoDiaNomi.setPreferredSize(new Dimension(this.getWidth(),RangoDiaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RangoDiaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRangoDiaNomi = new GridBagLayout();

			this.jPanelPaginacionRangoDiaNomi.setLayout(gridaBagLayoutPaginacionRangoDiaNomi);						
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = 0;
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRangoDiaNomi.add(this.jButtonAnterioresRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
					
						
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRangoDiaNomi.gridy = 0;
			
			this.jPanelPaginacionRangoDiaNomi.add(this.jButtonNuevoGuardarCambiosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
						
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRangoDiaNomi.gridy = 0;
			this.jPanelPaginacionRangoDiaNomi.add(this.jButtonSiguientesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = 1;
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRangoDiaNomi.add(this.jButtonNuevoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
						
			
			
			if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
				this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRangoDiaNomi.gridy = 1;
				this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRangoDiaNomi.add(this.jButtonGuardarCambiosTablaRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			}
			
			
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = 1;
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRangoDiaNomi.add(this.jButtonDuplicarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = 1;
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRangoDiaNomi.add(this.jButtonCopiarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = 1;
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRangoDiaNomi.add(this.jButtonVerFormRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = 1;
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRangoDiaNomi.add(this.jButtonCerrarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
		
		
		this.jButtonRecargarInformacionRangoDiaNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRangoDiaNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRangoDiaNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRangoDiaNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRangoDiaNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRangoDiaNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRangoDiaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRangoDiaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRangoDiaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRangoDiaNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRangoDiaNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRangoDiaNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRangoDiaNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRangoDiaNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRangoDiaNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRangoDiaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRangoDiaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRangoDiaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRangoDiaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRangoDiaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRangoDiaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRangoDiaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRangoDiaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRangoDiaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRangoDiaNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRangoDiaNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRangoDiaNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRangoDiaNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRangoDiaNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRangoDiaNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRangoDiaNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRangoDiaNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRangoDiaNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRangoDiaNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRangoDiaNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRangoDiaNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRangoDiaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRangoDiaNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RangoDiaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RangoDiaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RangoDiaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RangoDiaNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRangoDiaNomi.setLayout(gridaBagParametrosReportesRangoDiaNomi);
			this.jPanelParametrosReportesAccionesRangoDiaNomi.setLayout(gridaBagParametrosReportesAccionesRangoDiaNomi);
			
			
			this.jPanelParametrosAuxiliar1RangoDiaNomi.setLayout(gridaBagParametrosAuxiliar1RangoDiaNomi);
			this.jPanelParametrosAuxiliar2RangoDiaNomi.setLayout(gridaBagParametrosAuxiliar2RangoDiaNomi);
			this.jPanelParametrosAuxiliar3RangoDiaNomi.setLayout(gridaBagParametrosAuxiliar3RangoDiaNomi);
			this.jPanelParametrosAuxiliar4RangoDiaNomi.setLayout(gridaBagParametrosAuxiliar4RangoDiaNomi);
			//this.jPanelParametrosAuxiliar5RangoDiaNomi.setLayout(gridaBagParametrosAuxiliar2RangoDiaNomi);			
			
			
			
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jButtonRecargarInformacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RangoDiaNomi.add(this.jComboBoxTiposPaginacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RangoDiaNomi.add(this.jCheckBoxConAltoMaximoTablaRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RangoDiaNomi.add(this.jComboBoxTiposArchivosReportesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jPanelParametrosAuxiliar1RangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRangoDiaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RangoDiaNomi.add(this.jComboBoxTiposReportesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jPanelParametrosAuxiliar4RangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jComboBoxTiposReportesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jCheckBoxGenerarReporteRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jPanelParametrosAuxiliar2RangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRangoDiaNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jLabelAccionesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
				this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRangoDiaNomi.add(this.jButtonAbrirOrderByRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jComboBoxTiposSeleccionarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
			
			
			/*
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRangoDiaNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jCheckBoxSeleccionarTodosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRangoDiaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RangoDiaNomi.add(this.jCheckBoxSeleccionarTodosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);															
				
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRangoDiaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RangoDiaNomi.add(this.jCheckBoxSeleccionadosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jPanelParametrosAuxiliar3RangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jComboBoxTiposAccionesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
	
				
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoDiaNomi.add(this.jTextFieldValorCampoGeneralRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRangoDiaNomi = new GridBagLayout();

			this.jScrollPanelDatosRangoDiaNomi.setLayout(gridaBagLayoutDatosRangoDiaNomi);
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = 0;
			this.gridBagConstraintsRangoDiaNomi.gridx = 0;
			
			this.jScrollPanelDatosRangoDiaNomi.add(this.jTableDatosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRangoDiaNomi.setViewportView(this.jTableDatosRangoDiaNomi);
		this.jTableDatosRangoDiaNomi.setFillsViewportHeight(true);
		this.jTableDatosRangoDiaNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRangoDiaNomi= new GridBagLayout();
		this.jPanelAccionesRangoDiaNomi.setLayout(gridaBagLayoutAccionesRangoDiaNomi);
		
		
		/*	
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;
			
		this.jPanelAccionesRangoDiaNomi.add(this.jButtonNuevoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRangoDiaNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRangoDiaNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();						
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRangoDiaNomi.gridx = 0;		
			//this.gridBagConstraintsRangoDiaNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRangoDiaNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;		
		//this.gridBagConstraintsRangoDiaNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRangoDiaNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRangoDiaNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);								
		
		
		/*
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		*/		
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRangoDiaNomi.gridx =0;
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRangoDiaNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
				
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRangoDiaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRangoDiaNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosRangoDiaNomi.setLayout(gridaBagLayoutBusquedasParametrosRangoDiaNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRangoDiaNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRangoDiaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRangoDiaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRangoDiaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			
			
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
			
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRangoDiaNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRangoDiaNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRangoDiaNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRangoDiaNomi.setName("jPanelReporteDinamicoRangoDiaNomi"); 
		
		this.jPanelReporteDinamicoRangoDiaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRangoDiaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRangoDiaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRangoDiaNomi.setLayout(gridaBagLayoutReporteDinamicoRangoDiaNomi);
		
		
		this.jInternalFrameReporteDinamicoRangoDiaNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRangoDiaNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRangoDiaNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRangoDiaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRangoDiaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRangoDiaNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRangoDiaNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRangoDiaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRangoDiaNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoRangoDiaNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoRangoDiaNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRangoDiaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRangoDiaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRangoDiaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Dia Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRangoDiaNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteRangoDiaNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRangoDiaNomi.add(this.jLabelColumnasSelectReporteRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRangoDiaNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteRangoDiaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRangoDiaNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRangoDiaNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRangoDiaNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRangoDiaNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRangoDiaNomi=new JScrollPane(this.jListColumnasSelectReporteRangoDiaNomi);
			
			this.jScrollColumnasSelectReporteRangoDiaNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRangoDiaNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRangoDiaNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRangoDiaNomi.add(this.jListColumnasSelectReporteRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		this.jPanelReporteDinamicoRangoDiaNomi.add(this.jScrollColumnasSelectReporteRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRangoDiaNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteRangoDiaNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRangoDiaNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteRangoDiaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRangoDiaNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRangoDiaNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRangoDiaNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRangoDiaNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRangoDiaNomi=new JScrollPane(this.jListRelacionesSelectReporteRangoDiaNomi);
			
			this.jScrollRelacionesSelectReporteRangoDiaNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRangoDiaNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRangoDiaNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRangoDiaNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRangoDiaNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoRangoDiaNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRangoDiaNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRangoDiaNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRangoDiaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRangoDiaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRangoDiaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRangoDiaNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRangoDiaNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoDiaNomi.add(this.jLabelGenerarExcelReporteDinamicoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRangoDiaNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRangoDiaNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRangoDiaNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRangoDiaNomi.setToolTipText("Generar EXCEL"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		//this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRangoDiaNomi.add(this.jButtonGenerarExcelReporteDinamicoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRangoDiaNomi.add(this.jComboBoxTiposReportesDinamicoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRangoDiaNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRangoDiaNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoDiaNomi.add(this.jLabelTiposArchivoReporteDinamicoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRangoDiaNomi.add(this.jComboBoxTiposArchivosReportesDinamicoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRangoDiaNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRangoDiaNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRangoDiaNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRangoDiaNomi.setToolTipText("Generar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRangoDiaNomi.add(this.jButtonGenerarReporteDinamicoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRangoDiaNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRangoDiaNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRangoDiaNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRangoDiaNomi.setToolTipText("Cancelar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRangoDiaNomi.add(this.jButtonCerrarReporteDinamicoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRangoDiaNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRangoDiaNomi= new JScrollPane(jPanelReporteDinamicoRangoDiaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRangoDiaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRangoDiaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRangoDiaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Dia Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRangoDiaNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRangoDiaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRangoDiaNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRangoDiaNomi);
		this.jInternalFrameReporteDinamicoRangoDiaNomi.getContentPane().add(this.jScrollPanelReporteDinamicoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRangoDiaNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRangoDiaNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRangoDiaNomi.setName("jPanelImportacionRangoDiaNomi"); 
		
		this.jPanelImportacionRangoDiaNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRangoDiaNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRangoDiaNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRangoDiaNomi.setLayout(gridaBagLayoutImportacionRangoDiaNomi);
		
		
		this.jInternalFrameImportacionRangoDiaNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRangoDiaNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRangoDiaNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRangoDiaNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRangoDiaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRangoDiaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRangoDiaNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRangoDiaNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRangoDiaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRangoDiaNomi.setResizable(true);
	    this.jInternalFrameImportacionRangoDiaNomi.setClosable(true);
	    this.jInternalFrameImportacionRangoDiaNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRangoDiaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRangoDiaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRangoDiaNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRangoDiaNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRangoDiaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRangoDiaNomi.setResizable(true);
	    this.jInternalFrameImportacionRangoDiaNomi.setClosable(true);
	    this.jInternalFrameImportacionRangoDiaNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRangoDiaNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRangoDiaNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRangoDiaNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Dia Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRangoDiaNomi = new JLabelMe();

		this.jLabelArchivoImportacionRangoDiaNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRangoDiaNomi.add(this.jLabelArchivoImportacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRangoDiaNomi = new JFileChooser();		
		this.jFileChooserImportacionRangoDiaNomi.setToolTipText("ESCOGER ARCHIVO"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRangoDiaNomi = new JButtonMe();
		this.jButtonAbrirImportacionRangoDiaNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRangoDiaNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRangoDiaNomi.setToolTipText("Generar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRangoDiaNomi.add(this.jButtonAbrirImportacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRangoDiaNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionRangoDiaNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRangoDiaNomi.add(this.jLabelPathArchivoImportacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRangoDiaNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRangoDiaNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRangoDiaNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRangoDiaNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRangoDiaNomi.add(this.jTextFieldPathArchivoImportacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRangoDiaNomi = new JButtonMe();
		this.jButtonGenerarImportacionRangoDiaNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRangoDiaNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRangoDiaNomi.setToolTipText("Generar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRangoDiaNomi.add(this.jButtonGenerarImportacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRangoDiaNomi = new JButtonMe();
		this.jButtonCerrarImportacionRangoDiaNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRangoDiaNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRangoDiaNomi.setToolTipText("Cancelar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRangoDiaNomi.add(this.jButtonCerrarImportacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRangoDiaNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionRangoDiaNomi= new JScrollPane(jPanelImportacionRangoDiaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsRangoDiaNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRangoDiaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRangoDiaNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRangoDiaNomi);
		this.jInternalFrameImportacionRangoDiaNomi.getContentPane().add(this.jScrollPanelImportacionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRangoDiaNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRangoDiaNomi = new JButtonMe();
			this.jButtonAbrirOrderByRangoDiaNomi.setText("Orden");
			this.jButtonAbrirOrderByRangoDiaNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRangoDiaNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRangoDiaNomi";
			inputMap = this.jButtonAbrirOrderByRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRangoDiaNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByRangoDiaNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRangoDiaNomi.setName("jPanelOrderByRangoDiaNomi"); 
			
			this.jPanelOrderByRangoDiaNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRangoDiaNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRangoDiaNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRangoDiaNomi.setLayout(gridaBagLayoutOrderByRangoDiaNomi);
			
			
			this.jTableDatosRangoDiaNomiOrderBy = new JTableMe();        
			this.jTableDatosRangoDiaNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRangoDiaNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRangoDiaNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRangoDiaNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRangoDiaNomiOrderBy.setViewportView(this.jTableDatosRangoDiaNomiOrderBy);
			this.jTableDatosRangoDiaNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRangoDiaNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRangoDiaNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRangoDiaNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRangoDiaNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRangoDiaNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRangoDiaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRangoDiaNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRangoDiaNomi.setTitle("Orden");
			this.jInternalFrameOrderByRangoDiaNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRangoDiaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRangoDiaNomi.setResizable(true);
			this.jInternalFrameOrderByRangoDiaNomi.setClosable(true);
			this.jInternalFrameOrderByRangoDiaNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRangoDiaNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRangoDiaNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRangoDiaNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Dia Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRangoDiaNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRangoDiaNomi.ipady =150;
				
			this.jPanelOrderByRangoDiaNomi.add(jScrollPanelDatosRangoDiaNomiOrderBy, this.gridBagConstraintsRangoDiaNomi);//this.jTableDatosRangoDiaNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRangoDiaNomi = new JButtonMe();
			this.jButtonCerrarOrderByRangoDiaNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRangoDiaNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRangoDiaNomi.setToolTipText("Cancelar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRangoDiaNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRangoDiaNomi.add(this.jButtonCerrarOrderByRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRangoDiaNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByRangoDiaNomi= new JScrollPane(jPanelOrderByRangoDiaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsRangoDiaNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRangoDiaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRangoDiaNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRangoDiaNomi);
			
			this.jInternalFrameOrderByRangoDiaNomi.getContentPane().add(this.jScrollPanelOrderByRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
		
		} else {
			this.jButtonAbrirOrderByRangoDiaNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.rangodianomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRangoDiaNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRangoDiaNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRangoDiaNomi.getRowHeight();//RangoDiaNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RangoDiaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRangoDiaNomi.isSelected()) {
					iHeightTable=RangoDiaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RangoDiaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RangoDiaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RangoDiaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRangoDiaNomi.isSelected()) {
					iHeightTable=RangoDiaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RangoDiaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RangoDiaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRangoDiaNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRangoDiaNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRangoDiaNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRangoDiaNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRangoDiaNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRangoDiaNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRangoDiaNomi!=null && this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRangoDiaNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRangoDiaNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRangoDiaNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRangoDiaNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRangoDiaNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRangoDiaNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=rangodianomiLogic.getRangoDiaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rangodianomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RangoDiaNomi> TraerRangoDiaNomiBeans(List<RangoDiaNomi> rangodianomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(RangoDiaNomi rangodianomi:rangodianomis) {
					
				if(!(RangoDiaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RangoDiaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rangodianomi.setsDetalleGeneralEntityReporte(RangoDiaNomiConstantesFunciones.getRangoDiaNomiDescripcion(rangodianomi));
										
						
					
						
					
				} else  {
							
					//rangodianomi.setsDetalleGeneralEntityReporte(rangodianomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//rangodianomibeans.add(rangodianomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rangodianomis;
    }
	//PARA REPORTES FIN
}
