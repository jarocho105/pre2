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
import com.bydan.erp.cartera.util.RadioVenciProveConstantesFunciones;

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
public class RadioVenciProveJInternalFrame extends RadioVenciProveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRadioVenciProve;
	
	protected JMenuBar jmenuBarRadioVenciProve;
	
	protected JMenu jmenuRadioVenciProve;
	protected JMenu jmenuDatosRadioVenciProve;
	protected JMenu jmenuArchivoRadioVenciProve;
	protected JMenu jmenuAccionesRadioVenciProve;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRadioVenciProve;	
	protected GridBagConstraints gridBagConstraintsRadioVenciProve;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RadioVenciProveDetalleFormJInternalFrame jInternalFrameDetalleFormRadioVenciProve;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRadioVenciProve;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRadioVenciProve;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoRadioVenciBeanSwingJInternalFrame tiporadiovenciBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporadiovenci="";
	
	public RadioVenciProveSessionBean radiovenciproveSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoRadioVenciSessionBean tiporadiovenciSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RadioVenciProve> radiovenciproves;		
	public List<RadioVenciProve> radiovenciprovesEliminados;	
	public List<RadioVenciProve> radiovenciprovesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRadioVenciProve;		
	protected JButton jButtonAbrirOrderByRadioVenciProve;
	
	
	//protected JPanel jPanelOrderByRadioVenciProve;
	//public JScrollPane jScrollPanelOrderByRadioVenciProve;	
	//protected JButton jButtonCerrarOrderByRadioVenciProve;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RadioVenciProveLogic radiovenciproveLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRadioVenciProve;
	public JScrollPane jScrollPanelDatosEdicionRadioVenciProve;
	public JScrollPane jScrollPanelDatosGeneralRadioVenciProve;
    
	
	
	//public JScrollPane jScrollPanelDatosRadioVenciProveOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRadioVenciProve;
	//public JScrollPane jScrollPanelImportacionRadioVenciProve;
	
	
	
	protected JPanel jPanelAccionesRadioVenciProve;
	
    protected JPanel jPanelPaginacionRadioVenciProve;
    protected JPanel jPanelParametrosReportesRadioVenciProve;
	protected JPanel jPanelParametrosReportesAccionesRadioVenciProve;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RadioVenciProve;
	protected JPanel jPanelParametrosAuxiliar2RadioVenciProve;
	protected JPanel jPanelParametrosAuxiliar3RadioVenciProve;
	protected JPanel jPanelParametrosAuxiliar4RadioVenciProve;
	//protected JPanel jPanelParametrosAuxiliar5RadioVenciProve;
	
	
	
	//protected JPanel jPanelReporteDinamicoRadioVenciProve;
	//protected JPanel jPanelImportacionRadioVenciProve;
	
	
	public JTable jTableDatosRadioVenciProve;
	
	
	
	//public JTable jTableDatosRadioVenciProveOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRadioVenciProve;
	protected JButton jButtonDuplicarRadioVenciProve;
	protected JButton jButtonCopiarRadioVenciProve;
	protected JButton jButtonVerFormRadioVenciProve;
	protected JButton jButtonNuevoRelacionesRadioVenciProve;
	protected JButton jButtonModificarRadioVenciProve;
	
    protected JButton jButtonGuardarCambiosTablaRadioVenciProve;
	protected JButton jButtonCerrarRadioVenciProve;
	
	
	protected JButton jButtonRecargarInformacionRadioVenciProve;
	protected JButton jButtonProcesarInformacionRadioVenciProve;
	
	
	protected JButton jButtonAnterioresRadioVenciProve;
	protected JButton jButtonSiguientesRadioVenciProve;
	protected JButton jButtonNuevoGuardarCambiosRadioVenciProve;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRadioVenciProve;
	//protected JButton jButtonCerrarReporteDinamicoRadioVenciProve;
	//protected JButton jButtonGenerarExcelReporteDinamicoRadioVenciProve;	
	
	
	
	//protected JButton jButtonAbrirImportacionRadioVenciProve;
	//protected JButton jButtonGenerarImportacionRadioVenciProve;
	//protected JButton jButtonCerrarImportacionRadioVenciProve;
	//protected JFileChooser jFileChooserImportacionRadioVenciProve;
	//protected File fileImportacionRadioVenciProve;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRadioVenciProve;
	protected JButton jButtonDuplicarToolBarRadioVenciProve;
	protected JButton jButtonNuevoRelacionesToolBarRadioVenciProve;
	
	
	public JButton jButtonGuardarCambiosToolBarRadioVenciProve;
	protected JButton jButtonCopiarToolBarRadioVenciProve;
	protected JButton jButtonVerFormToolBarRadioVenciProve;
	public JButton jButtonGuardarCambiosTablaToolBarRadioVenciProve;
	protected JButton jButtonMostrarOcultarTablaToolBarRadioVenciProve;
	protected JButton jButtonCerrarToolBarRadioVenciProve;
	
	protected JButton jButtonRecargarInformacionToolBarRadioVenciProve;
	protected JButton jButtonProcesarInformacionToolBarRadioVenciProve;
	protected JButton jButtonAnterioresToolBarRadioVenciProve;
	protected JButton jButtonSiguientesToolBarRadioVenciProve;
	protected JButton jButtonNuevoGuardarCambiosToolBarRadioVenciProve;
	protected JButton jButtonAbrirOrderByToolBarRadioVenciProve;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRadioVenciProve;
	protected JMenuItem jMenuItemDuplicarRadioVenciProve;
	protected JMenuItem jMenuItemNuevoRelacionesRadioVenciProve;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRadioVenciProve;
	protected JMenuItem jMenuItemCopiarRadioVenciProve;
	protected JMenuItem jMenuItemVerFormRadioVenciProve;
	protected JMenuItem jMenuItemGuardarCambiosTablaRadioVenciProve;
	protected JMenuItem jMenuItemCerrarRadioVenciProve;
	protected JMenuItem jMenuItemDetalleCerrarRadioVenciProve;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRadioVenciProve;
	protected JMenuItem jMenuItemDetalleMostarOcultarRadioVenciProve;
	
	protected JMenuItem jMenuItemRecargarInformacionRadioVenciProve;
	protected JMenuItem jMenuItemProcesarInformacionRadioVenciProve;
	protected JMenuItem jMenuItemAnterioresRadioVenciProve;
	protected JMenuItem jMenuItemSiguientesRadioVenciProve;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRadioVenciProve;
	protected JMenuItem jMenuItemAbrirOrderByRadioVenciProve;
	protected JMenuItem jMenuItemMostrarOcultarRadioVenciProve;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRadioVenciProve;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRadioVenciProve;
	protected JCheckBox jCheckBoxSeleccionadosRadioVenciProve;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRadioVenciProve;
	protected JCheckBox jCheckBoxConGraficoReporteRadioVenciProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRadioVenciProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRadioVenciProve;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRadioVenciProve;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRadioVenciProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRadioVenciProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRadioVenciProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRadioVenciProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRadioVenciProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRadioVenciProve;
	protected JTextField jTextFieldValorCampoGeneralRadioVenciProve;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRadioVenciProve;
	//public JList<Reporte> jListColumnasSelectReporteRadioVenciProve;
	//public JScrollPane jScrollColumnasSelectReporteRadioVenciProve;
	
	//public JLabel jLabelRelacionesSelectReporteRadioVenciProve;
	//public JList<Reporte> jListRelacionesSelectReporteRadioVenciProve;
	//public JScrollPane jScrollRelacionesSelectReporteRadioVenciProve;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRadioVenciProve;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRadioVenciProve;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRadioVenciProve;
	//public JLabel jLabelTiposArchivoReporteDinamicoRadioVenciProve;
	
		
	//public JLabel jLabelArchivoImportacionRadioVenciProve;	
	//public JLabel jLabelPathArchivoImportacionRadioVenciProve;
	//protected JTextField jTextFieldPathArchivoImportacionRadioVenciProve;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRadioVenciProve;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRadioVenciProve;
	
	//public JLabel jLabelColumnaCategoriaValorRadioVenciProve;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRadioVenciProve;
	
	//public JLabel jLabelColumnasValoresGraficoRadioVenciProve;
	//public JList<Reporte> jListColumnasValoresGraficoRadioVenciProve;
	//public JScrollPane jScrollColumnasValoresGraficoRadioVenciProve;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRadioVenciProve;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRadioVenciProve;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRadioVenciProve;
	public JPanel jPanelFK_IdTipoRadioVenciRadioVenciProve;
	public JButton jButtonFK_IdTipoRadioVenciRadioVenciProve;
	
	public JPanel jPanelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve;
	public JLabel jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve;
	public JButton jButtonid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve= new JButtonMe();
	public JButton jButtonid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProveUpdate= new JButtonMe();
	public JButton jButtonid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProveBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RadioVenciProveJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciProveJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciProveJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciProveJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRadioVenciProve)	{
		this.jButtonRecargarInformacionRadioVenciProve = jButtonRecargarInformacionRadioVenciProve;
	}
	
	public JButton getjButtonProcesarInformacionRadioVenciProve() {
		return this.jButtonProcesarInformacionRadioVenciProve;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRadioVenciProve)	{
		this.jButtonProcesarInformacionRadioVenciProve = jButtonProcesarInformacionRadioVenciProve;
	}
	
	
	public JButton getjButtonRecargarInformacionRadioVenciProve() {
		return this.jButtonRecargarInformacionRadioVenciProve;
	}
	
	
	public List<RadioVenciProve> getradiovenciproves() {
		return this.radiovenciproves;
	}

	public void setradiovenciproves(List<RadioVenciProve> radiovenciproves) {
		this.radiovenciproves = radiovenciproves;
	}
	
	public List<RadioVenciProve> getradiovenciprovesAux() {
		return this.radiovenciprovesAux;
	}

	public void setradiovenciprovesAux(List<RadioVenciProve> radiovenciprovesAux) {
		this.radiovenciprovesAux = radiovenciprovesAux;
	}
	
	public List<RadioVenciProve> getradiovenciprovesEliminados() {
		return this.radiovenciprovesEliminados;
	}

	public void setRadioVenciProvesEliminados(List<RadioVenciProve> radiovenciprovesEliminados) {
		this.radiovenciprovesEliminados = radiovenciprovesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRadioVenciProve() {
		return jComboBoxTiposSeleccionarRadioVenciProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRadioVenciProve(
			JComboBox jComboBoxTiposSeleccionarRadioVenciProve) {
		this.jComboBoxTiposSeleccionarRadioVenciProve = jComboBoxTiposSeleccionarRadioVenciProve;
	}
	
	public void setBorderResaltarTiposSeleccionarRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRadioVenciProve .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRadioVenciProve() {
		return jTextFieldValorCampoGeneralRadioVenciProve;
	}

	public void setjTextFieldValorCampoGeneralRadioVenciProve(
			JTextField jTextFieldValorCampoGeneralRadioVenciProve) {
		this.jTextFieldValorCampoGeneralRadioVenciProve = jTextFieldValorCampoGeneralRadioVenciProve;
	}

	public void setBorderResaltarValorCampoGeneralRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRadioVenciProve .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRadioVenciProve() {
		return this.jCheckBoxSeleccionarTodosRadioVenciProve;
	}

	public void setjCheckBoxSeleccionarTodosRadioVenciProve(
			JCheckBox jCheckBoxSeleccionarTodosRadioVenciProve) {
		this.jCheckBoxSeleccionarTodosRadioVenciProve = jCheckBoxSeleccionarTodosRadioVenciProve;
	}

	public void setBorderResaltarSeleccionarTodosRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRadioVenciProve .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRadioVenciProve() {
		return this.jCheckBoxSeleccionadosRadioVenciProve;
	}

	public void setjCheckBoxSeleccionadosRadioVenciProve(
			JCheckBox jCheckBoxSeleccionadosRadioVenciProve) {
		this.jCheckBoxSeleccionadosRadioVenciProve = jCheckBoxSeleccionadosRadioVenciProve;
	}
	
	public void setBorderResaltarSeleccionadosRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRadioVenciProve .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRadioVenciProve() {
		return this.jComboBoxTiposArchivosReportesRadioVenciProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRadioVenciProve(
			JComboBox jComboBoxTiposArchivosReportesRadioVenciProve) {
		this.jComboBoxTiposArchivosReportesRadioVenciProve = jComboBoxTiposArchivosReportesRadioVenciProve;
	}

	public void setBorderResaltarTiposArchivosReportesRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRadioVenciProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRadioVenciProve() {
		return this.jComboBoxTiposReportesRadioVenciProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRadioVenciProve(
			JComboBox jComboBoxTiposReportesRadioVenciProve) {
		this.jComboBoxTiposReportesRadioVenciProve = jComboBoxTiposReportesRadioVenciProve;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRadioVenciProve() {
	//	return jComboBoxTiposReportesDinamicoRadioVenciProve;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRadioVenciProve(
	//		JComboBox jComboBoxTiposReportesDinamicoRadioVenciProve) {
	//	this.jComboBoxTiposReportesDinamicoRadioVenciProve = jComboBoxTiposReportesDinamicoRadioVenciProve;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRadioVenciProve() {
	//	return jComboBoxTiposArchivosReportesDinamicoRadioVenciProve;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRadioVenciProve(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRadioVenciProve) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRadioVenciProve = jComboBoxTiposArchivosReportesDinamicoRadioVenciProve;
	//}
	
	public void setBorderResaltarTiposReportesRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRadioVenciProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRadioVenciProve() {
		return this.jComboBoxTiposGraficosReportesRadioVenciProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRadioVenciProve(
			JComboBox jComboBoxTiposGraficosReportesRadioVenciProve) {
		this.jComboBoxTiposGraficosReportesRadioVenciProve = jComboBoxTiposGraficosReportesRadioVenciProve;
	}
	
	public void setBorderResaltarTiposGraficosReportesRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRadioVenciProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRadioVenciProve() {
		return this.jComboBoxTiposPaginacionRadioVenciProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRadioVenciProve(
			JComboBox jComboBoxTiposPaginacionRadioVenciProve) {
		this.jComboBoxTiposPaginacionRadioVenciProve = jComboBoxTiposPaginacionRadioVenciProve;
	}
	
	public void setBorderResaltarTiposPaginacionRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRadioVenciProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRadioVenciProve() {
		return this.jComboBoxTiposRelacionesRadioVenciProve;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRadioVenciProve() {
		return this.jComboBoxTiposAccionesRadioVenciProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRadioVenciProve(
			JComboBox jComboBoxTiposRelacionesRadioVenciProve) {
		this.jComboBoxTiposRelacionesRadioVenciProve = jComboBoxTiposRelacionesRadioVenciProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRadioVenciProve(
			JComboBox jComboBoxTiposAccionesRadioVenciProve) {
		this.jComboBoxTiposAccionesRadioVenciProve = jComboBoxTiposAccionesRadioVenciProve;
	}
	
	public void setBorderResaltarTiposRelacionesRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRadioVenciProve .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRadioVenciProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRadioVenciProve .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRadioVenciProve() {
	//	return jCheckBoxConGraficoDinamicoRadioVenciProve;
	//}

	//public void setjCheckBoxConGraficoDinamicoRadioVenciProve(
	//		JCheckBox jCheckBoxConGraficoDinamicoRadioVenciProve) {
	//	this.jCheckBoxConGraficoDinamicoRadioVenciProve = jCheckBoxConGraficoDinamicoRadioVenciProve;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRadioVenciProve() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRadioVenciProve.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRadioVenciProve .setBorder(borderResaltar);		
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
		this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
		
		this.radiovenciproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.radiovenciproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.radiovenciproveSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RadioVenciProveJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RadioVenciProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RadioVenciProveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RadioVenciProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RadioVenciProveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dias Vencidos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
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
		
		RadioVenciProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRadioVenciProve= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"nuevo","nuevo","Nuevo"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"duplicar","duplicar","Duplicar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"copiar","copiar","Copiar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"ver_form","ver_form","Ver"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"recargar","recargar","Recargar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRadioVenciProve,this.jTtoolBarRadioVenciProve,
							"cerrar","cerrar","Salir"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRadioVenciProve=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRadioVenciProve;
			
				this.jButtonProcesarInformacionToolBarRadioVenciProve=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRadioVenciProve;
				
		//protected JButton jButtonModificarToolBarRadioVenciProve;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRadioVenciProve=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRadioVenciProve=new JMenuMe("General");
		this.jmenuArchivoRadioVenciProve=new JMenuMe("Archivo");
		this.jmenuAccionesRadioVenciProve=new JMenuMe("Acciones");
		this.jmenuDatosRadioVenciProve=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRadioVenciProve= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRadioVenciProve.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRadioVenciProve,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRadioVenciProve= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRadioVenciProve.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRadioVenciProve,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRadioVenciProve= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRadioVenciProve.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRadioVenciProve,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRadioVenciProve= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRadioVenciProve.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRadioVenciProve,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRadioVenciProve= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRadioVenciProve.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRadioVenciProve,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRadioVenciProve= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRadioVenciProve.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRadioVenciProve,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRadioVenciProve= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRadioVenciProve.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRadioVenciProve,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRadioVenciProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRadioVenciProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRadioVenciProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRadioVenciProve= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRadioVenciProve.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRadioVenciProve,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRadioVenciProve= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRadioVenciProve.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRadioVenciProve,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRadioVenciProve= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRadioVenciProve.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRadioVenciProve,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRadioVenciProve= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRadioVenciProve.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRadioVenciProve,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRadioVenciProve= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRadioVenciProve.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRadioVenciProve,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRadioVenciProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRadioVenciProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRadioVenciProve,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRadioVenciProve= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRadioVenciProve.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRadioVenciProve,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRadioVenciProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRadioVenciProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRadioVenciProve,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRadioVenciProve= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRadioVenciProve.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRadioVenciProve,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRadioVenciProve.add(this.jMenuItemCerrarRadioVenciProve);
			
			this.jmenuAccionesRadioVenciProve.add(this.jMenuItemNuevoRadioVenciProve);
			this.jmenuAccionesRadioVenciProve.add(this.jMenuItemNuevoGuardarCambiosRadioVenciProve);
			this.jmenuAccionesRadioVenciProve.add(this.jMenuItemNuevoRelacionesRadioVenciProve);
			this.jmenuAccionesRadioVenciProve.add(this.jMenuItemGuardarCambiosTablaRadioVenciProve);		
			this.jmenuAccionesRadioVenciProve.add(this.jMenuItemDuplicarRadioVenciProve);		
			this.jmenuAccionesRadioVenciProve.add(this.jMenuItemCopiarRadioVenciProve);		
			this.jmenuAccionesRadioVenciProve.add(this.jMenuItemVerFormRadioVenciProve);		
			
			this.jmenuDatosRadioVenciProve.add(this.jMenuItemRecargarInformacionRadioVenciProve);				
			this.jmenuDatosRadioVenciProve.add(this.jMenuItemAnterioresRadioVenciProve);				
			this.jmenuDatosRadioVenciProve.add(this.jMenuItemSiguientesRadioVenciProve);				
			this.jmenuDatosRadioVenciProve.add(this.jMenuItemAbrirOrderByRadioVenciProve);				
			this.jmenuDatosRadioVenciProve.add(this.jMenuItemMostrarOcultarRadioVenciProve);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRadioVenciProve.add(this.jMenuItemGuardarCambiosRadioVenciProve);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRadioVenciProve.add(this.jmenuArchivoRadioVenciProve);		
			this.jmenuBarRadioVenciProve.add(this.jmenuAccionesRadioVenciProve);		
			this.jmenuBarRadioVenciProve.add(this.jmenuDatosRadioVenciProve);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRadioVenciProve);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRadioVenciProve() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoRadioVenciRadioVenciProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRadioVenciRadioVenciProve.setToolTipText("Buscar Por Tipo Radio Vencimiento ");
		this.jButtonFK_IdTipoRadioVenciRadioVenciProve= new JButtonMe();
		this.jButtonFK_IdTipoRadioVenciRadioVenciProve.setText("Buscar");
		this.jButtonFK_IdTipoRadioVenciRadioVenciProve.setToolTipText("Buscar Por Tipo Radio Vencimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRadioVenciRadioVenciProve,"buscar_button","Buscar Por Tipo Radio Vencimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRadioVenciRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve = new JLabelMe();
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setText("Tipo Radio Vencimiento :");
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setToolTipText("Tipo Radio Vencimiento");
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve= new JComboBoxMe();
		jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRadioVenciProve=new JTabbedPane();


		this.jTabbedPaneBusquedasRadioVenciProve.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRadioVenciProve.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRadioVenciProve.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRadioVenciProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRadioVenciProve,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRadioVenciProve = new RadioVenciProveDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dias Vencidos DATOS");
			this.jInternalFrameDetalleFormRadioVenciProve = new RadioVenciProveDetalleFormJInternalFrame(jDesktopPane,this.radiovenciproveSessionBean.getConGuardarRelaciones(),this.radiovenciproveSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRadioVenciProve = null;//new RadioVenciProveDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRadioVenciProve= new GridBagLayout();
		
		
		this.jTableDatosRadioVenciProve = new JTableMe();      
		
		String sToolTipRadioVenciProve="";
		sToolTipRadioVenciProve=RadioVenciProveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRadioVenciProve+="(Cartera.RadioVenciProve)";
		}
		
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			sToolTipRadioVenciProve+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRadioVenciProve.setToolTipText(sToolTipRadioVenciProve);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRadioVenciProve);
		this.jTableDatosRadioVenciProve.setAutoCreateRowSorter(true);
		this.jTableDatosRadioVenciProve.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRadioVenciProve.setRowSelectionAllowed(true);
		this.jTableDatosRadioVenciProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRadioVenciProve,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRadioVenciProve = new JButtonMe();
		this.jButtonDuplicarRadioVenciProve = new JButtonMe();
		this.jButtonCopiarRadioVenciProve = new JButtonMe();
		this.jButtonVerFormRadioVenciProve = new JButtonMe();
		this.jButtonNuevoRelacionesRadioVenciProve = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRadioVenciProve = new JButtonMe();
		this.jButtonCerrarRadioVenciProve = new JButtonMe();
		
		this.jScrollPanelDatosRadioVenciProve = new JScrollPane();   
        this.jScrollPanelDatosGeneralRadioVenciProve = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dias Vencidos";
		
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Vencidoss" + this.sPath));
		} else {
			this.jScrollPanelDatosRadioVenciProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRadioVenciProve.setToolTipText("Acciones");
        this.jPanelAccionesRadioVenciProve.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRadioVenciProve=new ReporteDinamicoJInternalFrame(RadioVenciProveConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRadioVenciProve();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRadioVenciProve=new ImportacionJInternalFrame(RadioVenciProveConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRadioVenciProve();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRadioVenciProve = new JButtonMe();
		
		this.jButtonAbrirOrderByRadioVenciProve.setText("Orden");
		this.jButtonAbrirOrderByRadioVenciProve.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRadioVenciProve,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRadioVenciProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRadioVenciProve,false,this);
			
			//this.cargarOrderByRadioVenciProve(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRadioVenciProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRadioVenciProve,true,this);
			
			//this.cargarOrderByRadioVenciProve(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRadioVenciProve.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosRadioVenciProve.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosRadioVenciProve.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosRadioVenciProve.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRadioVenciProve.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRadioVenciProve.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRadioVenciProve.setText("Nuevo");
		this.jButtonDuplicarRadioVenciProve.setText("Duplicar");
		this.jButtonCopiarRadioVenciProve.setText("Copiar");
		this.jButtonVerFormRadioVenciProve.setText("Ver");
		this.jButtonNuevoRelacionesRadioVenciProve.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRadioVenciProve.setText("Guardar");
		this.jButtonCerrarRadioVenciProve.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRadioVenciProve,"nuevo_button","Nuevo",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRadioVenciProve,"duplicar_button","Duplicar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRadioVenciProve,"copiar_button","Copiar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRadioVenciProve,"ver_form","Ver",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRadioVenciProve,"nuevorelaciones_button","Nuevo Rel",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRadioVenciProve,"guardarcambiostabla_button","Guardar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRadioVenciProve,"cerrar_button","Salir",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRadioVenciProve.setToolTipText("Nuevo"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRadioVenciProve.setToolTipText("Duplicar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRadioVenciProve.setToolTipText("Copiar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRadioVenciProve.setToolTipText("Ver"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRadioVenciProve.setToolTipText("Nuevo Rel"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRadioVenciProve.setToolTipText("Guardar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRadioVenciProve.setToolTipText("Salir"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRadioVenciProve";
		inputMap = this.jButtonNuevoRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRadioVenciProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRadioVenciProve"));
		
		//DUPLICAR
		sMapKey = "DuplicarRadioVenciProve";
		inputMap = this.jButtonDuplicarRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRadioVenciProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRadioVenciProve"));
		
		//COPIAR
		sMapKey = "CopiarRadioVenciProve";
		inputMap = this.jButtonCopiarRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRadioVenciProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRadioVenciProve"));
		
		//VEr FORM
		sMapKey = "VerFormRadioVenciProve";
		inputMap = this.jButtonVerFormRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRadioVenciProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRadioVenciProve"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRadioVenciProve";
		inputMap = this.jButtonNuevoRelacionesRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRadioVenciProve"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRadioVenciProve";
		inputMap = this.jButtonModificarRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRadioVenciProve"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRadioVenciProve";
		inputMap = this.jButtonCerrarRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRadioVenciProve"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRadioVenciProve";
		inputMap = this.jButtonGuardarCambiosTablaRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRadioVenciProve"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RadioVenciProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RadioVenciProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RadioVenciProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RadioVenciProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RadioVenciProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRadioVenciProve.setName("jPanelParametrosReportesRadioVenciProve"); 
		
		this.jPanelParametrosReportesAccionesRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRadioVenciProve.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRadioVenciProve.setName("jPanelParametrosReportesAccionesRadioVenciProve"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRadioVenciProve = new JButtonMe();
		this.jButtonRecargarInformacionRadioVenciProve.setText("Recargar");
		this.jButtonRecargarInformacionRadioVenciProve.setToolTipText("Recargar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRadioVenciProve,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRadioVenciProve = new JButtonMe();
		this.jButtonProcesarInformacionRadioVenciProve.setText("Procesar");
		this.jButtonProcesarInformacionRadioVenciProve.setToolTipText("Procesar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRadioVenciProve.setVisible(false);
			
		this.jButtonProcesarInformacionRadioVenciProve.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRadioVenciProve.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRadioVenciProve.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRadioVenciProve.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRadioVenciProve.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRadioVenciProve.setText("TIPO");       
		this.jComboBoxTiposReportesRadioVenciProve.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRadioVenciProve.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRadioVenciProve.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRadioVenciProve.setText("Paginacion");
		this.jComboBoxTiposPaginacionRadioVenciProve.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRadioVenciProve.setText("Accion");
		this.jComboBoxTiposRelacionesRadioVenciProve.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRadioVenciProve.setText("Accion");
		this.jComboBoxTiposAccionesRadioVenciProve.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRadioVenciProve.setText("Accion");
		this.jComboBoxTiposSeleccionarRadioVenciProve.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRadioVenciProve=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRadioVenciProve.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRadioVenciProve.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRadioVenciProve.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRadioVenciProve = new JLabelMe();
		
		this.jLabelAccionesRadioVenciProve.setText("Acciones");		
		this.jLabelAccionesRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRadioVenciProve = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRadioVenciProve.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRadioVenciProve.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRadioVenciProve = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRadioVenciProve.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRadioVenciProve.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRadioVenciProve = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRadioVenciProve.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRadioVenciProve.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRadioVenciProve = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRadioVenciProve.setText("Graf.");
		this.jCheckBoxConGraficoReporteRadioVenciProve.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRadioVenciProve = new JButtonMe();
		//this.jButtonAnterioresRadioVenciProve.setText("<<");
        this.jButtonAnterioresRadioVenciProve.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRadioVenciProve,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRadioVenciProve = new JButtonMe();
		//this.jButtonSiguientesRadioVenciProve.setText(">>");
        this.jButtonSiguientesRadioVenciProve.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRadioVenciProve,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRadioVenciProve = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRadioVenciProve.setText("Nue");
        this.jButtonNuevoGuardarCambiosRadioVenciProve.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRadioVenciProve,"nuevoguardarcambios_button","Nue",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRadioVenciProve";
		inputMap = this.jButtonNuevoGuardarCambiosRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRadioVenciProve"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRadioVenciProve";
		inputMap = this.jButtonRecargarInformacionRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRadioVenciProve"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRadioVenciProve";
		inputMap = this.jButtonSiguientesRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRadioVenciProve"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRadioVenciProve";
		inputMap = this.jButtonAnterioresRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRadioVenciProve"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRadioVenciProve();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRadioVenciProve.setMinimumSize(new Dimension(this.getWidth(),RadioVenciProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RadioVenciProveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRadioVenciProve.setMaximumSize(new Dimension(this.getWidth(),RadioVenciProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RadioVenciProveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRadioVenciProve.setPreferredSize(new Dimension(this.getWidth(),RadioVenciProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RadioVenciProveBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRadioVenciProve = new GridBagLayout();

			this.jPanelPaginacionRadioVenciProve.setLayout(gridaBagLayoutPaginacionRadioVenciProve);						
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = 0;
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRadioVenciProve.add(this.jButtonAnterioresRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
					
						
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRadioVenciProve.gridy = 0;
			
			this.jPanelPaginacionRadioVenciProve.add(this.jButtonNuevoGuardarCambiosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
						
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRadioVenciProve.gridy = 0;
			this.jPanelPaginacionRadioVenciProve.add(this.jButtonSiguientesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = 1;
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRadioVenciProve.add(this.jButtonNuevoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
						
			
			
			if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
				this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRadioVenciProve.gridy = 1;
				this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRadioVenciProve.add(this.jButtonGuardarCambiosTablaRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			}
			
			
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = 1;
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRadioVenciProve.add(this.jButtonDuplicarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = 1;
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRadioVenciProve.add(this.jButtonCopiarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = 1;
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRadioVenciProve.add(this.jButtonVerFormRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = 1;
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRadioVenciProve.add(this.jButtonCerrarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
		
		
		this.jButtonRecargarInformacionRadioVenciProve.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRadioVenciProve.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRadioVenciProve.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRadioVenciProve.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRadioVenciProve.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRadioVenciProve.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRadioVenciProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRadioVenciProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRadioVenciProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRadioVenciProve.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRadioVenciProve.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRadioVenciProve.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRadioVenciProve.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRadioVenciProve.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRadioVenciProve.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRadioVenciProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRadioVenciProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRadioVenciProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRadioVenciProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRadioVenciProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRadioVenciProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRadioVenciProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRadioVenciProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRadioVenciProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRadioVenciProve.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRadioVenciProve.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRadioVenciProve.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRadioVenciProve.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRadioVenciProve.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRadioVenciProve.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRadioVenciProve.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRadioVenciProve.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRadioVenciProve.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRadioVenciProve.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRadioVenciProve.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRadioVenciProve.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRadioVenciProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRadioVenciProve = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RadioVenciProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RadioVenciProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RadioVenciProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RadioVenciProve = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRadioVenciProve.setLayout(gridaBagParametrosReportesRadioVenciProve);
			this.jPanelParametrosReportesAccionesRadioVenciProve.setLayout(gridaBagParametrosReportesAccionesRadioVenciProve);
			
			
			this.jPanelParametrosAuxiliar1RadioVenciProve.setLayout(gridaBagParametrosAuxiliar1RadioVenciProve);
			this.jPanelParametrosAuxiliar2RadioVenciProve.setLayout(gridaBagParametrosAuxiliar2RadioVenciProve);
			this.jPanelParametrosAuxiliar3RadioVenciProve.setLayout(gridaBagParametrosAuxiliar3RadioVenciProve);
			this.jPanelParametrosAuxiliar4RadioVenciProve.setLayout(gridaBagParametrosAuxiliar4RadioVenciProve);
			//this.jPanelParametrosAuxiliar5RadioVenciProve.setLayout(gridaBagParametrosAuxiliar2RadioVenciProve);			
			
			
			
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRadioVenciProve.add(this.jButtonRecargarInformacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RadioVenciProve.add(this.jComboBoxTiposPaginacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RadioVenciProve.add(this.jCheckBoxConAltoMaximoTablaRadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RadioVenciProve.add(this.jComboBoxTiposArchivosReportesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciProve.add(this.jPanelParametrosAuxiliar1RadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RadioVenciProve.add(this.jComboBoxTiposReportesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciProve.add(this.jPanelParametrosAuxiliar4RadioVenciProve, this.gridBagConstraintsRadioVenciProve);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciProve.add(this.jComboBoxTiposReportesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRadioVenciProve.add(this.jCheckBoxGenerarReporteRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciProve.add(this.jPanelParametrosAuxiliar2RadioVenciProve, this.gridBagConstraintsRadioVenciProve);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRadioVenciProve.add(this.jLabelAccionesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
				this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRadioVenciProve.add(this.jButtonAbrirOrderByRadioVenciProve, this.gridBagConstraintsRadioVenciProve);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRadioVenciProve.add(this.jComboBoxTiposSeleccionarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
			
			
			/*
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRadioVenciProve.add(this.jCheckBoxSeleccionarTodosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RadioVenciProve.add(this.jCheckBoxSeleccionarTodosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);															
				
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RadioVenciProve.add(this.jCheckBoxSeleccionadosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciProve.add(this.jPanelParametrosAuxiliar3RadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRadioVenciProve.add(this.jComboBoxTiposAccionesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
	
				
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRadioVenciProve.add(this.jTextFieldValorCampoGeneralRadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRadioVenciProve = new GridBagLayout();

			this.jScrollPanelDatosRadioVenciProve.setLayout(gridaBagLayoutDatosRadioVenciProve);
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = 0;
			this.gridBagConstraintsRadioVenciProve.gridx = 0;
			
			this.jScrollPanelDatosRadioVenciProve.add(this.jTableDatosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRadioVenciProve.setViewportView(this.jTableDatosRadioVenciProve);
		this.jTableDatosRadioVenciProve.setFillsViewportHeight(true);
		this.jTableDatosRadioVenciProve.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRadioVenciProve= new GridBagLayout();
		this.jPanelAccionesRadioVenciProve.setLayout(gridaBagLayoutAccionesRadioVenciProve);
		
		
		/*	
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx = 0;
			
		this.jPanelAccionesRadioVenciProve.add(this.jButtonNuevoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoRadioVenciRadioVenciProve= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRadioVenciRadioVenciProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRadioVenciRadioVenciProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRadioVenciRadioVenciProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRadioVenciRadioVenciProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRadioVenciRadioVenciProve.setLayout(gridaBagLayoutFK_IdTipoRadioVenciRadioVenciProve);

		gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRadioVenciProve.gridy = 0;
		gridBagConstraintsRadioVenciProve.gridx = 0;
		jPanelFK_IdTipoRadioVenciRadioVenciProve.add(jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve, gridBagConstraintsRadioVenciProve);

		gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRadioVenciProve.gridy = 0;
		gridBagConstraintsRadioVenciProve.gridx = 1;
		jPanelFK_IdTipoRadioVenciRadioVenciProve.add(jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve, gridBagConstraintsRadioVenciProve);

		gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRadioVenciProve.gridy = 1;
		gridBagConstraintsRadioVenciProve.gridx =1;
		jPanelFK_IdTipoRadioVenciRadioVenciProve.add(jButtonFK_IdTipoRadioVenciRadioVenciProve, gridBagConstraintsRadioVenciProve);

		jTabbedPaneBusquedasRadioVenciProve.addTab("1.-Por Tipo Radio Vencimiento ", jPanelFK_IdTipoRadioVenciRadioVenciProve);
		jTabbedPaneBusquedasRadioVenciProve.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRadioVenciProve = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRadioVenciProve);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();						
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRadioVenciProve.gridx = 0;		
			//this.gridBagConstraintsRadioVenciProve.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRadioVenciProve.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRadioVenciProve.gridx = 0;		
		//this.gridBagConstraintsRadioVenciProve.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRadioVenciProve.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRadioVenciProve);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRadioVenciProve.gridx = 0;		
			this.gridBagConstraintsRadioVenciProve.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRadioVenciProve.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRadioVenciProve, this.gridBagConstraintsRadioVenciProve);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);								
		
		
		/*
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		*/		
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRadioVenciProve.gridx =0;
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRadioVenciProve.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
				
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRadioVenciProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRadioVenciProve = new GridBagLayout();
			this.jPanelBusquedasParametrosRadioVenciProve.setLayout(gridaBagLayoutBusquedasParametrosRadioVenciProve);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRadioVenciProve=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRadioVenciProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRadioVenciProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRadioVenciProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			
			
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
			
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRadioVenciProve;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRadioVenciProve() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRadioVenciProve = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRadioVenciProve.setName("jPanelReporteDinamicoRadioVenciProve"); 
		
		this.jPanelReporteDinamicoRadioVenciProve.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRadioVenciProve.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRadioVenciProve.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRadioVenciProve.setLayout(gridaBagLayoutReporteDinamicoRadioVenciProve);
		
		
		this.jInternalFrameReporteDinamicoRadioVenciProve= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRadioVenciProve = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRadioVenciProve= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRadioVenciProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRadioVenciProve.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRadioVenciProve.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRadioVenciProve.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRadioVenciProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRadioVenciProve.setResizable(true);
	    this.jInternalFrameReporteDinamicoRadioVenciProve.setClosable(true);
	    this.jInternalFrameReporteDinamicoRadioVenciProve.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRadioVenciProve.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRadioVenciProve.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRadioVenciProve.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Vencidoss"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRadioVenciProve = new JLabelMe();

		this.jLabelColumnasSelectReporteRadioVenciProve.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRadioVenciProve.add(this.jLabelColumnasSelectReporteRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRadioVenciProve = new JList<Reporte>();
		this.jListColumnasSelectReporteRadioVenciProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRadioVenciProve.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRadioVenciProve.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRadioVenciProve.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRadioVenciProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRadioVenciProve=new JScrollPane(this.jListColumnasSelectReporteRadioVenciProve);
			
			this.jScrollColumnasSelectReporteRadioVenciProve.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRadioVenciProve.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRadioVenciProve.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRadioVenciProve.add(this.jListColumnasSelectReporteRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		this.jPanelReporteDinamicoRadioVenciProve.add(this.jScrollColumnasSelectReporteRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRadioVenciProve = new JLabelMe();

		this.jLabelRelacionesSelectReporteRadioVenciProve.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRadioVenciProve = new JList<Reporte>();
		this.jListRelacionesSelectReporteRadioVenciProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRadioVenciProve.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRadioVenciProve.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRadioVenciProve.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRadioVenciProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRadioVenciProve=new JScrollPane(this.jListRelacionesSelectReporteRadioVenciProve);
			
			this.jScrollRelacionesSelectReporteRadioVenciProve.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRadioVenciProve.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRadioVenciProve.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRadioVenciProve = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRadioVenciProve = new JComboBoxMe();
		this.jListColumnasValoresGraficoRadioVenciProve = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRadioVenciProve = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRadioVenciProve.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRadioVenciProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRadioVenciProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRadioVenciProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciProve = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciProve.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRadioVenciProve = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRadioVenciProve.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRadioVenciProve.add(this.jLabelGenerarExcelReporteDinamicoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRadioVenciProve = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRadioVenciProve.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRadioVenciProve,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRadioVenciProve.setToolTipText("Generar EXCEL"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRadioVenciProve.add(this.jButtonGenerarExcelReporteDinamicoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRadioVenciProve.add(this.jComboBoxTiposReportesDinamicoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRadioVenciProve = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRadioVenciProve.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRadioVenciProve.add(this.jLabelTiposArchivoReporteDinamicoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRadioVenciProve.add(this.jComboBoxTiposArchivosReportesDinamicoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRadioVenciProve = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRadioVenciProve.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRadioVenciProve,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRadioVenciProve.setToolTipText("Generar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRadioVenciProve.add(this.jButtonGenerarReporteDinamicoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRadioVenciProve = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRadioVenciProve.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRadioVenciProve,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRadioVenciProve.setToolTipText("Cancelar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRadioVenciProve.add(this.jButtonCerrarReporteDinamicoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRadioVenciProve = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRadioVenciProve= new JScrollPane(jPanelReporteDinamicoRadioVenciProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRadioVenciProve.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRadioVenciProve.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRadioVenciProve.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Vencidoss"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciProve.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRadioVenciProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRadioVenciProve.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRadioVenciProve);
		this.jInternalFrameReporteDinamicoRadioVenciProve.getContentPane().add(this.jScrollPanelReporteDinamicoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRadioVenciProve() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRadioVenciProve = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRadioVenciProve.setName("jPanelImportacionRadioVenciProve"); 
		
		this.jPanelImportacionRadioVenciProve.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRadioVenciProve.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRadioVenciProve.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRadioVenciProve.setLayout(gridaBagLayoutImportacionRadioVenciProve);
		
		
		this.jInternalFrameImportacionRadioVenciProve= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRadioVenciProve= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRadioVenciProve = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRadioVenciProve= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRadioVenciProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRadioVenciProve.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRadioVenciProve.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRadioVenciProve.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRadioVenciProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRadioVenciProve.setResizable(true);
	    this.jInternalFrameImportacionRadioVenciProve.setClosable(true);
	    this.jInternalFrameImportacionRadioVenciProve.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRadioVenciProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRadioVenciProve.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRadioVenciProve.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRadioVenciProve.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRadioVenciProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRadioVenciProve.setResizable(true);
	    this.jInternalFrameImportacionRadioVenciProve.setClosable(true);
	    this.jInternalFrameImportacionRadioVenciProve.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRadioVenciProve.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRadioVenciProve.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRadioVenciProve.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Vencidoss"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRadioVenciProve = new JLabelMe();

		this.jLabelArchivoImportacionRadioVenciProve.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYImportacion;		
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRadioVenciProve.add(this.jLabelArchivoImportacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRadioVenciProve = new JFileChooser();		
		this.jFileChooserImportacionRadioVenciProve.setToolTipText("ESCOGER ARCHIVO"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRadioVenciProve = new JButtonMe();
		this.jButtonAbrirImportacionRadioVenciProve.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRadioVenciProve,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRadioVenciProve.setToolTipText("Generar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYImportacion;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRadioVenciProve.add(this.jButtonAbrirImportacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRadioVenciProve = new JLabelMe();

		this.jLabelPathArchivoImportacionRadioVenciProve.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYImportacion;		
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRadioVenciProve.add(this.jLabelPathArchivoImportacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRadioVenciProve=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRadioVenciProve.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRadioVenciProve.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRadioVenciProve.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYImportacion;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRadioVenciProve.add(this.jTextFieldPathArchivoImportacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRadioVenciProve = new JButtonMe();
		this.jButtonGenerarImportacionRadioVenciProve.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRadioVenciProve,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRadioVenciProve.setToolTipText("Generar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYImportacion;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRadioVenciProve.add(this.jButtonGenerarImportacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRadioVenciProve = new JButtonMe();
		this.jButtonCerrarImportacionRadioVenciProve.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRadioVenciProve,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRadioVenciProve.setToolTipText("Cancelar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = iPosYImportacion;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRadioVenciProve.add(this.jButtonCerrarImportacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRadioVenciProve = new GridBagLayout();
		
		this.jScrollPanelImportacionRadioVenciProve= new JScrollPane(jPanelImportacionRadioVenciProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy =iPosYImportacion;
		this.gridBagConstraintsRadioVenciProve.gridx =iPosXImportacion;
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRadioVenciProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRadioVenciProve.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRadioVenciProve);
		this.jInternalFrameImportacionRadioVenciProve.getContentPane().add(this.jScrollPanelImportacionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRadioVenciProve(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRadioVenciProve = new JButtonMe();
			this.jButtonAbrirOrderByRadioVenciProve.setText("Orden");
			this.jButtonAbrirOrderByRadioVenciProve.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRadioVenciProve,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRadioVenciProve";
			inputMap = this.jButtonAbrirOrderByRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRadioVenciProve"));
		
		
			GridBagLayout gridaBagLayoutOrderByRadioVenciProve = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRadioVenciProve.setName("jPanelOrderByRadioVenciProve"); 
			
			this.jPanelOrderByRadioVenciProve.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRadioVenciProve.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRadioVenciProve.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRadioVenciProve.setLayout(gridaBagLayoutOrderByRadioVenciProve);
			
			
			this.jTableDatosRadioVenciProveOrderBy = new JTableMe();        
			this.jTableDatosRadioVenciProveOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRadioVenciProveOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRadioVenciProveOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRadioVenciProveOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRadioVenciProveOrderBy.setViewportView(this.jTableDatosRadioVenciProveOrderBy);
			this.jTableDatosRadioVenciProveOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRadioVenciProveOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRadioVenciProve= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRadioVenciProve= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRadioVenciProve = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRadioVenciProve= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRadioVenciProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRadioVenciProve.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRadioVenciProve.setTitle("Orden");
			this.jInternalFrameOrderByRadioVenciProve.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRadioVenciProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRadioVenciProve.setResizable(true);
			this.jInternalFrameOrderByRadioVenciProve.setClosable(true);
			this.jInternalFrameOrderByRadioVenciProve.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRadioVenciProve.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRadioVenciProve.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRadioVenciProve.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Vencidoss"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRadioVenciProve.gridx =iPosXOrderBy;
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRadioVenciProve.ipady =150;
				
			this.jPanelOrderByRadioVenciProve.add(jScrollPanelDatosRadioVenciProveOrderBy, this.gridBagConstraintsRadioVenciProve);//this.jTableDatosRadioVenciProveTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRadioVenciProve = new JButtonMe();
			this.jButtonCerrarOrderByRadioVenciProve.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRadioVenciProve,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRadioVenciProve.setToolTipText("Cancelar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRadioVenciProve.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRadioVenciProve.add(this.jButtonCerrarOrderByRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRadioVenciProve = new GridBagLayout();
			
			this.jScrollPanelOrderByRadioVenciProve= new JScrollPane(jPanelOrderByRadioVenciProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy =iPosYOrderBy;
			this.gridBagConstraintsRadioVenciProve.gridx =iPosXOrderBy;
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRadioVenciProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRadioVenciProve.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRadioVenciProve);
			
			this.jInternalFrameOrderByRadioVenciProve.getContentPane().add(this.jScrollPanelOrderByRadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
		
		} else {
			this.jButtonAbrirOrderByRadioVenciProve = new JButtonMe();
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
			&& this.radiovenciproveSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRadioVenciProve.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRadioVenciProve.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRadioVenciProve.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRadioVenciProve.getRowHeight();//RadioVenciProveConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RadioVenciProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRadioVenciProve.isSelected()) {
					iHeightTable=RadioVenciProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RadioVenciProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RadioVenciProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RadioVenciProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRadioVenciProve.isSelected()) {
					iHeightTable=RadioVenciProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RadioVenciProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RadioVenciProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRadioVenciProve.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRadioVenciProve.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRadioVenciProve.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRadioVenciProve.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRadioVenciProve.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRadioVenciProve.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRadioVenciProve!=null && this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy()!=null) {
			//if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRadioVenciProve.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRadioVenciProve.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRadioVenciProve.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRadioVenciProve.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRadioVenciProve.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRadioVenciProve.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=radiovenciproveLogic.getRadioVenciProves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=radiovenciproves.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RadioVenciProve> TraerRadioVenciProveBeans(List<RadioVenciProve> radiovenciproves,ArrayList<Classe> classes)throws Exception {
		try {
			for(RadioVenciProve radiovenciprove:radiovenciproves) {
					
				if(!(RadioVenciProveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RadioVenciProveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					radiovenciprove.setsDetalleGeneralEntityReporte(RadioVenciProveConstantesFunciones.getRadioVenciProveDescripcion(radiovenciprove));
										
						
					
						
					
				} else  {
							
					//radiovenciprove.setsDetalleGeneralEntityReporte(radiovenciprove.getsDetalleGeneralEntityReporte());
										
				}
				
				//radiovenciprovebeans.add(radiovenciprovebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return radiovenciproves;
    }
	//PARA REPORTES FIN
}
