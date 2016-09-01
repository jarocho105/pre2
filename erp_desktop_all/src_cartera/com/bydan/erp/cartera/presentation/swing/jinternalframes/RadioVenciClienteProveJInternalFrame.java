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
import com.bydan.erp.cartera.util.RadioVenciClienteProveConstantesFunciones;

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
public class RadioVenciClienteProveJInternalFrame extends RadioVenciClienteProveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRadioVenciClienteProve;
	
	protected JMenuBar jmenuBarRadioVenciClienteProve;
	
	protected JMenu jmenuRadioVenciClienteProve;
	protected JMenu jmenuDatosRadioVenciClienteProve;
	protected JMenu jmenuArchivoRadioVenciClienteProve;
	protected JMenu jmenuAccionesRadioVenciClienteProve;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRadioVenciClienteProve;	
	protected GridBagConstraints gridBagConstraintsRadioVenciClienteProve;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RadioVenciClienteProveDetalleFormJInternalFrame jInternalFrameDetalleFormRadioVenciClienteProve;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRadioVenciClienteProve;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRadioVenciClienteProve;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoRadioVenciBeanSwingJInternalFrame tiporadiovenciBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporadiovenci="";
	
	public RadioVenciClienteProveSessionBean radiovenciclienteproveSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoRadioVenciSessionBean tiporadiovenciSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RadioVenciClienteProve> radiovenciclienteproves;		
	public List<RadioVenciClienteProve> radiovenciclienteprovesEliminados;	
	public List<RadioVenciClienteProve> radiovenciclienteprovesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRadioVenciClienteProve;		
	protected JButton jButtonAbrirOrderByRadioVenciClienteProve;
	
	
	//protected JPanel jPanelOrderByRadioVenciClienteProve;
	//public JScrollPane jScrollPanelOrderByRadioVenciClienteProve;	
	//protected JButton jButtonCerrarOrderByRadioVenciClienteProve;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RadioVenciClienteProveLogic radiovenciclienteproveLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRadioVenciClienteProve;
	public JScrollPane jScrollPanelDatosEdicionRadioVenciClienteProve;
	public JScrollPane jScrollPanelDatosGeneralRadioVenciClienteProve;
    
	
	
	//public JScrollPane jScrollPanelDatosRadioVenciClienteProveOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRadioVenciClienteProve;
	//public JScrollPane jScrollPanelImportacionRadioVenciClienteProve;
	
	
	
	protected JPanel jPanelAccionesRadioVenciClienteProve;
	
    protected JPanel jPanelPaginacionRadioVenciClienteProve;
    protected JPanel jPanelParametrosReportesRadioVenciClienteProve;
	protected JPanel jPanelParametrosReportesAccionesRadioVenciClienteProve;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RadioVenciClienteProve;
	protected JPanel jPanelParametrosAuxiliar2RadioVenciClienteProve;
	protected JPanel jPanelParametrosAuxiliar3RadioVenciClienteProve;
	protected JPanel jPanelParametrosAuxiliar4RadioVenciClienteProve;
	//protected JPanel jPanelParametrosAuxiliar5RadioVenciClienteProve;
	
	
	
	//protected JPanel jPanelReporteDinamicoRadioVenciClienteProve;
	//protected JPanel jPanelImportacionRadioVenciClienteProve;
	
	
	public JTable jTableDatosRadioVenciClienteProve;
	
	
	
	//public JTable jTableDatosRadioVenciClienteProveOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRadioVenciClienteProve;
	protected JButton jButtonDuplicarRadioVenciClienteProve;
	protected JButton jButtonCopiarRadioVenciClienteProve;
	protected JButton jButtonVerFormRadioVenciClienteProve;
	protected JButton jButtonNuevoRelacionesRadioVenciClienteProve;
	protected JButton jButtonModificarRadioVenciClienteProve;
	
    protected JButton jButtonGuardarCambiosTablaRadioVenciClienteProve;
	protected JButton jButtonCerrarRadioVenciClienteProve;
	
	
	protected JButton jButtonRecargarInformacionRadioVenciClienteProve;
	protected JButton jButtonProcesarInformacionRadioVenciClienteProve;
	
	
	protected JButton jButtonAnterioresRadioVenciClienteProve;
	protected JButton jButtonSiguientesRadioVenciClienteProve;
	protected JButton jButtonNuevoGuardarCambiosRadioVenciClienteProve;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRadioVenciClienteProve;
	//protected JButton jButtonCerrarReporteDinamicoRadioVenciClienteProve;
	//protected JButton jButtonGenerarExcelReporteDinamicoRadioVenciClienteProve;	
	
	
	
	//protected JButton jButtonAbrirImportacionRadioVenciClienteProve;
	//protected JButton jButtonGenerarImportacionRadioVenciClienteProve;
	//protected JButton jButtonCerrarImportacionRadioVenciClienteProve;
	//protected JFileChooser jFileChooserImportacionRadioVenciClienteProve;
	//protected File fileImportacionRadioVenciClienteProve;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRadioVenciClienteProve;
	protected JButton jButtonDuplicarToolBarRadioVenciClienteProve;
	protected JButton jButtonNuevoRelacionesToolBarRadioVenciClienteProve;
	
	
	public JButton jButtonGuardarCambiosToolBarRadioVenciClienteProve;
	protected JButton jButtonCopiarToolBarRadioVenciClienteProve;
	protected JButton jButtonVerFormToolBarRadioVenciClienteProve;
	public JButton jButtonGuardarCambiosTablaToolBarRadioVenciClienteProve;
	protected JButton jButtonMostrarOcultarTablaToolBarRadioVenciClienteProve;
	protected JButton jButtonCerrarToolBarRadioVenciClienteProve;
	
	protected JButton jButtonRecargarInformacionToolBarRadioVenciClienteProve;
	protected JButton jButtonProcesarInformacionToolBarRadioVenciClienteProve;
	protected JButton jButtonAnterioresToolBarRadioVenciClienteProve;
	protected JButton jButtonSiguientesToolBarRadioVenciClienteProve;
	protected JButton jButtonNuevoGuardarCambiosToolBarRadioVenciClienteProve;
	protected JButton jButtonAbrirOrderByToolBarRadioVenciClienteProve;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRadioVenciClienteProve;
	protected JMenuItem jMenuItemDuplicarRadioVenciClienteProve;
	protected JMenuItem jMenuItemNuevoRelacionesRadioVenciClienteProve;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRadioVenciClienteProve;
	protected JMenuItem jMenuItemCopiarRadioVenciClienteProve;
	protected JMenuItem jMenuItemVerFormRadioVenciClienteProve;
	protected JMenuItem jMenuItemGuardarCambiosTablaRadioVenciClienteProve;
	protected JMenuItem jMenuItemCerrarRadioVenciClienteProve;
	protected JMenuItem jMenuItemDetalleCerrarRadioVenciClienteProve;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRadioVenciClienteProve;
	protected JMenuItem jMenuItemDetalleMostarOcultarRadioVenciClienteProve;
	
	protected JMenuItem jMenuItemRecargarInformacionRadioVenciClienteProve;
	protected JMenuItem jMenuItemProcesarInformacionRadioVenciClienteProve;
	protected JMenuItem jMenuItemAnterioresRadioVenciClienteProve;
	protected JMenuItem jMenuItemSiguientesRadioVenciClienteProve;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRadioVenciClienteProve;
	protected JMenuItem jMenuItemAbrirOrderByRadioVenciClienteProve;
	protected JMenuItem jMenuItemMostrarOcultarRadioVenciClienteProve;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRadioVenciClienteProve;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRadioVenciClienteProve;
	protected JCheckBox jCheckBoxSeleccionadosRadioVenciClienteProve;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRadioVenciClienteProve;
	protected JCheckBox jCheckBoxConGraficoReporteRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRadioVenciClienteProve;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRadioVenciClienteProve;
	protected JTextField jTextFieldValorCampoGeneralRadioVenciClienteProve;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRadioVenciClienteProve;
	//public JList<Reporte> jListColumnasSelectReporteRadioVenciClienteProve;
	//public JScrollPane jScrollColumnasSelectReporteRadioVenciClienteProve;
	
	//public JLabel jLabelRelacionesSelectReporteRadioVenciClienteProve;
	//public JList<Reporte> jListRelacionesSelectReporteRadioVenciClienteProve;
	//public JScrollPane jScrollRelacionesSelectReporteRadioVenciClienteProve;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRadioVenciClienteProve;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRadioVenciClienteProve;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRadioVenciClienteProve;
	//public JLabel jLabelTiposArchivoReporteDinamicoRadioVenciClienteProve;
	
		
	//public JLabel jLabelArchivoImportacionRadioVenciClienteProve;	
	//public JLabel jLabelPathArchivoImportacionRadioVenciClienteProve;
	//protected JTextField jTextFieldPathArchivoImportacionRadioVenciClienteProve;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRadioVenciClienteProve;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRadioVenciClienteProve;
	
	//public JLabel jLabelColumnaCategoriaValorRadioVenciClienteProve;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRadioVenciClienteProve;
	
	//public JLabel jLabelColumnasValoresGraficoRadioVenciClienteProve;
	//public JList<Reporte> jListColumnasValoresGraficoRadioVenciClienteProve;
	//public JScrollPane jScrollColumnasValoresGraficoRadioVenciClienteProve;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRadioVenciClienteProve;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRadioVenciClienteProve;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRadioVenciClienteProve;
	public JPanel jPanelFK_IdTipoRadioVenciRadioVenciClienteProve;
	public JButton jButtonFK_IdTipoRadioVenciRadioVenciClienteProve;
	
	public JPanel jPanelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve;
	public JLabel jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve;
	public JButton jButtonid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve= new JButtonMe();
	public JButton jButtonid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProveUpdate= new JButtonMe();
	public JButton jButtonid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProveBusqueda= new JButtonMe();

	
	
	
	
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
	public RadioVenciClienteProveJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciClienteProveJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciClienteProveJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciClienteProveJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRadioVenciClienteProve)	{
		this.jButtonRecargarInformacionRadioVenciClienteProve = jButtonRecargarInformacionRadioVenciClienteProve;
	}
	
	public JButton getjButtonProcesarInformacionRadioVenciClienteProve() {
		return this.jButtonProcesarInformacionRadioVenciClienteProve;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRadioVenciClienteProve)	{
		this.jButtonProcesarInformacionRadioVenciClienteProve = jButtonProcesarInformacionRadioVenciClienteProve;
	}
	
	
	public JButton getjButtonRecargarInformacionRadioVenciClienteProve() {
		return this.jButtonRecargarInformacionRadioVenciClienteProve;
	}
	
	
	public List<RadioVenciClienteProve> getradiovenciclienteproves() {
		return this.radiovenciclienteproves;
	}

	public void setradiovenciclienteproves(List<RadioVenciClienteProve> radiovenciclienteproves) {
		this.radiovenciclienteproves = radiovenciclienteproves;
	}
	
	public List<RadioVenciClienteProve> getradiovenciclienteprovesAux() {
		return this.radiovenciclienteprovesAux;
	}

	public void setradiovenciclienteprovesAux(List<RadioVenciClienteProve> radiovenciclienteprovesAux) {
		this.radiovenciclienteprovesAux = radiovenciclienteprovesAux;
	}
	
	public List<RadioVenciClienteProve> getradiovenciclienteprovesEliminados() {
		return this.radiovenciclienteprovesEliminados;
	}

	public void setRadioVenciClienteProvesEliminados(List<RadioVenciClienteProve> radiovenciclienteprovesEliminados) {
		this.radiovenciclienteprovesEliminados = radiovenciclienteprovesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRadioVenciClienteProve() {
		return jComboBoxTiposSeleccionarRadioVenciClienteProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRadioVenciClienteProve(
			JComboBox jComboBoxTiposSeleccionarRadioVenciClienteProve) {
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve = jComboBoxTiposSeleccionarRadioVenciClienteProve;
	}
	
	public void setBorderResaltarTiposSeleccionarRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRadioVenciClienteProve() {
		return jTextFieldValorCampoGeneralRadioVenciClienteProve;
	}

	public void setjTextFieldValorCampoGeneralRadioVenciClienteProve(
			JTextField jTextFieldValorCampoGeneralRadioVenciClienteProve) {
		this.jTextFieldValorCampoGeneralRadioVenciClienteProve = jTextFieldValorCampoGeneralRadioVenciClienteProve;
	}

	public void setBorderResaltarValorCampoGeneralRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRadioVenciClienteProve .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRadioVenciClienteProve() {
		return this.jCheckBoxSeleccionarTodosRadioVenciClienteProve;
	}

	public void setjCheckBoxSeleccionarTodosRadioVenciClienteProve(
			JCheckBox jCheckBoxSeleccionarTodosRadioVenciClienteProve) {
		this.jCheckBoxSeleccionarTodosRadioVenciClienteProve = jCheckBoxSeleccionarTodosRadioVenciClienteProve;
	}

	public void setBorderResaltarSeleccionarTodosRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRadioVenciClienteProve() {
		return this.jCheckBoxSeleccionadosRadioVenciClienteProve;
	}

	public void setjCheckBoxSeleccionadosRadioVenciClienteProve(
			JCheckBox jCheckBoxSeleccionadosRadioVenciClienteProve) {
		this.jCheckBoxSeleccionadosRadioVenciClienteProve = jCheckBoxSeleccionadosRadioVenciClienteProve;
	}
	
	public void setBorderResaltarSeleccionadosRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRadioVenciClienteProve() {
		return this.jComboBoxTiposArchivosReportesRadioVenciClienteProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRadioVenciClienteProve(
			JComboBox jComboBoxTiposArchivosReportesRadioVenciClienteProve) {
		this.jComboBoxTiposArchivosReportesRadioVenciClienteProve = jComboBoxTiposArchivosReportesRadioVenciClienteProve;
	}

	public void setBorderResaltarTiposArchivosReportesRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRadioVenciClienteProve() {
		return this.jComboBoxTiposReportesRadioVenciClienteProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRadioVenciClienteProve(
			JComboBox jComboBoxTiposReportesRadioVenciClienteProve) {
		this.jComboBoxTiposReportesRadioVenciClienteProve = jComboBoxTiposReportesRadioVenciClienteProve;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRadioVenciClienteProve() {
	//	return jComboBoxTiposReportesDinamicoRadioVenciClienteProve;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRadioVenciClienteProve(
	//		JComboBox jComboBoxTiposReportesDinamicoRadioVenciClienteProve) {
	//	this.jComboBoxTiposReportesDinamicoRadioVenciClienteProve = jComboBoxTiposReportesDinamicoRadioVenciClienteProve;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve() {
	//	return jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve = jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve;
	//}
	
	public void setBorderResaltarTiposReportesRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRadioVenciClienteProve() {
		return this.jComboBoxTiposGraficosReportesRadioVenciClienteProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRadioVenciClienteProve(
			JComboBox jComboBoxTiposGraficosReportesRadioVenciClienteProve) {
		this.jComboBoxTiposGraficosReportesRadioVenciClienteProve = jComboBoxTiposGraficosReportesRadioVenciClienteProve;
	}
	
	public void setBorderResaltarTiposGraficosReportesRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRadioVenciClienteProve() {
		return this.jComboBoxTiposPaginacionRadioVenciClienteProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRadioVenciClienteProve(
			JComboBox jComboBoxTiposPaginacionRadioVenciClienteProve) {
		this.jComboBoxTiposPaginacionRadioVenciClienteProve = jComboBoxTiposPaginacionRadioVenciClienteProve;
	}
	
	public void setBorderResaltarTiposPaginacionRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRadioVenciClienteProve() {
		return this.jComboBoxTiposRelacionesRadioVenciClienteProve;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRadioVenciClienteProve() {
		return this.jComboBoxTiposAccionesRadioVenciClienteProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRadioVenciClienteProve(
			JComboBox jComboBoxTiposRelacionesRadioVenciClienteProve) {
		this.jComboBoxTiposRelacionesRadioVenciClienteProve = jComboBoxTiposRelacionesRadioVenciClienteProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRadioVenciClienteProve(
			JComboBox jComboBoxTiposAccionesRadioVenciClienteProve) {
		this.jComboBoxTiposAccionesRadioVenciClienteProve = jComboBoxTiposAccionesRadioVenciClienteProve;
	}
	
	public void setBorderResaltarTiposRelacionesRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRadioVenciClienteProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRadioVenciClienteProve .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRadioVenciClienteProve() {
	//	return jCheckBoxConGraficoDinamicoRadioVenciClienteProve;
	//}

	//public void setjCheckBoxConGraficoDinamicoRadioVenciClienteProve(
	//		JCheckBox jCheckBoxConGraficoDinamicoRadioVenciClienteProve) {
	//	this.jCheckBoxConGraficoDinamicoRadioVenciClienteProve = jCheckBoxConGraficoDinamicoRadioVenciClienteProve;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRadioVenciClienteProve() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRadioVenciClienteProve.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRadioVenciClienteProve .setBorder(borderResaltar);		
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
		this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
		
		this.radiovenciclienteproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RadioVenciClienteProveJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RadioVenciClienteProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RadioVenciClienteProveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RadioVenciClienteProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RadioVenciClienteProveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dias Por Vencer MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
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
		
		RadioVenciClienteProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRadioVenciClienteProve= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"nuevo","nuevo","Nuevo"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"duplicar","duplicar","Duplicar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"copiar","copiar","Copiar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"ver_form","ver_form","Ver"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"recargar","recargar","Recargar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,
							"cerrar","cerrar","Salir"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRadioVenciClienteProve=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRadioVenciClienteProve;
			
				this.jButtonProcesarInformacionToolBarRadioVenciClienteProve=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRadioVenciClienteProve;
				
		//protected JButton jButtonModificarToolBarRadioVenciClienteProve;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRadioVenciClienteProve=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRadioVenciClienteProve=new JMenuMe("General");
		this.jmenuArchivoRadioVenciClienteProve=new JMenuMe("Archivo");
		this.jmenuAccionesRadioVenciClienteProve=new JMenuMe("Acciones");
		this.jmenuDatosRadioVenciClienteProve=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRadioVenciClienteProve= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRadioVenciClienteProve.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRadioVenciClienteProve,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRadioVenciClienteProve= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRadioVenciClienteProve.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRadioVenciClienteProve,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRadioVenciClienteProve= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRadioVenciClienteProve.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRadioVenciClienteProve,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRadioVenciClienteProve= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRadioVenciClienteProve.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRadioVenciClienteProve,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRadioVenciClienteProve= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRadioVenciClienteProve.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRadioVenciClienteProve,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRadioVenciClienteProve= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRadioVenciClienteProve.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRadioVenciClienteProve,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRadioVenciClienteProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRadioVenciClienteProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRadioVenciClienteProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRadioVenciClienteProve= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRadioVenciClienteProve.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRadioVenciClienteProve,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRadioVenciClienteProve= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRadioVenciClienteProve.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRadioVenciClienteProve,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRadioVenciClienteProve= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRadioVenciClienteProve.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRadioVenciClienteProve,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRadioVenciClienteProve= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRadioVenciClienteProve.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRadioVenciClienteProve,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRadioVenciClienteProve= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRadioVenciClienteProve.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRadioVenciClienteProve,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRadioVenciClienteProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRadioVenciClienteProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRadioVenciClienteProve,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRadioVenciClienteProve= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRadioVenciClienteProve.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRadioVenciClienteProve,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRadioVenciClienteProve= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRadioVenciClienteProve.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRadioVenciClienteProve,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRadioVenciClienteProve.add(this.jMenuItemCerrarRadioVenciClienteProve);
			
			this.jmenuAccionesRadioVenciClienteProve.add(this.jMenuItemNuevoRadioVenciClienteProve);
			this.jmenuAccionesRadioVenciClienteProve.add(this.jMenuItemNuevoGuardarCambiosRadioVenciClienteProve);
			this.jmenuAccionesRadioVenciClienteProve.add(this.jMenuItemNuevoRelacionesRadioVenciClienteProve);
			this.jmenuAccionesRadioVenciClienteProve.add(this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve);		
			this.jmenuAccionesRadioVenciClienteProve.add(this.jMenuItemDuplicarRadioVenciClienteProve);		
			this.jmenuAccionesRadioVenciClienteProve.add(this.jMenuItemCopiarRadioVenciClienteProve);		
			this.jmenuAccionesRadioVenciClienteProve.add(this.jMenuItemVerFormRadioVenciClienteProve);		
			
			this.jmenuDatosRadioVenciClienteProve.add(this.jMenuItemRecargarInformacionRadioVenciClienteProve);				
			this.jmenuDatosRadioVenciClienteProve.add(this.jMenuItemAnterioresRadioVenciClienteProve);				
			this.jmenuDatosRadioVenciClienteProve.add(this.jMenuItemSiguientesRadioVenciClienteProve);				
			this.jmenuDatosRadioVenciClienteProve.add(this.jMenuItemAbrirOrderByRadioVenciClienteProve);				
			this.jmenuDatosRadioVenciClienteProve.add(this.jMenuItemMostrarOcultarRadioVenciClienteProve);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRadioVenciClienteProve.add(this.jMenuItemGuardarCambiosRadioVenciClienteProve);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRadioVenciClienteProve.add(this.jmenuArchivoRadioVenciClienteProve);		
			this.jmenuBarRadioVenciClienteProve.add(this.jmenuAccionesRadioVenciClienteProve);		
			this.jmenuBarRadioVenciClienteProve.add(this.jmenuDatosRadioVenciClienteProve);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRadioVenciClienteProve);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRadioVenciClienteProve() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoRadioVenciRadioVenciClienteProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRadioVenciRadioVenciClienteProve.setToolTipText("Buscar Por Tipo Radio Vencimiento ");
		this.jButtonFK_IdTipoRadioVenciRadioVenciClienteProve= new JButtonMe();
		this.jButtonFK_IdTipoRadioVenciRadioVenciClienteProve.setText("Buscar");
		this.jButtonFK_IdTipoRadioVenciRadioVenciClienteProve.setToolTipText("Buscar Por Tipo Radio Vencimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRadioVenciRadioVenciClienteProve,"buscar_button","Buscar Por Tipo Radio Vencimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRadioVenciRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve = new JLabelMe();
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setText("Tipo Radio Vencimiento :");
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setToolTipText("Tipo Radio Vencimiento");
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve= new JComboBoxMe();
		jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRadioVenciClienteProve=new JTabbedPane();


		this.jTabbedPaneBusquedasRadioVenciClienteProve.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRadioVenciClienteProve.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRadioVenciClienteProve.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRadioVenciClienteProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRadioVenciClienteProve = new RadioVenciClienteProveDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dias Por Vencer DATOS");
			this.jInternalFrameDetalleFormRadioVenciClienteProve = new RadioVenciClienteProveDetalleFormJInternalFrame(jDesktopPane,this.radiovenciclienteproveSessionBean.getConGuardarRelaciones(),this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRadioVenciClienteProve = null;//new RadioVenciClienteProveDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRadioVenciClienteProve= new GridBagLayout();
		
		
		this.jTableDatosRadioVenciClienteProve = new JTableMe();      
		
		String sToolTipRadioVenciClienteProve="";
		sToolTipRadioVenciClienteProve=RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRadioVenciClienteProve+="(Cartera.RadioVenciClienteProve)";
		}
		
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			sToolTipRadioVenciClienteProve+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRadioVenciClienteProve.setToolTipText(sToolTipRadioVenciClienteProve);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRadioVenciClienteProve);
		this.jTableDatosRadioVenciClienteProve.setAutoCreateRowSorter(true);
		this.jTableDatosRadioVenciClienteProve.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRadioVenciClienteProve.setRowSelectionAllowed(true);
		this.jTableDatosRadioVenciClienteProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRadioVenciClienteProve = new JButtonMe();
		this.jButtonDuplicarRadioVenciClienteProve = new JButtonMe();
		this.jButtonCopiarRadioVenciClienteProve = new JButtonMe();
		this.jButtonVerFormRadioVenciClienteProve = new JButtonMe();
		this.jButtonNuevoRelacionesRadioVenciClienteProve = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve = new JButtonMe();
		this.jButtonCerrarRadioVenciClienteProve = new JButtonMe();
		
		this.jScrollPanelDatosRadioVenciClienteProve = new JScrollPane();   
        this.jScrollPanelDatosGeneralRadioVenciClienteProve = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dias Por Vencer";
		
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Por Vencers" + this.sPath));
		} else {
			this.jScrollPanelDatosRadioVenciClienteProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRadioVenciClienteProve.setToolTipText("Acciones");
        this.jPanelAccionesRadioVenciClienteProve.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRadioVenciClienteProve=new ReporteDinamicoJInternalFrame(RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRadioVenciClienteProve();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRadioVenciClienteProve=new ImportacionJInternalFrame(RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRadioVenciClienteProve();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRadioVenciClienteProve = new JButtonMe();
		
		this.jButtonAbrirOrderByRadioVenciClienteProve.setText("Orden");
		this.jButtonAbrirOrderByRadioVenciClienteProve.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRadioVenciClienteProve,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRadioVenciClienteProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRadioVenciClienteProve,false,this);
			
			//this.cargarOrderByRadioVenciClienteProve(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRadioVenciClienteProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRadioVenciClienteProve,true,this);
			
			//this.cargarOrderByRadioVenciClienteProve(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRadioVenciClienteProve.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosRadioVenciClienteProve.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosRadioVenciClienteProve.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosRadioVenciClienteProve.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRadioVenciClienteProve.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRadioVenciClienteProve.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRadioVenciClienteProve.setText("Nuevo");
		this.jButtonDuplicarRadioVenciClienteProve.setText("Duplicar");
		this.jButtonCopiarRadioVenciClienteProve.setText("Copiar");
		this.jButtonVerFormRadioVenciClienteProve.setText("Ver");
		this.jButtonNuevoRelacionesRadioVenciClienteProve.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.setText("Guardar");
		this.jButtonCerrarRadioVenciClienteProve.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRadioVenciClienteProve,"nuevo_button","Nuevo",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRadioVenciClienteProve,"duplicar_button","Duplicar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRadioVenciClienteProve,"copiar_button","Copiar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRadioVenciClienteProve,"ver_form","Ver",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRadioVenciClienteProve,"nuevorelaciones_button","Nuevo Rel",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRadioVenciClienteProve,"guardarcambiostabla_button","Guardar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRadioVenciClienteProve,"cerrar_button","Salir",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRadioVenciClienteProve.setToolTipText("Nuevo"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRadioVenciClienteProve.setToolTipText("Duplicar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRadioVenciClienteProve.setToolTipText("Copiar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRadioVenciClienteProve.setToolTipText("Ver"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRadioVenciClienteProve.setToolTipText("Nuevo Rel"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.setToolTipText("Guardar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRadioVenciClienteProve.setToolTipText("Salir"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRadioVenciClienteProve";
		inputMap = this.jButtonNuevoRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRadioVenciClienteProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRadioVenciClienteProve"));
		
		//DUPLICAR
		sMapKey = "DuplicarRadioVenciClienteProve";
		inputMap = this.jButtonDuplicarRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRadioVenciClienteProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRadioVenciClienteProve"));
		
		//COPIAR
		sMapKey = "CopiarRadioVenciClienteProve";
		inputMap = this.jButtonCopiarRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRadioVenciClienteProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRadioVenciClienteProve"));
		
		//VEr FORM
		sMapKey = "VerFormRadioVenciClienteProve";
		inputMap = this.jButtonVerFormRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRadioVenciClienteProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRadioVenciClienteProve"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRadioVenciClienteProve";
		inputMap = this.jButtonNuevoRelacionesRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRadioVenciClienteProve"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRadioVenciClienteProve";
		inputMap = this.jButtonModificarRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRadioVenciClienteProve"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRadioVenciClienteProve";
		inputMap = this.jButtonCerrarRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRadioVenciClienteProve"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRadioVenciClienteProve";
		inputMap = this.jButtonGuardarCambiosTablaRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRadioVenciClienteProve"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RadioVenciClienteProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RadioVenciClienteProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RadioVenciClienteProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RadioVenciClienteProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RadioVenciClienteProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRadioVenciClienteProve.setName("jPanelParametrosReportesRadioVenciClienteProve"); 
		
		this.jPanelParametrosReportesAccionesRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRadioVenciClienteProve.setName("jPanelParametrosReportesAccionesRadioVenciClienteProve"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRadioVenciClienteProve = new JButtonMe();
		this.jButtonRecargarInformacionRadioVenciClienteProve.setText("Recargar");
		this.jButtonRecargarInformacionRadioVenciClienteProve.setToolTipText("Recargar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRadioVenciClienteProve,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRadioVenciClienteProve = new JButtonMe();
		this.jButtonProcesarInformacionRadioVenciClienteProve.setText("Procesar");
		this.jButtonProcesarInformacionRadioVenciClienteProve.setToolTipText("Procesar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRadioVenciClienteProve.setVisible(false);
			
		this.jButtonProcesarInformacionRadioVenciClienteProve.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRadioVenciClienteProve.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRadioVenciClienteProve.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.setText("TIPO");       
		this.jComboBoxTiposReportesRadioVenciClienteProve.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRadioVenciClienteProve.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRadioVenciClienteProve.setText("Paginacion");
		this.jComboBoxTiposPaginacionRadioVenciClienteProve.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRadioVenciClienteProve.setText("Accion");
		this.jComboBoxTiposRelacionesRadioVenciClienteProve.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRadioVenciClienteProve.setText("Accion");
		this.jComboBoxTiposAccionesRadioVenciClienteProve.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRadioVenciClienteProve.setText("Accion");
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRadioVenciClienteProve=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRadioVenciClienteProve.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRadioVenciClienteProve.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRadioVenciClienteProve.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRadioVenciClienteProve = new JLabelMe();
		
		this.jLabelAccionesRadioVenciClienteProve.setText("Acciones");		
		this.jLabelAccionesRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRadioVenciClienteProve = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRadioVenciClienteProve = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRadioVenciClienteProve.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRadioVenciClienteProve.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRadioVenciClienteProve = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRadioVenciClienteProve.setText("Graf.");
		this.jCheckBoxConGraficoReporteRadioVenciClienteProve.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRadioVenciClienteProve = new JButtonMe();
		//this.jButtonAnterioresRadioVenciClienteProve.setText("<<");
        this.jButtonAnterioresRadioVenciClienteProve.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRadioVenciClienteProve,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRadioVenciClienteProve = new JButtonMe();
		//this.jButtonSiguientesRadioVenciClienteProve.setText(">>");
        this.jButtonSiguientesRadioVenciClienteProve.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRadioVenciClienteProve,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRadioVenciClienteProve = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRadioVenciClienteProve.setText("Nue");
        this.jButtonNuevoGuardarCambiosRadioVenciClienteProve.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRadioVenciClienteProve,"nuevoguardarcambios_button","Nue",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRadioVenciClienteProve";
		inputMap = this.jButtonNuevoGuardarCambiosRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRadioVenciClienteProve"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRadioVenciClienteProve";
		inputMap = this.jButtonRecargarInformacionRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRadioVenciClienteProve"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRadioVenciClienteProve";
		inputMap = this.jButtonSiguientesRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRadioVenciClienteProve"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRadioVenciClienteProve";
		inputMap = this.jButtonAnterioresRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRadioVenciClienteProve"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRadioVenciClienteProve();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRadioVenciClienteProve.setMinimumSize(new Dimension(this.getWidth(),RadioVenciClienteProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RadioVenciClienteProveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRadioVenciClienteProve.setMaximumSize(new Dimension(this.getWidth(),RadioVenciClienteProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RadioVenciClienteProveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRadioVenciClienteProve.setPreferredSize(new Dimension(this.getWidth(),RadioVenciClienteProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RadioVenciClienteProveBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRadioVenciClienteProve = new GridBagLayout();

			this.jPanelPaginacionRadioVenciClienteProve.setLayout(gridaBagLayoutPaginacionRadioVenciClienteProve);						
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonAnterioresRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
					
						
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
			
			this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonNuevoGuardarCambiosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
						
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
			this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonSiguientesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 1;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonNuevoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
						
			
			
			if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
				this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRadioVenciClienteProve.gridy = 1;
				this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonGuardarCambiosTablaRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			}
			
			
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 1;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonDuplicarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 1;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonCopiarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 1;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonVerFormRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 1;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRadioVenciClienteProve.add(this.jButtonCerrarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
		
		
		this.jButtonRecargarInformacionRadioVenciClienteProve.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRadioVenciClienteProve.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRadioVenciClienteProve.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRadioVenciClienteProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRadioVenciClienteProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRadioVenciClienteProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRadioVenciClienteProve.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRadioVenciClienteProve.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRadioVenciClienteProve.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRadioVenciClienteProve.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRadioVenciClienteProve.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRadioVenciClienteProve.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRadioVenciClienteProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRadioVenciClienteProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRadioVenciClienteProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRadioVenciClienteProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRadioVenciClienteProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRadioVenciClienteProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRadioVenciClienteProve.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRadioVenciClienteProve.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRadioVenciClienteProve.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRadioVenciClienteProve.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRadioVenciClienteProve.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRadioVenciClienteProve.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRadioVenciClienteProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRadioVenciClienteProve = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RadioVenciClienteProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RadioVenciClienteProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RadioVenciClienteProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RadioVenciClienteProve = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRadioVenciClienteProve.setLayout(gridaBagParametrosReportesRadioVenciClienteProve);
			this.jPanelParametrosReportesAccionesRadioVenciClienteProve.setLayout(gridaBagParametrosReportesAccionesRadioVenciClienteProve);
			
			
			this.jPanelParametrosAuxiliar1RadioVenciClienteProve.setLayout(gridaBagParametrosAuxiliar1RadioVenciClienteProve);
			this.jPanelParametrosAuxiliar2RadioVenciClienteProve.setLayout(gridaBagParametrosAuxiliar2RadioVenciClienteProve);
			this.jPanelParametrosAuxiliar3RadioVenciClienteProve.setLayout(gridaBagParametrosAuxiliar3RadioVenciClienteProve);
			this.jPanelParametrosAuxiliar4RadioVenciClienteProve.setLayout(gridaBagParametrosAuxiliar4RadioVenciClienteProve);
			//this.jPanelParametrosAuxiliar5RadioVenciClienteProve.setLayout(gridaBagParametrosAuxiliar2RadioVenciClienteProve);			
			
			
			
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jButtonRecargarInformacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RadioVenciClienteProve.add(this.jComboBoxTiposPaginacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RadioVenciClienteProve.add(this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RadioVenciClienteProve.add(this.jComboBoxTiposArchivosReportesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jPanelParametrosAuxiliar1RadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciClienteProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RadioVenciClienteProve.add(this.jComboBoxTiposReportesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jPanelParametrosAuxiliar4RadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jComboBoxTiposReportesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jCheckBoxGenerarReporteRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jPanelParametrosAuxiliar2RadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciClienteProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jLabelAccionesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
				this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jButtonAbrirOrderByRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jComboBoxTiposSeleccionarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
			
			
			/*
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciClienteProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jCheckBoxSeleccionarTodosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciClienteProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RadioVenciClienteProve.add(this.jCheckBoxSeleccionarTodosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);															
				
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRadioVenciClienteProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RadioVenciClienteProve.add(this.jCheckBoxSeleccionadosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jPanelParametrosAuxiliar3RadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jComboBoxTiposAccionesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
	
				
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRadioVenciClienteProve.add(this.jTextFieldValorCampoGeneralRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRadioVenciClienteProve = new GridBagLayout();

			this.jScrollPanelDatosRadioVenciClienteProve.setLayout(gridaBagLayoutDatosRadioVenciClienteProve);
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
			
			this.jScrollPanelDatosRadioVenciClienteProve.add(this.jTableDatosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRadioVenciClienteProve.setViewportView(this.jTableDatosRadioVenciClienteProve);
		this.jTableDatosRadioVenciClienteProve.setFillsViewportHeight(true);
		this.jTableDatosRadioVenciClienteProve.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRadioVenciClienteProve= new GridBagLayout();
		this.jPanelAccionesRadioVenciClienteProve.setLayout(gridaBagLayoutAccionesRadioVenciClienteProve);
		
		
		/*	
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
			
		this.jPanelAccionesRadioVenciClienteProve.add(this.jButtonNuevoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoRadioVenciRadioVenciClienteProve= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRadioVenciRadioVenciClienteProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRadioVenciRadioVenciClienteProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRadioVenciRadioVenciClienteProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRadioVenciRadioVenciClienteProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRadioVenciRadioVenciClienteProve.setLayout(gridaBagLayoutFK_IdTipoRadioVenciRadioVenciClienteProve);

		gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		gridBagConstraintsRadioVenciClienteProve.gridx = 0;
		jPanelFK_IdTipoRadioVenciRadioVenciClienteProve.add(jLabelid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve, gridBagConstraintsRadioVenciClienteProve);

		gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		gridBagConstraintsRadioVenciClienteProve.gridx = 1;
		jPanelFK_IdTipoRadioVenciRadioVenciClienteProve.add(jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve, gridBagConstraintsRadioVenciClienteProve);

		gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRadioVenciClienteProve.gridy = 1;
		gridBagConstraintsRadioVenciClienteProve.gridx =1;
		jPanelFK_IdTipoRadioVenciRadioVenciClienteProve.add(jButtonFK_IdTipoRadioVenciRadioVenciClienteProve, gridBagConstraintsRadioVenciClienteProve);

		jTabbedPaneBusquedasRadioVenciClienteProve.addTab("1.-Por Tipo Radio Vencimiento ", jPanelFK_IdTipoRadioVenciRadioVenciClienteProve);
		jTabbedPaneBusquedasRadioVenciClienteProve.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRadioVenciClienteProve = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRadioVenciClienteProve);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();						
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;		
			//this.gridBagConstraintsRadioVenciClienteProve.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRadioVenciClienteProve.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;		
		//this.gridBagConstraintsRadioVenciClienteProve.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRadioVenciClienteProve.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRadioVenciClienteProve);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;		
			this.gridBagConstraintsRadioVenciClienteProve.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRadioVenciClienteProve.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);								
		
		
		/*
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		*/		
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRadioVenciClienteProve.gridx =0;
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRadioVenciClienteProve.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
				
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRadioVenciClienteProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRadioVenciClienteProve = new GridBagLayout();
			this.jPanelBusquedasParametrosRadioVenciClienteProve.setLayout(gridaBagLayoutBusquedasParametrosRadioVenciClienteProve);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRadioVenciClienteProve=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			
			
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
			
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRadioVenciClienteProve;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRadioVenciClienteProve() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRadioVenciClienteProve = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRadioVenciClienteProve.setName("jPanelReporteDinamicoRadioVenciClienteProve"); 
		
		this.jPanelReporteDinamicoRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRadioVenciClienteProve.setLayout(gridaBagLayoutReporteDinamicoRadioVenciClienteProve);
		
		
		this.jInternalFrameReporteDinamicoRadioVenciClienteProve= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRadioVenciClienteProve = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRadioVenciClienteProve= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setResizable(true);
	    this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setClosable(true);
	    this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Por Vencers"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRadioVenciClienteProve = new JLabelMe();

		this.jLabelColumnasSelectReporteRadioVenciClienteProve.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jLabelColumnasSelectReporteRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRadioVenciClienteProve = new JList<Reporte>();
		this.jListColumnasSelectReporteRadioVenciClienteProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRadioVenciClienteProve.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRadioVenciClienteProve.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRadioVenciClienteProve.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRadioVenciClienteProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRadioVenciClienteProve=new JScrollPane(this.jListColumnasSelectReporteRadioVenciClienteProve);
			
			this.jScrollColumnasSelectReporteRadioVenciClienteProve.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRadioVenciClienteProve.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRadioVenciClienteProve.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jListColumnasSelectReporteRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jScrollColumnasSelectReporteRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRadioVenciClienteProve = new JLabelMe();

		this.jLabelRelacionesSelectReporteRadioVenciClienteProve.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRadioVenciClienteProve = new JList<Reporte>();
		this.jListRelacionesSelectReporteRadioVenciClienteProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRadioVenciClienteProve.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRadioVenciClienteProve.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRadioVenciClienteProve.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRadioVenciClienteProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRadioVenciClienteProve=new JScrollPane(this.jListRelacionesSelectReporteRadioVenciClienteProve);
			
			this.jScrollRelacionesSelectReporteRadioVenciClienteProve.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRadioVenciClienteProve.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRadioVenciClienteProve.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRadioVenciClienteProve = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRadioVenciClienteProve = new JComboBoxMe();
		this.jListColumnasValoresGraficoRadioVenciClienteProve = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRadioVenciClienteProve = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRadioVenciClienteProve.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRadioVenciClienteProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRadioVenciClienteProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRadioVenciClienteProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRadioVenciClienteProve = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRadioVenciClienteProve.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jLabelGenerarExcelReporteDinamicoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRadioVenciClienteProve = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRadioVenciClienteProve.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRadioVenciClienteProve,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRadioVenciClienteProve.setToolTipText("Generar EXCEL"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jButtonGenerarExcelReporteDinamicoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jComboBoxTiposReportesDinamicoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRadioVenciClienteProve = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRadioVenciClienteProve.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jLabelTiposArchivoReporteDinamicoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jComboBoxTiposArchivosReportesDinamicoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRadioVenciClienteProve = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRadioVenciClienteProve.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRadioVenciClienteProve,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRadioVenciClienteProve.setToolTipText("Generar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jButtonGenerarReporteDinamicoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRadioVenciClienteProve = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRadioVenciClienteProve.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRadioVenciClienteProve,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRadioVenciClienteProve.setToolTipText("Cancelar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRadioVenciClienteProve.add(this.jButtonCerrarReporteDinamicoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRadioVenciClienteProve = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRadioVenciClienteProve= new JScrollPane(jPanelReporteDinamicoRadioVenciClienteProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Por Vencers"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRadioVenciClienteProve.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRadioVenciClienteProve);
		this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getContentPane().add(this.jScrollPanelReporteDinamicoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRadioVenciClienteProve() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRadioVenciClienteProve = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRadioVenciClienteProve.setName("jPanelImportacionRadioVenciClienteProve"); 
		
		this.jPanelImportacionRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRadioVenciClienteProve.setLayout(gridaBagLayoutImportacionRadioVenciClienteProve);
		
		
		this.jInternalFrameImportacionRadioVenciClienteProve= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRadioVenciClienteProve= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRadioVenciClienteProve = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRadioVenciClienteProve= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRadioVenciClienteProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRadioVenciClienteProve.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRadioVenciClienteProve.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRadioVenciClienteProve.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRadioVenciClienteProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRadioVenciClienteProve.setResizable(true);
	    this.jInternalFrameImportacionRadioVenciClienteProve.setClosable(true);
	    this.jInternalFrameImportacionRadioVenciClienteProve.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRadioVenciClienteProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRadioVenciClienteProve.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRadioVenciClienteProve.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRadioVenciClienteProve.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRadioVenciClienteProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRadioVenciClienteProve.setResizable(true);
	    this.jInternalFrameImportacionRadioVenciClienteProve.setClosable(true);
	    this.jInternalFrameImportacionRadioVenciClienteProve.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Por Vencers"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRadioVenciClienteProve = new JLabelMe();

		this.jLabelArchivoImportacionRadioVenciClienteProve.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYImportacion;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRadioVenciClienteProve.add(this.jLabelArchivoImportacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRadioVenciClienteProve = new JFileChooser();		
		this.jFileChooserImportacionRadioVenciClienteProve.setToolTipText("ESCOGER ARCHIVO"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRadioVenciClienteProve = new JButtonMe();
		this.jButtonAbrirImportacionRadioVenciClienteProve.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRadioVenciClienteProve,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRadioVenciClienteProve.setToolTipText("Generar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYImportacion;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRadioVenciClienteProve.add(this.jButtonAbrirImportacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRadioVenciClienteProve = new JLabelMe();

		this.jLabelPathArchivoImportacionRadioVenciClienteProve.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYImportacion;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRadioVenciClienteProve.add(this.jLabelPathArchivoImportacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRadioVenciClienteProve=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRadioVenciClienteProve.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRadioVenciClienteProve.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRadioVenciClienteProve.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYImportacion;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRadioVenciClienteProve.add(this.jTextFieldPathArchivoImportacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRadioVenciClienteProve = new JButtonMe();
		this.jButtonGenerarImportacionRadioVenciClienteProve.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRadioVenciClienteProve,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRadioVenciClienteProve.setToolTipText("Generar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYImportacion;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRadioVenciClienteProve.add(this.jButtonGenerarImportacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRadioVenciClienteProve = new JButtonMe();
		this.jButtonCerrarImportacionRadioVenciClienteProve.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRadioVenciClienteProve,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRadioVenciClienteProve.setToolTipText("Cancelar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYImportacion;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRadioVenciClienteProve.add(this.jButtonCerrarImportacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRadioVenciClienteProve = new GridBagLayout();
		
		this.jScrollPanelImportacionRadioVenciClienteProve= new JScrollPane(jPanelImportacionRadioVenciClienteProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy =iPosYImportacion;
		this.gridBagConstraintsRadioVenciClienteProve.gridx =iPosXImportacion;
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRadioVenciClienteProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRadioVenciClienteProve.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRadioVenciClienteProve);
		this.jInternalFrameImportacionRadioVenciClienteProve.getContentPane().add(this.jScrollPanelImportacionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRadioVenciClienteProve(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRadioVenciClienteProve = new JButtonMe();
			this.jButtonAbrirOrderByRadioVenciClienteProve.setText("Orden");
			this.jButtonAbrirOrderByRadioVenciClienteProve.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRadioVenciClienteProve,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRadioVenciClienteProve";
			inputMap = this.jButtonAbrirOrderByRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRadioVenciClienteProve"));
		
		
			GridBagLayout gridaBagLayoutOrderByRadioVenciClienteProve = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRadioVenciClienteProve.setName("jPanelOrderByRadioVenciClienteProve"); 
			
			this.jPanelOrderByRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRadioVenciClienteProve.setLayout(gridaBagLayoutOrderByRadioVenciClienteProve);
			
			
			this.jTableDatosRadioVenciClienteProveOrderBy = new JTableMe();        
			this.jTableDatosRadioVenciClienteProveOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRadioVenciClienteProveOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRadioVenciClienteProveOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRadioVenciClienteProveOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRadioVenciClienteProveOrderBy.setViewportView(this.jTableDatosRadioVenciClienteProveOrderBy);
			this.jTableDatosRadioVenciClienteProveOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRadioVenciClienteProveOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRadioVenciClienteProve= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRadioVenciClienteProve= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRadioVenciClienteProve = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRadioVenciClienteProve= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRadioVenciClienteProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRadioVenciClienteProve.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRadioVenciClienteProve.setTitle("Orden");
			this.jInternalFrameOrderByRadioVenciClienteProve.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRadioVenciClienteProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRadioVenciClienteProve.setResizable(true);
			this.jInternalFrameOrderByRadioVenciClienteProve.setClosable(true);
			this.jInternalFrameOrderByRadioVenciClienteProve.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Por Vencers"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRadioVenciClienteProve.gridx =iPosXOrderBy;
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRadioVenciClienteProve.ipady =150;
				
			this.jPanelOrderByRadioVenciClienteProve.add(jScrollPanelDatosRadioVenciClienteProveOrderBy, this.gridBagConstraintsRadioVenciClienteProve);//this.jTableDatosRadioVenciClienteProveTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRadioVenciClienteProve = new JButtonMe();
			this.jButtonCerrarOrderByRadioVenciClienteProve.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRadioVenciClienteProve,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRadioVenciClienteProve.setToolTipText("Cancelar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRadioVenciClienteProve.add(this.jButtonCerrarOrderByRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRadioVenciClienteProve = new GridBagLayout();
			
			this.jScrollPanelOrderByRadioVenciClienteProve= new JScrollPane(jPanelOrderByRadioVenciClienteProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy =iPosYOrderBy;
			this.gridBagConstraintsRadioVenciClienteProve.gridx =iPosXOrderBy;
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRadioVenciClienteProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRadioVenciClienteProve.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRadioVenciClienteProve);
			
			this.jInternalFrameOrderByRadioVenciClienteProve.getContentPane().add(this.jScrollPanelOrderByRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
		
		} else {
			this.jButtonAbrirOrderByRadioVenciClienteProve = new JButtonMe();
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
			&& this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRadioVenciClienteProve.getRowHeight();//RadioVenciClienteProveConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RadioVenciClienteProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve.isSelected()) {
					iHeightTable=RadioVenciClienteProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RadioVenciClienteProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RadioVenciClienteProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RadioVenciClienteProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRadioVenciClienteProve.isSelected()) {
					iHeightTable=RadioVenciClienteProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RadioVenciClienteProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RadioVenciClienteProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRadioVenciClienteProve!=null && this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy()!=null) {
			//if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRadioVenciClienteProve.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRadioVenciClienteProve.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRadioVenciClienteProve.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=radiovenciclienteproveLogic.getRadioVenciClienteProves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=radiovenciclienteproves.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RadioVenciClienteProve> TraerRadioVenciClienteProveBeans(List<RadioVenciClienteProve> radiovenciclienteproves,ArrayList<Classe> classes)throws Exception {
		try {
			for(RadioVenciClienteProve radiovenciclienteprove:radiovenciclienteproves) {
					
				if(!(RadioVenciClienteProveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RadioVenciClienteProveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					radiovenciclienteprove.setsDetalleGeneralEntityReporte(RadioVenciClienteProveConstantesFunciones.getRadioVenciClienteProveDescripcion(radiovenciclienteprove));
										
						
					
						
					
				} else  {
							
					//radiovenciclienteprove.setsDetalleGeneralEntityReporte(radiovenciclienteprove.getsDetalleGeneralEntityReporte());
										
				}
				
				//radiovenciclienteprovebeans.add(radiovenciclienteprovebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return radiovenciclienteproves;
    }
	//PARA REPORTES FIN
}
