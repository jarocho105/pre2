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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ParroquiaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class ParroquiaJInternalFrame extends ParroquiaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParroquia;
	
	protected JMenuBar jmenuBarParroquia;
	
	protected JMenu jmenuParroquia;
	protected JMenu jmenuDatosParroquia;
	protected JMenu jmenuArchivoParroquia;
	protected JMenu jmenuAccionesParroquia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParroquia;	
	protected GridBagConstraints gridBagConstraintsParroquia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParroquiaDetalleFormJInternalFrame jInternalFrameDetalleFormParroquia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParroquia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParroquia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_canton="";
	
	public ParroquiaSessionBean parroquiaSessionBean;
		
	
	
	public CantonSessionBean cantonSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Parroquia> parroquias;		
	public List<Parroquia> parroquiasEliminados;	
	public List<Parroquia> parroquiasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParroquia;		
	protected JButton jButtonAbrirOrderByParroquia;
	
	
	//protected JPanel jPanelOrderByParroquia;
	//public JScrollPane jScrollPanelOrderByParroquia;	
	//protected JButton jButtonCerrarOrderByParroquia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParroquiaLogic parroquiaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParroquia;
	public JScrollPane jScrollPanelDatosEdicionParroquia;
	public JScrollPane jScrollPanelDatosGeneralParroquia;
    
	
	
	//public JScrollPane jScrollPanelDatosParroquiaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParroquia;
	//public JScrollPane jScrollPanelImportacionParroquia;
	
	
	
	protected JPanel jPanelAccionesParroquia;
	
    protected JPanel jPanelPaginacionParroquia;
    protected JPanel jPanelParametrosReportesParroquia;
	protected JPanel jPanelParametrosReportesAccionesParroquia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Parroquia;
	protected JPanel jPanelParametrosAuxiliar2Parroquia;
	protected JPanel jPanelParametrosAuxiliar3Parroquia;
	protected JPanel jPanelParametrosAuxiliar4Parroquia;
	//protected JPanel jPanelParametrosAuxiliar5Parroquia;
	
	
	
	//protected JPanel jPanelReporteDinamicoParroquia;
	//protected JPanel jPanelImportacionParroquia;
	
	
	public JTable jTableDatosParroquia;
	
	
	
	//public JTable jTableDatosParroquiaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParroquia;
	protected JButton jButtonDuplicarParroquia;
	protected JButton jButtonCopiarParroquia;
	protected JButton jButtonVerFormParroquia;
	protected JButton jButtonNuevoRelacionesParroquia;
	protected JButton jButtonModificarParroquia;
	
    protected JButton jButtonGuardarCambiosTablaParroquia;
	protected JButton jButtonCerrarParroquia;
	
	
	protected JButton jButtonRecargarInformacionParroquia;
	protected JButton jButtonProcesarInformacionParroquia;
	
	
	protected JButton jButtonAnterioresParroquia;
	protected JButton jButtonSiguientesParroquia;
	protected JButton jButtonNuevoGuardarCambiosParroquia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParroquia;
	//protected JButton jButtonCerrarReporteDinamicoParroquia;
	//protected JButton jButtonGenerarExcelReporteDinamicoParroquia;	
	
	
	
	//protected JButton jButtonAbrirImportacionParroquia;
	//protected JButton jButtonGenerarImportacionParroquia;
	//protected JButton jButtonCerrarImportacionParroquia;
	//protected JFileChooser jFileChooserImportacionParroquia;
	//protected File fileImportacionParroquia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParroquia;
	protected JButton jButtonDuplicarToolBarParroquia;
	protected JButton jButtonNuevoRelacionesToolBarParroquia;
	
	
	public JButton jButtonGuardarCambiosToolBarParroquia;
	protected JButton jButtonCopiarToolBarParroquia;
	protected JButton jButtonVerFormToolBarParroquia;
	public JButton jButtonGuardarCambiosTablaToolBarParroquia;
	protected JButton jButtonMostrarOcultarTablaToolBarParroquia;
	protected JButton jButtonCerrarToolBarParroquia;
	
	protected JButton jButtonRecargarInformacionToolBarParroquia;
	protected JButton jButtonProcesarInformacionToolBarParroquia;
	protected JButton jButtonAnterioresToolBarParroquia;
	protected JButton jButtonSiguientesToolBarParroquia;
	protected JButton jButtonNuevoGuardarCambiosToolBarParroquia;
	protected JButton jButtonAbrirOrderByToolBarParroquia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParroquia;
	protected JMenuItem jMenuItemDuplicarParroquia;
	protected JMenuItem jMenuItemNuevoRelacionesParroquia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParroquia;
	protected JMenuItem jMenuItemCopiarParroquia;
	protected JMenuItem jMenuItemVerFormParroquia;
	protected JMenuItem jMenuItemGuardarCambiosTablaParroquia;
	protected JMenuItem jMenuItemCerrarParroquia;
	protected JMenuItem jMenuItemDetalleCerrarParroquia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParroquia;
	protected JMenuItem jMenuItemDetalleMostarOcultarParroquia;
	
	protected JMenuItem jMenuItemRecargarInformacionParroquia;
	protected JMenuItem jMenuItemProcesarInformacionParroquia;
	protected JMenuItem jMenuItemAnterioresParroquia;
	protected JMenuItem jMenuItemSiguientesParroquia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParroquia;
	protected JMenuItem jMenuItemAbrirOrderByParroquia;
	protected JMenuItem jMenuItemMostrarOcultarParroquia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParroquia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParroquia;
	protected JCheckBox jCheckBoxSeleccionadosParroquia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParroquia;
	protected JCheckBox jCheckBoxConGraficoReporteParroquia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParroquia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParroquia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParroquia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParroquia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParroquia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParroquia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParroquia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParroquia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParroquia;
	protected JTextField jTextFieldValorCampoGeneralParroquia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParroquia;
	//public JList<Reporte> jListColumnasSelectReporteParroquia;
	//public JScrollPane jScrollColumnasSelectReporteParroquia;
	
	//public JLabel jLabelRelacionesSelectReporteParroquia;
	//public JList<Reporte> jListRelacionesSelectReporteParroquia;
	//public JScrollPane jScrollRelacionesSelectReporteParroquia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParroquia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParroquia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParroquia;
	//public JLabel jLabelTiposArchivoReporteDinamicoParroquia;
	
		
	//public JLabel jLabelArchivoImportacionParroquia;	
	//public JLabel jLabelPathArchivoImportacionParroquia;
	//protected JTextField jTextFieldPathArchivoImportacionParroquia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParroquia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParroquia;
	
	//public JLabel jLabelColumnaCategoriaValorParroquia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParroquia;
	
	//public JLabel jLabelColumnasValoresGraficoParroquia;
	//public JList<Reporte> jListColumnasValoresGraficoParroquia;
	//public JScrollPane jScrollColumnasValoresGraficoParroquia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParroquia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParroquia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParroquia;
	public JPanel jPanelFK_IdCantonParroquia;
	public JButton jButtonFK_IdCantonParroquia;
	
	public JPanel jPanelid_cantonFK_IdCantonParroquia;
	public JLabel jLabelid_cantonFK_IdCantonParroquia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cantonFK_IdCantonParroquia;
	public JButton jButtonid_cantonFK_IdCantonParroquia= new JButtonMe();
	public JButton jButtonid_cantonFK_IdCantonParroquiaUpdate= new JButtonMe();
	public JButton jButtonid_cantonFK_IdCantonParroquiaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParroquiaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParroquiaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParroquiaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParroquiaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParroquia)	{
		this.jButtonRecargarInformacionParroquia = jButtonRecargarInformacionParroquia;
	}
	
	public JButton getjButtonProcesarInformacionParroquia() {
		return this.jButtonProcesarInformacionParroquia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParroquia)	{
		this.jButtonProcesarInformacionParroquia = jButtonProcesarInformacionParroquia;
	}
	
	
	public JButton getjButtonRecargarInformacionParroquia() {
		return this.jButtonRecargarInformacionParroquia;
	}
	
	
	public List<Parroquia> getparroquias() {
		return this.parroquias;
	}

	public void setparroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}
	
	public List<Parroquia> getparroquiasAux() {
		return this.parroquiasAux;
	}

	public void setparroquiasAux(List<Parroquia> parroquiasAux) {
		this.parroquiasAux = parroquiasAux;
	}
	
	public List<Parroquia> getparroquiasEliminados() {
		return this.parroquiasEliminados;
	}

	public void setParroquiasEliminados(List<Parroquia> parroquiasEliminados) {
		this.parroquiasEliminados = parroquiasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParroquia() {
		return jComboBoxTiposSeleccionarParroquia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParroquia(
			JComboBox jComboBoxTiposSeleccionarParroquia) {
		this.jComboBoxTiposSeleccionarParroquia = jComboBoxTiposSeleccionarParroquia;
	}
	
	public void setBorderResaltarTiposSeleccionarParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParroquia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParroquia() {
		return jTextFieldValorCampoGeneralParroquia;
	}

	public void setjTextFieldValorCampoGeneralParroquia(
			JTextField jTextFieldValorCampoGeneralParroquia) {
		this.jTextFieldValorCampoGeneralParroquia = jTextFieldValorCampoGeneralParroquia;
	}

	public void setBorderResaltarValorCampoGeneralParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParroquia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParroquia() {
		return this.jCheckBoxSeleccionarTodosParroquia;
	}

	public void setjCheckBoxSeleccionarTodosParroquia(
			JCheckBox jCheckBoxSeleccionarTodosParroquia) {
		this.jCheckBoxSeleccionarTodosParroquia = jCheckBoxSeleccionarTodosParroquia;
	}

	public void setBorderResaltarSeleccionarTodosParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParroquia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParroquia() {
		return this.jCheckBoxSeleccionadosParroquia;
	}

	public void setjCheckBoxSeleccionadosParroquia(
			JCheckBox jCheckBoxSeleccionadosParroquia) {
		this.jCheckBoxSeleccionadosParroquia = jCheckBoxSeleccionadosParroquia;
	}
	
	public void setBorderResaltarSeleccionadosParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParroquia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParroquia() {
		return this.jComboBoxTiposArchivosReportesParroquia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParroquia(
			JComboBox jComboBoxTiposArchivosReportesParroquia) {
		this.jComboBoxTiposArchivosReportesParroquia = jComboBoxTiposArchivosReportesParroquia;
	}

	public void setBorderResaltarTiposArchivosReportesParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParroquia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParroquia() {
		return this.jComboBoxTiposReportesParroquia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParroquia(
			JComboBox jComboBoxTiposReportesParroquia) {
		this.jComboBoxTiposReportesParroquia = jComboBoxTiposReportesParroquia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParroquia() {
	//	return jComboBoxTiposReportesDinamicoParroquia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParroquia(
	//		JComboBox jComboBoxTiposReportesDinamicoParroquia) {
	//	this.jComboBoxTiposReportesDinamicoParroquia = jComboBoxTiposReportesDinamicoParroquia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParroquia() {
	//	return jComboBoxTiposArchivosReportesDinamicoParroquia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParroquia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParroquia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParroquia = jComboBoxTiposArchivosReportesDinamicoParroquia;
	//}
	
	public void setBorderResaltarTiposReportesParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParroquia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParroquia() {
		return this.jComboBoxTiposGraficosReportesParroquia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParroquia(
			JComboBox jComboBoxTiposGraficosReportesParroquia) {
		this.jComboBoxTiposGraficosReportesParroquia = jComboBoxTiposGraficosReportesParroquia;
	}
	
	public void setBorderResaltarTiposGraficosReportesParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParroquia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParroquia() {
		return this.jComboBoxTiposPaginacionParroquia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParroquia(
			JComboBox jComboBoxTiposPaginacionParroquia) {
		this.jComboBoxTiposPaginacionParroquia = jComboBoxTiposPaginacionParroquia;
	}
	
	public void setBorderResaltarTiposPaginacionParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParroquia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParroquia() {
		return this.jComboBoxTiposRelacionesParroquia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParroquia() {
		return this.jComboBoxTiposAccionesParroquia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParroquia(
			JComboBox jComboBoxTiposRelacionesParroquia) {
		this.jComboBoxTiposRelacionesParroquia = jComboBoxTiposRelacionesParroquia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParroquia(
			JComboBox jComboBoxTiposAccionesParroquia) {
		this.jComboBoxTiposAccionesParroquia = jComboBoxTiposAccionesParroquia;
	}
	
	public void setBorderResaltarTiposRelacionesParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParroquia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParroquia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParroquia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParroquia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParroquia() {
	//	return jCheckBoxConGraficoDinamicoParroquia;
	//}

	//public void setjCheckBoxConGraficoDinamicoParroquia(
	//		JCheckBox jCheckBoxConGraficoDinamicoParroquia) {
	//	this.jCheckBoxConGraficoDinamicoParroquia = jCheckBoxConGraficoDinamicoParroquia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParroquia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParroquia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParroquia .setBorder(borderResaltar);		
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
		this.parroquiaSessionBean=new ParroquiaSessionBean();
		
		this.parroquiaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parroquiaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parroquiaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParroquiaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParroquiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParroquiaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParroquiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParroquiaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parroquia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
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
		
		ParroquiaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParroquia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParroquia,this.jTtoolBarParroquia,
							"nuevo","nuevo","Nuevo"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParroquia,this.jTtoolBarParroquia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParroquia,this.jTtoolBarParroquia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParroquia,this.jTtoolBarParroquia,
							"duplicar","duplicar","Duplicar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParroquia,this.jTtoolBarParroquia,
							"copiar","copiar","Copiar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParroquia,this.jTtoolBarParroquia,
							"ver_form","ver_form","Ver"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParroquia,this.jTtoolBarParroquia,
							"recargar","recargar","Recargar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParroquia,this.jTtoolBarParroquia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParroquia,this.jTtoolBarParroquia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParroquia,this.jTtoolBarParroquia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParroquia,this.jTtoolBarParroquia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParroquia,this.jTtoolBarParroquia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParroquia,this.jTtoolBarParroquia,
							"cerrar","cerrar","Salir"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParroquia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParroquia;
			
				this.jButtonProcesarInformacionToolBarParroquia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParroquia;
				
		//protected JButton jButtonModificarToolBarParroquia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParroquia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParroquia=new JMenuMe("General");
		this.jmenuArchivoParroquia=new JMenuMe("Archivo");
		this.jmenuAccionesParroquia=new JMenuMe("Acciones");
		this.jmenuDatosParroquia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParroquia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParroquia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParroquia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParroquia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParroquia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParroquia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParroquia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParroquia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParroquia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParroquia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParroquia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParroquia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParroquia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParroquia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParroquia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParroquia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParroquia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParroquia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParroquia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParroquia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParroquia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParroquia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParroquia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParroquia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParroquia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParroquia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParroquia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParroquia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParroquia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParroquia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParroquia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParroquia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParroquia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParroquia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParroquia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParroquia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParroquia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParroquia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParroquia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParroquia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParroquia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParroquia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParroquia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParroquia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParroquia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParroquia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParroquia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParroquia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParroquia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParroquia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParroquia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParroquia.add(this.jMenuItemCerrarParroquia);
			
			this.jmenuAccionesParroquia.add(this.jMenuItemNuevoParroquia);
			this.jmenuAccionesParroquia.add(this.jMenuItemNuevoGuardarCambiosParroquia);
			this.jmenuAccionesParroquia.add(this.jMenuItemNuevoRelacionesParroquia);
			this.jmenuAccionesParroquia.add(this.jMenuItemGuardarCambiosTablaParroquia);		
			this.jmenuAccionesParroquia.add(this.jMenuItemDuplicarParroquia);		
			this.jmenuAccionesParroquia.add(this.jMenuItemCopiarParroquia);		
			this.jmenuAccionesParroquia.add(this.jMenuItemVerFormParroquia);		
			
			this.jmenuDatosParroquia.add(this.jMenuItemRecargarInformacionParroquia);				
			this.jmenuDatosParroquia.add(this.jMenuItemAnterioresParroquia);				
			this.jmenuDatosParroquia.add(this.jMenuItemSiguientesParroquia);				
			this.jmenuDatosParroquia.add(this.jMenuItemAbrirOrderByParroquia);				
			this.jmenuDatosParroquia.add(this.jMenuItemMostrarOcultarParroquia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParroquia.add(this.jMenuItemGuardarCambiosParroquia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParroquia.add(this.jmenuArchivoParroquia);		
			this.jmenuBarParroquia.add(this.jmenuAccionesParroquia);		
			this.jmenuBarParroquia.add(this.jmenuDatosParroquia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParroquia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParroquia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCantonParroquia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCantonParroquia.setToolTipText("Buscar Por Canton ");
		this.jButtonFK_IdCantonParroquia= new JButtonMe();
		this.jButtonFK_IdCantonParroquia.setText("Buscar");
		this.jButtonFK_IdCantonParroquia.setToolTipText("Buscar Por Canton ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCantonParroquia,"buscar_button","Buscar Por Canton ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCantonParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cantonFK_IdCantonParroquia = new JLabelMe();
		jLabelid_cantonFK_IdCantonParroquia.setText("Canton :");
		jLabelid_cantonFK_IdCantonParroquia.setToolTipText("Canton");
		jLabelid_cantonFK_IdCantonParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cantonFK_IdCantonParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cantonFK_IdCantonParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cantonFK_IdCantonParroquia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cantonFK_IdCantonParroquia= new JComboBoxMe();
		jComboBoxid_cantonFK_IdCantonParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonFK_IdCantonParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonFK_IdCantonParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cantonFK_IdCantonParroquia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParroquia=new JTabbedPane();


		this.jTabbedPaneBusquedasParroquia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParroquia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParroquia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParroquia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParroquia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParroquia = new ParroquiaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parroquia DATOS");
			this.jInternalFrameDetalleFormParroquia = new ParroquiaDetalleFormJInternalFrame(jDesktopPane,this.parroquiaSessionBean.getConGuardarRelaciones(),this.parroquiaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParroquia = null;//new ParroquiaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParroquia= new GridBagLayout();
		
		
		this.jTableDatosParroquia = new JTableMe();      
		
		String sToolTipParroquia="";
		sToolTipParroquia=ParroquiaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParroquia+="(Seguridad.Parroquia)";
		}
		
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParroquia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParroquia.setToolTipText(sToolTipParroquia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParroquia);
		this.jTableDatosParroquia.setAutoCreateRowSorter(true);
		this.jTableDatosParroquia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParroquia.setRowSelectionAllowed(true);
		this.jTableDatosParroquia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParroquia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParroquia = new JButtonMe();
		this.jButtonDuplicarParroquia = new JButtonMe();
		this.jButtonCopiarParroquia = new JButtonMe();
		this.jButtonVerFormParroquia = new JButtonMe();
		this.jButtonNuevoRelacionesParroquia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParroquia = new JButtonMe();
		this.jButtonCerrarParroquia = new JButtonMe();
		
		this.jScrollPanelDatosParroquia = new JScrollPane();   
        this.jScrollPanelDatosGeneralParroquia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parroquia";
		
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parroquias" + this.sPath));
		} else {
			this.jScrollPanelDatosParroquia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParroquia.setToolTipText("Acciones");
        this.jPanelAccionesParroquia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParroquia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParroquia=new ReporteDinamicoJInternalFrame(ParroquiaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParroquia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParroquia=new ImportacionJInternalFrame(ParroquiaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParroquia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParroquia = new JButtonMe();
		
		this.jButtonAbrirOrderByParroquia.setText("Orden");
		this.jButtonAbrirOrderByParroquia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParroquia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParroquia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParroquia,false,this);
			
			//this.cargarOrderByParroquia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParroquia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParroquia,true,this);
			
			//this.cargarOrderByParroquia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParroquia.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosParroquia.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosParroquia.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosParroquia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParroquia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParroquia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParroquia.setText("Nuevo");
		this.jButtonDuplicarParroquia.setText("Duplicar");
		this.jButtonCopiarParroquia.setText("Copiar");
		this.jButtonVerFormParroquia.setText("Ver");
		this.jButtonNuevoRelacionesParroquia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParroquia.setText("Guardar");
		this.jButtonCerrarParroquia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParroquia,"nuevo_button","Nuevo",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParroquia,"duplicar_button","Duplicar",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParroquia,"copiar_button","Copiar",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParroquia,"ver_form","Ver",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParroquia,"nuevorelaciones_button","Nuevo Rel",this.parroquiaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParroquia,"guardarcambiostabla_button","Guardar",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParroquia,"cerrar_button","Salir",this.parroquiaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParroquia.setToolTipText("Nuevo"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParroquia.setToolTipText("Duplicar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParroquia.setToolTipText("Copiar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParroquia.setToolTipText("Ver"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParroquia.setToolTipText("Nuevo Rel"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParroquia.setToolTipText("Guardar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParroquia.setToolTipText("Salir"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParroquia";
		inputMap = this.jButtonNuevoParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParroquia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParroquia"));
		
		//DUPLICAR
		sMapKey = "DuplicarParroquia";
		inputMap = this.jButtonDuplicarParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParroquia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParroquia"));
		
		//COPIAR
		sMapKey = "CopiarParroquia";
		inputMap = this.jButtonCopiarParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParroquia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParroquia"));
		
		//VEr FORM
		sMapKey = "VerFormParroquia";
		inputMap = this.jButtonVerFormParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParroquia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParroquia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParroquia";
		inputMap = this.jButtonNuevoRelacionesParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParroquia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParroquia";
		inputMap = this.jButtonModificarParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParroquia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParroquia";
		inputMap = this.jButtonCerrarParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParroquia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParroquia";
		inputMap = this.jButtonGuardarCambiosTablaParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParroquia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Parroquia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Parroquia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Parroquia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Parroquia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Parroquia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParroquia.setName("jPanelParametrosReportesParroquia"); 
		
		this.jPanelParametrosReportesAccionesParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParroquia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParroquia.setName("jPanelParametrosReportesAccionesParroquia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParroquia = new JButtonMe();
		this.jButtonRecargarInformacionParroquia.setText("Recargar");
		this.jButtonRecargarInformacionParroquia.setToolTipText("Recargar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParroquia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParroquia = new JButtonMe();
		this.jButtonProcesarInformacionParroquia.setText("Procesar");
		this.jButtonProcesarInformacionParroquia.setToolTipText("Procesar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParroquia.setVisible(false);
			
		this.jButtonProcesarInformacionParroquia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParroquia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParroquia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParroquia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParroquia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParroquia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParroquia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParroquia.setText("TIPO");       
		this.jComboBoxTiposReportesParroquia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParroquia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParroquia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParroquia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParroquia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParroquia.setText("Paginacion");
		this.jComboBoxTiposPaginacionParroquia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParroquia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParroquia.setText("Accion");
		this.jComboBoxTiposRelacionesParroquia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParroquia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParroquia.setText("Accion");
		this.jComboBoxTiposAccionesParroquia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParroquia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParroquia.setText("Accion");
		this.jComboBoxTiposSeleccionarParroquia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParroquia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParroquia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParroquia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParroquia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParroquia = new JLabelMe();
		
		this.jLabelAccionesParroquia.setText("Acciones");		
		this.jLabelAccionesParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParroquia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParroquia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParroquia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParroquia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParroquia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParroquia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParroquia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParroquia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParroquia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParroquia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParroquia.setText("Graf.");
		this.jCheckBoxConGraficoReporteParroquia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParroquia = new JButtonMe();
		//this.jButtonAnterioresParroquia.setText("<<");
        this.jButtonAnterioresParroquia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParroquia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParroquia = new JButtonMe();
		//this.jButtonSiguientesParroquia.setText(">>");
        this.jButtonSiguientesParroquia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParroquia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParroquia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParroquia.setText("Nue");
        this.jButtonNuevoGuardarCambiosParroquia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParroquia,"nuevoguardarcambios_button","Nue",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParroquia";
		inputMap = this.jButtonNuevoGuardarCambiosParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParroquia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParroquia";
		inputMap = this.jButtonRecargarInformacionParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParroquia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParroquia";
		inputMap = this.jButtonSiguientesParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParroquia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParroquia";
		inputMap = this.jButtonAnterioresParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParroquia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParroquia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParroquia.setMinimumSize(new Dimension(this.getWidth(),ParroquiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParroquiaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParroquia.setMaximumSize(new Dimension(this.getWidth(),ParroquiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParroquiaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParroquia.setPreferredSize(new Dimension(this.getWidth(),ParroquiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParroquiaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParroquia = new GridBagLayout();

			this.jPanelPaginacionParroquia.setLayout(gridaBagLayoutPaginacionParroquia);						
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = 0;
			this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParroquia.add(this.jButtonAnterioresParroquia, this.gridBagConstraintsParroquia);
					
						
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParroquia.gridy = 0;
			
			this.jPanelPaginacionParroquia.add(this.jButtonNuevoGuardarCambiosParroquia, this.gridBagConstraintsParroquia);
						
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParroquia.gridy = 0;
			this.jPanelPaginacionParroquia.add(this.jButtonSiguientesParroquia, this.gridBagConstraintsParroquia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = 1;
			this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParroquia.add(this.jButtonNuevoParroquia, this.gridBagConstraintsParroquia);
						
			
			
			if(!this.parroquiaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParroquia = new GridBagConstraints();
				this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParroquia.gridy = 1;
				this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParroquia.add(this.jButtonGuardarCambiosTablaParroquia, this.gridBagConstraintsParroquia);
			}
			
			
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = 1;
			this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParroquia.add(this.jButtonDuplicarParroquia, this.gridBagConstraintsParroquia);
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = 1;
			this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParroquia.add(this.jButtonCopiarParroquia, this.gridBagConstraintsParroquia);
		
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = 1;
			this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParroquia.add(this.jButtonVerFormParroquia, this.gridBagConstraintsParroquia);
		
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = 1;
			this.gridBagConstraintsParroquia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParroquia.add(this.jButtonCerrarParroquia, this.gridBagConstraintsParroquia);
		
		
		
		this.jButtonRecargarInformacionParroquia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParroquia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParroquia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParroquia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParroquia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParroquia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParroquia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParroquia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParroquia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParroquia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParroquia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParroquia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParroquia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParroquia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParroquia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParroquia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParroquia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParroquia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParroquia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParroquia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParroquia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParroquia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParroquia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParroquia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParroquia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParroquia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParroquia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParroquia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParroquia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParroquia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParroquia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParroquia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParroquia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParroquia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParroquia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParroquia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParroquia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParroquia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParroquia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParroquia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Parroquia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Parroquia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Parroquia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Parroquia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParroquia.setLayout(gridaBagParametrosReportesParroquia);
			this.jPanelParametrosReportesAccionesParroquia.setLayout(gridaBagParametrosReportesAccionesParroquia);
			
			
			this.jPanelParametrosAuxiliar1Parroquia.setLayout(gridaBagParametrosAuxiliar1Parroquia);
			this.jPanelParametrosAuxiliar2Parroquia.setLayout(gridaBagParametrosAuxiliar2Parroquia);
			this.jPanelParametrosAuxiliar3Parroquia.setLayout(gridaBagParametrosAuxiliar3Parroquia);
			this.jPanelParametrosAuxiliar4Parroquia.setLayout(gridaBagParametrosAuxiliar4Parroquia);
			//this.jPanelParametrosAuxiliar5Parroquia.setLayout(gridaBagParametrosAuxiliar2Parroquia);			
			
			
			
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParroquia.add(this.jButtonRecargarInformacionParroquia, this.gridBagConstraintsParroquia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Parroquia.add(this.jComboBoxTiposPaginacionParroquia, this.gridBagConstraintsParroquia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Parroquia.add(this.jCheckBoxConAltoMaximoTablaParroquia, this.gridBagConstraintsParroquia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Parroquia.add(this.jComboBoxTiposArchivosReportesParroquia, this.gridBagConstraintsParroquia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParroquia.add(this.jPanelParametrosAuxiliar1Parroquia, this.gridBagConstraintsParroquia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParroquia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Parroquia.add(this.jComboBoxTiposReportesParroquia, this.gridBagConstraintsParroquia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParroquia.add(this.jPanelParametrosAuxiliar4Parroquia, this.gridBagConstraintsParroquia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParroquia.add(this.jComboBoxTiposReportesParroquia, this.gridBagConstraintsParroquia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParroquia.add(this.jCheckBoxGenerarReporteParroquia, this.gridBagConstraintsParroquia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParroquia.add(this.jPanelParametrosAuxiliar2Parroquia, this.gridBagConstraintsParroquia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParroquia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParroquia.add(this.jLabelAccionesParroquia, this.gridBagConstraintsParroquia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParroquia = new GridBagConstraints();
				this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParroquia.add(this.jButtonAbrirOrderByParroquia, this.gridBagConstraintsParroquia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParroquia.add(this.jComboBoxTiposSeleccionarParroquia, this.gridBagConstraintsParroquia);			
			
			
			/*
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParroquia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParroquia.add(this.jCheckBoxSeleccionarTodosParroquia, this.gridBagConstraintsParroquia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParroquia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Parroquia.add(this.jCheckBoxSeleccionarTodosParroquia, this.gridBagConstraintsParroquia);															
				
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParroquia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Parroquia.add(this.jCheckBoxSeleccionadosParroquia, this.gridBagConstraintsParroquia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParroquia.add(this.jPanelParametrosAuxiliar3Parroquia, this.gridBagConstraintsParroquia);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParroquia.add(this.jComboBoxTiposRelacionesParroquia, this.gridBagConstraintsParroquia);
				
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParroquia.add(this.jComboBoxTiposAccionesParroquia, this.gridBagConstraintsParroquia);
	
				
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParroquia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParroquia.add(this.jTextFieldValorCampoGeneralParroquia, this.gridBagConstraintsParroquia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParroquia = new GridBagLayout();

			this.jScrollPanelDatosParroquia.setLayout(gridaBagLayoutDatosParroquia);
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = 0;
			this.gridBagConstraintsParroquia.gridx = 0;
			
			this.jScrollPanelDatosParroquia.add(this.jTableDatosParroquia, this.gridBagConstraintsParroquia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParroquia.setViewportView(this.jTableDatosParroquia);
		this.jTableDatosParroquia.setFillsViewportHeight(true);
		this.jTableDatosParroquia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParroquia= new GridBagLayout();
		this.jPanelAccionesParroquia.setLayout(gridaBagLayoutAccionesParroquia);
		
		
		/*	
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = 0;
		this.gridBagConstraintsParroquia.gridx = 0;
			
		this.jPanelAccionesParroquia.add(this.jButtonNuevoParroquia, this.gridBagConstraintsParroquia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCantonParroquia= new GridBagLayout();
		gridaBagLayoutFK_IdCantonParroquia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCantonParroquia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCantonParroquia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCantonParroquia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCantonParroquia.setLayout(gridaBagLayoutFK_IdCantonParroquia);

		gridBagConstraintsParroquia = new GridBagConstraints();
		gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParroquia.gridy = 0;
		gridBagConstraintsParroquia.gridx = 0;
		jPanelFK_IdCantonParroquia.add(jLabelid_cantonFK_IdCantonParroquia, gridBagConstraintsParroquia);

		gridBagConstraintsParroquia = new GridBagConstraints();
		gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParroquia.gridy = 0;
		gridBagConstraintsParroquia.gridx = 1;
		jPanelFK_IdCantonParroquia.add(jComboBoxid_cantonFK_IdCantonParroquia, gridBagConstraintsParroquia);

		gridBagConstraintsParroquia = new GridBagConstraints();
		gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParroquia.gridy = 1;
		gridBagConstraintsParroquia.gridx =1;
		jPanelFK_IdCantonParroquia.add(jButtonFK_IdCantonParroquia, gridBagConstraintsParroquia);

		jTabbedPaneBusquedasParroquia.addTab("1.-Por Canton ", jPanelFK_IdCantonParroquia);
		jTabbedPaneBusquedasParroquia.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParroquia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParroquia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParroquia = new GridBagConstraints();						
			this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParroquia.gridx = 0;		
			//this.gridBagConstraintsParroquia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParroquia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParroquia, this.gridBagConstraintsParroquia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParroquia.gridx = 0;		
		//this.gridBagConstraintsParroquia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParroquia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParroquia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParroquia.gridx = 0;		
			this.gridBagConstraintsParroquia.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParroquia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParroquia, this.gridBagConstraintsParroquia);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParroquia, this.gridBagConstraintsParroquia);								
		
		
		/*
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParroquia, this.gridBagConstraintsParroquia);
		*/		
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParroquia.gridx =0;
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParroquia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParroquia, this.gridBagConstraintsParroquia);
				
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParroquia, this.gridBagConstraintsParroquia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParroquiaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParroquia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParroquia = new GridBagLayout();
			this.jPanelBusquedasParametrosParroquia.setLayout(gridaBagLayoutBusquedasParametrosParroquia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParroquia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParroquia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParroquia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParroquia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParroquia, this.gridBagConstraintsParroquia);
			
			
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParroquia, this.gridBagConstraintsParroquia);
		
			
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParroquia, this.gridBagConstraintsParroquia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParroquia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParroquia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParroquia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParroquia.setName("jPanelReporteDinamicoParroquia"); 
		
		this.jPanelReporteDinamicoParroquia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParroquia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParroquia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParroquia.setLayout(gridaBagLayoutReporteDinamicoParroquia);
		
		
		this.jInternalFrameReporteDinamicoParroquia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParroquia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParroquia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParroquia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParroquia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParroquia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParroquia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParroquia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParroquia.setResizable(true);
	    this.jInternalFrameReporteDinamicoParroquia.setClosable(true);
	    this.jInternalFrameReporteDinamicoParroquia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParroquia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParroquia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParroquia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parroquias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParroquia = new JLabelMe();

		this.jLabelColumnasSelectReporteParroquia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParroquia.add(this.jLabelColumnasSelectReporteParroquia, this.gridBagConstraintsParroquia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParroquia = new JList<Reporte>();
		this.jListColumnasSelectReporteParroquia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParroquia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParroquia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParroquia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParroquia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParroquia=new JScrollPane(this.jListColumnasSelectReporteParroquia);
			
			this.jScrollColumnasSelectReporteParroquia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParroquia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParroquia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParroquia.add(this.jListColumnasSelectReporteParroquia, this.gridBagConstraintsParroquia);
		this.jPanelReporteDinamicoParroquia.add(this.jScrollColumnasSelectReporteParroquia, this.gridBagConstraintsParroquia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParroquia = new JLabelMe();

		this.jLabelRelacionesSelectReporteParroquia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParroquia = new JList<Reporte>();
		this.jListRelacionesSelectReporteParroquia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParroquia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParroquia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParroquia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParroquia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParroquia=new JScrollPane(this.jListRelacionesSelectReporteParroquia);
			
			this.jScrollRelacionesSelectReporteParroquia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParroquia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParroquia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParroquia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParroquia = new JComboBoxMe();
		this.jListColumnasValoresGraficoParroquia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParroquia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParroquia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParroquia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParroquia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParroquia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParroquia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParroquia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParroquia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParroquia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParroquia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParroquia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParroquia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParroquia.add(this.jLabelGenerarExcelReporteDinamicoParroquia, this.gridBagConstraintsParroquia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParroquia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParroquia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParroquia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParroquia.setToolTipText("Generar EXCEL"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParroquia = new GridBagConstraints();
		//this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParroquia.add(this.jButtonGenerarExcelReporteDinamicoParroquia, this.gridBagConstraintsParroquia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParroquia.add(this.jComboBoxTiposReportesDinamicoParroquia, this.gridBagConstraintsParroquia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParroquia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParroquia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParroquia.add(this.jLabelTiposArchivoReporteDinamicoParroquia, this.gridBagConstraintsParroquia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParroquia.add(this.jComboBoxTiposArchivosReportesDinamicoParroquia, this.gridBagConstraintsParroquia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParroquia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParroquia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParroquia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParroquia.setToolTipText("Generar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParroquia.add(this.jButtonGenerarReporteDinamicoParroquia, this.gridBagConstraintsParroquia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParroquia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParroquia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParroquia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParroquia.setToolTipText("Cancelar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParroquia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParroquia.add(this.jButtonCerrarReporteDinamicoParroquia, this.gridBagConstraintsParroquia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParroquia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParroquia= new JScrollPane(jPanelReporteDinamicoParroquia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParroquia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParroquia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParroquia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parroquias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParroquia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParroquia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParroquia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParroquia);
		this.jInternalFrameReporteDinamicoParroquia.getContentPane().add(this.jScrollPanelReporteDinamicoParroquia, this.gridBagConstraintsParroquia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParroquia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParroquia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParroquia.setName("jPanelImportacionParroquia"); 
		
		this.jPanelImportacionParroquia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParroquia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParroquia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParroquia.setLayout(gridaBagLayoutImportacionParroquia);
		
		
		this.jInternalFrameImportacionParroquia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParroquia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParroquia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParroquia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParroquia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParroquia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParroquia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParroquia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParroquia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParroquia.setResizable(true);
	    this.jInternalFrameImportacionParroquia.setClosable(true);
	    this.jInternalFrameImportacionParroquia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParroquia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParroquia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParroquia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParroquia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParroquia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParroquia.setResizable(true);
	    this.jInternalFrameImportacionParroquia.setClosable(true);
	    this.jInternalFrameImportacionParroquia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParroquia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParroquia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParroquia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parroquias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParroquia = new JLabelMe();

		this.jLabelArchivoImportacionParroquia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = iPosYImportacion;		
		this.gridBagConstraintsParroquia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParroquia.add(this.jLabelArchivoImportacionParroquia, this.gridBagConstraintsParroquia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParroquia = new JFileChooser();		
		this.jFileChooserImportacionParroquia.setToolTipText("ESCOGER ARCHIVO"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParroquia = new JButtonMe();
		this.jButtonAbrirImportacionParroquia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParroquia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParroquia.setToolTipText("Generar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = iPosYImportacion;
		this.gridBagConstraintsParroquia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParroquia.add(this.jButtonAbrirImportacionParroquia, this.gridBagConstraintsParroquia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParroquia = new JLabelMe();

		this.jLabelPathArchivoImportacionParroquia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = iPosYImportacion;		
		this.gridBagConstraintsParroquia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParroquia.add(this.jLabelPathArchivoImportacionParroquia, this.gridBagConstraintsParroquia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParroquia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParroquia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParroquia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParroquia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = iPosYImportacion;
		this.gridBagConstraintsParroquia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParroquia.add(this.jTextFieldPathArchivoImportacionParroquia, this.gridBagConstraintsParroquia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParroquia = new JButtonMe();
		this.jButtonGenerarImportacionParroquia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParroquia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParroquia.setToolTipText("Generar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = iPosYImportacion;
		this.gridBagConstraintsParroquia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParroquia.add(this.jButtonGenerarImportacionParroquia, this.gridBagConstraintsParroquia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParroquia = new JButtonMe();
		this.jButtonCerrarImportacionParroquia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParroquia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParroquia.setToolTipText("Cancelar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = iPosYImportacion;
		this.gridBagConstraintsParroquia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParroquia.add(this.jButtonCerrarImportacionParroquia, this.gridBagConstraintsParroquia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParroquia = new GridBagLayout();
		
		this.jScrollPanelImportacionParroquia= new JScrollPane(jPanelImportacionParroquia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy =iPosYImportacion;
		this.gridBagConstraintsParroquia.gridx =iPosXImportacion;
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParroquia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParroquia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParroquia);
		this.jInternalFrameImportacionParroquia.getContentPane().add(this.jScrollPanelImportacionParroquia, this.gridBagConstraintsParroquia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParroquia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParroquia = new JButtonMe();
			this.jButtonAbrirOrderByParroquia.setText("Orden");
			this.jButtonAbrirOrderByParroquia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParroquia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParroquia";
			inputMap = this.jButtonAbrirOrderByParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParroquia"));
		
		
			GridBagLayout gridaBagLayoutOrderByParroquia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParroquia.setName("jPanelOrderByParroquia"); 
			
			this.jPanelOrderByParroquia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParroquia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParroquia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParroquia.setLayout(gridaBagLayoutOrderByParroquia);
			
			
			this.jTableDatosParroquiaOrderBy = new JTableMe();        
			this.jTableDatosParroquiaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParroquiaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParroquiaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParroquiaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParroquiaOrderBy.setViewportView(this.jTableDatosParroquiaOrderBy);
			this.jTableDatosParroquiaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParroquiaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParroquia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParroquia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParroquia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParroquia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParroquia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParroquia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParroquia.setTitle("Orden");
			this.jInternalFrameOrderByParroquia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParroquia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParroquia.setResizable(true);
			this.jInternalFrameOrderByParroquia.setClosable(true);
			this.jInternalFrameOrderByParroquia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParroquia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParroquia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParroquia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parroquias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParroquia.gridx =iPosXOrderBy;
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParroquia.ipady =150;
				
			this.jPanelOrderByParroquia.add(jScrollPanelDatosParroquiaOrderBy, this.gridBagConstraintsParroquia);//this.jTableDatosParroquiaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParroquia = new JButtonMe();
			this.jButtonCerrarOrderByParroquia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParroquia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParroquia.setToolTipText("Cancelar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParroquia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParroquia.add(this.jButtonCerrarOrderByParroquia, this.gridBagConstraintsParroquia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParroquia = new GridBagLayout();
			
			this.jScrollPanelOrderByParroquia= new JScrollPane(jPanelOrderByParroquia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy =iPosYOrderBy;
			this.gridBagConstraintsParroquia.gridx =iPosXOrderBy;
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParroquia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParroquia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParroquia);
			
			this.jInternalFrameOrderByParroquia.getContentPane().add(this.jScrollPanelOrderByParroquia, this.gridBagConstraintsParroquia);			
		
		} else {
			this.jButtonAbrirOrderByParroquia = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parroquiaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParroquia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParroquia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParroquia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParroquia.getRowHeight();//ParroquiaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParroquiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParroquia.isSelected()) {
					iHeightTable=ParroquiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParroquiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParroquiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParroquiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParroquia.isSelected()) {
					iHeightTable=ParroquiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParroquiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParroquiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParroquia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParroquia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParroquia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParroquia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParroquia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParroquia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParroquia!=null && this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy()!=null) {
			//if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParroquia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParroquia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParroquia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParroquia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParroquia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParroquia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParroquia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parroquiaLogic.getParroquias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parroquias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Parroquia> TraerParroquiaBeans(List<Parroquia> parroquias,ArrayList<Classe> classes)throws Exception {
		try {
			for(Parroquia parroquia:parroquias) {
					
				if(!(ParroquiaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParroquiaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parroquia.setsDetalleGeneralEntityReporte(ParroquiaConstantesFunciones.getParroquiaDescripcion(parroquia));
										
					parroquia.setes_activo_descripcion(ParroquiaConstantesFunciones.getes_activoDescripcion(parroquia));	
					
						
					
				} else  {
							
					//parroquia.setsDetalleGeneralEntityReporte(parroquia.getsDetalleGeneralEntityReporte());
										
				}
				
				//parroquiabeans.add(parroquiabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parroquias;
    }
	//PARA REPORTES FIN
}
